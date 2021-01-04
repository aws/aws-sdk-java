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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/StartReplay" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartReplayRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the replay to start.
     * </p>
     */
    private String replayName;
    /**
     * <p>
     * A description for the replay to start.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ARN of the archive to replay events from.
     * </p>
     */
    private String eventSourceArn;
    /**
     * <p>
     * A time stamp for the time to start replaying events. Only events that occurred between the
     * <code>EventStartTime</code> and <code>EventEndTime</code> are replayed.
     * </p>
     */
    private java.util.Date eventStartTime;
    /**
     * <p>
     * A time stamp for the time to stop replaying events. Only events that occurred between the
     * <code>EventStartTime</code> and <code>EventEndTime</code> are replayed.
     * </p>
     */
    private java.util.Date eventEndTime;
    /**
     * <p>
     * A <code>ReplayDestination</code> object that includes details about the destination for the replay.
     * </p>
     */
    private ReplayDestination destination;

    /**
     * <p>
     * The name of the replay to start.
     * </p>
     * 
     * @param replayName
     *        The name of the replay to start.
     */

    public void setReplayName(String replayName) {
        this.replayName = replayName;
    }

    /**
     * <p>
     * The name of the replay to start.
     * </p>
     * 
     * @return The name of the replay to start.
     */

    public String getReplayName() {
        return this.replayName;
    }

    /**
     * <p>
     * The name of the replay to start.
     * </p>
     * 
     * @param replayName
     *        The name of the replay to start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReplayRequest withReplayName(String replayName) {
        setReplayName(replayName);
        return this;
    }

    /**
     * <p>
     * A description for the replay to start.
     * </p>
     * 
     * @param description
     *        A description for the replay to start.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the replay to start.
     * </p>
     * 
     * @return A description for the replay to start.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the replay to start.
     * </p>
     * 
     * @param description
     *        A description for the replay to start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReplayRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ARN of the archive to replay events from.
     * </p>
     * 
     * @param eventSourceArn
     *        The ARN of the archive to replay events from.
     */

    public void setEventSourceArn(String eventSourceArn) {
        this.eventSourceArn = eventSourceArn;
    }

    /**
     * <p>
     * The ARN of the archive to replay events from.
     * </p>
     * 
     * @return The ARN of the archive to replay events from.
     */

    public String getEventSourceArn() {
        return this.eventSourceArn;
    }

    /**
     * <p>
     * The ARN of the archive to replay events from.
     * </p>
     * 
     * @param eventSourceArn
     *        The ARN of the archive to replay events from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReplayRequest withEventSourceArn(String eventSourceArn) {
        setEventSourceArn(eventSourceArn);
        return this;
    }

    /**
     * <p>
     * A time stamp for the time to start replaying events. Only events that occurred between the
     * <code>EventStartTime</code> and <code>EventEndTime</code> are replayed.
     * </p>
     * 
     * @param eventStartTime
     *        A time stamp for the time to start replaying events. Only events that occurred between the
     *        <code>EventStartTime</code> and <code>EventEndTime</code> are replayed.
     */

    public void setEventStartTime(java.util.Date eventStartTime) {
        this.eventStartTime = eventStartTime;
    }

    /**
     * <p>
     * A time stamp for the time to start replaying events. Only events that occurred between the
     * <code>EventStartTime</code> and <code>EventEndTime</code> are replayed.
     * </p>
     * 
     * @return A time stamp for the time to start replaying events. Only events that occurred between the
     *         <code>EventStartTime</code> and <code>EventEndTime</code> are replayed.
     */

    public java.util.Date getEventStartTime() {
        return this.eventStartTime;
    }

    /**
     * <p>
     * A time stamp for the time to start replaying events. Only events that occurred between the
     * <code>EventStartTime</code> and <code>EventEndTime</code> are replayed.
     * </p>
     * 
     * @param eventStartTime
     *        A time stamp for the time to start replaying events. Only events that occurred between the
     *        <code>EventStartTime</code> and <code>EventEndTime</code> are replayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReplayRequest withEventStartTime(java.util.Date eventStartTime) {
        setEventStartTime(eventStartTime);
        return this;
    }

    /**
     * <p>
     * A time stamp for the time to stop replaying events. Only events that occurred between the
     * <code>EventStartTime</code> and <code>EventEndTime</code> are replayed.
     * </p>
     * 
     * @param eventEndTime
     *        A time stamp for the time to stop replaying events. Only events that occurred between the
     *        <code>EventStartTime</code> and <code>EventEndTime</code> are replayed.
     */

    public void setEventEndTime(java.util.Date eventEndTime) {
        this.eventEndTime = eventEndTime;
    }

    /**
     * <p>
     * A time stamp for the time to stop replaying events. Only events that occurred between the
     * <code>EventStartTime</code> and <code>EventEndTime</code> are replayed.
     * </p>
     * 
     * @return A time stamp for the time to stop replaying events. Only events that occurred between the
     *         <code>EventStartTime</code> and <code>EventEndTime</code> are replayed.
     */

    public java.util.Date getEventEndTime() {
        return this.eventEndTime;
    }

    /**
     * <p>
     * A time stamp for the time to stop replaying events. Only events that occurred between the
     * <code>EventStartTime</code> and <code>EventEndTime</code> are replayed.
     * </p>
     * 
     * @param eventEndTime
     *        A time stamp for the time to stop replaying events. Only events that occurred between the
     *        <code>EventStartTime</code> and <code>EventEndTime</code> are replayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReplayRequest withEventEndTime(java.util.Date eventEndTime) {
        setEventEndTime(eventEndTime);
        return this;
    }

    /**
     * <p>
     * A <code>ReplayDestination</code> object that includes details about the destination for the replay.
     * </p>
     * 
     * @param destination
     *        A <code>ReplayDestination</code> object that includes details about the destination for the replay.
     */

    public void setDestination(ReplayDestination destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * A <code>ReplayDestination</code> object that includes details about the destination for the replay.
     * </p>
     * 
     * @return A <code>ReplayDestination</code> object that includes details about the destination for the replay.
     */

    public ReplayDestination getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * A <code>ReplayDestination</code> object that includes details about the destination for the replay.
     * </p>
     * 
     * @param destination
     *        A <code>ReplayDestination</code> object that includes details about the destination for the replay.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReplayRequest withDestination(ReplayDestination destination) {
        setDestination(destination);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEventSourceArn() != null)
            sb.append("EventSourceArn: ").append(getEventSourceArn()).append(",");
        if (getEventStartTime() != null)
            sb.append("EventStartTime: ").append(getEventStartTime()).append(",");
        if (getEventEndTime() != null)
            sb.append("EventEndTime: ").append(getEventEndTime()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartReplayRequest == false)
            return false;
        StartReplayRequest other = (StartReplayRequest) obj;
        if (other.getReplayName() == null ^ this.getReplayName() == null)
            return false;
        if (other.getReplayName() != null && other.getReplayName().equals(this.getReplayName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEventSourceArn() == null ^ this.getEventSourceArn() == null)
            return false;
        if (other.getEventSourceArn() != null && other.getEventSourceArn().equals(this.getEventSourceArn()) == false)
            return false;
        if (other.getEventStartTime() == null ^ this.getEventStartTime() == null)
            return false;
        if (other.getEventStartTime() != null && other.getEventStartTime().equals(this.getEventStartTime()) == false)
            return false;
        if (other.getEventEndTime() == null ^ this.getEventEndTime() == null)
            return false;
        if (other.getEventEndTime() != null && other.getEventEndTime().equals(this.getEventEndTime()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplayName() == null) ? 0 : getReplayName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEventSourceArn() == null) ? 0 : getEventSourceArn().hashCode());
        hashCode = prime * hashCode + ((getEventStartTime() == null) ? 0 : getEventStartTime().hashCode());
        hashCode = prime * hashCode + ((getEventEndTime() == null) ? 0 : getEventEndTime().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        return hashCode;
    }

    @Override
    public StartReplayRequest clone() {
        return (StartReplayRequest) super.clone();
    }

}
