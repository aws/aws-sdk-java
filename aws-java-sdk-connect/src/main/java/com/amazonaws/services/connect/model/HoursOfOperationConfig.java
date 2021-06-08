/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the hours of operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/HoursOfOperationConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HoursOfOperationConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The day that the hours of operation applies to.
     * </p>
     */
    private String day;
    /**
     * <p>
     * The start time that your contact center is open.
     * </p>
     */
    private HoursOfOperationTimeSlice startTime;
    /**
     * <p>
     * The end time that your contact center is closes.
     * </p>
     */
    private HoursOfOperationTimeSlice endTime;

    /**
     * <p>
     * The day that the hours of operation applies to.
     * </p>
     * 
     * @param day
     *        The day that the hours of operation applies to.
     * @see HoursOfOperationDays
     */

    public void setDay(String day) {
        this.day = day;
    }

    /**
     * <p>
     * The day that the hours of operation applies to.
     * </p>
     * 
     * @return The day that the hours of operation applies to.
     * @see HoursOfOperationDays
     */

    public String getDay() {
        return this.day;
    }

    /**
     * <p>
     * The day that the hours of operation applies to.
     * </p>
     * 
     * @param day
     *        The day that the hours of operation applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HoursOfOperationDays
     */

    public HoursOfOperationConfig withDay(String day) {
        setDay(day);
        return this;
    }

    /**
     * <p>
     * The day that the hours of operation applies to.
     * </p>
     * 
     * @param day
     *        The day that the hours of operation applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HoursOfOperationDays
     */

    public HoursOfOperationConfig withDay(HoursOfOperationDays day) {
        this.day = day.toString();
        return this;
    }

    /**
     * <p>
     * The start time that your contact center is open.
     * </p>
     * 
     * @param startTime
     *        The start time that your contact center is open.
     */

    public void setStartTime(HoursOfOperationTimeSlice startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time that your contact center is open.
     * </p>
     * 
     * @return The start time that your contact center is open.
     */

    public HoursOfOperationTimeSlice getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time that your contact center is open.
     * </p>
     * 
     * @param startTime
     *        The start time that your contact center is open.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HoursOfOperationConfig withStartTime(HoursOfOperationTimeSlice startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end time that your contact center is closes.
     * </p>
     * 
     * @param endTime
     *        The end time that your contact center is closes.
     */

    public void setEndTime(HoursOfOperationTimeSlice endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time that your contact center is closes.
     * </p>
     * 
     * @return The end time that your contact center is closes.
     */

    public HoursOfOperationTimeSlice getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end time that your contact center is closes.
     * </p>
     * 
     * @param endTime
     *        The end time that your contact center is closes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HoursOfOperationConfig withEndTime(HoursOfOperationTimeSlice endTime) {
        setEndTime(endTime);
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
        if (getDay() != null)
            sb.append("Day: ").append(getDay()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HoursOfOperationConfig == false)
            return false;
        HoursOfOperationConfig other = (HoursOfOperationConfig) obj;
        if (other.getDay() == null ^ this.getDay() == null)
            return false;
        if (other.getDay() != null && other.getDay().equals(this.getDay()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDay() == null) ? 0 : getDay().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public HoursOfOperationConfig clone() {
        try {
            return (HoursOfOperationConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.HoursOfOperationConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
