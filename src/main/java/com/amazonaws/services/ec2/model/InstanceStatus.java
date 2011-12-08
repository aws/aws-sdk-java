/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Represents the status of an Amazon EC2 instance.
 * </p>
 */
public class InstanceStatus {

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
    private java.util.List<InstanceStatusEvent> events;

    /**
     * Represents the state of an Amazon EC2 instance.
     */
    private InstanceState instanceState;

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
            events = new java.util.ArrayList<InstanceStatusEvent>();
        }
        return events;
    }
    
    /**
     * Events that affect the status of the associated Amazon EC2 instance.
     *
     * @param events Events that affect the status of the associated Amazon EC2 instance.
     */
    public void setEvents(java.util.Collection<InstanceStatusEvent> events) {
        java.util.List<InstanceStatusEvent> eventsCopy = new java.util.ArrayList<InstanceStatusEvent>();
        if (events != null) {
            eventsCopy.addAll(events);
        }
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
        if (getEvents() == null) setEvents(new java.util.ArrayList<InstanceStatusEvent>());
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
        java.util.List<InstanceStatusEvent> eventsCopy = new java.util.ArrayList<InstanceStatusEvent>();
        if (events != null) {
            eventsCopy.addAll(events);
        }
        this.events = eventsCopy;

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
        sb.append("InstanceId: " + instanceId + ", ");
        sb.append("AvailabilityZone: " + availabilityZone + ", ");
        sb.append("Events: " + events + ", ");
        sb.append("InstanceState: " + instanceState + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    