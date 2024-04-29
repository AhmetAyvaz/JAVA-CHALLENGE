package com.Question5.Answer.respositories;

import com.Question5.Answer.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICustomer extends JpaRepository<Customer,Long> {
    List<Customer> findByCartId(Long customerId);
}
