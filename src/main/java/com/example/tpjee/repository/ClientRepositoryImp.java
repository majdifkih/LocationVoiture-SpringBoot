package com.example.tpjee.repository;

import com.example.tpjee.Entity.Client;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

public class ClientRepositoryImp implements ClientRepositoryCostum{

    @PersistenceContext
    private EntityManager entityManager;



    @Transactional
    public Client getClientByNom(String nom) {
        Query query = entityManager.createNativeQuery("SELECT * FROM Client c WHERE c.nom LIKE ?", Client.class);
        query.setParameter(1, nom + "%");
        return (Client) query.getSingleResult();
    }
}
