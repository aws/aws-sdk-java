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
 * An object that represents a virtual gateway returned by a describe operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/VirtualGatewayData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VirtualGatewayData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the service mesh that the virtual gateway resides in.
     * </p>
     */
    private String meshName;

    private ResourceMetadata metadata;
    /**
     * <p>
     * The specifications of the virtual gateway.
     * </p>
     */
    private VirtualGatewaySpec spec;
    /**
     * <p>
     * The current status of the virtual gateway.
     * </p>
     */
    private VirtualGatewayStatus status;
    /**
     * <p>
     * The name of the virtual gateway.
     * </p>
     */
    private String virtualGatewayName;

    /**
     * <p>
     * The name of the service mesh that the virtual gateway resides in.
     * </p>
     * 
     * @param meshName
     *        The name of the service mesh that the virtual gateway resides in.
     */

    public void setMeshName(String meshName) {
        this.meshName = meshName;
    }

    /**
     * <p>
     * The name of the service mesh that the virtual gateway resides in.
     * </p>
     * 
     * @return The name of the service mesh that the virtual gateway resides in.
     */

    public String getMeshName() {
        return this.meshName;
    }

    /**
     * <p>
     * The name of the service mesh that the virtual gateway resides in.
     * </p>
     * 
     * @param meshName
     *        The name of the service mesh that the virtual gateway resides in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualGatewayData withMeshName(String meshName) {
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

    public VirtualGatewayData withMetadata(ResourceMetadata metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * <p>
     * The specifications of the virtual gateway.
     * </p>
     * 
     * @param spec
     *        The specifications of the virtual gateway.
     */

    public void setSpec(VirtualGatewaySpec spec) {
        this.spec = spec;
    }

    /**
     * <p>
     * The specifications of the virtual gateway.
     * </p>
     * 
     * @return The specifications of the virtual gateway.
     */

    public VirtualGatewaySpec getSpec() {
        return this.spec;
    }

    /**
     * <p>
     * The specifications of the virtual gateway.
     * </p>
     * 
     * @param spec
     *        The specifications of the virtual gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualGatewayData withSpec(VirtualGatewaySpec spec) {
        setSpec(spec);
        return this;
    }

    /**
     * <p>
     * The current status of the virtual gateway.
     * </p>
     * 
     * @param status
     *        The current status of the virtual gateway.
     */

    public void setStatus(VirtualGatewayStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the virtual gateway.
     * </p>
     * 
     * @return The current status of the virtual gateway.
     */

    public VirtualGatewayStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the virtual gateway.
     * </p>
     * 
     * @param status
     *        The current status of the virtual gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualGatewayData withStatus(VirtualGatewayStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The name of the virtual gateway.
     * </p>
     * 
     * @param virtualGatewayName
     *        The name of the virtual gateway.
     */

    public void setVirtualGatewayName(String virtualGatewayName) {
        this.virtualGatewayName = virtualGatewayName;
    }

    /**
     * <p>
     * The name of the virtual gateway.
     * </p>
     * 
     * @return The name of the virtual gateway.
     */

    public String getVirtualGatewayName() {
        return this.virtualGatewayName;
    }

    /**
     * <p>
     * The name of the virtual gateway.
     * </p>
     * 
     * @param virtualGatewayName
     *        The name of the virtual gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualGatewayData withVirtualGatewayName(String virtualGatewayName) {
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

        if (obj instanceof VirtualGatewayData == false)
            return false;
        VirtualGatewayData other = (VirtualGatewayData) obj;
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

        hashCode = prime * hashCode + ((getMeshName() == null) ? 0 : getMeshName().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getSpec() == null) ? 0 : getSpec().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getVirtualGatewayName() == null) ? 0 : getVirtualGatewayName().hashCode());
        return hashCode;
    }

    @Override
    public VirtualGatewayData clone() {
        try {
            return (VirtualGatewayData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.VirtualGatewayDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
