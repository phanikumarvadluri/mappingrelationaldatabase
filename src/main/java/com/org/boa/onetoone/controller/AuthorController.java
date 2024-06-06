package com.org.boa.onetoone.controller;


import com.org.boa.onetoone.model.Author;
import com.org.boa.onetoone.model.Book;
import com.org.boa.onetoone.model.Instructor;
import com.org.boa.onetoone.model.InstructorDetails;
import com.org.boa.onetoone.service.AuthorService;
import com.org.boa.onetoone.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {

    @Autowired
    BookService bookService;

    @Autowired
    AuthorService authorService;


    @PostMapping("/author")
    public void save(@RequestBody Author author) {
        authorService.saveAuthor(author);
        List<Book> books = author.getBooks();
        for (Book book : books) {
            book.setAuthor(author);
            bookService.saveBook(book);
        }
    }
}
