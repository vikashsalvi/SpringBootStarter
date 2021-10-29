package com.example.accessingmysql.service;

import com.example.accessingmysql.model.User;
import com.example.accessingmysql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.*;

@Service
public class LoginService {

    @Autowired
    private UserRepository userRepository;

    public boolean validate(User user){
        User fetchedUser = userRepository.findByUserName(user.getUserName()).get();
        return fetchedUser.getSecret().equals(user.getSecret());
    }
}
