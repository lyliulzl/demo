package com.example.demo.controller;

import com.example.demo.dao.UserRepository;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/allUsers")
    public List test(){
        List<User>userList=userRepository.findAll();
        System.out.println(userList.get(0).getName());
        System.out.println(userRepository.findAll().size());
        System.out.println("#################");
        return userRepository.findAll();
    }
}
