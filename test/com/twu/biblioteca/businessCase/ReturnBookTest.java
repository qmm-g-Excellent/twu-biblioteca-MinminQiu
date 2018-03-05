package com.twu.biblioteca.businessCase;

import com.twu.biblioteca.book.businessCase.ReturnBook;
import com.twu.biblioteca.common.InitBooks;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ReturnBookTest {

    @Test
    public void should_print_return_book_to_book_library() {

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Scanner mockScanner = mock(Scanner.class);
        when(mockScanner.nextLine()).thenReturn("1");

        new ReturnBook().returnBook(mockScanner);

        assertThat(outContent.toString().contains("请输入您要还的书籍编号："), is(true));
        assertThat(InitBooks.books.get(0).getIsAvailable(), is(true));

    }

}