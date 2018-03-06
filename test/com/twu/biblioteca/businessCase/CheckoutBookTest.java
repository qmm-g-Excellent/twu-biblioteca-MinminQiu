package com.twu.biblioteca.businessCase;

import com.twu.biblioteca.book.businessCase.CheckoutBook;
import com.twu.biblioteca.common.InitBook;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CheckoutBookTest {

    @Test
    public void should_take_out_book_from_book_library() {

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Scanner mockScanner = mock(Scanner.class);
        when(mockScanner.nextLine()).thenReturn("1");

        new CheckoutBook().CheckoutOneBook(mockScanner);
        assertThat(outContent.toString().contains("请输入您要借出的书籍编号"), is(true));
        assertThat(InitBook.books.get(0).getIsAvailable(), is(false));
    }

}