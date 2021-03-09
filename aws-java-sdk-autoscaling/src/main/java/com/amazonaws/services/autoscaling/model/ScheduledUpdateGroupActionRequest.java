/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes information used for one or more scheduled scaling action updates in a
 * <a>BatchPutScheduledUpdateGroupAction</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/ScheduledUpdateGroupActionRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduledUpdateGroupActionRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the scaling action.
     * </p>
     */
    private String scheduledActionName;
    /**
     * <p>
     * The date and time for the action to start, in YYYY-MM-DDThh:mm:ssZ format in UTC/GMT only and in quotes (for
     * example, <code>"2019-06-01T00:00:00Z"</code>).
     * </p>
     * <p>
     * If you specify <code>Recurrence</code> and <code>StartTime</code>, Amazon EC2 Auto Scaling performs the action at
     * this time, and then performs the action based on the specified recurrence.
     * </p>
     * <p>
     * If you try to schedule the action in the past, Amazon EC2 Auto Scaling returns an error message.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The date and time for the recurring schedule to end, in UTC.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The recurring schedule for the action, in Unix cron syntax format. This format consists of five fields separated
     * by white spaces: [Minute] [Hour] [Day_of_Month] [Month_of_Year] [Day_of_Week]. The value must be in quotes (for
     * example, <code>"30 0 1 1,6,12 *"</code>). For more information about this format, see <a
     * href="http://crontab.org">Crontab</a>.
     * </p>
     * <p>
     * When <code>StartTime</code> and <code>EndTime</code> are specified with <code>Recurrence</code>, they form the
     * boundaries of when the recurring action starts and stops.
     * </p>
     * <p>
     * Cron expressions use Universal Coordinated Time (UTC) by default.
     * </p>
     */
    private String recurrence;
    /**
     * <p>
     * The minimum size of the Auto Scaling group.
     * </p>
     */
    private Integer minSize;
    /**
     * <p>
     * The maximum size of the Auto Scaling group.
     * </p>
     */
    private Integer maxSize;
    /**
     * <p>
     * The desired capacity is the initial capacity of the Auto Scaling group after the scheduled action runs and the
     * capacity it attempts to maintain.
     * </p>
     */
    private Integer desiredCapacity;
    /**
     * <p>
     * Specifies the time zone for a cron expression. If a time zone is not provided, UTC is used by default.
     * </p>
     * <p>
     * Valid values are the canonical names of the IANA time zones, derived from the IANA Time Zone Database (such as
     * <code>Etc/GMT+9</code> or <code>Pacific/Tahiti</code>). For more information, see <a
     * href="https://en.wikipedia.org/wiki/List_of_tz_database_time_zones"
     * >https://en.wikipedia.org/wiki/List_of_tz_database_time_zones</a>.
     * </p>
     */
    private String timeZone;

    /**
     * <p>
     * The name of the scaling action.
     * </p>
     * 
     * @param scheduledActionName
     *        The name of the scaling action.
     */

    public void setScheduledActionName(String scheduledActionName) {
        this.scheduledActionName = scheduledActionName;
    }

    /**
     * <p>
     * The name of the scaling action.
     * </p>
     * 
     * @return The name of the scaling action.
     */

    public String getScheduledActionName() {
        return this.scheduledActionName;
    }

    /**
     * <p>
     * The name of the scaling action.
     * </p>
     * 
     * @param scheduledActionName
     *        The name of the scaling action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledUpdateGroupActionRequest withScheduledActionName(String scheduledActionName) {
        setScheduledActionName(scheduledActionName);
        return this;
    }

    /**
     * <p>
     * The date and time for the action to start, in YYYY-MM-DDThh:mm:ssZ format in UTC/GMT only and in quotes (for
     * example, <code>"2019-06-01T00:00:00Z"</code>).
     * </p>
     * <p>
     * If you specify <code>Recurrence</code> and <code>StartTime</code>, Amazon EC2 Auto Scaling performs the action at
     * this time, and then performs the action based on the specified recurrence.
     * </p>
     * <p>
     * If you try to schedule the action in the past, Amazon EC2 Auto Scaling returns an error message.
     * </p>
     * 
     * @param startTime
     *        The date and time for the action to start, in YYYY-MM-DDThh:mm:ssZ format in UTC/GMT only and in quotes
     *        (for example, <code>"2019-06-01T00:00:00Z"</code>).</p>
     *        <p>
     *        If you specify <code>Recurrence</code> and <code>StartTime</code>, Amazon EC2 Auto Scaling performs the
     *        action at this time, and then performs the action based on the specified recurrence.
     *        </p>
     *        <p>
     *        If you try to schedule the action in the past, Amazon EC2 Auto Scaling returns an error message.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The date and time for the action to start, in YYYY-MM-DDThh:mm:ssZ format in UTC/GMT only and in quotes (for
     * example, <code>"2019-06-01T00:00:00Z"</code>).
     * </p>
     * <p>
     * If you specify <code>Recurrence</code> and <code>StartTime</code>, Amazon EC2 Auto Scaling performs the action at
     * this time, and then performs the action based on the specified recurrence.
     * </p>
     * <p>
     * If you try to schedule the action in the past, Amazon EC2 Auto Scaling returns an error message.
     * </p>
     * 
     * @return The date and time for the action to start, in YYYY-MM-DDThh:mm:ssZ format in UTC/GMT only and in quotes
     *         (for example, <code>"2019-06-01T00:00:00Z"</code>).</p>
     *         <p>
     *         If you specify <code>Recurrence</code> and <code>StartTime</code>, Amazon EC2 Auto Scaling performs the
     *         action at this time, and then performs the action based on the specified recurrence.
     *         </p>
     *         <p>
     *         If you try to schedule the action in the past, Amazon EC2 Auto Scaling returns an error message.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The date and time for the action to start, in YYYY-MM-DDThh:mm:ssZ format in UTC/GMT only and in quotes (for
     * example, <code>"2019-06-01T00:00:00Z"</code>).
     * </p>
     * <p>
     * If you specify <code>Recurrence</code> and <code>StartTime</code>, Amazon EC2 Auto Scaling performs the action at
     * this time, and then performs the action based on the specified recurrence.
     * </p>
     * <p>
     * If you try to schedule the action in the past, Amazon EC2 Auto Scaling returns an error message.
     * </p>
     * 
     * @param startTime
     *        The date and time for the action to start, in YYYY-MM-DDThh:mm:ssZ format in UTC/GMT only and in quotes
     *        (for example, <code>"2019-06-01T00:00:00Z"</code>).</p>
     *        <p>
     *        If you specify <code>Recurrence</code> and <code>StartTime</code>, Amazon EC2 Auto Scaling performs the
     *        action at this time, and then performs the action based on the specified recurrence.
     *        </p>
     *        <p>
     *        If you try to schedule the action in the past, Amazon EC2 Auto Scaling returns an error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledUpdateGroupActionRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The date and time for the recurring schedule to end, in UTC.
     * </p>
     * 
     * @param endTime
     *        The date and time for the recurring schedule to end, in UTC.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The date and time for the recurring schedule to end, in UTC.
     * </p>
     * 
     * @return The date and time for the recurring schedule to end, in UTC.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The date and time for the recurring schedule to end, in UTC.
     * </p>
     * 
     * @param endTime
     *        The date and time for the recurring schedule to end, in UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledUpdateGroupActionRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The recurring schedule for the action, in Unix cron syntax format. This format consists of five fields separated
     * by white spaces: [Minute] [Hour] [Day_of_Month] [Month_of_Year] [Day_of_Week]. The value must be in quotes (for
     * example, <code>"30 0 1 1,6,12 *"</code>). For more information about this format, see <a
     * href="http://crontab.org">Crontab</a>.
     * </p>
     * <p>
     * When <code>StartTime</code> and <code>EndTime</code> are specified with <code>Recurrence</code>, they form the
     * boundaries of when the recurring action starts and stops.
     * </p>
     * <p>
     * Cron expressions use Universal Coordinated Time (UTC) by default.
     * </p>
     * 
     * @param recurrence
     *        The recurring schedule for the action, in Unix cron syntax format. This format consists of five fields
     *        separated by white spaces: [Minute] [Hour] [Day_of_Month] [Month_of_Year] [Day_of_Week]. The value must be
     *        in quotes (for example, <code>"30 0 1 1,6,12 *"</code>). For more information about this format, see <a
     *        href="http://crontab.org">Crontab</a>.</p>
     *        <p>
     *        When <code>StartTime</code> and <code>EndTime</code> are specified with <code>Recurrence</code>, they form
     *        the boundaries of when the recurring action starts and stops.
     *        </p>
     *        <p>
     *        Cron expressions use Universal Coordinated Time (UTC) by default.
     */

    public void setRecurrence(String recurrence) {
        this.recurrence = recurrence;
    }

    /**
     * <p>
     * The recurring schedule for the action, in Unix cron syntax format. This format consists of five fields separated
     * by white spaces: [Minute] [Hour] [Day_of_Month] [Month_of_Year] [Day_of_Week]. The value must be in quotes (for
     * example, <code>"30 0 1 1,6,12 *"</code>). For more information about this format, see <a
     * href="http://crontab.org">Crontab</a>.
     * </p>
     * <p>
     * When <code>StartTime</code> and <code>EndTime</code> are specified with <code>Recurrence</code>, they form the
     * boundaries of when the recurring action starts and stops.
     * </p>
     * <p>
     * Cron expressions use Universal Coordinated Time (UTC) by default.
     * </p>
     * 
     * @return The recurring schedule for the action, in Unix cron syntax format. This format consists of five fields
     *         separated by white spaces: [Minute] [Hour] [Day_of_Month] [Month_of_Year] [Day_of_Week]. The value must
     *         be in quotes (for example, <code>"30 0 1 1,6,12 *"</code>). For more information about this format, see
     *         <a href="http://crontab.org">Crontab</a>.</p>
     *         <p>
     *         When <code>StartTime</code> and <code>EndTime</code> are specified with <code>Recurrence</code>, they
     *         form the boundaries of when the recurring action starts and stops.
     *         </p>
     *         <p>
     *         Cron expressions use Universal Coordinated Time (UTC) by default.
     */

    public String getRecurrence() {
        return this.recurrence;
    }

    /**
     * <p>
     * The recurring schedule for the action, in Unix cron syntax format. This format consists of five fields separated
     * by white spaces: [Minute] [Hour] [Day_of_Month] [Month_of_Year] [Day_of_Week]. The value must be in quotes (for
     * example, <code>"30 0 1 1,6,12 *"</code>). For more information about this format, see <a
     * href="http://crontab.org">Crontab</a>.
     * </p>
     * <p>
     * When <code>StartTime</code> and <code>EndTime</code> are specified with <code>Recurrence</code>, they form the
     * boundaries of when the recurring action starts and stops.
     * </p>
     * <p>
     * Cron expressions use Universal Coordinated Time (UTC) by default.
     * </p>
     * 
     * @param recurrence
     *        The recurring schedule for the action, in Unix cron syntax format. This format consists of five fields
     *        separated by white spaces: [Minute] [Hour] [Day_of_Month] [Month_of_Year] [Day_of_Week]. The value must be
     *        in quotes (for example, <code>"30 0 1 1,6,12 *"</code>). For more information about this format, see <a
     *        href="http://crontab.org">Crontab</a>.</p>
     *        <p>
     *        When <code>StartTime</code> and <code>EndTime</code> are specified with <code>Recurrence</code>, they form
     *        the boundaries of when the recurring action starts and stops.
     *        </p>
     *        <p>
     *        Cron expressions use Universal Coordinated Time (UTC) by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledUpdateGroupActionRequest withRecurrence(String recurrence) {
        setRecurrence(recurrence);
        return this;
    }

    /**
     * <p>
     * The minimum size of the Auto Scaling group.
     * </p>
     * 
     * @param minSize
     *        The minimum size of the Auto Scaling group.
     */

    public void setMinSize(Integer minSize) {
        this.minSize = minSize;
    }

    /**
     * <p>
     * The minimum size of the Auto Scaling group.
     * </p>
     * 
     * @return The minimum size of the Auto Scaling group.
     */

    public Integer getMinSize() {
        return this.minSize;
    }

    /**
     * <p>
     * The minimum size of the Auto Scaling group.
     * </p>
     * 
     * @param minSize
     *        The minimum size of the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledUpdateGroupActionRequest withMinSize(Integer minSize) {
        setMinSize(minSize);
        return this;
    }

    /**
     * <p>
     * The maximum size of the Auto Scaling group.
     * </p>
     * 
     * @param maxSize
     *        The maximum size of the Auto Scaling group.
     */

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * <p>
     * The maximum size of the Auto Scaling group.
     * </p>
     * 
     * @return The maximum size of the Auto Scaling group.
     */

    public Integer getMaxSize() {
        return this.maxSize;
    }

    /**
     * <p>
     * The maximum size of the Auto Scaling group.
     * </p>
     * 
     * @param maxSize
     *        The maximum size of the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledUpdateGroupActionRequest withMaxSize(Integer maxSize) {
        setMaxSize(maxSize);
        return this;
    }

    /**
     * <p>
     * The desired capacity is the initial capacity of the Auto Scaling group after the scheduled action runs and the
     * capacity it attempts to maintain.
     * </p>
     * 
     * @param desiredCapacity
     *        The desired capacity is the initial capacity of the Auto Scaling group after the scheduled action runs and
     *        the capacity it attempts to maintain.
     */

    public void setDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
    }

    /**
     * <p>
     * The desired capacity is the initial capacity of the Auto Scaling group after the scheduled action runs and the
     * capacity it attempts to maintain.
     * </p>
     * 
     * @return The desired capacity is the initial capacity of the Auto Scaling group after the scheduled action runs
     *         and the capacity it attempts to maintain.
     */

    public Integer getDesiredCapacity() {
        return this.desiredCapacity;
    }

    /**
     * <p>
     * The desired capacity is the initial capacity of the Auto Scaling group after the scheduled action runs and the
     * capacity it attempts to maintain.
     * </p>
     * 
     * @param desiredCapacity
     *        The desired capacity is the initial capacity of the Auto Scaling group after the scheduled action runs and
     *        the capacity it attempts to maintain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledUpdateGroupActionRequest withDesiredCapacity(Integer desiredCapacity) {
        setDesiredCapacity(desiredCapacity);
        return this;
    }

    /**
     * <p>
     * Specifies the time zone for a cron expression. If a time zone is not provided, UTC is used by default.
     * </p>
     * <p>
     * Valid values are the canonical names of the IANA time zones, derived from the IANA Time Zone Database (such as
     * <code>Etc/GMT+9</code> or <code>Pacific/Tahiti</code>). For more information, see <a
     * href="https://en.wikipedia.org/wiki/List_of_tz_database_time_zones"
     * >https://en.wikipedia.org/wiki/List_of_tz_database_time_zones</a>.
     * </p>
     * 
     * @param timeZone
     *        Specifies the time zone for a cron expression. If a time zone is not provided, UTC is used by default.
     *        </p>
     *        <p>
     *        Valid values are the canonical names of the IANA time zones, derived from the IANA Time Zone Database
     *        (such as <code>Etc/GMT+9</code> or <code>Pacific/Tahiti</code>). For more information, see <a
     *        href="https://en.wikipedia.org/wiki/List_of_tz_database_time_zones"
     *        >https://en.wikipedia.org/wiki/List_of_tz_database_time_zones</a>.
     */

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    /**
     * <p>
     * Specifies the time zone for a cron expression. If a time zone is not provided, UTC is used by default.
     * </p>
     * <p>
     * Valid values are the canonical names of the IANA time zones, derived from the IANA Time Zone Database (such as
     * <code>Etc/GMT+9</code> or <code>Pacific/Tahiti</code>). For more information, see <a
     * href="https://en.wikipedia.org/wiki/List_of_tz_database_time_zones"
     * >https://en.wikipedia.org/wiki/List_of_tz_database_time_zones</a>.
     * </p>
     * 
     * @return Specifies the time zone for a cron expression. If a time zone is not provided, UTC is used by default.
     *         </p>
     *         <p>
     *         Valid values are the canonical names of the IANA time zones, derived from the IANA Time Zone Database
     *         (such as <code>Etc/GMT+9</code> or <code>Pacific/Tahiti</code>). For more information, see <a
     *         href="https://en.wikipedia.org/wiki/List_of_tz_database_time_zones"
     *         >https://en.wikipedia.org/wiki/List_of_tz_database_time_zones</a>.
     */

    public String getTimeZone() {
        return this.timeZone;
    }

    /**
     * <p>
     * Specifies the time zone for a cron expression. If a time zone is not provided, UTC is used by default.
     * </p>
     * <p>
     * Valid values are the canonical names of the IANA time zones, derived from the IANA Time Zone Database (such as
     * <code>Etc/GMT+9</code> or <code>Pacific/Tahiti</code>). For more information, see <a
     * href="https://en.wikipedia.org/wiki/List_of_tz_database_time_zones"
     * >https://en.wikipedia.org/wiki/List_of_tz_database_time_zones</a>.
     * </p>
     * 
     * @param timeZone
     *        Specifies the time zone for a cron expression. If a time zone is not provided, UTC is used by default.
     *        </p>
     *        <p>
     *        Valid values are the canonical names of the IANA time zones, derived from the IANA Time Zone Database
     *        (such as <code>Etc/GMT+9</code> or <code>Pacific/Tahiti</code>). For more information, see <a
     *        href="https://en.wikipedia.org/wiki/List_of_tz_database_time_zones"
     *        >https://en.wikipedia.org/wiki/List_of_tz_database_time_zones</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledUpdateGroupActionRequest withTimeZone(String timeZone) {
        setTimeZone(timeZone);
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
        if (getScheduledActionName() != null)
            sb.append("ScheduledActionName: ").append(getScheduledActionName()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getRecurrence() != null)
            sb.append("Recurrence: ").append(getRecurrence()).append(",");
        if (getMinSize() != null)
            sb.append("MinSize: ").append(getMinSize()).append(",");
        if (getMaxSize() != null)
            sb.append("MaxSize: ").append(getMaxSize()).append(",");
        if (getDesiredCapacity() != null)
            sb.append("DesiredCapacity: ").append(getDesiredCapacity()).append(",");
        if (getTimeZone() != null)
            sb.append("TimeZone: ").append(getTimeZone());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduledUpdateGroupActionRequest == false)
            return false;
        ScheduledUpdateGroupActionRequest other = (ScheduledUpdateGroupActionRequest) obj;
        if (other.getScheduledActionName() == null ^ this.getScheduledActionName() == null)
            return false;
        if (other.getScheduledActionName() != null && other.getScheduledActionName().equals(this.getScheduledActionName()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getRecurrence() == null ^ this.getRecurrence() == null)
            return false;
        if (other.getRecurrence() != null && other.getRecurrence().equals(this.getRecurrence()) == false)
            return false;
        if (other.getMinSize() == null ^ this.getMinSize() == null)
            return false;
        if (other.getMinSize() != null && other.getMinSize().equals(this.getMinSize()) == false)
            return false;
        if (other.getMaxSize() == null ^ this.getMaxSize() == null)
            return false;
        if (other.getMaxSize() != null && other.getMaxSize().equals(this.getMaxSize()) == false)
            return false;
        if (other.getDesiredCapacity() == null ^ this.getDesiredCapacity() == null)
            return false;
        if (other.getDesiredCapacity() != null && other.getDesiredCapacity().equals(this.getDesiredCapacity()) == false)
            return false;
        if (other.getTimeZone() == null ^ this.getTimeZone() == null)
            return false;
        if (other.getTimeZone() != null && other.getTimeZone().equals(this.getTimeZone()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScheduledActionName() == null) ? 0 : getScheduledActionName().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getRecurrence() == null) ? 0 : getRecurrence().hashCode());
        hashCode = prime * hashCode + ((getMinSize() == null) ? 0 : getMinSize().hashCode());
        hashCode = prime * hashCode + ((getMaxSize() == null) ? 0 : getMaxSize().hashCode());
        hashCode = prime * hashCode + ((getDesiredCapacity() == null) ? 0 : getDesiredCapacity().hashCode());
        hashCode = prime * hashCode + ((getTimeZone() == null) ? 0 : getTimeZone().hashCode());
        return hashCode;
    }

    @Override
    public ScheduledUpdateGroupActionRequest clone() {
        try {
            return (ScheduledUpdateGroupActionRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
