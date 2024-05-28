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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/RevokeSubscription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RevokeSubscriptionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The timestamp of when the subscription was revoked.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The identifier of the user who revoked the subscription.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The identifier of the Amazon DataZone domain where you want to revoke a subscription.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The identifier of the revoked subscription.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Specifies whether permissions are retained when the subscription is revoked.
     * </p>
     */
    private Boolean retainPermissions;
    /**
     * <p>
     * The status of the revoked subscription.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The subscribed listing of the revoked subscription.
     * </p>
     */
    private SubscribedListing subscribedListing;
    /**
     * <p>
     * The subscribed principal of the revoked subscription.
     * </p>
     */
    private SubscribedPrincipal subscribedPrincipal;
    /**
     * <p>
     * The identifier of the subscription request for the revoked subscription.
     * </p>
     */
    private String subscriptionRequestId;
    /**
     * <p>
     * The timestamp of when the subscription was revoked.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The Amazon DataZone user who revoked the subscription.
     * </p>
     */
    private String updatedBy;

    /**
     * <p>
     * The timestamp of when the subscription was revoked.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the subscription was revoked.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when the subscription was revoked.
     * </p>
     * 
     * @return The timestamp of when the subscription was revoked.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when the subscription was revoked.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the subscription was revoked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSubscriptionResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The identifier of the user who revoked the subscription.
     * </p>
     * 
     * @param createdBy
     *        The identifier of the user who revoked the subscription.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The identifier of the user who revoked the subscription.
     * </p>
     * 
     * @return The identifier of the user who revoked the subscription.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The identifier of the user who revoked the subscription.
     * </p>
     * 
     * @param createdBy
     *        The identifier of the user who revoked the subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSubscriptionResult withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain where you want to revoke a subscription.
     * </p>
     * 
     * @param domainId
     *        The identifier of the Amazon DataZone domain where you want to revoke a subscription.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain where you want to revoke a subscription.
     * </p>
     * 
     * @return The identifier of the Amazon DataZone domain where you want to revoke a subscription.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain where you want to revoke a subscription.
     * </p>
     * 
     * @param domainId
     *        The identifier of the Amazon DataZone domain where you want to revoke a subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSubscriptionResult withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The identifier of the revoked subscription.
     * </p>
     * 
     * @param id
     *        The identifier of the revoked subscription.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the revoked subscription.
     * </p>
     * 
     * @return The identifier of the revoked subscription.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the revoked subscription.
     * </p>
     * 
     * @param id
     *        The identifier of the revoked subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSubscriptionResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Specifies whether permissions are retained when the subscription is revoked.
     * </p>
     * 
     * @param retainPermissions
     *        Specifies whether permissions are retained when the subscription is revoked.
     */

    public void setRetainPermissions(Boolean retainPermissions) {
        this.retainPermissions = retainPermissions;
    }

    /**
     * <p>
     * Specifies whether permissions are retained when the subscription is revoked.
     * </p>
     * 
     * @return Specifies whether permissions are retained when the subscription is revoked.
     */

    public Boolean getRetainPermissions() {
        return this.retainPermissions;
    }

    /**
     * <p>
     * Specifies whether permissions are retained when the subscription is revoked.
     * </p>
     * 
     * @param retainPermissions
     *        Specifies whether permissions are retained when the subscription is revoked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSubscriptionResult withRetainPermissions(Boolean retainPermissions) {
        setRetainPermissions(retainPermissions);
        return this;
    }

    /**
     * <p>
     * Specifies whether permissions are retained when the subscription is revoked.
     * </p>
     * 
     * @return Specifies whether permissions are retained when the subscription is revoked.
     */

    public Boolean isRetainPermissions() {
        return this.retainPermissions;
    }

    /**
     * <p>
     * The status of the revoked subscription.
     * </p>
     * 
     * @param status
     *        The status of the revoked subscription.
     * @see SubscriptionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the revoked subscription.
     * </p>
     * 
     * @return The status of the revoked subscription.
     * @see SubscriptionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the revoked subscription.
     * </p>
     * 
     * @param status
     *        The status of the revoked subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriptionStatus
     */

    public RevokeSubscriptionResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the revoked subscription.
     * </p>
     * 
     * @param status
     *        The status of the revoked subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriptionStatus
     */

    public RevokeSubscriptionResult withStatus(SubscriptionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The subscribed listing of the revoked subscription.
     * </p>
     * 
     * @param subscribedListing
     *        The subscribed listing of the revoked subscription.
     */

    public void setSubscribedListing(SubscribedListing subscribedListing) {
        this.subscribedListing = subscribedListing;
    }

    /**
     * <p>
     * The subscribed listing of the revoked subscription.
     * </p>
     * 
     * @return The subscribed listing of the revoked subscription.
     */

    public SubscribedListing getSubscribedListing() {
        return this.subscribedListing;
    }

    /**
     * <p>
     * The subscribed listing of the revoked subscription.
     * </p>
     * 
     * @param subscribedListing
     *        The subscribed listing of the revoked subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSubscriptionResult withSubscribedListing(SubscribedListing subscribedListing) {
        setSubscribedListing(subscribedListing);
        return this;
    }

    /**
     * <p>
     * The subscribed principal of the revoked subscription.
     * </p>
     * 
     * @param subscribedPrincipal
     *        The subscribed principal of the revoked subscription.
     */

    public void setSubscribedPrincipal(SubscribedPrincipal subscribedPrincipal) {
        this.subscribedPrincipal = subscribedPrincipal;
    }

    /**
     * <p>
     * The subscribed principal of the revoked subscription.
     * </p>
     * 
     * @return The subscribed principal of the revoked subscription.
     */

    public SubscribedPrincipal getSubscribedPrincipal() {
        return this.subscribedPrincipal;
    }

    /**
     * <p>
     * The subscribed principal of the revoked subscription.
     * </p>
     * 
     * @param subscribedPrincipal
     *        The subscribed principal of the revoked subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSubscriptionResult withSubscribedPrincipal(SubscribedPrincipal subscribedPrincipal) {
        setSubscribedPrincipal(subscribedPrincipal);
        return this;
    }

    /**
     * <p>
     * The identifier of the subscription request for the revoked subscription.
     * </p>
     * 
     * @param subscriptionRequestId
     *        The identifier of the subscription request for the revoked subscription.
     */

    public void setSubscriptionRequestId(String subscriptionRequestId) {
        this.subscriptionRequestId = subscriptionRequestId;
    }

    /**
     * <p>
     * The identifier of the subscription request for the revoked subscription.
     * </p>
     * 
     * @return The identifier of the subscription request for the revoked subscription.
     */

    public String getSubscriptionRequestId() {
        return this.subscriptionRequestId;
    }

    /**
     * <p>
     * The identifier of the subscription request for the revoked subscription.
     * </p>
     * 
     * @param subscriptionRequestId
     *        The identifier of the subscription request for the revoked subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSubscriptionResult withSubscriptionRequestId(String subscriptionRequestId) {
        setSubscriptionRequestId(subscriptionRequestId);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the subscription was revoked.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the subscription was revoked.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the subscription was revoked.
     * </p>
     * 
     * @return The timestamp of when the subscription was revoked.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the subscription was revoked.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the subscription was revoked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSubscriptionResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The Amazon DataZone user who revoked the subscription.
     * </p>
     * 
     * @param updatedBy
     *        The Amazon DataZone user who revoked the subscription.
     */

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who revoked the subscription.
     * </p>
     * 
     * @return The Amazon DataZone user who revoked the subscription.
     */

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who revoked the subscription.
     * </p>
     * 
     * @param updatedBy
     *        The Amazon DataZone user who revoked the subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSubscriptionResult withUpdatedBy(String updatedBy) {
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getRetainPermissions() != null)
            sb.append("RetainPermissions: ").append(getRetainPermissions()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSubscribedListing() != null)
            sb.append("SubscribedListing: ").append(getSubscribedListing()).append(",");
        if (getSubscribedPrincipal() != null)
            sb.append("SubscribedPrincipal: ").append(getSubscribedPrincipal()).append(",");
        if (getSubscriptionRequestId() != null)
            sb.append("SubscriptionRequestId: ").append(getSubscriptionRequestId()).append(",");
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

        if (obj instanceof RevokeSubscriptionResult == false)
            return false;
        RevokeSubscriptionResult other = (RevokeSubscriptionResult) obj;
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
        if (other.getRetainPermissions() == null ^ this.getRetainPermissions() == null)
            return false;
        if (other.getRetainPermissions() != null && other.getRetainPermissions().equals(this.getRetainPermissions()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSubscribedListing() == null ^ this.getSubscribedListing() == null)
            return false;
        if (other.getSubscribedListing() != null && other.getSubscribedListing().equals(this.getSubscribedListing()) == false)
            return false;
        if (other.getSubscribedPrincipal() == null ^ this.getSubscribedPrincipal() == null)
            return false;
        if (other.getSubscribedPrincipal() != null && other.getSubscribedPrincipal().equals(this.getSubscribedPrincipal()) == false)
            return false;
        if (other.getSubscriptionRequestId() == null ^ this.getSubscriptionRequestId() == null)
            return false;
        if (other.getSubscriptionRequestId() != null && other.getSubscriptionRequestId().equals(this.getSubscriptionRequestId()) == false)
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

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getRetainPermissions() == null) ? 0 : getRetainPermissions().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSubscribedListing() == null) ? 0 : getSubscribedListing().hashCode());
        hashCode = prime * hashCode + ((getSubscribedPrincipal() == null) ? 0 : getSubscribedPrincipal().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionRequestId() == null) ? 0 : getSubscriptionRequestId().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedBy() == null) ? 0 : getUpdatedBy().hashCode());
        return hashCode;
    }

    @Override
    public RevokeSubscriptionResult clone() {
        try {
            return (RevokeSubscriptionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
