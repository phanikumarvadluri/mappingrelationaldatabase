package com.org.boa.onetoone.repository;

import com.org.boa.onetoone.model.InstructorDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InstructorDetailsRepository extends JpaRepository<InstructorDetails, Long> {
}
