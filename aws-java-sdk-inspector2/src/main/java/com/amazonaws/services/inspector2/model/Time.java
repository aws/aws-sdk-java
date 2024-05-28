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
 * The time.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/Time" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Time implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time of day in 24-hour format (00:00).
     * </p>
     */
    private String timeOfDay;
    /**
     * <p>
     * The timezone.
     * </p>
     */
    private String timezone;

    /**
     * <p>
     * The time of day in 24-hour format (00:00).
     * </p>
     * 
     * @param timeOfDay
     *        The time of day in 24-hour format (00:00).
     */

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    /**
     * <p>
     * The time of day in 24-hour format (00:00).
     * </p>
     * 
     * @return The time of day in 24-hour format (00:00).
     */

    public String getTimeOfDay() {
        return this.timeOfDay;
    }

    /**
     * <p>
     * The time of day in 24-hour format (00:00).
     * </p>
     * 
     * @param timeOfDay
     *        The time of day in 24-hour format (00:00).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Time withTimeOfDay(String timeOfDay) {
        setTimeOfDay(timeOfDay);
        return this;
    }

    /**
     * <p>
     * The timezone.
     * </p>
     * 
     * @param timezone
     *        The timezone.
     */

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * The timezone.
     * </p>
     * 
     * @return The timezone.
     */

    public String getTimezone() {
        return this.timezone;
    }

    /**
     * <p>
     * The timezone.
     * </p>
     * 
     * @param timezone
     *        The timezone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Time withTimezone(String timezone) {
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
        if (getTimeOfDay() != null)
            sb.append("TimeOfDay: ").append(getTimeOfDay()).append(",");
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

        if (obj instanceof Time == false)
            return false;
        Time other = (Time) obj;
        if (other.getTimeOfDay() == null ^ this.getTimeOfDay() == null)
            return false;
        if (other.getTimeOfDay() != null && other.getTimeOfDay().equals(this.getTimeOfDay()) == false)
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

        hashCode = prime * hashCode + ((getTimeOfDay() == null) ? 0 : getTimeOfDay().hashCode());
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        return hashCode;
    }

    @Override
    public Time clone() {
        try {
            return (Time) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.TimeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
