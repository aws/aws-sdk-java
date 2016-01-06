/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains a list of event sources (see
 * API_EventSourceMappingConfiguration)
 * </p>
 */
public class ListEventSourceMappingsResult implements Serializable, Cloneable {

    /**
     * A string, present if there are more event source mappings.
     */
    private String nextMarker;

    /**
     * An array of <code>EventSourceMappingConfiguration</code> objects.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<EventSourceMappingConfiguration> eventSourceMappings;

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
    public ListEventSourceMappingsResult withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * An array of <code>EventSourceMappingConfiguration</code> objects.
     *
     * @return An array of <code>EventSourceMappingConfiguration</code> objects.
     */
    public java.util.List<EventSourceMappingConfiguration> getEventSourceMappings() {
        if (eventSourceMappings == null) {
              eventSourceMappings = new com.amazonaws.internal.ListWithAutoConstructFlag<EventSourceMappingConfiguration>();
              eventSourceMappings.setAutoConstruct(true);
        }
        return eventSourceMappings;
    }
    
    /**
     * An array of <code>EventSourceMappingConfiguration</code> objects.
     *
     * @param eventSourceMappings An array of <code>EventSourceMappingConfiguration</code> objects.
     */
    public void setEventSourceMappings(java.util.Collection<EventSourceMappingConfiguration> eventSourceMappings) {
        if (eventSourceMappings == null) {
            this.eventSourceMappings = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<EventSourceMappingConfiguration> eventSourceMappingsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<EventSourceMappingConfiguration>(eventSourceMappings.size());
        eventSourceMappingsCopy.addAll(eventSourceMappings);
        this.eventSourceMappings = eventSourceMappingsCopy;
    }
    
    /**
     * An array of <code>EventSourceMappingConfiguration</code> objects.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setEventSourceMappings(java.util.Collection)} or
     * {@link #withEventSourceMappings(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventSourceMappings An array of <code>EventSourceMappingConfiguration</code> objects.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListEventSourceMappingsResult withEventSourceMappings(EventSourceMappingConfiguration... eventSourceMappings) {
        if (getEventSourceMappings() == null) setEventSourceMappings(new java.util.ArrayList<EventSourceMappingConfiguration>(eventSourceMappings.length));
        for (EventSourceMappingConfiguration value : eventSourceMappings) {
            getEventSourceMappings().add(value);
        }
        return this;
    }
    
    /**
     * An array of <code>EventSourceMappingConfiguration</code> objects.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventSourceMappings An array of <code>EventSourceMappingConfiguration</code> objects.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListEventSourceMappingsResult withEventSourceMappings(java.util.Collection<EventSourceMappingConfiguration> eventSourceMappings) {
        if (eventSourceMappings == null) {
            this.eventSourceMappings = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<EventSourceMappingConfiguration> eventSourceMappingsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<EventSourceMappingConfiguration>(eventSourceMappings.size());
            eventSourceMappingsCopy.addAll(eventSourceMappings);
            this.eventSourceMappings = eventSourceMappingsCopy;
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
        if (getEventSourceMappings() != null) sb.append("EventSourceMappings: " + getEventSourceMappings() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode()); 
        hashCode = prime * hashCode + ((getEventSourceMappings() == null) ? 0 : getEventSourceMappings().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListEventSourceMappingsResult == false) return false;
        ListEventSourceMappingsResult other = (ListEventSourceMappingsResult)obj;
        
        if (other.getNextMarker() == null ^ this.getNextMarker() == null) return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false) return false; 
        if (other.getEventSourceMappings() == null ^ this.getEventSourceMappings() == null) return false;
        if (other.getEventSourceMappings() != null && other.getEventSourceMappings().equals(this.getEventSourceMappings()) == false) return false; 
        return true;
    }
    
    @Override
    public ListEventSourceMappingsResult clone() {
        try {
            return (ListEventSourceMappingsResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    