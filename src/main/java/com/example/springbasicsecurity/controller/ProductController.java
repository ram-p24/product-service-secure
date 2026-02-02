package com.example.springbasicsecurity.controller;

import com.example.springbasicsecurity.entity.UserInfo.UserInfo;
import com.example.springbasicsecurity.service.ProductService.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService service;
    @GetMapping("/welcome")
    public String welcome()
    {
        return "welcome the endpoint is not secure";
    }

    @PostMapping("/new")
    public String addNewUser(@RequestBody UserInfo userInfo)
    {
        return service.addUser(userInfo);
    }

}
