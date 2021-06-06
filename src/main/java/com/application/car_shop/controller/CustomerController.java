package com.application.car_shop.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.*;

@Entity
@Table(name = "Customers")
@RequestMapping(value = "/v1")

public class CustomerController {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 80)
    private String firstname;

    @Column(length = 80)
    private String lastname;

    @Column(length = 80)
    private String residence;

    @Column(length = 20)
    private String phonenumber;

    @JsonIgnoreProperties("Customer")

    // constructor
    public CustomerController() {
    }

    public CustomerController(long customer_id, String firstname, String lastname, String residence, String phonenumber) {
        this.id = customer_id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.residence = residence;
        this.phonenumber = phonenumber;
    }

    // getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
