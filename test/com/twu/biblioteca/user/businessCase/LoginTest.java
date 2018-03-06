package com.twu.biblioteca.user.businessCase;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LoginTest {

    @Test
    public void should_login_success_when_input_account_and_password() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Scanner mockScanner = mock(Scanner.class);

        when(mockScanner.nextLine()).thenReturn("080216-001");
        when(mockScanner.nextLine()).thenReturn("123456");
        new Login().login(mockScanner);

        assertThat(outContent.toString().contains("请输入你的账号"), is(true));
        assertThat(outContent.toString().contains("登录成功"), is(true));
    }

    @Test
    public void should_login_failed_when_input_account_and_password() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Scanner mockScanner = mock(Scanner.class);

        when(mockScanner.nextLine()).thenReturn("080216-007");
        when(mockScanner.nextLine()).thenReturn("123456");
        new Login().login(mockScanner);

        assertThat(outContent.toString().contains("请输入你的账号"), is(true));
        assertThat(outContent.toString().contains("账号密码不匹配"), is(true));
    }

}