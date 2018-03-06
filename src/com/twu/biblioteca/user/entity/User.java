package com.twu.biblioteca.user.entity;

public class User {

    private int userId;

    private String account;

    private String password;

    private String name;

    private String email;

    private String mobileNo;

    public User(int userId, String account, String password, String name, String email, String mobileNo) {
        this.userId = userId;
        this.account = account;
        this.password = password;
        this.name = name;
        this.email = email;
        this.mobileNo = mobileNo;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobileNo() {
        return mobileNo;
    }
}
