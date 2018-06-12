package com.github.uuidcode.jackson.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CoreUtil {
    protected static Logger logger = LoggerFactory.getLogger(CoreUtil.class);

    public static void printJson(Object object) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String json = objectMapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(object);

            if (logger.isDebugEnabled()) {
                logger.debug(">>> test json: {}", json);
            }
        } catch (Throwable t) {
            if (logger.isErrorEnabled()) {
                logger.error(">>> error CoreUtil printJson", t);
            }

            throw new RuntimeException(t);
        }
    }

    public static <T> T read(Class<T> clazz, String json) {
        try {
            return new ObjectMapper()
                .readerFor(clazz)
                .readValue(json);
        } catch (Throwable t) {
            if (logger.isErrorEnabled()) {
                logger.error(">>> error CoreUtil read", t);
            }

            throw new RuntimeException(t);
        }
    }
}
