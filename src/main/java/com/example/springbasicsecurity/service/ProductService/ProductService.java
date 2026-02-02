package com.example.springbasicsecurity.service.ProductService;

import com.example.springbasicsecurity.entity.UserInfo.UserInfo;
import com.example.springbasicsecurity.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserInfoRepository repository;
    public String addUser(UserInfo userInfo)
    {
        userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
        repository.save(userInfo);
        return "User is added to system";

    }
}
