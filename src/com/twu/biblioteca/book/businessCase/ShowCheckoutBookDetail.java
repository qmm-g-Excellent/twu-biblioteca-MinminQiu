package com.twu.biblioteca.book.businessCase;

import com.twu.biblioteca.book.entity.Book;
import com.twu.biblioteca.common.InitBook;
import com.twu.biblioteca.common.InitUser;
import com.twu.biblioteca.user.entity.User;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ShowCheckoutBookDetail {

    public void showCheckoutBookDetail(Scanner scanner) {

        List<Book> books = InitBook.books;
        Map<Integer, User> userMap = InitUser.users;

        System.out.println("******************************************");
        System.out.print("\n请输入你想要查看的借书信息的书籍编号：");

        Integer bookNo = scanner.nextInt();

        for (Book book : books) {
            if (book.getBookNo() == bookNo) {
                User user = userMap.get(book.getUserId());
                System.out.format("\n%10s%10s%10s%10s\n", "用户账号", "用户姓名" + '\t', "邮箱" + '\t', '\t' + "手机号");
                if (user != null) {
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
