package com.accessingmysql.service;

import com.accessingmysql.model.User;
import com.accessingmysql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class ProfileService {
    @Autowired
    private UserRepository userRepository;

    public User getProfile(String userName){
        return userRepository.findByUserName(userName).get();
    }
}
