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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetSubscription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSubscriptionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The timestamp of when the subscription was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Amazon DataZone user who created the subscription.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the subscription exists.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The ID of the subscription.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The retain permissions of the subscription.
     * </p>
     */
    private Boolean retainPermissions;
    /**
     * <p>
     * The status of the subscription.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The details of the published asset for which the subscription grant is created.
     * </p>
     */
    private SubscribedListing subscribedListing;
    /**
     * <p>
     * The principal that owns the subscription.
     * </p>
     */
    private SubscribedPrincipal subscribedPrincipal;
    /**
     * <p>
     * The ID of the subscription request.
     * </p>
     */
    private String subscriptionRequestId;
    /**
     * <p>
     * The timestamp of when the subscription was updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The Amazon DataZone user who updated the subscription.
     * </p>
     */
    private String updatedBy;

    /**
     * <p>
     * The timestamp of when the subscription was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the subscription was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when the subscription was created.
     * </p>
     * 
     * @return The timestamp of when the subscription was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when the subscription was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the subscription was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSubscriptionResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the subscription.
     * </p>
     * 
     * @param createdBy
     *        The Amazon DataZone user who created the subscription.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the subscription.
     * </p>
     * 
     * @return The Amazon DataZone user who created the subscription.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the subscription.
     * </p>
     * 
     * @param createdBy
     *        The Amazon DataZone user who created the subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSubscriptionResult withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the subscription exists.
     * </p>
     * 
     * @param domainId
     *        The ID of the Amazon DataZone domain in which the subscription exists.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the subscription exists.
     * </p>
     * 
     * @return The ID of the Amazon DataZone domain in which the subscription exists.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the subscription exists.
     * </p>
     * 
     * @param domainId
     *        The ID of the Amazon DataZone domain in which the subscription exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSubscriptionResult withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The ID of the subscription.
     * </p>
     * 
     * @param id
     *        The ID of the subscription.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the subscription.
     * </p>
     * 
     * @return The ID of the subscription.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the subscription.
     * </p>
     * 
     * @param id
     *        The ID of the subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSubscriptionResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The retain permissions of the subscription.
     * </p>
     * 
     * @param retainPermissions
     *        The retain permissions of the subscription.
     */

    public void setRetainPermissions(Boolean retainPermissions) {
        this.retainPermissions = retainPermissions;
    }

    /**
     * <p>
     * The retain permissions of the subscription.
     * </p>
     * 
     * @return The retain permissions of the subscription.
     */

    public Boolean getRetainPermissions() {
        return this.retainPermissions;
    }

    /**
     * <p>
     * The retain permissions of the subscription.
     * </p>
     * 
     * @param retainPermissions
     *        The retain permissions of the subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSubscriptionResult withRetainPermissions(Boolean retainPermissions) {
        setRetainPermissions(retainPermissions);
        return this;
    }

    /**
     * <p>
     * The retain permissions of the subscription.
     * </p>
     * 
     * @return The retain permissions of the subscription.
     */

    public Boolean isRetainPermissions() {
        return this.retainPermissions;
    }

    /**
     * <p>
     * The status of the subscription.
     * </p>
     * 
     * @param status
     *        The status of the subscription.
     * @see SubscriptionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the subscription.
     * </p>
     * 
     * @return The status of the subscription.
     * @see SubscriptionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the subscription.
     * </p>
     * 
     * @param status
     *        The status of the subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriptionStatus
     */

    public GetSubscriptionResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the subscription.
     * </p>
     * 
     * @param status
     *        The status of the subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriptionStatus
     */

    public GetSubscriptionResult withStatus(SubscriptionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The details of the published asset for which the subscription grant is created.
     * </p>
     * 
     * @param subscribedListing
     *        The details of the published asset for which the subscription grant is created.
     */

    public void setSubscribedListing(SubscribedListing subscribedListing) {
        this.subscribedListing = subscribedListing;
    }

    /**
     * <p>
     * The details of the published asset for which the subscription grant is created.
     * </p>
     * 
     * @return The details of the published asset for which the subscription grant is created.
     */

    public SubscribedListing getSubscribedListing() {
        return this.subscribedListing;
    }

    /**
     * <p>
     * The details of the published asset for which the subscription grant is created.
     * </p>
     * 
     * @param subscribedListing
     *        The details of the published asset for which the subscription grant is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSubscriptionResult withSubscribedListing(SubscribedListing subscribedListing) {
        setSubscribedListing(subscribedListing);
        return this;
    }

    /**
     * <p>
     * The principal that owns the subscription.
     * </p>
     * 
     * @param subscribedPrincipal
     *        The principal that owns the subscription.
     */

    public void setSubscribedPrincipal(SubscribedPrincipal subscribedPrincipal) {
        this.subscribedPrincipal = subscribedPrincipal;
    }

    /**
     * <p>
     * The principal that owns the subscription.
     * </p>
     * 
     * @return The principal that owns the subscription.
     */

    public SubscribedPrincipal getSubscribedPrincipal() {
        return this.subscribedPrincipal;
    }

    /**
     * <p>
     * The principal that owns the subscription.
     * </p>
     * 
     * @param subscribedPrincipal
     *        The principal that owns the subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSubscriptionResult withSubscribedPrincipal(SubscribedPrincipal subscribedPrincipal) {
        setSubscribedPrincipal(subscribedPrincipal);
        return this;
    }

    /**
     * <p>
     * The ID of the subscription request.
     * </p>
     * 
     * @param subscriptionRequestId
     *        The ID of the subscription request.
     */

    public void setSubscriptionRequestId(String subscriptionRequestId) {
        this.subscriptionRequestId = subscriptionRequestId;
    }

    /**
     * <p>
     * The ID of the subscription request.
     * </p>
     * 
     * @return The ID of the subscription request.
     */

    public String getSubscriptionRequestId() {
        return this.subscriptionRequestId;
    }

    /**
     * <p>
     * The ID of the subscription request.
     * </p>
     * 
     * @param subscriptionRequestId
     *        The ID of the subscription request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSubscriptionResult withSubscriptionRequestId(String subscriptionRequestId) {
        setSubscriptionRequestId(subscriptionRequestId);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the subscription was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the subscription was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the subscription was updated.
     * </p>
     * 
     * @return The timestamp of when the subscription was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the subscription was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the subscription was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSubscriptionResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The Amazon DataZone user who updated the subscription.
     * </p>
     * 
     * @param updatedBy
     *        The Amazon DataZone user who updated the subscription.
     */

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who updated the subscription.
     * </p>
     * 
     * @return The Amazon DataZone user who updated the subscription.
     */

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who updated the subscription.
     * </p>
     * 
     * @param updatedBy
     *        The Amazon DataZone user who updated the subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSubscriptionResult withUpdatedBy(String updatedBy) {
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

        if (obj instanceof GetSubscriptionResult == false)
            return false;
        GetSubscriptionResult other = (GetSubscriptionResult) obj;
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
    public GetSubscriptionResult clone() {
        try {
            return (GetSubscriptionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
