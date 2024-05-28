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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListSubscriptionRequests" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSubscriptionRequestsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the subscription request approver's project.
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
     * The maximum number of subscription requests to return in a single call to <code>ListSubscriptionRequests</code>.
     * When the number of subscription requests to be listed is greater than the value of <code>MaxResults</code>, the
     * response contains a <code>NextToken</code> value that you can use in a subsequent call to
     * <code>ListSubscriptionRequests</code> to list the next set of subscription requests.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * When the number of subscription requests is greater than the default value for the <code>MaxResults</code>
     * parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number of
     * subscription requests, the response includes a pagination token named <code>NextToken</code>. You can specify
     * this <code>NextToken</code> value in a subsequent call to <code>ListSubscriptionRequests</code> to list the next
     * set of subscription requests.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The identifier of the project for the subscription requests.
     * </p>
     */
    private String owningProjectId;
    /**
     * <p>
     * Specifies the way to sort the results of this action.
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
     * Specifies the status of the subscription requests.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The identifier of the subscribed listing.
     * </p>
     */
    private String subscribedListingId;

    /**
     * <p>
     * The identifier of the subscription request approver's project.
     * </p>
     * 
     * @param approverProjectId
     *        The identifier of the subscription request approver's project.
     */

    public void setApproverProjectId(String approverProjectId) {
        this.approverProjectId = approverProjectId;
    }

    /**
     * <p>
     * The identifier of the subscription request approver's project.
     * </p>
     * 
     * @return The identifier of the subscription request approver's project.
     */

    public String getApproverProjectId() {
        return this.approverProjectId;
    }

    /**
     * <p>
     * The identifier of the subscription request approver's project.
     * </p>
     * 
     * @param approverProjectId
     *        The identifier of the subscription request approver's project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSubscriptionRequestsRequest withApproverProjectId(String approverProjectId) {
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

    public ListSubscriptionRequestsRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The maximum number of subscription requests to return in a single call to <code>ListSubscriptionRequests</code>.
     * When the number of subscription requests to be listed is greater than the value of <code>MaxResults</code>, the
     * response contains a <code>NextToken</code> value that you can use in a subsequent call to
     * <code>ListSubscriptionRequests</code> to list the next set of subscription requests.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of subscription requests to return in a single call to
     *        <code>ListSubscriptionRequests</code>. When the number of subscription requests to be listed is greater
     *        than the value of <code>MaxResults</code>, the response contains a <code>NextToken</code> value that you
     *        can use in a subsequent call to <code>ListSubscriptionRequests</code> to list the next set of subscription
     *        requests.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of subscription requests to return in a single call to <code>ListSubscriptionRequests</code>.
     * When the number of subscription requests to be listed is greater than the value of <code>MaxResults</code>, the
     * response contains a <code>NextToken</code> value that you can use in a subsequent call to
     * <code>ListSubscriptionRequests</code> to list the next set of subscription requests.
     * </p>
     * 
     * @return The maximum number of subscription requests to return in a single call to
     *         <code>ListSubscriptionRequests</code>. When the number of subscription requests to be listed is greater
     *         than the value of <code>MaxResults</code>, the response contains a <code>NextToken</code> value that you
     *         can use in a subsequent call to <code>ListSubscriptionRequests</code> to list the next set of
     *         subscription requests.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of subscription requests to return in a single call to <code>ListSubscriptionRequests</code>.
     * When the number of subscription requests to be listed is greater than the value of <code>MaxResults</code>, the
     * response contains a <code>NextToken</code> value that you can use in a subsequent call to
     * <code>ListSubscriptionRequests</code> to list the next set of subscription requests.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of subscription requests to return in a single call to
     *        <code>ListSubscriptionRequests</code>. When the number of subscription requests to be listed is greater
     *        than the value of <code>MaxResults</code>, the response contains a <code>NextToken</code> value that you
     *        can use in a subsequent call to <code>ListSubscriptionRequests</code> to list the next set of subscription
     *        requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSubscriptionRequestsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * When the number of subscription requests is greater than the default value for the <code>MaxResults</code>
     * parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number of
     * subscription requests, the response includes a pagination token named <code>NextToken</code>. You can specify
     * this <code>NextToken</code> value in a subsequent call to <code>ListSubscriptionRequests</code> to list the next
     * set of subscription requests.
     * </p>
     * 
     * @param nextToken
     *        When the number of subscription requests is greater than the default value for the <code>MaxResults</code>
     *        parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number
     *        of subscription requests, the response includes a pagination token named <code>NextToken</code>. You can
     *        specify this <code>NextToken</code> value in a subsequent call to <code>ListSubscriptionRequests</code> to
     *        list the next set of subscription requests.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When the number of subscription requests is greater than the default value for the <code>MaxResults</code>
     * parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number of
     * subscription requests, the response includes a pagination token named <code>NextToken</code>. You can specify
     * this <code>NextToken</code> value in a subsequent call to <code>ListSubscriptionRequests</code> to list the next
     * set of subscription requests.
     * </p>
     * 
     * @return When the number of subscription requests is greater than the default value for the
     *         <code>MaxResults</code> parameter, or if you explicitly specify a value for <code>MaxResults</code> that
     *         is less than the number of subscription requests, the response includes a pagination token named
     *         <code>NextToken</code>. You can specify this <code>NextToken</code> value in a subsequent call to
     *         <code>ListSubscriptionRequests</code> to list the next set of subscription requests.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When the number of subscription requests is greater than the default value for the <code>MaxResults</code>
     * parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number of
     * subscription requests, the response includes a pagination token named <code>NextToken</code>. You can specify
     * this <code>NextToken</code> value in a subsequent call to <code>ListSubscriptionRequests</code> to list the next
     * set of subscription requests.
     * </p>
     * 
     * @param nextToken
     *        When the number of subscription requests is greater than the default value for the <code>MaxResults</code>
     *        parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number
     *        of subscription requests, the response includes a pagination token named <code>NextToken</code>. You can
     *        specify this <code>NextToken</code> value in a subsequent call to <code>ListSubscriptionRequests</code> to
     *        list the next set of subscription requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSubscriptionRequestsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The identifier of the project for the subscription requests.
     * </p>
     * 
     * @param owningProjectId
     *        The identifier of the project for the subscription requests.
     */

    public void setOwningProjectId(String owningProjectId) {
        this.owningProjectId = owningProjectId;
    }

    /**
     * <p>
     * The identifier of the project for the subscription requests.
     * </p>
     * 
     * @return The identifier of the project for the subscription requests.
     */

    public String getOwningProjectId() {
        return this.owningProjectId;
    }

    /**
     * <p>
     * The identifier of the project for the subscription requests.
     * </p>
     * 
     * @param owningProjectId
     *        The identifier of the project for the subscription requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSubscriptionRequestsRequest withOwningProjectId(String owningProjectId) {
        setOwningProjectId(owningProjectId);
        return this;
    }

    /**
     * <p>
     * Specifies the way to sort the results of this action.
     * </p>
     * 
     * @param sortBy
     *        Specifies the way to sort the results of this action.
     * @see SortKey
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * Specifies the way to sort the results of this action.
     * </p>
     * 
     * @return Specifies the way to sort the results of this action.
     * @see SortKey
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * Specifies the way to sort the results of this action.
     * </p>
     * 
     * @param sortBy
     *        Specifies the way to sort the results of this action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortKey
     */

    public ListSubscriptionRequestsRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * Specifies the way to sort the results of this action.
     * </p>
     * 
     * @param sortBy
     *        Specifies the way to sort the results of this action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortKey
     */

    public ListSubscriptionRequestsRequest withSortBy(SortKey sortBy) {
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

    public ListSubscriptionRequestsRequest withSortOrder(String sortOrder) {
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

    public ListSubscriptionRequestsRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the status of the subscription requests.
     * </p>
     * 
     * @param status
     *        Specifies the status of the subscription requests.
     * @see SubscriptionRequestStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies the status of the subscription requests.
     * </p>
     * 
     * @return Specifies the status of the subscription requests.
     * @see SubscriptionRequestStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Specifies the status of the subscription requests.
     * </p>
     * 
     * @param status
     *        Specifies the status of the subscription requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriptionRequestStatus
     */

    public ListSubscriptionRequestsRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Specifies the status of the subscription requests.
     * </p>
     * 
     * @param status
     *        Specifies the status of the subscription requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriptionRequestStatus
     */

    public ListSubscriptionRequestsRequest withStatus(SubscriptionRequestStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the subscribed listing.
     * </p>
     * 
     * @param subscribedListingId
     *        The identifier of the subscribed listing.
     */

    public void setSubscribedListingId(String subscribedListingId) {
        this.subscribedListingId = subscribedListingId;
    }

    /**
     * <p>
     * The identifier of the subscribed listing.
     * </p>
     * 
     * @return The identifier of the subscribed listing.
     */

    public String getSubscribedListingId() {
        return this.subscribedListingId;
    }

    /**
     * <p>
     * The identifier of the subscribed listing.
     * </p>
     * 
     * @param subscribedListingId
     *        The identifier of the subscribed listing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSubscriptionRequestsRequest withSubscribedListingId(String subscribedListingId) {
        setSubscribedListingId(subscribedListingId);
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
            sb.append("SubscribedListingId: ").append(getSubscribedListingId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSubscriptionRequestsRequest == false)
            return false;
        ListSubscriptionRequestsRequest other = (ListSubscriptionRequestsRequest) obj;
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
        return hashCode;
    }

    @Override
    public ListSubscriptionRequestsRequest clone() {
        return (ListSubscriptionRequestsRequest) super.clone();
    }

}
