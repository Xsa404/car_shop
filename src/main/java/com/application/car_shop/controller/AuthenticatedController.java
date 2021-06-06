package com.application.car_shop.controller;

import com.application.car_shop.payload.request.AuthenticationRequest;
import com.application.car_shop.payload.response.AuthenticationResponse;
import com.application.car_shop.service.UserAuthenticateService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping(value = "/v1")
public class AuthenticatedController {


    UserAuthenticateService userAuthenticateService;

    @GetMapping(value = "/authenticated")
    public ResponseEntity<Object> authenticated(Authentication authentication, Principal principal) {
        return ResponseEntity.ok().body(principal);
    }

    @PostMapping(value = "/authenticate")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {

        AuthenticationResponse authenticationResponse = userAuthenticateService.authenticatedUser(authenticationRequest);

        return ResponseEntity.ok(authenticationResponse);
    }

}

