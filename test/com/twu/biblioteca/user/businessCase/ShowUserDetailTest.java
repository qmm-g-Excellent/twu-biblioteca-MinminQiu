package com.twu.biblioteca.user.businessCase;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ShowUserDetailTest {

    @Test
    public void should_show_user_detail_when_user_login_success() {

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        new ShowUserDetail().showUserDetail();

        assertThat(outContent.toString().contains("用户姓名"), is(true));
    }

}