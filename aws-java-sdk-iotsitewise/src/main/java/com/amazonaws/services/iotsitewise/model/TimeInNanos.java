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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains a timestamp with optional nanosecond granularity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/TimeInNanos" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimeInNanos implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The timestamp date, in seconds, in the Unix epoch format. Fractional nanosecond data is provided by
     * <code>offsetInNanos</code>.
     * </p>
     */
    private Long timeInSeconds;
    /**
     * <p>
     * The nanosecond offset from <code>timeInSeconds</code>.
     * </p>
     */
    private Integer offsetInNanos;

    /**
     * <p>
     * The timestamp date, in seconds, in the Unix epoch format. Fractional nanosecond data is provided by
     * <code>offsetInNanos</code>.
     * </p>
     * 
     * @param timeInSeconds
     *        The timestamp date, in seconds, in the Unix epoch format. Fractional nanosecond data is provided by
     *        <code>offsetInNanos</code>.
     */

    public void setTimeInSeconds(Long timeInSeconds) {
        this.timeInSeconds = timeInSeconds;
    }

    /**
     * <p>
     * The timestamp date, in seconds, in the Unix epoch format. Fractional nanosecond data is provided by
     * <code>offsetInNanos</code>.
     * </p>
     * 
     * @return The timestamp date, in seconds, in the Unix epoch format. Fractional nanosecond data is provided by
     *         <code>offsetInNanos</code>.
     */

    public Long getTimeInSeconds() {
        return this.timeInSeconds;
    }

    /**
     * <p>
     * The timestamp date, in seconds, in the Unix epoch format. Fractional nanosecond data is provided by
     * <code>offsetInNanos</code>.
     * </p>
     * 
     * @param timeInSeconds
     *        The timestamp date, in seconds, in the Unix epoch format. Fractional nanosecond data is provided by
     *        <code>offsetInNanos</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeInNanos withTimeInSeconds(Long timeInSeconds) {
        setTimeInSeconds(timeInSeconds);
        return this;
    }

    /**
     * <p>
     * The nanosecond offset from <code>timeInSeconds</code>.
     * </p>
     * 
     * @param offsetInNanos
     *        The nanosecond offset from <code>timeInSeconds</code>.
     */

    public void setOffsetInNanos(Integer offsetInNanos) {
        this.offsetInNanos = offsetInNanos;
    }

    /**
     * <p>
     * The nanosecond offset from <code>timeInSeconds</code>.
     * </p>
     * 
     * @return The nanosecond offset from <code>timeInSeconds</code>.
     */

    public Integer getOffsetInNanos() {
        return this.offsetInNanos;
    }

    /**
     * <p>
     * The nanosecond offset from <code>timeInSeconds</code>.
     * </p>
     * 
     * @param offsetInNanos
     *        The nanosecond offset from <code>timeInSeconds</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeInNanos withOffsetInNanos(Integer offsetInNanos) {
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

        if (obj instanceof TimeInNanos == false)
            return false;
        TimeInNanos other = (TimeInNanos) obj;
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
    public TimeInNanos clone() {
        try {
            return (TimeInNanos) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.TimeInNanosMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
