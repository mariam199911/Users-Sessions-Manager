package com.siemens.springboot.usersSessionsManager.controller;

import com.siemens.springboot.usersSessionsManager.entity.DynamicEntity;
import com.siemens.springboot.usersSessionsManager.service.DynamicEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dynamic-entities")
public class DynamicEntityController {
    @Autowired
    private DynamicEntityService service;

    @GetMapping
    public List<DynamicEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public DynamicEntity getById(@PathVariable String id) {
        return service.getById(id);
    }

    @PostMapping
    public DynamicEntity create(@RequestBody DynamicEntity entity) {
        return service.create(entity);
    }

    @PutMapping("/{id}")
    public DynamicEntity update(@PathVariable String id, @RequestBody DynamicEntity entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable String id) {
        return service.delete(id);
    }
}
