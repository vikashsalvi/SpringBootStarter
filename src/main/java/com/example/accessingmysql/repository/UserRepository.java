package com.example.accessingmysql.repository;

import com.example.accessingmysql.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {
    @Override
    Optional<User> findById(Integer integer);
}