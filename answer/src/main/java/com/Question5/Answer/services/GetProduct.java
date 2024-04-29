package com.Question5.Answer.services;

import com.Question5.Answer.entities.Product;
import com.Question5.Answer.respositories.IProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class GetProduct {
    @Autowired
    private IProduct iProduct;
    public Product getProduct(Product product){
        return iProduct.findById(product.getId()).orElse(null);
    }
}
