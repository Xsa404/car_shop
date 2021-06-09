package com.application.car_shop.controller;

import com.application.car_shop.exception.RecordNotFound;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(value = RecordNotFound.class)
    public ResponseEntity<Object> exception(RecordNotFound exception) {
        return ResponseEntity.notFound().build();
    }
}
