package com.aliAwardsAPI.aliAwardsAPI.models;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public class Vote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "voter_id")
    private User voter; // Usuario que vota

    @ManyToOne
    @JoinColumn(name = "nominee_id")
    private User nominee; // Usuario que recibe el voto

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category; // Categoría en la que se vota

    private LocalDateTime voteDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getVoter() {
        return voter;
    }

    public void setVoter(User voter) {
        this.voter = voter;
    }

    public User getNominee() {
        return nominee;
    }

    public void setNominee(User nominee) {
        this.nominee = nominee;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public LocalDateTime getVoteDate() {
        return voteDate;
    }

    public void setVoteDate(LocalDateTime voteDate) {
        this.voteDate = voteDate;
    }
}
