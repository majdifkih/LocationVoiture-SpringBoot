package com.example.tpjee.services.AccountService;

import com.example.tpjee.Entity.AppRole;
import com.example.tpjee.Entity.AppUser;
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
    public AppUser addNewUser(AppUser appUser) {
        return appUserRepository.save(appUser);
    }

    @Override
    public AppRole addNewRole(AppRole appRole) {
        return appRoleRepository.save(appRole);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
       AppUser userapp=appUserRepository.findByUsername(username);
       AppRole userrole=appRoleRepository.findByRoleName(roleName);
       userapp.getAppRoles().add(userrole);

    }

    @Override
    public AppUser loadUserByUsername(String username) {
        return appUserRepository.findByUsername(username);
    }

    @Override
    public List<AppUser> listUsers() {
        return appUserRepository.findAll();
    }
}
