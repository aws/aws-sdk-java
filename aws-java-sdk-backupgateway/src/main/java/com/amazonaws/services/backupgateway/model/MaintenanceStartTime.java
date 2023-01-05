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
package com.amazonaws.services.backupgateway.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This is your gateway's weekly maintenance start time including the day and time of the week. Note that values are in
 * terms of the gateway's time zone. Can be weekly or monthly.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/MaintenanceStartTime"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MaintenanceStartTime implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The day of the month component of the maintenance start time represented as an ordinal number from 1 to 28, where
     * 1 represents the first day of the month and 28 represents the last day of the month.
     * </p>
     */
    private Integer dayOfMonth;
    /**
     * <p>
     * An ordinal number between 0 and 6 that represents the day of the week, where 0 represents Sunday and 6 represents
     * Saturday. The day of week is in the time zone of the gateway.
     * </p>
     */
    private Integer dayOfWeek;
    /**
     * <p>
     * The hour component of the maintenance start time represented as <i>hh</i>, where <i>hh</i> is the hour (0 to 23).
     * The hour of the day is in the time zone of the gateway.
     * </p>
     */
    private Integer hourOfDay;
    /**
     * <p>
     * The minute component of the maintenance start time represented as <i>mm</i>, where <i>mm</i> is the minute (0 to
     * 59). The minute of the hour is in the time zone of the gateway.
     * </p>
     */
    private Integer minuteOfHour;

    /**
     * <p>
     * The day of the month component of the maintenance start time represented as an ordinal number from 1 to 28, where
     * 1 represents the first day of the month and 28 represents the last day of the month.
     * </p>
     * 
     * @param dayOfMonth
     *        The day of the month component of the maintenance start time represented as an ordinal number from 1 to
     *        28, where 1 represents the first day of the month and 28 represents the last day of the month.
     */

    public void setDayOfMonth(Integer dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    /**
     * <p>
     * The day of the month component of the maintenance start time represented as an ordinal number from 1 to 28, where
     * 1 represents the first day of the month and 28 represents the last day of the month.
     * </p>
     * 
     * @return The day of the month component of the maintenance start time represented as an ordinal number from 1 to
     *         28, where 1 represents the first day of the month and 28 represents the last day of the month.
     */

    public Integer getDayOfMonth() {
        return this.dayOfMonth;
    }

    /**
     * <p>
     * The day of the month component of the maintenance start time represented as an ordinal number from 1 to 28, where
     * 1 represents the first day of the month and 28 represents the last day of the month.
     * </p>
     * 
     * @param dayOfMonth
     *        The day of the month component of the maintenance start time represented as an ordinal number from 1 to
     *        28, where 1 represents the first day of the month and 28 represents the last day of the month.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceStartTime withDayOfMonth(Integer dayOfMonth) {
        setDayOfMonth(dayOfMonth);
        return this;
    }

    /**
     * <p>
     * An ordinal number between 0 and 6 that represents the day of the week, where 0 represents Sunday and 6 represents
     * Saturday. The day of week is in the time zone of the gateway.
     * </p>
     * 
     * @param dayOfWeek
     *        An ordinal number between 0 and 6 that represents the day of the week, where 0 represents Sunday and 6
     *        represents Saturday. The day of week is in the time zone of the gateway.
     */

    public void setDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    /**
     * <p>
     * An ordinal number between 0 and 6 that represents the day of the week, where 0 represents Sunday and 6 represents
     * Saturday. The day of week is in the time zone of the gateway.
     * </p>
     * 
     * @return An ordinal number between 0 and 6 that represents the day of the week, where 0 represents Sunday and 6
     *         represents Saturday. The day of week is in the time zone of the gateway.
     */

    public Integer getDayOfWeek() {
        return this.dayOfWeek;
    }

    /**
     * <p>
     * An ordinal number between 0 and 6 that represents the day of the week, where 0 represents Sunday and 6 represents
     * Saturday. The day of week is in the time zone of the gateway.
     * </p>
     * 
     * @param dayOfWeek
     *        An ordinal number between 0 and 6 that represents the day of the week, where 0 represents Sunday and 6
     *        represents Saturday. The day of week is in the time zone of the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceStartTime withDayOfWeek(Integer dayOfWeek) {
        setDayOfWeek(dayOfWeek);
        return this;
    }

    /**
     * <p>
     * The hour component of the maintenance start time represented as <i>hh</i>, where <i>hh</i> is the hour (0 to 23).
     * The hour of the day is in the time zone of the gateway.
     * </p>
     * 
     * @param hourOfDay
     *        The hour component of the maintenance start time represented as <i>hh</i>, where <i>hh</i> is the hour (0
     *        to 23). The hour of the day is in the time zone of the gateway.
     */

    public void setHourOfDay(Integer hourOfDay) {
        this.hourOfDay = hourOfDay;
    }

    /**
     * <p>
     * The hour component of the maintenance start time represented as <i>hh</i>, where <i>hh</i> is the hour (0 to 23).
     * The hour of the day is in the time zone of the gateway.
     * </p>
     * 
     * @return The hour component of the maintenance start time represented as <i>hh</i>, where <i>hh</i> is the hour (0
     *         to 23). The hour of the day is in the time zone of the gateway.
     */

    public Integer getHourOfDay() {
        return this.hourOfDay;
    }

    /**
     * <p>
     * The hour component of the maintenance start time represented as <i>hh</i>, where <i>hh</i> is the hour (0 to 23).
     * The hour of the day is in the time zone of the gateway.
     * </p>
     * 
     * @param hourOfDay
     *        The hour component of the maintenance start time represented as <i>hh</i>, where <i>hh</i> is the hour (0
     *        to 23). The hour of the day is in the time zone of the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceStartTime withHourOfDay(Integer hourOfDay) {
        setHourOfDay(hourOfDay);
        return this;
    }

    /**
     * <p>
     * The minute component of the maintenance start time represented as <i>mm</i>, where <i>mm</i> is the minute (0 to
     * 59). The minute of the hour is in the time zone of the gateway.
     * </p>
     * 
     * @param minuteOfHour
     *        The minute component of the maintenance start time represented as <i>mm</i>, where <i>mm</i> is the minute
     *        (0 to 59). The minute of the hour is in the time zone of the gateway.
     */

    public void setMinuteOfHour(Integer minuteOfHour) {
        this.minuteOfHour = minuteOfHour;
    }

    /**
     * <p>
     * The minute component of the maintenance start time represented as <i>mm</i>, where <i>mm</i> is the minute (0 to
     * 59). The minute of the hour is in the time zone of the gateway.
     * </p>
     * 
     * @return The minute component of the maintenance start time represented as <i>mm</i>, where <i>mm</i> is the
     *         minute (0 to 59). The minute of the hour is in the time zone of the gateway.
     */

    public Integer getMinuteOfHour() {
        return this.minuteOfHour;
    }

    /**
     * <p>
     * The minute component of the maintenance start time represented as <i>mm</i>, where <i>mm</i> is the minute (0 to
     * 59). The minute of the hour is in the time zone of the gateway.
     * </p>
     * 
     * @param minuteOfHour
     *        The minute component of the maintenance start time represented as <i>mm</i>, where <i>mm</i> is the minute
     *        (0 to 59). The minute of the hour is in the time zone of the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceStartTime withMinuteOfHour(Integer minuteOfHour) {
        setMinuteOfHour(minuteOfHour);
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
        if (getDayOfMonth() != null)
            sb.append("DayOfMonth: ").append(getDayOfMonth()).append(",");
        if (getDayOfWeek() != null)
            sb.append("DayOfWeek: ").append(getDayOfWeek()).append(",");
        if (getHourOfDay() != null)
            sb.append("HourOfDay: ").append(getHourOfDay()).append(",");
        if (getMinuteOfHour() != null)
            sb.append("MinuteOfHour: ").append(getMinuteOfHour());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MaintenanceStartTime == false)
            return false;
        MaintenanceStartTime other = (MaintenanceStartTime) obj;
        if (other.getDayOfMonth() == null ^ this.getDayOfMonth() == null)
            return false;
        if (other.getDayOfMonth() != null && other.getDayOfMonth().equals(this.getDayOfMonth()) == false)
            return false;
        if (other.getDayOfWeek() == null ^ this.getDayOfWeek() == null)
            return false;
        if (other.getDayOfWeek() != null && other.getDayOfWeek().equals(this.getDayOfWeek()) == false)
            return false;
        if (other.getHourOfDay() == null ^ this.getHourOfDay() == null)
            return false;
        if (other.getHourOfDay() != null && other.getHourOfDay().equals(this.getHourOfDay()) == false)
            return false;
        if (other.getMinuteOfHour() == null ^ this.getMinuteOfHour() == null)
            return false;
        if (other.getMinuteOfHour() != null && other.getMinuteOfHour().equals(this.getMinuteOfHour()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDayOfMonth() == null) ? 0 : getDayOfMonth().hashCode());
        hashCode = prime * hashCode + ((getDayOfWeek() == null) ? 0 : getDayOfWeek().hashCode());
        hashCode = prime * hashCode + ((getHourOfDay() == null) ? 0 : getHourOfDay().hashCode());
        hashCode = prime * hashCode + ((getMinuteOfHour() == null) ? 0 : getMinuteOfHour().hashCode());
        return hashCode;
    }

    @Override
    public MaintenanceStartTime clone() {
        try {
            return (MaintenanceStartTime) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backupgateway.model.transform.MaintenanceStartTimeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
