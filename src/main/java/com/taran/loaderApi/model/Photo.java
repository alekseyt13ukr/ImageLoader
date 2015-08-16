package main.java.com.taran.loaderApi.model;

public class Photo {

    private String extension;
    private String name;

    public Photo(String name) {
        this.name = name;
//        this.extension = extension;
    }

    public void setComment(String comment){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }
}
