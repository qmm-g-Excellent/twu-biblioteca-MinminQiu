package com.twu.biblioteca.movie.entity;

import java.util.Date;

public class Movie {

    private Integer movieNo;

    private String name;

    private Date date;

    private String director;

    private Double rating;

    public Integer getMovieNo() {
        return movieNo;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public String getDirector() {
        return director;
    }

    public Double getRating() {
        return rating;
    }


    public Movie(Integer movieNo, String name, Date date, String director, Double rating) {
        this.movieNo = movieNo;
        this.name = name;
        this.date = date;
        this.director = director;
        this.rating = rating;
    }

}
