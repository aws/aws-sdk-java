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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/BatchCreateAttendee" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchCreateAttendeeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Chime SDK meeting ID.
     * </p>
     */
    private String meetingId;
    /**
     * <p>
     * The request containing the attendees to create.
     * </p>
     */
    private java.util.List<CreateAttendeeRequestItem> attendees;

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

    public BatchCreateAttendeeRequest withMeetingId(String meetingId) {
        setMeetingId(meetingId);
        return this;
    }

    /**
     * <p>
     * The request containing the attendees to create.
     * </p>
     * 
     * @return The request containing the attendees to create.
     */

    public java.util.List<CreateAttendeeRequestItem> getAttendees() {
        return attendees;
    }

    /**
     * <p>
     * The request containing the attendees to create.
     * </p>
     * 
     * @param attendees
     *        The request containing the attendees to create.
     */

    public void setAttendees(java.util.Collection<CreateAttendeeRequestItem> attendees) {
        if (attendees == null) {
            this.attendees = null;
            return;
        }

        this.attendees = new java.util.ArrayList<CreateAttendeeRequestItem>(attendees);
    }

    /**
     * <p>
     * The request containing the attendees to create.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttendees(java.util.Collection)} or {@link #withAttendees(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attendees
     *        The request containing the attendees to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateAttendeeRequest withAttendees(CreateAttendeeRequestItem... attendees) {
        if (this.attendees == null) {
            setAttendees(new java.util.ArrayList<CreateAttendeeRequestItem>(attendees.length));
        }
        for (CreateAttendeeRequestItem ele : attendees) {
            this.attendees.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The request containing the attendees to create.
     * </p>
     * 
     * @param attendees
     *        The request containing the attendees to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateAttendeeRequest withAttendees(java.util.Collection<CreateAttendeeRequestItem> attendees) {
        setAttendees(attendees);
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
        if (getAttendees() != null)
            sb.append("Attendees: ").append(getAttendees());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchCreateAttendeeRequest == false)
            return false;
        BatchCreateAttendeeRequest other = (BatchCreateAttendeeRequest) obj;
        if (other.getMeetingId() == null ^ this.getMeetingId() == null)
            return false;
        if (other.getMeetingId() != null && other.getMeetingId().equals(this.getMeetingId()) == false)
            return false;
        if (other.getAttendees() == null ^ this.getAttendees() == null)
            return false;
        if (other.getAttendees() != null && other.getAttendees().equals(this.getAttendees()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMeetingId() == null) ? 0 : getMeetingId().hashCode());
        hashCode = prime * hashCode + ((getAttendees() == null) ? 0 : getAttendees().hashCode());
        return hashCode;
    }

    @Override
    public BatchCreateAttendeeRequest clone() {
        return (BatchCreateAttendeeRequest) super.clone();
    }

}
