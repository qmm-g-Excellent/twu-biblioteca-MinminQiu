package com.twu.biblioteca.entity;

public class Book {

    private Integer bookNo;

    private String name;

    private String author;

    private String publishingHouse;

    private Boolean isAvailable;

    public Book(Integer bookNo, String name, String author, String publishingHouse, Boolean isAvailable) {
        this.bookNo = bookNo;
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.isAvailable = isAvailable;
    }

    public Integer getBookNo() {
        return bookNo;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setBookNo(Integer bookNo) {
        this.bookNo = bookNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

}
