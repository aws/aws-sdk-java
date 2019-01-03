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
package com.amazonaws.services.dynamodbv2.datamodeling;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.pojos.SubClass;
import com.amazonaws.services.dynamodbv2.pojos.TestClass;
import com.amazonaws.services.dynamodbv2.pojos.UnannotatedSubClass;

public class StandardModelFactoriesV2Test {

    protected static final DynamoDBMapperConfig CONFIG = new DynamoDBMapperConfig.Builder()
        .withTypeConverterFactory(DynamoDBMapperConfig.DEFAULT.getTypeConverterFactory())
        .withConversionSchema(ConversionSchemas.V2)
        .build();

    private static final DynamoDBMapperModelFactory factory = StandardModelFactories.of(S3Link.Factory.of(null));
    private static final DynamoDBMapperModelFactory.TableFactory models = factory.getTableFactory(CONFIG);

    protected <T> AttributeValue convert(Class<T> clazz, Method getter, Object value) {
        final StandardAnnotationMaps.FieldMap<Object> map = StandardAnnotationMaps.of(getter, null);
        return models.getTable(clazz).field(map.attributeName()).convert(value);
    }

    @Test
    public void testBoolean() {
        // These are all native booleans by default in the v2 schema
        assertEquals(true, convert("getBoolean", true).getBOOL());
        assertEquals(false, convert("getBoolean", false).getBOOL());
        assertEquals(true, convert("getBoxedBoolean", true).getBOOL());
        assertEquals(false, convert("getBoxedBoolean", false).getBOOL());
        assertEquals(true, convert("getNativeBoolean", true).getBOOL());
        assertEquals(false, convert("getNativeBoolean", false).getBOOL());
    }

    @Test
    public void testString() {
        assertEquals("abc", convert("getString", "abc").getS());

        assertEquals(RandomUUIDMarshaller.randomUUID,
                convert("getCustomString", "abc").getS());
    }

    @Test
    public void testUuid() {
        UUID uuid = UUID.randomUUID();
        assertEquals(uuid.toString(), convert("getUuid", uuid).getS());
    }

    @Test
    public void testDate() {
        assertEquals("1970-01-01T00:00:00.000Z",
                convert("getDate", new Date(0)).getS());

        Calendar c = GregorianCalendar.getInstance();
        c.setTimeInMillis(0);

        assertEquals("1970-01-01T00:00:00.000Z",
                convert("getCalendar", c).getS());
    }

    @Test
    public void testNumbers() {
        assertEquals("0", convert("getByte", (byte) 0).getN());
        assertEquals("1", convert("getByte", (byte) 1).getN());
        assertEquals("0", convert("getBoxedByte", (byte) 0).getN());
        assertEquals("1", convert("getBoxedByte", (byte) 1).getN());

        assertEquals("0", convert("getShort", (short) 0).getN());
        assertEquals("1", convert("getShort", (short) 1).getN());
        assertEquals("0", convert("getBoxedShort", (short) 0).getN());
        assertEquals("1", convert("getBoxedShort", (short) 1).getN());

        assertEquals("0", convert("getInt", 0).getN());
        assertEquals("1", convert("getInt", 1).getN());
        assertEquals("0", convert("getBoxedInt", 0).getN());
        assertEquals("1", convert("getBoxedInt", 1).getN());

        assertEquals("0", convert("getLong", 0l).getN());
        assertEquals("1", convert("getLong", 1l).getN());
        assertEquals("0", convert("getBoxedLong", 0l).getN());
        assertEquals("1", convert("getBoxedLong", 1l).getN());

        assertEquals("0", convert("getBigInt", BigInteger.ZERO).getN());
        assertEquals("1", convert("getBigInt", BigInteger.ONE).getN());

        assertEquals("0.0", convert("getFloat", 0f).getN());
        assertEquals("1.0", convert("getFloat", 1f).getN());
        assertEquals("0.0", convert("getBoxedFloat", 0f).getN());
        assertEquals("1.0", convert("getBoxedFloat", 1f).getN());

        assertEquals("0.0", convert("getDouble", 0d).getN());
        assertEquals("1.0", convert("getDouble", 1d).getN());
        assertEquals("0.0", convert("getBoxedDouble", 0d).getN());
        assertEquals("1.0", convert("getBoxedDouble", 1d).getN());

        assertEquals("0", convert("getBigDecimal", BigDecimal.ZERO).getN());
        assertEquals("1", convert("getBigDecimal", BigDecimal.ONE).getN());
    }

    @Test
    public void testBinary() {
        ByteBuffer value = ByteBuffer.wrap("value".getBytes());
        assertEquals(value.slice(), convert("getByteArray", "value".getBytes()).getB());
        assertEquals(value.slice(), convert("getByteBuffer", value.slice()).getB());
    }

    @Test
    public void testBooleanSet() {
        // Set<Boolean> (which is silly but technically valid) gets mapped to
        // a List of Booleans now via the ObjectSetToListMarshaller.
        AttributeValue value =
                convert("getBooleanSet", Collections.singleton(true));

        Assert.assertEquals(1, value.getL().size());
        Assert.assertEquals(true, value.getL().get(0).getBOOL());
    }

    @Test
    public void testStringSet() {
        assertEquals(Collections.singletonList("a"),
                convert("getStringSet", Collections.singleton("a")).getSS());
        assertEquals(Collections.singletonList("b"),
                convert("getStringSet", Collections.singleton("b")).getSS());

        assertEquals(Arrays.asList("a", "b", "c"),
                convert("getStringSet", new TreeSet<String>() {{
                    add("a");
                    add("b");
                    add("c");
                }}).getSS());
    }

    @Test
    public void testUuidSet() {
        final UUID one = UUID.randomUUID();
        final UUID two = UUID.randomUUID();
        final UUID three = UUID.randomUUID();

        assertEquals(Collections.singletonList(one.toString()),
                convert("getUuidSet", Collections.singleton(one)).getSS());

        assertEquals(Collections.singletonList(two.toString()),
                convert("getUuidSet", Collections.singleton(two)).getSS());

        assertEquals(
                Arrays.asList(
                        one.toString(),
                        two.toString(),
                        three.toString()),
                convert("getUuidSet", new LinkedHashSet<UUID>() {{
                    add(one);
                    add(two);
                    add(three);
                }}).getSS());
    }

    @Test
    public void testDateSet() {
        assertEquals(Collections.singletonList("1970-01-01T00:00:00.000Z"),
                convert("getDateSet", Collections.singleton(new Date(0)))
                        .getSS());

        Calendar c = GregorianCalendar.getInstance();
        c.setTimeInMillis(0);

        assertEquals(Collections.singletonList("1970-01-01T00:00:00.000Z"),
                convert("getCalendarSet", Collections.singleton(c))
                        .getSS());
    }

    @Test
    public void testNumberSet() {
        assertEquals(Collections.singletonList("0"),
                convert("getByteSet", Collections.singleton((byte) 0)).getNS());
        assertEquals(Collections.singletonList("0"),
                convert("getShortSet", Collections.singleton((short) 0)).getNS());
        assertEquals(Collections.singletonList("0"),
                convert("getIntSet", Collections.singleton(0)).getNS());
        assertEquals(Collections.singletonList("0"),
                convert("getLongSet", Collections.singleton(0l)).getNS());
        assertEquals(Collections.singletonList("0"),
                convert("getBigIntegerSet", Collections.singleton(BigInteger.ZERO))
                    .getNS());
        assertEquals(Collections.singletonList("0.0"),
                convert("getFloatSet", Collections.singleton(0f)).getNS());
        assertEquals(Collections.singletonList("0.0"),
                convert("getDoubleSet", Collections.singleton(0d)).getNS());
        assertEquals(Collections.singletonList("0"),
                convert("getBigDecimalSet", Collections.singleton(BigDecimal.ZERO))
                    .getNS());

        assertEquals(Arrays.asList("0", "1", "2"),
                convert("getLongSet", new TreeSet<Number>() {{
                    add(0);
                    add(1);
                    add(2);
                }}).getNS());
    }

    @Test
    public void testBinarySet() {
        final ByteBuffer test = ByteBuffer.wrap("test".getBytes());
        final ByteBuffer test2 = ByteBuffer.wrap("test2".getBytes());

        assertEquals(Collections.singletonList(test.slice()),
                convert("getByteArraySet", Collections.singleton("test".getBytes()))
                    .getBS());

        assertEquals(Collections.singletonList(test.slice()),
                convert("getByteBufferSet", Collections.singleton(test.slice()))
                    .getBS());

        assertEquals(Arrays.asList(test.slice(), test2.slice()),
                convert("getByteBufferSet",new TreeSet<ByteBuffer>() {{
                    add(test.slice());
                    add(test2.slice());
                }}).getBS());
    }

    @Test
    public void testObjectSet() {
        AttributeValue value =
                convert("getObjectSet", Collections.singleton(new SubClass()));

        assertEquals(1, value.getL().size());
        assertEquals(new HashMap<String, AttributeValue>() {{
                put("name", new AttributeValue("name"));
                put("value", new AttributeValue().withN("123"));
            }},
            value.getL().get(0).getM());

        assertEquals(Arrays.asList(new AttributeValue().withNULL(true)),
                convert("getObjectSet", Collections.<SubClass>singleton(null)).getL());
    }

    @Test
    public void testList() {
        assertEquals(Arrays.asList(
                    new AttributeValue("a"),
                    new AttributeValue("b"),
                    new AttributeValue("c")),
                convert("getList", Arrays.asList("a", "b", "c")).getL());

        assertEquals(Arrays.asList(new AttributeValue().withNULL(true)),
                convert("getList", Collections.<String>singletonList(null)).getL());
    }

    @Test
    public void testObjectList() {
        AttributeValue value = convert(
                "getObjectList",
                Collections.singletonList(new SubClass()));

        assertEquals(1, value.getL().size());
        assertEquals(new HashMap<String, AttributeValue>() {{
                put("name", new AttributeValue("name"));
                put("value", new AttributeValue().withN("123"));
            }},
            value.getL().get(0).getM());
    }

    @Test
    public void testSetList() {
        assertEquals(
                Arrays.asList(new AttributeValue().withSS("a")),
                convert("getSetList", Arrays.asList(
                        Collections.<String>singleton("a"))).getL());

        List<Set<String>> list = new ArrayList<Set<String>>();
        list.add(null);

        assertEquals(
                Arrays.asList(new AttributeValue().withNULL(true)),
                convert("getSetList", list).getL());
    }

    @Test
    public void testMap() {
        assertEquals(new HashMap<String, AttributeValue>() {{
                put("a", new AttributeValue("b"));
                put("c", new AttributeValue("d"));
                put("e", new AttributeValue("f"));
            }},
            convert("getMap", new HashMap<String, String>() {{
                put("a", "b");
                put("c", "d");
                put("e", "f");
            }}).getM());

        assertEquals(Collections.singletonMap("a", new AttributeValue().withNULL(true)),
                convert("getMap", Collections.<String, String>singletonMap("a", null)).getM());
    }

    @Test
    public void testSetMap() {
        assertEquals(new HashMap<String, AttributeValue>() {{
                put("a", new AttributeValue().withSS("a", "b"));
            }},
            convert("getSetMap", new HashMap<String, Set<String>>() {{
                put("a", new TreeSet<String>(Arrays.asList("a", "b")));
            }}).getM());

        assertEquals(new HashMap<String, AttributeValue>() {{
                put("a", new AttributeValue().withSS("a"));
                put("b", new AttributeValue().withNULL(true));
            }},
            convert("getSetMap", new HashMap<String, Set<String>>() {{
                put("a", new TreeSet<String>(Arrays.asList("a")));
                put("b", null);
            }}).getM());
    }

    @Test
    public void testObject() {
        assertEquals(new HashMap<String, AttributeValue>() {{
                put("name", new AttributeValue("name"));
                put("value", new AttributeValue().withN("123"));
            }},
            convert("getObject", new SubClass()).getM());
    }

    @Test
    public void testUnannotatedObject() throws Exception {
        try {
            convert(UnannotatedSubClass.class, UnannotatedSubClass.class.getMethod("getChild"),
                    new UnannotatedSubClass());

            Assert.fail("Expected DynamoDBMappingException");
        } catch (DynamoDBMappingException e) {
        }
    }

    @Test
    public void testS3Link() {
        S3ClientCache cache = new S3ClientCache((AWSCredentialsProvider) null);
        S3Link link = new S3Link(cache, "bucket", "key");

        assertEquals("{\"s3\":{"
                     + "\"bucket\":\"bucket\","
                     + "\"key\":\"key\","
                     + "\"region\":null}}",
                convert("getS3Link", link).getS());
    }

    private AttributeValue convert(String getter, Object value) {
        try {

            return convert(TestClass.class, TestClass.class.getMethod(getter), value);

        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
