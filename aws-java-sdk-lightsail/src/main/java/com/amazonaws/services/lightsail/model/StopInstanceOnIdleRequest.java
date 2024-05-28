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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a request to create or edit the <code>StopInstanceOnIdle</code> add-on.
 * </p>
 * <important>
 * <p>
 * This add-on only applies to Lightsail for Research resources.
 * </p>
 * </important>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/StopInstanceOnIdleRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopInstanceOnIdleRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value to compare with the duration.
     * </p>
     */
    private String threshold;
    /**
     * <p>
     * The amount of idle time in minutes after which your virtual computer will automatically stop.
     * </p>
     */
    private String duration;

    /**
     * <p>
     * The value to compare with the duration.
     * </p>
     * 
     * @param threshold
     *        The value to compare with the duration.
     */

    public void setThreshold(String threshold) {
        this.threshold = threshold;
    }

    /**
     * <p>
     * The value to compare with the duration.
     * </p>
     * 
     * @return The value to compare with the duration.
     */

    public String getThreshold() {
        return this.threshold;
    }

    /**
     * <p>
     * The value to compare with the duration.
     * </p>
     * 
     * @param threshold
     *        The value to compare with the duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopInstanceOnIdleRequest withThreshold(String threshold) {
        setThreshold(threshold);
        return this;
    }

    /**
     * <p>
     * The amount of idle time in minutes after which your virtual computer will automatically stop.
     * </p>
     * 
     * @param duration
     *        The amount of idle time in minutes after which your virtual computer will automatically stop.
     */

    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The amount of idle time in minutes after which your virtual computer will automatically stop.
     * </p>
     * 
     * @return The amount of idle time in minutes after which your virtual computer will automatically stop.
     */

    public String getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * The amount of idle time in minutes after which your virtual computer will automatically stop.
     * </p>
     * 
     * @param duration
     *        The amount of idle time in minutes after which your virtual computer will automatically stop.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopInstanceOnIdleRequest withDuration(String duration) {
        setDuration(duration);
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
        if (getThreshold() != null)
            sb.append("Threshold: ").append(getThreshold()).append(",");
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopInstanceOnIdleRequest == false)
            return false;
        StopInstanceOnIdleRequest other = (StopInstanceOnIdleRequest) obj;
        if (other.getThreshold() == null ^ this.getThreshold() == null)
            return false;
        if (other.getThreshold() != null && other.getThreshold().equals(this.getThreshold()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThreshold() == null) ? 0 : getThreshold().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        return hashCode;
    }

    @Override
    public StopInstanceOnIdleRequest clone() {
        try {
            return (StopInstanceOnIdleRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.StopInstanceOnIdleRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
