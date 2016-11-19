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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;

/**
 * <p>
 * Log entry describing an event involving Amazon GameLift resources (such as a fleet). In addition to tracking
 * activity, event codes and messages can provide additional information for troubleshooting and debugging problems.
 * </p>
 */
public class Event implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for a fleet event.
     * </p>
     */
    private String eventId;
    /**
     * <p>
     * Unique identifier for the resource, such as a fleet ID.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * Type of event being logged.
     * </p>
     */
    private String eventCode;
    /**
     * <p>
     * Additional information related to the event.
     * </p>
     */
    private String message;
    /**
     * <p>
     * Time stamp indicating when this event occurred. Format is a number expressed in Unix time as milliseconds (ex:
     * "1469498468.057").
     * </p>
     */
    private java.util.Date eventTime;

    /**
     * <p>
     * Unique identifier for a fleet event.
     * </p>
     * 
     * @param eventId
     *        Unique identifier for a fleet event.
     */

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * <p>
     * Unique identifier for a fleet event.
     * </p>
     * 
     * @return Unique identifier for a fleet event.
     */

    public String getEventId() {
        return this.eventId;
    }

    /**
     * <p>
     * Unique identifier for a fleet event.
     * </p>
     * 
     * @param eventId
     *        Unique identifier for a fleet event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withEventId(String eventId) {
        setEventId(eventId);
        return this;
    }

    /**
     * <p>
     * Unique identifier for the resource, such as a fleet ID.
     * </p>
     * 
     * @param resourceId
     *        Unique identifier for the resource, such as a fleet ID.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * Unique identifier for the resource, such as a fleet ID.
     * </p>
     * 
     * @return Unique identifier for the resource, such as a fleet ID.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * Unique identifier for the resource, such as a fleet ID.
     * </p>
     * 
     * @param resourceId
     *        Unique identifier for the resource, such as a fleet ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * Type of event being logged.
     * </p>
     * 
     * @param eventCode
     *        Type of event being logged.
     * @see EventCode
     */

    public void setEventCode(String eventCode) {
        this.eventCode = eventCode;
    }

    /**
     * <p>
     * Type of event being logged.
     * </p>
     * 
     * @return Type of event being logged.
     * @see EventCode
     */

    public String getEventCode() {
        return this.eventCode;
    }

    /**
     * <p>
     * Type of event being logged.
     * </p>
     * 
     * @param eventCode
     *        Type of event being logged.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventCode
     */

    public Event withEventCode(String eventCode) {
        setEventCode(eventCode);
        return this;
    }

    /**
     * <p>
     * Type of event being logged.
     * </p>
     * 
     * @param eventCode
     *        Type of event being logged.
     * @see EventCode
     */

    public void setEventCode(EventCode eventCode) {
        this.eventCode = eventCode.toString();
    }

    /**
     * <p>
     * Type of event being logged.
     * </p>
     * 
     * @param eventCode
     *        Type of event being logged.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventCode
     */

    public Event withEventCode(EventCode eventCode) {
        setEventCode(eventCode);
        return this;
    }

    /**
     * <p>
     * Additional information related to the event.
     * </p>
     * 
     * @param message
     *        Additional information related to the event.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Additional information related to the event.
     * </p>
     * 
     * @return Additional information related to the event.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Additional information related to the event.
     * </p>
     * 
     * @param message
     *        Additional information related to the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * Time stamp indicating when this event occurred. Format is a number expressed in Unix time as milliseconds (ex:
     * "1469498468.057").
     * </p>
     * 
     * @param eventTime
     *        Time stamp indicating when this event occurred. Format is a number expressed in Unix time as milliseconds
     *        (ex: "1469498468.057").
     */

    public void setEventTime(java.util.Date eventTime) {
        this.eventTime = eventTime;
    }

    /**
     * <p>
     * Time stamp indicating when this event occurred. Format is a number expressed in Unix time as milliseconds (ex:
     * "1469498468.057").
     * </p>
     * 
     * @return Time stamp indicating when this event occurred. Format is a number expressed in Unix time as milliseconds
     *         (ex: "1469498468.057").
     */

    public java.util.Date getEventTime() {
        return this.eventTime;
    }

    /**
     * <p>
     * Time stamp indicating when this event occurred. Format is a number expressed in Unix time as milliseconds (ex:
     * "1469498468.057").
     * </p>
     * 
     * @param eventTime
     *        Time stamp indicating when this event occurred. Format is a number expressed in Unix time as milliseconds
     *        (ex: "1469498468.057").
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withEventTime(java.util.Date eventTime) {
        setEventTime(eventTime);
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
        if (getEventId() != null)
            sb.append("EventId: " + getEventId() + ",");
        if (getResourceId() != null)
            sb.append("ResourceId: " + getResourceId() + ",");
        if (getEventCode() != null)
            sb.append("EventCode: " + getEventCode() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getEventTime() != null)
            sb.append("EventTime: " + getEventTime());
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
        if (other.getEventId() == null ^ this.getEventId() == null)
            return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getEventCode() == null ^ this.getEventCode() == null)
            return false;
        if (other.getEventCode() != null && other.getEventCode().equals(this.getEventCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getEventTime() == null ^ this.getEventTime() == null)
            return false;
        if (other.getEventTime() != null && other.getEventTime().equals(this.getEventTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getEventCode() == null) ? 0 : getEventCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getEventTime() == null) ? 0 : getEventTime().hashCode());
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
}
