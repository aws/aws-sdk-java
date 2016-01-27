/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the recurring schedule for a Scheduled Instance.
 * </p>
 */
public class ScheduledInstanceRecurrenceRequest implements Serializable, Cloneable {

    /**
     * The frequency (<code>Daily</code>, <code>Weekly</code>, or
     * <code>Monthly</code>).
     */
    private String frequency;

    /**
     * The interval quantity. The interval unit depends on the value of
     * <code>Frequency</code>. For example, every 2 weeks or every 2 months.
     */
    private Integer interval;

    /**
     * The days. For a monthly schedule, this is one or more days of the
     * month (1-31). For a weekly schedule, this is one or more days of the
     * week (1-7, where 1 is Sunday). You can't specify this value with a
     * daily schedule. If the occurrence is relative to the end of the month,
     * you can specify only a single day.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Integer> occurrenceDays;

    /**
     * Indicates whether the occurrence is relative to the end of the
     * specified week or month. You can't specify this value with a daily
     * schedule.
     */
    private Boolean occurrenceRelativeToEnd;

    /**
     * The unit for <code>OccurrenceDays</code> (<code>DayOfWeek</code> or
     * <code>DayOfMonth</code>). This value is required for a monthly
     * schedule. You can't specify <code>DayOfWeek</code> with a weekly
     * schedule. You can't specify this value with a daily schedule.
     */
    private String occurrenceUnit;

    /**
     * The frequency (<code>Daily</code>, <code>Weekly</code>, or
     * <code>Monthly</code>).
     *
     * @return The frequency (<code>Daily</code>, <code>Weekly</code>, or
     *         <code>Monthly</code>).
     */
    public String getFrequency() {
        return frequency;
    }
    
    /**
     * The frequency (<code>Daily</code>, <code>Weekly</code>, or
     * <code>Monthly</code>).
     *
     * @param frequency The frequency (<code>Daily</code>, <code>Weekly</code>, or
     *         <code>Monthly</code>).
     */
    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }
    
    /**
     * The frequency (<code>Daily</code>, <code>Weekly</code>, or
     * <code>Monthly</code>).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param frequency The frequency (<code>Daily</code>, <code>Weekly</code>, or
     *         <code>Monthly</code>).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstanceRecurrenceRequest withFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * The interval quantity. The interval unit depends on the value of
     * <code>Frequency</code>. For example, every 2 weeks or every 2 months.
     *
     * @return The interval quantity. The interval unit depends on the value of
     *         <code>Frequency</code>. For example, every 2 weeks or every 2 months.
     */
    public Integer getInterval() {
        return interval;
    }
    
    /**
     * The interval quantity. The interval unit depends on the value of
     * <code>Frequency</code>. For example, every 2 weeks or every 2 months.
     *
     * @param interval The interval quantity. The interval unit depends on the value of
     *         <code>Frequency</code>. For example, every 2 weeks or every 2 months.
     */
    public void setInterval(Integer interval) {
        this.interval = interval;
    }
    
    /**
     * The interval quantity. The interval unit depends on the value of
     * <code>Frequency</code>. For example, every 2 weeks or every 2 months.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param interval The interval quantity. The interval unit depends on the value of
     *         <code>Frequency</code>. For example, every 2 weeks or every 2 months.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstanceRecurrenceRequest withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * The days. For a monthly schedule, this is one or more days of the
     * month (1-31). For a weekly schedule, this is one or more days of the
     * week (1-7, where 1 is Sunday). You can't specify this value with a
     * daily schedule. If the occurrence is relative to the end of the month,
     * you can specify only a single day.
     *
     * @return The days. For a monthly schedule, this is one or more days of the
     *         month (1-31). For a weekly schedule, this is one or more days of the
     *         week (1-7, where 1 is Sunday). You can't specify this value with a
     *         daily schedule. If the occurrence is relative to the end of the month,
     *         you can specify only a single day.
     */
    public java.util.List<Integer> getOccurrenceDays() {
        if (occurrenceDays == null) {
              occurrenceDays = new com.amazonaws.internal.ListWithAutoConstructFlag<Integer>();
              occurrenceDays.setAutoConstruct(true);
        }
        return occurrenceDays;
    }
    
    /**
     * The days. For a monthly schedule, this is one or more days of the
     * month (1-31). For a weekly schedule, this is one or more days of the
     * week (1-7, where 1 is Sunday). You can't specify this value with a
     * daily schedule. If the occurrence is relative to the end of the month,
     * you can specify only a single day.
     *
     * @param occurrenceDays The days. For a monthly schedule, this is one or more days of the
     *         month (1-31). For a weekly schedule, this is one or more days of the
     *         week (1-7, where 1 is Sunday). You can't specify this value with a
     *         daily schedule. If the occurrence is relative to the end of the month,
     *         you can specify only a single day.
     */
    public void setOccurrenceDays(java.util.Collection<Integer> occurrenceDays) {
        if (occurrenceDays == null) {
            this.occurrenceDays = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Integer> occurrenceDaysCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Integer>(occurrenceDays.size());
        occurrenceDaysCopy.addAll(occurrenceDays);
        this.occurrenceDays = occurrenceDaysCopy;
    }
    
    /**
     * The days. For a monthly schedule, this is one or more days of the
     * month (1-31). For a weekly schedule, this is one or more days of the
     * week (1-7, where 1 is Sunday). You can't specify this value with a
     * daily schedule. If the occurrence is relative to the end of the month,
     * you can specify only a single day.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setOccurrenceDays(java.util.Collection)} or {@link
     * #withOccurrenceDays(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param occurrenceDays The days. For a monthly schedule, this is one or more days of the
     *         month (1-31). For a weekly schedule, this is one or more days of the
     *         week (1-7, where 1 is Sunday). You can't specify this value with a
     *         daily schedule. If the occurrence is relative to the end of the month,
     *         you can specify only a single day.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstanceRecurrenceRequest withOccurrenceDays(Integer... occurrenceDays) {
        if (getOccurrenceDays() == null) setOccurrenceDays(new java.util.ArrayList<Integer>(occurrenceDays.length));
        for (Integer value : occurrenceDays) {
            getOccurrenceDays().add(value);
        }
        return this;
    }
    
    /**
     * The days. For a monthly schedule, this is one or more days of the
     * month (1-31). For a weekly schedule, this is one or more days of the
     * week (1-7, where 1 is Sunday). You can't specify this value with a
     * daily schedule. If the occurrence is relative to the end of the month,
     * you can specify only a single day.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param occurrenceDays The days. For a monthly schedule, this is one or more days of the
     *         month (1-31). For a weekly schedule, this is one or more days of the
     *         week (1-7, where 1 is Sunday). You can't specify this value with a
     *         daily schedule. If the occurrence is relative to the end of the month,
     *         you can specify only a single day.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstanceRecurrenceRequest withOccurrenceDays(java.util.Collection<Integer> occurrenceDays) {
        if (occurrenceDays == null) {
            this.occurrenceDays = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Integer> occurrenceDaysCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Integer>(occurrenceDays.size());
            occurrenceDaysCopy.addAll(occurrenceDays);
            this.occurrenceDays = occurrenceDaysCopy;
        }

        return this;
    }

    /**
     * Indicates whether the occurrence is relative to the end of the
     * specified week or month. You can't specify this value with a daily
     * schedule.
     *
     * @return Indicates whether the occurrence is relative to the end of the
     *         specified week or month. You can't specify this value with a daily
     *         schedule.
     */
    public Boolean isOccurrenceRelativeToEnd() {
        return occurrenceRelativeToEnd;
    }
    
    /**
     * Indicates whether the occurrence is relative to the end of the
     * specified week or month. You can't specify this value with a daily
     * schedule.
     *
     * @param occurrenceRelativeToEnd Indicates whether the occurrence is relative to the end of the
     *         specified week or month. You can't specify this value with a daily
     *         schedule.
     */
    public void setOccurrenceRelativeToEnd(Boolean occurrenceRelativeToEnd) {
        this.occurrenceRelativeToEnd = occurrenceRelativeToEnd;
    }
    
    /**
     * Indicates whether the occurrence is relative to the end of the
     * specified week or month. You can't specify this value with a daily
     * schedule.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param occurrenceRelativeToEnd Indicates whether the occurrence is relative to the end of the
     *         specified week or month. You can't specify this value with a daily
     *         schedule.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstanceRecurrenceRequest withOccurrenceRelativeToEnd(Boolean occurrenceRelativeToEnd) {
        this.occurrenceRelativeToEnd = occurrenceRelativeToEnd;
        return this;
    }

    /**
     * Indicates whether the occurrence is relative to the end of the
     * specified week or month. You can't specify this value with a daily
     * schedule.
     *
     * @return Indicates whether the occurrence is relative to the end of the
     *         specified week or month. You can't specify this value with a daily
     *         schedule.
     */
    public Boolean getOccurrenceRelativeToEnd() {
        return occurrenceRelativeToEnd;
    }

    /**
     * The unit for <code>OccurrenceDays</code> (<code>DayOfWeek</code> or
     * <code>DayOfMonth</code>). This value is required for a monthly
     * schedule. You can't specify <code>DayOfWeek</code> with a weekly
     * schedule. You can't specify this value with a daily schedule.
     *
     * @return The unit for <code>OccurrenceDays</code> (<code>DayOfWeek</code> or
     *         <code>DayOfMonth</code>). This value is required for a monthly
     *         schedule. You can't specify <code>DayOfWeek</code> with a weekly
     *         schedule. You can't specify this value with a daily schedule.
     */
    public String getOccurrenceUnit() {
        return occurrenceUnit;
    }
    
    /**
     * The unit for <code>OccurrenceDays</code> (<code>DayOfWeek</code> or
     * <code>DayOfMonth</code>). This value is required for a monthly
     * schedule. You can't specify <code>DayOfWeek</code> with a weekly
     * schedule. You can't specify this value with a daily schedule.
     *
     * @param occurrenceUnit The unit for <code>OccurrenceDays</code> (<code>DayOfWeek</code> or
     *         <code>DayOfMonth</code>). This value is required for a monthly
     *         schedule. You can't specify <code>DayOfWeek</code> with a weekly
     *         schedule. You can't specify this value with a daily schedule.
     */
    public void setOccurrenceUnit(String occurrenceUnit) {
        this.occurrenceUnit = occurrenceUnit;
    }
    
    /**
     * The unit for <code>OccurrenceDays</code> (<code>DayOfWeek</code> or
     * <code>DayOfMonth</code>). This value is required for a monthly
     * schedule. You can't specify <code>DayOfWeek</code> with a weekly
     * schedule. You can't specify this value with a daily schedule.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param occurrenceUnit The unit for <code>OccurrenceDays</code> (<code>DayOfWeek</code> or
     *         <code>DayOfMonth</code>). This value is required for a monthly
     *         schedule. You can't specify <code>DayOfWeek</code> with a weekly
     *         schedule. You can't specify this value with a daily schedule.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstanceRecurrenceRequest withOccurrenceUnit(String occurrenceUnit) {
        this.occurrenceUnit = occurrenceUnit;
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
        if (getFrequency() != null) sb.append("Frequency: " + getFrequency() + ",");
        if (getInterval() != null) sb.append("Interval: " + getInterval() + ",");
        if (getOccurrenceDays() != null) sb.append("OccurrenceDays: " + getOccurrenceDays() + ",");
        if (isOccurrenceRelativeToEnd() != null) sb.append("OccurrenceRelativeToEnd: " + isOccurrenceRelativeToEnd() + ",");
        if (getOccurrenceUnit() != null) sb.append("OccurrenceUnit: " + getOccurrenceUnit() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFrequency() == null) ? 0 : getFrequency().hashCode()); 
        hashCode = prime * hashCode + ((getInterval() == null) ? 0 : getInterval().hashCode()); 
        hashCode = prime * hashCode + ((getOccurrenceDays() == null) ? 0 : getOccurrenceDays().hashCode()); 
        hashCode = prime * hashCode + ((isOccurrenceRelativeToEnd() == null) ? 0 : isOccurrenceRelativeToEnd().hashCode()); 
        hashCode = prime * hashCode + ((getOccurrenceUnit() == null) ? 0 : getOccurrenceUnit().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ScheduledInstanceRecurrenceRequest == false) return false;
        ScheduledInstanceRecurrenceRequest other = (ScheduledInstanceRecurrenceRequest)obj;
        
        if (other.getFrequency() == null ^ this.getFrequency() == null) return false;
        if (other.getFrequency() != null && other.getFrequency().equals(this.getFrequency()) == false) return false; 
        if (other.getInterval() == null ^ this.getInterval() == null) return false;
        if (other.getInterval() != null && other.getInterval().equals(this.getInterval()) == false) return false; 
        if (other.getOccurrenceDays() == null ^ this.getOccurrenceDays() == null) return false;
        if (other.getOccurrenceDays() != null && other.getOccurrenceDays().equals(this.getOccurrenceDays()) == false) return false; 
        if (other.isOccurrenceRelativeToEnd() == null ^ this.isOccurrenceRelativeToEnd() == null) return false;
        if (other.isOccurrenceRelativeToEnd() != null && other.isOccurrenceRelativeToEnd().equals(this.isOccurrenceRelativeToEnd()) == false) return false; 
        if (other.getOccurrenceUnit() == null ^ this.getOccurrenceUnit() == null) return false;
        if (other.getOccurrenceUnit() != null && other.getOccurrenceUnit().equals(this.getOccurrenceUnit()) == false) return false; 
        return true;
    }
    
    @Override
    public ScheduledInstanceRecurrenceRequest clone() {
        try {
            return (ScheduledInstanceRecurrenceRequest) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    