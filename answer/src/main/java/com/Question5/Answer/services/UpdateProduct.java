package com.Question5.Answer.services;

import com.Question5.Answer.entities.Product;
import com.Question5.Answer.respositories.IProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UpdateProduct {
    @Autowired
    private IProduct iProduct;
    public void updateProduct(Product product){
        Product exitingProduct = iProduct.findById(product.getId()).orElse(null);
        if(exitingProduct != null){
            product.setName(product.getName());
            product.setPrice(product.getPrice());
            product.setStockAmount(product.getStockAmount());
        }
    }
}
