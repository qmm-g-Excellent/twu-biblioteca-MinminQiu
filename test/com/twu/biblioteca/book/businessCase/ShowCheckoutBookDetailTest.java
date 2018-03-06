package com.twu.biblioteca.book.businessCase;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ShowCheckoutBookDetailTest {

    @Test
    public void should_show_check_out_book_detail() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Scanner mockScanner = mock(Scanner.class);
        when(mockScanner.nextLine()).thenReturn("1");

        new ShowCheckoutBookDetail().showCheckoutBookDetail(mockScanner);
        assertThat(outContent.toString().contains("请输入你想要查看的借书信息的书籍编号"), is(true));
        assertThat(outContent.toString().contains("用户账号"), is(true));
        assertThat(outContent.toString().contains("用户姓名"), is(true));
        assertThat(outContent.toString().contains("080216-001"), is(true));
    }

}