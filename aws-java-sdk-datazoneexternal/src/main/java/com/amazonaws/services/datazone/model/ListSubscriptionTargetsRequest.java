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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListSubscriptionTargets" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSubscriptionTargetsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon DataZone domain where you want to list subscription targets.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The identifier of the environment where you want to list subscription targets.
     * </p>
     */
    private String environmentIdentifier;
    /**
     * <p>
     * The maximum number of subscription targets to return in a single call to <code>ListSubscriptionTargets</code>.
     * When the number of subscription targets to be listed is greater than the value of <code>MaxResults</code>, the
     * response contains a <code>NextToken</code> value that you can use in a subsequent call to
     * <code>ListSubscriptionTargets</code> to list the next set of subscription targets.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * When the number of subscription targets is greater than the default value for the <code>MaxResults</code>
     * parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number of
     * subscription targets, the response includes a pagination token named <code>NextToken</code>. You can specify this
     * <code>NextToken</code> value in a subsequent call to <code>ListSubscriptionTargets</code> to list the next set of
     * subscription targets.
     * </p>
     */
    private String nextToken;
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
     * The identifier of the Amazon DataZone domain where you want to list subscription targets.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain where you want to list subscription targets.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain where you want to list subscription targets.
     * </p>
     * 
     * @return The identifier of the Amazon DataZone domain where you want to list subscription targets.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain where you want to list subscription targets.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain where you want to list subscription targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSubscriptionTargetsRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier of the environment where you want to list subscription targets.
     * </p>
     * 
     * @param environmentIdentifier
     *        The identifier of the environment where you want to list subscription targets.
     */

    public void setEnvironmentIdentifier(String environmentIdentifier) {
        this.environmentIdentifier = environmentIdentifier;
    }

    /**
     * <p>
     * The identifier of the environment where you want to list subscription targets.
     * </p>
     * 
     * @return The identifier of the environment where you want to list subscription targets.
     */

    public String getEnvironmentIdentifier() {
        return this.environmentIdentifier;
    }

    /**
     * <p>
     * The identifier of the environment where you want to list subscription targets.
     * </p>
     * 
     * @param environmentIdentifier
     *        The identifier of the environment where you want to list subscription targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSubscriptionTargetsRequest withEnvironmentIdentifier(String environmentIdentifier) {
        setEnvironmentIdentifier(environmentIdentifier);
        return this;
    }

    /**
     * <p>
     * The maximum number of subscription targets to return in a single call to <code>ListSubscriptionTargets</code>.
     * When the number of subscription targets to be listed is greater than the value of <code>MaxResults</code>, the
     * response contains a <code>NextToken</code> value that you can use in a subsequent call to
     * <code>ListSubscriptionTargets</code> to list the next set of subscription targets.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of subscription targets to return in a single call to
     *        <code>ListSubscriptionTargets</code>. When the number of subscription targets to be listed is greater than
     *        the value of <code>MaxResults</code>, the response contains a <code>NextToken</code> value that you can
     *        use in a subsequent call to <code>ListSubscriptionTargets</code> to list the next set of subscription
     *        targets.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of subscription targets to return in a single call to <code>ListSubscriptionTargets</code>.
     * When the number of subscription targets to be listed is greater than the value of <code>MaxResults</code>, the
     * response contains a <code>NextToken</code> value that you can use in a subsequent call to
     * <code>ListSubscriptionTargets</code> to list the next set of subscription targets.
     * </p>
     * 
     * @return The maximum number of subscription targets to return in a single call to
     *         <code>ListSubscriptionTargets</code>. When the number of subscription targets to be listed is greater
     *         than the value of <code>MaxResults</code>, the response contains a <code>NextToken</code> value that you
     *         can use in a subsequent call to <code>ListSubscriptionTargets</code> to list the next set of subscription
     *         targets.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of subscription targets to return in a single call to <code>ListSubscriptionTargets</code>.
     * When the number of subscription targets to be listed is greater than the value of <code>MaxResults</code>, the
     * response contains a <code>NextToken</code> value that you can use in a subsequent call to
     * <code>ListSubscriptionTargets</code> to list the next set of subscription targets.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of subscription targets to return in a single call to
     *        <code>ListSubscriptionTargets</code>. When the number of subscription targets to be listed is greater than
     *        the value of <code>MaxResults</code>, the response contains a <code>NextToken</code> value that you can
     *        use in a subsequent call to <code>ListSubscriptionTargets</code> to list the next set of subscription
     *        targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSubscriptionTargetsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * When the number of subscription targets is greater than the default value for the <code>MaxResults</code>
     * parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number of
     * subscription targets, the response includes a pagination token named <code>NextToken</code>. You can specify this
     * <code>NextToken</code> value in a subsequent call to <code>ListSubscriptionTargets</code> to list the next set of
     * subscription targets.
     * </p>
     * 
     * @param nextToken
     *        When the number of subscription targets is greater than the default value for the <code>MaxResults</code>
     *        parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number
     *        of subscription targets, the response includes a pagination token named <code>NextToken</code>. You can
     *        specify this <code>NextToken</code> value in a subsequent call to <code>ListSubscriptionTargets</code> to
     *        list the next set of subscription targets.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When the number of subscription targets is greater than the default value for the <code>MaxResults</code>
     * parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number of
     * subscription targets, the response includes a pagination token named <code>NextToken</code>. You can specify this
     * <code>NextToken</code> value in a subsequent call to <code>ListSubscriptionTargets</code> to list the next set of
     * subscription targets.
     * </p>
     * 
     * @return When the number of subscription targets is greater than the default value for the <code>MaxResults</code>
     *         parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number
     *         of subscription targets, the response includes a pagination token named <code>NextToken</code>. You can
     *         specify this <code>NextToken</code> value in a subsequent call to <code>ListSubscriptionTargets</code> to
     *         list the next set of subscription targets.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When the number of subscription targets is greater than the default value for the <code>MaxResults</code>
     * parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number of
     * subscription targets, the response includes a pagination token named <code>NextToken</code>. You can specify this
     * <code>NextToken</code> value in a subsequent call to <code>ListSubscriptionTargets</code> to list the next set of
     * subscription targets.
     * </p>
     * 
     * @param nextToken
     *        When the number of subscription targets is greater than the default value for the <code>MaxResults</code>
     *        parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number
     *        of subscription targets, the response includes a pagination token named <code>NextToken</code>. You can
     *        specify this <code>NextToken</code> value in a subsequent call to <code>ListSubscriptionTargets</code> to
     *        list the next set of subscription targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSubscriptionTargetsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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

    public ListSubscriptionTargetsRequest withSortBy(String sortBy) {
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

    public ListSubscriptionTargetsRequest withSortBy(SortKey sortBy) {
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

    public ListSubscriptionTargetsRequest withSortOrder(String sortOrder) {
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

    public ListSubscriptionTargetsRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
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
        if (getEnvironmentIdentifier() != null)
            sb.append("EnvironmentIdentifier: ").append(getEnvironmentIdentifier()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSubscriptionTargetsRequest == false)
            return false;
        ListSubscriptionTargetsRequest other = (ListSubscriptionTargetsRequest) obj;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getEnvironmentIdentifier() == null ^ this.getEnvironmentIdentifier() == null)
            return false;
        if (other.getEnvironmentIdentifier() != null && other.getEnvironmentIdentifier().equals(this.getEnvironmentIdentifier()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentIdentifier() == null) ? 0 : getEnvironmentIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public ListSubscriptionTargetsRequest clone() {
        return (ListSubscriptionTargetsRequest) super.clone();
    }

}
