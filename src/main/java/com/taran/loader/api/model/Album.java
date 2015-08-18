package main.java.com.taran.loader.api.model;

import java.util.ArrayList;
import java.util.List;

public class Album {

    private String name;
    private List<Photo> photos;

    private User user;

    public Album(String name, User user) {
        this.name = name;
        this.photos = new ArrayList<>();
        this.user = user;
    }

    public int getSize() {
        return photos.size();
    }

    public boolean addPhoto(Photo photo) {
       return photos.add(photo);
    }

    public boolean addPhoto(String name) {
        return photos.add(new Photo(name));
    }

    public boolean deletePhoto(Photo photo) {
        String name = photo.getName();
        for (Photo p: photos) {
            if (p.getName().equals(name)) {
                photos.remove(p);
                return true;
            }
        }
        return false;
    }

    public boolean deletePhoto(String name) {
        for (Photo p: photos) {
            if (p.getName().equals(name)) {
                return photos.remove(p);
            }
        }
        return false;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String toString() {
        return name;
    }
}
