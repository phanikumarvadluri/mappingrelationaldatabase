package com.org.boa.onetoone.controller;


import com.org.boa.onetoone.model.Author;
import com.org.boa.onetoone.model.Book;
import com.org.boa.onetoone.model.Course;
import com.org.boa.onetoone.model.Student;
import com.org.boa.onetoone.service.AuthorService;
import com.org.boa.onetoone.service.CourseService;
import com.org.boa.onetoone.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService
            ;

    @Autowired
    CourseService courseService
            ;



    @PostMapping("/student")
    public void save(@RequestBody Student student) {
        Student student1 = studentService.createStudent(student);
        for (Course cours : student1.getCourses()) {
            courseService.createCourse(cours);
        }

    }
}
