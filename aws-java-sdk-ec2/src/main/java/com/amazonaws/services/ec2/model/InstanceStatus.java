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
 * Describes the status of an instance.
 * </p>
 */
public class InstanceStatus implements Serializable {

    /**
     * The ID of the instance.
     */
    private String instanceId;

    /**
     * The Availability Zone of the instance.
     */
    private String availabilityZone;

    /**
     * Extra information regarding events associated with the instance.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<InstanceStatusEvent> events;

    /**
     * The intended state of the instance. <a>DescribeInstanceStatus</a>
     * requires that an instance be in the <code>running</code> state.
     */
    private InstanceState instanceState;

    /**
     * Reports impaired functionality that stems from issues related to the
     * systems that support an instance, such as hardware failures and
     * network connectivity problems.
     */
    private InstanceStatusSummary systemStatus;

    /**
     * Reports impaired functionality that stems from issues internal to the
     * instance, such as impaired reachability.
     */
    private InstanceStatusSummary instanceStatus;

    /**
     * The ID of the instance.
     *
     * @return The ID of the instance.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the instance.
     *
     * @param instanceId The ID of the instance.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceStatus withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * The Availability Zone of the instance.
     *
     * @return The Availability Zone of the instance.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The Availability Zone of the instance.
     *
     * @param availabilityZone The Availability Zone of the instance.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The Availability Zone of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The Availability Zone of the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceStatus withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * Extra information regarding events associated with the instance.
     *
     * @return Extra information regarding events associated with the instance.
     */
    public java.util.List<InstanceStatusEvent> getEvents() {
        if (events == null) {
              events = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceStatusEvent>();
              events.setAutoConstruct(true);
        }
        return events;
    }
    
    /**
     * Extra information regarding events associated with the instance.
     *
     * @param events Extra information regarding events associated with the instance.
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
     * Extra information regarding events associated with the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param events Extra information regarding events associated with the instance.
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
     * Extra information regarding events associated with the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param events Extra information regarding events associated with the instance.
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
     * The intended state of the instance. <a>DescribeInstanceStatus</a>
     * requires that an instance be in the <code>running</code> state.
     *
     * @return The intended state of the instance. <a>DescribeInstanceStatus</a>
     *         requires that an instance be in the <code>running</code> state.
     */
    public InstanceState getInstanceState() {
        return instanceState;
    }
    
    /**
     * The intended state of the instance. <a>DescribeInstanceStatus</a>
     * requires that an instance be in the <code>running</code> state.
     *
     * @param instanceState The intended state of the instance. <a>DescribeInstanceStatus</a>
     *         requires that an instance be in the <code>running</code> state.
     */
    public void setInstanceState(InstanceState instanceState) {
        this.instanceState = instanceState;
    }
    
    /**
     * The intended state of the instance. <a>DescribeInstanceStatus</a>
     * requires that an instance be in the <code>running</code> state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceState The intended state of the instance. <a>DescribeInstanceStatus</a>
     *         requires that an instance be in the <code>running</code> state.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceStatus withInstanceState(InstanceState instanceState) {
        this.instanceState = instanceState;
        return this;
    }

    /**
     * Reports impaired functionality that stems from issues related to the
     * systems that support an instance, such as hardware failures and
     * network connectivity problems.
     *
     * @return Reports impaired functionality that stems from issues related to the
     *         systems that support an instance, such as hardware failures and
     *         network connectivity problems.
     */
    public InstanceStatusSummary getSystemStatus() {
        return systemStatus;
    }
    
    /**
     * Reports impaired functionality that stems from issues related to the
     * systems that support an instance, such as hardware failures and
     * network connectivity problems.
     *
     * @param systemStatus Reports impaired functionality that stems from issues related to the
     *         systems that support an instance, such as hardware failures and
     *         network connectivity problems.
     */
    public void setSystemStatus(InstanceStatusSummary systemStatus) {
        this.systemStatus = systemStatus;
    }
    
    /**
     * Reports impaired functionality that stems from issues related to the
     * systems that support an instance, such as hardware failures and
     * network connectivity problems.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param systemStatus Reports impaired functionality that stems from issues related to the
     *         systems that support an instance, such as hardware failures and
     *         network connectivity problems.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceStatus withSystemStatus(InstanceStatusSummary systemStatus) {
        this.systemStatus = systemStatus;
        return this;
    }

    /**
     * Reports impaired functionality that stems from issues internal to the
     * instance, such as impaired reachability.
     *
     * @return Reports impaired functionality that stems from issues internal to the
     *         instance, such as impaired reachability.
     */
    public InstanceStatusSummary getInstanceStatus() {
        return instanceStatus;
    }
    
    /**
     * Reports impaired functionality that stems from issues internal to the
     * instance, such as impaired reachability.
     *
     * @param instanceStatus Reports impaired functionality that stems from issues internal to the
     *         instance, such as impaired reachability.
     */
    public void setInstanceStatus(InstanceStatusSummary instanceStatus) {
        this.instanceStatus = instanceStatus;
    }
    
    /**
     * Reports impaired functionality that stems from issues internal to the
     * instance, such as impaired reachability.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceStatus Reports impaired functionality that stems from issues internal to the
     *         instance, such as impaired reachability.
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
    