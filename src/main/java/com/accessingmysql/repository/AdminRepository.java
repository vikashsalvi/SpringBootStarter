package com.accessingmysql.repository;

import com.accessingmysql.model.Admin;
import com.accessingmysql.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface AdminRepository extends CrudRepository<Admin, Integer> {


    Optional<Admin> findByUserName(String userName);

    Optional<List<String>> finBydAdminProducts(String username);
}
