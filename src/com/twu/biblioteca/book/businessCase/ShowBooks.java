package com.twu.biblioteca.book.businessCase;

import com.twu.biblioteca.common.InitBook;
import com.twu.biblioteca.book.entity.Book;

import java.util.List;

public class ShowBooks {

    public void showBooks() {
        List<Book> books = InitBook.books;

        System.out.println("******************************************\n\n");
        System.out.format("%10s%10s%10s%10s\n\n", "书籍编号", "书名" + '\t',  "作者"+ '\t', '\t' + "出版社");

        for (Book book : books) {
            if (book.getIsAvailable()) {
                System.out.format("%10s%10s%10s%10s\n",
                        book.getBookNo(),
                        '\t' + book.getName(),
                        '\t' + book.getAuthor(),
                        '\t' + book.getPublishingHouse());
            }
        }

        System.out.print("\n请输入你的操作代号：");
    }

}
