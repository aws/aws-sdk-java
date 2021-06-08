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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the time period of which violation events occurred between.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ViolationEventOccurrenceRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The start date and time of a time period in which violation events occurred.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end date and time of a time period in which violation events occurred.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The start date and time of a time period in which violation events occurred.
     * </p>
     * 
     * @param startTime
     *        The start date and time of a time period in which violation events occurred.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start date and time of a time period in which violation events occurred.
     * </p>
     * 
     * @return The start date and time of a time period in which violation events occurred.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start date and time of a time period in which violation events occurred.
     * </p>
     * 
     * @param startTime
     *        The start date and time of a time period in which violation events occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViolationEventOccurrenceRange withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end date and time of a time period in which violation events occurred.
     * </p>
     * 
     * @param endTime
     *        The end date and time of a time period in which violation events occurred.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end date and time of a time period in which violation events occurred.
     * </p>
     * 
     * @return The end date and time of a time period in which violation events occurred.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end date and time of a time period in which violation events occurred.
     * </p>
     * 
     * @param endTime
     *        The end date and time of a time period in which violation events occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViolationEventOccurrenceRange withEndTime(java.util.Date endTime) {
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

        if (obj instanceof ViolationEventOccurrenceRange == false)
            return false;
        ViolationEventOccurrenceRange other = (ViolationEventOccurrenceRange) obj;
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

        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public ViolationEventOccurrenceRange clone() {
        try {
            return (ViolationEventOccurrenceRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.ViolationEventOccurrenceRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
