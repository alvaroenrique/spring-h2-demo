package com.bcpdemo.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EXCHANGE_RATE")
public class ExchangeRate {

    @Column(name = "id")
    @Id
    String id;

    @Column(name = "dolar_price")
    double dolarPrice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getDolarPrice() {
        return dolarPrice;
    }

    public void setDolarPrice(double dolarPrice) {
        this.dolarPrice = dolarPrice;
    }
}
