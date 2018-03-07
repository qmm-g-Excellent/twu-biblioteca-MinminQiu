package com.twu.biblioteca.user.businessCase;

import com.twu.biblioteca.common.InitUser;
import com.twu.biblioteca.main.BibliotecaApp;
import com.twu.biblioteca.user.entity.User;

import java.util.Map;
import java.util.Set;

public class ShowUserDetail {

    public void showUserDetail() {

        Set<Integer> keySet = BibliotecaApp.loginUser.asMap().keySet();
        Map<Integer, User> users = InitUser.users;
        if (keySet.size() == 0) {
            System.out.println("您当前尚未登录，请先登录再查看！");
        } else {
            for (Integer userId : keySet) {
                if (users.containsKey(userId)) {
                    User user = BibliotecaApp.loginUser.asMap().get(userId);
                    System.out.format("\n%10s%10s%10s%10s\n", "用户账号", "用户姓名" + '\t', "邮箱" + '\t', '\t' + "手机号");
                    System.out.format("%10s%10s%10s%10s\n",
                            user.getAccount(),
                            '\t' + user.getName(),
                            '\t' + user.getEmail(),
                            '\t' + user.getMobileNo());
                }
            }
        }

        System.out.print("\n请输入你的操作代号：");
    }

}
