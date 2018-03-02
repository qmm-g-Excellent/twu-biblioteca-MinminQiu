package com.twu.biblioteca.common;

import com.twu.biblioteca.entity.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InitDatas {
    private static Book book1 = new Book(001, "代码大全", "马丁", "清华出版社",true);
    private static Book book2 = new Book(002, "整洁之道", "李白", "清华出版社", true);
    private static Book book3 = new Book(003, "构建之法", "杜甫", "清华出版社",true);
    public static List<Book> books = new ArrayList<Book>(Arrays.asList(book1, book2, book3));

}
