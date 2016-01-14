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
public class ScheduledInstanceRecurrence implements Serializable, Cloneable {

    /**
     * The frequency (<code>Daily</code>, <code>Weekly</code>, or
     * <code>Monthly</code>).
     */
    private String frequency;

    /**
     * The interval quantity. The interval unit depends on the value of
     * <code>frequency</code>. For example, every 2 weeks or every 2 months.
     */
    private Integer interval;

    /**
     * The days. For a monthly schedule, this is one or more days of the
     * month (1-31). For a weekly schedule, this is one or more days of the
     * week (1-7, where 1 is Sunday).
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Integer> occurrenceDaySet;

    /**
     * Indicates whether the occurrence is relative to the end of the
     * specified week or month.
     */
    private Boolean occurrenceRelativeToEnd;

    /**
     * The unit for <code>occurrenceDaySet</code> (<code>DayOfWeek</code> or
     * <code>DayOfMonth</code>).
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
    public ScheduledInstanceRecurrence withFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * The interval quantity. The interval unit depends on the value of
     * <code>frequency</code>. For example, every 2 weeks or every 2 months.
     *
     * @return The interval quantity. The interval unit depends on the value of
     *         <code>frequency</code>. For example, every 2 weeks or every 2 months.
     */
    public Integer getInterval() {
        return interval;
    }
    
    /**
     * The interval quantity. The interval unit depends on the value of
     * <code>frequency</code>. For example, every 2 weeks or every 2 months.
     *
     * @param interval The interval quantity. The interval unit depends on the value of
     *         <code>frequency</code>. For example, every 2 weeks or every 2 months.
     */
    public void setInterval(Integer interval) {
        this.interval = interval;
    }
    
    /**
     * The interval quantity. The interval unit depends on the value of
     * <code>frequency</code>. For example, every 2 weeks or every 2 months.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param interval The interval quantity. The interval unit depends on the value of
     *         <code>frequency</code>. For example, every 2 weeks or every 2 months.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstanceRecurrence withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * The days. For a monthly schedule, this is one or more days of the
     * month (1-31). For a weekly schedule, this is one or more days of the
     * week (1-7, where 1 is Sunday).
     *
     * @return The days. For a monthly schedule, this is one or more days of the
     *         month (1-31). For a weekly schedule, this is one or more days of the
     *         week (1-7, where 1 is Sunday).
     */
    public java.util.List<Integer> getOccurrenceDaySet() {
        if (occurrenceDaySet == null) {
              occurrenceDaySet = new com.amazonaws.internal.ListWithAutoConstructFlag<Integer>();
              occurrenceDaySet.setAutoConstruct(true);
        }
        return occurrenceDaySet;
    }
    
    /**
     * The days. For a monthly schedule, this is one or more days of the
     * month (1-31). For a weekly schedule, this is one or more days of the
     * week (1-7, where 1 is Sunday).
     *
     * @param occurrenceDaySet The days. For a monthly schedule, this is one or more days of the
     *         month (1-31). For a weekly schedule, this is one or more days of the
     *         week (1-7, where 1 is Sunday).
     */
    public void setOccurrenceDaySet(java.util.Collection<Integer> occurrenceDaySet) {
        if (occurrenceDaySet == null) {
            this.occurrenceDaySet = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Integer> occurrenceDaySetCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Integer>(occurrenceDaySet.size());
        occurrenceDaySetCopy.addAll(occurrenceDaySet);
        this.occurrenceDaySet = occurrenceDaySetCopy;
    }
    
    /**
     * The days. For a monthly schedule, this is one or more days of the
     * month (1-31). For a weekly schedule, this is one or more days of the
     * week (1-7, where 1 is Sunday).
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setOccurrenceDaySet(java.util.Collection)} or {@link
     * #withOccurrenceDaySet(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param occurrenceDaySet The days. For a monthly schedule, this is one or more days of the
     *         month (1-31). For a weekly schedule, this is one or more days of the
     *         week (1-7, where 1 is Sunday).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstanceRecurrence withOccurrenceDaySet(Integer... occurrenceDaySet) {
        if (getOccurrenceDaySet() == null) setOccurrenceDaySet(new java.util.ArrayList<Integer>(occurrenceDaySet.length));
        for (Integer value : occurrenceDaySet) {
            getOccurrenceDaySet().add(value);
        }
        return this;
    }
    
    /**
     * The days. For a monthly schedule, this is one or more days of the
     * month (1-31). For a weekly schedule, this is one or more days of the
     * week (1-7, where 1 is Sunday).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param occurrenceDaySet The days. For a monthly schedule, this is one or more days of the
     *         month (1-31). For a weekly schedule, this is one or more days of the
     *         week (1-7, where 1 is Sunday).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstanceRecurrence withOccurrenceDaySet(java.util.Collection<Integer> occurrenceDaySet) {
        if (occurrenceDaySet == null) {
            this.occurrenceDaySet = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Integer> occurrenceDaySetCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Integer>(occurrenceDaySet.size());
            occurrenceDaySetCopy.addAll(occurrenceDaySet);
            this.occurrenceDaySet = occurrenceDaySetCopy;
        }

        return this;
    }

    /**
     * Indicates whether the occurrence is relative to the end of the
     * specified week or month.
     *
     * @return Indicates whether the occurrence is relative to the end of the
     *         specified week or month.
     */
    public Boolean isOccurrenceRelativeToEnd() {
        return occurrenceRelativeToEnd;
    }
    
    /**
     * Indicates whether the occurrence is relative to the end of the
     * specified week or month.
     *
     * @param occurrenceRelativeToEnd Indicates whether the occurrence is relative to the end of the
     *         specified week or month.
     */
    public void setOccurrenceRelativeToEnd(Boolean occurrenceRelativeToEnd) {
        this.occurrenceRelativeToEnd = occurrenceRelativeToEnd;
    }
    
    /**
     * Indicates whether the occurrence is relative to the end of the
     * specified week or month.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param occurrenceRelativeToEnd Indicates whether the occurrence is relative to the end of the
     *         specified week or month.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstanceRecurrence withOccurrenceRelativeToEnd(Boolean occurrenceRelativeToEnd) {
        this.occurrenceRelativeToEnd = occurrenceRelativeToEnd;
        return this;
    }

    /**
     * Indicates whether the occurrence is relative to the end of the
     * specified week or month.
     *
     * @return Indicates whether the occurrence is relative to the end of the
     *         specified week or month.
     */
    public Boolean getOccurrenceRelativeToEnd() {
        return occurrenceRelativeToEnd;
    }

    /**
     * The unit for <code>occurrenceDaySet</code> (<code>DayOfWeek</code> or
     * <code>DayOfMonth</code>).
     *
     * @return The unit for <code>occurrenceDaySet</code> (<code>DayOfWeek</code> or
     *         <code>DayOfMonth</code>).
     */
    public String getOccurrenceUnit() {
        return occurrenceUnit;
    }
    
    /**
     * The unit for <code>occurrenceDaySet</code> (<code>DayOfWeek</code> or
     * <code>DayOfMonth</code>).
     *
     * @param occurrenceUnit The unit for <code>occurrenceDaySet</code> (<code>DayOfWeek</code> or
     *         <code>DayOfMonth</code>).
     */
    public void setOccurrenceUnit(String occurrenceUnit) {
        this.occurrenceUnit = occurrenceUnit;
    }
    
    /**
     * The unit for <code>occurrenceDaySet</code> (<code>DayOfWeek</code> or
     * <code>DayOfMonth</code>).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param occurrenceUnit The unit for <code>occurrenceDaySet</code> (<code>DayOfWeek</code> or
     *         <code>DayOfMonth</code>).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScheduledInstanceRecurrence withOccurrenceUnit(String occurrenceUnit) {
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
        if (getOccurrenceDaySet() != null) sb.append("OccurrenceDaySet: " + getOccurrenceDaySet() + ",");
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
        hashCode = prime * hashCode + ((getOccurrenceDaySet() == null) ? 0 : getOccurrenceDaySet().hashCode()); 
        hashCode = prime * hashCode + ((isOccurrenceRelativeToEnd() == null) ? 0 : isOccurrenceRelativeToEnd().hashCode()); 
        hashCode = prime * hashCode + ((getOccurrenceUnit() == null) ? 0 : getOccurrenceUnit().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ScheduledInstanceRecurrence == false) return false;
        ScheduledInstanceRecurrence other = (ScheduledInstanceRecurrence)obj;
        
        if (other.getFrequency() == null ^ this.getFrequency() == null) return false;
        if (other.getFrequency() != null && other.getFrequency().equals(this.getFrequency()) == false) return false; 
        if (other.getInterval() == null ^ this.getInterval() == null) return false;
        if (other.getInterval() != null && other.getInterval().equals(this.getInterval()) == false) return false; 
        if (other.getOccurrenceDaySet() == null ^ this.getOccurrenceDaySet() == null) return false;
        if (other.getOccurrenceDaySet() != null && other.getOccurrenceDaySet().equals(this.getOccurrenceDaySet()) == false) return false; 
        if (other.isOccurrenceRelativeToEnd() == null ^ this.isOccurrenceRelativeToEnd() == null) return false;
        if (other.isOccurrenceRelativeToEnd() != null && other.isOccurrenceRelativeToEnd().equals(this.isOccurrenceRelativeToEnd()) == false) return false; 
        if (other.getOccurrenceUnit() == null ^ this.getOccurrenceUnit() == null) return false;
        if (other.getOccurrenceUnit() != null && other.getOccurrenceUnit().equals(this.getOccurrenceUnit()) == false) return false; 
        return true;
    }
    
    @Override
    public ScheduledInstanceRecurrence clone() {
        try {
            return (ScheduledInstanceRecurrence) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    