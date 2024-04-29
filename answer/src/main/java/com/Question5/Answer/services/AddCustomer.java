package com.Question5.Answer.services;

import com.Question5.Answer.entities.Customer;
import com.Question5.Answer.respositories.ICustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AddCustomer {
    @Autowired
    private ICustomer iCustomer;
    public void addCustomer(Customer customer){
        iCustomer.save(customer);
    }
}
