package com.aliAwardsAPI.aliAwardsAPI.controllers;

import com.aliAwardsAPI.aliAwardsAPI.models.Vote;
import com.aliAwardsAPI.aliAwardsAPI.services.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/votes")
public class VoteController {

    @Autowired
    private VoteService voteService;

    @PostMapping
    public Vote castVote(@RequestParam Long voterId, @RequestParam Long nomineeId, @RequestParam Long categoryId) {
        return voteService.castVote(voterId, nomineeId, categoryId);
    }
}
