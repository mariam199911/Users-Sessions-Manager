package com.siemens.springboot.usersSessionsManager.repository;

import com.siemens.springboot.usersSessionsManager.entity.DynamicEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DynamicEntityRepository extends MongoRepository<DynamicEntity, String> {
}