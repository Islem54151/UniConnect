package com.example.backend.services;

import com.example.backend.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    Etudiant ajouterEtudiant(Etudiant etudiant);
    Etudiant supprimerEtudiant(Etudiant etudiant);
    Etudiant chercherEtudiantParId(long idEtudiant);
    void supprimerEtudiantParId (long idEtudiant);
    List<Etudiant> afficherTout();
    List<Etudiant> ajouterEtudiants(List<Etudiant> etudiants);

    Etudiant modifierEtudiant(Etudiant etudiant);
    Etudiant modifierNomEtudiant(String nom,Long idEtudiant);

}
