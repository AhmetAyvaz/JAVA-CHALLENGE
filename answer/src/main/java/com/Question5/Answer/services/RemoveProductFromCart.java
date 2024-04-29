package com.Question5.Answer.services;

import com.Question5.Answer.entities.Cart;
import com.Question5.Answer.entities.Order;
import com.Question5.Answer.entities.Product;
import com.Question5.Answer.respositories.ICart;
import com.Question5.Answer.respositories.IOrder;
import com.Question5.Answer.respositories.IProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class RemoveProductFromCart {
    @Autowired
    private ICart iCart;
    @Autowired
    private IProduct iProduct;
    @Autowired
    private IOrder iOrder;
    public void removeProductToCart(Product product){
        Order orderId = iOrder.findByProductId(product.getId());
        Cart cartId = iCart.findByOrderId(orderId);
        iCart.delete(cartId);
    }
}
