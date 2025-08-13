package com.vls.login.controller;

import com.vls.login.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    private final UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public String validateUser(
            @RequestParam String username, @RequestParam String password
    ) {
        boolean isValid = userService.validateUser(username, password);
        return isValid ? "Login successful" : "Invalid credentials";
    }
}
