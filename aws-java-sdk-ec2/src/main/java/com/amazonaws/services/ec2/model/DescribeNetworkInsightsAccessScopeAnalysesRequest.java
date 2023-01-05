/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeNetworkInsightsAccessScopeAnalysesRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNetworkInsightsAccessScopeAnalysesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeNetworkInsightsAccessScopeAnalysesRequest> {

    /**
     * <p>
     * The IDs of the Network Access Scope analyses.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> networkInsightsAccessScopeAnalysisIds;
    /**
     * <p>
     * The ID of the Network Access Scope.
     * </p>
     */
    private String networkInsightsAccessScopeId;
    /**
     * <p>
     * Filters the results based on the start time. The analysis must have started on or after this time.
     * </p>
     */
    private java.util.Date analysisStartTimeBegin;
    /**
     * <p>
     * Filters the results based on the start time. The analysis must have started on or before this time.
     * </p>
     */
    private java.util.Date analysisStartTimeEnd;
    /**
     * <p>
     * There are no supported filters.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The IDs of the Network Access Scope analyses.
     * </p>
     * 
     * @return The IDs of the Network Access Scope analyses.
     */

    public java.util.List<String> getNetworkInsightsAccessScopeAnalysisIds() {
        if (networkInsightsAccessScopeAnalysisIds == null) {
            networkInsightsAccessScopeAnalysisIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return networkInsightsAccessScopeAnalysisIds;
    }

    /**
     * <p>
     * The IDs of the Network Access Scope analyses.
     * </p>
     * 
     * @param networkInsightsAccessScopeAnalysisIds
     *        The IDs of the Network Access Scope analyses.
     */

    public void setNetworkInsightsAccessScopeAnalysisIds(java.util.Collection<String> networkInsightsAccessScopeAnalysisIds) {
        if (networkInsightsAccessScopeAnalysisIds == null) {
            this.networkInsightsAccessScopeAnalysisIds = null;
            return;
        }

        this.networkInsightsAccessScopeAnalysisIds = new com.amazonaws.internal.SdkInternalList<String>(networkInsightsAccessScopeAnalysisIds);
    }

    /**
     * <p>
     * The IDs of the Network Access Scope analyses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkInsightsAccessScopeAnalysisIds(java.util.Collection)} or
     * {@link #withNetworkInsightsAccessScopeAnalysisIds(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param networkInsightsAccessScopeAnalysisIds
     *        The IDs of the Network Access Scope analyses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInsightsAccessScopeAnalysesRequest withNetworkInsightsAccessScopeAnalysisIds(String... networkInsightsAccessScopeAnalysisIds) {
        if (this.networkInsightsAccessScopeAnalysisIds == null) {
            setNetworkInsightsAccessScopeAnalysisIds(new com.amazonaws.internal.SdkInternalList<String>(networkInsightsAccessScopeAnalysisIds.length));
        }
        for (String ele : networkInsightsAccessScopeAnalysisIds) {
            this.networkInsightsAccessScopeAnalysisIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the Network Access Scope analyses.
     * </p>
     * 
     * @param networkInsightsAccessScopeAnalysisIds
     *        The IDs of the Network Access Scope analyses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInsightsAccessScopeAnalysesRequest withNetworkInsightsAccessScopeAnalysisIds(
            java.util.Collection<String> networkInsightsAccessScopeAnalysisIds) {
        setNetworkInsightsAccessScopeAnalysisIds(networkInsightsAccessScopeAnalysisIds);
        return this;
    }

    /**
     * <p>
     * The ID of the Network Access Scope.
     * </p>
     * 
     * @param networkInsightsAccessScopeId
     *        The ID of the Network Access Scope.
     */

    public void setNetworkInsightsAccessScopeId(String networkInsightsAccessScopeId) {
        this.networkInsightsAccessScopeId = networkInsightsAccessScopeId;
    }

    /**
     * <p>
     * The ID of the Network Access Scope.
     * </p>
     * 
     * @return The ID of the Network Access Scope.
     */

    public String getNetworkInsightsAccessScopeId() {
        return this.networkInsightsAccessScopeId;
    }

    /**
     * <p>
     * The ID of the Network Access Scope.
     * </p>
     * 
     * @param networkInsightsAccessScopeId
     *        The ID of the Network Access Scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInsightsAccessScopeAnalysesRequest withNetworkInsightsAccessScopeId(String networkInsightsAccessScopeId) {
        setNetworkInsightsAccessScopeId(networkInsightsAccessScopeId);
        return this;
    }

    /**
     * <p>
     * Filters the results based on the start time. The analysis must have started on or after this time.
     * </p>
     * 
     * @param analysisStartTimeBegin
     *        Filters the results based on the start time. The analysis must have started on or after this time.
     */

    public void setAnalysisStartTimeBegin(java.util.Date analysisStartTimeBegin) {
        this.analysisStartTimeBegin = analysisStartTimeBegin;
    }

    /**
     * <p>
     * Filters the results based on the start time. The analysis must have started on or after this time.
     * </p>
     * 
     * @return Filters the results based on the start time. The analysis must have started on or after this time.
     */

    public java.util.Date getAnalysisStartTimeBegin() {
        return this.analysisStartTimeBegin;
    }

    /**
     * <p>
     * Filters the results based on the start time. The analysis must have started on or after this time.
     * </p>
     * 
     * @param analysisStartTimeBegin
     *        Filters the results based on the start time. The analysis must have started on or after this time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInsightsAccessScopeAnalysesRequest withAnalysisStartTimeBegin(java.util.Date analysisStartTimeBegin) {
        setAnalysisStartTimeBegin(analysisStartTimeBegin);
        return this;
    }

    /**
     * <p>
     * Filters the results based on the start time. The analysis must have started on or before this time.
     * </p>
     * 
     * @param analysisStartTimeEnd
     *        Filters the results based on the start time. The analysis must have started on or before this time.
     */

    public void setAnalysisStartTimeEnd(java.util.Date analysisStartTimeEnd) {
        this.analysisStartTimeEnd = analysisStartTimeEnd;
    }

    /**
     * <p>
     * Filters the results based on the start time. The analysis must have started on or before this time.
     * </p>
     * 
     * @return Filters the results based on the start time. The analysis must have started on or before this time.
     */

    public java.util.Date getAnalysisStartTimeEnd() {
        return this.analysisStartTimeEnd;
    }

    /**
     * <p>
     * Filters the results based on the start time. The analysis must have started on or before this time.
     * </p>
     * 
     * @param analysisStartTimeEnd
     *        Filters the results based on the start time. The analysis must have started on or before this time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInsightsAccessScopeAnalysesRequest withAnalysisStartTimeEnd(java.util.Date analysisStartTimeEnd) {
        setAnalysisStartTimeEnd(analysisStartTimeEnd);
        return this;
    }

    /**
     * <p>
     * There are no supported filters.
     * </p>
     * 
     * @return There are no supported filters.
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * There are no supported filters.
     * </p>
     * 
     * @param filters
     *        There are no supported filters.
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(filters);
    }

    /**
     * <p>
     * There are no supported filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        There are no supported filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInsightsAccessScopeAnalysesRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * There are no supported filters.
     * </p>
     * 
     * @param filters
     *        There are no supported filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInsightsAccessScopeAnalysesRequest withFilters(java.util.Collection<Filter> filters) {
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

    public DescribeNetworkInsightsAccessScopeAnalysesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @return The token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInsightsAccessScopeAnalysesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeNetworkInsightsAccessScopeAnalysesRequest> getDryRunRequest() {
        Request<DescribeNetworkInsightsAccessScopeAnalysesRequest> request = new DescribeNetworkInsightsAccessScopeAnalysesRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getNetworkInsightsAccessScopeAnalysisIds() != null)
            sb.append("NetworkInsightsAccessScopeAnalysisIds: ").append(getNetworkInsightsAccessScopeAnalysisIds()).append(",");
        if (getNetworkInsightsAccessScopeId() != null)
            sb.append("NetworkInsightsAccessScopeId: ").append(getNetworkInsightsAccessScopeId()).append(",");
        if (getAnalysisStartTimeBegin() != null)
            sb.append("AnalysisStartTimeBegin: ").append(getAnalysisStartTimeBegin()).append(",");
        if (getAnalysisStartTimeEnd() != null)
            sb.append("AnalysisStartTimeEnd: ").append(getAnalysisStartTimeEnd()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
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

        if (obj instanceof DescribeNetworkInsightsAccessScopeAnalysesRequest == false)
            return false;
        DescribeNetworkInsightsAccessScopeAnalysesRequest other = (DescribeNetworkInsightsAccessScopeAnalysesRequest) obj;
        if (other.getNetworkInsightsAccessScopeAnalysisIds() == null ^ this.getNetworkInsightsAccessScopeAnalysisIds() == null)
            return false;
        if (other.getNetworkInsightsAccessScopeAnalysisIds() != null
                && other.getNetworkInsightsAccessScopeAnalysisIds().equals(this.getNetworkInsightsAccessScopeAnalysisIds()) == false)
            return false;
        if (other.getNetworkInsightsAccessScopeId() == null ^ this.getNetworkInsightsAccessScopeId() == null)
            return false;
        if (other.getNetworkInsightsAccessScopeId() != null && other.getNetworkInsightsAccessScopeId().equals(this.getNetworkInsightsAccessScopeId()) == false)
            return false;
        if (other.getAnalysisStartTimeBegin() == null ^ this.getAnalysisStartTimeBegin() == null)
            return false;
        if (other.getAnalysisStartTimeBegin() != null && other.getAnalysisStartTimeBegin().equals(this.getAnalysisStartTimeBegin()) == false)
            return false;
        if (other.getAnalysisStartTimeEnd() == null ^ this.getAnalysisStartTimeEnd() == null)
            return false;
        if (other.getAnalysisStartTimeEnd() != null && other.getAnalysisStartTimeEnd().equals(this.getAnalysisStartTimeEnd()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkInsightsAccessScopeAnalysisIds() == null) ? 0 : getNetworkInsightsAccessScopeAnalysisIds().hashCode());
        hashCode = prime * hashCode + ((getNetworkInsightsAccessScopeId() == null) ? 0 : getNetworkInsightsAccessScopeId().hashCode());
        hashCode = prime * hashCode + ((getAnalysisStartTimeBegin() == null) ? 0 : getAnalysisStartTimeBegin().hashCode());
        hashCode = prime * hashCode + ((getAnalysisStartTimeEnd() == null) ? 0 : getAnalysisStartTimeEnd().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeNetworkInsightsAccessScopeAnalysesRequest clone() {
        return (DescribeNetworkInsightsAccessScopeAnalysesRequest) super.clone();
    }
}
