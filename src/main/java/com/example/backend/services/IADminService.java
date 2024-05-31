package com.example.backend.services;

import com.example.backend.entities.Admin;

import java.util.List;

public interface IADminService {
    public Admin ajouterAdmin( Admin admin );
    Admin chercherAdminParId(long id);
    void supprimerAdmin(Admin admin);
    void supprimerAdminParID(long id);
    List<Admin> afficherTout();
    List<Admin> ajouterAdmins(List<Admin> admins);
    Admin modifierAdmin(Admin admin);

    Admin modifierNomAdmin(String nom , long id);


}
