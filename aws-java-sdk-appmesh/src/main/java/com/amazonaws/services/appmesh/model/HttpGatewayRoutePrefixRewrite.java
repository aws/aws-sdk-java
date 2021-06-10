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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing the beginning characters of the route to rewrite.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/HttpGatewayRoutePrefixRewrite"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HttpGatewayRoutePrefixRewrite implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The default prefix used to replace the incoming route prefix when rewritten.
     * </p>
     */
    private String defaultPrefix;
    /**
     * <p>
     * The value used to replace the incoming route prefix when rewritten.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The default prefix used to replace the incoming route prefix when rewritten.
     * </p>
     * 
     * @param defaultPrefix
     *        The default prefix used to replace the incoming route prefix when rewritten.
     * @see DefaultGatewayRouteRewrite
     */

    public void setDefaultPrefix(String defaultPrefix) {
        this.defaultPrefix = defaultPrefix;
    }

    /**
     * <p>
     * The default prefix used to replace the incoming route prefix when rewritten.
     * </p>
     * 
     * @return The default prefix used to replace the incoming route prefix when rewritten.
     * @see DefaultGatewayRouteRewrite
     */

    public String getDefaultPrefix() {
        return this.defaultPrefix;
    }

    /**
     * <p>
     * The default prefix used to replace the incoming route prefix when rewritten.
     * </p>
     * 
     * @param defaultPrefix
     *        The default prefix used to replace the incoming route prefix when rewritten.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultGatewayRouteRewrite
     */

    public HttpGatewayRoutePrefixRewrite withDefaultPrefix(String defaultPrefix) {
        setDefaultPrefix(defaultPrefix);
        return this;
    }

    /**
     * <p>
     * The default prefix used to replace the incoming route prefix when rewritten.
     * </p>
     * 
     * @param defaultPrefix
     *        The default prefix used to replace the incoming route prefix when rewritten.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultGatewayRouteRewrite
     */

    public HttpGatewayRoutePrefixRewrite withDefaultPrefix(DefaultGatewayRouteRewrite defaultPrefix) {
        this.defaultPrefix = defaultPrefix.toString();
        return this;
    }

    /**
     * <p>
     * The value used to replace the incoming route prefix when rewritten.
     * </p>
     * 
     * @param value
     *        The value used to replace the incoming route prefix when rewritten.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value used to replace the incoming route prefix when rewritten.
     * </p>
     * 
     * @return The value used to replace the incoming route prefix when rewritten.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value used to replace the incoming route prefix when rewritten.
     * </p>
     * 
     * @param value
     *        The value used to replace the incoming route prefix when rewritten.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpGatewayRoutePrefixRewrite withValue(String value) {
        setValue(value);
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
        if (getDefaultPrefix() != null)
            sb.append("DefaultPrefix: ").append(getDefaultPrefix()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HttpGatewayRoutePrefixRewrite == false)
            return false;
        HttpGatewayRoutePrefixRewrite other = (HttpGatewayRoutePrefixRewrite) obj;
        if (other.getDefaultPrefix() == null ^ this.getDefaultPrefix() == null)
            return false;
        if (other.getDefaultPrefix() != null && other.getDefaultPrefix().equals(this.getDefaultPrefix()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultPrefix() == null) ? 0 : getDefaultPrefix().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public HttpGatewayRoutePrefixRewrite clone() {
        try {
            return (HttpGatewayRoutePrefixRewrite) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.HttpGatewayRoutePrefixRewriteMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
