package com.taran.loader.api.service;

import main.java.com.taran.loader.api.model.Album;
import main.java.com.taran.loader.api.model.Photo;
import main.java.com.taran.loader.api.model.User;
import main.java.com.taran.loader.api.service.AlbumService;
import main.java.com.taran.loader.api.service.AlbumServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class AlbumServiceImpTest {

    AlbumService albumService = new AlbumServiceImpl();

    User user = new User("aleksey", "qwerty");
    List<Album> albumsList = new ArrayList<>();
    List<Photo> photoList = new ArrayList<>();
    Album springAlbum;
    Photo photo;

    @Before
    public void setUp() {
        photo = new Photo("photo1");
        springAlbum = albumService.create(user, "spring");
        albumsList.add(springAlbum);
        photoList.add(photo);
    }

    @Test
    public void createTest() {
        int actualSize = albumsList.size();
        assertTrue(albumsList.add(albumService.create(user, "summer")));
        int expectedSize = albumsList.size();
        assertNotNull(albumsList);
        assertEquals(actualSize + 1, expectedSize);
    }

    @Test
    public void deleteTest() {
        int actualSize = albumsList.size();
        albumsList.remove(albumService.delete(albumsList, albumsList.get(albumsList.size() - 1)));
        assertEquals(actualSize - 1, albumsList.size());
    }

    @Test
    public void addPhotosToAlbumTest() {
        int actualSize = springAlbum.getSize();
        assertTrue(springAlbum.addPhoto(photo));
        assertEquals(actualSize + 1, springAlbum.getSize());
    }

    @Test
    public void deletePhotosFromAlbumTest() {
        int actualSize = springAlbum.getSize();
        assertTrue(springAlbum.deletePhoto(photo));
        assertEquals(actualSize - 1, springAlbum.getSize());
    }
}
