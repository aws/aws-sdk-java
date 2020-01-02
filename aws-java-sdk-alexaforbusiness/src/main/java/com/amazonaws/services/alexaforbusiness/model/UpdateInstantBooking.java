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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Updates settings for the instant booking feature that are applied to a room profile. If instant booking is enabled,
 * Alexa automatically reserves a room if it is free when a user joins a meeting with Alexa.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateInstantBooking"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateInstantBooking implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Duration between 15 and 240 minutes at increments of 15 that determines how long to book an available room when a
     * meeting is started with Alexa.
     * </p>
     */
    private Integer durationInMinutes;
    /**
     * <p>
     * Whether instant booking is enabled or not.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * Duration between 15 and 240 minutes at increments of 15 that determines how long to book an available room when a
     * meeting is started with Alexa.
     * </p>
     * 
     * @param durationInMinutes
     *        Duration between 15 and 240 minutes at increments of 15 that determines how long to book an available room
     *        when a meeting is started with Alexa.
     */

    public void setDurationInMinutes(Integer durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    /**
     * <p>
     * Duration between 15 and 240 minutes at increments of 15 that determines how long to book an available room when a
     * meeting is started with Alexa.
     * </p>
     * 
     * @return Duration between 15 and 240 minutes at increments of 15 that determines how long to book an available
     *         room when a meeting is started with Alexa.
     */

    public Integer getDurationInMinutes() {
        return this.durationInMinutes;
    }

    /**
     * <p>
     * Duration between 15 and 240 minutes at increments of 15 that determines how long to book an available room when a
     * meeting is started with Alexa.
     * </p>
     * 
     * @param durationInMinutes
     *        Duration between 15 and 240 minutes at increments of 15 that determines how long to book an available room
     *        when a meeting is started with Alexa.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInstantBooking withDurationInMinutes(Integer durationInMinutes) {
        setDurationInMinutes(durationInMinutes);
        return this;
    }

    /**
     * <p>
     * Whether instant booking is enabled or not.
     * </p>
     * 
     * @param enabled
     *        Whether instant booking is enabled or not.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Whether instant booking is enabled or not.
     * </p>
     * 
     * @return Whether instant booking is enabled or not.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Whether instant booking is enabled or not.
     * </p>
     * 
     * @param enabled
     *        Whether instant booking is enabled or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInstantBooking withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Whether instant booking is enabled or not.
     * </p>
     * 
     * @return Whether instant booking is enabled or not.
     */

    public Boolean isEnabled() {
        return this.enabled;
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
        if (getDurationInMinutes() != null)
            sb.append("DurationInMinutes: ").append(getDurationInMinutes()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateInstantBooking == false)
            return false;
        UpdateInstantBooking other = (UpdateInstantBooking) obj;
        if (other.getDurationInMinutes() == null ^ this.getDurationInMinutes() == null)
            return false;
        if (other.getDurationInMinutes() != null && other.getDurationInMinutes().equals(this.getDurationInMinutes()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDurationInMinutes() == null) ? 0 : getDurationInMinutes().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public UpdateInstantBooking clone() {
        try {
            return (UpdateInstantBooking) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.alexaforbusiness.model.transform.UpdateInstantBookingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
