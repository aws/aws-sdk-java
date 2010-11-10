/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;

/**
 * Utilities for parsing and formatting dates.
 * <p>
 * Note that this class doesn't use static methods because of the
 * synchronization issues with SimpleDateFormat. This lets synchronization be
 * done on a per-object level, instead of on a per-class level.
 */
public class DateUtils {
    
    /** ISO 8601 parser */
    protected final SimpleDateFormat iso8601DateParser = 
        new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    
    /** Alternate ISO 8601 parser without fractional seconds */
    protected final SimpleDateFormat alternateIo8601DateParser =
        new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

    /** RFC 822 parser */
    protected final SimpleDateFormat rfc822DateParser = 
        new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);

    
    /**
     * Constructs a new DateUtils object, ready to parse/format dates.
     */
    public DateUtils() {
        iso8601DateParser.setTimeZone(new SimpleTimeZone(0, "GMT"));
        rfc822DateParser.setTimeZone(new SimpleTimeZone(0, "GMT"));
        alternateIo8601DateParser.setTimeZone(new SimpleTimeZone(0, "GMT"));
    }

    /**
     * Parses the specified date string as an ISO 8601 date and returns the Date
     * object.
     * 
     * @param dateString
     *            The date string to parse.
     *            
     * @return The parsed Date object.
     * 
     * @throws ParseException
     *             If the date string could not be parsed.
     */
    public Date parseIso8601Date(String dateString) throws ParseException {
        try {
            synchronized (iso8601DateParser) {
                return iso8601DateParser.parse(dateString);
            }
        } catch (ParseException e) {
            // If the first ISO 8601 parser didn't work, try the alternate
            // version which doesn't include fractional seconds
            synchronized (alternateIo8601DateParser) {
                return alternateIo8601DateParser.parse(dateString);
            }
        }
    }

    /**
     * Formats the specified date as an ISO 8601 string.
     * 
     * @param date
     *            The date to format.
     * 
     * @return The ISO 8601 string representing the specified date.
     */
    public String formatIso8601Date(Date date) {
        synchronized (iso8601DateParser) {
            return iso8601DateParser.format(date);
        }
    }

    /**
     * Parses the specified date string as an RFC 822 date and returns the Date
     * object.
     * 
     * @param dateString
     *            The date string to parse.
     *            
     * @return The parsed Date object.
     * 
     * @throws ParseException
     *             If the date string could not be parsed.
     */
    public Date parseRfc822Date(String dateString) throws ParseException {
        synchronized (rfc822DateParser) {
            return rfc822DateParser.parse(dateString);
        }
    }

    /**
     * Formats the specified date as an RFC 822 string.
     * 
     * @param date
     *            The date to format.
     * 
     * @return The RFC 822 string representing the specified date.
     */
    public String formatRfc822Date(Date date) {
        synchronized (rfc822DateParser) {
            return rfc822DateParser.format(date);
        }
    }

}
