package ru.topacademy.javaqa.domain;

public class PosterManager {
    private PosterMovie[] movies = new PosterMovie[0];
    private int countRecords = 10;

    public PosterManager() {
    }

    public PosterManager(int countRecords) {
        this.countRecords = countRecords;
    }

    public void add(PosterMovie item) {
        PosterMovie[] tmp = new PosterMovie[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = item;
        movies = tmp;
    }

    public PosterMovie[] findAll() {
        return movies;
    }

    public PosterMovie[] findLast() {
        int resultLength;
        if (movies.length > countRecords) {
            resultLength = countRecords;
        } else {
            resultLength = movies.length;
        }
        PosterMovie[] reversed = new PosterMovie[resultLength];

        for (int i = 0; i < resultLength; i++) {
            reversed[i] = movies[movies.length - 1 - i];
        }
        return reversed;
    }
}
