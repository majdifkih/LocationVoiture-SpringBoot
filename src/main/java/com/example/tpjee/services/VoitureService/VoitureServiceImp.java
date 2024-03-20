package com.example.tpjee.services.VoitureService;


import com.example.tpjee.Entity.Voiture;
import com.example.tpjee.repository.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VoitureServiceImp implements VoitureService{

    @Autowired
    private VoitureRepository voitureRepository;

    @Override
    public List<Voiture> getAllVoiture(){
        return voitureRepository.findAll();
    }
    @Override
    public Voiture createVoiture(Voiture Voiture){
        return voitureRepository.save(Voiture);
    }
    @Override
    public Voiture getVoitureByID(Long id){
        return voitureRepository.findById(id).get();
    }
    @Override
    public Voiture updateVoiture(Voiture Voiture){
        return voitureRepository.saveAndFlush(Voiture);
    }
    @Override
    public void deleteVoiture(Long id){
        voitureRepository.deleteById(id);
    }

}
