/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Specifies a rule for enabling fast snapshot restore. You can enable fast snapshot restore based on either a count or
 * a time interval.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/FastRestoreRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FastRestoreRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of snapshots to be enabled with fast snapshot restore.
     * </p>
     */
    private Integer count;
    /**
     * <p>
     * The amount of time to enable fast snapshot restore. The maximum is 100 years. This is equivalent to 1200 months,
     * 5200 weeks, or 36500 days.
     * </p>
     */
    private Integer interval;
    /**
     * <p>
     * The unit of time for enabling fast snapshot restore.
     * </p>
     */
    private String intervalUnit;
    /**
     * <p>
     * The Availability Zones in which to enable fast snapshot restore.
     * </p>
     */
    private java.util.List<String> availabilityZones;

    /**
     * <p>
     * The number of snapshots to be enabled with fast snapshot restore.
     * </p>
     * 
     * @param count
     *        The number of snapshots to be enabled with fast snapshot restore.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of snapshots to be enabled with fast snapshot restore.
     * </p>
     * 
     * @return The number of snapshots to be enabled with fast snapshot restore.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * The number of snapshots to be enabled with fast snapshot restore.
     * </p>
     * 
     * @param count
     *        The number of snapshots to be enabled with fast snapshot restore.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FastRestoreRule withCount(Integer count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * The amount of time to enable fast snapshot restore. The maximum is 100 years. This is equivalent to 1200 months,
     * 5200 weeks, or 36500 days.
     * </p>
     * 
     * @param interval
     *        The amount of time to enable fast snapshot restore. The maximum is 100 years. This is equivalent to 1200
     *        months, 5200 weeks, or 36500 days.
     */

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * <p>
     * The amount of time to enable fast snapshot restore. The maximum is 100 years. This is equivalent to 1200 months,
     * 5200 weeks, or 36500 days.
     * </p>
     * 
     * @return The amount of time to enable fast snapshot restore. The maximum is 100 years. This is equivalent to 1200
     *         months, 5200 weeks, or 36500 days.
     */

    public Integer getInterval() {
        return this.interval;
    }

    /**
     * <p>
     * The amount of time to enable fast snapshot restore. The maximum is 100 years. This is equivalent to 1200 months,
     * 5200 weeks, or 36500 days.
     * </p>
     * 
     * @param interval
     *        The amount of time to enable fast snapshot restore. The maximum is 100 years. This is equivalent to 1200
     *        months, 5200 weeks, or 36500 days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FastRestoreRule withInterval(Integer interval) {
        setInterval(interval);
        return this;
    }

    /**
     * <p>
     * The unit of time for enabling fast snapshot restore.
     * </p>
     * 
     * @param intervalUnit
     *        The unit of time for enabling fast snapshot restore.
     * @see RetentionIntervalUnitValues
     */

    public void setIntervalUnit(String intervalUnit) {
        this.intervalUnit = intervalUnit;
    }

    /**
     * <p>
     * The unit of time for enabling fast snapshot restore.
     * </p>
     * 
     * @return The unit of time for enabling fast snapshot restore.
     * @see RetentionIntervalUnitValues
     */

    public String getIntervalUnit() {
        return this.intervalUnit;
    }

    /**
     * <p>
     * The unit of time for enabling fast snapshot restore.
     * </p>
     * 
     * @param intervalUnit
     *        The unit of time for enabling fast snapshot restore.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetentionIntervalUnitValues
     */

    public FastRestoreRule withIntervalUnit(String intervalUnit) {
        setIntervalUnit(intervalUnit);
        return this;
    }

    /**
     * <p>
     * The unit of time for enabling fast snapshot restore.
     * </p>
     * 
     * @param intervalUnit
     *        The unit of time for enabling fast snapshot restore.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetentionIntervalUnitValues
     */

    public FastRestoreRule withIntervalUnit(RetentionIntervalUnitValues intervalUnit) {
        this.intervalUnit = intervalUnit.toString();
        return this;
    }

    /**
     * <p>
     * The Availability Zones in which to enable fast snapshot restore.
     * </p>
     * 
     * @return The Availability Zones in which to enable fast snapshot restore.
     */

    public java.util.List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * <p>
     * The Availability Zones in which to enable fast snapshot restore.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zones in which to enable fast snapshot restore.
     */

    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new java.util.ArrayList<String>(availabilityZones);
    }

    /**
     * <p>
     * The Availability Zones in which to enable fast snapshot restore.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zones in which to enable fast snapshot restore.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FastRestoreRule withAvailabilityZones(String... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new java.util.ArrayList<String>(availabilityZones.length));
        }
        for (String ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Availability Zones in which to enable fast snapshot restore.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zones in which to enable fast snapshot restore.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FastRestoreRule withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
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
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getInterval() != null)
            sb.append("Interval: ").append(getInterval()).append(",");
        if (getIntervalUnit() != null)
            sb.append("IntervalUnit: ").append(getIntervalUnit()).append(",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FastRestoreRule == false)
            return false;
        FastRestoreRule other = (FastRestoreRule) obj;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getInterval() == null ^ this.getInterval() == null)
            return false;
        if (other.getInterval() != null && other.getInterval().equals(this.getInterval()) == false)
            return false;
        if (other.getIntervalUnit() == null ^ this.getIntervalUnit() == null)
            return false;
        if (other.getIntervalUnit() != null && other.getIntervalUnit().equals(this.getIntervalUnit()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getInterval() == null) ? 0 : getInterval().hashCode());
        hashCode = prime * hashCode + ((getIntervalUnit() == null) ? 0 : getIntervalUnit().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        return hashCode;
    }

    @Override
    public FastRestoreRule clone() {
        try {
            return (FastRestoreRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dlm.model.transform.FastRestoreRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
