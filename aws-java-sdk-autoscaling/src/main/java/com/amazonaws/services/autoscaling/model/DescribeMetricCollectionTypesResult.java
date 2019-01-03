/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeMetricCollectionTypes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMetricCollectionTypesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * One or more metrics.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MetricCollectionType> metrics;
    /**
     * <p>
     * The granularities for the metrics.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MetricGranularityType> granularities;

    /**
     * <p>
     * One or more metrics.
     * </p>
     * 
     * @return One or more metrics.
     */

    public java.util.List<MetricCollectionType> getMetrics() {
        if (metrics == null) {
            metrics = new com.amazonaws.internal.SdkInternalList<MetricCollectionType>();
        }
        return metrics;
    }

    /**
     * <p>
     * One or more metrics.
     * </p>
     * 
     * @param metrics
     *        One or more metrics.
     */

    public void setMetrics(java.util.Collection<MetricCollectionType> metrics) {
        if (metrics == null) {
            this.metrics = null;
            return;
        }

        this.metrics = new com.amazonaws.internal.SdkInternalList<MetricCollectionType>(metrics);
    }

    /**
     * <p>
     * One or more metrics.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetrics(java.util.Collection)} or {@link #withMetrics(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param metrics
     *        One or more metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMetricCollectionTypesResult withMetrics(MetricCollectionType... metrics) {
        if (this.metrics == null) {
            setMetrics(new com.amazonaws.internal.SdkInternalList<MetricCollectionType>(metrics.length));
        }
        for (MetricCollectionType ele : metrics) {
            this.metrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more metrics.
     * </p>
     * 
     * @param metrics
     *        One or more metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMetricCollectionTypesResult withMetrics(java.util.Collection<MetricCollectionType> metrics) {
        setMetrics(metrics);
        return this;
    }

    /**
     * <p>
     * The granularities for the metrics.
     * </p>
     * 
     * @return The granularities for the metrics.
     */

    public java.util.List<MetricGranularityType> getGranularities() {
        if (granularities == null) {
            granularities = new com.amazonaws.internal.SdkInternalList<MetricGranularityType>();
        }
        return granularities;
    }

    /**
     * <p>
     * The granularities for the metrics.
     * </p>
     * 
     * @param granularities
     *        The granularities for the metrics.
     */

    public void setGranularities(java.util.Collection<MetricGranularityType> granularities) {
        if (granularities == null) {
            this.granularities = null;
            return;
        }

        this.granularities = new com.amazonaws.internal.SdkInternalList<MetricGranularityType>(granularities);
    }

    /**
     * <p>
     * The granularities for the metrics.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGranularities(java.util.Collection)} or {@link #withGranularities(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param granularities
     *        The granularities for the metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMetricCollectionTypesResult withGranularities(MetricGranularityType... granularities) {
        if (this.granularities == null) {
            setGranularities(new com.amazonaws.internal.SdkInternalList<MetricGranularityType>(granularities.length));
        }
        for (MetricGranularityType ele : granularities) {
            this.granularities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The granularities for the metrics.
     * </p>
     * 
     * @param granularities
     *        The granularities for the metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMetricCollectionTypesResult withGranularities(java.util.Collection<MetricGranularityType> granularities) {
        setGranularities(granularities);
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
        if (getMetrics() != null)
            sb.append("Metrics: ").append(getMetrics()).append(",");
        if (getGranularities() != null)
            sb.append("Granularities: ").append(getGranularities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMetricCollectionTypesResult == false)
            return false;
        DescribeMetricCollectionTypesResult other = (DescribeMetricCollectionTypesResult) obj;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        if (other.getGranularities() == null ^ this.getGranularities() == null)
            return false;
        if (other.getGranularities() != null && other.getGranularities().equals(this.getGranularities()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        hashCode = prime * hashCode + ((getGranularities() == null) ? 0 : getGranularities().hashCode());
        return hashCode;
    }

    @Override
    public DescribeMetricCollectionTypesResult clone() {
        try {
            return (DescribeMetricCollectionTypesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
