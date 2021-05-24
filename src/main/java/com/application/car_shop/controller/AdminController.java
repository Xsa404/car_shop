package com.application.car_shop.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1") // version 1
public class AdminController {

    @GetMapping("/ADMIN")
    ResponseEntity<Object> getAdmin() {
        return ResponseEntity.ok().body("This feature is for ADMIN only!"); // return text
    }
}
