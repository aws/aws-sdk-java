/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

/**
 * <p>
 * Contains the result of a successful invocation of the DescribeEvents action.
 * </p>
 */
public class DescribeEventsResult {

    /**
     * The marker obtained from a previous operation response.
     */
    private String marker;

    /**
     * A list of <a>Event</a> instances.
     */
    private java.util.List<Event> events;

    /**
     * The marker obtained from a previous operation response.
     *
     * @return The marker obtained from a previous operation response.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * The marker obtained from a previous operation response.
     *
     * @param marker The marker obtained from a previous operation response.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * The marker obtained from a previous operation response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker The marker obtained from a previous operation response.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeEventsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    
    
    /**
     * A list of <a>Event</a> instances.
     *
     * @return A list of <a>Event</a> instances.
     */
    public java.util.List<Event> getEvents() {
        
        if (events == null) {
            events = new java.util.ArrayList<Event>();
        }
        return events;
    }
    
    /**
     * A list of <a>Event</a> instances.
     *
     * @param events A list of <a>Event</a> instances.
     */
    public void setEvents(java.util.Collection<Event> events) {
        if (events == null) {
            this.events = null;
            return;
        }

        java.util.List<Event> eventsCopy = new java.util.ArrayList<Event>(events.size());
        eventsCopy.addAll(events);
        this.events = eventsCopy;
    }
    
    /**
     * A list of <a>Event</a> instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param events A list of <a>Event</a> instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeEventsResult withEvents(Event... events) {
        if (getEvents() == null) setEvents(new java.util.ArrayList<Event>(events.length));
        for (Event value : events) {
            getEvents().add(value);
        }
        return this;
    }
    
    /**
     * A list of <a>Event</a> instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param events A list of <a>Event</a> instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeEventsResult withEvents(java.util.Collection<Event> events) {
        if (events == null) {
            this.events = null;
        } else {
            java.util.List<Event> eventsCopy = new java.util.ArrayList<Event>(events.size());
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
        if (marker != null) sb.append("Marker: " + marker + ", ");
        if (events != null) sb.append("Events: " + events + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeEventsResult == false) return false;
        DescribeEventsResult other = (DescribeEventsResult)obj;
        
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getEvents() == null ^ this.getEvents() == null) return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false) return false; 
        return true;
    }
    
}
    