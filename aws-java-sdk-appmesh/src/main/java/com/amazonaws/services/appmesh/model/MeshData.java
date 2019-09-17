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
 * An object representing a service mesh returned by a describe operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/MeshData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MeshData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the service mesh.
     * </p>
     */
    private String meshName;
    /**
     * <p>
     * The associated metadata for the service mesh.
     * </p>
     */
    private ResourceMetadata metadata;
    /**
     * <p>
     * The associated specification for the service mesh.
     * </p>
     */
    private MeshSpec spec;
    /**
     * <p>
     * The status of the service mesh.
     * </p>
     */
    private MeshStatus status;

    /**
     * <p>
     * The name of the service mesh.
     * </p>
     * 
     * @param meshName
     *        The name of the service mesh.
     */

    public void setMeshName(String meshName) {
        this.meshName = meshName;
    }

    /**
     * <p>
     * The name of the service mesh.
     * </p>
     * 
     * @return The name of the service mesh.
     */

    public String getMeshName() {
        return this.meshName;
    }

    /**
     * <p>
     * The name of the service mesh.
     * </p>
     * 
     * @param meshName
     *        The name of the service mesh.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MeshData withMeshName(String meshName) {
        setMeshName(meshName);
        return this;
    }

    /**
     * <p>
     * The associated metadata for the service mesh.
     * </p>
     * 
     * @param metadata
     *        The associated metadata for the service mesh.
     */

    public void setMetadata(ResourceMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The associated metadata for the service mesh.
     * </p>
     * 
     * @return The associated metadata for the service mesh.
     */

    public ResourceMetadata getMetadata() {
        return this.metadata;
    }

    /**
     * <p>
     * The associated metadata for the service mesh.
     * </p>
     * 
     * @param metadata
     *        The associated metadata for the service mesh.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MeshData withMetadata(ResourceMetadata metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * <p>
     * The associated specification for the service mesh.
     * </p>
     * 
     * @param spec
     *        The associated specification for the service mesh.
     */

    public void setSpec(MeshSpec spec) {
        this.spec = spec;
    }

    /**
     * <p>
     * The associated specification for the service mesh.
     * </p>
     * 
     * @return The associated specification for the service mesh.
     */

    public MeshSpec getSpec() {
        return this.spec;
    }

    /**
     * <p>
     * The associated specification for the service mesh.
     * </p>
     * 
     * @param spec
     *        The associated specification for the service mesh.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MeshData withSpec(MeshSpec spec) {
        setSpec(spec);
        return this;
    }

    /**
     * <p>
     * The status of the service mesh.
     * </p>
     * 
     * @param status
     *        The status of the service mesh.
     */

    public void setStatus(MeshStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the service mesh.
     * </p>
     * 
     * @return The status of the service mesh.
     */

    public MeshStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the service mesh.
     * </p>
     * 
     * @param status
     *        The status of the service mesh.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MeshData withStatus(MeshStatus status) {
        setStatus(status);
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
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MeshData == false)
            return false;
        MeshData other = (MeshData) obj;
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
        return hashCode;
    }

    @Override
    public MeshData clone() {
        try {
            return (MeshData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.MeshDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
