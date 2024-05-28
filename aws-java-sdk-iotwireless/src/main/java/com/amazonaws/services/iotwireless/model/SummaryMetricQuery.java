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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The summary metric query object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/SummaryMetricQuery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SummaryMetricQuery implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The id of the summary metric query.
     * </p>
     */
    private String queryId;
    /**
     * <p>
     * The name of the metric.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The dimensions of the summary metric.
     * </p>
     */
    private java.util.List<Dimension> dimensions;
    /**
     * <p>
     * The aggregation period of the summary metric.
     * </p>
     */
    private String aggregationPeriod;
    /**
     * <p>
     * The start timestamp for the summary metric query.
     * </p>
     */
    private java.util.Date startTimestamp;
    /**
     * <p>
     * The end timestamp for the summary metric query.
     * </p>
     */
    private java.util.Date endTimestamp;

    /**
     * <p>
     * The id of the summary metric query.
     * </p>
     * 
     * @param queryId
     *        The id of the summary metric query.
     */

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    /**
     * <p>
     * The id of the summary metric query.
     * </p>
     * 
     * @return The id of the summary metric query.
     */

    public String getQueryId() {
        return this.queryId;
    }

    /**
     * <p>
     * The id of the summary metric query.
     * </p>
     * 
     * @param queryId
     *        The id of the summary metric query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SummaryMetricQuery withQueryId(String queryId) {
        setQueryId(queryId);
        return this;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * 
     * @param metricName
     *        The name of the metric.
     * @see MetricName
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * 
     * @return The name of the metric.
     * @see MetricName
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * 
     * @param metricName
     *        The name of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricName
     */

    public SummaryMetricQuery withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * 
     * @param metricName
     *        The name of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricName
     */

    public SummaryMetricQuery withMetricName(MetricName metricName) {
        this.metricName = metricName.toString();
        return this;
    }

    /**
     * <p>
     * The dimensions of the summary metric.
     * </p>
     * 
     * @return The dimensions of the summary metric.
     */

    public java.util.List<Dimension> getDimensions() {
        return dimensions;
    }

    /**
     * <p>
     * The dimensions of the summary metric.
     * </p>
     * 
     * @param dimensions
     *        The dimensions of the summary metric.
     */

    public void setDimensions(java.util.Collection<Dimension> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
            return;
        }

        this.dimensions = new java.util.ArrayList<Dimension>(dimensions);
    }

    /**
     * <p>
     * The dimensions of the summary metric.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensions(java.util.Collection)} or {@link #withDimensions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dimensions
     *        The dimensions of the summary metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SummaryMetricQuery withDimensions(Dimension... dimensions) {
        if (this.dimensions == null) {
            setDimensions(new java.util.ArrayList<Dimension>(dimensions.length));
        }
        for (Dimension ele : dimensions) {
            this.dimensions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The dimensions of the summary metric.
     * </p>
     * 
     * @param dimensions
     *        The dimensions of the summary metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SummaryMetricQuery withDimensions(java.util.Collection<Dimension> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * <p>
     * The aggregation period of the summary metric.
     * </p>
     * 
     * @param aggregationPeriod
     *        The aggregation period of the summary metric.
     * @see AggregationPeriod
     */

    public void setAggregationPeriod(String aggregationPeriod) {
        this.aggregationPeriod = aggregationPeriod;
    }

    /**
     * <p>
     * The aggregation period of the summary metric.
     * </p>
     * 
     * @return The aggregation period of the summary metric.
     * @see AggregationPeriod
     */

    public String getAggregationPeriod() {
        return this.aggregationPeriod;
    }

    /**
     * <p>
     * The aggregation period of the summary metric.
     * </p>
     * 
     * @param aggregationPeriod
     *        The aggregation period of the summary metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AggregationPeriod
     */

    public SummaryMetricQuery withAggregationPeriod(String aggregationPeriod) {
        setAggregationPeriod(aggregationPeriod);
        return this;
    }

    /**
     * <p>
     * The aggregation period of the summary metric.
     * </p>
     * 
     * @param aggregationPeriod
     *        The aggregation period of the summary metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AggregationPeriod
     */

    public SummaryMetricQuery withAggregationPeriod(AggregationPeriod aggregationPeriod) {
        this.aggregationPeriod = aggregationPeriod.toString();
        return this;
    }

    /**
     * <p>
     * The start timestamp for the summary metric query.
     * </p>
     * 
     * @param startTimestamp
     *        The start timestamp for the summary metric query.
     */

    public void setStartTimestamp(java.util.Date startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    /**
     * <p>
     * The start timestamp for the summary metric query.
     * </p>
     * 
     * @return The start timestamp for the summary metric query.
     */

    public java.util.Date getStartTimestamp() {
        return this.startTimestamp;
    }

    /**
     * <p>
     * The start timestamp for the summary metric query.
     * </p>
     * 
     * @param startTimestamp
     *        The start timestamp for the summary metric query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SummaryMetricQuery withStartTimestamp(java.util.Date startTimestamp) {
        setStartTimestamp(startTimestamp);
        return this;
    }

    /**
     * <p>
     * The end timestamp for the summary metric query.
     * </p>
     * 
     * @param endTimestamp
     *        The end timestamp for the summary metric query.
     */

    public void setEndTimestamp(java.util.Date endTimestamp) {
        this.endTimestamp = endTimestamp;
    }

    /**
     * <p>
     * The end timestamp for the summary metric query.
     * </p>
     * 
     * @return The end timestamp for the summary metric query.
     */

    public java.util.Date getEndTimestamp() {
        return this.endTimestamp;
    }

    /**
     * <p>
     * The end timestamp for the summary metric query.
     * </p>
     * 
     * @param endTimestamp
     *        The end timestamp for the summary metric query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SummaryMetricQuery withEndTimestamp(java.util.Date endTimestamp) {
        setEndTimestamp(endTimestamp);
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
        if (getQueryId() != null)
            sb.append("QueryId: ").append(getQueryId()).append(",");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getDimensions() != null)
            sb.append("Dimensions: ").append(getDimensions()).append(",");
        if (getAggregationPeriod() != null)
            sb.append("AggregationPeriod: ").append(getAggregationPeriod()).append(",");
        if (getStartTimestamp() != null)
            sb.append("StartTimestamp: ").append(getStartTimestamp()).append(",");
        if (getEndTimestamp() != null)
            sb.append("EndTimestamp: ").append(getEndTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SummaryMetricQuery == false)
            return false;
        SummaryMetricQuery other = (SummaryMetricQuery) obj;
        if (other.getQueryId() == null ^ this.getQueryId() == null)
            return false;
        if (other.getQueryId() != null && other.getQueryId().equals(this.getQueryId()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getAggregationPeriod() == null ^ this.getAggregationPeriod() == null)
            return false;
        if (other.getAggregationPeriod() != null && other.getAggregationPeriod().equals(this.getAggregationPeriod()) == false)
            return false;
        if (other.getStartTimestamp() == null ^ this.getStartTimestamp() == null)
            return false;
        if (other.getStartTimestamp() != null && other.getStartTimestamp().equals(this.getStartTimestamp()) == false)
            return false;
        if (other.getEndTimestamp() == null ^ this.getEndTimestamp() == null)
            return false;
        if (other.getEndTimestamp() != null && other.getEndTimestamp().equals(this.getEndTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryId() == null) ? 0 : getQueryId().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getAggregationPeriod() == null) ? 0 : getAggregationPeriod().hashCode());
        hashCode = prime * hashCode + ((getStartTimestamp() == null) ? 0 : getStartTimestamp().hashCode());
        hashCode = prime * hashCode + ((getEndTimestamp() == null) ? 0 : getEndTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public SummaryMetricQuery clone() {
        try {
            return (SummaryMetricQuery) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.SummaryMetricQueryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
