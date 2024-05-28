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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/ListRecommendationSummaries"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRecommendationSummariesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private Filter filter;
    /**
     * <p>
     * The grouping of recommendations by a dimension.
     * </p>
     */
    private String groupBy;
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
     * @param filter
     */

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    /**
     * @return
     */

    public Filter getFilter() {
        return this.filter;
    }

    /**
     * @param filter
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationSummariesRequest withFilter(Filter filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * The grouping of recommendations by a dimension.
     * </p>
     * 
     * @param groupBy
     *        The grouping of recommendations by a dimension.
     */

    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }

    /**
     * <p>
     * The grouping of recommendations by a dimension.
     * </p>
     * 
     * @return The grouping of recommendations by a dimension.
     */

    public String getGroupBy() {
        return this.groupBy;
    }

    /**
     * <p>
     * The grouping of recommendations by a dimension.
     * </p>
     * 
     * @param groupBy
     *        The grouping of recommendations by a dimension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationSummariesRequest withGroupBy(String groupBy) {
        setGroupBy(groupBy);
        return this;
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

    public ListRecommendationSummariesRequest withMaxResults(Integer maxResults) {
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

    public ListRecommendationSummariesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getGroupBy() != null)
            sb.append("GroupBy: ").append(getGroupBy()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRecommendationSummariesRequest == false)
            return false;
        ListRecommendationSummariesRequest other = (ListRecommendationSummariesRequest) obj;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getGroupBy() == null ^ this.getGroupBy() == null)
            return false;
        if (other.getGroupBy() != null && other.getGroupBy().equals(this.getGroupBy()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getGroupBy() == null) ? 0 : getGroupBy().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRecommendationSummariesRequest clone() {
        return (ListRecommendationSummariesRequest) super.clone();
    }

}
