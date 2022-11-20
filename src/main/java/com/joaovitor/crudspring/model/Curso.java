package com.joaovitor.crudspring.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 200, nullable = false)
    private String name;

    @Column(length = 200, nullable = false)
    private String category;
}
