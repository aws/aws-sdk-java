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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Placeholder documentation for MaintenanceStatus
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/MaintenanceStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MaintenanceStatus implements Serializable, Cloneable, StructuredPojo {

    /** The currently selected maintenance day. */
    private String maintenanceDay;
    /** Maintenance is required by the displayed date and time. Date and time is in ISO. */
    private String maintenanceDeadline;
    /** The currently scheduled maintenance date and time. Date and time is in ISO. */
    private String maintenanceScheduledDate;
    /** The currently selected maintenance start time. Time is in UTC. */
    private String maintenanceStartTime;

    /**
     * The currently selected maintenance day.
     * 
     * @param maintenanceDay
     *        The currently selected maintenance day.
     * @see MaintenanceDay
     */

    public void setMaintenanceDay(String maintenanceDay) {
        this.maintenanceDay = maintenanceDay;
    }

    /**
     * The currently selected maintenance day.
     * 
     * @return The currently selected maintenance day.
     * @see MaintenanceDay
     */

    public String getMaintenanceDay() {
        return this.maintenanceDay;
    }

    /**
     * The currently selected maintenance day.
     * 
     * @param maintenanceDay
     *        The currently selected maintenance day.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceDay
     */

    public MaintenanceStatus withMaintenanceDay(String maintenanceDay) {
        setMaintenanceDay(maintenanceDay);
        return this;
    }

    /**
     * The currently selected maintenance day.
     * 
     * @param maintenanceDay
     *        The currently selected maintenance day.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceDay
     */

    public MaintenanceStatus withMaintenanceDay(MaintenanceDay maintenanceDay) {
        this.maintenanceDay = maintenanceDay.toString();
        return this;
    }

    /**
     * Maintenance is required by the displayed date and time. Date and time is in ISO.
     * 
     * @param maintenanceDeadline
     *        Maintenance is required by the displayed date and time. Date and time is in ISO.
     */

    public void setMaintenanceDeadline(String maintenanceDeadline) {
        this.maintenanceDeadline = maintenanceDeadline;
    }

    /**
     * Maintenance is required by the displayed date and time. Date and time is in ISO.
     * 
     * @return Maintenance is required by the displayed date and time. Date and time is in ISO.
     */

    public String getMaintenanceDeadline() {
        return this.maintenanceDeadline;
    }

    /**
     * Maintenance is required by the displayed date and time. Date and time is in ISO.
     * 
     * @param maintenanceDeadline
     *        Maintenance is required by the displayed date and time. Date and time is in ISO.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceStatus withMaintenanceDeadline(String maintenanceDeadline) {
        setMaintenanceDeadline(maintenanceDeadline);
        return this;
    }

    /**
     * The currently scheduled maintenance date and time. Date and time is in ISO.
     * 
     * @param maintenanceScheduledDate
     *        The currently scheduled maintenance date and time. Date and time is in ISO.
     */

    public void setMaintenanceScheduledDate(String maintenanceScheduledDate) {
        this.maintenanceScheduledDate = maintenanceScheduledDate;
    }

    /**
     * The currently scheduled maintenance date and time. Date and time is in ISO.
     * 
     * @return The currently scheduled maintenance date and time. Date and time is in ISO.
     */

    public String getMaintenanceScheduledDate() {
        return this.maintenanceScheduledDate;
    }

    /**
     * The currently scheduled maintenance date and time. Date and time is in ISO.
     * 
     * @param maintenanceScheduledDate
     *        The currently scheduled maintenance date and time. Date and time is in ISO.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceStatus withMaintenanceScheduledDate(String maintenanceScheduledDate) {
        setMaintenanceScheduledDate(maintenanceScheduledDate);
        return this;
    }

    /**
     * The currently selected maintenance start time. Time is in UTC.
     * 
     * @param maintenanceStartTime
     *        The currently selected maintenance start time. Time is in UTC.
     */

    public void setMaintenanceStartTime(String maintenanceStartTime) {
        this.maintenanceStartTime = maintenanceStartTime;
    }

    /**
     * The currently selected maintenance start time. Time is in UTC.
     * 
     * @return The currently selected maintenance start time. Time is in UTC.
     */

    public String getMaintenanceStartTime() {
        return this.maintenanceStartTime;
    }

    /**
     * The currently selected maintenance start time. Time is in UTC.
     * 
     * @param maintenanceStartTime
     *        The currently selected maintenance start time. Time is in UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceStatus withMaintenanceStartTime(String maintenanceStartTime) {
        setMaintenanceStartTime(maintenanceStartTime);
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
        if (getMaintenanceDay() != null)
            sb.append("MaintenanceDay: ").append(getMaintenanceDay()).append(",");
        if (getMaintenanceDeadline() != null)
            sb.append("MaintenanceDeadline: ").append(getMaintenanceDeadline()).append(",");
        if (getMaintenanceScheduledDate() != null)
            sb.append("MaintenanceScheduledDate: ").append(getMaintenanceScheduledDate()).append(",");
        if (getMaintenanceStartTime() != null)
            sb.append("MaintenanceStartTime: ").append(getMaintenanceStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MaintenanceStatus == false)
            return false;
        MaintenanceStatus other = (MaintenanceStatus) obj;
        if (other.getMaintenanceDay() == null ^ this.getMaintenanceDay() == null)
            return false;
        if (other.getMaintenanceDay() != null && other.getMaintenanceDay().equals(this.getMaintenanceDay()) == false)
            return false;
        if (other.getMaintenanceDeadline() == null ^ this.getMaintenanceDeadline() == null)
            return false;
        if (other.getMaintenanceDeadline() != null && other.getMaintenanceDeadline().equals(this.getMaintenanceDeadline()) == false)
            return false;
        if (other.getMaintenanceScheduledDate() == null ^ this.getMaintenanceScheduledDate() == null)
            return false;
        if (other.getMaintenanceScheduledDate() != null && other.getMaintenanceScheduledDate().equals(this.getMaintenanceScheduledDate()) == false)
            return false;
        if (other.getMaintenanceStartTime() == null ^ this.getMaintenanceStartTime() == null)
            return false;
        if (other.getMaintenanceStartTime() != null && other.getMaintenanceStartTime().equals(this.getMaintenanceStartTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaintenanceDay() == null) ? 0 : getMaintenanceDay().hashCode());
        hashCode = prime * hashCode + ((getMaintenanceDeadline() == null) ? 0 : getMaintenanceDeadline().hashCode());
        hashCode = prime * hashCode + ((getMaintenanceScheduledDate() == null) ? 0 : getMaintenanceScheduledDate().hashCode());
        hashCode = prime * hashCode + ((getMaintenanceStartTime() == null) ? 0 : getMaintenanceStartTime().hashCode());
        return hashCode;
    }

    @Override
    public MaintenanceStatus clone() {
        try {
            return (MaintenanceStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.MaintenanceStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
