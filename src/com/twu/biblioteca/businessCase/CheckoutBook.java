package com.twu.biblioteca.businessCase;

import com.twu.biblioteca.common.InitDatas;
import com.twu.biblioteca.entity.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckoutBook {

    public void CheckoutOneBook() {
        List<Book> books = InitDatas.books;
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入您要借出的书籍编号：");
        int bookNo = scanner.nextInt();

        for (Book book : new ArrayList<Book>(books)) {
            if (book.getBookNo() == bookNo) {
                book.setIsAvailable(false);
            }
        }
        System.out.print("\n请输入你的操作代号：");
    }
}
