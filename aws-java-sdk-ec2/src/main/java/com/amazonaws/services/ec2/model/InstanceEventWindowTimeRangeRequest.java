/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The start day and time and the end day and time of the time range, in UTC.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/InstanceEventWindowTimeRangeRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceEventWindowTimeRangeRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The day on which the time range begins.
     * </p>
     */
    private String startWeekDay;
    /**
     * <p>
     * The hour when the time range begins.
     * </p>
     */
    private Integer startHour;
    /**
     * <p>
     * The day on which the time range ends.
     * </p>
     */
    private String endWeekDay;
    /**
     * <p>
     * The hour when the time range ends.
     * </p>
     */
    private Integer endHour;

    /**
     * <p>
     * The day on which the time range begins.
     * </p>
     * 
     * @param startWeekDay
     *        The day on which the time range begins.
     * @see WeekDay
     */

    public void setStartWeekDay(String startWeekDay) {
        this.startWeekDay = startWeekDay;
    }

    /**
     * <p>
     * The day on which the time range begins.
     * </p>
     * 
     * @return The day on which the time range begins.
     * @see WeekDay
     */

    public String getStartWeekDay() {
        return this.startWeekDay;
    }

    /**
     * <p>
     * The day on which the time range begins.
     * </p>
     * 
     * @param startWeekDay
     *        The day on which the time range begins.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WeekDay
     */

    public InstanceEventWindowTimeRangeRequest withStartWeekDay(String startWeekDay) {
        setStartWeekDay(startWeekDay);
        return this;
    }

    /**
     * <p>
     * The day on which the time range begins.
     * </p>
     * 
     * @param startWeekDay
     *        The day on which the time range begins.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WeekDay
     */

    public InstanceEventWindowTimeRangeRequest withStartWeekDay(WeekDay startWeekDay) {
        this.startWeekDay = startWeekDay.toString();
        return this;
    }

    /**
     * <p>
     * The hour when the time range begins.
     * </p>
     * 
     * @param startHour
     *        The hour when the time range begins.
     */

    public void setStartHour(Integer startHour) {
        this.startHour = startHour;
    }

    /**
     * <p>
     * The hour when the time range begins.
     * </p>
     * 
     * @return The hour when the time range begins.
     */

    public Integer getStartHour() {
        return this.startHour;
    }

    /**
     * <p>
     * The hour when the time range begins.
     * </p>
     * 
     * @param startHour
     *        The hour when the time range begins.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceEventWindowTimeRangeRequest withStartHour(Integer startHour) {
        setStartHour(startHour);
        return this;
    }

    /**
     * <p>
     * The day on which the time range ends.
     * </p>
     * 
     * @param endWeekDay
     *        The day on which the time range ends.
     * @see WeekDay
     */

    public void setEndWeekDay(String endWeekDay) {
        this.endWeekDay = endWeekDay;
    }

    /**
     * <p>
     * The day on which the time range ends.
     * </p>
     * 
     * @return The day on which the time range ends.
     * @see WeekDay
     */

    public String getEndWeekDay() {
        return this.endWeekDay;
    }

    /**
     * <p>
     * The day on which the time range ends.
     * </p>
     * 
     * @param endWeekDay
     *        The day on which the time range ends.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WeekDay
     */

    public InstanceEventWindowTimeRangeRequest withEndWeekDay(String endWeekDay) {
        setEndWeekDay(endWeekDay);
        return this;
    }

    /**
     * <p>
     * The day on which the time range ends.
     * </p>
     * 
     * @param endWeekDay
     *        The day on which the time range ends.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WeekDay
     */

    public InstanceEventWindowTimeRangeRequest withEndWeekDay(WeekDay endWeekDay) {
        this.endWeekDay = endWeekDay.toString();
        return this;
    }

    /**
     * <p>
     * The hour when the time range ends.
     * </p>
     * 
     * @param endHour
     *        The hour when the time range ends.
     */

    public void setEndHour(Integer endHour) {
        this.endHour = endHour;
    }

    /**
     * <p>
     * The hour when the time range ends.
     * </p>
     * 
     * @return The hour when the time range ends.
     */

    public Integer getEndHour() {
        return this.endHour;
    }

    /**
     * <p>
     * The hour when the time range ends.
     * </p>
     * 
     * @param endHour
     *        The hour when the time range ends.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceEventWindowTimeRangeRequest withEndHour(Integer endHour) {
        setEndHour(endHour);
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
        if (getStartWeekDay() != null)
            sb.append("StartWeekDay: ").append(getStartWeekDay()).append(",");
        if (getStartHour() != null)
            sb.append("StartHour: ").append(getStartHour()).append(",");
        if (getEndWeekDay() != null)
            sb.append("EndWeekDay: ").append(getEndWeekDay()).append(",");
        if (getEndHour() != null)
            sb.append("EndHour: ").append(getEndHour());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceEventWindowTimeRangeRequest == false)
            return false;
        InstanceEventWindowTimeRangeRequest other = (InstanceEventWindowTimeRangeRequest) obj;
        if (other.getStartWeekDay() == null ^ this.getStartWeekDay() == null)
            return false;
        if (other.getStartWeekDay() != null && other.getStartWeekDay().equals(this.getStartWeekDay()) == false)
            return false;
        if (other.getStartHour() == null ^ this.getStartHour() == null)
            return false;
        if (other.getStartHour() != null && other.getStartHour().equals(this.getStartHour()) == false)
            return false;
        if (other.getEndWeekDay() == null ^ this.getEndWeekDay() == null)
            return false;
        if (other.getEndWeekDay() != null && other.getEndWeekDay().equals(this.getEndWeekDay()) == false)
            return false;
        if (other.getEndHour() == null ^ this.getEndHour() == null)
            return false;
        if (other.getEndHour() != null && other.getEndHour().equals(this.getEndHour()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartWeekDay() == null) ? 0 : getStartWeekDay().hashCode());
        hashCode = prime * hashCode + ((getStartHour() == null) ? 0 : getStartHour().hashCode());
        hashCode = prime * hashCode + ((getEndWeekDay() == null) ? 0 : getEndWeekDay().hashCode());
        hashCode = prime * hashCode + ((getEndHour() == null) ? 0 : getEndHour().hashCode());
        return hashCode;
    }

    @Override
    public InstanceEventWindowTimeRangeRequest clone() {
        try {
            return (InstanceEventWindowTimeRangeRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
