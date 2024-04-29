package com.Question5.Answer.services;

import com.Question5.Answer.entities.Order;
import com.Question5.Answer.entities.Product;
import com.Question5.Answer.respositories.IOrder;
import com.Question5.Answer.respositories.IProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class GetOrderForCode {
    @Autowired
    private IOrder iOrder;
    @Autowired
    private IProduct iProduct;
    @Autowired
    private PlaceOrder placeOrder;
    Order order = new Order();
    public void getOrderForCode(Product product){
        Product exitingProduct = iProduct.findById(product.getId()).orElse(null);
        if(exitingProduct != null){
            order.setProductId(exitingProduct);
            placeOrder.placeOrder(order);
        }
    }
}
