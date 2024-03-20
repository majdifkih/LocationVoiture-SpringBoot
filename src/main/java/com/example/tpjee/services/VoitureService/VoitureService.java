package com.example.tpjee.services.VoitureService;

import com.example.tpjee.Entity.Voiture;

import java.util.List;

public interface VoitureService {

    public List<Voiture> getAllVoiture();

    public Voiture createVoiture(Voiture Voiture);

    public Voiture getVoitureByID(Long id);

    public Voiture updateVoiture(Voiture Voiture);

    public void deleteVoiture(Long id);
}
