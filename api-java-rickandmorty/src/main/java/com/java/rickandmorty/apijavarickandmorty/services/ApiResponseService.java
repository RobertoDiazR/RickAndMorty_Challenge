package com.java.rickandmorty.apijavarickandmorty.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.rickandmorty.apijavarickandmorty.exception.ApiResponseException;
import com.java.rickandmorty.apijavarickandmorty.models.Origin;
import com.java.rickandmorty.apijavarickandmorty.models.Root;

@Service
public class ApiResponseService {

    public RootService rootService = new RootService();
    public OriginService originService = new OriginService();

    private static final ObjectMapper mapper = new ObjectMapper();

    public Object buildApiResponse(int id) throws ApiResponseException{
        
        Object characterFromApi = new Object();
        Root rootResponse = new Root();
        Origin originReponse = new Origin();
        String originURL = new String();
        int amountEpisodes = 0;

        try {
            characterFromApi = rootService.findCharacter(id);
            rootResponse = rootService.findRoot(id);

        } catch (Exception e) {
            throw ApiResponseException.buildWithError(e);
        }

        if(rootResponse.getOrigin() != null){
            originURL = rootResponse.getOrigin().getUrl();
            if(originURL != null && !originURL.isEmpty() ){

                try {

                    originReponse = originService.findOriginWithURL(originURL);

                } catch (Exception e) {
                    throw ApiResponseException.buildWithError(e);
                }

                rootResponse.setOrigin(originReponse);

                }

        }

        amountEpisodes = countEpisodes(characterFromApi);
        rootResponse.setEpisode_count(amountEpisodes);

        return rootResponse;

    }

    private int countEpisodes(Object characterFromApi){

        Map<String,Object> characterMap = new HashMap<>();
        List<String> episodeList = new ArrayList<>();
        
        characterMap = mapper.convertValue(characterFromApi, Map.class);

        if(characterMap.get("episode") != null){
            episodeList = (List<String>)characterMap.get("episode");
            return episodeList.size();
        }

        return 0;

    }
}
