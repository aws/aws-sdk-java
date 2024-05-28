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
 * The result of the summary metrics aggregation operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/SummaryMetricQueryResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SummaryMetricQueryResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the summary metric results query operation.
     * </p>
     */
    private String queryId;
    /**
     * <p>
     * The status of the summary metric query result.
     * </p>
     */
    private String queryStatus;
    /**
     * <p>
     * The error message for the summary metric query result.
     * </p>
     */
    private String error;
    /**
     * <p>
     * The name of the summary metric query result.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The dimensions of the metric.
     * </p>
     */
    private java.util.List<Dimension> dimensions;
    /**
     * <p>
     * The aggregation period of the metric.
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
     * The timestamp of each aggregation result.
     * </p>
     */
    private java.util.List<java.util.Date> timestamps;
    /**
     * <p>
     * The list of aggregated summary metric query results.
     * </p>
     */
    private java.util.List<MetricQueryValue> values;
    /**
     * <p>
     * The units of measurement to be used for interpreting the aggregation result.
     * </p>
     */
    private String unit;

    /**
     * <p>
     * The ID of the summary metric results query operation.
     * </p>
     * 
     * @param queryId
     *        The ID of the summary metric results query operation.
     */

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    /**
     * <p>
     * The ID of the summary metric results query operation.
     * </p>
     * 
     * @return The ID of the summary metric results query operation.
     */

    public String getQueryId() {
        return this.queryId;
    }

    /**
     * <p>
     * The ID of the summary metric results query operation.
     * </p>
     * 
     * @param queryId
     *        The ID of the summary metric results query operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SummaryMetricQueryResult withQueryId(String queryId) {
        setQueryId(queryId);
        return this;
    }

    /**
     * <p>
     * The status of the summary metric query result.
     * </p>
     * 
     * @param queryStatus
     *        The status of the summary metric query result.
     * @see MetricQueryStatus
     */

    public void setQueryStatus(String queryStatus) {
        this.queryStatus = queryStatus;
    }

    /**
     * <p>
     * The status of the summary metric query result.
     * </p>
     * 
     * @return The status of the summary metric query result.
     * @see MetricQueryStatus
     */

    public String getQueryStatus() {
        return this.queryStatus;
    }

    /**
     * <p>
     * The status of the summary metric query result.
     * </p>
     * 
     * @param queryStatus
     *        The status of the summary metric query result.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricQueryStatus
     */

    public SummaryMetricQueryResult withQueryStatus(String queryStatus) {
        setQueryStatus(queryStatus);
        return this;
    }

    /**
     * <p>
     * The status of the summary metric query result.
     * </p>
     * 
     * @param queryStatus
     *        The status of the summary metric query result.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricQueryStatus
     */

    public SummaryMetricQueryResult withQueryStatus(MetricQueryStatus queryStatus) {
        this.queryStatus = queryStatus.toString();
        return this;
    }

    /**
     * <p>
     * The error message for the summary metric query result.
     * </p>
     * 
     * @param error
     *        The error message for the summary metric query result.
     */

    public void setError(String error) {
        this.error = error;
    }

    /**
     * <p>
     * The error message for the summary metric query result.
     * </p>
     * 
     * @return The error message for the summary metric query result.
     */

    public String getError() {
        return this.error;
    }

    /**
     * <p>
     * The error message for the summary metric query result.
     * </p>
     * 
     * @param error
     *        The error message for the summary metric query result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SummaryMetricQueryResult withError(String error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * The name of the summary metric query result.
     * </p>
     * 
     * @param metricName
     *        The name of the summary metric query result.
     * @see MetricName
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the summary metric query result.
     * </p>
     * 
     * @return The name of the summary metric query result.
     * @see MetricName
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the summary metric query result.
     * </p>
     * 
     * @param metricName
     *        The name of the summary metric query result.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricName
     */

    public SummaryMetricQueryResult withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The name of the summary metric query result.
     * </p>
     * 
     * @param metricName
     *        The name of the summary metric query result.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricName
     */

    public SummaryMetricQueryResult withMetricName(MetricName metricName) {
        this.metricName = metricName.toString();
        return this;
    }

    /**
     * <p>
     * The dimensions of the metric.
     * </p>
     * 
     * @return The dimensions of the metric.
     */

    public java.util.List<Dimension> getDimensions() {
        return dimensions;
    }

    /**
     * <p>
     * The dimensions of the metric.
     * </p>
     * 
     * @param dimensions
     *        The dimensions of the metric.
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
     * The dimensions of the metric.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensions(java.util.Collection)} or {@link #withDimensions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dimensions
     *        The dimensions of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SummaryMetricQueryResult withDimensions(Dimension... dimensions) {
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
     * The dimensions of the metric.
     * </p>
     * 
     * @param dimensions
     *        The dimensions of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SummaryMetricQueryResult withDimensions(java.util.Collection<Dimension> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * <p>
     * The aggregation period of the metric.
     * </p>
     * 
     * @param aggregationPeriod
     *        The aggregation period of the metric.
     * @see AggregationPeriod
     */

    public void setAggregationPeriod(String aggregationPeriod) {
        this.aggregationPeriod = aggregationPeriod;
    }

    /**
     * <p>
     * The aggregation period of the metric.
     * </p>
     * 
     * @return The aggregation period of the metric.
     * @see AggregationPeriod
     */

    public String getAggregationPeriod() {
        return this.aggregationPeriod;
    }

    /**
     * <p>
     * The aggregation period of the metric.
     * </p>
     * 
     * @param aggregationPeriod
     *        The aggregation period of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AggregationPeriod
     */

    public SummaryMetricQueryResult withAggregationPeriod(String aggregationPeriod) {
        setAggregationPeriod(aggregationPeriod);
        return this;
    }

    /**
     * <p>
     * The aggregation period of the metric.
     * </p>
     * 
     * @param aggregationPeriod
     *        The aggregation period of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AggregationPeriod
     */

    public SummaryMetricQueryResult withAggregationPeriod(AggregationPeriod aggregationPeriod) {
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

    public SummaryMetricQueryResult withStartTimestamp(java.util.Date startTimestamp) {
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

    public SummaryMetricQueryResult withEndTimestamp(java.util.Date endTimestamp) {
        setEndTimestamp(endTimestamp);
        return this;
    }

    /**
     * <p>
     * The timestamp of each aggregation result.
     * </p>
     * 
     * @return The timestamp of each aggregation result.
     */

    public java.util.List<java.util.Date> getTimestamps() {
        return timestamps;
    }

    /**
     * <p>
     * The timestamp of each aggregation result.
     * </p>
     * 
     * @param timestamps
     *        The timestamp of each aggregation result.
     */

    public void setTimestamps(java.util.Collection<java.util.Date> timestamps) {
        if (timestamps == null) {
            this.timestamps = null;
            return;
        }

        this.timestamps = new java.util.ArrayList<java.util.Date>(timestamps);
    }

    /**
     * <p>
     * The timestamp of each aggregation result.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTimestamps(java.util.Collection)} or {@link #withTimestamps(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param timestamps
     *        The timestamp of each aggregation result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SummaryMetricQueryResult withTimestamps(java.util.Date... timestamps) {
        if (this.timestamps == null) {
            setTimestamps(new java.util.ArrayList<java.util.Date>(timestamps.length));
        }
        for (java.util.Date ele : timestamps) {
            this.timestamps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The timestamp of each aggregation result.
     * </p>
     * 
     * @param timestamps
     *        The timestamp of each aggregation result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SummaryMetricQueryResult withTimestamps(java.util.Collection<java.util.Date> timestamps) {
        setTimestamps(timestamps);
        return this;
    }

    /**
     * <p>
     * The list of aggregated summary metric query results.
     * </p>
     * 
     * @return The list of aggregated summary metric query results.
     */

    public java.util.List<MetricQueryValue> getValues() {
        return values;
    }

    /**
     * <p>
     * The list of aggregated summary metric query results.
     * </p>
     * 
     * @param values
     *        The list of aggregated summary metric query results.
     */

    public void setValues(java.util.Collection<MetricQueryValue> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<MetricQueryValue>(values);
    }

    /**
     * <p>
     * The list of aggregated summary metric query results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The list of aggregated summary metric query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SummaryMetricQueryResult withValues(MetricQueryValue... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<MetricQueryValue>(values.length));
        }
        for (MetricQueryValue ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of aggregated summary metric query results.
     * </p>
     * 
     * @param values
     *        The list of aggregated summary metric query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SummaryMetricQueryResult withValues(java.util.Collection<MetricQueryValue> values) {
        setValues(values);
        return this;
    }

    /**
     * <p>
     * The units of measurement to be used for interpreting the aggregation result.
     * </p>
     * 
     * @param unit
     *        The units of measurement to be used for interpreting the aggregation result.
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The units of measurement to be used for interpreting the aggregation result.
     * </p>
     * 
     * @return The units of measurement to be used for interpreting the aggregation result.
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The units of measurement to be used for interpreting the aggregation result.
     * </p>
     * 
     * @param unit
     *        The units of measurement to be used for interpreting the aggregation result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SummaryMetricQueryResult withUnit(String unit) {
        setUnit(unit);
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
        if (getQueryStatus() != null)
            sb.append("QueryStatus: ").append(getQueryStatus()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError()).append(",");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getDimensions() != null)
            sb.append("Dimensions: ").append(getDimensions()).append(",");
        if (getAggregationPeriod() != null)
            sb.append("AggregationPeriod: ").append(getAggregationPeriod()).append(",");
        if (getStartTimestamp() != null)
            sb.append("StartTimestamp: ").append(getStartTimestamp()).append(",");
        if (getEndTimestamp() != null)
            sb.append("EndTimestamp: ").append(getEndTimestamp()).append(",");
        if (getTimestamps() != null)
            sb.append("Timestamps: ").append(getTimestamps()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SummaryMetricQueryResult == false)
            return false;
        SummaryMetricQueryResult other = (SummaryMetricQueryResult) obj;
        if (other.getQueryId() == null ^ this.getQueryId() == null)
            return false;
        if (other.getQueryId() != null && other.getQueryId().equals(this.getQueryId()) == false)
            return false;
        if (other.getQueryStatus() == null ^ this.getQueryStatus() == null)
            return false;
        if (other.getQueryStatus() != null && other.getQueryStatus().equals(this.getQueryStatus()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
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
        if (other.getTimestamps() == null ^ this.getTimestamps() == null)
            return false;
        if (other.getTimestamps() != null && other.getTimestamps().equals(this.getTimestamps()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryId() == null) ? 0 : getQueryId().hashCode());
        hashCode = prime * hashCode + ((getQueryStatus() == null) ? 0 : getQueryStatus().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getAggregationPeriod() == null) ? 0 : getAggregationPeriod().hashCode());
        hashCode = prime * hashCode + ((getStartTimestamp() == null) ? 0 : getStartTimestamp().hashCode());
        hashCode = prime * hashCode + ((getEndTimestamp() == null) ? 0 : getEndTimestamp().hashCode());
        hashCode = prime * hashCode + ((getTimestamps() == null) ? 0 : getTimestamps().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return hashCode;
    }

    @Override
    public SummaryMetricQueryResult clone() {
        try {
            return (SummaryMetricQueryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.SummaryMetricQueryResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
