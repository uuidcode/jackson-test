package com.github.uuidcode.jackson.test;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class DefaultDateSerializer extends StdSerializer<Date> {
    private static SimpleDateFormat format =
        new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    public DefaultDateSerializer() {
        this(null);
    }

    public DefaultDateSerializer(Class<Date> clazz) {
        super(clazz);
    }

    @Override
    public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(format.format(date));
    }
}
