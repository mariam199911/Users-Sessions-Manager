package com.siemens.springboot.usersSessionsManager.service.Impl;

import com.siemens.springboot.usersSessionsManager.entity.UserEntity;
import com.siemens.springboot.usersSessionsManager.repository.UserRepository;
import com.siemens.springboot.usersSessionsManager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserEntity> getUsersByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public List<UserEntity> getUsers() {
        return userRepository.findAll();
    }


}
