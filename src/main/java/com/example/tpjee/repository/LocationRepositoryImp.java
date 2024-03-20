package com.example.tpjee.repository;

import com.example.tpjee.Entity.Client;
import com.example.tpjee.Entity.Location;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

import java.util.Date;

public class LocationRepositoryImp implements LocationRepositoryCostum{
    @PersistenceContext
    private EntityManager entityManager;



    @Transactional
    public Location getLocationByClient(long client_id) {
        Query query = entityManager.createNativeQuery("SELECT * FROM Location l WHERE l.client_id LIKE ?", Location.class);
        query.setParameter(1, client_id + "%");
        return (Location) query.getSingleResult();
    }
}
