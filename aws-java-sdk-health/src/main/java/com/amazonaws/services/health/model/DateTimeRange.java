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
package com.amazonaws.services.health.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A range of dates and times that is used by the <a>EventFilter</a> and <a>EntityFilter</a> objects. If
 * <code>from</code> is set and <code>to</code> is set: match items where the timestamp (<code>startTime</code>,
 * <code>endTime</code>, or <code>lastUpdatedTime</code>) is between <code>from</code> and <code>to</code> inclusive. If
 * <code>from</code> is set and <code>to</code> is not set: match items where the timestamp value is equal to or after
 * <code>from</code>. If <code>from</code> is not set and <code>to</code> is set: match items where the timestamp value
 * is equal to or before <code>to</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DateTimeRange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DateTimeRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The starting date and time of a time range.
     * </p>
     */
    private java.util.Date from;
    /**
     * <p>
     * The ending date and time of a time range.
     * </p>
     */
    private java.util.Date to;

    /**
     * <p>
     * The starting date and time of a time range.
     * </p>
     * 
     * @param from
     *        The starting date and time of a time range.
     */

    public void setFrom(java.util.Date from) {
        this.from = from;
    }

    /**
     * <p>
     * The starting date and time of a time range.
     * </p>
     * 
     * @return The starting date and time of a time range.
     */

    public java.util.Date getFrom() {
        return this.from;
    }

    /**
     * <p>
     * The starting date and time of a time range.
     * </p>
     * 
     * @param from
     *        The starting date and time of a time range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DateTimeRange withFrom(java.util.Date from) {
        setFrom(from);
        return this;
    }

    /**
     * <p>
     * The ending date and time of a time range.
     * </p>
     * 
     * @param to
     *        The ending date and time of a time range.
     */

    public void setTo(java.util.Date to) {
        this.to = to;
    }

    /**
     * <p>
     * The ending date and time of a time range.
     * </p>
     * 
     * @return The ending date and time of a time range.
     */

    public java.util.Date getTo() {
        return this.to;
    }

    /**
     * <p>
     * The ending date and time of a time range.
     * </p>
     * 
     * @param to
     *        The ending date and time of a time range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DateTimeRange withTo(java.util.Date to) {
        setTo(to);
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
        if (getFrom() != null)
            sb.append("From: ").append(getFrom()).append(",");
        if (getTo() != null)
            sb.append("To: ").append(getTo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DateTimeRange == false)
            return false;
        DateTimeRange other = (DateTimeRange) obj;
        if (other.getFrom() == null ^ this.getFrom() == null)
            return false;
        if (other.getFrom() != null && other.getFrom().equals(this.getFrom()) == false)
            return false;
        if (other.getTo() == null ^ this.getTo() == null)
            return false;
        if (other.getTo() != null && other.getTo().equals(this.getTo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFrom() == null) ? 0 : getFrom().hashCode());
        hashCode = prime * hashCode + ((getTo() == null) ? 0 : getTo().hashCode());
        return hashCode;
    }

    @Override
    public DateTimeRange clone() {
        try {
            return (DateTimeRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.health.model.transform.DateTimeRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
