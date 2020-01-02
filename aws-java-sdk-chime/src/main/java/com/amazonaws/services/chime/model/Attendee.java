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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An Amazon Chime SDK meeting attendee. Includes a unique <code>AttendeeId</code> and <code>JoinToken</code>. The
 * <code>JoinToken</code> allows a client to authenticate and join as the specified attendee. The <code>JoinToken</code>
 * expires when the meeting ends or when <a>DeleteAttendee</a> is called. After that, the attendee is unable to join the
 * meeting.
 * </p>
 * <p>
 * We recommend securely transferring each <code>JoinToken</code> from your server application to the client so that no
 * other client has access to the token except for the one authorized to represent the attendee.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/Attendee" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Attendee implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Chime SDK external user ID. Links the attendee to an identity managed by a builder application.
     * </p>
     */
    private String externalUserId;
    /**
     * <p>
     * The Amazon Chime SDK attendee ID.
     * </p>
     */
    private String attendeeId;
    /**
     * <p>
     * The join token used by the Amazon Chime SDK attendee.
     * </p>
     */
    private String joinToken;

    /**
     * <p>
     * The Amazon Chime SDK external user ID. Links the attendee to an identity managed by a builder application.
     * </p>
     * 
     * @param externalUserId
     *        The Amazon Chime SDK external user ID. Links the attendee to an identity managed by a builder application.
     */

    public void setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
    }

    /**
     * <p>
     * The Amazon Chime SDK external user ID. Links the attendee to an identity managed by a builder application.
     * </p>
     * 
     * @return The Amazon Chime SDK external user ID. Links the attendee to an identity managed by a builder
     *         application.
     */

    public String getExternalUserId() {
        return this.externalUserId;
    }

    /**
     * <p>
     * The Amazon Chime SDK external user ID. Links the attendee to an identity managed by a builder application.
     * </p>
     * 
     * @param externalUserId
     *        The Amazon Chime SDK external user ID. Links the attendee to an identity managed by a builder application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attendee withExternalUserId(String externalUserId) {
        setExternalUserId(externalUserId);
        return this;
    }

    /**
     * <p>
     * The Amazon Chime SDK attendee ID.
     * </p>
     * 
     * @param attendeeId
     *        The Amazon Chime SDK attendee ID.
     */

    public void setAttendeeId(String attendeeId) {
        this.attendeeId = attendeeId;
    }

    /**
     * <p>
     * The Amazon Chime SDK attendee ID.
     * </p>
     * 
     * @return The Amazon Chime SDK attendee ID.
     */

    public String getAttendeeId() {
        return this.attendeeId;
    }

    /**
     * <p>
     * The Amazon Chime SDK attendee ID.
     * </p>
     * 
     * @param attendeeId
     *        The Amazon Chime SDK attendee ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attendee withAttendeeId(String attendeeId) {
        setAttendeeId(attendeeId);
        return this;
    }

    /**
     * <p>
     * The join token used by the Amazon Chime SDK attendee.
     * </p>
     * 
     * @param joinToken
     *        The join token used by the Amazon Chime SDK attendee.
     */

    public void setJoinToken(String joinToken) {
        this.joinToken = joinToken;
    }

    /**
     * <p>
     * The join token used by the Amazon Chime SDK attendee.
     * </p>
     * 
     * @return The join token used by the Amazon Chime SDK attendee.
     */

    public String getJoinToken() {
        return this.joinToken;
    }

    /**
     * <p>
     * The join token used by the Amazon Chime SDK attendee.
     * </p>
     * 
     * @param joinToken
     *        The join token used by the Amazon Chime SDK attendee.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attendee withJoinToken(String joinToken) {
        setJoinToken(joinToken);
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
        if (getExternalUserId() != null)
            sb.append("ExternalUserId: ").append("***Sensitive Data Redacted***").append(",");
        if (getAttendeeId() != null)
            sb.append("AttendeeId: ").append(getAttendeeId()).append(",");
        if (getJoinToken() != null)
            sb.append("JoinToken: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Attendee == false)
            return false;
        Attendee other = (Attendee) obj;
        if (other.getExternalUserId() == null ^ this.getExternalUserId() == null)
            return false;
        if (other.getExternalUserId() != null && other.getExternalUserId().equals(this.getExternalUserId()) == false)
            return false;
        if (other.getAttendeeId() == null ^ this.getAttendeeId() == null)
            return false;
        if (other.getAttendeeId() != null && other.getAttendeeId().equals(this.getAttendeeId()) == false)
            return false;
        if (other.getJoinToken() == null ^ this.getJoinToken() == null)
            return false;
        if (other.getJoinToken() != null && other.getJoinToken().equals(this.getJoinToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExternalUserId() == null) ? 0 : getExternalUserId().hashCode());
        hashCode = prime * hashCode + ((getAttendeeId() == null) ? 0 : getAttendeeId().hashCode());
        hashCode = prime * hashCode + ((getJoinToken() == null) ? 0 : getJoinToken().hashCode());
        return hashCode;
    }

    @Override
    public Attendee clone() {
        try {
            return (Attendee) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.AttendeeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
