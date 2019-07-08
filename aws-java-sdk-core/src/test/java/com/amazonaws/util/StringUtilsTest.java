/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is
 * distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either
 * express or implied. See the License for the specific language
 * governing
 * permissions and limitations under the License.
 */
package com.amazonaws.util;

import static com.amazonaws.util.StringUtils.UTF8;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

import org.hamcrest.Matchers;
import org.hamcrest.core.IsEqual;
import org.hamcrest.text.IsEmptyString;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for the StringUtils class.
 */
public class StringUtilsTest {

    @Rule
    public final ExpectedException thrown = ExpectedException.none();

    /**
     * Tests that {@link StringUtils#fromByteBuffer(ByteBuffer)} correctly
     * base64 encodes the contents in a ByteBuffer and returns the correct
     * result.
     */
    @Test
    public void testFromByteBuffer() {
        String expectedData = "hello world";
        String expectedEncodedData = "aGVsbG8gd29ybGQ=";

        ByteBuffer byteBuffer = ByteBuffer.wrap(expectedData.getBytes());
        String encodedData = StringUtils.fromByteBuffer(byteBuffer);

        assertEquals(expectedEncodedData, encodedData);
    }

    @Test
    public void testToInteger() {
        assertEquals(new Integer(1),
                StringUtils.toInteger(new StringBuilder("1")));
        assertEquals(new Integer(123),
                StringUtils.toInteger(new StringBuilder("123")));
    }

    @Test
    public void testToString() {
        assertEquals("foo", StringUtils.toString(new StringBuilder("foo")));
        assertEquals("123", StringUtils.toString(new StringBuilder("123")));
    }

    @Test
    public void testToBoolean() {
        assertFalse(StringUtils.toBoolean(new StringBuilder("true")));
        assertFalse(StringUtils.toBoolean(new StringBuilder("false")));
    }

    @Test
    public void testFromInteger() {
        assertEquals("1", StringUtils.fromInteger(1));
        assertEquals("123", StringUtils.fromInteger(123));
    }

    @Test
    public void testFromLong() {
        assertEquals("1", StringUtils.fromLong(1L));
        assertEquals("12345678901234", StringUtils.fromLong(12345678901234L));
    }

    @Test
    public void testFromShort() {
        assertEquals("1", StringUtils.fromShort((short) 1));
        assertEquals("1234", StringUtils.fromShort((short) 1234));
    }

    @Test
    public void testFromString() {
        assertEquals("foo", StringUtils.fromString("foo"));
        assertEquals("123", StringUtils.fromString("123"));
    }

    @Test
    public void testFromBoolean() {
        assertEquals("true", StringUtils.fromBoolean(true));
        assertEquals("false", StringUtils.fromBoolean(false));
    }

    @Test
    public void testFromBigInteger() {
        assertEquals("1", StringUtils.fromBigInteger(BigInteger.ONE));
        assertEquals("0", StringUtils.fromBigInteger(BigInteger.ZERO));
        assertEquals("10", StringUtils.fromBigInteger(BigInteger.TEN));
        assertEquals("4",
                StringUtils.fromBigInteger(new BigInteger(new byte[]{4})));
    }

    @Test
    public void testFromBigDecimal() {
        assertEquals("1", StringUtils.fromBigDecimal(new BigDecimal(1)));
        assertEquals("1.229999999999999982236431605997495353221893310546875",
                StringUtils.fromBigDecimal(new BigDecimal(1.23)));
    }

    @Test
    public void testToBigInteger() {
        assertEquals(BigInteger.ONE, StringUtils.toBigInteger("1"));
        assertEquals(new BigInteger(new byte[]{123}),
                StringUtils.toBigInteger("123"));
    }

    @Test
    public void testToBigDecimal() {
        assertEquals(new BigDecimal(1), StringUtils.toBigDecimal("1"));
        assertEquals(new BigDecimal(1.23), StringUtils.toBigDecimal(
                "1.229999999999999982236431605997495353221893310546875"));
    }

    @Test
    public void testFromFloat() {
        assertEquals("1.0", StringUtils.fromFloat(1.0f));
        assertEquals("1.23", StringUtils.fromFloat(1.23f));
    }

    @Test
    public void testFromDate() {
        assertEquals("2019-01-04T11:22:33.000Z", StringUtils
                .fromDate(new Date(1546600953000L)));
        assertEquals("Fri, 04 Jan 2019 11:22:33 GMT", StringUtils
                .fromDate(new Date(1546600953000L), "rfc822"));
        assertEquals("2019-01-04T11:22:33.000Z", StringUtils
                .fromDate(new Date(1546600953000L), "iso8601"));
        assertEquals("1546600953.000", StringUtils
                .fromDate(new Date(1546600953000L), "unixTimestamp"));
        assertEquals("1546600953000", StringUtils
                .fromDate(new Date(1546600953000L), "unixTimestampInMillis"));

        thrown.expect(IllegalArgumentException.class);
        StringUtils.fromDate(new Date(1546600953000L), "foo");
    }

    @Test
    public void testFromDouble() {
        assertEquals("1.0", StringUtils.fromDouble(1.0));
        assertEquals("12.34", StringUtils.fromDouble(12.34));
    }

    @Test
    public void testJoin() {
        assertEquals("bfooafoor", StringUtils.join("foo", "b", "a", "r"));
    }

    @Test
    public void testTrim() {
        assertNull(StringUtils.trim(null));
        assertEquals("foo", StringUtils.trim("foo"));
        assertEquals("foo", StringUtils.trim("foo "));
        assertEquals("foo", StringUtils.trim(" foo"));
        assertEquals("foo", StringUtils.trim(" foo "));
        assertEquals("f o o", StringUtils.trim(" f o o "));
    }

    /**
     * Tests that we can correctly convert Bytes to strings.
     */
    @Test
    public void testFromByte() {
        assertEquals("123", StringUtils.fromByte(new Byte("123")));
        assertEquals("-99", StringUtils.fromByte(new Byte("-99")));
    }

    @Test
    public void testUTF8Charset() {
        assertEquals(UTF8.displayName(), "UTF-8");
    }

    /**
     * @see https://github.com/aws/aws-sdk-java/pull/517
     */
    @Test(timeout = 10 * 1000)
    public void replace_ReplacementStringContainsMatchString_DoesNotCauseInfiniteLoop() {
        assertEquals("aabc", StringUtils.replace("abc", "a", "aa"));
    }

    @Test
    public void replace_EmptyReplacementString_RemovesAllOccurencesOfMatchString() {
        assertEquals("bbb", StringUtils.replace("ababab", "a", ""));
    }

    @Test
    public void replace_MatchNotFound_ReturnsOriginalString() {
        assertEquals("abc", StringUtils.replace("abc", "d", "e"));
    }

    @Test
    public void lowerCase_NonEmptyString() {
        String input = "x-amz-InvocAtion-typE";
        String expected = "x-amz-invocation-type";
        assertEquals(expected, StringUtils.lowerCase(input));
    }

    @Test
    public void lowerCase_NullString() {
        assertNull(StringUtils.lowerCase(null));
    }

    @Test
    public void lowerCase_EmptyString() {
        Assert.assertThat(StringUtils.lowerCase(""), Matchers.isEmptyString());
    }

    @Test
    public void upperCase_NonEmptyString() {
        String input = "dHkdjj139_)(e";
        String expected = "DHKDJJ139_)(E";
        assertEquals(expected, StringUtils.upperCase(input));
    }

    @Test
    public void upperCase_NullString() {
        assertNull(StringUtils.upperCase((null)));
    }

    @Test
    public void upperCase_EmptyString() {
        Assert.assertThat(StringUtils.upperCase(""), Matchers.isEmptyString());
    }

    @Test
    public void testCompare() {
        assertTrue(StringUtils.compare("truck", "Car") > 0);
        assertTrue(StringUtils.compare("", "dd") < 0);
        assertTrue(StringUtils.compare("dd", "") > 0);
        assertEquals(0, StringUtils.compare("", ""));
        assertTrue(StringUtils.compare(" ", "") > 0);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testCompare_String1Null() {
        String str1 = null;
        String str2 = "test";
        int result = StringUtils.compare(str1, str2);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testCompare_String2Null() {
        String str1 = "test";
        String str2 = null;
        int result = StringUtils.compare(str1, str2);
    }

    @Test
    public void testAppendAndCompact() {
        String[] pieces = { " ", "\t", "\n", "\u000b", "\r", "\f", "word", "foo", "bar", "baq"};
        int ITERATIONS = 10000;
        Random rng = new Random();

        for(int i=0; i<ITERATIONS; i++) {
            int parts = rng.nextInt(10);
            String s = "";
            for(int j=0; j<parts; j++ ) {
               s = s + pieces[rng.nextInt(pieces.length)];
            }

            StringBuilder sb = new StringBuilder();
            StringUtils.appendCompactedString(sb, s);
            String compacted = s.replaceAll("\\s+",  " ");
            assertEquals('['+compacted+']', sb.toString(), compacted);
        }
    }

    @Test
    public void begins_with_ignore_case() {
        Assert.assertTrue(StringUtils.beginsWithIgnoreCase("foobar", "FoO"));
    }

    @Test
    public void begins_with_ignore_case_returns_false_when_seq_doesnot_match() {
        Assert.assertFalse(StringUtils.beginsWithIgnoreCase("foobar", "baz"));
    }

    @Test
    public void hasValue() {
        Assert.assertTrue(StringUtils.hasValue("something"));
        Assert.assertFalse(StringUtils.hasValue(null));
        Assert.assertFalse(StringUtils.hasValue(""));
    }
}
