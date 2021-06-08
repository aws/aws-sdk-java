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
package com.amazonaws.services.mwaa.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Internal only API.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/MetricDatum" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricDatum implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Internal only API.
     * </p>
     */
    private java.util.List<Dimension> dimensions;
    /**
     * <p>
     * Internal only API.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * Internal only API.
     * </p>
     */
    private StatisticSet statisticValues;
    /**
     * <p>
     * Internal only API.
     * </p>
     */
    private java.util.Date timestamp;

    private String unit;
    /**
     * <p>
     * Internal only API.
     * </p>
     */
    private Double value;

    /**
     * <p>
     * Internal only API.
     * </p>
     * 
     * @return Internal only API.
     */

    public java.util.List<Dimension> getDimensions() {
        return dimensions;
    }

    /**
     * <p>
     * Internal only API.
     * </p>
     * 
     * @param dimensions
     *        Internal only API.
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
     * Internal only API.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensions(java.util.Collection)} or {@link #withDimensions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dimensions
     *        Internal only API.
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
     * Internal only API.
     * </p>
     * 
     * @param dimensions
     *        Internal only API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDatum withDimensions(java.util.Collection<Dimension> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * <p>
     * Internal only API.
     * </p>
     * 
     * @param metricName
     *        Internal only API.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * Internal only API.
     * </p>
     * 
     * @return Internal only API.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * Internal only API.
     * </p>
     * 
     * @param metricName
     *        Internal only API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDatum withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * Internal only API.
     * </p>
     * 
     * @param statisticValues
     *        Internal only API.
     */

    public void setStatisticValues(StatisticSet statisticValues) {
        this.statisticValues = statisticValues;
    }

    /**
     * <p>
     * Internal only API.
     * </p>
     * 
     * @return Internal only API.
     */

    public StatisticSet getStatisticValues() {
        return this.statisticValues;
    }

    /**
     * <p>
     * Internal only API.
     * </p>
     * 
     * @param statisticValues
     *        Internal only API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDatum withStatisticValues(StatisticSet statisticValues) {
        setStatisticValues(statisticValues);
        return this;
    }

    /**
     * <p>
     * Internal only API.
     * </p>
     * 
     * @param timestamp
     *        Internal only API.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * Internal only API.
     * </p>
     * 
     * @return Internal only API.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * Internal only API.
     * </p>
     * 
     * @param timestamp
     *        Internal only API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDatum withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * @param unit
     * @see Unit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * @return
     * @see Unit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * @param unit
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Unit
     */

    public MetricDatum withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * @param unit
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Unit
     */

    public MetricDatum withUnit(Unit unit) {
        this.unit = unit.toString();
        return this;
    }

    /**
     * <p>
     * Internal only API.
     * </p>
     * 
     * @param value
     *        Internal only API.
     */

    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * <p>
     * Internal only API.
     * </p>
     * 
     * @return Internal only API.
     */

    public Double getValue() {
        return this.value;
    }

    /**
     * <p>
     * Internal only API.
     * </p>
     * 
     * @param value
     *        Internal only API.
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
