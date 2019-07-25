package com.example.dbencryptiondemo.service;

import java.util.Collection;
import org.springframework.stereotype.Service;
import com.example.dbencryptiondemo.domain.User;
import com.example.dbencryptiondemo.repository.UserRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;

  @Override
  public void createUser(User newUser) {
    userRepository.save(newUser);
  }

  @Override
  public Collection<User> getAllUsers() {
    return userRepository.findAll();
  }

}
