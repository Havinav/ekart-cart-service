package com.ekart.cart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    @GetMapping("/cartmsg")
    public  String getCartMsg(){
        return "Welcome cart service";
    }

}
