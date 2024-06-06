package com.org.boa.onetoone.service;

import com.org.boa.onetoone.model.InstructorDetails;
import com.org.boa.onetoone.repository.InstructorDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class InstructorDetailsService {
    @Autowired
    private InstructorDetailsRepository instructorDetailsRepository;

    public void saveInstructorDetails(InstructorDetails instructorDetails) {
        instructorDetailsRepository.save(instructorDetails);
    }
}
