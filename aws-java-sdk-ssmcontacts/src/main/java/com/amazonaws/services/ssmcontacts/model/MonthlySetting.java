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
 * Information about on-call rotations that recur monthly.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/MonthlySetting" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MonthlySetting implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The day of the month when monthly recurring on-call rotations begin.
     * </p>
     */
    private Integer dayOfMonth;
    /**
     * <p>
     * The time of day when a monthly recurring on-call shift rotation begins.
     * </p>
     */
    private HandOffTime handOffTime;

    /**
     * <p>
     * The day of the month when monthly recurring on-call rotations begin.
     * </p>
     * 
     * @param dayOfMonth
     *        The day of the month when monthly recurring on-call rotations begin.
     */

    public void setDayOfMonth(Integer dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    /**
     * <p>
     * The day of the month when monthly recurring on-call rotations begin.
     * </p>
     * 
     * @return The day of the month when monthly recurring on-call rotations begin.
     */

    public Integer getDayOfMonth() {
        return this.dayOfMonth;
    }

    /**
     * <p>
     * The day of the month when monthly recurring on-call rotations begin.
     * </p>
     * 
     * @param dayOfMonth
     *        The day of the month when monthly recurring on-call rotations begin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonthlySetting withDayOfMonth(Integer dayOfMonth) {
        setDayOfMonth(dayOfMonth);
        return this;
    }

    /**
     * <p>
     * The time of day when a monthly recurring on-call shift rotation begins.
     * </p>
     * 
     * @param handOffTime
     *        The time of day when a monthly recurring on-call shift rotation begins.
     */

    public void setHandOffTime(HandOffTime handOffTime) {
        this.handOffTime = handOffTime;
    }

    /**
     * <p>
     * The time of day when a monthly recurring on-call shift rotation begins.
     * </p>
     * 
     * @return The time of day when a monthly recurring on-call shift rotation begins.
     */

    public HandOffTime getHandOffTime() {
        return this.handOffTime;
    }

    /**
     * <p>
     * The time of day when a monthly recurring on-call shift rotation begins.
     * </p>
     * 
     * @param handOffTime
     *        The time of day when a monthly recurring on-call shift rotation begins.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonthlySetting withHandOffTime(HandOffTime handOffTime) {
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
        if (getDayOfMonth() != null)
            sb.append("DayOfMonth: ").append(getDayOfMonth()).append(",");
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

        if (obj instanceof MonthlySetting == false)
            return false;
        MonthlySetting other = (MonthlySetting) obj;
        if (other.getDayOfMonth() == null ^ this.getDayOfMonth() == null)
            return false;
        if (other.getDayOfMonth() != null && other.getDayOfMonth().equals(this.getDayOfMonth()) == false)
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

        hashCode = prime * hashCode + ((getDayOfMonth() == null) ? 0 : getDayOfMonth().hashCode());
        hashCode = prime * hashCode + ((getHandOffTime() == null) ? 0 : getHandOffTime().hashCode());
        return hashCode;
    }

    @Override
    public MonthlySetting clone() {
        try {
            return (MonthlySetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmcontacts.model.transform.MonthlySettingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
