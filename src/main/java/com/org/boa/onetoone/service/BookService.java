package com.org.boa.onetoone.service;

import com.org.boa.onetoone.model.Book;
import com.org.boa.onetoone.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public void saveBook(Book book) {
        bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}
