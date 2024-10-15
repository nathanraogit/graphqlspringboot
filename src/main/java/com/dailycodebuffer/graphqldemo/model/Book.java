package com.dailycodebuffer.graphqldemo.model;

import java.util.List;

public class Book {
    private String id;
    private String name;
    private List<Review> reviews;

    // Constructor
    public Book(String id, String name, List<Review> reviews) {
        this.id = id;
        this.name = name;
        this.reviews = reviews;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
    // remote book update 1
    // remote book update 2
    // remote book update 4 (before this branch2 changes were applied)
}
