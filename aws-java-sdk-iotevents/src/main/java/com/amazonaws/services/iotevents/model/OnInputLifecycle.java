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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the actions performed when the <code>"condition"</code> evaluates to TRUE.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/OnInputLifecycle" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OnInputLifecycle implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the actions performed when the <code>"condition"</code> evaluates to TRUE.
     * </p>
     */
    private java.util.List<Event> events;
    /**
     * <p>
     * Specifies the actions performed, and the next state entered, when a <code>"condition"</code> evaluates to TRUE.
     * </p>
     */
    private java.util.List<TransitionEvent> transitionEvents;

    /**
     * <p>
     * Specifies the actions performed when the <code>"condition"</code> evaluates to TRUE.
     * </p>
     * 
     * @return Specifies the actions performed when the <code>"condition"</code> evaluates to TRUE.
     */

    public java.util.List<Event> getEvents() {
        return events;
    }

    /**
     * <p>
     * Specifies the actions performed when the <code>"condition"</code> evaluates to TRUE.
     * </p>
     * 
     * @param events
     *        Specifies the actions performed when the <code>"condition"</code> evaluates to TRUE.
     */

    public void setEvents(java.util.Collection<Event> events) {
        if (events == null) {
            this.events = null;
            return;
        }

        this.events = new java.util.ArrayList<Event>(events);
    }

    /**
     * <p>
     * Specifies the actions performed when the <code>"condition"</code> evaluates to TRUE.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvents(java.util.Collection)} or {@link #withEvents(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param events
     *        Specifies the actions performed when the <code>"condition"</code> evaluates to TRUE.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OnInputLifecycle withEvents(Event... events) {
        if (this.events == null) {
            setEvents(new java.util.ArrayList<Event>(events.length));
        }
        for (Event ele : events) {
            this.events.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the actions performed when the <code>"condition"</code> evaluates to TRUE.
     * </p>
     * 
     * @param events
     *        Specifies the actions performed when the <code>"condition"</code> evaluates to TRUE.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OnInputLifecycle withEvents(java.util.Collection<Event> events) {
        setEvents(events);
        return this;
    }

    /**
     * <p>
     * Specifies the actions performed, and the next state entered, when a <code>"condition"</code> evaluates to TRUE.
     * </p>
     * 
     * @return Specifies the actions performed, and the next state entered, when a <code>"condition"</code> evaluates to
     *         TRUE.
     */

    public java.util.List<TransitionEvent> getTransitionEvents() {
        return transitionEvents;
    }

    /**
     * <p>
     * Specifies the actions performed, and the next state entered, when a <code>"condition"</code> evaluates to TRUE.
     * </p>
     * 
     * @param transitionEvents
     *        Specifies the actions performed, and the next state entered, when a <code>"condition"</code> evaluates to
     *        TRUE.
     */

    public void setTransitionEvents(java.util.Collection<TransitionEvent> transitionEvents) {
        if (transitionEvents == null) {
            this.transitionEvents = null;
            return;
        }

        this.transitionEvents = new java.util.ArrayList<TransitionEvent>(transitionEvents);
    }

    /**
     * <p>
     * Specifies the actions performed, and the next state entered, when a <code>"condition"</code> evaluates to TRUE.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTransitionEvents(java.util.Collection)} or {@link #withTransitionEvents(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param transitionEvents
     *        Specifies the actions performed, and the next state entered, when a <code>"condition"</code> evaluates to
     *        TRUE.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OnInputLifecycle withTransitionEvents(TransitionEvent... transitionEvents) {
        if (this.transitionEvents == null) {
            setTransitionEvents(new java.util.ArrayList<TransitionEvent>(transitionEvents.length));
        }
        for (TransitionEvent ele : transitionEvents) {
            this.transitionEvents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the actions performed, and the next state entered, when a <code>"condition"</code> evaluates to TRUE.
     * </p>
     * 
     * @param transitionEvents
     *        Specifies the actions performed, and the next state entered, when a <code>"condition"</code> evaluates to
     *        TRUE.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OnInputLifecycle withTransitionEvents(java.util.Collection<TransitionEvent> transitionEvents) {
        setTransitionEvents(transitionEvents);
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
        if (getEvents() != null)
            sb.append("Events: ").append(getEvents()).append(",");
        if (getTransitionEvents() != null)
            sb.append("TransitionEvents: ").append(getTransitionEvents());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OnInputLifecycle == false)
            return false;
        OnInputLifecycle other = (OnInputLifecycle) obj;
        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
            return false;
        if (other.getTransitionEvents() == null ^ this.getTransitionEvents() == null)
            return false;
        if (other.getTransitionEvents() != null && other.getTransitionEvents().equals(this.getTransitionEvents()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        hashCode = prime * hashCode + ((getTransitionEvents() == null) ? 0 : getTransitionEvents().hashCode());
        return hashCode;
    }

    @Override
    public OnInputLifecycle clone() {
        try {
            return (OnInputLifecycle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.OnInputLifecycleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
