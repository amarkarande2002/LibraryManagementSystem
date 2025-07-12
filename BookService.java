package com.example.Library;

import com.example.library.model.Book;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class BookService {
    private final Map<Integer, Book> bookStore = new HashMap<>();
    private final AtomicInteger idCounter = new AtomicInteger();

    public List<Book> getAllBooks() {
        return new ArrayList<>(bookStore.values());
    }

    public Book getBookById(Integer id) {
        return bookStore.get(id);
    }

    public Book addBook(Book book) {
        int id = idCounter.incrementAndGet();
        book.setId(id);
        bookStore.put(id, book);
        return book;
    }

    public boolean deleteBook(Integer id) {
        return bookStore.remove(id) != null;
    }

    public Book updateAvailability(Integer id, Boolean available) {
        Book book = bookStore.get(id);
        if (book != null) {
            book.setAvailable(available);
        }
        return book;
    }
}
