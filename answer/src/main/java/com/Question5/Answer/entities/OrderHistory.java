package com.Question5.Answer.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
@Entity
@Table(name = "OrderHistory")
public class OrderHistory extends Base{
    @ManyToOne
    @JoinColumn(name = "totalPrice",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Cart totalPrice;
    @ManyToOne
    @JoinColumn(name = "amount",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Cart amount;
}
