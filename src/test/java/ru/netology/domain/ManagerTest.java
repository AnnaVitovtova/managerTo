package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    Manager manager = new Manager();

    @Test
    void addProduct() {
        Book bookFirst = new Book(1, "Первый", 1000, "111", "First");
        Book bookSecond = new Book(2, "Второй", 1500, "222", "Second");
        Book bookThree = new Book(3, "Третий", 2000, "333", "Three");
        Book bookFour = new Book(4, "Четвёртый", 2500, "444", "Four");
        Smartphone smartphone0 = new Smartphone(0, "Zero", 10000, "000", "Zero");
        Smartphone smartphone1 = new Smartphone(1, "First", 15000, "111", "First");
        Smartphone smartphone2 = new Smartphone(2, "Second", 20000, "222", "Second");
        Smartphone smartphone3 = new Smartphone(3, "Three", 25000, "333", "Three");

        manager.add(bookFirst);
        manager.add(bookSecond);
        manager.add(bookThree);
        manager.add(bookFour);
        manager.add(smartphone0);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);

        Product[] actual = manager.findAll();
        Product[] expected = {bookFirst, bookSecond, bookThree, bookFour, smartphone0, smartphone1, smartphone2, smartphone3};
        assertArrayEquals(expected, actual);

    }

    @Test
    void searchByTest() {
        Book bookFirst = new Book(1, "ПервыйFF", 1000, "111", "First");
        Book bookSecond = new Book(2, "Второй", 1500, "222", "Second");
        Book bookThree = new Book(3, "ТретийFF", 2000, "333", "Three");
        Book bookFour = new Book(4, "Четвёртый", 2500, "444", "Four");
        Smartphone smartphone0 = new Smartphone(0, "Zero", 10000, "000", "Zero");
        Smartphone smartphone1 = new Smartphone(1, "First", 15000, "111", "First");
        Smartphone smartphone2 = new Smartphone(2, "Second", 20000, "222", "Second");
        Smartphone smartphone3 = new Smartphone(3, "Three", 25000, "333", "Three");

        manager.add(bookFirst);
        manager.add(bookSecond);
        manager.add(bookThree);
        manager.add(bookFour);
        manager.add(smartphone0);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);

        Product[] actual = manager.searchBy("FF");
        Product[] expected = {bookFirst, bookThree};
        assertArrayEquals(expected, actual);
    }

    @Test
    void addDallProduct() {
        Book bookFirst = new Book(1, "Первый", 1000, "111", "First");
        Book bookSecond = new Book(2, "Второй", 1500, "222", "Second");
        Book bookThree = new Book(3, "Третий", 2000, "333", "Three");
        Book bookFour = new Book(4, "Четвёртый", 2500, "444", "Four");
        Smartphone smartphone0 = new Smartphone(0, "Zero", 10000, "000", "Zero");
        Smartphone smartphone1 = new Smartphone(5, "First", 15000, "111", "First");
        Smartphone smartphone2 = new Smartphone(6, "Second", 20000, "222", "Second");
        Smartphone smartphone3 = new Smartphone(7, "Three", 25000, "333", "Three");

        manager.add(bookFirst);
        manager.add(bookSecond);
        manager.add(bookThree);
        manager.add(bookFour);
        manager.add(smartphone0);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);

        manager.dall(5);

        Product[] actual = manager.findAll();
        Product[] expected = {bookFirst, bookSecond, bookThree, bookFour, smartphone0, smartphone2, smartphone3};
        assertArrayEquals(expected, actual);
    }

}