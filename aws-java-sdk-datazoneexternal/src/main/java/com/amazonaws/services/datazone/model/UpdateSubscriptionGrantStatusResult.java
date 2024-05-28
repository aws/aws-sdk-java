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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateSubscriptionGrantStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSubscriptionGrantStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The details of the asset for which the subscription grant is created.
     * </p>
     */
    private java.util.List<SubscribedAsset> assets;
    /**
     * <p>
     * The timestamp of when the subscription grant status was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Amazon DataZone domain user who created the subscription grant status.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a subscription grant status is to be updated.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The granted entity to be updated as part of the <code>UpdateSubscriptionGrantStatus</code> action.
     * </p>
     */
    private GrantedEntity grantedEntity;
    /**
     * <p>
     * The identifier of the subscription grant.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The status to be updated as part of the <code>UpdateSubscriptionGrantStatus</code> action.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The identifier of the subscription.
     * </p>
     */
    private String subscriptionId;
    /**
     * <p>
     * The identifier of the subscription target whose subscription grant status is to be updated.
     * </p>
     */
    private String subscriptionTargetId;
    /**
     * <p>
     * The timestamp of when the subscription grant status is to be updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The Amazon DataZone user who updated the subscription grant status.
     * </p>
     */
    private String updatedBy;

    /**
     * <p>
     * The details of the asset for which the subscription grant is created.
     * </p>
     * 
     * @return The details of the asset for which the subscription grant is created.
     */

    public java.util.List<SubscribedAsset> getAssets() {
        return assets;
    }

    /**
     * <p>
     * The details of the asset for which the subscription grant is created.
     * </p>
     * 
     * @param assets
     *        The details of the asset for which the subscription grant is created.
     */

    public void setAssets(java.util.Collection<SubscribedAsset> assets) {
        if (assets == null) {
            this.assets = null;
            return;
        }

        this.assets = new java.util.ArrayList<SubscribedAsset>(assets);
    }

    /**
     * <p>
     * The details of the asset for which the subscription grant is created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssets(java.util.Collection)} or {@link #withAssets(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param assets
     *        The details of the asset for which the subscription grant is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionGrantStatusResult withAssets(SubscribedAsset... assets) {
        if (this.assets == null) {
            setAssets(new java.util.ArrayList<SubscribedAsset>(assets.length));
        }
        for (SubscribedAsset ele : assets) {
            this.assets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The details of the asset for which the subscription grant is created.
     * </p>
     * 
     * @param assets
     *        The details of the asset for which the subscription grant is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionGrantStatusResult withAssets(java.util.Collection<SubscribedAsset> assets) {
        setAssets(assets);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the subscription grant status was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the subscription grant status was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when the subscription grant status was created.
     * </p>
     * 
     * @return The timestamp of when the subscription grant status was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when the subscription grant status was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the subscription grant status was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionGrantStatusResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Amazon DataZone domain user who created the subscription grant status.
     * </p>
     * 
     * @param createdBy
     *        The Amazon DataZone domain user who created the subscription grant status.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The Amazon DataZone domain user who created the subscription grant status.
     * </p>
     * 
     * @return The Amazon DataZone domain user who created the subscription grant status.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The Amazon DataZone domain user who created the subscription grant status.
     * </p>
     * 
     * @param createdBy
     *        The Amazon DataZone domain user who created the subscription grant status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionGrantStatusResult withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a subscription grant status is to be updated.
     * </p>
     * 
     * @param domainId
     *        The identifier of the Amazon DataZone domain in which a subscription grant status is to be updated.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a subscription grant status is to be updated.
     * </p>
     * 
     * @return The identifier of the Amazon DataZone domain in which a subscription grant status is to be updated.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a subscription grant status is to be updated.
     * </p>
     * 
     * @param domainId
     *        The identifier of the Amazon DataZone domain in which a subscription grant status is to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionGrantStatusResult withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The granted entity to be updated as part of the <code>UpdateSubscriptionGrantStatus</code> action.
     * </p>
     * 
     * @param grantedEntity
     *        The granted entity to be updated as part of the <code>UpdateSubscriptionGrantStatus</code> action.
     */

    public void setGrantedEntity(GrantedEntity grantedEntity) {
        this.grantedEntity = grantedEntity;
    }

    /**
     * <p>
     * The granted entity to be updated as part of the <code>UpdateSubscriptionGrantStatus</code> action.
     * </p>
     * 
     * @return The granted entity to be updated as part of the <code>UpdateSubscriptionGrantStatus</code> action.
     */

    public GrantedEntity getGrantedEntity() {
        return this.grantedEntity;
    }

    /**
     * <p>
     * The granted entity to be updated as part of the <code>UpdateSubscriptionGrantStatus</code> action.
     * </p>
     * 
     * @param grantedEntity
     *        The granted entity to be updated as part of the <code>UpdateSubscriptionGrantStatus</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionGrantStatusResult withGrantedEntity(GrantedEntity grantedEntity) {
        setGrantedEntity(grantedEntity);
        return this;
    }

    /**
     * <p>
     * The identifier of the subscription grant.
     * </p>
     * 
     * @param id
     *        The identifier of the subscription grant.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the subscription grant.
     * </p>
     * 
     * @return The identifier of the subscription grant.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the subscription grant.
     * </p>
     * 
     * @param id
     *        The identifier of the subscription grant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionGrantStatusResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The status to be updated as part of the <code>UpdateSubscriptionGrantStatus</code> action.
     * </p>
     * 
     * @param status
     *        The status to be updated as part of the <code>UpdateSubscriptionGrantStatus</code> action.
     * @see SubscriptionGrantOverallStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status to be updated as part of the <code>UpdateSubscriptionGrantStatus</code> action.
     * </p>
     * 
     * @return The status to be updated as part of the <code>UpdateSubscriptionGrantStatus</code> action.
     * @see SubscriptionGrantOverallStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status to be updated as part of the <code>UpdateSubscriptionGrantStatus</code> action.
     * </p>
     * 
     * @param status
     *        The status to be updated as part of the <code>UpdateSubscriptionGrantStatus</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriptionGrantOverallStatus
     */

    public UpdateSubscriptionGrantStatusResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status to be updated as part of the <code>UpdateSubscriptionGrantStatus</code> action.
     * </p>
     * 
     * @param status
     *        The status to be updated as part of the <code>UpdateSubscriptionGrantStatus</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriptionGrantOverallStatus
     */

    public UpdateSubscriptionGrantStatusResult withStatus(SubscriptionGrantOverallStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the subscription.
     * </p>
     * 
     * @param subscriptionId
     *        The identifier of the subscription.
     */

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * <p>
     * The identifier of the subscription.
     * </p>
     * 
     * @return The identifier of the subscription.
     */

    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * <p>
     * The identifier of the subscription.
     * </p>
     * 
     * @param subscriptionId
     *        The identifier of the subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionGrantStatusResult withSubscriptionId(String subscriptionId) {
        setSubscriptionId(subscriptionId);
        return this;
    }

    /**
     * <p>
     * The identifier of the subscription target whose subscription grant status is to be updated.
     * </p>
     * 
     * @param subscriptionTargetId
     *        The identifier of the subscription target whose subscription grant status is to be updated.
     */

    public void setSubscriptionTargetId(String subscriptionTargetId) {
        this.subscriptionTargetId = subscriptionTargetId;
    }

    /**
     * <p>
     * The identifier of the subscription target whose subscription grant status is to be updated.
     * </p>
     * 
     * @return The identifier of the subscription target whose subscription grant status is to be updated.
     */

    public String getSubscriptionTargetId() {
        return this.subscriptionTargetId;
    }

    /**
     * <p>
     * The identifier of the subscription target whose subscription grant status is to be updated.
     * </p>
     * 
     * @param subscriptionTargetId
     *        The identifier of the subscription target whose subscription grant status is to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionGrantStatusResult withSubscriptionTargetId(String subscriptionTargetId) {
        setSubscriptionTargetId(subscriptionTargetId);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the subscription grant status is to be updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the subscription grant status is to be updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the subscription grant status is to be updated.
     * </p>
     * 
     * @return The timestamp of when the subscription grant status is to be updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the subscription grant status is to be updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the subscription grant status is to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionGrantStatusResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The Amazon DataZone user who updated the subscription grant status.
     * </p>
     * 
     * @param updatedBy
     *        The Amazon DataZone user who updated the subscription grant status.
     */

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who updated the subscription grant status.
     * </p>
     * 
     * @return The Amazon DataZone user who updated the subscription grant status.
     */

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who updated the subscription grant status.
     * </p>
     * 
     * @param updatedBy
     *        The Amazon DataZone user who updated the subscription grant status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionGrantStatusResult withUpdatedBy(String updatedBy) {
        setUpdatedBy(updatedBy);
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
        if (getAssets() != null)
            sb.append("Assets: ").append(getAssets()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getGrantedEntity() != null)
            sb.append("GrantedEntity: ").append(getGrantedEntity()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSubscriptionId() != null)
            sb.append("SubscriptionId: ").append(getSubscriptionId()).append(",");
        if (getSubscriptionTargetId() != null)
            sb.append("SubscriptionTargetId: ").append(getSubscriptionTargetId()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getUpdatedBy() != null)
            sb.append("UpdatedBy: ").append(getUpdatedBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSubscriptionGrantStatusResult == false)
            return false;
        UpdateSubscriptionGrantStatusResult other = (UpdateSubscriptionGrantStatusResult) obj;
        if (other.getAssets() == null ^ this.getAssets() == null)
            return false;
        if (other.getAssets() != null && other.getAssets().equals(this.getAssets()) == false)
            return false;
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
        if (other.getGrantedEntity() == null ^ this.getGrantedEntity() == null)
            return false;
        if (other.getGrantedEntity() != null && other.getGrantedEntity().equals(this.getGrantedEntity()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSubscriptionId() == null ^ this.getSubscriptionId() == null)
            return false;
        if (other.getSubscriptionId() != null && other.getSubscriptionId().equals(this.getSubscriptionId()) == false)
            return false;
        if (other.getSubscriptionTargetId() == null ^ this.getSubscriptionTargetId() == null)
            return false;
        if (other.getSubscriptionTargetId() != null && other.getSubscriptionTargetId().equals(this.getSubscriptionTargetId()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getUpdatedBy() == null ^ this.getUpdatedBy() == null)
            return false;
        if (other.getUpdatedBy() != null && other.getUpdatedBy().equals(this.getUpdatedBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssets() == null) ? 0 : getAssets().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getGrantedEntity() == null) ? 0 : getGrantedEntity().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionId() == null) ? 0 : getSubscriptionId().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionTargetId() == null) ? 0 : getSubscriptionTargetId().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedBy() == null) ? 0 : getUpdatedBy().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSubscriptionGrantStatusResult clone() {
        try {
            return (UpdateSubscriptionGrantStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
