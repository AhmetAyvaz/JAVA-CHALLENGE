package com.Question5.Answer.services;

import com.Question5.Answer.entities.Cart;
import com.Question5.Answer.entities.Order;
import com.Question5.Answer.entities.Product;
import com.Question5.Answer.respositories.ICart;
import com.Question5.Answer.respositories.IOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AddProductToCart {
    @Autowired
    private ICart iCart;
    @Autowired
    private IOrder iOrder;
    private boolean isRun = false;
    private int count = 0;
    public void addProductToCart(Product product){
        if(product.getStockAmount() != 0){
            Order orderId = iOrder.findByProductId(product.getId());
            Cart cartId = iCart.findByOrderId(orderId);
            iCart.save(cartId);
            product.setStockAmount(product.getStockAmount() - 1);
            isRun = true;
            count += 1;
        }
    }
    public void totalPriceCalculater(Product product){
        if(this.isRun){
            product.setPrice(product.getPrice() * this.count) ;
        }
    }
}
