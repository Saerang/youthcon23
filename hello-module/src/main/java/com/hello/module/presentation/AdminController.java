package com.hello.module.presentation;

import com.hello.module.application.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AdminController {
    private final UserService userService;

    public AdminController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/admin")
    public String showAdmin(Model model) {
        model.addAttribute("message", "This is the admin page.");
        return "admin";
    }

    @DeleteMapping("/admin/users/{id}")
    public String deleteUser(@PathVariable Long id, Model model) {
        userService.deleteUserById(id);
        model.addAttribute("message", "User with ID " + id + " was deleted.");
        return "admin";
    }
}
