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
 * Creates meeting room settings of a room profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateMeetingRoomConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMeetingRoomConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether room utilization metrics are enabled or not.
     * </p>
     */
    private Boolean roomUtilizationMetricsEnabled;

    private CreateEndOfMeetingReminder endOfMeetingReminder;
    /**
     * <p>
     * Settings to automatically book a room for a configured duration if it's free when joining a meeting with Alexa.
     * </p>
     */
    private CreateInstantBooking instantBooking;
    /**
     * <p>
     * Settings for requiring a check in when a room is reserved. Alexa can cancel a room reservation if it's not
     * checked into to make the room available for others. Users can check in by joining the meeting with Alexa or an
     * AVS device, or by saying “Alexa, check in.”
     * </p>
     */
    private CreateRequireCheckIn requireCheckIn;

    /**
     * <p>
     * Whether room utilization metrics are enabled or not.
     * </p>
     * 
     * @param roomUtilizationMetricsEnabled
     *        Whether room utilization metrics are enabled or not.
     */

    public void setRoomUtilizationMetricsEnabled(Boolean roomUtilizationMetricsEnabled) {
        this.roomUtilizationMetricsEnabled = roomUtilizationMetricsEnabled;
    }

    /**
     * <p>
     * Whether room utilization metrics are enabled or not.
     * </p>
     * 
     * @return Whether room utilization metrics are enabled or not.
     */

    public Boolean getRoomUtilizationMetricsEnabled() {
        return this.roomUtilizationMetricsEnabled;
    }

    /**
     * <p>
     * Whether room utilization metrics are enabled or not.
     * </p>
     * 
     * @param roomUtilizationMetricsEnabled
     *        Whether room utilization metrics are enabled or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMeetingRoomConfiguration withRoomUtilizationMetricsEnabled(Boolean roomUtilizationMetricsEnabled) {
        setRoomUtilizationMetricsEnabled(roomUtilizationMetricsEnabled);
        return this;
    }

    /**
     * <p>
     * Whether room utilization metrics are enabled or not.
     * </p>
     * 
     * @return Whether room utilization metrics are enabled or not.
     */

    public Boolean isRoomUtilizationMetricsEnabled() {
        return this.roomUtilizationMetricsEnabled;
    }

    /**
     * @param endOfMeetingReminder
     */

    public void setEndOfMeetingReminder(CreateEndOfMeetingReminder endOfMeetingReminder) {
        this.endOfMeetingReminder = endOfMeetingReminder;
    }

    /**
     * @return
     */

    public CreateEndOfMeetingReminder getEndOfMeetingReminder() {
        return this.endOfMeetingReminder;
    }

    /**
     * @param endOfMeetingReminder
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMeetingRoomConfiguration withEndOfMeetingReminder(CreateEndOfMeetingReminder endOfMeetingReminder) {
        setEndOfMeetingReminder(endOfMeetingReminder);
        return this;
    }

    /**
     * <p>
     * Settings to automatically book a room for a configured duration if it's free when joining a meeting with Alexa.
     * </p>
     * 
     * @param instantBooking
     *        Settings to automatically book a room for a configured duration if it's free when joining a meeting with
     *        Alexa.
     */

    public void setInstantBooking(CreateInstantBooking instantBooking) {
        this.instantBooking = instantBooking;
    }

    /**
     * <p>
     * Settings to automatically book a room for a configured duration if it's free when joining a meeting with Alexa.
     * </p>
     * 
     * @return Settings to automatically book a room for a configured duration if it's free when joining a meeting with
     *         Alexa.
     */

    public CreateInstantBooking getInstantBooking() {
        return this.instantBooking;
    }

    /**
     * <p>
     * Settings to automatically book a room for a configured duration if it's free when joining a meeting with Alexa.
     * </p>
     * 
     * @param instantBooking
     *        Settings to automatically book a room for a configured duration if it's free when joining a meeting with
     *        Alexa.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMeetingRoomConfiguration withInstantBooking(CreateInstantBooking instantBooking) {
        setInstantBooking(instantBooking);
        return this;
    }

    /**
     * <p>
     * Settings for requiring a check in when a room is reserved. Alexa can cancel a room reservation if it's not
     * checked into to make the room available for others. Users can check in by joining the meeting with Alexa or an
     * AVS device, or by saying “Alexa, check in.”
     * </p>
     * 
     * @param requireCheckIn
     *        Settings for requiring a check in when a room is reserved. Alexa can cancel a room reservation if it's not
     *        checked into to make the room available for others. Users can check in by joining the meeting with Alexa
     *        or an AVS device, or by saying “Alexa, check in.”
     */

    public void setRequireCheckIn(CreateRequireCheckIn requireCheckIn) {
        this.requireCheckIn = requireCheckIn;
    }

    /**
     * <p>
     * Settings for requiring a check in when a room is reserved. Alexa can cancel a room reservation if it's not
     * checked into to make the room available for others. Users can check in by joining the meeting with Alexa or an
     * AVS device, or by saying “Alexa, check in.”
     * </p>
     * 
     * @return Settings for requiring a check in when a room is reserved. Alexa can cancel a room reservation if it's
     *         not checked into to make the room available for others. Users can check in by joining the meeting with
     *         Alexa or an AVS device, or by saying “Alexa, check in.”
     */

    public CreateRequireCheckIn getRequireCheckIn() {
        return this.requireCheckIn;
    }

    /**
     * <p>
     * Settings for requiring a check in when a room is reserved. Alexa can cancel a room reservation if it's not
     * checked into to make the room available for others. Users can check in by joining the meeting with Alexa or an
     * AVS device, or by saying “Alexa, check in.”
     * </p>
     * 
     * @param requireCheckIn
     *        Settings for requiring a check in when a room is reserved. Alexa can cancel a room reservation if it's not
     *        checked into to make the room available for others. Users can check in by joining the meeting with Alexa
     *        or an AVS device, or by saying “Alexa, check in.”
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMeetingRoomConfiguration withRequireCheckIn(CreateRequireCheckIn requireCheckIn) {
        setRequireCheckIn(requireCheckIn);
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
        if (getRoomUtilizationMetricsEnabled() != null)
            sb.append("RoomUtilizationMetricsEnabled: ").append(getRoomUtilizationMetricsEnabled()).append(",");
        if (getEndOfMeetingReminder() != null)
            sb.append("EndOfMeetingReminder: ").append(getEndOfMeetingReminder()).append(",");
        if (getInstantBooking() != null)
            sb.append("InstantBooking: ").append(getInstantBooking()).append(",");
        if (getRequireCheckIn() != null)
            sb.append("RequireCheckIn: ").append(getRequireCheckIn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMeetingRoomConfiguration == false)
            return false;
        CreateMeetingRoomConfiguration other = (CreateMeetingRoomConfiguration) obj;
        if (other.getRoomUtilizationMetricsEnabled() == null ^ this.getRoomUtilizationMetricsEnabled() == null)
            return false;
        if (other.getRoomUtilizationMetricsEnabled() != null
                && other.getRoomUtilizationMetricsEnabled().equals(this.getRoomUtilizationMetricsEnabled()) == false)
            return false;
        if (other.getEndOfMeetingReminder() == null ^ this.getEndOfMeetingReminder() == null)
            return false;
        if (other.getEndOfMeetingReminder() != null && other.getEndOfMeetingReminder().equals(this.getEndOfMeetingReminder()) == false)
            return false;
        if (other.getInstantBooking() == null ^ this.getInstantBooking() == null)
            return false;
        if (other.getInstantBooking() != null && other.getInstantBooking().equals(this.getInstantBooking()) == false)
            return false;
        if (other.getRequireCheckIn() == null ^ this.getRequireCheckIn() == null)
            return false;
        if (other.getRequireCheckIn() != null && other.getRequireCheckIn().equals(this.getRequireCheckIn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoomUtilizationMetricsEnabled() == null) ? 0 : getRoomUtilizationMetricsEnabled().hashCode());
        hashCode = prime * hashCode + ((getEndOfMeetingReminder() == null) ? 0 : getEndOfMeetingReminder().hashCode());
        hashCode = prime * hashCode + ((getInstantBooking() == null) ? 0 : getInstantBooking().hashCode());
        hashCode = prime * hashCode + ((getRequireCheckIn() == null) ? 0 : getRequireCheckIn().hashCode());
        return hashCode;
    }

    @Override
    public CreateMeetingRoomConfiguration clone() {
        try {
            return (CreateMeetingRoomConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.alexaforbusiness.model.transform.CreateMeetingRoomConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
