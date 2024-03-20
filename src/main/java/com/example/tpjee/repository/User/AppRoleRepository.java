package com.example.tpjee.repository.User;

import com.example.tpjee.Entity.AppRole;
import com.example.tpjee.Entity.Security.ERole;
import com.example.tpjee.Entity.Security.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AppRoleRepository extends JpaRepository<AppRole,Long> {
    Optional<Role> findByName(ERole name);
}
