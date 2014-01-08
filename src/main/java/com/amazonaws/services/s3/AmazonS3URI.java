/*
 * Copyright 2014-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3;

import java.net.URI;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A URI wrapper that can parse out information about an S3 URI.
 */
public class AmazonS3URI {

    private static final Pattern ENDPOINT_PATTERN =
        Pattern.compile("^(.+\\.)?s3[.-]([a-z0-9-]+)\\.");

    private final URI uri;

    private final boolean isPathStyle;
    private final String bucket;
    private final String key;
    private final String region;

    /**
     * Creates a new AmazonS3URI by parsing the given string.
     *
     * @param str the URI to parse.
     */
    public AmazonS3URI(final String str) {
        this(URI.create(str));
    }

    /**
     * Creates a new AmazonS3URI by wrapping the given {@code URI}.
     *
     * @param uri the URI to wrap
     */
    public AmazonS3URI(final URI uri) {
        if (uri == null) {
            throw new IllegalArgumentException("uri cannot be null");
        }

        this.uri = uri;

        String host = uri.getHost();
        if (host == null) {
            throw new IllegalArgumentException("Invalid S3 URI: no hostname: "
                                               + uri);
        }

        Matcher matcher = ENDPOINT_PATTERN.matcher(host);
        if (!matcher.find()) {
            throw new IllegalArgumentException(
                "Invalid S3 URI: hostname does not appear to be a valid S3 "
                + "endpoint: " + uri);
        }

        String prefix = matcher.group(1);
        if (prefix == null || prefix.isEmpty()) {

            // No bucket name in the authority; parse it from the path.
            this.isPathStyle = true;

            // Grab the encoded path so we don't run afoul of '/'s in the
            // bucket name.
            String path = uri.getRawPath();

            if ("/".equals(path)) {
                this.bucket = null;
                this.key = null;
            } else {

                int index = path.indexOf('/', 1);
                if (index == -1) {

                    // https://s3.amazonaws.com/bucket
                    this.bucket = decode(path.substring(1));
                    this.key = null;

                } else if (index == (path.length() - 1)) {

                    // https://s3.amazonaws.com/bucket/
                    this.bucket = decode(path.substring(1, index));
                    this.key = null;

                } else {

                    // https://s3.amazonaws.com/bucket/key
                    this.bucket = decode(path.substring(1, index));
                    this.key = decode(path.substring(index + 1));

                }
            }

        } else {

            // Bucket name was found in the host; path is the key.
            this.isPathStyle = false;

            // Remove the trailing '.' from the prefix to get the bucket.
            this.bucket = prefix.substring(0, prefix.length() - 1);

            if ("/".equals(uri.getPath())) {
                this.key = null;
            } else {
                // Remove the leading '/'.
                this.key = uri.getPath().substring(1);
            }
        }

        if ("amazonaws".equals(matcher.group(2))) {
            // No region specified
            this.region = null;
        } else {
            this.region = matcher.group(2);
        }
    }

    /**
     * @return the S3 URI being parsed
     */
    public URI getURI() {
        return uri;
    }

    /**
     * @return true if the URI contains the bucket in the path, false if it
     *         contains the bucket in the authority
     */
    public boolean isPathStyle() {
        return isPathStyle;
    }

    /**
     * @return the bucket name parsed from the URI (or null if no bucket
     *         specified)
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * @return the key parsed from the URI (or null if no key specified)
     */
    public String getKey() {
        return key;
    }

    /**
     * @return the region parsed from the URI (or null if no region specified)
     */
    public String getRegion() {
        return region;
    }

    @Override
    public String toString() {
        return uri.toString();
    }

    /**
     * Percent-decodes the given string, with a fast path for strings that
     * are not percent-encoded.
     *
     * @param str the string to decode
     * @return the decoded string
     */
    private static String decode(final String str) {
        if (str == null) {
            return null;
        }

        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == '%') {
                return decode(str, i);
            }
        }

        return str;
    }

    /**
     * Percent-decodes the given string.
     *
     * @param str the string to decode
     * @param firstPercent the index of the first '%' character in the string
     * @return the decoded string
     */
    private static String decode(final String str, final int firstPercent) {
        StringBuilder builder = new StringBuilder();
        builder.append(str.substring(0, firstPercent));

        appendDecoded(builder, str, firstPercent);

        for (int i = firstPercent + 3; i < str.length(); ++i) {
            if (str.charAt(i) == '%') {
                appendDecoded(builder, str, i);
                i += 2;
            } else {
                builder.append(str.charAt(i));
            }
        }

        return builder.toString();
    }

    /**
     * Decodes the percent-encoded character at the given index in the string
     * and appends the decoded value to the given {@code StringBuilder}.
     *
     * @param builder the string builder to append to
     * @param str the string being decoded
     * @param index the index of the '%' character in the string
     */
    private static void appendDecoded(final StringBuilder builder,
                                      final String str,
                                      final int index) {

        if (index > str.length() - 3) {
            throw new IllegalStateException("Invalid percent-encoded string:"
                                            + "\"" + str + "\".");
        }

        char first = str.charAt(index + 1);
        char second = str.charAt(index + 2);

        char decoded = (char) ((fromHex(first) << 4) | fromHex(second));
        builder.append(decoded);
    }

    /**
     * Converts a hex character (0-9A-Fa-f) into its corresponding quad value.
     *
     * @param c the hex character
     * @return the quad value
     */
    private static int fromHex(final char c) {
        if (c < '0') {
            throw new IllegalStateException(
                "Invalid percent-encoded string: bad character '" + c + "' in "
                + "escape sequence.");
        }
        if (c <= '9') {
            return (c - '0');
        }

        if (c < 'A') {
            throw new IllegalStateException(
                "Invalid percent-encoded string: bad character '" + c + "' in "
                + "escape sequence.");
        }
        if (c <= 'F') {
            return (c - 'A') + 10;
        }

        if (c < 'a') {
            throw new IllegalStateException(
                "Invalid percent-encoded string: bad character '" + c + "' in "
                + "escape sequence.");
        }
        if (c <= 'f') {
            return (c - 'a') + 10;
        }

        throw new IllegalStateException(
            "Invalid percent-encoded string: bad character '" + c + "' in "
            + "escape sequence.");
    }
}
