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
 * Information about rotations that recur weekly.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/WeeklySetting" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WeeklySetting implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The day of the week when weekly recurring on-call shift rotations begins.
     * </p>
     */
    private String dayOfWeek;
    /**
     * <p>
     * The time of day when a weekly recurring on-call shift rotation begins.
     * </p>
     */
    private HandOffTime handOffTime;

    /**
     * <p>
     * The day of the week when weekly recurring on-call shift rotations begins.
     * </p>
     * 
     * @param dayOfWeek
     *        The day of the week when weekly recurring on-call shift rotations begins.
     * @see DayOfWeek
     */

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    /**
     * <p>
     * The day of the week when weekly recurring on-call shift rotations begins.
     * </p>
     * 
     * @return The day of the week when weekly recurring on-call shift rotations begins.
     * @see DayOfWeek
     */

    public String getDayOfWeek() {
        return this.dayOfWeek;
    }

    /**
     * <p>
     * The day of the week when weekly recurring on-call shift rotations begins.
     * </p>
     * 
     * @param dayOfWeek
     *        The day of the week when weekly recurring on-call shift rotations begins.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DayOfWeek
     */

    public WeeklySetting withDayOfWeek(String dayOfWeek) {
        setDayOfWeek(dayOfWeek);
        return this;
    }

    /**
     * <p>
     * The day of the week when weekly recurring on-call shift rotations begins.
     * </p>
     * 
     * @param dayOfWeek
     *        The day of the week when weekly recurring on-call shift rotations begins.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DayOfWeek
     */

    public WeeklySetting withDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek.toString();
        return this;
    }

    /**
     * <p>
     * The time of day when a weekly recurring on-call shift rotation begins.
     * </p>
     * 
     * @param handOffTime
     *        The time of day when a weekly recurring on-call shift rotation begins.
     */

    public void setHandOffTime(HandOffTime handOffTime) {
        this.handOffTime = handOffTime;
    }

    /**
     * <p>
     * The time of day when a weekly recurring on-call shift rotation begins.
     * </p>
     * 
     * @return The time of day when a weekly recurring on-call shift rotation begins.
     */

    public HandOffTime getHandOffTime() {
        return this.handOffTime;
    }

    /**
     * <p>
     * The time of day when a weekly recurring on-call shift rotation begins.
     * </p>
     * 
     * @param handOffTime
     *        The time of day when a weekly recurring on-call shift rotation begins.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WeeklySetting withHandOffTime(HandOffTime handOffTime) {
        setHandOffTime(handOffTime);
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
        if (getHandOffTime() != null)
            sb.append("HandOffTime: ").append(getHandOffTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WeeklySetting == false)
            return false;
        WeeklySetting other = (WeeklySetting) obj;
        if (other.getDayOfWeek() == null ^ this.getDayOfWeek() == null)
            return false;
        if (other.getDayOfWeek() != null && other.getDayOfWeek().equals(this.getDayOfWeek()) == false)
            return false;
        if (other.getHandOffTime() == null ^ this.getHandOffTime() == null)
            return false;
        if (other.getHandOffTime() != null && other.getHandOffTime().equals(this.getHandOffTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDayOfWeek() == null) ? 0 : getDayOfWeek().hashCode());
        hashCode = prime * hashCode + ((getHandOffTime() == null) ? 0 : getHandOffTime().hashCode());
        return hashCode;
    }

    @Override
    public WeeklySetting clone() {
        try {
            return (WeeklySetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmcontacts.model.transform.WeeklySettingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
