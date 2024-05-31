package com.example.backend.restController;

import com.example.backend.entities.Etudiant;
import com.example.backend.services.IEtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant-rest-controller/")
public class EtudiantRestController {
    IEtudiantService etudiantService;

    @PostMapping(path = "/etudiant")
    Etudiant ajouterEtudiant(@RequestBody Etudiant etudiant){
        return etudiantService.ajouterEtudiant(etudiant);
    }
    @DeleteMapping("/etudiant")
    Etudiant supprimerEtudiant(@RequestBody Etudiant etudiant){
        return etudiantService.supprimerEtudiant(etudiant);
    }

    @GetMapping("/foyer/{id-foyer}")
    Etudiant chercherFoyerParId(@PathVariable("id-foyer") long idEtudiant){
        return etudiantService.chercherEtudiantParId(idEtudiant);
    }

    @DeleteMapping("/etudiant/{id-etudiant}")
    void supprimerFoyerParId (@PathVariable("id-etudiant") long idEtudiant){
        etudiantService.supprimerEtudiantParId(idEtudiant);
    }
    @GetMapping("/etudiants")
    List<Etudiant> afficherTout(){
        return etudiantService.afficherTout();
    }
    @PostMapping("/etudiants")
    List<Etudiant> ajouterEtudiants(@RequestBody List<Etudiant> etudiants){
        return etudiantService.ajouterEtudiants(etudiants);
    }
    @PutMapping("/etudiant")
    Etudiant modifierEtudiant(@RequestBody Etudiant etudiant){
        return etudiantService.modifierEtudiant(etudiant);
    }
    @PutMapping("/foyer/{id-etudiant}/{nom}")
    Etudiant modifierNomEtudiant(@PathVariable("nom") String nom,@PathVariable("id-etudiant") Long idEtudiant){
        return etudiantService.modifierNomEtudiant(nom,idEtudiant);
    }
}
