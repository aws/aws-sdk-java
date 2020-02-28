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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the HTTP context to use for the test authorizer request.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HttpContext implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The header keys and values in an HTTP authorization request.
     * </p>
     */
    private java.util.Map<String, String> headers;
    /**
     * <p>
     * The query string keys and values in an HTTP authorization request.
     * </p>
     */
    private String queryString;

    /**
     * <p>
     * The header keys and values in an HTTP authorization request.
     * </p>
     * 
     * @return The header keys and values in an HTTP authorization request.
     */

    public java.util.Map<String, String> getHeaders() {
        return headers;
    }

    /**
     * <p>
     * The header keys and values in an HTTP authorization request.
     * </p>
     * 
     * @param headers
     *        The header keys and values in an HTTP authorization request.
     */

    public void setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
    }

    /**
     * <p>
     * The header keys and values in an HTTP authorization request.
     * </p>
     * 
     * @param headers
     *        The header keys and values in an HTTP authorization request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpContext withHeaders(java.util.Map<String, String> headers) {
        setHeaders(headers);
        return this;
    }

    /**
     * Add a single Headers entry
     *
     * @see HttpContext#withHeaders
     * @returns a reference to this object so that method calls can be chained together.
     */

    public HttpContext addHeadersEntry(String key, String value) {
        if (null == this.headers) {
            this.headers = new java.util.HashMap<String, String>();
        }
        if (this.headers.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.headers.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Headers.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpContext clearHeadersEntries() {
        this.headers = null;
        return this;
    }

    /**
     * <p>
     * The query string keys and values in an HTTP authorization request.
     * </p>
     * 
     * @param queryString
     *        The query string keys and values in an HTTP authorization request.
     */

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * <p>
     * The query string keys and values in an HTTP authorization request.
     * </p>
     * 
     * @return The query string keys and values in an HTTP authorization request.
     */

    public String getQueryString() {
        return this.queryString;
    }

    /**
     * <p>
     * The query string keys and values in an HTTP authorization request.
     * </p>
     * 
     * @param queryString
     *        The query string keys and values in an HTTP authorization request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpContext withQueryString(String queryString) {
        setQueryString(queryString);
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
        if (getHeaders() != null)
            sb.append("Headers: ").append(getHeaders()).append(",");
        if (getQueryString() != null)
            sb.append("QueryString: ").append(getQueryString());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HttpContext == false)
            return false;
        HttpContext other = (HttpContext) obj;
        if (other.getHeaders() == null ^ this.getHeaders() == null)
            return false;
        if (other.getHeaders() != null && other.getHeaders().equals(this.getHeaders()) == false)
            return false;
        if (other.getQueryString() == null ^ this.getQueryString() == null)
            return false;
        if (other.getQueryString() != null && other.getQueryString().equals(this.getQueryString()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHeaders() == null) ? 0 : getHeaders().hashCode());
        hashCode = prime * hashCode + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        return hashCode;
    }

    @Override
    public HttpContext clone() {
        try {
            return (HttpContext) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.HttpContextMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
