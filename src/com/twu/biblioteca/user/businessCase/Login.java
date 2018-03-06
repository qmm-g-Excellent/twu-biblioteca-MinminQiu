package com.twu.biblioteca.user.businessCase;

import com.twu.biblioteca.common.InitUser;
import com.twu.biblioteca.main.BibliotecaApp;
import com.twu.biblioteca.user.entity.User;

import java.util.*;

public class Login {

    public void login(Scanner scanner) {
        Map<Integer, User> userMap = InitUser.users;
        System.out.print("\n请输入你的账号：");
        String account = scanner.nextLine();

        System.out.print("\n请输入你的密码：");
        String password = scanner.nextLine();

        List<User> users = new ArrayList<User>(userMap.values());

        for (User user : users) {
            if (account != null
                    && password != null
                    && account.equals(user.getAccount())
                    && user.getPassword().equals(password)) {
                BibliotecaApp.loginUser.put(user.getUserId(), user);
                System.out.println("登录成功！");
                break;
            } else if (users.indexOf(user) == (users.size() - 1)) {
                System.out.println("账号密码不匹配！");
            }
        }

        System.out.print("\n请输入你的操作代号：");
    }

}
