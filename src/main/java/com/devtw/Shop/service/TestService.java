package com.devtw.Shop.service;

import com.devtw.Shop.domain.User;
import com.devtw.Shop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getUserList() {

        return userRepository.findAll();
    }

}
