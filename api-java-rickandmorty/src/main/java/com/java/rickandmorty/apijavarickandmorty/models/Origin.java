package com.java.rickandmorty.apijavarickandmorty.models;


import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class Origin {
    
    @Getter @Setter
    public String name;

    @Getter @Setter
    public String url;

    @Getter @Setter
    public String dimension;

    @Getter @Setter
    public List<String> residents;

    public Origin(){

    }
    public Origin (String name, String url, String dimension ,List<String> residents){
        this.name = name;
        this.url = url;
        this.dimension = dimension;
        this.residents = residents;
    }
}
