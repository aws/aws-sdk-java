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
package com.amazonaws.services.costoptimizationhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/ListRecommendations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRecommendationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The constraints that you want all returned recommendations to match.
     * </p>
     */
    private Filter filter;
    /**
     * <p>
     * List of all recommendations for a resource, or a single recommendation if de-duped by <code>resourceId</code>.
     * </p>
     */
    private Boolean includeAllRecommendations;
    /**
     * <p>
     * The maximum number of recommendations that are returned for the request.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The ordering of recommendations by a dimension.
     * </p>
     */
    private OrderBy orderBy;

    /**
     * <p>
     * The constraints that you want all returned recommendations to match.
     * </p>
     * 
     * @param filter
     *        The constraints that you want all returned recommendations to match.
     */

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * The constraints that you want all returned recommendations to match.
     * </p>
     * 
     * @return The constraints that you want all returned recommendations to match.
     */

    public Filter getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * The constraints that you want all returned recommendations to match.
     * </p>
     * 
     * @param filter
     *        The constraints that you want all returned recommendations to match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationsRequest withFilter(Filter filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * List of all recommendations for a resource, or a single recommendation if de-duped by <code>resourceId</code>.
     * </p>
     * 
     * @param includeAllRecommendations
     *        List of all recommendations for a resource, or a single recommendation if de-duped by
     *        <code>resourceId</code>.
     */

    public void setIncludeAllRecommendations(Boolean includeAllRecommendations) {
        this.includeAllRecommendations = includeAllRecommendations;
    }

    /**
     * <p>
     * List of all recommendations for a resource, or a single recommendation if de-duped by <code>resourceId</code>.
     * </p>
     * 
     * @return List of all recommendations for a resource, or a single recommendation if de-duped by
     *         <code>resourceId</code>.
     */

    public Boolean getIncludeAllRecommendations() {
        return this.includeAllRecommendations;
    }

    /**
     * <p>
     * List of all recommendations for a resource, or a single recommendation if de-duped by <code>resourceId</code>.
     * </p>
     * 
     * @param includeAllRecommendations
     *        List of all recommendations for a resource, or a single recommendation if de-duped by
     *        <code>resourceId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationsRequest withIncludeAllRecommendations(Boolean includeAllRecommendations) {
        setIncludeAllRecommendations(includeAllRecommendations);
        return this;
    }

    /**
     * <p>
     * List of all recommendations for a resource, or a single recommendation if de-duped by <code>resourceId</code>.
     * </p>
     * 
     * @return List of all recommendations for a resource, or a single recommendation if de-duped by
     *         <code>resourceId</code>.
     */

    public Boolean isIncludeAllRecommendations() {
        return this.includeAllRecommendations;
    }

    /**
     * <p>
     * The maximum number of recommendations that are returned for the request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of recommendations that are returned for the request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of recommendations that are returned for the request.
     * </p>
     * 
     * @return The maximum number of recommendations that are returned for the request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of recommendations that are returned for the request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of recommendations that are returned for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @return The token to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The ordering of recommendations by a dimension.
     * </p>
     * 
     * @param orderBy
     *        The ordering of recommendations by a dimension.
     */

    public void setOrderBy(OrderBy orderBy) {
        this.orderBy = orderBy;
    }

    /**
     * <p>
     * The ordering of recommendations by a dimension.
     * </p>
     * 
     * @return The ordering of recommendations by a dimension.
     */

    public OrderBy getOrderBy() {
        return this.orderBy;
    }

    /**
     * <p>
     * The ordering of recommendations by a dimension.
     * </p>
     * 
     * @param orderBy
     *        The ordering of recommendations by a dimension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationsRequest withOrderBy(OrderBy orderBy) {
        setOrderBy(orderBy);
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
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getIncludeAllRecommendations() != null)
            sb.append("IncludeAllRecommendations: ").append(getIncludeAllRecommendations()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getOrderBy() != null)
            sb.append("OrderBy: ").append(getOrderBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRecommendationsRequest == false)
            return false;
        ListRecommendationsRequest other = (ListRecommendationsRequest) obj;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getIncludeAllRecommendations() == null ^ this.getIncludeAllRecommendations() == null)
            return false;
        if (other.getIncludeAllRecommendations() != null && other.getIncludeAllRecommendations().equals(this.getIncludeAllRecommendations()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getOrderBy() == null ^ this.getOrderBy() == null)
            return false;
        if (other.getOrderBy() != null && other.getOrderBy().equals(this.getOrderBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getIncludeAllRecommendations() == null) ? 0 : getIncludeAllRecommendations().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getOrderBy() == null) ? 0 : getOrderBy().hashCode());
        return hashCode;
    }

    @Override
    public ListRecommendationsRequest clone() {
        return (ListRecommendationsRequest) super.clone();
    }

}
