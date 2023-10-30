package com.api.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 

@RestController
@RequestMapping("/api")
public class GuardController {
    @GetMapping("/isAlive")
    public String isAllive() {
        return "test";
    }
}
