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
 * This data type is used as a response element in the DescribeEvents action.
 * </p>
 */
public class Event implements Serializable {

    /**
     * Provides the identifier for the source of the event.
     */
    private String sourceIdentifier;

    /**
     * Specifies the source type for this event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>db-instance, db-parameter-group, db-security-group, db-snapshot
     */
    private String sourceType;

    /**
     * Provides the text of this event.
     */
    private String message;

    /**
     * Specifies the category for the event.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> eventCategories;

    /**
     * Specifies the date and time of the event.
     */
    private java.util.Date date;

    /**
     * Default constructor for a new Event object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public Event() {}
    
    /**
     * Provides the identifier for the source of the event.
     *
     * @return Provides the identifier for the source of the event.
     */
    public String getSourceIdentifier() {
        return sourceIdentifier;
    }
    
    /**
     * Provides the identifier for the source of the event.
     *
     * @param sourceIdentifier Provides the identifier for the source of the event.
     */
    public void setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }
    
    /**
     * Provides the identifier for the source of the event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceIdentifier Provides the identifier for the source of the event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Event withSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
        return this;
    }

    /**
     * Specifies the source type for this event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>db-instance, db-parameter-group, db-security-group, db-snapshot
     *
     * @return Specifies the source type for this event.
     *
     * @see SourceType
     */
    public String getSourceType() {
        return sourceType;
    }
    
    /**
     * Specifies the source type for this event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>db-instance, db-parameter-group, db-security-group, db-snapshot
     *
     * @param sourceType Specifies the source type for this event.
     *
     * @see SourceType
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }
    
    /**
     * Specifies the source type for this event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>db-instance, db-parameter-group, db-security-group, db-snapshot
     *
     * @param sourceType Specifies the source type for this event.
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
     * Specifies the source type for this event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>db-instance, db-parameter-group, db-security-group, db-snapshot
     *
     * @param sourceType Specifies the source type for this event.
     *
     * @see SourceType
     */
    public void setSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
    }
    
    /**
     * Specifies the source type for this event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>db-instance, db-parameter-group, db-security-group, db-snapshot
     *
     * @param sourceType Specifies the source type for this event.
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
     * Provides the text of this event.
     *
     * @return Provides the text of this event.
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * Provides the text of this event.
     *
     * @param message Provides the text of this event.
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * Provides the text of this event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param message Provides the text of this event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Event withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Specifies the category for the event.
     *
     * @return Specifies the category for the event.
     */
    public java.util.List<String> getEventCategories() {
        if (eventCategories == null) {
              eventCategories = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              eventCategories.setAutoConstruct(true);
        }
        return eventCategories;
    }
    
    /**
     * Specifies the category for the event.
     *
     * @param eventCategories Specifies the category for the event.
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
     * Specifies the category for the event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventCategories Specifies the category for the event.
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
     * Specifies the category for the event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventCategories Specifies the category for the event.
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
     * Specifies the date and time of the event.
     *
     * @return Specifies the date and time of the event.
     */
    public java.util.Date getDate() {
        return date;
    }
    
    /**
     * Specifies the date and time of the event.
     *
     * @param date Specifies the date and time of the event.
     */
    public void setDate(java.util.Date date) {
        this.date = date;
    }
    
    /**
     * Specifies the date and time of the event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param date Specifies the date and time of the event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Event withDate(java.util.Date date) {
        this.date = date;
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
        if (getDate() != null) sb.append("Date: " + getDate() );
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
        hashCode = prime * hashCode + ((getDate() == null) ? 0 : getDate().hashCode()); 
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
        if (other.getDate() == null ^ this.getDate() == null) return false;
        if (other.getDate() != null && other.getDate().equals(this.getDate()) == false) return false; 
        return true;
    }
    
}
    