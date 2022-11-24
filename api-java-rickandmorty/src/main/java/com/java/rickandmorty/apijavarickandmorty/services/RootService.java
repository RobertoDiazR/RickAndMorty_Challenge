package com.java.rickandmorty.apijavarickandmorty.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.java.rickandmorty.apijavarickandmorty.models.Root;

@Service
public class RootService {
    
    @Autowired
    private RestTemplate template = new RestTemplate();

    public Object findCharacter(int id){
        return template.getForObject("https://rickandmortyapi.com/api/character/"+id,Object.class);
    }

    public Root findRoot(int id){
        return template.getForObject("https://rickandmortyapi.com/api/character/"+id,Root.class);
    }
    
}
