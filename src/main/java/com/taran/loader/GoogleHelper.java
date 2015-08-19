package main.java.com.taran.loader;

public class GoogleHelper {

  public static boolean createAlbum(String username, String password, String albumName){
       System.out.println("create album for username = [" + username + "], password = [" + password + "], albumName = [" + albumName + "]");
       return true;
   }

    public static boolean deleteAlbum(String username, String password, String albumName){
        System.out.println("delete album for username = [" + username + "], password = [" + password + "], albumName = [" + albumName + "]");
        return true;
    }

    public static boolean addPhoto(String username, String password, String albumName, String photoName, byte[] photo){
        System.out.println("add photo for username = [" + username + "], password = [" + password + "], albumName = [" + albumName + "]");
        return true;
    }

    public static boolean deletePhoto(String username, String password, String albumName, String photoName, byte[] photo){
        System.out.println("delete photo for username = [" + username + "], password = [" + password + "], albumName = [" + albumName + "]");
        return true;
    }
}
