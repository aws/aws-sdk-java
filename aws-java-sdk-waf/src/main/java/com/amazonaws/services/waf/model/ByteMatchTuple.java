/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.waf.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to search for in web
 * requests, the location in requests that you want AWS WAF to search, and other settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ByteMatchTuple" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ByteMatchTuple implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The part of a web request that you want AWS WAF to search, such as a specified header or a query string. For more
     * information, see <a>FieldToMatch</a>.
     * </p>
     */
    private FieldToMatch fieldToMatch;
    /**
     * <p>
     * The value that you want AWS WAF to search for. AWS WAF searches for the specified string in the part of web
     * requests that you specified in <code>FieldToMatch</code>. The maximum length of the value is 50 bytes.
     * </p>
     * <p>
     * Valid values depend on the values that you specified for <code>FieldToMatch</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HEADER</code>: The value that you want AWS WAF to search for in the request header that you specified in
     * <a>FieldToMatch</a>, for example, the value of the <code>User-Agent</code> or <code>Referer</code> header.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>METHOD</code>: The HTTP method, which indicates the type of operation specified in the request. CloudFront
     * supports the following methods: <code>DELETE</code>, <code>GET</code>, <code>HEAD</code>, <code>OPTIONS</code>,
     * <code>PATCH</code>, <code>POST</code>, and <code>PUT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUERY_STRING</code>: The value that you want AWS WAF to search for in the query string, which is the part
     * of a URL that appears after a <code>?</code> character.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>URI</code>: The value that you want AWS WAF to search for in the part of a URL that identifies a resource,
     * for example, <code>/images/daily-ad.jpg</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BODY</code>: The part of a request that contains any additional data that you want to send to your web
     * server as the HTTP request body, such as data from a form. The request body immediately follows the request
     * headers. Note that only the first <code>8192</code> bytes of the request body are forwarded to AWS WAF for
     * inspection. To allow or block requests based on the length of the body, you can create a size constraint set. For
     * more information, see <a>CreateSizeConstraintSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_QUERY_ARG</code>: The parameter in the query string that you will inspect, such as <i>UserName</i>
     * or <i>SalesRegion</i>. The maximum length for <code>SINGLE_QUERY_ARG</code> is 30 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_QUERY_ARGS</code>: Similar to <code>SINGLE_QUERY_ARG</code>, but instead of inspecting a single
     * parameter, AWS WAF inspects all parameters within the query string for the value or regex pattern that you
     * specify in <code>TargetString</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>TargetString</code> includes alphabetic characters A-Z and a-z, note that the value is case sensitive.
     * </p>
     * <p>
     * <b>If you're using the AWS WAF API</b>
     * </p>
     * <p>
     * Specify a base64-encoded version of the value. The maximum length of the value before you base64-encode it is 50
     * bytes.
     * </p>
     * <p>
     * For example, suppose the value of <code>Type</code> is <code>HEADER</code> and the value of <code>Data</code> is
     * <code>User-Agent</code>. If you want to search the <code>User-Agent</code> header for the value
     * <code>BadBot</code>, you base64-encode <code>BadBot</code> using MIME base64-encoding and include the resulting
     * value, <code>QmFkQm90</code>, in the value of <code>TargetString</code>.
     * </p>
     * <p>
     * <b>If you're using the AWS CLI or one of the AWS SDKs</b>
     * </p>
     * <p>
     * The value that you want AWS WAF to search for. The SDK automatically base64 encodes the value.
     * </p>
     */
    private java.nio.ByteBuffer targetString;
    /**
     * <p>
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to
     * bypass AWS WAF. If you specify a transformation, AWS WAF performs the transformation on <code>TargetString</code>
     * before inspecting a request for a match.
     * </p>
     * <p>
     * You can only specify a single type of TextTransformation.
     * </p>
     * <p>
     * <b>CMD_LINE</b>
     * </p>
     * <p>
     * When you're concerned that attackers are injecting an operating system command line command and using unusual
     * formatting to disguise some or all of the command, use this option to perform the following transformations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Delete the following characters: \ " ' ^
     * </p>
     * </li>
     * <li>
     * <p>
     * Delete spaces before the following characters: / (
     * </p>
     * </li>
     * <li>
     * <p>
     * Replace the following characters with a space: , ;
     * </p>
     * </li>
     * <li>
     * <p>
     * Replace multiple spaces with one space
     * </p>
     * </li>
     * <li>
     * <p>
     * Convert uppercase letters (A-Z) to lowercase (a-z)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>COMPRESS_WHITE_SPACE</b>
     * </p>
     * <p>
     * Use this option to replace the following characters with a space character (decimal 32):
     * </p>
     * <ul>
     * <li>
     * <p>
     * \f, formfeed, decimal 12
     * </p>
     * </li>
     * <li>
     * <p>
     * \t, tab, decimal 9
     * </p>
     * </li>
     * <li>
     * <p>
     * \n, newline, decimal 10
     * </p>
     * </li>
     * <li>
     * <p>
     * \r, carriage return, decimal 13
     * </p>
     * </li>
     * <li>
     * <p>
     * \v, vertical tab, decimal 11
     * </p>
     * </li>
     * <li>
     * <p>
     * non-breaking space, decimal 160
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces with one space.
     * </p>
     * <p>
     * <b>HTML_ENTITY_DECODE</b>
     * </p>
     * <p>
     * Use this option to replace HTML-encoded characters with unencoded characters. <code>HTML_ENTITY_DECODE</code>
     * performs the following operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Replaces <code>(ampersand)quot;</code> with <code>"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces <code>(ampersand)nbsp;</code> with a non-breaking space, decimal 160
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces <code>(ampersand)lt;</code> with a "less than" symbol
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces <code>(ampersand)gt;</code> with <code>&gt;</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces characters that are represented in hexadecimal format, <code>(ampersand)#xhhhh;</code>, with the
     * corresponding characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces characters that are represented in decimal format, <code>(ampersand)#nnnn;</code>, with the
     * corresponding characters
     * </p>
     * </li>
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
     * Specify <code>NONE</code> if you don't want to perform any text transformations.
     * </p>
     */
    private String textTransformation;
    /**
     * <p>
     * Within the portion of a web request that you want to search (for example, in the query string, if any), specify
     * where you want AWS WAF to search. Valid values include the following:
     * </p>
     * <p>
     * <b>CONTAINS</b>
     * </p>
     * <p>
     * The specified part of the web request must include the value of <code>TargetString</code>, but the location
     * doesn't matter.
     * </p>
     * <p>
     * <b>CONTAINS_WORD</b>
     * </p>
     * <p>
     * The specified part of the web request must include the value of <code>TargetString</code>, and
     * <code>TargetString</code> must contain only alphanumeric characters or underscore (A-Z, a-z, 0-9, or _). In
     * addition, <code>TargetString</code> must be a word, which means one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TargetString</code> exactly matches the value of the specified part of the web request, such as the value
     * of a header.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TargetString</code> is at the beginning of the specified part of the web request and is followed by a
     * character other than an alphanumeric character or underscore (_), for example, <code>BadBot;</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TargetString</code> is at the end of the specified part of the web request and is preceded by a character
     * other than an alphanumeric character or underscore (_), for example, <code>;BadBot</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TargetString</code> is in the middle of the specified part of the web request and is preceded and followed
     * by characters other than alphanumeric characters or underscore (_), for example, <code>-BadBot;</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>EXACTLY</b>
     * </p>
     * <p>
     * The value of the specified part of the web request must exactly match the value of <code>TargetString</code>.
     * </p>
     * <p>
     * <b>STARTS_WITH</b>
     * </p>
     * <p>
     * The value of <code>TargetString</code> must appear at the beginning of the specified part of the web request.
     * </p>
     * <p>
     * <b>ENDS_WITH</b>
     * </p>
     * <p>
     * The value of <code>TargetString</code> must appear at the end of the specified part of the web request.
     * </p>
     */
    private String positionalConstraint;

    /**
     * <p>
     * The part of a web request that you want AWS WAF to search, such as a specified header or a query string. For more
     * information, see <a>FieldToMatch</a>.
     * </p>
     * 
     * @param fieldToMatch
     *        The part of a web request that you want AWS WAF to search, such as a specified header or a query string.
     *        For more information, see <a>FieldToMatch</a>.
     */

    public void setFieldToMatch(FieldToMatch fieldToMatch) {
        this.fieldToMatch = fieldToMatch;
    }

    /**
     * <p>
     * The part of a web request that you want AWS WAF to search, such as a specified header or a query string. For more
     * information, see <a>FieldToMatch</a>.
     * </p>
     * 
     * @return The part of a web request that you want AWS WAF to search, such as a specified header or a query string.
     *         For more information, see <a>FieldToMatch</a>.
     */

    public FieldToMatch getFieldToMatch() {
        return this.fieldToMatch;
    }

    /**
     * <p>
     * The part of a web request that you want AWS WAF to search, such as a specified header or a query string. For more
     * information, see <a>FieldToMatch</a>.
     * </p>
     * 
     * @param fieldToMatch
     *        The part of a web request that you want AWS WAF to search, such as a specified header or a query string.
     *        For more information, see <a>FieldToMatch</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ByteMatchTuple withFieldToMatch(FieldToMatch fieldToMatch) {
        setFieldToMatch(fieldToMatch);
        return this;
    }

    /**
     * <p>
     * The value that you want AWS WAF to search for. AWS WAF searches for the specified string in the part of web
     * requests that you specified in <code>FieldToMatch</code>. The maximum length of the value is 50 bytes.
     * </p>
     * <p>
     * Valid values depend on the values that you specified for <code>FieldToMatch</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HEADER</code>: The value that you want AWS WAF to search for in the request header that you specified in
     * <a>FieldToMatch</a>, for example, the value of the <code>User-Agent</code> or <code>Referer</code> header.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>METHOD</code>: The HTTP method, which indicates the type of operation specified in the request. CloudFront
     * supports the following methods: <code>DELETE</code>, <code>GET</code>, <code>HEAD</code>, <code>OPTIONS</code>,
     * <code>PATCH</code>, <code>POST</code>, and <code>PUT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUERY_STRING</code>: The value that you want AWS WAF to search for in the query string, which is the part
     * of a URL that appears after a <code>?</code> character.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>URI</code>: The value that you want AWS WAF to search for in the part of a URL that identifies a resource,
     * for example, <code>/images/daily-ad.jpg</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BODY</code>: The part of a request that contains any additional data that you want to send to your web
     * server as the HTTP request body, such as data from a form. The request body immediately follows the request
     * headers. Note that only the first <code>8192</code> bytes of the request body are forwarded to AWS WAF for
     * inspection. To allow or block requests based on the length of the body, you can create a size constraint set. For
     * more information, see <a>CreateSizeConstraintSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_QUERY_ARG</code>: The parameter in the query string that you will inspect, such as <i>UserName</i>
     * or <i>SalesRegion</i>. The maximum length for <code>SINGLE_QUERY_ARG</code> is 30 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_QUERY_ARGS</code>: Similar to <code>SINGLE_QUERY_ARG</code>, but instead of inspecting a single
     * parameter, AWS WAF inspects all parameters within the query string for the value or regex pattern that you
     * specify in <code>TargetString</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>TargetString</code> includes alphabetic characters A-Z and a-z, note that the value is case sensitive.
     * </p>
     * <p>
     * <b>If you're using the AWS WAF API</b>
     * </p>
     * <p>
     * Specify a base64-encoded version of the value. The maximum length of the value before you base64-encode it is 50
     * bytes.
     * </p>
     * <p>
     * For example, suppose the value of <code>Type</code> is <code>HEADER</code> and the value of <code>Data</code> is
     * <code>User-Agent</code>. If you want to search the <code>User-Agent</code> header for the value
     * <code>BadBot</code>, you base64-encode <code>BadBot</code> using MIME base64-encoding and include the resulting
     * value, <code>QmFkQm90</code>, in the value of <code>TargetString</code>.
     * </p>
     * <p>
     * <b>If you're using the AWS CLI or one of the AWS SDKs</b>
     * </p>
     * <p>
     * The value that you want AWS WAF to search for. The SDK automatically base64 encodes the value.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param targetString
     *        The value that you want AWS WAF to search for. AWS WAF searches for the specified string in the part of
     *        web requests that you specified in <code>FieldToMatch</code>. The maximum length of the value is 50
     *        bytes.</p>
     *        <p>
     *        Valid values depend on the values that you specified for <code>FieldToMatch</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HEADER</code>: The value that you want AWS WAF to search for in the request header that you
     *        specified in <a>FieldToMatch</a>, for example, the value of the <code>User-Agent</code> or
     *        <code>Referer</code> header.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>METHOD</code>: The HTTP method, which indicates the type of operation specified in the request.
     *        CloudFront supports the following methods: <code>DELETE</code>, <code>GET</code>, <code>HEAD</code>,
     *        <code>OPTIONS</code>, <code>PATCH</code>, <code>POST</code>, and <code>PUT</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>QUERY_STRING</code>: The value that you want AWS WAF to search for in the query string, which is the
     *        part of a URL that appears after a <code>?</code> character.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>URI</code>: The value that you want AWS WAF to search for in the part of a URL that identifies a
     *        resource, for example, <code>/images/daily-ad.jpg</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BODY</code>: The part of a request that contains any additional data that you want to send to your
     *        web server as the HTTP request body, such as data from a form. The request body immediately follows the
     *        request headers. Note that only the first <code>8192</code> bytes of the request body are forwarded to AWS
     *        WAF for inspection. To allow or block requests based on the length of the body, you can create a size
     *        constraint set. For more information, see <a>CreateSizeConstraintSet</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SINGLE_QUERY_ARG</code>: The parameter in the query string that you will inspect, such as
     *        <i>UserName</i> or <i>SalesRegion</i>. The maximum length for <code>SINGLE_QUERY_ARG</code> is 30
     *        characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_QUERY_ARGS</code>: Similar to <code>SINGLE_QUERY_ARG</code>, but instead of inspecting a single
     *        parameter, AWS WAF inspects all parameters within the query string for the value or regex pattern that you
     *        specify in <code>TargetString</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If <code>TargetString</code> includes alphabetic characters A-Z and a-z, note that the value is case
     *        sensitive.
     *        </p>
     *        <p>
     *        <b>If you're using the AWS WAF API</b>
     *        </p>
     *        <p>
     *        Specify a base64-encoded version of the value. The maximum length of the value before you base64-encode it
     *        is 50 bytes.
     *        </p>
     *        <p>
     *        For example, suppose the value of <code>Type</code> is <code>HEADER</code> and the value of
     *        <code>Data</code> is <code>User-Agent</code>. If you want to search the <code>User-Agent</code> header for
     *        the value <code>BadBot</code>, you base64-encode <code>BadBot</code> using MIME base64-encoding and
     *        include the resulting value, <code>QmFkQm90</code>, in the value of <code>TargetString</code>.
     *        </p>
     *        <p>
     *        <b>If you're using the AWS CLI or one of the AWS SDKs</b>
     *        </p>
     *        <p>
     *        The value that you want AWS WAF to search for. The SDK automatically base64 encodes the value.
     */

    public void setTargetString(java.nio.ByteBuffer targetString) {
        this.targetString = targetString;
    }

    /**
     * <p>
     * The value that you want AWS WAF to search for. AWS WAF searches for the specified string in the part of web
     * requests that you specified in <code>FieldToMatch</code>. The maximum length of the value is 50 bytes.
     * </p>
     * <p>
     * Valid values depend on the values that you specified for <code>FieldToMatch</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HEADER</code>: The value that you want AWS WAF to search for in the request header that you specified in
     * <a>FieldToMatch</a>, for example, the value of the <code>User-Agent</code> or <code>Referer</code> header.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>METHOD</code>: The HTTP method, which indicates the type of operation specified in the request. CloudFront
     * supports the following methods: <code>DELETE</code>, <code>GET</code>, <code>HEAD</code>, <code>OPTIONS</code>,
     * <code>PATCH</code>, <code>POST</code>, and <code>PUT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUERY_STRING</code>: The value that you want AWS WAF to search for in the query string, which is the part
     * of a URL that appears after a <code>?</code> character.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>URI</code>: The value that you want AWS WAF to search for in the part of a URL that identifies a resource,
     * for example, <code>/images/daily-ad.jpg</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BODY</code>: The part of a request that contains any additional data that you want to send to your web
     * server as the HTTP request body, such as data from a form. The request body immediately follows the request
     * headers. Note that only the first <code>8192</code> bytes of the request body are forwarded to AWS WAF for
     * inspection. To allow or block requests based on the length of the body, you can create a size constraint set. For
     * more information, see <a>CreateSizeConstraintSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_QUERY_ARG</code>: The parameter in the query string that you will inspect, such as <i>UserName</i>
     * or <i>SalesRegion</i>. The maximum length for <code>SINGLE_QUERY_ARG</code> is 30 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_QUERY_ARGS</code>: Similar to <code>SINGLE_QUERY_ARG</code>, but instead of inspecting a single
     * parameter, AWS WAF inspects all parameters within the query string for the value or regex pattern that you
     * specify in <code>TargetString</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>TargetString</code> includes alphabetic characters A-Z and a-z, note that the value is case sensitive.
     * </p>
     * <p>
     * <b>If you're using the AWS WAF API</b>
     * </p>
     * <p>
     * Specify a base64-encoded version of the value. The maximum length of the value before you base64-encode it is 50
     * bytes.
     * </p>
     * <p>
     * For example, suppose the value of <code>Type</code> is <code>HEADER</code> and the value of <code>Data</code> is
     * <code>User-Agent</code>. If you want to search the <code>User-Agent</code> header for the value
     * <code>BadBot</code>, you base64-encode <code>BadBot</code> using MIME base64-encoding and include the resulting
     * value, <code>QmFkQm90</code>, in the value of <code>TargetString</code>.
     * </p>
     * <p>
     * <b>If you're using the AWS CLI or one of the AWS SDKs</b>
     * </p>
     * <p>
     * The value that you want AWS WAF to search for. The SDK automatically base64 encodes the value.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The value that you want AWS WAF to search for. AWS WAF searches for the specified string in the part of
     *         web requests that you specified in <code>FieldToMatch</code>. The maximum length of the value is 50
     *         bytes.</p>
     *         <p>
     *         Valid values depend on the values that you specified for <code>FieldToMatch</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>HEADER</code>: The value that you want AWS WAF to search for in the request header that you
     *         specified in <a>FieldToMatch</a>, for example, the value of the <code>User-Agent</code> or
     *         <code>Referer</code> header.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>METHOD</code>: The HTTP method, which indicates the type of operation specified in the request.
     *         CloudFront supports the following methods: <code>DELETE</code>, <code>GET</code>, <code>HEAD</code>,
     *         <code>OPTIONS</code>, <code>PATCH</code>, <code>POST</code>, and <code>PUT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>QUERY_STRING</code>: The value that you want AWS WAF to search for in the query string, which is
     *         the part of a URL that appears after a <code>?</code> character.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>URI</code>: The value that you want AWS WAF to search for in the part of a URL that identifies a
     *         resource, for example, <code>/images/daily-ad.jpg</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BODY</code>: The part of a request that contains any additional data that you want to send to your
     *         web server as the HTTP request body, such as data from a form. The request body immediately follows the
     *         request headers. Note that only the first <code>8192</code> bytes of the request body are forwarded to
     *         AWS WAF for inspection. To allow or block requests based on the length of the body, you can create a size
     *         constraint set. For more information, see <a>CreateSizeConstraintSet</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SINGLE_QUERY_ARG</code>: The parameter in the query string that you will inspect, such as
     *         <i>UserName</i> or <i>SalesRegion</i>. The maximum length for <code>SINGLE_QUERY_ARG</code> is 30
     *         characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALL_QUERY_ARGS</code>: Similar to <code>SINGLE_QUERY_ARG</code>, but instead of inspecting a single
     *         parameter, AWS WAF inspects all parameters within the query string for the value or regex pattern that
     *         you specify in <code>TargetString</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If <code>TargetString</code> includes alphabetic characters A-Z and a-z, note that the value is case
     *         sensitive.
     *         </p>
     *         <p>
     *         <b>If you're using the AWS WAF API</b>
     *         </p>
     *         <p>
     *         Specify a base64-encoded version of the value. The maximum length of the value before you base64-encode
     *         it is 50 bytes.
     *         </p>
     *         <p>
     *         For example, suppose the value of <code>Type</code> is <code>HEADER</code> and the value of
     *         <code>Data</code> is <code>User-Agent</code>. If you want to search the <code>User-Agent</code> header
     *         for the value <code>BadBot</code>, you base64-encode <code>BadBot</code> using MIME base64-encoding and
     *         include the resulting value, <code>QmFkQm90</code>, in the value of <code>TargetString</code>.
     *         </p>
     *         <p>
     *         <b>If you're using the AWS CLI or one of the AWS SDKs</b>
     *         </p>
     *         <p>
     *         The value that you want AWS WAF to search for. The SDK automatically base64 encodes the value.
     */

    public java.nio.ByteBuffer getTargetString() {
        return this.targetString;
    }

    /**
     * <p>
     * The value that you want AWS WAF to search for. AWS WAF searches for the specified string in the part of web
     * requests that you specified in <code>FieldToMatch</code>. The maximum length of the value is 50 bytes.
     * </p>
     * <p>
     * Valid values depend on the values that you specified for <code>FieldToMatch</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HEADER</code>: The value that you want AWS WAF to search for in the request header that you specified in
     * <a>FieldToMatch</a>, for example, the value of the <code>User-Agent</code> or <code>Referer</code> header.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>METHOD</code>: The HTTP method, which indicates the type of operation specified in the request. CloudFront
     * supports the following methods: <code>DELETE</code>, <code>GET</code>, <code>HEAD</code>, <code>OPTIONS</code>,
     * <code>PATCH</code>, <code>POST</code>, and <code>PUT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUERY_STRING</code>: The value that you want AWS WAF to search for in the query string, which is the part
     * of a URL that appears after a <code>?</code> character.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>URI</code>: The value that you want AWS WAF to search for in the part of a URL that identifies a resource,
     * for example, <code>/images/daily-ad.jpg</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BODY</code>: The part of a request that contains any additional data that you want to send to your web
     * server as the HTTP request body, such as data from a form. The request body immediately follows the request
     * headers. Note that only the first <code>8192</code> bytes of the request body are forwarded to AWS WAF for
     * inspection. To allow or block requests based on the length of the body, you can create a size constraint set. For
     * more information, see <a>CreateSizeConstraintSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_QUERY_ARG</code>: The parameter in the query string that you will inspect, such as <i>UserName</i>
     * or <i>SalesRegion</i>. The maximum length for <code>SINGLE_QUERY_ARG</code> is 30 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_QUERY_ARGS</code>: Similar to <code>SINGLE_QUERY_ARG</code>, but instead of inspecting a single
     * parameter, AWS WAF inspects all parameters within the query string for the value or regex pattern that you
     * specify in <code>TargetString</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>TargetString</code> includes alphabetic characters A-Z and a-z, note that the value is case sensitive.
     * </p>
     * <p>
     * <b>If you're using the AWS WAF API</b>
     * </p>
     * <p>
     * Specify a base64-encoded version of the value. The maximum length of the value before you base64-encode it is 50
     * bytes.
     * </p>
     * <p>
     * For example, suppose the value of <code>Type</code> is <code>HEADER</code> and the value of <code>Data</code> is
     * <code>User-Agent</code>. If you want to search the <code>User-Agent</code> header for the value
     * <code>BadBot</code>, you base64-encode <code>BadBot</code> using MIME base64-encoding and include the resulting
     * value, <code>QmFkQm90</code>, in the value of <code>TargetString</code>.
     * </p>
     * <p>
     * <b>If you're using the AWS CLI or one of the AWS SDKs</b>
     * </p>
     * <p>
     * The value that you want AWS WAF to search for. The SDK automatically base64 encodes the value.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param targetString
     *        The value that you want AWS WAF to search for. AWS WAF searches for the specified string in the part of
     *        web requests that you specified in <code>FieldToMatch</code>. The maximum length of the value is 50
     *        bytes.</p>
     *        <p>
     *        Valid values depend on the values that you specified for <code>FieldToMatch</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HEADER</code>: The value that you want AWS WAF to search for in the request header that you
     *        specified in <a>FieldToMatch</a>, for example, the value of the <code>User-Agent</code> or
     *        <code>Referer</code> header.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>METHOD</code>: The HTTP method, which indicates the type of operation specified in the request.
     *        CloudFront supports the following methods: <code>DELETE</code>, <code>GET</code>, <code>HEAD</code>,
     *        <code>OPTIONS</code>, <code>PATCH</code>, <code>POST</code>, and <code>PUT</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>QUERY_STRING</code>: The value that you want AWS WAF to search for in the query string, which is the
     *        part of a URL that appears after a <code>?</code> character.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>URI</code>: The value that you want AWS WAF to search for in the part of a URL that identifies a
     *        resource, for example, <code>/images/daily-ad.jpg</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BODY</code>: The part of a request that contains any additional data that you want to send to your
     *        web server as the HTTP request body, such as data from a form. The request body immediately follows the
     *        request headers. Note that only the first <code>8192</code> bytes of the request body are forwarded to AWS
     *        WAF for inspection. To allow or block requests based on the length of the body, you can create a size
     *        constraint set. For more information, see <a>CreateSizeConstraintSet</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SINGLE_QUERY_ARG</code>: The parameter in the query string that you will inspect, such as
     *        <i>UserName</i> or <i>SalesRegion</i>. The maximum length for <code>SINGLE_QUERY_ARG</code> is 30
     *        characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_QUERY_ARGS</code>: Similar to <code>SINGLE_QUERY_ARG</code>, but instead of inspecting a single
     *        parameter, AWS WAF inspects all parameters within the query string for the value or regex pattern that you
     *        specify in <code>TargetString</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If <code>TargetString</code> includes alphabetic characters A-Z and a-z, note that the value is case
     *        sensitive.
     *        </p>
     *        <p>
     *        <b>If you're using the AWS WAF API</b>
     *        </p>
     *        <p>
     *        Specify a base64-encoded version of the value. The maximum length of the value before you base64-encode it
     *        is 50 bytes.
     *        </p>
     *        <p>
     *        For example, suppose the value of <code>Type</code> is <code>HEADER</code> and the value of
     *        <code>Data</code> is <code>User-Agent</code>. If you want to search the <code>User-Agent</code> header for
     *        the value <code>BadBot</code>, you base64-encode <code>BadBot</code> using MIME base64-encoding and
     *        include the resulting value, <code>QmFkQm90</code>, in the value of <code>TargetString</code>.
     *        </p>
     *        <p>
     *        <b>If you're using the AWS CLI or one of the AWS SDKs</b>
     *        </p>
     *        <p>
     *        The value that you want AWS WAF to search for. The SDK automatically base64 encodes the value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ByteMatchTuple withTargetString(java.nio.ByteBuffer targetString) {
        setTargetString(targetString);
        return this;
    }

    /**
     * <p>
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to
     * bypass AWS WAF. If you specify a transformation, AWS WAF performs the transformation on <code>TargetString</code>
     * before inspecting a request for a match.
     * </p>
     * <p>
     * You can only specify a single type of TextTransformation.
     * </p>
     * <p>
     * <b>CMD_LINE</b>
     * </p>
     * <p>
     * When you're concerned that attackers are injecting an operating system command line command and using unusual
     * formatting to disguise some or all of the command, use this option to perform the following transformations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Delete the following characters: \ " ' ^
     * </p>
     * </li>
     * <li>
     * <p>
     * Delete spaces before the following characters: / (
     * </p>
     * </li>
     * <li>
     * <p>
     * Replace the following characters with a space: , ;
     * </p>
     * </li>
     * <li>
     * <p>
     * Replace multiple spaces with one space
     * </p>
     * </li>
     * <li>
     * <p>
     * Convert uppercase letters (A-Z) to lowercase (a-z)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>COMPRESS_WHITE_SPACE</b>
     * </p>
     * <p>
     * Use this option to replace the following characters with a space character (decimal 32):
     * </p>
     * <ul>
     * <li>
     * <p>
     * \f, formfeed, decimal 12
     * </p>
     * </li>
     * <li>
     * <p>
     * \t, tab, decimal 9
     * </p>
     * </li>
     * <li>
     * <p>
     * \n, newline, decimal 10
     * </p>
     * </li>
     * <li>
     * <p>
     * \r, carriage return, decimal 13
     * </p>
     * </li>
     * <li>
     * <p>
     * \v, vertical tab, decimal 11
     * </p>
     * </li>
     * <li>
     * <p>
     * non-breaking space, decimal 160
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces with one space.
     * </p>
     * <p>
     * <b>HTML_ENTITY_DECODE</b>
     * </p>
     * <p>
     * Use this option to replace HTML-encoded characters with unencoded characters. <code>HTML_ENTITY_DECODE</code>
     * performs the following operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Replaces <code>(ampersand)quot;</code> with <code>"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces <code>(ampersand)nbsp;</code> with a non-breaking space, decimal 160
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces <code>(ampersand)lt;</code> with a "less than" symbol
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces <code>(ampersand)gt;</code> with <code>&gt;</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces characters that are represented in hexadecimal format, <code>(ampersand)#xhhhh;</code>, with the
     * corresponding characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces characters that are represented in decimal format, <code>(ampersand)#nnnn;</code>, with the
     * corresponding characters
     * </p>
     * </li>
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
     * Specify <code>NONE</code> if you don't want to perform any text transformations.
     * </p>
     * 
     * @param textTransformation
     *        Text transformations eliminate some of the unusual formatting that attackers use in web requests in an
     *        effort to bypass AWS WAF. If you specify a transformation, AWS WAF performs the transformation on
     *        <code>TargetString</code> before inspecting a request for a match.</p>
     *        <p>
     *        You can only specify a single type of TextTransformation.
     *        </p>
     *        <p>
     *        <b>CMD_LINE</b>
     *        </p>
     *        <p>
     *        When you're concerned that attackers are injecting an operating system command line command and using
     *        unusual formatting to disguise some or all of the command, use this option to perform the following
     *        transformations:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Delete the following characters: \ " ' ^
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Delete spaces before the following characters: / (
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replace the following characters with a space: , ;
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replace multiple spaces with one space
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Convert uppercase letters (A-Z) to lowercase (a-z)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>COMPRESS_WHITE_SPACE</b>
     *        </p>
     *        <p>
     *        Use this option to replace the following characters with a space character (decimal 32):
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        \f, formfeed, decimal 12
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        \t, tab, decimal 9
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        \n, newline, decimal 10
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        \r, carriage return, decimal 13
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        \v, vertical tab, decimal 11
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        non-breaking space, decimal 160
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces with one space.
     *        </p>
     *        <p>
     *        <b>HTML_ENTITY_DECODE</b>
     *        </p>
     *        <p>
     *        Use this option to replace HTML-encoded characters with unencoded characters.
     *        <code>HTML_ENTITY_DECODE</code> performs the following operations:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Replaces <code>(ampersand)quot;</code> with <code>"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replaces <code>(ampersand)nbsp;</code> with a non-breaking space, decimal 160
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replaces <code>(ampersand)lt;</code> with a "less than" symbol
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replaces <code>(ampersand)gt;</code> with <code>&gt;</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replaces characters that are represented in hexadecimal format, <code>(ampersand)#xhhhh;</code>, with the
     *        corresponding characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replaces characters that are represented in decimal format, <code>(ampersand)#nnnn;</code>, with the
     *        corresponding characters
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>LOWERCASE</b>
     *        </p>
     *        <p>
     *        Use this option to convert uppercase letters (A-Z) to lowercase (a-z).
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
     *        Specify <code>NONE</code> if you don't want to perform any text transformations.
     * @see TextTransformation
     */

    public void setTextTransformation(String textTransformation) {
        this.textTransformation = textTransformation;
    }

    /**
     * <p>
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to
     * bypass AWS WAF. If you specify a transformation, AWS WAF performs the transformation on <code>TargetString</code>
     * before inspecting a request for a match.
     * </p>
     * <p>
     * You can only specify a single type of TextTransformation.
     * </p>
     * <p>
     * <b>CMD_LINE</b>
     * </p>
     * <p>
     * When you're concerned that attackers are injecting an operating system command line command and using unusual
     * formatting to disguise some or all of the command, use this option to perform the following transformations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Delete the following characters: \ " ' ^
     * </p>
     * </li>
     * <li>
     * <p>
     * Delete spaces before the following characters: / (
     * </p>
     * </li>
     * <li>
     * <p>
     * Replace the following characters with a space: , ;
     * </p>
     * </li>
     * <li>
     * <p>
     * Replace multiple spaces with one space
     * </p>
     * </li>
     * <li>
     * <p>
     * Convert uppercase letters (A-Z) to lowercase (a-z)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>COMPRESS_WHITE_SPACE</b>
     * </p>
     * <p>
     * Use this option to replace the following characters with a space character (decimal 32):
     * </p>
     * <ul>
     * <li>
     * <p>
     * \f, formfeed, decimal 12
     * </p>
     * </li>
     * <li>
     * <p>
     * \t, tab, decimal 9
     * </p>
     * </li>
     * <li>
     * <p>
     * \n, newline, decimal 10
     * </p>
     * </li>
     * <li>
     * <p>
     * \r, carriage return, decimal 13
     * </p>
     * </li>
     * <li>
     * <p>
     * \v, vertical tab, decimal 11
     * </p>
     * </li>
     * <li>
     * <p>
     * non-breaking space, decimal 160
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces with one space.
     * </p>
     * <p>
     * <b>HTML_ENTITY_DECODE</b>
     * </p>
     * <p>
     * Use this option to replace HTML-encoded characters with unencoded characters. <code>HTML_ENTITY_DECODE</code>
     * performs the following operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Replaces <code>(ampersand)quot;</code> with <code>"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces <code>(ampersand)nbsp;</code> with a non-breaking space, decimal 160
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces <code>(ampersand)lt;</code> with a "less than" symbol
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces <code>(ampersand)gt;</code> with <code>&gt;</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces characters that are represented in hexadecimal format, <code>(ampersand)#xhhhh;</code>, with the
     * corresponding characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces characters that are represented in decimal format, <code>(ampersand)#nnnn;</code>, with the
     * corresponding characters
     * </p>
     * </li>
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
     * Specify <code>NONE</code> if you don't want to perform any text transformations.
     * </p>
     * 
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an
     *         effort to bypass AWS WAF. If you specify a transformation, AWS WAF performs the transformation on
     *         <code>TargetString</code> before inspecting a request for a match.</p>
     *         <p>
     *         You can only specify a single type of TextTransformation.
     *         </p>
     *         <p>
     *         <b>CMD_LINE</b>
     *         </p>
     *         <p>
     *         When you're concerned that attackers are injecting an operating system command line command and using
     *         unusual formatting to disguise some or all of the command, use this option to perform the following
     *         transformations:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Delete the following characters: \ " ' ^
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Delete spaces before the following characters: / (
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Replace the following characters with a space: , ;
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Replace multiple spaces with one space
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Convert uppercase letters (A-Z) to lowercase (a-z)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>COMPRESS_WHITE_SPACE</b>
     *         </p>
     *         <p>
     *         Use this option to replace the following characters with a space character (decimal 32):
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         \f, formfeed, decimal 12
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         \t, tab, decimal 9
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         \n, newline, decimal 10
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         \r, carriage return, decimal 13
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         \v, vertical tab, decimal 11
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         non-breaking space, decimal 160
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces with one space.
     *         </p>
     *         <p>
     *         <b>HTML_ENTITY_DECODE</b>
     *         </p>
     *         <p>
     *         Use this option to replace HTML-encoded characters with unencoded characters.
     *         <code>HTML_ENTITY_DECODE</code> performs the following operations:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Replaces <code>(ampersand)quot;</code> with <code>"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Replaces <code>(ampersand)nbsp;</code> with a non-breaking space, decimal 160
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Replaces <code>(ampersand)lt;</code> with a "less than" symbol
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Replaces <code>(ampersand)gt;</code> with <code>&gt;</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Replaces characters that are represented in hexadecimal format, <code>(ampersand)#xhhhh;</code>, with the
     *         corresponding characters
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Replaces characters that are represented in decimal format, <code>(ampersand)#nnnn;</code>, with the
     *         corresponding characters
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>LOWERCASE</b>
     *         </p>
     *         <p>
     *         Use this option to convert uppercase letters (A-Z) to lowercase (a-z).
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
     *         Specify <code>NONE</code> if you don't want to perform any text transformations.
     * @see TextTransformation
     */

    public String getTextTransformation() {
        return this.textTransformation;
    }

    /**
     * <p>
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to
     * bypass AWS WAF. If you specify a transformation, AWS WAF performs the transformation on <code>TargetString</code>
     * before inspecting a request for a match.
     * </p>
     * <p>
     * You can only specify a single type of TextTransformation.
     * </p>
     * <p>
     * <b>CMD_LINE</b>
     * </p>
     * <p>
     * When you're concerned that attackers are injecting an operating system command line command and using unusual
     * formatting to disguise some or all of the command, use this option to perform the following transformations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Delete the following characters: \ " ' ^
     * </p>
     * </li>
     * <li>
     * <p>
     * Delete spaces before the following characters: / (
     * </p>
     * </li>
     * <li>
     * <p>
     * Replace the following characters with a space: , ;
     * </p>
     * </li>
     * <li>
     * <p>
     * Replace multiple spaces with one space
     * </p>
     * </li>
     * <li>
     * <p>
     * Convert uppercase letters (A-Z) to lowercase (a-z)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>COMPRESS_WHITE_SPACE</b>
     * </p>
     * <p>
     * Use this option to replace the following characters with a space character (decimal 32):
     * </p>
     * <ul>
     * <li>
     * <p>
     * \f, formfeed, decimal 12
     * </p>
     * </li>
     * <li>
     * <p>
     * \t, tab, decimal 9
     * </p>
     * </li>
     * <li>
     * <p>
     * \n, newline, decimal 10
     * </p>
     * </li>
     * <li>
     * <p>
     * \r, carriage return, decimal 13
     * </p>
     * </li>
     * <li>
     * <p>
     * \v, vertical tab, decimal 11
     * </p>
     * </li>
     * <li>
     * <p>
     * non-breaking space, decimal 160
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces with one space.
     * </p>
     * <p>
     * <b>HTML_ENTITY_DECODE</b>
     * </p>
     * <p>
     * Use this option to replace HTML-encoded characters with unencoded characters. <code>HTML_ENTITY_DECODE</code>
     * performs the following operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Replaces <code>(ampersand)quot;</code> with <code>"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces <code>(ampersand)nbsp;</code> with a non-breaking space, decimal 160
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces <code>(ampersand)lt;</code> with a "less than" symbol
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces <code>(ampersand)gt;</code> with <code>&gt;</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces characters that are represented in hexadecimal format, <code>(ampersand)#xhhhh;</code>, with the
     * corresponding characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces characters that are represented in decimal format, <code>(ampersand)#nnnn;</code>, with the
     * corresponding characters
     * </p>
     * </li>
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
     * Specify <code>NONE</code> if you don't want to perform any text transformations.
     * </p>
     * 
     * @param textTransformation
     *        Text transformations eliminate some of the unusual formatting that attackers use in web requests in an
     *        effort to bypass AWS WAF. If you specify a transformation, AWS WAF performs the transformation on
     *        <code>TargetString</code> before inspecting a request for a match.</p>
     *        <p>
     *        You can only specify a single type of TextTransformation.
     *        </p>
     *        <p>
     *        <b>CMD_LINE</b>
     *        </p>
     *        <p>
     *        When you're concerned that attackers are injecting an operating system command line command and using
     *        unusual formatting to disguise some or all of the command, use this option to perform the following
     *        transformations:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Delete the following characters: \ " ' ^
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Delete spaces before the following characters: / (
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replace the following characters with a space: , ;
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replace multiple spaces with one space
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Convert uppercase letters (A-Z) to lowercase (a-z)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>COMPRESS_WHITE_SPACE</b>
     *        </p>
     *        <p>
     *        Use this option to replace the following characters with a space character (decimal 32):
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        \f, formfeed, decimal 12
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        \t, tab, decimal 9
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        \n, newline, decimal 10
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        \r, carriage return, decimal 13
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        \v, vertical tab, decimal 11
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        non-breaking space, decimal 160
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces with one space.
     *        </p>
     *        <p>
     *        <b>HTML_ENTITY_DECODE</b>
     *        </p>
     *        <p>
     *        Use this option to replace HTML-encoded characters with unencoded characters.
     *        <code>HTML_ENTITY_DECODE</code> performs the following operations:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Replaces <code>(ampersand)quot;</code> with <code>"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replaces <code>(ampersand)nbsp;</code> with a non-breaking space, decimal 160
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replaces <code>(ampersand)lt;</code> with a "less than" symbol
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replaces <code>(ampersand)gt;</code> with <code>&gt;</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replaces characters that are represented in hexadecimal format, <code>(ampersand)#xhhhh;</code>, with the
     *        corresponding characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replaces characters that are represented in decimal format, <code>(ampersand)#nnnn;</code>, with the
     *        corresponding characters
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>LOWERCASE</b>
     *        </p>
     *        <p>
     *        Use this option to convert uppercase letters (A-Z) to lowercase (a-z).
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
     *        Specify <code>NONE</code> if you don't want to perform any text transformations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TextTransformation
     */

    public ByteMatchTuple withTextTransformation(String textTransformation) {
        setTextTransformation(textTransformation);
        return this;
    }

    /**
     * <p>
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to
     * bypass AWS WAF. If you specify a transformation, AWS WAF performs the transformation on <code>TargetString</code>
     * before inspecting a request for a match.
     * </p>
     * <p>
     * You can only specify a single type of TextTransformation.
     * </p>
     * <p>
     * <b>CMD_LINE</b>
     * </p>
     * <p>
     * When you're concerned that attackers are injecting an operating system command line command and using unusual
     * formatting to disguise some or all of the command, use this option to perform the following transformations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Delete the following characters: \ " ' ^
     * </p>
     * </li>
     * <li>
     * <p>
     * Delete spaces before the following characters: / (
     * </p>
     * </li>
     * <li>
     * <p>
     * Replace the following characters with a space: , ;
     * </p>
     * </li>
     * <li>
     * <p>
     * Replace multiple spaces with one space
     * </p>
     * </li>
     * <li>
     * <p>
     * Convert uppercase letters (A-Z) to lowercase (a-z)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>COMPRESS_WHITE_SPACE</b>
     * </p>
     * <p>
     * Use this option to replace the following characters with a space character (decimal 32):
     * </p>
     * <ul>
     * <li>
     * <p>
     * \f, formfeed, decimal 12
     * </p>
     * </li>
     * <li>
     * <p>
     * \t, tab, decimal 9
     * </p>
     * </li>
     * <li>
     * <p>
     * \n, newline, decimal 10
     * </p>
     * </li>
     * <li>
     * <p>
     * \r, carriage return, decimal 13
     * </p>
     * </li>
     * <li>
     * <p>
     * \v, vertical tab, decimal 11
     * </p>
     * </li>
     * <li>
     * <p>
     * non-breaking space, decimal 160
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces with one space.
     * </p>
     * <p>
     * <b>HTML_ENTITY_DECODE</b>
     * </p>
     * <p>
     * Use this option to replace HTML-encoded characters with unencoded characters. <code>HTML_ENTITY_DECODE</code>
     * performs the following operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Replaces <code>(ampersand)quot;</code> with <code>"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces <code>(ampersand)nbsp;</code> with a non-breaking space, decimal 160
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces <code>(ampersand)lt;</code> with a "less than" symbol
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces <code>(ampersand)gt;</code> with <code>&gt;</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces characters that are represented in hexadecimal format, <code>(ampersand)#xhhhh;</code>, with the
     * corresponding characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces characters that are represented in decimal format, <code>(ampersand)#nnnn;</code>, with the
     * corresponding characters
     * </p>
     * </li>
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
     * Specify <code>NONE</code> if you don't want to perform any text transformations.
     * </p>
     * 
     * @param textTransformation
     *        Text transformations eliminate some of the unusual formatting that attackers use in web requests in an
     *        effort to bypass AWS WAF. If you specify a transformation, AWS WAF performs the transformation on
     *        <code>TargetString</code> before inspecting a request for a match.</p>
     *        <p>
     *        You can only specify a single type of TextTransformation.
     *        </p>
     *        <p>
     *        <b>CMD_LINE</b>
     *        </p>
     *        <p>
     *        When you're concerned that attackers are injecting an operating system command line command and using
     *        unusual formatting to disguise some or all of the command, use this option to perform the following
     *        transformations:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Delete the following characters: \ " ' ^
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Delete spaces before the following characters: / (
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replace the following characters with a space: , ;
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replace multiple spaces with one space
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Convert uppercase letters (A-Z) to lowercase (a-z)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>COMPRESS_WHITE_SPACE</b>
     *        </p>
     *        <p>
     *        Use this option to replace the following characters with a space character (decimal 32):
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        \f, formfeed, decimal 12
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        \t, tab, decimal 9
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        \n, newline, decimal 10
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        \r, carriage return, decimal 13
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        \v, vertical tab, decimal 11
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        non-breaking space, decimal 160
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces with one space.
     *        </p>
     *        <p>
     *        <b>HTML_ENTITY_DECODE</b>
     *        </p>
     *        <p>
     *        Use this option to replace HTML-encoded characters with unencoded characters.
     *        <code>HTML_ENTITY_DECODE</code> performs the following operations:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Replaces <code>(ampersand)quot;</code> with <code>"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replaces <code>(ampersand)nbsp;</code> with a non-breaking space, decimal 160
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replaces <code>(ampersand)lt;</code> with a "less than" symbol
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replaces <code>(ampersand)gt;</code> with <code>&gt;</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replaces characters that are represented in hexadecimal format, <code>(ampersand)#xhhhh;</code>, with the
     *        corresponding characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replaces characters that are represented in decimal format, <code>(ampersand)#nnnn;</code>, with the
     *        corresponding characters
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>LOWERCASE</b>
     *        </p>
     *        <p>
     *        Use this option to convert uppercase letters (A-Z) to lowercase (a-z).
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
     *        Specify <code>NONE</code> if you don't want to perform any text transformations.
     * @see TextTransformation
     */

    public void setTextTransformation(TextTransformation textTransformation) {
        withTextTransformation(textTransformation);
    }

    /**
     * <p>
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to
     * bypass AWS WAF. If you specify a transformation, AWS WAF performs the transformation on <code>TargetString</code>
     * before inspecting a request for a match.
     * </p>
     * <p>
     * You can only specify a single type of TextTransformation.
     * </p>
     * <p>
     * <b>CMD_LINE</b>
     * </p>
     * <p>
     * When you're concerned that attackers are injecting an operating system command line command and using unusual
     * formatting to disguise some or all of the command, use this option to perform the following transformations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Delete the following characters: \ " ' ^
     * </p>
     * </li>
     * <li>
     * <p>
     * Delete spaces before the following characters: / (
     * </p>
     * </li>
     * <li>
     * <p>
     * Replace the following characters with a space: , ;
     * </p>
     * </li>
     * <li>
     * <p>
     * Replace multiple spaces with one space
     * </p>
     * </li>
     * <li>
     * <p>
     * Convert uppercase letters (A-Z) to lowercase (a-z)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>COMPRESS_WHITE_SPACE</b>
     * </p>
     * <p>
     * Use this option to replace the following characters with a space character (decimal 32):
     * </p>
     * <ul>
     * <li>
     * <p>
     * \f, formfeed, decimal 12
     * </p>
     * </li>
     * <li>
     * <p>
     * \t, tab, decimal 9
     * </p>
     * </li>
     * <li>
     * <p>
     * \n, newline, decimal 10
     * </p>
     * </li>
     * <li>
     * <p>
     * \r, carriage return, decimal 13
     * </p>
     * </li>
     * <li>
     * <p>
     * \v, vertical tab, decimal 11
     * </p>
     * </li>
     * <li>
     * <p>
     * non-breaking space, decimal 160
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces with one space.
     * </p>
     * <p>
     * <b>HTML_ENTITY_DECODE</b>
     * </p>
     * <p>
     * Use this option to replace HTML-encoded characters with unencoded characters. <code>HTML_ENTITY_DECODE</code>
     * performs the following operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Replaces <code>(ampersand)quot;</code> with <code>"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces <code>(ampersand)nbsp;</code> with a non-breaking space, decimal 160
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces <code>(ampersand)lt;</code> with a "less than" symbol
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces <code>(ampersand)gt;</code> with <code>&gt;</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces characters that are represented in hexadecimal format, <code>(ampersand)#xhhhh;</code>, with the
     * corresponding characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Replaces characters that are represented in decimal format, <code>(ampersand)#nnnn;</code>, with the
     * corresponding characters
     * </p>
     * </li>
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
     * Specify <code>NONE</code> if you don't want to perform any text transformations.
     * </p>
     * 
     * @param textTransformation
     *        Text transformations eliminate some of the unusual formatting that attackers use in web requests in an
     *        effort to bypass AWS WAF. If you specify a transformation, AWS WAF performs the transformation on
     *        <code>TargetString</code> before inspecting a request for a match.</p>
     *        <p>
     *        You can only specify a single type of TextTransformation.
     *        </p>
     *        <p>
     *        <b>CMD_LINE</b>
     *        </p>
     *        <p>
     *        When you're concerned that attackers are injecting an operating system command line command and using
     *        unusual formatting to disguise some or all of the command, use this option to perform the following
     *        transformations:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Delete the following characters: \ " ' ^
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Delete spaces before the following characters: / (
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replace the following characters with a space: , ;
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replace multiple spaces with one space
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Convert uppercase letters (A-Z) to lowercase (a-z)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>COMPRESS_WHITE_SPACE</b>
     *        </p>
     *        <p>
     *        Use this option to replace the following characters with a space character (decimal 32):
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        \f, formfeed, decimal 12
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        \t, tab, decimal 9
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        \n, newline, decimal 10
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        \r, carriage return, decimal 13
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        \v, vertical tab, decimal 11
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        non-breaking space, decimal 160
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>COMPRESS_WHITE_SPACE</code> also replaces multiple spaces with one space.
     *        </p>
     *        <p>
     *        <b>HTML_ENTITY_DECODE</b>
     *        </p>
     *        <p>
     *        Use this option to replace HTML-encoded characters with unencoded characters.
     *        <code>HTML_ENTITY_DECODE</code> performs the following operations:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Replaces <code>(ampersand)quot;</code> with <code>"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replaces <code>(ampersand)nbsp;</code> with a non-breaking space, decimal 160
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replaces <code>(ampersand)lt;</code> with a "less than" symbol
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replaces <code>(ampersand)gt;</code> with <code>&gt;</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replaces characters that are represented in hexadecimal format, <code>(ampersand)#xhhhh;</code>, with the
     *        corresponding characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Replaces characters that are represented in decimal format, <code>(ampersand)#nnnn;</code>, with the
     *        corresponding characters
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>LOWERCASE</b>
     *        </p>
     *        <p>
     *        Use this option to convert uppercase letters (A-Z) to lowercase (a-z).
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
     *        Specify <code>NONE</code> if you don't want to perform any text transformations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TextTransformation
     */

    public ByteMatchTuple withTextTransformation(TextTransformation textTransformation) {
        this.textTransformation = textTransformation.toString();
        return this;
    }

    /**
     * <p>
     * Within the portion of a web request that you want to search (for example, in the query string, if any), specify
     * where you want AWS WAF to search. Valid values include the following:
     * </p>
     * <p>
     * <b>CONTAINS</b>
     * </p>
     * <p>
     * The specified part of the web request must include the value of <code>TargetString</code>, but the location
     * doesn't matter.
     * </p>
     * <p>
     * <b>CONTAINS_WORD</b>
     * </p>
     * <p>
     * The specified part of the web request must include the value of <code>TargetString</code>, and
     * <code>TargetString</code> must contain only alphanumeric characters or underscore (A-Z, a-z, 0-9, or _). In
     * addition, <code>TargetString</code> must be a word, which means one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TargetString</code> exactly matches the value of the specified part of the web request, such as the value
     * of a header.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TargetString</code> is at the beginning of the specified part of the web request and is followed by a
     * character other than an alphanumeric character or underscore (_), for example, <code>BadBot;</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TargetString</code> is at the end of the specified part of the web request and is preceded by a character
     * other than an alphanumeric character or underscore (_), for example, <code>;BadBot</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TargetString</code> is in the middle of the specified part of the web request and is preceded and followed
     * by characters other than alphanumeric characters or underscore (_), for example, <code>-BadBot;</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>EXACTLY</b>
     * </p>
     * <p>
     * The value of the specified part of the web request must exactly match the value of <code>TargetString</code>.
     * </p>
     * <p>
     * <b>STARTS_WITH</b>
     * </p>
     * <p>
     * The value of <code>TargetString</code> must appear at the beginning of the specified part of the web request.
     * </p>
     * <p>
     * <b>ENDS_WITH</b>
     * </p>
     * <p>
     * The value of <code>TargetString</code> must appear at the end of the specified part of the web request.
     * </p>
     * 
     * @param positionalConstraint
     *        Within the portion of a web request that you want to search (for example, in the query string, if any),
     *        specify where you want AWS WAF to search. Valid values include the following:</p>
     *        <p>
     *        <b>CONTAINS</b>
     *        </p>
     *        <p>
     *        The specified part of the web request must include the value of <code>TargetString</code>, but the
     *        location doesn't matter.
     *        </p>
     *        <p>
     *        <b>CONTAINS_WORD</b>
     *        </p>
     *        <p>
     *        The specified part of the web request must include the value of <code>TargetString</code>, and
     *        <code>TargetString</code> must contain only alphanumeric characters or underscore (A-Z, a-z, 0-9, or _).
     *        In addition, <code>TargetString</code> must be a word, which means one of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TargetString</code> exactly matches the value of the specified part of the web request, such as the
     *        value of a header.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TargetString</code> is at the beginning of the specified part of the web request and is followed by
     *        a character other than an alphanumeric character or underscore (_), for example, <code>BadBot;</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TargetString</code> is at the end of the specified part of the web request and is preceded by a
     *        character other than an alphanumeric character or underscore (_), for example, <code>;BadBot</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TargetString</code> is in the middle of the specified part of the web request and is preceded and
     *        followed by characters other than alphanumeric characters or underscore (_), for example,
     *        <code>-BadBot;</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>EXACTLY</b>
     *        </p>
     *        <p>
     *        The value of the specified part of the web request must exactly match the value of
     *        <code>TargetString</code>.
     *        </p>
     *        <p>
     *        <b>STARTS_WITH</b>
     *        </p>
     *        <p>
     *        The value of <code>TargetString</code> must appear at the beginning of the specified part of the web
     *        request.
     *        </p>
     *        <p>
     *        <b>ENDS_WITH</b>
     *        </p>
     *        <p>
     *        The value of <code>TargetString</code> must appear at the end of the specified part of the web request.
     * @see PositionalConstraint
     */

    public void setPositionalConstraint(String positionalConstraint) {
        this.positionalConstraint = positionalConstraint;
    }

    /**
     * <p>
     * Within the portion of a web request that you want to search (for example, in the query string, if any), specify
     * where you want AWS WAF to search. Valid values include the following:
     * </p>
     * <p>
     * <b>CONTAINS</b>
     * </p>
     * <p>
     * The specified part of the web request must include the value of <code>TargetString</code>, but the location
     * doesn't matter.
     * </p>
     * <p>
     * <b>CONTAINS_WORD</b>
     * </p>
     * <p>
     * The specified part of the web request must include the value of <code>TargetString</code>, and
     * <code>TargetString</code> must contain only alphanumeric characters or underscore (A-Z, a-z, 0-9, or _). In
     * addition, <code>TargetString</code> must be a word, which means one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TargetString</code> exactly matches the value of the specified part of the web request, such as the value
     * of a header.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TargetString</code> is at the beginning of the specified part of the web request and is followed by a
     * character other than an alphanumeric character or underscore (_), for example, <code>BadBot;</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TargetString</code> is at the end of the specified part of the web request and is preceded by a character
     * other than an alphanumeric character or underscore (_), for example, <code>;BadBot</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TargetString</code> is in the middle of the specified part of the web request and is preceded and followed
     * by characters other than alphanumeric characters or underscore (_), for example, <code>-BadBot;</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>EXACTLY</b>
     * </p>
     * <p>
     * The value of the specified part of the web request must exactly match the value of <code>TargetString</code>.
     * </p>
     * <p>
     * <b>STARTS_WITH</b>
     * </p>
     * <p>
     * The value of <code>TargetString</code> must appear at the beginning of the specified part of the web request.
     * </p>
     * <p>
     * <b>ENDS_WITH</b>
     * </p>
     * <p>
     * The value of <code>TargetString</code> must appear at the end of the specified part of the web request.
     * </p>
     * 
     * @return Within the portion of a web request that you want to search (for example, in the query string, if any),
     *         specify where you want AWS WAF to search. Valid values include the following:</p>
     *         <p>
     *         <b>CONTAINS</b>
     *         </p>
     *         <p>
     *         The specified part of the web request must include the value of <code>TargetString</code>, but the
     *         location doesn't matter.
     *         </p>
     *         <p>
     *         <b>CONTAINS_WORD</b>
     *         </p>
     *         <p>
     *         The specified part of the web request must include the value of <code>TargetString</code>, and
     *         <code>TargetString</code> must contain only alphanumeric characters or underscore (A-Z, a-z, 0-9, or _).
     *         In addition, <code>TargetString</code> must be a word, which means one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>TargetString</code> exactly matches the value of the specified part of the web request, such as the
     *         value of a header.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TargetString</code> is at the beginning of the specified part of the web request and is followed by
     *         a character other than an alphanumeric character or underscore (_), for example, <code>BadBot;</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TargetString</code> is at the end of the specified part of the web request and is preceded by a
     *         character other than an alphanumeric character or underscore (_), for example, <code>;BadBot</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TargetString</code> is in the middle of the specified part of the web request and is preceded and
     *         followed by characters other than alphanumeric characters or underscore (_), for example,
     *         <code>-BadBot;</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>EXACTLY</b>
     *         </p>
     *         <p>
     *         The value of the specified part of the web request must exactly match the value of
     *         <code>TargetString</code>.
     *         </p>
     *         <p>
     *         <b>STARTS_WITH</b>
     *         </p>
     *         <p>
     *         The value of <code>TargetString</code> must appear at the beginning of the specified part of the web
     *         request.
     *         </p>
     *         <p>
     *         <b>ENDS_WITH</b>
     *         </p>
     *         <p>
     *         The value of <code>TargetString</code> must appear at the end of the specified part of the web request.
     * @see PositionalConstraint
     */

    public String getPositionalConstraint() {
        return this.positionalConstraint;
    }

    /**
     * <p>
     * Within the portion of a web request that you want to search (for example, in the query string, if any), specify
     * where you want AWS WAF to search. Valid values include the following:
     * </p>
     * <p>
     * <b>CONTAINS</b>
     * </p>
     * <p>
     * The specified part of the web request must include the value of <code>TargetString</code>, but the location
     * doesn't matter.
     * </p>
     * <p>
     * <b>CONTAINS_WORD</b>
     * </p>
     * <p>
     * The specified part of the web request must include the value of <code>TargetString</code>, and
     * <code>TargetString</code> must contain only alphanumeric characters or underscore (A-Z, a-z, 0-9, or _). In
     * addition, <code>TargetString</code> must be a word, which means one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TargetString</code> exactly matches the value of the specified part of the web request, such as the value
     * of a header.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TargetString</code> is at the beginning of the specified part of the web request and is followed by a
     * character other than an alphanumeric character or underscore (_), for example, <code>BadBot;</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TargetString</code> is at the end of the specified part of the web request and is preceded by a character
     * other than an alphanumeric character or underscore (_), for example, <code>;BadBot</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TargetString</code> is in the middle of the specified part of the web request and is preceded and followed
     * by characters other than alphanumeric characters or underscore (_), for example, <code>-BadBot;</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>EXACTLY</b>
     * </p>
     * <p>
     * The value of the specified part of the web request must exactly match the value of <code>TargetString</code>.
     * </p>
     * <p>
     * <b>STARTS_WITH</b>
     * </p>
     * <p>
     * The value of <code>TargetString</code> must appear at the beginning of the specified part of the web request.
     * </p>
     * <p>
     * <b>ENDS_WITH</b>
     * </p>
     * <p>
     * The value of <code>TargetString</code> must appear at the end of the specified part of the web request.
     * </p>
     * 
     * @param positionalConstraint
     *        Within the portion of a web request that you want to search (for example, in the query string, if any),
     *        specify where you want AWS WAF to search. Valid values include the following:</p>
     *        <p>
     *        <b>CONTAINS</b>
     *        </p>
     *        <p>
     *        The specified part of the web request must include the value of <code>TargetString</code>, but the
     *        location doesn't matter.
     *        </p>
     *        <p>
     *        <b>CONTAINS_WORD</b>
     *        </p>
     *        <p>
     *        The specified part of the web request must include the value of <code>TargetString</code>, and
     *        <code>TargetString</code> must contain only alphanumeric characters or underscore (A-Z, a-z, 0-9, or _).
     *        In addition, <code>TargetString</code> must be a word, which means one of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TargetString</code> exactly matches the value of the specified part of the web request, such as the
     *        value of a header.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TargetString</code> is at the beginning of the specified part of the web request and is followed by
     *        a character other than an alphanumeric character or underscore (_), for example, <code>BadBot;</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TargetString</code> is at the end of the specified part of the web request and is preceded by a
     *        character other than an alphanumeric character or underscore (_), for example, <code>;BadBot</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TargetString</code> is in the middle of the specified part of the web request and is preceded and
     *        followed by characters other than alphanumeric characters or underscore (_), for example,
     *        <code>-BadBot;</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>EXACTLY</b>
     *        </p>
     *        <p>
     *        The value of the specified part of the web request must exactly match the value of
     *        <code>TargetString</code>.
     *        </p>
     *        <p>
     *        <b>STARTS_WITH</b>
     *        </p>
     *        <p>
     *        The value of <code>TargetString</code> must appear at the beginning of the specified part of the web
     *        request.
     *        </p>
     *        <p>
     *        <b>ENDS_WITH</b>
     *        </p>
     *        <p>
     *        The value of <code>TargetString</code> must appear at the end of the specified part of the web request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PositionalConstraint
     */

    public ByteMatchTuple withPositionalConstraint(String positionalConstraint) {
        setPositionalConstraint(positionalConstraint);
        return this;
    }

    /**
     * <p>
     * Within the portion of a web request that you want to search (for example, in the query string, if any), specify
     * where you want AWS WAF to search. Valid values include the following:
     * </p>
     * <p>
     * <b>CONTAINS</b>
     * </p>
     * <p>
     * The specified part of the web request must include the value of <code>TargetString</code>, but the location
     * doesn't matter.
     * </p>
     * <p>
     * <b>CONTAINS_WORD</b>
     * </p>
     * <p>
     * The specified part of the web request must include the value of <code>TargetString</code>, and
     * <code>TargetString</code> must contain only alphanumeric characters or underscore (A-Z, a-z, 0-9, or _). In
     * addition, <code>TargetString</code> must be a word, which means one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TargetString</code> exactly matches the value of the specified part of the web request, such as the value
     * of a header.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TargetString</code> is at the beginning of the specified part of the web request and is followed by a
     * character other than an alphanumeric character or underscore (_), for example, <code>BadBot;</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TargetString</code> is at the end of the specified part of the web request and is preceded by a character
     * other than an alphanumeric character or underscore (_), for example, <code>;BadBot</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TargetString</code> is in the middle of the specified part of the web request and is preceded and followed
     * by characters other than alphanumeric characters or underscore (_), for example, <code>-BadBot;</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>EXACTLY</b>
     * </p>
     * <p>
     * The value of the specified part of the web request must exactly match the value of <code>TargetString</code>.
     * </p>
     * <p>
     * <b>STARTS_WITH</b>
     * </p>
     * <p>
     * The value of <code>TargetString</code> must appear at the beginning of the specified part of the web request.
     * </p>
     * <p>
     * <b>ENDS_WITH</b>
     * </p>
     * <p>
     * The value of <code>TargetString</code> must appear at the end of the specified part of the web request.
     * </p>
     * 
     * @param positionalConstraint
     *        Within the portion of a web request that you want to search (for example, in the query string, if any),
     *        specify where you want AWS WAF to search. Valid values include the following:</p>
     *        <p>
     *        <b>CONTAINS</b>
     *        </p>
     *        <p>
     *        The specified part of the web request must include the value of <code>TargetString</code>, but the
     *        location doesn't matter.
     *        </p>
     *        <p>
     *        <b>CONTAINS_WORD</b>
     *        </p>
     *        <p>
     *        The specified part of the web request must include the value of <code>TargetString</code>, and
     *        <code>TargetString</code> must contain only alphanumeric characters or underscore (A-Z, a-z, 0-9, or _).
     *        In addition, <code>TargetString</code> must be a word, which means one of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TargetString</code> exactly matches the value of the specified part of the web request, such as the
     *        value of a header.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TargetString</code> is at the beginning of the specified part of the web request and is followed by
     *        a character other than an alphanumeric character or underscore (_), for example, <code>BadBot;</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TargetString</code> is at the end of the specified part of the web request and is preceded by a
     *        character other than an alphanumeric character or underscore (_), for example, <code>;BadBot</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TargetString</code> is in the middle of the specified part of the web request and is preceded and
     *        followed by characters other than alphanumeric characters or underscore (_), for example,
     *        <code>-BadBot;</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>EXACTLY</b>
     *        </p>
     *        <p>
     *        The value of the specified part of the web request must exactly match the value of
     *        <code>TargetString</code>.
     *        </p>
     *        <p>
     *        <b>STARTS_WITH</b>
     *        </p>
     *        <p>
     *        The value of <code>TargetString</code> must appear at the beginning of the specified part of the web
     *        request.
     *        </p>
     *        <p>
     *        <b>ENDS_WITH</b>
     *        </p>
     *        <p>
     *        The value of <code>TargetString</code> must appear at the end of the specified part of the web request.
     * @see PositionalConstraint
     */

    public void setPositionalConstraint(PositionalConstraint positionalConstraint) {
        withPositionalConstraint(positionalConstraint);
    }

    /**
     * <p>
     * Within the portion of a web request that you want to search (for example, in the query string, if any), specify
     * where you want AWS WAF to search. Valid values include the following:
     * </p>
     * <p>
     * <b>CONTAINS</b>
     * </p>
     * <p>
     * The specified part of the web request must include the value of <code>TargetString</code>, but the location
     * doesn't matter.
     * </p>
     * <p>
     * <b>CONTAINS_WORD</b>
     * </p>
     * <p>
     * The specified part of the web request must include the value of <code>TargetString</code>, and
     * <code>TargetString</code> must contain only alphanumeric characters or underscore (A-Z, a-z, 0-9, or _). In
     * addition, <code>TargetString</code> must be a word, which means one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TargetString</code> exactly matches the value of the specified part of the web request, such as the value
     * of a header.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TargetString</code> is at the beginning of the specified part of the web request and is followed by a
     * character other than an alphanumeric character or underscore (_), for example, <code>BadBot;</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TargetString</code> is at the end of the specified part of the web request and is preceded by a character
     * other than an alphanumeric character or underscore (_), for example, <code>;BadBot</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TargetString</code> is in the middle of the specified part of the web request and is preceded and followed
     * by characters other than alphanumeric characters or underscore (_), for example, <code>-BadBot;</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>EXACTLY</b>
     * </p>
     * <p>
     * The value of the specified part of the web request must exactly match the value of <code>TargetString</code>.
     * </p>
     * <p>
     * <b>STARTS_WITH</b>
     * </p>
     * <p>
     * The value of <code>TargetString</code> must appear at the beginning of the specified part of the web request.
     * </p>
     * <p>
     * <b>ENDS_WITH</b>
     * </p>
     * <p>
     * The value of <code>TargetString</code> must appear at the end of the specified part of the web request.
     * </p>
     * 
     * @param positionalConstraint
     *        Within the portion of a web request that you want to search (for example, in the query string, if any),
     *        specify where you want AWS WAF to search. Valid values include the following:</p>
     *        <p>
     *        <b>CONTAINS</b>
     *        </p>
     *        <p>
     *        The specified part of the web request must include the value of <code>TargetString</code>, but the
     *        location doesn't matter.
     *        </p>
     *        <p>
     *        <b>CONTAINS_WORD</b>
     *        </p>
     *        <p>
     *        The specified part of the web request must include the value of <code>TargetString</code>, and
     *        <code>TargetString</code> must contain only alphanumeric characters or underscore (A-Z, a-z, 0-9, or _).
     *        In addition, <code>TargetString</code> must be a word, which means one of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TargetString</code> exactly matches the value of the specified part of the web request, such as the
     *        value of a header.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TargetString</code> is at the beginning of the specified part of the web request and is followed by
     *        a character other than an alphanumeric character or underscore (_), for example, <code>BadBot;</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TargetString</code> is at the end of the specified part of the web request and is preceded by a
     *        character other than an alphanumeric character or underscore (_), for example, <code>;BadBot</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TargetString</code> is in the middle of the specified part of the web request and is preceded and
     *        followed by characters other than alphanumeric characters or underscore (_), for example,
     *        <code>-BadBot;</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>EXACTLY</b>
     *        </p>
     *        <p>
     *        The value of the specified part of the web request must exactly match the value of
     *        <code>TargetString</code>.
     *        </p>
     *        <p>
     *        <b>STARTS_WITH</b>
     *        </p>
     *        <p>
     *        The value of <code>TargetString</code> must appear at the beginning of the specified part of the web
     *        request.
     *        </p>
     *        <p>
     *        <b>ENDS_WITH</b>
     *        </p>
     *        <p>
     *        The value of <code>TargetString</code> must appear at the end of the specified part of the web request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PositionalConstraint
     */

    public ByteMatchTuple withPositionalConstraint(PositionalConstraint positionalConstraint) {
        this.positionalConstraint = positionalConstraint.toString();
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
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
            sb.append("FieldToMatch: ").append(getFieldToMatch()).append(",");
        if (getTargetString() != null)
            sb.append("TargetString: ").append(getTargetString()).append(",");
        if (getTextTransformation() != null)
            sb.append("TextTransformation: ").append(getTextTransformation()).append(",");
        if (getPositionalConstraint() != null)
            sb.append("PositionalConstraint: ").append(getPositionalConstraint());
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
        if (other.getFieldToMatch() != null && other.getFieldToMatch().equals(this.getFieldToMatch()) == false)
            return false;
        if (other.getTargetString() == null ^ this.getTargetString() == null)
            return false;
        if (other.getTargetString() != null && other.getTargetString().equals(this.getTargetString()) == false)
            return false;
        if (other.getTextTransformation() == null ^ this.getTextTransformation() == null)
            return false;
        if (other.getTextTransformation() != null && other.getTextTransformation().equals(this.getTextTransformation()) == false)
            return false;
        if (other.getPositionalConstraint() == null ^ this.getPositionalConstraint() == null)
            return false;
        if (other.getPositionalConstraint() != null && other.getPositionalConstraint().equals(this.getPositionalConstraint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldToMatch() == null) ? 0 : getFieldToMatch().hashCode());
        hashCode = prime * hashCode + ((getTargetString() == null) ? 0 : getTargetString().hashCode());
        hashCode = prime * hashCode + ((getTextTransformation() == null) ? 0 : getTextTransformation().hashCode());
        hashCode = prime * hashCode + ((getPositionalConstraint() == null) ? 0 : getPositionalConstraint().hashCode());
        return hashCode;
    }

    @Override
    public ByteMatchTuple clone() {
        try {
            return (ByteMatchTuple) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.waf.model.waf_regional.transform.ByteMatchTupleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
