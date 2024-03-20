package com.example.tpjee.Controller;

import com.example.tpjee.Entity.Modele;
import com.example.tpjee.services.ModeleService.ModeleServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ModeleController {
    @Autowired
    private ModeleServiceImp modeleServiceImp;
    @GetMapping("/addModele")
    String addModele(Model model){
        Modele modeles= new Modele();
        model.addAttribute("ModeleForm", modeles);
        return "new_modele";
    }
    @PostMapping("/savemodele")
    String saveModele(@ModelAttribute("ModeleForm" ) Modele modele){
        modeleServiceImp.createModele(modele);
        return "redirect:/allmodeles";

    }





    @RequestMapping("/allmodeles")
    public String listModeles(Model model){
        List<Modele> listModele = modeleServiceImp.getAllModele();
        model.addAttribute("listModeles", listModele);
        return "liste_modeles";
    }
    @GetMapping("editmodeles/{id}")
    public String showUpdateFormModele(@PathVariable("id") long id, Model model){
        Modele modele = modeleServiceImp.getModeleByID(id);
        model.addAttribute("modele", modele);
        return "update_modele";
    }
    @PostMapping("updatemodele/{id}")
    public String updateModele(@PathVariable("id") long id, Modele modele, BindingResult result, Model model){
        if (result.hasErrors()){
            modele.setId(id);
            return "update_modele";
        }
        modeleServiceImp.createModele(modele);
        model.addAttribute("listModeles", modeleServiceImp.getAllModele());
        return "redirect:/allmodeles";
    }
    @GetMapping("deletemodeles/{id}")
    public String deleteModele(@PathVariable("id") long id){
        modeleServiceImp.deleteModele(id);

        return "redirect:/allmodeles";
    }

}

