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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/StartMetadataGenerationRun"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartMetadataGenerationRunResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The timestamp at which the metadata generation run was started.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The ID of the user who started the metadata generation run.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the metadata generation run was started.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The ID of the metadata generation run.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The ID of the project that owns the asset for which the metadata generation run was started.
     * </p>
     */
    private String owningProjectId;
    /**
     * <p>
     * The status of the metadata generation run.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The type of the metadata generation run.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The timestamp at which the metadata generation run was started.
     * </p>
     * 
     * @param createdAt
     *        The timestamp at which the metadata generation run was started.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp at which the metadata generation run was started.
     * </p>
     * 
     * @return The timestamp at which the metadata generation run was started.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp at which the metadata generation run was started.
     * </p>
     * 
     * @param createdAt
     *        The timestamp at which the metadata generation run was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMetadataGenerationRunResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The ID of the user who started the metadata generation run.
     * </p>
     * 
     * @param createdBy
     *        The ID of the user who started the metadata generation run.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The ID of the user who started the metadata generation run.
     * </p>
     * 
     * @return The ID of the user who started the metadata generation run.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The ID of the user who started the metadata generation run.
     * </p>
     * 
     * @param createdBy
     *        The ID of the user who started the metadata generation run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMetadataGenerationRunResult withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the metadata generation run was started.
     * </p>
     * 
     * @param domainId
     *        The ID of the Amazon DataZone domain in which the metadata generation run was started.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the metadata generation run was started.
     * </p>
     * 
     * @return The ID of the Amazon DataZone domain in which the metadata generation run was started.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the metadata generation run was started.
     * </p>
     * 
     * @param domainId
     *        The ID of the Amazon DataZone domain in which the metadata generation run was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMetadataGenerationRunResult withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The ID of the metadata generation run.
     * </p>
     * 
     * @param id
     *        The ID of the metadata generation run.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the metadata generation run.
     * </p>
     * 
     * @return The ID of the metadata generation run.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the metadata generation run.
     * </p>
     * 
     * @param id
     *        The ID of the metadata generation run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMetadataGenerationRunResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The ID of the project that owns the asset for which the metadata generation run was started.
     * </p>
     * 
     * @param owningProjectId
     *        The ID of the project that owns the asset for which the metadata generation run was started.
     */

    public void setOwningProjectId(String owningProjectId) {
        this.owningProjectId = owningProjectId;
    }

    /**
     * <p>
     * The ID of the project that owns the asset for which the metadata generation run was started.
     * </p>
     * 
     * @return The ID of the project that owns the asset for which the metadata generation run was started.
     */

    public String getOwningProjectId() {
        return this.owningProjectId;
    }

    /**
     * <p>
     * The ID of the project that owns the asset for which the metadata generation run was started.
     * </p>
     * 
     * @param owningProjectId
     *        The ID of the project that owns the asset for which the metadata generation run was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMetadataGenerationRunResult withOwningProjectId(String owningProjectId) {
        setOwningProjectId(owningProjectId);
        return this;
    }

    /**
     * <p>
     * The status of the metadata generation run.
     * </p>
     * 
     * @param status
     *        The status of the metadata generation run.
     * @see MetadataGenerationRunStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the metadata generation run.
     * </p>
     * 
     * @return The status of the metadata generation run.
     * @see MetadataGenerationRunStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the metadata generation run.
     * </p>
     * 
     * @param status
     *        The status of the metadata generation run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetadataGenerationRunStatus
     */

    public StartMetadataGenerationRunResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the metadata generation run.
     * </p>
     * 
     * @param status
     *        The status of the metadata generation run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetadataGenerationRunStatus
     */

    public StartMetadataGenerationRunResult withStatus(MetadataGenerationRunStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The type of the metadata generation run.
     * </p>
     * 
     * @param type
     *        The type of the metadata generation run.
     * @see MetadataGenerationRunType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the metadata generation run.
     * </p>
     * 
     * @return The type of the metadata generation run.
     * @see MetadataGenerationRunType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the metadata generation run.
     * </p>
     * 
     * @param type
     *        The type of the metadata generation run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetadataGenerationRunType
     */

    public StartMetadataGenerationRunResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the metadata generation run.
     * </p>
     * 
     * @param type
     *        The type of the metadata generation run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetadataGenerationRunType
     */

    public StartMetadataGenerationRunResult withType(MetadataGenerationRunType type) {
        this.type = type.toString();
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
        if (getOwningProjectId() != null)
            sb.append("OwningProjectId: ").append(getOwningProjectId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartMetadataGenerationRunResult == false)
            return false;
        StartMetadataGenerationRunResult other = (StartMetadataGenerationRunResult) obj;
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
        if (other.getOwningProjectId() == null ^ this.getOwningProjectId() == null)
            return false;
        if (other.getOwningProjectId() != null && other.getOwningProjectId().equals(this.getOwningProjectId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
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
        hashCode = prime * hashCode + ((getOwningProjectId() == null) ? 0 : getOwningProjectId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public StartMetadataGenerationRunResult clone() {
        try {
            return (StartMetadataGenerationRunResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
