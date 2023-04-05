package com.siemens.springboot.usersSessionsManager.service;

import com.siemens.springboot.usersSessionsManager.entity.DynamicEntity;
import com.siemens.springboot.usersSessionsManager.repository.DynamicEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DynamicEntityService {
    @Autowired
    private DynamicEntityRepository repository;

    public List<DynamicEntity> getAll() {
        return repository.findAll();
    }

    public DynamicEntity getById(String id) {
        return repository.findById(id).orElse(null);
    }

    public DynamicEntity create(DynamicEntity entity) {
        return repository.save(entity);
    }

    public DynamicEntity update(String id, DynamicEntity entity) {
        DynamicEntity existingEntity = getById(id);
        if (existingEntity != null) {
            existingEntity.setProperties(entity.getProperties());
            return repository.save(existingEntity);
        }
        return null;
    }

    public boolean delete(String id) {
        DynamicEntity existingEntity = getById(id);
        if (existingEntity != null) {
            repository.delete(existingEntity);
            return true;
        }
        return false;
    }
}
