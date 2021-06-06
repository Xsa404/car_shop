package com.application.car_shop.service;

import com.application.car_shop.model.ApplicationAuthority;
import com.application.car_shop.model.ApplicationUser;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;

public interface UserService {

    public abstract String createUser(ApplicationUser user);
    public abstract void updateUser(String username, ApplicationUser user);
    public abstract void deleteUser(String username);
    public abstract Collection<ApplicationUser> getUsers();


    public abstract Optional<ApplicationUser> getUser(String username);
    public abstract boolean userExists(String username);


    public abstract Set<ApplicationAuthority> getAuthorities(String username);
    public abstract void addAuthority(String username, String authority);
    public abstract void removeAuthority(String username, String authority);

}
