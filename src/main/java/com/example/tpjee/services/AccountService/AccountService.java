package com.example.tpjee.services.AccountService;


import com.example.tpjee.Entity.Security.Role;
import com.example.tpjee.Entity.Security.User;

import java.util.List;

public interface AccountService {
    User addNewUser(User appUser);
    Role addNewRole(Role appRole);
    void addRoleToUser(String username,String roleName);
    User loadUserByUsername(String username);
    List<User> listUsers();
}
