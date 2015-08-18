package main.java.com.taran.loader.api.service;

import main.java.com.taran.loader.GoogleHelper;
import main.java.com.taran.loader.api.model.Album;
import main.java.com.taran.loader.api.model.Photo;
import main.java.com.taran.loader.api.model.User;

import java.util.List;

public class AlbumServiceImpl implements AlbumService {

    @Override
    public Album create(User user, String name) {
        GoogleHelper.createAlbum(user.getName(), user.getPassword(), name);
        return new Album(name, user);
    }

    @Override
    public boolean delete(List<Album> albums, Album album) {
        for (Album currentAlbum: albums) {
            if (currentAlbum.equals(album)) {
                return albums.remove(currentAlbum);
            }
        }
        return false;
    }

    @Override
    public void addPhotosToAlbum(Album album, Photo... photos) {
        if (photos.length == 0) {
            System.out.println("Photos are empty");
            return;
        }

        for (Photo photo: photos) {
            album.addPhoto(photo);
        }
    }
}
