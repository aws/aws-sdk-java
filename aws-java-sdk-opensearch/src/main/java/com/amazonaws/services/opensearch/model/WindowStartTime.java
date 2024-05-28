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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The desired start time for an <a
 * href="https://docs.aws.amazon.com/opensearch-service/latest/APIReference/API_OffPeakWindow.html">off-peak maintenance
 * window</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WindowStartTime implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The start hour of the window in Coordinated Universal Time (UTC), using 24-hour time. For example,
     * <code>17</code> refers to 5:00 P.M. UTC.
     * </p>
     */
    private Long hours;
    /**
     * <p>
     * The start minute of the window, in UTC.
     * </p>
     */
    private Long minutes;

    /**
     * <p>
     * The start hour of the window in Coordinated Universal Time (UTC), using 24-hour time. For example,
     * <code>17</code> refers to 5:00 P.M. UTC.
     * </p>
     * 
     * @param hours
     *        The start hour of the window in Coordinated Universal Time (UTC), using 24-hour time. For example,
     *        <code>17</code> refers to 5:00 P.M. UTC.
     */

    public void setHours(Long hours) {
        this.hours = hours;
    }

    /**
     * <p>
     * The start hour of the window in Coordinated Universal Time (UTC), using 24-hour time. For example,
     * <code>17</code> refers to 5:00 P.M. UTC.
     * </p>
     * 
     * @return The start hour of the window in Coordinated Universal Time (UTC), using 24-hour time. For example,
     *         <code>17</code> refers to 5:00 P.M. UTC.
     */

    public Long getHours() {
        return this.hours;
    }

    /**
     * <p>
     * The start hour of the window in Coordinated Universal Time (UTC), using 24-hour time. For example,
     * <code>17</code> refers to 5:00 P.M. UTC.
     * </p>
     * 
     * @param hours
     *        The start hour of the window in Coordinated Universal Time (UTC), using 24-hour time. For example,
     *        <code>17</code> refers to 5:00 P.M. UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WindowStartTime withHours(Long hours) {
        setHours(hours);
        return this;
    }

    /**
     * <p>
     * The start minute of the window, in UTC.
     * </p>
     * 
     * @param minutes
     *        The start minute of the window, in UTC.
     */

    public void setMinutes(Long minutes) {
        this.minutes = minutes;
    }

    /**
     * <p>
     * The start minute of the window, in UTC.
     * </p>
     * 
     * @return The start minute of the window, in UTC.
     */

    public Long getMinutes() {
        return this.minutes;
    }

    /**
     * <p>
     * The start minute of the window, in UTC.
     * </p>
     * 
     * @param minutes
     *        The start minute of the window, in UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WindowStartTime withMinutes(Long minutes) {
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

        if (obj instanceof WindowStartTime == false)
            return false;
        WindowStartTime other = (WindowStartTime) obj;
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
    public WindowStartTime clone() {
        try {
            return (WindowStartTime) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.WindowStartTimeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
