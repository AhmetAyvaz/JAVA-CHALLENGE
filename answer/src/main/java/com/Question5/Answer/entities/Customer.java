package com.Question5.Answer.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
@Entity
@Table(name = "Customer")
public class Customer extends Base{
    @Column(name = "name",length = 50)
    private String name;
    @ManyToOne
    @JoinColumn(name = "cartId",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Cart cartId;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Cart getCartId() {
        return cartId;
    }
    public void setCartId(Cart cartId) {
        this.cartId = cartId;
    }
}
