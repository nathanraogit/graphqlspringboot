package com.dailycodebuffer.graphqldemo.service;

import com.dailycodebuffer.graphqldemo.model.Author;
import com.dailycodebuffer.graphqldemo.model.Book;
import com.dailycodebuffer.graphqldemo.model.Review;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class AuthorService {
    private List<Author> authors = new ArrayList<>();
    private AtomicInteger authorId = new AtomicInteger(0);
    private AtomicInteger bookId = new AtomicInteger(0);
    private AtomicInteger reviewId = new AtomicInteger(0);

    @PostConstruct
    private void init() {
        // Create mock data for authors
        List<Book> booksForAuthor1 = new ArrayList<>();
        booksForAuthor1.add(new Book(String.valueOf(bookId.incrementAndGet()), "Book One",
                List.of(new Review(String.valueOf(reviewId.incrementAndGet()), "Great book!"))));
        booksForAuthor1.add(new Book(String.valueOf(bookId.incrementAndGet()), "Book Two",
                List.of(new Review(String.valueOf(reviewId.incrementAndGet()), "Interesting read."))));

        authors.add(new Author(String.valueOf(authorId.incrementAndGet()), "Author One", booksForAuthor1));

        List<Book> booksForAuthor2 = new ArrayList<>();
        booksForAuthor2.add(new Book(String.valueOf(bookId.incrementAndGet()), "Book Three",
                List.of(new Review(String.valueOf(reviewId.incrementAndGet()), "Loved it!"))));
        booksForAuthor2.add(new Book(String.valueOf(bookId.incrementAndGet()), "Book Four",
                List.of(new Review(String.valueOf(reviewId.incrementAndGet()), "Not my favorite."))));

        authors.add(new Author(String.valueOf(authorId.incrementAndGet()), "Author Two", booksForAuthor2));
    }

    public List<Author> findAll() {
        return authors;
    }

    public Optional<Author> findOne(String id) {
        return authors.stream()
                .filter(author -> author.getId().equals(id))
                .findFirst();
    }
}
