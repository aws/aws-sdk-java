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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/FindingSummaryV2" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FindingSummaryV2 implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time at which the resource-based policy or IAM entity that generated the finding was analyzed.
     * </p>
     */
    private java.util.Date analyzedAt;
    /**
     * <p>
     * The time at which the finding was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The error that resulted in an Error finding.
     * </p>
     */
    private String error;
    /**
     * <p>
     * The ID of the finding.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The resource that the external principal has access to.
     * </p>
     */
    private String resource;
    /**
     * <p>
     * The type of the resource that the external principal has access to.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The Amazon Web Services account ID that owns the resource.
     * </p>
     */
    private String resourceOwnerAccount;
    /**
     * <p>
     * The status of the finding.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The time at which the finding was most recently updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The type of the external access or unused access finding.
     * </p>
     */
    private String findingType;

    /**
     * <p>
     * The time at which the resource-based policy or IAM entity that generated the finding was analyzed.
     * </p>
     * 
     * @param analyzedAt
     *        The time at which the resource-based policy or IAM entity that generated the finding was analyzed.
     */

    public void setAnalyzedAt(java.util.Date analyzedAt) {
        this.analyzedAt = analyzedAt;
    }

    /**
     * <p>
     * The time at which the resource-based policy or IAM entity that generated the finding was analyzed.
     * </p>
     * 
     * @return The time at which the resource-based policy or IAM entity that generated the finding was analyzed.
     */

    public java.util.Date getAnalyzedAt() {
        return this.analyzedAt;
    }

    /**
     * <p>
     * The time at which the resource-based policy or IAM entity that generated the finding was analyzed.
     * </p>
     * 
     * @param analyzedAt
     *        The time at which the resource-based policy or IAM entity that generated the finding was analyzed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingSummaryV2 withAnalyzedAt(java.util.Date analyzedAt) {
        setAnalyzedAt(analyzedAt);
        return this;
    }

    /**
     * <p>
     * The time at which the finding was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the finding was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which the finding was created.
     * </p>
     * 
     * @return The time at which the finding was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time at which the finding was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the finding was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingSummaryV2 withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The error that resulted in an Error finding.
     * </p>
     * 
     * @param error
     *        The error that resulted in an Error finding.
     */

    public void setError(String error) {
        this.error = error;
    }

    /**
     * <p>
     * The error that resulted in an Error finding.
     * </p>
     * 
     * @return The error that resulted in an Error finding.
     */

    public String getError() {
        return this.error;
    }

    /**
     * <p>
     * The error that resulted in an Error finding.
     * </p>
     * 
     * @param error
     *        The error that resulted in an Error finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingSummaryV2 withError(String error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * The ID of the finding.
     * </p>
     * 
     * @param id
     *        The ID of the finding.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the finding.
     * </p>
     * 
     * @return The ID of the finding.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the finding.
     * </p>
     * 
     * @param id
     *        The ID of the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingSummaryV2 withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The resource that the external principal has access to.
     * </p>
     * 
     * @param resource
     *        The resource that the external principal has access to.
     */

    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The resource that the external principal has access to.
     * </p>
     * 
     * @return The resource that the external principal has access to.
     */

    public String getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The resource that the external principal has access to.
     * </p>
     * 
     * @param resource
     *        The resource that the external principal has access to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingSummaryV2 withResource(String resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * The type of the resource that the external principal has access to.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource that the external principal has access to.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the resource that the external principal has access to.
     * </p>
     * 
     * @return The type of the resource that the external principal has access to.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of the resource that the external principal has access to.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource that the external principal has access to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public FindingSummaryV2 withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of the resource that the external principal has access to.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource that the external principal has access to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public FindingSummaryV2 withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID that owns the resource.
     * </p>
     * 
     * @param resourceOwnerAccount
     *        The Amazon Web Services account ID that owns the resource.
     */

    public void setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
    }

    /**
     * <p>
     * The Amazon Web Services account ID that owns the resource.
     * </p>
     * 
     * @return The Amazon Web Services account ID that owns the resource.
     */

    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * <p>
     * The Amazon Web Services account ID that owns the resource.
     * </p>
     * 
     * @param resourceOwnerAccount
     *        The Amazon Web Services account ID that owns the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingSummaryV2 withResourceOwnerAccount(String resourceOwnerAccount) {
        setResourceOwnerAccount(resourceOwnerAccount);
        return this;
    }

    /**
     * <p>
     * The status of the finding.
     * </p>
     * 
     * @param status
     *        The status of the finding.
     * @see FindingStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the finding.
     * </p>
     * 
     * @return The status of the finding.
     * @see FindingStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the finding.
     * </p>
     * 
     * @param status
     *        The status of the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingStatus
     */

    public FindingSummaryV2 withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the finding.
     * </p>
     * 
     * @param status
     *        The status of the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingStatus
     */

    public FindingSummaryV2 withStatus(FindingStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time at which the finding was most recently updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the finding was most recently updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The time at which the finding was most recently updated.
     * </p>
     * 
     * @return The time at which the finding was most recently updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The time at which the finding was most recently updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the finding was most recently updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingSummaryV2 withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The type of the external access or unused access finding.
     * </p>
     * 
     * @param findingType
     *        The type of the external access or unused access finding.
     * @see FindingType
     */

    public void setFindingType(String findingType) {
        this.findingType = findingType;
    }

    /**
     * <p>
     * The type of the external access or unused access finding.
     * </p>
     * 
     * @return The type of the external access or unused access finding.
     * @see FindingType
     */

    public String getFindingType() {
        return this.findingType;
    }

    /**
     * <p>
     * The type of the external access or unused access finding.
     * </p>
     * 
     * @param findingType
     *        The type of the external access or unused access finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingType
     */

    public FindingSummaryV2 withFindingType(String findingType) {
        setFindingType(findingType);
        return this;
    }

    /**
     * <p>
     * The type of the external access or unused access finding.
     * </p>
     * 
     * @param findingType
     *        The type of the external access or unused access finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingType
     */

    public FindingSummaryV2 withFindingType(FindingType findingType) {
        this.findingType = findingType.toString();
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
        if (getAnalyzedAt() != null)
            sb.append("AnalyzedAt: ").append(getAnalyzedAt()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceOwnerAccount() != null)
            sb.append("ResourceOwnerAccount: ").append(getResourceOwnerAccount()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getFindingType() != null)
            sb.append("FindingType: ").append(getFindingType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FindingSummaryV2 == false)
            return false;
        FindingSummaryV2 other = (FindingSummaryV2) obj;
        if (other.getAnalyzedAt() == null ^ this.getAnalyzedAt() == null)
            return false;
        if (other.getAnalyzedAt() != null && other.getAnalyzedAt().equals(this.getAnalyzedAt()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceOwnerAccount() == null ^ this.getResourceOwnerAccount() == null)
            return false;
        if (other.getResourceOwnerAccount() != null && other.getResourceOwnerAccount().equals(this.getResourceOwnerAccount()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getFindingType() == null ^ this.getFindingType() == null)
            return false;
        if (other.getFindingType() != null && other.getFindingType().equals(this.getFindingType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnalyzedAt() == null) ? 0 : getAnalyzedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceOwnerAccount() == null) ? 0 : getResourceOwnerAccount().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getFindingType() == null) ? 0 : getFindingType().hashCode());
        return hashCode;
    }

    @Override
    public FindingSummaryV2 clone() {
        try {
            return (FindingSummaryV2) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.FindingSummaryV2Marshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
