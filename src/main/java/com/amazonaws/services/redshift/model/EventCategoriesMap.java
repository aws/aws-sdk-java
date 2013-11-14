/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;


/**
 * 
 */
public class EventCategoriesMap implements Serializable {

    /**
     * The Amazon Redshift source type, such as cluster or cluster-snapshot,
     * that the returned categories belong to.
     */
    private String sourceType;

    /**
     * The events in the event category.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<EventInfoMap> events;

    /**
     * The Amazon Redshift source type, such as cluster or cluster-snapshot,
     * that the returned categories belong to.
     *
     * @return The Amazon Redshift source type, such as cluster or cluster-snapshot,
     *         that the returned categories belong to.
     */
    public String getSourceType() {
        return sourceType;
    }
    
    /**
     * The Amazon Redshift source type, such as cluster or cluster-snapshot,
     * that the returned categories belong to.
     *
     * @param sourceType The Amazon Redshift source type, such as cluster or cluster-snapshot,
     *         that the returned categories belong to.
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }
    
    /**
     * The Amazon Redshift source type, such as cluster or cluster-snapshot,
     * that the returned categories belong to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceType The Amazon Redshift source type, such as cluster or cluster-snapshot,
     *         that the returned categories belong to.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EventCategoriesMap withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * The events in the event category.
     *
     * @return The events in the event category.
     */
    public java.util.List<EventInfoMap> getEvents() {
        if (events == null) {
              events = new com.amazonaws.internal.ListWithAutoConstructFlag<EventInfoMap>();
              events.setAutoConstruct(true);
        }
        return events;
    }
    
    /**
     * The events in the event category.
     *
     * @param events The events in the event category.
     */
    public void setEvents(java.util.Collection<EventInfoMap> events) {
        if (events == null) {
            this.events = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<EventInfoMap> eventsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<EventInfoMap>(events.size());
        eventsCopy.addAll(events);
        this.events = eventsCopy;
    }
    
    /**
     * The events in the event category.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param events The events in the event category.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EventCategoriesMap withEvents(EventInfoMap... events) {
        if (getEvents() == null) setEvents(new java.util.ArrayList<EventInfoMap>(events.length));
        for (EventInfoMap value : events) {
            getEvents().add(value);
        }
        return this;
    }
    
    /**
     * The events in the event category.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param events The events in the event category.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EventCategoriesMap withEvents(java.util.Collection<EventInfoMap> events) {
        if (events == null) {
            this.events = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<EventInfoMap> eventsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<EventInfoMap>(events.size());
            eventsCopy.addAll(events);
            this.events = eventsCopy;
        }

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
        if (getSourceType() != null) sb.append("SourceType: " + getSourceType() + ",");
        if (getEvents() != null) sb.append("Events: " + getEvents() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof EventCategoriesMap == false) return false;
        EventCategoriesMap other = (EventCategoriesMap)obj;
        
        if (other.getSourceType() == null ^ this.getSourceType() == null) return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false) return false; 
        if (other.getEvents() == null ^ this.getEvents() == null) return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false) return false; 
        return true;
    }
    
}
    