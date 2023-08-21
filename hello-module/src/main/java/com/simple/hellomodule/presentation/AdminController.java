package com.simple.hellomodule.presentation;

import com.simple.hellomodule.application.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AdminController {
    private final UserService userService;

    public AdminController(UserService userService) {
        this.userService = userService;
    }

    @DeleteMapping("/admin/user/{id}")
    public String deleteUser(@PathVariable Long id, Model model) {
        userService.deleteUserById(id);
        model.addAttribute("message", "User with ID " + id + " was deleted.");
        return "admin";
    }
}
