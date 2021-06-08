/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/SearchInsights" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchInsightsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The start of the time range passed in. Returned insights occurred after this time.
     * </p>
     */
    private StartTimeRange startTimeRange;
    /**
     * <p>
     * A <code>SearchInsightsFilters</code> object that is used to set the severity and status filters on your insight
     * search.
     * </p>
     */
    private SearchInsightsFilters filters;
    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it
     * retrieves the first page.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The type of insights you are searching for (<code>REACTIVE</code> or <code>PROACTIVE</code>).
     * </p>
     */
    private String type;

    /**
     * <p>
     * The start of the time range passed in. Returned insights occurred after this time.
     * </p>
     * 
     * @param startTimeRange
     *        The start of the time range passed in. Returned insights occurred after this time.
     */

    public void setStartTimeRange(StartTimeRange startTimeRange) {
        this.startTimeRange = startTimeRange;
    }

    /**
     * <p>
     * The start of the time range passed in. Returned insights occurred after this time.
     * </p>
     * 
     * @return The start of the time range passed in. Returned insights occurred after this time.
     */

    public StartTimeRange getStartTimeRange() {
        return this.startTimeRange;
    }

    /**
     * <p>
     * The start of the time range passed in. Returned insights occurred after this time.
     * </p>
     * 
     * @param startTimeRange
     *        The start of the time range passed in. Returned insights occurred after this time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchInsightsRequest withStartTimeRange(StartTimeRange startTimeRange) {
        setStartTimeRange(startTimeRange);
        return this;
    }

    /**
     * <p>
     * A <code>SearchInsightsFilters</code> object that is used to set the severity and status filters on your insight
     * search.
     * </p>
     * 
     * @param filters
     *        A <code>SearchInsightsFilters</code> object that is used to set the severity and status filters on your
     *        insight search.
     */

    public void setFilters(SearchInsightsFilters filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * A <code>SearchInsightsFilters</code> object that is used to set the severity and status filters on your insight
     * search.
     * </p>
     * 
     * @return A <code>SearchInsightsFilters</code> object that is used to set the severity and status filters on your
     *         insight search.
     */

    public SearchInsightsFilters getFilters() {
        return this.filters;
    }

    /**
     * <p>
     * A <code>SearchInsightsFilters</code> object that is used to set the severity and status filters on your insight
     * search.
     * </p>
     * 
     * @param filters
     *        A <code>SearchInsightsFilters</code> object that is used to set the severity and status filters on your
     *        insight search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchInsightsRequest withFilters(SearchInsightsFilters filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned <code>nextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @return The maximum number of results to return with a single call. To retrieve the remaining results, make
     *         another call with the returned <code>nextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned <code>nextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchInsightsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it
     * retrieves the first page.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If this value is
     *        null, it retrieves the first page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it
     * retrieves the first page.
     * </p>
     * 
     * @return The pagination token to use to retrieve the next page of results for this operation. If this value is
     *         null, it retrieves the first page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it
     * retrieves the first page.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If this value is
     *        null, it retrieves the first page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchInsightsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The type of insights you are searching for (<code>REACTIVE</code> or <code>PROACTIVE</code>).
     * </p>
     * 
     * @param type
     *        The type of insights you are searching for (<code>REACTIVE</code> or <code>PROACTIVE</code>).
     * @see InsightType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of insights you are searching for (<code>REACTIVE</code> or <code>PROACTIVE</code>).
     * </p>
     * 
     * @return The type of insights you are searching for (<code>REACTIVE</code> or <code>PROACTIVE</code>).
     * @see InsightType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of insights you are searching for (<code>REACTIVE</code> or <code>PROACTIVE</code>).
     * </p>
     * 
     * @param type
     *        The type of insights you are searching for (<code>REACTIVE</code> or <code>PROACTIVE</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightType
     */

    public SearchInsightsRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of insights you are searching for (<code>REACTIVE</code> or <code>PROACTIVE</code>).
     * </p>
     * 
     * @param type
     *        The type of insights you are searching for (<code>REACTIVE</code> or <code>PROACTIVE</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightType
     */

    public SearchInsightsRequest withType(InsightType type) {
        this.type = type.toString();
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
        if (getStartTimeRange() != null)
            sb.append("StartTimeRange: ").append(getStartTimeRange()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchInsightsRequest == false)
            return false;
        SearchInsightsRequest other = (SearchInsightsRequest) obj;
        if (other.getStartTimeRange() == null ^ this.getStartTimeRange() == null)
            return false;
        if (other.getStartTimeRange() != null && other.getStartTimeRange().equals(this.getStartTimeRange()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartTimeRange() == null) ? 0 : getStartTimeRange().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public SearchInsightsRequest clone() {
        return (SearchInsightsRequest) super.clone();
    }

}
