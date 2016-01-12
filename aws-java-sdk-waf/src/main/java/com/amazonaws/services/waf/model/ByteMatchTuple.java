/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.waf.model;

import java.io.Serializable;

/**
 * <p>
 * The bytes (typically a string that corresponds with ASCII characters) that
 * you want AWS WAF to search for in web requests, the location in requests that
 * you want AWS WAF to search, and other settings.
 * </p>
 */
public class ByteMatchTuple implements Serializable, Cloneable {

    /**
     * <p>
     * The part of a web request that you want AWS WAF to search, such as a
     * specified header or a query string. For more information, see
     * <a>FieldToMatch</a>.
     * </p>
     */
    private FieldToMatch fieldToMatch;
    /**
     * <p>
     * The value that you want AWS WAF to search for. AWS WAF searches for the
     * specified string in the part of web requests that you specified in
     * <code>FieldToMatch</code>. The maximum length of the value is 50 bytes.
     * </p>
     * <p>
     * Valid values depend on the values that you specified for
     * <code>FieldToMatch</code>:
     * </p>
     * <ul>
     * <li><code>HEADER</code>: The value that you want AWS WAF to search for in
     * the request header that you specified in <a>FieldToMatch</a>, for
     * example, the value of the <code>User-Agent</code> or <code>Referer</code>
     * header.</li>
     * <li><code>METHOD</code>: The HTTP method, which indicates the type of
     * operation specified in the request. CloudFront supports the following
     * methods: <code>DELETE</code>, <code>GET</code>, <code>HEAD</code>,
     * <code>OPTIONS</code>, <code>PATCH</code>, <code>POST</code>, and
     * <code>PUT</code>.</li>
     * <li><code>QUERY_STRING</code>: The value that you want AWS WAF to search
     * for in the query string, which is the part of a URL that appears after a
     * <code>?</code> character.</li>
     * <li><code>URI</code>: The value that you want AWS WAF to search for in
     * the part of a URL that identifies a resource, for example,
     * <code>/images/daily-ad.jpg</code>.</li>
     * </ul>
     * <p>
     * If <code>TargetString</code> includes alphabetic characters A-Z and a-z,
     * note that the value is case sensitive.
     * </p>
     * <p>
     * <b>If you're using the AWS WAF API</b>
     * </p>
     * <p>
     * Specify a base64-encoded version of the value. The maximum length of the
     * value before you base64-encode it is 50 bytes.
     * </p>
     * <p>
     * For example, suppose the value of <code>Type</code> is
     * <code>HEADER</code> and the value of <code>Data</code> is
     * <code>User-Agent</code>. If you want to search the
     * <code>User-Agent</code> header for the value <code>BadBot</code>, you
     * base64-encode <code>BadBot</code> using MIME base64 encoding and include
     * the resulting value, <code>QmFkQm90</code>, in the value of
     * <code>TargetString</code>.
     * </p>
     * <p>
     * <b>If you're using the AWS CLI or one of the AWS SDKs</b>
     * </p>
     * <p>
     * The value that you want AWS WAF to search for. The SDK automatically
     * base64 encodes the value.
     * </p>
     */
    private java.nio.ByteBuffer targetString;
    /**
     * <p>
     * Text transformations eliminate some of the unusual formatting that
     * attackers use in web requests in an effort to bypass AWS WAF. If you
     * specify a transformation, AWS WAF performs the transformation on
     * <code>TargetString</code> before inspecting a request for a match.
     * </p>
     * <p>
     * <b>CMD_LINE</b>
     * </p>
     * <p>
     * When you're concerned that attackers are injecting an operating system
     * commandline command and using unusual formatting to disguise some or all
     * of the command, use this option to perform the following transformations:
     * </p>
     * <ul>
     * <li>Delete the following characters: \ " ' ^</li>
     * <li>Delete spaces before the following characters: / (</li>
     * <li>Replace the following characters with a space: , ;</li>
     * <li>Replace multiple spaces with one space</li>
     * <li>Convert uppercase letters (A-Z) to lowercase (a-z)</li>
     * </ul>
     * <p>
     * <b>COMPRESS_WHITE_SPACE</b>
     * </p>
     * <p>
     * Use this option to replace the following characters with a space
     * character (decimal 32):
     * </p>
     * <ul>
     * <li>\f, formfeed, decimal 12</li>
     * <li>\t, tab, decimal 9</li>
     * <li>\n, newline, decimal 10</li>
     * <li>\r, carriage return, decimal 13</li>
     * <li>\v, vertical tab, decimal 11</li>
     * <li>non-breaking space, decimal 160</li>
     * </ul>
     * <p>
     * <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces with one
     * space.
     * </p>
     * <p>
     * <b>HTML_ENTITY_DECODE</b>
     * </p>
     * <p>
     * Use this option to replace HTML-encoded characters with unencoded
     * characters. <code>HTML_ENTITY_DECODE</code> performs the following
     * operations:
     * </p>
     * <ul>
     * <li>Replaces <code>(ampersand)quot;</code> with <code>"</code></li>
     * <li>Replaces <code>(ampersand)nbsp;</code> with a non-breaking space,
     * decimal 160</li>
     * <li>Replaces <code>(ampersand)lt;</code> with a "less than" symbol</li>
     * <li>Replaces <code>(ampersand)gt;</code> with <code>></code></li>
     * <li>Replaces characters that are represented in hexadecimal format,
     * <code>(ampersand)#xhhhh;</code>, with the corresponding characters</li>
     * <li>Replaces characters that are represented in decimal format,
     * <code>(ampersand)#nnnn;</code>, with the corresponding characters</li>
     * </ul>
     * <p>
     * <b>LOWERCASE</b>
     * </p>
     * <p>
     * Use this option to convert uppercase letters (A-Z) to lowercase (a-z).
     * </p>
     * <p>
     * <b>URL_DECODE</b>
     * </p>
     * <p>
     * Use this option to decode a URL-encoded value.
     * </p>
     * <p>
     * <b>NONE</b>
     * </p>
     * <p>
     * Specify <code>NONE</code> if you don't want to perform any text
     * transformations.
     * </p>
     */
    private String textTransformation;
    /**
     * <p>
     * Within the portion of a web request that you want to search (for example,
     * in the query string, if any), specify where you want AWS WAF to search.
     * Valid values include the following:
     * </p>
     * <p>
     * <b>CONTAINS</b>
     * </p>
     * <p>
     * The specified part of the web request must include the value of
     * <code>TargetString</code>, but the location doesn't matter.
     * </p>
     * <p>
     * <b>CONTAINS_WORD</b>
     * </p>
     * <p>
     * The specified part of the web request must include the value of
     * <code>TargetString</code>, and <code>TargetString</code> must contain
     * only alphanumeric characters or underscore (A-Z, a-z, 0-9, or _). In
     * addition, <code>TargetString</code> must be a word, which means one of
     * the following:
     * </p>
     * <ul>
     * <li><code>TargetString</code> exactly matches the value of the specified
     * part of the web request, such as the value of a header.</li>
     * <li><code>TargetString</code> is at the beginning of the specified part
     * of the web request and is followed by a character other than an
     * alphanumeric character or underscore (_), for example,
     * <code>BadBot;</code>.</li>
     * <li><code>TargetString</code> is at the end of the specified part of the
     * web request and is preceded by a character other than an alphanumeric
     * character or underscore (_), for example, <code>;BadBot</code>.</li>
     * <li><code>TargetString</code> is in the middle of the specified part of
     * the web request and is preceded and followed by characters other than
     * alphanumeric characters or underscore (_), for example,
     * <code>-BadBot;</code>.</li>
     * </ul>
     * <p>
     * <b>EXACTLY</b>
     * </p>
     * <p>
     * The value of the specified part of the web request must exactly match the
     * value of <code>TargetString</code>.
     * </p>
     * <p>
     * <b>STARTS_WITH</b>
     * </p>
     * <p>
     * The value of <code>TargetString</code> must appear at the beginning of
     * the specified part of the web request.
     * </p>
     * <p>
     * <b>ENDS_WITH</b>
     * </p>
     * <p>
     * The value of <code>TargetString</code> must appear at the end of the
     * specified part of the web request.
     * </p>
     */
    private String positionalConstraint;

    /**
     * <p>
     * The part of a web request that you want AWS WAF to search, such as a
     * specified header or a query string. For more information, see
     * <a>FieldToMatch</a>.
     * </p>
     * 
     * @param fieldToMatch
     *        The part of a web request that you want AWS WAF to search, such as
     *        a specified header or a query string. For more information, see
     *        <a>FieldToMatch</a>.
     */
    public void setFieldToMatch(FieldToMatch fieldToMatch) {
        this.fieldToMatch = fieldToMatch;
    }

    /**
     * <p>
     * The part of a web request that you want AWS WAF to search, such as a
     * specified header or a query string. For more information, see
     * <a>FieldToMatch</a>.
     * </p>
     * 
     * @return The part of a web request that you want AWS WAF to search, such
     *         as a specified header or a query string. For more information,
     *         see <a>FieldToMatch</a>.
     */
    public FieldToMatch getFieldToMatch() {
        return this.fieldToMatch;
    }

    /**
     * <p>
     * The part of a web request that you want AWS WAF to search, such as a
     * specified header or a query string. For more information, see
     * <a>FieldToMatch</a>.
     * </p>
     * 
     * @param fieldToMatch
     *        The part of a web request that you want AWS WAF to search, such as
     *        a specified header or a query string. For more information, see
     *        <a>FieldToMatch</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ByteMatchTuple withFieldToMatch(FieldToMatch fieldToMatch) {
        setFieldToMatch(fieldToMatch);
        return this;
    }

    /**
     * <p>
     * The value that you want AWS WAF to search for. AWS WAF searches for the
     * specified string in the part of web requests that you specified in
     * <code>FieldToMatch</code>. The maximum length of the value is 50 bytes.
     * </p>
     * <p>
     * Valid values depend on the values that you specified for
     * <code>FieldToMatch</code>:
     * </p>
     * <ul>
     * <li><code>HEADER</code>: The value that you want AWS WAF to search for in
     * the request header that you specified in <a>FieldToMatch</a>, for
     * example, the value of the <code>User-Agent</code> or <code>Referer</code>
     * header.</li>
     * <li><code>METHOD</code>: The HTTP method, which indicates the type of
     * operation specified in the request. CloudFront supports the following
     * methods: <code>DELETE</code>, <code>GET</code>, <code>HEAD</code>,
     * <code>OPTIONS</code>, <code>PATCH</code>, <code>POST</code>, and
     * <code>PUT</code>.</li>
     * <li><code>QUERY_STRING</code>: The value that you want AWS WAF to search
     * for in the query string, which is the part of a URL that appears after a
     * <code>?</code> character.</li>
     * <li><code>URI</code>: The value that you want AWS WAF to search for in
     * the part of a URL that identifies a resource, for example,
     * <code>/images/daily-ad.jpg</code>.</li>
     * </ul>
     * <p>
     * If <code>TargetString</code> includes alphabetic characters A-Z and a-z,
     * note that the value is case sensitive.
     * </p>
     * <p>
     * <b>If you're using the AWS WAF API</b>
     * </p>
     * <p>
     * Specify a base64-encoded version of the value. The maximum length of the
     * value before you base64-encode it is 50 bytes.
     * </p>
     * <p>
     * For example, suppose the value of <code>Type</code> is
     * <code>HEADER</code> and the value of <code>Data</code> is
     * <code>User-Agent</code>. If you want to search the
     * <code>User-Agent</code> header for the value <code>BadBot</code>, you
     * base64-encode <code>BadBot</code> using MIME base64 encoding and include
     * the resulting value, <code>QmFkQm90</code>, in the value of
     * <code>TargetString</code>.
     * </p>
     * <p>
     * <b>If you're using the AWS CLI or one of the AWS SDKs</b>
     * </p>
     * <p>
     * The value that you want AWS WAF to search for. The SDK automatically
     * base64 encodes the value.
     * </p>
     * <p>
     * AWS SDK for Java performs a Base64 encoding on this field before sending
     * this request to AWS service by default. Users of the SDK should not
     * perform Base64 encoding on this field.
     * </p>
     * 
     * @param targetString
     *        The value that you want AWS WAF to search for. AWS WAF searches
     *        for the specified string in the part of web requests that you
     *        specified in <code>FieldToMatch</code>. The maximum length of the
     *        value is 50 bytes.</p>
     *        <p>
     *        Valid values depend on the values that you specified for
     *        <code>FieldToMatch</code>:
     *        </p>
     *        <ul>
     *        <li><code>HEADER</code>: The value that you want AWS WAF to search
     *        for in the request header that you specified in
     *        <a>FieldToMatch</a>, for example, the value of the
     *        <code>User-Agent</code> or <code>Referer</code> header.</li>
     *        <li><code>METHOD</code>: The HTTP method, which indicates the type
     *        of operation specified in the request. CloudFront supports the
     *        following methods: <code>DELETE</code>, <code>GET</code>,
     *        <code>HEAD</code>, <code>OPTIONS</code>, <code>PATCH</code>,
     *        <code>POST</code>, and <code>PUT</code>.</li>
     *        <li><code>QUERY_STRING</code>: The value that you want AWS WAF to
     *        search for in the query string, which is the part of a URL that
     *        appears after a <code>?</code> character.</li>
     *        <li><code>URI</code>: The value that you want AWS WAF to search
     *        for in the part of a URL that identifies a resource, for example,
     *        <code>/images/daily-ad.jpg</code>.</li>
     *        </ul>
     *        <p>
     *        If <code>TargetString</code> includes alphabetic characters A-Z
     *        and a-z, note that the value is case sensitive.
     *        </p>
     *        <p>
     *        <b>If you're using the AWS WAF API</b>
     *        </p>
     *        <p>
     *        Specify a base64-encoded version of the value. The maximum length
     *        of the value before you base64-encode it is 50 bytes.
     *        </p>
     *        <p>
     *        For example, suppose the value of <code>Type</code> is
     *        <code>HEADER</code> and the value of <code>Data</code> is
     *        <code>User-Agent</code>. If you want to search the
     *        <code>User-Agent</code> header for the value <code>BadBot</code>,
     *        you base64-encode <code>BadBot</code> using MIME base64 encoding
     *        and include the resulting value, <code>QmFkQm90</code>, in the
     *        value of <code>TargetString</code>.
     *        </p>
     *        <p>
     *        <b>If you're using the AWS CLI or one of the AWS SDKs</b>
     *        </p>
     *        <p>
     *        The value that you want AWS WAF to search for. The SDK
     *        automatically base64 encodes the value.
     */
    public void setTargetString(java.nio.ByteBuffer targetString) {
        this.targetString = targetString;
    }

    /**
     * <p>
     * The value that you want AWS WAF to search for. AWS WAF searches for the
     * specified string in the part of web requests that you specified in
     * <code>FieldToMatch</code>. The maximum length of the value is 50 bytes.
     * </p>
     * <p>
     * Valid values depend on the values that you specified for
     * <code>FieldToMatch</code>:
     * </p>
     * <ul>
     * <li><code>HEADER</code>: The value that you want AWS WAF to search for in
     * the request header that you specified in <a>FieldToMatch</a>, for
     * example, the value of the <code>User-Agent</code> or <code>Referer</code>
     * header.</li>
     * <li><code>METHOD</code>: The HTTP method, which indicates the type of
     * operation specified in the request. CloudFront supports the following
     * methods: <code>DELETE</code>, <code>GET</code>, <code>HEAD</code>,
     * <code>OPTIONS</code>, <code>PATCH</code>, <code>POST</code>, and
     * <code>PUT</code>.</li>
     * <li><code>QUERY_STRING</code>: The value that you want AWS WAF to search
     * for in the query string, which is the part of a URL that appears after a
     * <code>?</code> character.</li>
     * <li><code>URI</code>: The value that you want AWS WAF to search for in
     * the part of a URL that identifies a resource, for example,
     * <code>/images/daily-ad.jpg</code>.</li>
     * </ul>
     * <p>
     * If <code>TargetString</code> includes alphabetic characters A-Z and a-z,
     * note that the value is case sensitive.
     * </p>
     * <p>
     * <b>If you're using the AWS WAF API</b>
     * </p>
     * <p>
     * Specify a base64-encoded version of the value. The maximum length of the
     * value before you base64-encode it is 50 bytes.
     * </p>
     * <p>
     * For example, suppose the value of <code>Type</code> is
     * <code>HEADER</code> and the value of <code>Data</code> is
     * <code>User-Agent</code>. If you want to search the
     * <code>User-Agent</code> header for the value <code>BadBot</code>, you
     * base64-encode <code>BadBot</code> using MIME base64 encoding and include
     * the resulting value, <code>QmFkQm90</code>, in the value of
     * <code>TargetString</code>.
     * </p>
     * <p>
     * <b>If you're using the AWS CLI or one of the AWS SDKs</b>
     * </p>
     * <p>
     * The value that you want AWS WAF to search for. The SDK automatically
     * base64 encodes the value.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods
     * changes their {@code position}. We recommend using
     * {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view
     * of the buffer with an independent {@code position}, and calling
     * {@code get} methods on this rather than directly on the returned
     * {@code ByteBuffer}. Doing so will ensure that anyone else using the
     * {@code ByteBuffer} will not be affected by changes to the {@code position}
     * .
     * </p>
     * 
     * @return The value that you want AWS WAF to search for. AWS WAF searches
     *         for the specified string in the part of web requests that you
     *         specified in <code>FieldToMatch</code>. The maximum length of the
     *         value is 50 bytes.</p>
     *         <p>
     *         Valid values depend on the values that you specified for
     *         <code>FieldToMatch</code>:
     *         </p>
     *         <ul>
     *         <li><code>HEADER</code>: The value that you want AWS WAF to
     *         search for in the request header that you specified in
     *         <a>FieldToMatch</a>, for example, the value of the
     *         <code>User-Agent</code> or <code>Referer</code> header.</li>
     *         <li><code>METHOD</code>: The HTTP method, which indicates the
     *         type of operation specified in the request. CloudFront supports
     *         the following methods: <code>DELETE</code>, <code>GET</code>,
     *         <code>HEAD</code>, <code>OPTIONS</code>, <code>PATCH</code>,
     *         <code>POST</code>, and <code>PUT</code>.</li>
     *         <li><code>QUERY_STRING</code>: The value that you want AWS WAF to
     *         search for in the query string, which is the part of a URL that
     *         appears after a <code>?</code> character.</li>
     *         <li><code>URI</code>: The value that you want AWS WAF to search
     *         for in the part of a URL that identifies a resource, for example,
     *         <code>/images/daily-ad.jpg</code>.</li>
     *         </ul>
     *         <p>
     *         If <code>TargetString</code> includes alphabetic characters A-Z
     *         and a-z, note that the value is case sensitive.
     *         </p>
     *         <p>
     *         <b>If you're using the AWS WAF API</b>
     *         </p>
     *         <p>
     *         Specify a base64-encoded version of the value. The maximum length
     *         of the value before you base64-encode it is 50 bytes.
     *         </p>
     *         <p>
     *         For example, suppose the value of <code>Type</code> is
     *         <code>HEADER</code> and the value of <code>Data</code> is
     *         <code>User-Agent</code>. If you want to search the
     *         <code>User-Agent</code> header for the value <code>BadBot</code>,
     *         you base64-encode <code>BadBot</code> using MIME base64 encoding
     *         and include the resulting value, <code>QmFkQm90</code>, in the
     *         value of <code>TargetString</code>.
     *         </p>
     *         <p>
     *         <b>If you're using the AWS CLI or one of the AWS SDKs</b>
     *         </p>
     *         <p>
     *         The value that you want AWS WAF to search for. The SDK
     *         automatically base64 encodes the value.
     */
    public java.nio.ByteBuffer getTargetString() {
        return this.targetString;
    }

    /**
     * <p>
     * The value that you want AWS WAF to search for. AWS WAF searches for the
     * specified string in the part of web requests that you specified in
     * <code>FieldToMatch</code>. The maximum length of the value is 50 bytes.
     * </p>
     * <p>
     * Valid values depend on the values that you specified for
     * <code>FieldToMatch</code>:
     * </p>
     * <ul>
     * <li><code>HEADER</code>: The value that you want AWS WAF to search for in
     * the request header that you specified in <a>FieldToMatch</a>, for
     * example, the value of the <code>User-Agent</code> or <code>Referer</code>
     * header.</li>
     * <li><code>METHOD</code>: The HTTP method, which indicates the type of
     * operation specified in the request. CloudFront supports the following
     * methods: <code>DELETE</code>, <code>GET</code>, <code>HEAD</code>,
     * <code>OPTIONS</code>, <code>PATCH</code>, <code>POST</code>, and
     * <code>PUT</code>.</li>
     * <li><code>QUERY_STRING</code>: The value that you want AWS WAF to search
     * for in the query string, which is the part of a URL that appears after a
     * <code>?</code> character.</li>
     * <li><code>URI</code>: The value that you want AWS WAF to search for in
     * the part of a URL that identifies a resource, for example,
     * <code>/images/daily-ad.jpg</code>.</li>
     * </ul>
     * <p>
     * If <code>TargetString</code> includes alphabetic characters A-Z and a-z,
     * note that the value is case sensitive.
     * </p>
     * <p>
     * <b>If you're using the AWS WAF API</b>
     * </p>
     * <p>
     * Specify a base64-encoded version of the value. The maximum length of the
     * value before you base64-encode it is 50 bytes.
     * </p>
     * <p>
     * For example, suppose the value of <code>Type</code> is
     * <code>HEADER</code> and the value of <code>Data</code> is
     * <code>User-Agent</code>. If you want to search the
     * <code>User-Agent</code> header for the value <code>BadBot</code>, you
     * base64-encode <code>BadBot</code> using MIME base64 encoding and include
     * the resulting value, <code>QmFkQm90</code>, in the value of
     * <code>TargetString</code>.
     * </p>
     * <p>
     * <b>If you're using the AWS CLI or one of the AWS SDKs</b>
     * </p>
     * <p>
     * The value that you want AWS WAF to search for. The SDK automatically
     * base64 encodes the value.
     * </p>
     * 
     * @param targetString
     *        The value that you want AWS WAF to search for. AWS WAF searches
     *        for the specified string in the part of web requests that you
     *        specified in <code>FieldToMatch</code>. The maximum length of the
     *        value is 50 bytes.</p>
     *        <p>
     *        Valid values depend on the values that you specified for
     *        <code>FieldToMatch</code>:
     *        </p>
     *        <ul>
     *        <li><code>HEADER</code>: The value that you want AWS WAF to search
     *        for in the request header that you specified in
     *        <a>FieldToMatch</a>, for example, the value of the
     *        <code>User-Agent</code> or <code>Referer</code> header.</li>
     *        <li><code>METHOD</code>: The HTTP method, which indicates the type
     *        of operation specified in the request. CloudFront supports the
     *        following methods: <code>DELETE</code>, <code>GET</code>,
     *        <code>HEAD</code>, <code>OPTIONS</code>, <code>PATCH</code>,
     *        <code>POST</code>, and <code>PUT</code>.</li>
     *        <li><code>QUERY_STRING</code>: The value that you want AWS WAF to
     *        search for in the query string, which is the part of a URL that
     *        appears after a <code>?</code> character.</li>
     *        <li><code>URI</code>: The value that you want AWS WAF to search
     *        for in the part of a URL that identifies a resource, for example,
     *        <code>/images/daily-ad.jpg</code>.</li>
     *        </ul>
     *        <p>
     *        If <code>TargetString</code> includes alphabetic characters A-Z
     *        and a-z, note that the value is case sensitive.
     *        </p>
     *        <p>
     *        <b>If you're using the AWS WAF API</b>
     *        </p>
     *        <p>
     *        Specify a base64-encoded version of the value. The maximum length
     *        of the value before you base64-encode it is 50 bytes.
     *        </p>
     *        <p>
     *        For example, suppose the value of <code>Type</code> is
     *        <code>HEADER</code> and the value of <code>Data</code> is
     *        <code>User-Agent</code>. If you want to search the
     *        <code>User-Agent</code> header for the value <code>BadBot</code>,
     *        you base64-encode <code>BadBot</code> using MIME base64 encoding
     *        and include the resulting value, <code>QmFkQm90</code>, in the
     *        value of <code>TargetString</code>.
     *        </p>
     *        <p>
     *        <b>If you're using the AWS CLI or one of the AWS SDKs</b>
     *        </p>
     *        <p>
     *        The value that you want AWS WAF to search for. The SDK
     *        automatically base64 encodes the value.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ByteMatchTuple withTargetString(java.nio.ByteBuffer targetString) {
        setTargetString(targetString);
        return this;
    }

    /**
     * <p>
     * Text transformations eliminate some of the unusual formatting that
     * attackers use in web requests in an effort to bypass AWS WAF. If you
     * specify a transformation, AWS WAF performs the transformation on
     * <code>TargetString</code> before inspecting a request for a match.
     * </p>
     * <p>
     * <b>CMD_LINE</b>
     * </p>
     * <p>
     * When you're concerned that attackers are injecting an operating system
     * commandline command and using unusual formatting to disguise some or all
     * of the command, use this option to perform the following transformations:
     * </p>
     * <ul>
     * <li>Delete the following characters: \ " ' ^</li>
     * <li>Delete spaces before the following characters: / (</li>
     * <li>Replace the following characters with a space: , ;</li>
     * <li>Replace multiple spaces with one space</li>
     * <li>Convert uppercase letters (A-Z) to lowercase (a-z)</li>
     * </ul>
     * <p>
     * <b>COMPRESS_WHITE_SPACE</b>
     * </p>
     * <p>
     * Use this option to replace the following characters with a space
     * character (decimal 32):
     * </p>
     * <ul>
     * <li>\f, formfeed, decimal 12</li>
     * <li>\t, tab, decimal 9</li>
     * <li>\n, newline, decimal 10</li>
     * <li>\r, carriage return, decimal 13</li>
     * <li>\v, vertical tab, decimal 11</li>
     * <li>non-breaking space, decimal 160</li>
     * </ul>
     * <p>
     * <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces with one
     * space.
     * </p>
     * <p>
     * <b>HTML_ENTITY_DECODE</b>
     * </p>
     * <p>
     * Use this option to replace HTML-encoded characters with unencoded
     * characters. <code>HTML_ENTITY_DECODE</code> performs the following
     * operations:
     * </p>
     * <ul>
     * <li>Replaces <code>(ampersand)quot;</code> with <code>"</code></li>
     * <li>Replaces <code>(ampersand)nbsp;</code> with a non-breaking space,
     * decimal 160</li>
     * <li>Replaces <code>(ampersand)lt;</code> with a "less than" symbol</li>
     * <li>Replaces <code>(ampersand)gt;</code> with <code>></code></li>
     * <li>Replaces characters that are represented in hexadecimal format,
     * <code>(ampersand)#xhhhh;</code>, with the corresponding characters</li>
     * <li>Replaces characters that are represented in decimal format,
     * <code>(ampersand)#nnnn;</code>, with the corresponding characters</li>
     * </ul>
     * <p>
     * <b>LOWERCASE</b>
     * </p>
     * <p>
     * Use this option to convert uppercase letters (A-Z) to lowercase (a-z).
     * </p>
     * <p>
     * <b>URL_DECODE</b>
     * </p>
     * <p>
     * Use this option to decode a URL-encoded value.
     * </p>
     * <p>
     * <b>NONE</b>
     * </p>
     * <p>
     * Specify <code>NONE</code> if you don't want to perform any text
     * transformations.
     * </p>
     * 
     * @param textTransformation
     *        Text transformations eliminate some of the unusual formatting that
     *        attackers use in web requests in an effort to bypass AWS WAF. If
     *        you specify a transformation, AWS WAF performs the transformation
     *        on <code>TargetString</code> before inspecting a request for a
     *        match.</p>
     *        <p>
     *        <b>CMD_LINE</b>
     *        </p>
     *        <p>
     *        When you're concerned that attackers are injecting an operating
     *        system commandline command and using unusual formatting to
     *        disguise some or all of the command, use this option to perform
     *        the following transformations:
     *        </p>
     *        <ul>
     *        <li>Delete the following characters: \ " ' ^</li>
     *        <li>Delete spaces before the following characters: / (</li>
     *        <li>Replace the following characters with a space: , ;</li>
     *        <li>Replace multiple spaces with one space</li>
     *        <li>Convert uppercase letters (A-Z) to lowercase (a-z)</li>
     *        </ul>
     *        <p>
     *        <b>COMPRESS_WHITE_SPACE</b>
     *        </p>
     *        <p>
     *        Use this option to replace the following characters with a space
     *        character (decimal 32):
     *        </p>
     *        <ul>
     *        <li>\f, formfeed, decimal 12</li>
     *        <li>\t, tab, decimal 9</li>
     *        <li>\n, newline, decimal 10</li>
     *        <li>\r, carriage return, decimal 13</li>
     *        <li>\v, vertical tab, decimal 11</li>
     *        <li>non-breaking space, decimal 160</li>
     *        </ul>
     *        <p>
     *        <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces
     *        with one space.
     *        </p>
     *        <p>
     *        <b>HTML_ENTITY_DECODE</b>
     *        </p>
     *        <p>
     *        Use this option to replace HTML-encoded characters with unencoded
     *        characters. <code>HTML_ENTITY_DECODE</code> performs the following
     *        operations:
     *        </p>
     *        <ul>
     *        <li>Replaces <code>(ampersand)quot;</code> with <code>"</code></li>
     *        <li>Replaces <code>(ampersand)nbsp;</code> with a non-breaking
     *        space, decimal 160</li>
     *        <li>Replaces <code>(ampersand)lt;</code> with a "less than" symbol
     *        </li>
     *        <li>Replaces <code>(ampersand)gt;</code> with <code>></code></li>
     *        <li>Replaces characters that are represented in hexadecimal
     *        format, <code>(ampersand)#xhhhh;</code>, with the corresponding
     *        characters</li>
     *        <li>Replaces characters that are represented in decimal format,
     *        <code>(ampersand)#nnnn;</code>, with the corresponding characters</li>
     *        </ul>
     *        <p>
     *        <b>LOWERCASE</b>
     *        </p>
     *        <p>
     *        Use this option to convert uppercase letters (A-Z) to lowercase
     *        (a-z).
     *        </p>
     *        <p>
     *        <b>URL_DECODE</b>
     *        </p>
     *        <p>
     *        Use this option to decode a URL-encoded value.
     *        </p>
     *        <p>
     *        <b>NONE</b>
     *        </p>
     *        <p>
     *        Specify <code>NONE</code> if you don't want to perform any text
     *        transformations.
     * @see TextTransformation
     */
    public void setTextTransformation(String textTransformation) {
        this.textTransformation = textTransformation;
    }

    /**
     * <p>
     * Text transformations eliminate some of the unusual formatting that
     * attackers use in web requests in an effort to bypass AWS WAF. If you
     * specify a transformation, AWS WAF performs the transformation on
     * <code>TargetString</code> before inspecting a request for a match.
     * </p>
     * <p>
     * <b>CMD_LINE</b>
     * </p>
     * <p>
     * When you're concerned that attackers are injecting an operating system
     * commandline command and using unusual formatting to disguise some or all
     * of the command, use this option to perform the following transformations:
     * </p>
     * <ul>
     * <li>Delete the following characters: \ " ' ^</li>
     * <li>Delete spaces before the following characters: / (</li>
     * <li>Replace the following characters with a space: , ;</li>
     * <li>Replace multiple spaces with one space</li>
     * <li>Convert uppercase letters (A-Z) to lowercase (a-z)</li>
     * </ul>
     * <p>
     * <b>COMPRESS_WHITE_SPACE</b>
     * </p>
     * <p>
     * Use this option to replace the following characters with a space
     * character (decimal 32):
     * </p>
     * <ul>
     * <li>\f, formfeed, decimal 12</li>
     * <li>\t, tab, decimal 9</li>
     * <li>\n, newline, decimal 10</li>
     * <li>\r, carriage return, decimal 13</li>
     * <li>\v, vertical tab, decimal 11</li>
     * <li>non-breaking space, decimal 160</li>
     * </ul>
     * <p>
     * <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces with one
     * space.
     * </p>
     * <p>
     * <b>HTML_ENTITY_DECODE</b>
     * </p>
     * <p>
     * Use this option to replace HTML-encoded characters with unencoded
     * characters. <code>HTML_ENTITY_DECODE</code> performs the following
     * operations:
     * </p>
     * <ul>
     * <li>Replaces <code>(ampersand)quot;</code> with <code>"</code></li>
     * <li>Replaces <code>(ampersand)nbsp;</code> with a non-breaking space,
     * decimal 160</li>
     * <li>Replaces <code>(ampersand)lt;</code> with a "less than" symbol</li>
     * <li>Replaces <code>(ampersand)gt;</code> with <code>></code></li>
     * <li>Replaces characters that are represented in hexadecimal format,
     * <code>(ampersand)#xhhhh;</code>, with the corresponding characters</li>
     * <li>Replaces characters that are represented in decimal format,
     * <code>(ampersand)#nnnn;</code>, with the corresponding characters</li>
     * </ul>
     * <p>
     * <b>LOWERCASE</b>
     * </p>
     * <p>
     * Use this option to convert uppercase letters (A-Z) to lowercase (a-z).
     * </p>
     * <p>
     * <b>URL_DECODE</b>
     * </p>
     * <p>
     * Use this option to decode a URL-encoded value.
     * </p>
     * <p>
     * <b>NONE</b>
     * </p>
     * <p>
     * Specify <code>NONE</code> if you don't want to perform any text
     * transformations.
     * </p>
     * 
     * @return Text transformations eliminate some of the unusual formatting
     *         that attackers use in web requests in an effort to bypass AWS
     *         WAF. If you specify a transformation, AWS WAF performs the
     *         transformation on <code>TargetString</code> before inspecting a
     *         request for a match.</p>
     *         <p>
     *         <b>CMD_LINE</b>
     *         </p>
     *         <p>
     *         When you're concerned that attackers are injecting an operating
     *         system commandline command and using unusual formatting to
     *         disguise some or all of the command, use this option to perform
     *         the following transformations:
     *         </p>
     *         <ul>
     *         <li>Delete the following characters: \ " ' ^</li>
     *         <li>Delete spaces before the following characters: / (</li>
     *         <li>Replace the following characters with a space: , ;</li>
     *         <li>Replace multiple spaces with one space</li>
     *         <li>Convert uppercase letters (A-Z) to lowercase (a-z)</li>
     *         </ul>
     *         <p>
     *         <b>COMPRESS_WHITE_SPACE</b>
     *         </p>
     *         <p>
     *         Use this option to replace the following characters with a space
     *         character (decimal 32):
     *         </p>
     *         <ul>
     *         <li>\f, formfeed, decimal 12</li>
     *         <li>\t, tab, decimal 9</li>
     *         <li>\n, newline, decimal 10</li>
     *         <li>\r, carriage return, decimal 13</li>
     *         <li>\v, vertical tab, decimal 11</li>
     *         <li>non-breaking space, decimal 160</li>
     *         </ul>
     *         <p>
     *         <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces
     *         with one space.
     *         </p>
     *         <p>
     *         <b>HTML_ENTITY_DECODE</b>
     *         </p>
     *         <p>
     *         Use this option to replace HTML-encoded characters with unencoded
     *         characters. <code>HTML_ENTITY_DECODE</code> performs the
     *         following operations:
     *         </p>
     *         <ul>
     *         <li>Replaces <code>(ampersand)quot;</code> with <code>"</code></li>
     *         <li>Replaces <code>(ampersand)nbsp;</code> with a non-breaking
     *         space, decimal 160</li>
     *         <li>Replaces <code>(ampersand)lt;</code> with a "less than"
     *         symbol</li>
     *         <li>Replaces <code>(ampersand)gt;</code> with <code>></code></li>
     *         <li>Replaces characters that are represented in hexadecimal
     *         format, <code>(ampersand)#xhhhh;</code>, with the corresponding
     *         characters</li>
     *         <li>Replaces characters that are represented in decimal format,
     *         <code>(ampersand)#nnnn;</code>, with the corresponding characters
     *         </li>
     *         </ul>
     *         <p>
     *         <b>LOWERCASE</b>
     *         </p>
     *         <p>
     *         Use this option to convert uppercase letters (A-Z) to lowercase
     *         (a-z).
     *         </p>
     *         <p>
     *         <b>URL_DECODE</b>
     *         </p>
     *         <p>
     *         Use this option to decode a URL-encoded value.
     *         </p>
     *         <p>
     *         <b>NONE</b>
     *         </p>
     *         <p>
     *         Specify <code>NONE</code> if you don't want to perform any text
     *         transformations.
     * @see TextTransformation
     */
    public String getTextTransformation() {
        return this.textTransformation;
    }

    /**
     * <p>
     * Text transformations eliminate some of the unusual formatting that
     * attackers use in web requests in an effort to bypass AWS WAF. If you
     * specify a transformation, AWS WAF performs the transformation on
     * <code>TargetString</code> before inspecting a request for a match.
     * </p>
     * <p>
     * <b>CMD_LINE</b>
     * </p>
     * <p>
     * When you're concerned that attackers are injecting an operating system
     * commandline command and using unusual formatting to disguise some or all
     * of the command, use this option to perform the following transformations:
     * </p>
     * <ul>
     * <li>Delete the following characters: \ " ' ^</li>
     * <li>Delete spaces before the following characters: / (</li>
     * <li>Replace the following characters with a space: , ;</li>
     * <li>Replace multiple spaces with one space</li>
     * <li>Convert uppercase letters (A-Z) to lowercase (a-z)</li>
     * </ul>
     * <p>
     * <b>COMPRESS_WHITE_SPACE</b>
     * </p>
     * <p>
     * Use this option to replace the following characters with a space
     * character (decimal 32):
     * </p>
     * <ul>
     * <li>\f, formfeed, decimal 12</li>
     * <li>\t, tab, decimal 9</li>
     * <li>\n, newline, decimal 10</li>
     * <li>\r, carriage return, decimal 13</li>
     * <li>\v, vertical tab, decimal 11</li>
     * <li>non-breaking space, decimal 160</li>
     * </ul>
     * <p>
     * <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces with one
     * space.
     * </p>
     * <p>
     * <b>HTML_ENTITY_DECODE</b>
     * </p>
     * <p>
     * Use this option to replace HTML-encoded characters with unencoded
     * characters. <code>HTML_ENTITY_DECODE</code> performs the following
     * operations:
     * </p>
     * <ul>
     * <li>Replaces <code>(ampersand)quot;</code> with <code>"</code></li>
     * <li>Replaces <code>(ampersand)nbsp;</code> with a non-breaking space,
     * decimal 160</li>
     * <li>Replaces <code>(ampersand)lt;</code> with a "less than" symbol</li>
     * <li>Replaces <code>(ampersand)gt;</code> with <code>></code></li>
     * <li>Replaces characters that are represented in hexadecimal format,
     * <code>(ampersand)#xhhhh;</code>, with the corresponding characters</li>
     * <li>Replaces characters that are represented in decimal format,
     * <code>(ampersand)#nnnn;</code>, with the corresponding characters</li>
     * </ul>
     * <p>
     * <b>LOWERCASE</b>
     * </p>
     * <p>
     * Use this option to convert uppercase letters (A-Z) to lowercase (a-z).
     * </p>
     * <p>
     * <b>URL_DECODE</b>
     * </p>
     * <p>
     * Use this option to decode a URL-encoded value.
     * </p>
     * <p>
     * <b>NONE</b>
     * </p>
     * <p>
     * Specify <code>NONE</code> if you don't want to perform any text
     * transformations.
     * </p>
     * 
     * @param textTransformation
     *        Text transformations eliminate some of the unusual formatting that
     *        attackers use in web requests in an effort to bypass AWS WAF. If
     *        you specify a transformation, AWS WAF performs the transformation
     *        on <code>TargetString</code> before inspecting a request for a
     *        match.</p>
     *        <p>
     *        <b>CMD_LINE</b>
     *        </p>
     *        <p>
     *        When you're concerned that attackers are injecting an operating
     *        system commandline command and using unusual formatting to
     *        disguise some or all of the command, use this option to perform
     *        the following transformations:
     *        </p>
     *        <ul>
     *        <li>Delete the following characters: \ " ' ^</li>
     *        <li>Delete spaces before the following characters: / (</li>
     *        <li>Replace the following characters with a space: , ;</li>
     *        <li>Replace multiple spaces with one space</li>
     *        <li>Convert uppercase letters (A-Z) to lowercase (a-z)</li>
     *        </ul>
     *        <p>
     *        <b>COMPRESS_WHITE_SPACE</b>
     *        </p>
     *        <p>
     *        Use this option to replace the following characters with a space
     *        character (decimal 32):
     *        </p>
     *        <ul>
     *        <li>\f, formfeed, decimal 12</li>
     *        <li>\t, tab, decimal 9</li>
     *        <li>\n, newline, decimal 10</li>
     *        <li>\r, carriage return, decimal 13</li>
     *        <li>\v, vertical tab, decimal 11</li>
     *        <li>non-breaking space, decimal 160</li>
     *        </ul>
     *        <p>
     *        <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces
     *        with one space.
     *        </p>
     *        <p>
     *        <b>HTML_ENTITY_DECODE</b>
     *        </p>
     *        <p>
     *        Use this option to replace HTML-encoded characters with unencoded
     *        characters. <code>HTML_ENTITY_DECODE</code> performs the following
     *        operations:
     *        </p>
     *        <ul>
     *        <li>Replaces <code>(ampersand)quot;</code> with <code>"</code></li>
     *        <li>Replaces <code>(ampersand)nbsp;</code> with a non-breaking
     *        space, decimal 160</li>
     *        <li>Replaces <code>(ampersand)lt;</code> with a "less than" symbol
     *        </li>
     *        <li>Replaces <code>(ampersand)gt;</code> with <code>></code></li>
     *        <li>Replaces characters that are represented in hexadecimal
     *        format, <code>(ampersand)#xhhhh;</code>, with the corresponding
     *        characters</li>
     *        <li>Replaces characters that are represented in decimal format,
     *        <code>(ampersand)#nnnn;</code>, with the corresponding characters</li>
     *        </ul>
     *        <p>
     *        <b>LOWERCASE</b>
     *        </p>
     *        <p>
     *        Use this option to convert uppercase letters (A-Z) to lowercase
     *        (a-z).
     *        </p>
     *        <p>
     *        <b>URL_DECODE</b>
     *        </p>
     *        <p>
     *        Use this option to decode a URL-encoded value.
     *        </p>
     *        <p>
     *        <b>NONE</b>
     *        </p>
     *        <p>
     *        Specify <code>NONE</code> if you don't want to perform any text
     *        transformations.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see TextTransformation
     */
    public ByteMatchTuple withTextTransformation(String textTransformation) {
        setTextTransformation(textTransformation);
        return this;
    }

    /**
     * <p>
     * Text transformations eliminate some of the unusual formatting that
     * attackers use in web requests in an effort to bypass AWS WAF. If you
     * specify a transformation, AWS WAF performs the transformation on
     * <code>TargetString</code> before inspecting a request for a match.
     * </p>
     * <p>
     * <b>CMD_LINE</b>
     * </p>
     * <p>
     * When you're concerned that attackers are injecting an operating system
     * commandline command and using unusual formatting to disguise some or all
     * of the command, use this option to perform the following transformations:
     * </p>
     * <ul>
     * <li>Delete the following characters: \ " ' ^</li>
     * <li>Delete spaces before the following characters: / (</li>
     * <li>Replace the following characters with a space: , ;</li>
     * <li>Replace multiple spaces with one space</li>
     * <li>Convert uppercase letters (A-Z) to lowercase (a-z)</li>
     * </ul>
     * <p>
     * <b>COMPRESS_WHITE_SPACE</b>
     * </p>
     * <p>
     * Use this option to replace the following characters with a space
     * character (decimal 32):
     * </p>
     * <ul>
     * <li>\f, formfeed, decimal 12</li>
     * <li>\t, tab, decimal 9</li>
     * <li>\n, newline, decimal 10</li>
     * <li>\r, carriage return, decimal 13</li>
     * <li>\v, vertical tab, decimal 11</li>
     * <li>non-breaking space, decimal 160</li>
     * </ul>
     * <p>
     * <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces with one
     * space.
     * </p>
     * <p>
     * <b>HTML_ENTITY_DECODE</b>
     * </p>
     * <p>
     * Use this option to replace HTML-encoded characters with unencoded
     * characters. <code>HTML_ENTITY_DECODE</code> performs the following
     * operations:
     * </p>
     * <ul>
     * <li>Replaces <code>(ampersand)quot;</code> with <code>"</code></li>
     * <li>Replaces <code>(ampersand)nbsp;</code> with a non-breaking space,
     * decimal 160</li>
     * <li>Replaces <code>(ampersand)lt;</code> with a "less than" symbol</li>
     * <li>Replaces <code>(ampersand)gt;</code> with <code>></code></li>
     * <li>Replaces characters that are represented in hexadecimal format,
     * <code>(ampersand)#xhhhh;</code>, with the corresponding characters</li>
     * <li>Replaces characters that are represented in decimal format,
     * <code>(ampersand)#nnnn;</code>, with the corresponding characters</li>
     * </ul>
     * <p>
     * <b>LOWERCASE</b>
     * </p>
     * <p>
     * Use this option to convert uppercase letters (A-Z) to lowercase (a-z).
     * </p>
     * <p>
     * <b>URL_DECODE</b>
     * </p>
     * <p>
     * Use this option to decode a URL-encoded value.
     * </p>
     * <p>
     * <b>NONE</b>
     * </p>
     * <p>
     * Specify <code>NONE</code> if you don't want to perform any text
     * transformations.
     * </p>
     * 
     * @param textTransformation
     *        Text transformations eliminate some of the unusual formatting that
     *        attackers use in web requests in an effort to bypass AWS WAF. If
     *        you specify a transformation, AWS WAF performs the transformation
     *        on <code>TargetString</code> before inspecting a request for a
     *        match.</p>
     *        <p>
     *        <b>CMD_LINE</b>
     *        </p>
     *        <p>
     *        When you're concerned that attackers are injecting an operating
     *        system commandline command and using unusual formatting to
     *        disguise some or all of the command, use this option to perform
     *        the following transformations:
     *        </p>
     *        <ul>
     *        <li>Delete the following characters: \ " ' ^</li>
     *        <li>Delete spaces before the following characters: / (</li>
     *        <li>Replace the following characters with a space: , ;</li>
     *        <li>Replace multiple spaces with one space</li>
     *        <li>Convert uppercase letters (A-Z) to lowercase (a-z)</li>
     *        </ul>
     *        <p>
     *        <b>COMPRESS_WHITE_SPACE</b>
     *        </p>
     *        <p>
     *        Use this option to replace the following characters with a space
     *        character (decimal 32):
     *        </p>
     *        <ul>
     *        <li>\f, formfeed, decimal 12</li>
     *        <li>\t, tab, decimal 9</li>
     *        <li>\n, newline, decimal 10</li>
     *        <li>\r, carriage return, decimal 13</li>
     *        <li>\v, vertical tab, decimal 11</li>
     *        <li>non-breaking space, decimal 160</li>
     *        </ul>
     *        <p>
     *        <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces
     *        with one space.
     *        </p>
     *        <p>
     *        <b>HTML_ENTITY_DECODE</b>
     *        </p>
     *        <p>
     *        Use this option to replace HTML-encoded characters with unencoded
     *        characters. <code>HTML_ENTITY_DECODE</code> performs the following
     *        operations:
     *        </p>
     *        <ul>
     *        <li>Replaces <code>(ampersand)quot;</code> with <code>"</code></li>
     *        <li>Replaces <code>(ampersand)nbsp;</code> with a non-breaking
     *        space, decimal 160</li>
     *        <li>Replaces <code>(ampersand)lt;</code> with a "less than" symbol
     *        </li>
     *        <li>Replaces <code>(ampersand)gt;</code> with <code>></code></li>
     *        <li>Replaces characters that are represented in hexadecimal
     *        format, <code>(ampersand)#xhhhh;</code>, with the corresponding
     *        characters</li>
     *        <li>Replaces characters that are represented in decimal format,
     *        <code>(ampersand)#nnnn;</code>, with the corresponding characters</li>
     *        </ul>
     *        <p>
     *        <b>LOWERCASE</b>
     *        </p>
     *        <p>
     *        Use this option to convert uppercase letters (A-Z) to lowercase
     *        (a-z).
     *        </p>
     *        <p>
     *        <b>URL_DECODE</b>
     *        </p>
     *        <p>
     *        Use this option to decode a URL-encoded value.
     *        </p>
     *        <p>
     *        <b>NONE</b>
     *        </p>
     *        <p>
     *        Specify <code>NONE</code> if you don't want to perform any text
     *        transformations.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see TextTransformation
     */
    public void setTextTransformation(TextTransformation textTransformation) {
        this.textTransformation = textTransformation.toString();
    }

    /**
     * <p>
     * Text transformations eliminate some of the unusual formatting that
     * attackers use in web requests in an effort to bypass AWS WAF. If you
     * specify a transformation, AWS WAF performs the transformation on
     * <code>TargetString</code> before inspecting a request for a match.
     * </p>
     * <p>
     * <b>CMD_LINE</b>
     * </p>
     * <p>
     * When you're concerned that attackers are injecting an operating system
     * commandline command and using unusual formatting to disguise some or all
     * of the command, use this option to perform the following transformations:
     * </p>
     * <ul>
     * <li>Delete the following characters: \ " ' ^</li>
     * <li>Delete spaces before the following characters: / (</li>
     * <li>Replace the following characters with a space: , ;</li>
     * <li>Replace multiple spaces with one space</li>
     * <li>Convert uppercase letters (A-Z) to lowercase (a-z)</li>
     * </ul>
     * <p>
     * <b>COMPRESS_WHITE_SPACE</b>
     * </p>
     * <p>
     * Use this option to replace the following characters with a space
     * character (decimal 32):
     * </p>
     * <ul>
     * <li>\f, formfeed, decimal 12</li>
     * <li>\t, tab, decimal 9</li>
     * <li>\n, newline, decimal 10</li>
     * <li>\r, carriage return, decimal 13</li>
     * <li>\v, vertical tab, decimal 11</li>
     * <li>non-breaking space, decimal 160</li>
     * </ul>
     * <p>
     * <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces with one
     * space.
     * </p>
     * <p>
     * <b>HTML_ENTITY_DECODE</b>
     * </p>
     * <p>
     * Use this option to replace HTML-encoded characters with unencoded
     * characters. <code>HTML_ENTITY_DECODE</code> performs the following
     * operations:
     * </p>
     * <ul>
     * <li>Replaces <code>(ampersand)quot;</code> with <code>"</code></li>
     * <li>Replaces <code>(ampersand)nbsp;</code> with a non-breaking space,
     * decimal 160</li>
     * <li>Replaces <code>(ampersand)lt;</code> with a "less than" symbol</li>
     * <li>Replaces <code>(ampersand)gt;</code> with <code>></code></li>
     * <li>Replaces characters that are represented in hexadecimal format,
     * <code>(ampersand)#xhhhh;</code>, with the corresponding characters</li>
     * <li>Replaces characters that are represented in decimal format,
     * <code>(ampersand)#nnnn;</code>, with the corresponding characters</li>
     * </ul>
     * <p>
     * <b>LOWERCASE</b>
     * </p>
     * <p>
     * Use this option to convert uppercase letters (A-Z) to lowercase (a-z).
     * </p>
     * <p>
     * <b>URL_DECODE</b>
     * </p>
     * <p>
     * Use this option to decode a URL-encoded value.
     * </p>
     * <p>
     * <b>NONE</b>
     * </p>
     * <p>
     * Specify <code>NONE</code> if you don't want to perform any text
     * transformations.
     * </p>
     * 
     * @param textTransformation
     *        Text transformations eliminate some of the unusual formatting that
     *        attackers use in web requests in an effort to bypass AWS WAF. If
     *        you specify a transformation, AWS WAF performs the transformation
     *        on <code>TargetString</code> before inspecting a request for a
     *        match.</p>
     *        <p>
     *        <b>CMD_LINE</b>
     *        </p>
     *        <p>
     *        When you're concerned that attackers are injecting an operating
     *        system commandline command and using unusual formatting to
     *        disguise some or all of the command, use this option to perform
     *        the following transformations:
     *        </p>
     *        <ul>
     *        <li>Delete the following characters: \ " ' ^</li>
     *        <li>Delete spaces before the following characters: / (</li>
     *        <li>Replace the following characters with a space: , ;</li>
     *        <li>Replace multiple spaces with one space</li>
     *        <li>Convert uppercase letters (A-Z) to lowercase (a-z)</li>
     *        </ul>
     *        <p>
     *        <b>COMPRESS_WHITE_SPACE</b>
     *        </p>
     *        <p>
     *        Use this option to replace the following characters with a space
     *        character (decimal 32):
     *        </p>
     *        <ul>
     *        <li>\f, formfeed, decimal 12</li>
     *        <li>\t, tab, decimal 9</li>
     *        <li>\n, newline, decimal 10</li>
     *        <li>\r, carriage return, decimal 13</li>
     *        <li>\v, vertical tab, decimal 11</li>
     *        <li>non-breaking space, decimal 160</li>
     *        </ul>
     *        <p>
     *        <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces
     *        with one space.
     *        </p>
     *        <p>
     *        <b>HTML_ENTITY_DECODE</b>
     *        </p>
     *        <p>
     *        Use this option to replace HTML-encoded characters with unencoded
     *        characters. <code>HTML_ENTITY_DECODE</code> performs the following
     *        operations:
     *        </p>
     *        <ul>
     *        <li>Replaces <code>(ampersand)quot;</code> with <code>"</code></li>
     *        <li>Replaces <code>(ampersand)nbsp;</code> with a non-breaking
     *        space, decimal 160</li>
     *        <li>Replaces <code>(ampersand)lt;</code> with a "less than" symbol
     *        </li>
     *        <li>Replaces <code>(ampersand)gt;</code> with <code>></code></li>
     *        <li>Replaces characters that are represented in hexadecimal
     *        format, <code>(ampersand)#xhhhh;</code>, with the corresponding
     *        characters</li>
     *        <li>Replaces characters that are represented in decimal format,
     *        <code>(ampersand)#nnnn;</code>, with the corresponding characters</li>
     *        </ul>
     *        <p>
     *        <b>LOWERCASE</b>
     *        </p>
     *        <p>
     *        Use this option to convert uppercase letters (A-Z) to lowercase
     *        (a-z).
     *        </p>
     *        <p>
     *        <b>URL_DECODE</b>
     *        </p>
     *        <p>
     *        Use this option to decode a URL-encoded value.
     *        </p>
     *        <p>
     *        <b>NONE</b>
     *        </p>
     *        <p>
     *        Specify <code>NONE</code> if you don't want to perform any text
     *        transformations.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see TextTransformation
     */
    public ByteMatchTuple withTextTransformation(
            TextTransformation textTransformation) {
        setTextTransformation(textTransformation);
        return this;
    }

    /**
     * <p>
     * Within the portion of a web request that you want to search (for example,
     * in the query string, if any), specify where you want AWS WAF to search.
     * Valid values include the following:
     * </p>
     * <p>
     * <b>CONTAINS</b>
     * </p>
     * <p>
     * The specified part of the web request must include the value of
     * <code>TargetString</code>, but the location doesn't matter.
     * </p>
     * <p>
     * <b>CONTAINS_WORD</b>
     * </p>
     * <p>
     * The specified part of the web request must include the value of
     * <code>TargetString</code>, and <code>TargetString</code> must contain
     * only alphanumeric characters or underscore (A-Z, a-z, 0-9, or _). In
     * addition, <code>TargetString</code> must be a word, which means one of
     * the following:
     * </p>
     * <ul>
     * <li><code>TargetString</code> exactly matches the value of the specified
     * part of the web request, such as the value of a header.</li>
     * <li><code>TargetString</code> is at the beginning of the specified part
     * of the web request and is followed by a character other than an
     * alphanumeric character or underscore (_), for example,
     * <code>BadBot;</code>.</li>
     * <li><code>TargetString</code> is at the end of the specified part of the
     * web request and is preceded by a character other than an alphanumeric
     * character or underscore (_), for example, <code>;BadBot</code>.</li>
     * <li><code>TargetString</code> is in the middle of the specified part of
     * the web request and is preceded and followed by characters other than
     * alphanumeric characters or underscore (_), for example,
     * <code>-BadBot;</code>.</li>
     * </ul>
     * <p>
     * <b>EXACTLY</b>
     * </p>
     * <p>
     * The value of the specified part of the web request must exactly match the
     * value of <code>TargetString</code>.
     * </p>
     * <p>
     * <b>STARTS_WITH</b>
     * </p>
     * <p>
     * The value of <code>TargetString</code> must appear at the beginning of
     * the specified part of the web request.
     * </p>
     * <p>
     * <b>ENDS_WITH</b>
     * </p>
     * <p>
     * The value of <code>TargetString</code> must appear at the end of the
     * specified part of the web request.
     * </p>
     * 
     * @param positionalConstraint
     *        Within the portion of a web request that you want to search (for
     *        example, in the query string, if any), specify where you want AWS
     *        WAF to search. Valid values include the following:</p>
     *        <p>
     *        <b>CONTAINS</b>
     *        </p>
     *        <p>
     *        The specified part of the web request must include the value of
     *        <code>TargetString</code>, but the location doesn't matter.
     *        </p>
     *        <p>
     *        <b>CONTAINS_WORD</b>
     *        </p>
     *        <p>
     *        The specified part of the web request must include the value of
     *        <code>TargetString</code>, and <code>TargetString</code> must
     *        contain only alphanumeric characters or underscore (A-Z, a-z, 0-9,
     *        or _). In addition, <code>TargetString</code> must be a word,
     *        which means one of the following:
     *        </p>
     *        <ul>
     *        <li><code>TargetString</code> exactly matches the value of the
     *        specified part of the web request, such as the value of a header.</li>
     *        <li><code>TargetString</code> is at the beginning of the specified
     *        part of the web request and is followed by a character other than
     *        an alphanumeric character or underscore (_), for example,
     *        <code>BadBot;</code>.</li>
     *        <li><code>TargetString</code> is at the end of the specified part
     *        of the web request and is preceded by a character other than an
     *        alphanumeric character or underscore (_), for example,
     *        <code>;BadBot</code>.</li>
     *        <li><code>TargetString</code> is in the middle of the specified
     *        part of the web request and is preceded and followed by characters
     *        other than alphanumeric characters or underscore (_), for example,
     *        <code>-BadBot;</code>.</li>
     *        </ul>
     *        <p>
     *        <b>EXACTLY</b>
     *        </p>
     *        <p>
     *        The value of the specified part of the web request must exactly
     *        match the value of <code>TargetString</code>.
     *        </p>
     *        <p>
     *        <b>STARTS_WITH</b>
     *        </p>
     *        <p>
     *        The value of <code>TargetString</code> must appear at the
     *        beginning of the specified part of the web request.
     *        </p>
     *        <p>
     *        <b>ENDS_WITH</b>
     *        </p>
     *        <p>
     *        The value of <code>TargetString</code> must appear at the end of
     *        the specified part of the web request.
     * @see PositionalConstraint
     */
    public void setPositionalConstraint(String positionalConstraint) {
        this.positionalConstraint = positionalConstraint;
    }

    /**
     * <p>
     * Within the portion of a web request that you want to search (for example,
     * in the query string, if any), specify where you want AWS WAF to search.
     * Valid values include the following:
     * </p>
     * <p>
     * <b>CONTAINS</b>
     * </p>
     * <p>
     * The specified part of the web request must include the value of
     * <code>TargetString</code>, but the location doesn't matter.
     * </p>
     * <p>
     * <b>CONTAINS_WORD</b>
     * </p>
     * <p>
     * The specified part of the web request must include the value of
     * <code>TargetString</code>, and <code>TargetString</code> must contain
     * only alphanumeric characters or underscore (A-Z, a-z, 0-9, or _). In
     * addition, <code>TargetString</code> must be a word, which means one of
     * the following:
     * </p>
     * <ul>
     * <li><code>TargetString</code> exactly matches the value of the specified
     * part of the web request, such as the value of a header.</li>
     * <li><code>TargetString</code> is at the beginning of the specified part
     * of the web request and is followed by a character other than an
     * alphanumeric character or underscore (_), for example,
     * <code>BadBot;</code>.</li>
     * <li><code>TargetString</code> is at the end of the specified part of the
     * web request and is preceded by a character other than an alphanumeric
     * character or underscore (_), for example, <code>;BadBot</code>.</li>
     * <li><code>TargetString</code> is in the middle of the specified part of
     * the web request and is preceded and followed by characters other than
     * alphanumeric characters or underscore (_), for example,
     * <code>-BadBot;</code>.</li>
     * </ul>
     * <p>
     * <b>EXACTLY</b>
     * </p>
     * <p>
     * The value of the specified part of the web request must exactly match the
     * value of <code>TargetString</code>.
     * </p>
     * <p>
     * <b>STARTS_WITH</b>
     * </p>
     * <p>
     * The value of <code>TargetString</code> must appear at the beginning of
     * the specified part of the web request.
     * </p>
     * <p>
     * <b>ENDS_WITH</b>
     * </p>
     * <p>
     * The value of <code>TargetString</code> must appear at the end of the
     * specified part of the web request.
     * </p>
     * 
     * @return Within the portion of a web request that you want to search (for
     *         example, in the query string, if any), specify where you want AWS
     *         WAF to search. Valid values include the following:</p>
     *         <p>
     *         <b>CONTAINS</b>
     *         </p>
     *         <p>
     *         The specified part of the web request must include the value of
     *         <code>TargetString</code>, but the location doesn't matter.
     *         </p>
     *         <p>
     *         <b>CONTAINS_WORD</b>
     *         </p>
     *         <p>
     *         The specified part of the web request must include the value of
     *         <code>TargetString</code>, and <code>TargetString</code> must
     *         contain only alphanumeric characters or underscore (A-Z, a-z,
     *         0-9, or _). In addition, <code>TargetString</code> must be a
     *         word, which means one of the following:
     *         </p>
     *         <ul>
     *         <li><code>TargetString</code> exactly matches the value of the
     *         specified part of the web request, such as the value of a header.
     *         </li>
     *         <li><code>TargetString</code> is at the beginning of the
     *         specified part of the web request and is followed by a character
     *         other than an alphanumeric character or underscore (_), for
     *         example, <code>BadBot;</code>.</li>
     *         <li><code>TargetString</code> is at the end of the specified part
     *         of the web request and is preceded by a character other than an
     *         alphanumeric character or underscore (_), for example,
     *         <code>;BadBot</code>.</li>
     *         <li><code>TargetString</code> is in the middle of the specified
     *         part of the web request and is preceded and followed by
     *         characters other than alphanumeric characters or underscore (_),
     *         for example, <code>-BadBot;</code>.</li>
     *         </ul>
     *         <p>
     *         <b>EXACTLY</b>
     *         </p>
     *         <p>
     *         The value of the specified part of the web request must exactly
     *         match the value of <code>TargetString</code>.
     *         </p>
     *         <p>
     *         <b>STARTS_WITH</b>
     *         </p>
     *         <p>
     *         The value of <code>TargetString</code> must appear at the
     *         beginning of the specified part of the web request.
     *         </p>
     *         <p>
     *         <b>ENDS_WITH</b>
     *         </p>
     *         <p>
     *         The value of <code>TargetString</code> must appear at the end of
     *         the specified part of the web request.
     * @see PositionalConstraint
     */
    public String getPositionalConstraint() {
        return this.positionalConstraint;
    }

    /**
     * <p>
     * Within the portion of a web request that you want to search (for example,
     * in the query string, if any), specify where you want AWS WAF to search.
     * Valid values include the following:
     * </p>
     * <p>
     * <b>CONTAINS</b>
     * </p>
     * <p>
     * The specified part of the web request must include the value of
     * <code>TargetString</code>, but the location doesn't matter.
     * </p>
     * <p>
     * <b>CONTAINS_WORD</b>
     * </p>
     * <p>
     * The specified part of the web request must include the value of
     * <code>TargetString</code>, and <code>TargetString</code> must contain
     * only alphanumeric characters or underscore (A-Z, a-z, 0-9, or _). In
     * addition, <code>TargetString</code> must be a word, which means one of
     * the following:
     * </p>
     * <ul>
     * <li><code>TargetString</code> exactly matches the value of the specified
     * part of the web request, such as the value of a header.</li>
     * <li><code>TargetString</code> is at the beginning of the specified part
     * of the web request and is followed by a character other than an
     * alphanumeric character or underscore (_), for example,
     * <code>BadBot;</code>.</li>
     * <li><code>TargetString</code> is at the end of the specified part of the
     * web request and is preceded by a character other than an alphanumeric
     * character or underscore (_), for example, <code>;BadBot</code>.</li>
     * <li><code>TargetString</code> is in the middle of the specified part of
     * the web request and is preceded and followed by characters other than
     * alphanumeric characters or underscore (_), for example,
     * <code>-BadBot;</code>.</li>
     * </ul>
     * <p>
     * <b>EXACTLY</b>
     * </p>
     * <p>
     * The value of the specified part of the web request must exactly match the
     * value of <code>TargetString</code>.
     * </p>
     * <p>
     * <b>STARTS_WITH</b>
     * </p>
     * <p>
     * The value of <code>TargetString</code> must appear at the beginning of
     * the specified part of the web request.
     * </p>
     * <p>
     * <b>ENDS_WITH</b>
     * </p>
     * <p>
     * The value of <code>TargetString</code> must appear at the end of the
     * specified part of the web request.
     * </p>
     * 
     * @param positionalConstraint
     *        Within the portion of a web request that you want to search (for
     *        example, in the query string, if any), specify where you want AWS
     *        WAF to search. Valid values include the following:</p>
     *        <p>
     *        <b>CONTAINS</b>
     *        </p>
     *        <p>
     *        The specified part of the web request must include the value of
     *        <code>TargetString</code>, but the location doesn't matter.
     *        </p>
     *        <p>
     *        <b>CONTAINS_WORD</b>
     *        </p>
     *        <p>
     *        The specified part of the web request must include the value of
     *        <code>TargetString</code>, and <code>TargetString</code> must
     *        contain only alphanumeric characters or underscore (A-Z, a-z, 0-9,
     *        or _). In addition, <code>TargetString</code> must be a word,
     *        which means one of the following:
     *        </p>
     *        <ul>
     *        <li><code>TargetString</code> exactly matches the value of the
     *        specified part of the web request, such as the value of a header.</li>
     *        <li><code>TargetString</code> is at the beginning of the specified
     *        part of the web request and is followed by a character other than
     *        an alphanumeric character or underscore (_), for example,
     *        <code>BadBot;</code>.</li>
     *        <li><code>TargetString</code> is at the end of the specified part
     *        of the web request and is preceded by a character other than an
     *        alphanumeric character or underscore (_), for example,
     *        <code>;BadBot</code>.</li>
     *        <li><code>TargetString</code> is in the middle of the specified
     *        part of the web request and is preceded and followed by characters
     *        other than alphanumeric characters or underscore (_), for example,
     *        <code>-BadBot;</code>.</li>
     *        </ul>
     *        <p>
     *        <b>EXACTLY</b>
     *        </p>
     *        <p>
     *        The value of the specified part of the web request must exactly
     *        match the value of <code>TargetString</code>.
     *        </p>
     *        <p>
     *        <b>STARTS_WITH</b>
     *        </p>
     *        <p>
     *        The value of <code>TargetString</code> must appear at the
     *        beginning of the specified part of the web request.
     *        </p>
     *        <p>
     *        <b>ENDS_WITH</b>
     *        </p>
     *        <p>
     *        The value of <code>TargetString</code> must appear at the end of
     *        the specified part of the web request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see PositionalConstraint
     */
    public ByteMatchTuple withPositionalConstraint(String positionalConstraint) {
        setPositionalConstraint(positionalConstraint);
        return this;
    }

    /**
     * <p>
     * Within the portion of a web request that you want to search (for example,
     * in the query string, if any), specify where you want AWS WAF to search.
     * Valid values include the following:
     * </p>
     * <p>
     * <b>CONTAINS</b>
     * </p>
     * <p>
     * The specified part of the web request must include the value of
     * <code>TargetString</code>, but the location doesn't matter.
     * </p>
     * <p>
     * <b>CONTAINS_WORD</b>
     * </p>
     * <p>
     * The specified part of the web request must include the value of
     * <code>TargetString</code>, and <code>TargetString</code> must contain
     * only alphanumeric characters or underscore (A-Z, a-z, 0-9, or _). In
     * addition, <code>TargetString</code> must be a word, which means one of
     * the following:
     * </p>
     * <ul>
     * <li><code>TargetString</code> exactly matches the value of the specified
     * part of the web request, such as the value of a header.</li>
     * <li><code>TargetString</code> is at the beginning of the specified part
     * of the web request and is followed by a character other than an
     * alphanumeric character or underscore (_), for example,
     * <code>BadBot;</code>.</li>
     * <li><code>TargetString</code> is at the end of the specified part of the
     * web request and is preceded by a character other than an alphanumeric
     * character or underscore (_), for example, <code>;BadBot</code>.</li>
     * <li><code>TargetString</code> is in the middle of the specified part of
     * the web request and is preceded and followed by characters other than
     * alphanumeric characters or underscore (_), for example,
     * <code>-BadBot;</code>.</li>
     * </ul>
     * <p>
     * <b>EXACTLY</b>
     * </p>
     * <p>
     * The value of the specified part of the web request must exactly match the
     * value of <code>TargetString</code>.
     * </p>
     * <p>
     * <b>STARTS_WITH</b>
     * </p>
     * <p>
     * The value of <code>TargetString</code> must appear at the beginning of
     * the specified part of the web request.
     * </p>
     * <p>
     * <b>ENDS_WITH</b>
     * </p>
     * <p>
     * The value of <code>TargetString</code> must appear at the end of the
     * specified part of the web request.
     * </p>
     * 
     * @param positionalConstraint
     *        Within the portion of a web request that you want to search (for
     *        example, in the query string, if any), specify where you want AWS
     *        WAF to search. Valid values include the following:</p>
     *        <p>
     *        <b>CONTAINS</b>
     *        </p>
     *        <p>
     *        The specified part of the web request must include the value of
     *        <code>TargetString</code>, but the location doesn't matter.
     *        </p>
     *        <p>
     *        <b>CONTAINS_WORD</b>
     *        </p>
     *        <p>
     *        The specified part of the web request must include the value of
     *        <code>TargetString</code>, and <code>TargetString</code> must
     *        contain only alphanumeric characters or underscore (A-Z, a-z, 0-9,
     *        or _). In addition, <code>TargetString</code> must be a word,
     *        which means one of the following:
     *        </p>
     *        <ul>
     *        <li><code>TargetString</code> exactly matches the value of the
     *        specified part of the web request, such as the value of a header.</li>
     *        <li><code>TargetString</code> is at the beginning of the specified
     *        part of the web request and is followed by a character other than
     *        an alphanumeric character or underscore (_), for example,
     *        <code>BadBot;</code>.</li>
     *        <li><code>TargetString</code> is at the end of the specified part
     *        of the web request and is preceded by a character other than an
     *        alphanumeric character or underscore (_), for example,
     *        <code>;BadBot</code>.</li>
     *        <li><code>TargetString</code> is in the middle of the specified
     *        part of the web request and is preceded and followed by characters
     *        other than alphanumeric characters or underscore (_), for example,
     *        <code>-BadBot;</code>.</li>
     *        </ul>
     *        <p>
     *        <b>EXACTLY</b>
     *        </p>
     *        <p>
     *        The value of the specified part of the web request must exactly
     *        match the value of <code>TargetString</code>.
     *        </p>
     *        <p>
     *        <b>STARTS_WITH</b>
     *        </p>
     *        <p>
     *        The value of <code>TargetString</code> must appear at the
     *        beginning of the specified part of the web request.
     *        </p>
     *        <p>
     *        <b>ENDS_WITH</b>
     *        </p>
     *        <p>
     *        The value of <code>TargetString</code> must appear at the end of
     *        the specified part of the web request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see PositionalConstraint
     */
    public void setPositionalConstraint(
            PositionalConstraint positionalConstraint) {
        this.positionalConstraint = positionalConstraint.toString();
    }

    /**
     * <p>
     * Within the portion of a web request that you want to search (for example,
     * in the query string, if any), specify where you want AWS WAF to search.
     * Valid values include the following:
     * </p>
     * <p>
     * <b>CONTAINS</b>
     * </p>
     * <p>
     * The specified part of the web request must include the value of
     * <code>TargetString</code>, but the location doesn't matter.
     * </p>
     * <p>
     * <b>CONTAINS_WORD</b>
     * </p>
     * <p>
     * The specified part of the web request must include the value of
     * <code>TargetString</code>, and <code>TargetString</code> must contain
     * only alphanumeric characters or underscore (A-Z, a-z, 0-9, or _). In
     * addition, <code>TargetString</code> must be a word, which means one of
     * the following:
     * </p>
     * <ul>
     * <li><code>TargetString</code> exactly matches the value of the specified
     * part of the web request, such as the value of a header.</li>
     * <li><code>TargetString</code> is at the beginning of the specified part
     * of the web request and is followed by a character other than an
     * alphanumeric character or underscore (_), for example,
     * <code>BadBot;</code>.</li>
     * <li><code>TargetString</code> is at the end of the specified part of the
     * web request and is preceded by a character other than an alphanumeric
     * character or underscore (_), for example, <code>;BadBot</code>.</li>
     * <li><code>TargetString</code> is in the middle of the specified part of
     * the web request and is preceded and followed by characters other than
     * alphanumeric characters or underscore (_), for example,
     * <code>-BadBot;</code>.</li>
     * </ul>
     * <p>
     * <b>EXACTLY</b>
     * </p>
     * <p>
     * The value of the specified part of the web request must exactly match the
     * value of <code>TargetString</code>.
     * </p>
     * <p>
     * <b>STARTS_WITH</b>
     * </p>
     * <p>
     * The value of <code>TargetString</code> must appear at the beginning of
     * the specified part of the web request.
     * </p>
     * <p>
     * <b>ENDS_WITH</b>
     * </p>
     * <p>
     * The value of <code>TargetString</code> must appear at the end of the
     * specified part of the web request.
     * </p>
     * 
     * @param positionalConstraint
     *        Within the portion of a web request that you want to search (for
     *        example, in the query string, if any), specify where you want AWS
     *        WAF to search. Valid values include the following:</p>
     *        <p>
     *        <b>CONTAINS</b>
     *        </p>
     *        <p>
     *        The specified part of the web request must include the value of
     *        <code>TargetString</code>, but the location doesn't matter.
     *        </p>
     *        <p>
     *        <b>CONTAINS_WORD</b>
     *        </p>
     *        <p>
     *        The specified part of the web request must include the value of
     *        <code>TargetString</code>, and <code>TargetString</code> must
     *        contain only alphanumeric characters or underscore (A-Z, a-z, 0-9,
     *        or _). In addition, <code>TargetString</code> must be a word,
     *        which means one of the following:
     *        </p>
     *        <ul>
     *        <li><code>TargetString</code> exactly matches the value of the
     *        specified part of the web request, such as the value of a header.</li>
     *        <li><code>TargetString</code> is at the beginning of the specified
     *        part of the web request and is followed by a character other than
     *        an alphanumeric character or underscore (_), for example,
     *        <code>BadBot;</code>.</li>
     *        <li><code>TargetString</code> is at the end of the specified part
     *        of the web request and is preceded by a character other than an
     *        alphanumeric character or underscore (_), for example,
     *        <code>;BadBot</code>.</li>
     *        <li><code>TargetString</code> is in the middle of the specified
     *        part of the web request and is preceded and followed by characters
     *        other than alphanumeric characters or underscore (_), for example,
     *        <code>-BadBot;</code>.</li>
     *        </ul>
     *        <p>
     *        <b>EXACTLY</b>
     *        </p>
     *        <p>
     *        The value of the specified part of the web request must exactly
     *        match the value of <code>TargetString</code>.
     *        </p>
     *        <p>
     *        <b>STARTS_WITH</b>
     *        </p>
     *        <p>
     *        The value of <code>TargetString</code> must appear at the
     *        beginning of the specified part of the web request.
     *        </p>
     *        <p>
     *        <b>ENDS_WITH</b>
     *        </p>
     *        <p>
     *        The value of <code>TargetString</code> must appear at the end of
     *        the specified part of the web request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see PositionalConstraint
     */
    public ByteMatchTuple withPositionalConstraint(
            PositionalConstraint positionalConstraint) {
        setPositionalConstraint(positionalConstraint);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFieldToMatch() != null)
            sb.append("FieldToMatch: " + getFieldToMatch() + ",");
        if (getTargetString() != null)
            sb.append("TargetString: " + getTargetString() + ",");
        if (getTextTransformation() != null)
            sb.append("TextTransformation: " + getTextTransformation() + ",");
        if (getPositionalConstraint() != null)
            sb.append("PositionalConstraint: " + getPositionalConstraint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ByteMatchTuple == false)
            return false;
        ByteMatchTuple other = (ByteMatchTuple) obj;
        if (other.getFieldToMatch() == null ^ this.getFieldToMatch() == null)
            return false;
        if (other.getFieldToMatch() != null
                && other.getFieldToMatch().equals(this.getFieldToMatch()) == false)
            return false;
        if (other.getTargetString() == null ^ this.getTargetString() == null)
            return false;
        if (other.getTargetString() != null
                && other.getTargetString().equals(this.getTargetString()) == false)
            return false;
        if (other.getTextTransformation() == null
                ^ this.getTextTransformation() == null)
            return false;
        if (other.getTextTransformation() != null
                && other.getTextTransformation().equals(
                        this.getTextTransformation()) == false)
            return false;
        if (other.getPositionalConstraint() == null
                ^ this.getPositionalConstraint() == null)
            return false;
        if (other.getPositionalConstraint() != null
                && other.getPositionalConstraint().equals(
                        this.getPositionalConstraint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getFieldToMatch() == null) ? 0 : getFieldToMatch()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTargetString() == null) ? 0 : getTargetString()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTextTransformation() == null) ? 0
                        : getTextTransformation().hashCode());
        hashCode = prime
                * hashCode
                + ((getPositionalConstraint() == null) ? 0
                        : getPositionalConstraint().hashCode());
        return hashCode;
    }

    @Override
    public ByteMatchTuple clone() {
        try {
            return (ByteMatchTuple) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}