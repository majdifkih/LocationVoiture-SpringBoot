package com.example.tpjee.services.ModeleService;

import com.example.tpjee.Entity.Modele;
import com.example.tpjee.repository.Modele.ModeleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModeleServiceImp implements ModeleService {

    @Autowired
    private ModeleRepository modeleRepository;

    @Override
    public List<Modele> getAllModele(){
        return modeleRepository.findAll();
    }
    @Override
    public Modele createModele(Modele Modele){
        return modeleRepository.save(Modele);
    }
    @Override
    public Modele getModeleByID(Long id){
        return modeleRepository.findById(id).get();
    }
    @Override
    public Modele updateModele(Modele Modele){
        return modeleRepository.saveAndFlush(Modele);
    }
    @Override
    public void deleteModele(Long id){
        modeleRepository.deleteById(id);
    }


}
