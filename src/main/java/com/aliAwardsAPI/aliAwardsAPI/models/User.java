package com.aliAwardsAPI.aliAwardsAPI.models;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String lastaname;

    private String email;

    private String code;

    @OneToMany(mappedBy = "voter")  // Relación con la propiedad 'voter' en Vote
    private List<Vote> votes;  // Lista de votos emitidos por el usuario

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastaname() {
        return lastaname;
    }

    public void setLastaname(String lastaname) {
        this.lastaname = lastaname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Vote> getVotes() {
        return votes;
    }

    public void setVotes(List<Vote> votes) {
        this.votes = votes;
    }
}
