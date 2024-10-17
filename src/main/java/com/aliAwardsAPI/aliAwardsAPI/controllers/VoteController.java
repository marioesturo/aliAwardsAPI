package com.aliAwardsAPI.aliAwardsAPI.controllers;

import com.aliAwardsAPI.aliAwardsAPI.models.Vote;
import com.aliAwardsAPI.aliAwardsAPI.services.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/votes")
public class VoteController {

    @Autowired
    private VoteService voteService;

    @GetMapping
    public List<Vote> getAllVotes() {
        return voteService.getAllVotes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vote> getVoteById(@PathVariable Long id) {
        return voteService.getVoteById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Vote createVote(@RequestBody Vote vote) {
        return voteService.createVote(vote);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVote(@PathVariable Long id) {
        voteService.deleteVote(id);
        return ResponseEntity.noContent().build();
    }
}
