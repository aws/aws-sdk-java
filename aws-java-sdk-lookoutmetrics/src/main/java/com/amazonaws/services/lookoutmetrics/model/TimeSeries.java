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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about a metric. A metric is an aggregation of the values of a measure for a dimension value, such as
 * <i>availability</i> in the <i>us-east-1</i> Region.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/TimeSeries" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimeSeries implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the metric.
     * </p>
     */
    private String timeSeriesId;
    /**
     * <p>
     * The dimensions of the metric.
     * </p>
     */
    private java.util.List<DimensionNameValue> dimensionList;
    /**
     * <p>
     * The values for the metric.
     * </p>
     */
    private java.util.List<Double> metricValueList;

    /**
     * <p>
     * The ID of the metric.
     * </p>
     * 
     * @param timeSeriesId
     *        The ID of the metric.
     */

    public void setTimeSeriesId(String timeSeriesId) {
        this.timeSeriesId = timeSeriesId;
    }

    /**
     * <p>
     * The ID of the metric.
     * </p>
     * 
     * @return The ID of the metric.
     */

    public String getTimeSeriesId() {
        return this.timeSeriesId;
    }

    /**
     * <p>
     * The ID of the metric.
     * </p>
     * 
     * @param timeSeriesId
     *        The ID of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeries withTimeSeriesId(String timeSeriesId) {
        setTimeSeriesId(timeSeriesId);
        return this;
    }

    /**
     * <p>
     * The dimensions of the metric.
     * </p>
     * 
     * @return The dimensions of the metric.
     */

    public java.util.List<DimensionNameValue> getDimensionList() {
        return dimensionList;
    }

    /**
     * <p>
     * The dimensions of the metric.
     * </p>
     * 
     * @param dimensionList
     *        The dimensions of the metric.
     */

    public void setDimensionList(java.util.Collection<DimensionNameValue> dimensionList) {
        if (dimensionList == null) {
            this.dimensionList = null;
            return;
        }

        this.dimensionList = new java.util.ArrayList<DimensionNameValue>(dimensionList);
    }

    /**
     * <p>
     * The dimensions of the metric.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensionList(java.util.Collection)} or {@link #withDimensionList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param dimensionList
     *        The dimensions of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeries withDimensionList(DimensionNameValue... dimensionList) {
        if (this.dimensionList == null) {
            setDimensionList(new java.util.ArrayList<DimensionNameValue>(dimensionList.length));
        }
        for (DimensionNameValue ele : dimensionList) {
            this.dimensionList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The dimensions of the metric.
     * </p>
     * 
     * @param dimensionList
     *        The dimensions of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeries withDimensionList(java.util.Collection<DimensionNameValue> dimensionList) {
        setDimensionList(dimensionList);
        return this;
    }

    /**
     * <p>
     * The values for the metric.
     * </p>
     * 
     * @return The values for the metric.
     */

    public java.util.List<Double> getMetricValueList() {
        return metricValueList;
    }

    /**
     * <p>
     * The values for the metric.
     * </p>
     * 
     * @param metricValueList
     *        The values for the metric.
     */

    public void setMetricValueList(java.util.Collection<Double> metricValueList) {
        if (metricValueList == null) {
            this.metricValueList = null;
            return;
        }

        this.metricValueList = new java.util.ArrayList<Double>(metricValueList);
    }

    /**
     * <p>
     * The values for the metric.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricValueList(java.util.Collection)} or {@link #withMetricValueList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param metricValueList
     *        The values for the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeries withMetricValueList(Double... metricValueList) {
        if (this.metricValueList == null) {
            setMetricValueList(new java.util.ArrayList<Double>(metricValueList.length));
        }
        for (Double ele : metricValueList) {
            this.metricValueList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The values for the metric.
     * </p>
     * 
     * @param metricValueList
     *        The values for the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeries withMetricValueList(java.util.Collection<Double> metricValueList) {
        setMetricValueList(metricValueList);
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
        if (getTimeSeriesId() != null)
            sb.append("TimeSeriesId: ").append(getTimeSeriesId()).append(",");
        if (getDimensionList() != null)
            sb.append("DimensionList: ").append(getDimensionList()).append(",");
        if (getMetricValueList() != null)
            sb.append("MetricValueList: ").append(getMetricValueList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimeSeries == false)
            return false;
        TimeSeries other = (TimeSeries) obj;
        if (other.getTimeSeriesId() == null ^ this.getTimeSeriesId() == null)
            return false;
        if (other.getTimeSeriesId() != null && other.getTimeSeriesId().equals(this.getTimeSeriesId()) == false)
            return false;
        if (other.getDimensionList() == null ^ this.getDimensionList() == null)
            return false;
        if (other.getDimensionList() != null && other.getDimensionList().equals(this.getDimensionList()) == false)
            return false;
        if (other.getMetricValueList() == null ^ this.getMetricValueList() == null)
            return false;
        if (other.getMetricValueList() != null && other.getMetricValueList().equals(this.getMetricValueList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimeSeriesId() == null) ? 0 : getTimeSeriesId().hashCode());
        hashCode = prime * hashCode + ((getDimensionList() == null) ? 0 : getDimensionList().hashCode());
        hashCode = prime * hashCode + ((getMetricValueList() == null) ? 0 : getMetricValueList().hashCode());
        return hashCode;
    }

    @Override
    public TimeSeries clone() {
        try {
            return (TimeSeries) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.TimeSeriesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
