package com.org.boa.onetoone.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "instructor_details")
@Setter
@Getter
public class InstructorDetails {
    @Id
    @Column(name="details_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;

    private String qualification;
    private int experienceYears;

    @OneToOne
    @JoinColumn(name = "instructor_id")
    @JsonIgnore
    private Instructor instructor;

}
