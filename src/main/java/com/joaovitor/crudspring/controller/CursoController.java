package com.joaovitor.crudspring.controller;

import com.joaovitor.crudspring.repository.CursoRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/cursos")
@AllArgsConstructor
public class CursoController{

    private final CursoRepository cursoRepository;

    @GetMapping
    public List<Object> list() {
        return Collections.singletonList(cursoRepository.findAll());
    }
}
