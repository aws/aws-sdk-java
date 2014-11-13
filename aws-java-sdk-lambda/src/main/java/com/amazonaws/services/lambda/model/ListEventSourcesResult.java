/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;

/**
 * <p>
 * Contains a list of event sources (see API_EventSourceConfiguration)
 * </p>
 */
public class ListEventSourcesResult implements Serializable {

    /**
     * A string, present if there are more event source mappings.
     */
    private String nextMarker;

    /**
     * An arrary of <code>EventSourceConfiguration</code> objects.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<EventSourceConfiguration> eventSources;

    /**
     * A string, present if there are more event source mappings.
     *
     * @return A string, present if there are more event source mappings.
     */
    public String getNextMarker() {
        return nextMarker;
    }
    
    /**
     * A string, present if there are more event source mappings.
     *
     * @param nextMarker A string, present if there are more event source mappings.
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }
    
    /**
     * A string, present if there are more event source mappings.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextMarker A string, present if there are more event source mappings.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListEventSourcesResult withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * An arrary of <code>EventSourceConfiguration</code> objects.
     *
     * @return An arrary of <code>EventSourceConfiguration</code> objects.
     */
    public java.util.List<EventSourceConfiguration> getEventSources() {
        if (eventSources == null) {
              eventSources = new com.amazonaws.internal.ListWithAutoConstructFlag<EventSourceConfiguration>();
              eventSources.setAutoConstruct(true);
        }
        return eventSources;
    }
    
    /**
     * An arrary of <code>EventSourceConfiguration</code> objects.
     *
     * @param eventSources An arrary of <code>EventSourceConfiguration</code> objects.
     */
    public void setEventSources(java.util.Collection<EventSourceConfiguration> eventSources) {
        if (eventSources == null) {
            this.eventSources = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<EventSourceConfiguration> eventSourcesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<EventSourceConfiguration>(eventSources.size());
        eventSourcesCopy.addAll(eventSources);
        this.eventSources = eventSourcesCopy;
    }
    
    /**
     * An arrary of <code>EventSourceConfiguration</code> objects.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventSources An arrary of <code>EventSourceConfiguration</code> objects.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListEventSourcesResult withEventSources(EventSourceConfiguration... eventSources) {
        if (getEventSources() == null) setEventSources(new java.util.ArrayList<EventSourceConfiguration>(eventSources.length));
        for (EventSourceConfiguration value : eventSources) {
            getEventSources().add(value);
        }
        return this;
    }
    
    /**
     * An arrary of <code>EventSourceConfiguration</code> objects.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventSources An arrary of <code>EventSourceConfiguration</code> objects.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListEventSourcesResult withEventSources(java.util.Collection<EventSourceConfiguration> eventSources) {
        if (eventSources == null) {
            this.eventSources = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<EventSourceConfiguration> eventSourcesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<EventSourceConfiguration>(eventSources.size());
            eventSourcesCopy.addAll(eventSources);
            this.eventSources = eventSourcesCopy;
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
        if (getNextMarker() != null) sb.append("NextMarker: " + getNextMarker() + ",");
        if (getEventSources() != null) sb.append("EventSources: " + getEventSources() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode()); 
        hashCode = prime * hashCode + ((getEventSources() == null) ? 0 : getEventSources().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListEventSourcesResult == false) return false;
        ListEventSourcesResult other = (ListEventSourcesResult)obj;
        
        if (other.getNextMarker() == null ^ this.getNextMarker() == null) return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false) return false; 
        if (other.getEventSources() == null ^ this.getEventSources() == null) return false;
        if (other.getEventSources() != null && other.getEventSources().equals(this.getEventSources()) == false) return false; 
        return true;
    }
    
}
    