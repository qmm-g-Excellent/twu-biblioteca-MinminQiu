package com.twu.biblioteca.main;

public class MainMenu {

    public void mainMenu() {
        System.out.println("******************************************\n\n");

        System.out.printf("%-20s", "Welcome to Biblioteca Library Management System!\n\n");

        System.out.println("0. 回到主菜单");
        System.out.println("1. 登录");
        System.out.println("2. 查看书籍列表");
        System.out.println("3. 借书");
        System.out.println("4. 还书");
        System.out.println("5. 查看借书信息");

        System.out.println("6.查看电影列表");
        System.out.println("7.借电影");

        System.out.println("8.查看个人信息");
        System.out.println("9.登出");
        System.out.println("10.退出系统");

        System.out.print("\n请输入你的操作代号：");
    }

}
