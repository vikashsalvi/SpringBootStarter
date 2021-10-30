package com.accessingmysql.service;

import com.accessingmysql.model.User;
import com.accessingmysql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private UserRepository userRepository;

    public boolean validate(User user){
        User fetchedUser = userRepository.findByUserName(user.getUserName()).get();
        return fetchedUser.getSecret().equals(user.getSecret());
    }
}
