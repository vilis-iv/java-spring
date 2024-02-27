package com.personal.pagilarestapi.dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class FilmDto {

    int filmId;
    String title;
    String description;
    Integer releaseYear;
    int languageId;
    Integer originalLanguageId;
    int rentalDuration;
    double rentalRate;
    Integer length;
    double replacementCost;
    String rating;
    Timestamp lastUpdate;
    String[] specialFeatures;
    String fullText;
}
