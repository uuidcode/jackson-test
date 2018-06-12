package com.github.uuidcode.jackson.test;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BeanWithCreator {
    private int id;
    private String name;

    public String getName() {
        return this.name;
    }

    public BeanWithCreator setName(String name) {
        this.name = name;
        return this;
    }

    @JsonIgnore
    public int getId() {
        return this.id;
    }

    public BeanWithCreator setId(int id) {
        this.id = id;
        return this;
    }

    public static BeanWithCreator of() {
        return new BeanWithCreator();
    }

    public BeanWithCreator() {
    }

    @JsonCreator
    public BeanWithCreator(@JsonProperty("id") int id,
        @JsonProperty("theName") String name) {
        this.id = id;
        this.name = name;
    }
}
