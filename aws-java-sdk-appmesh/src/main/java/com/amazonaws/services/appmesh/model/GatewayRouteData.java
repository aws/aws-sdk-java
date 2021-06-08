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
 * An object that represents a gateway route returned by a describe operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/GatewayRouteData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GatewayRouteData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the gateway route.
     * </p>
     */
    private String gatewayRouteName;
    /**
     * <p>
     * The name of the service mesh that the resource resides in.
     * </p>
     */
    private String meshName;

    private ResourceMetadata metadata;
    /**
     * <p>
     * The specifications of the gateway route.
     * </p>
     */
    private GatewayRouteSpec spec;
    /**
     * <p>
     * The status of the gateway route.
     * </p>
     */
    private GatewayRouteStatus status;
    /**
     * <p>
     * The virtual gateway that the gateway route is associated with.
     * </p>
     */
    private String virtualGatewayName;

    /**
     * <p>
     * The name of the gateway route.
     * </p>
     * 
     * @param gatewayRouteName
     *        The name of the gateway route.
     */

    public void setGatewayRouteName(String gatewayRouteName) {
        this.gatewayRouteName = gatewayRouteName;
    }

    /**
     * <p>
     * The name of the gateway route.
     * </p>
     * 
     * @return The name of the gateway route.
     */

    public String getGatewayRouteName() {
        return this.gatewayRouteName;
    }

    /**
     * <p>
     * The name of the gateway route.
     * </p>
     * 
     * @param gatewayRouteName
     *        The name of the gateway route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayRouteData withGatewayRouteName(String gatewayRouteName) {
        setGatewayRouteName(gatewayRouteName);
        return this;
    }

    /**
     * <p>
     * The name of the service mesh that the resource resides in.
     * </p>
     * 
     * @param meshName
     *        The name of the service mesh that the resource resides in.
     */

    public void setMeshName(String meshName) {
        this.meshName = meshName;
    }

    /**
     * <p>
     * The name of the service mesh that the resource resides in.
     * </p>
     * 
     * @return The name of the service mesh that the resource resides in.
     */

    public String getMeshName() {
        return this.meshName;
    }

    /**
     * <p>
     * The name of the service mesh that the resource resides in.
     * </p>
     * 
     * @param meshName
     *        The name of the service mesh that the resource resides in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayRouteData withMeshName(String meshName) {
        setMeshName(meshName);
        return this;
    }

    /**
     * @param metadata
     */

    public void setMetadata(ResourceMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * @return
     */

    public ResourceMetadata getMetadata() {
        return this.metadata;
    }

    /**
     * @param metadata
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayRouteData withMetadata(ResourceMetadata metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * <p>
     * The specifications of the gateway route.
     * </p>
     * 
     * @param spec
     *        The specifications of the gateway route.
     */

    public void setSpec(GatewayRouteSpec spec) {
        this.spec = spec;
    }

    /**
     * <p>
     * The specifications of the gateway route.
     * </p>
     * 
     * @return The specifications of the gateway route.
     */

    public GatewayRouteSpec getSpec() {
        return this.spec;
    }

    /**
     * <p>
     * The specifications of the gateway route.
     * </p>
     * 
     * @param spec
     *        The specifications of the gateway route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayRouteData withSpec(GatewayRouteSpec spec) {
        setSpec(spec);
        return this;
    }

    /**
     * <p>
     * The status of the gateway route.
     * </p>
     * 
     * @param status
     *        The status of the gateway route.
     */

    public void setStatus(GatewayRouteStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the gateway route.
     * </p>
     * 
     * @return The status of the gateway route.
     */

    public GatewayRouteStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the gateway route.
     * </p>
     * 
     * @param status
     *        The status of the gateway route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayRouteData withStatus(GatewayRouteStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The virtual gateway that the gateway route is associated with.
     * </p>
     * 
     * @param virtualGatewayName
     *        The virtual gateway that the gateway route is associated with.
     */

    public void setVirtualGatewayName(String virtualGatewayName) {
        this.virtualGatewayName = virtualGatewayName;
    }

    /**
     * <p>
     * The virtual gateway that the gateway route is associated with.
     * </p>
     * 
     * @return The virtual gateway that the gateway route is associated with.
     */

    public String getVirtualGatewayName() {
        return this.virtualGatewayName;
    }

    /**
     * <p>
     * The virtual gateway that the gateway route is associated with.
     * </p>
     * 
     * @param virtualGatewayName
     *        The virtual gateway that the gateway route is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayRouteData withVirtualGatewayName(String virtualGatewayName) {
        setVirtualGatewayName(virtualGatewayName);
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
        if (getGatewayRouteName() != null)
            sb.append("GatewayRouteName: ").append(getGatewayRouteName()).append(",");
        if (getMeshName() != null)
            sb.append("MeshName: ").append(getMeshName()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata()).append(",");
        if (getSpec() != null)
            sb.append("Spec: ").append(getSpec()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getVirtualGatewayName() != null)
            sb.append("VirtualGatewayName: ").append(getVirtualGatewayName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GatewayRouteData == false)
            return false;
        GatewayRouteData other = (GatewayRouteData) obj;
        if (other.getGatewayRouteName() == null ^ this.getGatewayRouteName() == null)
            return false;
        if (other.getGatewayRouteName() != null && other.getGatewayRouteName().equals(this.getGatewayRouteName()) == false)
            return false;
        if (other.getMeshName() == null ^ this.getMeshName() == null)
            return false;
        if (other.getMeshName() != null && other.getMeshName().equals(this.getMeshName()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getSpec() == null ^ this.getSpec() == null)
            return false;
        if (other.getSpec() != null && other.getSpec().equals(this.getSpec()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getVirtualGatewayName() == null ^ this.getVirtualGatewayName() == null)
            return false;
        if (other.getVirtualGatewayName() != null && other.getVirtualGatewayName().equals(this.getVirtualGatewayName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayRouteName() == null) ? 0 : getGatewayRouteName().hashCode());
        hashCode = prime * hashCode + ((getMeshName() == null) ? 0 : getMeshName().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getSpec() == null) ? 0 : getSpec().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getVirtualGatewayName() == null) ? 0 : getVirtualGatewayName().hashCode());
        return hashCode;
    }

    @Override
    public GatewayRouteData clone() {
        try {
            return (GatewayRouteData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.GatewayRouteDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
