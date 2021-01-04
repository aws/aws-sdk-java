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
package com.amazonaws.services.timestreamwrite.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Record represents a time series data point being written into Timestream. Each record contains an array of
 * dimensions. Dimensions represent the meta data attributes of a time series data point such as the instance name or
 * availability zone of an EC2 instance. A record also contains the measure name which is the name of the measure being
 * collected for example the CPU utilization of an EC2 instance. A record also contains the measure value and the value
 * type which is the data type of the measure value. In addition, the record contains the timestamp when the measure was
 * collected that the timestamp unit which represents the granularity of the timestamp.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/Record" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Record implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains the list of dimensions for time series data points.
     * </p>
     */
    private java.util.List<Dimension> dimensions;
    /**
     * <p>
     * Measure represents the data attribute of the time series. For example, the CPU utilization of an EC2 instance or
     * the RPM of a wind turbine are measures.
     * </p>
     */
    private String measureName;
    /**
     * <p>
     * Contains the measure value for the time series data point.
     * </p>
     */
    private String measureValue;
    /**
     * <p>
     * Contains the data type of the measure value for the time series data point.
     * </p>
     */
    private String measureValueType;
    /**
     * <p>
     * Contains the time at which the measure value for the data point was collected. The time value plus the unit
     * provides the time elapsed since the epoch. For example, if the time value is <code>12345</code> and the unit is
     * <code>ms</code>, then <code>12345 ms</code> have elapsed since the epoch.
     * </p>
     */
    private String time;
    /**
     * <p>
     * The granularity of the timestamp unit. It indicates if the time value is in seconds, milliseconds, nanoseconds or
     * other supported values.
     * </p>
     */
    private String timeUnit;
    /**
     * <p>
     * 64-bit attribute used for record updates. Write requests for duplicate data with a higher version number will
     * update the existing measure value and version. In cases where the measure value is the same, <code>Version</code>
     * will still be updated . Default value is to 1.
     * </p>
     */
    private Long version;

    /**
     * <p>
     * Contains the list of dimensions for time series data points.
     * </p>
     * 
     * @return Contains the list of dimensions for time series data points.
     */

    public java.util.List<Dimension> getDimensions() {
        return dimensions;
    }

    /**
     * <p>
     * Contains the list of dimensions for time series data points.
     * </p>
     * 
     * @param dimensions
     *        Contains the list of dimensions for time series data points.
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
     * Contains the list of dimensions for time series data points.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensions(java.util.Collection)} or {@link #withDimensions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dimensions
     *        Contains the list of dimensions for time series data points.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Record withDimensions(Dimension... dimensions) {
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
     * Contains the list of dimensions for time series data points.
     * </p>
     * 
     * @param dimensions
     *        Contains the list of dimensions for time series data points.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Record withDimensions(java.util.Collection<Dimension> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * <p>
     * Measure represents the data attribute of the time series. For example, the CPU utilization of an EC2 instance or
     * the RPM of a wind turbine are measures.
     * </p>
     * 
     * @param measureName
     *        Measure represents the data attribute of the time series. For example, the CPU utilization of an EC2
     *        instance or the RPM of a wind turbine are measures.
     */

    public void setMeasureName(String measureName) {
        this.measureName = measureName;
    }

    /**
     * <p>
     * Measure represents the data attribute of the time series. For example, the CPU utilization of an EC2 instance or
     * the RPM of a wind turbine are measures.
     * </p>
     * 
     * @return Measure represents the data attribute of the time series. For example, the CPU utilization of an EC2
     *         instance or the RPM of a wind turbine are measures.
     */

    public String getMeasureName() {
        return this.measureName;
    }

    /**
     * <p>
     * Measure represents the data attribute of the time series. For example, the CPU utilization of an EC2 instance or
     * the RPM of a wind turbine are measures.
     * </p>
     * 
     * @param measureName
     *        Measure represents the data attribute of the time series. For example, the CPU utilization of an EC2
     *        instance or the RPM of a wind turbine are measures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Record withMeasureName(String measureName) {
        setMeasureName(measureName);
        return this;
    }

    /**
     * <p>
     * Contains the measure value for the time series data point.
     * </p>
     * 
     * @param measureValue
     *        Contains the measure value for the time series data point.
     */

    public void setMeasureValue(String measureValue) {
        this.measureValue = measureValue;
    }

    /**
     * <p>
     * Contains the measure value for the time series data point.
     * </p>
     * 
     * @return Contains the measure value for the time series data point.
     */

    public String getMeasureValue() {
        return this.measureValue;
    }

    /**
     * <p>
     * Contains the measure value for the time series data point.
     * </p>
     * 
     * @param measureValue
     *        Contains the measure value for the time series data point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Record withMeasureValue(String measureValue) {
        setMeasureValue(measureValue);
        return this;
    }

    /**
     * <p>
     * Contains the data type of the measure value for the time series data point.
     * </p>
     * 
     * @param measureValueType
     *        Contains the data type of the measure value for the time series data point.
     * @see MeasureValueType
     */

    public void setMeasureValueType(String measureValueType) {
        this.measureValueType = measureValueType;
    }

    /**
     * <p>
     * Contains the data type of the measure value for the time series data point.
     * </p>
     * 
     * @return Contains the data type of the measure value for the time series data point.
     * @see MeasureValueType
     */

    public String getMeasureValueType() {
        return this.measureValueType;
    }

    /**
     * <p>
     * Contains the data type of the measure value for the time series data point.
     * </p>
     * 
     * @param measureValueType
     *        Contains the data type of the measure value for the time series data point.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MeasureValueType
     */

    public Record withMeasureValueType(String measureValueType) {
        setMeasureValueType(measureValueType);
        return this;
    }

    /**
     * <p>
     * Contains the data type of the measure value for the time series data point.
     * </p>
     * 
     * @param measureValueType
     *        Contains the data type of the measure value for the time series data point.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MeasureValueType
     */

    public Record withMeasureValueType(MeasureValueType measureValueType) {
        this.measureValueType = measureValueType.toString();
        return this;
    }

    /**
     * <p>
     * Contains the time at which the measure value for the data point was collected. The time value plus the unit
     * provides the time elapsed since the epoch. For example, if the time value is <code>12345</code> and the unit is
     * <code>ms</code>, then <code>12345 ms</code> have elapsed since the epoch.
     * </p>
     * 
     * @param time
     *        Contains the time at which the measure value for the data point was collected. The time value plus the
     *        unit provides the time elapsed since the epoch. For example, if the time value is <code>12345</code> and
     *        the unit is <code>ms</code>, then <code>12345 ms</code> have elapsed since the epoch.
     */

    public void setTime(String time) {
        this.time = time;
    }

    /**
     * <p>
     * Contains the time at which the measure value for the data point was collected. The time value plus the unit
     * provides the time elapsed since the epoch. For example, if the time value is <code>12345</code> and the unit is
     * <code>ms</code>, then <code>12345 ms</code> have elapsed since the epoch.
     * </p>
     * 
     * @return Contains the time at which the measure value for the data point was collected. The time value plus the
     *         unit provides the time elapsed since the epoch. For example, if the time value is <code>12345</code> and
     *         the unit is <code>ms</code>, then <code>12345 ms</code> have elapsed since the epoch.
     */

    public String getTime() {
        return this.time;
    }

    /**
     * <p>
     * Contains the time at which the measure value for the data point was collected. The time value plus the unit
     * provides the time elapsed since the epoch. For example, if the time value is <code>12345</code> and the unit is
     * <code>ms</code>, then <code>12345 ms</code> have elapsed since the epoch.
     * </p>
     * 
     * @param time
     *        Contains the time at which the measure value for the data point was collected. The time value plus the
     *        unit provides the time elapsed since the epoch. For example, if the time value is <code>12345</code> and
     *        the unit is <code>ms</code>, then <code>12345 ms</code> have elapsed since the epoch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Record withTime(String time) {
        setTime(time);
        return this;
    }

    /**
     * <p>
     * The granularity of the timestamp unit. It indicates if the time value is in seconds, milliseconds, nanoseconds or
     * other supported values.
     * </p>
     * 
     * @param timeUnit
     *        The granularity of the timestamp unit. It indicates if the time value is in seconds, milliseconds,
     *        nanoseconds or other supported values.
     * @see TimeUnit
     */

    public void setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
    }

    /**
     * <p>
     * The granularity of the timestamp unit. It indicates if the time value is in seconds, milliseconds, nanoseconds or
     * other supported values.
     * </p>
     * 
     * @return The granularity of the timestamp unit. It indicates if the time value is in seconds, milliseconds,
     *         nanoseconds or other supported values.
     * @see TimeUnit
     */

    public String getTimeUnit() {
        return this.timeUnit;
    }

    /**
     * <p>
     * The granularity of the timestamp unit. It indicates if the time value is in seconds, milliseconds, nanoseconds or
     * other supported values.
     * </p>
     * 
     * @param timeUnit
     *        The granularity of the timestamp unit. It indicates if the time value is in seconds, milliseconds,
     *        nanoseconds or other supported values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeUnit
     */

    public Record withTimeUnit(String timeUnit) {
        setTimeUnit(timeUnit);
        return this;
    }

    /**
     * <p>
     * The granularity of the timestamp unit. It indicates if the time value is in seconds, milliseconds, nanoseconds or
     * other supported values.
     * </p>
     * 
     * @param timeUnit
     *        The granularity of the timestamp unit. It indicates if the time value is in seconds, milliseconds,
     *        nanoseconds or other supported values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeUnit
     */

    public Record withTimeUnit(TimeUnit timeUnit) {
        this.timeUnit = timeUnit.toString();
        return this;
    }

    /**
     * <p>
     * 64-bit attribute used for record updates. Write requests for duplicate data with a higher version number will
     * update the existing measure value and version. In cases where the measure value is the same, <code>Version</code>
     * will still be updated . Default value is to 1.
     * </p>
     * 
     * @param version
     *        64-bit attribute used for record updates. Write requests for duplicate data with a higher version number
     *        will update the existing measure value and version. In cases where the measure value is the same,
     *        <code>Version</code> will still be updated . Default value is to 1.
     */

    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * <p>
     * 64-bit attribute used for record updates. Write requests for duplicate data with a higher version number will
     * update the existing measure value and version. In cases where the measure value is the same, <code>Version</code>
     * will still be updated . Default value is to 1.
     * </p>
     * 
     * @return 64-bit attribute used for record updates. Write requests for duplicate data with a higher version number
     *         will update the existing measure value and version. In cases where the measure value is the same,
     *         <code>Version</code> will still be updated . Default value is to 1.
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     * <p>
     * 64-bit attribute used for record updates. Write requests for duplicate data with a higher version number will
     * update the existing measure value and version. In cases where the measure value is the same, <code>Version</code>
     * will still be updated . Default value is to 1.
     * </p>
     * 
     * @param version
     *        64-bit attribute used for record updates. Write requests for duplicate data with a higher version number
     *        will update the existing measure value and version. In cases where the measure value is the same,
     *        <code>Version</code> will still be updated . Default value is to 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Record withVersion(Long version) {
        setVersion(version);
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
        if (getMeasureName() != null)
            sb.append("MeasureName: ").append(getMeasureName()).append(",");
        if (getMeasureValue() != null)
            sb.append("MeasureValue: ").append(getMeasureValue()).append(",");
        if (getMeasureValueType() != null)
            sb.append("MeasureValueType: ").append(getMeasureValueType()).append(",");
        if (getTime() != null)
            sb.append("Time: ").append(getTime()).append(",");
        if (getTimeUnit() != null)
            sb.append("TimeUnit: ").append(getTimeUnit()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Record == false)
            return false;
        Record other = (Record) obj;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getMeasureName() == null ^ this.getMeasureName() == null)
            return false;
        if (other.getMeasureName() != null && other.getMeasureName().equals(this.getMeasureName()) == false)
            return false;
        if (other.getMeasureValue() == null ^ this.getMeasureValue() == null)
            return false;
        if (other.getMeasureValue() != null && other.getMeasureValue().equals(this.getMeasureValue()) == false)
            return false;
        if (other.getMeasureValueType() == null ^ this.getMeasureValueType() == null)
            return false;
        if (other.getMeasureValueType() != null && other.getMeasureValueType().equals(this.getMeasureValueType()) == false)
            return false;
        if (other.getTime() == null ^ this.getTime() == null)
            return false;
        if (other.getTime() != null && other.getTime().equals(this.getTime()) == false)
            return false;
        if (other.getTimeUnit() == null ^ this.getTimeUnit() == null)
            return false;
        if (other.getTimeUnit() != null && other.getTimeUnit().equals(this.getTimeUnit()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getMeasureName() == null) ? 0 : getMeasureName().hashCode());
        hashCode = prime * hashCode + ((getMeasureValue() == null) ? 0 : getMeasureValue().hashCode());
        hashCode = prime * hashCode + ((getMeasureValueType() == null) ? 0 : getMeasureValueType().hashCode());
        hashCode = prime * hashCode + ((getTime() == null) ? 0 : getTime().hashCode());
        hashCode = prime * hashCode + ((getTimeUnit() == null) ? 0 : getTimeUnit().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public Record clone() {
        try {
            return (Record) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamwrite.model.transform.RecordMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
