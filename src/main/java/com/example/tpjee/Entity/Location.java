package com.example.tpjee.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "date_debut")
    private Date dateDebut;
    @Column(name = "date_retour")
    private Date dateRetour;
    @Column(name = "prix_jour")
    private Integer prixJour;
    @Column(name = "prix")
    private Integer prix;


    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
    @ManyToOne
    @JoinColumn(name = "voiture_id")
    private Voiture voiture;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateRetour() {
        return dateRetour;
    }

    public void setDateRetour(Date dateRetour) {
        this.dateRetour = dateRetour;
    }

    public Integer getPrixJour() {
        return prixJour;
    }

    public void setPrixJour(Integer prixJour) {
        this.prixJour = prixJour;
    }

    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Voiture getVoiture() {
        return voiture;
    }

    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }
}
