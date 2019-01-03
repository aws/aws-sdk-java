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
package com.amazonaws.services.dlm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies when to create snapshots of EBS volumes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/CreateRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The interval. The supported values are 12 and 24.
     * </p>
     */
    private Integer interval;
    /**
     * <p>
     * The interval unit.
     * </p>
     */
    private String intervalUnit;
    /**
     * <p>
     * The time, in UTC, to start the operation.
     * </p>
     * <p>
     * The operation occurs within a one-hour window following the specified time.
     * </p>
     */
    private java.util.List<String> times;

    /**
     * <p>
     * The interval. The supported values are 12 and 24.
     * </p>
     * 
     * @param interval
     *        The interval. The supported values are 12 and 24.
     */

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * <p>
     * The interval. The supported values are 12 and 24.
     * </p>
     * 
     * @return The interval. The supported values are 12 and 24.
     */

    public Integer getInterval() {
        return this.interval;
    }

    /**
     * <p>
     * The interval. The supported values are 12 and 24.
     * </p>
     * 
     * @param interval
     *        The interval. The supported values are 12 and 24.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRule withInterval(Integer interval) {
        setInterval(interval);
        return this;
    }

    /**
     * <p>
     * The interval unit.
     * </p>
     * 
     * @param intervalUnit
     *        The interval unit.
     * @see IntervalUnitValues
     */

    public void setIntervalUnit(String intervalUnit) {
        this.intervalUnit = intervalUnit;
    }

    /**
     * <p>
     * The interval unit.
     * </p>
     * 
     * @return The interval unit.
     * @see IntervalUnitValues
     */

    public String getIntervalUnit() {
        return this.intervalUnit;
    }

    /**
     * <p>
     * The interval unit.
     * </p>
     * 
     * @param intervalUnit
     *        The interval unit.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IntervalUnitValues
     */

    public CreateRule withIntervalUnit(String intervalUnit) {
        setIntervalUnit(intervalUnit);
        return this;
    }

    /**
     * <p>
     * The interval unit.
     * </p>
     * 
     * @param intervalUnit
     *        The interval unit.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IntervalUnitValues
     */

    public CreateRule withIntervalUnit(IntervalUnitValues intervalUnit) {
        this.intervalUnit = intervalUnit.toString();
        return this;
    }

    /**
     * <p>
     * The time, in UTC, to start the operation.
     * </p>
     * <p>
     * The operation occurs within a one-hour window following the specified time.
     * </p>
     * 
     * @return The time, in UTC, to start the operation.</p>
     *         <p>
     *         The operation occurs within a one-hour window following the specified time.
     */

    public java.util.List<String> getTimes() {
        return times;
    }

    /**
     * <p>
     * The time, in UTC, to start the operation.
     * </p>
     * <p>
     * The operation occurs within a one-hour window following the specified time.
     * </p>
     * 
     * @param times
     *        The time, in UTC, to start the operation.</p>
     *        <p>
     *        The operation occurs within a one-hour window following the specified time.
     */

    public void setTimes(java.util.Collection<String> times) {
        if (times == null) {
            this.times = null;
            return;
        }

        this.times = new java.util.ArrayList<String>(times);
    }

    /**
     * <p>
     * The time, in UTC, to start the operation.
     * </p>
     * <p>
     * The operation occurs within a one-hour window following the specified time.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTimes(java.util.Collection)} or {@link #withTimes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param times
     *        The time, in UTC, to start the operation.</p>
     *        <p>
     *        The operation occurs within a one-hour window following the specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRule withTimes(String... times) {
        if (this.times == null) {
            setTimes(new java.util.ArrayList<String>(times.length));
        }
        for (String ele : times) {
            this.times.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The time, in UTC, to start the operation.
     * </p>
     * <p>
     * The operation occurs within a one-hour window following the specified time.
     * </p>
     * 
     * @param times
     *        The time, in UTC, to start the operation.</p>
     *        <p>
     *        The operation occurs within a one-hour window following the specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRule withTimes(java.util.Collection<String> times) {
        setTimes(times);
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
        if (getInterval() != null)
            sb.append("Interval: ").append(getInterval()).append(",");
        if (getIntervalUnit() != null)
            sb.append("IntervalUnit: ").append(getIntervalUnit()).append(",");
        if (getTimes() != null)
            sb.append("Times: ").append(getTimes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRule == false)
            return false;
        CreateRule other = (CreateRule) obj;
        if (other.getInterval() == null ^ this.getInterval() == null)
            return false;
        if (other.getInterval() != null && other.getInterval().equals(this.getInterval()) == false)
            return false;
        if (other.getIntervalUnit() == null ^ this.getIntervalUnit() == null)
            return false;
        if (other.getIntervalUnit() != null && other.getIntervalUnit().equals(this.getIntervalUnit()) == false)
            return false;
        if (other.getTimes() == null ^ this.getTimes() == null)
            return false;
        if (other.getTimes() != null && other.getTimes().equals(this.getTimes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInterval() == null) ? 0 : getInterval().hashCode());
        hashCode = prime * hashCode + ((getIntervalUnit() == null) ? 0 : getIntervalUnit().hashCode());
        hashCode = prime * hashCode + ((getTimes() == null) ? 0 : getTimes().hashCode());
        return hashCode;
    }

    @Override
    public CreateRule clone() {
        try {
            return (CreateRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dlm.model.transform.CreateRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
