package com.devtw.Shop.controller;

import com.devtw.Shop.domain.User;
import com.devtw.Shop.service.TestService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.aspectj.weaver.ast.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor //차이점 검색
public class TestController {

    private final TestService testService;

    @GetMapping(value = "api/user")
    public List<User> getUserList() {
        return testService.getUserList();
    }
}
