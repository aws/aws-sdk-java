/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about an event that was returned by a lookup
 * request. The result includes a representation of a CloudTrail event.
 * </p>
 */
public class Event implements Serializable, Cloneable {

    /**
     * The CloudTrail ID of the event returned.
     */
    private String eventId;

    /**
     * The name of the event returned.
     */
    private String eventName;

    /**
     * The date and time of the event returned.
     */
    private java.util.Date eventTime;

    /**
     * A user name or role name of the requester that called the API in the
     * event returned.
     */
    private String username;

    /**
     * A list of resources referenced by the event returned.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Resource> resources;

    /**
     * A JSON string that contains a representation of the event returned.
     */
    private String cloudTrailEvent;

    /**
     * The CloudTrail ID of the event returned.
     *
     * @return The CloudTrail ID of the event returned.
     */
    public String getEventId() {
        return eventId;
    }
    
    /**
     * The CloudTrail ID of the event returned.
     *
     * @param eventId The CloudTrail ID of the event returned.
     */
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }
    
    /**
     * The CloudTrail ID of the event returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventId The CloudTrail ID of the event returned.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Event withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * The name of the event returned.
     *
     * @return The name of the event returned.
     */
    public String getEventName() {
        return eventName;
    }
    
    /**
     * The name of the event returned.
     *
     * @param eventName The name of the event returned.
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
    
    /**
     * The name of the event returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventName The name of the event returned.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Event withEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    /**
     * The date and time of the event returned.
     *
     * @return The date and time of the event returned.
     */
    public java.util.Date getEventTime() {
        return eventTime;
    }
    
    /**
     * The date and time of the event returned.
     *
     * @param eventTime The date and time of the event returned.
     */
    public void setEventTime(java.util.Date eventTime) {
        this.eventTime = eventTime;
    }
    
    /**
     * The date and time of the event returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventTime The date and time of the event returned.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Event withEventTime(java.util.Date eventTime) {
        this.eventTime = eventTime;
        return this;
    }

    /**
     * A user name or role name of the requester that called the API in the
     * event returned.
     *
     * @return A user name or role name of the requester that called the API in the
     *         event returned.
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * A user name or role name of the requester that called the API in the
     * event returned.
     *
     * @param username A user name or role name of the requester that called the API in the
     *         event returned.
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    /**
     * A user name or role name of the requester that called the API in the
     * event returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param username A user name or role name of the requester that called the API in the
     *         event returned.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Event withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * A list of resources referenced by the event returned.
     *
     * @return A list of resources referenced by the event returned.
     */
    public java.util.List<Resource> getResources() {
        if (resources == null) {
              resources = new com.amazonaws.internal.ListWithAutoConstructFlag<Resource>();
              resources.setAutoConstruct(true);
        }
        return resources;
    }
    
    /**
     * A list of resources referenced by the event returned.
     *
     * @param resources A list of resources referenced by the event returned.
     */
    public void setResources(java.util.Collection<Resource> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Resource> resourcesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Resource>(resources.size());
        resourcesCopy.addAll(resources);
        this.resources = resourcesCopy;
    }
    
    /**
     * A list of resources referenced by the event returned.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setResources(java.util.Collection)} or {@link
     * #withResources(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resources A list of resources referenced by the event returned.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Event withResources(Resource... resources) {
        if (getResources() == null) setResources(new java.util.ArrayList<Resource>(resources.length));
        for (Resource value : resources) {
            getResources().add(value);
        }
        return this;
    }
    
    /**
     * A list of resources referenced by the event returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resources A list of resources referenced by the event returned.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Event withResources(java.util.Collection<Resource> resources) {
        if (resources == null) {
            this.resources = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Resource> resourcesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Resource>(resources.size());
            resourcesCopy.addAll(resources);
            this.resources = resourcesCopy;
        }

        return this;
    }

    /**
     * A JSON string that contains a representation of the event returned.
     *
     * @return A JSON string that contains a representation of the event returned.
     */
    public String getCloudTrailEvent() {
        return cloudTrailEvent;
    }
    
    /**
     * A JSON string that contains a representation of the event returned.
     *
     * @param cloudTrailEvent A JSON string that contains a representation of the event returned.
     */
    public void setCloudTrailEvent(String cloudTrailEvent) {
        this.cloudTrailEvent = cloudTrailEvent;
    }
    
    /**
     * A JSON string that contains a representation of the event returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cloudTrailEvent A JSON string that contains a representation of the event returned.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Event withCloudTrailEvent(String cloudTrailEvent) {
        this.cloudTrailEvent = cloudTrailEvent;
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
        if (getEventName() != null) sb.append("EventName: " + getEventName() + ",");
        if (getEventTime() != null) sb.append("EventTime: " + getEventTime() + ",");
        if (getUsername() != null) sb.append("Username: " + getUsername() + ",");
        if (getResources() != null) sb.append("Resources: " + getResources() + ",");
        if (getCloudTrailEvent() != null) sb.append("CloudTrailEvent: " + getCloudTrailEvent() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode()); 
        hashCode = prime * hashCode + ((getEventName() == null) ? 0 : getEventName().hashCode()); 
        hashCode = prime * hashCode + ((getEventTime() == null) ? 0 : getEventTime().hashCode()); 
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode()); 
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode()); 
        hashCode = prime * hashCode + ((getCloudTrailEvent() == null) ? 0 : getCloudTrailEvent().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Event == false) return false;
        Event other = (Event)obj;
        
        if (other.getEventId() == null ^ this.getEventId() == null) return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false) return false; 
        if (other.getEventName() == null ^ this.getEventName() == null) return false;
        if (other.getEventName() != null && other.getEventName().equals(this.getEventName()) == false) return false; 
        if (other.getEventTime() == null ^ this.getEventTime() == null) return false;
        if (other.getEventTime() != null && other.getEventTime().equals(this.getEventTime()) == false) return false; 
        if (other.getUsername() == null ^ this.getUsername() == null) return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false) return false; 
        if (other.getResources() == null ^ this.getResources() == null) return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false) return false; 
        if (other.getCloudTrailEvent() == null ^ this.getCloudTrailEvent() == null) return false;
        if (other.getCloudTrailEvent() != null && other.getCloudTrailEvent().equals(this.getCloudTrailEvent()) == false) return false; 
        return true;
    }
    
    @Override
    public Event clone() {
        try {
            return (Event) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    