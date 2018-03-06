package com.twu.biblioteca.user.businessCase;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LoginOutTest {

    @Test
    public void should_login_out_success() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        new LoginOut().loginOut();
        assertThat(outContent.toString().contains("登出成功"), is(true));
    }
}