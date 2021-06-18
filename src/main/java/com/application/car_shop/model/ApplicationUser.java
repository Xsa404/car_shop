package com.application.car_shop.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Users")
public class ApplicationUser {

    @Id
    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false, length = 255)
    private String password;

    @Column
    private String apikey;

    @Column
    private String email;

    @OneToMany(
            targetEntity = ApplicationAuthority.class,
            mappedBy = "username",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER)
    private Set<ApplicationAuthority> authorities = new HashSet<>();


    public String getUsername() { return username; }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getApikey() { return apikey; }
    public void setApikey(String apikey) { this.apikey = apikey; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email;}

    public Set<ApplicationAuthority> getAuthorities() { return authorities; }
    public void addAuthority(ApplicationAuthority appAuthority) {
        this.authorities.add(appAuthority);
    }
    public void removeAuthority(ApplicationAuthority appAuthority) {
        this.authorities.remove(appAuthority);
    }

}