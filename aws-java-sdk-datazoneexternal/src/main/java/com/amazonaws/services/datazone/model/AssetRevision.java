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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The revision of an inventory asset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/AssetRevision" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetRevision implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The timestamp of when an inventory asset revison was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Amazon DataZone user who created the asset revision.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The Amazon DataZone user who created the inventory asset.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The identifier of the inventory asset revision.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The revision details of the inventory asset.
     * </p>
     */
    private String revision;

    /**
     * <p>
     * The timestamp of when an inventory asset revison was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when an inventory asset revison was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when an inventory asset revison was created.
     * </p>
     * 
     * @return The timestamp of when an inventory asset revison was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when an inventory asset revison was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when an inventory asset revison was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetRevision withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the asset revision.
     * </p>
     * 
     * @param createdBy
     *        The Amazon DataZone user who created the asset revision.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the asset revision.
     * </p>
     * 
     * @return The Amazon DataZone user who created the asset revision.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the asset revision.
     * </p>
     * 
     * @param createdBy
     *        The Amazon DataZone user who created the asset revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetRevision withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the inventory asset.
     * </p>
     * 
     * @param domainId
     *        The Amazon DataZone user who created the inventory asset.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the inventory asset.
     * </p>
     * 
     * @return The Amazon DataZone user who created the inventory asset.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the inventory asset.
     * </p>
     * 
     * @param domainId
     *        The Amazon DataZone user who created the inventory asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetRevision withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The identifier of the inventory asset revision.
     * </p>
     * 
     * @param id
     *        The identifier of the inventory asset revision.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the inventory asset revision.
     * </p>
     * 
     * @return The identifier of the inventory asset revision.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the inventory asset revision.
     * </p>
     * 
     * @param id
     *        The identifier of the inventory asset revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetRevision withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The revision details of the inventory asset.
     * </p>
     * 
     * @param revision
     *        The revision details of the inventory asset.
     */

    public void setRevision(String revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * The revision details of the inventory asset.
     * </p>
     * 
     * @return The revision details of the inventory asset.
     */

    public String getRevision() {
        return this.revision;
    }

    /**
     * <p>
     * The revision details of the inventory asset.
     * </p>
     * 
     * @param revision
     *        The revision details of the inventory asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetRevision withRevision(String revision) {
        setRevision(revision);
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
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getRevision() != null)
            sb.append("Revision: ").append(getRevision());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetRevision == false)
            return false;
        AssetRevision other = (AssetRevision) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        return hashCode;
    }

    @Override
    public AssetRevision clone() {
        try {
            return (AssetRevision) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.AssetRevisionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
