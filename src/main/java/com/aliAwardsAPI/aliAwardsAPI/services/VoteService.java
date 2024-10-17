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
import java.util.List;
import java.util.Optional;

@Service
public class VoteService {

    @Autowired
    private VoteRepository voteRepository;

    public List<Vote> getAllVotes() {
        return voteRepository.findAll();
    }

    public Optional<Vote> getVoteById(Long id) {
        return voteRepository.findById(id);
    }

    public Vote createVote(Vote vote) {
        return voteRepository.save(vote);
    }

    public void deleteVote(Long id) {
        voteRepository.deleteById(id);
    }
}
