package com.github.uuidcode.jackson.test;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonRootName("user")
public class RootUser {
    private String name;
    @JsonSerialize(using = DefaultDateSerializer.class)
    private Date regDatetime;
    
    public Date getRegDatetime() {
        return this.regDatetime;
    }
    
    public RootUser setRegDatetime(Date regDatetime) {
        this.regDatetime = regDatetime;
        return this;
    }
    
    public String getName() {
        return this.name;
    }

    public RootUser setName(String name) {
        this.name = name;
        return this;
    }

    public static RootUser of() {
        return new RootUser();
    }
}
