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
package com.amazonaws.services.mediastore.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A rule for a CORS policy. You can add up to 100 rules to a CORS policy. If more than one rule applies, the service
 * uses the first applicable rule listed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/CorsRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CorsRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * One or more response headers that you want users to be able to access from their applications (for example, from
     * a JavaScript <code>XMLHttpRequest</code> object).
     * </p>
     * <p>
     * Each CORS rule must have at least one <code>AllowedOrigins</code> element. The string value can include only one
     * wildcard character (*), for example, http://*.example.com. Additionally, you can specify only one wildcard
     * character to allow cross-origin access for all origins.
     * </p>
     */
    private java.util.List<String> allowedOrigins;
    /**
     * <p>
     * Identifies an HTTP method that the origin that is specified in the rule is allowed to execute.
     * </p>
     * <p>
     * Each CORS rule must contain at least one <code>AllowedMethods</code> and one <code>AllowedOrigins</code> element.
     * </p>
     */
    private java.util.List<String> allowedMethods;
    /**
     * <p>
     * Specifies which headers are allowed in a preflight <code>OPTIONS</code> request through the
     * <code>Access-Control-Request-Headers</code> header. Each header name that is specified in
     * <code>Access-Control-Request-Headers</code> must have a corresponding entry in the rule. Only the headers that
     * were requested are sent back.
     * </p>
     * <p>
     * This element can contain only one wildcard character (*).
     * </p>
     */
    private java.util.List<String> allowedHeaders;
    /**
     * <p>
     * The time in seconds that your browser caches the preflight response for the specified resource.
     * </p>
     * <p>
     * A CORS rule can have only one <code>MaxAgeSeconds</code> element.
     * </p>
     */
    private Integer maxAgeSeconds;
    /**
     * <p>
     * One or more headers in the response that you want users to be able to access from their applications (for
     * example, from a JavaScript <code>XMLHttpRequest</code> object).
     * </p>
     * <p>
     * This element is optional for each rule.
     * </p>
     */
    private java.util.List<String> exposeHeaders;

    /**
     * <p>
     * One or more response headers that you want users to be able to access from their applications (for example, from
     * a JavaScript <code>XMLHttpRequest</code> object).
     * </p>
     * <p>
     * Each CORS rule must have at least one <code>AllowedOrigins</code> element. The string value can include only one
     * wildcard character (*), for example, http://*.example.com. Additionally, you can specify only one wildcard
     * character to allow cross-origin access for all origins.
     * </p>
     * 
     * @return One or more response headers that you want users to be able to access from their applications (for
     *         example, from a JavaScript <code>XMLHttpRequest</code> object).</p>
     *         <p>
     *         Each CORS rule must have at least one <code>AllowedOrigins</code> element. The string value can include
     *         only one wildcard character (*), for example, http://*.example.com. Additionally, you can specify only
     *         one wildcard character to allow cross-origin access for all origins.
     */

    public java.util.List<String> getAllowedOrigins() {
        return allowedOrigins;
    }

    /**
     * <p>
     * One or more response headers that you want users to be able to access from their applications (for example, from
     * a JavaScript <code>XMLHttpRequest</code> object).
     * </p>
     * <p>
     * Each CORS rule must have at least one <code>AllowedOrigins</code> element. The string value can include only one
     * wildcard character (*), for example, http://*.example.com. Additionally, you can specify only one wildcard
     * character to allow cross-origin access for all origins.
     * </p>
     * 
     * @param allowedOrigins
     *        One or more response headers that you want users to be able to access from their applications (for
     *        example, from a JavaScript <code>XMLHttpRequest</code> object).</p>
     *        <p>
     *        Each CORS rule must have at least one <code>AllowedOrigins</code> element. The string value can include
     *        only one wildcard character (*), for example, http://*.example.com. Additionally, you can specify only one
     *        wildcard character to allow cross-origin access for all origins.
     */

    public void setAllowedOrigins(java.util.Collection<String> allowedOrigins) {
        if (allowedOrigins == null) {
            this.allowedOrigins = null;
            return;
        }

        this.allowedOrigins = new java.util.ArrayList<String>(allowedOrigins);
    }

    /**
     * <p>
     * One or more response headers that you want users to be able to access from their applications (for example, from
     * a JavaScript <code>XMLHttpRequest</code> object).
     * </p>
     * <p>
     * Each CORS rule must have at least one <code>AllowedOrigins</code> element. The string value can include only one
     * wildcard character (*), for example, http://*.example.com. Additionally, you can specify only one wildcard
     * character to allow cross-origin access for all origins.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedOrigins(java.util.Collection)} or {@link #withAllowedOrigins(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param allowedOrigins
     *        One or more response headers that you want users to be able to access from their applications (for
     *        example, from a JavaScript <code>XMLHttpRequest</code> object).</p>
     *        <p>
     *        Each CORS rule must have at least one <code>AllowedOrigins</code> element. The string value can include
     *        only one wildcard character (*), for example, http://*.example.com. Additionally, you can specify only one
     *        wildcard character to allow cross-origin access for all origins.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CorsRule withAllowedOrigins(String... allowedOrigins) {
        if (this.allowedOrigins == null) {
            setAllowedOrigins(new java.util.ArrayList<String>(allowedOrigins.length));
        }
        for (String ele : allowedOrigins) {
            this.allowedOrigins.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more response headers that you want users to be able to access from their applications (for example, from
     * a JavaScript <code>XMLHttpRequest</code> object).
     * </p>
     * <p>
     * Each CORS rule must have at least one <code>AllowedOrigins</code> element. The string value can include only one
     * wildcard character (*), for example, http://*.example.com. Additionally, you can specify only one wildcard
     * character to allow cross-origin access for all origins.
     * </p>
     * 
     * @param allowedOrigins
     *        One or more response headers that you want users to be able to access from their applications (for
     *        example, from a JavaScript <code>XMLHttpRequest</code> object).</p>
     *        <p>
     *        Each CORS rule must have at least one <code>AllowedOrigins</code> element. The string value can include
     *        only one wildcard character (*), for example, http://*.example.com. Additionally, you can specify only one
     *        wildcard character to allow cross-origin access for all origins.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CorsRule withAllowedOrigins(java.util.Collection<String> allowedOrigins) {
        setAllowedOrigins(allowedOrigins);
        return this;
    }

    /**
     * <p>
     * Identifies an HTTP method that the origin that is specified in the rule is allowed to execute.
     * </p>
     * <p>
     * Each CORS rule must contain at least one <code>AllowedMethods</code> and one <code>AllowedOrigins</code> element.
     * </p>
     * 
     * @return Identifies an HTTP method that the origin that is specified in the rule is allowed to execute.</p>
     *         <p>
     *         Each CORS rule must contain at least one <code>AllowedMethods</code> and one <code>AllowedOrigins</code>
     *         element.
     * @see MethodName
     */

    public java.util.List<String> getAllowedMethods() {
        return allowedMethods;
    }

    /**
     * <p>
     * Identifies an HTTP method that the origin that is specified in the rule is allowed to execute.
     * </p>
     * <p>
     * Each CORS rule must contain at least one <code>AllowedMethods</code> and one <code>AllowedOrigins</code> element.
     * </p>
     * 
     * @param allowedMethods
     *        Identifies an HTTP method that the origin that is specified in the rule is allowed to execute.</p>
     *        <p>
     *        Each CORS rule must contain at least one <code>AllowedMethods</code> and one <code>AllowedOrigins</code>
     *        element.
     * @see MethodName
     */

    public void setAllowedMethods(java.util.Collection<String> allowedMethods) {
        if (allowedMethods == null) {
            this.allowedMethods = null;
            return;
        }

        this.allowedMethods = new java.util.ArrayList<String>(allowedMethods);
    }

    /**
     * <p>
     * Identifies an HTTP method that the origin that is specified in the rule is allowed to execute.
     * </p>
     * <p>
     * Each CORS rule must contain at least one <code>AllowedMethods</code> and one <code>AllowedOrigins</code> element.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedMethods(java.util.Collection)} or {@link #withAllowedMethods(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param allowedMethods
     *        Identifies an HTTP method that the origin that is specified in the rule is allowed to execute.</p>
     *        <p>
     *        Each CORS rule must contain at least one <code>AllowedMethods</code> and one <code>AllowedOrigins</code>
     *        element.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MethodName
     */

    public CorsRule withAllowedMethods(String... allowedMethods) {
        if (this.allowedMethods == null) {
            setAllowedMethods(new java.util.ArrayList<String>(allowedMethods.length));
        }
        for (String ele : allowedMethods) {
            this.allowedMethods.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Identifies an HTTP method that the origin that is specified in the rule is allowed to execute.
     * </p>
     * <p>
     * Each CORS rule must contain at least one <code>AllowedMethods</code> and one <code>AllowedOrigins</code> element.
     * </p>
     * 
     * @param allowedMethods
     *        Identifies an HTTP method that the origin that is specified in the rule is allowed to execute.</p>
     *        <p>
     *        Each CORS rule must contain at least one <code>AllowedMethods</code> and one <code>AllowedOrigins</code>
     *        element.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MethodName
     */

    public CorsRule withAllowedMethods(java.util.Collection<String> allowedMethods) {
        setAllowedMethods(allowedMethods);
        return this;
    }

    /**
     * <p>
     * Identifies an HTTP method that the origin that is specified in the rule is allowed to execute.
     * </p>
     * <p>
     * Each CORS rule must contain at least one <code>AllowedMethods</code> and one <code>AllowedOrigins</code> element.
     * </p>
     * 
     * @param allowedMethods
     *        Identifies an HTTP method that the origin that is specified in the rule is allowed to execute.</p>
     *        <p>
     *        Each CORS rule must contain at least one <code>AllowedMethods</code> and one <code>AllowedOrigins</code>
     *        element.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MethodName
     */

    public CorsRule withAllowedMethods(MethodName... allowedMethods) {
        java.util.ArrayList<String> allowedMethodsCopy = new java.util.ArrayList<String>(allowedMethods.length);
        for (MethodName value : allowedMethods) {
            allowedMethodsCopy.add(value.toString());
        }
        if (getAllowedMethods() == null) {
            setAllowedMethods(allowedMethodsCopy);
        } else {
            getAllowedMethods().addAll(allowedMethodsCopy);
        }
        return this;
    }

    /**
     * <p>
     * Specifies which headers are allowed in a preflight <code>OPTIONS</code> request through the
     * <code>Access-Control-Request-Headers</code> header. Each header name that is specified in
     * <code>Access-Control-Request-Headers</code> must have a corresponding entry in the rule. Only the headers that
     * were requested are sent back.
     * </p>
     * <p>
     * This element can contain only one wildcard character (*).
     * </p>
     * 
     * @return Specifies which headers are allowed in a preflight <code>OPTIONS</code> request through the
     *         <code>Access-Control-Request-Headers</code> header. Each header name that is specified in
     *         <code>Access-Control-Request-Headers</code> must have a corresponding entry in the rule. Only the headers
     *         that were requested are sent back. </p>
     *         <p>
     *         This element can contain only one wildcard character (*).
     */

    public java.util.List<String> getAllowedHeaders() {
        return allowedHeaders;
    }

    /**
     * <p>
     * Specifies which headers are allowed in a preflight <code>OPTIONS</code> request through the
     * <code>Access-Control-Request-Headers</code> header. Each header name that is specified in
     * <code>Access-Control-Request-Headers</code> must have a corresponding entry in the rule. Only the headers that
     * were requested are sent back.
     * </p>
     * <p>
     * This element can contain only one wildcard character (*).
     * </p>
     * 
     * @param allowedHeaders
     *        Specifies which headers are allowed in a preflight <code>OPTIONS</code> request through the
     *        <code>Access-Control-Request-Headers</code> header. Each header name that is specified in
     *        <code>Access-Control-Request-Headers</code> must have a corresponding entry in the rule. Only the headers
     *        that were requested are sent back. </p>
     *        <p>
     *        This element can contain only one wildcard character (*).
     */

    public void setAllowedHeaders(java.util.Collection<String> allowedHeaders) {
        if (allowedHeaders == null) {
            this.allowedHeaders = null;
            return;
        }

        this.allowedHeaders = new java.util.ArrayList<String>(allowedHeaders);
    }

    /**
     * <p>
     * Specifies which headers are allowed in a preflight <code>OPTIONS</code> request through the
     * <code>Access-Control-Request-Headers</code> header. Each header name that is specified in
     * <code>Access-Control-Request-Headers</code> must have a corresponding entry in the rule. Only the headers that
     * were requested are sent back.
     * </p>
     * <p>
     * This element can contain only one wildcard character (*).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedHeaders(java.util.Collection)} or {@link #withAllowedHeaders(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param allowedHeaders
     *        Specifies which headers are allowed in a preflight <code>OPTIONS</code> request through the
     *        <code>Access-Control-Request-Headers</code> header. Each header name that is specified in
     *        <code>Access-Control-Request-Headers</code> must have a corresponding entry in the rule. Only the headers
     *        that were requested are sent back. </p>
     *        <p>
     *        This element can contain only one wildcard character (*).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CorsRule withAllowedHeaders(String... allowedHeaders) {
        if (this.allowedHeaders == null) {
            setAllowedHeaders(new java.util.ArrayList<String>(allowedHeaders.length));
        }
        for (String ele : allowedHeaders) {
            this.allowedHeaders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies which headers are allowed in a preflight <code>OPTIONS</code> request through the
     * <code>Access-Control-Request-Headers</code> header. Each header name that is specified in
     * <code>Access-Control-Request-Headers</code> must have a corresponding entry in the rule. Only the headers that
     * were requested are sent back.
     * </p>
     * <p>
     * This element can contain only one wildcard character (*).
     * </p>
     * 
     * @param allowedHeaders
     *        Specifies which headers are allowed in a preflight <code>OPTIONS</code> request through the
     *        <code>Access-Control-Request-Headers</code> header. Each header name that is specified in
     *        <code>Access-Control-Request-Headers</code> must have a corresponding entry in the rule. Only the headers
     *        that were requested are sent back. </p>
     *        <p>
     *        This element can contain only one wildcard character (*).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CorsRule withAllowedHeaders(java.util.Collection<String> allowedHeaders) {
        setAllowedHeaders(allowedHeaders);
        return this;
    }

    /**
     * <p>
     * The time in seconds that your browser caches the preflight response for the specified resource.
     * </p>
     * <p>
     * A CORS rule can have only one <code>MaxAgeSeconds</code> element.
     * </p>
     * 
     * @param maxAgeSeconds
     *        The time in seconds that your browser caches the preflight response for the specified resource.</p>
     *        <p>
     *        A CORS rule can have only one <code>MaxAgeSeconds</code> element.
     */

    public void setMaxAgeSeconds(Integer maxAgeSeconds) {
        this.maxAgeSeconds = maxAgeSeconds;
    }

    /**
     * <p>
     * The time in seconds that your browser caches the preflight response for the specified resource.
     * </p>
     * <p>
     * A CORS rule can have only one <code>MaxAgeSeconds</code> element.
     * </p>
     * 
     * @return The time in seconds that your browser caches the preflight response for the specified resource.</p>
     *         <p>
     *         A CORS rule can have only one <code>MaxAgeSeconds</code> element.
     */

    public Integer getMaxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    /**
     * <p>
     * The time in seconds that your browser caches the preflight response for the specified resource.
     * </p>
     * <p>
     * A CORS rule can have only one <code>MaxAgeSeconds</code> element.
     * </p>
     * 
     * @param maxAgeSeconds
     *        The time in seconds that your browser caches the preflight response for the specified resource.</p>
     *        <p>
     *        A CORS rule can have only one <code>MaxAgeSeconds</code> element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CorsRule withMaxAgeSeconds(Integer maxAgeSeconds) {
        setMaxAgeSeconds(maxAgeSeconds);
        return this;
    }

    /**
     * <p>
     * One or more headers in the response that you want users to be able to access from their applications (for
     * example, from a JavaScript <code>XMLHttpRequest</code> object).
     * </p>
     * <p>
     * This element is optional for each rule.
     * </p>
     * 
     * @return One or more headers in the response that you want users to be able to access from their applications (for
     *         example, from a JavaScript <code>XMLHttpRequest</code> object).</p>
     *         <p>
     *         This element is optional for each rule.
     */

    public java.util.List<String> getExposeHeaders() {
        return exposeHeaders;
    }

    /**
     * <p>
     * One or more headers in the response that you want users to be able to access from their applications (for
     * example, from a JavaScript <code>XMLHttpRequest</code> object).
     * </p>
     * <p>
     * This element is optional for each rule.
     * </p>
     * 
     * @param exposeHeaders
     *        One or more headers in the response that you want users to be able to access from their applications (for
     *        example, from a JavaScript <code>XMLHttpRequest</code> object).</p>
     *        <p>
     *        This element is optional for each rule.
     */

    public void setExposeHeaders(java.util.Collection<String> exposeHeaders) {
        if (exposeHeaders == null) {
            this.exposeHeaders = null;
            return;
        }

        this.exposeHeaders = new java.util.ArrayList<String>(exposeHeaders);
    }

    /**
     * <p>
     * One or more headers in the response that you want users to be able to access from their applications (for
     * example, from a JavaScript <code>XMLHttpRequest</code> object).
     * </p>
     * <p>
     * This element is optional for each rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExposeHeaders(java.util.Collection)} or {@link #withExposeHeaders(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param exposeHeaders
     *        One or more headers in the response that you want users to be able to access from their applications (for
     *        example, from a JavaScript <code>XMLHttpRequest</code> object).</p>
     *        <p>
     *        This element is optional for each rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CorsRule withExposeHeaders(String... exposeHeaders) {
        if (this.exposeHeaders == null) {
            setExposeHeaders(new java.util.ArrayList<String>(exposeHeaders.length));
        }
        for (String ele : exposeHeaders) {
            this.exposeHeaders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more headers in the response that you want users to be able to access from their applications (for
     * example, from a JavaScript <code>XMLHttpRequest</code> object).
     * </p>
     * <p>
     * This element is optional for each rule.
     * </p>
     * 
     * @param exposeHeaders
     *        One or more headers in the response that you want users to be able to access from their applications (for
     *        example, from a JavaScript <code>XMLHttpRequest</code> object).</p>
     *        <p>
     *        This element is optional for each rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CorsRule withExposeHeaders(java.util.Collection<String> exposeHeaders) {
        setExposeHeaders(exposeHeaders);
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
        if (getAllowedOrigins() != null)
            sb.append("AllowedOrigins: ").append(getAllowedOrigins()).append(",");
        if (getAllowedMethods() != null)
            sb.append("AllowedMethods: ").append(getAllowedMethods()).append(",");
        if (getAllowedHeaders() != null)
            sb.append("AllowedHeaders: ").append(getAllowedHeaders()).append(",");
        if (getMaxAgeSeconds() != null)
            sb.append("MaxAgeSeconds: ").append(getMaxAgeSeconds()).append(",");
        if (getExposeHeaders() != null)
            sb.append("ExposeHeaders: ").append(getExposeHeaders());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CorsRule == false)
            return false;
        CorsRule other = (CorsRule) obj;
        if (other.getAllowedOrigins() == null ^ this.getAllowedOrigins() == null)
            return false;
        if (other.getAllowedOrigins() != null && other.getAllowedOrigins().equals(this.getAllowedOrigins()) == false)
            return false;
        if (other.getAllowedMethods() == null ^ this.getAllowedMethods() == null)
            return false;
        if (other.getAllowedMethods() != null && other.getAllowedMethods().equals(this.getAllowedMethods()) == false)
            return false;
        if (other.getAllowedHeaders() == null ^ this.getAllowedHeaders() == null)
            return false;
        if (other.getAllowedHeaders() != null && other.getAllowedHeaders().equals(this.getAllowedHeaders()) == false)
            return false;
        if (other.getMaxAgeSeconds() == null ^ this.getMaxAgeSeconds() == null)
            return false;
        if (other.getMaxAgeSeconds() != null && other.getMaxAgeSeconds().equals(this.getMaxAgeSeconds()) == false)
            return false;
        if (other.getExposeHeaders() == null ^ this.getExposeHeaders() == null)
            return false;
        if (other.getExposeHeaders() != null && other.getExposeHeaders().equals(this.getExposeHeaders()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowedOrigins() == null) ? 0 : getAllowedOrigins().hashCode());
        hashCode = prime * hashCode + ((getAllowedMethods() == null) ? 0 : getAllowedMethods().hashCode());
        hashCode = prime * hashCode + ((getAllowedHeaders() == null) ? 0 : getAllowedHeaders().hashCode());
        hashCode = prime * hashCode + ((getMaxAgeSeconds() == null) ? 0 : getMaxAgeSeconds().hashCode());
        hashCode = prime * hashCode + ((getExposeHeaders() == null) ? 0 : getExposeHeaders().hashCode());
        return hashCode;
    }

    @Override
    public CorsRule clone() {
        try {
            return (CorsRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediastore.model.transform.CorsRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
