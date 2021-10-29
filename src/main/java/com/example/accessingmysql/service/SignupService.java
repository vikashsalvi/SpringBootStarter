package com.example.accessingmysql.service;

import com.example.accessingmysql.model.User;
import com.example.accessingmysql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignupService {

    @Autowired
    private UserRepository userRepository;
    public boolean signup(User user){
        if(userExists(user)) {
            return false;
        } else {
            userRepository.save(user);
            return true;
        }
    }

    public boolean userExists(User user){
        return userRepository.findByUserName(user.getUserName()).get().getUserName() != null;
    }
}
