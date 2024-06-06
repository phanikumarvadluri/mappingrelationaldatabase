package com.org.boa.onetoone.controller;


import com.org.boa.onetoone.model.Instructor;
import com.org.boa.onetoone.model.InstructorDetails;
import com.org.boa.onetoone.service.InstructorDetailsService;
import com.org.boa.onetoone.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstructorController {

    @Autowired
    InstructorService instructorService;

    @Autowired
    InstructorDetailsService instructorDetailsService;

    @PostMapping("/instructor")
    public void save(@RequestBody Instructor instructor) {
        instructorService.saveInstructor(instructor);
        InstructorDetails instructorDetails = instructor.getInstructorDetails();
        instructorDetails.setInstructor(instructor);
        instructorDetailsService.saveInstructorDetails(instructorDetails);
    }


}
