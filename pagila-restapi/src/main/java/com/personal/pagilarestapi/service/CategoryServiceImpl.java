package com.personal.pagilarestapi.service;

import com.personal.pagilarestapi.dto.CategoryDto;
import com.personal.pagilarestapi.model.Category;
import com.personal.pagilarestapi.repository.CategoryRepository;
import com.personal.pagilarestapi.service.CategoryService;
import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    public CategoryRepository repository;
    @Override
    public List<CategoryDto> getAllCategory() {
        List<Category> categories = repository.findAll();
        List<CategoryDto> categoryDtos = new ArrayList<>();

        for (Category category : categories) {
            ModelMapper modelMapper = new ModelMapper();

            modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
            modelMapper.getConfiguration().setPropertyCondition(Conditions.isNotNull());

            CategoryDto categoryDto = modelMapper.map(category, CategoryDto.class);

            categoryDtos.add(categoryDto);
        }
        return categoryDtos;
    }
}
