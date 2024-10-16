package com.dailycodebuffer.graphqldemo.model;


import java.util.List;

public class Author {
    private String id;
    private String authorName; // Changed from Author_name to camelCase
    private List<Book> books;

    // Constructor
    public Author(String id, String authorName, List<Book> books) {
        this.id = id;
        this.authorName = authorName;
        this.books = books;
    }

    // Getters and SettersSSS14
    // Getters and SettersSSS13
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
    //test
}
