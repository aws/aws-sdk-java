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
package com.amazonaws.services.workspacesthinclient.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the maintenance window for a thin client device.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/MaintenanceWindow"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MaintenanceWindow implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An option to select the default or custom maintenance window.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The hour for the maintenance window start (<code>00</code>-<code>23</code>).
     * </p>
     */
    private Integer startTimeHour;
    /**
     * <p>
     * The minutes past the hour for the maintenance window start (<code>00</code>-<code>59</code>).
     * </p>
     */
    private Integer startTimeMinute;
    /**
     * <p>
     * The hour for the maintenance window end (<code>00</code>-<code>23</code>).
     * </p>
     */
    private Integer endTimeHour;
    /**
     * <p>
     * The minutes for the maintenance window end (<code>00</code>-<code>59</code>).
     * </p>
     */
    private Integer endTimeMinute;
    /**
     * <p>
     * The days of the week during which the maintenance window is open.
     * </p>
     */
    private java.util.List<String> daysOfTheWeek;
    /**
     * <p>
     * The option to set the maintenance window during the device local time or Universal Coordinated Time (UTC).
     * </p>
     */
    private String applyTimeOf;

    /**
     * <p>
     * An option to select the default or custom maintenance window.
     * </p>
     * 
     * @param type
     *        An option to select the default or custom maintenance window.
     * @see MaintenanceWindowType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * An option to select the default or custom maintenance window.
     * </p>
     * 
     * @return An option to select the default or custom maintenance window.
     * @see MaintenanceWindowType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * An option to select the default or custom maintenance window.
     * </p>
     * 
     * @param type
     *        An option to select the default or custom maintenance window.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceWindowType
     */

    public MaintenanceWindow withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * An option to select the default or custom maintenance window.
     * </p>
     * 
     * @param type
     *        An option to select the default or custom maintenance window.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceWindowType
     */

    public MaintenanceWindow withType(MaintenanceWindowType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The hour for the maintenance window start (<code>00</code>-<code>23</code>).
     * </p>
     * 
     * @param startTimeHour
     *        The hour for the maintenance window start (<code>00</code>-<code>23</code>).
     */

    public void setStartTimeHour(Integer startTimeHour) {
        this.startTimeHour = startTimeHour;
    }

    /**
     * <p>
     * The hour for the maintenance window start (<code>00</code>-<code>23</code>).
     * </p>
     * 
     * @return The hour for the maintenance window start (<code>00</code>-<code>23</code>).
     */

    public Integer getStartTimeHour() {
        return this.startTimeHour;
    }

    /**
     * <p>
     * The hour for the maintenance window start (<code>00</code>-<code>23</code>).
     * </p>
     * 
     * @param startTimeHour
     *        The hour for the maintenance window start (<code>00</code>-<code>23</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindow withStartTimeHour(Integer startTimeHour) {
        setStartTimeHour(startTimeHour);
        return this;
    }

    /**
     * <p>
     * The minutes past the hour for the maintenance window start (<code>00</code>-<code>59</code>).
     * </p>
     * 
     * @param startTimeMinute
     *        The minutes past the hour for the maintenance window start (<code>00</code>-<code>59</code>).
     */

    public void setStartTimeMinute(Integer startTimeMinute) {
        this.startTimeMinute = startTimeMinute;
    }

    /**
     * <p>
     * The minutes past the hour for the maintenance window start (<code>00</code>-<code>59</code>).
     * </p>
     * 
     * @return The minutes past the hour for the maintenance window start (<code>00</code>-<code>59</code>).
     */

    public Integer getStartTimeMinute() {
        return this.startTimeMinute;
    }

    /**
     * <p>
     * The minutes past the hour for the maintenance window start (<code>00</code>-<code>59</code>).
     * </p>
     * 
     * @param startTimeMinute
     *        The minutes past the hour for the maintenance window start (<code>00</code>-<code>59</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindow withStartTimeMinute(Integer startTimeMinute) {
        setStartTimeMinute(startTimeMinute);
        return this;
    }

    /**
     * <p>
     * The hour for the maintenance window end (<code>00</code>-<code>23</code>).
     * </p>
     * 
     * @param endTimeHour
     *        The hour for the maintenance window end (<code>00</code>-<code>23</code>).
     */

    public void setEndTimeHour(Integer endTimeHour) {
        this.endTimeHour = endTimeHour;
    }

    /**
     * <p>
     * The hour for the maintenance window end (<code>00</code>-<code>23</code>).
     * </p>
     * 
     * @return The hour for the maintenance window end (<code>00</code>-<code>23</code>).
     */

    public Integer getEndTimeHour() {
        return this.endTimeHour;
    }

    /**
     * <p>
     * The hour for the maintenance window end (<code>00</code>-<code>23</code>).
     * </p>
     * 
     * @param endTimeHour
     *        The hour for the maintenance window end (<code>00</code>-<code>23</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindow withEndTimeHour(Integer endTimeHour) {
        setEndTimeHour(endTimeHour);
        return this;
    }

    /**
     * <p>
     * The minutes for the maintenance window end (<code>00</code>-<code>59</code>).
     * </p>
     * 
     * @param endTimeMinute
     *        The minutes for the maintenance window end (<code>00</code>-<code>59</code>).
     */

    public void setEndTimeMinute(Integer endTimeMinute) {
        this.endTimeMinute = endTimeMinute;
    }

    /**
     * <p>
     * The minutes for the maintenance window end (<code>00</code>-<code>59</code>).
     * </p>
     * 
     * @return The minutes for the maintenance window end (<code>00</code>-<code>59</code>).
     */

    public Integer getEndTimeMinute() {
        return this.endTimeMinute;
    }

    /**
     * <p>
     * The minutes for the maintenance window end (<code>00</code>-<code>59</code>).
     * </p>
     * 
     * @param endTimeMinute
     *        The minutes for the maintenance window end (<code>00</code>-<code>59</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindow withEndTimeMinute(Integer endTimeMinute) {
        setEndTimeMinute(endTimeMinute);
        return this;
    }

    /**
     * <p>
     * The days of the week during which the maintenance window is open.
     * </p>
     * 
     * @return The days of the week during which the maintenance window is open.
     * @see DayOfWeek
     */

    public java.util.List<String> getDaysOfTheWeek() {
        return daysOfTheWeek;
    }

    /**
     * <p>
     * The days of the week during which the maintenance window is open.
     * </p>
     * 
     * @param daysOfTheWeek
     *        The days of the week during which the maintenance window is open.
     * @see DayOfWeek
     */

    public void setDaysOfTheWeek(java.util.Collection<String> daysOfTheWeek) {
        if (daysOfTheWeek == null) {
            this.daysOfTheWeek = null;
            return;
        }

        this.daysOfTheWeek = new java.util.ArrayList<String>(daysOfTheWeek);
    }

    /**
     * <p>
     * The days of the week during which the maintenance window is open.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDaysOfTheWeek(java.util.Collection)} or {@link #withDaysOfTheWeek(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param daysOfTheWeek
     *        The days of the week during which the maintenance window is open.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DayOfWeek
     */

    public MaintenanceWindow withDaysOfTheWeek(String... daysOfTheWeek) {
        if (this.daysOfTheWeek == null) {
            setDaysOfTheWeek(new java.util.ArrayList<String>(daysOfTheWeek.length));
        }
        for (String ele : daysOfTheWeek) {
            this.daysOfTheWeek.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The days of the week during which the maintenance window is open.
     * </p>
     * 
     * @param daysOfTheWeek
     *        The days of the week during which the maintenance window is open.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DayOfWeek
     */

    public MaintenanceWindow withDaysOfTheWeek(java.util.Collection<String> daysOfTheWeek) {
        setDaysOfTheWeek(daysOfTheWeek);
        return this;
    }

    /**
     * <p>
     * The days of the week during which the maintenance window is open.
     * </p>
     * 
     * @param daysOfTheWeek
     *        The days of the week during which the maintenance window is open.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DayOfWeek
     */

    public MaintenanceWindow withDaysOfTheWeek(DayOfWeek... daysOfTheWeek) {
        java.util.ArrayList<String> daysOfTheWeekCopy = new java.util.ArrayList<String>(daysOfTheWeek.length);
        for (DayOfWeek value : daysOfTheWeek) {
            daysOfTheWeekCopy.add(value.toString());
        }
        if (getDaysOfTheWeek() == null) {
            setDaysOfTheWeek(daysOfTheWeekCopy);
        } else {
            getDaysOfTheWeek().addAll(daysOfTheWeekCopy);
        }
        return this;
    }

    /**
     * <p>
     * The option to set the maintenance window during the device local time or Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param applyTimeOf
     *        The option to set the maintenance window during the device local time or Universal Coordinated Time (UTC).
     * @see ApplyTimeOf
     */

    public void setApplyTimeOf(String applyTimeOf) {
        this.applyTimeOf = applyTimeOf;
    }

    /**
     * <p>
     * The option to set the maintenance window during the device local time or Universal Coordinated Time (UTC).
     * </p>
     * 
     * @return The option to set the maintenance window during the device local time or Universal Coordinated Time
     *         (UTC).
     * @see ApplyTimeOf
     */

    public String getApplyTimeOf() {
        return this.applyTimeOf;
    }

    /**
     * <p>
     * The option to set the maintenance window during the device local time or Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param applyTimeOf
     *        The option to set the maintenance window during the device local time or Universal Coordinated Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplyTimeOf
     */

    public MaintenanceWindow withApplyTimeOf(String applyTimeOf) {
        setApplyTimeOf(applyTimeOf);
        return this;
    }

    /**
     * <p>
     * The option to set the maintenance window during the device local time or Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param applyTimeOf
     *        The option to set the maintenance window during the device local time or Universal Coordinated Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplyTimeOf
     */

    public MaintenanceWindow withApplyTimeOf(ApplyTimeOf applyTimeOf) {
        this.applyTimeOf = applyTimeOf.toString();
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getStartTimeHour() != null)
            sb.append("StartTimeHour: ").append(getStartTimeHour()).append(",");
        if (getStartTimeMinute() != null)
            sb.append("StartTimeMinute: ").append(getStartTimeMinute()).append(",");
        if (getEndTimeHour() != null)
            sb.append("EndTimeHour: ").append(getEndTimeHour()).append(",");
        if (getEndTimeMinute() != null)
            sb.append("EndTimeMinute: ").append(getEndTimeMinute()).append(",");
        if (getDaysOfTheWeek() != null)
            sb.append("DaysOfTheWeek: ").append(getDaysOfTheWeek()).append(",");
        if (getApplyTimeOf() != null)
            sb.append("ApplyTimeOf: ").append(getApplyTimeOf());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MaintenanceWindow == false)
            return false;
        MaintenanceWindow other = (MaintenanceWindow) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getStartTimeHour() == null ^ this.getStartTimeHour() == null)
            return false;
        if (other.getStartTimeHour() != null && other.getStartTimeHour().equals(this.getStartTimeHour()) == false)
            return false;
        if (other.getStartTimeMinute() == null ^ this.getStartTimeMinute() == null)
            return false;
        if (other.getStartTimeMinute() != null && other.getStartTimeMinute().equals(this.getStartTimeMinute()) == false)
            return false;
        if (other.getEndTimeHour() == null ^ this.getEndTimeHour() == null)
            return false;
        if (other.getEndTimeHour() != null && other.getEndTimeHour().equals(this.getEndTimeHour()) == false)
            return false;
        if (other.getEndTimeMinute() == null ^ this.getEndTimeMinute() == null)
            return false;
        if (other.getEndTimeMinute() != null && other.getEndTimeMinute().equals(this.getEndTimeMinute()) == false)
            return false;
        if (other.getDaysOfTheWeek() == null ^ this.getDaysOfTheWeek() == null)
            return false;
        if (other.getDaysOfTheWeek() != null && other.getDaysOfTheWeek().equals(this.getDaysOfTheWeek()) == false)
            return false;
        if (other.getApplyTimeOf() == null ^ this.getApplyTimeOf() == null)
            return false;
        if (other.getApplyTimeOf() != null && other.getApplyTimeOf().equals(this.getApplyTimeOf()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getStartTimeHour() == null) ? 0 : getStartTimeHour().hashCode());
        hashCode = prime * hashCode + ((getStartTimeMinute() == null) ? 0 : getStartTimeMinute().hashCode());
        hashCode = prime * hashCode + ((getEndTimeHour() == null) ? 0 : getEndTimeHour().hashCode());
        hashCode = prime * hashCode + ((getEndTimeMinute() == null) ? 0 : getEndTimeMinute().hashCode());
        hashCode = prime * hashCode + ((getDaysOfTheWeek() == null) ? 0 : getDaysOfTheWeek().hashCode());
        hashCode = prime * hashCode + ((getApplyTimeOf() == null) ? 0 : getApplyTimeOf().hashCode());
        return hashCode;
    }

    @Override
    public MaintenanceWindow clone() {
        try {
            return (MaintenanceWindow) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspacesthinclient.model.transform.MaintenanceWindowMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
