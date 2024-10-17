package com.aliAwardsAPI.aliAwardsAPI.services;

import com.aliAwardsAPI.aliAwardsAPI.exceptions.ResourceNotFoundException;
import com.aliAwardsAPI.aliAwardsAPI.models.Category;
import com.aliAwardsAPI.aliAwardsAPI.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Category not found"));
    }
}
