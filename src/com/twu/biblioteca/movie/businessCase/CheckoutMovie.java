package com.twu.biblioteca.movie.businessCase;

import com.twu.biblioteca.common.InitMovie;
import com.twu.biblioteca.movie.entity.Movie;

import java.util.List;
import java.util.Scanner;

public class CheckoutMovie {

    public void checkoutMovie(Scanner scanner) {

        List<Movie> movies = InitMovie.movies;
        System.out.println("\n\n******************************************\n");
        System.out.print("请输入您要借出的【电影编号】：");

        Integer movieNo = scanner.nextInt();

        for (Movie movie : movies) {
            if (movie.getMovieNo().equals(movieNo)) {
                System.out.println("\nThank you! Enjoy the movie！");
                break;
            } else if (movies.indexOf(movie) == (movies.size() - 1)) {
                System.out.println("\nThat movie is not available");
            }
        }

        System.out.print("\n请输入你的操作代号：");
    }

}
