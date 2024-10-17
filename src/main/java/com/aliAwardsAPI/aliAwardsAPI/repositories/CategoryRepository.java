package com.aliAwardsAPI.aliAwardsAPI.repositories;

import com.aliAwardsAPI.aliAwardsAPI.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
