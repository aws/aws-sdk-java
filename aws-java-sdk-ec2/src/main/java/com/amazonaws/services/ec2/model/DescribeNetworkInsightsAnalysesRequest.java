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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeNetworkInsightsAnalysesRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNetworkInsightsAnalysesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeNetworkInsightsAnalysesRequest> {

    /**
     * <p>
     * The ID of the network insights analyses. You must specify either analysis IDs or a path ID.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> networkInsightsAnalysisIds;
    /**
     * <p>
     * The ID of the path. You must specify either a path ID or analysis IDs.
     * </p>
     */
    private String networkInsightsPathId;
    /**
     * <p>
     * The time when the network insights analyses started.
     * </p>
     */
    private java.util.Date analysisStartTime;
    /**
     * <p>
     * The time when the network insights analyses ended.
     * </p>
     */
    private java.util.Date analysisEndTime;
    /**
     * <p>
     * The filters. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PathFound - A Boolean value that indicates whether a feasible path is found.
     * </p>
     * </li>
     * <li>
     * <p>
     * Status - The status of the analysis (running | succeeded | failed).
     * </p>
     * </li>
     * </ul>
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
     * The ID of the network insights analyses. You must specify either analysis IDs or a path ID.
     * </p>
     * 
     * @return The ID of the network insights analyses. You must specify either analysis IDs or a path ID.
     */

    public java.util.List<String> getNetworkInsightsAnalysisIds() {
        if (networkInsightsAnalysisIds == null) {
            networkInsightsAnalysisIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return networkInsightsAnalysisIds;
    }

    /**
     * <p>
     * The ID of the network insights analyses. You must specify either analysis IDs or a path ID.
     * </p>
     * 
     * @param networkInsightsAnalysisIds
     *        The ID of the network insights analyses. You must specify either analysis IDs or a path ID.
     */

    public void setNetworkInsightsAnalysisIds(java.util.Collection<String> networkInsightsAnalysisIds) {
        if (networkInsightsAnalysisIds == null) {
            this.networkInsightsAnalysisIds = null;
            return;
        }

        this.networkInsightsAnalysisIds = new com.amazonaws.internal.SdkInternalList<String>(networkInsightsAnalysisIds);
    }

    /**
     * <p>
     * The ID of the network insights analyses. You must specify either analysis IDs or a path ID.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkInsightsAnalysisIds(java.util.Collection)} or
     * {@link #withNetworkInsightsAnalysisIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param networkInsightsAnalysisIds
     *        The ID of the network insights analyses. You must specify either analysis IDs or a path ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInsightsAnalysesRequest withNetworkInsightsAnalysisIds(String... networkInsightsAnalysisIds) {
        if (this.networkInsightsAnalysisIds == null) {
            setNetworkInsightsAnalysisIds(new com.amazonaws.internal.SdkInternalList<String>(networkInsightsAnalysisIds.length));
        }
        for (String ele : networkInsightsAnalysisIds) {
            this.networkInsightsAnalysisIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ID of the network insights analyses. You must specify either analysis IDs or a path ID.
     * </p>
     * 
     * @param networkInsightsAnalysisIds
     *        The ID of the network insights analyses. You must specify either analysis IDs or a path ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInsightsAnalysesRequest withNetworkInsightsAnalysisIds(java.util.Collection<String> networkInsightsAnalysisIds) {
        setNetworkInsightsAnalysisIds(networkInsightsAnalysisIds);
        return this;
    }

    /**
     * <p>
     * The ID of the path. You must specify either a path ID or analysis IDs.
     * </p>
     * 
     * @param networkInsightsPathId
     *        The ID of the path. You must specify either a path ID or analysis IDs.
     */

    public void setNetworkInsightsPathId(String networkInsightsPathId) {
        this.networkInsightsPathId = networkInsightsPathId;
    }

    /**
     * <p>
     * The ID of the path. You must specify either a path ID or analysis IDs.
     * </p>
     * 
     * @return The ID of the path. You must specify either a path ID or analysis IDs.
     */

    public String getNetworkInsightsPathId() {
        return this.networkInsightsPathId;
    }

    /**
     * <p>
     * The ID of the path. You must specify either a path ID or analysis IDs.
     * </p>
     * 
     * @param networkInsightsPathId
     *        The ID of the path. You must specify either a path ID or analysis IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInsightsAnalysesRequest withNetworkInsightsPathId(String networkInsightsPathId) {
        setNetworkInsightsPathId(networkInsightsPathId);
        return this;
    }

    /**
     * <p>
     * The time when the network insights analyses started.
     * </p>
     * 
     * @param analysisStartTime
     *        The time when the network insights analyses started.
     */

    public void setAnalysisStartTime(java.util.Date analysisStartTime) {
        this.analysisStartTime = analysisStartTime;
    }

    /**
     * <p>
     * The time when the network insights analyses started.
     * </p>
     * 
     * @return The time when the network insights analyses started.
     */

    public java.util.Date getAnalysisStartTime() {
        return this.analysisStartTime;
    }

    /**
     * <p>
     * The time when the network insights analyses started.
     * </p>
     * 
     * @param analysisStartTime
     *        The time when the network insights analyses started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInsightsAnalysesRequest withAnalysisStartTime(java.util.Date analysisStartTime) {
        setAnalysisStartTime(analysisStartTime);
        return this;
    }

    /**
     * <p>
     * The time when the network insights analyses ended.
     * </p>
     * 
     * @param analysisEndTime
     *        The time when the network insights analyses ended.
     */

    public void setAnalysisEndTime(java.util.Date analysisEndTime) {
        this.analysisEndTime = analysisEndTime;
    }

    /**
     * <p>
     * The time when the network insights analyses ended.
     * </p>
     * 
     * @return The time when the network insights analyses ended.
     */

    public java.util.Date getAnalysisEndTime() {
        return this.analysisEndTime;
    }

    /**
     * <p>
     * The time when the network insights analyses ended.
     * </p>
     * 
     * @param analysisEndTime
     *        The time when the network insights analyses ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInsightsAnalysesRequest withAnalysisEndTime(java.util.Date analysisEndTime) {
        setAnalysisEndTime(analysisEndTime);
        return this;
    }

    /**
     * <p>
     * The filters. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PathFound - A Boolean value that indicates whether a feasible path is found.
     * </p>
     * </li>
     * <li>
     * <p>
     * Status - The status of the analysis (running | succeeded | failed).
     * </p>
     * </li>
     * </ul>
     * 
     * @return The filters. The following are possible values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         PathFound - A Boolean value that indicates whether a feasible path is found.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Status - The status of the analysis (running | succeeded | failed).
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * The filters. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PathFound - A Boolean value that indicates whether a feasible path is found.
     * </p>
     * </li>
     * <li>
     * <p>
     * Status - The status of the analysis (running | succeeded | failed).
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filters. The following are possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PathFound - A Boolean value that indicates whether a feasible path is found.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Status - The status of the analysis (running | succeeded | failed).
     *        </p>
     *        </li>
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
     * The filters. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PathFound - A Boolean value that indicates whether a feasible path is found.
     * </p>
     * </li>
     * <li>
     * <p>
     * Status - The status of the analysis (running | succeeded | failed).
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        The filters. The following are possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PathFound - A Boolean value that indicates whether a feasible path is found.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Status - The status of the analysis (running | succeeded | failed).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInsightsAnalysesRequest withFilters(Filter... filters) {
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
     * The filters. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PathFound - A Boolean value that indicates whether a feasible path is found.
     * </p>
     * </li>
     * <li>
     * <p>
     * Status - The status of the analysis (running | succeeded | failed).
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filters. The following are possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PathFound - A Boolean value that indicates whether a feasible path is found.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Status - The status of the analysis (running | succeeded | failed).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInsightsAnalysesRequest withFilters(java.util.Collection<Filter> filters) {
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

    public DescribeNetworkInsightsAnalysesRequest withMaxResults(Integer maxResults) {
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

    public DescribeNetworkInsightsAnalysesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeNetworkInsightsAnalysesRequest> getDryRunRequest() {
        Request<DescribeNetworkInsightsAnalysesRequest> request = new DescribeNetworkInsightsAnalysesRequestMarshaller().marshall(this);
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
        if (getNetworkInsightsAnalysisIds() != null)
            sb.append("NetworkInsightsAnalysisIds: ").append(getNetworkInsightsAnalysisIds()).append(",");
        if (getNetworkInsightsPathId() != null)
            sb.append("NetworkInsightsPathId: ").append(getNetworkInsightsPathId()).append(",");
        if (getAnalysisStartTime() != null)
            sb.append("AnalysisStartTime: ").append(getAnalysisStartTime()).append(",");
        if (getAnalysisEndTime() != null)
            sb.append("AnalysisEndTime: ").append(getAnalysisEndTime()).append(",");
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

        if (obj instanceof DescribeNetworkInsightsAnalysesRequest == false)
            return false;
        DescribeNetworkInsightsAnalysesRequest other = (DescribeNetworkInsightsAnalysesRequest) obj;
        if (other.getNetworkInsightsAnalysisIds() == null ^ this.getNetworkInsightsAnalysisIds() == null)
            return false;
        if (other.getNetworkInsightsAnalysisIds() != null && other.getNetworkInsightsAnalysisIds().equals(this.getNetworkInsightsAnalysisIds()) == false)
            return false;
        if (other.getNetworkInsightsPathId() == null ^ this.getNetworkInsightsPathId() == null)
            return false;
        if (other.getNetworkInsightsPathId() != null && other.getNetworkInsightsPathId().equals(this.getNetworkInsightsPathId()) == false)
            return false;
        if (other.getAnalysisStartTime() == null ^ this.getAnalysisStartTime() == null)
            return false;
        if (other.getAnalysisStartTime() != null && other.getAnalysisStartTime().equals(this.getAnalysisStartTime()) == false)
            return false;
        if (other.getAnalysisEndTime() == null ^ this.getAnalysisEndTime() == null)
            return false;
        if (other.getAnalysisEndTime() != null && other.getAnalysisEndTime().equals(this.getAnalysisEndTime()) == false)
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

        hashCode = prime * hashCode + ((getNetworkInsightsAnalysisIds() == null) ? 0 : getNetworkInsightsAnalysisIds().hashCode());
        hashCode = prime * hashCode + ((getNetworkInsightsPathId() == null) ? 0 : getNetworkInsightsPathId().hashCode());
        hashCode = prime * hashCode + ((getAnalysisStartTime() == null) ? 0 : getAnalysisStartTime().hashCode());
        hashCode = prime * hashCode + ((getAnalysisEndTime() == null) ? 0 : getAnalysisEndTime().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeNetworkInsightsAnalysesRequest clone() {
        return (DescribeNetworkInsightsAnalysesRequest) super.clone();
    }
}
