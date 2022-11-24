package com.java.rickandmorty.apijavarickandmorty.models;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class RootTest {

    private Root root;
    private Root rootVoid;

    @Test
    public void testGetEpisode_count() {
        root = new Root(0, "name", "status", "species", "type", 0, new Origin());
        assertNotNull(root.getEpisode_count());
    }

    @Test
    public void testGetId() {
        root = new Root(0, "name", "status", "species", "type", 0, new Origin());
        assertNotNull(root.getId());
    }

    @Test
    public void testGetName() {
        root = new Root(0, "name", "status", "species", "type", 0, new Origin());
        assertNotNull(root.getName());
    }

    @Test
    public void testGetOrigin() {
        root = new Root(0, "name", "status", "species", "type", 0, new Origin());
        assertNotNull(root.getOrigin());
    }

    @Test
    public void testGetSpecies() {
        root = new Root(0, "name", "status", "species", "type", 0, new Origin());
        assertNotNull(root.getSpecies());
    }

    @Test
    public void testGetStatus() {
        root = new Root(0, "name", "status", "species", "type", 0, new Origin());
        assertNotNull(root.getStatus());
    }

    @Test
    public void testGetType() {
        root = new Root(0, "name", "status", "species", "type", 0, new Origin());
        assertNotNull(root.getType());
    }

    @Test
    public void testSetEpisode_count() {
        rootVoid = new Root();
        rootVoid.setEpisode_count(0);
    }

    @Test
    public void testSetId() {
        rootVoid = new Root();
        rootVoid.setId(0);
    }

    @Test
    public void testSetName() {
        rootVoid = new Root();
        rootVoid.setName("name");
    }

    @Test
    public void testSetOrigin() {
        rootVoid = new Root();
        rootVoid.setOrigin(new Origin());
    }

    @Test
    public void testSetSpecies() {
        rootVoid = new Root();
        rootVoid.setSpecies("species");
    }

    @Test
    public void testSetStatus() {
        rootVoid = new Root();
        rootVoid.setStatus("status");
    }

    @Test
    public void testSetType() {
        rootVoid = new Root();
        rootVoid.setType("type");
    }
}
