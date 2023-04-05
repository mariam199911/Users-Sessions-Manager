package com.siemens.springboot.usersSessionsManager.repository;

import com.siemens.springboot.usersSessionsManager.entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<UserEntity, String> {
    List<UserEntity> findByName(String name);
}