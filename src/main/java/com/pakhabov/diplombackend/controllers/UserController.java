package com.pakhabov.diplombackend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class UserController {


    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

}

