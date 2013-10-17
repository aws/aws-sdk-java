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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;


/**
 * <p>
 * Represents the output of a <i>DescribeEvents</i> operation.
 * </p>
 */
public class DescribeEventsResult implements Serializable {

    /**
     * Provides an identifier to allow retrieval of paginated results.
     */
    private String marker;

    /**
     * A list of events. Each element in the list contains detailed
     * information about one event.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Event> events;

    /**
     * Provides an identifier to allow retrieval of paginated results.
     *
     * @return Provides an identifier to allow retrieval of paginated results.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * Provides an identifier to allow retrieval of paginated results.
     *
     * @param marker Provides an identifier to allow retrieval of paginated results.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * Provides an identifier to allow retrieval of paginated results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker Provides an identifier to allow retrieval of paginated results.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeEventsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * A list of events. Each element in the list contains detailed
     * information about one event.
     *
     * @return A list of events. Each element in the list contains detailed
     *         information about one event.
     */
    public java.util.List<Event> getEvents() {
        if (events == null) {
              events = new com.amazonaws.internal.ListWithAutoConstructFlag<Event>();
              events.setAutoConstruct(true);
        }
        return events;
    }
    
    /**
     * A list of events. Each element in the list contains detailed
     * information about one event.
     *
     * @param events A list of events. Each element in the list contains detailed
     *         information about one event.
     */
    public void setEvents(java.util.Collection<Event> events) {
        if (events == null) {
            this.events = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Event> eventsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Event>(events.size());
        eventsCopy.addAll(events);
        this.events = eventsCopy;
    }
    
    /**
     * A list of events. Each element in the list contains detailed
     * information about one event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param events A list of events. Each element in the list contains detailed
     *         information about one event.
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
     * A list of events. Each element in the list contains detailed
     * information about one event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param events A list of events. Each element in the list contains detailed
     *         information about one event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeEventsResult withEvents(java.util.Collection<Event> events) {
        if (events == null) {
            this.events = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Event> eventsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Event>(events.size());
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
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (getEvents() != null) sb.append("Events: " + getEvents() );
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
    