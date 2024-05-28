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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListSubscriptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSubscriptionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the project for the subscription's approver.
     * </p>
     */
    private String approverProjectId;
    /**
     * <p>
     * The identifier of the Amazon DataZone domain.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The maximum number of subscriptions to return in a single call to <code>ListSubscriptions</code>. When the number
     * of subscriptions to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     * <code>NextToken</code> value that you can use in a subsequent call to <code>ListSubscriptions</code> to list the
     * next set of Subscriptions.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * When the number of subscriptions is greater than the default value for the <code>MaxResults</code> parameter, or
     * if you explicitly specify a value for <code>MaxResults</code> that is less than the number of subscriptions, the
     * response includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code>
     * value in a subsequent call to <code>ListSubscriptions</code> to list the next set of subscriptions.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The identifier of the owning project.
     * </p>
     */
    private String owningProjectId;
    /**
     * <p>
     * Specifies the way in which the results of this action are to be sorted.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * Specifies the sort order for the results of this action.
     * </p>
     */
    private String sortOrder;
    /**
     * <p>
     * The status of the subscriptions that you want to list.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The identifier of the subscribed listing for the subscriptions that you want to list.
     * </p>
     */
    private String subscribedListingId;
    /**
     * <p>
     * The identifier of the subscription request for the subscriptions that you want to list.
     * </p>
     */
    private String subscriptionRequestIdentifier;

    /**
     * <p>
     * The identifier of the project for the subscription's approver.
     * </p>
     * 
     * @param approverProjectId
     *        The identifier of the project for the subscription's approver.
     */

    public void setApproverProjectId(String approverProjectId) {
        this.approverProjectId = approverProjectId;
    }

    /**
     * <p>
     * The identifier of the project for the subscription's approver.
     * </p>
     * 
     * @return The identifier of the project for the subscription's approver.
     */

    public String getApproverProjectId() {
        return this.approverProjectId;
    }

    /**
     * <p>
     * The identifier of the project for the subscription's approver.
     * </p>
     * 
     * @param approverProjectId
     *        The identifier of the project for the subscription's approver.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSubscriptionsRequest withApproverProjectId(String approverProjectId) {
        setApproverProjectId(approverProjectId);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain.
     * </p>
     * 
     * @return The identifier of the Amazon DataZone domain.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSubscriptionsRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The maximum number of subscriptions to return in a single call to <code>ListSubscriptions</code>. When the number
     * of subscriptions to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     * <code>NextToken</code> value that you can use in a subsequent call to <code>ListSubscriptions</code> to list the
     * next set of Subscriptions.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of subscriptions to return in a single call to <code>ListSubscriptions</code>. When the
     *        number of subscriptions to be listed is greater than the value of <code>MaxResults</code>, the response
     *        contains a <code>NextToken</code> value that you can use in a subsequent call to
     *        <code>ListSubscriptions</code> to list the next set of Subscriptions.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of subscriptions to return in a single call to <code>ListSubscriptions</code>. When the number
     * of subscriptions to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     * <code>NextToken</code> value that you can use in a subsequent call to <code>ListSubscriptions</code> to list the
     * next set of Subscriptions.
     * </p>
     * 
     * @return The maximum number of subscriptions to return in a single call to <code>ListSubscriptions</code>. When
     *         the number of subscriptions to be listed is greater than the value of <code>MaxResults</code>, the
     *         response contains a <code>NextToken</code> value that you can use in a subsequent call to
     *         <code>ListSubscriptions</code> to list the next set of Subscriptions.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of subscriptions to return in a single call to <code>ListSubscriptions</code>. When the number
     * of subscriptions to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     * <code>NextToken</code> value that you can use in a subsequent call to <code>ListSubscriptions</code> to list the
     * next set of Subscriptions.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of subscriptions to return in a single call to <code>ListSubscriptions</code>. When the
     *        number of subscriptions to be listed is greater than the value of <code>MaxResults</code>, the response
     *        contains a <code>NextToken</code> value that you can use in a subsequent call to
     *        <code>ListSubscriptions</code> to list the next set of Subscriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSubscriptionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * When the number of subscriptions is greater than the default value for the <code>MaxResults</code> parameter, or
     * if you explicitly specify a value for <code>MaxResults</code> that is less than the number of subscriptions, the
     * response includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code>
     * value in a subsequent call to <code>ListSubscriptions</code> to list the next set of subscriptions.
     * </p>
     * 
     * @param nextToken
     *        When the number of subscriptions is greater than the default value for the <code>MaxResults</code>
     *        parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number
     *        of subscriptions, the response includes a pagination token named <code>NextToken</code>. You can specify
     *        this <code>NextToken</code> value in a subsequent call to <code>ListSubscriptions</code> to list the next
     *        set of subscriptions.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When the number of subscriptions is greater than the default value for the <code>MaxResults</code> parameter, or
     * if you explicitly specify a value for <code>MaxResults</code> that is less than the number of subscriptions, the
     * response includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code>
     * value in a subsequent call to <code>ListSubscriptions</code> to list the next set of subscriptions.
     * </p>
     * 
     * @return When the number of subscriptions is greater than the default value for the <code>MaxResults</code>
     *         parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number
     *         of subscriptions, the response includes a pagination token named <code>NextToken</code>. You can specify
     *         this <code>NextToken</code> value in a subsequent call to <code>ListSubscriptions</code> to list the next
     *         set of subscriptions.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When the number of subscriptions is greater than the default value for the <code>MaxResults</code> parameter, or
     * if you explicitly specify a value for <code>MaxResults</code> that is less than the number of subscriptions, the
     * response includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code>
     * value in a subsequent call to <code>ListSubscriptions</code> to list the next set of subscriptions.
     * </p>
     * 
     * @param nextToken
     *        When the number of subscriptions is greater than the default value for the <code>MaxResults</code>
     *        parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number
     *        of subscriptions, the response includes a pagination token named <code>NextToken</code>. You can specify
     *        this <code>NextToken</code> value in a subsequent call to <code>ListSubscriptions</code> to list the next
     *        set of subscriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSubscriptionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The identifier of the owning project.
     * </p>
     * 
     * @param owningProjectId
     *        The identifier of the owning project.
     */

    public void setOwningProjectId(String owningProjectId) {
        this.owningProjectId = owningProjectId;
    }

    /**
     * <p>
     * The identifier of the owning project.
     * </p>
     * 
     * @return The identifier of the owning project.
     */

    public String getOwningProjectId() {
        return this.owningProjectId;
    }

    /**
     * <p>
     * The identifier of the owning project.
     * </p>
     * 
     * @param owningProjectId
     *        The identifier of the owning project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSubscriptionsRequest withOwningProjectId(String owningProjectId) {
        setOwningProjectId(owningProjectId);
        return this;
    }

    /**
     * <p>
     * Specifies the way in which the results of this action are to be sorted.
     * </p>
     * 
     * @param sortBy
     *        Specifies the way in which the results of this action are to be sorted.
     * @see SortKey
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * Specifies the way in which the results of this action are to be sorted.
     * </p>
     * 
     * @return Specifies the way in which the results of this action are to be sorted.
     * @see SortKey
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * Specifies the way in which the results of this action are to be sorted.
     * </p>
     * 
     * @param sortBy
     *        Specifies the way in which the results of this action are to be sorted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortKey
     */

    public ListSubscriptionsRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * Specifies the way in which the results of this action are to be sorted.
     * </p>
     * 
     * @param sortBy
     *        Specifies the way in which the results of this action are to be sorted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortKey
     */

    public ListSubscriptionsRequest withSortBy(SortKey sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the sort order for the results of this action.
     * </p>
     * 
     * @param sortOrder
     *        Specifies the sort order for the results of this action.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * Specifies the sort order for the results of this action.
     * </p>
     * 
     * @return Specifies the sort order for the results of this action.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * Specifies the sort order for the results of this action.
     * </p>
     * 
     * @param sortOrder
     *        Specifies the sort order for the results of this action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListSubscriptionsRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * Specifies the sort order for the results of this action.
     * </p>
     * 
     * @param sortOrder
     *        Specifies the sort order for the results of this action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListSubscriptionsRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * The status of the subscriptions that you want to list.
     * </p>
     * 
     * @param status
     *        The status of the subscriptions that you want to list.
     * @see SubscriptionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the subscriptions that you want to list.
     * </p>
     * 
     * @return The status of the subscriptions that you want to list.
     * @see SubscriptionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the subscriptions that you want to list.
     * </p>
     * 
     * @param status
     *        The status of the subscriptions that you want to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriptionStatus
     */

    public ListSubscriptionsRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the subscriptions that you want to list.
     * </p>
     * 
     * @param status
     *        The status of the subscriptions that you want to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriptionStatus
     */

    public ListSubscriptionsRequest withStatus(SubscriptionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the subscribed listing for the subscriptions that you want to list.
     * </p>
     * 
     * @param subscribedListingId
     *        The identifier of the subscribed listing for the subscriptions that you want to list.
     */

    public void setSubscribedListingId(String subscribedListingId) {
        this.subscribedListingId = subscribedListingId;
    }

    /**
     * <p>
     * The identifier of the subscribed listing for the subscriptions that you want to list.
     * </p>
     * 
     * @return The identifier of the subscribed listing for the subscriptions that you want to list.
     */

    public String getSubscribedListingId() {
        return this.subscribedListingId;
    }

    /**
     * <p>
     * The identifier of the subscribed listing for the subscriptions that you want to list.
     * </p>
     * 
     * @param subscribedListingId
     *        The identifier of the subscribed listing for the subscriptions that you want to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSubscriptionsRequest withSubscribedListingId(String subscribedListingId) {
        setSubscribedListingId(subscribedListingId);
        return this;
    }

    /**
     * <p>
     * The identifier of the subscription request for the subscriptions that you want to list.
     * </p>
     * 
     * @param subscriptionRequestIdentifier
     *        The identifier of the subscription request for the subscriptions that you want to list.
     */

    public void setSubscriptionRequestIdentifier(String subscriptionRequestIdentifier) {
        this.subscriptionRequestIdentifier = subscriptionRequestIdentifier;
    }

    /**
     * <p>
     * The identifier of the subscription request for the subscriptions that you want to list.
     * </p>
     * 
     * @return The identifier of the subscription request for the subscriptions that you want to list.
     */

    public String getSubscriptionRequestIdentifier() {
        return this.subscriptionRequestIdentifier;
    }

    /**
     * <p>
     * The identifier of the subscription request for the subscriptions that you want to list.
     * </p>
     * 
     * @param subscriptionRequestIdentifier
     *        The identifier of the subscription request for the subscriptions that you want to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSubscriptionsRequest withSubscriptionRequestIdentifier(String subscriptionRequestIdentifier) {
        setSubscriptionRequestIdentifier(subscriptionRequestIdentifier);
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
        if (getApproverProjectId() != null)
            sb.append("ApproverProjectId: ").append(getApproverProjectId()).append(",");
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getOwningProjectId() != null)
            sb.append("OwningProjectId: ").append(getOwningProjectId()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSubscribedListingId() != null)
            sb.append("SubscribedListingId: ").append(getSubscribedListingId()).append(",");
        if (getSubscriptionRequestIdentifier() != null)
            sb.append("SubscriptionRequestIdentifier: ").append(getSubscriptionRequestIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSubscriptionsRequest == false)
            return false;
        ListSubscriptionsRequest other = (ListSubscriptionsRequest) obj;
        if (other.getApproverProjectId() == null ^ this.getApproverProjectId() == null)
            return false;
        if (other.getApproverProjectId() != null && other.getApproverProjectId().equals(this.getApproverProjectId()) == false)
            return false;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getOwningProjectId() == null ^ this.getOwningProjectId() == null)
            return false;
        if (other.getOwningProjectId() != null && other.getOwningProjectId().equals(this.getOwningProjectId()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSubscribedListingId() == null ^ this.getSubscribedListingId() == null)
            return false;
        if (other.getSubscribedListingId() != null && other.getSubscribedListingId().equals(this.getSubscribedListingId()) == false)
            return false;
        if (other.getSubscriptionRequestIdentifier() == null ^ this.getSubscriptionRequestIdentifier() == null)
            return false;
        if (other.getSubscriptionRequestIdentifier() != null
                && other.getSubscriptionRequestIdentifier().equals(this.getSubscriptionRequestIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApproverProjectId() == null) ? 0 : getApproverProjectId().hashCode());
        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getOwningProjectId() == null) ? 0 : getOwningProjectId().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSubscribedListingId() == null) ? 0 : getSubscribedListingId().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionRequestIdentifier() == null) ? 0 : getSubscriptionRequestIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public ListSubscriptionsRequest clone() {
        return (ListSubscriptionsRequest) super.clone();
    }

}
