package com.demo.lab3;

public class Movie {
    private String movieName;
    private String producedBy;
    private String directedBy;
    private int duration;
    private int year;
    private String category;

    private final String movieId;
    private static int moviesCount = 0;

    //constructors

    public Movie(String movieName, String producedBy) {
        if (movieName == null || producedBy == null) {
            throw new IllegalArgumentException("movieName and producedBy cannot be null");
        }
        this.movieName = movieName;
        this.producedBy = producedBy;
        moviesCount++;
        this.movieId = movieName + " - " + moviesCount;
    }

    public Movie(String movieName, String producedBy, String directedBy, int duration, int year, String category) {
        this(movieName, producedBy);
        this.directedBy = directedBy;
        this.duration = duration;
        this.year = year;
        this.category = category;
    }

    public static int getMoviesCount() {
        return moviesCount;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setDirectedBy(String directedBy) {
        this.directedBy = directedBy;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String showDetails() {
        return "MovieID: " + movieId +
                ", Name: " + movieName +
                ", Produced By: " + producedBy +
                ", Directed By: " + directedBy +
                ", Duration: " + duration +
                ", Year: " + year +
                ", Category: " + category;
    }
}

