/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import static com.amazonaws.util.BinaryUtils.copyBytesFrom;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.text.Collator;
import java.util.Date;
import java.util.Locale;

/**
 * Utilities for converting objects to strings.
 */
public class StringUtils {

    private static final String DEFAULT_ENCODING = "UTF-8";

    public static final String COMMA_SEPARATOR = ",";

    public static final Charset UTF8 = Charset.forName(DEFAULT_ENCODING);

    private static final Locale LOCALE_ENGLISH = Locale.ENGLISH;

    // white space character that match Pattern.compile("\\s")
    private static final char CHAR_SPACE = ' ';
    private static final char CHAR_TAB = '\t';
    private static final char CHAR_NEW_LINE = '\n';
    private static final char CHAR_VERTICAL_TAB = '\u000b';
    private static final char CHAR_CARRIAGE_RETURN = '\r';
    private static final char CHAR_FORM_FEED = '\f';

    public static Integer toInteger(StringBuilder value) {
        return Integer.parseInt(value.toString());
    }

    public static String toString(StringBuilder value) {
        return value.toString();
    }

    public static Boolean toBoolean(StringBuilder value) {
        return Boolean.getBoolean(value.toString());
    }

    public static String fromInteger(Integer value) {
        return Integer.toString(value);
    }

    public static String fromLong(Long value) {
        return Long.toString(value);
    }

    public static String fromShort(Short value) {
        return Short.toString(value);
    }

    public static String fromString(String value) {
        return value;
    }

    public static String fromBoolean(Boolean value) {
        return Boolean.toString(value);
    }

    public static String fromBigInteger(BigInteger value) {
        return value.toString();
    }

    public static String fromBigDecimal(BigDecimal value) {
        return value.toString();
    }


    public static BigInteger toBigInteger(String s) {
        return new BigInteger(s);
    }

    public static BigDecimal toBigDecimal(String s) {
        return new BigDecimal(s);
    }

    public static String fromFloat(Float value) {
        return Float.toString(value);
    }

    /**
     * Converts the specified date to an ISO 8601 timestamp string and returns
     * it.
     *
     * @param value
     *            The date to format as an ISO 8601 timestamp string.
     *
     * @return An ISO 8601 timestamp string created from the specified date.
     */
    public static String fromDate(Date value) {
        return DateUtils.formatISO8601Date(value);
    }

    public static String fromDate(Date date, String timestampFormat) {
        if ("unixTimestamp".equalsIgnoreCase(timestampFormat)) {
            return DateUtils.formatServiceSpecificDate(date);
        }

        if ("iso8601".equalsIgnoreCase(timestampFormat)) {
            return DateUtils.formatISO8601Date(date);
        }

        if ("rfc822".equalsIgnoreCase(timestampFormat)) {
            return DateUtils.formatRFC822Date(date);
        }

        if ("unixTimestampInMillis".equalsIgnoreCase(timestampFormat)) {
            return DateUtils.formatUnixTimestampInMills(date);
        }

        throw new IllegalArgumentException("unsupported timestamp format");
    }

    /**
     * Returns the string representation of the specified double.
     *
     * @param d
     *            The double to represent as a string.
     *
     * @return The string representation of the specified double.
     */
    public static String fromDouble(Double d) {
        return Double.toString(d);
    }

    /**
     * Returns the string representation of the specified Byte.
     *
     * @param b
     *            The Byte to represent as a string.
     *
     * @return The string representation of the specified Byte.
     */
    public static String fromByte(Byte b) {
        return Byte.toString(b);
    }

    /**
     * Base64 encodes the data in the specified byte buffer (from the current
     * position to the buffer's limit) and returns it as a base64 encoded
     * string.
     *
     * @param byteBuffer
     *            The data to base64 encode and return as a string; must not be
     *            null.
     *
     * @return The base64 encoded contents of the specified byte buffer.
     */
    public static String fromByteBuffer(ByteBuffer byteBuffer) {
        return Base64.encodeAsString(copyBytesFrom(byteBuffer));
    }

    public static String replace( String originalString, String partToMatch, String replacement ) {
        StringBuilder buffer = new StringBuilder( originalString.length() );
        buffer.append( originalString );

        int indexOf = buffer.indexOf( partToMatch );
        while (indexOf != -1) {
            buffer = buffer.replace(indexOf, indexOf + partToMatch.length(), replacement);
            indexOf = buffer.indexOf(partToMatch, indexOf + replacement.length());
        }

        return buffer.toString();
    }

    /**
     * Joins the strings in parts with joiner between each string
     * @param joiner the string to insert between the strings in parts
     * @param parts the parts to join
     */
    public static String join(String joiner, String... parts) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            builder.append(parts[i]);
            if (i < parts.length - 1) {
                builder.append(joiner);
            }
        }
        return builder.toString();
    }

    /**
     * A null-safe trim method. If the input string is null, returns null;
     * otherwise returns a trimmed version of the input.
     */
    public static String trim(String value) {
        if (value == null) {
            return null;
        }
        return value.trim();
    }

    /**
     * @return true if the given value is either null or the empty string
     */
    public static boolean isNullOrEmpty(String value) {
        return value == null || value.isEmpty();
    }

    /**
     * @return true if the given value is non-null and non-empty
     */
    public static boolean hasValue(String str) {
        return !isNullOrEmpty(str);
    }

    /**
     * Converts a given String to lower case with Locale.ENGLISH
     *
     * @param str the string to be converted to lower case
     * @return the lower case of string, or itself if string is null/empty
     */
    public static String lowerCase(String str) {
        if(isNullOrEmpty(str)) {
            return str;
        }
        return str.toLowerCase(LOCALE_ENGLISH);
    }

    /**
     * Converts a given String to upper case with Locale.ENGLISH
     *
     * @param str the string to be converted to upper case
     * @return the upper case of string, or itself if string is null/empty
     */
    public static String upperCase(String str) {
        if(isNullOrEmpty(str)) {
            return str;
        }
        return str.toUpperCase(LOCALE_ENGLISH);
    }

    /**
     * Compare two strings with Locale.ENGLISH
     * This method is preferred over String.compareTo() method.
     * @param str1 String 1
     * @param str2 String 2
     * @return negative integer if str1 lexicographically precedes str2
     * 		   positive integer if str1 lexicographically follows str2
     * 			0 if both strings are equal
     * @throws IllegalArgumentException throws exception if both or either of the strings is null
     */
    public static int compare(String str1, String str2) {
        if( str1 == null || str2 == null) {
            throw new IllegalArgumentException("Arguments cannot be null");
        }

        Collator collator = Collator.getInstance(LOCALE_ENGLISH);
        return collator.compare(str1, str2);
    }

    /**
     * Tests a char to see if is it whitespace.
     * This method considers the same characters to be white
     * space as the Pattern class does when matching \s
     *
     * @param ch the character to be tested
     * @return true if the character is white  space, false otherwise.
     */
    private static boolean isWhiteSpace(final char ch) {
        if (ch == CHAR_SPACE) return true;
        if (ch == CHAR_TAB) return true;
        if (ch == CHAR_NEW_LINE) return true;
        if (ch == CHAR_VERTICAL_TAB) return true;
        if (ch == CHAR_CARRIAGE_RETURN) return true;
        if (ch == CHAR_FORM_FEED) return true;
        return false;
    }

    /**
     * This method appends a string to a string builder and collapses contiguous
     * white space is a single space.
     *
     * This is equivalent to:
     *      destination.append(source.replaceAll("\\s+", " "))
     * but does not create a Pattern object that needs to compile the match
     * string; it also prevents us from having to make a Matcher object as well.
     *
     */
    public static void appendCompactedString(final StringBuilder destination, final String source) {
        boolean previousIsWhiteSpace = false;
        int length = source.length();

        for (int i = 0; i < length; i++) {
            char ch = source.charAt(i);
            if (isWhiteSpace(ch)) {
                if (previousIsWhiteSpace) {
                    continue;
                }
                destination.append(CHAR_SPACE);
                previousIsWhiteSpace = true;
            } else {
                destination.append(ch);
                previousIsWhiteSpace = false;
            }
        }
    }

    /**
     * Performs a case insensitive comparison and returns true if the data
     * begins with the given sequence. 
     */
    public static boolean beginsWithIgnoreCase(final String data, final String seq) {
      return data.regionMatches(true, 0, seq, 0, seq.length());
    }
}
