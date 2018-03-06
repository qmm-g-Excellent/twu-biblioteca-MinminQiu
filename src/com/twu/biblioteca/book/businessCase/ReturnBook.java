package com.twu.biblioteca.book.businessCase;

import com.twu.biblioteca.common.InitBook;
import com.twu.biblioteca.book.entity.Book;
import java.util.List;
import java.util.Scanner;

public class ReturnBook {

    public void returnBook( Scanner scanner) {
        List<Book> books = InitBook.books;

        System.out.println("******************************************\n\n");
        System.out.print("请输入您要还的书籍编号：");
        int bookNo = scanner.nextInt();

        for (Book book : books) {
            if (book.getBookNo() == bookNo) {
                book.setIsAvailable(true);
                System.out.println("\nThank you for returning the book!");
                break;
            }
            if (books.indexOf(book) == (books.size() - 1)) {
                System.out.println("\nThat is not a valid book to return!");
            }
        }
        System.out.print("\n请输入你的操作代号：");
    }

}
