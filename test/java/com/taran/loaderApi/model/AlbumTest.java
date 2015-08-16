package com.taran.loaderApi.model;

import main.java.com.taran.loaderApi.model.Album;
import main.java.com.taran.loaderApi.model.Photo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlbumTest {

    private static final String NAME = "name";
    private Album album;

    @Before
    public void setUp() {
        album = new Album(NAME);
        album.addPhoto(new Photo("test1.jpg"));
        album.addPhoto(new Photo("test2.jpg"));
        album.addPhoto(new Photo("test3.jpg"));
    }

    @Test
    public void constructorTest() {
        Album album1 = new Album(NAME);
        assertEquals(NAME, album1.getName());
        assertNotNull(album1.getPhotos());
        assertEquals(0, album1.getSize());
    }

    @Test
    public void deleteTest() {
        int actualCapacity = album.getSize();
        assertTrue(album.deletePhoto("test2.jpg"));
        assertEquals(actualCapacity - 1, album.getSize());
    }

    @Test
    public void deleteNotExistingTest() {
        int actualCapacity = album.getSize();
        assertFalse(album.deletePhoto("test4.jpg"));
        assertEquals(actualCapacity, album.getSize());
    }
}
