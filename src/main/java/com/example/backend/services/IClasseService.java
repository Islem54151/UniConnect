package com.example.backend.services;

import com.example.backend.entities.Classe;

import java.util.List;

public interface IClasseService {
    Classe ajouterClasse(Classe classe);
    Classe supprimerClasse(Classe classe);
    Classe chercherClasseParId(long idClasse);
    void supprimerClasseParId (long idClasse);
    List<Classe> afficherTout();
    List<Classe> ajouterClasses(List<Classe> classes);

    Classe modifierClasse(Classe classe);
    Classe modifierNomClasse(String nom,Long idClasse);
}
