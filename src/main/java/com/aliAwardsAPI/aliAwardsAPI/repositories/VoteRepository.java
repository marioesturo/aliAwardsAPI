package com.aliAwardsAPI.aliAwardsAPI.repositories;

import com.aliAwardsAPI.aliAwardsAPI.models.Category;
import com.aliAwardsAPI.aliAwardsAPI.models.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    List<Vote> findByCategory(Category category);
}
