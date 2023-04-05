package com.siemens.springboot.usersSessionsManager.service;


import com.siemens.springboot.usersSessionsManager.entity.UserEntity;
import com.siemens.springboot.usersSessionsManager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<UserEntity> getUsersByName(String name);
    public List<UserEntity> getUsers();
}
