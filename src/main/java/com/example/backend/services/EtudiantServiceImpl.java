package com.example.backend.services;

import com.example.backend.entities.Etudiant;

import com.example.backend.repositories.EtudiantRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class EtudiantServiceImpl implements IEtudiantService {
    EtudiantRepo etudiantRepo;
    @Override
    public Etudiant ajouterEtudiant(Etudiant etudiant) {
        return etudiantRepo.save(etudiant);
    }

    @Override
    public Etudiant supprimerEtudiant(Etudiant etudiant) {
        etudiantRepo.delete(etudiant);
        return etudiantRepo.findById(etudiant.getIdEtudiant()).orElse(null);
    }

    @Override
    public Etudiant chercherEtudiantParId(long idEtudiant) {
        return etudiantRepo.findById(idEtudiant).orElse(null);
    }

    @Override
    public void supprimerEtudiantParId(long idEtudiant) {
    etudiantRepo.deleteById(idEtudiant);
    }

    @Override
    public List<Etudiant> afficherTout() {
        return etudiantRepo.findAll();
    }

    @Override
    public List<Etudiant> ajouterEtudiants(List<Etudiant> etudiants) {
        return etudiantRepo.saveAll(etudiants);
    }

    @Override
    public Etudiant modifierEtudiant(Etudiant etudiant) {
        return etudiantRepo.save(etudiant);
    }

    @Override
    public Etudiant modifierNomEtudiant(String nom, Long idEtudiant) {
     Etudiant etudiant=etudiantRepo.findById(idEtudiant).orElse(null);
       if(etudiant!=null)
           etudiant.setNom(nom);
        return etudiantRepo.save(etudiant);
    }
}
