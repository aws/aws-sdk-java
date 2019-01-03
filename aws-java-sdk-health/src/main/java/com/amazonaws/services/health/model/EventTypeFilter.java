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
package com.amazonaws.services.health.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The values to use to filter results from the <a>DescribeEventTypes</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/EventTypeFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventTypeFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of event type codes.
     * </p>
     */
    private java.util.List<String> eventTypeCodes;
    /**
     * <p>
     * The AWS services associated with the event. For example, <code>EC2</code>, <code>RDS</code>.
     * </p>
     */
    private java.util.List<String> services;
    /**
     * <p>
     * A list of event type category codes (<code>issue</code>, <code>scheduledChange</code>, or
     * <code>accountNotification</code>).
     * </p>
     */
    private java.util.List<String> eventTypeCategories;

    /**
     * <p>
     * A list of event type codes.
     * </p>
     * 
     * @return A list of event type codes.
     */

    public java.util.List<String> getEventTypeCodes() {
        return eventTypeCodes;
    }

    /**
     * <p>
     * A list of event type codes.
     * </p>
     * 
     * @param eventTypeCodes
     *        A list of event type codes.
     */

    public void setEventTypeCodes(java.util.Collection<String> eventTypeCodes) {
        if (eventTypeCodes == null) {
            this.eventTypeCodes = null;
            return;
        }

        this.eventTypeCodes = new java.util.ArrayList<String>(eventTypeCodes);
    }

    /**
     * <p>
     * A list of event type codes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventTypeCodes(java.util.Collection)} or {@link #withEventTypeCodes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param eventTypeCodes
     *        A list of event type codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventTypeFilter withEventTypeCodes(String... eventTypeCodes) {
        if (this.eventTypeCodes == null) {
            setEventTypeCodes(new java.util.ArrayList<String>(eventTypeCodes.length));
        }
        for (String ele : eventTypeCodes) {
            this.eventTypeCodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of event type codes.
     * </p>
     * 
     * @param eventTypeCodes
     *        A list of event type codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventTypeFilter withEventTypeCodes(java.util.Collection<String> eventTypeCodes) {
        setEventTypeCodes(eventTypeCodes);
        return this;
    }

    /**
     * <p>
     * The AWS services associated with the event. For example, <code>EC2</code>, <code>RDS</code>.
     * </p>
     * 
     * @return The AWS services associated with the event. For example, <code>EC2</code>, <code>RDS</code>.
     */

    public java.util.List<String> getServices() {
        return services;
    }

    /**
     * <p>
     * The AWS services associated with the event. For example, <code>EC2</code>, <code>RDS</code>.
     * </p>
     * 
     * @param services
     *        The AWS services associated with the event. For example, <code>EC2</code>, <code>RDS</code>.
     */

    public void setServices(java.util.Collection<String> services) {
        if (services == null) {
            this.services = null;
            return;
        }

        this.services = new java.util.ArrayList<String>(services);
    }

    /**
     * <p>
     * The AWS services associated with the event. For example, <code>EC2</code>, <code>RDS</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServices(java.util.Collection)} or {@link #withServices(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param services
     *        The AWS services associated with the event. For example, <code>EC2</code>, <code>RDS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventTypeFilter withServices(String... services) {
        if (this.services == null) {
            setServices(new java.util.ArrayList<String>(services.length));
        }
        for (String ele : services) {
            this.services.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The AWS services associated with the event. For example, <code>EC2</code>, <code>RDS</code>.
     * </p>
     * 
     * @param services
     *        The AWS services associated with the event. For example, <code>EC2</code>, <code>RDS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventTypeFilter withServices(java.util.Collection<String> services) {
        setServices(services);
        return this;
    }

    /**
     * <p>
     * A list of event type category codes (<code>issue</code>, <code>scheduledChange</code>, or
     * <code>accountNotification</code>).
     * </p>
     * 
     * @return A list of event type category codes (<code>issue</code>, <code>scheduledChange</code>, or
     *         <code>accountNotification</code>).
     * @see EventTypeCategory
     */

    public java.util.List<String> getEventTypeCategories() {
        return eventTypeCategories;
    }

    /**
     * <p>
     * A list of event type category codes (<code>issue</code>, <code>scheduledChange</code>, or
     * <code>accountNotification</code>).
     * </p>
     * 
     * @param eventTypeCategories
     *        A list of event type category codes (<code>issue</code>, <code>scheduledChange</code>, or
     *        <code>accountNotification</code>).
     * @see EventTypeCategory
     */

    public void setEventTypeCategories(java.util.Collection<String> eventTypeCategories) {
        if (eventTypeCategories == null) {
            this.eventTypeCategories = null;
            return;
        }

        this.eventTypeCategories = new java.util.ArrayList<String>(eventTypeCategories);
    }

    /**
     * <p>
     * A list of event type category codes (<code>issue</code>, <code>scheduledChange</code>, or
     * <code>accountNotification</code>).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventTypeCategories(java.util.Collection)} or {@link #withEventTypeCategories(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param eventTypeCategories
     *        A list of event type category codes (<code>issue</code>, <code>scheduledChange</code>, or
     *        <code>accountNotification</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventTypeCategory
     */

    public EventTypeFilter withEventTypeCategories(String... eventTypeCategories) {
        if (this.eventTypeCategories == null) {
            setEventTypeCategories(new java.util.ArrayList<String>(eventTypeCategories.length));
        }
        for (String ele : eventTypeCategories) {
            this.eventTypeCategories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of event type category codes (<code>issue</code>, <code>scheduledChange</code>, or
     * <code>accountNotification</code>).
     * </p>
     * 
     * @param eventTypeCategories
     *        A list of event type category codes (<code>issue</code>, <code>scheduledChange</code>, or
     *        <code>accountNotification</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventTypeCategory
     */

    public EventTypeFilter withEventTypeCategories(java.util.Collection<String> eventTypeCategories) {
        setEventTypeCategories(eventTypeCategories);
        return this;
    }

    /**
     * <p>
     * A list of event type category codes (<code>issue</code>, <code>scheduledChange</code>, or
     * <code>accountNotification</code>).
     * </p>
     * 
     * @param eventTypeCategories
     *        A list of event type category codes (<code>issue</code>, <code>scheduledChange</code>, or
     *        <code>accountNotification</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventTypeCategory
     */

    public EventTypeFilter withEventTypeCategories(EventTypeCategory... eventTypeCategories) {
        java.util.ArrayList<String> eventTypeCategoriesCopy = new java.util.ArrayList<String>(eventTypeCategories.length);
        for (EventTypeCategory value : eventTypeCategories) {
            eventTypeCategoriesCopy.add(value.toString());
        }
        if (getEventTypeCategories() == null) {
            setEventTypeCategories(eventTypeCategoriesCopy);
        } else {
            getEventTypeCategories().addAll(eventTypeCategoriesCopy);
        }
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
        if (getEventTypeCodes() != null)
            sb.append("EventTypeCodes: ").append(getEventTypeCodes()).append(",");
        if (getServices() != null)
            sb.append("Services: ").append(getServices()).append(",");
        if (getEventTypeCategories() != null)
            sb.append("EventTypeCategories: ").append(getEventTypeCategories());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventTypeFilter == false)
            return false;
        EventTypeFilter other = (EventTypeFilter) obj;
        if (other.getEventTypeCodes() == null ^ this.getEventTypeCodes() == null)
            return false;
        if (other.getEventTypeCodes() != null && other.getEventTypeCodes().equals(this.getEventTypeCodes()) == false)
            return false;
        if (other.getServices() == null ^ this.getServices() == null)
            return false;
        if (other.getServices() != null && other.getServices().equals(this.getServices()) == false)
            return false;
        if (other.getEventTypeCategories() == null ^ this.getEventTypeCategories() == null)
            return false;
        if (other.getEventTypeCategories() != null && other.getEventTypeCategories().equals(this.getEventTypeCategories()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventTypeCodes() == null) ? 0 : getEventTypeCodes().hashCode());
        hashCode = prime * hashCode + ((getServices() == null) ? 0 : getServices().hashCode());
        hashCode = prime * hashCode + ((getEventTypeCategories() == null) ? 0 : getEventTypeCategories().hashCode());
        return hashCode;
    }

    @Override
    public EventTypeFilter clone() {
        try {
            return (EventTypeFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.health.model.transform.EventTypeFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
