/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.datamodeling;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import static com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGenerateStrategy.ALWAYS;
import static com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGenerateStrategy.CREATE;

import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.Test;

/**
 * Unit tests for {@code DynamoDBAutoGeneratorRegistry}.
 */
public class DynamoDBAutoGeneratorRegistryTest {

    /**
     * The auto-generator registry.
     */
    private final DynamoDBAutoGeneratorRegistry registry = new DynamoDBAutoGeneratorRegistry();

    /**
     * Test {@code neverGeneratorOf} with {@code Object} type.
     */
    @Test(expected=DynamoDBMappingException.class)
    public void testNeverGeneratorOfObject() {
        final DynamoDBAutoGeneratorRegistry.Generator<Object> generator = registry.neverGeneratorOf(Object.class);
        assertFalse(generator.canGenerate(null));
        generator.generate(null);
    }

    /**
     * Test {@code keyGeneratorOf} with {@code Object} type.
     */
    @Test(expected=DynamoDBMappingException.class)
    public void testKeyGeneratorOfObject() {
        final DynamoDBAutoGeneratorRegistry.Generator<Object> generator = registry.keyGeneratorOf(Object.class);
        assertTrue(generator.canGenerate(null));
        generator.generate(null);
    }

    /**
     * Test {@code keyGeneratorOf} with {@code String} type.
     */
    @Test
    public void testKeyGeneratorOfString() {
        final DynamoDBAutoGeneratorRegistry.Generator<Object> generator = registry.keyGeneratorOf(String.class);
        assertTrue(generator.canGenerate(null));
        assertNotNull(generator.generate(null));
    }

    /**
     * Test {@code keyGeneratorOf} with {@code String} type.
     */
    @Test
    public void testKeyGeneratorOfStringNotNull() {
        final DynamoDBAutoGeneratorRegistry.Generator<Object> generator = registry.keyGeneratorOf(String.class);
        assertFalse(generator.canGenerate(UUID.randomUUID().toString()));
        assertNotNull(generator.generate(UUID.randomUUID().toString()));
    }

    /**
     * Test {@code versionGeneratorOf} with {@code Object} type.
     */
    @Test(expected=DynamoDBMappingException.class)
    public void testVersionGeneratorOfObject() {
        final DynamoDBAutoGeneratorRegistry.Generator<Object> generator = registry.versionGeneratorOf(Object.class);
        assertTrue(generator.canGenerate(null));
        generator.generate(null);
    }

    /**
     * Test {@code versionGeneratorOf} with {@code BigInteger} type.
     */
    @Test
    public void testVersionGeneratorOfBigInteger() {
        final DynamoDBAutoGeneratorRegistry.Generator<Object> generator = registry.versionGeneratorOf(BigInteger.class);
        assertTrue(generator.canGenerate(null));
        assertEquals(BigInteger.ONE, generator.generate(null));
    }

    /**
     * Test {@code versionGeneratorOf} with {@code BigInteger} type.
     */
    @Test
    public void testVersionGeneratorOfBigIntegerNotNull() {
        final DynamoDBAutoGeneratorRegistry.Generator<Object> generator = registry.versionGeneratorOf(BigInteger.class);
        assertTrue(generator.canGenerate(BigInteger.valueOf(1)));
        assertEquals(BigInteger.valueOf(2), generator.generate(BigInteger.valueOf(1)));
    }

    /**
     * Test {@code versionGeneratorOf} with {@code Byte} type.
     */
    @Test
    public void testVersionGeneratorOfByte() {
        final DynamoDBAutoGeneratorRegistry.Generator<Object> generator = registry.versionGeneratorOf(Byte.class);
        assertTrue(generator.canGenerate(null));
        assertEquals(Byte.valueOf((byte)1), generator.generate(null));
    }

    /**
     * Test {@code versionGeneratorOf} with {@code Byte} type.
     */
    @Test
    public void testVersionGeneratorOfByteNotNull() {
        final DynamoDBAutoGeneratorRegistry.Generator<Object> generator = registry.versionGeneratorOf(Byte.class);
        assertTrue(generator.canGenerate(Byte.valueOf((byte)1)));
        assertEquals(Byte.valueOf((byte)2), generator.generate(Byte.valueOf((byte)1)));
    }

    /**
     * Test {@code versionGeneratorOf} with {@code byte} type.
     */
    @Test
    public void testVersionGeneratorOfPrimitiveByte() {
        final DynamoDBAutoGeneratorRegistry.Generator<Object> generator = registry.versionGeneratorOf(byte.class);
        assertTrue(generator.canGenerate(null));
        assertEquals(Byte.valueOf((byte)1), generator.generate(null));
    }

    /**
     * Test {@code versionGeneratorOf} with {@code Integer} type.
     */
    @Test
    public void testVersionGeneratorOfInteger() {
        final DynamoDBAutoGeneratorRegistry.Generator<Object> generator = registry.versionGeneratorOf(Integer.class);
        assertTrue(generator.canGenerate(null));
        assertEquals(Integer.valueOf(1), generator.generate(null));
    }

    /**
     * Test {@code versionGeneratorOf} with {@code Integer} type.
     */
    @Test
    public void testVersionGeneratorOfIntegerNotNull() {
        final DynamoDBAutoGeneratorRegistry.Generator<Object> generator = registry.versionGeneratorOf(Integer.class);
        assertTrue(generator.canGenerate(Integer.valueOf(1)));
        assertEquals(Integer.valueOf(2), generator.generate(Integer.valueOf(1)));
    }

    /**
     * Test {@code versionGeneratorOf} with {@code int} type.
     */
    @Test
    public void testVersionGeneratorOfPrimitiveInteger() {
        final DynamoDBAutoGeneratorRegistry.Generator<Object> generator = registry.versionGeneratorOf(int.class);
        assertTrue(generator.canGenerate(null));
        assertEquals(Integer.valueOf(1), generator.generate(null));
    }

    /**
     * Test {@code versionGeneratorOf} with {@code Long} type.
     */
    @Test
    public void testVersionGeneratorOfLong() {
        final DynamoDBAutoGeneratorRegistry.Generator<Object> generator = registry.versionGeneratorOf(Long.class);
        assertTrue(generator.canGenerate(null));
        assertEquals(Long.valueOf(1L), generator.generate(null));
    }

    /**
     * Test {@code versionGeneratorOf} with {@code Long} type.
     */
    @Test
    public void testVersionGeneratorOfLongNotNull() {
        final DynamoDBAutoGeneratorRegistry.Generator<Object> generator = registry.versionGeneratorOf(Long.class);
        assertTrue(generator.canGenerate(Long.valueOf(1L)));
        assertEquals(Long.valueOf(2L), generator.generate(Long.valueOf(1L)));
    }

    /**
     * Test {@code versionGeneratorOf} with {@code long} type.
     */
    @Test
    public void testVersionGeneratorOfPrimitiveLong() {
        final DynamoDBAutoGeneratorRegistry.Generator<Object> generator = registry.versionGeneratorOf(long.class);
        assertTrue(generator.canGenerate(null));
        assertEquals(Long.valueOf(1L), generator.generate(null));
    }

    /**
     * Test {@code versionGeneratorOf} with {@code Short} type.
     */
    @Test
    public void testVersionGeneratorOfShort() {
        final DynamoDBAutoGeneratorRegistry.Generator<Object> generator = registry.versionGeneratorOf(Short.class);
        assertTrue(generator.canGenerate(null));
        assertEquals(Short.valueOf((short)1), generator.generate(null));
    }

    /**
     * Test {@code versionGeneratorOf} with {@code Short} type.
     */
    @Test
    public void testVersionGeneratorOfShortNotNull() {
        final DynamoDBAutoGeneratorRegistry.Generator<Object> generator = registry.versionGeneratorOf(Short.class);
        assertTrue(generator.canGenerate(Short.valueOf((short)1)));
        assertEquals(Short.valueOf((short)2), generator.generate(Short.valueOf((short)1)));
    }

    /**
     * Test {@code versionGeneratorOf} with {@code short} type.
     */
    @Test
    public void testVersionGeneratorOfPrimitiveShort() {
        final DynamoDBAutoGeneratorRegistry.Generator<Object> generator = registry.versionGeneratorOf(short.class);
        assertTrue(generator.canGenerate(null));
        assertEquals(Short.valueOf((short)1), generator.generate(null));
    }

    /**
     * Test {@code timestampGeneratorOf} with {@code Object} type.
     */
    @Test(expected=DynamoDBMappingException.class)
    public void testTimestampGeneratorOfObjectOnAlways() {
        final DynamoDBAutoGeneratorRegistry.Generator<Object> generator = registry.timestampGeneratorOf(Object.class, ALWAYS);
        assertTrue(generator.canGenerate(null));
        generator.generate(null);
    }

    /**
     * Test {@code timestampGeneratorOf} with {@code Object} type.
     */
    @Test(expected=DynamoDBMappingException.class)
    public void testTimestampGeneratorOfObjectOnCreate() {
        final DynamoDBAutoGeneratorRegistry.Generator<Object> generator = registry.timestampGeneratorOf(Object.class, CREATE);
        assertTrue(generator.canGenerate(null));
        generator.generate(null);
    }

    /**
     * Test {@code timestampGeneratorOf} with {@code Calendar} type.
     */
    @Test
    public void testTimestampGeneratorOfCalendarOnAlways() {
        final DynamoDBAutoGeneratorRegistry.Generator<Object> generator = registry.timestampGeneratorOf(Calendar.class, ALWAYS);
        assertTrue(generator.canGenerate(null));
        assertNotNull(generator.generate(null));
    }

    /**
     * Test {@code timestampGeneratorOf} with {@code Calendar} type.
     */
    @Test
    public void testTimestampGeneratorOfCalendarOnAlwaysNotNull() {
        final DynamoDBAutoGeneratorRegistry.Generator<Object> generator = registry.timestampGeneratorOf(Calendar.class, ALWAYS);
        assertTrue(generator.canGenerate(Calendar.getInstance()));
        assertNotNull(generator.generate(Calendar.getInstance()));
    }

    /**
     * Test {@code timestampGeneratorOf} with {@code Calendar} type.
     */
    @Test
    public void testTimestampGeneratorOfCalendarOnCreate() {
        final DynamoDBAutoGeneratorRegistry.Generator<Object> generator = registry.timestampGeneratorOf(Calendar.class, CREATE);
        assertTrue(generator.canGenerate(null));
        assertNotNull(generator.generate(null));
    }

    /**
     * Test {@code timestampGeneratorOf} with {@code Calendar} type.
     */
    @Test
    public void testTimestampGeneratorOfCalendarOnCreateNotNull() {
        final DynamoDBAutoGeneratorRegistry.Generator<Object> generator = registry.timestampGeneratorOf(Calendar.class, CREATE);
        assertFalse(generator.canGenerate(Calendar.getInstance()));
        assertNotNull(generator.generate(Calendar.getInstance()));
    }

    /**
     * Test {@code timestampGeneratorOf} with {@code Date} type.
     */
    @Test
    public void testTimestampGeneratorOfDateOnAlways() {
        final DynamoDBAutoGeneratorRegistry.Generator<Object> generator = registry.timestampGeneratorOf(Date.class, ALWAYS);
        assertTrue(generator.canGenerate(null));
        assertNotNull(generator.generate(null));
    }

    /**
     * Test {@code timestampGeneratorOf} with {@code Date} type.
     */
    @Test
    public void testTimestampGeneratorOfDateOnAlwaysNotNull() {
        final DynamoDBAutoGeneratorRegistry.Generator<Object> generator = registry.timestampGeneratorOf(Date.class, ALWAYS);
        assertTrue(generator.canGenerate(Calendar.getInstance().getTime()));
        assertNotNull(generator.generate(Calendar.getInstance().getTime()));
    }

    /**
     * Test {@code timestampGeneratorOf} with {@code Date} type.
     */
    @Test
    public void testTimestampGeneratorOfDateOnCreate() {
        final DynamoDBAutoGeneratorRegistry.Generator<Object> generator = registry.timestampGeneratorOf(Date.class, CREATE);
        assertTrue(generator.canGenerate(null));
        assertNotNull(generator.generate(null));
    }

    /**
     * Test {@code timestampGeneratorOf} with {@code Date} type.
     */
    @Test
    public void testTimestampGeneratorOfDateOnCreateNotNull() {
        final DynamoDBAutoGeneratorRegistry.Generator<Object> generator = registry.timestampGeneratorOf(Date.class, CREATE);
        assertFalse(generator.canGenerate(Calendar.getInstance().getTime()));
        assertNotNull(generator.generate(Calendar.getInstance().getTime()));
    }

    /**
     * Test {@code timestampGeneratorOf} with {@code Long} type.
     */
    @Test
    public void testTimestampGeneratorOfLongOnAlways() {
        final DynamoDBAutoGeneratorRegistry.Generator<Object> generator = registry.timestampGeneratorOf(Long.class, ALWAYS);
        assertTrue(generator.canGenerate(null));
        assertNotNull(generator.generate(null));
    }

    /**
     * Test {@code timestampGeneratorOf} with {@code Long} type.
     */
    @Test
    public void testTimestampGeneratorOfLongOnAlwaysNotNull() {
        final DynamoDBAutoGeneratorRegistry.Generator<Object> generator = registry.timestampGeneratorOf(Long.class, ALWAYS);
        assertTrue(generator.canGenerate(Calendar.getInstance().getTime().getTime()));
        assertNotNull(generator.generate(Calendar.getInstance().getTime().getTime()));
    }

    /**
     * Test {@code timestampGeneratorOf} with {@code Long} type.
     */
    @Test
    public void testTimestampGeneratorOfLongOnCreate() {
        final DynamoDBAutoGeneratorRegistry.Generator<Object> generator = registry.timestampGeneratorOf(Long.class, CREATE);
        assertTrue(generator.canGenerate(null));
        assertNotNull(generator.generate(null));
    }

    /**
     * Test {@code timestampGeneratorOf} with {@code Long} type.
     */
    @Test
    public void testTimestampGeneratorOfLongOnCreateNotNull() {
        final DynamoDBAutoGeneratorRegistry.Generator<Object> generator = registry.timestampGeneratorOf(Long.class, CREATE);
        assertFalse(generator.canGenerate(Calendar.getInstance().getTime().getTime()));
        assertNotNull(generator.generate(Calendar.getInstance().getTime().getTime()));
    }

}
