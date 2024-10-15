package com.dailycodebuffer.graphqldemo.model;

public class Review {
    private String id;
    private String comment;

    // Constructor
    public Review(String id, String comment) {
        this.id = id;
        this.comment = comment;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
