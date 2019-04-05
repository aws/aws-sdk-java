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

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.amazonaws.util.StringUtils;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.amazonaws.AmazonClientException;
import com.fasterxml.jackson.core.JsonToken;

import software.amazon.ion.IonReader;
import software.amazon.ion.IonSystem;
import software.amazon.ion.IonWriter;
import software.amazon.ion.system.IonBinaryWriterBuilder;
import software.amazon.ion.system.IonSystemBuilder;
import software.amazon.ion.system.IonTextWriterBuilder;

/**
 * Tests the {@link IonParser} for conformity with the {@link JsonParser} API.
 * Also tests that the IonParser correctly converts Ion-only value types to
 * the correct {@link JsonToken}s. For testing of additional value types and
 * roundtrip testing with the {@link SdkIonGenerator}, see {@link IonRoundtripTest}.
 */
@RunWith(Parameterized.class)
public class IonParserTest {
    
    private enum WriteFormat {
        TEXT {
            @Override
            public byte[] write(String data) throws IOException {
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                write(data, IonTextWriterBuilder.standard().build(out));
                return out.toByteArray();
            }
        },
        BINARY {
            @Override
            public byte[] write(String data) throws IOException {
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                write(data, IonBinaryWriterBuilder.standard().build(out));
                return out.toByteArray();
            }
        };
        
        public static void write(String data, IonWriter writer) throws IOException {
            IonReader reader = SYSTEM.newReader(data);
            writer.writeValues(reader);
            writer.close();
        }
        
        public abstract byte[] write(String data) throws IOException;
    }
    
    @Parameters
    public static Collection<Object[]> data() {
        List<Object[]> parameters = new ArrayList<Object[]>();
        for (WriteFormat format : WriteFormat.values()) {
            parameters.add(new Object[]{ format });
        }
        return parameters;
    }
    
    private static IonSystem SYSTEM = IonSystemBuilder.standard().build();
    
    private WriteFormat format;
    
    public IonParserTest(WriteFormat format) {
        this.format = format;
    }
    
    private IonParser parse(String data) throws IOException {
        byte[] ion = format.write(data);
        return new IonParser(SYSTEM.newReader(ion), false);
    }
    
    @Test
    public void testEmptySexp() throws IOException {
        IonParser parser = parse("()");
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
    }
    
    @Test
    public void testSexp() throws IOException {
        IonParser parser = parse("(a+b)");
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("a", parser.getText());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("+", parser.getText());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("b", parser.getText());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
    }
    
    @Test
    public void testNestedSexp() throws IOException {
        IonParser parser = parse("((a)+(b))");
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("a", parser.getText());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("+", parser.getText());
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("b", parser.getText());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
    }
    
    @Test
    public void testSexpSkip() throws IOException {
        IonParser parser = parse("(a+b)");
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        parser.skipChildren();
        assertEquals(JsonToken.END_ARRAY, parser.getCurrentToken());
        assertNull(parser.nextToken());
    }
    
    @Test
    public void testNestedSexpSkip() throws IOException {
        IonParser parser = parse("((a)+(b))");
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        parser.skipChildren();
        assertEquals(JsonToken.END_ARRAY, parser.getCurrentToken());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("+", parser.getText());
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        parser.skipChildren();
        assertEquals(JsonToken.END_ARRAY, parser.getCurrentToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
    }
    
    @Test
    public void testEmptyClob() throws IOException {
        IonParser parser = parse("{{}}");
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
        assertEquals(ByteBuffer.wrap(new byte[0]), parser.getEmbeddedObject());
        assertNull(parser.nextToken());
    }
    
    @Test
    public void testClob() throws IOException {
        IonParser parser = parse("{{\"abc123\"}}");
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
        assertEquals(ByteBuffer.wrap("abc123".getBytes(StringUtils.UTF8)), parser.getEmbeddedObject());
        assertNull(parser.nextToken());
    }
    
    @Test
    public void testSymbolValue() throws IOException {
        IonParser parser = parse("a1 _1 $foo '123' 'sp ace'");
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("a1", parser.getText());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("_1", parser.getText());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("$foo", parser.getText());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("123", parser.getText());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("sp ace", parser.getText());
        assertNull(parser.nextToken());
    }
    
    @Test
    public void testSkipChildrenNotAtContainerStartDoesNothing() throws IOException {
        IonParser parser = parse("123 (a+b)");
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        parser.skipChildren(); // should do nothing
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.getCurrentToken());
        assertEquals(123, parser.getIntValue());
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        parser.skipChildren(); // should do nothing
        assertEquals(JsonToken.VALUE_STRING, parser.getCurrentToken());
        assertEquals("a", parser.getText());
    }
    
    @Test
    public void testGetEmbeddedObjectOnBasicValueReturnsNull() throws IOException {
        IonParser parser = parse("123 (a+b) abc");
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertNull(parser.getEmbeddedObject());
        assertEquals(123, parser.getIntValue());
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertNull(parser.getEmbeddedObject());
        parser.skipChildren();
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertNull(parser.getEmbeddedObject());
        assertEquals("abc", parser.getText());
        assertNull(parser.nextToken());
    }
    
    @Test
    public void testNulls() throws IOException {
        IonParser parser = parse(   "null "
                                  + "null.null "
                                  + "null.bool "
                                  + "null.int "
                                  + "null.float "
                                  + "null.decimal "
                                  + "null.timestamp "
                                  + "null.string "
                                  + "null.symbol "
                                  + "null.blob "
                                  + "null.clob "
                                  + "null.struct "
                                  + "null.list "
                                  + "null.sexp"
                                 );
        JsonToken token = null;
        int count = 0;
        while ((token = parser.nextToken()) != null) {
            assertEquals(JsonToken.VALUE_NULL, token);
            count++;
        }
        assertEquals(14, count);
    }
    
    @Test
    public void testNextValue() throws IOException {
        IonParser parser = parse("{foo:{bar:\"abc\"}, baz:123} 42.0");
        assertEquals(JsonToken.START_OBJECT, parser.nextValue());
        assertEquals(JsonToken.START_OBJECT, parser.nextValue());
        assertEquals("foo", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextValue());
        assertEquals("abc", parser.getText());
        assertEquals("bar", parser.getCurrentName());
        assertEquals(JsonToken.END_OBJECT, parser.nextValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextValue());
        assertEquals(123, parser.getIntValue());
        assertEquals("baz", parser.getCurrentName());
        assertEquals(JsonToken.END_OBJECT, parser.nextValue());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextValue());
        assertEquals(42.0, parser.getFloatValue(), 1e-9);
        assertNull(parser.nextValue());
    }
    
    @Test
    public void testGetCurrentNameNotAtFieldReturnsNull() throws IOException {
        IonParser parser = parse("{foo:\"abc\"} [a, b] {{}} \"bar\"");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertNull(parser.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextValue());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.getCurrentName());
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertNull(parser.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertNull(parser.getCurrentName());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.getCurrentName());
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
        assertNull(parser.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertNull(parser.getCurrentName());
        assertNull(parser.nextToken());
        assertNull(parser.getCurrentName());
    }
    
    @Test
    public void testClearCurrentToken() throws IOException {
        IonParser parser = parse("{}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        parser.clearCurrentToken();
        assertNull(parser.getCurrentToken());
        assertFalse(parser.hasCurrentToken());
        assertEquals(JsonToken.START_OBJECT, parser.getLastClearedToken());
    }
    
    @Test
    public void testGetText() throws IOException {
        String defaultText = "default";
        String integer = String.valueOf(123);
        String flt = String.valueOf(42.0);
        IonParser parser = parse("{foo:" + integer + ", bar:" + flt + "} {{\"abc\"}} null true false");
        assertNull(parser.getText());
        assertEquals(defaultText, parser.getValueAsString(defaultText));
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.START_OBJECT.asString(), parser.getText()); // "{"
        assertEquals(defaultText, parser.getValueAsString(defaultText));
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("foo", parser.getText());
        assertEquals(defaultText, parser.getValueAsString(defaultText));
        assertEquals("foo", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(integer, parser.getText());
        assertEquals(integer, parser.getValueAsString(defaultText));
        assertEquals(123, parser.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextValue());
        assertEquals(flt, parser.getText());
        assertEquals(flt, parser.getValueAsString(defaultText));
        assertEquals(42.0, parser.getFloatValue(), 1e-9);
        assertEquals("bar", parser.getCurrentName());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT.asString(), parser.getText()); // "}"
        assertEquals(defaultText, parser.getValueAsString(defaultText));
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
        assertNull(parser.getText()); // embedded objects have undefined text
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        assertEquals(JsonToken.VALUE_NULL.asString(), parser.getText()); // "null"
        assertEquals(defaultText, parser.getValueAsString(defaultText));
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        assertEquals(JsonToken.VALUE_TRUE.asString(), parser.getText()); // "true"
        assertEquals(JsonToken.VALUE_TRUE.asString(), parser.getValueAsString(defaultText));
        assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
        assertEquals(JsonToken.VALUE_FALSE.asString(), parser.getText()); // "false"
        assertEquals(JsonToken.VALUE_FALSE.asString(), parser.getValueAsString(defaultText));
        assertNull(parser.nextToken());
        assertNull(parser.getText());
        assertEquals(defaultText, parser.getValueAsString(defaultText));
    }
    
    @Test
    public void testGetNumberValue() throws IOException {
        String integer = String.valueOf(Integer.MAX_VALUE);
        String lng = String.valueOf(Long.MAX_VALUE);
        String bigInteger = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE).toString();
        String flt = String.valueOf(Float.MAX_VALUE);
        String dbl = String.valueOf(Double.MAX_VALUE);
        String inf = "1.7976931348623157E309"; // Double.MAX_VALUE * 10;
        String bigDecimal = new BigDecimal(inf).toString();
        IonParser parser = parse(   integer + " " 
                                  + lng + " "
                                  + bigInteger + " "
                                  + flt + " "
                                  + dbl + " "
                                  + inf + " "
                                  + bigDecimal.toLowerCase().replace("e", "D")
                                 );
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(integer, parser.getNumberValue().toString());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(lng, parser.getNumberValue().toString());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(bigInteger, parser.getNumberValue().toString());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(flt, parser.getNumberValue().toString());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(dbl, parser.getNumberValue().toString());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertTrue(Double.isInfinite(parser.getDoubleValue()));
        assertTrue(Double.isInfinite(parser.getFloatValue()));
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(bigDecimal, parser.getNumberValue().toString());
    }
    
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    
    @Test
    public void testGetNumberValueNotOnNumberFails() throws IOException {
        IonParser parser = parse("foo {{}} {abc:123}");
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertNull(parser.getNumberType());
        thrown.expect(AmazonClientException.class);
        parser.getNumberValue();
    }
    
    @Test
    public void testSpecialFloatValues() throws IOException {
        IonParser parser = parse(   "1.7976931348623157E309 " // Double.MAX_VALUE * 10
                                  + "-1.7976931348623157E309 "
                                  + "+inf "
                                  + "-inf "
                                  + "nan"
                                 );
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertTrue(Double.isInfinite(parser.getDoubleValue()));
        assertTrue(Double.isInfinite(parser.getFloatValue()));
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertTrue(Double.isInfinite(parser.getDoubleValue()));
        assertTrue(Double.isInfinite(parser.getFloatValue()));
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertTrue(Double.isInfinite(parser.getDoubleValue()));
        assertTrue(Double.isInfinite(parser.getFloatValue()));
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertTrue(Double.isInfinite(parser.getDoubleValue()));
        assertTrue(Double.isInfinite(parser.getFloatValue()));
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertTrue(Double.isNaN(parser.getDoubleValue()));
        assertTrue(Double.isNaN(parser.getFloatValue()));
    }
    
}
