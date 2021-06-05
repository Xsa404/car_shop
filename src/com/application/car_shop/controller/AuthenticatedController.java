package com.application.car_shop.controller;

import com.application.car_shop.payload.request.AuthenticationRequest;
import com.application.car_shop.payload.response.AuthenticationResponse;
import com.application.car_shop.service.UserAuthenticateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1") // version 1
public class AuthenticatedController {

    @Autowired // uses UserAuthenticateService from Service Package
    UserAuthenticateService userAuthenticateService;

    @GetMapping(value = "/user_authenticated")
    public void createToken (@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
        //Creates ResponseEntity and throws Exception if needed
        AuthenticationResponse authenticationResponse = userAuthenticateService.authenticateUser(AuthenticationRequest);
    }
}
