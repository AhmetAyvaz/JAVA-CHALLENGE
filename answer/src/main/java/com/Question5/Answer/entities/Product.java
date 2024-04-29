package com.Question5.Answer.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name = "Product")
public class Product extends Base{
    @Column(name = "name",length = 50)
    private String name;
    @Column(name = "price")
    private Integer price;
    @Column(name = "stockAmount")
    private Integer stockAmount;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public Integer getStockAmount() {
        return stockAmount;
    }
    public void setStockAmount(Integer stockAmount) {
        this.stockAmount = stockAmount;
    }
}
