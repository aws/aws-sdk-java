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
 * A statistical ranking (percentile) which indicates a threshold value by which a behavior is determined to be in
 * compliance or in violation of the behavior.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StatisticalThreshold implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The percentile which resolves to a threshold value by which compliance with a behavior is determined. Metrics are
     * collected over the specified period (<code>durationSeconds</code>) from all reporting devices in your account and
     * statistical ranks are calculated. Then, the measurements from a device are collected over the same period. If the
     * accumulated measurements from the device fall above or below (<code>comparisonOperator</code>) the value
     * associated with the percentile specified, then the device is considered to be in compliance with the behavior,
     * otherwise a violation occurs.
     * </p>
     */
    private String statistic;

    /**
     * <p>
     * The percentile which resolves to a threshold value by which compliance with a behavior is determined. Metrics are
     * collected over the specified period (<code>durationSeconds</code>) from all reporting devices in your account and
     * statistical ranks are calculated. Then, the measurements from a device are collected over the same period. If the
     * accumulated measurements from the device fall above or below (<code>comparisonOperator</code>) the value
     * associated with the percentile specified, then the device is considered to be in compliance with the behavior,
     * otherwise a violation occurs.
     * </p>
     * 
     * @param statistic
     *        The percentile which resolves to a threshold value by which compliance with a behavior is determined.
     *        Metrics are collected over the specified period (<code>durationSeconds</code>) from all reporting devices
     *        in your account and statistical ranks are calculated. Then, the measurements from a device are collected
     *        over the same period. If the accumulated measurements from the device fall above or below (
     *        <code>comparisonOperator</code>) the value associated with the percentile specified, then the device is
     *        considered to be in compliance with the behavior, otherwise a violation occurs.
     */

    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }

    /**
     * <p>
     * The percentile which resolves to a threshold value by which compliance with a behavior is determined. Metrics are
     * collected over the specified period (<code>durationSeconds</code>) from all reporting devices in your account and
     * statistical ranks are calculated. Then, the measurements from a device are collected over the same period. If the
     * accumulated measurements from the device fall above or below (<code>comparisonOperator</code>) the value
     * associated with the percentile specified, then the device is considered to be in compliance with the behavior,
     * otherwise a violation occurs.
     * </p>
     * 
     * @return The percentile which resolves to a threshold value by which compliance with a behavior is determined.
     *         Metrics are collected over the specified period (<code>durationSeconds</code>) from all reporting devices
     *         in your account and statistical ranks are calculated. Then, the measurements from a device are collected
     *         over the same period. If the accumulated measurements from the device fall above or below (
     *         <code>comparisonOperator</code>) the value associated with the percentile specified, then the device is
     *         considered to be in compliance with the behavior, otherwise a violation occurs.
     */

    public String getStatistic() {
        return this.statistic;
    }

    /**
     * <p>
     * The percentile which resolves to a threshold value by which compliance with a behavior is determined. Metrics are
     * collected over the specified period (<code>durationSeconds</code>) from all reporting devices in your account and
     * statistical ranks are calculated. Then, the measurements from a device are collected over the same period. If the
     * accumulated measurements from the device fall above or below (<code>comparisonOperator</code>) the value
     * associated with the percentile specified, then the device is considered to be in compliance with the behavior,
     * otherwise a violation occurs.
     * </p>
     * 
     * @param statistic
     *        The percentile which resolves to a threshold value by which compliance with a behavior is determined.
     *        Metrics are collected over the specified period (<code>durationSeconds</code>) from all reporting devices
     *        in your account and statistical ranks are calculated. Then, the measurements from a device are collected
     *        over the same period. If the accumulated measurements from the device fall above or below (
     *        <code>comparisonOperator</code>) the value associated with the percentile specified, then the device is
     *        considered to be in compliance with the behavior, otherwise a violation occurs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatisticalThreshold withStatistic(String statistic) {
        setStatistic(statistic);
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
        if (getStatistic() != null)
            sb.append("Statistic: ").append(getStatistic());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StatisticalThreshold == false)
            return false;
        StatisticalThreshold other = (StatisticalThreshold) obj;
        if (other.getStatistic() == null ^ this.getStatistic() == null)
            return false;
        if (other.getStatistic() != null && other.getStatistic().equals(this.getStatistic()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatistic() == null) ? 0 : getStatistic().hashCode());
        return hashCode;
    }

    @Override
    public StatisticalThreshold clone() {
        try {
            return (StatisticalThreshold) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.StatisticalThresholdMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
