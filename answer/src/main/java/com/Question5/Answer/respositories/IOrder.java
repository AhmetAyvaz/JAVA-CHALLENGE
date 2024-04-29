package com.Question5.Answer.respositories;

import com.Question5.Answer.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IOrder extends JpaRepository<Order,Long> {
    Order findByProductId(Long orderId);
}
