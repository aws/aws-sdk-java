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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetMetadataGenerationRun" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMetadataGenerationRunResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The timestamp of when the metadata generation run was start.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Amazon DataZone user who started the metadata generation run.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The ID of the Amazon DataZone domain the metadata generation run of which you want to get.
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
     * The ID of the project that owns the assets for which you're running metadata generation.
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
     * The asset for which you're generating metadata.
     * </p>
     */
    private MetadataGenerationRunTarget target;
    /**
     * <p>
     * The type of metadata generation run.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The timestamp of when the metadata generation run was start.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the metadata generation run was start.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when the metadata generation run was start.
     * </p>
     * 
     * @return The timestamp of when the metadata generation run was start.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when the metadata generation run was start.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the metadata generation run was start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetadataGenerationRunResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Amazon DataZone user who started the metadata generation run.
     * </p>
     * 
     * @param createdBy
     *        The Amazon DataZone user who started the metadata generation run.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who started the metadata generation run.
     * </p>
     * 
     * @return The Amazon DataZone user who started the metadata generation run.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who started the metadata generation run.
     * </p>
     * 
     * @param createdBy
     *        The Amazon DataZone user who started the metadata generation run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetadataGenerationRunResult withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain the metadata generation run of which you want to get.
     * </p>
     * 
     * @param domainId
     *        The ID of the Amazon DataZone domain the metadata generation run of which you want to get.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain the metadata generation run of which you want to get.
     * </p>
     * 
     * @return The ID of the Amazon DataZone domain the metadata generation run of which you want to get.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain the metadata generation run of which you want to get.
     * </p>
     * 
     * @param domainId
     *        The ID of the Amazon DataZone domain the metadata generation run of which you want to get.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetadataGenerationRunResult withDomainId(String domainId) {
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

    public GetMetadataGenerationRunResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The ID of the project that owns the assets for which you're running metadata generation.
     * </p>
     * 
     * @param owningProjectId
     *        The ID of the project that owns the assets for which you're running metadata generation.
     */

    public void setOwningProjectId(String owningProjectId) {
        this.owningProjectId = owningProjectId;
    }

    /**
     * <p>
     * The ID of the project that owns the assets for which you're running metadata generation.
     * </p>
     * 
     * @return The ID of the project that owns the assets for which you're running metadata generation.
     */

    public String getOwningProjectId() {
        return this.owningProjectId;
    }

    /**
     * <p>
     * The ID of the project that owns the assets for which you're running metadata generation.
     * </p>
     * 
     * @param owningProjectId
     *        The ID of the project that owns the assets for which you're running metadata generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetadataGenerationRunResult withOwningProjectId(String owningProjectId) {
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

    public GetMetadataGenerationRunResult withStatus(String status) {
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

    public GetMetadataGenerationRunResult withStatus(MetadataGenerationRunStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The asset for which you're generating metadata.
     * </p>
     * 
     * @param target
     *        The asset for which you're generating metadata.
     */

    public void setTarget(MetadataGenerationRunTarget target) {
        this.target = target;
    }

    /**
     * <p>
     * The asset for which you're generating metadata.
     * </p>
     * 
     * @return The asset for which you're generating metadata.
     */

    public MetadataGenerationRunTarget getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The asset for which you're generating metadata.
     * </p>
     * 
     * @param target
     *        The asset for which you're generating metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetadataGenerationRunResult withTarget(MetadataGenerationRunTarget target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * The type of metadata generation run.
     * </p>
     * 
     * @param type
     *        The type of metadata generation run.
     * @see MetadataGenerationRunType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of metadata generation run.
     * </p>
     * 
     * @return The type of metadata generation run.
     * @see MetadataGenerationRunType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of metadata generation run.
     * </p>
     * 
     * @param type
     *        The type of metadata generation run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetadataGenerationRunType
     */

    public GetMetadataGenerationRunResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of metadata generation run.
     * </p>
     * 
     * @param type
     *        The type of metadata generation run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetadataGenerationRunType
     */

    public GetMetadataGenerationRunResult withType(MetadataGenerationRunType type) {
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
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
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

        if (obj instanceof GetMetadataGenerationRunResult == false)
            return false;
        GetMetadataGenerationRunResult other = (GetMetadataGenerationRunResult) obj;
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
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
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
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public GetMetadataGenerationRunResult clone() {
        try {
            return (GetMetadataGenerationRunResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
