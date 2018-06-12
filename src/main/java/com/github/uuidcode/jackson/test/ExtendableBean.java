package com.github.uuidcode.jackson.test;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

public class ExtendableBean {
    private String privateTitle = "Hello";
    public String publicTitle = "Hello";
    private String name;
    private Map<String, String> properties = new HashMap<>();

    @JsonAnyGetter
    public Map<String, String> getProperties() {
        return this.properties;
    }
    
    public ExtendableBean setProperties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public ExtendableBean setName(String name) {
        this.name = name;
        return this;
    }

    public static ExtendableBean of() {
        return new ExtendableBean();
    }

    public ExtendableBean add(String key, String value) {
        this.properties.put(key, value);
        return this;
    }
}
