package com.example.backend.services;

import com.example.backend.entities.Admin;
import com.example.backend.repositories.AdminRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class AdminServiceImpl implements IADminService {


        AdminRepo adminRepo;


        public Admin ajouterAdmin(Admin admin) {
            return adminRepo.save(admin);
        }

        public Admin chercherAdminParId(long id) {
            return adminRepo.findById(id).orElse(null);

        }

        @Override
        public void supprimerAdmin(Admin admin) {
            adminRepo.delete(admin);
        }

        @Override
        public void supprimerAdminParID(long id) {
            adminRepo.deleteById(id);
        }

        @Override
        public List<Admin> afficherTout() {
            return adminRepo.findAll();
        }

        @Override
        public List<Admin> ajouterAdmins(List<Admin> admins) {
            return adminRepo.saveAll(admins);
        }

        @Override
        public Admin modifierAdmin(Admin admin) {
            return adminRepo.save(admin);
        }

        @Override
        public Admin modifierNomAdmin(String nom, long id) {
            Admin admin = adminRepo.findById(id).orElse(null);
            if (admin != null)
                admin.setNomAdmin(nom);
            return adminRepo.save(admin);
        }



    }


