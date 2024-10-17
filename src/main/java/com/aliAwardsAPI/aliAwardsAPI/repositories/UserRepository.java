package com.aliAwardsAPI.aliAwardsAPI.repositories;

import com.aliAwardsAPI.aliAwardsAPI.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
