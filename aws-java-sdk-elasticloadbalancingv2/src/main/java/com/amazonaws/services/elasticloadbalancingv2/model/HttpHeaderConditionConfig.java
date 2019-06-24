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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about an HTTP header condition.
 * </p>
 * <p>
 * There is a set of standard HTTP header fields. You can also define custom HTTP header fields.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/HttpHeaderConditionConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HttpHeaderConditionConfig implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the HTTP header field. The maximum size is 40 characters. The header name is case insensitive. The
     * allowed characters are specified by RFC 7230. Wildcards are not supported.
     * </p>
     * <p>
     * You can't use an HTTP header condition to specify the host header. Use <a>HostHeaderConditionConfig</a> to
     * specify a host header condition.
     * </p>
     */
    private String httpHeaderName;
    /**
     * <p>
     * One or more strings to compare against the value of the HTTP header. The maximum size of each string is 128
     * characters. The comparison strings are case insensitive. The following wildcard characters are supported: *
     * (matches 0 or more characters) and ? (matches exactly 1 character).
     * </p>
     * <p>
     * If the same header appears multiple times in the request, we search them in order until a match is found.
     * </p>
     * <p>
     * If you specify multiple strings, the condition is satisfied if one of the strings matches the value of the HTTP
     * header. To require that all of the strings are a match, create one condition per string.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The name of the HTTP header field. The maximum size is 40 characters. The header name is case insensitive. The
     * allowed characters are specified by RFC 7230. Wildcards are not supported.
     * </p>
     * <p>
     * You can't use an HTTP header condition to specify the host header. Use <a>HostHeaderConditionConfig</a> to
     * specify a host header condition.
     * </p>
     * 
     * @param httpHeaderName
     *        The name of the HTTP header field. The maximum size is 40 characters. The header name is case insensitive.
     *        The allowed characters are specified by RFC 7230. Wildcards are not supported.</p>
     *        <p>
     *        You can't use an HTTP header condition to specify the host header. Use <a>HostHeaderConditionConfig</a> to
     *        specify a host header condition.
     */

    public void setHttpHeaderName(String httpHeaderName) {
        this.httpHeaderName = httpHeaderName;
    }

    /**
     * <p>
     * The name of the HTTP header field. The maximum size is 40 characters. The header name is case insensitive. The
     * allowed characters are specified by RFC 7230. Wildcards are not supported.
     * </p>
     * <p>
     * You can't use an HTTP header condition to specify the host header. Use <a>HostHeaderConditionConfig</a> to
     * specify a host header condition.
     * </p>
     * 
     * @return The name of the HTTP header field. The maximum size is 40 characters. The header name is case
     *         insensitive. The allowed characters are specified by RFC 7230. Wildcards are not supported.</p>
     *         <p>
     *         You can't use an HTTP header condition to specify the host header. Use <a>HostHeaderConditionConfig</a>
     *         to specify a host header condition.
     */

    public String getHttpHeaderName() {
        return this.httpHeaderName;
    }

    /**
     * <p>
     * The name of the HTTP header field. The maximum size is 40 characters. The header name is case insensitive. The
     * allowed characters are specified by RFC 7230. Wildcards are not supported.
     * </p>
     * <p>
     * You can't use an HTTP header condition to specify the host header. Use <a>HostHeaderConditionConfig</a> to
     * specify a host header condition.
     * </p>
     * 
     * @param httpHeaderName
     *        The name of the HTTP header field. The maximum size is 40 characters. The header name is case insensitive.
     *        The allowed characters are specified by RFC 7230. Wildcards are not supported.</p>
     *        <p>
     *        You can't use an HTTP header condition to specify the host header. Use <a>HostHeaderConditionConfig</a> to
     *        specify a host header condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpHeaderConditionConfig withHttpHeaderName(String httpHeaderName) {
        setHttpHeaderName(httpHeaderName);
        return this;
    }

    /**
     * <p>
     * One or more strings to compare against the value of the HTTP header. The maximum size of each string is 128
     * characters. The comparison strings are case insensitive. The following wildcard characters are supported: *
     * (matches 0 or more characters) and ? (matches exactly 1 character).
     * </p>
     * <p>
     * If the same header appears multiple times in the request, we search them in order until a match is found.
     * </p>
     * <p>
     * If you specify multiple strings, the condition is satisfied if one of the strings matches the value of the HTTP
     * header. To require that all of the strings are a match, create one condition per string.
     * </p>
     * 
     * @return One or more strings to compare against the value of the HTTP header. The maximum size of each string is
     *         128 characters. The comparison strings are case insensitive. The following wildcard characters are
     *         supported: * (matches 0 or more characters) and ? (matches exactly 1 character).</p>
     *         <p>
     *         If the same header appears multiple times in the request, we search them in order until a match is found.
     *         </p>
     *         <p>
     *         If you specify multiple strings, the condition is satisfied if one of the strings matches the value of
     *         the HTTP header. To require that all of the strings are a match, create one condition per string.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * One or more strings to compare against the value of the HTTP header. The maximum size of each string is 128
     * characters. The comparison strings are case insensitive. The following wildcard characters are supported: *
     * (matches 0 or more characters) and ? (matches exactly 1 character).
     * </p>
     * <p>
     * If the same header appears multiple times in the request, we search them in order until a match is found.
     * </p>
     * <p>
     * If you specify multiple strings, the condition is satisfied if one of the strings matches the value of the HTTP
     * header. To require that all of the strings are a match, create one condition per string.
     * </p>
     * 
     * @param values
     *        One or more strings to compare against the value of the HTTP header. The maximum size of each string is
     *        128 characters. The comparison strings are case insensitive. The following wildcard characters are
     *        supported: * (matches 0 or more characters) and ? (matches exactly 1 character).</p>
     *        <p>
     *        If the same header appears multiple times in the request, we search them in order until a match is found.
     *        </p>
     *        <p>
     *        If you specify multiple strings, the condition is satisfied if one of the strings matches the value of the
     *        HTTP header. To require that all of the strings are a match, create one condition per string.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * One or more strings to compare against the value of the HTTP header. The maximum size of each string is 128
     * characters. The comparison strings are case insensitive. The following wildcard characters are supported: *
     * (matches 0 or more characters) and ? (matches exactly 1 character).
     * </p>
     * <p>
     * If the same header appears multiple times in the request, we search them in order until a match is found.
     * </p>
     * <p>
     * If you specify multiple strings, the condition is satisfied if one of the strings matches the value of the HTTP
     * header. To require that all of the strings are a match, create one condition per string.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        One or more strings to compare against the value of the HTTP header. The maximum size of each string is
     *        128 characters. The comparison strings are case insensitive. The following wildcard characters are
     *        supported: * (matches 0 or more characters) and ? (matches exactly 1 character).</p>
     *        <p>
     *        If the same header appears multiple times in the request, we search them in order until a match is found.
     *        </p>
     *        <p>
     *        If you specify multiple strings, the condition is satisfied if one of the strings matches the value of the
     *        HTTP header. To require that all of the strings are a match, create one condition per string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpHeaderConditionConfig withValues(String... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more strings to compare against the value of the HTTP header. The maximum size of each string is 128
     * characters. The comparison strings are case insensitive. The following wildcard characters are supported: *
     * (matches 0 or more characters) and ? (matches exactly 1 character).
     * </p>
     * <p>
     * If the same header appears multiple times in the request, we search them in order until a match is found.
     * </p>
     * <p>
     * If you specify multiple strings, the condition is satisfied if one of the strings matches the value of the HTTP
     * header. To require that all of the strings are a match, create one condition per string.
     * </p>
     * 
     * @param values
     *        One or more strings to compare against the value of the HTTP header. The maximum size of each string is
     *        128 characters. The comparison strings are case insensitive. The following wildcard characters are
     *        supported: * (matches 0 or more characters) and ? (matches exactly 1 character).</p>
     *        <p>
     *        If the same header appears multiple times in the request, we search them in order until a match is found.
     *        </p>
     *        <p>
     *        If you specify multiple strings, the condition is satisfied if one of the strings matches the value of the
     *        HTTP header. To require that all of the strings are a match, create one condition per string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpHeaderConditionConfig withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getHttpHeaderName() != null)
            sb.append("HttpHeaderName: ").append(getHttpHeaderName()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HttpHeaderConditionConfig == false)
            return false;
        HttpHeaderConditionConfig other = (HttpHeaderConditionConfig) obj;
        if (other.getHttpHeaderName() == null ^ this.getHttpHeaderName() == null)
            return false;
        if (other.getHttpHeaderName() != null && other.getHttpHeaderName().equals(this.getHttpHeaderName()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHttpHeaderName() == null) ? 0 : getHttpHeaderName().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public HttpHeaderConditionConfig clone() {
        try {
            return (HttpHeaderConditionConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
