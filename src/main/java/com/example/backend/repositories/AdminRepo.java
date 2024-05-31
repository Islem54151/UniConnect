package com.example.backend.repositories;

import com.example.backend.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin,Long> {
}
