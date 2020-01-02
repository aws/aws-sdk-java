/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * An asset property timestamp entry containing the following information.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetPropertyTimestamp implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A string that contains the time in seconds since epoch. Accepts substitution templates.
     * </p>
     */
    private String timeInSeconds;
    /**
     * <p>
     * Optional. A string that contains the nanosecond time offset. Accepts substitution templates.
     * </p>
     */
    private String offsetInNanos;

    /**
     * <p>
     * A string that contains the time in seconds since epoch. Accepts substitution templates.
     * </p>
     * 
     * @param timeInSeconds
     *        A string that contains the time in seconds since epoch. Accepts substitution templates.
     */

    public void setTimeInSeconds(String timeInSeconds) {
        this.timeInSeconds = timeInSeconds;
    }

    /**
     * <p>
     * A string that contains the time in seconds since epoch. Accepts substitution templates.
     * </p>
     * 
     * @return A string that contains the time in seconds since epoch. Accepts substitution templates.
     */

    public String getTimeInSeconds() {
        return this.timeInSeconds;
    }

    /**
     * <p>
     * A string that contains the time in seconds since epoch. Accepts substitution templates.
     * </p>
     * 
     * @param timeInSeconds
     *        A string that contains the time in seconds since epoch. Accepts substitution templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetPropertyTimestamp withTimeInSeconds(String timeInSeconds) {
        setTimeInSeconds(timeInSeconds);
        return this;
    }

    /**
     * <p>
     * Optional. A string that contains the nanosecond time offset. Accepts substitution templates.
     * </p>
     * 
     * @param offsetInNanos
     *        Optional. A string that contains the nanosecond time offset. Accepts substitution templates.
     */

    public void setOffsetInNanos(String offsetInNanos) {
        this.offsetInNanos = offsetInNanos;
    }

    /**
     * <p>
     * Optional. A string that contains the nanosecond time offset. Accepts substitution templates.
     * </p>
     * 
     * @return Optional. A string that contains the nanosecond time offset. Accepts substitution templates.
     */

    public String getOffsetInNanos() {
        return this.offsetInNanos;
    }

    /**
     * <p>
     * Optional. A string that contains the nanosecond time offset. Accepts substitution templates.
     * </p>
     * 
     * @param offsetInNanos
     *        Optional. A string that contains the nanosecond time offset. Accepts substitution templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetPropertyTimestamp withOffsetInNanos(String offsetInNanos) {
        setOffsetInNanos(offsetInNanos);
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
        if (getTimeInSeconds() != null)
            sb.append("TimeInSeconds: ").append(getTimeInSeconds()).append(",");
        if (getOffsetInNanos() != null)
            sb.append("OffsetInNanos: ").append(getOffsetInNanos());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetPropertyTimestamp == false)
            return false;
        AssetPropertyTimestamp other = (AssetPropertyTimestamp) obj;
        if (other.getTimeInSeconds() == null ^ this.getTimeInSeconds() == null)
            return false;
        if (other.getTimeInSeconds() != null && other.getTimeInSeconds().equals(this.getTimeInSeconds()) == false)
            return false;
        if (other.getOffsetInNanos() == null ^ this.getOffsetInNanos() == null)
            return false;
        if (other.getOffsetInNanos() != null && other.getOffsetInNanos().equals(this.getOffsetInNanos()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimeInSeconds() == null) ? 0 : getTimeInSeconds().hashCode());
        hashCode = prime * hashCode + ((getOffsetInNanos() == null) ? 0 : getOffsetInNanos().hashCode());
        return hashCode;
    }

    @Override
    public AssetPropertyTimestamp clone() {
        try {
            return (AssetPropertyTimestamp) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.AssetPropertyTimestampMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
