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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/StartSessionsStatisticsAggregation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartSessionsStatisticsAggregationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A unique identifier for the aggregated statistics. Use this identifier with the
     * <code>GetAggregatedStatisticsForSessions</code> operation to return the statistics.
     * </p>
     */
    private String aggregationId;

    /**
     * <p>
     * A unique identifier for the aggregated statistics. Use this identifier with the
     * <code>GetAggregatedStatisticsForSessions</code> operation to return the statistics.
     * </p>
     * 
     * @param aggregationId
     *        A unique identifier for the aggregated statistics. Use this identifier with the
     *        <code>GetAggregatedStatisticsForSessions</code> operation to return the statistics.
     */

    public void setAggregationId(String aggregationId) {
        this.aggregationId = aggregationId;
    }

    /**
     * <p>
     * A unique identifier for the aggregated statistics. Use this identifier with the
     * <code>GetAggregatedStatisticsForSessions</code> operation to return the statistics.
     * </p>
     * 
     * @return A unique identifier for the aggregated statistics. Use this identifier with the
     *         <code>GetAggregatedStatisticsForSessions</code> operation to return the statistics.
     */

    public String getAggregationId() {
        return this.aggregationId;
    }

    /**
     * <p>
     * A unique identifier for the aggregated statistics. Use this identifier with the
     * <code>GetAggregatedStatisticsForSessions</code> operation to return the statistics.
     * </p>
     * 
     * @param aggregationId
     *        A unique identifier for the aggregated statistics. Use this identifier with the
     *        <code>GetAggregatedStatisticsForSessions</code> operation to return the statistics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSessionsStatisticsAggregationResult withAggregationId(String aggregationId) {
        setAggregationId(aggregationId);
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
            sb.append("AggregationId: ").append(getAggregationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartSessionsStatisticsAggregationResult == false)
            return false;
        StartSessionsStatisticsAggregationResult other = (StartSessionsStatisticsAggregationResult) obj;
        if (other.getAggregationId() == null ^ this.getAggregationId() == null)
            return false;
        if (other.getAggregationId() != null && other.getAggregationId().equals(this.getAggregationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAggregationId() == null) ? 0 : getAggregationId().hashCode());
        return hashCode;
    }

    @Override
    public StartSessionsStatisticsAggregationResult clone() {
        try {
            return (StartSessionsStatisticsAggregationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
