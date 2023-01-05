/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chimesdkmeetings.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/UpdateAttendeeCapabilities"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAttendeeCapabilitiesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the meeting associated with the update request.
     * </p>
     */
    private String meetingId;
    /**
     * <p>
     * The ID of the attendee associated with the update request.
     * </p>
     */
    private String attendeeId;
    /**
     * <p>
     * The capabilties that you want to update.
     * </p>
     */
    private AttendeeCapabilities capabilities;

    /**
     * <p>
     * The ID of the meeting associated with the update request.
     * </p>
     * 
     * @param meetingId
     *        The ID of the meeting associated with the update request.
     */

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    /**
     * <p>
     * The ID of the meeting associated with the update request.
     * </p>
     * 
     * @return The ID of the meeting associated with the update request.
     */

    public String getMeetingId() {
        return this.meetingId;
    }

    /**
     * <p>
     * The ID of the meeting associated with the update request.
     * </p>
     * 
     * @param meetingId
     *        The ID of the meeting associated with the update request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAttendeeCapabilitiesRequest withMeetingId(String meetingId) {
        setMeetingId(meetingId);
        return this;
    }

    /**
     * <p>
     * The ID of the attendee associated with the update request.
     * </p>
     * 
     * @param attendeeId
     *        The ID of the attendee associated with the update request.
     */

    public void setAttendeeId(String attendeeId) {
        this.attendeeId = attendeeId;
    }

    /**
     * <p>
     * The ID of the attendee associated with the update request.
     * </p>
     * 
     * @return The ID of the attendee associated with the update request.
     */

    public String getAttendeeId() {
        return this.attendeeId;
    }

    /**
     * <p>
     * The ID of the attendee associated with the update request.
     * </p>
     * 
     * @param attendeeId
     *        The ID of the attendee associated with the update request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAttendeeCapabilitiesRequest withAttendeeId(String attendeeId) {
        setAttendeeId(attendeeId);
        return this;
    }

    /**
     * <p>
     * The capabilties that you want to update.
     * </p>
     * 
     * @param capabilities
     *        The capabilties that you want to update.
     */

    public void setCapabilities(AttendeeCapabilities capabilities) {
        this.capabilities = capabilities;
    }

    /**
     * <p>
     * The capabilties that you want to update.
     * </p>
     * 
     * @return The capabilties that you want to update.
     */

    public AttendeeCapabilities getCapabilities() {
        return this.capabilities;
    }

    /**
     * <p>
     * The capabilties that you want to update.
     * </p>
     * 
     * @param capabilities
     *        The capabilties that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAttendeeCapabilitiesRequest withCapabilities(AttendeeCapabilities capabilities) {
        setCapabilities(capabilities);
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
        if (getMeetingId() != null)
            sb.append("MeetingId: ").append(getMeetingId()).append(",");
        if (getAttendeeId() != null)
            sb.append("AttendeeId: ").append(getAttendeeId()).append(",");
        if (getCapabilities() != null)
            sb.append("Capabilities: ").append(getCapabilities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAttendeeCapabilitiesRequest == false)
            return false;
        UpdateAttendeeCapabilitiesRequest other = (UpdateAttendeeCapabilitiesRequest) obj;
        if (other.getMeetingId() == null ^ this.getMeetingId() == null)
            return false;
        if (other.getMeetingId() != null && other.getMeetingId().equals(this.getMeetingId()) == false)
            return false;
        if (other.getAttendeeId() == null ^ this.getAttendeeId() == null)
            return false;
        if (other.getAttendeeId() != null && other.getAttendeeId().equals(this.getAttendeeId()) == false)
            return false;
        if (other.getCapabilities() == null ^ this.getCapabilities() == null)
            return false;
        if (other.getCapabilities() != null && other.getCapabilities().equals(this.getCapabilities()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMeetingId() == null) ? 0 : getMeetingId().hashCode());
        hashCode = prime * hashCode + ((getAttendeeId() == null) ? 0 : getAttendeeId().hashCode());
        hashCode = prime * hashCode + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAttendeeCapabilitiesRequest clone() {
        return (UpdateAttendeeCapabilitiesRequest) super.clone();
    }

}
