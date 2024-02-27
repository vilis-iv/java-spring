package com.personal.pagilarestapi.model;

import com.vladmihalcea.hibernate.type.array.StringArrayType;
import com.vladmihalcea.hibernate.type.search.PostgreSQLTSVectorType;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Type;

import java.sql.Timestamp;

@Entity
@Data
@Table(name = "film")
public class Film {
    @Id
    @GeneratedValue
    @Column(name = "film_id", nullable = false)
    int filmId;

    @Column(name = "title")
    String title;

    @Column(name = "description")
    String description;

    @Column(name = "release_year")
    Integer releaseYear;

    @Column(name = "language_id")
    int languageId;

    @Column(name = "original_language_id")
    Integer originalLanguageId;

    @Column(name = "rental_duration")
    int rentalDuration;

    @Column(name = "rental_rate")
    double rentalRate;

    @Column(name = "length")
    Integer length;

    @Column(name = "replacement_cost")
    double replacementCost;

    @Column(name = "rating")
    String rating;

    @Column(name = "last_update")
    Timestamp lastUpdate;

//    @Type(StringArrayType.class)
    @Type(com.personal.pagilarestapi.util.CustomStringArrayType.class)
    @Column(name = "special_features", columnDefinition = "text[]")
    String[] specialFeatures;

//    @Type(PostgreSQLTSVectorType.class)
    @Column(name = "fulltext")
    String fullText;
}
