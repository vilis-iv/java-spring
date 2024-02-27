package com.personal.pagilarestapi.service;

import com.personal.pagilarestapi.dto.FilmDto;
import com.personal.pagilarestapi.model.Film;
import com.personal.pagilarestapi.repository.FilmRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    final Log logger = LogFactory.getLog(FilmServiceImpl.class);

    @Autowired
    public FilmRepository repository;

    @Override
    public List<FilmDto> getAllFilm() {
        List<FilmDto> filmDtos = new ArrayList<>();
        List<Film> films = repository.findAll();
        logger.info("###############################/film size" + films.size());

        for (Film film : films) {
            ModelMapper modelMapper = new ModelMapper();
            FilmDto filmDto = modelMapper.map(film, FilmDto.class);

            filmDtos.add(filmDto);
        }

        return filmDtos;
    }
}
