/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.nio.ByteBuffer;
import java.util.Date;

import org.w3c.dom.Node;

import com.amazonaws.util.XpathUtils;

/**
 * Collection of unmarshallers for simple data types.
 */
public class SimpleTypeUnmarshallers {
    
    /**
     * Unmarshaller for String values.
     */
    public static class StringUnmarshaller implements Unmarshaller<String, Node> {
        public String unmarshall(Node in) throws Exception {
            return XpathUtils.asString(".", in);
        }

        private static StringUnmarshaller instance;
        public static StringUnmarshaller getInstance() {
            if (instance == null) instance = new StringUnmarshaller();
            return instance;
        }
    }
    
    /**
     * Unmarshaller for Double values.
     */
    public static class DoubleUnmarshaller implements Unmarshaller<Double, Node> {
        public Double unmarshall(Node in) throws Exception {
            return XpathUtils.asDouble(".", in);
        }
        
        private static DoubleUnmarshaller instance;
        public static DoubleUnmarshaller getInstance() {
            if (instance == null) instance = new DoubleUnmarshaller();
            return instance;
        }
    }
    
    /**
     * Unmarshaller for Integer values.
     */
    public static class IntegerUnmarshaller implements Unmarshaller<Integer, Node> {
        public Integer unmarshall(Node in) throws Exception {
            return XpathUtils.asInteger(".", in);
        }

        private static IntegerUnmarshaller instance;
        public static IntegerUnmarshaller getInstance() {
            if (instance == null) instance = new IntegerUnmarshaller();
            return instance;
        }
    }
    
    /**
     * Unmarshaller for Boolean values.
     */
    public static class BooleanUnmarshaller implements Unmarshaller<Boolean, Node> {
        public Boolean unmarshall(Node in) throws Exception {
            return XpathUtils.asBoolean(".", in);
        }

        private static BooleanUnmarshaller instance;
        public static BooleanUnmarshaller getInstance() {
            if (instance == null) instance = new BooleanUnmarshaller();
            return instance;
        }
    }
    
    /**
     * Unmarshaller for Float values.
     */
    public static class FloatUnmarshaller implements Unmarshaller<Float, Node> {
        public Float unmarshall(Node in) throws Exception {
            return XpathUtils.asFloat(".", in);
        }

        private static FloatUnmarshaller instance;
        public static FloatUnmarshaller getInstance() {
            if (instance == null) instance = new FloatUnmarshaller();
            return instance;
        }
    }
    
    /**
     * Unmarshaller for Long values.
     */
    public static class LongUnmarshaller implements Unmarshaller<Long, Node> {
        public Long unmarshall(Node in) throws Exception {
            return XpathUtils.asLong(".", in);
        }

        private static LongUnmarshaller instance;
        public static LongUnmarshaller getInstance() {
            if (instance == null) instance = new LongUnmarshaller();
            return instance;
        }
    }
    
    /**
     * Unmarshaller for Byte values.
     */
    public static class ByteUnmarshaller implements Unmarshaller<Byte, Node> {
        public Byte unmarshall(Node in) throws Exception {
            return XpathUtils.asByte(".", in);
        }

        private static ByteUnmarshaller instance;
        public static ByteUnmarshaller getInstance() {
            if (instance == null) instance = new ByteUnmarshaller();
            return instance;
        }
    }
    
    /**
     * Unmarshaller for Date values.
     */
    public static class DateUnmarshaller implements Unmarshaller<Date, Node> {
        public Date unmarshall(Node in) throws Exception {
            return XpathUtils.asDate(".", in);
        }

        private static DateUnmarshaller instance;
        public static DateUnmarshaller getInstance() {
            if (instance == null) instance = new DateUnmarshaller();
            return instance;
        }
    }
    
    /**
     * Unmarshaller for ByteBuffer values.
     */
    public static class ByteBufferUnmarshaller implements Unmarshaller<ByteBuffer, Node> {
        public ByteBuffer unmarshall(Node in) throws Exception {
            return XpathUtils.asByteBuffer(".", in);
        }

        private static ByteBufferUnmarshaller instance;
        public static ByteBufferUnmarshaller getInstance() {
            if (instance == null) instance = new ByteBufferUnmarshaller();
            return instance;
        }
    }

}
