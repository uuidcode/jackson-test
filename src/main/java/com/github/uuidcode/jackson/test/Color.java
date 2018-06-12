package com.github.uuidcode.jackson.test;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Color {
    RED, BLUE;

    static {
        BLUE.setName("b");
        RED.setName("r");
    }

    private String name;

    @JsonValue
    public String getName() {
        return this.name;
    }

    public Color setName(String name) {
        this.name = name;
        return this;
    }
}
