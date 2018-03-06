package com.twu.biblioteca.movie.businessCase;

import com.twu.biblioteca.common.InitMovie;
import com.twu.biblioteca.movie.entity.Movie;

import java.util.List;

public class ShowMovie {

    public void showMovies() {
        List<Movie> movies = InitMovie.movies;

        System.out.println("******************************************\n\n");
        System.out.format("%15s%15s%28s%15s%15s\n\n", "电影编号", '\t' + "电影名称", '\t' + "时间",  "导演" ,  "评分");

        for (Movie movie : movies) {
            System.out.format("%15s%15s%28s%15s%15s\n",
                    movie.getMovieNo(),
                    '\t' + movie.getName(),
                    '\t' + movie.getDate().toString(),
                      movie.getDirector(),
                      movie.getRating().toString());
        }

        System.out.print("\n请输入你的操作代号：");
    }

}
