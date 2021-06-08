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
 * The start time or end time for an hours of operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/HoursOfOperationTimeSlice" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HoursOfOperationTimeSlice implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The hours.
     * </p>
     */
    private Integer hours;
    /**
     * <p>
     * The minutes.
     * </p>
     */
    private Integer minutes;

    /**
     * <p>
     * The hours.
     * </p>
     * 
     * @param hours
     *        The hours.
     */

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    /**
     * <p>
     * The hours.
     * </p>
     * 
     * @return The hours.
     */

    public Integer getHours() {
        return this.hours;
    }

    /**
     * <p>
     * The hours.
     * </p>
     * 
     * @param hours
     *        The hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HoursOfOperationTimeSlice withHours(Integer hours) {
        setHours(hours);
        return this;
    }

    /**
     * <p>
     * The minutes.
     * </p>
     * 
     * @param minutes
     *        The minutes.
     */

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    /**
     * <p>
     * The minutes.
     * </p>
     * 
     * @return The minutes.
     */

    public Integer getMinutes() {
        return this.minutes;
    }

    /**
     * <p>
     * The minutes.
     * </p>
     * 
     * @param minutes
     *        The minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HoursOfOperationTimeSlice withMinutes(Integer minutes) {
        setMinutes(minutes);
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
        if (getHours() != null)
            sb.append("Hours: ").append(getHours()).append(",");
        if (getMinutes() != null)
            sb.append("Minutes: ").append(getMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HoursOfOperationTimeSlice == false)
            return false;
        HoursOfOperationTimeSlice other = (HoursOfOperationTimeSlice) obj;
        if (other.getHours() == null ^ this.getHours() == null)
            return false;
        if (other.getHours() != null && other.getHours().equals(this.getHours()) == false)
            return false;
        if (other.getMinutes() == null ^ this.getMinutes() == null)
            return false;
        if (other.getMinutes() != null && other.getMinutes().equals(this.getMinutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHours() == null) ? 0 : getHours().hashCode());
        hashCode = prime * hashCode + ((getMinutes() == null) ? 0 : getMinutes().hashCode());
        return hashCode;
    }

    @Override
    public HoursOfOperationTimeSlice clone() {
        try {
            return (HoursOfOperationTimeSlice) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.HoursOfOperationTimeSliceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
