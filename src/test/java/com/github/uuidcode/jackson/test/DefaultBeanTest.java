package com.github.uuidcode.jackson.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DefaultBeanTest {
    protected static Logger logger = LoggerFactory.getLogger(DefaultBeanTest.class);

    @Test
    public void test() throws Exception {
        DefaultBean defaultBean = DefaultBean.of()
            .setName("Test")
            .add("key1", "value1")
            .add("key2", "value2");

        String json = new ObjectMapper()
            .writerWithDefaultPrettyPrinter()
            .writeValueAsString(defaultBean);

        if (logger.isDebugEnabled()) {
            logger.debug(">>> test json: {}", json);
        }
    }
}