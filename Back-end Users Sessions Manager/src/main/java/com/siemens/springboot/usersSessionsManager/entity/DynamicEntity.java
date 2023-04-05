package com.siemens.springboot.usersSessionsManager.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
import java.util.Map;

@Document(collection = "users")
public class DynamicEntity {
    private Map<String, Object> properties;

    public DynamicEntity() {
        properties = new HashMap<>();
    }

    public void set(String name, Object value) {
        properties.put(name, value);
    }

    public Object get(String name) {
        return properties.get(name);
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }
}
