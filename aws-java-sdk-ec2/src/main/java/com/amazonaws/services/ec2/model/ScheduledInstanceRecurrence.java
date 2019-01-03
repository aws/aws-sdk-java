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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the recurring schedule for a Scheduled Instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ScheduledInstanceRecurrence" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduledInstanceRecurrence implements Serializable, Cloneable {

    /**
     * <p>
     * The frequency (<code>Daily</code>, <code>Weekly</code>, or <code>Monthly</code>).
     * </p>
     */
    private String frequency;
    /**
     * <p>
     * The interval quantity. The interval unit depends on the value of <code>frequency</code>. For example, every 2
     * weeks or every 2 months.
     * </p>
     */
    private Integer interval;
    /**
     * <p>
     * The days. For a monthly schedule, this is one or more days of the month (1-31). For a weekly schedule, this is
     * one or more days of the week (1-7, where 1 is Sunday).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Integer> occurrenceDaySet;
    /**
     * <p>
     * Indicates whether the occurrence is relative to the end of the specified week or month.
     * </p>
     */
    private Boolean occurrenceRelativeToEnd;
    /**
     * <p>
     * The unit for <code>occurrenceDaySet</code> (<code>DayOfWeek</code> or <code>DayOfMonth</code>).
     * </p>
     */
    private String occurrenceUnit;

    /**
     * <p>
     * The frequency (<code>Daily</code>, <code>Weekly</code>, or <code>Monthly</code>).
     * </p>
     * 
     * @param frequency
     *        The frequency (<code>Daily</code>, <code>Weekly</code>, or <code>Monthly</code>).
     */

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    /**
     * <p>
     * The frequency (<code>Daily</code>, <code>Weekly</code>, or <code>Monthly</code>).
     * </p>
     * 
     * @return The frequency (<code>Daily</code>, <code>Weekly</code>, or <code>Monthly</code>).
     */

    public String getFrequency() {
        return this.frequency;
    }

    /**
     * <p>
     * The frequency (<code>Daily</code>, <code>Weekly</code>, or <code>Monthly</code>).
     * </p>
     * 
     * @param frequency
     *        The frequency (<code>Daily</code>, <code>Weekly</code>, or <code>Monthly</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstanceRecurrence withFrequency(String frequency) {
        setFrequency(frequency);
        return this;
    }

    /**
     * <p>
     * The interval quantity. The interval unit depends on the value of <code>frequency</code>. For example, every 2
     * weeks or every 2 months.
     * </p>
     * 
     * @param interval
     *        The interval quantity. The interval unit depends on the value of <code>frequency</code>. For example,
     *        every 2 weeks or every 2 months.
     */

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * <p>
     * The interval quantity. The interval unit depends on the value of <code>frequency</code>. For example, every 2
     * weeks or every 2 months.
     * </p>
     * 
     * @return The interval quantity. The interval unit depends on the value of <code>frequency</code>. For example,
     *         every 2 weeks or every 2 months.
     */

    public Integer getInterval() {
        return this.interval;
    }

    /**
     * <p>
     * The interval quantity. The interval unit depends on the value of <code>frequency</code>. For example, every 2
     * weeks or every 2 months.
     * </p>
     * 
     * @param interval
     *        The interval quantity. The interval unit depends on the value of <code>frequency</code>. For example,
     *        every 2 weeks or every 2 months.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstanceRecurrence withInterval(Integer interval) {
        setInterval(interval);
        return this;
    }

    /**
     * <p>
     * The days. For a monthly schedule, this is one or more days of the month (1-31). For a weekly schedule, this is
     * one or more days of the week (1-7, where 1 is Sunday).
     * </p>
     * 
     * @return The days. For a monthly schedule, this is one or more days of the month (1-31). For a weekly schedule,
     *         this is one or more days of the week (1-7, where 1 is Sunday).
     */

    public java.util.List<Integer> getOccurrenceDaySet() {
        if (occurrenceDaySet == null) {
            occurrenceDaySet = new com.amazonaws.internal.SdkInternalList<Integer>();
        }
        return occurrenceDaySet;
    }

    /**
     * <p>
     * The days. For a monthly schedule, this is one or more days of the month (1-31). For a weekly schedule, this is
     * one or more days of the week (1-7, where 1 is Sunday).
     * </p>
     * 
     * @param occurrenceDaySet
     *        The days. For a monthly schedule, this is one or more days of the month (1-31). For a weekly schedule,
     *        this is one or more days of the week (1-7, where 1 is Sunday).
     */

    public void setOccurrenceDaySet(java.util.Collection<Integer> occurrenceDaySet) {
        if (occurrenceDaySet == null) {
            this.occurrenceDaySet = null;
            return;
        }

        this.occurrenceDaySet = new com.amazonaws.internal.SdkInternalList<Integer>(occurrenceDaySet);
    }

    /**
     * <p>
     * The days. For a monthly schedule, this is one or more days of the month (1-31). For a weekly schedule, this is
     * one or more days of the week (1-7, where 1 is Sunday).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOccurrenceDaySet(java.util.Collection)} or {@link #withOccurrenceDaySet(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param occurrenceDaySet
     *        The days. For a monthly schedule, this is one or more days of the month (1-31). For a weekly schedule,
     *        this is one or more days of the week (1-7, where 1 is Sunday).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstanceRecurrence withOccurrenceDaySet(Integer... occurrenceDaySet) {
        if (this.occurrenceDaySet == null) {
            setOccurrenceDaySet(new com.amazonaws.internal.SdkInternalList<Integer>(occurrenceDaySet.length));
        }
        for (Integer ele : occurrenceDaySet) {
            this.occurrenceDaySet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The days. For a monthly schedule, this is one or more days of the month (1-31). For a weekly schedule, this is
     * one or more days of the week (1-7, where 1 is Sunday).
     * </p>
     * 
     * @param occurrenceDaySet
     *        The days. For a monthly schedule, this is one or more days of the month (1-31). For a weekly schedule,
     *        this is one or more days of the week (1-7, where 1 is Sunday).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstanceRecurrence withOccurrenceDaySet(java.util.Collection<Integer> occurrenceDaySet) {
        setOccurrenceDaySet(occurrenceDaySet);
        return this;
    }

    /**
     * <p>
     * Indicates whether the occurrence is relative to the end of the specified week or month.
     * </p>
     * 
     * @param occurrenceRelativeToEnd
     *        Indicates whether the occurrence is relative to the end of the specified week or month.
     */

    public void setOccurrenceRelativeToEnd(Boolean occurrenceRelativeToEnd) {
        this.occurrenceRelativeToEnd = occurrenceRelativeToEnd;
    }

    /**
     * <p>
     * Indicates whether the occurrence is relative to the end of the specified week or month.
     * </p>
     * 
     * @return Indicates whether the occurrence is relative to the end of the specified week or month.
     */

    public Boolean getOccurrenceRelativeToEnd() {
        return this.occurrenceRelativeToEnd;
    }

    /**
     * <p>
     * Indicates whether the occurrence is relative to the end of the specified week or month.
     * </p>
     * 
     * @param occurrenceRelativeToEnd
     *        Indicates whether the occurrence is relative to the end of the specified week or month.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstanceRecurrence withOccurrenceRelativeToEnd(Boolean occurrenceRelativeToEnd) {
        setOccurrenceRelativeToEnd(occurrenceRelativeToEnd);
        return this;
    }

    /**
     * <p>
     * Indicates whether the occurrence is relative to the end of the specified week or month.
     * </p>
     * 
     * @return Indicates whether the occurrence is relative to the end of the specified week or month.
     */

    public Boolean isOccurrenceRelativeToEnd() {
        return this.occurrenceRelativeToEnd;
    }

    /**
     * <p>
     * The unit for <code>occurrenceDaySet</code> (<code>DayOfWeek</code> or <code>DayOfMonth</code>).
     * </p>
     * 
     * @param occurrenceUnit
     *        The unit for <code>occurrenceDaySet</code> (<code>DayOfWeek</code> or <code>DayOfMonth</code>).
     */

    public void setOccurrenceUnit(String occurrenceUnit) {
        this.occurrenceUnit = occurrenceUnit;
    }

    /**
     * <p>
     * The unit for <code>occurrenceDaySet</code> (<code>DayOfWeek</code> or <code>DayOfMonth</code>).
     * </p>
     * 
     * @return The unit for <code>occurrenceDaySet</code> (<code>DayOfWeek</code> or <code>DayOfMonth</code>).
     */

    public String getOccurrenceUnit() {
        return this.occurrenceUnit;
    }

    /**
     * <p>
     * The unit for <code>occurrenceDaySet</code> (<code>DayOfWeek</code> or <code>DayOfMonth</code>).
     * </p>
     * 
     * @param occurrenceUnit
     *        The unit for <code>occurrenceDaySet</code> (<code>DayOfWeek</code> or <code>DayOfMonth</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstanceRecurrence withOccurrenceUnit(String occurrenceUnit) {
        setOccurrenceUnit(occurrenceUnit);
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
        if (getFrequency() != null)
            sb.append("Frequency: ").append(getFrequency()).append(",");
        if (getInterval() != null)
            sb.append("Interval: ").append(getInterval()).append(",");
        if (getOccurrenceDaySet() != null)
            sb.append("OccurrenceDaySet: ").append(getOccurrenceDaySet()).append(",");
        if (getOccurrenceRelativeToEnd() != null)
            sb.append("OccurrenceRelativeToEnd: ").append(getOccurrenceRelativeToEnd()).append(",");
        if (getOccurrenceUnit() != null)
            sb.append("OccurrenceUnit: ").append(getOccurrenceUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduledInstanceRecurrence == false)
            return false;
        ScheduledInstanceRecurrence other = (ScheduledInstanceRecurrence) obj;
        if (other.getFrequency() == null ^ this.getFrequency() == null)
            return false;
        if (other.getFrequency() != null && other.getFrequency().equals(this.getFrequency()) == false)
            return false;
        if (other.getInterval() == null ^ this.getInterval() == null)
            return false;
        if (other.getInterval() != null && other.getInterval().equals(this.getInterval()) == false)
            return false;
        if (other.getOccurrenceDaySet() == null ^ this.getOccurrenceDaySet() == null)
            return false;
        if (other.getOccurrenceDaySet() != null && other.getOccurrenceDaySet().equals(this.getOccurrenceDaySet()) == false)
            return false;
        if (other.getOccurrenceRelativeToEnd() == null ^ this.getOccurrenceRelativeToEnd() == null)
            return false;
        if (other.getOccurrenceRelativeToEnd() != null && other.getOccurrenceRelativeToEnd().equals(this.getOccurrenceRelativeToEnd()) == false)
            return false;
        if (other.getOccurrenceUnit() == null ^ this.getOccurrenceUnit() == null)
            return false;
        if (other.getOccurrenceUnit() != null && other.getOccurrenceUnit().equals(this.getOccurrenceUnit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFrequency() == null) ? 0 : getFrequency().hashCode());
        hashCode = prime * hashCode + ((getInterval() == null) ? 0 : getInterval().hashCode());
        hashCode = prime * hashCode + ((getOccurrenceDaySet() == null) ? 0 : getOccurrenceDaySet().hashCode());
        hashCode = prime * hashCode + ((getOccurrenceRelativeToEnd() == null) ? 0 : getOccurrenceRelativeToEnd().hashCode());
        hashCode = prime * hashCode + ((getOccurrenceUnit() == null) ? 0 : getOccurrenceUnit().hashCode());
        return hashCode;
    }

    @Override
    public ScheduledInstanceRecurrence clone() {
        try {
            return (ScheduledInstanceRecurrence) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
