package com.accessingmysql.repository;

import com.accessingmysql.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {
    @Override
    Optional<User> findById(Integer integer);

    Optional<User> findByUserName(String username);
}