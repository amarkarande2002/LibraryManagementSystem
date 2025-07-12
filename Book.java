package com.example.Library;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Book {
    private Integer id;

    @NotEmpty(message = "Title must not be empty")
    private String title;

    @NotEmpty(message = "Author must not be empty")
    private String author;

    @NotEmpty(message = "ISBN must not be empty")
    private String isbn;

    @NotNull
    private Boolean available;

    // Constructors, Getters, Setters

    public Book() {
    }

    public Book(Integer id, String title, String author, String isbn, Boolean available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = available;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}
