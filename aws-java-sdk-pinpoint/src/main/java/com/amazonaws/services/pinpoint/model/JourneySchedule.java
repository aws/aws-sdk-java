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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the schedule settings for a journey.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/JourneySchedule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JourneySchedule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The scheduled time, in ISO 8601 format, when the journey ended or will end.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The scheduled time, in ISO 8601 format, when the journey began or will begin.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The starting UTC offset for the journey schedule, if the value of the journey's LocalTime property is true. Valid
     * values are: UTC, UTC+01, UTC+02, UTC+03, UTC+03:30, UTC+04, UTC+04:30, UTC+05, UTC+05:30, UTC+05:45, UTC+06,
     * UTC+06:30, UTC+07, UTC+08, UTC+08:45, UTC+09, UTC+09:30, UTC+10, UTC+10:30, UTC+11, UTC+12, UTC+12:45, UTC+13,
     * UTC+13:45, UTC-02, UTC-02:30, UTC-03, UTC-03:30, UTC-04, UTC-05, UTC-06, UTC-07, UTC-08, UTC-09, UTC-09:30,
     * UTC-10, and UTC-11.
     * </p>
     */
    private String timezone;

    /**
     * <p>
     * The scheduled time, in ISO 8601 format, when the journey ended or will end.
     * </p>
     * 
     * @param endTime
     *        The scheduled time, in ISO 8601 format, when the journey ended or will end.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The scheduled time, in ISO 8601 format, when the journey ended or will end.
     * </p>
     * 
     * @return The scheduled time, in ISO 8601 format, when the journey ended or will end.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The scheduled time, in ISO 8601 format, when the journey ended or will end.
     * </p>
     * 
     * @param endTime
     *        The scheduled time, in ISO 8601 format, when the journey ended or will end.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JourneySchedule withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The scheduled time, in ISO 8601 format, when the journey began or will begin.
     * </p>
     * 
     * @param startTime
     *        The scheduled time, in ISO 8601 format, when the journey began or will begin.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The scheduled time, in ISO 8601 format, when the journey began or will begin.
     * </p>
     * 
     * @return The scheduled time, in ISO 8601 format, when the journey began or will begin.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The scheduled time, in ISO 8601 format, when the journey began or will begin.
     * </p>
     * 
     * @param startTime
     *        The scheduled time, in ISO 8601 format, when the journey began or will begin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JourneySchedule withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The starting UTC offset for the journey schedule, if the value of the journey's LocalTime property is true. Valid
     * values are: UTC, UTC+01, UTC+02, UTC+03, UTC+03:30, UTC+04, UTC+04:30, UTC+05, UTC+05:30, UTC+05:45, UTC+06,
     * UTC+06:30, UTC+07, UTC+08, UTC+08:45, UTC+09, UTC+09:30, UTC+10, UTC+10:30, UTC+11, UTC+12, UTC+12:45, UTC+13,
     * UTC+13:45, UTC-02, UTC-02:30, UTC-03, UTC-03:30, UTC-04, UTC-05, UTC-06, UTC-07, UTC-08, UTC-09, UTC-09:30,
     * UTC-10, and UTC-11.
     * </p>
     * 
     * @param timezone
     *        The starting UTC offset for the journey schedule, if the value of the journey's LocalTime property is
     *        true. Valid values are: UTC, UTC+01, UTC+02, UTC+03, UTC+03:30, UTC+04, UTC+04:30, UTC+05, UTC+05:30,
     *        UTC+05:45, UTC+06, UTC+06:30, UTC+07, UTC+08, UTC+08:45, UTC+09, UTC+09:30, UTC+10, UTC+10:30, UTC+11,
     *        UTC+12, UTC+12:45, UTC+13, UTC+13:45, UTC-02, UTC-02:30, UTC-03, UTC-03:30, UTC-04, UTC-05, UTC-06,
     *        UTC-07, UTC-08, UTC-09, UTC-09:30, UTC-10, and UTC-11.
     */

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * The starting UTC offset for the journey schedule, if the value of the journey's LocalTime property is true. Valid
     * values are: UTC, UTC+01, UTC+02, UTC+03, UTC+03:30, UTC+04, UTC+04:30, UTC+05, UTC+05:30, UTC+05:45, UTC+06,
     * UTC+06:30, UTC+07, UTC+08, UTC+08:45, UTC+09, UTC+09:30, UTC+10, UTC+10:30, UTC+11, UTC+12, UTC+12:45, UTC+13,
     * UTC+13:45, UTC-02, UTC-02:30, UTC-03, UTC-03:30, UTC-04, UTC-05, UTC-06, UTC-07, UTC-08, UTC-09, UTC-09:30,
     * UTC-10, and UTC-11.
     * </p>
     * 
     * @return The starting UTC offset for the journey schedule, if the value of the journey's LocalTime property is
     *         true. Valid values are: UTC, UTC+01, UTC+02, UTC+03, UTC+03:30, UTC+04, UTC+04:30, UTC+05, UTC+05:30,
     *         UTC+05:45, UTC+06, UTC+06:30, UTC+07, UTC+08, UTC+08:45, UTC+09, UTC+09:30, UTC+10, UTC+10:30, UTC+11,
     *         UTC+12, UTC+12:45, UTC+13, UTC+13:45, UTC-02, UTC-02:30, UTC-03, UTC-03:30, UTC-04, UTC-05, UTC-06,
     *         UTC-07, UTC-08, UTC-09, UTC-09:30, UTC-10, and UTC-11.
     */

    public String getTimezone() {
        return this.timezone;
    }

    /**
     * <p>
     * The starting UTC offset for the journey schedule, if the value of the journey's LocalTime property is true. Valid
     * values are: UTC, UTC+01, UTC+02, UTC+03, UTC+03:30, UTC+04, UTC+04:30, UTC+05, UTC+05:30, UTC+05:45, UTC+06,
     * UTC+06:30, UTC+07, UTC+08, UTC+08:45, UTC+09, UTC+09:30, UTC+10, UTC+10:30, UTC+11, UTC+12, UTC+12:45, UTC+13,
     * UTC+13:45, UTC-02, UTC-02:30, UTC-03, UTC-03:30, UTC-04, UTC-05, UTC-06, UTC-07, UTC-08, UTC-09, UTC-09:30,
     * UTC-10, and UTC-11.
     * </p>
     * 
     * @param timezone
     *        The starting UTC offset for the journey schedule, if the value of the journey's LocalTime property is
     *        true. Valid values are: UTC, UTC+01, UTC+02, UTC+03, UTC+03:30, UTC+04, UTC+04:30, UTC+05, UTC+05:30,
     *        UTC+05:45, UTC+06, UTC+06:30, UTC+07, UTC+08, UTC+08:45, UTC+09, UTC+09:30, UTC+10, UTC+10:30, UTC+11,
     *        UTC+12, UTC+12:45, UTC+13, UTC+13:45, UTC-02, UTC-02:30, UTC-03, UTC-03:30, UTC-04, UTC-05, UTC-06,
     *        UTC-07, UTC-08, UTC-09, UTC-09:30, UTC-10, and UTC-11.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JourneySchedule withTimezone(String timezone) {
        setTimezone(timezone);
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
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
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

        if (obj instanceof JourneySchedule == false)
            return false;
        JourneySchedule other = (JourneySchedule) obj;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
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

        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        return hashCode;
    }

    @Override
    public JourneySchedule clone() {
        try {
            return (JourneySchedule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.JourneyScheduleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
