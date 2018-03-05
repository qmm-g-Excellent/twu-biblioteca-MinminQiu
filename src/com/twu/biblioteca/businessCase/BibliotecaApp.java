package com.twu.biblioteca.businessCase;

import java.util.Scanner;

public class BibliotecaApp {

    private final static Integer showBookListNo = 1;
    private final static Integer checkoutBookNo = 2;
    private final static Integer returnBookNo = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MainMenu mainMenu = new MainMenu();
        mainMenu.mainMenu();
        int operationNum = scanner.nextInt();

        do {
            if (operationNum == 0) {
                mainMenu.mainMenu();
            } else if (operationNum == showBookListNo) {
                ShowBooks showBooks = new ShowBooks();
                showBooks.showBooks();
            } else if (operationNum == checkoutBookNo) {
                new CheckoutBook().CheckoutOneBook(new Scanner(System.in));
            } else if (operationNum == returnBookNo) {
                new ReturnBook().returnBook(new Scanner(System.in));
            }

            operationNum = scanner.nextInt();
        } while (operationNum != -1);

    }
}
