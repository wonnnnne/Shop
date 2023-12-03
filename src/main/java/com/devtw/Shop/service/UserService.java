package com.devtw.Shop.service;

import com.devtw.Shop.domain.User;
import com.devtw.Shop.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    public List<User> getUserList() {

        return userRepository.findAll();
    }
}
