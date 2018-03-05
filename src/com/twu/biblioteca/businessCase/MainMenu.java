package com.twu.biblioteca.businessCase;

public class MainMenu {

    public void mainMenu() {
        System.out.println("******************************************\n\n");

        System.out.printf("%-20s", "Welcome to Biblioteca Library Management System!\n\n");

        System.out.println("0. 回到主菜单\n");
        System.out.println("1. 登录\n");
        System.out.println("2. 查看书籍列表\n");
        System.out.println("3. 借书\n");
        System.out.println("4. 还书\n");
        System.out.println("5. 查看借书信息\n");

        System.out.println("6.查看电影列表\n");
        System.out.println("7.借电影\n");

        System.out.println("8.登出\n");
        System.out.println("9.退出系统\n");

        System.out.print("\n请输入你的操作代号：");
    }

}
