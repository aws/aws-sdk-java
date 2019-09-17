/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.util.json;

import com.amazonaws.util.TimestampFormat;
import com.amazonaws.protocol.json.SdkJsonGenerator;
import com.amazonaws.protocol.json.StructuredJsonGenerator;
import com.amazonaws.util.Base64;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SdkJsonGeneratorTest {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    /**
     * Delta for comparing double values
     */
    private static final double DELTA = .0001;

    private StructuredJsonGenerator jsonGenerator;

    @Before
    public void setup() {
        jsonGenerator = new SdkJsonGenerator(new JsonFactory(), "application/json");
    }

    @Test
    public void simpleObject_AllPrimitiveTypes() throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeFieldName("stringProp").writeValue("stringVal");
        jsonGenerator.writeFieldName("integralProp").writeValue(42);
        jsonGenerator.writeFieldName("booleanProp").writeValue(true);
        jsonGenerator.writeFieldName("doubleProp").writeValue(123.456);
        jsonGenerator.writeEndObject();
        JsonNode node = toJsonNode();
        assertTrue(node.isObject());
        assertEquals("stringVal", node.get("stringProp").textValue());
        assertEquals(42, node.get("integralProp").longValue());
        assertEquals(true, node.get("booleanProp").booleanValue());
        assertEquals(123.456, node.get("doubleProp").doubleValue(), DELTA);
    }

    @Test
    public void simpleObject_WithLongProperty_PreservesLongValue() throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeFieldName("longProp").writeValue(Long.MAX_VALUE);
        jsonGenerator.writeEndObject();
        JsonNode node = toJsonNode();
        assertEquals(Long.MAX_VALUE, node.get("longProp").longValue());
    }

    @Test
    public void simpleObject_WithBinaryData_WritesAsBase64() throws IOException {
        byte[] data = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        jsonGenerator.writeStartObject();
        jsonGenerator.writeFieldName("binaryProp").writeValue(ByteBuffer.wrap(data));
        jsonGenerator.writeEndObject();
        JsonNode node = toJsonNode();
        assertEquals(Base64.encodeAsString(data), node.get("binaryProp").textValue());
    }

    @Test
    public void simpleObject_WithServiceDate() throws IOException {
        Date date = new Date(123456);
        jsonGenerator.writeStartObject();
        jsonGenerator.writeFieldName("dateProp").writeValue(date, TimestampFormat.UNIX_TIMESTAMP);
        jsonGenerator.writeEndObject();
        JsonNode node = toJsonNode();
        assertEquals(123.456, node.get("dateProp").doubleValue(), DELTA);
    }

    @Test
    public void stringArray() throws IOException {
        jsonGenerator.writeStartArray();
        jsonGenerator.writeValue("valOne");
        jsonGenerator.writeValue("valTwo");
        jsonGenerator.writeValue("valThree");
        jsonGenerator.writeEndArray();
        JsonNode node = toJsonNode();
        assertTrue(node.isArray());
        assertEquals("valOne", node.get(0).textValue());
        assertEquals("valTwo", node.get(1).textValue());
        assertEquals("valThree", node.get(2).textValue());
    }

    @Test
    public void complexArray() throws IOException {
        jsonGenerator.writeStartArray();
        jsonGenerator.writeStartObject();
        jsonGenerator.writeFieldName("nestedProp").writeValue("nestedVal");
        jsonGenerator.writeEndObject();
        jsonGenerator.writeEndArray();
        JsonNode node = toJsonNode();
        assertEquals("nestedVal", node.get(0).get("nestedProp").textValue());
    }

    @Test
    public void unclosedObject_AutoClosesOnClose() throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeFieldName("stringProp").writeValue("stringVal");
        JsonNode node = toJsonNode();
        assertTrue(node.isObject());
    }

    @Test
    public void unclosedArray_AutoClosesOnClose() throws IOException {
        jsonGenerator.writeStartArray();
        jsonGenerator.writeValue("valOne");
        jsonGenerator.writeValue("valTwo");
        jsonGenerator.writeValue("valThree");
        JsonNode node = toJsonNode();
        assertTrue(node.isArray());
        assertEquals(3, node.size());
    }

    private JsonNode toJsonNode() throws IOException {
        return MAPPER.readTree(jsonGenerator.getBytes());
    }

}
