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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/DescribeReplay" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReplayResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the replay.
     * </p>
     */
    private String replayName;
    /**
     * <p>
     * The ARN of the replay.
     * </p>
     */
    private String replayArn;
    /**
     * <p>
     * The description of the replay.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The current state of the replay.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The reason that the replay is in the current state.
     * </p>
     */
    private String stateReason;
    /**
     * <p>
     * The ARN of the archive events were replayed from.
     * </p>
     */
    private String eventSourceArn;
    /**
     * <p>
     * A <code>ReplayDestination</code> object that contains details about the replay.
     * </p>
     */
    private ReplayDestination destination;
    /**
     * <p>
     * The time stamp of the first event that was last replayed from the archive.
     * </p>
     */
    private java.util.Date eventStartTime;
    /**
     * <p>
     * The time stamp for the last event that was replayed from the archive.
     * </p>
     */
    private java.util.Date eventEndTime;
    /**
     * <p>
     * The time that the event was last replayed.
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
     * A time stamp for the time that the replay stopped.
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

    public DescribeReplayResult withReplayName(String replayName) {
        setReplayName(replayName);
        return this;
    }

    /**
     * <p>
     * The ARN of the replay.
     * </p>
     * 
     * @param replayArn
     *        The ARN of the replay.
     */

    public void setReplayArn(String replayArn) {
        this.replayArn = replayArn;
    }

    /**
     * <p>
     * The ARN of the replay.
     * </p>
     * 
     * @return The ARN of the replay.
     */

    public String getReplayArn() {
        return this.replayArn;
    }

    /**
     * <p>
     * The ARN of the replay.
     * </p>
     * 
     * @param replayArn
     *        The ARN of the replay.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplayResult withReplayArn(String replayArn) {
        setReplayArn(replayArn);
        return this;
    }

    /**
     * <p>
     * The description of the replay.
     * </p>
     * 
     * @param description
     *        The description of the replay.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the replay.
     * </p>
     * 
     * @return The description of the replay.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the replay.
     * </p>
     * 
     * @param description
     *        The description of the replay.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplayResult withDescription(String description) {
        setDescription(description);
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

    public DescribeReplayResult withState(String state) {
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

    public DescribeReplayResult withState(ReplayState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The reason that the replay is in the current state.
     * </p>
     * 
     * @param stateReason
     *        The reason that the replay is in the current state.
     */

    public void setStateReason(String stateReason) {
        this.stateReason = stateReason;
    }

    /**
     * <p>
     * The reason that the replay is in the current state.
     * </p>
     * 
     * @return The reason that the replay is in the current state.
     */

    public String getStateReason() {
        return this.stateReason;
    }

    /**
     * <p>
     * The reason that the replay is in the current state.
     * </p>
     * 
     * @param stateReason
     *        The reason that the replay is in the current state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplayResult withStateReason(String stateReason) {
        setStateReason(stateReason);
        return this;
    }

    /**
     * <p>
     * The ARN of the archive events were replayed from.
     * </p>
     * 
     * @param eventSourceArn
     *        The ARN of the archive events were replayed from.
     */

    public void setEventSourceArn(String eventSourceArn) {
        this.eventSourceArn = eventSourceArn;
    }

    /**
     * <p>
     * The ARN of the archive events were replayed from.
     * </p>
     * 
     * @return The ARN of the archive events were replayed from.
     */

    public String getEventSourceArn() {
        return this.eventSourceArn;
    }

    /**
     * <p>
     * The ARN of the archive events were replayed from.
     * </p>
     * 
     * @param eventSourceArn
     *        The ARN of the archive events were replayed from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplayResult withEventSourceArn(String eventSourceArn) {
        setEventSourceArn(eventSourceArn);
        return this;
    }

    /**
     * <p>
     * A <code>ReplayDestination</code> object that contains details about the replay.
     * </p>
     * 
     * @param destination
     *        A <code>ReplayDestination</code> object that contains details about the replay.
     */

    public void setDestination(ReplayDestination destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * A <code>ReplayDestination</code> object that contains details about the replay.
     * </p>
     * 
     * @return A <code>ReplayDestination</code> object that contains details about the replay.
     */

    public ReplayDestination getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * A <code>ReplayDestination</code> object that contains details about the replay.
     * </p>
     * 
     * @param destination
     *        A <code>ReplayDestination</code> object that contains details about the replay.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplayResult withDestination(ReplayDestination destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The time stamp of the first event that was last replayed from the archive.
     * </p>
     * 
     * @param eventStartTime
     *        The time stamp of the first event that was last replayed from the archive.
     */

    public void setEventStartTime(java.util.Date eventStartTime) {
        this.eventStartTime = eventStartTime;
    }

    /**
     * <p>
     * The time stamp of the first event that was last replayed from the archive.
     * </p>
     * 
     * @return The time stamp of the first event that was last replayed from the archive.
     */

    public java.util.Date getEventStartTime() {
        return this.eventStartTime;
    }

    /**
     * <p>
     * The time stamp of the first event that was last replayed from the archive.
     * </p>
     * 
     * @param eventStartTime
     *        The time stamp of the first event that was last replayed from the archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplayResult withEventStartTime(java.util.Date eventStartTime) {
        setEventStartTime(eventStartTime);
        return this;
    }

    /**
     * <p>
     * The time stamp for the last event that was replayed from the archive.
     * </p>
     * 
     * @param eventEndTime
     *        The time stamp for the last event that was replayed from the archive.
     */

    public void setEventEndTime(java.util.Date eventEndTime) {
        this.eventEndTime = eventEndTime;
    }

    /**
     * <p>
     * The time stamp for the last event that was replayed from the archive.
     * </p>
     * 
     * @return The time stamp for the last event that was replayed from the archive.
     */

    public java.util.Date getEventEndTime() {
        return this.eventEndTime;
    }

    /**
     * <p>
     * The time stamp for the last event that was replayed from the archive.
     * </p>
     * 
     * @param eventEndTime
     *        The time stamp for the last event that was replayed from the archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplayResult withEventEndTime(java.util.Date eventEndTime) {
        setEventEndTime(eventEndTime);
        return this;
    }

    /**
     * <p>
     * The time that the event was last replayed.
     * </p>
     * 
     * @param eventLastReplayedTime
     *        The time that the event was last replayed.
     */

    public void setEventLastReplayedTime(java.util.Date eventLastReplayedTime) {
        this.eventLastReplayedTime = eventLastReplayedTime;
    }

    /**
     * <p>
     * The time that the event was last replayed.
     * </p>
     * 
     * @return The time that the event was last replayed.
     */

    public java.util.Date getEventLastReplayedTime() {
        return this.eventLastReplayedTime;
    }

    /**
     * <p>
     * The time that the event was last replayed.
     * </p>
     * 
     * @param eventLastReplayedTime
     *        The time that the event was last replayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplayResult withEventLastReplayedTime(java.util.Date eventLastReplayedTime) {
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

    public DescribeReplayResult withReplayStartTime(java.util.Date replayStartTime) {
        setReplayStartTime(replayStartTime);
        return this;
    }

    /**
     * <p>
     * A time stamp for the time that the replay stopped.
     * </p>
     * 
     * @param replayEndTime
     *        A time stamp for the time that the replay stopped.
     */

    public void setReplayEndTime(java.util.Date replayEndTime) {
        this.replayEndTime = replayEndTime;
    }

    /**
     * <p>
     * A time stamp for the time that the replay stopped.
     * </p>
     * 
     * @return A time stamp for the time that the replay stopped.
     */

    public java.util.Date getReplayEndTime() {
        return this.replayEndTime;
    }

    /**
     * <p>
     * A time stamp for the time that the replay stopped.
     * </p>
     * 
     * @param replayEndTime
     *        A time stamp for the time that the replay stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplayResult withReplayEndTime(java.util.Date replayEndTime) {
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
        if (getReplayArn() != null)
            sb.append("ReplayArn: ").append(getReplayArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStateReason() != null)
            sb.append("StateReason: ").append(getStateReason()).append(",");
        if (getEventSourceArn() != null)
            sb.append("EventSourceArn: ").append(getEventSourceArn()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
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

        if (obj instanceof DescribeReplayResult == false)
            return false;
        DescribeReplayResult other = (DescribeReplayResult) obj;
        if (other.getReplayName() == null ^ this.getReplayName() == null)
            return false;
        if (other.getReplayName() != null && other.getReplayName().equals(this.getReplayName()) == false)
            return false;
        if (other.getReplayArn() == null ^ this.getReplayArn() == null)
            return false;
        if (other.getReplayArn() != null && other.getReplayArn().equals(this.getReplayArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateReason() == null ^ this.getStateReason() == null)
            return false;
        if (other.getStateReason() != null && other.getStateReason().equals(this.getStateReason()) == false)
            return false;
        if (other.getEventSourceArn() == null ^ this.getEventSourceArn() == null)
            return false;
        if (other.getEventSourceArn() != null && other.getEventSourceArn().equals(this.getEventSourceArn()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
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
        hashCode = prime * hashCode + ((getReplayArn() == null) ? 0 : getReplayArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateReason() == null) ? 0 : getStateReason().hashCode());
        hashCode = prime * hashCode + ((getEventSourceArn() == null) ? 0 : getEventSourceArn().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getEventStartTime() == null) ? 0 : getEventStartTime().hashCode());
        hashCode = prime * hashCode + ((getEventEndTime() == null) ? 0 : getEventEndTime().hashCode());
        hashCode = prime * hashCode + ((getEventLastReplayedTime() == null) ? 0 : getEventLastReplayedTime().hashCode());
        hashCode = prime * hashCode + ((getReplayStartTime() == null) ? 0 : getReplayStartTime().hashCode());
        hashCode = prime * hashCode + ((getReplayEndTime() == null) ? 0 : getReplayEndTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReplayResult clone() {
        try {
            return (DescribeReplayResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
