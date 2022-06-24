package ru.netology.movies;

public class MovieServiceManager {

    private Movie[] movies = new Movie[0];
    private int limit;

    public MovieServiceManager() {
        this.limit = 10;
    }

    public MovieServiceManager(int limit) {
        this.limit  = limit;
    }

    public void save(Movie movie) {
        Movie tmp[] = new Movie[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public Movie[] FindAll() {
        return movies;
    }

    public Movie[] FindLast() {
        Movie[] ans;
        if (limit < movies.length) {
            ans = new Movie[limit];
        } else {
            ans = new Movie[movies.length];
        }
        for (int i = 0; i < ans.length; i++) {
            ans[i] = movies[movies.length - i - 1];

        }
        return ans;
    }

}


