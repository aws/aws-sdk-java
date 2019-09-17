/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Specifies the start and end times that define a time range when messages aren't sent to endpoints.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/QuietTime" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QuietTime implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The specific time when quiet time ends. This value has to use 24-hour notation and be in HH:MM format, where HH
     * is the hour (with a leading zero, if applicable) and MM is the minutes. For example, use 02:30 to represent 2:30
     * AM, or 14:30 to represent 2:30 PM.
     * </p>
     */
    private String end;
    /**
     * <p>
     * The specific time when quiet time begins. This value has to use 24-hour notation and be in HH:MM format, where HH
     * is the hour (with a leading zero, if applicable) and MM is the minutes. For example, use 02:30 to represent 2:30
     * AM, or 14:30 to represent 2:30 PM.
     * </p>
     */
    private String start;

    /**
     * <p>
     * The specific time when quiet time ends. This value has to use 24-hour notation and be in HH:MM format, where HH
     * is the hour (with a leading zero, if applicable) and MM is the minutes. For example, use 02:30 to represent 2:30
     * AM, or 14:30 to represent 2:30 PM.
     * </p>
     * 
     * @param end
     *        The specific time when quiet time ends. This value has to use 24-hour notation and be in HH:MM format,
     *        where HH is the hour (with a leading zero, if applicable) and MM is the minutes. For example, use 02:30 to
     *        represent 2:30 AM, or 14:30 to represent 2:30 PM.
     */

    public void setEnd(String end) {
        this.end = end;
    }

    /**
     * <p>
     * The specific time when quiet time ends. This value has to use 24-hour notation and be in HH:MM format, where HH
     * is the hour (with a leading zero, if applicable) and MM is the minutes. For example, use 02:30 to represent 2:30
     * AM, or 14:30 to represent 2:30 PM.
     * </p>
     * 
     * @return The specific time when quiet time ends. This value has to use 24-hour notation and be in HH:MM format,
     *         where HH is the hour (with a leading zero, if applicable) and MM is the minutes. For example, use 02:30
     *         to represent 2:30 AM, or 14:30 to represent 2:30 PM.
     */

    public String getEnd() {
        return this.end;
    }

    /**
     * <p>
     * The specific time when quiet time ends. This value has to use 24-hour notation and be in HH:MM format, where HH
     * is the hour (with a leading zero, if applicable) and MM is the minutes. For example, use 02:30 to represent 2:30
     * AM, or 14:30 to represent 2:30 PM.
     * </p>
     * 
     * @param end
     *        The specific time when quiet time ends. This value has to use 24-hour notation and be in HH:MM format,
     *        where HH is the hour (with a leading zero, if applicable) and MM is the minutes. For example, use 02:30 to
     *        represent 2:30 AM, or 14:30 to represent 2:30 PM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuietTime withEnd(String end) {
        setEnd(end);
        return this;
    }

    /**
     * <p>
     * The specific time when quiet time begins. This value has to use 24-hour notation and be in HH:MM format, where HH
     * is the hour (with a leading zero, if applicable) and MM is the minutes. For example, use 02:30 to represent 2:30
     * AM, or 14:30 to represent 2:30 PM.
     * </p>
     * 
     * @param start
     *        The specific time when quiet time begins. This value has to use 24-hour notation and be in HH:MM format,
     *        where HH is the hour (with a leading zero, if applicable) and MM is the minutes. For example, use 02:30 to
     *        represent 2:30 AM, or 14:30 to represent 2:30 PM.
     */

    public void setStart(String start) {
        this.start = start;
    }

    /**
     * <p>
     * The specific time when quiet time begins. This value has to use 24-hour notation and be in HH:MM format, where HH
     * is the hour (with a leading zero, if applicable) and MM is the minutes. For example, use 02:30 to represent 2:30
     * AM, or 14:30 to represent 2:30 PM.
     * </p>
     * 
     * @return The specific time when quiet time begins. This value has to use 24-hour notation and be in HH:MM format,
     *         where HH is the hour (with a leading zero, if applicable) and MM is the minutes. For example, use 02:30
     *         to represent 2:30 AM, or 14:30 to represent 2:30 PM.
     */

    public String getStart() {
        return this.start;
    }

    /**
     * <p>
     * The specific time when quiet time begins. This value has to use 24-hour notation and be in HH:MM format, where HH
     * is the hour (with a leading zero, if applicable) and MM is the minutes. For example, use 02:30 to represent 2:30
     * AM, or 14:30 to represent 2:30 PM.
     * </p>
     * 
     * @param start
     *        The specific time when quiet time begins. This value has to use 24-hour notation and be in HH:MM format,
     *        where HH is the hour (with a leading zero, if applicable) and MM is the minutes. For example, use 02:30 to
     *        represent 2:30 AM, or 14:30 to represent 2:30 PM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuietTime withStart(String start) {
        setStart(start);
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
        if (getEnd() != null)
            sb.append("End: ").append(getEnd()).append(",");
        if (getStart() != null)
            sb.append("Start: ").append(getStart());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QuietTime == false)
            return false;
        QuietTime other = (QuietTime) obj;
        if (other.getEnd() == null ^ this.getEnd() == null)
            return false;
        if (other.getEnd() != null && other.getEnd().equals(this.getEnd()) == false)
            return false;
        if (other.getStart() == null ^ this.getStart() == null)
            return false;
        if (other.getStart() != null && other.getStart().equals(this.getStart()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnd() == null) ? 0 : getEnd().hashCode());
        hashCode = prime * hashCode + ((getStart() == null) ? 0 : getStart().hashCode());
        return hashCode;
    }

    @Override
    public QuietTime clone() {
        try {
            return (QuietTime) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.QuietTimeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
