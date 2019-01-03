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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;

import com.amazonaws.protocol.json.SdkJsonGenerator;
import com.amazonaws.protocol.json.StructuredJsonGenerator;
import com.fasterxml.jackson.core.JsonFactory;

import org.joda.time.DateTime;
import org.joda.time.IllegalFieldValueException;
import org.junit.Test;

public class DateUtilsTest {
    private static final boolean DEBUG = false;
    @Test
    public void tt0031561767() throws ParseException {
        String input = "Fri, 16 May 2014 23:56:46 GMT";
        Date date = DateUtils.parseRFC822Date(input);
        assertEquals(input, DateUtils.formatRFC822Date(date));
    }

    @Test
    public void formatIso8601Date() throws ParseException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        sdf.setTimeZone(new SimpleTimeZone(0, "GMT"));
        String expected = sdf.format(date);
        String actual = DateUtils.formatISO8601Date(date);
        assertEquals(expected, actual);

        Date expectedDate = sdf.parse(expected);
        Date actualDate = DateUtils.parseISO8601Date(actual);
        assertEquals(expectedDate, actualDate);
    }

    @Test
    public void formatRfc822Date() throws ParseException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        sdf.setTimeZone(new SimpleTimeZone(0, "GMT"));
        String expected = sdf.format(date);
        String actual = DateUtils.formatRFC822Date(date);
        assertEquals(expected, actual);

        Date expectedDate = sdf.parse(expected);
        Date actualDate = DateUtils.parseRFC822Date(actual);
        assertEquals(expectedDate, actualDate);
    }

    @Test
    public void parseCompressedIso8601Date() throws ParseException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'");
        sdf.setTimeZone(new SimpleTimeZone(0, "GMT"));
        String formatted = sdf.format(date);
        Date expected = sdf.parse(formatted);
        Date actual = DateUtils.parseCompressedISO8601Date(formatted);
        assertEquals(expected, actual);
    }

    @Test
    public void parseRfc822Date() throws ParseException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        sdf.setTimeZone(new SimpleTimeZone(0, "GMT"));
        String formatted = sdf.format(date);
        Date expected = sdf.parse(formatted);
        Date actual = DateUtils.parseRFC822Date(formatted);
        assertEquals(expected, actual);
    }

    @Test
    public void parseIso8601Date() throws ParseException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        sdf.setTimeZone(new SimpleTimeZone(0, "GMT"));
        String formatted = sdf.format(date);
        String alternative = DateUtils.iso8601DateFormat.print(date.getTime());
        assertEquals(formatted, alternative);

        Date expectedDate = sdf.parse(formatted);
        Date actualDate = DateUtils.parseISO8601Date(formatted);
        assertEquals(expectedDate, actualDate);
    }

    @Test
    public void parseIso8601Date_usingAlternativeFormat() throws ParseException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        sdf.setTimeZone(new SimpleTimeZone(0, "GMT"));
        String formatted = sdf.format(date);
        String alternative = DateUtils.alternateIso8601DateFormat.print(date.getTime());
        assertEquals(formatted, alternative);

        Date expectedDate = sdf.parse(formatted);
        Date actualDate = DateUtils.parseISO8601Date(formatted);
        assertEquals(expectedDate, actualDate);
    }

    @Test
    public void alternateIso8601DateFormat() throws ParseException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        sdf.setTimeZone(new SimpleTimeZone(0, "GMT"));
        String expected = sdf.format(date);
        String actual = DateUtils.alternateIso8601DateFormat.print(date.getTime());
        assertEquals(expected, actual);

        Date expectedDate = sdf.parse(expected);
        DateTime actualDateTime = DateUtils.alternateIso8601DateFormat.parseDateTime(actual);
        assertEquals(expectedDate, new Date(actualDateTime.getMillis()));
    }

    @Test
    public void legacyHandlingOfInvalidDate() throws ParseException {
        final String input = "2014-03-06T14:28:58.000Z.000Z";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        sdf.setTimeZone(new SimpleTimeZone(0, "GMT"));
        sdf.parse(input);
    }

    @Test(expected=IllegalArgumentException.class)
    public void invalidDate() throws ParseException {
        final String input = "2014-03-06T14:28:58.000Z.000Z";
        DateUtils.parseISO8601Date(input);
    }
    @Test
    public void test() throws ParseException {
        Date date = new Date();
        System.out.println("         formatISO8601Date: " + DateUtils.formatISO8601Date(date));
        System.out.println("alternateIso8601DateFormat: " + DateUtils.alternateIso8601DateFormat.print(date.getTime()));
    }

    @Test
    public void testIssue233() throws ParseException {
        // https://github.com/aws/aws-sdk-java/issues/233
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        sdf.setTimeZone(new SimpleTimeZone(0, "GMT"));
        final String edgeCase = "292278994-08-17T07:12:55.807Z";
        Date expected = sdf.parse(edgeCase);
        if (DEBUG)
            System.out.println("date: " + expected);
        String formatted = DateUtils.formatISO8601Date(expected);
        if (DEBUG)
            System.out.println("formatted: " + formatted);
        assertEquals(edgeCase, formatted);
        Date parsed = DateUtils.parseISO8601Date(edgeCase);
        if (DEBUG)
            System.out.println("parsed: " + parsed);
        assertEquals(expected, parsed);
        String reformatted = DateUtils.formatISO8601Date(parsed);
        assertEquals(edgeCase, reformatted);
    }

    @Test(expected=IllegalFieldValueException.class)
    public void testIssue233JodaTimeLimit() throws ParseException {
        // https://github.com/aws/aws-sdk-java/issues/233
        String s = DateUtils.iso8601DateFormat.print(Long.MAX_VALUE);
        System.out.println("s: " + s);
        try {
            DateTime dt = DateUtils.iso8601DateFormat.parseDateTime(s);
            fail("Unexpected success: " + dt);
        } catch(IllegalFieldValueException ex) {
            // expected
            throw ex;
        }
    }

    @Test
    public void testIssueDaysDiff() throws ParseException {
        // https://github.com/aws/aws-sdk-java/issues/233
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        sdf.setTimeZone(new SimpleTimeZone(0, "GMT"));
        String edgeCase = "292278994-08-17T07:12:55.807Z";
        String testCase = "292278993-08-17T07:12:55.807Z";
        Date od = sdf.parse(edgeCase);
        Date testd = sdf.parse(testCase);
        long diff = od.getTime() - testd.getTime();
        assertTrue(diff == 365L*24*60*60*1000);
    }

    @Test
    public void testIssue233Overflows() throws ParseException {
        String[] cases = {
                // 1 milli second passed the max time
                "292278994-08-17T07:12:55.808Z",
                // 1 year passed the max year
                "292278995-01-17T07:12:55.807Z", };
        for (String edgeCase : cases) {
            try {
                Date parsed = DateUtils.parseISO8601Date(edgeCase);
                fail("Unexpected success: " + parsed);
            } catch (IllegalArgumentException ex) {
                String msg = ex.getMessage();
                assertTrue(msg
                        .contains("must be in the range [-292275054,292278993]"));
            }
        }
    }

    /**
     * Tests the Date marshalling and unmarshalling. Asserts that the value is
     * same before and after marshalling/unmarshalling
     */
    @Test
    public void testAWSFormatDateUtils() throws Exception {
        testDate(System.currentTimeMillis());
        testDate(1L);
        testDate(0L);
    }

    private void testDate(long dateInMilliSeconds) {
        String serverSpecificDateFormat = DateUtils
                .formatServiceSpecificDate(new Date(dateInMilliSeconds));

        Date parsedDate = DateUtils.parseServiceSpecificDate(String
                .valueOf(serverSpecificDateFormat));

        assertEquals(Long.valueOf(dateInMilliSeconds),
                Long.valueOf(parsedDate.getTime()));

    }

    // See https://forums.aws.amazon.com/thread.jspa?threadID=158756
    @Test
    public void testNumericNoQuote() {
        StructuredJsonGenerator jw = new SdkJsonGenerator(new JsonFactory(), null);
        jw.writeStartObject();
        jw.writeFieldName("foo").writeValue(new Date(), TimestampFormat.UNIX_TIMESTAMP);
        jw.writeEndObject();
        String s = new String(jw.getBytes(), Charset.forName("UTF-8"));
        // Something like: {"foo":1408378076.135}.
        // Note prior to the changes, it was {"foo":1408414571}
        // (with no decimal point nor places.)
        System.out.println(s);
        final String prefix = "{\"foo\":";
        assertTrue(s, s.startsWith(prefix));
        final int startPos = prefix.length();
        // verify no starting quote for the value
        assertFalse(s, s.startsWith("{\"foo\":\""));
        assertTrue(s, s.endsWith("}"));
        // Not: {"foo":"1408378076.135"}.
        // verify no ending quote for the value
        assertFalse(s, s.endsWith("\"}"));
        final int endPos = s.indexOf("}");
        final int dotPos = s.length()-5;
        assertTrue(s, s.charAt(dotPos) == '.');
        // verify all numeric before '.'
        char[] a = s.toCharArray();
        for (int i=startPos; i < dotPos; i++)
            assertTrue(a[i] <= '9' && a[i] >= '0' );
        int j=0;
        // verify all numeric after '.'
        for (int i=dotPos+1; i < endPos; i++) {
            assertTrue(a[i] <= '9' && a[i] >= '0' );
            j++;
        }
        // verify decimal precision of exactly 3
        assertTrue(j == 3);
    }

    @Test
    public void numberOfDaysSinceEpoch() {
        final long now = System.currentTimeMillis();
        final long days = DateUtils.numberOfDaysSinceEpoch(now);
        final int oneDayMilli = 24*60*60*1000;
        assertTrue(now > days*oneDayMilli);
        assertTrue((now - days*oneDayMilli) <= oneDayMilli);
    }
}
