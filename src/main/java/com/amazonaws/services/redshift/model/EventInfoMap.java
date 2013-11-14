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
public class EventInfoMap implements Serializable {

    /**
     * The identifier of an Amazon Redshift event.
     */
    private String eventId;

    /**
     * The category of an Amazon Redshift event.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> eventCategories;

    /**
     * The description of an Amazon Redshift event.
     */
    private String eventDescription;

    /**
     * The severity of the event. <p>Values: ERROR, INFO
     */
    private String severity;

    /**
     * The identifier of an Amazon Redshift event.
     *
     * @return The identifier of an Amazon Redshift event.
     */
    public String getEventId() {
        return eventId;
    }
    
    /**
     * The identifier of an Amazon Redshift event.
     *
     * @param eventId The identifier of an Amazon Redshift event.
     */
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }
    
    /**
     * The identifier of an Amazon Redshift event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventId The identifier of an Amazon Redshift event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EventInfoMap withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * The category of an Amazon Redshift event.
     *
     * @return The category of an Amazon Redshift event.
     */
    public java.util.List<String> getEventCategories() {
        if (eventCategories == null) {
              eventCategories = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              eventCategories.setAutoConstruct(true);
        }
        return eventCategories;
    }
    
    /**
     * The category of an Amazon Redshift event.
     *
     * @param eventCategories The category of an Amazon Redshift event.
     */
    public void setEventCategories(java.util.Collection<String> eventCategories) {
        if (eventCategories == null) {
            this.eventCategories = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> eventCategoriesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(eventCategories.size());
        eventCategoriesCopy.addAll(eventCategories);
        this.eventCategories = eventCategoriesCopy;
    }
    
    /**
     * The category of an Amazon Redshift event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventCategories The category of an Amazon Redshift event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EventInfoMap withEventCategories(String... eventCategories) {
        if (getEventCategories() == null) setEventCategories(new java.util.ArrayList<String>(eventCategories.length));
        for (String value : eventCategories) {
            getEventCategories().add(value);
        }
        return this;
    }
    
    /**
     * The category of an Amazon Redshift event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventCategories The category of an Amazon Redshift event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EventInfoMap withEventCategories(java.util.Collection<String> eventCategories) {
        if (eventCategories == null) {
            this.eventCategories = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> eventCategoriesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(eventCategories.size());
            eventCategoriesCopy.addAll(eventCategories);
            this.eventCategories = eventCategoriesCopy;
        }

        return this;
    }

    /**
     * The description of an Amazon Redshift event.
     *
     * @return The description of an Amazon Redshift event.
     */
    public String getEventDescription() {
        return eventDescription;
    }
    
    /**
     * The description of an Amazon Redshift event.
     *
     * @param eventDescription The description of an Amazon Redshift event.
     */
    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }
    
    /**
     * The description of an Amazon Redshift event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventDescription The description of an Amazon Redshift event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EventInfoMap withEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
        return this;
    }

    /**
     * The severity of the event. <p>Values: ERROR, INFO
     *
     * @return The severity of the event. <p>Values: ERROR, INFO
     */
    public String getSeverity() {
        return severity;
    }
    
    /**
     * The severity of the event. <p>Values: ERROR, INFO
     *
     * @param severity The severity of the event. <p>Values: ERROR, INFO
     */
    public void setSeverity(String severity) {
        this.severity = severity;
    }
    
    /**
     * The severity of the event. <p>Values: ERROR, INFO
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param severity The severity of the event. <p>Values: ERROR, INFO
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EventInfoMap withSeverity(String severity) {
        this.severity = severity;
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
        if (getEventId() != null) sb.append("EventId: " + getEventId() + ",");
        if (getEventCategories() != null) sb.append("EventCategories: " + getEventCategories() + ",");
        if (getEventDescription() != null) sb.append("EventDescription: " + getEventDescription() + ",");
        if (getSeverity() != null) sb.append("Severity: " + getSeverity() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode()); 
        hashCode = prime * hashCode + ((getEventCategories() == null) ? 0 : getEventCategories().hashCode()); 
        hashCode = prime * hashCode + ((getEventDescription() == null) ? 0 : getEventDescription().hashCode()); 
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof EventInfoMap == false) return false;
        EventInfoMap other = (EventInfoMap)obj;
        
        if (other.getEventId() == null ^ this.getEventId() == null) return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false) return false; 
        if (other.getEventCategories() == null ^ this.getEventCategories() == null) return false;
        if (other.getEventCategories() != null && other.getEventCategories().equals(this.getEventCategories()) == false) return false; 
        if (other.getEventDescription() == null ^ this.getEventDescription() == null) return false;
        if (other.getEventDescription() != null && other.getEventDescription().equals(this.getEventDescription()) == false) return false; 
        if (other.getSeverity() == null ^ this.getSeverity() == null) return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false) return false; 
        return true;
    }
    
}
    