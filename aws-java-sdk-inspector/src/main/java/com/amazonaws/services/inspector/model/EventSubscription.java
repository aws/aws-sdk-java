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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;

/**
 * <p>
 * This data type is used in the <a>Subscription</a> data type.
 * </p>
 */
public class EventSubscription implements Serializable, Cloneable {

    /**
     * <p>
     * The event for which Amazon Simple Notification Service (SNS) notifications are sent.
     * </p>
     */
    private String event;
    /**
     * <p>
     * The time at which <a>SubscribeToEvent</a> is called.
     * </p>
     */
    private java.util.Date subscribedAt;

    /**
     * <p>
     * The event for which Amazon Simple Notification Service (SNS) notifications are sent.
     * </p>
     * 
     * @param event
     *        The event for which Amazon Simple Notification Service (SNS) notifications are sent.
     * @see InspectorEvent
     */

    public void setEvent(String event) {
        this.event = event;
    }

    /**
     * <p>
     * The event for which Amazon Simple Notification Service (SNS) notifications are sent.
     * </p>
     * 
     * @return The event for which Amazon Simple Notification Service (SNS) notifications are sent.
     * @see InspectorEvent
     */

    public String getEvent() {
        return this.event;
    }

    /**
     * <p>
     * The event for which Amazon Simple Notification Service (SNS) notifications are sent.
     * </p>
     * 
     * @param event
     *        The event for which Amazon Simple Notification Service (SNS) notifications are sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InspectorEvent
     */

    public EventSubscription withEvent(String event) {
        setEvent(event);
        return this;
    }

    /**
     * <p>
     * The event for which Amazon Simple Notification Service (SNS) notifications are sent.
     * </p>
     * 
     * @param event
     *        The event for which Amazon Simple Notification Service (SNS) notifications are sent.
     * @see InspectorEvent
     */

    public void setEvent(InspectorEvent event) {
        this.event = event.toString();
    }

    /**
     * <p>
     * The event for which Amazon Simple Notification Service (SNS) notifications are sent.
     * </p>
     * 
     * @param event
     *        The event for which Amazon Simple Notification Service (SNS) notifications are sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InspectorEvent
     */

    public EventSubscription withEvent(InspectorEvent event) {
        setEvent(event);
        return this;
    }

    /**
     * <p>
     * The time at which <a>SubscribeToEvent</a> is called.
     * </p>
     * 
     * @param subscribedAt
     *        The time at which <a>SubscribeToEvent</a> is called.
     */

    public void setSubscribedAt(java.util.Date subscribedAt) {
        this.subscribedAt = subscribedAt;
    }

    /**
     * <p>
     * The time at which <a>SubscribeToEvent</a> is called.
     * </p>
     * 
     * @return The time at which <a>SubscribeToEvent</a> is called.
     */

    public java.util.Date getSubscribedAt() {
        return this.subscribedAt;
    }

    /**
     * <p>
     * The time at which <a>SubscribeToEvent</a> is called.
     * </p>
     * 
     * @param subscribedAt
     *        The time at which <a>SubscribeToEvent</a> is called.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSubscription withSubscribedAt(java.util.Date subscribedAt) {
        setSubscribedAt(subscribedAt);
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
        if (getEvent() != null)
            sb.append("Event: " + getEvent() + ",");
        if (getSubscribedAt() != null)
            sb.append("SubscribedAt: " + getSubscribedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventSubscription == false)
            return false;
        EventSubscription other = (EventSubscription) obj;
        if (other.getEvent() == null ^ this.getEvent() == null)
            return false;
        if (other.getEvent() != null && other.getEvent().equals(this.getEvent()) == false)
            return false;
        if (other.getSubscribedAt() == null ^ this.getSubscribedAt() == null)
            return false;
        if (other.getSubscribedAt() != null && other.getSubscribedAt().equals(this.getSubscribedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvent() == null) ? 0 : getEvent().hashCode());
        hashCode = prime * hashCode + ((getSubscribedAt() == null) ? 0 : getSubscribedAt().hashCode());
        return hashCode;
    }

    @Override
    public EventSubscription clone() {
        try {
            return (EventSubscription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
