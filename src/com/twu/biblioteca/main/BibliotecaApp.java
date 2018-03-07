package com.twu.biblioteca.main;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.twu.biblioteca.book.businessCase.CheckoutBook;
import com.twu.biblioteca.book.businessCase.ReturnBook;
import com.twu.biblioteca.book.businessCase.ShowBooks;
import com.twu.biblioteca.book.businessCase.ShowCheckoutBookDetail;
import com.twu.biblioteca.movie.businessCase.CheckoutMovie;
import com.twu.biblioteca.movie.businessCase.ShowMovie;
import com.twu.biblioteca.user.businessCase.Login;
import com.twu.biblioteca.user.businessCase.LoginOut;
import com.twu.biblioteca.user.businessCase.ShowUserDetail;
import com.twu.biblioteca.user.entity.User;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class BibliotecaApp {

    public static Cache<Integer, User> loginUser = CacheBuilder
            .newBuilder()
            .expireAfterAccess(1, TimeUnit.HOURS)
            .build();

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
                case 1:
                    new Login().login(new Scanner(System.in));
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
                case 5:
                    new ShowCheckoutBookDetail().showCheckoutBookDetail(new Scanner(System.in));
                    break;
                case 6:
                    new ShowMovie().showMovies();
                    break;
                case 7:
                    new CheckoutMovie().checkoutMovie(new Scanner(System.in));
                    break;
                case 8:
                    new ShowUserDetail().showUserDetail();
                    break;
                case 9:
                    new LoginOut().loginOut();
                    break;
                default:
                    System.out.println("Select a valid option!");
                    System.out.print("\n请输入你的操作代号：");
                    break;
            }

            operationNum = scanner.nextInt();
        } while (operationNum != 10);
    }

}
