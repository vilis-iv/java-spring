package com.example.demo.controller;

import com.example.demo.dto.BillerDataDto;
import com.example.demo.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {
    @Autowired
    public MainService mainService;

    @GetMapping("/test")
    public ResponseEntity<String> getData() {
        String result = mainService.getData();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping("/get-biller")
    public ResponseEntity<List<BillerDataDto>> getAllData() {
        List<BillerDataDto> data = mainService.getAllDataBiller();
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    @GetMapping("/getbydomain")
    public ResponseEntity<BillerDataDto> getByDomain(
            @RequestParam(name = "domain")
            String domain
    ) {

        BillerDataDto data = mainService.getByDomain(domain);
        return new ResponseEntity<>(data, HttpStatus.OK);
    }
}
