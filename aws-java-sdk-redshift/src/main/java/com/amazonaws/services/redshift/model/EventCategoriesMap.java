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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes event categories.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/EventCategoriesMap" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventCategoriesMap implements Serializable, Cloneable {

    /**
     * <p>
     * The source type, such as cluster or cluster-snapshot, that the returned categories belong to.
     * </p>
     */
    private String sourceType;
    /**
     * <p>
     * The events in the event category.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<EventInfoMap> events;

    /**
     * <p>
     * The source type, such as cluster or cluster-snapshot, that the returned categories belong to.
     * </p>
     * 
     * @param sourceType
     *        The source type, such as cluster or cluster-snapshot, that the returned categories belong to.
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The source type, such as cluster or cluster-snapshot, that the returned categories belong to.
     * </p>
     * 
     * @return The source type, such as cluster or cluster-snapshot, that the returned categories belong to.
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * The source type, such as cluster or cluster-snapshot, that the returned categories belong to.
     * </p>
     * 
     * @param sourceType
     *        The source type, such as cluster or cluster-snapshot, that the returned categories belong to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventCategoriesMap withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * The events in the event category.
     * </p>
     * 
     * @return The events in the event category.
     */

    public java.util.List<EventInfoMap> getEvents() {
        if (events == null) {
            events = new com.amazonaws.internal.SdkInternalList<EventInfoMap>();
        }
        return events;
    }

    /**
     * <p>
     * The events in the event category.
     * </p>
     * 
     * @param events
     *        The events in the event category.
     */

    public void setEvents(java.util.Collection<EventInfoMap> events) {
        if (events == null) {
            this.events = null;
            return;
        }

        this.events = new com.amazonaws.internal.SdkInternalList<EventInfoMap>(events);
    }

    /**
     * <p>
     * The events in the event category.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvents(java.util.Collection)} or {@link #withEvents(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param events
     *        The events in the event category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventCategoriesMap withEvents(EventInfoMap... events) {
        if (this.events == null) {
            setEvents(new com.amazonaws.internal.SdkInternalList<EventInfoMap>(events.length));
        }
        for (EventInfoMap ele : events) {
            this.events.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The events in the event category.
     * </p>
     * 
     * @param events
     *        The events in the event category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventCategoriesMap withEvents(java.util.Collection<EventInfoMap> events) {
        setEvents(events);
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
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType()).append(",");
        if (getEvents() != null)
            sb.append("Events: ").append(getEvents());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventCategoriesMap == false)
            return false;
        EventCategoriesMap other = (EventCategoriesMap) obj;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        return hashCode;
    }

    @Override
    public EventCategoriesMap clone() {
        try {
            return (EventCategoriesMap) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
