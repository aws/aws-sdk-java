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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information required to join the call.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ConnectionData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectionData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The attendee information, including attendee ID and join token.
     * </p>
     */
    private Attendee attendee;
    /**
     * <p>
     * A meeting created using the Amazon Chime SDK.
     * </p>
     */
    private Meeting meeting;

    /**
     * <p>
     * The attendee information, including attendee ID and join token.
     * </p>
     * 
     * @param attendee
     *        The attendee information, including attendee ID and join token.
     */

    public void setAttendee(Attendee attendee) {
        this.attendee = attendee;
    }

    /**
     * <p>
     * The attendee information, including attendee ID and join token.
     * </p>
     * 
     * @return The attendee information, including attendee ID and join token.
     */

    public Attendee getAttendee() {
        return this.attendee;
    }

    /**
     * <p>
     * The attendee information, including attendee ID and join token.
     * </p>
     * 
     * @param attendee
     *        The attendee information, including attendee ID and join token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionData withAttendee(Attendee attendee) {
        setAttendee(attendee);
        return this;
    }

    /**
     * <p>
     * A meeting created using the Amazon Chime SDK.
     * </p>
     * 
     * @param meeting
     *        A meeting created using the Amazon Chime SDK.
     */

    public void setMeeting(Meeting meeting) {
        this.meeting = meeting;
    }

    /**
     * <p>
     * A meeting created using the Amazon Chime SDK.
     * </p>
     * 
     * @return A meeting created using the Amazon Chime SDK.
     */

    public Meeting getMeeting() {
        return this.meeting;
    }

    /**
     * <p>
     * A meeting created using the Amazon Chime SDK.
     * </p>
     * 
     * @param meeting
     *        A meeting created using the Amazon Chime SDK.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionData withMeeting(Meeting meeting) {
        setMeeting(meeting);
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
        if (getAttendee() != null)
            sb.append("Attendee: ").append(getAttendee()).append(",");
        if (getMeeting() != null)
            sb.append("Meeting: ").append(getMeeting());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectionData == false)
            return false;
        ConnectionData other = (ConnectionData) obj;
        if (other.getAttendee() == null ^ this.getAttendee() == null)
            return false;
        if (other.getAttendee() != null && other.getAttendee().equals(this.getAttendee()) == false)
            return false;
        if (other.getMeeting() == null ^ this.getMeeting() == null)
            return false;
        if (other.getMeeting() != null && other.getMeeting().equals(this.getMeeting()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttendee() == null) ? 0 : getAttendee().hashCode());
        hashCode = prime * hashCode + ((getMeeting() == null) ? 0 : getMeeting().hashCode());
        return hashCode;
    }

    @Override
    public ConnectionData clone() {
        try {
            return (ConnectionData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.ConnectionDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
