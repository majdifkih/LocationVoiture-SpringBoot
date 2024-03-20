package com.example.tpjee.services.AccountService;


import com.example.tpjee.Entity.Security.Role;
import com.example.tpjee.Entity.Security.User;
import com.example.tpjee.repository.User.AppRoleRepository;
import com.example.tpjee.repository.User.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountSeviceImp implements AccountService {
    @Autowired
    private AppUserRepository appUserRepository;
    @Autowired
    private AppRoleRepository appRoleRepository;
    @Override
    public User addNewUser(User appUser) {
        return appUserRepository.save(appUser);
    }

    @Override
    public Role addNewRole(Role appRole) {
        return appRoleRepository.save(appRole);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
       User userapp=appUserRepository.findByUsername(username);
       Role userrole=appRoleRepository.findByName(roleName);
       userapp.getRoles().add(userrole);

    }

    @Override
    public User loadUserByUsername(String username) {
        return appUserRepository.findByUsername(username);
    }

    @Override
    public List<User> listUsers() {
        return appUserRepository.findAll();
    }
}
