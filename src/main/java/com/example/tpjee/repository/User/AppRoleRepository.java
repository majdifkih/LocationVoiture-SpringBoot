package com.example.tpjee.repository.User;


import com.example.tpjee.Entity.Security.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<Role,Long> {
    Role findByName(String name);
}
