package main.java.com.taran.loaderApi.model;

import java.util.ArrayList;
import java.util.List;

public class Album {

    private String name;
    private List<Photo> photos;

    public Album(String name) {
        this.name = name;
        photos = new ArrayList<>();
    }

    public int getSize() {
        return photos.size();
    }

    public void addPhoto(Photo photo) {
        photos.add(photo);
    }

    public void deletePhoto(Photo photo) {
        String name = photo.getName();
        for (Photo p: photos) {
            if (p.getName().equals(name)) {
                photos.remove(p);
            }
        }
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



}
