package com.twu.biblioteca.businessCase;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MainMenuTest {

    @Test
    public void should_print_main_menu_content_contains_checkout_book() {

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        new MainMenu().mainMenu();
        assertThat(outContent.toString().contains("借书"), is(true));
    }

    @Test
    public void should_print_main_menu_content_contains_return_book() {

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        new MainMenu().mainMenu();
        assertThat(outContent.toString().contains("还书"), is(true));
    }

}