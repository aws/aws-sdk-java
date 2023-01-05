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
package com.amazonaws.services.mwaa.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * <b>Internal only</b>. Collects Apache Airflow metrics. To learn more about the metrics published to Amazon
 * CloudWatch, see <a href="https://docs.aws.amazon.com/mwaa/latest/userguide/cw-metrics.html">Amazon MWAA performance
 * metrics in Amazon CloudWatch</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/MetricDatum" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricDatum implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * <b>Internal only</b>. The dimensions associated with the metric.
     * </p>
     */
    private java.util.List<Dimension> dimensions;
    /**
     * <p>
     * <b>Internal only</b>. The name of the metric.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * <b>Internal only</b>. The statistical values for the metric.
     * </p>
     */
    private StatisticSet statisticValues;
    /**
     * <p>
     * <b>Internal only</b>. The time the metric data was received.
     * </p>
     */
    private java.util.Date timestamp;
    /**
     * <p>
     * <b>Internal only</b>. The unit used to store the metric.
     * </p>
     */
    private String unit;
    /**
     * <p>
     * <b>Internal only</b>. The value for the metric.
     * </p>
     */
    private Double value;

    /**
     * <p>
     * <b>Internal only</b>. The dimensions associated with the metric.
     * </p>
     * 
     * @return <b>Internal only</b>. The dimensions associated with the metric.
     */

    public java.util.List<Dimension> getDimensions() {
        return dimensions;
    }

    /**
     * <p>
     * <b>Internal only</b>. The dimensions associated with the metric.
     * </p>
     * 
     * @param dimensions
     *        <b>Internal only</b>. The dimensions associated with the metric.
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
     * <b>Internal only</b>. The dimensions associated with the metric.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensions(java.util.Collection)} or {@link #withDimensions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dimensions
     *        <b>Internal only</b>. The dimensions associated with the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDatum withDimensions(Dimension... dimensions) {
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
     * <b>Internal only</b>. The dimensions associated with the metric.
     * </p>
     * 
     * @param dimensions
     *        <b>Internal only</b>. The dimensions associated with the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDatum withDimensions(java.util.Collection<Dimension> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * <p>
     * <b>Internal only</b>. The name of the metric.
     * </p>
     * 
     * @param metricName
     *        <b>Internal only</b>. The name of the metric.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * <b>Internal only</b>. The name of the metric.
     * </p>
     * 
     * @return <b>Internal only</b>. The name of the metric.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * <b>Internal only</b>. The name of the metric.
     * </p>
     * 
     * @param metricName
     *        <b>Internal only</b>. The name of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDatum withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * <b>Internal only</b>. The statistical values for the metric.
     * </p>
     * 
     * @param statisticValues
     *        <b>Internal only</b>. The statistical values for the metric.
     */

    public void setStatisticValues(StatisticSet statisticValues) {
        this.statisticValues = statisticValues;
    }

    /**
     * <p>
     * <b>Internal only</b>. The statistical values for the metric.
     * </p>
     * 
     * @return <b>Internal only</b>. The statistical values for the metric.
     */

    public StatisticSet getStatisticValues() {
        return this.statisticValues;
    }

    /**
     * <p>
     * <b>Internal only</b>. The statistical values for the metric.
     * </p>
     * 
     * @param statisticValues
     *        <b>Internal only</b>. The statistical values for the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDatum withStatisticValues(StatisticSet statisticValues) {
        setStatisticValues(statisticValues);
        return this;
    }

    /**
     * <p>
     * <b>Internal only</b>. The time the metric data was received.
     * </p>
     * 
     * @param timestamp
     *        <b>Internal only</b>. The time the metric data was received.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * <b>Internal only</b>. The time the metric data was received.
     * </p>
     * 
     * @return <b>Internal only</b>. The time the metric data was received.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * <b>Internal only</b>. The time the metric data was received.
     * </p>
     * 
     * @param timestamp
     *        <b>Internal only</b>. The time the metric data was received.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDatum withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * <b>Internal only</b>. The unit used to store the metric.
     * </p>
     * 
     * @param unit
     *        <b>Internal only</b>. The unit used to store the metric.
     * @see Unit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * <b>Internal only</b>. The unit used to store the metric.
     * </p>
     * 
     * @return <b>Internal only</b>. The unit used to store the metric.
     * @see Unit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * <b>Internal only</b>. The unit used to store the metric.
     * </p>
     * 
     * @param unit
     *        <b>Internal only</b>. The unit used to store the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Unit
     */

    public MetricDatum withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * <b>Internal only</b>. The unit used to store the metric.
     * </p>
     * 
     * @param unit
     *        <b>Internal only</b>. The unit used to store the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Unit
     */

    public MetricDatum withUnit(Unit unit) {
        this.unit = unit.toString();
        return this;
    }

    /**
     * <p>
     * <b>Internal only</b>. The value for the metric.
     * </p>
     * 
     * @param value
     *        <b>Internal only</b>. The value for the metric.
     */

    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * <p>
     * <b>Internal only</b>. The value for the metric.
     * </p>
     * 
     * @return <b>Internal only</b>. The value for the metric.
     */

    public Double getValue() {
        return this.value;
    }

    /**
     * <p>
     * <b>Internal only</b>. The value for the metric.
     * </p>
     * 
     * @param value
     *        <b>Internal only</b>. The value for the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDatum withValue(Double value) {
        setValue(value);
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
        if (getDimensions() != null)
            sb.append("Dimensions: ").append(getDimensions()).append(",");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getStatisticValues() != null)
            sb.append("StatisticValues: ").append(getStatisticValues()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricDatum == false)
            return false;
        MetricDatum other = (MetricDatum) obj;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getStatisticValues() == null ^ this.getStatisticValues() == null)
            return false;
        if (other.getStatisticValues() != null && other.getStatisticValues().equals(this.getStatisticValues()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getStatisticValues() == null) ? 0 : getStatisticValues().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public MetricDatum clone() {
        try {
            return (MetricDatum) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mwaa.model.transform.MetricDatumMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
