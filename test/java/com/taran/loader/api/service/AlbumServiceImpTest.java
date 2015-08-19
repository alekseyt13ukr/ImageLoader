package com.taran.loader.api.service;

import main.java.com.taran.loader.api.model.Album;
import main.java.com.taran.loader.api.model.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class AlbumServiceImpTest {

    private static final String NAME = "name";
    private Album album;
    private User user;

    @Before
    public void setUp() {
         this.album = new Album(NAME, user);
    }

    @Test
    public void create() {
        assertNotNull(album);
    }
}
