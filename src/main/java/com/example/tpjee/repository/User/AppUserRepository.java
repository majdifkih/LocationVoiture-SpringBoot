package com.example.tpjee.repository.User;


import com.example.tpjee.Entity.Security.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AppUserRepository extends JpaRepository<User,Long> {

    User findByUsername(String username);


    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
