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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ScheduledInstanceRecurrenceRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduledInstanceRecurrenceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The frequency (<code>Daily</code>, <code>Weekly</code>, or <code>Monthly</code>).
     * </p>
     */
    private String frequency;
    /**
     * <p>
     * The interval quantity. The interval unit depends on the value of <code>Frequency</code>. For example, every 2
     * weeks or every 2 months.
     * </p>
     */
    private Integer interval;
    /**
     * <p>
     * The days. For a monthly schedule, this is one or more days of the month (1-31). For a weekly schedule, this is
     * one or more days of the week (1-7, where 1 is Sunday). You can't specify this value with a daily schedule. If the
     * occurrence is relative to the end of the month, you can specify only a single day.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Integer> occurrenceDays;
    /**
     * <p>
     * Indicates whether the occurrence is relative to the end of the specified week or month. You can't specify this
     * value with a daily schedule.
     * </p>
     */
    private Boolean occurrenceRelativeToEnd;
    /**
     * <p>
     * The unit for <code>OccurrenceDays</code> (<code>DayOfWeek</code> or <code>DayOfMonth</code>). This value is
     * required for a monthly schedule. You can't specify <code>DayOfWeek</code> with a weekly schedule. You can't
     * specify this value with a daily schedule.
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

    public ScheduledInstanceRecurrenceRequest withFrequency(String frequency) {
        setFrequency(frequency);
        return this;
    }

    /**
     * <p>
     * The interval quantity. The interval unit depends on the value of <code>Frequency</code>. For example, every 2
     * weeks or every 2 months.
     * </p>
     * 
     * @param interval
     *        The interval quantity. The interval unit depends on the value of <code>Frequency</code>. For example,
     *        every 2 weeks or every 2 months.
     */

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * <p>
     * The interval quantity. The interval unit depends on the value of <code>Frequency</code>. For example, every 2
     * weeks or every 2 months.
     * </p>
     * 
     * @return The interval quantity. The interval unit depends on the value of <code>Frequency</code>. For example,
     *         every 2 weeks or every 2 months.
     */

    public Integer getInterval() {
        return this.interval;
    }

    /**
     * <p>
     * The interval quantity. The interval unit depends on the value of <code>Frequency</code>. For example, every 2
     * weeks or every 2 months.
     * </p>
     * 
     * @param interval
     *        The interval quantity. The interval unit depends on the value of <code>Frequency</code>. For example,
     *        every 2 weeks or every 2 months.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstanceRecurrenceRequest withInterval(Integer interval) {
        setInterval(interval);
        return this;
    }

    /**
     * <p>
     * The days. For a monthly schedule, this is one or more days of the month (1-31). For a weekly schedule, this is
     * one or more days of the week (1-7, where 1 is Sunday). You can't specify this value with a daily schedule. If the
     * occurrence is relative to the end of the month, you can specify only a single day.
     * </p>
     * 
     * @return The days. For a monthly schedule, this is one or more days of the month (1-31). For a weekly schedule,
     *         this is one or more days of the week (1-7, where 1 is Sunday). You can't specify this value with a daily
     *         schedule. If the occurrence is relative to the end of the month, you can specify only a single day.
     */

    public java.util.List<Integer> getOccurrenceDays() {
        if (occurrenceDays == null) {
            occurrenceDays = new com.amazonaws.internal.SdkInternalList<Integer>();
        }
        return occurrenceDays;
    }

    /**
     * <p>
     * The days. For a monthly schedule, this is one or more days of the month (1-31). For a weekly schedule, this is
     * one or more days of the week (1-7, where 1 is Sunday). You can't specify this value with a daily schedule. If the
     * occurrence is relative to the end of the month, you can specify only a single day.
     * </p>
     * 
     * @param occurrenceDays
     *        The days. For a monthly schedule, this is one or more days of the month (1-31). For a weekly schedule,
     *        this is one or more days of the week (1-7, where 1 is Sunday). You can't specify this value with a daily
     *        schedule. If the occurrence is relative to the end of the month, you can specify only a single day.
     */

    public void setOccurrenceDays(java.util.Collection<Integer> occurrenceDays) {
        if (occurrenceDays == null) {
            this.occurrenceDays = null;
            return;
        }

        this.occurrenceDays = new com.amazonaws.internal.SdkInternalList<Integer>(occurrenceDays);
    }

    /**
     * <p>
     * The days. For a monthly schedule, this is one or more days of the month (1-31). For a weekly schedule, this is
     * one or more days of the week (1-7, where 1 is Sunday). You can't specify this value with a daily schedule. If the
     * occurrence is relative to the end of the month, you can specify only a single day.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOccurrenceDays(java.util.Collection)} or {@link #withOccurrenceDays(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param occurrenceDays
     *        The days. For a monthly schedule, this is one or more days of the month (1-31). For a weekly schedule,
     *        this is one or more days of the week (1-7, where 1 is Sunday). You can't specify this value with a daily
     *        schedule. If the occurrence is relative to the end of the month, you can specify only a single day.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstanceRecurrenceRequest withOccurrenceDays(Integer... occurrenceDays) {
        if (this.occurrenceDays == null) {
            setOccurrenceDays(new com.amazonaws.internal.SdkInternalList<Integer>(occurrenceDays.length));
        }
        for (Integer ele : occurrenceDays) {
            this.occurrenceDays.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The days. For a monthly schedule, this is one or more days of the month (1-31). For a weekly schedule, this is
     * one or more days of the week (1-7, where 1 is Sunday). You can't specify this value with a daily schedule. If the
     * occurrence is relative to the end of the month, you can specify only a single day.
     * </p>
     * 
     * @param occurrenceDays
     *        The days. For a monthly schedule, this is one or more days of the month (1-31). For a weekly schedule,
     *        this is one or more days of the week (1-7, where 1 is Sunday). You can't specify this value with a daily
     *        schedule. If the occurrence is relative to the end of the month, you can specify only a single day.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstanceRecurrenceRequest withOccurrenceDays(java.util.Collection<Integer> occurrenceDays) {
        setOccurrenceDays(occurrenceDays);
        return this;
    }

    /**
     * <p>
     * Indicates whether the occurrence is relative to the end of the specified week or month. You can't specify this
     * value with a daily schedule.
     * </p>
     * 
     * @param occurrenceRelativeToEnd
     *        Indicates whether the occurrence is relative to the end of the specified week or month. You can't specify
     *        this value with a daily schedule.
     */

    public void setOccurrenceRelativeToEnd(Boolean occurrenceRelativeToEnd) {
        this.occurrenceRelativeToEnd = occurrenceRelativeToEnd;
    }

    /**
     * <p>
     * Indicates whether the occurrence is relative to the end of the specified week or month. You can't specify this
     * value with a daily schedule.
     * </p>
     * 
     * @return Indicates whether the occurrence is relative to the end of the specified week or month. You can't specify
     *         this value with a daily schedule.
     */

    public Boolean getOccurrenceRelativeToEnd() {
        return this.occurrenceRelativeToEnd;
    }

    /**
     * <p>
     * Indicates whether the occurrence is relative to the end of the specified week or month. You can't specify this
     * value with a daily schedule.
     * </p>
     * 
     * @param occurrenceRelativeToEnd
     *        Indicates whether the occurrence is relative to the end of the specified week or month. You can't specify
     *        this value with a daily schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstanceRecurrenceRequest withOccurrenceRelativeToEnd(Boolean occurrenceRelativeToEnd) {
        setOccurrenceRelativeToEnd(occurrenceRelativeToEnd);
        return this;
    }

    /**
     * <p>
     * Indicates whether the occurrence is relative to the end of the specified week or month. You can't specify this
     * value with a daily schedule.
     * </p>
     * 
     * @return Indicates whether the occurrence is relative to the end of the specified week or month. You can't specify
     *         this value with a daily schedule.
     */

    public Boolean isOccurrenceRelativeToEnd() {
        return this.occurrenceRelativeToEnd;
    }

    /**
     * <p>
     * The unit for <code>OccurrenceDays</code> (<code>DayOfWeek</code> or <code>DayOfMonth</code>). This value is
     * required for a monthly schedule. You can't specify <code>DayOfWeek</code> with a weekly schedule. You can't
     * specify this value with a daily schedule.
     * </p>
     * 
     * @param occurrenceUnit
     *        The unit for <code>OccurrenceDays</code> (<code>DayOfWeek</code> or <code>DayOfMonth</code>). This value
     *        is required for a monthly schedule. You can't specify <code>DayOfWeek</code> with a weekly schedule. You
     *        can't specify this value with a daily schedule.
     */

    public void setOccurrenceUnit(String occurrenceUnit) {
        this.occurrenceUnit = occurrenceUnit;
    }

    /**
     * <p>
     * The unit for <code>OccurrenceDays</code> (<code>DayOfWeek</code> or <code>DayOfMonth</code>). This value is
     * required for a monthly schedule. You can't specify <code>DayOfWeek</code> with a weekly schedule. You can't
     * specify this value with a daily schedule.
     * </p>
     * 
     * @return The unit for <code>OccurrenceDays</code> (<code>DayOfWeek</code> or <code>DayOfMonth</code>). This value
     *         is required for a monthly schedule. You can't specify <code>DayOfWeek</code> with a weekly schedule. You
     *         can't specify this value with a daily schedule.
     */

    public String getOccurrenceUnit() {
        return this.occurrenceUnit;
    }

    /**
     * <p>
     * The unit for <code>OccurrenceDays</code> (<code>DayOfWeek</code> or <code>DayOfMonth</code>). This value is
     * required for a monthly schedule. You can't specify <code>DayOfWeek</code> with a weekly schedule. You can't
     * specify this value with a daily schedule.
     * </p>
     * 
     * @param occurrenceUnit
     *        The unit for <code>OccurrenceDays</code> (<code>DayOfWeek</code> or <code>DayOfMonth</code>). This value
     *        is required for a monthly schedule. You can't specify <code>DayOfWeek</code> with a weekly schedule. You
     *        can't specify this value with a daily schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledInstanceRecurrenceRequest withOccurrenceUnit(String occurrenceUnit) {
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
        if (getOccurrenceDays() != null)
            sb.append("OccurrenceDays: ").append(getOccurrenceDays()).append(",");
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

        if (obj instanceof ScheduledInstanceRecurrenceRequest == false)
            return false;
        ScheduledInstanceRecurrenceRequest other = (ScheduledInstanceRecurrenceRequest) obj;
        if (other.getFrequency() == null ^ this.getFrequency() == null)
            return false;
        if (other.getFrequency() != null && other.getFrequency().equals(this.getFrequency()) == false)
            return false;
        if (other.getInterval() == null ^ this.getInterval() == null)
            return false;
        if (other.getInterval() != null && other.getInterval().equals(this.getInterval()) == false)
            return false;
        if (other.getOccurrenceDays() == null ^ this.getOccurrenceDays() == null)
            return false;
        if (other.getOccurrenceDays() != null && other.getOccurrenceDays().equals(this.getOccurrenceDays()) == false)
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
        hashCode = prime * hashCode + ((getOccurrenceDays() == null) ? 0 : getOccurrenceDays().hashCode());
        hashCode = prime * hashCode + ((getOccurrenceRelativeToEnd() == null) ? 0 : getOccurrenceRelativeToEnd().hashCode());
        hashCode = prime * hashCode + ((getOccurrenceUnit() == null) ? 0 : getOccurrenceUnit().hashCode());
        return hashCode;
    }

    @Override
    public ScheduledInstanceRecurrenceRequest clone() {
        try {
            return (ScheduledInstanceRecurrenceRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
