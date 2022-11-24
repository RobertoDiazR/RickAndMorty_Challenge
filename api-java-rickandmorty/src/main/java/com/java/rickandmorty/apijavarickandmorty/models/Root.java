package com.java.rickandmorty.apijavarickandmorty.models;

import lombok.Getter;
import lombok.Setter;

public class Root {
    
    @Getter @Setter
    public int id;

    @Getter @Setter
    public String name;

    @Getter @Setter
    public String status;

    @Getter @Setter
    public String species;

    @Getter @Setter
    public String type;
    
    @Getter @Setter
    public int episode_count;

    @Getter @Setter
    public Origin origin;

    public Root(){
    }

    public Root(int id, String name, String status, String species, String type, int episode_count, Origin origin){
        this.id = id;
        this.name = name;
        this.status = status;
        this.species = species;
        this.type = type;
        this.episode_count = episode_count;
        this.origin = origin;
    }

}
