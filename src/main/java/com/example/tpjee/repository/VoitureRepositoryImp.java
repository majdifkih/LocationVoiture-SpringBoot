package com.example.tpjee.repository;

import com.example.tpjee.Entity.Client;
import com.example.tpjee.Entity.Voiture;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

public class VoitureRepositoryImp {
    @PersistenceContext
    private EntityManager entityManager;



    @Transactional
    public Voiture getVoitureByModel(String modele) {
        Query query = entityManager.createNativeQuery("SELECT * FROM Voiture v WHERE v.modele LIKE ?", Voiture.class);
        query.setParameter(1, modele + "%");
        return (Voiture) query.getSingleResult();
    }
}
