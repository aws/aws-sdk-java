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
package com.amazonaws.services.ssmcontacts.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about when an on-call rotation shift begins or ends.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/HandOffTime" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HandOffTime implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The hour when an on-call rotation shift begins or ends.
     * </p>
     */
    private Integer hourOfDay;
    /**
     * <p>
     * The minute when an on-call rotation shift begins or ends.
     * </p>
     */
    private Integer minuteOfHour;

    /**
     * <p>
     * The hour when an on-call rotation shift begins or ends.
     * </p>
     * 
     * @param hourOfDay
     *        The hour when an on-call rotation shift begins or ends.
     */

    public void setHourOfDay(Integer hourOfDay) {
        this.hourOfDay = hourOfDay;
    }

    /**
     * <p>
     * The hour when an on-call rotation shift begins or ends.
     * </p>
     * 
     * @return The hour when an on-call rotation shift begins or ends.
     */

    public Integer getHourOfDay() {
        return this.hourOfDay;
    }

    /**
     * <p>
     * The hour when an on-call rotation shift begins or ends.
     * </p>
     * 
     * @param hourOfDay
     *        The hour when an on-call rotation shift begins or ends.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HandOffTime withHourOfDay(Integer hourOfDay) {
        setHourOfDay(hourOfDay);
        return this;
    }

    /**
     * <p>
     * The minute when an on-call rotation shift begins or ends.
     * </p>
     * 
     * @param minuteOfHour
     *        The minute when an on-call rotation shift begins or ends.
     */

    public void setMinuteOfHour(Integer minuteOfHour) {
        this.minuteOfHour = minuteOfHour;
    }

    /**
     * <p>
     * The minute when an on-call rotation shift begins or ends.
     * </p>
     * 
     * @return The minute when an on-call rotation shift begins or ends.
     */

    public Integer getMinuteOfHour() {
        return this.minuteOfHour;
    }

    /**
     * <p>
     * The minute when an on-call rotation shift begins or ends.
     * </p>
     * 
     * @param minuteOfHour
     *        The minute when an on-call rotation shift begins or ends.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HandOffTime withMinuteOfHour(Integer minuteOfHour) {
        setMinuteOfHour(minuteOfHour);
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
        if (getHourOfDay() != null)
            sb.append("HourOfDay: ").append(getHourOfDay()).append(",");
        if (getMinuteOfHour() != null)
            sb.append("MinuteOfHour: ").append(getMinuteOfHour());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HandOffTime == false)
            return false;
        HandOffTime other = (HandOffTime) obj;
        if (other.getHourOfDay() == null ^ this.getHourOfDay() == null)
            return false;
        if (other.getHourOfDay() != null && other.getHourOfDay().equals(this.getHourOfDay()) == false)
            return false;
        if (other.getMinuteOfHour() == null ^ this.getMinuteOfHour() == null)
            return false;
        if (other.getMinuteOfHour() != null && other.getMinuteOfHour().equals(this.getMinuteOfHour()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHourOfDay() == null) ? 0 : getHourOfDay().hashCode());
        hashCode = prime * hashCode + ((getMinuteOfHour() == null) ? 0 : getMinuteOfHour().hashCode());
        return hashCode;
    }

    @Override
    public HandOffTime clone() {
        try {
            return (HandOffTime) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmcontacts.model.transform.HandOffTimeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
