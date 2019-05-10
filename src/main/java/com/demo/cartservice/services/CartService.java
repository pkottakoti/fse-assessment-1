package com.demo.cartservice.services;

import com.demo.cartservice.models.Cart;
import com.demo.cartservice.models.Product;
import com.demo.cartservice.repositories.CartRepo;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {
    @Repository
    CartRepo cartRepo;

    public void addItemToCart(String name,Product product){
        Cart cart=cartRepo.findByName(name);
        List<Product> items=new ArrayList<Product>();
        items.add(product);
        cart.setItems(items);
        cart.setName(name);
        if(cart==null){
            cartRepo.save(cart);
        }

    }

}
