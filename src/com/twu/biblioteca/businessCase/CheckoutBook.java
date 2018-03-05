package com.twu.biblioteca.businessCase;

import com.twu.biblioteca.common.InitDatas;
import com.twu.biblioteca.entity.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckoutBook {

    public void CheckoutOneBook(Scanner scanner) {
        List<Book> books = InitDatas.books;
        System.out.println("\n\n******************************************\n");
        System.out.print("请输入您要借出的书籍编号：");
        int bookNo = Integer.parseInt(scanner.nextLine());

        for (Book book : new ArrayList<Book>(books)) {
            if (book.getBookNo() == bookNo) {
                book.setIsAvailable(false);
                System.out.println("\nThank you! Enjoy the book！");
                break;
            }
            if (books.indexOf(book) == (books.size() - 1)) {
                System.out.println("\nThat book is not available");
            }
        }
        System.out.print("\n请输入你的操作代号：");
    }

}
