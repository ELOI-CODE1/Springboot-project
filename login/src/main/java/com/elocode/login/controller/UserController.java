package com.elocode.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/login")
    public String loginUser(){
        return "login";
    }
}
