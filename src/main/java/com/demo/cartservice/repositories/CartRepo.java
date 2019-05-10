package com.demo.cartservice.repositories;

import com.demo.cartservice.models.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepo extends JpaRepository<Cart,Integer> {
}
