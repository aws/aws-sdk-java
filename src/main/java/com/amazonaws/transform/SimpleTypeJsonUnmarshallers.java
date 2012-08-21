/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.transform;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.AmazonClientException;
import com.amazonaws.util.DateUtils;

public class SimpleTypeJsonUnmarshallers {

    /** Shared DateUtils object for parsing and formatting dates */
    private static DateUtils dateUtils = new DateUtils();

    /** Shared logger */
    private static Log log = LogFactory.getLog(SimpleTypeJsonUnmarshallers.class);

    /**
     * Unmarshaller for String values.
     */
    public static class StringJsonUnmarshaller implements Unmarshaller<String, JsonUnmarshallerContext> {
        public String unmarshall(JsonUnmarshallerContext unmarshallerContext) throws Exception {
            return unmarshallerContext.readText();
        }

        private static StringJsonUnmarshaller instance;
        public static StringJsonUnmarshaller getInstance() {
            if (instance == null) instance = new StringJsonUnmarshaller();
            return instance;
        }
    }

    /**
     * Unmarshaller for Double values.
     */
    public static class DoubleJsonUnmarshaller implements Unmarshaller<Double, JsonUnmarshallerContext> {
        public Double unmarshall(JsonUnmarshallerContext unmarshallerContext) throws Exception {
            String doubleString = unmarshallerContext.readText();
            return (doubleString == null) ? null : Double.parseDouble(doubleString);
        }

        private static DoubleJsonUnmarshaller instance;
        public static DoubleJsonUnmarshaller getInstance() {
            if (instance == null) instance = new DoubleJsonUnmarshaller();
            return instance;
        }
    }

    /**
     * Unmarshaller for Integer values.
     */
    public static class IntegerJsonUnmarshaller implements Unmarshaller<Integer, JsonUnmarshallerContext> {
        public Integer unmarshall(JsonUnmarshallerContext unmarshallerContext) throws Exception {
            String intString = unmarshallerContext.readText();
            return (intString == null) ? null : Integer.parseInt(intString);
        }

        private static IntegerJsonUnmarshaller instance;
        public static IntegerJsonUnmarshaller getInstance() {
            if (instance == null) instance = new IntegerJsonUnmarshaller();
            return instance;
        }
    }

    public static class BigIntegerJsonUnmarshaller implements Unmarshaller<BigInteger, JsonUnmarshallerContext> {
        public BigInteger unmarshall(JsonUnmarshallerContext unmarshallerContext) throws Exception {
            String intString = unmarshallerContext.readText();
            return (intString == null) ? null : new BigInteger(intString);
        }

        private static BigIntegerJsonUnmarshaller instance;
        public static BigIntegerJsonUnmarshaller getInstance() {
            if (instance == null) instance = new BigIntegerJsonUnmarshaller();
            return instance;
        }
    }

    public static class BigDecimalJsonUnmarshaller implements Unmarshaller<BigDecimal, JsonUnmarshallerContext> {
        public BigDecimal unmarshall(JsonUnmarshallerContext unmarshallerContext) throws Exception {
            String s = unmarshallerContext.readText();
            return (s == null) ? null : new BigDecimal(s);
        }

        private static BigDecimalJsonUnmarshaller instance;
        public static BigDecimalJsonUnmarshaller getInstance() {
            if (instance == null) instance = new BigDecimalJsonUnmarshaller();
            return instance;
        }
    }

    /**
     * Unmarshaller for Boolean values.
     */
    public static class BooleanJsonUnmarshaller implements Unmarshaller<Boolean, JsonUnmarshallerContext> {
        public Boolean unmarshall(JsonUnmarshallerContext unmarshallerContext) throws Exception {
            String booleanString = unmarshallerContext.readText();
            return (booleanString == null) ? null : Boolean.parseBoolean(booleanString);
        }

        private static BooleanJsonUnmarshaller instance;
        public static BooleanJsonUnmarshaller getInstance() {
            if (instance == null) instance = new BooleanJsonUnmarshaller();
            return instance;
        }
    }

    /**
     * Unmarshaller for Float values.
     */
    public static class FloatJsonUnmarshaller implements Unmarshaller<Float, JsonUnmarshallerContext> {
        public Float unmarshall(JsonUnmarshallerContext unmarshallerContext) throws Exception {
            String floatString = unmarshallerContext.readText();
            return (floatString == null) ? null : Float.valueOf(floatString);
        }

        private static FloatJsonUnmarshaller instance;
        public static FloatJsonUnmarshaller getInstance() {
            if (instance == null) instance = new FloatJsonUnmarshaller();
            return instance;
        }
    }

    /**
     * Unmarshaller for Long values.
     */
    public static class LongJsonUnmarshaller implements Unmarshaller<Long, JsonUnmarshallerContext> {
        public Long unmarshall(JsonUnmarshallerContext unmarshallerContext) throws Exception {
            String longString = unmarshallerContext.readText();
            return (longString == null) ? null : Long.parseLong(longString);
        }

        private static LongJsonUnmarshaller instance;
        public static LongJsonUnmarshaller getInstance() {
            if (instance == null) instance = new LongJsonUnmarshaller();
            return instance;
        }
    }

    /**
     * Unmarshaller for Byte values.
     */
    public static class ByteJsonUnmarshaller implements Unmarshaller<Byte, JsonUnmarshallerContext> {
        public Byte unmarshall(JsonUnmarshallerContext unmarshallerContext) throws Exception {
            String byteString = unmarshallerContext.readText();
            return (byteString == null) ? null : Byte.valueOf(byteString);
        }

        private static ByteJsonUnmarshaller instance;
        public static ByteJsonUnmarshaller getInstance() {
            if (instance == null) instance = new ByteJsonUnmarshaller();
            return instance;
        }
    }

    /**
     * Unmarshaller for Date values - JSON dates come in as epoch seconds.
     */
    public static class DateJsonUnmarshaller implements Unmarshaller<Date, JsonUnmarshallerContext> {
        public Date unmarshall(JsonUnmarshallerContext unmarshallerContext) throws Exception {
            String dateString = unmarshallerContext.readText();
            if (dateString == null) return null;

            try {
            	Number number = DecimalFormat.getInstance(new Locale("en")).parse(dateString);
            	return new Date(number.longValue() * 1000);
            } catch (ParseException e) {
                String errorMessage = "Unable to parse date '" + dateString + "':  " + e.getMessage();
                throw new AmazonClientException(errorMessage, e);
            }
        }

        private static DateJsonUnmarshaller instance;
        public static DateJsonUnmarshaller getInstance() {
            if (instance == null) instance = new DateJsonUnmarshaller();
            return instance;
        }
    }

    /**
     * Unmarshaller for ByteBuffer values.
     */
    public static class ByteBufferJsonUnmarshaller implements Unmarshaller<ByteBuffer, JsonUnmarshallerContext> {
        public ByteBuffer unmarshall(JsonUnmarshallerContext unmarshallerContext) throws Exception {
            String base64EncodedString = unmarshallerContext.readText();
            if (base64EncodedString == null) return null;

            try {
                byte[] base64EncodedBytes = base64EncodedString.getBytes("UTF-8");
                byte[] decodedBytes = Base64.decodeBase64(base64EncodedBytes);
                return ByteBuffer.wrap(decodedBytes);
            } catch (UnsupportedEncodingException e) {
                throw new AmazonClientException("Unable to unmarshall XML data into a ByteBuffer", e);
            }
        }

        private static ByteBufferJsonUnmarshaller instance;
        public static ByteBufferJsonUnmarshaller getInstance() {
            if (instance == null) instance = new ByteBufferJsonUnmarshaller();
            return instance;
        }
    }

}
