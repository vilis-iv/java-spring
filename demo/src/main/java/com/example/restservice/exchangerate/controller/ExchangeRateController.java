package com.example.restservice.exchangerate.controller;

import com.example.restservice.exchangerate.model.Rate;
import com.example.restservice.exchangerate.model.Table;
import com.example.restservice.exchangerate.repository.ExchangeRateRepository;
import com.example.restservice.exchangerate.service.ExchangeRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ExchangeRateController {

    @Autowired
    public ExchangeRateService exchangeRateService;

    @Autowired
    public ExchangeRateRepository exchangeRateRepository;

    @GetMapping("/get-table")
    private Table[] getExchange() {
        ResponseEntity<Table[]> response = exchangeRateRepository.getExchangeRate();
        return response.getBody();
    }

    @GetMapping("/get-rates")
    private ArrayList<Rate> getRate() {
        return exchangeRateService.getRate();
    }

}
