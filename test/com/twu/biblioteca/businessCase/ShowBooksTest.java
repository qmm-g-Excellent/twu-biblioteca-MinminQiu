package com.twu.biblioteca.businessCase;

import com.twu.biblioteca.book.businessCase.ShowBooks;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ShowBooksTest {

    @Test
    public void should_print_books_content_contains_book_table_title() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        new ShowBooks().showBooks();
        assertThat(outContent.toString().contains("书籍编号"), is(true));
        assertThat(outContent.toString().contains("书名"), is(true));
        assertThat(outContent.toString().contains("作者"), is(true));
        assertThat(outContent.toString().contains("出版社"), is(true));
    }

    @Test
    public void should_print_books_content_contains_book_no() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        new ShowBooks().showBooks();
        assertThat(outContent.toString().contains("1"), is(true));
    }

}