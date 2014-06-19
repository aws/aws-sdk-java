/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Portions copyright 2006-2009 James Murty. Please see LICENSE.txt
 * for applicable license terms and NOTICE.txt for applicable notices.
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
package com.amazonaws.util;

import java.util.Date;
import java.util.Locale;

import org.apache.http.annotation.ThreadSafe;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.joda.time.tz.FixedDateTimeZone;

/**
 * Utilities for parsing and formatting dates.
 */
@ThreadSafe
public class DateUtils {
    private static final DateTimeZone GMT = new FixedDateTimeZone("GMT", "GMT", 0, 0);
    /** ISO 8601 format */
    protected static final DateTimeFormatter iso8601DateFormat =
        ISODateTimeFormat.dateTime().withZone(GMT);

    /** Alternate ISO 8601 format without fractional seconds */
    protected static final DateTimeFormatter alternateIso8601DateFormat =
        DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss'Z'").withZone(GMT);

    /** RFC 822 format */
    protected static final DateTimeFormatter rfc822DateFormat =
        DateTimeFormat.forPattern("EEE, dd MMM yyyy HH:mm:ss z")
                      .withLocale(Locale.US)
                      .withZone(GMT);

    /**
     * This is another ISO 8601 format that's used in clock skew error response
     */
    protected static final DateTimeFormatter compressedIso8601DateFormat =
            DateTimeFormat.forPattern("yyyyMMdd'T'HHmmss'Z'")
            .withZone(GMT);

    /**
     * @deprecated by the more efficient static method {@link #parseISO8601Date(String)}
     */
    @Deprecated
    public Date parseIso8601Date(String dateString) {
        return parseISO8601Date(dateString);
    }

    /**
     * Parses the specified date string as an ISO 8601 date and returns the Date
     * object.
     *
     * @param dateString
     *            The date string to parse.
     *
     * @return The parsed Date object.
     */
    public static Date parseISO8601Date(String dateString) {
        try {
            return doParseISO8601Date(dateString);
        } catch(RuntimeException ex) {
            throw handleException(ex);
        }
    }

    static Date doParseISO8601Date(String dateString) {
        try {
            return new Date(iso8601DateFormat.parseMillis(dateString));
        } catch (IllegalArgumentException e) {
            return new Date(alternateIso8601DateFormat.parseMillis(dateString));
            // If the first ISO 8601 parser didn't work, try the alternate
            // version which doesn't include fractional seconds
        }
    }
    
    /**
     * Returns the original runtime exception iff the joda-time being used
     * at runtime behaves as expected. 
     * 
     * @throws IllegalStateException if the joda-time being used at runtime
     * doens't appear to be of the right version.
     */
    private static <E extends RuntimeException> E handleException(E ex) {
        if (JodaTime.hasExpectedBehavior())
            return ex;
        throw new IllegalStateException("Joda-time 2.2 or later version is required, but found version: " + JodaTime.getVersion(), ex);
    }

    /**
     * @deprecated by the more efficient static method {@link #formatISO8601Date(Date)}
     */
    @Deprecated
    public String formatIso8601Date(Date date) {
        return formatISO8601Date(date);
    }

    /**
     * Formats the specified date as an ISO 8601 string.
     *
     * @param date
     *            The date to format.
     *
     * @return The ISO 8601 string representing the specified date.
     */
    public static String formatISO8601Date(Date date) {
        try {
            return iso8601DateFormat.print(date.getTime());
        } catch(RuntimeException ex) {
            throw handleException(ex);
        }
    }

    /**
     * @deprecated by the more efficient static method {@link #parseRFC822Date(String)}
     */
    @Deprecated
    public Date parseRfc822Date(String dateString) {
        return parseRFC822Date(dateString);
    }

    /**
     * Parses the specified date string as an RFC 822 date and returns the Date
     * object.
     *
     * @param dateString
     *            The date string to parse.
     *
     * @return The parsed Date object.
     */
    public static Date parseRFC822Date(String dateString) {
        try {
            return new Date(rfc822DateFormat.parseMillis(dateString));
        } catch(RuntimeException ex) {
            throw handleException(ex);
        }
    }

    /**
     * @deprecated by the more efficient static method {@link #formatRFC822Date(Date)}
     */
    @Deprecated
    public String formatRfc822Date(Date date) {
        return formatRFC822Date(date);
    }

    /**
     * Formats the specified date as an RFC 822 string.
     *
     * @param date
     *            The date to format.
     *
     * @return The RFC 822 string representing the specified date.
     */
    public static String formatRFC822Date(Date date) {
        try {
            return rfc822DateFormat.print(date.getTime());
        } catch(RuntimeException ex) {
            throw handleException(ex);
        }
    }

    /**
     * @deprecated by the more efficient static method {@link #parseCompressedISO8601Date(String)}
     */
    @Deprecated
    public Date parseCompressedIso8601Date(String dateString) {
        return parseCompressedISO8601Date(dateString);
    }

    /**
     * Parses the specified date string as a compressedIso8601DateFormat ("yyyyMMdd'T'HHmmss'Z'") and returns the Date
     * object.
     *
     * @param dateString
     *            The date string to parse.
     *
     * @return The parsed Date object.
     */
    public static Date parseCompressedISO8601Date(String dateString) {
        try {
            return new Date(compressedIso8601DateFormat.parseMillis(dateString));
        } catch (RuntimeException ex) {
            throw handleException(ex);
        }
   }
}
