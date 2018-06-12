package com.github.uuidcode.jackson.test;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"name", "privateTitle", "publicTitle"})
public class DefaultBean {
    private String privateTitle = "Hello";
    public String publicTitle = "Hello";
    private String name;
    private Map<String, String> properties = new HashMap<>();
    
    public Map<String, String> getProperties() {
        return this.properties;
    }
    
    public DefaultBean setProperties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public DefaultBean setName(String name) {
        this.name = name;
        return this;
    }

    public static DefaultBean of() {
        return new DefaultBean();
    }

    public DefaultBean add(String key, String value) {
        this.properties.put(key, value);
        return this;
    }

    @JsonGetter("privateTitle")
    public String tittle() {
        return this.privateTitle;
    }
}
