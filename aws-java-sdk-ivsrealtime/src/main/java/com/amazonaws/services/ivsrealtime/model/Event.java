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
package com.amazonaws.services.ivsrealtime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An occurrence during a stage session.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/Event" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Event implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If the event is an error event, the error code is provided to give insight into the specific error that occurred.
     * If the event is not an error event, this field is null. <code>INSUFFICIENT_CAPABILITIES</code> indicates that the
     * participant tried to take an action that the participant’s token is not allowed to do. For more information about
     * participant capabilities, see the <code>capabilities</code> field in <a>CreateParticipantToken</a>.
     * <code>QUOTA_EXCEEDED</code> indicates that the number of participants who want to publish/subscribe to a stage
     * exceeds the quota; for more information, see <a
     * href="https://docs.aws.amazon.com/ivs/latest/RealTimeUserGuide/service-quotas.html">Service Quotas</a>.
     * <code>PUBLISHER_NOT_FOUND</code> indicates that the participant tried to subscribe to a publisher that doesn’t
     * exist.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * ISO 8601 timestamp (returned as a string) for when the event occurred.
     * </p>
     */
    private java.util.Date eventTime;
    /**
     * <p>
     * The name of the event.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Unique identifier for the participant who triggered the event. This is assigned by IVS.
     * </p>
     */
    private String participantId;
    /**
     * <p>
     * Unique identifier for the remote participant. For a subscribe event, this is the publisher. For a publish or join
     * event, this is null. This is assigned by IVS.
     * </p>
     */
    private String remoteParticipantId;

    /**
     * <p>
     * If the event is an error event, the error code is provided to give insight into the specific error that occurred.
     * If the event is not an error event, this field is null. <code>INSUFFICIENT_CAPABILITIES</code> indicates that the
     * participant tried to take an action that the participant’s token is not allowed to do. For more information about
     * participant capabilities, see the <code>capabilities</code> field in <a>CreateParticipantToken</a>.
     * <code>QUOTA_EXCEEDED</code> indicates that the number of participants who want to publish/subscribe to a stage
     * exceeds the quota; for more information, see <a
     * href="https://docs.aws.amazon.com/ivs/latest/RealTimeUserGuide/service-quotas.html">Service Quotas</a>.
     * <code>PUBLISHER_NOT_FOUND</code> indicates that the participant tried to subscribe to a publisher that doesn’t
     * exist.
     * </p>
     * 
     * @param errorCode
     *        If the event is an error event, the error code is provided to give insight into the specific error that
     *        occurred. If the event is not an error event, this field is null. <code>INSUFFICIENT_CAPABILITIES</code>
     *        indicates that the participant tried to take an action that the participant’s token is not allowed to do.
     *        For more information about participant capabilities, see the <code>capabilities</code> field in
     *        <a>CreateParticipantToken</a>. <code>QUOTA_EXCEEDED</code> indicates that the number of participants who
     *        want to publish/subscribe to a stage exceeds the quota; for more information, see <a
     *        href="https://docs.aws.amazon.com/ivs/latest/RealTimeUserGuide/service-quotas.html">Service Quotas</a>.
     *        <code>PUBLISHER_NOT_FOUND</code> indicates that the participant tried to subscribe to a publisher that
     *        doesn’t exist.
     * @see EventErrorCode
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * If the event is an error event, the error code is provided to give insight into the specific error that occurred.
     * If the event is not an error event, this field is null. <code>INSUFFICIENT_CAPABILITIES</code> indicates that the
     * participant tried to take an action that the participant’s token is not allowed to do. For more information about
     * participant capabilities, see the <code>capabilities</code> field in <a>CreateParticipantToken</a>.
     * <code>QUOTA_EXCEEDED</code> indicates that the number of participants who want to publish/subscribe to a stage
     * exceeds the quota; for more information, see <a
     * href="https://docs.aws.amazon.com/ivs/latest/RealTimeUserGuide/service-quotas.html">Service Quotas</a>.
     * <code>PUBLISHER_NOT_FOUND</code> indicates that the participant tried to subscribe to a publisher that doesn’t
     * exist.
     * </p>
     * 
     * @return If the event is an error event, the error code is provided to give insight into the specific error that
     *         occurred. If the event is not an error event, this field is null. <code>INSUFFICIENT_CAPABILITIES</code>
     *         indicates that the participant tried to take an action that the participant’s token is not allowed to do.
     *         For more information about participant capabilities, see the <code>capabilities</code> field in
     *         <a>CreateParticipantToken</a>. <code>QUOTA_EXCEEDED</code> indicates that the number of participants who
     *         want to publish/subscribe to a stage exceeds the quota; for more information, see <a
     *         href="https://docs.aws.amazon.com/ivs/latest/RealTimeUserGuide/service-quotas.html">Service Quotas</a>.
     *         <code>PUBLISHER_NOT_FOUND</code> indicates that the participant tried to subscribe to a publisher that
     *         doesn’t exist.
     * @see EventErrorCode
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * If the event is an error event, the error code is provided to give insight into the specific error that occurred.
     * If the event is not an error event, this field is null. <code>INSUFFICIENT_CAPABILITIES</code> indicates that the
     * participant tried to take an action that the participant’s token is not allowed to do. For more information about
     * participant capabilities, see the <code>capabilities</code> field in <a>CreateParticipantToken</a>.
     * <code>QUOTA_EXCEEDED</code> indicates that the number of participants who want to publish/subscribe to a stage
     * exceeds the quota; for more information, see <a
     * href="https://docs.aws.amazon.com/ivs/latest/RealTimeUserGuide/service-quotas.html">Service Quotas</a>.
     * <code>PUBLISHER_NOT_FOUND</code> indicates that the participant tried to subscribe to a publisher that doesn’t
     * exist.
     * </p>
     * 
     * @param errorCode
     *        If the event is an error event, the error code is provided to give insight into the specific error that
     *        occurred. If the event is not an error event, this field is null. <code>INSUFFICIENT_CAPABILITIES</code>
     *        indicates that the participant tried to take an action that the participant’s token is not allowed to do.
     *        For more information about participant capabilities, see the <code>capabilities</code> field in
     *        <a>CreateParticipantToken</a>. <code>QUOTA_EXCEEDED</code> indicates that the number of participants who
     *        want to publish/subscribe to a stage exceeds the quota; for more information, see <a
     *        href="https://docs.aws.amazon.com/ivs/latest/RealTimeUserGuide/service-quotas.html">Service Quotas</a>.
     *        <code>PUBLISHER_NOT_FOUND</code> indicates that the participant tried to subscribe to a publisher that
     *        doesn’t exist.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventErrorCode
     */

    public Event withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * If the event is an error event, the error code is provided to give insight into the specific error that occurred.
     * If the event is not an error event, this field is null. <code>INSUFFICIENT_CAPABILITIES</code> indicates that the
     * participant tried to take an action that the participant’s token is not allowed to do. For more information about
     * participant capabilities, see the <code>capabilities</code> field in <a>CreateParticipantToken</a>.
     * <code>QUOTA_EXCEEDED</code> indicates that the number of participants who want to publish/subscribe to a stage
     * exceeds the quota; for more information, see <a
     * href="https://docs.aws.amazon.com/ivs/latest/RealTimeUserGuide/service-quotas.html">Service Quotas</a>.
     * <code>PUBLISHER_NOT_FOUND</code> indicates that the participant tried to subscribe to a publisher that doesn’t
     * exist.
     * </p>
     * 
     * @param errorCode
     *        If the event is an error event, the error code is provided to give insight into the specific error that
     *        occurred. If the event is not an error event, this field is null. <code>INSUFFICIENT_CAPABILITIES</code>
     *        indicates that the participant tried to take an action that the participant’s token is not allowed to do.
     *        For more information about participant capabilities, see the <code>capabilities</code> field in
     *        <a>CreateParticipantToken</a>. <code>QUOTA_EXCEEDED</code> indicates that the number of participants who
     *        want to publish/subscribe to a stage exceeds the quota; for more information, see <a
     *        href="https://docs.aws.amazon.com/ivs/latest/RealTimeUserGuide/service-quotas.html">Service Quotas</a>.
     *        <code>PUBLISHER_NOT_FOUND</code> indicates that the participant tried to subscribe to a publisher that
     *        doesn’t exist.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventErrorCode
     */

    public Event withErrorCode(EventErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * <p>
     * ISO 8601 timestamp (returned as a string) for when the event occurred.
     * </p>
     * 
     * @param eventTime
     *        ISO 8601 timestamp (returned as a string) for when the event occurred.
     */

    public void setEventTime(java.util.Date eventTime) {
        this.eventTime = eventTime;
    }

    /**
     * <p>
     * ISO 8601 timestamp (returned as a string) for when the event occurred.
     * </p>
     * 
     * @return ISO 8601 timestamp (returned as a string) for when the event occurred.
     */

    public java.util.Date getEventTime() {
        return this.eventTime;
    }

    /**
     * <p>
     * ISO 8601 timestamp (returned as a string) for when the event occurred.
     * </p>
     * 
     * @param eventTime
     *        ISO 8601 timestamp (returned as a string) for when the event occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withEventTime(java.util.Date eventTime) {
        setEventTime(eventTime);
        return this;
    }

    /**
     * <p>
     * The name of the event.
     * </p>
     * 
     * @param name
     *        The name of the event.
     * @see EventName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the event.
     * </p>
     * 
     * @return The name of the event.
     * @see EventName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the event.
     * </p>
     * 
     * @param name
     *        The name of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventName
     */

    public Event withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the event.
     * </p>
     * 
     * @param name
     *        The name of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventName
     */

    public Event withName(EventName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * Unique identifier for the participant who triggered the event. This is assigned by IVS.
     * </p>
     * 
     * @param participantId
     *        Unique identifier for the participant who triggered the event. This is assigned by IVS.
     */

    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }

    /**
     * <p>
     * Unique identifier for the participant who triggered the event. This is assigned by IVS.
     * </p>
     * 
     * @return Unique identifier for the participant who triggered the event. This is assigned by IVS.
     */

    public String getParticipantId() {
        return this.participantId;
    }

    /**
     * <p>
     * Unique identifier for the participant who triggered the event. This is assigned by IVS.
     * </p>
     * 
     * @param participantId
     *        Unique identifier for the participant who triggered the event. This is assigned by IVS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withParticipantId(String participantId) {
        setParticipantId(participantId);
        return this;
    }

    /**
     * <p>
     * Unique identifier for the remote participant. For a subscribe event, this is the publisher. For a publish or join
     * event, this is null. This is assigned by IVS.
     * </p>
     * 
     * @param remoteParticipantId
     *        Unique identifier for the remote participant. For a subscribe event, this is the publisher. For a publish
     *        or join event, this is null. This is assigned by IVS.
     */

    public void setRemoteParticipantId(String remoteParticipantId) {
        this.remoteParticipantId = remoteParticipantId;
    }

    /**
     * <p>
     * Unique identifier for the remote participant. For a subscribe event, this is the publisher. For a publish or join
     * event, this is null. This is assigned by IVS.
     * </p>
     * 
     * @return Unique identifier for the remote participant. For a subscribe event, this is the publisher. For a publish
     *         or join event, this is null. This is assigned by IVS.
     */

    public String getRemoteParticipantId() {
        return this.remoteParticipantId;
    }

    /**
     * <p>
     * Unique identifier for the remote participant. For a subscribe event, this is the publisher. For a publish or join
     * event, this is null. This is assigned by IVS.
     * </p>
     * 
     * @param remoteParticipantId
     *        Unique identifier for the remote participant. For a subscribe event, this is the publisher. For a publish
     *        or join event, this is null. This is assigned by IVS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withRemoteParticipantId(String remoteParticipantId) {
        setRemoteParticipantId(remoteParticipantId);
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
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getEventTime() != null)
            sb.append("EventTime: ").append(getEventTime()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getParticipantId() != null)
            sb.append("ParticipantId: ").append(getParticipantId()).append(",");
        if (getRemoteParticipantId() != null)
            sb.append("RemoteParticipantId: ").append(getRemoteParticipantId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Event == false)
            return false;
        Event other = (Event) obj;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getEventTime() == null ^ this.getEventTime() == null)
            return false;
        if (other.getEventTime() != null && other.getEventTime().equals(this.getEventTime()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getParticipantId() == null ^ this.getParticipantId() == null)
            return false;
        if (other.getParticipantId() != null && other.getParticipantId().equals(this.getParticipantId()) == false)
            return false;
        if (other.getRemoteParticipantId() == null ^ this.getRemoteParticipantId() == null)
            return false;
        if (other.getRemoteParticipantId() != null && other.getRemoteParticipantId().equals(this.getRemoteParticipantId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getEventTime() == null) ? 0 : getEventTime().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getParticipantId() == null) ? 0 : getParticipantId().hashCode());
        hashCode = prime * hashCode + ((getRemoteParticipantId() == null) ? 0 : getRemoteParticipantId().hashCode());
        return hashCode;
    }

    @Override
    public Event clone() {
        try {
            return (Event) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ivsrealtime.model.transform.EventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
