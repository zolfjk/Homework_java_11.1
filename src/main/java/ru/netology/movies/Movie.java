package ru.netology.movies;

public class Movie {

    private String name;

    private String genre;
    private String image;

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getImage() {
        return image;
    }


    public Movie(String name, String genre, String image) {
        this.name = name;
        this.genre = genre;
        this.image = image;
    }
}
