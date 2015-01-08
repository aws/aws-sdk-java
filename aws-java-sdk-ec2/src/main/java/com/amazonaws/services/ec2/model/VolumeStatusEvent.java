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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a volume status event.
 * </p>
 */
public class VolumeStatusEvent implements Serializable {

    /**
     * The type of this event.
     */
    private String eventType;

    /**
     * A description of the event.
     */
    private String description;

    /**
     * The earliest start time of the event.
     */
    private java.util.Date notBefore;

    /**
     * The latest end time of the event.
     */
    private java.util.Date notAfter;

    /**
     * The ID of this event.
     */
    private String eventId;

    /**
     * The type of this event.
     *
     * @return The type of this event.
     */
    public String getEventType() {
        return eventType;
    }
    
    /**
     * The type of this event.
     *
     * @param eventType The type of this event.
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
    
    /**
     * The type of this event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventType The type of this event.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VolumeStatusEvent withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * A description of the event.
     *
     * @return A description of the event.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A description of the event.
     *
     * @param description A description of the event.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A description of the event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description A description of the event.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VolumeStatusEvent withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The earliest start time of the event.
     *
     * @return The earliest start time of the event.
     */
    public java.util.Date getNotBefore() {
        return notBefore;
    }
    
    /**
     * The earliest start time of the event.
     *
     * @param notBefore The earliest start time of the event.
     */
    public void setNotBefore(java.util.Date notBefore) {
        this.notBefore = notBefore;
    }
    
    /**
     * The earliest start time of the event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param notBefore The earliest start time of the event.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VolumeStatusEvent withNotBefore(java.util.Date notBefore) {
        this.notBefore = notBefore;
        return this;
    }

    /**
     * The latest end time of the event.
     *
     * @return The latest end time of the event.
     */
    public java.util.Date getNotAfter() {
        return notAfter;
    }
    
    /**
     * The latest end time of the event.
     *
     * @param notAfter The latest end time of the event.
     */
    public void setNotAfter(java.util.Date notAfter) {
        this.notAfter = notAfter;
    }
    
    /**
     * The latest end time of the event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param notAfter The latest end time of the event.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VolumeStatusEvent withNotAfter(java.util.Date notAfter) {
        this.notAfter = notAfter;
        return this;
    }

    /**
     * The ID of this event.
     *
     * @return The ID of this event.
     */
    public String getEventId() {
        return eventId;
    }
    
    /**
     * The ID of this event.
     *
     * @param eventId The ID of this event.
     */
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }
    
    /**
     * The ID of this event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventId The ID of this event.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VolumeStatusEvent withEventId(String eventId) {
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
        if (getEventType() != null) sb.append("EventType: " + getEventType() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getNotBefore() != null) sb.append("NotBefore: " + getNotBefore() + ",");
        if (getNotAfter() != null) sb.append("NotAfter: " + getNotAfter() + ",");
        if (getEventId() != null) sb.append("EventId: " + getEventId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getNotBefore() == null) ? 0 : getNotBefore().hashCode()); 
        hashCode = prime * hashCode + ((getNotAfter() == null) ? 0 : getNotAfter().hashCode()); 
        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof VolumeStatusEvent == false) return false;
        VolumeStatusEvent other = (VolumeStatusEvent)obj;
        
        if (other.getEventType() == null ^ this.getEventType() == null) return false;
        if (other.getEventType() != null && other.getEventType().equals(this.getEventType()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getNotBefore() == null ^ this.getNotBefore() == null) return false;
        if (other.getNotBefore() != null && other.getNotBefore().equals(this.getNotBefore()) == false) return false; 
        if (other.getNotAfter() == null ^ this.getNotAfter() == null) return false;
        if (other.getNotAfter() != null && other.getNotAfter().equals(this.getNotAfter()) == false) return false; 
        if (other.getEventId() == null ^ this.getEventId() == null) return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false) return false; 
        return true;
    }
    
}
    