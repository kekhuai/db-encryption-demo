package com.example.dbencryptiondemo.resource;

import java.util.Collection;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.dbencryptiondemo.domain.User;
import com.example.dbencryptiondemo.service.UserService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "/api/v1/user")
@AllArgsConstructor
public class UserResource {

  private final UserService userService;

  @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
  public void createUser() {
    User newUser = User.builder().firstName("Natthaphon").lastName("Phanit").username("myusername").password("mypassword").build();
    userService.createUser(newUser);
  }

  @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
  public Collection<User> getAllUsers() {
    return userService.getAllUsers();
  }

}
