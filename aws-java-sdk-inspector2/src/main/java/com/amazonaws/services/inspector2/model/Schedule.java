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
 * A schedule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/Schedule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Schedule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The schedule's daily.
     * </p>
     */
    private DailySchedule daily;
    /**
     * <p>
     * The schedule's monthly.
     * </p>
     */
    private MonthlySchedule monthly;
    /**
     * <p>
     * The schedule's one time.
     * </p>
     */
    private OneTimeSchedule oneTime;
    /**
     * <p>
     * The schedule's weekly.
     * </p>
     */
    private WeeklySchedule weekly;

    /**
     * <p>
     * The schedule's daily.
     * </p>
     * 
     * @param daily
     *        The schedule's daily.
     */

    public void setDaily(DailySchedule daily) {
        this.daily = daily;
    }

    /**
     * <p>
     * The schedule's daily.
     * </p>
     * 
     * @return The schedule's daily.
     */

    public DailySchedule getDaily() {
        return this.daily;
    }

    /**
     * <p>
     * The schedule's daily.
     * </p>
     * 
     * @param daily
     *        The schedule's daily.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withDaily(DailySchedule daily) {
        setDaily(daily);
        return this;
    }

    /**
     * <p>
     * The schedule's monthly.
     * </p>
     * 
     * @param monthly
     *        The schedule's monthly.
     */

    public void setMonthly(MonthlySchedule monthly) {
        this.monthly = monthly;
    }

    /**
     * <p>
     * The schedule's monthly.
     * </p>
     * 
     * @return The schedule's monthly.
     */

    public MonthlySchedule getMonthly() {
        return this.monthly;
    }

    /**
     * <p>
     * The schedule's monthly.
     * </p>
     * 
     * @param monthly
     *        The schedule's monthly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withMonthly(MonthlySchedule monthly) {
        setMonthly(monthly);
        return this;
    }

    /**
     * <p>
     * The schedule's one time.
     * </p>
     * 
     * @param oneTime
     *        The schedule's one time.
     */

    public void setOneTime(OneTimeSchedule oneTime) {
        this.oneTime = oneTime;
    }

    /**
     * <p>
     * The schedule's one time.
     * </p>
     * 
     * @return The schedule's one time.
     */

    public OneTimeSchedule getOneTime() {
        return this.oneTime;
    }

    /**
     * <p>
     * The schedule's one time.
     * </p>
     * 
     * @param oneTime
     *        The schedule's one time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withOneTime(OneTimeSchedule oneTime) {
        setOneTime(oneTime);
        return this;
    }

    /**
     * <p>
     * The schedule's weekly.
     * </p>
     * 
     * @param weekly
     *        The schedule's weekly.
     */

    public void setWeekly(WeeklySchedule weekly) {
        this.weekly = weekly;
    }

    /**
     * <p>
     * The schedule's weekly.
     * </p>
     * 
     * @return The schedule's weekly.
     */

    public WeeklySchedule getWeekly() {
        return this.weekly;
    }

    /**
     * <p>
     * The schedule's weekly.
     * </p>
     * 
     * @param weekly
     *        The schedule's weekly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withWeekly(WeeklySchedule weekly) {
        setWeekly(weekly);
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
        if (getDaily() != null)
            sb.append("Daily: ").append(getDaily()).append(",");
        if (getMonthly() != null)
            sb.append("Monthly: ").append(getMonthly()).append(",");
        if (getOneTime() != null)
            sb.append("OneTime: ").append(getOneTime()).append(",");
        if (getWeekly() != null)
            sb.append("Weekly: ").append(getWeekly());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Schedule == false)
            return false;
        Schedule other = (Schedule) obj;
        if (other.getDaily() == null ^ this.getDaily() == null)
            return false;
        if (other.getDaily() != null && other.getDaily().equals(this.getDaily()) == false)
            return false;
        if (other.getMonthly() == null ^ this.getMonthly() == null)
            return false;
        if (other.getMonthly() != null && other.getMonthly().equals(this.getMonthly()) == false)
            return false;
        if (other.getOneTime() == null ^ this.getOneTime() == null)
            return false;
        if (other.getOneTime() != null && other.getOneTime().equals(this.getOneTime()) == false)
            return false;
        if (other.getWeekly() == null ^ this.getWeekly() == null)
            return false;
        if (other.getWeekly() != null && other.getWeekly().equals(this.getWeekly()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDaily() == null) ? 0 : getDaily().hashCode());
        hashCode = prime * hashCode + ((getMonthly() == null) ? 0 : getMonthly().hashCode());
        hashCode = prime * hashCode + ((getOneTime() == null) ? 0 : getOneTime().hashCode());
        hashCode = prime * hashCode + ((getWeekly() == null) ? 0 : getWeekly().hashCode());
        return hashCode;
    }

    @Override
    public Schedule clone() {
        try {
            return (Schedule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.ScheduleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
