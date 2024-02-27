package com.example.restservice.exchangerate.repository;

import com.example.restservice.exchangerate.model.Table;
import org.springframework.http.ResponseEntity;

public interface ExchangeRateRepository {
    public ResponseEntity<Table[]> getExchangeRate();
}
