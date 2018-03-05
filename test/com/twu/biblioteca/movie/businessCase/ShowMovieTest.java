package com.twu.biblioteca.movie.businessCase;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ShowMovieTest {

    @Test
    public void should_print_books_content_contains_book_table_title() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        new ShowMovie().showMovies();
        assertThat(outContent.toString().contains("电影编号"), is(true));
        assertThat(outContent.toString().contains("电影名称"), is(true));
        assertThat(outContent.toString().contains("时间"), is(true));
        assertThat(outContent.toString().contains("导演"), is(true));
    }

    @Test
    public void should_print_movies_content_contains_movie_no() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        new ShowMovie().showMovies();
        assertThat(outContent.toString().contains("3"), is(true));
    }

}