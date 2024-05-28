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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The refresh on entity for weekly or monthly schedules.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ScheduleRefreshOnEntity" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduleRefreshOnEntity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The day of the week that you want to schedule a refresh on.
     * </p>
     */
    private String dayOfWeek;
    /**
     * <p>
     * The day of the month that you want to schedule refresh on.
     * </p>
     */
    private String dayOfMonth;

    /**
     * <p>
     * The day of the week that you want to schedule a refresh on.
     * </p>
     * 
     * @param dayOfWeek
     *        The day of the week that you want to schedule a refresh on.
     * @see DayOfWeek
     */

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    /**
     * <p>
     * The day of the week that you want to schedule a refresh on.
     * </p>
     * 
     * @return The day of the week that you want to schedule a refresh on.
     * @see DayOfWeek
     */

    public String getDayOfWeek() {
        return this.dayOfWeek;
    }

    /**
     * <p>
     * The day of the week that you want to schedule a refresh on.
     * </p>
     * 
     * @param dayOfWeek
     *        The day of the week that you want to schedule a refresh on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DayOfWeek
     */

    public ScheduleRefreshOnEntity withDayOfWeek(String dayOfWeek) {
        setDayOfWeek(dayOfWeek);
        return this;
    }

    /**
     * <p>
     * The day of the week that you want to schedule a refresh on.
     * </p>
     * 
     * @param dayOfWeek
     *        The day of the week that you want to schedule a refresh on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DayOfWeek
     */

    public ScheduleRefreshOnEntity withDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek.toString();
        return this;
    }

    /**
     * <p>
     * The day of the month that you want to schedule refresh on.
     * </p>
     * 
     * @param dayOfMonth
     *        The day of the month that you want to schedule refresh on.
     */

    public void setDayOfMonth(String dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    /**
     * <p>
     * The day of the month that you want to schedule refresh on.
     * </p>
     * 
     * @return The day of the month that you want to schedule refresh on.
     */

    public String getDayOfMonth() {
        return this.dayOfMonth;
    }

    /**
     * <p>
     * The day of the month that you want to schedule refresh on.
     * </p>
     * 
     * @param dayOfMonth
     *        The day of the month that you want to schedule refresh on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleRefreshOnEntity withDayOfMonth(String dayOfMonth) {
        setDayOfMonth(dayOfMonth);
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
        if (getDayOfWeek() != null)
            sb.append("DayOfWeek: ").append(getDayOfWeek()).append(",");
        if (getDayOfMonth() != null)
            sb.append("DayOfMonth: ").append(getDayOfMonth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduleRefreshOnEntity == false)
            return false;
        ScheduleRefreshOnEntity other = (ScheduleRefreshOnEntity) obj;
        if (other.getDayOfWeek() == null ^ this.getDayOfWeek() == null)
            return false;
        if (other.getDayOfWeek() != null && other.getDayOfWeek().equals(this.getDayOfWeek()) == false)
            return false;
        if (other.getDayOfMonth() == null ^ this.getDayOfMonth() == null)
            return false;
        if (other.getDayOfMonth() != null && other.getDayOfMonth().equals(this.getDayOfMonth()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDayOfWeek() == null) ? 0 : getDayOfWeek().hashCode());
        hashCode = prime * hashCode + ((getDayOfMonth() == null) ? 0 : getDayOfMonth().hashCode());
        return hashCode;
    }

    @Override
    public ScheduleRefreshOnEntity clone() {
        try {
            return (ScheduleRefreshOnEntity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ScheduleRefreshOnEntityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
