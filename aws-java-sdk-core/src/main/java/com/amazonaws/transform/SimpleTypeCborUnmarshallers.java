/*
 * Copyright 2016-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Date;

import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.SdkProtectedApi;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

@SdkProtectedApi
public class SimpleTypeCborUnmarshallers {
    /**
     * Unmarshaller for String values.
     */
    public static class StringCborUnmarshaller implements Unmarshaller<String, JsonUnmarshallerContext> {
        public String unmarshall(JsonUnmarshallerContext unmarshallerContext) throws Exception {
            return unmarshallerContext.readText();
        }

        private static final StringCborUnmarshaller instance = new StringCborUnmarshaller();

        public static StringCborUnmarshaller getInstance() {
            return instance;
        }
    }

    /**
     * Unmarshaller for Double values.
     */
    public static class DoubleCborUnmarshaller implements Unmarshaller<Double, JsonUnmarshallerContext> {
        public Double unmarshall(JsonUnmarshallerContext unmarshallerContext) throws Exception {
            return unmarshallerContext.getJsonParser().getDoubleValue();
        }

        private static final DoubleCborUnmarshaller instance = new DoubleCborUnmarshaller();

        public static DoubleCborUnmarshaller getInstance() {
            return instance;
        }
    }

    /**
     * Unmarshaller for Integer values.
     */
    public static class IntegerCborUnmarshaller implements Unmarshaller<Integer, JsonUnmarshallerContext> {
        public Integer unmarshall(JsonUnmarshallerContext unmarshallerContext) throws Exception {
            return unmarshallerContext.getJsonParser().getIntValue();
        }

        private static final IntegerCborUnmarshaller instance = new IntegerCborUnmarshaller();

        public static IntegerCborUnmarshaller getInstance() {
            return instance;
        }
    }

    public static class BigIntegerCborUnmarshaller implements Unmarshaller<BigInteger, JsonUnmarshallerContext> {
        public BigInteger unmarshall(JsonUnmarshallerContext unmarshallerContext) throws Exception {
            JsonParser parser = unmarshallerContext.getJsonParser();
            JsonToken current = parser.getCurrentToken();
            if (current == JsonToken.VALUE_NUMBER_INT) {
                return parser.getBigIntegerValue();
            } else if (current == JsonToken.VALUE_EMBEDDED_OBJECT) {
                Object embedded = parser.getEmbeddedObject();
                return new BigInteger((byte[]) embedded);
            } else {
                throw new SdkClientException("Invalid BigInteger Format.");
            }
        }

        private static final BigIntegerCborUnmarshaller instance = new BigIntegerCborUnmarshaller();

        public static BigIntegerCborUnmarshaller getInstance() {
            return instance;
        }
    }

    public static class BigDecimalCborUnmarshaller implements Unmarshaller<BigDecimal, JsonUnmarshallerContext> {
        public BigDecimal unmarshall(JsonUnmarshallerContext unmarshallerContext) throws Exception {
            JsonParser parser = unmarshallerContext.getJsonParser();
            Unmarshaller<BigInteger, JsonUnmarshallerContext> bigIntegerUnmarshaller = unmarshallerContext.getUnmarshaller(BigInteger.class);

            JsonToken current = parser.getCurrentToken();
            if (current != JsonToken.START_ARRAY) {
                throw new SdkClientException("Invalid BigDecimal Format.");
            }
            parser.nextToken();
            int exponent = parser.getIntValue();
            parser.nextToken();
            BigInteger mantissa = bigIntegerUnmarshaller.unmarshall(unmarshallerContext);
            return new BigDecimal(mantissa, exponent);
        }

        private static final BigDecimalCborUnmarshaller instance = new BigDecimalCborUnmarshaller();

        public static BigDecimalCborUnmarshaller getInstance() {
            return instance;
        }
    }

    /**
     * Unmarshaller for Boolean values.
     */
    public static class BooleanCborUnmarshaller implements Unmarshaller<Boolean, JsonUnmarshallerContext> {
        public Boolean unmarshall(JsonUnmarshallerContext unmarshallerContext) throws Exception {
            return unmarshallerContext.getJsonParser().getBooleanValue();
        }

        private static final BooleanCborUnmarshaller instance = new BooleanCborUnmarshaller();

        public static BooleanCborUnmarshaller getInstance() {
            return instance;
        }
    }

    /**
     * Unmarshaller for Float values.
     */
    public static class FloatCborUnmarshaller implements Unmarshaller<Float, JsonUnmarshallerContext> {
        public Float unmarshall(JsonUnmarshallerContext unmarshallerContext) throws Exception {
            return unmarshallerContext.getJsonParser().getFloatValue();
        }

        private static final FloatCborUnmarshaller instance = new FloatCborUnmarshaller();

        public static FloatCborUnmarshaller getInstance() {
            return instance;
        }
    }

    /**
     * Unmarshaller for Long values.
     */
    public static class LongCborUnmarshaller implements Unmarshaller<Long, JsonUnmarshallerContext> {
        public Long unmarshall(JsonUnmarshallerContext unmarshallerContext) throws Exception {
            return unmarshallerContext.getJsonParser().getLongValue();
        }

        private static final LongCborUnmarshaller instance = new LongCborUnmarshaller();

        public static LongCborUnmarshaller getInstance() {
            return instance;
        }
    }

    /**
     * Unmarshaller for Byte values.
     */
    public static class ByteCborUnmarshaller implements Unmarshaller<Byte, JsonUnmarshallerContext> {
        public Byte unmarshall(JsonUnmarshallerContext unmarshallerContext) throws Exception {
            return unmarshallerContext.getJsonParser().getByteValue();
        }

        private static final ByteCborUnmarshaller instance = new ByteCborUnmarshaller();

        public static ByteCborUnmarshaller getInstance() {
            return instance;
        }
    }

    /**
     * Unmarshaller for Date values - JSON dates come in as epoch seconds.
     */
    public static class DateCborUnmarshaller implements Unmarshaller<Date, JsonUnmarshallerContext> {
        public Date unmarshall(JsonUnmarshallerContext unmarshallerContext)
                throws Exception {
            return new Date(unmarshallerContext.getJsonParser().getLongValue());
        }

        private static final DateCborUnmarshaller instance = new DateCborUnmarshaller();

        public static DateCborUnmarshaller getInstance() {
            return instance;
        }
    }

    /**
     * Unmarshaller for ByteBuffer values.
     */
    public static class ByteBufferCborUnmarshaller implements Unmarshaller<ByteBuffer, JsonUnmarshallerContext> {
        public ByteBuffer unmarshall(JsonUnmarshallerContext unmarshallerContext) throws Exception {
            return ByteBuffer.wrap(unmarshallerContext.getJsonParser().getBinaryValue());

        }

        private static final ByteBufferCborUnmarshaller instance = new ByteBufferCborUnmarshaller();

        public static ByteBufferCborUnmarshaller getInstance() {
            return instance;
        }
    }

    /**
     * Unmarshaller for Short values.
     */
    public static class ShortCborUnmarshaller implements Unmarshaller<Short, JsonUnmarshallerContext> {
        public Short unmarshall(JsonUnmarshallerContext unmarshallerContext) throws Exception {
            return unmarshallerContext.getJsonParser().getShortValue();
        }

        private static final ShortCborUnmarshaller instance = new ShortCborUnmarshaller();

        public static ShortCborUnmarshaller getInstance() {
            return instance;
        }
    }
}