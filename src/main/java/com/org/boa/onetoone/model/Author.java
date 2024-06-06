package com.org.boa.onetoone.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "Authors")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;
    private String name;
    private String email;
    private String phone;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Book> books;

}

