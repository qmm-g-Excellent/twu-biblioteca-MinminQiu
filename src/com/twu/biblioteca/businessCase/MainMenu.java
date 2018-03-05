package com.twu.biblioteca.businessCase;

public class MainMenu {

    public void mainMenu() {
        System.out.println("******************************************\n\n");

        System.out.printf("%-20s", "Welcome to Biblioteca Library Management System!\n\n");
        System.out.println("0.回到主菜单\n");
        System.out.println("1.查看书籍列表\n");
        System.out.println("2.借书\n");
        System.out.println("3.还书\n");
        System.out.println("4.退出\n");

        System.out.print("\n请输入你的操作代号：");
    }

}
