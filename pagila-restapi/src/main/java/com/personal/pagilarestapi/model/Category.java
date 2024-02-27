package com.personal.pagilarestapi.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Data
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue
    @Column(name = "category_id")
    int categoryId;

    @Column(name = "name")
    String name;

//    @Column(name = "last_update")
//    Timestamp lastUpdate;
}
