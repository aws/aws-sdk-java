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
 * <p>
 * Represents the status of an Amazon EC2 instance.
 * </p>
 */
public class InstanceStatus implements Serializable {

    /**
     * The ID of the Amazon EC2 instance.
     */
    private String instanceId;

    /**
     * The Amazon EC2 instance's availability zone.
     */
    private String availabilityZone;

    /**
     * Events that affect the status of the associated Amazon EC2 instance.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<InstanceStatusEvent> events;

    /**
     * Represents the state of an Amazon EC2 instance.
     */
    private InstanceState instanceState;

    private InstanceStatusSummary systemStatus;

    private InstanceStatusSummary instanceStatus;

    /**
     * The ID of the Amazon EC2 instance.
     *
     * @return The ID of the Amazon EC2 instance.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the Amazon EC2 instance.
     *
     * @param instanceId The ID of the Amazon EC2 instance.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the Amazon EC2 instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of the Amazon EC2 instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceStatus withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * The Amazon EC2 instance's availability zone.
     *
     * @return The Amazon EC2 instance's availability zone.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The Amazon EC2 instance's availability zone.
     *
     * @param availabilityZone The Amazon EC2 instance's availability zone.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The Amazon EC2 instance's availability zone.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The Amazon EC2 instance's availability zone.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceStatus withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * Events that affect the status of the associated Amazon EC2 instance.
     *
     * @return Events that affect the status of the associated Amazon EC2 instance.
     */
    public java.util.List<InstanceStatusEvent> getEvents() {
        if (events == null) {
              events = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceStatusEvent>();
              events.setAutoConstruct(true);
        }
        return events;
    }
    
    /**
     * Events that affect the status of the associated Amazon EC2 instance.
     *
     * @param events Events that affect the status of the associated Amazon EC2 instance.
     */
    public void setEvents(java.util.Collection<InstanceStatusEvent> events) {
        if (events == null) {
            this.events = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<InstanceStatusEvent> eventsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceStatusEvent>(events.size());
        eventsCopy.addAll(events);
        this.events = eventsCopy;
    }
    
    /**
     * Events that affect the status of the associated Amazon EC2 instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param events Events that affect the status of the associated Amazon EC2 instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceStatus withEvents(InstanceStatusEvent... events) {
        if (getEvents() == null) setEvents(new java.util.ArrayList<InstanceStatusEvent>(events.length));
        for (InstanceStatusEvent value : events) {
            getEvents().add(value);
        }
        return this;
    }
    
    /**
     * Events that affect the status of the associated Amazon EC2 instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param events Events that affect the status of the associated Amazon EC2 instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceStatus withEvents(java.util.Collection<InstanceStatusEvent> events) {
        if (events == null) {
            this.events = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<InstanceStatusEvent> eventsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceStatusEvent>(events.size());
            eventsCopy.addAll(events);
            this.events = eventsCopy;
        }

        return this;
    }

    /**
     * Represents the state of an Amazon EC2 instance.
     *
     * @return Represents the state of an Amazon EC2 instance.
     */
    public InstanceState getInstanceState() {
        return instanceState;
    }
    
    /**
     * Represents the state of an Amazon EC2 instance.
     *
     * @param instanceState Represents the state of an Amazon EC2 instance.
     */
    public void setInstanceState(InstanceState instanceState) {
        this.instanceState = instanceState;
    }
    
    /**
     * Represents the state of an Amazon EC2 instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceState Represents the state of an Amazon EC2 instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceStatus withInstanceState(InstanceState instanceState) {
        this.instanceState = instanceState;
        return this;
    }

    /**
     * Returns the value of the SystemStatus property for this object.
     *
     * @return The value of the SystemStatus property for this object.
     */
    public InstanceStatusSummary getSystemStatus() {
        return systemStatus;
    }
    
    /**
     * Sets the value of the SystemStatus property for this object.
     *
     * @param systemStatus The new value for the SystemStatus property for this object.
     */
    public void setSystemStatus(InstanceStatusSummary systemStatus) {
        this.systemStatus = systemStatus;
    }
    
    /**
     * Sets the value of the SystemStatus property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param systemStatus The new value for the SystemStatus property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceStatus withSystemStatus(InstanceStatusSummary systemStatus) {
        this.systemStatus = systemStatus;
        return this;
    }

    /**
     * Returns the value of the InstanceStatus property for this object.
     *
     * @return The value of the InstanceStatus property for this object.
     */
    public InstanceStatusSummary getInstanceStatus() {
        return instanceStatus;
    }
    
    /**
     * Sets the value of the InstanceStatus property for this object.
     *
     * @param instanceStatus The new value for the InstanceStatus property for this object.
     */
    public void setInstanceStatus(InstanceStatusSummary instanceStatus) {
        this.instanceStatus = instanceStatus;
    }
    
    /**
     * Sets the value of the InstanceStatus property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceStatus The new value for the InstanceStatus property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceStatus withInstanceStatus(InstanceStatusSummary instanceStatus) {
        this.instanceStatus = instanceStatus;
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
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getEvents() != null) sb.append("Events: " + getEvents() + ",");
        if (getInstanceState() != null) sb.append("InstanceState: " + getInstanceState() + ",");
        if (getSystemStatus() != null) sb.append("SystemStatus: " + getSystemStatus() + ",");
        if (getInstanceStatus() != null) sb.append("InstanceStatus: " + getInstanceStatus() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceState() == null) ? 0 : getInstanceState().hashCode()); 
        hashCode = prime * hashCode + ((getSystemStatus() == null) ? 0 : getSystemStatus().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceStatus() == null) ? 0 : getInstanceStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InstanceStatus == false) return false;
        InstanceStatus other = (InstanceStatus)obj;
        
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getEvents() == null ^ this.getEvents() == null) return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false) return false; 
        if (other.getInstanceState() == null ^ this.getInstanceState() == null) return false;
        if (other.getInstanceState() != null && other.getInstanceState().equals(this.getInstanceState()) == false) return false; 
        if (other.getSystemStatus() == null ^ this.getSystemStatus() == null) return false;
        if (other.getSystemStatus() != null && other.getSystemStatus().equals(this.getSystemStatus()) == false) return false; 
        if (other.getInstanceStatus() == null ^ this.getInstanceStatus() == null) return false;
        if (other.getInstanceStatus() != null && other.getInstanceStatus().equals(this.getInstanceStatus()) == false) return false; 
        return true;
    }
    
}
    