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

}
