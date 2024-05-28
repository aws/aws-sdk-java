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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateSubscriptionRequest" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSubscriptionRequestResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A timestamp of when the subscription request is created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Amazon DataZone user who created the subscription request.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The decision comment of the subscription request.
     * </p>
     */
    private String decisionComment;
    /**
     * <p>
     * The ID of the Amazon DataZone domain in whcih the subscription request is created.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The ID of the subscription request.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The reason for the subscription request.
     * </p>
     */
    private String requestReason;
    /**
     * <p>
     * The ID of the reviewer of the subscription request.
     * </p>
     */
    private String reviewerId;
    /**
     * <p>
     * The status of the subscription request.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The published asset for which the subscription grant is to be created.
     * </p>
     */
    private java.util.List<SubscribedListing> subscribedListings;
    /**
     * <p>
     * The subscribed principals of the subscription request.
     * </p>
     */
    private java.util.List<SubscribedPrincipal> subscribedPrincipals;
    /**
     * <p>
     * The timestamp of when the subscription request was updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The Amazon DataZone user who updated the subscription request.
     * </p>
     */
    private String updatedBy;

    /**
     * <p>
     * A timestamp of when the subscription request is created.
     * </p>
     * 
     * @param createdAt
     *        A timestamp of when the subscription request is created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * A timestamp of when the subscription request is created.
     * </p>
     * 
     * @return A timestamp of when the subscription request is created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * A timestamp of when the subscription request is created.
     * </p>
     * 
     * @param createdAt
     *        A timestamp of when the subscription request is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionRequestResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the subscription request.
     * </p>
     * 
     * @param createdBy
     *        The Amazon DataZone user who created the subscription request.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the subscription request.
     * </p>
     * 
     * @return The Amazon DataZone user who created the subscription request.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the subscription request.
     * </p>
     * 
     * @param createdBy
     *        The Amazon DataZone user who created the subscription request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionRequestResult withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The decision comment of the subscription request.
     * </p>
     * 
     * @param decisionComment
     *        The decision comment of the subscription request.
     */

    public void setDecisionComment(String decisionComment) {
        this.decisionComment = decisionComment;
    }

    /**
     * <p>
     * The decision comment of the subscription request.
     * </p>
     * 
     * @return The decision comment of the subscription request.
     */

    public String getDecisionComment() {
        return this.decisionComment;
    }

    /**
     * <p>
     * The decision comment of the subscription request.
     * </p>
     * 
     * @param decisionComment
     *        The decision comment of the subscription request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionRequestResult withDecisionComment(String decisionComment) {
        setDecisionComment(decisionComment);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in whcih the subscription request is created.
     * </p>
     * 
     * @param domainId
     *        The ID of the Amazon DataZone domain in whcih the subscription request is created.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in whcih the subscription request is created.
     * </p>
     * 
     * @return The ID of the Amazon DataZone domain in whcih the subscription request is created.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in whcih the subscription request is created.
     * </p>
     * 
     * @param domainId
     *        The ID of the Amazon DataZone domain in whcih the subscription request is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionRequestResult withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The ID of the subscription request.
     * </p>
     * 
     * @param id
     *        The ID of the subscription request.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the subscription request.
     * </p>
     * 
     * @return The ID of the subscription request.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the subscription request.
     * </p>
     * 
     * @param id
     *        The ID of the subscription request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionRequestResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The reason for the subscription request.
     * </p>
     * 
     * @param requestReason
     *        The reason for the subscription request.
     */

    public void setRequestReason(String requestReason) {
        this.requestReason = requestReason;
    }

    /**
     * <p>
     * The reason for the subscription request.
     * </p>
     * 
     * @return The reason for the subscription request.
     */

    public String getRequestReason() {
        return this.requestReason;
    }

    /**
     * <p>
     * The reason for the subscription request.
     * </p>
     * 
     * @param requestReason
     *        The reason for the subscription request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionRequestResult withRequestReason(String requestReason) {
        setRequestReason(requestReason);
        return this;
    }

    /**
     * <p>
     * The ID of the reviewer of the subscription request.
     * </p>
     * 
     * @param reviewerId
     *        The ID of the reviewer of the subscription request.
     */

    public void setReviewerId(String reviewerId) {
        this.reviewerId = reviewerId;
    }

    /**
     * <p>
     * The ID of the reviewer of the subscription request.
     * </p>
     * 
     * @return The ID of the reviewer of the subscription request.
     */

    public String getReviewerId() {
        return this.reviewerId;
    }

    /**
     * <p>
     * The ID of the reviewer of the subscription request.
     * </p>
     * 
     * @param reviewerId
     *        The ID of the reviewer of the subscription request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionRequestResult withReviewerId(String reviewerId) {
        setReviewerId(reviewerId);
        return this;
    }

    /**
     * <p>
     * The status of the subscription request.
     * </p>
     * 
     * @param status
     *        The status of the subscription request.
     * @see SubscriptionRequestStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the subscription request.
     * </p>
     * 
     * @return The status of the subscription request.
     * @see SubscriptionRequestStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the subscription request.
     * </p>
     * 
     * @param status
     *        The status of the subscription request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriptionRequestStatus
     */

    public CreateSubscriptionRequestResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the subscription request.
     * </p>
     * 
     * @param status
     *        The status of the subscription request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriptionRequestStatus
     */

    public CreateSubscriptionRequestResult withStatus(SubscriptionRequestStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The published asset for which the subscription grant is to be created.
     * </p>
     * 
     * @return The published asset for which the subscription grant is to be created.
     */

    public java.util.List<SubscribedListing> getSubscribedListings() {
        return subscribedListings;
    }

    /**
     * <p>
     * The published asset for which the subscription grant is to be created.
     * </p>
     * 
     * @param subscribedListings
     *        The published asset for which the subscription grant is to be created.
     */

    public void setSubscribedListings(java.util.Collection<SubscribedListing> subscribedListings) {
        if (subscribedListings == null) {
            this.subscribedListings = null;
            return;
        }

        this.subscribedListings = new java.util.ArrayList<SubscribedListing>(subscribedListings);
    }

    /**
     * <p>
     * The published asset for which the subscription grant is to be created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubscribedListings(java.util.Collection)} or {@link #withSubscribedListings(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param subscribedListings
     *        The published asset for which the subscription grant is to be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionRequestResult withSubscribedListings(SubscribedListing... subscribedListings) {
        if (this.subscribedListings == null) {
            setSubscribedListings(new java.util.ArrayList<SubscribedListing>(subscribedListings.length));
        }
        for (SubscribedListing ele : subscribedListings) {
            this.subscribedListings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The published asset for which the subscription grant is to be created.
     * </p>
     * 
     * @param subscribedListings
     *        The published asset for which the subscription grant is to be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionRequestResult withSubscribedListings(java.util.Collection<SubscribedListing> subscribedListings) {
        setSubscribedListings(subscribedListings);
        return this;
    }

    /**
     * <p>
     * The subscribed principals of the subscription request.
     * </p>
     * 
     * @return The subscribed principals of the subscription request.
     */

    public java.util.List<SubscribedPrincipal> getSubscribedPrincipals() {
        return subscribedPrincipals;
    }

    /**
     * <p>
     * The subscribed principals of the subscription request.
     * </p>
     * 
     * @param subscribedPrincipals
     *        The subscribed principals of the subscription request.
     */

    public void setSubscribedPrincipals(java.util.Collection<SubscribedPrincipal> subscribedPrincipals) {
        if (subscribedPrincipals == null) {
            this.subscribedPrincipals = null;
            return;
        }

        this.subscribedPrincipals = new java.util.ArrayList<SubscribedPrincipal>(subscribedPrincipals);
    }

    /**
     * <p>
     * The subscribed principals of the subscription request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubscribedPrincipals(java.util.Collection)} or {@link #withSubscribedPrincipals(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param subscribedPrincipals
     *        The subscribed principals of the subscription request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionRequestResult withSubscribedPrincipals(SubscribedPrincipal... subscribedPrincipals) {
        if (this.subscribedPrincipals == null) {
            setSubscribedPrincipals(new java.util.ArrayList<SubscribedPrincipal>(subscribedPrincipals.length));
        }
        for (SubscribedPrincipal ele : subscribedPrincipals) {
            this.subscribedPrincipals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The subscribed principals of the subscription request.
     * </p>
     * 
     * @param subscribedPrincipals
     *        The subscribed principals of the subscription request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionRequestResult withSubscribedPrincipals(java.util.Collection<SubscribedPrincipal> subscribedPrincipals) {
        setSubscribedPrincipals(subscribedPrincipals);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the subscription request was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the subscription request was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the subscription request was updated.
     * </p>
     * 
     * @return The timestamp of when the subscription request was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the subscription request was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the subscription request was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionRequestResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The Amazon DataZone user who updated the subscription request.
     * </p>
     * 
     * @param updatedBy
     *        The Amazon DataZone user who updated the subscription request.
     */

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who updated the subscription request.
     * </p>
     * 
     * @return The Amazon DataZone user who updated the subscription request.
     */

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who updated the subscription request.
     * </p>
     * 
     * @param updatedBy
     *        The Amazon DataZone user who updated the subscription request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionRequestResult withUpdatedBy(String updatedBy) {
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
        if (getDecisionComment() != null)
            sb.append("DecisionComment: ").append("***Sensitive Data Redacted***").append(",");
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getRequestReason() != null)
            sb.append("RequestReason: ").append("***Sensitive Data Redacted***").append(",");
        if (getReviewerId() != null)
            sb.append("ReviewerId: ").append(getReviewerId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSubscribedListings() != null)
            sb.append("SubscribedListings: ").append(getSubscribedListings()).append(",");
        if (getSubscribedPrincipals() != null)
            sb.append("SubscribedPrincipals: ").append(getSubscribedPrincipals()).append(",");
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

        if (obj instanceof CreateSubscriptionRequestResult == false)
            return false;
        CreateSubscriptionRequestResult other = (CreateSubscriptionRequestResult) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getDecisionComment() == null ^ this.getDecisionComment() == null)
            return false;
        if (other.getDecisionComment() != null && other.getDecisionComment().equals(this.getDecisionComment()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getRequestReason() == null ^ this.getRequestReason() == null)
            return false;
        if (other.getRequestReason() != null && other.getRequestReason().equals(this.getRequestReason()) == false)
            return false;
        if (other.getReviewerId() == null ^ this.getReviewerId() == null)
            return false;
        if (other.getReviewerId() != null && other.getReviewerId().equals(this.getReviewerId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSubscribedListings() == null ^ this.getSubscribedListings() == null)
            return false;
        if (other.getSubscribedListings() != null && other.getSubscribedListings().equals(this.getSubscribedListings()) == false)
            return false;
        if (other.getSubscribedPrincipals() == null ^ this.getSubscribedPrincipals() == null)
            return false;
        if (other.getSubscribedPrincipals() != null && other.getSubscribedPrincipals().equals(this.getSubscribedPrincipals()) == false)
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
        hashCode = prime * hashCode + ((getDecisionComment() == null) ? 0 : getDecisionComment().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getRequestReason() == null) ? 0 : getRequestReason().hashCode());
        hashCode = prime * hashCode + ((getReviewerId() == null) ? 0 : getReviewerId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSubscribedListings() == null) ? 0 : getSubscribedListings().hashCode());
        hashCode = prime * hashCode + ((getSubscribedPrincipals() == null) ? 0 : getSubscribedPrincipals().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedBy() == null) ? 0 : getUpdatedBy().hashCode());
        return hashCode;
    }

    @Override
    public CreateSubscriptionRequestResult clone() {
        try {
            return (CreateSubscriptionRequestResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
