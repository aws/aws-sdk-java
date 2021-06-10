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
 * An object representing the gateway route to rewrite.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/HttpGatewayRouteRewrite" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HttpGatewayRouteRewrite implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The host name to rewrite.
     * </p>
     */
    private GatewayRouteHostnameRewrite hostname;
    /**
     * <p>
     * The path to rewrite.
     * </p>
     */
    private HttpGatewayRoutePathRewrite path;
    /**
     * <p>
     * The specified beginning characters to rewrite.
     * </p>
     */
    private HttpGatewayRoutePrefixRewrite prefix;

    /**
     * <p>
     * The host name to rewrite.
     * </p>
     * 
     * @param hostname
     *        The host name to rewrite.
     */

    public void setHostname(GatewayRouteHostnameRewrite hostname) {
        this.hostname = hostname;
    }

    /**
     * <p>
     * The host name to rewrite.
     * </p>
     * 
     * @return The host name to rewrite.
     */

    public GatewayRouteHostnameRewrite getHostname() {
        return this.hostname;
    }

    /**
     * <p>
     * The host name to rewrite.
     * </p>
     * 
     * @param hostname
     *        The host name to rewrite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpGatewayRouteRewrite withHostname(GatewayRouteHostnameRewrite hostname) {
        setHostname(hostname);
        return this;
    }

    /**
     * <p>
     * The path to rewrite.
     * </p>
     * 
     * @param path
     *        The path to rewrite.
     */

    public void setPath(HttpGatewayRoutePathRewrite path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to rewrite.
     * </p>
     * 
     * @return The path to rewrite.
     */

    public HttpGatewayRoutePathRewrite getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path to rewrite.
     * </p>
     * 
     * @param path
     *        The path to rewrite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpGatewayRouteRewrite withPath(HttpGatewayRoutePathRewrite path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The specified beginning characters to rewrite.
     * </p>
     * 
     * @param prefix
     *        The specified beginning characters to rewrite.
     */

    public void setPrefix(HttpGatewayRoutePrefixRewrite prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * The specified beginning characters to rewrite.
     * </p>
     * 
     * @return The specified beginning characters to rewrite.
     */

    public HttpGatewayRoutePrefixRewrite getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * The specified beginning characters to rewrite.
     * </p>
     * 
     * @param prefix
     *        The specified beginning characters to rewrite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpGatewayRouteRewrite withPrefix(HttpGatewayRoutePrefixRewrite prefix) {
        setPrefix(prefix);
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
        if (getHostname() != null)
            sb.append("Hostname: ").append(getHostname()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HttpGatewayRouteRewrite == false)
            return false;
        HttpGatewayRouteRewrite other = (HttpGatewayRouteRewrite) obj;
        if (other.getHostname() == null ^ this.getHostname() == null)
            return false;
        if (other.getHostname() != null && other.getHostname().equals(this.getHostname()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostname() == null) ? 0 : getHostname().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        return hashCode;
    }

    @Override
    public HttpGatewayRouteRewrite clone() {
        try {
            return (HttpGatewayRouteRewrite) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.HttpGatewayRouteRewriteMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
