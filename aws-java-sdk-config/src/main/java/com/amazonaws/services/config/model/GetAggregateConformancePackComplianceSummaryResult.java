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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetAggregateConformancePackComplianceSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAggregateConformancePackComplianceSummaryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * Returns a list of <code>AggregateConformancePackComplianceSummary</code> object.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AggregateConformancePackComplianceSummary> aggregateConformancePackComplianceSummaries;
    /**
     * <p>
     * Groups the result based on AWS Account ID or AWS Region.
     * </p>
     */
    private String groupByKey;
    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Returns a list of <code>AggregateConformancePackComplianceSummary</code> object.
     * </p>
     * 
     * @return Returns a list of <code>AggregateConformancePackComplianceSummary</code> object.
     */

    public java.util.List<AggregateConformancePackComplianceSummary> getAggregateConformancePackComplianceSummaries() {
        if (aggregateConformancePackComplianceSummaries == null) {
            aggregateConformancePackComplianceSummaries = new com.amazonaws.internal.SdkInternalList<AggregateConformancePackComplianceSummary>();
        }
        return aggregateConformancePackComplianceSummaries;
    }

    /**
     * <p>
     * Returns a list of <code>AggregateConformancePackComplianceSummary</code> object.
     * </p>
     * 
     * @param aggregateConformancePackComplianceSummaries
     *        Returns a list of <code>AggregateConformancePackComplianceSummary</code> object.
     */

    public void setAggregateConformancePackComplianceSummaries(
            java.util.Collection<AggregateConformancePackComplianceSummary> aggregateConformancePackComplianceSummaries) {
        if (aggregateConformancePackComplianceSummaries == null) {
            this.aggregateConformancePackComplianceSummaries = null;
            return;
        }

        this.aggregateConformancePackComplianceSummaries = new com.amazonaws.internal.SdkInternalList<AggregateConformancePackComplianceSummary>(
                aggregateConformancePackComplianceSummaries);
    }

    /**
     * <p>
     * Returns a list of <code>AggregateConformancePackComplianceSummary</code> object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAggregateConformancePackComplianceSummaries(java.util.Collection)} or
     * {@link #withAggregateConformancePackComplianceSummaries(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param aggregateConformancePackComplianceSummaries
     *        Returns a list of <code>AggregateConformancePackComplianceSummary</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAggregateConformancePackComplianceSummaryResult withAggregateConformancePackComplianceSummaries(
            AggregateConformancePackComplianceSummary... aggregateConformancePackComplianceSummaries) {
        if (this.aggregateConformancePackComplianceSummaries == null) {
            setAggregateConformancePackComplianceSummaries(new com.amazonaws.internal.SdkInternalList<AggregateConformancePackComplianceSummary>(
                    aggregateConformancePackComplianceSummaries.length));
        }
        for (AggregateConformancePackComplianceSummary ele : aggregateConformancePackComplianceSummaries) {
            this.aggregateConformancePackComplianceSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns a list of <code>AggregateConformancePackComplianceSummary</code> object.
     * </p>
     * 
     * @param aggregateConformancePackComplianceSummaries
     *        Returns a list of <code>AggregateConformancePackComplianceSummary</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAggregateConformancePackComplianceSummaryResult withAggregateConformancePackComplianceSummaries(
            java.util.Collection<AggregateConformancePackComplianceSummary> aggregateConformancePackComplianceSummaries) {
        setAggregateConformancePackComplianceSummaries(aggregateConformancePackComplianceSummaries);
        return this;
    }

    /**
     * <p>
     * Groups the result based on AWS Account ID or AWS Region.
     * </p>
     * 
     * @param groupByKey
     *        Groups the result based on AWS Account ID or AWS Region.
     */

    public void setGroupByKey(String groupByKey) {
        this.groupByKey = groupByKey;
    }

    /**
     * <p>
     * Groups the result based on AWS Account ID or AWS Region.
     * </p>
     * 
     * @return Groups the result based on AWS Account ID or AWS Region.
     */

    public String getGroupByKey() {
        return this.groupByKey;
    }

    /**
     * <p>
     * Groups the result based on AWS Account ID or AWS Region.
     * </p>
     * 
     * @param groupByKey
     *        Groups the result based on AWS Account ID or AWS Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAggregateConformancePackComplianceSummaryResult withGroupByKey(String groupByKey) {
        setGroupByKey(groupByKey);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned on a previous page that you use to get the next page of results
     *        in a paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @return The <code>nextToken</code> string returned on a previous page that you use to get the next page of
     *         results in a paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned on a previous page that you use to get the next page of results
     *        in a paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAggregateConformancePackComplianceSummaryResult withNextToken(String nextToken) {
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
        if (getAggregateConformancePackComplianceSummaries() != null)
            sb.append("AggregateConformancePackComplianceSummaries: ").append(getAggregateConformancePackComplianceSummaries()).append(",");
        if (getGroupByKey() != null)
            sb.append("GroupByKey: ").append(getGroupByKey()).append(",");
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

        if (obj instanceof GetAggregateConformancePackComplianceSummaryResult == false)
            return false;
        GetAggregateConformancePackComplianceSummaryResult other = (GetAggregateConformancePackComplianceSummaryResult) obj;
        if (other.getAggregateConformancePackComplianceSummaries() == null ^ this.getAggregateConformancePackComplianceSummaries() == null)
            return false;
        if (other.getAggregateConformancePackComplianceSummaries() != null
                && other.getAggregateConformancePackComplianceSummaries().equals(this.getAggregateConformancePackComplianceSummaries()) == false)
            return false;
        if (other.getGroupByKey() == null ^ this.getGroupByKey() == null)
            return false;
        if (other.getGroupByKey() != null && other.getGroupByKey().equals(this.getGroupByKey()) == false)
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

        hashCode = prime * hashCode
                + ((getAggregateConformancePackComplianceSummaries() == null) ? 0 : getAggregateConformancePackComplianceSummaries().hashCode());
        hashCode = prime * hashCode + ((getGroupByKey() == null) ? 0 : getGroupByKey().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetAggregateConformancePackComplianceSummaryResult clone() {
        try {
            return (GetAggregateConformancePackComplianceSummaryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
