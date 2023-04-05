package com.siemens.springboot.usersSessionsManager.controller;


import com.siemens.springboot.usersSessionsManager.entity.UserEntity;
import com.siemens.springboot.usersSessionsManager.service.UserService;
import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
    @RequestMapping("/usersSessions")
public class UsersSessionsController {

    //Service autowiring
    @Autowired
    private UserService userService;

    //Main services
    @GetMapping("/data")
    public List<UserEntity> getAllData() {
        return userService.getUsers();
    }

    @GetMapping("/name/{name}")
    public List<UserEntity> getByName(@PathVariable String name){
        return userService.getUsersByName(name);
    }
}
