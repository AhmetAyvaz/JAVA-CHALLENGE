package com.Question5.Answer.services;

import com.Question5.Answer.entities.Cart;
import com.Question5.Answer.entities.Customer;
import com.Question5.Answer.respositories.ICart;
import com.Question5.Answer.respositories.ICustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class GetAllOrdersForCustomer {
    @Autowired
    private ICustomer iCustomer;
    @Autowired
    private ICart iCart;
    public List<Cart> getAllOrdersForCustomer(Customer customer){
        List<Customer> cartIds = iCustomer.findByCartId(customer.getId());
        List<Cart> orderIds = null;
        for(Customer i:cartIds){
            orderIds.add(iCart.findByOrderId(i));
        }
        return orderIds;
    }
}
