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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/CreateAttendee" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAttendeeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the meeting.
     * </p>
     */
    private String meetingId;
    /**
     * <p>
     * The Amazon Chime SDK external user ID. An idempotency token. Links the attendee to an identity managed by a
     * builder application.
     * </p>
     */
    private String externalUserId;
    /**
     * <p>
     * The capabilities (<code>audio</code>, <code>video</code>, or <code>content</code>) that you want to grant an
     * attendee. If you don't specify capabilities, all users have send and receive capabilities on all media channels
     * by default.
     * </p>
     * <note>
     * <p>
     * You use the capabilities with a set of values that control what the capabilities can do, such as
     * <code>SendReceive</code> data. For more information about those values, see .
     * </p>
     * </note>
     * <p>
     * When using capabilities, be aware of these corner cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't set <code>content</code> capabilities to <code>SendReceive</code> or <code>Receive</code> unless you
     * also set <code>video</code> capabilities to <code>SendReceive</code> or <code>Receive</code>. If you don't set
     * the <code>video</code> capability to receive, the response will contain an HTTP 400 Bad Request status code.
     * However, you can set your <code>video</code> capability to receive and you set your <code>content</code>
     * capability to not receive.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you change an <code>audio</code> capability from <code>None</code> or <code>Receive</code> to
     * <code>Send</code> or <code>SendReceive</code> , and if the attendee left their microphone unmuted, audio will
     * flow from the attendee to the other meeting participants.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you change a <code>video</code> or <code>content</code> capability from <code>None</code> or
     * <code>Receive</code> to <code>Send</code> or <code>SendReceive</code> , and if the attendee turned on their video
     * or content streams, remote attendess can receive those streams, but only after media renegotiation between the
     * client and the Amazon Chime back-end server.
     * </p>
     * </li>
     * </ul>
     */
    private AttendeeCapabilities capabilities;

    /**
     * <p>
     * The unique ID of the meeting.
     * </p>
     * 
     * @param meetingId
     *        The unique ID of the meeting.
     */

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    /**
     * <p>
     * The unique ID of the meeting.
     * </p>
     * 
     * @return The unique ID of the meeting.
     */

    public String getMeetingId() {
        return this.meetingId;
    }

    /**
     * <p>
     * The unique ID of the meeting.
     * </p>
     * 
     * @param meetingId
     *        The unique ID of the meeting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAttendeeRequest withMeetingId(String meetingId) {
        setMeetingId(meetingId);
        return this;
    }

    /**
     * <p>
     * The Amazon Chime SDK external user ID. An idempotency token. Links the attendee to an identity managed by a
     * builder application.
     * </p>
     * 
     * @param externalUserId
     *        The Amazon Chime SDK external user ID. An idempotency token. Links the attendee to an identity managed by
     *        a builder application.
     */

    public void setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
    }

    /**
     * <p>
     * The Amazon Chime SDK external user ID. An idempotency token. Links the attendee to an identity managed by a
     * builder application.
     * </p>
     * 
     * @return The Amazon Chime SDK external user ID. An idempotency token. Links the attendee to an identity managed by
     *         a builder application.
     */

    public String getExternalUserId() {
        return this.externalUserId;
    }

    /**
     * <p>
     * The Amazon Chime SDK external user ID. An idempotency token. Links the attendee to an identity managed by a
     * builder application.
     * </p>
     * 
     * @param externalUserId
     *        The Amazon Chime SDK external user ID. An idempotency token. Links the attendee to an identity managed by
     *        a builder application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAttendeeRequest withExternalUserId(String externalUserId) {
        setExternalUserId(externalUserId);
        return this;
    }

    /**
     * <p>
     * The capabilities (<code>audio</code>, <code>video</code>, or <code>content</code>) that you want to grant an
     * attendee. If you don't specify capabilities, all users have send and receive capabilities on all media channels
     * by default.
     * </p>
     * <note>
     * <p>
     * You use the capabilities with a set of values that control what the capabilities can do, such as
     * <code>SendReceive</code> data. For more information about those values, see .
     * </p>
     * </note>
     * <p>
     * When using capabilities, be aware of these corner cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't set <code>content</code> capabilities to <code>SendReceive</code> or <code>Receive</code> unless you
     * also set <code>video</code> capabilities to <code>SendReceive</code> or <code>Receive</code>. If you don't set
     * the <code>video</code> capability to receive, the response will contain an HTTP 400 Bad Request status code.
     * However, you can set your <code>video</code> capability to receive and you set your <code>content</code>
     * capability to not receive.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you change an <code>audio</code> capability from <code>None</code> or <code>Receive</code> to
     * <code>Send</code> or <code>SendReceive</code> , and if the attendee left their microphone unmuted, audio will
     * flow from the attendee to the other meeting participants.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you change a <code>video</code> or <code>content</code> capability from <code>None</code> or
     * <code>Receive</code> to <code>Send</code> or <code>SendReceive</code> , and if the attendee turned on their video
     * or content streams, remote attendess can receive those streams, but only after media renegotiation between the
     * client and the Amazon Chime back-end server.
     * </p>
     * </li>
     * </ul>
     * 
     * @param capabilities
     *        The capabilities (<code>audio</code>, <code>video</code>, or <code>content</code>) that you want to grant
     *        an attendee. If you don't specify capabilities, all users have send and receive capabilities on all media
     *        channels by default.</p> <note>
     *        <p>
     *        You use the capabilities with a set of values that control what the capabilities can do, such as
     *        <code>SendReceive</code> data. For more information about those values, see .
     *        </p>
     *        </note>
     *        <p>
     *        When using capabilities, be aware of these corner cases:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You can't set <code>content</code> capabilities to <code>SendReceive</code> or <code>Receive</code> unless
     *        you also set <code>video</code> capabilities to <code>SendReceive</code> or <code>Receive</code>. If you
     *        don't set the <code>video</code> capability to receive, the response will contain an HTTP 400 Bad Request
     *        status code. However, you can set your <code>video</code> capability to receive and you set your
     *        <code>content</code> capability to not receive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When you change an <code>audio</code> capability from <code>None</code> or <code>Receive</code> to
     *        <code>Send</code> or <code>SendReceive</code> , and if the attendee left their microphone unmuted, audio
     *        will flow from the attendee to the other meeting participants.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When you change a <code>video</code> or <code>content</code> capability from <code>None</code> or
     *        <code>Receive</code> to <code>Send</code> or <code>SendReceive</code> , and if the attendee turned on
     *        their video or content streams, remote attendess can receive those streams, but only after media
     *        renegotiation between the client and the Amazon Chime back-end server.
     *        </p>
     *        </li>
     */

    public void setCapabilities(AttendeeCapabilities capabilities) {
        this.capabilities = capabilities;
    }

    /**
     * <p>
     * The capabilities (<code>audio</code>, <code>video</code>, or <code>content</code>) that you want to grant an
     * attendee. If you don't specify capabilities, all users have send and receive capabilities on all media channels
     * by default.
     * </p>
     * <note>
     * <p>
     * You use the capabilities with a set of values that control what the capabilities can do, such as
     * <code>SendReceive</code> data. For more information about those values, see .
     * </p>
     * </note>
     * <p>
     * When using capabilities, be aware of these corner cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't set <code>content</code> capabilities to <code>SendReceive</code> or <code>Receive</code> unless you
     * also set <code>video</code> capabilities to <code>SendReceive</code> or <code>Receive</code>. If you don't set
     * the <code>video</code> capability to receive, the response will contain an HTTP 400 Bad Request status code.
     * However, you can set your <code>video</code> capability to receive and you set your <code>content</code>
     * capability to not receive.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you change an <code>audio</code> capability from <code>None</code> or <code>Receive</code> to
     * <code>Send</code> or <code>SendReceive</code> , and if the attendee left their microphone unmuted, audio will
     * flow from the attendee to the other meeting participants.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you change a <code>video</code> or <code>content</code> capability from <code>None</code> or
     * <code>Receive</code> to <code>Send</code> or <code>SendReceive</code> , and if the attendee turned on their video
     * or content streams, remote attendess can receive those streams, but only after media renegotiation between the
     * client and the Amazon Chime back-end server.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The capabilities (<code>audio</code>, <code>video</code>, or <code>content</code>) that you want to grant
     *         an attendee. If you don't specify capabilities, all users have send and receive capabilities on all media
     *         channels by default.</p> <note>
     *         <p>
     *         You use the capabilities with a set of values that control what the capabilities can do, such as
     *         <code>SendReceive</code> data. For more information about those values, see .
     *         </p>
     *         </note>
     *         <p>
     *         When using capabilities, be aware of these corner cases:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You can't set <code>content</code> capabilities to <code>SendReceive</code> or <code>Receive</code>
     *         unless you also set <code>video</code> capabilities to <code>SendReceive</code> or <code>Receive</code>.
     *         If you don't set the <code>video</code> capability to receive, the response will contain an HTTP 400 Bad
     *         Request status code. However, you can set your <code>video</code> capability to receive and you set your
     *         <code>content</code> capability to not receive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         When you change an <code>audio</code> capability from <code>None</code> or <code>Receive</code> to
     *         <code>Send</code> or <code>SendReceive</code> , and if the attendee left their microphone unmuted, audio
     *         will flow from the attendee to the other meeting participants.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         When you change a <code>video</code> or <code>content</code> capability from <code>None</code> or
     *         <code>Receive</code> to <code>Send</code> or <code>SendReceive</code> , and if the attendee turned on
     *         their video or content streams, remote attendess can receive those streams, but only after media
     *         renegotiation between the client and the Amazon Chime back-end server.
     *         </p>
     *         </li>
     */

    public AttendeeCapabilities getCapabilities() {
        return this.capabilities;
    }

    /**
     * <p>
     * The capabilities (<code>audio</code>, <code>video</code>, or <code>content</code>) that you want to grant an
     * attendee. If you don't specify capabilities, all users have send and receive capabilities on all media channels
     * by default.
     * </p>
     * <note>
     * <p>
     * You use the capabilities with a set of values that control what the capabilities can do, such as
     * <code>SendReceive</code> data. For more information about those values, see .
     * </p>
     * </note>
     * <p>
     * When using capabilities, be aware of these corner cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't set <code>content</code> capabilities to <code>SendReceive</code> or <code>Receive</code> unless you
     * also set <code>video</code> capabilities to <code>SendReceive</code> or <code>Receive</code>. If you don't set
     * the <code>video</code> capability to receive, the response will contain an HTTP 400 Bad Request status code.
     * However, you can set your <code>video</code> capability to receive and you set your <code>content</code>
     * capability to not receive.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you change an <code>audio</code> capability from <code>None</code> or <code>Receive</code> to
     * <code>Send</code> or <code>SendReceive</code> , and if the attendee left their microphone unmuted, audio will
     * flow from the attendee to the other meeting participants.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you change a <code>video</code> or <code>content</code> capability from <code>None</code> or
     * <code>Receive</code> to <code>Send</code> or <code>SendReceive</code> , and if the attendee turned on their video
     * or content streams, remote attendess can receive those streams, but only after media renegotiation between the
     * client and the Amazon Chime back-end server.
     * </p>
     * </li>
     * </ul>
     * 
     * @param capabilities
     *        The capabilities (<code>audio</code>, <code>video</code>, or <code>content</code>) that you want to grant
     *        an attendee. If you don't specify capabilities, all users have send and receive capabilities on all media
     *        channels by default.</p> <note>
     *        <p>
     *        You use the capabilities with a set of values that control what the capabilities can do, such as
     *        <code>SendReceive</code> data. For more information about those values, see .
     *        </p>
     *        </note>
     *        <p>
     *        When using capabilities, be aware of these corner cases:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You can't set <code>content</code> capabilities to <code>SendReceive</code> or <code>Receive</code> unless
     *        you also set <code>video</code> capabilities to <code>SendReceive</code> or <code>Receive</code>. If you
     *        don't set the <code>video</code> capability to receive, the response will contain an HTTP 400 Bad Request
     *        status code. However, you can set your <code>video</code> capability to receive and you set your
     *        <code>content</code> capability to not receive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When you change an <code>audio</code> capability from <code>None</code> or <code>Receive</code> to
     *        <code>Send</code> or <code>SendReceive</code> , and if the attendee left their microphone unmuted, audio
     *        will flow from the attendee to the other meeting participants.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When you change a <code>video</code> or <code>content</code> capability from <code>None</code> or
     *        <code>Receive</code> to <code>Send</code> or <code>SendReceive</code> , and if the attendee turned on
     *        their video or content streams, remote attendess can receive those streams, but only after media
     *        renegotiation between the client and the Amazon Chime back-end server.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAttendeeRequest withCapabilities(AttendeeCapabilities capabilities) {
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
        if (getExternalUserId() != null)
            sb.append("ExternalUserId: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof CreateAttendeeRequest == false)
            return false;
        CreateAttendeeRequest other = (CreateAttendeeRequest) obj;
        if (other.getMeetingId() == null ^ this.getMeetingId() == null)
            return false;
        if (other.getMeetingId() != null && other.getMeetingId().equals(this.getMeetingId()) == false)
            return false;
        if (other.getExternalUserId() == null ^ this.getExternalUserId() == null)
            return false;
        if (other.getExternalUserId() != null && other.getExternalUserId().equals(this.getExternalUserId()) == false)
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
        hashCode = prime * hashCode + ((getExternalUserId() == null) ? 0 : getExternalUserId().hashCode());
        hashCode = prime * hashCode + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        return hashCode;
    }

    @Override
    public CreateAttendeeRequest clone() {
        return (CreateAttendeeRequest) super.clone();
    }

}
