package com.example.restservice.exchangerate.service;

import com.example.restservice.RestServiceApplication;
import com.example.restservice.exchangerate.model.Rate;
import com.example.restservice.exchangerate.model.Table;
import com.example.restservice.exchangerate.repository.ExchangeRateRepository;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Service
public class ExchangeRateServiceImpl implements ExchangeRateService, ExchangeRateRepository {

    private static final Logger log = LoggerFactory.getLogger(RestServiceApplication.class);

    @Override
    public ResponseEntity<Table[]> getExchangeRate() {
        String url = "http://api.nbp.pl/api/exchangerates/tables/a?format=json";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForEntity(url,Table[].class);
    }

    @Override
    public ArrayList<Rate> getRate() {
     return Objects.requireNonNull(getExchangeRate().getBody())[0].getRates();
    }
}
