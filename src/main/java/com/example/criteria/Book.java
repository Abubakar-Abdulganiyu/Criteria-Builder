package com.example.criteria;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
class Book {

    @Id
    Long id;
    String title;
    String author;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // getters and setters

}