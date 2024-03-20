package com.example.tpjee.services.ModeleService;

import com.example.tpjee.Entity.Modele;

import java.util.List;

public interface ModeleService {



    List<Modele> getAllModele();

    Modele createModele(Modele modele);

    Modele getModeleByID(Long id);

    Modele updateModele(Modele modele);

    void deleteModele(Long id);
}
