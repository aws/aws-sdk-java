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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The time range during which an AWS event occurred. AWS resource events and metrics are analyzed by DevOps Guru to
 * find anomalous behavior and provide recommendations to improve your operational solutions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/EventTimeRange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventTimeRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time when the event started.
     * </p>
     */
    private java.util.Date fromTime;
    /**
     * <p>
     * The time when the event ended.
     * </p>
     */
    private java.util.Date toTime;

    /**
     * <p>
     * The time when the event started.
     * </p>
     * 
     * @param fromTime
     *        The time when the event started.
     */

    public void setFromTime(java.util.Date fromTime) {
        this.fromTime = fromTime;
    }

    /**
     * <p>
     * The time when the event started.
     * </p>
     * 
     * @return The time when the event started.
     */

    public java.util.Date getFromTime() {
        return this.fromTime;
    }

    /**
     * <p>
     * The time when the event started.
     * </p>
     * 
     * @param fromTime
     *        The time when the event started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventTimeRange withFromTime(java.util.Date fromTime) {
        setFromTime(fromTime);
        return this;
    }

    /**
     * <p>
     * The time when the event ended.
     * </p>
     * 
     * @param toTime
     *        The time when the event ended.
     */

    public void setToTime(java.util.Date toTime) {
        this.toTime = toTime;
    }

    /**
     * <p>
     * The time when the event ended.
     * </p>
     * 
     * @return The time when the event ended.
     */

    public java.util.Date getToTime() {
        return this.toTime;
    }

    /**
     * <p>
     * The time when the event ended.
     * </p>
     * 
     * @param toTime
     *        The time when the event ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventTimeRange withToTime(java.util.Date toTime) {
        setToTime(toTime);
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
        if (getFromTime() != null)
            sb.append("FromTime: ").append(getFromTime()).append(",");
        if (getToTime() != null)
            sb.append("ToTime: ").append(getToTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventTimeRange == false)
            return false;
        EventTimeRange other = (EventTimeRange) obj;
        if (other.getFromTime() == null ^ this.getFromTime() == null)
            return false;
        if (other.getFromTime() != null && other.getFromTime().equals(this.getFromTime()) == false)
            return false;
        if (other.getToTime() == null ^ this.getToTime() == null)
            return false;
        if (other.getToTime() != null && other.getToTime().equals(this.getToTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFromTime() == null) ? 0 : getFromTime().hashCode());
        hashCode = prime * hashCode + ((getToTime() == null) ? 0 : getToTime().hashCode());
        return hashCode;
    }

    @Override
    public EventTimeRange clone() {
        try {
            return (EventTimeRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.EventTimeRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
