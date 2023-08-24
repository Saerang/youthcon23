package com.hello.module.presentation;

import com.hello.module.application.UserService;
import com.hello.module.domain.User;
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
