package com.personal.pagilarestapi.controller;

import com.personal.pagilarestapi.dto.CategoryDto;
import com.personal.pagilarestapi.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    CategoryService service;

    @GetMapping("/get-category")
    public ResponseEntity<List<CategoryDto>> getAllCategory() {
        List<CategoryDto> data = service.getAllCategory();
        return new ResponseEntity<>(data, HttpStatus.OK);
    }
}
