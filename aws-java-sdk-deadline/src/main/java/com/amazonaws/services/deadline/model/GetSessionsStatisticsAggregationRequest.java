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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetSessionsStatisticsAggregation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSessionsStatisticsAggregationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier returned by the <code>StartSessionsStatisticsAggregation</code> operation that identifies the
     * aggregated statistics.
     * </p>
     */
    private String aggregationId;
    /**
     * <p>
     * The identifier of the farm to include in the statistics. This should be the same as the farm ID used in the call
     * to the <code>StartSessionsStatisticsAggregation</code> operation.
     * </p>
     */
    private String farmId;
    /**
     * <p>
     * The maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set
     * of sequential pages.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next set of results, or <code>null</code> to start from the beginning.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The identifier returned by the <code>StartSessionsStatisticsAggregation</code> operation that identifies the
     * aggregated statistics.
     * </p>
     * 
     * @param aggregationId
     *        The identifier returned by the <code>StartSessionsStatisticsAggregation</code> operation that identifies
     *        the aggregated statistics.
     */

    public void setAggregationId(String aggregationId) {
        this.aggregationId = aggregationId;
    }

    /**
     * <p>
     * The identifier returned by the <code>StartSessionsStatisticsAggregation</code> operation that identifies the
     * aggregated statistics.
     * </p>
     * 
     * @return The identifier returned by the <code>StartSessionsStatisticsAggregation</code> operation that identifies
     *         the aggregated statistics.
     */

    public String getAggregationId() {
        return this.aggregationId;
    }

    /**
     * <p>
     * The identifier returned by the <code>StartSessionsStatisticsAggregation</code> operation that identifies the
     * aggregated statistics.
     * </p>
     * 
     * @param aggregationId
     *        The identifier returned by the <code>StartSessionsStatisticsAggregation</code> operation that identifies
     *        the aggregated statistics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionsStatisticsAggregationRequest withAggregationId(String aggregationId) {
        setAggregationId(aggregationId);
        return this;
    }

    /**
     * <p>
     * The identifier of the farm to include in the statistics. This should be the same as the farm ID used in the call
     * to the <code>StartSessionsStatisticsAggregation</code> operation.
     * </p>
     * 
     * @param farmId
     *        The identifier of the farm to include in the statistics. This should be the same as the farm ID used in
     *        the call to the <code>StartSessionsStatisticsAggregation</code> operation.
     */

    public void setFarmId(String farmId) {
        this.farmId = farmId;
    }

    /**
     * <p>
     * The identifier of the farm to include in the statistics. This should be the same as the farm ID used in the call
     * to the <code>StartSessionsStatisticsAggregation</code> operation.
     * </p>
     * 
     * @return The identifier of the farm to include in the statistics. This should be the same as the farm ID used in
     *         the call to the <code>StartSessionsStatisticsAggregation</code> operation.
     */

    public String getFarmId() {
        return this.farmId;
    }

    /**
     * <p>
     * The identifier of the farm to include in the statistics. This should be the same as the farm ID used in the call
     * to the <code>StartSessionsStatisticsAggregation</code> operation.
     * </p>
     * 
     * @param farmId
     *        The identifier of the farm to include in the statistics. This should be the same as the farm ID used in
     *        the call to the <code>StartSessionsStatisticsAggregation</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionsStatisticsAggregationRequest withFarmId(String farmId) {
        setFarmId(farmId);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set
     * of sequential pages.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as
     *        a set of sequential pages.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set
     * of sequential pages.
     * </p>
     * 
     * @return The maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as
     *         a set of sequential pages.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set
     * of sequential pages.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as
     *        a set of sequential pages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionsStatisticsAggregationRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or <code>null</code> to start from the beginning.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or <code>null</code> to start from the beginning.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or <code>null</code> to start from the beginning.
     * </p>
     * 
     * @return The token for the next set of results, or <code>null</code> to start from the beginning.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or <code>null</code> to start from the beginning.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or <code>null</code> to start from the beginning.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionsStatisticsAggregationRequest withNextToken(String nextToken) {
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
        if (getAggregationId() != null)
            sb.append("AggregationId: ").append(getAggregationId()).append(",");
        if (getFarmId() != null)
            sb.append("FarmId: ").append(getFarmId()).append(",");
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

        if (obj instanceof GetSessionsStatisticsAggregationRequest == false)
            return false;
        GetSessionsStatisticsAggregationRequest other = (GetSessionsStatisticsAggregationRequest) obj;
        if (other.getAggregationId() == null ^ this.getAggregationId() == null)
            return false;
        if (other.getAggregationId() != null && other.getAggregationId().equals(this.getAggregationId()) == false)
            return false;
        if (other.getFarmId() == null ^ this.getFarmId() == null)
            return false;
        if (other.getFarmId() != null && other.getFarmId().equals(this.getFarmId()) == false)
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

        hashCode = prime * hashCode + ((getAggregationId() == null) ? 0 : getAggregationId().hashCode());
        hashCode = prime * hashCode + ((getFarmId() == null) ? 0 : getFarmId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetSessionsStatisticsAggregationRequest clone() {
        return (GetSessionsStatisticsAggregationRequest) super.clone();
    }

}
