package com.personal.pagilarestapi.controller;

import com.personal.pagilarestapi.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmController {

    @Autowired
    public FilmService service;
}
