package com.personal.pagilarestapi.service;

import com.personal.pagilarestapi.dto.CategoryDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {
    public List<CategoryDto> getAllCategory();
}
