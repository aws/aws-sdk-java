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
package com.amazonaws.services.applicationinsights.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an anomaly or error with the application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/Observation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Observation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the observation type.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The time when the observation was first detected, in epoch seconds.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The time when the observation ended, in epoch seconds.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The source type of the observation.
     * </p>
     */
    private String sourceType;
    /**
     * <p>
     * The source resource ARN of the observation.
     * </p>
     */
    private String sourceARN;
    /**
     * <p>
     * The log group name.
     * </p>
     */
    private String logGroup;
    /**
     * <p>
     * The timestamp in the CloudWatch Logs that specifies when the matched line occurred.
     * </p>
     */
    private java.util.Date lineTime;
    /**
     * <p>
     * The log text of the observation.
     * </p>
     */
    private String logText;
    /**
     * <p>
     * The log filter of the observation.
     * </p>
     */
    private String logFilter;
    /**
     * <p>
     * The namespace of the observation metric.
     * </p>
     */
    private String metricNamespace;
    /**
     * <p>
     * The name of the observation metric.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The unit of the source observation metric.
     * </p>
     */
    private String unit;
    /**
     * <p>
     * The value of the source observation metric.
     * </p>
     */
    private Double value;

    /**
     * <p>
     * The ID of the observation type.
     * </p>
     * 
     * @param id
     *        The ID of the observation type.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the observation type.
     * </p>
     * 
     * @return The ID of the observation type.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the observation type.
     * </p>
     * 
     * @param id
     *        The ID of the observation type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The time when the observation was first detected, in epoch seconds.
     * </p>
     * 
     * @param startTime
     *        The time when the observation was first detected, in epoch seconds.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time when the observation was first detected, in epoch seconds.
     * </p>
     * 
     * @return The time when the observation was first detected, in epoch seconds.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time when the observation was first detected, in epoch seconds.
     * </p>
     * 
     * @param startTime
     *        The time when the observation was first detected, in epoch seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time when the observation ended, in epoch seconds.
     * </p>
     * 
     * @param endTime
     *        The time when the observation ended, in epoch seconds.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time when the observation ended, in epoch seconds.
     * </p>
     * 
     * @return The time when the observation ended, in epoch seconds.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time when the observation ended, in epoch seconds.
     * </p>
     * 
     * @param endTime
     *        The time when the observation ended, in epoch seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The source type of the observation.
     * </p>
     * 
     * @param sourceType
     *        The source type of the observation.
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The source type of the observation.
     * </p>
     * 
     * @return The source type of the observation.
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * The source type of the observation.
     * </p>
     * 
     * @param sourceType
     *        The source type of the observation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * The source resource ARN of the observation.
     * </p>
     * 
     * @param sourceARN
     *        The source resource ARN of the observation.
     */

    public void setSourceARN(String sourceARN) {
        this.sourceARN = sourceARN;
    }

    /**
     * <p>
     * The source resource ARN of the observation.
     * </p>
     * 
     * @return The source resource ARN of the observation.
     */

    public String getSourceARN() {
        return this.sourceARN;
    }

    /**
     * <p>
     * The source resource ARN of the observation.
     * </p>
     * 
     * @param sourceARN
     *        The source resource ARN of the observation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withSourceARN(String sourceARN) {
        setSourceARN(sourceARN);
        return this;
    }

    /**
     * <p>
     * The log group name.
     * </p>
     * 
     * @param logGroup
     *        The log group name.
     */

    public void setLogGroup(String logGroup) {
        this.logGroup = logGroup;
    }

    /**
     * <p>
     * The log group name.
     * </p>
     * 
     * @return The log group name.
     */

    public String getLogGroup() {
        return this.logGroup;
    }

    /**
     * <p>
     * The log group name.
     * </p>
     * 
     * @param logGroup
     *        The log group name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withLogGroup(String logGroup) {
        setLogGroup(logGroup);
        return this;
    }

    /**
     * <p>
     * The timestamp in the CloudWatch Logs that specifies when the matched line occurred.
     * </p>
     * 
     * @param lineTime
     *        The timestamp in the CloudWatch Logs that specifies when the matched line occurred.
     */

    public void setLineTime(java.util.Date lineTime) {
        this.lineTime = lineTime;
    }

    /**
     * <p>
     * The timestamp in the CloudWatch Logs that specifies when the matched line occurred.
     * </p>
     * 
     * @return The timestamp in the CloudWatch Logs that specifies when the matched line occurred.
     */

    public java.util.Date getLineTime() {
        return this.lineTime;
    }

    /**
     * <p>
     * The timestamp in the CloudWatch Logs that specifies when the matched line occurred.
     * </p>
     * 
     * @param lineTime
     *        The timestamp in the CloudWatch Logs that specifies when the matched line occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withLineTime(java.util.Date lineTime) {
        setLineTime(lineTime);
        return this;
    }

    /**
     * <p>
     * The log text of the observation.
     * </p>
     * 
     * @param logText
     *        The log text of the observation.
     */

    public void setLogText(String logText) {
        this.logText = logText;
    }

    /**
     * <p>
     * The log text of the observation.
     * </p>
     * 
     * @return The log text of the observation.
     */

    public String getLogText() {
        return this.logText;
    }

    /**
     * <p>
     * The log text of the observation.
     * </p>
     * 
     * @param logText
     *        The log text of the observation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withLogText(String logText) {
        setLogText(logText);
        return this;
    }

    /**
     * <p>
     * The log filter of the observation.
     * </p>
     * 
     * @param logFilter
     *        The log filter of the observation.
     * @see LogFilter
     */

    public void setLogFilter(String logFilter) {
        this.logFilter = logFilter;
    }

    /**
     * <p>
     * The log filter of the observation.
     * </p>
     * 
     * @return The log filter of the observation.
     * @see LogFilter
     */

    public String getLogFilter() {
        return this.logFilter;
    }

    /**
     * <p>
     * The log filter of the observation.
     * </p>
     * 
     * @param logFilter
     *        The log filter of the observation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogFilter
     */

    public Observation withLogFilter(String logFilter) {
        setLogFilter(logFilter);
        return this;
    }

    /**
     * <p>
     * The log filter of the observation.
     * </p>
     * 
     * @param logFilter
     *        The log filter of the observation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogFilter
     */

    public Observation withLogFilter(LogFilter logFilter) {
        this.logFilter = logFilter.toString();
        return this;
    }

    /**
     * <p>
     * The namespace of the observation metric.
     * </p>
     * 
     * @param metricNamespace
     *        The namespace of the observation metric.
     */

    public void setMetricNamespace(String metricNamespace) {
        this.metricNamespace = metricNamespace;
    }

    /**
     * <p>
     * The namespace of the observation metric.
     * </p>
     * 
     * @return The namespace of the observation metric.
     */

    public String getMetricNamespace() {
        return this.metricNamespace;
    }

    /**
     * <p>
     * The namespace of the observation metric.
     * </p>
     * 
     * @param metricNamespace
     *        The namespace of the observation metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withMetricNamespace(String metricNamespace) {
        setMetricNamespace(metricNamespace);
        return this;
    }

    /**
     * <p>
     * The name of the observation metric.
     * </p>
     * 
     * @param metricName
     *        The name of the observation metric.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the observation metric.
     * </p>
     * 
     * @return The name of the observation metric.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the observation metric.
     * </p>
     * 
     * @param metricName
     *        The name of the observation metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The unit of the source observation metric.
     * </p>
     * 
     * @param unit
     *        The unit of the source observation metric.
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit of the source observation metric.
     * </p>
     * 
     * @return The unit of the source observation metric.
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit of the source observation metric.
     * </p>
     * 
     * @param unit
     *        The unit of the source observation metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * The value of the source observation metric.
     * </p>
     * 
     * @param value
     *        The value of the source observation metric.
     */

    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the source observation metric.
     * </p>
     * 
     * @return The value of the source observation metric.
     */

    public Double getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the source observation metric.
     * </p>
     * 
     * @param value
     *        The value of the source observation metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observation withValue(Double value) {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType()).append(",");
        if (getSourceARN() != null)
            sb.append("SourceARN: ").append(getSourceARN()).append(",");
        if (getLogGroup() != null)
            sb.append("LogGroup: ").append(getLogGroup()).append(",");
        if (getLineTime() != null)
            sb.append("LineTime: ").append(getLineTime()).append(",");
        if (getLogText() != null)
            sb.append("LogText: ").append(getLogText()).append(",");
        if (getLogFilter() != null)
            sb.append("LogFilter: ").append(getLogFilter()).append(",");
        if (getMetricNamespace() != null)
            sb.append("MetricNamespace: ").append(getMetricNamespace()).append(",");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
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

        if (obj instanceof Observation == false)
            return false;
        Observation other = (Observation) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getSourceARN() == null ^ this.getSourceARN() == null)
            return false;
        if (other.getSourceARN() != null && other.getSourceARN().equals(this.getSourceARN()) == false)
            return false;
        if (other.getLogGroup() == null ^ this.getLogGroup() == null)
            return false;
        if (other.getLogGroup() != null && other.getLogGroup().equals(this.getLogGroup()) == false)
            return false;
        if (other.getLineTime() == null ^ this.getLineTime() == null)
            return false;
        if (other.getLineTime() != null && other.getLineTime().equals(this.getLineTime()) == false)
            return false;
        if (other.getLogText() == null ^ this.getLogText() == null)
            return false;
        if (other.getLogText() != null && other.getLogText().equals(this.getLogText()) == false)
            return false;
        if (other.getLogFilter() == null ^ this.getLogFilter() == null)
            return false;
        if (other.getLogFilter() != null && other.getLogFilter().equals(this.getLogFilter()) == false)
            return false;
        if (other.getMetricNamespace() == null ^ this.getMetricNamespace() == null)
            return false;
        if (other.getMetricNamespace() != null && other.getMetricNamespace().equals(this.getMetricNamespace()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getSourceARN() == null) ? 0 : getSourceARN().hashCode());
        hashCode = prime * hashCode + ((getLogGroup() == null) ? 0 : getLogGroup().hashCode());
        hashCode = prime * hashCode + ((getLineTime() == null) ? 0 : getLineTime().hashCode());
        hashCode = prime * hashCode + ((getLogText() == null) ? 0 : getLogText().hashCode());
        hashCode = prime * hashCode + ((getLogFilter() == null) ? 0 : getLogFilter().hashCode());
        hashCode = prime * hashCode + ((getMetricNamespace() == null) ? 0 : getMetricNamespace().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public Observation clone() {
        try {
            return (Observation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationinsights.model.transform.ObservationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
