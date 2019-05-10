package com.demo.cartservice.controllers;

import com.demo.cartservice.models.Product;
import com.demo.cartservice.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {

    @Autowired
    CartService cartService;

    @GetMapping("/cart/addProduct")
    public void addItemToCart(String username,Product product) {


    }
}
