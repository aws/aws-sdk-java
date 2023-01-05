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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The time boundary Forecast uses to align and aggregate your data to match your forecast frequency. Provide the unit
 * of time and the time boundary as a key value pair. If you don't provide a time boundary, Forecast uses a set of <a
 * href="https://docs.aws.amazon.com/forecast/latest/dg/data-aggregation.html#default-time-boundaries">Default Time
 * Boundaries</a>.
 * </p>
 * <p>
 * For more information about aggregation, see <a
 * href="https://docs.aws.amazon.com/forecast/latest/dg/data-aggregation.html">Data Aggregation for Different Forecast
 * Frequencies</a>. For more information setting a custom time boundary, see <a
 * href="https://docs.aws.amazon.com/forecast/latest/dg/data-aggregation.html#specifying-time-boundary">Specifying a
 * Time Boundary</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/TimeAlignmentBoundary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimeAlignmentBoundary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The month to use for time alignment during aggregation. The month must be in uppercase.
     * </p>
     */
    private String month;
    /**
     * <p>
     * The day of the month to use for time alignment during aggregation.
     * </p>
     */
    private Integer dayOfMonth;
    /**
     * <p>
     * The day of week to use for time alignment during aggregation. The day must be in uppercase.
     * </p>
     */
    private String dayOfWeek;
    /**
     * <p>
     * The hour of day to use for time alignment during aggregation.
     * </p>
     */
    private Integer hour;

    /**
     * <p>
     * The month to use for time alignment during aggregation. The month must be in uppercase.
     * </p>
     * 
     * @param month
     *        The month to use for time alignment during aggregation. The month must be in uppercase.
     * @see Month
     */

    public void setMonth(String month) {
        this.month = month;
    }

    /**
     * <p>
     * The month to use for time alignment during aggregation. The month must be in uppercase.
     * </p>
     * 
     * @return The month to use for time alignment during aggregation. The month must be in uppercase.
     * @see Month
     */

    public String getMonth() {
        return this.month;
    }

    /**
     * <p>
     * The month to use for time alignment during aggregation. The month must be in uppercase.
     * </p>
     * 
     * @param month
     *        The month to use for time alignment during aggregation. The month must be in uppercase.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Month
     */

    public TimeAlignmentBoundary withMonth(String month) {
        setMonth(month);
        return this;
    }

    /**
     * <p>
     * The month to use for time alignment during aggregation. The month must be in uppercase.
     * </p>
     * 
     * @param month
     *        The month to use for time alignment during aggregation. The month must be in uppercase.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Month
     */

    public TimeAlignmentBoundary withMonth(Month month) {
        this.month = month.toString();
        return this;
    }

    /**
     * <p>
     * The day of the month to use for time alignment during aggregation.
     * </p>
     * 
     * @param dayOfMonth
     *        The day of the month to use for time alignment during aggregation.
     */

    public void setDayOfMonth(Integer dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    /**
     * <p>
     * The day of the month to use for time alignment during aggregation.
     * </p>
     * 
     * @return The day of the month to use for time alignment during aggregation.
     */

    public Integer getDayOfMonth() {
        return this.dayOfMonth;
    }

    /**
     * <p>
     * The day of the month to use for time alignment during aggregation.
     * </p>
     * 
     * @param dayOfMonth
     *        The day of the month to use for time alignment during aggregation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeAlignmentBoundary withDayOfMonth(Integer dayOfMonth) {
        setDayOfMonth(dayOfMonth);
        return this;
    }

    /**
     * <p>
     * The day of week to use for time alignment during aggregation. The day must be in uppercase.
     * </p>
     * 
     * @param dayOfWeek
     *        The day of week to use for time alignment during aggregation. The day must be in uppercase.
     * @see DayOfWeek
     */

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    /**
     * <p>
     * The day of week to use for time alignment during aggregation. The day must be in uppercase.
     * </p>
     * 
     * @return The day of week to use for time alignment during aggregation. The day must be in uppercase.
     * @see DayOfWeek
     */

    public String getDayOfWeek() {
        return this.dayOfWeek;
    }

    /**
     * <p>
     * The day of week to use for time alignment during aggregation. The day must be in uppercase.
     * </p>
     * 
     * @param dayOfWeek
     *        The day of week to use for time alignment during aggregation. The day must be in uppercase.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DayOfWeek
     */

    public TimeAlignmentBoundary withDayOfWeek(String dayOfWeek) {
        setDayOfWeek(dayOfWeek);
        return this;
    }

    /**
     * <p>
     * The day of week to use for time alignment during aggregation. The day must be in uppercase.
     * </p>
     * 
     * @param dayOfWeek
     *        The day of week to use for time alignment during aggregation. The day must be in uppercase.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DayOfWeek
     */

    public TimeAlignmentBoundary withDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek.toString();
        return this;
    }

    /**
     * <p>
     * The hour of day to use for time alignment during aggregation.
     * </p>
     * 
     * @param hour
     *        The hour of day to use for time alignment during aggregation.
     */

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    /**
     * <p>
     * The hour of day to use for time alignment during aggregation.
     * </p>
     * 
     * @return The hour of day to use for time alignment during aggregation.
     */

    public Integer getHour() {
        return this.hour;
    }

    /**
     * <p>
     * The hour of day to use for time alignment during aggregation.
     * </p>
     * 
     * @param hour
     *        The hour of day to use for time alignment during aggregation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeAlignmentBoundary withHour(Integer hour) {
        setHour(hour);
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
        if (getMonth() != null)
            sb.append("Month: ").append(getMonth()).append(",");
        if (getDayOfMonth() != null)
            sb.append("DayOfMonth: ").append(getDayOfMonth()).append(",");
        if (getDayOfWeek() != null)
            sb.append("DayOfWeek: ").append(getDayOfWeek()).append(",");
        if (getHour() != null)
            sb.append("Hour: ").append(getHour());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimeAlignmentBoundary == false)
            return false;
        TimeAlignmentBoundary other = (TimeAlignmentBoundary) obj;
        if (other.getMonth() == null ^ this.getMonth() == null)
            return false;
        if (other.getMonth() != null && other.getMonth().equals(this.getMonth()) == false)
            return false;
        if (other.getDayOfMonth() == null ^ this.getDayOfMonth() == null)
            return false;
        if (other.getDayOfMonth() != null && other.getDayOfMonth().equals(this.getDayOfMonth()) == false)
            return false;
        if (other.getDayOfWeek() == null ^ this.getDayOfWeek() == null)
            return false;
        if (other.getDayOfWeek() != null && other.getDayOfWeek().equals(this.getDayOfWeek()) == false)
            return false;
        if (other.getHour() == null ^ this.getHour() == null)
            return false;
        if (other.getHour() != null && other.getHour().equals(this.getHour()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMonth() == null) ? 0 : getMonth().hashCode());
        hashCode = prime * hashCode + ((getDayOfMonth() == null) ? 0 : getDayOfMonth().hashCode());
        hashCode = prime * hashCode + ((getDayOfWeek() == null) ? 0 : getDayOfWeek().hashCode());
        hashCode = prime * hashCode + ((getHour() == null) ? 0 : getHour().hashCode());
        return hashCode;
    }

    @Override
    public TimeAlignmentBoundary clone() {
        try {
            return (TimeAlignmentBoundary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.TimeAlignmentBoundaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
