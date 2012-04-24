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
import java.text.ParseException;
import java.util.Date;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.AmazonClientException;
import com.amazonaws.util.DateUtils;

/**
 * Collection of StAX unmarshallers for simple data types.
 */
public class SimpleTypeStaxUnmarshallers {

    /** Shared DateUtils object for parsing and formatting dates */
    private static DateUtils dateUtils = new DateUtils();

    /** Shared logger */
    private static Log log = LogFactory.getLog(SimpleTypeStaxUnmarshallers.class);

    /**
     * Unmarshaller for String values.
     */
    public static class StringStaxUnmarshaller implements Unmarshaller<String, StaxUnmarshallerContext> {
        public String unmarshall(StaxUnmarshallerContext unmarshallerContext) throws Exception {
            return unmarshallerContext.readText();
        }

        private static StringStaxUnmarshaller instance;
        public static StringStaxUnmarshaller getInstance() {
            if (instance == null) instance = new StringStaxUnmarshaller();
            return instance;
        }
    }

    public static class BigDecimalStaxUnmarshaller implements Unmarshaller<BigDecimal, StaxUnmarshallerContext> {
		public BigDecimal unmarshall(StaxUnmarshallerContext unmarshallerContext)
				throws Exception {
			String s = unmarshallerContext.readText();
			return (s == null) ? null : new BigDecimal(s);
		}

        private static BigDecimalStaxUnmarshaller instance;
        public static BigDecimalStaxUnmarshaller getInstance() {
            if (instance == null) instance = new BigDecimalStaxUnmarshaller();
            return instance;
        }
    }

    public static class BigIntegerStaxUnmarshaller implements Unmarshaller<BigInteger, StaxUnmarshallerContext> {
		public BigInteger unmarshall(StaxUnmarshallerContext unmarshallerContext)
				throws Exception {
			String s = unmarshallerContext.readText();
			return (s == null) ? null : new BigInteger(s);
		}

        private static BigIntegerStaxUnmarshaller instance;
        public static BigIntegerStaxUnmarshaller getInstance() {
            if (instance == null) instance = new BigIntegerStaxUnmarshaller();
            return instance;
        }
    }

    /**
     * Unmarshaller for Double values.
     */
    public static class DoubleStaxUnmarshaller implements Unmarshaller<Double, StaxUnmarshallerContext> {
        public Double unmarshall(StaxUnmarshallerContext unmarshallerContext) throws Exception {
            String doubleString = unmarshallerContext.readText();
            return (doubleString == null) ? null : Double.parseDouble(doubleString);
        }

        private static DoubleStaxUnmarshaller instance;
        public static DoubleStaxUnmarshaller getInstance() {
            if (instance == null) instance = new DoubleStaxUnmarshaller();
            return instance;
        }
    }

    /**
     * Unmarshaller for Integer values.
     */
    public static class IntegerStaxUnmarshaller implements Unmarshaller<Integer, StaxUnmarshallerContext> {
        public Integer unmarshall(StaxUnmarshallerContext unmarshallerContext) throws Exception {
            String intString = unmarshallerContext.readText();
            return (intString == null) ? null : Integer.parseInt(intString);
        }

        private static IntegerStaxUnmarshaller instance;
        public static IntegerStaxUnmarshaller getInstance() {
            if (instance == null) instance = new IntegerStaxUnmarshaller();
            return instance;
        }
    }

    /**
     * Unmarshaller for Boolean values.
     */
    public static class BooleanStaxUnmarshaller implements Unmarshaller<Boolean, StaxUnmarshallerContext> {
        public Boolean unmarshall(StaxUnmarshallerContext unmarshallerContext) throws Exception {
            String booleanString = unmarshallerContext.readText();
            return (booleanString == null) ? null : Boolean.parseBoolean(booleanString);
        }

        private static BooleanStaxUnmarshaller instance;
        public static BooleanStaxUnmarshaller getInstance() {
            if (instance == null) instance = new BooleanStaxUnmarshaller();
            return instance;
        }
    }

    /**
     * Unmarshaller for Float values.
     */
    public static class FloatStaxUnmarshaller implements Unmarshaller<Float, StaxUnmarshallerContext> {
        public Float unmarshall(StaxUnmarshallerContext unmarshallerContext) throws Exception {
            String floatString = unmarshallerContext.readText();
            return (floatString == null) ? null : Float.valueOf(floatString);
        }

        private static FloatStaxUnmarshaller instance;
        public static FloatStaxUnmarshaller getInstance() {
            if (instance == null) instance = new FloatStaxUnmarshaller();
            return instance;
        }
    }

    /**
     * Unmarshaller for Long values.
     */
    public static class LongStaxUnmarshaller implements Unmarshaller<Long, StaxUnmarshallerContext> {
        public Long unmarshall(StaxUnmarshallerContext unmarshallerContext) throws Exception {
            String longString = unmarshallerContext.readText();
            return (longString == null) ? null : Long.parseLong(longString);
        }

        private static LongStaxUnmarshaller instance;
        public static LongStaxUnmarshaller getInstance() {
            if (instance == null) instance = new LongStaxUnmarshaller();
            return instance;
        }
    }

    /**
     * Unmarshaller for Byte values.
     */
    public static class ByteStaxUnmarshaller implements Unmarshaller<Byte, StaxUnmarshallerContext> {
        public Byte unmarshall(StaxUnmarshallerContext unmarshallerContext) throws Exception {
            String byteString = unmarshallerContext.readText();
            return (byteString == null) ? null : Byte.valueOf(byteString);
        }

        private static ByteStaxUnmarshaller instance;
        public static ByteStaxUnmarshaller getInstance() {
            if (instance == null) instance = new ByteStaxUnmarshaller();
            return instance;
        }
    }

    /**
     * Unmarshaller for Date values.
     */
    public static class DateStaxUnmarshaller implements Unmarshaller<Date, StaxUnmarshallerContext> {
        public Date unmarshall(StaxUnmarshallerContext unmarshallerContext) throws Exception {
            String dateString = unmarshallerContext.readText();
            if (dateString == null) return null;

            try {
                return dateUtils.parseIso8601Date(dateString);
            } catch (ParseException e) {
                log.warn("Unable to parse date '" + dateString + "':  " + e.getMessage(), e);
                return null;
            }
        }

        private static DateStaxUnmarshaller instance;
        public static DateStaxUnmarshaller getInstance() {
            if (instance == null) instance = new DateStaxUnmarshaller();
            return instance;
        }
    }

    /**
     * Unmarshaller for ByteBuffer values.
     */
    public static class ByteBufferStaxUnmarshaller implements Unmarshaller<ByteBuffer, StaxUnmarshallerContext> {
        public ByteBuffer unmarshall(StaxUnmarshallerContext unmarshallerContext) throws Exception {
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

        private static ByteBufferStaxUnmarshaller instance;
        public static ByteBufferStaxUnmarshaller getInstance() {
            if (instance == null) instance = new ByteBufferStaxUnmarshaller();
            return instance;
        }
    }

}
