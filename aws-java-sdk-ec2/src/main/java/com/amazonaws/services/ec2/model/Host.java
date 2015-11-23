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
 * 
 */
public class Host implements Serializable, Cloneable {

    /**
     * The ID of the Dedicated host.
     */
    private String hostId;

    /**
     * Whether auto-placement is on or off.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     */
    private String autoPlacement;

    /**
     * The reservation ID of the Dedicated host. This returns a "null"
     * response if the Dedicated host doesn't have an associated reservation.
     */
    private String hostReservationId;

    /**
     * Unique, case-sensitive identifier you provide to ensure idempotency of
     * the request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     */
    private String clientToken;

    /**
     * The hardware specifications of the Dedicated host.
     */
    private HostProperties hostProperties;

    /**
     * The Dedicated host's state. Can be "available", "under assessment, or
     * "released".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, under-assessment, permanent-failure, released, released-permanent-failure
     */
    private String state;

    /**
     * The Availability Zone of the Dedicated host.
     */
    private String availabilityZone;

    /**
     * The IDs and instance type that are currently running on the Dedicated
     * host.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<HostInstance> instances;

    /**
     * The number of new instances that can be launched onto the Dedicated
     * host.
     */
    private AvailableCapacity availableCapacity;

    /**
     * The ID of the Dedicated host.
     *
     * @return The ID of the Dedicated host.
     */
    public String getHostId() {
        return hostId;
    }
    
    /**
     * The ID of the Dedicated host.
     *
     * @param hostId The ID of the Dedicated host.
     */
    public void setHostId(String hostId) {
        this.hostId = hostId;
    }
    
    /**
     * The ID of the Dedicated host.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hostId The ID of the Dedicated host.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Host withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * Whether auto-placement is on or off.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @return Whether auto-placement is on or off.
     *
     * @see AutoPlacement
     */
    public String getAutoPlacement() {
        return autoPlacement;
    }
    
    /**
     * Whether auto-placement is on or off.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @param autoPlacement Whether auto-placement is on or off.
     *
     * @see AutoPlacement
     */
    public void setAutoPlacement(String autoPlacement) {
        this.autoPlacement = autoPlacement;
    }
    
    /**
     * Whether auto-placement is on or off.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @param autoPlacement Whether auto-placement is on or off.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see AutoPlacement
     */
    public Host withAutoPlacement(String autoPlacement) {
        this.autoPlacement = autoPlacement;
        return this;
    }

    /**
     * Whether auto-placement is on or off.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @param autoPlacement Whether auto-placement is on or off.
     *
     * @see AutoPlacement
     */
    public void setAutoPlacement(AutoPlacement autoPlacement) {
        this.autoPlacement = autoPlacement.toString();
    }
    
    /**
     * Whether auto-placement is on or off.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @param autoPlacement Whether auto-placement is on or off.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see AutoPlacement
     */
    public Host withAutoPlacement(AutoPlacement autoPlacement) {
        this.autoPlacement = autoPlacement.toString();
        return this;
    }

    /**
     * The reservation ID of the Dedicated host. This returns a "null"
     * response if the Dedicated host doesn't have an associated reservation.
     *
     * @return The reservation ID of the Dedicated host. This returns a "null"
     *         response if the Dedicated host doesn't have an associated reservation.
     */
    public String getHostReservationId() {
        return hostReservationId;
    }
    
    /**
     * The reservation ID of the Dedicated host. This returns a "null"
     * response if the Dedicated host doesn't have an associated reservation.
     *
     * @param hostReservationId The reservation ID of the Dedicated host. This returns a "null"
     *         response if the Dedicated host doesn't have an associated reservation.
     */
    public void setHostReservationId(String hostReservationId) {
        this.hostReservationId = hostReservationId;
    }
    
    /**
     * The reservation ID of the Dedicated host. This returns a "null"
     * response if the Dedicated host doesn't have an associated reservation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hostReservationId The reservation ID of the Dedicated host. This returns a "null"
     *         response if the Dedicated host doesn't have an associated reservation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Host withHostReservationId(String hostReservationId) {
        this.hostReservationId = hostReservationId;
        return this;
    }

    /**
     * Unique, case-sensitive identifier you provide to ensure idempotency of
     * the request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     *
     * @return Unique, case-sensitive identifier you provide to ensure idempotency of
     *         the request. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     *         to Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     */
    public String getClientToken() {
        return clientToken;
    }
    
    /**
     * Unique, case-sensitive identifier you provide to ensure idempotency of
     * the request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     *
     * @param clientToken Unique, case-sensitive identifier you provide to ensure idempotency of
     *         the request. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     *         to Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }
    
    /**
     * Unique, case-sensitive identifier you provide to ensure idempotency of
     * the request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientToken Unique, case-sensitive identifier you provide to ensure idempotency of
     *         the request. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     *         to Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Host withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * The hardware specifications of the Dedicated host.
     *
     * @return The hardware specifications of the Dedicated host.
     */
    public HostProperties getHostProperties() {
        return hostProperties;
    }
    
    /**
     * The hardware specifications of the Dedicated host.
     *
     * @param hostProperties The hardware specifications of the Dedicated host.
     */
    public void setHostProperties(HostProperties hostProperties) {
        this.hostProperties = hostProperties;
    }
    
    /**
     * The hardware specifications of the Dedicated host.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hostProperties The hardware specifications of the Dedicated host.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Host withHostProperties(HostProperties hostProperties) {
        this.hostProperties = hostProperties;
        return this;
    }

    /**
     * The Dedicated host's state. Can be "available", "under assessment, or
     * "released".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, under-assessment, permanent-failure, released, released-permanent-failure
     *
     * @return The Dedicated host's state. Can be "available", "under assessment, or
     *         "released".
     *
     * @see AllocationState
     */
    public String getState() {
        return state;
    }
    
    /**
     * The Dedicated host's state. Can be "available", "under assessment, or
     * "released".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, under-assessment, permanent-failure, released, released-permanent-failure
     *
     * @param state The Dedicated host's state. Can be "available", "under assessment, or
     *         "released".
     *
     * @see AllocationState
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * The Dedicated host's state. Can be "available", "under assessment, or
     * "released".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, under-assessment, permanent-failure, released, released-permanent-failure
     *
     * @param state The Dedicated host's state. Can be "available", "under assessment, or
     *         "released".
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see AllocationState
     */
    public Host withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * The Dedicated host's state. Can be "available", "under assessment, or
     * "released".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, under-assessment, permanent-failure, released, released-permanent-failure
     *
     * @param state The Dedicated host's state. Can be "available", "under assessment, or
     *         "released".
     *
     * @see AllocationState
     */
    public void setState(AllocationState state) {
        this.state = state.toString();
    }
    
    /**
     * The Dedicated host's state. Can be "available", "under assessment, or
     * "released".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, under-assessment, permanent-failure, released, released-permanent-failure
     *
     * @param state The Dedicated host's state. Can be "available", "under assessment, or
     *         "released".
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see AllocationState
     */
    public Host withState(AllocationState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * The Availability Zone of the Dedicated host.
     *
     * @return The Availability Zone of the Dedicated host.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The Availability Zone of the Dedicated host.
     *
     * @param availabilityZone The Availability Zone of the Dedicated host.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The Availability Zone of the Dedicated host.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The Availability Zone of the Dedicated host.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Host withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * The IDs and instance type that are currently running on the Dedicated
     * host.
     *
     * @return The IDs and instance type that are currently running on the Dedicated
     *         host.
     */
    public java.util.List<HostInstance> getInstances() {
        if (instances == null) {
              instances = new com.amazonaws.internal.ListWithAutoConstructFlag<HostInstance>();
              instances.setAutoConstruct(true);
        }
        return instances;
    }
    
    /**
     * The IDs and instance type that are currently running on the Dedicated
     * host.
     *
     * @param instances The IDs and instance type that are currently running on the Dedicated
     *         host.
     */
    public void setInstances(java.util.Collection<HostInstance> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<HostInstance> instancesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<HostInstance>(instances.size());
        instancesCopy.addAll(instances);
        this.instances = instancesCopy;
    }
    
    /**
     * The IDs and instance type that are currently running on the Dedicated
     * host.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setInstances(java.util.Collection)} or {@link
     * #withInstances(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances The IDs and instance type that are currently running on the Dedicated
     *         host.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Host withInstances(HostInstance... instances) {
        if (getInstances() == null) setInstances(new java.util.ArrayList<HostInstance>(instances.length));
        for (HostInstance value : instances) {
            getInstances().add(value);
        }
        return this;
    }
    
    /**
     * The IDs and instance type that are currently running on the Dedicated
     * host.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances The IDs and instance type that are currently running on the Dedicated
     *         host.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Host withInstances(java.util.Collection<HostInstance> instances) {
        if (instances == null) {
            this.instances = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<HostInstance> instancesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<HostInstance>(instances.size());
            instancesCopy.addAll(instances);
            this.instances = instancesCopy;
        }

        return this;
    }

    /**
     * The number of new instances that can be launched onto the Dedicated
     * host.
     *
     * @return The number of new instances that can be launched onto the Dedicated
     *         host.
     */
    public AvailableCapacity getAvailableCapacity() {
        return availableCapacity;
    }
    
    /**
     * The number of new instances that can be launched onto the Dedicated
     * host.
     *
     * @param availableCapacity The number of new instances that can be launched onto the Dedicated
     *         host.
     */
    public void setAvailableCapacity(AvailableCapacity availableCapacity) {
        this.availableCapacity = availableCapacity;
    }
    
    /**
     * The number of new instances that can be launched onto the Dedicated
     * host.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availableCapacity The number of new instances that can be launched onto the Dedicated
     *         host.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Host withAvailableCapacity(AvailableCapacity availableCapacity) {
        this.availableCapacity = availableCapacity;
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
        if (getHostId() != null) sb.append("HostId: " + getHostId() + ",");
        if (getAutoPlacement() != null) sb.append("AutoPlacement: " + getAutoPlacement() + ",");
        if (getHostReservationId() != null) sb.append("HostReservationId: " + getHostReservationId() + ",");
        if (getClientToken() != null) sb.append("ClientToken: " + getClientToken() + ",");
        if (getHostProperties() != null) sb.append("HostProperties: " + getHostProperties() + ",");
        if (getState() != null) sb.append("State: " + getState() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getInstances() != null) sb.append("Instances: " + getInstances() + ",");
        if (getAvailableCapacity() != null) sb.append("AvailableCapacity: " + getAvailableCapacity() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getHostId() == null) ? 0 : getHostId().hashCode()); 
        hashCode = prime * hashCode + ((getAutoPlacement() == null) ? 0 : getAutoPlacement().hashCode()); 
        hashCode = prime * hashCode + ((getHostReservationId() == null) ? 0 : getHostReservationId().hashCode()); 
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode()); 
        hashCode = prime * hashCode + ((getHostProperties() == null) ? 0 : getHostProperties().hashCode()); 
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode()); 
        hashCode = prime * hashCode + ((getAvailableCapacity() == null) ? 0 : getAvailableCapacity().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Host == false) return false;
        Host other = (Host)obj;
        
        if (other.getHostId() == null ^ this.getHostId() == null) return false;
        if (other.getHostId() != null && other.getHostId().equals(this.getHostId()) == false) return false; 
        if (other.getAutoPlacement() == null ^ this.getAutoPlacement() == null) return false;
        if (other.getAutoPlacement() != null && other.getAutoPlacement().equals(this.getAutoPlacement()) == false) return false; 
        if (other.getHostReservationId() == null ^ this.getHostReservationId() == null) return false;
        if (other.getHostReservationId() != null && other.getHostReservationId().equals(this.getHostReservationId()) == false) return false; 
        if (other.getClientToken() == null ^ this.getClientToken() == null) return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false) return false; 
        if (other.getHostProperties() == null ^ this.getHostProperties() == null) return false;
        if (other.getHostProperties() != null && other.getHostProperties().equals(this.getHostProperties()) == false) return false; 
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getInstances() == null ^ this.getInstances() == null) return false;
        if (other.getInstances() != null && other.getInstances().equals(this.getInstances()) == false) return false; 
        if (other.getAvailableCapacity() == null ^ this.getAvailableCapacity() == null) return false;
        if (other.getAvailableCapacity() != null && other.getAvailableCapacity().equals(this.getAvailableCapacity()) == false) return false; 
        return true;
    }
    
    @Override
    public Host clone() {
        try {
            return (Host) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    