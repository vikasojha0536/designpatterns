package com.example.designpattern.prototypepattern;

public class Book extends Item{
    private int numberOfPages;

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public Book setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
        return this;
    }
}
