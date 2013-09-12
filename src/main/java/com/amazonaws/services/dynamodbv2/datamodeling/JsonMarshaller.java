/*
 * Copyright 2011-2013 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.datamodeling;

import java.io.StringReader;
import java.io.StringWriter;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.MappingJsonFactory;

/**
 * Simple JSON marshaller that uses Jackson mapper. It has all the limitations
 * of that library, the documentation of which is available here:
 * http://docs.codehaus.org/display/JACKSON/Home
 */
public class JsonMarshaller<T extends Object> implements DynamoDBMarshaller<T> {

    @Override
    public String marshall(T obj) {
        try {
            JsonFactory jsonFactory = new MappingJsonFactory();
            StringWriter output = new StringWriter();
            JsonGenerator jsonGenerator = jsonFactory.createJsonGenerator(output);
            jsonGenerator.writeObject(obj);
            return output.toString();
        } catch ( Exception e ) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public T unmarshall(Class<T> clazz, String obj) {
        try {
            JsonFactory jsonFactory = new MappingJsonFactory();
            JsonParser jsonParser = jsonFactory.createJsonParser(new StringReader(obj));
            return jsonParser.readValueAs(clazz);
        } catch ( Exception e ) {
            throw new RuntimeException(e);
        }
    }

}
