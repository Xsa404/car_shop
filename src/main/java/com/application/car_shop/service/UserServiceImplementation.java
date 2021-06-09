package com.application.car_shop.service;

//imports needed classes
import com.application.car_shop.exception.RecordNotFound;
import com.application.car_shop.exception.UsernameNotFound;
import com.application.car_shop.model.ApplicationAuthority;
import com.application.car_shop.model.ApplicationUser;
import com.application.car_shop.repository.UserRepository;
import com.application.car_shop.utilities.RandomStringGenerator;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;

@Service
public class UserServiceImplementation implements UserService {

    private final UserRepository userRepository;

    public UserServiceImplementation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Collection<ApplicationUser> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<ApplicationUser> getUser(String username) {
        return userRepository.findById(username);
    }

    @Override
    public boolean userExists(String username) {
        return userRepository.existsById(username);
    }

    // CRUD functionality

    @Override
    public String createUser(ApplicationUser user) {
        String randomString = RandomStringGenerator.generateAlphaNumeric(20);
        user.setApikey(randomString);
        ApplicationUser newUser = userRepository.save(user);
        return newUser.getUsername();
    }

    @Override
    public void deleteUser(String username) {
        userRepository.deleteById(username);
    }

    @Override
    public void updateUser(String username, ApplicationUser newUser) {
        if (!userRepository.existsById(username)) throw new RecordNotFound();
        ApplicationUser user = userRepository.findById(username).get();
        user.setPassword(newUser.getPassword());
        user.setEmail(newUser.getEmail());
        user.setApikey(newUser.getApikey());
        userRepository.save(user);
    }

    // Application Authority add or remove authority from user

    @Override
    public Set<ApplicationAuthority> getAuthorities(String username) {
        if (!userRepository.existsById(username)) throw new UsernameNotFound(username);
        ApplicationUser user = userRepository.findById(username).get();
        return user.getAuthorities();
    }

    @Override
    public void addAuthority(String username, String authority) {
        if (!userRepository.existsById(username)) throw new UsernameNotFound(username);
        ApplicationUser user = userRepository.findById(username).get();
        user.addAuthority(new ApplicationAuthority(username, authority));
        userRepository.save(user);
    }

    @Override
    public void removeAuthority(String username, String authority) {
        if (!userRepository.existsById(username)) throw new UsernameNotFound(username);
        ApplicationUser user = userRepository.findById(username).get();
        ApplicationAuthority appAuthorityToRemove = user.getAuthorities().stream().filter((a) -> a.getAuthority().equalsIgnoreCase(authority)).findAny().get();
        user.removeAuthority(appAuthorityToRemove);
        userRepository.save(user);
    }
}

