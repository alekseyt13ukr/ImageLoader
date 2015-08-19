package main.java.com.taran.loader;

import main.java.com.taran.loader.api.model.Album;
import main.java.com.taran.loader.api.model.Photo;
import main.java.com.taran.loader.api.model.User;
import main.java.com.taran.loader.api.service.AlbumService;
import main.java.com.taran.loader.api.service.AlbumServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        AlbumService albumService = new AlbumServiceImpl();

        User user = new User("aleksey", "qwerty");

        Photo photo1 = new Photo("photo1");
        Photo photo2 = new Photo("photo2");
        Photo photo3 = new Photo("photo3");
        Photo photo4 = new Photo("photo4");
        Photo photo5 = new Photo("photo5");

        Album summerAlbum = albumService.create(user, "summer2015");
        Album winterAlbum = albumService.create(user, "winter2015");

        albumService.addPhotosToAlbum(summerAlbum, photo1, photo3, photo4);
        albumService.addPhotosToAlbum(winterAlbum, photo2, photo5);

        List<Album> albums = new ArrayList<>();
        albums.add(summerAlbum);
        albums.add(winterAlbum);

        albumService.delete(albums, summerAlbum);
        albumService.deletePhotosFromAlbum(winterAlbum, photo1, photo2);
    }
}
