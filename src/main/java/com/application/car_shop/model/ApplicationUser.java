package com.application.car_shop.model;

import com.google.common.collect.Table;
import org.h2.table.Column;
import org.hibernate.mapping.OneToMany;
import org.springframework.data.annotation.Id;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class AppUser {

    @Id
    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false, length = 255)
    private String password;

    @Column(nullable = false)
    private boolean enabled = true;

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
    public boolean isEnabled() { return enabled;}
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
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
