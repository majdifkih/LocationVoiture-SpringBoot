package com.example.tpjee.repository.Modele;


import com.example.tpjee.Entity.Modele;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

public class ModeleRepositoryImp {
    @PersistenceContext
    private EntityManager entityManager;



    @Transactional
    public Modele getClientByNom(String nomModele) {
        Query query = entityManager.createNativeQuery("SELECT * FROM Modele M WHERE M.nomModele LIKE ?", Modele.class);
        query.setParameter(1, nomModele + "%");
        return (Modele) query.getSingleResult();
    }
}
