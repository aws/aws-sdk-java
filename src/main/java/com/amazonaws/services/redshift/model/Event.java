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
 * <p>
 * Describes an event.
 * </p>
 */
public class Event implements Serializable {

    /**
     * The identifier for the source of the event.
     */
    private String sourceIdentifier;

    /**
     * The source type for this event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cluster, cluster-parameter-group, cluster-security-group, cluster-snapshot
     */
    private String sourceType;

    /**
     * The text of this event.
     */
    private String message;

    /**
     * A list of the event categories.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> eventCategories;

    /**
     * The severity of the event. <p>Values: ERROR, INFO
     */
    private String severity;

    /**
     * The date and time of the event.
     */
    private java.util.Date date;

    /**
     * The identifier of the event.
     */
    private String eventId;

    /**
     * The identifier for the source of the event.
     *
     * @return The identifier for the source of the event.
     */
    public String getSourceIdentifier() {
        return sourceIdentifier;
    }
    
    /**
     * The identifier for the source of the event.
     *
     * @param sourceIdentifier The identifier for the source of the event.
     */
    public void setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }
    
    /**
     * The identifier for the source of the event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceIdentifier The identifier for the source of the event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Event withSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
        return this;
    }

    /**
     * The source type for this event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cluster, cluster-parameter-group, cluster-security-group, cluster-snapshot
     *
     * @return The source type for this event.
     *
     * @see SourceType
     */
    public String getSourceType() {
        return sourceType;
    }
    
    /**
     * The source type for this event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cluster, cluster-parameter-group, cluster-security-group, cluster-snapshot
     *
     * @param sourceType The source type for this event.
     *
     * @see SourceType
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }
    
    /**
     * The source type for this event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cluster, cluster-parameter-group, cluster-security-group, cluster-snapshot
     *
     * @param sourceType The source type for this event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see SourceType
     */
    public Event withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * The source type for this event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cluster, cluster-parameter-group, cluster-security-group, cluster-snapshot
     *
     * @param sourceType The source type for this event.
     *
     * @see SourceType
     */
    public void setSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
    }
    
    /**
     * The source type for this event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cluster, cluster-parameter-group, cluster-security-group, cluster-snapshot
     *
     * @param sourceType The source type for this event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see SourceType
     */
    public Event withSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
        return this;
    }

    /**
     * The text of this event.
     *
     * @return The text of this event.
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * The text of this event.
     *
     * @param message The text of this event.
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * The text of this event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param message The text of this event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Event withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * A list of the event categories.
     *
     * @return A list of the event categories.
     */
    public java.util.List<String> getEventCategories() {
        if (eventCategories == null) {
              eventCategories = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              eventCategories.setAutoConstruct(true);
        }
        return eventCategories;
    }
    
    /**
     * A list of the event categories.
     *
     * @param eventCategories A list of the event categories.
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
     * A list of the event categories.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventCategories A list of the event categories.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Event withEventCategories(String... eventCategories) {
        if (getEventCategories() == null) setEventCategories(new java.util.ArrayList<String>(eventCategories.length));
        for (String value : eventCategories) {
            getEventCategories().add(value);
        }
        return this;
    }
    
    /**
     * A list of the event categories.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventCategories A list of the event categories.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Event withEventCategories(java.util.Collection<String> eventCategories) {
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
    public Event withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * The date and time of the event.
     *
     * @return The date and time of the event.
     */
    public java.util.Date getDate() {
        return date;
    }
    
    /**
     * The date and time of the event.
     *
     * @param date The date and time of the event.
     */
    public void setDate(java.util.Date date) {
        this.date = date;
    }
    
    /**
     * The date and time of the event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param date The date and time of the event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Event withDate(java.util.Date date) {
        this.date = date;
        return this;
    }

    /**
     * The identifier of the event.
     *
     * @return The identifier of the event.
     */
    public String getEventId() {
        return eventId;
    }
    
    /**
     * The identifier of the event.
     *
     * @param eventId The identifier of the event.
     */
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }
    
    /**
     * The identifier of the event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventId The identifier of the event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Event withEventId(String eventId) {
        this.eventId = eventId;
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
        if (getSourceIdentifier() != null) sb.append("SourceIdentifier: " + getSourceIdentifier() + ",");
        if (getSourceType() != null) sb.append("SourceType: " + getSourceType() + ",");
        if (getMessage() != null) sb.append("Message: " + getMessage() + ",");
        if (getEventCategories() != null) sb.append("EventCategories: " + getEventCategories() + ",");
        if (getSeverity() != null) sb.append("Severity: " + getSeverity() + ",");
        if (getDate() != null) sb.append("Date: " + getDate() + ",");
        if (getEventId() != null) sb.append("EventId: " + getEventId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSourceIdentifier() == null) ? 0 : getSourceIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode()); 
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode()); 
        hashCode = prime * hashCode + ((getEventCategories() == null) ? 0 : getEventCategories().hashCode()); 
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode()); 
        hashCode = prime * hashCode + ((getDate() == null) ? 0 : getDate().hashCode()); 
        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Event == false) return false;
        Event other = (Event)obj;
        
        if (other.getSourceIdentifier() == null ^ this.getSourceIdentifier() == null) return false;
        if (other.getSourceIdentifier() != null && other.getSourceIdentifier().equals(this.getSourceIdentifier()) == false) return false; 
        if (other.getSourceType() == null ^ this.getSourceType() == null) return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false) return false; 
        if (other.getMessage() == null ^ this.getMessage() == null) return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false) return false; 
        if (other.getEventCategories() == null ^ this.getEventCategories() == null) return false;
        if (other.getEventCategories() != null && other.getEventCategories().equals(this.getEventCategories()) == false) return false; 
        if (other.getSeverity() == null ^ this.getSeverity() == null) return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false) return false; 
        if (other.getDate() == null ^ this.getDate() == null) return false;
        if (other.getDate() != null && other.getDate().equals(this.getDate()) == false) return false; 
        if (other.getEventId() == null ^ this.getEventId() == null) return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false) return false; 
        return true;
    }
    
}
    