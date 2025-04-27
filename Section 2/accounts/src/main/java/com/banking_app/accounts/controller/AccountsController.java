package com.banking_app.accounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {

    @GetMapping("/greet")
    public String sayHello(){
        return "Hello from Abhay";
    }
}
