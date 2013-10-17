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
package com.amazonaws.services.rds.model;

import java.io.Serializable;


/**
 * <p>
 * Contains the result of a successful invocation of the DescribeEvents action.
 * </p>
 */
public class DescribeEventsResult implements Serializable {

    /**
     * An optional pagination token provided by a previous Events request. If
     * this parameter is specified, the response includes only records beyond
     * the marker, up to the value specified by <code>MaxRecords</code> .
     */
    private String marker;

    /**
     * A list of <a>Event</a> instances.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Event> events;

    /**
     * An optional pagination token provided by a previous Events request. If
     * this parameter is specified, the response includes only records beyond
     * the marker, up to the value specified by <code>MaxRecords</code> .
     *
     * @return An optional pagination token provided by a previous Events request. If
     *         this parameter is specified, the response includes only records beyond
     *         the marker, up to the value specified by <code>MaxRecords</code> .
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional pagination token provided by a previous Events request. If
     * this parameter is specified, the response includes only records beyond
     * the marker, up to the value specified by <code>MaxRecords</code> .
     *
     * @param marker An optional pagination token provided by a previous Events request. If
     *         this parameter is specified, the response includes only records beyond
     *         the marker, up to the value specified by <code>MaxRecords</code> .
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional pagination token provided by a previous Events request. If
     * this parameter is specified, the response includes only records beyond
     * the marker, up to the value specified by <code>MaxRecords</code> .
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional pagination token provided by a previous Events request. If
     *         this parameter is specified, the response includes only records beyond
     *         the marker, up to the value specified by <code>MaxRecords</code> .
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
              events = new com.amazonaws.internal.ListWithAutoConstructFlag<Event>();
              events.setAutoConstruct(true);
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
        com.amazonaws.internal.ListWithAutoConstructFlag<Event> eventsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Event>(events.size());
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
    