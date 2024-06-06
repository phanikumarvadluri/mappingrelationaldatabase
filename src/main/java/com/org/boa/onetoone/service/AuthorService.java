package com.org.boa.onetoone.service;

import com.org.boa.onetoone.model.Author;
import com.org.boa.onetoone.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public void saveAuthor(Author author) {
        authorRepository.save(author);
    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }
}
