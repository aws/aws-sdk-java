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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;


/**
 * Volume Status Event
 */
public class VolumeStatusEvent implements Serializable {

    private String eventType;

    private String description;

    private java.util.Date notBefore;

    private java.util.Date notAfter;

    private String eventId;

    /**
     * Returns the value of the EventType property for this object.
     *
     * @return The value of the EventType property for this object.
     */
    public String getEventType() {
        return eventType;
    }
    
    /**
     * Sets the value of the EventType property for this object.
     *
     * @param eventType The new value for the EventType property for this object.
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
    
    /**
     * Sets the value of the EventType property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventType The new value for the EventType property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VolumeStatusEvent withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * Returns the value of the Description property for this object.
     *
     * @return The value of the Description property for this object.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Sets the value of the Description property for this object.
     *
     * @param description The new value for the Description property for this object.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Sets the value of the Description property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The new value for the Description property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VolumeStatusEvent withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns the value of the NotBefore property for this object.
     *
     * @return The value of the NotBefore property for this object.
     */
    public java.util.Date getNotBefore() {
        return notBefore;
    }
    
    /**
     * Sets the value of the NotBefore property for this object.
     *
     * @param notBefore The new value for the NotBefore property for this object.
     */
    public void setNotBefore(java.util.Date notBefore) {
        this.notBefore = notBefore;
    }
    
    /**
     * Sets the value of the NotBefore property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param notBefore The new value for the NotBefore property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VolumeStatusEvent withNotBefore(java.util.Date notBefore) {
        this.notBefore = notBefore;
        return this;
    }

    /**
     * Returns the value of the NotAfter property for this object.
     *
     * @return The value of the NotAfter property for this object.
     */
    public java.util.Date getNotAfter() {
        return notAfter;
    }
    
    /**
     * Sets the value of the NotAfter property for this object.
     *
     * @param notAfter The new value for the NotAfter property for this object.
     */
    public void setNotAfter(java.util.Date notAfter) {
        this.notAfter = notAfter;
    }
    
    /**
     * Sets the value of the NotAfter property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param notAfter The new value for the NotAfter property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VolumeStatusEvent withNotAfter(java.util.Date notAfter) {
        this.notAfter = notAfter;
        return this;
    }

    /**
     * Returns the value of the EventId property for this object.
     *
     * @return The value of the EventId property for this object.
     */
    public String getEventId() {
        return eventId;
    }
    
    /**
     * Sets the value of the EventId property for this object.
     *
     * @param eventId The new value for the EventId property for this object.
     */
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }
    
    /**
     * Sets the value of the EventId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventId The new value for the EventId property for this object.
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
    