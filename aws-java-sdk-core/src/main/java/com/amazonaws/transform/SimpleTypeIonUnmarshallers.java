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
package com.amazonaws.transform;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Date;

public class SimpleTypeIonUnmarshallers {
    public static class StringIonUnmarshaller implements Unmarshaller<String, JsonUnmarshallerContext> {
        @Override
        public String unmarshall(JsonUnmarshallerContext context) throws Exception {
            return context.readText();
        }

        private static final StringIonUnmarshaller instance = new StringIonUnmarshaller();

        public static StringIonUnmarshaller getInstance() {
            return instance;
        }
    }


    public static class DoubleIonUnmarshaller implements Unmarshaller<Double, JsonUnmarshallerContext> {
        @Override
        public Double unmarshall(JsonUnmarshallerContext context) throws Exception {
            return context.getJsonParser().getDoubleValue();
        }

        private static final DoubleIonUnmarshaller instance = new DoubleIonUnmarshaller();

        public static DoubleIonUnmarshaller getInstance() {
            return instance;
        }
    }

    public static class IntegerIonUnmarshaller implements Unmarshaller<Integer, JsonUnmarshallerContext> {
        @Override
        public Integer unmarshall(JsonUnmarshallerContext context) throws Exception {
            return context.getJsonParser().getIntValue();
        }

        private static final IntegerIonUnmarshaller instance = new IntegerIonUnmarshaller();

        public static IntegerIonUnmarshaller getInstance() {
            return instance;
        }
    }

    public static class BigIntegerIonUnmarshaller implements Unmarshaller<BigInteger, JsonUnmarshallerContext> {
        @Override
        public BigInteger unmarshall(JsonUnmarshallerContext context) throws Exception {
            return context.getJsonParser().getBigIntegerValue();
        }

        private static final BigIntegerIonUnmarshaller instance = new BigIntegerIonUnmarshaller();

        public static BigIntegerIonUnmarshaller getInstance() {
            return instance;
        }
    }

    public static class BigDecimalIonUnmarshaller implements Unmarshaller<BigDecimal, JsonUnmarshallerContext> {
        @Override
        public BigDecimal unmarshall(JsonUnmarshallerContext context) throws Exception {
            return context.getJsonParser().getDecimalValue();
        }

        private static final BigDecimalIonUnmarshaller instance = new BigDecimalIonUnmarshaller();

        public static BigDecimalIonUnmarshaller getInstance() {
            return instance;
        }
    }

    public static class BooleanIonUnmarshaller implements Unmarshaller<Boolean, JsonUnmarshallerContext> {
        @Override
        public Boolean unmarshall(JsonUnmarshallerContext context) throws Exception {
            return context.getJsonParser().getBooleanValue();
        }

        private static final BooleanIonUnmarshaller instance = new BooleanIonUnmarshaller();

        public static BooleanIonUnmarshaller getInstance() {
            return instance;
        }
    }

    public static class FloatIonUnmarshaller implements Unmarshaller<Float, JsonUnmarshallerContext> {
        @Override
        public Float unmarshall(JsonUnmarshallerContext context) throws Exception {
            return context.getJsonParser().getFloatValue();
        }

        private static final FloatIonUnmarshaller instance = new FloatIonUnmarshaller();

        public static FloatIonUnmarshaller getInstance() {
            return instance;
        }
    }

    public static class LongIonUnmarshaller implements Unmarshaller<Long, JsonUnmarshallerContext> {
        @Override
        public Long unmarshall(JsonUnmarshallerContext context) throws Exception {
            return context.getJsonParser().getLongValue();
        }

        private static final LongIonUnmarshaller instance = new LongIonUnmarshaller();

        public static LongIonUnmarshaller getInstance() {
            return instance;
        }
    }

    public static class ByteIonUnmarshaller implements Unmarshaller<Byte, JsonUnmarshallerContext> {
        @Override
        public Byte unmarshall(JsonUnmarshallerContext context) throws Exception {
            return context.getJsonParser().getByteValue();
        }

        private static final ByteIonUnmarshaller instance = new ByteIonUnmarshaller();

        public static ByteIonUnmarshaller getInstance() {
            return instance;
        }
    }

    public static class DateIonUnmarshaller implements Unmarshaller<Date, JsonUnmarshallerContext> {
        @Override
        public Date unmarshall(JsonUnmarshallerContext context) throws Exception {
            return (Date) context.getJsonParser().getEmbeddedObject();
        }

        private static final DateIonUnmarshaller instance = new DateIonUnmarshaller();

        public static DateIonUnmarshaller getInstance() {
            return instance;
        }
    }

    public static class ByteBufferIonUnmarshaller implements Unmarshaller<ByteBuffer, JsonUnmarshallerContext> {
        @Override
        public ByteBuffer unmarshall(JsonUnmarshallerContext context) throws Exception {
            return (ByteBuffer) context.getJsonParser().getEmbeddedObject();
        }

        private static final ByteBufferIonUnmarshaller instance = new ByteBufferIonUnmarshaller();

        public static ByteBufferIonUnmarshaller getInstance() {
            return instance;
        }
    }

    public static class ShortIonUnmarshaller implements Unmarshaller<Short, JsonUnmarshallerContext> {
        @Override
        public Short unmarshall(JsonUnmarshallerContext context) throws Exception {
            return context.getJsonParser().getShortValue();
        }

        private static final ShortIonUnmarshaller instance = new ShortIonUnmarshaller();

        public static ShortIonUnmarshaller getInstance() {
            return instance;
        }
    }
}
