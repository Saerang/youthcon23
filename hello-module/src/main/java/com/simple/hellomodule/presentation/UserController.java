package com.simple.hellomodule.presentation;

import com.simple.hellomodule.application.UserService;
import com.simple.hellomodule.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("users/{id}")
    public User findUser(@PathVariable Long id) {
        return userService.findUserById(id);
    }
}
