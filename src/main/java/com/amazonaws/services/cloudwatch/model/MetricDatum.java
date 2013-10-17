/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;


/**
 * <p>
 * The <code>MetricDatum</code> data type encapsulates the information sent with PutMetricData to either create a new metric or add new values to be
 * aggregated into an existing metric.
 * </p>
 */
public class MetricDatum implements Serializable {

    /**
     * The name of the metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String metricName;

    /**
     * A list of dimensions associated with the metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Dimension> dimensions;

    /**
     * The time stamp used for the metric. If not specified, the default
     * value is set to the time the metric data was received.
     */
    private java.util.Date timestamp;

    /**
     * The value for the metric. <important>Although the <code>Value</code>
     * parameter accepts numbers of type <code>Double</code>, Amazon
     * CloudWatch truncates values with very large exponents. Values with
     * base-10 exponents greater than 126 (1 x 10^126) are truncated.
     * Likewise, values with base-10 exponents less than -130 (1 x 10^-130)
     * are also truncated. </important>
     */
    private Double value;

    /**
     * A set of statistical values describing the metric.
     */
    private StatisticSet statisticValues;

    /**
     * The unit of the metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes, Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits, Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second, Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second, Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second, Count/Second, None
     */
    private String unit;

    /**
     * The name of the metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return The name of the metric.
     */
    public String getMetricName() {
        return metricName;
    }
    
    /**
     * The name of the metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param metricName The name of the metric.
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }
    
    /**
     * The name of the metric.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param metricName The name of the metric.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public MetricDatum withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * A list of dimensions associated with the metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @return A list of dimensions associated with the metric.
     */
    public java.util.List<Dimension> getDimensions() {
        if (dimensions == null) {
              dimensions = new com.amazonaws.internal.ListWithAutoConstructFlag<Dimension>();
              dimensions.setAutoConstruct(true);
        }
        return dimensions;
    }
    
    /**
     * A list of dimensions associated with the metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param dimensions A list of dimensions associated with the metric.
     */
    public void setDimensions(java.util.Collection<Dimension> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Dimension> dimensionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Dimension>(dimensions.size());
        dimensionsCopy.addAll(dimensions);
        this.dimensions = dimensionsCopy;
    }
    
    /**
     * A list of dimensions associated with the metric.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param dimensions A list of dimensions associated with the metric.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public MetricDatum withDimensions(Dimension... dimensions) {
        if (getDimensions() == null) setDimensions(new java.util.ArrayList<Dimension>(dimensions.length));
        for (Dimension value : dimensions) {
            getDimensions().add(value);
        }
        return this;
    }
    
    /**
     * A list of dimensions associated with the metric.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param dimensions A list of dimensions associated with the metric.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public MetricDatum withDimensions(java.util.Collection<Dimension> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Dimension> dimensionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Dimension>(dimensions.size());
            dimensionsCopy.addAll(dimensions);
            this.dimensions = dimensionsCopy;
        }

        return this;
    }

    /**
     * The time stamp used for the metric. If not specified, the default
     * value is set to the time the metric data was received.
     *
     * @return The time stamp used for the metric. If not specified, the default
     *         value is set to the time the metric data was received.
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }
    
    /**
     * The time stamp used for the metric. If not specified, the default
     * value is set to the time the metric data was received.
     *
     * @param timestamp The time stamp used for the metric. If not specified, the default
     *         value is set to the time the metric data was received.
     */
    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }
    
    /**
     * The time stamp used for the metric. If not specified, the default
     * value is set to the time the metric data was received.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param timestamp The time stamp used for the metric. If not specified, the default
     *         value is set to the time the metric data was received.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public MetricDatum withTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * The value for the metric. <important>Although the <code>Value</code>
     * parameter accepts numbers of type <code>Double</code>, Amazon
     * CloudWatch truncates values with very large exponents. Values with
     * base-10 exponents greater than 126 (1 x 10^126) are truncated.
     * Likewise, values with base-10 exponents less than -130 (1 x 10^-130)
     * are also truncated. </important>
     *
     * @return The value for the metric. <important>Although the <code>Value</code>
     *         parameter accepts numbers of type <code>Double</code>, Amazon
     *         CloudWatch truncates values with very large exponents. Values with
     *         base-10 exponents greater than 126 (1 x 10^126) are truncated.
     *         Likewise, values with base-10 exponents less than -130 (1 x 10^-130)
     *         are also truncated. </important>
     */
    public Double getValue() {
        return value;
    }
    
    /**
     * The value for the metric. <important>Although the <code>Value</code>
     * parameter accepts numbers of type <code>Double</code>, Amazon
     * CloudWatch truncates values with very large exponents. Values with
     * base-10 exponents greater than 126 (1 x 10^126) are truncated.
     * Likewise, values with base-10 exponents less than -130 (1 x 10^-130)
     * are also truncated. </important>
     *
     * @param value The value for the metric. <important>Although the <code>Value</code>
     *         parameter accepts numbers of type <code>Double</code>, Amazon
     *         CloudWatch truncates values with very large exponents. Values with
     *         base-10 exponents greater than 126 (1 x 10^126) are truncated.
     *         Likewise, values with base-10 exponents less than -130 (1 x 10^-130)
     *         are also truncated. </important>
     */
    public void setValue(Double value) {
        this.value = value;
    }
    
    /**
     * The value for the metric. <important>Although the <code>Value</code>
     * parameter accepts numbers of type <code>Double</code>, Amazon
     * CloudWatch truncates values with very large exponents. Values with
     * base-10 exponents greater than 126 (1 x 10^126) are truncated.
     * Likewise, values with base-10 exponents less than -130 (1 x 10^-130)
     * are also truncated. </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value The value for the metric. <important>Although the <code>Value</code>
     *         parameter accepts numbers of type <code>Double</code>, Amazon
     *         CloudWatch truncates values with very large exponents. Values with
     *         base-10 exponents greater than 126 (1 x 10^126) are truncated.
     *         Likewise, values with base-10 exponents less than -130 (1 x 10^-130)
     *         are also truncated. </important>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public MetricDatum withValue(Double value) {
        this.value = value;
        return this;
    }

    /**
     * A set of statistical values describing the metric.
     *
     * @return A set of statistical values describing the metric.
     */
    public StatisticSet getStatisticValues() {
        return statisticValues;
    }
    
    /**
     * A set of statistical values describing the metric.
     *
     * @param statisticValues A set of statistical values describing the metric.
     */
    public void setStatisticValues(StatisticSet statisticValues) {
        this.statisticValues = statisticValues;
    }
    
    /**
     * A set of statistical values describing the metric.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param statisticValues A set of statistical values describing the metric.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public MetricDatum withStatisticValues(StatisticSet statisticValues) {
        this.statisticValues = statisticValues;
        return this;
    }

    /**
     * The unit of the metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes, Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits, Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second, Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second, Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second, Count/Second, None
     *
     * @return The unit of the metric.
     *
     * @see StandardUnit
     */
    public String getUnit() {
        return unit;
    }
    
    /**
     * The unit of the metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes, Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits, Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second, Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second, Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second, Count/Second, None
     *
     * @param unit The unit of the metric.
     *
     * @see StandardUnit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }
    
    /**
     * The unit of the metric.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes, Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits, Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second, Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second, Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second, Count/Second, None
     *
     * @param unit The unit of the metric.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see StandardUnit
     */
    public MetricDatum withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * The unit of the metric.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes, Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits, Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second, Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second, Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second, Count/Second, None
     *
     * @param unit The unit of the metric.
     *
     * @see StandardUnit
     */
    public void setUnit(StandardUnit unit) {
        this.unit = unit.toString();
    }
    
    /**
     * The unit of the metric.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes, Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits, Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second, Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second, Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second, Count/Second, None
     *
     * @param unit The unit of the metric.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see StandardUnit
     */
    public MetricDatum withUnit(StandardUnit unit) {
        this.unit = unit.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMetricName() != null) sb.append("MetricName: " + getMetricName() + ",");
        if (getDimensions() != null) sb.append("Dimensions: " + getDimensions() + ",");
        if (getTimestamp() != null) sb.append("Timestamp: " + getTimestamp() + ",");
        if (getValue() != null) sb.append("Value: " + getValue() + ",");
        if (getStatisticValues() != null) sb.append("StatisticValues: " + getStatisticValues() + ",");
        if (getUnit() != null) sb.append("Unit: " + getUnit() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode()); 
        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode()); 
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode()); 
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode()); 
        hashCode = prime * hashCode + ((getStatisticValues() == null) ? 0 : getStatisticValues().hashCode()); 
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof MetricDatum == false) return false;
        MetricDatum other = (MetricDatum)obj;
        
        if (other.getMetricName() == null ^ this.getMetricName() == null) return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false) return false; 
        if (other.getDimensions() == null ^ this.getDimensions() == null) return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false) return false; 
        if (other.getTimestamp() == null ^ this.getTimestamp() == null) return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false) return false; 
        if (other.getValue() == null ^ this.getValue() == null) return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false) return false; 
        if (other.getStatisticValues() == null ^ this.getStatisticValues() == null) return false;
        if (other.getStatisticValues() != null && other.getStatisticValues().equals(this.getStatisticValues()) == false) return false; 
        if (other.getUnit() == null ^ this.getUnit() == null) return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false) return false; 
        return true;
    }
    
}
    