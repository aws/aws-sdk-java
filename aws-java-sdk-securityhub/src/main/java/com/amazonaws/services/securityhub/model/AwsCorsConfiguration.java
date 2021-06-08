/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the cross-origin resource sharing (CORS) configuration for the API. CORS is only supported for HTTP APIs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsCorsConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsCorsConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The allowed origins for CORS requests.
     * </p>
     */
    private java.util.List<String> allowOrigins;
    /**
     * <p>
     * Indicates whether the CORS request includes credentials.
     * </p>
     */
    private Boolean allowCredentials;
    /**
     * <p>
     * The exposed headers for CORS requests.
     * </p>
     */
    private java.util.List<String> exposeHeaders;
    /**
     * <p>
     * The number of seconds for which the browser caches preflight request results.
     * </p>
     */
    private Integer maxAge;
    /**
     * <p>
     * The allowed methods for CORS requests.
     * </p>
     */
    private java.util.List<String> allowMethods;
    /**
     * <p>
     * The allowed headers for CORS requests.
     * </p>
     */
    private java.util.List<String> allowHeaders;

    /**
     * <p>
     * The allowed origins for CORS requests.
     * </p>
     * 
     * @return The allowed origins for CORS requests.
     */

    public java.util.List<String> getAllowOrigins() {
        return allowOrigins;
    }

    /**
     * <p>
     * The allowed origins for CORS requests.
     * </p>
     * 
     * @param allowOrigins
     *        The allowed origins for CORS requests.
     */

    public void setAllowOrigins(java.util.Collection<String> allowOrigins) {
        if (allowOrigins == null) {
            this.allowOrigins = null;
            return;
        }

        this.allowOrigins = new java.util.ArrayList<String>(allowOrigins);
    }

    /**
     * <p>
     * The allowed origins for CORS requests.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowOrigins(java.util.Collection)} or {@link #withAllowOrigins(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param allowOrigins
     *        The allowed origins for CORS requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCorsConfiguration withAllowOrigins(String... allowOrigins) {
        if (this.allowOrigins == null) {
            setAllowOrigins(new java.util.ArrayList<String>(allowOrigins.length));
        }
        for (String ele : allowOrigins) {
            this.allowOrigins.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The allowed origins for CORS requests.
     * </p>
     * 
     * @param allowOrigins
     *        The allowed origins for CORS requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCorsConfiguration withAllowOrigins(java.util.Collection<String> allowOrigins) {
        setAllowOrigins(allowOrigins);
        return this;
    }

    /**
     * <p>
     * Indicates whether the CORS request includes credentials.
     * </p>
     * 
     * @param allowCredentials
     *        Indicates whether the CORS request includes credentials.
     */

    public void setAllowCredentials(Boolean allowCredentials) {
        this.allowCredentials = allowCredentials;
    }

    /**
     * <p>
     * Indicates whether the CORS request includes credentials.
     * </p>
     * 
     * @return Indicates whether the CORS request includes credentials.
     */

    public Boolean getAllowCredentials() {
        return this.allowCredentials;
    }

    /**
     * <p>
     * Indicates whether the CORS request includes credentials.
     * </p>
     * 
     * @param allowCredentials
     *        Indicates whether the CORS request includes credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCorsConfiguration withAllowCredentials(Boolean allowCredentials) {
        setAllowCredentials(allowCredentials);
        return this;
    }

    /**
     * <p>
     * Indicates whether the CORS request includes credentials.
     * </p>
     * 
     * @return Indicates whether the CORS request includes credentials.
     */

    public Boolean isAllowCredentials() {
        return this.allowCredentials;
    }

    /**
     * <p>
     * The exposed headers for CORS requests.
     * </p>
     * 
     * @return The exposed headers for CORS requests.
     */

    public java.util.List<String> getExposeHeaders() {
        return exposeHeaders;
    }

    /**
     * <p>
     * The exposed headers for CORS requests.
     * </p>
     * 
     * @param exposeHeaders
     *        The exposed headers for CORS requests.
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
     * The exposed headers for CORS requests.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExposeHeaders(java.util.Collection)} or {@link #withExposeHeaders(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param exposeHeaders
     *        The exposed headers for CORS requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCorsConfiguration withExposeHeaders(String... exposeHeaders) {
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
     * The exposed headers for CORS requests.
     * </p>
     * 
     * @param exposeHeaders
     *        The exposed headers for CORS requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCorsConfiguration withExposeHeaders(java.util.Collection<String> exposeHeaders) {
        setExposeHeaders(exposeHeaders);
        return this;
    }

    /**
     * <p>
     * The number of seconds for which the browser caches preflight request results.
     * </p>
     * 
     * @param maxAge
     *        The number of seconds for which the browser caches preflight request results.
     */

    public void setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
    }

    /**
     * <p>
     * The number of seconds for which the browser caches preflight request results.
     * </p>
     * 
     * @return The number of seconds for which the browser caches preflight request results.
     */

    public Integer getMaxAge() {
        return this.maxAge;
    }

    /**
     * <p>
     * The number of seconds for which the browser caches preflight request results.
     * </p>
     * 
     * @param maxAge
     *        The number of seconds for which the browser caches preflight request results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCorsConfiguration withMaxAge(Integer maxAge) {
        setMaxAge(maxAge);
        return this;
    }

    /**
     * <p>
     * The allowed methods for CORS requests.
     * </p>
     * 
     * @return The allowed methods for CORS requests.
     */

    public java.util.List<String> getAllowMethods() {
        return allowMethods;
    }

    /**
     * <p>
     * The allowed methods for CORS requests.
     * </p>
     * 
     * @param allowMethods
     *        The allowed methods for CORS requests.
     */

    public void setAllowMethods(java.util.Collection<String> allowMethods) {
        if (allowMethods == null) {
            this.allowMethods = null;
            return;
        }

        this.allowMethods = new java.util.ArrayList<String>(allowMethods);
    }

    /**
     * <p>
     * The allowed methods for CORS requests.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowMethods(java.util.Collection)} or {@link #withAllowMethods(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param allowMethods
     *        The allowed methods for CORS requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCorsConfiguration withAllowMethods(String... allowMethods) {
        if (this.allowMethods == null) {
            setAllowMethods(new java.util.ArrayList<String>(allowMethods.length));
        }
        for (String ele : allowMethods) {
            this.allowMethods.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The allowed methods for CORS requests.
     * </p>
     * 
     * @param allowMethods
     *        The allowed methods for CORS requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCorsConfiguration withAllowMethods(java.util.Collection<String> allowMethods) {
        setAllowMethods(allowMethods);
        return this;
    }

    /**
     * <p>
     * The allowed headers for CORS requests.
     * </p>
     * 
     * @return The allowed headers for CORS requests.
     */

    public java.util.List<String> getAllowHeaders() {
        return allowHeaders;
    }

    /**
     * <p>
     * The allowed headers for CORS requests.
     * </p>
     * 
     * @param allowHeaders
     *        The allowed headers for CORS requests.
     */

    public void setAllowHeaders(java.util.Collection<String> allowHeaders) {
        if (allowHeaders == null) {
            this.allowHeaders = null;
            return;
        }

        this.allowHeaders = new java.util.ArrayList<String>(allowHeaders);
    }

    /**
     * <p>
     * The allowed headers for CORS requests.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowHeaders(java.util.Collection)} or {@link #withAllowHeaders(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param allowHeaders
     *        The allowed headers for CORS requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCorsConfiguration withAllowHeaders(String... allowHeaders) {
        if (this.allowHeaders == null) {
            setAllowHeaders(new java.util.ArrayList<String>(allowHeaders.length));
        }
        for (String ele : allowHeaders) {
            this.allowHeaders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The allowed headers for CORS requests.
     * </p>
     * 
     * @param allowHeaders
     *        The allowed headers for CORS requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCorsConfiguration withAllowHeaders(java.util.Collection<String> allowHeaders) {
        setAllowHeaders(allowHeaders);
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
        if (getAllowOrigins() != null)
            sb.append("AllowOrigins: ").append(getAllowOrigins()).append(",");
        if (getAllowCredentials() != null)
            sb.append("AllowCredentials: ").append(getAllowCredentials()).append(",");
        if (getExposeHeaders() != null)
            sb.append("ExposeHeaders: ").append(getExposeHeaders()).append(",");
        if (getMaxAge() != null)
            sb.append("MaxAge: ").append(getMaxAge()).append(",");
        if (getAllowMethods() != null)
            sb.append("AllowMethods: ").append(getAllowMethods()).append(",");
        if (getAllowHeaders() != null)
            sb.append("AllowHeaders: ").append(getAllowHeaders());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsCorsConfiguration == false)
            return false;
        AwsCorsConfiguration other = (AwsCorsConfiguration) obj;
        if (other.getAllowOrigins() == null ^ this.getAllowOrigins() == null)
            return false;
        if (other.getAllowOrigins() != null && other.getAllowOrigins().equals(this.getAllowOrigins()) == false)
            return false;
        if (other.getAllowCredentials() == null ^ this.getAllowCredentials() == null)
            return false;
        if (other.getAllowCredentials() != null && other.getAllowCredentials().equals(this.getAllowCredentials()) == false)
            return false;
        if (other.getExposeHeaders() == null ^ this.getExposeHeaders() == null)
            return false;
        if (other.getExposeHeaders() != null && other.getExposeHeaders().equals(this.getExposeHeaders()) == false)
            return false;
        if (other.getMaxAge() == null ^ this.getMaxAge() == null)
            return false;
        if (other.getMaxAge() != null && other.getMaxAge().equals(this.getMaxAge()) == false)
            return false;
        if (other.getAllowMethods() == null ^ this.getAllowMethods() == null)
            return false;
        if (other.getAllowMethods() != null && other.getAllowMethods().equals(this.getAllowMethods()) == false)
            return false;
        if (other.getAllowHeaders() == null ^ this.getAllowHeaders() == null)
            return false;
        if (other.getAllowHeaders() != null && other.getAllowHeaders().equals(this.getAllowHeaders()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowOrigins() == null) ? 0 : getAllowOrigins().hashCode());
        hashCode = prime * hashCode + ((getAllowCredentials() == null) ? 0 : getAllowCredentials().hashCode());
        hashCode = prime * hashCode + ((getExposeHeaders() == null) ? 0 : getExposeHeaders().hashCode());
        hashCode = prime * hashCode + ((getMaxAge() == null) ? 0 : getMaxAge().hashCode());
        hashCode = prime * hashCode + ((getAllowMethods() == null) ? 0 : getAllowMethods().hashCode());
        hashCode = prime * hashCode + ((getAllowHeaders() == null) ? 0 : getAllowHeaders().hashCode());
        return hashCode;
    }

    @Override
    public AwsCorsConfiguration clone() {
        try {
            return (AwsCorsConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsCorsConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
