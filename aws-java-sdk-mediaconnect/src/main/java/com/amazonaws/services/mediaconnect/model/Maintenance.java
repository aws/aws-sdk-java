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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The maintenance setting of a flow
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/Maintenance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Maintenance implements Serializable, Cloneable, StructuredPojo {

    /** A day of a week when the maintenance will happen. Use Monday/Tuesday/Wednesday/Thursday/Friday/Saturday/Sunday. */
    private String maintenanceDay;
    /** The Maintenance has to be performed before this deadline in ISO UTC format. Example: 2021-01-30T08:30:00Z. */
    private String maintenanceDeadline;
    /** A scheduled date in ISO UTC format when the maintenance will happen. Use YYYY-MM-DD format. Example: 2021-01-30. */
    private String maintenanceScheduledDate;
    /**
     * UTC time when the maintenance will happen. Use 24-hour HH:MM format. Minutes must be 00. Example: 13:00. The
     * default value is 02:00.
     */
    private String maintenanceStartHour;

    /**
     * A day of a week when the maintenance will happen. Use Monday/Tuesday/Wednesday/Thursday/Friday/Saturday/Sunday.
     * 
     * @param maintenanceDay
     *        A day of a week when the maintenance will happen. Use
     *        Monday/Tuesday/Wednesday/Thursday/Friday/Saturday/Sunday.
     * @see MaintenanceDay
     */

    public void setMaintenanceDay(String maintenanceDay) {
        this.maintenanceDay = maintenanceDay;
    }

    /**
     * A day of a week when the maintenance will happen. Use Monday/Tuesday/Wednesday/Thursday/Friday/Saturday/Sunday.
     * 
     * @return A day of a week when the maintenance will happen. Use
     *         Monday/Tuesday/Wednesday/Thursday/Friday/Saturday/Sunday.
     * @see MaintenanceDay
     */

    public String getMaintenanceDay() {
        return this.maintenanceDay;
    }

    /**
     * A day of a week when the maintenance will happen. Use Monday/Tuesday/Wednesday/Thursday/Friday/Saturday/Sunday.
     * 
     * @param maintenanceDay
     *        A day of a week when the maintenance will happen. Use
     *        Monday/Tuesday/Wednesday/Thursday/Friday/Saturday/Sunday.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceDay
     */

    public Maintenance withMaintenanceDay(String maintenanceDay) {
        setMaintenanceDay(maintenanceDay);
        return this;
    }

    /**
     * A day of a week when the maintenance will happen. Use Monday/Tuesday/Wednesday/Thursday/Friday/Saturday/Sunday.
     * 
     * @param maintenanceDay
     *        A day of a week when the maintenance will happen. Use
     *        Monday/Tuesday/Wednesday/Thursday/Friday/Saturday/Sunday.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceDay
     */

    public Maintenance withMaintenanceDay(MaintenanceDay maintenanceDay) {
        this.maintenanceDay = maintenanceDay.toString();
        return this;
    }

    /**
     * The Maintenance has to be performed before this deadline in ISO UTC format. Example: 2021-01-30T08:30:00Z.
     * 
     * @param maintenanceDeadline
     *        The Maintenance has to be performed before this deadline in ISO UTC format. Example: 2021-01-30T08:30:00Z.
     */

    public void setMaintenanceDeadline(String maintenanceDeadline) {
        this.maintenanceDeadline = maintenanceDeadline;
    }

    /**
     * The Maintenance has to be performed before this deadline in ISO UTC format. Example: 2021-01-30T08:30:00Z.
     * 
     * @return The Maintenance has to be performed before this deadline in ISO UTC format. Example:
     *         2021-01-30T08:30:00Z.
     */

    public String getMaintenanceDeadline() {
        return this.maintenanceDeadline;
    }

    /**
     * The Maintenance has to be performed before this deadline in ISO UTC format. Example: 2021-01-30T08:30:00Z.
     * 
     * @param maintenanceDeadline
     *        The Maintenance has to be performed before this deadline in ISO UTC format. Example: 2021-01-30T08:30:00Z.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Maintenance withMaintenanceDeadline(String maintenanceDeadline) {
        setMaintenanceDeadline(maintenanceDeadline);
        return this;
    }

    /**
     * A scheduled date in ISO UTC format when the maintenance will happen. Use YYYY-MM-DD format. Example: 2021-01-30.
     * 
     * @param maintenanceScheduledDate
     *        A scheduled date in ISO UTC format when the maintenance will happen. Use YYYY-MM-DD format. Example:
     *        2021-01-30.
     */

    public void setMaintenanceScheduledDate(String maintenanceScheduledDate) {
        this.maintenanceScheduledDate = maintenanceScheduledDate;
    }

    /**
     * A scheduled date in ISO UTC format when the maintenance will happen. Use YYYY-MM-DD format. Example: 2021-01-30.
     * 
     * @return A scheduled date in ISO UTC format when the maintenance will happen. Use YYYY-MM-DD format. Example:
     *         2021-01-30.
     */

    public String getMaintenanceScheduledDate() {
        return this.maintenanceScheduledDate;
    }

    /**
     * A scheduled date in ISO UTC format when the maintenance will happen. Use YYYY-MM-DD format. Example: 2021-01-30.
     * 
     * @param maintenanceScheduledDate
     *        A scheduled date in ISO UTC format when the maintenance will happen. Use YYYY-MM-DD format. Example:
     *        2021-01-30.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Maintenance withMaintenanceScheduledDate(String maintenanceScheduledDate) {
        setMaintenanceScheduledDate(maintenanceScheduledDate);
        return this;
    }

    /**
     * UTC time when the maintenance will happen. Use 24-hour HH:MM format. Minutes must be 00. Example: 13:00. The
     * default value is 02:00.
     * 
     * @param maintenanceStartHour
     *        UTC time when the maintenance will happen. Use 24-hour HH:MM format. Minutes must be 00. Example: 13:00.
     *        The default value is 02:00.
     */

    public void setMaintenanceStartHour(String maintenanceStartHour) {
        this.maintenanceStartHour = maintenanceStartHour;
    }

    /**
     * UTC time when the maintenance will happen. Use 24-hour HH:MM format. Minutes must be 00. Example: 13:00. The
     * default value is 02:00.
     * 
     * @return UTC time when the maintenance will happen. Use 24-hour HH:MM format. Minutes must be 00. Example: 13:00.
     *         The default value is 02:00.
     */

    public String getMaintenanceStartHour() {
        return this.maintenanceStartHour;
    }

    /**
     * UTC time when the maintenance will happen. Use 24-hour HH:MM format. Minutes must be 00. Example: 13:00. The
     * default value is 02:00.
     * 
     * @param maintenanceStartHour
     *        UTC time when the maintenance will happen. Use 24-hour HH:MM format. Minutes must be 00. Example: 13:00.
     *        The default value is 02:00.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Maintenance withMaintenanceStartHour(String maintenanceStartHour) {
        setMaintenanceStartHour(maintenanceStartHour);
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
        if (getMaintenanceStartHour() != null)
            sb.append("MaintenanceStartHour: ").append(getMaintenanceStartHour());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Maintenance == false)
            return false;
        Maintenance other = (Maintenance) obj;
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
        if (other.getMaintenanceStartHour() == null ^ this.getMaintenanceStartHour() == null)
            return false;
        if (other.getMaintenanceStartHour() != null && other.getMaintenanceStartHour().equals(this.getMaintenanceStartHour()) == false)
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
        hashCode = prime * hashCode + ((getMaintenanceStartHour() == null) ? 0 : getMaintenanceStartHour().hashCode());
        return hashCode;
    }

    @Override
    public Maintenance clone() {
        try {
            return (Maintenance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.MaintenanceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
