package com.Question5.Answer.services;

import com.Question5.Answer.entities.Order;
import com.Question5.Answer.respositories.IOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PlaceOrder {
    @Autowired
    private IOrder iOrder;
    public void placeOrder(Order order){
        iOrder.save(order);
    }
}
