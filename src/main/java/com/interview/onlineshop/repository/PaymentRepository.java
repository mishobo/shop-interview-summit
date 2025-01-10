package com.interview.onlineshop.repository;

import com.interview.onlineshop.model.entities.ShopItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<ShopItems, Integer> {
}
