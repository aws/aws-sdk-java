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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateMeetingDialOut" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMeetingDialOutRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Chime SDK meeting ID.
     * </p>
     */
    private String meetingId;
    /**
     * <p>
     * Phone number used as the caller ID when the remote party receives a call.
     * </p>
     */
    private String fromPhoneNumber;
    /**
     * <p>
     * Phone number called when inviting someone to a meeting.
     * </p>
     */
    private String toPhoneNumber;
    /**
     * <p>
     * Token used by the Amazon Chime SDK attendee. Call the <a
     * href="https://docs.aws.amazon.com/chime/latest/APIReference/API_CreateAttendee.html">CreateAttendee</a> action to
     * get a join token.
     * </p>
     */
    private String joinToken;

    /**
     * <p>
     * The Amazon Chime SDK meeting ID.
     * </p>
     * 
     * @param meetingId
     *        The Amazon Chime SDK meeting ID.
     */

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    /**
     * <p>
     * The Amazon Chime SDK meeting ID.
     * </p>
     * 
     * @return The Amazon Chime SDK meeting ID.
     */

    public String getMeetingId() {
        return this.meetingId;
    }

    /**
     * <p>
     * The Amazon Chime SDK meeting ID.
     * </p>
     * 
     * @param meetingId
     *        The Amazon Chime SDK meeting ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMeetingDialOutRequest withMeetingId(String meetingId) {
        setMeetingId(meetingId);
        return this;
    }

    /**
     * <p>
     * Phone number used as the caller ID when the remote party receives a call.
     * </p>
     * 
     * @param fromPhoneNumber
     *        Phone number used as the caller ID when the remote party receives a call.
     */

    public void setFromPhoneNumber(String fromPhoneNumber) {
        this.fromPhoneNumber = fromPhoneNumber;
    }

    /**
     * <p>
     * Phone number used as the caller ID when the remote party receives a call.
     * </p>
     * 
     * @return Phone number used as the caller ID when the remote party receives a call.
     */

    public String getFromPhoneNumber() {
        return this.fromPhoneNumber;
    }

    /**
     * <p>
     * Phone number used as the caller ID when the remote party receives a call.
     * </p>
     * 
     * @param fromPhoneNumber
     *        Phone number used as the caller ID when the remote party receives a call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMeetingDialOutRequest withFromPhoneNumber(String fromPhoneNumber) {
        setFromPhoneNumber(fromPhoneNumber);
        return this;
    }

    /**
     * <p>
     * Phone number called when inviting someone to a meeting.
     * </p>
     * 
     * @param toPhoneNumber
     *        Phone number called when inviting someone to a meeting.
     */

    public void setToPhoneNumber(String toPhoneNumber) {
        this.toPhoneNumber = toPhoneNumber;
    }

    /**
     * <p>
     * Phone number called when inviting someone to a meeting.
     * </p>
     * 
     * @return Phone number called when inviting someone to a meeting.
     */

    public String getToPhoneNumber() {
        return this.toPhoneNumber;
    }

    /**
     * <p>
     * Phone number called when inviting someone to a meeting.
     * </p>
     * 
     * @param toPhoneNumber
     *        Phone number called when inviting someone to a meeting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMeetingDialOutRequest withToPhoneNumber(String toPhoneNumber) {
        setToPhoneNumber(toPhoneNumber);
        return this;
    }

    /**
     * <p>
     * Token used by the Amazon Chime SDK attendee. Call the <a
     * href="https://docs.aws.amazon.com/chime/latest/APIReference/API_CreateAttendee.html">CreateAttendee</a> action to
     * get a join token.
     * </p>
     * 
     * @param joinToken
     *        Token used by the Amazon Chime SDK attendee. Call the <a
     *        href="https://docs.aws.amazon.com/chime/latest/APIReference/API_CreateAttendee.html">CreateAttendee</a>
     *        action to get a join token.
     */

    public void setJoinToken(String joinToken) {
        this.joinToken = joinToken;
    }

    /**
     * <p>
     * Token used by the Amazon Chime SDK attendee. Call the <a
     * href="https://docs.aws.amazon.com/chime/latest/APIReference/API_CreateAttendee.html">CreateAttendee</a> action to
     * get a join token.
     * </p>
     * 
     * @return Token used by the Amazon Chime SDK attendee. Call the <a
     *         href="https://docs.aws.amazon.com/chime/latest/APIReference/API_CreateAttendee.html">CreateAttendee</a>
     *         action to get a join token.
     */

    public String getJoinToken() {
        return this.joinToken;
    }

    /**
     * <p>
     * Token used by the Amazon Chime SDK attendee. Call the <a
     * href="https://docs.aws.amazon.com/chime/latest/APIReference/API_CreateAttendee.html">CreateAttendee</a> action to
     * get a join token.
     * </p>
     * 
     * @param joinToken
     *        Token used by the Amazon Chime SDK attendee. Call the <a
     *        href="https://docs.aws.amazon.com/chime/latest/APIReference/API_CreateAttendee.html">CreateAttendee</a>
     *        action to get a join token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMeetingDialOutRequest withJoinToken(String joinToken) {
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
        if (getMeetingId() != null)
            sb.append("MeetingId: ").append(getMeetingId()).append(",");
        if (getFromPhoneNumber() != null)
            sb.append("FromPhoneNumber: ").append("***Sensitive Data Redacted***").append(",");
        if (getToPhoneNumber() != null)
            sb.append("ToPhoneNumber: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof CreateMeetingDialOutRequest == false)
            return false;
        CreateMeetingDialOutRequest other = (CreateMeetingDialOutRequest) obj;
        if (other.getMeetingId() == null ^ this.getMeetingId() == null)
            return false;
        if (other.getMeetingId() != null && other.getMeetingId().equals(this.getMeetingId()) == false)
            return false;
        if (other.getFromPhoneNumber() == null ^ this.getFromPhoneNumber() == null)
            return false;
        if (other.getFromPhoneNumber() != null && other.getFromPhoneNumber().equals(this.getFromPhoneNumber()) == false)
            return false;
        if (other.getToPhoneNumber() == null ^ this.getToPhoneNumber() == null)
            return false;
        if (other.getToPhoneNumber() != null && other.getToPhoneNumber().equals(this.getToPhoneNumber()) == false)
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

        hashCode = prime * hashCode + ((getMeetingId() == null) ? 0 : getMeetingId().hashCode());
        hashCode = prime * hashCode + ((getFromPhoneNumber() == null) ? 0 : getFromPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getToPhoneNumber() == null) ? 0 : getToPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getJoinToken() == null) ? 0 : getJoinToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateMeetingDialOutRequest clone() {
        return (CreateMeetingDialOutRequest) super.clone();
    }

}
