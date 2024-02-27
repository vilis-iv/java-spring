package com.personal.pagilarestapi.service;

import com.personal.pagilarestapi.dto.FilmDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FilmService {
    public List<FilmDto> getAllFilm();

}
