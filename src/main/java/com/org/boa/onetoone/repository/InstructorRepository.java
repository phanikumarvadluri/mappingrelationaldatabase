package com.org.boa.onetoone.repository;

import com.org.boa.onetoone.model.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long> {
}
