package com.github.uuidcode.jackson.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

public class BeanWithCreatorTest {
    protected static Logger logger = LoggerFactory.getLogger(BeanWithCreatorTest.class);

    @Test
    public void test() throws Exception {
        BeanWithCreator beanWithCreator = BeanWithCreator.of()
            .setId(100)
            .setName("Test");

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writerWithDefaultPrettyPrinter()
            .writeValueAsString(beanWithCreator);

        if (logger.isDebugEnabled()) {
            logger.debug(">>> test json: {}", json);
        }
    }

    @Test
    public void constructorTest() {
        String json = "{\"id\":1,\"theName\":\"My bean\"}";
        BeanWithCreator beanWithCreator = CoreUtil.read(BeanWithCreator.class, json);
        CoreUtil.printJson(beanWithCreator);
    }
}