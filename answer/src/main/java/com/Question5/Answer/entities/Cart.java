package com.Question5.Answer.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
@Entity
@Table(name = "Cart")
public class Cart extends Base{
    @ManyToOne
    @JoinColumn(name = "orderId",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Order orderId;
    @Column(name = "amount")
    private Integer amount;
    @Column(name = "totalPrice")
    private Integer totalPrice;
    public Order getOrderId() {
        return orderId;
    }
    public void setOrderId(Order orderId) {
        this.orderId = orderId;
    }
    public Integer getAmount() {
        return amount;
    }
    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    public Integer getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }
}
