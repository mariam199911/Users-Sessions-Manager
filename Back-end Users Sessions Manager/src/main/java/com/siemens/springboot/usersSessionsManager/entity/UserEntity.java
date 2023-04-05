package com.siemens.springboot.usersSessionsManager.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class UserEntity {
    @Id
    private String id;
    private String name;
    private int age;

}