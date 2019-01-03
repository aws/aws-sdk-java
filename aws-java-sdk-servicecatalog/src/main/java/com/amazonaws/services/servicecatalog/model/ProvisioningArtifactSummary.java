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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information about a provisioning artifact (also known as a version) for a product.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ProvisioningArtifactSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisioningArtifactSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the provisioning artifact.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the provisioning artifact.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The metadata for the provisioning artifact. This is used with AWS Marketplace products.
     * </p>
     */
    private java.util.Map<String, String> provisioningArtifactMetadata;

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * 
     * @param id
     *        The identifier of the provisioning artifact.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * 
     * @return The identifier of the provisioning artifact.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * 
     * @param id
     *        The identifier of the provisioning artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisioningArtifactSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the provisioning artifact.
     * </p>
     * 
     * @param name
     *        The name of the provisioning artifact.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the provisioning artifact.
     * </p>
     * 
     * @return The name of the provisioning artifact.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the provisioning artifact.
     * </p>
     * 
     * @param name
     *        The name of the provisioning artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisioningArtifactSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the provisioning artifact.
     * </p>
     * 
     * @param description
     *        The description of the provisioning artifact.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the provisioning artifact.
     * </p>
     * 
     * @return The description of the provisioning artifact.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the provisioning artifact.
     * </p>
     * 
     * @param description
     *        The description of the provisioning artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisioningArtifactSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     * 
     * @param createdTime
     *        The UTC time stamp of the creation time.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     * 
     * @return The UTC time stamp of the creation time.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     * 
     * @param createdTime
     *        The UTC time stamp of the creation time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisioningArtifactSummary withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The metadata for the provisioning artifact. This is used with AWS Marketplace products.
     * </p>
     * 
     * @return The metadata for the provisioning artifact. This is used with AWS Marketplace products.
     */

    public java.util.Map<String, String> getProvisioningArtifactMetadata() {
        return provisioningArtifactMetadata;
    }

    /**
     * <p>
     * The metadata for the provisioning artifact. This is used with AWS Marketplace products.
     * </p>
     * 
     * @param provisioningArtifactMetadata
     *        The metadata for the provisioning artifact. This is used with AWS Marketplace products.
     */

    public void setProvisioningArtifactMetadata(java.util.Map<String, String> provisioningArtifactMetadata) {
        this.provisioningArtifactMetadata = provisioningArtifactMetadata;
    }

    /**
     * <p>
     * The metadata for the provisioning artifact. This is used with AWS Marketplace products.
     * </p>
     * 
     * @param provisioningArtifactMetadata
     *        The metadata for the provisioning artifact. This is used with AWS Marketplace products.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisioningArtifactSummary withProvisioningArtifactMetadata(java.util.Map<String, String> provisioningArtifactMetadata) {
        setProvisioningArtifactMetadata(provisioningArtifactMetadata);
        return this;
    }

    public ProvisioningArtifactSummary addProvisioningArtifactMetadataEntry(String key, String value) {
        if (null == this.provisioningArtifactMetadata) {
            this.provisioningArtifactMetadata = new java.util.HashMap<String, String>();
        }
        if (this.provisioningArtifactMetadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.provisioningArtifactMetadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ProvisioningArtifactMetadata.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisioningArtifactSummary clearProvisioningArtifactMetadataEntries() {
        this.provisioningArtifactMetadata = null;
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getProvisioningArtifactMetadata() != null)
            sb.append("ProvisioningArtifactMetadata: ").append(getProvisioningArtifactMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisioningArtifactSummary == false)
            return false;
        ProvisioningArtifactSummary other = (ProvisioningArtifactSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getProvisioningArtifactMetadata() == null ^ this.getProvisioningArtifactMetadata() == null)
            return false;
        if (other.getProvisioningArtifactMetadata() != null && other.getProvisioningArtifactMetadata().equals(this.getProvisioningArtifactMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getProvisioningArtifactMetadata() == null) ? 0 : getProvisioningArtifactMetadata().hashCode());
        return hashCode;
    }

    @Override
    public ProvisioningArtifactSummary clone() {
        try {
            return (ProvisioningArtifactSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicecatalog.model.transform.ProvisioningArtifactSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
