package com.application.car_shop.model;

import javax.persistence.*;

@Entity
@Table(name = "supply")
public class Supply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 80)
    private String itemName;

    @Column(length = 80)
    private String priceInEuro;

    @Column(length = 80)
    private String storageLocation;

    @Column(length = 20)
    private String phoneNumber;

    // constructors
    public Supply() {
    }

    public Supply(long stockId, String itemName, String priceInEuro, String storageLocation, String phoneNumber) {
        this.id = stockId;
        this.itemName = itemName;
        this.priceInEuro = priceInEuro;
        this.storageLocation = storageLocation;
        this.phoneNumber = phoneNumber;
    }

    // getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getItemName() { return itemName; }

    public void setItemName(String itemName) {
        this.itemName = itemName;}

    public String getPriceInEuro() {
        return priceInEuro;
    }

    public void setPriceInEuro(String priceInEuro) {
        this.priceInEuro = priceInEuro;
    }

    public String getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(String storage_location) {
        this.storageLocation = storage_location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
