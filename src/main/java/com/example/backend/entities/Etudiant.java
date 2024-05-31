package com.example.backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idEtudiant;
    @Column(length = 8,name = "identifiant")
    String cin;
    String nom;
    String prenom;
    String email;
    String motDePasse;
    LocalDate dateBirth;
    @Enumerated(EnumType.STRING)
    Role RoleClub;
}
