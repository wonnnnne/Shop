package com.devtw.Shop.controller;

import com.devtw.Shop.domain.User;
import com.devtw.Shop.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping(value = "user/get_user_list")
    public List<User> getUserList() {
        return userService.getUserList();
    }
}
