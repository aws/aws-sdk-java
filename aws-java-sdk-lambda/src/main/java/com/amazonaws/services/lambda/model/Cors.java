/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS">cross-origin resource sharing (CORS)</a>
 * settings for your Lambda function URL. Use CORS to grant access to your function URL from any origin. You can also
 * use CORS to control access for specific HTTP headers and methods in requests to your function URL.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/Cors" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Cors implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether to allow cookies or other credentials in requests to your function URL. The default is <code>false</code>
     * .
     * </p>
     */
    private Boolean allowCredentials;
    /**
     * <p>
     * The HTTP headers that origins can include in requests to your function URL. For example: <code>Date</code>,
     * <code>Keep-Alive</code>, <code>X-Custom-Header</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> allowHeaders;
    /**
     * <p>
     * The HTTP methods that are allowed when calling your function URL. For example: <code>GET</code>,
     * <code>POST</code>, <code>DELETE</code>, or the wildcard character (<code>*</code>).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> allowMethods;
    /**
     * <p>
     * The origins that can access your function URL. You can list any number of specific origins, separated by a comma.
     * For example: <code>https://www.example.com</code>, <code>http://localhost:60905</code>.
     * </p>
     * <p>
     * Alternatively, you can grant access to all origins using the wildcard character (<code>*</code>).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> allowOrigins;
    /**
     * <p>
     * The HTTP headers in your function response that you want to expose to origins that call your function URL. For
     * example: <code>Date</code>, <code>Keep-Alive</code>, <code>X-Custom-Header</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> exposeHeaders;
    /**
     * <p>
     * The maximum amount of time, in seconds, that web browsers can cache results of a preflight request. By default,
     * this is set to <code>0</code>, which means that the browser doesn't cache results.
     * </p>
     */
    private Integer maxAge;

    /**
     * <p>
     * Whether to allow cookies or other credentials in requests to your function URL. The default is <code>false</code>
     * .
     * </p>
     * 
     * @param allowCredentials
     *        Whether to allow cookies or other credentials in requests to your function URL. The default is
     *        <code>false</code>.
     */

    public void setAllowCredentials(Boolean allowCredentials) {
        this.allowCredentials = allowCredentials;
    }

    /**
     * <p>
     * Whether to allow cookies or other credentials in requests to your function URL. The default is <code>false</code>
     * .
     * </p>
     * 
     * @return Whether to allow cookies or other credentials in requests to your function URL. The default is
     *         <code>false</code>.
     */

    public Boolean getAllowCredentials() {
        return this.allowCredentials;
    }

    /**
     * <p>
     * Whether to allow cookies or other credentials in requests to your function URL. The default is <code>false</code>
     * .
     * </p>
     * 
     * @param allowCredentials
     *        Whether to allow cookies or other credentials in requests to your function URL. The default is
     *        <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cors withAllowCredentials(Boolean allowCredentials) {
        setAllowCredentials(allowCredentials);
        return this;
    }

    /**
     * <p>
     * Whether to allow cookies or other credentials in requests to your function URL. The default is <code>false</code>
     * .
     * </p>
     * 
     * @return Whether to allow cookies or other credentials in requests to your function URL. The default is
     *         <code>false</code>.
     */

    public Boolean isAllowCredentials() {
        return this.allowCredentials;
    }

    /**
     * <p>
     * The HTTP headers that origins can include in requests to your function URL. For example: <code>Date</code>,
     * <code>Keep-Alive</code>, <code>X-Custom-Header</code>.
     * </p>
     * 
     * @return The HTTP headers that origins can include in requests to your function URL. For example:
     *         <code>Date</code>, <code>Keep-Alive</code>, <code>X-Custom-Header</code>.
     */

    public java.util.List<String> getAllowHeaders() {
        if (allowHeaders == null) {
            allowHeaders = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return allowHeaders;
    }

    /**
     * <p>
     * The HTTP headers that origins can include in requests to your function URL. For example: <code>Date</code>,
     * <code>Keep-Alive</code>, <code>X-Custom-Header</code>.
     * </p>
     * 
     * @param allowHeaders
     *        The HTTP headers that origins can include in requests to your function URL. For example: <code>Date</code>
     *        , <code>Keep-Alive</code>, <code>X-Custom-Header</code>.
     */

    public void setAllowHeaders(java.util.Collection<String> allowHeaders) {
        if (allowHeaders == null) {
            this.allowHeaders = null;
            return;
        }

        this.allowHeaders = new com.amazonaws.internal.SdkInternalList<String>(allowHeaders);
    }

    /**
     * <p>
     * The HTTP headers that origins can include in requests to your function URL. For example: <code>Date</code>,
     * <code>Keep-Alive</code>, <code>X-Custom-Header</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowHeaders(java.util.Collection)} or {@link #withAllowHeaders(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param allowHeaders
     *        The HTTP headers that origins can include in requests to your function URL. For example: <code>Date</code>
     *        , <code>Keep-Alive</code>, <code>X-Custom-Header</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cors withAllowHeaders(String... allowHeaders) {
        if (this.allowHeaders == null) {
            setAllowHeaders(new com.amazonaws.internal.SdkInternalList<String>(allowHeaders.length));
        }
        for (String ele : allowHeaders) {
            this.allowHeaders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The HTTP headers that origins can include in requests to your function URL. For example: <code>Date</code>,
     * <code>Keep-Alive</code>, <code>X-Custom-Header</code>.
     * </p>
     * 
     * @param allowHeaders
     *        The HTTP headers that origins can include in requests to your function URL. For example: <code>Date</code>
     *        , <code>Keep-Alive</code>, <code>X-Custom-Header</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cors withAllowHeaders(java.util.Collection<String> allowHeaders) {
        setAllowHeaders(allowHeaders);
        return this;
    }

    /**
     * <p>
     * The HTTP methods that are allowed when calling your function URL. For example: <code>GET</code>,
     * <code>POST</code>, <code>DELETE</code>, or the wildcard character (<code>*</code>).
     * </p>
     * 
     * @return The HTTP methods that are allowed when calling your function URL. For example: <code>GET</code>,
     *         <code>POST</code>, <code>DELETE</code>, or the wildcard character (<code>*</code>).
     */

    public java.util.List<String> getAllowMethods() {
        if (allowMethods == null) {
            allowMethods = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return allowMethods;
    }

    /**
     * <p>
     * The HTTP methods that are allowed when calling your function URL. For example: <code>GET</code>,
     * <code>POST</code>, <code>DELETE</code>, or the wildcard character (<code>*</code>).
     * </p>
     * 
     * @param allowMethods
     *        The HTTP methods that are allowed when calling your function URL. For example: <code>GET</code>,
     *        <code>POST</code>, <code>DELETE</code>, or the wildcard character (<code>*</code>).
     */

    public void setAllowMethods(java.util.Collection<String> allowMethods) {
        if (allowMethods == null) {
            this.allowMethods = null;
            return;
        }

        this.allowMethods = new com.amazonaws.internal.SdkInternalList<String>(allowMethods);
    }

    /**
     * <p>
     * The HTTP methods that are allowed when calling your function URL. For example: <code>GET</code>,
     * <code>POST</code>, <code>DELETE</code>, or the wildcard character (<code>*</code>).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowMethods(java.util.Collection)} or {@link #withAllowMethods(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param allowMethods
     *        The HTTP methods that are allowed when calling your function URL. For example: <code>GET</code>,
     *        <code>POST</code>, <code>DELETE</code>, or the wildcard character (<code>*</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cors withAllowMethods(String... allowMethods) {
        if (this.allowMethods == null) {
            setAllowMethods(new com.amazonaws.internal.SdkInternalList<String>(allowMethods.length));
        }
        for (String ele : allowMethods) {
            this.allowMethods.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The HTTP methods that are allowed when calling your function URL. For example: <code>GET</code>,
     * <code>POST</code>, <code>DELETE</code>, or the wildcard character (<code>*</code>).
     * </p>
     * 
     * @param allowMethods
     *        The HTTP methods that are allowed when calling your function URL. For example: <code>GET</code>,
     *        <code>POST</code>, <code>DELETE</code>, or the wildcard character (<code>*</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cors withAllowMethods(java.util.Collection<String> allowMethods) {
        setAllowMethods(allowMethods);
        return this;
    }

    /**
     * <p>
     * The origins that can access your function URL. You can list any number of specific origins, separated by a comma.
     * For example: <code>https://www.example.com</code>, <code>http://localhost:60905</code>.
     * </p>
     * <p>
     * Alternatively, you can grant access to all origins using the wildcard character (<code>*</code>).
     * </p>
     * 
     * @return The origins that can access your function URL. You can list any number of specific origins, separated by
     *         a comma. For example: <code>https://www.example.com</code>, <code>http://localhost:60905</code>.</p>
     *         <p>
     *         Alternatively, you can grant access to all origins using the wildcard character (<code>*</code>).
     */

    public java.util.List<String> getAllowOrigins() {
        if (allowOrigins == null) {
            allowOrigins = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return allowOrigins;
    }

    /**
     * <p>
     * The origins that can access your function URL. You can list any number of specific origins, separated by a comma.
     * For example: <code>https://www.example.com</code>, <code>http://localhost:60905</code>.
     * </p>
     * <p>
     * Alternatively, you can grant access to all origins using the wildcard character (<code>*</code>).
     * </p>
     * 
     * @param allowOrigins
     *        The origins that can access your function URL. You can list any number of specific origins, separated by a
     *        comma. For example: <code>https://www.example.com</code>, <code>http://localhost:60905</code>.</p>
     *        <p>
     *        Alternatively, you can grant access to all origins using the wildcard character (<code>*</code>).
     */

    public void setAllowOrigins(java.util.Collection<String> allowOrigins) {
        if (allowOrigins == null) {
            this.allowOrigins = null;
            return;
        }

        this.allowOrigins = new com.amazonaws.internal.SdkInternalList<String>(allowOrigins);
    }

    /**
     * <p>
     * The origins that can access your function URL. You can list any number of specific origins, separated by a comma.
     * For example: <code>https://www.example.com</code>, <code>http://localhost:60905</code>.
     * </p>
     * <p>
     * Alternatively, you can grant access to all origins using the wildcard character (<code>*</code>).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowOrigins(java.util.Collection)} or {@link #withAllowOrigins(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param allowOrigins
     *        The origins that can access your function URL. You can list any number of specific origins, separated by a
     *        comma. For example: <code>https://www.example.com</code>, <code>http://localhost:60905</code>.</p>
     *        <p>
     *        Alternatively, you can grant access to all origins using the wildcard character (<code>*</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cors withAllowOrigins(String... allowOrigins) {
        if (this.allowOrigins == null) {
            setAllowOrigins(new com.amazonaws.internal.SdkInternalList<String>(allowOrigins.length));
        }
        for (String ele : allowOrigins) {
            this.allowOrigins.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The origins that can access your function URL. You can list any number of specific origins, separated by a comma.
     * For example: <code>https://www.example.com</code>, <code>http://localhost:60905</code>.
     * </p>
     * <p>
     * Alternatively, you can grant access to all origins using the wildcard character (<code>*</code>).
     * </p>
     * 
     * @param allowOrigins
     *        The origins that can access your function URL. You can list any number of specific origins, separated by a
     *        comma. For example: <code>https://www.example.com</code>, <code>http://localhost:60905</code>.</p>
     *        <p>
     *        Alternatively, you can grant access to all origins using the wildcard character (<code>*</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cors withAllowOrigins(java.util.Collection<String> allowOrigins) {
        setAllowOrigins(allowOrigins);
        return this;
    }

    /**
     * <p>
     * The HTTP headers in your function response that you want to expose to origins that call your function URL. For
     * example: <code>Date</code>, <code>Keep-Alive</code>, <code>X-Custom-Header</code>.
     * </p>
     * 
     * @return The HTTP headers in your function response that you want to expose to origins that call your function
     *         URL. For example: <code>Date</code>, <code>Keep-Alive</code>, <code>X-Custom-Header</code>.
     */

    public java.util.List<String> getExposeHeaders() {
        if (exposeHeaders == null) {
            exposeHeaders = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return exposeHeaders;
    }

    /**
     * <p>
     * The HTTP headers in your function response that you want to expose to origins that call your function URL. For
     * example: <code>Date</code>, <code>Keep-Alive</code>, <code>X-Custom-Header</code>.
     * </p>
     * 
     * @param exposeHeaders
     *        The HTTP headers in your function response that you want to expose to origins that call your function URL.
     *        For example: <code>Date</code>, <code>Keep-Alive</code>, <code>X-Custom-Header</code>.
     */

    public void setExposeHeaders(java.util.Collection<String> exposeHeaders) {
        if (exposeHeaders == null) {
            this.exposeHeaders = null;
            return;
        }

        this.exposeHeaders = new com.amazonaws.internal.SdkInternalList<String>(exposeHeaders);
    }

    /**
     * <p>
     * The HTTP headers in your function response that you want to expose to origins that call your function URL. For
     * example: <code>Date</code>, <code>Keep-Alive</code>, <code>X-Custom-Header</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExposeHeaders(java.util.Collection)} or {@link #withExposeHeaders(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param exposeHeaders
     *        The HTTP headers in your function response that you want to expose to origins that call your function URL.
     *        For example: <code>Date</code>, <code>Keep-Alive</code>, <code>X-Custom-Header</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cors withExposeHeaders(String... exposeHeaders) {
        if (this.exposeHeaders == null) {
            setExposeHeaders(new com.amazonaws.internal.SdkInternalList<String>(exposeHeaders.length));
        }
        for (String ele : exposeHeaders) {
            this.exposeHeaders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The HTTP headers in your function response that you want to expose to origins that call your function URL. For
     * example: <code>Date</code>, <code>Keep-Alive</code>, <code>X-Custom-Header</code>.
     * </p>
     * 
     * @param exposeHeaders
     *        The HTTP headers in your function response that you want to expose to origins that call your function URL.
     *        For example: <code>Date</code>, <code>Keep-Alive</code>, <code>X-Custom-Header</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cors withExposeHeaders(java.util.Collection<String> exposeHeaders) {
        setExposeHeaders(exposeHeaders);
        return this;
    }

    /**
     * <p>
     * The maximum amount of time, in seconds, that web browsers can cache results of a preflight request. By default,
     * this is set to <code>0</code>, which means that the browser doesn't cache results.
     * </p>
     * 
     * @param maxAge
     *        The maximum amount of time, in seconds, that web browsers can cache results of a preflight request. By
     *        default, this is set to <code>0</code>, which means that the browser doesn't cache results.
     */

    public void setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
    }

    /**
     * <p>
     * The maximum amount of time, in seconds, that web browsers can cache results of a preflight request. By default,
     * this is set to <code>0</code>, which means that the browser doesn't cache results.
     * </p>
     * 
     * @return The maximum amount of time, in seconds, that web browsers can cache results of a preflight request. By
     *         default, this is set to <code>0</code>, which means that the browser doesn't cache results.
     */

    public Integer getMaxAge() {
        return this.maxAge;
    }

    /**
     * <p>
     * The maximum amount of time, in seconds, that web browsers can cache results of a preflight request. By default,
     * this is set to <code>0</code>, which means that the browser doesn't cache results.
     * </p>
     * 
     * @param maxAge
     *        The maximum amount of time, in seconds, that web browsers can cache results of a preflight request. By
     *        default, this is set to <code>0</code>, which means that the browser doesn't cache results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cors withMaxAge(Integer maxAge) {
        setMaxAge(maxAge);
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
        if (getAllowCredentials() != null)
            sb.append("AllowCredentials: ").append(getAllowCredentials()).append(",");
        if (getAllowHeaders() != null)
            sb.append("AllowHeaders: ").append(getAllowHeaders()).append(",");
        if (getAllowMethods() != null)
            sb.append("AllowMethods: ").append(getAllowMethods()).append(",");
        if (getAllowOrigins() != null)
            sb.append("AllowOrigins: ").append(getAllowOrigins()).append(",");
        if (getExposeHeaders() != null)
            sb.append("ExposeHeaders: ").append(getExposeHeaders()).append(",");
        if (getMaxAge() != null)
            sb.append("MaxAge: ").append(getMaxAge());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Cors == false)
            return false;
        Cors other = (Cors) obj;
        if (other.getAllowCredentials() == null ^ this.getAllowCredentials() == null)
            return false;
        if (other.getAllowCredentials() != null && other.getAllowCredentials().equals(this.getAllowCredentials()) == false)
            return false;
        if (other.getAllowHeaders() == null ^ this.getAllowHeaders() == null)
            return false;
        if (other.getAllowHeaders() != null && other.getAllowHeaders().equals(this.getAllowHeaders()) == false)
            return false;
        if (other.getAllowMethods() == null ^ this.getAllowMethods() == null)
            return false;
        if (other.getAllowMethods() != null && other.getAllowMethods().equals(this.getAllowMethods()) == false)
            return false;
        if (other.getAllowOrigins() == null ^ this.getAllowOrigins() == null)
            return false;
        if (other.getAllowOrigins() != null && other.getAllowOrigins().equals(this.getAllowOrigins()) == false)
            return false;
        if (other.getExposeHeaders() == null ^ this.getExposeHeaders() == null)
            return false;
        if (other.getExposeHeaders() != null && other.getExposeHeaders().equals(this.getExposeHeaders()) == false)
            return false;
        if (other.getMaxAge() == null ^ this.getMaxAge() == null)
            return false;
        if (other.getMaxAge() != null && other.getMaxAge().equals(this.getMaxAge()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowCredentials() == null) ? 0 : getAllowCredentials().hashCode());
        hashCode = prime * hashCode + ((getAllowHeaders() == null) ? 0 : getAllowHeaders().hashCode());
        hashCode = prime * hashCode + ((getAllowMethods() == null) ? 0 : getAllowMethods().hashCode());
        hashCode = prime * hashCode + ((getAllowOrigins() == null) ? 0 : getAllowOrigins().hashCode());
        hashCode = prime * hashCode + ((getExposeHeaders() == null) ? 0 : getExposeHeaders().hashCode());
        hashCode = prime * hashCode + ((getMaxAge() == null) ? 0 : getMaxAge().hashCode());
        return hashCode;
    }

    @Override
    public Cors clone() {
        try {
            return (Cors) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lambda.model.transform.CorsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
