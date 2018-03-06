package com.twu.biblioteca.book.businessCase;

import com.twu.biblioteca.book.entity.Book;
import com.twu.biblioteca.common.InitBook;
import com.twu.biblioteca.common.InitUser;
import com.twu.biblioteca.main.BibliotecaApp;
import com.twu.biblioteca.user.entity.User;

import java.util.*;

public class CheckoutBook {

    public void CheckoutOneBook(Scanner scanner) {
        List<Book> books = InitBook.books;
        System.out.println("\n\n******************************************\n");
        System.out.print("请输入您要借出的书籍编号：");
        int bookNo = Integer.parseInt(scanner.nextLine());
        Set<Integer> keySet = BibliotecaApp.loginUser.asMap().keySet();
        if (keySet.size() <= 0) {
            System.out.println("您当前未登陆，无法进行借书，请先登陆！");
        } else {
            for (Book book : new ArrayList<Book>(books)) {
                if (book.getBookNo() == bookNo) {
                    book.setIsAvailable(false);
                    book.setUserId(getCurrentUser(keySet));
                    System.out.println("\nThank you! Enjoy the book！");
                    break;
                }
                if (books.indexOf(book) == (books.size() - 1)) {
                    System.out.println("\nThat book is not available");
                }
            }
        }

        System.out.print("\n请输入你的操作代号：");
    }

    private Integer getCurrentUser(Set<Integer> keys) {
        Map<Integer, User> users = InitUser.users;
        for (Integer userId : keys) {
            if (users.containsKey(userId)) {
                return userId;
            }
        }
        return null;
    }

}
