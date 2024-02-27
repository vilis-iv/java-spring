package com.example.restservice.exchangerate.service;

import com.example.restservice.exchangerate.model.Rate;
import com.example.restservice.exchangerate.model.Table;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface ExchangeRateService {
    public ArrayList<Rate> getRate();
}
