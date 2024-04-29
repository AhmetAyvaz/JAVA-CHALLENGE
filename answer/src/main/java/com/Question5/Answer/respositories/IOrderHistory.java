package com.Question5.Answer.respositories;

import com.Question5.Answer.entities.Order;
import com.Question5.Answer.entities.OrderHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IOrderHistory extends JpaRepository<Order,Long> {
}
