/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
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
     * The date and time of the event, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     */
    private java.util.Date timestamp;

    /**
     * The event type. <ul> <li> <p><code>error</code> - Indicates an error
     * with the Spot fleet request. </li> <li>
     * <p><code>fleetRequestChange</code> - Indicates a change in the status
     * or configuration of the Spot fleet request. </li> <li>
     * <p><code>instanceChange</code> - Indicates that an instance was
     * launched or terminated. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceChange, fleetRequestChange, error
     */
    private String eventType;

    /**
     * Information about the event.
     */
    private EventInformation eventInformation;

    /**
     * The date and time of the event, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     *
     * @return The date and time of the event, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }
    
    /**
     * The date and time of the event, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     *
     * @param timestamp The date and time of the event, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     */
    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }
    
    /**
     * The date and time of the event, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param timestamp The date and time of the event, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public HistoryRecord withTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * The event type. <ul> <li> <p><code>error</code> - Indicates an error
     * with the Spot fleet request. </li> <li>
     * <p><code>fleetRequestChange</code> - Indicates a change in the status
     * or configuration of the Spot fleet request. </li> <li>
     * <p><code>instanceChange</code> - Indicates that an instance was
     * launched or terminated. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceChange, fleetRequestChange, error
     *
     * @return The event type. <ul> <li> <p><code>error</code> - Indicates an error
     *         with the Spot fleet request. </li> <li>
     *         <p><code>fleetRequestChange</code> - Indicates a change in the status
     *         or configuration of the Spot fleet request. </li> <li>
     *         <p><code>instanceChange</code> - Indicates that an instance was
     *         launched or terminated. </li> </ul>
     *
     * @see EventType
     */
    public String getEventType() {
        return eventType;
    }
    
    /**
     * The event type. <ul> <li> <p><code>error</code> - Indicates an error
     * with the Spot fleet request. </li> <li>
     * <p><code>fleetRequestChange</code> - Indicates a change in the status
     * or configuration of the Spot fleet request. </li> <li>
     * <p><code>instanceChange</code> - Indicates that an instance was
     * launched or terminated. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceChange, fleetRequestChange, error
     *
     * @param eventType The event type. <ul> <li> <p><code>error</code> - Indicates an error
     *         with the Spot fleet request. </li> <li>
     *         <p><code>fleetRequestChange</code> - Indicates a change in the status
     *         or configuration of the Spot fleet request. </li> <li>
     *         <p><code>instanceChange</code> - Indicates that an instance was
     *         launched or terminated. </li> </ul>
     *
     * @see EventType
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
    
    /**
     * The event type. <ul> <li> <p><code>error</code> - Indicates an error
     * with the Spot fleet request. </li> <li>
     * <p><code>fleetRequestChange</code> - Indicates a change in the status
     * or configuration of the Spot fleet request. </li> <li>
     * <p><code>instanceChange</code> - Indicates that an instance was
     * launched or terminated. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceChange, fleetRequestChange, error
     *
     * @param eventType The event type. <ul> <li> <p><code>error</code> - Indicates an error
     *         with the Spot fleet request. </li> <li>
     *         <p><code>fleetRequestChange</code> - Indicates a change in the status
     *         or configuration of the Spot fleet request. </li> <li>
     *         <p><code>instanceChange</code> - Indicates that an instance was
     *         launched or terminated. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see EventType
     */
    public HistoryRecord withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * The event type. <ul> <li> <p><code>error</code> - Indicates an error
     * with the Spot fleet request. </li> <li>
     * <p><code>fleetRequestChange</code> - Indicates a change in the status
     * or configuration of the Spot fleet request. </li> <li>
     * <p><code>instanceChange</code> - Indicates that an instance was
     * launched or terminated. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceChange, fleetRequestChange, error
     *
     * @param eventType The event type. <ul> <li> <p><code>error</code> - Indicates an error
     *         with the Spot fleet request. </li> <li>
     *         <p><code>fleetRequestChange</code> - Indicates a change in the status
     *         or configuration of the Spot fleet request. </li> <li>
     *         <p><code>instanceChange</code> - Indicates that an instance was
     *         launched or terminated. </li> </ul>
     *
     * @see EventType
     */
    public void setEventType(EventType eventType) {
        this.eventType = eventType.toString();
    }
    
    /**
     * The event type. <ul> <li> <p><code>error</code> - Indicates an error
     * with the Spot fleet request. </li> <li>
     * <p><code>fleetRequestChange</code> - Indicates a change in the status
     * or configuration of the Spot fleet request. </li> <li>
     * <p><code>instanceChange</code> - Indicates that an instance was
     * launched or terminated. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceChange, fleetRequestChange, error
     *
     * @param eventType The event type. <ul> <li> <p><code>error</code> - Indicates an error
     *         with the Spot fleet request. </li> <li>
     *         <p><code>fleetRequestChange</code> - Indicates a change in the status
     *         or configuration of the Spot fleet request. </li> <li>
     *         <p><code>instanceChange</code> - Indicates that an instance was
     *         launched or terminated. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see EventType
     */
    public HistoryRecord withEventType(EventType eventType) {
        this.eventType = eventType.toString();
        return this;
    }

    /**
     * Information about the event.
     *
     * @return Information about the event.
     */
    public EventInformation getEventInformation() {
        return eventInformation;
    }
    
    /**
     * Information about the event.
     *
     * @param eventInformation Information about the event.
     */
    public void setEventInformation(EventInformation eventInformation) {
        this.eventInformation = eventInformation;
    }
    
    /**
     * Information about the event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventInformation Information about the event.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public HistoryRecord withEventInformation(EventInformation eventInformation) {
        this.eventInformation = eventInformation;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTimestamp() != null) sb.append("Timestamp: " + getTimestamp() + ",");
        if (getEventType() != null) sb.append("EventType: " + getEventType() + ",");
        if (getEventInformation() != null) sb.append("EventInformation: " + getEventInformation() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof HistoryRecord == false) return false;
        HistoryRecord other = (HistoryRecord)obj;
        
        if (other.getTimestamp() == null ^ this.getTimestamp() == null) return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false) return false; 
        if (other.getEventType() == null ^ this.getEventType() == null) return false;
        if (other.getEventType() != null && other.getEventType().equals(this.getEventType()) == false) return false; 
        if (other.getEventInformation() == null ^ this.getEventInformation() == null) return false;
        if (other.getEventInformation() != null && other.getEventInformation().equals(this.getEventInformation()) == false) return false; 
        return true;
    }
    
    @Override
    public HistoryRecord clone() {
        try {
            return (HistoryRecord) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    