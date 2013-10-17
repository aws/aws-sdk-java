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
 * Volume Status Item
 */
public class VolumeStatusItem implements Serializable {

    private String volumeId;

    private String availabilityZone;

    private VolumeStatusInfo volumeStatus;

    private com.amazonaws.internal.ListWithAutoConstructFlag<VolumeStatusEvent> events;

    private com.amazonaws.internal.ListWithAutoConstructFlag<VolumeStatusAction> actions;

    /**
     * Returns the value of the VolumeId property for this object.
     *
     * @return The value of the VolumeId property for this object.
     */
    public String getVolumeId() {
        return volumeId;
    }
    
    /**
     * Sets the value of the VolumeId property for this object.
     *
     * @param volumeId The new value for the VolumeId property for this object.
     */
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }
    
    /**
     * Sets the value of the VolumeId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeId The new value for the VolumeId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VolumeStatusItem withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * Returns the value of the AvailabilityZone property for this object.
     *
     * @return The value of the AvailabilityZone property for this object.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * Sets the value of the AvailabilityZone property for this object.
     *
     * @param availabilityZone The new value for the AvailabilityZone property for this object.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * Sets the value of the AvailabilityZone property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The new value for the AvailabilityZone property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VolumeStatusItem withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * Returns the value of the VolumeStatus property for this object.
     *
     * @return The value of the VolumeStatus property for this object.
     */
    public VolumeStatusInfo getVolumeStatus() {
        return volumeStatus;
    }
    
    /**
     * Sets the value of the VolumeStatus property for this object.
     *
     * @param volumeStatus The new value for the VolumeStatus property for this object.
     */
    public void setVolumeStatus(VolumeStatusInfo volumeStatus) {
        this.volumeStatus = volumeStatus;
    }
    
    /**
     * Sets the value of the VolumeStatus property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeStatus The new value for the VolumeStatus property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VolumeStatusItem withVolumeStatus(VolumeStatusInfo volumeStatus) {
        this.volumeStatus = volumeStatus;
        return this;
    }

    /**
     * Returns the value of the Events property for this object.
     *
     * @return The value of the Events property for this object.
     */
    public java.util.List<VolumeStatusEvent> getEvents() {
        if (events == null) {
              events = new com.amazonaws.internal.ListWithAutoConstructFlag<VolumeStatusEvent>();
              events.setAutoConstruct(true);
        }
        return events;
    }
    
    /**
     * Sets the value of the Events property for this object.
     *
     * @param events The new value for the Events property for this object.
     */
    public void setEvents(java.util.Collection<VolumeStatusEvent> events) {
        if (events == null) {
            this.events = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<VolumeStatusEvent> eventsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VolumeStatusEvent>(events.size());
        eventsCopy.addAll(events);
        this.events = eventsCopy;
    }
    
    /**
     * Sets the value of the Events property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param events The new value for the Events property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VolumeStatusItem withEvents(VolumeStatusEvent... events) {
        if (getEvents() == null) setEvents(new java.util.ArrayList<VolumeStatusEvent>(events.length));
        for (VolumeStatusEvent value : events) {
            getEvents().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Events property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param events The new value for the Events property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VolumeStatusItem withEvents(java.util.Collection<VolumeStatusEvent> events) {
        if (events == null) {
            this.events = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<VolumeStatusEvent> eventsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VolumeStatusEvent>(events.size());
            eventsCopy.addAll(events);
            this.events = eventsCopy;
        }

        return this;
    }

    /**
     * Returns the value of the Actions property for this object.
     *
     * @return The value of the Actions property for this object.
     */
    public java.util.List<VolumeStatusAction> getActions() {
        if (actions == null) {
              actions = new com.amazonaws.internal.ListWithAutoConstructFlag<VolumeStatusAction>();
              actions.setAutoConstruct(true);
        }
        return actions;
    }
    
    /**
     * Sets the value of the Actions property for this object.
     *
     * @param actions The new value for the Actions property for this object.
     */
    public void setActions(java.util.Collection<VolumeStatusAction> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<VolumeStatusAction> actionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VolumeStatusAction>(actions.size());
        actionsCopy.addAll(actions);
        this.actions = actionsCopy;
    }
    
    /**
     * Sets the value of the Actions property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param actions The new value for the Actions property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VolumeStatusItem withActions(VolumeStatusAction... actions) {
        if (getActions() == null) setActions(new java.util.ArrayList<VolumeStatusAction>(actions.length));
        for (VolumeStatusAction value : actions) {
            getActions().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Actions property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param actions The new value for the Actions property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VolumeStatusItem withActions(java.util.Collection<VolumeStatusAction> actions) {
        if (actions == null) {
            this.actions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<VolumeStatusAction> actionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VolumeStatusAction>(actions.size());
            actionsCopy.addAll(actions);
            this.actions = actionsCopy;
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
        if (getVolumeId() != null) sb.append("VolumeId: " + getVolumeId() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getVolumeStatus() != null) sb.append("VolumeStatus: " + getVolumeStatus() + ",");
        if (getEvents() != null) sb.append("Events: " + getEvents() + ",");
        if (getActions() != null) sb.append("Actions: " + getActions() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getVolumeStatus() == null) ? 0 : getVolumeStatus().hashCode()); 
        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode()); 
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof VolumeStatusItem == false) return false;
        VolumeStatusItem other = (VolumeStatusItem)obj;
        
        if (other.getVolumeId() == null ^ this.getVolumeId() == null) return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getVolumeStatus() == null ^ this.getVolumeStatus() == null) return false;
        if (other.getVolumeStatus() != null && other.getVolumeStatus().equals(this.getVolumeStatus()) == false) return false; 
        if (other.getEvents() == null ^ this.getEvents() == null) return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false) return false; 
        if (other.getActions() == null ^ this.getActions() == null) return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false) return false; 
        return true;
    }
    
}
    