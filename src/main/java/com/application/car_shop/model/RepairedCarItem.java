package com.application.car_shop.model;

import javax.persistence.*;

@Entity
@Table(name = "Repair") // Create table named "Repair"
public class RepairedCarItem {

    //table properties

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 80)
    private String itemName;

    @Column(length = 80)
    private String priceInEuro;

    @Column(length = 80)
    private String operation;

    @Column(length = 80)
    private String status;

    // creates constructor

    public RepairedCarItem() {

    }

    public RepairedCarItem(long stock_id, String itemName, String Price, String operation, String status) {
        this.id = stock_id;
        this.itemName = itemName;
        this.priceInEuro = Price;
        this.operation = operation;
        this.status = status;

    }

    // Getters and Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getPriceInEuro() {
        return priceInEuro;
    }

    public void setPriceInEuro(String priceInEuro) {
        this.priceInEuro = priceInEuro;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
