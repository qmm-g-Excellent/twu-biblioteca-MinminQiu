package com.twu.biblioteca;

import com.twu.biblioteca.book.businessCase.CheckoutBook;
import com.twu.biblioteca.book.businessCase.MainMenu;
import com.twu.biblioteca.book.businessCase.ReturnBook;
import com.twu.biblioteca.book.businessCase.ShowBooks;
import com.twu.biblioteca.movie.businessCase.ShowMovie;

import java.util.Scanner;

public class BibliotecaApp {

    private final static Integer mainMenu = 0;
    private final static Integer showBookListNo = 1;
    private final static Integer checkoutBookNo = 2;
    private final static Integer returnBookNo = 3;
    private final static Integer quit = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MainMenu mainMenu = new MainMenu();
        mainMenu.mainMenu();
        int operationNum = scanner.nextInt();

        do {

            switch (operationNum) {
                case 0:
                    mainMenu.mainMenu();
                    break;
                case 2:
                    new ShowBooks().showBooks();
                    break;
                case 3:
                    new CheckoutBook().CheckoutOneBook(new Scanner(System.in));
                    break;
                case 4:
                    new ReturnBook().returnBook(new Scanner(System.in));
                    break;
                case 6:
                    new ShowMovie().showMovies();
                    break;
                case 7:
                    new ReturnBook().returnBook(new Scanner(System.in));
                    break;

                default:
                    System.out.println("Select a valid option!");
                    System.out.print("\n请输入你的操作代号：");
                    break;
            }

            operationNum = scanner.nextInt();
        } while (operationNum != 9);
    }

}
