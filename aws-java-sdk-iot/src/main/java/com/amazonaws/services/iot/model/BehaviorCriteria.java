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
     * The operator that relates the thing measured (<code>metric</code>) to the criteria (<code>value</code>).
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
     * Use this to specify the period of time over which the behavior is evaluated, for those criteria which have a time
     * dimension (for example, <code>NUM_MESSAGES_SENT</code>).
     * </p>
     */
    private Integer durationSeconds;

    /**
     * <p>
     * The operator that relates the thing measured (<code>metric</code>) to the criteria (<code>value</code>).
     * </p>
     * 
     * @param comparisonOperator
     *        The operator that relates the thing measured (<code>metric</code>) to the criteria (<code>value</code>).
     * @see ComparisonOperator
     */

    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    /**
     * <p>
     * The operator that relates the thing measured (<code>metric</code>) to the criteria (<code>value</code>).
     * </p>
     * 
     * @return The operator that relates the thing measured (<code>metric</code>) to the criteria (<code>value</code>).
     * @see ComparisonOperator
     */

    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    /**
     * <p>
     * The operator that relates the thing measured (<code>metric</code>) to the criteria (<code>value</code>).
     * </p>
     * 
     * @param comparisonOperator
     *        The operator that relates the thing measured (<code>metric</code>) to the criteria (<code>value</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComparisonOperator
     */

    public BehaviorCriteria withComparisonOperator(String comparisonOperator) {
        setComparisonOperator(comparisonOperator);
        return this;
    }

    /**
     * <p>
     * The operator that relates the thing measured (<code>metric</code>) to the criteria (<code>value</code>).
     * </p>
     * 
     * @param comparisonOperator
     *        The operator that relates the thing measured (<code>metric</code>) to the criteria (<code>value</code>).
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
     * Use this to specify the period of time over which the behavior is evaluated, for those criteria which have a time
     * dimension (for example, <code>NUM_MESSAGES_SENT</code>).
     * </p>
     * 
     * @param durationSeconds
     *        Use this to specify the period of time over which the behavior is evaluated, for those criteria which have
     *        a time dimension (for example, <code>NUM_MESSAGES_SENT</code>).
     */

    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    /**
     * <p>
     * Use this to specify the period of time over which the behavior is evaluated, for those criteria which have a time
     * dimension (for example, <code>NUM_MESSAGES_SENT</code>).
     * </p>
     * 
     * @return Use this to specify the period of time over which the behavior is evaluated, for those criteria which
     *         have a time dimension (for example, <code>NUM_MESSAGES_SENT</code>).
     */

    public Integer getDurationSeconds() {
        return this.durationSeconds;
    }

    /**
     * <p>
     * Use this to specify the period of time over which the behavior is evaluated, for those criteria which have a time
     * dimension (for example, <code>NUM_MESSAGES_SENT</code>).
     * </p>
     * 
     * @param durationSeconds
     *        Use this to specify the period of time over which the behavior is evaluated, for those criteria which have
     *        a time dimension (for example, <code>NUM_MESSAGES_SENT</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BehaviorCriteria withDurationSeconds(Integer durationSeconds) {
        setDurationSeconds(durationSeconds);
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
            sb.append("DurationSeconds: ").append(getDurationSeconds());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComparisonOperator() == null) ? 0 : getComparisonOperator().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getDurationSeconds() == null) ? 0 : getDurationSeconds().hashCode());
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
