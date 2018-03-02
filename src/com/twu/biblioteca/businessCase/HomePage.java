package com.twu.biblioteca.businessCase;

public class HomePage {

    public void homeMessage() {
        System.out.printf("******************************************\n\n");

        System.out.printf("%-20s", "Welcome to Biblioteca Library Management System!\n\n");
        System.out.printf("1.查看书籍列表\n");
        System.out.printf("2.借书\n");
        System.out.printf("3.还书\n");

        System.out.printf("\n请输入你的操作代号：");
    }
}
