package com.aliAwardsAPI.aliAwardsAPI.services;

import com.aliAwardsAPI.aliAwardsAPI.exceptions.ResourceNotFoundException;
import com.aliAwardsAPI.aliAwardsAPI.models.Category;
import com.aliAwardsAPI.aliAwardsAPI.models.User;
import com.aliAwardsAPI.aliAwardsAPI.models.Vote;
import com.aliAwardsAPI.aliAwardsAPI.repositories.CategoryRepository;
import com.aliAwardsAPI.aliAwardsAPI.repositories.UserRepository;
import com.aliAwardsAPI.aliAwardsAPI.repositories.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class VoteService {

    @Autowired
    private VoteRepository voteRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    public Vote castVote(Long voterId, Long nomineeId, Long categoryId) {
        User voter = userRepository.findById(voterId).orElseThrow(() -> new ResourceNotFoundException("Voter not found"));
        User nominee = userRepository.findById(nomineeId).orElseThrow(() -> new ResourceNotFoundException("Nominee not found"));
        Category category = categoryRepository.findById(categoryId).orElseThrow(() -> new ResourceNotFoundException("Category not found"));

        Vote vote = new Vote();
        vote.setVoter(voter);
        vote.setNominee(nominee);
        vote.setCategory(category);
        vote.setVoteDate(LocalDateTime.now());

        return voteRepository.save(vote);
    }
}
