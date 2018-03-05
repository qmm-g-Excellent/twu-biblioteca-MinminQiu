package com.twu.biblioteca.movie.businessCase;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CheckoutMovieTest {

    @Test
    public void should_take_out_movie_from_movie_library() {

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Scanner mockScanner = mock(Scanner.class);
        when(mockScanner.nextLine()).thenReturn("2");

        new CheckoutMovie().checkoutMovie(mockScanner);
        assertThat(outContent.toString().contains("请输入您要借出的【电影编号"), is(true));
    }

}