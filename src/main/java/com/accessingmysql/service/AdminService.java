package com.accessingmysql.service;

import com.accessingmysql.model.Admin;
import com.accessingmysql.model.User;
import com.accessingmysql.repository.AdminRepository;
import com.accessingmysql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    public Admin getAdmin(String userName){
        return adminRepository.findByUserName(userName).get();
    }

    public List<String> getAllProducts(String username) {
        return adminRepository.finBydAdminProducts(username).get();
    }
}
