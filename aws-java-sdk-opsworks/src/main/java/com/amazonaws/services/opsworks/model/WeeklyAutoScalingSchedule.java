/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a time-based instance's auto scaling schedule. The schedule consists of a set of key-value pairs.
 * </p>
 * <ul>
 * <li>
 * <p>
 * The key is the time period (a UTC hour) and must be an integer from 0 - 23.
 * </p>
 * </li>
 * <li>
 * <p>
 * The value indicates whether the instance should be online or offline for the specified period, and must be set to
 * "on" or "off"
 * </p>
 * </li>
 * </ul>
 * <p>
 * The default setting for all time periods is off, so you use the following parameters primarily to specify the online
 * periods. You don't have to explicitly specify offline periods unless you want to change an online period to an
 * offline period.
 * </p>
 * <p>
 * The following example specifies that the instance should be online for four hours, from UTC 1200 - 1600. It will be
 * off for the remainder of the day.
 * </p>
 * <p>
 * <code> { "12":"on", "13":"on", "14":"on", "15":"on" } </code>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/WeeklyAutoScalingSchedule" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WeeklyAutoScalingSchedule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The schedule for Monday.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> monday;
    /**
     * <p>
     * The schedule for Tuesday.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> tuesday;
    /**
     * <p>
     * The schedule for Wednesday.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> wednesday;
    /**
     * <p>
     * The schedule for Thursday.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> thursday;
    /**
     * <p>
     * The schedule for Friday.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> friday;
    /**
     * <p>
     * The schedule for Saturday.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> saturday;
    /**
     * <p>
     * The schedule for Sunday.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> sunday;

    /**
     * <p>
     * The schedule for Monday.
     * </p>
     * 
     * @return The schedule for Monday.
     */

    public java.util.Map<String, String> getMonday() {
        if (monday == null) {
            monday = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return monday;
    }

    /**
     * <p>
     * The schedule for Monday.
     * </p>
     * 
     * @param monday
     *        The schedule for Monday.
     */

    public void setMonday(java.util.Map<String, String> monday) {
        this.monday = monday == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(monday);
    }

    /**
     * <p>
     * The schedule for Monday.
     * </p>
     * 
     * @param monday
     *        The schedule for Monday.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WeeklyAutoScalingSchedule withMonday(java.util.Map<String, String> monday) {
        setMonday(monday);
        return this;
    }

    public WeeklyAutoScalingSchedule addMondayEntry(String key, String value) {
        if (null == this.monday) {
            this.monday = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.monday.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.monday.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Monday.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WeeklyAutoScalingSchedule clearMondayEntries() {
        this.monday = null;
        return this;
    }

    /**
     * <p>
     * The schedule for Tuesday.
     * </p>
     * 
     * @return The schedule for Tuesday.
     */

    public java.util.Map<String, String> getTuesday() {
        if (tuesday == null) {
            tuesday = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return tuesday;
    }

    /**
     * <p>
     * The schedule for Tuesday.
     * </p>
     * 
     * @param tuesday
     *        The schedule for Tuesday.
     */

    public void setTuesday(java.util.Map<String, String> tuesday) {
        this.tuesday = tuesday == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(tuesday);
    }

    /**
     * <p>
     * The schedule for Tuesday.
     * </p>
     * 
     * @param tuesday
     *        The schedule for Tuesday.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WeeklyAutoScalingSchedule withTuesday(java.util.Map<String, String> tuesday) {
        setTuesday(tuesday);
        return this;
    }

    public WeeklyAutoScalingSchedule addTuesdayEntry(String key, String value) {
        if (null == this.tuesday) {
            this.tuesday = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.tuesday.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tuesday.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tuesday.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WeeklyAutoScalingSchedule clearTuesdayEntries() {
        this.tuesday = null;
        return this;
    }

    /**
     * <p>
     * The schedule for Wednesday.
     * </p>
     * 
     * @return The schedule for Wednesday.
     */

    public java.util.Map<String, String> getWednesday() {
        if (wednesday == null) {
            wednesday = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return wednesday;
    }

    /**
     * <p>
     * The schedule for Wednesday.
     * </p>
     * 
     * @param wednesday
     *        The schedule for Wednesday.
     */

    public void setWednesday(java.util.Map<String, String> wednesday) {
        this.wednesday = wednesday == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(wednesday);
    }

    /**
     * <p>
     * The schedule for Wednesday.
     * </p>
     * 
     * @param wednesday
     *        The schedule for Wednesday.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WeeklyAutoScalingSchedule withWednesday(java.util.Map<String, String> wednesday) {
        setWednesday(wednesday);
        return this;
    }

    public WeeklyAutoScalingSchedule addWednesdayEntry(String key, String value) {
        if (null == this.wednesday) {
            this.wednesday = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.wednesday.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.wednesday.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Wednesday.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WeeklyAutoScalingSchedule clearWednesdayEntries() {
        this.wednesday = null;
        return this;
    }

    /**
     * <p>
     * The schedule for Thursday.
     * </p>
     * 
     * @return The schedule for Thursday.
     */

    public java.util.Map<String, String> getThursday() {
        if (thursday == null) {
            thursday = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return thursday;
    }

    /**
     * <p>
     * The schedule for Thursday.
     * </p>
     * 
     * @param thursday
     *        The schedule for Thursday.
     */

    public void setThursday(java.util.Map<String, String> thursday) {
        this.thursday = thursday == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(thursday);
    }

    /**
     * <p>
     * The schedule for Thursday.
     * </p>
     * 
     * @param thursday
     *        The schedule for Thursday.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WeeklyAutoScalingSchedule withThursday(java.util.Map<String, String> thursday) {
        setThursday(thursday);
        return this;
    }

    public WeeklyAutoScalingSchedule addThursdayEntry(String key, String value) {
        if (null == this.thursday) {
            this.thursday = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.thursday.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.thursday.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Thursday.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WeeklyAutoScalingSchedule clearThursdayEntries() {
        this.thursday = null;
        return this;
    }

    /**
     * <p>
     * The schedule for Friday.
     * </p>
     * 
     * @return The schedule for Friday.
     */

    public java.util.Map<String, String> getFriday() {
        if (friday == null) {
            friday = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return friday;
    }

    /**
     * <p>
     * The schedule for Friday.
     * </p>
     * 
     * @param friday
     *        The schedule for Friday.
     */

    public void setFriday(java.util.Map<String, String> friday) {
        this.friday = friday == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(friday);
    }

    /**
     * <p>
     * The schedule for Friday.
     * </p>
     * 
     * @param friday
     *        The schedule for Friday.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WeeklyAutoScalingSchedule withFriday(java.util.Map<String, String> friday) {
        setFriday(friday);
        return this;
    }

    public WeeklyAutoScalingSchedule addFridayEntry(String key, String value) {
        if (null == this.friday) {
            this.friday = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.friday.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.friday.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Friday.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WeeklyAutoScalingSchedule clearFridayEntries() {
        this.friday = null;
        return this;
    }

    /**
     * <p>
     * The schedule for Saturday.
     * </p>
     * 
     * @return The schedule for Saturday.
     */

    public java.util.Map<String, String> getSaturday() {
        if (saturday == null) {
            saturday = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return saturday;
    }

    /**
     * <p>
     * The schedule for Saturday.
     * </p>
     * 
     * @param saturday
     *        The schedule for Saturday.
     */

    public void setSaturday(java.util.Map<String, String> saturday) {
        this.saturday = saturday == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(saturday);
    }

    /**
     * <p>
     * The schedule for Saturday.
     * </p>
     * 
     * @param saturday
     *        The schedule for Saturday.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WeeklyAutoScalingSchedule withSaturday(java.util.Map<String, String> saturday) {
        setSaturday(saturday);
        return this;
    }

    public WeeklyAutoScalingSchedule addSaturdayEntry(String key, String value) {
        if (null == this.saturday) {
            this.saturday = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.saturday.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.saturday.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Saturday.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WeeklyAutoScalingSchedule clearSaturdayEntries() {
        this.saturday = null;
        return this;
    }

    /**
     * <p>
     * The schedule for Sunday.
     * </p>
     * 
     * @return The schedule for Sunday.
     */

    public java.util.Map<String, String> getSunday() {
        if (sunday == null) {
            sunday = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return sunday;
    }

    /**
     * <p>
     * The schedule for Sunday.
     * </p>
     * 
     * @param sunday
     *        The schedule for Sunday.
     */

    public void setSunday(java.util.Map<String, String> sunday) {
        this.sunday = sunday == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(sunday);
    }

    /**
     * <p>
     * The schedule for Sunday.
     * </p>
     * 
     * @param sunday
     *        The schedule for Sunday.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WeeklyAutoScalingSchedule withSunday(java.util.Map<String, String> sunday) {
        setSunday(sunday);
        return this;
    }

    public WeeklyAutoScalingSchedule addSundayEntry(String key, String value) {
        if (null == this.sunday) {
            this.sunday = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.sunday.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.sunday.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Sunday.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WeeklyAutoScalingSchedule clearSundayEntries() {
        this.sunday = null;
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
        if (getMonday() != null)
            sb.append("Monday: ").append(getMonday()).append(",");
        if (getTuesday() != null)
            sb.append("Tuesday: ").append(getTuesday()).append(",");
        if (getWednesday() != null)
            sb.append("Wednesday: ").append(getWednesday()).append(",");
        if (getThursday() != null)
            sb.append("Thursday: ").append(getThursday()).append(",");
        if (getFriday() != null)
            sb.append("Friday: ").append(getFriday()).append(",");
        if (getSaturday() != null)
            sb.append("Saturday: ").append(getSaturday()).append(",");
        if (getSunday() != null)
            sb.append("Sunday: ").append(getSunday());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WeeklyAutoScalingSchedule == false)
            return false;
        WeeklyAutoScalingSchedule other = (WeeklyAutoScalingSchedule) obj;
        if (other.getMonday() == null ^ this.getMonday() == null)
            return false;
        if (other.getMonday() != null && other.getMonday().equals(this.getMonday()) == false)
            return false;
        if (other.getTuesday() == null ^ this.getTuesday() == null)
            return false;
        if (other.getTuesday() != null && other.getTuesday().equals(this.getTuesday()) == false)
            return false;
        if (other.getWednesday() == null ^ this.getWednesday() == null)
            return false;
        if (other.getWednesday() != null && other.getWednesday().equals(this.getWednesday()) == false)
            return false;
        if (other.getThursday() == null ^ this.getThursday() == null)
            return false;
        if (other.getThursday() != null && other.getThursday().equals(this.getThursday()) == false)
            return false;
        if (other.getFriday() == null ^ this.getFriday() == null)
            return false;
        if (other.getFriday() != null && other.getFriday().equals(this.getFriday()) == false)
            return false;
        if (other.getSaturday() == null ^ this.getSaturday() == null)
            return false;
        if (other.getSaturday() != null && other.getSaturday().equals(this.getSaturday()) == false)
            return false;
        if (other.getSunday() == null ^ this.getSunday() == null)
            return false;
        if (other.getSunday() != null && other.getSunday().equals(this.getSunday()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMonday() == null) ? 0 : getMonday().hashCode());
        hashCode = prime * hashCode + ((getTuesday() == null) ? 0 : getTuesday().hashCode());
        hashCode = prime * hashCode + ((getWednesday() == null) ? 0 : getWednesday().hashCode());
        hashCode = prime * hashCode + ((getThursday() == null) ? 0 : getThursday().hashCode());
        hashCode = prime * hashCode + ((getFriday() == null) ? 0 : getFriday().hashCode());
        hashCode = prime * hashCode + ((getSaturday() == null) ? 0 : getSaturday().hashCode());
        hashCode = prime * hashCode + ((getSunday() == null) ? 0 : getSunday().hashCode());
        return hashCode;
    }

    @Override
    public WeeklyAutoScalingSchedule clone() {
        try {
            return (WeeklyAutoScalingSchedule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opsworks.model.transform.WeeklyAutoScalingScheduleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
