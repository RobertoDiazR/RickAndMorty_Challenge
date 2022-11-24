package com.java.rickandmorty.apijavarickandmorty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.java.rickandmorty.apijavarickandmorty.exception.ApiResponseException;
import com.java.rickandmorty.apijavarickandmorty.services.ApiResponseService;


@RestController
public class ApiResponseController {
    
    @Autowired
    private ApiResponseService apiResponseService;

    @GetMapping("/rickandmorty/searcher/{id}")
    public Object getCharacterRoot(@PathVariable int id) throws ApiResponseException{

        return apiResponseService.buildApiResponse(id);

    }

    
}
