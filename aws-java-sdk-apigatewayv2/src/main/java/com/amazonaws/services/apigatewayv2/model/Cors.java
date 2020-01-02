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
package com.amazonaws.services.apigatewayv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a CORS configuration. Supported only for HTTP APIs. See <a
 * href="https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html">Configuring CORS</a> for more
 * information.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Cors implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether credentials are included in the CORS request. Supported only for HTTP APIs.
     * </p>
     */
    private Boolean allowCredentials;
    /**
     * <p>
     * Represents a collection of allowed headers. Supported only for HTTP APIs.
     * </p>
     */
    private java.util.List<String> allowHeaders;
    /**
     * <p>
     * Represents a collection of allowed HTTP methods. Supported only for HTTP APIs.
     * </p>
     */
    private java.util.List<String> allowMethods;
    /**
     * <p>
     * Represents a collection of allowed origins. Supported only for HTTP APIs.
     * </p>
     */
    private java.util.List<String> allowOrigins;
    /**
     * <p>
     * Represents a collection of exposed headers. Supported only for HTTP APIs.
     * </p>
     */
    private java.util.List<String> exposeHeaders;
    /**
     * <p>
     * The number of seconds that the browser should cache preflight request results. Supported only for HTTP APIs.
     * </p>
     */
    private Integer maxAge;

    /**
     * <p>
     * Specifies whether credentials are included in the CORS request. Supported only for HTTP APIs.
     * </p>
     * 
     * @param allowCredentials
     *        Specifies whether credentials are included in the CORS request. Supported only for HTTP APIs.
     */

    public void setAllowCredentials(Boolean allowCredentials) {
        this.allowCredentials = allowCredentials;
    }

    /**
     * <p>
     * Specifies whether credentials are included in the CORS request. Supported only for HTTP APIs.
     * </p>
     * 
     * @return Specifies whether credentials are included in the CORS request. Supported only for HTTP APIs.
     */

    public Boolean getAllowCredentials() {
        return this.allowCredentials;
    }

    /**
     * <p>
     * Specifies whether credentials are included in the CORS request. Supported only for HTTP APIs.
     * </p>
     * 
     * @param allowCredentials
     *        Specifies whether credentials are included in the CORS request. Supported only for HTTP APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cors withAllowCredentials(Boolean allowCredentials) {
        setAllowCredentials(allowCredentials);
        return this;
    }

    /**
     * <p>
     * Specifies whether credentials are included in the CORS request. Supported only for HTTP APIs.
     * </p>
     * 
     * @return Specifies whether credentials are included in the CORS request. Supported only for HTTP APIs.
     */

    public Boolean isAllowCredentials() {
        return this.allowCredentials;
    }

    /**
     * <p>
     * Represents a collection of allowed headers. Supported only for HTTP APIs.
     * </p>
     * 
     * @return Represents a collection of allowed headers. Supported only for HTTP APIs.
     */

    public java.util.List<String> getAllowHeaders() {
        return allowHeaders;
    }

    /**
     * <p>
     * Represents a collection of allowed headers. Supported only for HTTP APIs.
     * </p>
     * 
     * @param allowHeaders
     *        Represents a collection of allowed headers. Supported only for HTTP APIs.
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
     * Represents a collection of allowed headers. Supported only for HTTP APIs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowHeaders(java.util.Collection)} or {@link #withAllowHeaders(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param allowHeaders
     *        Represents a collection of allowed headers. Supported only for HTTP APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cors withAllowHeaders(String... allowHeaders) {
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
     * Represents a collection of allowed headers. Supported only for HTTP APIs.
     * </p>
     * 
     * @param allowHeaders
     *        Represents a collection of allowed headers. Supported only for HTTP APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cors withAllowHeaders(java.util.Collection<String> allowHeaders) {
        setAllowHeaders(allowHeaders);
        return this;
    }

    /**
     * <p>
     * Represents a collection of allowed HTTP methods. Supported only for HTTP APIs.
     * </p>
     * 
     * @return Represents a collection of allowed HTTP methods. Supported only for HTTP APIs.
     */

    public java.util.List<String> getAllowMethods() {
        return allowMethods;
    }

    /**
     * <p>
     * Represents a collection of allowed HTTP methods. Supported only for HTTP APIs.
     * </p>
     * 
     * @param allowMethods
     *        Represents a collection of allowed HTTP methods. Supported only for HTTP APIs.
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
     * Represents a collection of allowed HTTP methods. Supported only for HTTP APIs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowMethods(java.util.Collection)} or {@link #withAllowMethods(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param allowMethods
     *        Represents a collection of allowed HTTP methods. Supported only for HTTP APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cors withAllowMethods(String... allowMethods) {
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
     * Represents a collection of allowed HTTP methods. Supported only for HTTP APIs.
     * </p>
     * 
     * @param allowMethods
     *        Represents a collection of allowed HTTP methods. Supported only for HTTP APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cors withAllowMethods(java.util.Collection<String> allowMethods) {
        setAllowMethods(allowMethods);
        return this;
    }

    /**
     * <p>
     * Represents a collection of allowed origins. Supported only for HTTP APIs.
     * </p>
     * 
     * @return Represents a collection of allowed origins. Supported only for HTTP APIs.
     */

    public java.util.List<String> getAllowOrigins() {
        return allowOrigins;
    }

    /**
     * <p>
     * Represents a collection of allowed origins. Supported only for HTTP APIs.
     * </p>
     * 
     * @param allowOrigins
     *        Represents a collection of allowed origins. Supported only for HTTP APIs.
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
     * Represents a collection of allowed origins. Supported only for HTTP APIs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowOrigins(java.util.Collection)} or {@link #withAllowOrigins(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param allowOrigins
     *        Represents a collection of allowed origins. Supported only for HTTP APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cors withAllowOrigins(String... allowOrigins) {
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
     * Represents a collection of allowed origins. Supported only for HTTP APIs.
     * </p>
     * 
     * @param allowOrigins
     *        Represents a collection of allowed origins. Supported only for HTTP APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cors withAllowOrigins(java.util.Collection<String> allowOrigins) {
        setAllowOrigins(allowOrigins);
        return this;
    }

    /**
     * <p>
     * Represents a collection of exposed headers. Supported only for HTTP APIs.
     * </p>
     * 
     * @return Represents a collection of exposed headers. Supported only for HTTP APIs.
     */

    public java.util.List<String> getExposeHeaders() {
        return exposeHeaders;
    }

    /**
     * <p>
     * Represents a collection of exposed headers. Supported only for HTTP APIs.
     * </p>
     * 
     * @param exposeHeaders
     *        Represents a collection of exposed headers. Supported only for HTTP APIs.
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
     * Represents a collection of exposed headers. Supported only for HTTP APIs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExposeHeaders(java.util.Collection)} or {@link #withExposeHeaders(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param exposeHeaders
     *        Represents a collection of exposed headers. Supported only for HTTP APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cors withExposeHeaders(String... exposeHeaders) {
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
     * Represents a collection of exposed headers. Supported only for HTTP APIs.
     * </p>
     * 
     * @param exposeHeaders
     *        Represents a collection of exposed headers. Supported only for HTTP APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cors withExposeHeaders(java.util.Collection<String> exposeHeaders) {
        setExposeHeaders(exposeHeaders);
        return this;
    }

    /**
     * <p>
     * The number of seconds that the browser should cache preflight request results. Supported only for HTTP APIs.
     * </p>
     * 
     * @param maxAge
     *        The number of seconds that the browser should cache preflight request results. Supported only for HTTP
     *        APIs.
     */

    public void setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
    }

    /**
     * <p>
     * The number of seconds that the browser should cache preflight request results. Supported only for HTTP APIs.
     * </p>
     * 
     * @return The number of seconds that the browser should cache preflight request results. Supported only for HTTP
     *         APIs.
     */

    public Integer getMaxAge() {
        return this.maxAge;
    }

    /**
     * <p>
     * The number of seconds that the browser should cache preflight request results. Supported only for HTTP APIs.
     * </p>
     * 
     * @param maxAge
     *        The number of seconds that the browser should cache preflight request results. Supported only for HTTP
     *        APIs.
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
        com.amazonaws.services.apigatewayv2.model.transform.CorsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
