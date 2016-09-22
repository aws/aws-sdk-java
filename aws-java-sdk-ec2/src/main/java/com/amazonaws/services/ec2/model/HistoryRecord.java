/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Describes an event in the history of the Spot fleet request.
 * </p>
 */
public class HistoryRecord implements Serializable, Cloneable {

    /**
     * <p>
     * The date and time of the event, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     */
    private java.util.Date timestamp;
    /**
     * <p>
     * The event type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>error</code> - Indicates an error with the Spot fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fleetRequestChange</code> - Indicates a change in the status or configuration of the Spot fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instanceChange</code> - Indicates that an instance was launched or terminated.
     * </p>
     * </li>
     * </ul>
     */
    private String eventType;
    /**
     * <p>
     * Information about the event.
     * </p>
     */
    private EventInformation eventInformation;

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

    public HistoryRecord withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * The event type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>error</code> - Indicates an error with the Spot fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fleetRequestChange</code> - Indicates a change in the status or configuration of the Spot fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instanceChange</code> - Indicates that an instance was launched or terminated.
     * </p>
     * </li>
     * </ul>
     * 
     * @param eventType
     *        The event type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>error</code> - Indicates an error with the Spot fleet request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fleetRequestChange</code> - Indicates a change in the status or configuration of the Spot fleet
     *        request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instanceChange</code> - Indicates that an instance was launched or terminated.
     *        </p>
     *        </li>
     * @see EventType
     */

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * The event type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>error</code> - Indicates an error with the Spot fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fleetRequestChange</code> - Indicates a change in the status or configuration of the Spot fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instanceChange</code> - Indicates that an instance was launched or terminated.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The event type.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>error</code> - Indicates an error with the Spot fleet request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>fleetRequestChange</code> - Indicates a change in the status or configuration of the Spot fleet
     *         request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instanceChange</code> - Indicates that an instance was launched or terminated.
     *         </p>
     *         </li>
     * @see EventType
     */

    public String getEventType() {
        return this.eventType;
    }

    /**
     * <p>
     * The event type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>error</code> - Indicates an error with the Spot fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fleetRequestChange</code> - Indicates a change in the status or configuration of the Spot fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instanceChange</code> - Indicates that an instance was launched or terminated.
     * </p>
     * </li>
     * </ul>
     * 
     * @param eventType
     *        The event type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>error</code> - Indicates an error with the Spot fleet request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fleetRequestChange</code> - Indicates a change in the status or configuration of the Spot fleet
     *        request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instanceChange</code> - Indicates that an instance was launched or terminated.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public HistoryRecord withEventType(String eventType) {
        setEventType(eventType);
        return this;
    }

    /**
     * <p>
     * The event type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>error</code> - Indicates an error with the Spot fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fleetRequestChange</code> - Indicates a change in the status or configuration of the Spot fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instanceChange</code> - Indicates that an instance was launched or terminated.
     * </p>
     * </li>
     * </ul>
     * 
     * @param eventType
     *        The event type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>error</code> - Indicates an error with the Spot fleet request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fleetRequestChange</code> - Indicates a change in the status or configuration of the Spot fleet
     *        request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instanceChange</code> - Indicates that an instance was launched or terminated.
     *        </p>
     *        </li>
     * @see EventType
     */

    public void setEventType(EventType eventType) {
        this.eventType = eventType.toString();
    }

    /**
     * <p>
     * The event type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>error</code> - Indicates an error with the Spot fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fleetRequestChange</code> - Indicates a change in the status or configuration of the Spot fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instanceChange</code> - Indicates that an instance was launched or terminated.
     * </p>
     * </li>
     * </ul>
     * 
     * @param eventType
     *        The event type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>error</code> - Indicates an error with the Spot fleet request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fleetRequestChange</code> - Indicates a change in the status or configuration of the Spot fleet
     *        request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instanceChange</code> - Indicates that an instance was launched or terminated.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public HistoryRecord withEventType(EventType eventType) {
        setEventType(eventType);
        return this;
    }

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

    public HistoryRecord withEventInformation(EventInformation eventInformation) {
        setEventInformation(eventInformation);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTimestamp() != null)
            sb.append("Timestamp: " + getTimestamp() + ",");
        if (getEventType() != null)
            sb.append("EventType: " + getEventType() + ",");
        if (getEventInformation() != null)
            sb.append("EventInformation: " + getEventInformation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HistoryRecord == false)
            return false;
        HistoryRecord other = (HistoryRecord) obj;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null && other.getEventType().equals(this.getEventType()) == false)
            return false;
        if (other.getEventInformation() == null ^ this.getEventInformation() == null)
            return false;
        if (other.getEventInformation() != null && other.getEventInformation().equals(this.getEventInformation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode + ((getEventInformation() == null) ? 0 : getEventInformation().hashCode());
        return hashCode;
    }

    @Override
    public HistoryRecord clone() {
        try {
            return (HistoryRecord) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
