package com.example.tpjee.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Agent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom")
    private String nom;
    @JsonIgnore
    @OneToMany(mappedBy = "agent")
    private List<Voiture> voitures = new ArrayList<>();
}
