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
 * 
 * </p>
 */
public class DescribeEventCategoriesResult implements Serializable {

    /**
     * A list of event categories descriptions.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<EventCategoriesMap> eventCategoriesMapList;

    /**
     * A list of event categories descriptions.
     *
     * @return A list of event categories descriptions.
     */
    public java.util.List<EventCategoriesMap> getEventCategoriesMapList() {
        if (eventCategoriesMapList == null) {
              eventCategoriesMapList = new com.amazonaws.internal.ListWithAutoConstructFlag<EventCategoriesMap>();
              eventCategoriesMapList.setAutoConstruct(true);
        }
        return eventCategoriesMapList;
    }
    
    /**
     * A list of event categories descriptions.
     *
     * @param eventCategoriesMapList A list of event categories descriptions.
     */
    public void setEventCategoriesMapList(java.util.Collection<EventCategoriesMap> eventCategoriesMapList) {
        if (eventCategoriesMapList == null) {
            this.eventCategoriesMapList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<EventCategoriesMap> eventCategoriesMapListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<EventCategoriesMap>(eventCategoriesMapList.size());
        eventCategoriesMapListCopy.addAll(eventCategoriesMapList);
        this.eventCategoriesMapList = eventCategoriesMapListCopy;
    }
    
    /**
     * A list of event categories descriptions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventCategoriesMapList A list of event categories descriptions.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeEventCategoriesResult withEventCategoriesMapList(EventCategoriesMap... eventCategoriesMapList) {
        if (getEventCategoriesMapList() == null) setEventCategoriesMapList(new java.util.ArrayList<EventCategoriesMap>(eventCategoriesMapList.length));
        for (EventCategoriesMap value : eventCategoriesMapList) {
            getEventCategoriesMapList().add(value);
        }
        return this;
    }
    
    /**
     * A list of event categories descriptions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventCategoriesMapList A list of event categories descriptions.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeEventCategoriesResult withEventCategoriesMapList(java.util.Collection<EventCategoriesMap> eventCategoriesMapList) {
        if (eventCategoriesMapList == null) {
            this.eventCategoriesMapList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<EventCategoriesMap> eventCategoriesMapListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<EventCategoriesMap>(eventCategoriesMapList.size());
            eventCategoriesMapListCopy.addAll(eventCategoriesMapList);
            this.eventCategoriesMapList = eventCategoriesMapListCopy;
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
        if (getEventCategoriesMapList() != null) sb.append("EventCategoriesMapList: " + getEventCategoriesMapList() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEventCategoriesMapList() == null) ? 0 : getEventCategoriesMapList().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeEventCategoriesResult == false) return false;
        DescribeEventCategoriesResult other = (DescribeEventCategoriesResult)obj;
        
        if (other.getEventCategoriesMapList() == null ^ this.getEventCategoriesMapList() == null) return false;
        if (other.getEventCategoriesMapList() != null && other.getEventCategoriesMapList().equals(this.getEventCategoriesMapList()) == false) return false; 
        return true;
    }
    
}
    