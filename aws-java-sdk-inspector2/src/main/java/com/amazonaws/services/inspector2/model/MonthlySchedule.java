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
 * A monthly schedule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/MonthlySchedule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MonthlySchedule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The monthly schedule's day.
     * </p>
     */
    private String day;
    /**
     * <p>
     * The monthly schedule's start time.
     * </p>
     */
    private Time startTime;

    /**
     * <p>
     * The monthly schedule's day.
     * </p>
     * 
     * @param day
     *        The monthly schedule's day.
     * @see Day
     */

    public void setDay(String day) {
        this.day = day;
    }

    /**
     * <p>
     * The monthly schedule's day.
     * </p>
     * 
     * @return The monthly schedule's day.
     * @see Day
     */

    public String getDay() {
        return this.day;
    }

    /**
     * <p>
     * The monthly schedule's day.
     * </p>
     * 
     * @param day
     *        The monthly schedule's day.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Day
     */

    public MonthlySchedule withDay(String day) {
        setDay(day);
        return this;
    }

    /**
     * <p>
     * The monthly schedule's day.
     * </p>
     * 
     * @param day
     *        The monthly schedule's day.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Day
     */

    public MonthlySchedule withDay(Day day) {
        this.day = day.toString();
        return this;
    }

    /**
     * <p>
     * The monthly schedule's start time.
     * </p>
     * 
     * @param startTime
     *        The monthly schedule's start time.
     */

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The monthly schedule's start time.
     * </p>
     * 
     * @return The monthly schedule's start time.
     */

    public Time getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The monthly schedule's start time.
     * </p>
     * 
     * @param startTime
     *        The monthly schedule's start time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonthlySchedule withStartTime(Time startTime) {
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
        if (getDay() != null)
            sb.append("Day: ").append(getDay()).append(",");
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

        if (obj instanceof MonthlySchedule == false)
            return false;
        MonthlySchedule other = (MonthlySchedule) obj;
        if (other.getDay() == null ^ this.getDay() == null)
            return false;
        if (other.getDay() != null && other.getDay().equals(this.getDay()) == false)
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

        hashCode = prime * hashCode + ((getDay() == null) ? 0 : getDay().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return hashCode;
    }

    @Override
    public MonthlySchedule clone() {
        try {
            return (MonthlySchedule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.MonthlyScheduleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
