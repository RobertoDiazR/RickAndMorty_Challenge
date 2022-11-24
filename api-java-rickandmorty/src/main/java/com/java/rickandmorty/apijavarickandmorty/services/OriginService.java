package com.java.rickandmorty.apijavarickandmorty.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.java.rickandmorty.apijavarickandmorty.models.Origin;

@Service
public class OriginService {
    
    @Autowired
    private RestTemplate template = new RestTemplate();

    public Origin findOriginWithURL(String url){
        return template.getForObject(url, Origin.class);
    }

}
