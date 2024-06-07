package com.org.boa.onetoone.service;

import com.org.boa.onetoone.model.Course;
import com.org.boa.onetoone.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

//    public Course getCourseById(Long id) {
//        return courseRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("Course", "id", id));
//    }

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

//    public Course updateCourse(Long id, Course courseDetails) {
//        Course course = getCourseById(id);
//        course.setName(courseDetails.getName());
//        return courseRepository.save(course);
//    }

//    public void deleteCourse(Long id) {
//        Course course = getCourseById(id);
//        courseRepository.delete(course);
//    }
}
