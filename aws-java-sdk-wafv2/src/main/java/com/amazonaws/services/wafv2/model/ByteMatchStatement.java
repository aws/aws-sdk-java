/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <note>
 * <p>
 * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information, including
 * how to migrate your AWS WAF resources from the prior release, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
 * </p>
 * </note>
 * <p>
 * A rule statement that defines a string match search for AWS WAF to apply to web requests. The byte match statement
 * provides the bytes to search for, the location in requests that you want AWS WAF to search, and other settings. The
 * bytes to search for are typically a string that corresponds with ASCII characters. In the AWS WAF console and the
 * developer guide, this is refered to as a string match statement.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ByteMatchStatement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ByteMatchStatement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A string value that you want AWS WAF to search for. AWS WAF searches only in the part of web requests that you
     * designate for inspection in <a>FieldToMatch</a>. The maximum length of the value is 50 bytes.
     * </p>
     * <p>
     * Valid values depend on the areas that you specify for inspection in <code>FieldToMatch</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Method</code>: The HTTP method that you want AWS WAF to search for. This indicates the type of operation
     * specified in the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UriPath</code>: The value that you want AWS WAF to search for in the URI path, for example,
     * <code>/images/daily-ad.jpg</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>SearchString</code> includes alphabetic characters A-Z and a-z, note that the value is case sensitive.
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
     * value, <code>QmFkQm90</code>, in the value of <code>SearchString</code>.
     * </p>
     * <p>
     * <b>If you're using the AWS CLI or one of the AWS SDKs</b>
     * </p>
     * <p>
     * The value that you want AWS WAF to search for. The SDK automatically base64 encodes the value.
     * </p>
     */
    private java.nio.ByteBuffer searchString;
    /**
     * <p>
     * The part of a web request that you want AWS WAF to inspect. For more information, see <a>FieldToMatch</a>.
     * </p>
     */
    private FieldToMatch fieldToMatch;
    /**
     * <p>
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to
     * bypass detection. If you specify one or more transformations in a rule statement, AWS WAF performs all
     * transformations on the content identified by <code>FieldToMatch</code>, starting from the lowest priority
     * setting, before inspecting the content for a match.
     * </p>
     */
    private java.util.List<TextTransformation> textTransformations;
    /**
     * <p>
     * The area within the portion of a web request that you want AWS WAF to search for <code>SearchString</code>. Valid
     * values include the following:
     * </p>
     * <p>
     * <b>CONTAINS</b>
     * </p>
     * <p>
     * The specified part of the web request must include the value of <code>SearchString</code>, but the location
     * doesn't matter.
     * </p>
     * <p>
     * <b>CONTAINS_WORD</b>
     * </p>
     * <p>
     * The specified part of the web request must include the value of <code>SearchString</code>, and
     * <code>SearchString</code> must contain only alphanumeric characters or underscore (A-Z, a-z, 0-9, or _). In
     * addition, <code>SearchString</code> must be a word, which means that both of the following are true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SearchString</code> is at the beginning of the specified part of the web request or is preceded by a
     * character other than an alphanumeric character or underscore (_). Examples include the value of a header and
     * <code>;BadBot</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SearchString</code> is at the end of the specified part of the web request or is followed by a character
     * other than an alphanumeric character or underscore (_), for example, <code>BadBot;</code> and
     * <code>-BadBot;</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>EXACTLY</b>
     * </p>
     * <p>
     * The value of the specified part of the web request must exactly match the value of <code>SearchString</code>.
     * </p>
     * <p>
     * <b>STARTS_WITH</b>
     * </p>
     * <p>
     * The value of <code>SearchString</code> must appear at the beginning of the specified part of the web request.
     * </p>
     * <p>
     * <b>ENDS_WITH</b>
     * </p>
     * <p>
     * The value of <code>SearchString</code> must appear at the end of the specified part of the web request.
     * </p>
     */
    private String positionalConstraint;

    /**
     * <p>
     * A string value that you want AWS WAF to search for. AWS WAF searches only in the part of web requests that you
     * designate for inspection in <a>FieldToMatch</a>. The maximum length of the value is 50 bytes.
     * </p>
     * <p>
     * Valid values depend on the areas that you specify for inspection in <code>FieldToMatch</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Method</code>: The HTTP method that you want AWS WAF to search for. This indicates the type of operation
     * specified in the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UriPath</code>: The value that you want AWS WAF to search for in the URI path, for example,
     * <code>/images/daily-ad.jpg</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>SearchString</code> includes alphabetic characters A-Z and a-z, note that the value is case sensitive.
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
     * value, <code>QmFkQm90</code>, in the value of <code>SearchString</code>.
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
     * @param searchString
     *        A string value that you want AWS WAF to search for. AWS WAF searches only in the part of web requests that
     *        you designate for inspection in <a>FieldToMatch</a>. The maximum length of the value is 50 bytes.</p>
     *        <p>
     *        Valid values depend on the areas that you specify for inspection in <code>FieldToMatch</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Method</code>: The HTTP method that you want AWS WAF to search for. This indicates the type of
     *        operation specified in the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UriPath</code>: The value that you want AWS WAF to search for in the URI path, for example,
     *        <code>/images/daily-ad.jpg</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If <code>SearchString</code> includes alphabetic characters A-Z and a-z, note that the value is case
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
     *        include the resulting value, <code>QmFkQm90</code>, in the value of <code>SearchString</code>.
     *        </p>
     *        <p>
     *        <b>If you're using the AWS CLI or one of the AWS SDKs</b>
     *        </p>
     *        <p>
     *        The value that you want AWS WAF to search for. The SDK automatically base64 encodes the value.
     */

    public void setSearchString(java.nio.ByteBuffer searchString) {
        this.searchString = searchString;
    }

    /**
     * <p>
     * A string value that you want AWS WAF to search for. AWS WAF searches only in the part of web requests that you
     * designate for inspection in <a>FieldToMatch</a>. The maximum length of the value is 50 bytes.
     * </p>
     * <p>
     * Valid values depend on the areas that you specify for inspection in <code>FieldToMatch</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Method</code>: The HTTP method that you want AWS WAF to search for. This indicates the type of operation
     * specified in the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UriPath</code>: The value that you want AWS WAF to search for in the URI path, for example,
     * <code>/images/daily-ad.jpg</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>SearchString</code> includes alphabetic characters A-Z and a-z, note that the value is case sensitive.
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
     * value, <code>QmFkQm90</code>, in the value of <code>SearchString</code>.
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
     * @return A string value that you want AWS WAF to search for. AWS WAF searches only in the part of web requests
     *         that you designate for inspection in <a>FieldToMatch</a>. The maximum length of the value is 50
     *         bytes.</p>
     *         <p>
     *         Valid values depend on the areas that you specify for inspection in <code>FieldToMatch</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Method</code>: The HTTP method that you want AWS WAF to search for. This indicates the type of
     *         operation specified in the request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UriPath</code>: The value that you want AWS WAF to search for in the URI path, for example,
     *         <code>/images/daily-ad.jpg</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If <code>SearchString</code> includes alphabetic characters A-Z and a-z, note that the value is case
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
     *         include the resulting value, <code>QmFkQm90</code>, in the value of <code>SearchString</code>.
     *         </p>
     *         <p>
     *         <b>If you're using the AWS CLI or one of the AWS SDKs</b>
     *         </p>
     *         <p>
     *         The value that you want AWS WAF to search for. The SDK automatically base64 encodes the value.
     */

    public java.nio.ByteBuffer getSearchString() {
        return this.searchString;
    }

    /**
     * <p>
     * A string value that you want AWS WAF to search for. AWS WAF searches only in the part of web requests that you
     * designate for inspection in <a>FieldToMatch</a>. The maximum length of the value is 50 bytes.
     * </p>
     * <p>
     * Valid values depend on the areas that you specify for inspection in <code>FieldToMatch</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Method</code>: The HTTP method that you want AWS WAF to search for. This indicates the type of operation
     * specified in the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UriPath</code>: The value that you want AWS WAF to search for in the URI path, for example,
     * <code>/images/daily-ad.jpg</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>SearchString</code> includes alphabetic characters A-Z and a-z, note that the value is case sensitive.
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
     * value, <code>QmFkQm90</code>, in the value of <code>SearchString</code>.
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
     * @param searchString
     *        A string value that you want AWS WAF to search for. AWS WAF searches only in the part of web requests that
     *        you designate for inspection in <a>FieldToMatch</a>. The maximum length of the value is 50 bytes.</p>
     *        <p>
     *        Valid values depend on the areas that you specify for inspection in <code>FieldToMatch</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Method</code>: The HTTP method that you want AWS WAF to search for. This indicates the type of
     *        operation specified in the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UriPath</code>: The value that you want AWS WAF to search for in the URI path, for example,
     *        <code>/images/daily-ad.jpg</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If <code>SearchString</code> includes alphabetic characters A-Z and a-z, note that the value is case
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
     *        include the resulting value, <code>QmFkQm90</code>, in the value of <code>SearchString</code>.
     *        </p>
     *        <p>
     *        <b>If you're using the AWS CLI or one of the AWS SDKs</b>
     *        </p>
     *        <p>
     *        The value that you want AWS WAF to search for. The SDK automatically base64 encodes the value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ByteMatchStatement withSearchString(java.nio.ByteBuffer searchString) {
        setSearchString(searchString);
        return this;
    }

    /**
     * <p>
     * The part of a web request that you want AWS WAF to inspect. For more information, see <a>FieldToMatch</a>.
     * </p>
     * 
     * @param fieldToMatch
     *        The part of a web request that you want AWS WAF to inspect. For more information, see <a>FieldToMatch</a>.
     */

    public void setFieldToMatch(FieldToMatch fieldToMatch) {
        this.fieldToMatch = fieldToMatch;
    }

    /**
     * <p>
     * The part of a web request that you want AWS WAF to inspect. For more information, see <a>FieldToMatch</a>.
     * </p>
     * 
     * @return The part of a web request that you want AWS WAF to inspect. For more information, see
     *         <a>FieldToMatch</a>.
     */

    public FieldToMatch getFieldToMatch() {
        return this.fieldToMatch;
    }

    /**
     * <p>
     * The part of a web request that you want AWS WAF to inspect. For more information, see <a>FieldToMatch</a>.
     * </p>
     * 
     * @param fieldToMatch
     *        The part of a web request that you want AWS WAF to inspect. For more information, see <a>FieldToMatch</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ByteMatchStatement withFieldToMatch(FieldToMatch fieldToMatch) {
        setFieldToMatch(fieldToMatch);
        return this;
    }

    /**
     * <p>
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to
     * bypass detection. If you specify one or more transformations in a rule statement, AWS WAF performs all
     * transformations on the content identified by <code>FieldToMatch</code>, starting from the lowest priority
     * setting, before inspecting the content for a match.
     * </p>
     * 
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an
     *         effort to bypass detection. If you specify one or more transformations in a rule statement, AWS WAF
     *         performs all transformations on the content identified by <code>FieldToMatch</code>, starting from the
     *         lowest priority setting, before inspecting the content for a match.
     */

    public java.util.List<TextTransformation> getTextTransformations() {
        return textTransformations;
    }

    /**
     * <p>
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to
     * bypass detection. If you specify one or more transformations in a rule statement, AWS WAF performs all
     * transformations on the content identified by <code>FieldToMatch</code>, starting from the lowest priority
     * setting, before inspecting the content for a match.
     * </p>
     * 
     * @param textTransformations
     *        Text transformations eliminate some of the unusual formatting that attackers use in web requests in an
     *        effort to bypass detection. If you specify one or more transformations in a rule statement, AWS WAF
     *        performs all transformations on the content identified by <code>FieldToMatch</code>, starting from the
     *        lowest priority setting, before inspecting the content for a match.
     */

    public void setTextTransformations(java.util.Collection<TextTransformation> textTransformations) {
        if (textTransformations == null) {
            this.textTransformations = null;
            return;
        }

        this.textTransformations = new java.util.ArrayList<TextTransformation>(textTransformations);
    }

    /**
     * <p>
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to
     * bypass detection. If you specify one or more transformations in a rule statement, AWS WAF performs all
     * transformations on the content identified by <code>FieldToMatch</code>, starting from the lowest priority
     * setting, before inspecting the content for a match.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTextTransformations(java.util.Collection)} or {@link #withTextTransformations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param textTransformations
     *        Text transformations eliminate some of the unusual formatting that attackers use in web requests in an
     *        effort to bypass detection. If you specify one or more transformations in a rule statement, AWS WAF
     *        performs all transformations on the content identified by <code>FieldToMatch</code>, starting from the
     *        lowest priority setting, before inspecting the content for a match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ByteMatchStatement withTextTransformations(TextTransformation... textTransformations) {
        if (this.textTransformations == null) {
            setTextTransformations(new java.util.ArrayList<TextTransformation>(textTransformations.length));
        }
        for (TextTransformation ele : textTransformations) {
            this.textTransformations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to
     * bypass detection. If you specify one or more transformations in a rule statement, AWS WAF performs all
     * transformations on the content identified by <code>FieldToMatch</code>, starting from the lowest priority
     * setting, before inspecting the content for a match.
     * </p>
     * 
     * @param textTransformations
     *        Text transformations eliminate some of the unusual formatting that attackers use in web requests in an
     *        effort to bypass detection. If you specify one or more transformations in a rule statement, AWS WAF
     *        performs all transformations on the content identified by <code>FieldToMatch</code>, starting from the
     *        lowest priority setting, before inspecting the content for a match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ByteMatchStatement withTextTransformations(java.util.Collection<TextTransformation> textTransformations) {
        setTextTransformations(textTransformations);
        return this;
    }

    /**
     * <p>
     * The area within the portion of a web request that you want AWS WAF to search for <code>SearchString</code>. Valid
     * values include the following:
     * </p>
     * <p>
     * <b>CONTAINS</b>
     * </p>
     * <p>
     * The specified part of the web request must include the value of <code>SearchString</code>, but the location
     * doesn't matter.
     * </p>
     * <p>
     * <b>CONTAINS_WORD</b>
     * </p>
     * <p>
     * The specified part of the web request must include the value of <code>SearchString</code>, and
     * <code>SearchString</code> must contain only alphanumeric characters or underscore (A-Z, a-z, 0-9, or _). In
     * addition, <code>SearchString</code> must be a word, which means that both of the following are true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SearchString</code> is at the beginning of the specified part of the web request or is preceded by a
     * character other than an alphanumeric character or underscore (_). Examples include the value of a header and
     * <code>;BadBot</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SearchString</code> is at the end of the specified part of the web request or is followed by a character
     * other than an alphanumeric character or underscore (_), for example, <code>BadBot;</code> and
     * <code>-BadBot;</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>EXACTLY</b>
     * </p>
     * <p>
     * The value of the specified part of the web request must exactly match the value of <code>SearchString</code>.
     * </p>
     * <p>
     * <b>STARTS_WITH</b>
     * </p>
     * <p>
     * The value of <code>SearchString</code> must appear at the beginning of the specified part of the web request.
     * </p>
     * <p>
     * <b>ENDS_WITH</b>
     * </p>
     * <p>
     * The value of <code>SearchString</code> must appear at the end of the specified part of the web request.
     * </p>
     * 
     * @param positionalConstraint
     *        The area within the portion of a web request that you want AWS WAF to search for <code>SearchString</code>
     *        . Valid values include the following:</p>
     *        <p>
     *        <b>CONTAINS</b>
     *        </p>
     *        <p>
     *        The specified part of the web request must include the value of <code>SearchString</code>, but the
     *        location doesn't matter.
     *        </p>
     *        <p>
     *        <b>CONTAINS_WORD</b>
     *        </p>
     *        <p>
     *        The specified part of the web request must include the value of <code>SearchString</code>, and
     *        <code>SearchString</code> must contain only alphanumeric characters or underscore (A-Z, a-z, 0-9, or _).
     *        In addition, <code>SearchString</code> must be a word, which means that both of the following are true:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SearchString</code> is at the beginning of the specified part of the web request or is preceded by a
     *        character other than an alphanumeric character or underscore (_). Examples include the value of a header
     *        and <code>;BadBot</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SearchString</code> is at the end of the specified part of the web request or is followed by a
     *        character other than an alphanumeric character or underscore (_), for example, <code>BadBot;</code> and
     *        <code>-BadBot;</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>EXACTLY</b>
     *        </p>
     *        <p>
     *        The value of the specified part of the web request must exactly match the value of
     *        <code>SearchString</code>.
     *        </p>
     *        <p>
     *        <b>STARTS_WITH</b>
     *        </p>
     *        <p>
     *        The value of <code>SearchString</code> must appear at the beginning of the specified part of the web
     *        request.
     *        </p>
     *        <p>
     *        <b>ENDS_WITH</b>
     *        </p>
     *        <p>
     *        The value of <code>SearchString</code> must appear at the end of the specified part of the web request.
     * @see PositionalConstraint
     */

    public void setPositionalConstraint(String positionalConstraint) {
        this.positionalConstraint = positionalConstraint;
    }

    /**
     * <p>
     * The area within the portion of a web request that you want AWS WAF to search for <code>SearchString</code>. Valid
     * values include the following:
     * </p>
     * <p>
     * <b>CONTAINS</b>
     * </p>
     * <p>
     * The specified part of the web request must include the value of <code>SearchString</code>, but the location
     * doesn't matter.
     * </p>
     * <p>
     * <b>CONTAINS_WORD</b>
     * </p>
     * <p>
     * The specified part of the web request must include the value of <code>SearchString</code>, and
     * <code>SearchString</code> must contain only alphanumeric characters or underscore (A-Z, a-z, 0-9, or _). In
     * addition, <code>SearchString</code> must be a word, which means that both of the following are true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SearchString</code> is at the beginning of the specified part of the web request or is preceded by a
     * character other than an alphanumeric character or underscore (_). Examples include the value of a header and
     * <code>;BadBot</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SearchString</code> is at the end of the specified part of the web request or is followed by a character
     * other than an alphanumeric character or underscore (_), for example, <code>BadBot;</code> and
     * <code>-BadBot;</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>EXACTLY</b>
     * </p>
     * <p>
     * The value of the specified part of the web request must exactly match the value of <code>SearchString</code>.
     * </p>
     * <p>
     * <b>STARTS_WITH</b>
     * </p>
     * <p>
     * The value of <code>SearchString</code> must appear at the beginning of the specified part of the web request.
     * </p>
     * <p>
     * <b>ENDS_WITH</b>
     * </p>
     * <p>
     * The value of <code>SearchString</code> must appear at the end of the specified part of the web request.
     * </p>
     * 
     * @return The area within the portion of a web request that you want AWS WAF to search for
     *         <code>SearchString</code>. Valid values include the following:</p>
     *         <p>
     *         <b>CONTAINS</b>
     *         </p>
     *         <p>
     *         The specified part of the web request must include the value of <code>SearchString</code>, but the
     *         location doesn't matter.
     *         </p>
     *         <p>
     *         <b>CONTAINS_WORD</b>
     *         </p>
     *         <p>
     *         The specified part of the web request must include the value of <code>SearchString</code>, and
     *         <code>SearchString</code> must contain only alphanumeric characters or underscore (A-Z, a-z, 0-9, or _).
     *         In addition, <code>SearchString</code> must be a word, which means that both of the following are true:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SearchString</code> is at the beginning of the specified part of the web request or is preceded by
     *         a character other than an alphanumeric character or underscore (_). Examples include the value of a
     *         header and <code>;BadBot</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SearchString</code> is at the end of the specified part of the web request or is followed by a
     *         character other than an alphanumeric character or underscore (_), for example, <code>BadBot;</code> and
     *         <code>-BadBot;</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>EXACTLY</b>
     *         </p>
     *         <p>
     *         The value of the specified part of the web request must exactly match the value of
     *         <code>SearchString</code>.
     *         </p>
     *         <p>
     *         <b>STARTS_WITH</b>
     *         </p>
     *         <p>
     *         The value of <code>SearchString</code> must appear at the beginning of the specified part of the web
     *         request.
     *         </p>
     *         <p>
     *         <b>ENDS_WITH</b>
     *         </p>
     *         <p>
     *         The value of <code>SearchString</code> must appear at the end of the specified part of the web request.
     * @see PositionalConstraint
     */

    public String getPositionalConstraint() {
        return this.positionalConstraint;
    }

    /**
     * <p>
     * The area within the portion of a web request that you want AWS WAF to search for <code>SearchString</code>. Valid
     * values include the following:
     * </p>
     * <p>
     * <b>CONTAINS</b>
     * </p>
     * <p>
     * The specified part of the web request must include the value of <code>SearchString</code>, but the location
     * doesn't matter.
     * </p>
     * <p>
     * <b>CONTAINS_WORD</b>
     * </p>
     * <p>
     * The specified part of the web request must include the value of <code>SearchString</code>, and
     * <code>SearchString</code> must contain only alphanumeric characters or underscore (A-Z, a-z, 0-9, or _). In
     * addition, <code>SearchString</code> must be a word, which means that both of the following are true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SearchString</code> is at the beginning of the specified part of the web request or is preceded by a
     * character other than an alphanumeric character or underscore (_). Examples include the value of a header and
     * <code>;BadBot</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SearchString</code> is at the end of the specified part of the web request or is followed by a character
     * other than an alphanumeric character or underscore (_), for example, <code>BadBot;</code> and
     * <code>-BadBot;</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>EXACTLY</b>
     * </p>
     * <p>
     * The value of the specified part of the web request must exactly match the value of <code>SearchString</code>.
     * </p>
     * <p>
     * <b>STARTS_WITH</b>
     * </p>
     * <p>
     * The value of <code>SearchString</code> must appear at the beginning of the specified part of the web request.
     * </p>
     * <p>
     * <b>ENDS_WITH</b>
     * </p>
     * <p>
     * The value of <code>SearchString</code> must appear at the end of the specified part of the web request.
     * </p>
     * 
     * @param positionalConstraint
     *        The area within the portion of a web request that you want AWS WAF to search for <code>SearchString</code>
     *        . Valid values include the following:</p>
     *        <p>
     *        <b>CONTAINS</b>
     *        </p>
     *        <p>
     *        The specified part of the web request must include the value of <code>SearchString</code>, but the
     *        location doesn't matter.
     *        </p>
     *        <p>
     *        <b>CONTAINS_WORD</b>
     *        </p>
     *        <p>
     *        The specified part of the web request must include the value of <code>SearchString</code>, and
     *        <code>SearchString</code> must contain only alphanumeric characters or underscore (A-Z, a-z, 0-9, or _).
     *        In addition, <code>SearchString</code> must be a word, which means that both of the following are true:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SearchString</code> is at the beginning of the specified part of the web request or is preceded by a
     *        character other than an alphanumeric character or underscore (_). Examples include the value of a header
     *        and <code>;BadBot</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SearchString</code> is at the end of the specified part of the web request or is followed by a
     *        character other than an alphanumeric character or underscore (_), for example, <code>BadBot;</code> and
     *        <code>-BadBot;</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>EXACTLY</b>
     *        </p>
     *        <p>
     *        The value of the specified part of the web request must exactly match the value of
     *        <code>SearchString</code>.
     *        </p>
     *        <p>
     *        <b>STARTS_WITH</b>
     *        </p>
     *        <p>
     *        The value of <code>SearchString</code> must appear at the beginning of the specified part of the web
     *        request.
     *        </p>
     *        <p>
     *        <b>ENDS_WITH</b>
     *        </p>
     *        <p>
     *        The value of <code>SearchString</code> must appear at the end of the specified part of the web request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PositionalConstraint
     */

    public ByteMatchStatement withPositionalConstraint(String positionalConstraint) {
        setPositionalConstraint(positionalConstraint);
        return this;
    }

    /**
     * <p>
     * The area within the portion of a web request that you want AWS WAF to search for <code>SearchString</code>. Valid
     * values include the following:
     * </p>
     * <p>
     * <b>CONTAINS</b>
     * </p>
     * <p>
     * The specified part of the web request must include the value of <code>SearchString</code>, but the location
     * doesn't matter.
     * </p>
     * <p>
     * <b>CONTAINS_WORD</b>
     * </p>
     * <p>
     * The specified part of the web request must include the value of <code>SearchString</code>, and
     * <code>SearchString</code> must contain only alphanumeric characters or underscore (A-Z, a-z, 0-9, or _). In
     * addition, <code>SearchString</code> must be a word, which means that both of the following are true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SearchString</code> is at the beginning of the specified part of the web request or is preceded by a
     * character other than an alphanumeric character or underscore (_). Examples include the value of a header and
     * <code>;BadBot</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SearchString</code> is at the end of the specified part of the web request or is followed by a character
     * other than an alphanumeric character or underscore (_), for example, <code>BadBot;</code> and
     * <code>-BadBot;</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>EXACTLY</b>
     * </p>
     * <p>
     * The value of the specified part of the web request must exactly match the value of <code>SearchString</code>.
     * </p>
     * <p>
     * <b>STARTS_WITH</b>
     * </p>
     * <p>
     * The value of <code>SearchString</code> must appear at the beginning of the specified part of the web request.
     * </p>
     * <p>
     * <b>ENDS_WITH</b>
     * </p>
     * <p>
     * The value of <code>SearchString</code> must appear at the end of the specified part of the web request.
     * </p>
     * 
     * @param positionalConstraint
     *        The area within the portion of a web request that you want AWS WAF to search for <code>SearchString</code>
     *        . Valid values include the following:</p>
     *        <p>
     *        <b>CONTAINS</b>
     *        </p>
     *        <p>
     *        The specified part of the web request must include the value of <code>SearchString</code>, but the
     *        location doesn't matter.
     *        </p>
     *        <p>
     *        <b>CONTAINS_WORD</b>
     *        </p>
     *        <p>
     *        The specified part of the web request must include the value of <code>SearchString</code>, and
     *        <code>SearchString</code> must contain only alphanumeric characters or underscore (A-Z, a-z, 0-9, or _).
     *        In addition, <code>SearchString</code> must be a word, which means that both of the following are true:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SearchString</code> is at the beginning of the specified part of the web request or is preceded by a
     *        character other than an alphanumeric character or underscore (_). Examples include the value of a header
     *        and <code>;BadBot</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SearchString</code> is at the end of the specified part of the web request or is followed by a
     *        character other than an alphanumeric character or underscore (_), for example, <code>BadBot;</code> and
     *        <code>-BadBot;</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>EXACTLY</b>
     *        </p>
     *        <p>
     *        The value of the specified part of the web request must exactly match the value of
     *        <code>SearchString</code>.
     *        </p>
     *        <p>
     *        <b>STARTS_WITH</b>
     *        </p>
     *        <p>
     *        The value of <code>SearchString</code> must appear at the beginning of the specified part of the web
     *        request.
     *        </p>
     *        <p>
     *        <b>ENDS_WITH</b>
     *        </p>
     *        <p>
     *        The value of <code>SearchString</code> must appear at the end of the specified part of the web request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PositionalConstraint
     */

    public ByteMatchStatement withPositionalConstraint(PositionalConstraint positionalConstraint) {
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
        if (getSearchString() != null)
            sb.append("SearchString: ").append(getSearchString()).append(",");
        if (getFieldToMatch() != null)
            sb.append("FieldToMatch: ").append(getFieldToMatch()).append(",");
        if (getTextTransformations() != null)
            sb.append("TextTransformations: ").append(getTextTransformations()).append(",");
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

        if (obj instanceof ByteMatchStatement == false)
            return false;
        ByteMatchStatement other = (ByteMatchStatement) obj;
        if (other.getSearchString() == null ^ this.getSearchString() == null)
            return false;
        if (other.getSearchString() != null && other.getSearchString().equals(this.getSearchString()) == false)
            return false;
        if (other.getFieldToMatch() == null ^ this.getFieldToMatch() == null)
            return false;
        if (other.getFieldToMatch() != null && other.getFieldToMatch().equals(this.getFieldToMatch()) == false)
            return false;
        if (other.getTextTransformations() == null ^ this.getTextTransformations() == null)
            return false;
        if (other.getTextTransformations() != null && other.getTextTransformations().equals(this.getTextTransformations()) == false)
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

        hashCode = prime * hashCode + ((getSearchString() == null) ? 0 : getSearchString().hashCode());
        hashCode = prime * hashCode + ((getFieldToMatch() == null) ? 0 : getFieldToMatch().hashCode());
        hashCode = prime * hashCode + ((getTextTransformations() == null) ? 0 : getTextTransformations().hashCode());
        hashCode = prime * hashCode + ((getPositionalConstraint() == null) ? 0 : getPositionalConstraint().hashCode());
        return hashCode;
    }

    @Override
    public ByteMatchStatement clone() {
        try {
            return (ByteMatchStatement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.ByteMatchStatementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
