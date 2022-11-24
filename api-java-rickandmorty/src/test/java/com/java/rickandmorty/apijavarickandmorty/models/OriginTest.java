package com.java.rickandmorty.apijavarickandmorty.models;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


import static org.junit.Assert.*;


public class OriginTest {

    public Origin originVoid;
    public Origin origin ;
    public List<String> testList = new ArrayList<String>();

    @Test
    public void testGetDimension() {
        origin = new Origin("Name", "https://www.test.com/", "Dimension", testList);
		assertNotNull(origin.getDimension());
    }

    @Test
    public void testGetName() {
        origin = new Origin("Name", "https://www.test.com/", "Dimension", testList);
        assertNotNull(origin.getName());
    }

    @Test
    public void testGetResidents() {
        testList.add("test");
        origin = new Origin("Name", "https://www.test.com/", "Dimension", testList);
        assertNotNull(origin.getResidents());
    }

    @Test
    public void testGetUrl() {
        origin = new Origin("Name", "https://www.test.com/", "Dimension", testList);
        assertNotNull(origin.getUrl());
    }

    @Test
    public void testSetDimension() {
        originVoid = new Origin();
        originVoid.setDimension("dimension");
    }

    @Test
    public void testSetName() {
        originVoid = new Origin();
        originVoid.setName("name");

    }

    @Test
    public void testSetResidents() {
        originVoid = new Origin();
        originVoid.setResidents(new ArrayList<>());
    }

    @Test
    public void testSetUrl() {
        originVoid = new Origin();
        originVoid.setUrl("https://www.test.com/");

    }
}
