package com.personal.pagilarestapi.controller;

import com.personal.pagilarestapi.dto.FilmDto;
import com.personal.pagilarestapi.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FilmController {

    @Autowired
    public FilmService service;

    @GetMapping("/test")
    public String test() {
        return "testtt";
    }

    @GetMapping("/get-films")
    public ResponseEntity<List<FilmDto>> getFilms() {
        List<FilmDto> data = service.getAllFilm();

        return new ResponseEntity<>(data, HttpStatus.OK);
    }
}
