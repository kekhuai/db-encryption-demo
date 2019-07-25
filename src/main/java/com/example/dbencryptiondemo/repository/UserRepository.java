package com.example.dbencryptiondemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.dbencryptiondemo.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
