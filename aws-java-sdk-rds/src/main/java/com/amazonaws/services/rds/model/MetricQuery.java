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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The query to retrieve metric data points.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/MetricQuery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricQuery implements Serializable, Cloneable {

    /**
     * <p>
     * The Performance Insights query that you can use to retrieve Performance Insights metric data points.
     * </p>
     */
    private PerformanceInsightsMetricQuery performanceInsightsMetricQuery;

    /**
     * <p>
     * The Performance Insights query that you can use to retrieve Performance Insights metric data points.
     * </p>
     * 
     * @param performanceInsightsMetricQuery
     *        The Performance Insights query that you can use to retrieve Performance Insights metric data points.
     */

    public void setPerformanceInsightsMetricQuery(PerformanceInsightsMetricQuery performanceInsightsMetricQuery) {
        this.performanceInsightsMetricQuery = performanceInsightsMetricQuery;
    }

    /**
     * <p>
     * The Performance Insights query that you can use to retrieve Performance Insights metric data points.
     * </p>
     * 
     * @return The Performance Insights query that you can use to retrieve Performance Insights metric data points.
     */

    public PerformanceInsightsMetricQuery getPerformanceInsightsMetricQuery() {
        return this.performanceInsightsMetricQuery;
    }

    /**
     * <p>
     * The Performance Insights query that you can use to retrieve Performance Insights metric data points.
     * </p>
     * 
     * @param performanceInsightsMetricQuery
     *        The Performance Insights query that you can use to retrieve Performance Insights metric data points.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricQuery withPerformanceInsightsMetricQuery(PerformanceInsightsMetricQuery performanceInsightsMetricQuery) {
        setPerformanceInsightsMetricQuery(performanceInsightsMetricQuery);
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
        if (getPerformanceInsightsMetricQuery() != null)
            sb.append("PerformanceInsightsMetricQuery: ").append(getPerformanceInsightsMetricQuery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricQuery == false)
            return false;
        MetricQuery other = (MetricQuery) obj;
        if (other.getPerformanceInsightsMetricQuery() == null ^ this.getPerformanceInsightsMetricQuery() == null)
            return false;
        if (other.getPerformanceInsightsMetricQuery() != null
                && other.getPerformanceInsightsMetricQuery().equals(this.getPerformanceInsightsMetricQuery()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPerformanceInsightsMetricQuery() == null) ? 0 : getPerformanceInsightsMetricQuery().hashCode());
        return hashCode;
    }

    @Override
    public MetricQuery clone() {
        try {
            return (MetricQuery) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
