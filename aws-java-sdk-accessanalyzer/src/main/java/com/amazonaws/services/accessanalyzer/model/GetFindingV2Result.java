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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/GetFindingV2" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFindingV2Result extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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
     * An error.
     * </p>
     */
    private String error;
    /**
     * <p>
     * The ID of the finding to retrieve.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The resource that generated the finding.
     * </p>
     */
    private String resource;
    /**
     * <p>
     * The type of the resource identified in the finding.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Tye Amazon Web Services account ID that owns the resource.
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
     * The time at which the finding was updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * A localized message that explains the finding and provides guidance on how to address it.
     * </p>
     */
    private java.util.List<FindingDetails> findingDetails;
    /**
     * <p>
     * The type of the finding. For external access analyzers, the type is <code>ExternalAccess</code>. For unused
     * access analyzers, the type can be <code>UnusedIAMRole</code>, <code>UnusedIAMUserAccessKey</code>,
     * <code>UnusedIAMUserPassword</code>, or <code>UnusedPermission</code>.
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

    public GetFindingV2Result withAnalyzedAt(java.util.Date analyzedAt) {
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

    public GetFindingV2Result withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * An error.
     * </p>
     * 
     * @param error
     *        An error.
     */

    public void setError(String error) {
        this.error = error;
    }

    /**
     * <p>
     * An error.
     * </p>
     * 
     * @return An error.
     */

    public String getError() {
        return this.error;
    }

    /**
     * <p>
     * An error.
     * </p>
     * 
     * @param error
     *        An error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingV2Result withError(String error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * The ID of the finding to retrieve.
     * </p>
     * 
     * @param id
     *        The ID of the finding to retrieve.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the finding to retrieve.
     * </p>
     * 
     * @return The ID of the finding to retrieve.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the finding to retrieve.
     * </p>
     * 
     * @param id
     *        The ID of the finding to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingV2Result withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * 
     * @param nextToken
     *        A token used for pagination of results returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * 
     * @return A token used for pagination of results returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * 
     * @param nextToken
     *        A token used for pagination of results returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingV2Result withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The resource that generated the finding.
     * </p>
     * 
     * @param resource
     *        The resource that generated the finding.
     */

    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The resource that generated the finding.
     * </p>
     * 
     * @return The resource that generated the finding.
     */

    public String getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The resource that generated the finding.
     * </p>
     * 
     * @param resource
     *        The resource that generated the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingV2Result withResource(String resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * The type of the resource identified in the finding.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource identified in the finding.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the resource identified in the finding.
     * </p>
     * 
     * @return The type of the resource identified in the finding.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of the resource identified in the finding.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource identified in the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public GetFindingV2Result withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of the resource identified in the finding.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource identified in the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public GetFindingV2Result withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * Tye Amazon Web Services account ID that owns the resource.
     * </p>
     * 
     * @param resourceOwnerAccount
     *        Tye Amazon Web Services account ID that owns the resource.
     */

    public void setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
    }

    /**
     * <p>
     * Tye Amazon Web Services account ID that owns the resource.
     * </p>
     * 
     * @return Tye Amazon Web Services account ID that owns the resource.
     */

    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * <p>
     * Tye Amazon Web Services account ID that owns the resource.
     * </p>
     * 
     * @param resourceOwnerAccount
     *        Tye Amazon Web Services account ID that owns the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingV2Result withResourceOwnerAccount(String resourceOwnerAccount) {
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

    public GetFindingV2Result withStatus(String status) {
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

    public GetFindingV2Result withStatus(FindingStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time at which the finding was updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the finding was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The time at which the finding was updated.
     * </p>
     * 
     * @return The time at which the finding was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The time at which the finding was updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the finding was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingV2Result withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * A localized message that explains the finding and provides guidance on how to address it.
     * </p>
     * 
     * @return A localized message that explains the finding and provides guidance on how to address it.
     */

    public java.util.List<FindingDetails> getFindingDetails() {
        return findingDetails;
    }

    /**
     * <p>
     * A localized message that explains the finding and provides guidance on how to address it.
     * </p>
     * 
     * @param findingDetails
     *        A localized message that explains the finding and provides guidance on how to address it.
     */

    public void setFindingDetails(java.util.Collection<FindingDetails> findingDetails) {
        if (findingDetails == null) {
            this.findingDetails = null;
            return;
        }

        this.findingDetails = new java.util.ArrayList<FindingDetails>(findingDetails);
    }

    /**
     * <p>
     * A localized message that explains the finding and provides guidance on how to address it.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFindingDetails(java.util.Collection)} or {@link #withFindingDetails(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param findingDetails
     *        A localized message that explains the finding and provides guidance on how to address it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingV2Result withFindingDetails(FindingDetails... findingDetails) {
        if (this.findingDetails == null) {
            setFindingDetails(new java.util.ArrayList<FindingDetails>(findingDetails.length));
        }
        for (FindingDetails ele : findingDetails) {
            this.findingDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A localized message that explains the finding and provides guidance on how to address it.
     * </p>
     * 
     * @param findingDetails
     *        A localized message that explains the finding and provides guidance on how to address it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingV2Result withFindingDetails(java.util.Collection<FindingDetails> findingDetails) {
        setFindingDetails(findingDetails);
        return this;
    }

    /**
     * <p>
     * The type of the finding. For external access analyzers, the type is <code>ExternalAccess</code>. For unused
     * access analyzers, the type can be <code>UnusedIAMRole</code>, <code>UnusedIAMUserAccessKey</code>,
     * <code>UnusedIAMUserPassword</code>, or <code>UnusedPermission</code>.
     * </p>
     * 
     * @param findingType
     *        The type of the finding. For external access analyzers, the type is <code>ExternalAccess</code>. For
     *        unused access analyzers, the type can be <code>UnusedIAMRole</code>, <code>UnusedIAMUserAccessKey</code>,
     *        <code>UnusedIAMUserPassword</code>, or <code>UnusedPermission</code>.
     * @see FindingType
     */

    public void setFindingType(String findingType) {
        this.findingType = findingType;
    }

    /**
     * <p>
     * The type of the finding. For external access analyzers, the type is <code>ExternalAccess</code>. For unused
     * access analyzers, the type can be <code>UnusedIAMRole</code>, <code>UnusedIAMUserAccessKey</code>,
     * <code>UnusedIAMUserPassword</code>, or <code>UnusedPermission</code>.
     * </p>
     * 
     * @return The type of the finding. For external access analyzers, the type is <code>ExternalAccess</code>. For
     *         unused access analyzers, the type can be <code>UnusedIAMRole</code>, <code>UnusedIAMUserAccessKey</code>,
     *         <code>UnusedIAMUserPassword</code>, or <code>UnusedPermission</code>.
     * @see FindingType
     */

    public String getFindingType() {
        return this.findingType;
    }

    /**
     * <p>
     * The type of the finding. For external access analyzers, the type is <code>ExternalAccess</code>. For unused
     * access analyzers, the type can be <code>UnusedIAMRole</code>, <code>UnusedIAMUserAccessKey</code>,
     * <code>UnusedIAMUserPassword</code>, or <code>UnusedPermission</code>.
     * </p>
     * 
     * @param findingType
     *        The type of the finding. For external access analyzers, the type is <code>ExternalAccess</code>. For
     *        unused access analyzers, the type can be <code>UnusedIAMRole</code>, <code>UnusedIAMUserAccessKey</code>,
     *        <code>UnusedIAMUserPassword</code>, or <code>UnusedPermission</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingType
     */

    public GetFindingV2Result withFindingType(String findingType) {
        setFindingType(findingType);
        return this;
    }

    /**
     * <p>
     * The type of the finding. For external access analyzers, the type is <code>ExternalAccess</code>. For unused
     * access analyzers, the type can be <code>UnusedIAMRole</code>, <code>UnusedIAMUserAccessKey</code>,
     * <code>UnusedIAMUserPassword</code>, or <code>UnusedPermission</code>.
     * </p>
     * 
     * @param findingType
     *        The type of the finding. For external access analyzers, the type is <code>ExternalAccess</code>. For
     *        unused access analyzers, the type can be <code>UnusedIAMRole</code>, <code>UnusedIAMUserAccessKey</code>,
     *        <code>UnusedIAMUserPassword</code>, or <code>UnusedPermission</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingType
     */

    public GetFindingV2Result withFindingType(FindingType findingType) {
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
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
        if (getFindingDetails() != null)
            sb.append("FindingDetails: ").append(getFindingDetails()).append(",");
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

        if (obj instanceof GetFindingV2Result == false)
            return false;
        GetFindingV2Result other = (GetFindingV2Result) obj;
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
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
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
        if (other.getFindingDetails() == null ^ this.getFindingDetails() == null)
            return false;
        if (other.getFindingDetails() != null && other.getFindingDetails().equals(this.getFindingDetails()) == false)
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
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceOwnerAccount() == null) ? 0 : getResourceOwnerAccount().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getFindingDetails() == null) ? 0 : getFindingDetails().hashCode());
        hashCode = prime * hashCode + ((getFindingType() == null) ? 0 : getFindingType().hashCode());
        return hashCode;
    }

    @Override
    public GetFindingV2Result clone() {
        try {
            return (GetFindingV2Result) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
