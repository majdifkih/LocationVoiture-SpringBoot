package com.example.tpjee.RestController;

import com.example.tpjee.Entity.Modele;
import com.example.tpjee.services.ModeleService.ModeleServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/modele")
public class ModelerestController {
    @Autowired
    private ModeleServiceImp modeleServiceImp;
    @PostMapping("/modelesave")
    public Modele saveModele(@RequestBody Modele modele){
        return modeleServiceImp.createModele(modele);
    }
    @GetMapping("/listmodele")
    public List<Modele>  listeModele(){
        return modeleServiceImp.getAllModele();
    }

    @GetMapping("/onemodele/{id}")
    public Modele getOneModele(@PathVariable long id){
       return modeleServiceImp.getModeleByID(id);
    }
    @PutMapping("/updatemodele/{id}")
    public Modele updatemodele(@PathVariable long id,@RequestBody Modele modele){
       Modele m = modeleServiceImp.getModeleByID(id);
       if(m!=null) {
           modele.setId(id);
           return modeleServiceImp.updateModele(modele);
       }else {
           throw new RuntimeException("failed");
       }
    }
    @DeleteMapping("/deletemodele/{id}")
    public HashMap<String,String> deleteModele(@PathVariable long id){
        HashMap<String,String> message= new HashMap<>();
        if(modeleServiceImp.getModeleByID(id)==null){
            message.put("etat","modele not found");
            return message;
        }
        try{
            modeleServiceImp.deleteModele(id);
            message.put("etat","modele deleted");
            return message;
        }catch (Exception e){
            message.put("etat","modele not deleted");
            return message;
        }
    }
}
