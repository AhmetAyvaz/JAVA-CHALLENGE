package com.Question5.Answer.respositories;

import com.Question5.Answer.entities.Cart;
import com.Question5.Answer.entities.Customer;
import com.Question5.Answer.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ICart extends JpaRepository<Cart,Long> {
    Cart findByOrderId(Order orderId);
    Cart findByOrderId(Customer orderId);
}
