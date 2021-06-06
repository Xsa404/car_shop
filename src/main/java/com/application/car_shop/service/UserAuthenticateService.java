package com.application.car_shop.service;

import com.application.car_shop.payload.request.AuthenticationRequest;
import com.application.car_shop.payload.response.AuthenticationResponse;

public interface UserAuthenticateService {

    public AuthenticationResponse authenticatedUser(AuthenticationRequest autenicationRequest);

}
    /* uses AuthenticationResponse and AuthenticationRequest
       by using import statement so the user service can authenticate the user */