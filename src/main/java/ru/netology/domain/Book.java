package ru.netology.domain;

public class Book extends Product {
    private String name;
    private String author;

    public Book() {
        super();
    }

    public Book(int id, String name, int price, String name1, String author) {
        super(id, name, price);
        this.author = author;
    }

    public String getAuthor() {

        return author;
    }

    public void setAuthor(String author) {

        this.author = author;
    }
}
