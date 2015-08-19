package main.java.com.taran.loader.api.service;

import main.java.com.taran.loader.api.model.Album;
import main.java.com.taran.loader.api.model.Photo;
import main.java.com.taran.loader.api.model.User;

import java.util.List;

public interface AlbumService {

    Album create(User user, String name);
    boolean delete(List<Album> albums, Album album);
    void addPhotosToAlbum(Album album, Photo... photos);
}
