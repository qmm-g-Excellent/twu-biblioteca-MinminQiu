package com.twu.biblioteca.businessCase;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HomePage homePage = new HomePage();
        homePage.homeMessage();
        int operationNum = scanner.nextInt();
    }
}
