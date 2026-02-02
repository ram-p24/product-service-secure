package com.example.springbasicsecurity.repository;

import com.example.springbasicsecurity.entity.UserInfo.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfo,Integer> {
}
