package com.personal.pagilarestapi.service;

import com.personal.pagilarestapi.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    public FilmRepository repository;
}
