/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A weekly schedule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/WeeklySchedule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WeeklySchedule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The weekly schedule's days.
     * </p>
     */
    private java.util.List<String> days;
    /**
     * <p>
     * The weekly schedule's start time.
     * </p>
     */
    private Time startTime;

    /**
     * <p>
     * The weekly schedule's days.
     * </p>
     * 
     * @return The weekly schedule's days.
     * @see Day
     */

    public java.util.List<String> getDays() {
        return days;
    }

    /**
     * <p>
     * The weekly schedule's days.
     * </p>
     * 
     * @param days
     *        The weekly schedule's days.
     * @see Day
     */

    public void setDays(java.util.Collection<String> days) {
        if (days == null) {
            this.days = null;
            return;
        }

        this.days = new java.util.ArrayList<String>(days);
    }

    /**
     * <p>
     * The weekly schedule's days.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDays(java.util.Collection)} or {@link #withDays(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param days
     *        The weekly schedule's days.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Day
     */

    public WeeklySchedule withDays(String... days) {
        if (this.days == null) {
            setDays(new java.util.ArrayList<String>(days.length));
        }
        for (String ele : days) {
            this.days.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The weekly schedule's days.
     * </p>
     * 
     * @param days
     *        The weekly schedule's days.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Day
     */

    public WeeklySchedule withDays(java.util.Collection<String> days) {
        setDays(days);
        return this;
    }

    /**
     * <p>
     * The weekly schedule's days.
     * </p>
     * 
     * @param days
     *        The weekly schedule's days.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Day
     */

    public WeeklySchedule withDays(Day... days) {
        java.util.ArrayList<String> daysCopy = new java.util.ArrayList<String>(days.length);
        for (Day value : days) {
            daysCopy.add(value.toString());
        }
        if (getDays() == null) {
            setDays(daysCopy);
        } else {
            getDays().addAll(daysCopy);
        }
        return this;
    }

    /**
     * <p>
     * The weekly schedule's start time.
     * </p>
     * 
     * @param startTime
     *        The weekly schedule's start time.
     */

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The weekly schedule's start time.
     * </p>
     * 
     * @return The weekly schedule's start time.
     */

    public Time getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The weekly schedule's start time.
     * </p>
     * 
     * @param startTime
     *        The weekly schedule's start time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WeeklySchedule withStartTime(Time startTime) {
        setStartTime(startTime);
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
        if (getDays() != null)
            sb.append("Days: ").append(getDays()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WeeklySchedule == false)
            return false;
        WeeklySchedule other = (WeeklySchedule) obj;
        if (other.getDays() == null ^ this.getDays() == null)
            return false;
        if (other.getDays() != null && other.getDays().equals(this.getDays()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDays() == null) ? 0 : getDays().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return hashCode;
    }

    @Override
    public WeeklySchedule clone() {
        try {
            return (WeeklySchedule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.WeeklyScheduleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
