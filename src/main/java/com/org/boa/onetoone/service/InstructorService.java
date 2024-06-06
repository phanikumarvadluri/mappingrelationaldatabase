package com.org.boa.onetoone.service;

import com.org.boa.onetoone.model.Instructor;
import com.org.boa.onetoone.repository.InstructorDetailsRepository;
import com.org.boa.onetoone.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class InstructorService {
    @Autowired
    private InstructorRepository instructorRepository;


    public void saveInstructor(Instructor instructor) {
        instructorRepository.save(instructor);
    }
}

