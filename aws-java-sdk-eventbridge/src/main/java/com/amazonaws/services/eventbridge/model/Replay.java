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
package com.amazonaws.services.eventbridge.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A <code>Replay</code> object that contains details about a replay.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/Replay" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Replay implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the replay.
     * </p>
     */
    private String replayName;
    /**
     * <p>
     * The ARN of the archive to replay event from.
     * </p>
     */
    private String eventSourceArn;
    /**
     * <p>
     * The current state of the replay.
     * </p>
     */
    private String state;
    /**
     * <p>
     * A description of why the replay is in the current state.
     * </p>
     */
    private String stateReason;
    /**
     * <p>
     * A time stamp for the time to start replaying events. This is determined by the time in the event as described in
     * <a href=
     * "https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEventsRequestEntry.html#eventbridge-Type-PutEventsRequestEntry-Time"
     * >Time</a>.
     * </p>
     */
    private java.util.Date eventStartTime;
    /**
     * <p>
     * A time stamp for the time to start replaying events. Any event with a creation time prior to the
     * <code>EventEndTime</code> specified is replayed.
     * </p>
     */
    private java.util.Date eventEndTime;
    /**
     * <p>
     * A time stamp for the time that the last event was replayed.
     * </p>
     */
    private java.util.Date eventLastReplayedTime;
    /**
     * <p>
     * A time stamp for the time that the replay started.
     * </p>
     */
    private java.util.Date replayStartTime;
    /**
     * <p>
     * A time stamp for the time that the replay completed.
     * </p>
     */
    private java.util.Date replayEndTime;

    /**
     * <p>
     * The name of the replay.
     * </p>
     * 
     * @param replayName
     *        The name of the replay.
     */

    public void setReplayName(String replayName) {
        this.replayName = replayName;
    }

    /**
     * <p>
     * The name of the replay.
     * </p>
     * 
     * @return The name of the replay.
     */

    public String getReplayName() {
        return this.replayName;
    }

    /**
     * <p>
     * The name of the replay.
     * </p>
     * 
     * @param replayName
     *        The name of the replay.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Replay withReplayName(String replayName) {
        setReplayName(replayName);
        return this;
    }

    /**
     * <p>
     * The ARN of the archive to replay event from.
     * </p>
     * 
     * @param eventSourceArn
     *        The ARN of the archive to replay event from.
     */

    public void setEventSourceArn(String eventSourceArn) {
        this.eventSourceArn = eventSourceArn;
    }

    /**
     * <p>
     * The ARN of the archive to replay event from.
     * </p>
     * 
     * @return The ARN of the archive to replay event from.
     */

    public String getEventSourceArn() {
        return this.eventSourceArn;
    }

    /**
     * <p>
     * The ARN of the archive to replay event from.
     * </p>
     * 
     * @param eventSourceArn
     *        The ARN of the archive to replay event from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Replay withEventSourceArn(String eventSourceArn) {
        setEventSourceArn(eventSourceArn);
        return this;
    }

    /**
     * <p>
     * The current state of the replay.
     * </p>
     * 
     * @param state
     *        The current state of the replay.
     * @see ReplayState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the replay.
     * </p>
     * 
     * @return The current state of the replay.
     * @see ReplayState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the replay.
     * </p>
     * 
     * @param state
     *        The current state of the replay.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplayState
     */

    public Replay withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the replay.
     * </p>
     * 
     * @param state
     *        The current state of the replay.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplayState
     */

    public Replay withState(ReplayState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * A description of why the replay is in the current state.
     * </p>
     * 
     * @param stateReason
     *        A description of why the replay is in the current state.
     */

    public void setStateReason(String stateReason) {
        this.stateReason = stateReason;
    }

    /**
     * <p>
     * A description of why the replay is in the current state.
     * </p>
     * 
     * @return A description of why the replay is in the current state.
     */

    public String getStateReason() {
        return this.stateReason;
    }

    /**
     * <p>
     * A description of why the replay is in the current state.
     * </p>
     * 
     * @param stateReason
     *        A description of why the replay is in the current state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Replay withStateReason(String stateReason) {
        setStateReason(stateReason);
        return this;
    }

    /**
     * <p>
     * A time stamp for the time to start replaying events. This is determined by the time in the event as described in
     * <a href=
     * "https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEventsRequestEntry.html#eventbridge-Type-PutEventsRequestEntry-Time"
     * >Time</a>.
     * </p>
     * 
     * @param eventStartTime
     *        A time stamp for the time to start replaying events. This is determined by the time in the event as
     *        described in <a href=
     *        "https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEventsRequestEntry.html#eventbridge-Type-PutEventsRequestEntry-Time"
     *        >Time</a>.
     */

    public void setEventStartTime(java.util.Date eventStartTime) {
        this.eventStartTime = eventStartTime;
    }

    /**
     * <p>
     * A time stamp for the time to start replaying events. This is determined by the time in the event as described in
     * <a href=
     * "https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEventsRequestEntry.html#eventbridge-Type-PutEventsRequestEntry-Time"
     * >Time</a>.
     * </p>
     * 
     * @return A time stamp for the time to start replaying events. This is determined by the time in the event as
     *         described in <a href=
     *         "https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEventsRequestEntry.html#eventbridge-Type-PutEventsRequestEntry-Time"
     *         >Time</a>.
     */

    public java.util.Date getEventStartTime() {
        return this.eventStartTime;
    }

    /**
     * <p>
     * A time stamp for the time to start replaying events. This is determined by the time in the event as described in
     * <a href=
     * "https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEventsRequestEntry.html#eventbridge-Type-PutEventsRequestEntry-Time"
     * >Time</a>.
     * </p>
     * 
     * @param eventStartTime
     *        A time stamp for the time to start replaying events. This is determined by the time in the event as
     *        described in <a href=
     *        "https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEventsRequestEntry.html#eventbridge-Type-PutEventsRequestEntry-Time"
     *        >Time</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Replay withEventStartTime(java.util.Date eventStartTime) {
        setEventStartTime(eventStartTime);
        return this;
    }

    /**
     * <p>
     * A time stamp for the time to start replaying events. Any event with a creation time prior to the
     * <code>EventEndTime</code> specified is replayed.
     * </p>
     * 
     * @param eventEndTime
     *        A time stamp for the time to start replaying events. Any event with a creation time prior to the
     *        <code>EventEndTime</code> specified is replayed.
     */

    public void setEventEndTime(java.util.Date eventEndTime) {
        this.eventEndTime = eventEndTime;
    }

    /**
     * <p>
     * A time stamp for the time to start replaying events. Any event with a creation time prior to the
     * <code>EventEndTime</code> specified is replayed.
     * </p>
     * 
     * @return A time stamp for the time to start replaying events. Any event with a creation time prior to the
     *         <code>EventEndTime</code> specified is replayed.
     */

    public java.util.Date getEventEndTime() {
        return this.eventEndTime;
    }

    /**
     * <p>
     * A time stamp for the time to start replaying events. Any event with a creation time prior to the
     * <code>EventEndTime</code> specified is replayed.
     * </p>
     * 
     * @param eventEndTime
     *        A time stamp for the time to start replaying events. Any event with a creation time prior to the
     *        <code>EventEndTime</code> specified is replayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Replay withEventEndTime(java.util.Date eventEndTime) {
        setEventEndTime(eventEndTime);
        return this;
    }

    /**
     * <p>
     * A time stamp for the time that the last event was replayed.
     * </p>
     * 
     * @param eventLastReplayedTime
     *        A time stamp for the time that the last event was replayed.
     */

    public void setEventLastReplayedTime(java.util.Date eventLastReplayedTime) {
        this.eventLastReplayedTime = eventLastReplayedTime;
    }

    /**
     * <p>
     * A time stamp for the time that the last event was replayed.
     * </p>
     * 
     * @return A time stamp for the time that the last event was replayed.
     */

    public java.util.Date getEventLastReplayedTime() {
        return this.eventLastReplayedTime;
    }

    /**
     * <p>
     * A time stamp for the time that the last event was replayed.
     * </p>
     * 
     * @param eventLastReplayedTime
     *        A time stamp for the time that the last event was replayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Replay withEventLastReplayedTime(java.util.Date eventLastReplayedTime) {
        setEventLastReplayedTime(eventLastReplayedTime);
        return this;
    }

    /**
     * <p>
     * A time stamp for the time that the replay started.
     * </p>
     * 
     * @param replayStartTime
     *        A time stamp for the time that the replay started.
     */

    public void setReplayStartTime(java.util.Date replayStartTime) {
        this.replayStartTime = replayStartTime;
    }

    /**
     * <p>
     * A time stamp for the time that the replay started.
     * </p>
     * 
     * @return A time stamp for the time that the replay started.
     */

    public java.util.Date getReplayStartTime() {
        return this.replayStartTime;
    }

    /**
     * <p>
     * A time stamp for the time that the replay started.
     * </p>
     * 
     * @param replayStartTime
     *        A time stamp for the time that the replay started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Replay withReplayStartTime(java.util.Date replayStartTime) {
        setReplayStartTime(replayStartTime);
        return this;
    }

    /**
     * <p>
     * A time stamp for the time that the replay completed.
     * </p>
     * 
     * @param replayEndTime
     *        A time stamp for the time that the replay completed.
     */

    public void setReplayEndTime(java.util.Date replayEndTime) {
        this.replayEndTime = replayEndTime;
    }

    /**
     * <p>
     * A time stamp for the time that the replay completed.
     * </p>
     * 
     * @return A time stamp for the time that the replay completed.
     */

    public java.util.Date getReplayEndTime() {
        return this.replayEndTime;
    }

    /**
     * <p>
     * A time stamp for the time that the replay completed.
     * </p>
     * 
     * @param replayEndTime
     *        A time stamp for the time that the replay completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Replay withReplayEndTime(java.util.Date replayEndTime) {
        setReplayEndTime(replayEndTime);
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
        if (getReplayName() != null)
            sb.append("ReplayName: ").append(getReplayName()).append(",");
        if (getEventSourceArn() != null)
            sb.append("EventSourceArn: ").append(getEventSourceArn()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStateReason() != null)
            sb.append("StateReason: ").append(getStateReason()).append(",");
        if (getEventStartTime() != null)
            sb.append("EventStartTime: ").append(getEventStartTime()).append(",");
        if (getEventEndTime() != null)
            sb.append("EventEndTime: ").append(getEventEndTime()).append(",");
        if (getEventLastReplayedTime() != null)
            sb.append("EventLastReplayedTime: ").append(getEventLastReplayedTime()).append(",");
        if (getReplayStartTime() != null)
            sb.append("ReplayStartTime: ").append(getReplayStartTime()).append(",");
        if (getReplayEndTime() != null)
            sb.append("ReplayEndTime: ").append(getReplayEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Replay == false)
            return false;
        Replay other = (Replay) obj;
        if (other.getReplayName() == null ^ this.getReplayName() == null)
            return false;
        if (other.getReplayName() != null && other.getReplayName().equals(this.getReplayName()) == false)
            return false;
        if (other.getEventSourceArn() == null ^ this.getEventSourceArn() == null)
            return false;
        if (other.getEventSourceArn() != null && other.getEventSourceArn().equals(this.getEventSourceArn()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateReason() == null ^ this.getStateReason() == null)
            return false;
        if (other.getStateReason() != null && other.getStateReason().equals(this.getStateReason()) == false)
            return false;
        if (other.getEventStartTime() == null ^ this.getEventStartTime() == null)
            return false;
        if (other.getEventStartTime() != null && other.getEventStartTime().equals(this.getEventStartTime()) == false)
            return false;
        if (other.getEventEndTime() == null ^ this.getEventEndTime() == null)
            return false;
        if (other.getEventEndTime() != null && other.getEventEndTime().equals(this.getEventEndTime()) == false)
            return false;
        if (other.getEventLastReplayedTime() == null ^ this.getEventLastReplayedTime() == null)
            return false;
        if (other.getEventLastReplayedTime() != null && other.getEventLastReplayedTime().equals(this.getEventLastReplayedTime()) == false)
            return false;
        if (other.getReplayStartTime() == null ^ this.getReplayStartTime() == null)
            return false;
        if (other.getReplayStartTime() != null && other.getReplayStartTime().equals(this.getReplayStartTime()) == false)
            return false;
        if (other.getReplayEndTime() == null ^ this.getReplayEndTime() == null)
            return false;
        if (other.getReplayEndTime() != null && other.getReplayEndTime().equals(this.getReplayEndTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplayName() == null) ? 0 : getReplayName().hashCode());
        hashCode = prime * hashCode + ((getEventSourceArn() == null) ? 0 : getEventSourceArn().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateReason() == null) ? 0 : getStateReason().hashCode());
        hashCode = prime * hashCode + ((getEventStartTime() == null) ? 0 : getEventStartTime().hashCode());
        hashCode = prime * hashCode + ((getEventEndTime() == null) ? 0 : getEventEndTime().hashCode());
        hashCode = prime * hashCode + ((getEventLastReplayedTime() == null) ? 0 : getEventLastReplayedTime().hashCode());
        hashCode = prime * hashCode + ((getReplayStartTime() == null) ? 0 : getReplayStartTime().hashCode());
        hashCode = prime * hashCode + ((getReplayEndTime() == null) ? 0 : getReplayEndTime().hashCode());
        return hashCode;
    }

    @Override
    public Replay clone() {
        try {
            return (Replay) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eventbridge.model.transform.ReplayMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
