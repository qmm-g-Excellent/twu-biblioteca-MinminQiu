package com.twu.biblioteca.common;

import com.twu.biblioteca.movie.entity.Movie;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InitMovie {

    private static SimpleDateFormat dateformat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");


    public static List<Movie> movies;

    static {
        try {
            movies = new ArrayList<Movie>(Arrays.asList(
                    new Movie(001, "红海行动", InitMovie.dateformat.parse("016-02-2018 11:35:42"), "王兵", 9.5),
                    new Movie(002, "战狼之一", InitMovie.dateformat.parse("02-04-2017 11:35:42"), "吴京", 9.4),
                    new Movie(003, "神秘巨星", InitMovie.dateformat.parse("02-010-2016 11:35:42"), "张浩", 8.5)));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


}
