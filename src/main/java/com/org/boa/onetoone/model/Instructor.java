package com.org.boa.onetoone.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "instructors")
@Setter
@Getter
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;

    private String name;
    private String email;
    private String phone;

    @OneToOne(mappedBy = "instructor", cascade = CascadeType.ALL)
    private InstructorDetails instructorDetails;

}

