package com.ensakh.sitegestion.service.impl;

import com.ensakh.sitegestion.entity.Login;
import com.ensakh.sitegestion.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





@Service
public class LoginService {
    @Autowired
    private LoginRepository repo;

    public Login login(String username, String password) {
        Login user = repo.findByUsernameAndPassword(username, password);
        return user;
    }

}
