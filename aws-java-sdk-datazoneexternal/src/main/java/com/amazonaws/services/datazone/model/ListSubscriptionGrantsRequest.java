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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListSubscriptionGrants" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSubscriptionGrantsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon DataZone domain.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The identifier of the Amazon DataZone environment.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * The maximum number of subscription grants to return in a single call to <code>ListSubscriptionGrants</code>. When
     * the number of subscription grants to be listed is greater than the value of <code>MaxResults</code>, the response
     * contains a <code>NextToken</code> value that you can use in a subsequent call to
     * <code>ListSubscriptionGrants</code> to list the next set of subscription grants.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * When the number of subscription grants is greater than the default value for the <code>MaxResults</code>
     * parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number of
     * subscription grants, the response includes a pagination token named <code>NextToken</code>. You can specify this
     * <code>NextToken</code> value in a subsequent call to <code>ListSubscriptionGrants</code> to list the next set of
     * subscription grants.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Specifies the way of sorting the results of this action.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * Specifies the sort order of this action.
     * </p>
     */
    private String sortOrder;
    /**
     * <p>
     * The identifier of the subscribed listing.
     * </p>
     */
    private String subscribedListingId;
    /**
     * <p>
     * The identifier of the subscription.
     * </p>
     */
    private String subscriptionId;
    /**
     * <p>
     * The identifier of the subscription target.
     * </p>
     */
    private String subscriptionTargetId;

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

    public ListSubscriptionGrantsRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone environment.
     * </p>
     * 
     * @param environmentId
     *        The identifier of the Amazon DataZone environment.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone environment.
     * </p>
     * 
     * @return The identifier of the Amazon DataZone environment.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone environment.
     * </p>
     * 
     * @param environmentId
     *        The identifier of the Amazon DataZone environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSubscriptionGrantsRequest withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * The maximum number of subscription grants to return in a single call to <code>ListSubscriptionGrants</code>. When
     * the number of subscription grants to be listed is greater than the value of <code>MaxResults</code>, the response
     * contains a <code>NextToken</code> value that you can use in a subsequent call to
     * <code>ListSubscriptionGrants</code> to list the next set of subscription grants.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of subscription grants to return in a single call to
     *        <code>ListSubscriptionGrants</code>. When the number of subscription grants to be listed is greater than
     *        the value of <code>MaxResults</code>, the response contains a <code>NextToken</code> value that you can
     *        use in a subsequent call to <code>ListSubscriptionGrants</code> to list the next set of subscription
     *        grants.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of subscription grants to return in a single call to <code>ListSubscriptionGrants</code>. When
     * the number of subscription grants to be listed is greater than the value of <code>MaxResults</code>, the response
     * contains a <code>NextToken</code> value that you can use in a subsequent call to
     * <code>ListSubscriptionGrants</code> to list the next set of subscription grants.
     * </p>
     * 
     * @return The maximum number of subscription grants to return in a single call to
     *         <code>ListSubscriptionGrants</code>. When the number of subscription grants to be listed is greater than
     *         the value of <code>MaxResults</code>, the response contains a <code>NextToken</code> value that you can
     *         use in a subsequent call to <code>ListSubscriptionGrants</code> to list the next set of subscription
     *         grants.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of subscription grants to return in a single call to <code>ListSubscriptionGrants</code>. When
     * the number of subscription grants to be listed is greater than the value of <code>MaxResults</code>, the response
     * contains a <code>NextToken</code> value that you can use in a subsequent call to
     * <code>ListSubscriptionGrants</code> to list the next set of subscription grants.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of subscription grants to return in a single call to
     *        <code>ListSubscriptionGrants</code>. When the number of subscription grants to be listed is greater than
     *        the value of <code>MaxResults</code>, the response contains a <code>NextToken</code> value that you can
     *        use in a subsequent call to <code>ListSubscriptionGrants</code> to list the next set of subscription
     *        grants.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSubscriptionGrantsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * When the number of subscription grants is greater than the default value for the <code>MaxResults</code>
     * parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number of
     * subscription grants, the response includes a pagination token named <code>NextToken</code>. You can specify this
     * <code>NextToken</code> value in a subsequent call to <code>ListSubscriptionGrants</code> to list the next set of
     * subscription grants.
     * </p>
     * 
     * @param nextToken
     *        When the number of subscription grants is greater than the default value for the <code>MaxResults</code>
     *        parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number
     *        of subscription grants, the response includes a pagination token named <code>NextToken</code>. You can
     *        specify this <code>NextToken</code> value in a subsequent call to <code>ListSubscriptionGrants</code> to
     *        list the next set of subscription grants.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When the number of subscription grants is greater than the default value for the <code>MaxResults</code>
     * parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number of
     * subscription grants, the response includes a pagination token named <code>NextToken</code>. You can specify this
     * <code>NextToken</code> value in a subsequent call to <code>ListSubscriptionGrants</code> to list the next set of
     * subscription grants.
     * </p>
     * 
     * @return When the number of subscription grants is greater than the default value for the <code>MaxResults</code>
     *         parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number
     *         of subscription grants, the response includes a pagination token named <code>NextToken</code>. You can
     *         specify this <code>NextToken</code> value in a subsequent call to <code>ListSubscriptionGrants</code> to
     *         list the next set of subscription grants.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When the number of subscription grants is greater than the default value for the <code>MaxResults</code>
     * parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number of
     * subscription grants, the response includes a pagination token named <code>NextToken</code>. You can specify this
     * <code>NextToken</code> value in a subsequent call to <code>ListSubscriptionGrants</code> to list the next set of
     * subscription grants.
     * </p>
     * 
     * @param nextToken
     *        When the number of subscription grants is greater than the default value for the <code>MaxResults</code>
     *        parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number
     *        of subscription grants, the response includes a pagination token named <code>NextToken</code>. You can
     *        specify this <code>NextToken</code> value in a subsequent call to <code>ListSubscriptionGrants</code> to
     *        list the next set of subscription grants.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSubscriptionGrantsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Specifies the way of sorting the results of this action.
     * </p>
     * 
     * @param sortBy
     *        Specifies the way of sorting the results of this action.
     * @see SortKey
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * Specifies the way of sorting the results of this action.
     * </p>
     * 
     * @return Specifies the way of sorting the results of this action.
     * @see SortKey
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * Specifies the way of sorting the results of this action.
     * </p>
     * 
     * @param sortBy
     *        Specifies the way of sorting the results of this action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortKey
     */

    public ListSubscriptionGrantsRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * Specifies the way of sorting the results of this action.
     * </p>
     * 
     * @param sortBy
     *        Specifies the way of sorting the results of this action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortKey
     */

    public ListSubscriptionGrantsRequest withSortBy(SortKey sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the sort order of this action.
     * </p>
     * 
     * @param sortOrder
     *        Specifies the sort order of this action.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * Specifies the sort order of this action.
     * </p>
     * 
     * @return Specifies the sort order of this action.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * Specifies the sort order of this action.
     * </p>
     * 
     * @param sortOrder
     *        Specifies the sort order of this action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListSubscriptionGrantsRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * Specifies the sort order of this action.
     * </p>
     * 
     * @param sortOrder
     *        Specifies the sort order of this action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListSubscriptionGrantsRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
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

    public ListSubscriptionGrantsRequest withSubscribedListingId(String subscribedListingId) {
        setSubscribedListingId(subscribedListingId);
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

    public ListSubscriptionGrantsRequest withSubscriptionId(String subscriptionId) {
        setSubscriptionId(subscriptionId);
        return this;
    }

    /**
     * <p>
     * The identifier of the subscription target.
     * </p>
     * 
     * @param subscriptionTargetId
     *        The identifier of the subscription target.
     */

    public void setSubscriptionTargetId(String subscriptionTargetId) {
        this.subscriptionTargetId = subscriptionTargetId;
    }

    /**
     * <p>
     * The identifier of the subscription target.
     * </p>
     * 
     * @return The identifier of the subscription target.
     */

    public String getSubscriptionTargetId() {
        return this.subscriptionTargetId;
    }

    /**
     * <p>
     * The identifier of the subscription target.
     * </p>
     * 
     * @param subscriptionTargetId
     *        The identifier of the subscription target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSubscriptionGrantsRequest withSubscriptionTargetId(String subscriptionTargetId) {
        setSubscriptionTargetId(subscriptionTargetId);
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
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder()).append(",");
        if (getSubscribedListingId() != null)
            sb.append("SubscribedListingId: ").append(getSubscribedListingId()).append(",");
        if (getSubscriptionId() != null)
            sb.append("SubscriptionId: ").append(getSubscriptionId()).append(",");
        if (getSubscriptionTargetId() != null)
            sb.append("SubscriptionTargetId: ").append(getSubscriptionTargetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSubscriptionGrantsRequest == false)
            return false;
        ListSubscriptionGrantsRequest other = (ListSubscriptionGrantsRequest) obj;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        if (other.getSubscribedListingId() == null ^ this.getSubscribedListingId() == null)
            return false;
        if (other.getSubscribedListingId() != null && other.getSubscribedListingId().equals(this.getSubscribedListingId()) == false)
            return false;
        if (other.getSubscriptionId() == null ^ this.getSubscriptionId() == null)
            return false;
        if (other.getSubscriptionId() != null && other.getSubscriptionId().equals(this.getSubscriptionId()) == false)
            return false;
        if (other.getSubscriptionTargetId() == null ^ this.getSubscriptionTargetId() == null)
            return false;
        if (other.getSubscriptionTargetId() != null && other.getSubscriptionTargetId().equals(this.getSubscriptionTargetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getSubscribedListingId() == null) ? 0 : getSubscribedListingId().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionId() == null) ? 0 : getSubscriptionId().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionTargetId() == null) ? 0 : getSubscriptionTargetId().hashCode());
        return hashCode;
    }

    @Override
    public ListSubscriptionGrantsRequest clone() {
        return (ListSubscriptionGrantsRequest) super.clone();
    }

}
