package com.Question5.Answer.respositories;

import com.Question5.Answer.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IProduct extends JpaRepository<Product,Long> {
}
