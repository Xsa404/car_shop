package com.application.car_shop.payload.response;

public class AuthenticationResponse {

    // jwt stands for JSON web token

    private final String jwt;

    //constructor for JSON web token

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    // getter required for JSON web token

    public String getJwt() {
        return jwt;
    }
}
