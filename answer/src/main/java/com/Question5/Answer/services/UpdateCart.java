package com.Question5.Answer.services;

import com.Question5.Answer.entities.Cart;
import com.Question5.Answer.respositories.ICart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UpdateCart {
    @Autowired
    private ICart iCart;
    public void updateCart(Cart cart){
        Cart exitingCart = iCart.findById(cart.getId()).orElse(null);
        if(exitingCart != null){
            cart.setOrderId(cart.getOrderId());
            cart.setAmount(cart.getAmount());
            cart.setTotalPrice(cart.getTotalPrice());
        }
    }
}
