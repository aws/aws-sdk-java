/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.math.BigDecimal;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.format.SignStyle;
import java.time.temporal.ChronoField;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.ThreadSafe;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Utilities for parsing and formatting dates.
 */
@ThreadSafe
public class DateUtils {

    private static final Log log = LogFactory.getLog(DateUtils.class);

    public static final ZoneId GMT = ZoneId.of("GMT");

    private static final int AWS_DATE_MILLI_SECOND_PRECISION = 3;

    private static final DateTimeFormatter iso8601Prefix = DateTimeFormatter.ofPattern("-MM-dd'T'HH:mm:ss");
    private static final DateTimeFormatter iso8601Suffix = DateTimeFormatter.ofPattern("'Z'");

    /** ISO 8601 format */
    static final DateTimeFormatter iso8601DateFormat = new DateTimeFormatterBuilder()
            .appendValue(ChronoField.YEAR, 4, 19, SignStyle.NEVER)
            .append(iso8601Prefix)
            .appendLiteral('.')
            .appendValue(ChronoField.MILLI_OF_SECOND, 3)
            .append(iso8601Suffix)
            .toFormatter()
            .withZone(GMT);

    /** Alternate ISO 8601 format without fractional seconds */
    static final DateTimeFormatter alternateIso8601DateFormat = new DateTimeFormatterBuilder()
            .appendValue(ChronoField.YEAR, 4, 19, SignStyle.NEVER)
            .append(iso8601Prefix)
            .append(iso8601Suffix)
            .toFormatter()
            .withZone(GMT);

    /** RFC 822 format */
    static final DateTimeFormatter rfc822DateFormat = DateTimeFormatter.ofPattern("EEE, dd MMM yyyy HH:mm:ss 'GMT'")
            .withLocale(Locale.US)
            .withZone(GMT);

    /**
     * This is another ISO 8601 format that's used in clock skew error response
     */
    static final DateTimeFormatter compressedIso8601DateFormat = DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmss'Z'")
            .withZone(GMT);

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
        if (dateString == null) {
            return null;
        }
        return Date.from(parseISO8601Instant(dateString));
    }

    /**
     * Parses the specified date string as an ISO 8601 date and returns the Instant
     * object.
     *
     * @param dateString
     *            The date string to parse.
     *
     * @return The parsed Date object.
     */
    public static Instant parseISO8601Instant(final String dateString) {
        if (dateString == null) {
            return null;
        }
        String dateStringFixed = dateString;

        // For EC2 Spot Fleet.
        if (dateStringFixed.endsWith("+0000")) {
            dateStringFixed = dateString
                    .substring(0, dateString.length() - 5)
                    .concat("Z");
        }

        return parseInstant(dateStringFixed, DateTimeFormatter.ISO_DATE_TIME, iso8601DateFormat, alternateIso8601DateFormat);
    }

    /**
     * Returns a date string with the prefix temporarily substituted, if
     * applicable, so that JodaTime can handle it.  Otherwise, if not applicable,
     * the original date string is returned.
     * <p>
     * See https://github.com/aws/aws-sdk-java/issues/233
     */
    private static String tempDateStringForJodaTime(String dateString) {
        final String fromPrefix = "292278994-";
        final String toPrefix   = "292278990-";
        return dateString.startsWith(fromPrefix)
                ? toPrefix + dateString.substring(fromPrefix.length())
                : dateString;
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
        return formatDate(date, iso8601DateFormat);
    }

    /**
     * Formats the specified date as an ISO 8601 string.
     *
     * @param date the date to format
     * @return the ISO-8601 string representing the specified date
     */
    public static String formatISO8601Date(ZonedDateTime date) {
        if (date == null) {
            return null;
        }
        return iso8601DateFormat.format(date);
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
        return parseDate(dateString, rfc822DateFormat);
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
        return formatDate(date, rfc822DateFormat);
    }

    static String formatDate(Date date, DateTimeFormatter formatter) {
        if (date == null) {
            return null;
        }
        return formatter.format(date.toInstant());
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
        return parseDate(dateString, compressedIso8601DateFormat);
   }

    static Date parseDate(CharSequence text, DateTimeFormatter... formatters) {
        return Date.from(parseInstant(text, formatters));
    }

    static Instant parseInstant(CharSequence text, DateTimeFormatter... formatters) {
        if (text == null || formatters == null || formatters.length == 0) {
            return null;
        }
        for (DateTimeFormatter formatter : formatters) {
            try {
                return Instant.from(formatter.parse(text));
            } catch (DateTimeParseException ex) {
                log.trace("Failed to parse " + text, ex);
            }
        }
        // none of the formatters worked, so retrying with the first one to throw the original exception
        return Instant.from(formatters[0].parse(text));
    }

    /**
     * Parses the given date string returned by the AWS service into a Date
     * object.
     */
    public static Date parseServiceSpecificDate(String dateString) {
        if (dateString == null)
            return null;
        try {
            BigDecimal dateValue = new BigDecimal(dateString);
            return new Date(dateValue.scaleByPowerOfTen(
                    AWS_DATE_MILLI_SECOND_PRECISION).longValue());
        } catch (NumberFormatException nfe) {
            throw new SdkClientException("Unable to parse date : "
                    + dateString, nfe);
        }
    }

    public static Date parseUnixTimestampInMillis(String dateString) {
        if (dateString == null)
            return null;
        try {
            BigDecimal dateValue = new BigDecimal(dateString);
            return new Date(dateValue.longValue());
        } catch (NumberFormatException nfe) {
            throw new SdkClientException("Unable to parse date : "
                                         + dateString, nfe);
        }
    }

    /**
     * Formats the give date object into an AWS Service format.
     */
    public static String formatServiceSpecificDate(Date date) {
        if (date == null)
            return null;
        BigDecimal dateValue = BigDecimal.valueOf(date.getTime());
        return dateValue.scaleByPowerOfTen(0 - AWS_DATE_MILLI_SECOND_PRECISION)
                .toPlainString();
    }

    /**
     * Formats the give date object into unit timestamp in milli seconds.
     */
    public static String formatUnixTimestampInMills(Date date) {
        if (date == null)
            return null;
        BigDecimal dateValue = BigDecimal.valueOf(date.getTime());
        return dateValue.toPlainString();
    }

    public static Date cloneDate(Date date) {
        return date == null ? null : new Date(date.getTime());
    }

    /**
     * Returns the number of days since epoch with respect to the given number
     * of milliseconds since epoch.
     */
    public static long numberOfDaysSinceEpoch(long milliSinceEpoch) {
        return TimeUnit.MILLISECONDS.toDays(milliSinceEpoch);
    }
}
