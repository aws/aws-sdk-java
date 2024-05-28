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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The scheduled time period (UTC) during which Amazon MQ begins to apply pending updates or patches to the broker.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsAmazonMqBrokerMaintenanceWindowStartTimeDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsAmazonMqBrokerMaintenanceWindowStartTimeDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The day of the week on which the maintenance window falls.
     * </p>
     */
    private String dayOfWeek;
    /**
     * <p>
     * The time, in 24-hour format, on which the maintenance window falls.
     * </p>
     */
    private String timeOfDay;
    /**
     * <p>
     * The time zone in either the Country/City format or the UTC offset format. UTC is the default format.
     * </p>
     */
    private String timeZone;

    /**
     * <p>
     * The day of the week on which the maintenance window falls.
     * </p>
     * 
     * @param dayOfWeek
     *        The day of the week on which the maintenance window falls.
     */

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    /**
     * <p>
     * The day of the week on which the maintenance window falls.
     * </p>
     * 
     * @return The day of the week on which the maintenance window falls.
     */

    public String getDayOfWeek() {
        return this.dayOfWeek;
    }

    /**
     * <p>
     * The day of the week on which the maintenance window falls.
     * </p>
     * 
     * @param dayOfWeek
     *        The day of the week on which the maintenance window falls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAmazonMqBrokerMaintenanceWindowStartTimeDetails withDayOfWeek(String dayOfWeek) {
        setDayOfWeek(dayOfWeek);
        return this;
    }

    /**
     * <p>
     * The time, in 24-hour format, on which the maintenance window falls.
     * </p>
     * 
     * @param timeOfDay
     *        The time, in 24-hour format, on which the maintenance window falls.
     */

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    /**
     * <p>
     * The time, in 24-hour format, on which the maintenance window falls.
     * </p>
     * 
     * @return The time, in 24-hour format, on which the maintenance window falls.
     */

    public String getTimeOfDay() {
        return this.timeOfDay;
    }

    /**
     * <p>
     * The time, in 24-hour format, on which the maintenance window falls.
     * </p>
     * 
     * @param timeOfDay
     *        The time, in 24-hour format, on which the maintenance window falls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAmazonMqBrokerMaintenanceWindowStartTimeDetails withTimeOfDay(String timeOfDay) {
        setTimeOfDay(timeOfDay);
        return this;
    }

    /**
     * <p>
     * The time zone in either the Country/City format or the UTC offset format. UTC is the default format.
     * </p>
     * 
     * @param timeZone
     *        The time zone in either the Country/City format or the UTC offset format. UTC is the default format.
     */

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    /**
     * <p>
     * The time zone in either the Country/City format or the UTC offset format. UTC is the default format.
     * </p>
     * 
     * @return The time zone in either the Country/City format or the UTC offset format. UTC is the default format.
     */

    public String getTimeZone() {
        return this.timeZone;
    }

    /**
     * <p>
     * The time zone in either the Country/City format or the UTC offset format. UTC is the default format.
     * </p>
     * 
     * @param timeZone
     *        The time zone in either the Country/City format or the UTC offset format. UTC is the default format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAmazonMqBrokerMaintenanceWindowStartTimeDetails withTimeZone(String timeZone) {
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
        if (getDayOfWeek() != null)
            sb.append("DayOfWeek: ").append(getDayOfWeek()).append(",");
        if (getTimeOfDay() != null)
            sb.append("TimeOfDay: ").append(getTimeOfDay()).append(",");
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

        if (obj instanceof AwsAmazonMqBrokerMaintenanceWindowStartTimeDetails == false)
            return false;
        AwsAmazonMqBrokerMaintenanceWindowStartTimeDetails other = (AwsAmazonMqBrokerMaintenanceWindowStartTimeDetails) obj;
        if (other.getDayOfWeek() == null ^ this.getDayOfWeek() == null)
            return false;
        if (other.getDayOfWeek() != null && other.getDayOfWeek().equals(this.getDayOfWeek()) == false)
            return false;
        if (other.getTimeOfDay() == null ^ this.getTimeOfDay() == null)
            return false;
        if (other.getTimeOfDay() != null && other.getTimeOfDay().equals(this.getTimeOfDay()) == false)
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

        hashCode = prime * hashCode + ((getDayOfWeek() == null) ? 0 : getDayOfWeek().hashCode());
        hashCode = prime * hashCode + ((getTimeOfDay() == null) ? 0 : getTimeOfDay().hashCode());
        hashCode = prime * hashCode + ((getTimeZone() == null) ? 0 : getTimeZone().hashCode());
        return hashCode;
    }

    @Override
    public AwsAmazonMqBrokerMaintenanceWindowStartTimeDetails clone() {
        try {
            return (AwsAmazonMqBrokerMaintenanceWindowStartTimeDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsAmazonMqBrokerMaintenanceWindowStartTimeDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
