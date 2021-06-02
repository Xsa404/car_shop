package com.application.car_shop.payload.request;

public class AuthenticationRequest {

    private String username; //create username
    private String password; //create password

    //needed for request

    public AuthenticationRequest() {
    }

    // create constructor

    public AuthenticationRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters and Setters with Return statements for username and password

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}
