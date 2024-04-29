package com.Question5.Answer.services;

import com.Question5.Answer.respositories.ICart;
import com.Question5.Answer.respositories.ICustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderHistory{
    @Autowired
    private ICustomer iCustomer;
    @Autowired
    private ICart iCart;
    public OrderHistory(){

    }
}
