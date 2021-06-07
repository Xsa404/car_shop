package com.application.car_shop.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.*;

@Entity
@Table(name = "Customers")
@RequestMapping(value = "/v1")

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 80)
    private String firstName;

    @Column(length = 80)
    private String lastName;

    @Column(length = 80)
    private String residence;

    @Column(length = 20)
    private String phoneNumber;

    @JsonIgnoreProperties("Customer")

    // constructor

    public Customer() {
    }

    public Customer(long customerId, String firstName, String lastName, String residence, String phoneNumber) {
        this.id = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.residence = residence;
        this.phoneNumber = phoneNumber;
    }

    // getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastName) {
        this.lastName = lastName;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
