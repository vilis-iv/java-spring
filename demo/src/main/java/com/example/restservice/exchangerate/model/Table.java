package com.example.restservice.exchangerate.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter @NoArgsConstructor
public class Table {
    String table;
    String no;
    String effectiveDate;
    ArrayList<Rate> rates;

    public Table(String table, String no, String effectiveDate, ArrayList<Rate> rates) {
        this.table = table;
        this.no = no;
        this.effectiveDate = effectiveDate;
        this.rates = rates;
    }
}
