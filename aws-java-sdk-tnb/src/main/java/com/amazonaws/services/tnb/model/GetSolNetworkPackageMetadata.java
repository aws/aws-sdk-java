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
 * Metadata associated with a network package.
 * </p>
 * <p>
 * A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function packages you want to
 * deploy and the Amazon Web Services infrastructure you want to deploy them on.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolNetworkPackageMetadata" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSolNetworkPackageMetadata implements Serializable, Cloneable, StructuredPojo {

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
     * Metadata related to the onboarded network service descriptor in the network package.
     * </p>
     */
    private NetworkArtifactMeta nsd;

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

    public GetSolNetworkPackageMetadata withCreatedAt(java.util.Date createdAt) {
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

    public GetSolNetworkPackageMetadata withLastModified(java.util.Date lastModified) {
        setLastModified(lastModified);
        return this;
    }

    /**
     * <p>
     * Metadata related to the onboarded network service descriptor in the network package.
     * </p>
     * 
     * @param nsd
     *        Metadata related to the onboarded network service descriptor in the network package.
     */

    public void setNsd(NetworkArtifactMeta nsd) {
        this.nsd = nsd;
    }

    /**
     * <p>
     * Metadata related to the onboarded network service descriptor in the network package.
     * </p>
     * 
     * @return Metadata related to the onboarded network service descriptor in the network package.
     */

    public NetworkArtifactMeta getNsd() {
        return this.nsd;
    }

    /**
     * <p>
     * Metadata related to the onboarded network service descriptor in the network package.
     * </p>
     * 
     * @param nsd
     *        Metadata related to the onboarded network service descriptor in the network package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolNetworkPackageMetadata withNsd(NetworkArtifactMeta nsd) {
        setNsd(nsd);
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
        if (getNsd() != null)
            sb.append("Nsd: ").append(getNsd());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSolNetworkPackageMetadata == false)
            return false;
        GetSolNetworkPackageMetadata other = (GetSolNetworkPackageMetadata) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        if (other.getNsd() == null ^ this.getNsd() == null)
            return false;
        if (other.getNsd() != null && other.getNsd().equals(this.getNsd()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        hashCode = prime * hashCode + ((getNsd() == null) ? 0 : getNsd().hashCode());
        return hashCode;
    }

    @Override
    public GetSolNetworkPackageMetadata clone() {
        try {
            return (GetSolNetworkPackageMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.tnb.model.transform.GetSolNetworkPackageMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
