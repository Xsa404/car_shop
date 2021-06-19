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
    private String productNumber;

    // constructors
    public Supply() {
    }

    public Supply(long supplyId, String itemName, String priceInEuro, String storageLocation, String productNumber) {
        this.id = supplyId;
        this.itemName = itemName;
        this.priceInEuro = priceInEuro;
        this.storageLocation = storageLocation;
        this.productNumber = productNumber;
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

    public void setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }
}
