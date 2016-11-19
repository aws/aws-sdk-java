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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;

/**
 * <p>
 * Contains a list of event sources (see <a>EventSourceMappingConfiguration</a>)
 * </p>
 */
public class ListEventSourceMappingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A string, present if there are more event source mappings.
     * </p>
     */
    private String nextMarker;
    /**
     * <p>
     * An array of <code>EventSourceMappingConfiguration</code> objects.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<EventSourceMappingConfiguration> eventSourceMappings;

    /**
     * <p>
     * A string, present if there are more event source mappings.
     * </p>
     * 
     * @param nextMarker
     *        A string, present if there are more event source mappings.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * A string, present if there are more event source mappings.
     * </p>
     * 
     * @return A string, present if there are more event source mappings.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * A string, present if there are more event source mappings.
     * </p>
     * 
     * @param nextMarker
     *        A string, present if there are more event source mappings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventSourceMappingsResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
        return this;
    }

    /**
     * <p>
     * An array of <code>EventSourceMappingConfiguration</code> objects.
     * </p>
     * 
     * @return An array of <code>EventSourceMappingConfiguration</code> objects.
     */

    public java.util.List<EventSourceMappingConfiguration> getEventSourceMappings() {
        if (eventSourceMappings == null) {
            eventSourceMappings = new com.amazonaws.internal.SdkInternalList<EventSourceMappingConfiguration>();
        }
        return eventSourceMappings;
    }

    /**
     * <p>
     * An array of <code>EventSourceMappingConfiguration</code> objects.
     * </p>
     * 
     * @param eventSourceMappings
     *        An array of <code>EventSourceMappingConfiguration</code> objects.
     */

    public void setEventSourceMappings(java.util.Collection<EventSourceMappingConfiguration> eventSourceMappings) {
        if (eventSourceMappings == null) {
            this.eventSourceMappings = null;
            return;
        }

        this.eventSourceMappings = new com.amazonaws.internal.SdkInternalList<EventSourceMappingConfiguration>(eventSourceMappings);
    }

    /**
     * <p>
     * An array of <code>EventSourceMappingConfiguration</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventSourceMappings(java.util.Collection)} or {@link #withEventSourceMappings(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param eventSourceMappings
     *        An array of <code>EventSourceMappingConfiguration</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventSourceMappingsResult withEventSourceMappings(EventSourceMappingConfiguration... eventSourceMappings) {
        if (this.eventSourceMappings == null) {
            setEventSourceMappings(new com.amazonaws.internal.SdkInternalList<EventSourceMappingConfiguration>(eventSourceMappings.length));
        }
        for (EventSourceMappingConfiguration ele : eventSourceMappings) {
            this.eventSourceMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>EventSourceMappingConfiguration</code> objects.
     * </p>
     * 
     * @param eventSourceMappings
     *        An array of <code>EventSourceMappingConfiguration</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventSourceMappingsResult withEventSourceMappings(java.util.Collection<EventSourceMappingConfiguration> eventSourceMappings) {
        setEventSourceMappings(eventSourceMappings);
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
        if (getNextMarker() != null)
            sb.append("NextMarker: " + getNextMarker() + ",");
        if (getEventSourceMappings() != null)
            sb.append("EventSourceMappings: " + getEventSourceMappings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEventSourceMappingsResult == false)
            return false;
        ListEventSourceMappingsResult other = (ListEventSourceMappingsResult) obj;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getEventSourceMappings() == null ^ this.getEventSourceMappings() == null)
            return false;
        if (other.getEventSourceMappings() != null && other.getEventSourceMappings().equals(this.getEventSourceMappings()) == false)
            return false;
        return true;
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
    public ListEventSourceMappingsResult clone() {
        try {
            return (ListEventSourceMappingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
