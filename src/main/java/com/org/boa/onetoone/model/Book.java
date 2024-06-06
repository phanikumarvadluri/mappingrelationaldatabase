package com.org.boa.onetoone.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Books")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    @Column(name="book_id")
    private Long id;
    private String title;
    private String description;

    @ManyToOne
    @JoinColumn(name = "author_id")
    @JsonIgnore
    private Author author;

}

