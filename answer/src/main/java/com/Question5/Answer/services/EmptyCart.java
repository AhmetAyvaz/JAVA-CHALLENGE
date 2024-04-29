package com.Question5.Answer.services;

import com.Question5.Answer.entities.Cart;
import com.Question5.Answer.respositories.ICart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmptyCart {
    @Autowired
    private ICart iCart;
    public void emptyCart(Cart cart){
        iCart.delete(cart);
    }
}
