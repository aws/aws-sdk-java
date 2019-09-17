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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing a virtual service returned by a describe operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/VirtualServiceData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VirtualServiceData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the service mesh that the virtual service resides in.
     * </p>
     */
    private String meshName;

    private ResourceMetadata metadata;
    /**
     * <p>
     * The specifications of the virtual service.
     * </p>
     */
    private VirtualServiceSpec spec;
    /**
     * <p>
     * The current status of the virtual service.
     * </p>
     */
    private VirtualServiceStatus status;
    /**
     * <p>
     * The name of the virtual service.
     * </p>
     */
    private String virtualServiceName;

    /**
     * <p>
     * The name of the service mesh that the virtual service resides in.
     * </p>
     * 
     * @param meshName
     *        The name of the service mesh that the virtual service resides in.
     */

    public void setMeshName(String meshName) {
        this.meshName = meshName;
    }

    /**
     * <p>
     * The name of the service mesh that the virtual service resides in.
     * </p>
     * 
     * @return The name of the service mesh that the virtual service resides in.
     */

    public String getMeshName() {
        return this.meshName;
    }

    /**
     * <p>
     * The name of the service mesh that the virtual service resides in.
     * </p>
     * 
     * @param meshName
     *        The name of the service mesh that the virtual service resides in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualServiceData withMeshName(String meshName) {
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

    public VirtualServiceData withMetadata(ResourceMetadata metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * <p>
     * The specifications of the virtual service.
     * </p>
     * 
     * @param spec
     *        The specifications of the virtual service.
     */

    public void setSpec(VirtualServiceSpec spec) {
        this.spec = spec;
    }

    /**
     * <p>
     * The specifications of the virtual service.
     * </p>
     * 
     * @return The specifications of the virtual service.
     */

    public VirtualServiceSpec getSpec() {
        return this.spec;
    }

    /**
     * <p>
     * The specifications of the virtual service.
     * </p>
     * 
     * @param spec
     *        The specifications of the virtual service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualServiceData withSpec(VirtualServiceSpec spec) {
        setSpec(spec);
        return this;
    }

    /**
     * <p>
     * The current status of the virtual service.
     * </p>
     * 
     * @param status
     *        The current status of the virtual service.
     */

    public void setStatus(VirtualServiceStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the virtual service.
     * </p>
     * 
     * @return The current status of the virtual service.
     */

    public VirtualServiceStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the virtual service.
     * </p>
     * 
     * @param status
     *        The current status of the virtual service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualServiceData withStatus(VirtualServiceStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The name of the virtual service.
     * </p>
     * 
     * @param virtualServiceName
     *        The name of the virtual service.
     */

    public void setVirtualServiceName(String virtualServiceName) {
        this.virtualServiceName = virtualServiceName;
    }

    /**
     * <p>
     * The name of the virtual service.
     * </p>
     * 
     * @return The name of the virtual service.
     */

    public String getVirtualServiceName() {
        return this.virtualServiceName;
    }

    /**
     * <p>
     * The name of the virtual service.
     * </p>
     * 
     * @param virtualServiceName
     *        The name of the virtual service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualServiceData withVirtualServiceName(String virtualServiceName) {
        setVirtualServiceName(virtualServiceName);
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
        if (getVirtualServiceName() != null)
            sb.append("VirtualServiceName: ").append(getVirtualServiceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VirtualServiceData == false)
            return false;
        VirtualServiceData other = (VirtualServiceData) obj;
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
        if (other.getVirtualServiceName() == null ^ this.getVirtualServiceName() == null)
            return false;
        if (other.getVirtualServiceName() != null && other.getVirtualServiceName().equals(this.getVirtualServiceName()) == false)
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
        hashCode = prime * hashCode + ((getVirtualServiceName() == null) ? 0 : getVirtualServiceName().hashCode());
        return hashCode;
    }

    @Override
    public VirtualServiceData clone() {
        try {
            return (VirtualServiceData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.VirtualServiceDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
