package com.personal.pagilarestapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Data
@Table(name = "film", schema = "public")
public class FilmModel {
    @Id
    @Column(name = "film_id")
    int filmId;

    @Column(name = "title")
    String title;

    @Column(name = "description")
    String description;

    @Column(name = "release_year")
    int releaseYear;

    @Column(name = "language_id")
    int languageId;

    @Column(name = "original_language_id")
    int originalLanguageId;

    @Column(name = "rental_duration")
    int rentalDuration;

    @Column(name = "rental_rate")
    double rentalRate;

    @Column(name = "length")
    int length;

    @Column(name = "replacement_cost")
    double replacementCost;

    @Column(name = "rating")
    String rating;

    @Column(name = "last_update")
    Timestamp lastUpdate;

    @Column(name = "special_features")
    String specialFeatures;
}
