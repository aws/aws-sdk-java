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
 * Describes the volume status.
 * </p>
 */
public class VolumeStatusItem implements Serializable {

    /**
     * The volume ID.
     */
    private String volumeId;

    /**
     * The Availability Zone of the volume.
     */
    private String availabilityZone;

    /**
     * The volume status.
     */
    private VolumeStatusInfo volumeStatus;

    /**
     * A list of events associated with the volume.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<VolumeStatusEvent> events;

    /**
     * The details of the operation.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<VolumeStatusAction> actions;

    /**
     * The volume ID.
     *
     * @return The volume ID.
     */
    public String getVolumeId() {
        return volumeId;
    }
    
    /**
     * The volume ID.
     *
     * @param volumeId The volume ID.
     */
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }
    
    /**
     * The volume ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeId The volume ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VolumeStatusItem withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * The Availability Zone of the volume.
     *
     * @return The Availability Zone of the volume.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The Availability Zone of the volume.
     *
     * @param availabilityZone The Availability Zone of the volume.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The Availability Zone of the volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The Availability Zone of the volume.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VolumeStatusItem withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * The volume status.
     *
     * @return The volume status.
     */
    public VolumeStatusInfo getVolumeStatus() {
        return volumeStatus;
    }
    
    /**
     * The volume status.
     *
     * @param volumeStatus The volume status.
     */
    public void setVolumeStatus(VolumeStatusInfo volumeStatus) {
        this.volumeStatus = volumeStatus;
    }
    
    /**
     * The volume status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeStatus The volume status.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VolumeStatusItem withVolumeStatus(VolumeStatusInfo volumeStatus) {
        this.volumeStatus = volumeStatus;
        return this;
    }

    /**
     * A list of events associated with the volume.
     *
     * @return A list of events associated with the volume.
     */
    public java.util.List<VolumeStatusEvent> getEvents() {
        if (events == null) {
              events = new com.amazonaws.internal.ListWithAutoConstructFlag<VolumeStatusEvent>();
              events.setAutoConstruct(true);
        }
        return events;
    }
    
    /**
     * A list of events associated with the volume.
     *
     * @param events A list of events associated with the volume.
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
     * A list of events associated with the volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param events A list of events associated with the volume.
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
     * A list of events associated with the volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param events A list of events associated with the volume.
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
     * The details of the operation.
     *
     * @return The details of the operation.
     */
    public java.util.List<VolumeStatusAction> getActions() {
        if (actions == null) {
              actions = new com.amazonaws.internal.ListWithAutoConstructFlag<VolumeStatusAction>();
              actions.setAutoConstruct(true);
        }
        return actions;
    }
    
    /**
     * The details of the operation.
     *
     * @param actions The details of the operation.
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
     * The details of the operation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param actions The details of the operation.
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
     * The details of the operation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param actions The details of the operation.
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
    