package com.github.uuidcode.jackson.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ColorTest {
    protected static Logger logger = LoggerFactory.getLogger(ColorTest.class);

    @Test
    public void test() throws Exception {
        String json = new ObjectMapper()
            .writerWithDefaultPrettyPrinter()
            .writeValueAsString(Color.RED);

        if (logger.isDebugEnabled()) {
            logger.debug(">>> test color: {}", json);
        }
    }
}