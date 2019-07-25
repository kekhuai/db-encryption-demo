package com.example.dbencryptiondemo.service;

import java.util.Collection;
import com.example.dbencryptiondemo.domain.User;

public interface UserService {

  void createUser(User newUser);

  Collection<User> getAllUsers();

}
