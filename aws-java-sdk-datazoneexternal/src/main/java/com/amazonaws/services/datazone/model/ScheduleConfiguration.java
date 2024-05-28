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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the schedule of the data source runs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ScheduleConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduleConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The schedule of the data source runs.
     * </p>
     */
    private String schedule;
    /**
     * <p>
     * The timezone of the data source run.
     * </p>
     */
    private String timezone;

    /**
     * <p>
     * The schedule of the data source runs.
     * </p>
     * 
     * @param schedule
     *        The schedule of the data source runs.
     */

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * The schedule of the data source runs.
     * </p>
     * 
     * @return The schedule of the data source runs.
     */

    public String getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * The schedule of the data source runs.
     * </p>
     * 
     * @param schedule
     *        The schedule of the data source runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleConfiguration withSchedule(String schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * The timezone of the data source run.
     * </p>
     * 
     * @param timezone
     *        The timezone of the data source run.
     * @see Timezone
     */

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * The timezone of the data source run.
     * </p>
     * 
     * @return The timezone of the data source run.
     * @see Timezone
     */

    public String getTimezone() {
        return this.timezone;
    }

    /**
     * <p>
     * The timezone of the data source run.
     * </p>
     * 
     * @param timezone
     *        The timezone of the data source run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Timezone
     */

    public ScheduleConfiguration withTimezone(String timezone) {
        setTimezone(timezone);
        return this;
    }

    /**
     * <p>
     * The timezone of the data source run.
     * </p>
     * 
     * @param timezone
     *        The timezone of the data source run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Timezone
     */

    public ScheduleConfiguration withTimezone(Timezone timezone) {
        this.timezone = timezone.toString();
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
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule()).append(",");
        if (getTimezone() != null)
            sb.append("Timezone: ").append(getTimezone());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduleConfiguration == false)
            return false;
        ScheduleConfiguration other = (ScheduleConfiguration) obj;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getTimezone() == null ^ this.getTimezone() == null)
            return false;
        if (other.getTimezone() != null && other.getTimezone().equals(this.getTimezone()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        return hashCode;
    }

    @Override
    public ScheduleConfiguration clone() {
        try {
            return (ScheduleConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.ScheduleConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
