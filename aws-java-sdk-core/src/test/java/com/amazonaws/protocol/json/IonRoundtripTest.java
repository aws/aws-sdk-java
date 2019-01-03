/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.protocol.json;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.amazonaws.util.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import software.amazon.ion.IonException;
import software.amazon.ion.IonSystem;
import software.amazon.ion.system.IonBinaryWriterBuilder;
import software.amazon.ion.system.IonSystemBuilder;

import com.fasterxml.jackson.core.JsonToken;

/**
 * Tests that data written by the {@link SdkIonGenerator} is correctly read
 * by the {@link IonParser}. For additional stand-alone testing of the
 * {@link IonParser}, see {@link IonParserTest}.
 */
@RunWith(Parameterized.class)
public class IonRoundtripTest {
    
    private enum Data {
        NULL {
            @Override
            public void generate(SdkIonGenerator generator) {
                // Is this the only way to write a null value?
                generator.writeValue((String)null);
                generator.writeValue((BigInteger)null);
                generator.writeValue((BigDecimal)null);
                generator.writeValue((Date)null, null);
                generator.writeValue((ByteBuffer)null);
            }

            @Override
            public void parse(IonParser parser) throws IOException {
                assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
                assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
                assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
                assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
                assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
            }
        },
        BOOL {
            @Override
            public void generate(SdkIonGenerator generator) {
                generator.writeValue(true);
                generator.writeValue(false);
            }

            @Override
            public void parse(IonParser parser) throws IOException {
                assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
                assertEquals(true, parser.getBooleanValue());
                assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
                assertEquals(false, parser.getBooleanValue());
            }
        },
        SHORT {
            @Override
            public void generate(SdkIonGenerator generator) {
                generator.writeValue(0);
                // There's no writeValue(byte) method, but there is writeValue(short)...
                generator.writeValue(Byte.MAX_VALUE);
                generator.writeValue(Byte.MIN_VALUE);
                generator.writeValue(Short.MAX_VALUE);
                generator.writeValue(Short.MIN_VALUE);
            }

            @Override
            public void parse(IonParser parser) throws IOException {
                assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
                assertEquals(0, parser.getIntValue());
                assertEquals(0, parser.getLongValue());
                assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
                assertEquals(Byte.MAX_VALUE, parser.getByteValue());
                assertEquals((short)Byte.MAX_VALUE, parser.getShortValue());
                assertEquals((int)Byte.MAX_VALUE, parser.getIntValue());
                assertEquals((long)Byte.MAX_VALUE, parser.getLongValue());
                assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
                assertEquals(Byte.MIN_VALUE, parser.getByteValue());
                assertEquals((short)Byte.MIN_VALUE, parser.getShortValue());
                assertEquals((int)Byte.MIN_VALUE, parser.getIntValue());
                assertEquals((long)Byte.MIN_VALUE, parser.getLongValue());
                assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
                assertEquals(Short.MAX_VALUE, parser.getShortValue());
                assertEquals((int)Short.MAX_VALUE, parser.getIntValue());
                assertEquals((long)Short.MAX_VALUE, parser.getLongValue());
                assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
                assertEquals(Short.MIN_VALUE, parser.getShortValue());
                assertEquals((int)Short.MIN_VALUE, parser.getIntValue());
                assertEquals((long)Short.MIN_VALUE, parser.getLongValue());
                
            }
        },
        INT {
            @Override
            public void generate(SdkIonGenerator generator) {
                generator.writeValue(Integer.MAX_VALUE);
                generator.writeValue(Integer.MIN_VALUE);
            }

            @Override
            public void parse(IonParser parser) throws IOException {
                assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
                assertEquals(Integer.MAX_VALUE, parser.getIntValue());
                assertEquals((long)Integer.MAX_VALUE, parser.getLongValue());
                assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
                assertEquals(Integer.MIN_VALUE, parser.getIntValue());
                assertEquals((long)Integer.MIN_VALUE, parser.getLongValue());
            }
        },
        LONG {
            @Override
            public void generate(SdkIonGenerator generator) {
                generator.writeValue(Long.MAX_VALUE);
                generator.writeValue(Long.MIN_VALUE);
            }

            @Override
            public void parse(IonParser parser) throws IOException {
                assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
                assertEquals(Long.MAX_VALUE, parser.getLongValue());
                assertEquals(BigInteger.valueOf(Long.MAX_VALUE), parser.getBigIntegerValue());
                assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
                assertEquals(Long.MIN_VALUE, parser.getLongValue());
                assertEquals(BigInteger.valueOf(Long.MIN_VALUE), parser.getBigIntegerValue());
                
            }
        },
        BIG_INTEGER {
            @Override
            public void generate(SdkIonGenerator generator) {
                generator.writeValue(BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE));
                generator.writeValue(BigInteger.valueOf(Long.MIN_VALUE).subtract(BigInteger.ONE));
            }

            @Override
            public void parse(IonParser parser) throws IOException {
                assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
                assertEquals(BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE), parser.getBigIntegerValue());
                try {
                    parser.getLongValue();
                } catch (IonException e1) {
                    assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
                    assertEquals(BigInteger.valueOf(Long.MIN_VALUE).subtract(BigInteger.ONE), parser.getBigIntegerValue());
                    try {
                        parser.getLongValue();
                    } catch (IonException e2) {
                        return;
                    }
                }
                throw new AssertionError("number shouldn't fit in a long");
            }
        },
        FLOAT {
            @Override
            public void generate(SdkIonGenerator generator) {
                generator.writeValue(Float.MAX_VALUE);
                generator.writeValue(Float.MIN_VALUE);
                generator.writeValue(-Float.MAX_VALUE);
            }

            @Override
            public void parse(IonParser parser) throws IOException {
                assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
                assertEquals(Float.MAX_VALUE, parser.getFloatValue(), 1e-9);
                assertEquals((double)Float.MAX_VALUE, parser.getDoubleValue(), 1e-9);
                assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
                assertEquals(Float.MIN_VALUE, parser.getFloatValue(), 1e-9);
                assertEquals((double)Float.MIN_VALUE, parser.getDoubleValue(), 1e-9);
                assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
                assertEquals(-Float.MAX_VALUE, parser.getFloatValue(), 1e-9);
                assertEquals((double)-Float.MAX_VALUE, parser.getDoubleValue(), 1e-9);
                
            }
        },
        DOUBLE {
            @Override
            public void generate(SdkIonGenerator generator) {
                generator.writeValue(Double.MAX_VALUE);
                generator.writeValue(Double.MIN_VALUE);
                generator.writeValue(-Double.MAX_VALUE);
            }

            @Override
            public void parse(IonParser parser) throws IOException {
                assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
                assertEquals(Double.MAX_VALUE, parser.getDoubleValue(), 1e-9);
                assertEquals(BigDecimal.valueOf(Double.MAX_VALUE), parser.getDecimalValue());
                assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
                assertEquals(Float.MIN_VALUE, parser.getDoubleValue(), 1e-9);
                assertEquals(BigDecimal.valueOf(Double.MIN_VALUE), parser.getDecimalValue());
                assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
                assertEquals(-Double.MAX_VALUE, parser.getDoubleValue(), 1e-9);
                assertEquals(BigDecimal.valueOf(-Double.MAX_VALUE), parser.getDecimalValue());
                
            }
        },
        BIG_DECIMAL {
            @Override
            public void generate(SdkIonGenerator generator) {
                generator.writeValue(BigDecimal.valueOf(Double.MAX_VALUE).add(BigDecimal.ONE));
                generator.writeValue(BigDecimal.valueOf(-Double.MAX_VALUE).subtract(BigDecimal.ONE));
            }

            @Override
            public void parse(IonParser parser) throws IOException {
                assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
                assertEquals(BigDecimal.valueOf(Double.MAX_VALUE).add(BigDecimal.ONE), parser.getDecimalValue());
                assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
                assertEquals(BigDecimal.valueOf(-Double.MAX_VALUE).subtract(BigDecimal.ONE), parser.getDecimalValue());
            }
        },
        TIMESTAMP {
            @Override
            public void generate(SdkIonGenerator generator) {
                generator.writeValue(new Date(0), null);
                // Note: dates too far in the future are rejected by Ion
                generator.writeValue(new Date(Integer.MAX_VALUE), null);
                generator.writeValue(new Date(Integer.MIN_VALUE), null);
            }

            @Override
            public void parse(IonParser parser) throws IOException {
                assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
                assertEquals(new Date(0), parser.getEmbeddedObject());
                assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
                assertEquals(new Date(Integer.MAX_VALUE), parser.getEmbeddedObject());
                assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
                assertEquals(new Date(Integer.MIN_VALUE), parser.getEmbeddedObject());
            }
        },
        BYTES {
            @Override
            public void generate(SdkIonGenerator generator) {
                generator.writeValue(ByteBuffer.wrap("foobar".getBytes(StringUtils.UTF8)));
            }

            @Override
            public void parse(IonParser parser) throws IOException {
                assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
                assertEquals(ByteBuffer.wrap("foobar".getBytes(StringUtils.UTF8)), parser.getEmbeddedObject());
            }
        },
        EMPTY_STRUCT {
            @Override
            public void generate(SdkIonGenerator generator) {
                generator.writeStartObject();
                generator.writeEndObject();
            }

            @Override
            public void parse(IonParser parser) throws IOException {
                assertEquals(JsonToken.START_OBJECT, parser.nextToken());
                assertEquals(JsonToken.END_OBJECT, parser.nextToken());
            }
        },
        EMPTY_LIST {
            @Override
            public void generate(SdkIonGenerator generator) {
                generator.writeStartArray();
                generator.writeEndArray();
            }

            @Override
            public void parse(IonParser parser) throws IOException {
                assertEquals(JsonToken.START_ARRAY, parser.nextToken());
                assertEquals(JsonToken.END_ARRAY, parser.nextToken());
            }
        },
        STRUCT {
            @Override
            public void generate(SdkIonGenerator generator) {
                generator.writeStartObject();
                generator.writeFieldName("int");
                generator.writeValue(1);
                generator.writeFieldName("string");
                generator.writeValue("foo");
                generator.writeFieldName("bool");
                generator.writeValue(false);
                generator.writeEndObject();
            }

            @Override
            public void parse(IonParser parser) throws IOException {
                assertEquals(JsonToken.START_OBJECT, parser.nextToken());
                assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
                assertEquals("int", parser.getText());
                assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
                assertEquals(1, parser.getIntValue());
                assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
                assertEquals("string", parser.getText());
                assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
                assertEquals("foo", parser.getText());
                assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
                assertEquals("bool", parser.getText());
                assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
                assertEquals(false, parser.getBooleanValue());
                assertEquals(JsonToken.END_OBJECT, parser.nextToken());
            }
        },
        LIST {
            @Override
            public void generate(SdkIonGenerator generator) {
                generator.writeStartArray();
                generator.writeValue(1);
                generator.writeValue("foo");
                generator.writeValue(true);
                generator.writeEndArray();
            }

            @Override
            public void parse(IonParser parser) throws IOException {
                assertEquals(JsonToken.START_ARRAY, parser.nextToken());
                assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
                assertEquals(1, parser.getIntValue());
                assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
                assertEquals("foo", parser.getText());
                assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
                assertEquals(true, parser.getBooleanValue());
                assertEquals(JsonToken.END_ARRAY, parser.nextToken());
                
            }
        },
        STRUCT_IN_LIST {
            @Override
            public void generate(SdkIonGenerator generator) {
                generator.writeStartArray();
                STRUCT.generate(generator);
                generator.writeEndArray();
            }

            @Override
            public void parse(IonParser parser) throws IOException {
                assertEquals(JsonToken.START_ARRAY, parser.nextToken());
                STRUCT.parse(parser);
                assertEquals(JsonToken.END_ARRAY, parser.nextToken());
            }
        },
        LIST_IN_STRUCT {
            @Override
            public void generate(SdkIonGenerator generator) {
                generator.writeStartObject();
                generator.writeFieldName("list");
                LIST.generate(generator);
                generator.writeEndObject();
            }

            @Override
            public void parse(IonParser parser) throws IOException {
                assertEquals(JsonToken.START_OBJECT, parser.nextToken());
                assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
                assertEquals("list", parser.getText());
                LIST.parse(parser);
                assertEquals(JsonToken.END_OBJECT, parser.nextToken());
            }
        },
        STRUCT_SKIP {
            @Override
            public void generate(SdkIonGenerator generator) {
                generator.writeValue(42);
                STRUCT.generate(generator);
                generator.writeValue("foo");
            }

            @Override
            public void parse(IonParser parser) throws IOException {
                assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
                assertEquals(42, parser.getIntValue());
                assertEquals(JsonToken.START_OBJECT, parser.nextToken());
                parser.skipChildren();
                assertEquals(JsonToken.END_OBJECT, parser.getCurrentToken());
                assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
                assertEquals("foo", parser.getText());
            }
        },
        LIST_SKIP {
            @Override
            public void generate(SdkIonGenerator generator) {
                generator.writeValue(42);
                LIST.generate(generator);
                generator.writeValue("foo");
            }

            @Override
            public void parse(IonParser parser) throws IOException {
                assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
                assertEquals(42, parser.getIntValue());
                assertEquals(JsonToken.START_ARRAY, parser.nextToken());
                parser.skipChildren();
                assertEquals(JsonToken.END_ARRAY, parser.getCurrentToken());
                assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
                assertEquals("foo", parser.getText());
            }
        },
        NESTED_SKIP {
            @Override
            public void generate(SdkIonGenerator generator) {
                generator.writeValue(42);
                LIST_IN_STRUCT.generate(generator);
                generator.writeValue("foo");
            }

            @Override
            public void parse(IonParser parser) throws IOException {
                assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
                assertEquals(42, parser.getIntValue());
                assertEquals(JsonToken.START_OBJECT, parser.nextToken());
                parser.skipChildren();
                assertEquals(JsonToken.END_OBJECT, parser.getCurrentToken());
                assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
                assertEquals("foo", parser.getText());
            }
        },
        NESTED_INNER_SKIP {
            @Override
            public void generate(SdkIonGenerator generator) {
                generator.writeStartArray();
                generator.writeValue(42);
                STRUCT.generate(generator);
                generator.writeValue("foo");
                generator.writeEndArray();
            }

            @Override
            public void parse(IonParser parser) throws IOException {
                assertEquals(JsonToken.START_ARRAY, parser.nextToken());
                assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
                assertEquals(42, parser.getIntValue());
                assertEquals(JsonToken.START_OBJECT, parser.nextToken());
                parser.skipChildren();
                assertEquals(JsonToken.END_OBJECT, parser.getCurrentToken());
                assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
                assertEquals("foo", parser.getText());
                assertEquals(JsonToken.END_ARRAY, parser.nextToken());
            }
        };
        
        public abstract void generate(SdkIonGenerator generator);
        public abstract void parse(IonParser parser) throws IOException;
    }
    
    @Parameters
    public static Collection<Object[]> data() {
        List<Object[]> parameters = new ArrayList<Object[]>();
        for (Data data : Data.values()) {
            parameters.add(new Object[]{ data });
        }
        return parameters;
    }
    
    private static final IonSystem SYSTEM = IonSystemBuilder.standard().build();
    
    private final Data data;
    
    public IonRoundtripTest(Data data) {
        this.data = data;
    }
    
    @Test
    public void testRoundtrip() throws IOException
    {
        SdkIonGenerator generator = SdkIonGenerator.create(IonBinaryWriterBuilder.standard(), "foo");
        data.generate(generator);
        IonParser parser = new IonParser(SYSTEM.newReader(generator.getBytes()), false);
        data.parse(parser);
        assertNull(parser.nextToken()); // Asserts data was read fully.
        assertFalse(parser.hasCurrentToken());
        assertFalse(parser.isClosed());
        parser.close();
        assertTrue(parser.isClosed());
    }
    
}
