package com.example.backend.restController;

import com.example.backend.entities.Admin;
import com.example.backend.services.IADminService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@org.springframework.web.bind.annotation.RestController

@AllArgsConstructor
@RequestMapping("/Admin-rest-controller")
public class AdminRestController {


    IADminService adminService;
        @PostMapping(path ="/admin")
        public Admin ajouterAdmin(@RequestBody Admin admin ){
            return adminService.ajouterAdmin(admin);
        }
        @GetMapping("/admin/{id-admin}")
       Admin chercherAdminParId(@PathVariable("id-admin") long id){
            return adminService. chercherAdminParId(id);
        }
        @DeleteMapping("/admins")
        void supprimerAdmin(@RequestBody Admin admin){
            adminService.supprimerAdmin(admin);
        }
        @DeleteMapping("/admin/{id-admin}")
        void supprimerAdminParID( @PathVariable("id-foyer") long id){
            adminService.supprimerAdminParID(id);
        }
        @GetMapping("/admins")
        List<Admin> afficherTout(){
            return adminService.afficherTout();
        }
        @PostMapping("/admins")
        List<Admin> ajouterAdmins( @RequestBody  List<Admin> admins){
            return adminService.ajouterAdmins(admins);
        }
        @PutMapping("/admin")
        Admin modifierAdmin( @RequestBody  Admin admin){
            return adminService.modifierAdmin(admin);
        }
        @PutMapping("/admin/{id-admin}/{nom-admin}")
        Admin modifierNomAdmin(@PathVariable("nom-admin") String nom , @PathVariable("id-admin") long id){
            return adminService.modifierNomAdmin(nom,id);
        }

}
