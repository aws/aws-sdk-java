/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A URI wrapper that can parse out information about an S3 URI.
 */
public class AmazonS3URI {

    private static final Pattern ENDPOINT_PATTERN =
            Pattern.compile("^(.+\\.)?s3[.-]([a-z0-9-]+)\\.");

    private static final Pattern VERSION_ID_PATTERN = Pattern.compile("[&;]");

    private final URI uri;

    private final boolean isPathStyle;
    private final String bucket;
    private final String key;
    private final String versionId;
    private final String region;

    /**
     * Creates a new AmazonS3URI by parsing the given string.
     * String will be URL encoded before generating the URI.
     *
     * @param str the URI to parse.
     */
    public AmazonS3URI(final String str) {
        this(str, true);
    }

    /**
     * Creates a new AmazonS3URI by parsing the given string.
     * String will optionally be URL encoded before generating the URI.
     * URL encoding is recommended if you work with bucket names or object
     * keys with special characters.  This can be disabled if you pre-encode
     * URI strings before passing them to this class.
     *
     * @param str the URI to parse.
     * @param urlEncode true if string should be URL encoded
     */
    public AmazonS3URI(final String str, final boolean urlEncode) {
        this(URI.create(preprocessUrlStr(str, urlEncode)), urlEncode);
    }

    /**
     * Creates a new AmazonS3URI by wrapping the given {@code URI}.
     *
     * @param uri the URI to wrap
     */
    public AmazonS3URI(final URI uri) {
        this(uri, false);
    }

    private AmazonS3URI(final URI uri, final boolean urlEncode) {
        if (uri == null) {
            throw new IllegalArgumentException("uri cannot be null");
        }
        this.uri = uri;

        // s3://*
        if ("s3".equalsIgnoreCase(uri.getScheme())) {
            this.region = null;
            this.versionId = null;
            this.isPathStyle = false;
            this.bucket = uri.getAuthority();

            if (bucket == null) {
                throw new IllegalArgumentException("Invalid S3 URI: no bucket: "
                        + uri);
            }

            String path = uri.getPath();
            if (path.length() <= 1) {
                // s3://bucket or s3://bucket/
                this.key = null;
            } else {
                // s3://bucket/key
                // Remove the leading '/'.
                this.key = uri.getPath().substring(1);
            }
            return;
        }

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

            // Use the raw path to avoid running afoul of '/'s in the
            // bucket name if we have not performed full URL encoding
            String path = urlEncode ? uri.getPath() : uri.getRawPath();

            if ("".equals(path) || "/".equals(path)) {
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

            String path = uri.getPath();
            if (path == null || path.isEmpty() || "/".equals(uri.getPath())) {
                this.key = null;
            } else {
                // Remove the leading '/'.
                this.key = uri.getPath().substring(1);
            }
        }

        this.versionId = parseVersionId(uri.getRawQuery());

        if ("amazonaws".equals(matcher.group(2))) {
            // No region specified
            this.region = null;
        } else {
            this.region = matcher.group(2);
        }
    }

    /**
     * Attempts to parse a versionId parameter from the query
     * string.
     *
     * @param query the query string to parse (possibly null)
     * @return the versionId (possibly null)
     */
    private static String parseVersionId(String query) {
        if (query != null) {
            String[] params = VERSION_ID_PATTERN.split(query);
            for (String param : params) {
                if (param.startsWith("versionId=")) {
                    return decode(param.substring(10));
                }
            }
        }
        return null;
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
     * @return the version id parsed from the URI (or null if no version specified)
     */
    public String getVersionId() {
        return versionId;
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
     * URL encodes the given string.  This allows us to pass special characters
     * that would otherwise be rejected when building a URI instance.  Because we
     * need to retain the URI's path structure we subsequently need to replace
     * percent encoded path delimiters back to their decoded counterparts.
     *
     * @param str the string to encode
     * @return the encoded string
     */
    private static String preprocessUrlStr(final String str, final boolean encode) {
        if (encode) {
            try {
                return (URLEncoder.encode(str, "UTF-8")
                        .replace("%3A", ":")
                        .replace("%2F", "/")
                        .replace("+", "%20"));
            } catch (UnsupportedEncodingException e) {
                // This should never happen unless there is something
                // fundamentally broken with the running JVM.
                throw new RuntimeException(e);
            }
        }
        return str;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AmazonS3URI that = (AmazonS3URI) o;

        if (isPathStyle != that.isPathStyle) return false;
        if (!uri.equals(that.uri)) return false;
        if (bucket != null ? !bucket.equals(that.bucket) : that.bucket != null) return false;
        if (key != null ? !key.equals(that.key) : that.key != null) return false;
        if (versionId != null ? !versionId.equals(that.versionId) : that.versionId != null) return false;
        return region != null ? region.equals(that.region) : that.region == null;
    }

    @Override
    public int hashCode() {
        int result = uri.hashCode();
        result = 31 * result + (isPathStyle ? 1 : 0);
        result = 31 * result + (bucket != null ? bucket.hashCode() : 0);
        result = 31 * result + (key != null ? key.hashCode() : 0);
        result = 31 * result + (versionId != null ? versionId.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        return result;
    }
}
