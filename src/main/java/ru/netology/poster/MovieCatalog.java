package ru.netology.poster;

public class MovieCatalog {

    private int id;
    private String name;
    private String genre;
    private String imageUrl;

    public MovieCatalog(int id, String name, String genre, String imageUrl) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}