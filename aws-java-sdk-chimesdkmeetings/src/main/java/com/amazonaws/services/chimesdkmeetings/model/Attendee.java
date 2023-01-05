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
 * An Amazon Chime SDK meeting attendee. Includes a unique <code>AttendeeId</code> and <code>JoinToken</code>. The
 * <code>JoinToken</code> allows a client to authenticate and join as the specified attendee. The <code>JoinToken</code>
 * expires when the meeting ends, or when <a>DeleteAttendee</a> is called. After that, the attendee is unable to join
 * the meeting.
 * </p>
 * <p>
 * We recommend securely transferring each <code>JoinToken</code> from your server application to the client so that no
 * other client has access to the token except for the one authorized to represent the attendee.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/Attendee" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Attendee implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Chime SDK external user ID. An idempotency token. Links the attendee to an identity managed by a
     * builder application.
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
     * The capabilities assigned to an attendee: audio, video, or content.
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
     * <p>
     * The capabilities assigned to an attendee: audio, video, or content.
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
     *        The capabilities assigned to an attendee: audio, video, or content.</p> <note>
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
     * The capabilities assigned to an attendee: audio, video, or content.
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
     * @return The capabilities assigned to an attendee: audio, video, or content.</p> <note>
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
     * The capabilities assigned to an attendee: audio, video, or content.
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
     *        The capabilities assigned to an attendee: audio, video, or content.</p> <note>
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

    public Attendee withCapabilities(AttendeeCapabilities capabilities) {
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
        if (getExternalUserId() != null)
            sb.append("ExternalUserId: ").append("***Sensitive Data Redacted***").append(",");
        if (getAttendeeId() != null)
            sb.append("AttendeeId: ").append(getAttendeeId()).append(",");
        if (getJoinToken() != null)
            sb.append("JoinToken: ").append("***Sensitive Data Redacted***").append(",");
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

        hashCode = prime * hashCode + ((getExternalUserId() == null) ? 0 : getExternalUserId().hashCode());
        hashCode = prime * hashCode + ((getAttendeeId() == null) ? 0 : getAttendeeId().hashCode());
        hashCode = prime * hashCode + ((getJoinToken() == null) ? 0 : getJoinToken().hashCode());
        hashCode = prime * hashCode + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
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
        com.amazonaws.services.chimesdkmeetings.model.transform.AttendeeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
