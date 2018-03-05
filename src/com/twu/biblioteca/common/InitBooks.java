package com.twu.biblioteca.common;

import com.twu.biblioteca.book.entity.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InitBooks {

    public static List<Book> books = new ArrayList<Book>(Arrays.asList(
            new Book(001, "代码大全", "马丁", "清华出版社", true),
            new Book(002, "整洁之道", "李白", "清华出版社", true),
            new Book(003, "构建之法", "杜甫", "清华出版社", true)));

}
