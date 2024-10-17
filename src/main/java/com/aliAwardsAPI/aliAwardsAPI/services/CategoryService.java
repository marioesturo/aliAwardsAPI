package com.aliAwardsAPI.aliAwardsAPI.services;

import com.aliAwardsAPI.aliAwardsAPI.exceptions.ResourceNotFoundException;
import com.aliAwardsAPI.aliAwardsAPI.models.Category;
import com.aliAwardsAPI.aliAwardsAPI.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Optional<Category> getCategoryById(Long id) {
        return categoryRepository.findById(id);
    }

    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    public Optional<Category> updateCategory(Long id, Category category) {
        if (categoryRepository.existsById(id)) {
            category.setId(id);
            return Optional.of(categoryRepository.save(category));
        }
        return Optional.empty();
    }

    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}
