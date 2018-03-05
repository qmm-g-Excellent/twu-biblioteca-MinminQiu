package com.twu.biblioteca.entity;

import java.util.Date;

public class Movie {

    private String name;

    private Date date;

    private String director;

    private Double rating;

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


    public Movie(String name, Date date, String director, Double rating) {
        this.name = name;
        this.date = date;
        this.director = director;
        this.rating = rating;
    }

}
