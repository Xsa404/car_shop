package com.application.car_shop.exception;

import java.io.Serial;

public class UsernameNotFound extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public UsernameNotFound(String username) {
        super("Cannot find user " + username + " Please try again!");
    }
}
