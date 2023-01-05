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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains one or more attendee IDs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/AttendeeIdItem" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttendeeIdItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of one or more attendee IDs.
     * </p>
     */
    private String attendeeId;

    /**
     * <p>
     * A list of one or more attendee IDs.
     * </p>
     * 
     * @param attendeeId
     *        A list of one or more attendee IDs.
     */

    public void setAttendeeId(String attendeeId) {
        this.attendeeId = attendeeId;
    }

    /**
     * <p>
     * A list of one or more attendee IDs.
     * </p>
     * 
     * @return A list of one or more attendee IDs.
     */

    public String getAttendeeId() {
        return this.attendeeId;
    }

    /**
     * <p>
     * A list of one or more attendee IDs.
     * </p>
     * 
     * @param attendeeId
     *        A list of one or more attendee IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttendeeIdItem withAttendeeId(String attendeeId) {
        setAttendeeId(attendeeId);
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
        if (getAttendeeId() != null)
            sb.append("AttendeeId: ").append(getAttendeeId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttendeeIdItem == false)
            return false;
        AttendeeIdItem other = (AttendeeIdItem) obj;
        if (other.getAttendeeId() == null ^ this.getAttendeeId() == null)
            return false;
        if (other.getAttendeeId() != null && other.getAttendeeId().equals(this.getAttendeeId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttendeeId() == null) ? 0 : getAttendeeId().hashCode());
        return hashCode;
    }

    @Override
    public AttendeeIdItem clone() {
        try {
            return (AttendeeIdItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmeetings.model.transform.AttendeeIdItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
