package com.twu.biblioteca.user.businessCase;

import com.twu.biblioteca.main.BibliotecaApp;

public class LoginOut {

    public void loginOut() {
        BibliotecaApp.loginUser.invalidateAll();
        System.out.println("登出成功！");

        System.out.println("请输入你的操作代号：");
    }

}
