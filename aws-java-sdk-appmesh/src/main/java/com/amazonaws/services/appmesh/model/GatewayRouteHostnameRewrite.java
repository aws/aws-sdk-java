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
 * An object representing the gateway route host name to rewrite.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/GatewayRouteHostnameRewrite"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GatewayRouteHostnameRewrite implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The default target host name to write to.
     * </p>
     */
    private String defaultTargetHostname;

    /**
     * <p>
     * The default target host name to write to.
     * </p>
     * 
     * @param defaultTargetHostname
     *        The default target host name to write to.
     * @see DefaultGatewayRouteRewrite
     */

    public void setDefaultTargetHostname(String defaultTargetHostname) {
        this.defaultTargetHostname = defaultTargetHostname;
    }

    /**
     * <p>
     * The default target host name to write to.
     * </p>
     * 
     * @return The default target host name to write to.
     * @see DefaultGatewayRouteRewrite
     */

    public String getDefaultTargetHostname() {
        return this.defaultTargetHostname;
    }

    /**
     * <p>
     * The default target host name to write to.
     * </p>
     * 
     * @param defaultTargetHostname
     *        The default target host name to write to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultGatewayRouteRewrite
     */

    public GatewayRouteHostnameRewrite withDefaultTargetHostname(String defaultTargetHostname) {
        setDefaultTargetHostname(defaultTargetHostname);
        return this;
    }

    /**
     * <p>
     * The default target host name to write to.
     * </p>
     * 
     * @param defaultTargetHostname
     *        The default target host name to write to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultGatewayRouteRewrite
     */

    public GatewayRouteHostnameRewrite withDefaultTargetHostname(DefaultGatewayRouteRewrite defaultTargetHostname) {
        this.defaultTargetHostname = defaultTargetHostname.toString();
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
        if (getDefaultTargetHostname() != null)
            sb.append("DefaultTargetHostname: ").append(getDefaultTargetHostname());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GatewayRouteHostnameRewrite == false)
            return false;
        GatewayRouteHostnameRewrite other = (GatewayRouteHostnameRewrite) obj;
        if (other.getDefaultTargetHostname() == null ^ this.getDefaultTargetHostname() == null)
            return false;
        if (other.getDefaultTargetHostname() != null && other.getDefaultTargetHostname().equals(this.getDefaultTargetHostname()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultTargetHostname() == null) ? 0 : getDefaultTargetHostname().hashCode());
        return hashCode;
    }

    @Override
    public GatewayRouteHostnameRewrite clone() {
        try {
            return (GatewayRouteHostnameRewrite) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.GatewayRouteHostnameRewriteMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
