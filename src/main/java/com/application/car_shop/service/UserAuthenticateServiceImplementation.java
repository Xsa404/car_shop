package com.application.car_shop.service;


import com.application.car_shop.config.CustomUserDetailService;
import com.application.car_shop.payload.request.AuthenticationRequest;
import com.application.car_shop.payload.response.AuthenticationResponse;
import com.application.car_shop.utilities.JwtUtil;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserAuthenticateServiceImplementation implements UserAuthenticateService {

    private final AuthenticationManager authenticationManager;

    private final CustomUserDetailService userDetailsService;

    final
    JwtUtil jwtUtl;

    public UserAuthenticateServiceImplementation(AuthenticationManager authenticationManager, CustomUserDetailService userDetailsService, JwtUtil jwtUtl) {
        this.authenticationManager = authenticationManager;
        this.userDetailsService = userDetailsService;
        this.jwtUtl = jwtUtl;
    }

    public AuthenticationResponse authenticateUser(AuthenticationRequest authenticationRequest) {

        String username = authenticationRequest.getUsername();
        String password = authenticationRequest.getPassword();

        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(username, password)
            );
        }
        catch (BadCredentialsException ex) {
            throw new UsernameNotFoundException("Incorrect username or password");
        }

        final UserDetails userDetails = userDetailsService.loadUserByUsername(username);

        final String jwt = jwtUtl.generateToken(userDetails);

        return new AuthenticationResponse(jwt);
    }

    @Override
    public AuthenticationResponse authenticatedUser(AuthenticationRequest autenicationRequest) {
        return null;
    }
}

