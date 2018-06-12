package com.github.uuidcode.jackson.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ExtendableBeanTest {
    protected static Logger logger = LoggerFactory.getLogger(ExtendableBeanTest.class);

    @Test
    public void test() throws Exception {
        ExtendableBean extendableBean = ExtendableBean.of()
            .setName("Test")
            .add("key1", "value1")
            .add("key2", "value2");

        String json = new ObjectMapper()
            .writerWithDefaultPrettyPrinter()
            .writeValueAsString(extendableBean);

        if (logger.isDebugEnabled()) {
            logger.debug(">>> test json: {}", json);
        }
    }
}