package com.example.tpjee.RestController;

import com.example.tpjee.Entity.Modele;
import com.example.tpjee.Entity.Voiture;
import com.example.tpjee.services.ModeleService.ModeleServiceImp;
import com.example.tpjee.services.VoitureService.VoitureServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/voiture")
public class VoitureRestController {
    @Autowired
    private VoitureServiceImp voitureServiceImp;
    private ModeleServiceImp modeleServiceImp;
    @PostMapping("/voituresave")
    public Voiture saveVoiture(@RequestBody Voiture voiture){
        return voitureServiceImp.createVoiture(voiture);
    }
    @GetMapping("/listvoiture")
    public List<Voiture> listeVoiture(){
        return voitureServiceImp.getAllVoiture();
    }

    @GetMapping("/onevoiture/{id}")
    public Voiture getOneVoiture(@PathVariable long id){
        return voitureServiceImp.getVoitureByID(id);
    }
    @PutMapping("/updatevoiture/{id}")
    public Voiture updatemodele(@PathVariable long id,@RequestBody Voiture voiture){
        Voiture v = voitureServiceImp.getVoitureByID(id);
        if(v!=null) {
            voiture.setId(id);
            return voitureServiceImp.updateVoiture(voiture);
        }else {
            throw new RuntimeException("failed");
        }
    }
    @DeleteMapping("/deletevoiture/{id}")
    public HashMap<String,String> deleteVoiture(@PathVariable long id){
        HashMap<String,String> message= new HashMap<>();
        if(voitureServiceImp.getVoitureByID(id)==null){
            message.put("etat","voiture not found");
            return message;
        }
        try{
            voitureServiceImp.deleteVoiture(id);
            message.put("etat","voiture deleted");
            return message;
        }catch (Exception e){
            message.put("etat","voiture not deleted");
            return message;
        }
    }

    @PostMapping("/save/{idmodele}")
    public Voiture saveVoiture(@RequestBody Voiture voiture,@PathVariable long idmodele ){
        Modele m1= modeleServiceImp.getModeleByID(idmodele);
        voiture.setModele(m1);
        return voitureServiceImp.createVoiture(voiture);
    }
}
