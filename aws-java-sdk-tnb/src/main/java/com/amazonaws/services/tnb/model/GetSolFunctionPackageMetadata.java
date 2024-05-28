/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.tnb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Metadata related to the function package.
 * </p>
 * <p>
 * A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a network function (an ETSI
 * standard telecommunication application) and function package descriptor that uses the TOSCA standard to describe how
 * the network functions should run on your network.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolFunctionPackageMetadata" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSolFunctionPackageMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date that the resource was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The date that the resource was last modified.
     * </p>
     */
    private java.util.Date lastModified;
    /**
     * <p>
     * Metadata related to the function package descriptor of the function package.
     * </p>
     */
    private FunctionArtifactMeta vnfd;

    /**
     * <p>
     * The date that the resource was created.
     * </p>
     * 
     * @param createdAt
     *        The date that the resource was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date that the resource was created.
     * </p>
     * 
     * @return The date that the resource was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date that the resource was created.
     * </p>
     * 
     * @param createdAt
     *        The date that the resource was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolFunctionPackageMetadata withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The date that the resource was last modified.
     * </p>
     * 
     * @param lastModified
     *        The date that the resource was last modified.
     */

    public void setLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * <p>
     * The date that the resource was last modified.
     * </p>
     * 
     * @return The date that the resource was last modified.
     */

    public java.util.Date getLastModified() {
        return this.lastModified;
    }

    /**
     * <p>
     * The date that the resource was last modified.
     * </p>
     * 
     * @param lastModified
     *        The date that the resource was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolFunctionPackageMetadata withLastModified(java.util.Date lastModified) {
        setLastModified(lastModified);
        return this;
    }

    /**
     * <p>
     * Metadata related to the function package descriptor of the function package.
     * </p>
     * 
     * @param vnfd
     *        Metadata related to the function package descriptor of the function package.
     */

    public void setVnfd(FunctionArtifactMeta vnfd) {
        this.vnfd = vnfd;
    }

    /**
     * <p>
     * Metadata related to the function package descriptor of the function package.
     * </p>
     * 
     * @return Metadata related to the function package descriptor of the function package.
     */

    public FunctionArtifactMeta getVnfd() {
        return this.vnfd;
    }

    /**
     * <p>
     * Metadata related to the function package descriptor of the function package.
     * </p>
     * 
     * @param vnfd
     *        Metadata related to the function package descriptor of the function package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolFunctionPackageMetadata withVnfd(FunctionArtifactMeta vnfd) {
        setVnfd(vnfd);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastModified() != null)
            sb.append("LastModified: ").append(getLastModified()).append(",");
        if (getVnfd() != null)
            sb.append("Vnfd: ").append(getVnfd());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSolFunctionPackageMetadata == false)
            return false;
        GetSolFunctionPackageMetadata other = (GetSolFunctionPackageMetadata) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        if (other.getVnfd() == null ^ this.getVnfd() == null)
            return false;
        if (other.getVnfd() != null && other.getVnfd().equals(this.getVnfd()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        hashCode = prime * hashCode + ((getVnfd() == null) ? 0 : getVnfd().hashCode());
        return hashCode;
    }

    @Override
    public GetSolFunctionPackageMetadata clone() {
        try {
            return (GetSolFunctionPackageMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.tnb.model.transform.GetSolFunctionPackageMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
