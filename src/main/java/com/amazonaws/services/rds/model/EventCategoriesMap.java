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
 * Contains the results of a successful invocation of the DescribeEventCategories action.
 * </p>
 */
public class EventCategoriesMap implements Serializable {

    /**
     * The source type that the returned categories belong to
     */
    private String sourceType;

    /**
     * The event categories for the specified source type
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> eventCategories;

    /**
     * The source type that the returned categories belong to
     *
     * @return The source type that the returned categories belong to
     */
    public String getSourceType() {
        return sourceType;
    }
    
    /**
     * The source type that the returned categories belong to
     *
     * @param sourceType The source type that the returned categories belong to
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }
    
    /**
     * The source type that the returned categories belong to
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceType The source type that the returned categories belong to
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EventCategoriesMap withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * The event categories for the specified source type
     *
     * @return The event categories for the specified source type
     */
    public java.util.List<String> getEventCategories() {
        if (eventCategories == null) {
              eventCategories = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              eventCategories.setAutoConstruct(true);
        }
        return eventCategories;
    }
    
    /**
     * The event categories for the specified source type
     *
     * @param eventCategories The event categories for the specified source type
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
     * The event categories for the specified source type
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventCategories The event categories for the specified source type
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EventCategoriesMap withEventCategories(String... eventCategories) {
        if (getEventCategories() == null) setEventCategories(new java.util.ArrayList<String>(eventCategories.length));
        for (String value : eventCategories) {
            getEventCategories().add(value);
        }
        return this;
    }
    
    /**
     * The event categories for the specified source type
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventCategories The event categories for the specified source type
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EventCategoriesMap withEventCategories(java.util.Collection<String> eventCategories) {
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
        if (getEventCategories() != null) sb.append("EventCategories: " + getEventCategories() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode()); 
        hashCode = prime * hashCode + ((getEventCategories() == null) ? 0 : getEventCategories().hashCode()); 
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
        if (other.getEventCategories() == null ^ this.getEventCategories() == null) return false;
        if (other.getEventCategories() != null && other.getEventCategories().equals(this.getEventCategories()) == false) return false; 
        return true;
    }
    
}
    