package com.example.tpjee.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
public class Modele {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idModele;

    @Column(name = "nom_modele")
    private String nomModele;
    @JsonIgnore
    @OneToMany(mappedBy = "modele")
    private List<Voiture> voitures = new ArrayList<>();

    public Long getId() {
        return idModele;
    }
    public void setId(long id) {
        this.idModele = id;
    }
    public String getNom () {
        return nomModele;
    }
    public void setNom (String nomModele) {
        this.nomModele = nomModele;
    }


}
