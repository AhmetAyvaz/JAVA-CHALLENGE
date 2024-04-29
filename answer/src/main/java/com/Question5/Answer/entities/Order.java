package com.Question5.Answer.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "Order")
public class Order extends Base{
    @ManyToOne
    @JoinColumn(name = "productId")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Product productId;
    public void setProductId(Product productId) {
        this.productId = productId;
    }
}
