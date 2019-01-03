/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes an event in the history of an EC2 Fleet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/HistoryRecordEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HistoryRecordEntry implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the event.
     * </p>
     */
    private EventInformation eventInformation;
    /**
     * <p>
     * The event type.
     * </p>
     */
    private String eventType;
    /**
     * <p>
     * The date and time of the event, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     */
    private java.util.Date timestamp;

    /**
     * <p>
     * Information about the event.
     * </p>
     * 
     * @param eventInformation
     *        Information about the event.
     */

    public void setEventInformation(EventInformation eventInformation) {
        this.eventInformation = eventInformation;
    }

    /**
     * <p>
     * Information about the event.
     * </p>
     * 
     * @return Information about the event.
     */

    public EventInformation getEventInformation() {
        return this.eventInformation;
    }

    /**
     * <p>
     * Information about the event.
     * </p>
     * 
     * @param eventInformation
     *        Information about the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryRecordEntry withEventInformation(EventInformation eventInformation) {
        setEventInformation(eventInformation);
        return this;
    }

    /**
     * <p>
     * The event type.
     * </p>
     * 
     * @param eventType
     *        The event type.
     * @see FleetEventType
     */

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * The event type.
     * </p>
     * 
     * @return The event type.
     * @see FleetEventType
     */

    public String getEventType() {
        return this.eventType;
    }

    /**
     * <p>
     * The event type.
     * </p>
     * 
     * @param eventType
     *        The event type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetEventType
     */

    public HistoryRecordEntry withEventType(String eventType) {
        setEventType(eventType);
        return this;
    }

    /**
     * <p>
     * The event type.
     * </p>
     * 
     * @param eventType
     *        The event type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetEventType
     */

    public HistoryRecordEntry withEventType(FleetEventType eventType) {
        this.eventType = eventType.toString();
        return this;
    }

    /**
     * <p>
     * The date and time of the event, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     * 
     * @param timestamp
     *        The date and time of the event, in UTC format (for example,
     *        <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The date and time of the event, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     * 
     * @return The date and time of the event, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The date and time of the event, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     * 
     * @param timestamp
     *        The date and time of the event, in UTC format (for example,
     *        <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryRecordEntry withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
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
        if (getEventInformation() != null)
            sb.append("EventInformation: ").append(getEventInformation()).append(",");
        if (getEventType() != null)
            sb.append("EventType: ").append(getEventType()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HistoryRecordEntry == false)
            return false;
        HistoryRecordEntry other = (HistoryRecordEntry) obj;
        if (other.getEventInformation() == null ^ this.getEventInformation() == null)
            return false;
        if (other.getEventInformation() != null && other.getEventInformation().equals(this.getEventInformation()) == false)
            return false;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null && other.getEventType().equals(this.getEventType()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventInformation() == null) ? 0 : getEventInformation().hashCode());
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public HistoryRecordEntry clone() {
        try {
            return (HistoryRecordEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
