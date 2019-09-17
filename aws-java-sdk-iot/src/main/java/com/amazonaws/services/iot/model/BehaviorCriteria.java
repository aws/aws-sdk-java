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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The criteria by which the behavior is determined to be normal.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BehaviorCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The operator that relates the thing measured (<code>metric</code>) to the criteria (containing a
     * <code>value</code> or <code>statisticalThreshold</code>).
     * </p>
     */
    private String comparisonOperator;
    /**
     * <p>
     * The value to be compared with the <code>metric</code>.
     * </p>
     */
    private MetricValue value;
    /**
     * <p>
     * Use this to specify the time duration over which the behavior is evaluated, for those criteria which have a time
     * dimension (for example, <code>NUM_MESSAGES_SENT</code>). For a <code>statisticalThreshhold</code> metric
     * comparison, measurements from all devices are accumulated over this time duration before being used to calculate
     * percentiles, and later, measurements from an individual device are also accumulated over this time duration
     * before being given a percentile rank.
     * </p>
     */
    private Integer durationSeconds;
    /**
     * <p>
     * If a device is in violation of the behavior for the specified number of consecutive datapoints, an alarm occurs.
     * If not specified, the default is 1.
     * </p>
     */
    private Integer consecutiveDatapointsToAlarm;
    /**
     * <p>
     * If an alarm has occurred and the offending device is no longer in violation of the behavior for the specified
     * number of consecutive datapoints, the alarm is cleared. If not specified, the default is 1.
     * </p>
     */
    private Integer consecutiveDatapointsToClear;
    /**
     * <p>
     * A statistical ranking (percentile) which indicates a threshold value by which a behavior is determined to be in
     * compliance or in violation of the behavior.
     * </p>
     */
    private StatisticalThreshold statisticalThreshold;

    /**
     * <p>
     * The operator that relates the thing measured (<code>metric</code>) to the criteria (containing a
     * <code>value</code> or <code>statisticalThreshold</code>).
     * </p>
     * 
     * @param comparisonOperator
     *        The operator that relates the thing measured (<code>metric</code>) to the criteria (containing a
     *        <code>value</code> or <code>statisticalThreshold</code>).
     * @see ComparisonOperator
     */

    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    /**
     * <p>
     * The operator that relates the thing measured (<code>metric</code>) to the criteria (containing a
     * <code>value</code> or <code>statisticalThreshold</code>).
     * </p>
     * 
     * @return The operator that relates the thing measured (<code>metric</code>) to the criteria (containing a
     *         <code>value</code> or <code>statisticalThreshold</code>).
     * @see ComparisonOperator
     */

    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    /**
     * <p>
     * The operator that relates the thing measured (<code>metric</code>) to the criteria (containing a
     * <code>value</code> or <code>statisticalThreshold</code>).
     * </p>
     * 
     * @param comparisonOperator
     *        The operator that relates the thing measured (<code>metric</code>) to the criteria (containing a
     *        <code>value</code> or <code>statisticalThreshold</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComparisonOperator
     */

    public BehaviorCriteria withComparisonOperator(String comparisonOperator) {
        setComparisonOperator(comparisonOperator);
        return this;
    }

    /**
     * <p>
     * The operator that relates the thing measured (<code>metric</code>) to the criteria (containing a
     * <code>value</code> or <code>statisticalThreshold</code>).
     * </p>
     * 
     * @param comparisonOperator
     *        The operator that relates the thing measured (<code>metric</code>) to the criteria (containing a
     *        <code>value</code> or <code>statisticalThreshold</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComparisonOperator
     */

    public BehaviorCriteria withComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
        return this;
    }

    /**
     * <p>
     * The value to be compared with the <code>metric</code>.
     * </p>
     * 
     * @param value
     *        The value to be compared with the <code>metric</code>.
     */

    public void setValue(MetricValue value) {
        this.value = value;
    }

    /**
     * <p>
     * The value to be compared with the <code>metric</code>.
     * </p>
     * 
     * @return The value to be compared with the <code>metric</code>.
     */

    public MetricValue getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value to be compared with the <code>metric</code>.
     * </p>
     * 
     * @param value
     *        The value to be compared with the <code>metric</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BehaviorCriteria withValue(MetricValue value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * Use this to specify the time duration over which the behavior is evaluated, for those criteria which have a time
     * dimension (for example, <code>NUM_MESSAGES_SENT</code>). For a <code>statisticalThreshhold</code> metric
     * comparison, measurements from all devices are accumulated over this time duration before being used to calculate
     * percentiles, and later, measurements from an individual device are also accumulated over this time duration
     * before being given a percentile rank.
     * </p>
     * 
     * @param durationSeconds
     *        Use this to specify the time duration over which the behavior is evaluated, for those criteria which have
     *        a time dimension (for example, <code>NUM_MESSAGES_SENT</code>). For a <code>statisticalThreshhold</code>
     *        metric comparison, measurements from all devices are accumulated over this time duration before being used
     *        to calculate percentiles, and later, measurements from an individual device are also accumulated over this
     *        time duration before being given a percentile rank.
     */

    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    /**
     * <p>
     * Use this to specify the time duration over which the behavior is evaluated, for those criteria which have a time
     * dimension (for example, <code>NUM_MESSAGES_SENT</code>). For a <code>statisticalThreshhold</code> metric
     * comparison, measurements from all devices are accumulated over this time duration before being used to calculate
     * percentiles, and later, measurements from an individual device are also accumulated over this time duration
     * before being given a percentile rank.
     * </p>
     * 
     * @return Use this to specify the time duration over which the behavior is evaluated, for those criteria which have
     *         a time dimension (for example, <code>NUM_MESSAGES_SENT</code>). For a <code>statisticalThreshhold</code>
     *         metric comparison, measurements from all devices are accumulated over this time duration before being
     *         used to calculate percentiles, and later, measurements from an individual device are also accumulated
     *         over this time duration before being given a percentile rank.
     */

    public Integer getDurationSeconds() {
        return this.durationSeconds;
    }

    /**
     * <p>
     * Use this to specify the time duration over which the behavior is evaluated, for those criteria which have a time
     * dimension (for example, <code>NUM_MESSAGES_SENT</code>). For a <code>statisticalThreshhold</code> metric
     * comparison, measurements from all devices are accumulated over this time duration before being used to calculate
     * percentiles, and later, measurements from an individual device are also accumulated over this time duration
     * before being given a percentile rank.
     * </p>
     * 
     * @param durationSeconds
     *        Use this to specify the time duration over which the behavior is evaluated, for those criteria which have
     *        a time dimension (for example, <code>NUM_MESSAGES_SENT</code>). For a <code>statisticalThreshhold</code>
     *        metric comparison, measurements from all devices are accumulated over this time duration before being used
     *        to calculate percentiles, and later, measurements from an individual device are also accumulated over this
     *        time duration before being given a percentile rank.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BehaviorCriteria withDurationSeconds(Integer durationSeconds) {
        setDurationSeconds(durationSeconds);
        return this;
    }

    /**
     * <p>
     * If a device is in violation of the behavior for the specified number of consecutive datapoints, an alarm occurs.
     * If not specified, the default is 1.
     * </p>
     * 
     * @param consecutiveDatapointsToAlarm
     *        If a device is in violation of the behavior for the specified number of consecutive datapoints, an alarm
     *        occurs. If not specified, the default is 1.
     */

    public void setConsecutiveDatapointsToAlarm(Integer consecutiveDatapointsToAlarm) {
        this.consecutiveDatapointsToAlarm = consecutiveDatapointsToAlarm;
    }

    /**
     * <p>
     * If a device is in violation of the behavior for the specified number of consecutive datapoints, an alarm occurs.
     * If not specified, the default is 1.
     * </p>
     * 
     * @return If a device is in violation of the behavior for the specified number of consecutive datapoints, an alarm
     *         occurs. If not specified, the default is 1.
     */

    public Integer getConsecutiveDatapointsToAlarm() {
        return this.consecutiveDatapointsToAlarm;
    }

    /**
     * <p>
     * If a device is in violation of the behavior for the specified number of consecutive datapoints, an alarm occurs.
     * If not specified, the default is 1.
     * </p>
     * 
     * @param consecutiveDatapointsToAlarm
     *        If a device is in violation of the behavior for the specified number of consecutive datapoints, an alarm
     *        occurs. If not specified, the default is 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BehaviorCriteria withConsecutiveDatapointsToAlarm(Integer consecutiveDatapointsToAlarm) {
        setConsecutiveDatapointsToAlarm(consecutiveDatapointsToAlarm);
        return this;
    }

    /**
     * <p>
     * If an alarm has occurred and the offending device is no longer in violation of the behavior for the specified
     * number of consecutive datapoints, the alarm is cleared. If not specified, the default is 1.
     * </p>
     * 
     * @param consecutiveDatapointsToClear
     *        If an alarm has occurred and the offending device is no longer in violation of the behavior for the
     *        specified number of consecutive datapoints, the alarm is cleared. If not specified, the default is 1.
     */

    public void setConsecutiveDatapointsToClear(Integer consecutiveDatapointsToClear) {
        this.consecutiveDatapointsToClear = consecutiveDatapointsToClear;
    }

    /**
     * <p>
     * If an alarm has occurred and the offending device is no longer in violation of the behavior for the specified
     * number of consecutive datapoints, the alarm is cleared. If not specified, the default is 1.
     * </p>
     * 
     * @return If an alarm has occurred and the offending device is no longer in violation of the behavior for the
     *         specified number of consecutive datapoints, the alarm is cleared. If not specified, the default is 1.
     */

    public Integer getConsecutiveDatapointsToClear() {
        return this.consecutiveDatapointsToClear;
    }

    /**
     * <p>
     * If an alarm has occurred and the offending device is no longer in violation of the behavior for the specified
     * number of consecutive datapoints, the alarm is cleared. If not specified, the default is 1.
     * </p>
     * 
     * @param consecutiveDatapointsToClear
     *        If an alarm has occurred and the offending device is no longer in violation of the behavior for the
     *        specified number of consecutive datapoints, the alarm is cleared. If not specified, the default is 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BehaviorCriteria withConsecutiveDatapointsToClear(Integer consecutiveDatapointsToClear) {
        setConsecutiveDatapointsToClear(consecutiveDatapointsToClear);
        return this;
    }

    /**
     * <p>
     * A statistical ranking (percentile) which indicates a threshold value by which a behavior is determined to be in
     * compliance or in violation of the behavior.
     * </p>
     * 
     * @param statisticalThreshold
     *        A statistical ranking (percentile) which indicates a threshold value by which a behavior is determined to
     *        be in compliance or in violation of the behavior.
     */

    public void setStatisticalThreshold(StatisticalThreshold statisticalThreshold) {
        this.statisticalThreshold = statisticalThreshold;
    }

    /**
     * <p>
     * A statistical ranking (percentile) which indicates a threshold value by which a behavior is determined to be in
     * compliance or in violation of the behavior.
     * </p>
     * 
     * @return A statistical ranking (percentile) which indicates a threshold value by which a behavior is determined to
     *         be in compliance or in violation of the behavior.
     */

    public StatisticalThreshold getStatisticalThreshold() {
        return this.statisticalThreshold;
    }

    /**
     * <p>
     * A statistical ranking (percentile) which indicates a threshold value by which a behavior is determined to be in
     * compliance or in violation of the behavior.
     * </p>
     * 
     * @param statisticalThreshold
     *        A statistical ranking (percentile) which indicates a threshold value by which a behavior is determined to
     *        be in compliance or in violation of the behavior.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BehaviorCriteria withStatisticalThreshold(StatisticalThreshold statisticalThreshold) {
        setStatisticalThreshold(statisticalThreshold);
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
        if (getComparisonOperator() != null)
            sb.append("ComparisonOperator: ").append(getComparisonOperator()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getDurationSeconds() != null)
            sb.append("DurationSeconds: ").append(getDurationSeconds()).append(",");
        if (getConsecutiveDatapointsToAlarm() != null)
            sb.append("ConsecutiveDatapointsToAlarm: ").append(getConsecutiveDatapointsToAlarm()).append(",");
        if (getConsecutiveDatapointsToClear() != null)
            sb.append("ConsecutiveDatapointsToClear: ").append(getConsecutiveDatapointsToClear()).append(",");
        if (getStatisticalThreshold() != null)
            sb.append("StatisticalThreshold: ").append(getStatisticalThreshold());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BehaviorCriteria == false)
            return false;
        BehaviorCriteria other = (BehaviorCriteria) obj;
        if (other.getComparisonOperator() == null ^ this.getComparisonOperator() == null)
            return false;
        if (other.getComparisonOperator() != null && other.getComparisonOperator().equals(this.getComparisonOperator()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getDurationSeconds() == null ^ this.getDurationSeconds() == null)
            return false;
        if (other.getDurationSeconds() != null && other.getDurationSeconds().equals(this.getDurationSeconds()) == false)
            return false;
        if (other.getConsecutiveDatapointsToAlarm() == null ^ this.getConsecutiveDatapointsToAlarm() == null)
            return false;
        if (other.getConsecutiveDatapointsToAlarm() != null && other.getConsecutiveDatapointsToAlarm().equals(this.getConsecutiveDatapointsToAlarm()) == false)
            return false;
        if (other.getConsecutiveDatapointsToClear() == null ^ this.getConsecutiveDatapointsToClear() == null)
            return false;
        if (other.getConsecutiveDatapointsToClear() != null && other.getConsecutiveDatapointsToClear().equals(this.getConsecutiveDatapointsToClear()) == false)
            return false;
        if (other.getStatisticalThreshold() == null ^ this.getStatisticalThreshold() == null)
            return false;
        if (other.getStatisticalThreshold() != null && other.getStatisticalThreshold().equals(this.getStatisticalThreshold()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComparisonOperator() == null) ? 0 : getComparisonOperator().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getDurationSeconds() == null) ? 0 : getDurationSeconds().hashCode());
        hashCode = prime * hashCode + ((getConsecutiveDatapointsToAlarm() == null) ? 0 : getConsecutiveDatapointsToAlarm().hashCode());
        hashCode = prime * hashCode + ((getConsecutiveDatapointsToClear() == null) ? 0 : getConsecutiveDatapointsToClear().hashCode());
        hashCode = prime * hashCode + ((getStatisticalThreshold() == null) ? 0 : getStatisticalThreshold().hashCode());
        return hashCode;
    }

    @Override
    public BehaviorCriteria clone() {
        try {
            return (BehaviorCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.BehaviorCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
