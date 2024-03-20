package com.example.tpjee.repository;

import com.example.tpjee.Entity.Voiture;

import java.util.Date;

public interface VoitureRepositoryCostum {
    Voiture getVoitureByModele(String modele);
}
