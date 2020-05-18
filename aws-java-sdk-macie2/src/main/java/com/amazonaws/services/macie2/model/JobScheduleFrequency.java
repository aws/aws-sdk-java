/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the recurrence pattern for running a classification job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/JobScheduleFrequency" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobScheduleFrequency implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Run the job once a day, every day. If specified, this is an empty object.
     * </p>
     */
    private DailySchedule dailySchedule;
    /**
     * <p>
     * Run the job once a month, on a specific day of the month. This value can be an integer from 1 through 30.
     * </p>
     */
    private MonthlySchedule monthlySchedule;
    /**
     * <p>
     * Run the job once a week, on a specific day of the week. Valid values are: MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
     * FRIDAY, SATURDAY, and SUNDAY.
     * </p>
     */
    private WeeklySchedule weeklySchedule;

    /**
     * <p>
     * Run the job once a day, every day. If specified, this is an empty object.
     * </p>
     * 
     * @param dailySchedule
     *        Run the job once a day, every day. If specified, this is an empty object.
     */

    public void setDailySchedule(DailySchedule dailySchedule) {
        this.dailySchedule = dailySchedule;
    }

    /**
     * <p>
     * Run the job once a day, every day. If specified, this is an empty object.
     * </p>
     * 
     * @return Run the job once a day, every day. If specified, this is an empty object.
     */

    public DailySchedule getDailySchedule() {
        return this.dailySchedule;
    }

    /**
     * <p>
     * Run the job once a day, every day. If specified, this is an empty object.
     * </p>
     * 
     * @param dailySchedule
     *        Run the job once a day, every day. If specified, this is an empty object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobScheduleFrequency withDailySchedule(DailySchedule dailySchedule) {
        setDailySchedule(dailySchedule);
        return this;
    }

    /**
     * <p>
     * Run the job once a month, on a specific day of the month. This value can be an integer from 1 through 30.
     * </p>
     * 
     * @param monthlySchedule
     *        Run the job once a month, on a specific day of the month. This value can be an integer from 1 through 30.
     */

    public void setMonthlySchedule(MonthlySchedule monthlySchedule) {
        this.monthlySchedule = monthlySchedule;
    }

    /**
     * <p>
     * Run the job once a month, on a specific day of the month. This value can be an integer from 1 through 30.
     * </p>
     * 
     * @return Run the job once a month, on a specific day of the month. This value can be an integer from 1 through 30.
     */

    public MonthlySchedule getMonthlySchedule() {
        return this.monthlySchedule;
    }

    /**
     * <p>
     * Run the job once a month, on a specific day of the month. This value can be an integer from 1 through 30.
     * </p>
     * 
     * @param monthlySchedule
     *        Run the job once a month, on a specific day of the month. This value can be an integer from 1 through 30.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobScheduleFrequency withMonthlySchedule(MonthlySchedule monthlySchedule) {
        setMonthlySchedule(monthlySchedule);
        return this;
    }

    /**
     * <p>
     * Run the job once a week, on a specific day of the week. Valid values are: MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
     * FRIDAY, SATURDAY, and SUNDAY.
     * </p>
     * 
     * @param weeklySchedule
     *        Run the job once a week, on a specific day of the week. Valid values are: MONDAY, TUESDAY, WEDNESDAY,
     *        THURSDAY, FRIDAY, SATURDAY, and SUNDAY.
     */

    public void setWeeklySchedule(WeeklySchedule weeklySchedule) {
        this.weeklySchedule = weeklySchedule;
    }

    /**
     * <p>
     * Run the job once a week, on a specific day of the week. Valid values are: MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
     * FRIDAY, SATURDAY, and SUNDAY.
     * </p>
     * 
     * @return Run the job once a week, on a specific day of the week. Valid values are: MONDAY, TUESDAY, WEDNESDAY,
     *         THURSDAY, FRIDAY, SATURDAY, and SUNDAY.
     */

    public WeeklySchedule getWeeklySchedule() {
        return this.weeklySchedule;
    }

    /**
     * <p>
     * Run the job once a week, on a specific day of the week. Valid values are: MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
     * FRIDAY, SATURDAY, and SUNDAY.
     * </p>
     * 
     * @param weeklySchedule
     *        Run the job once a week, on a specific day of the week. Valid values are: MONDAY, TUESDAY, WEDNESDAY,
     *        THURSDAY, FRIDAY, SATURDAY, and SUNDAY.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobScheduleFrequency withWeeklySchedule(WeeklySchedule weeklySchedule) {
        setWeeklySchedule(weeklySchedule);
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
        if (getDailySchedule() != null)
            sb.append("DailySchedule: ").append(getDailySchedule()).append(",");
        if (getMonthlySchedule() != null)
            sb.append("MonthlySchedule: ").append(getMonthlySchedule()).append(",");
        if (getWeeklySchedule() != null)
            sb.append("WeeklySchedule: ").append(getWeeklySchedule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobScheduleFrequency == false)
            return false;
        JobScheduleFrequency other = (JobScheduleFrequency) obj;
        if (other.getDailySchedule() == null ^ this.getDailySchedule() == null)
            return false;
        if (other.getDailySchedule() != null && other.getDailySchedule().equals(this.getDailySchedule()) == false)
            return false;
        if (other.getMonthlySchedule() == null ^ this.getMonthlySchedule() == null)
            return false;
        if (other.getMonthlySchedule() != null && other.getMonthlySchedule().equals(this.getMonthlySchedule()) == false)
            return false;
        if (other.getWeeklySchedule() == null ^ this.getWeeklySchedule() == null)
            return false;
        if (other.getWeeklySchedule() != null && other.getWeeklySchedule().equals(this.getWeeklySchedule()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDailySchedule() == null) ? 0 : getDailySchedule().hashCode());
        hashCode = prime * hashCode + ((getMonthlySchedule() == null) ? 0 : getMonthlySchedule().hashCode());
        hashCode = prime * hashCode + ((getWeeklySchedule() == null) ? 0 : getWeeklySchedule().hashCode());
        return hashCode;
    }

    @Override
    public JobScheduleFrequency clone() {
        try {
            return (JobScheduleFrequency) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.JobScheduleFrequencyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
