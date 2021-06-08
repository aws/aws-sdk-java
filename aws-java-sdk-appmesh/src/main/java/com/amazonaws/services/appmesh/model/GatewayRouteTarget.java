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
 * An object that represents a gateway route target.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/GatewayRouteTarget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GatewayRouteTarget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that represents a virtual service gateway route target.
     * </p>
     */
    private GatewayRouteVirtualService virtualService;

    /**
     * <p>
     * An object that represents a virtual service gateway route target.
     * </p>
     * 
     * @param virtualService
     *        An object that represents a virtual service gateway route target.
     */

    public void setVirtualService(GatewayRouteVirtualService virtualService) {
        this.virtualService = virtualService;
    }

    /**
     * <p>
     * An object that represents a virtual service gateway route target.
     * </p>
     * 
     * @return An object that represents a virtual service gateway route target.
     */

    public GatewayRouteVirtualService getVirtualService() {
        return this.virtualService;
    }

    /**
     * <p>
     * An object that represents a virtual service gateway route target.
     * </p>
     * 
     * @param virtualService
     *        An object that represents a virtual service gateway route target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayRouteTarget withVirtualService(GatewayRouteVirtualService virtualService) {
        setVirtualService(virtualService);
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
        if (getVirtualService() != null)
            sb.append("VirtualService: ").append(getVirtualService());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GatewayRouteTarget == false)
            return false;
        GatewayRouteTarget other = (GatewayRouteTarget) obj;
        if (other.getVirtualService() == null ^ this.getVirtualService() == null)
            return false;
        if (other.getVirtualService() != null && other.getVirtualService().equals(this.getVirtualService()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVirtualService() == null) ? 0 : getVirtualService().hashCode());
        return hashCode;
    }

    @Override
    public GatewayRouteTarget clone() {
        try {
            return (GatewayRouteTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.GatewayRouteTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
