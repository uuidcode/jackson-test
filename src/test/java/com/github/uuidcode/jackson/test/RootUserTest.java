package com.github.uuidcode.jackson.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class RootUserTest {
    protected static Logger logger = LoggerFactory.getLogger(RootUserTest.class);

    @Test
    public void test() throws JsonProcessingException {
        RootUser rootUser = RootUser.of()
            .setName("Hello")
            .setRegDatetime(new Date());

        String json = new ObjectMapper()
            .enable(SerializationFeature.WRAP_ROOT_VALUE)
            .writerWithDefaultPrettyPrinter()
            .writeValueAsString(rootUser);

        if (logger.isDebugEnabled()) {
            logger.debug(">>> test json: {}", json);
        }
    }
}