/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the properties of the Dedicated Host.
 * </p>
 */
public class Host implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Dedicated Host.
     * </p>
     */
    private String hostId;
    /**
     * <p>
     * Whether auto-placement is on or off.
     * </p>
     */
    private String autoPlacement;
    /**
     * <p>
     * The reservation ID of the Dedicated Host. This returns a <code>null</code> response if the Dedicated Host doesn't
     * have an associated reservation.
     * </p>
     */
    private String hostReservationId;
    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The hardware specifications of the Dedicated Host.
     * </p>
     */
    private HostProperties hostProperties;
    /**
     * <p>
     * The Dedicated Host's state.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The Availability Zone of the Dedicated Host.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The IDs and instance type that are currently running on the Dedicated Host.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<HostInstance> instances;
    /**
     * <p>
     * The number of new instances that can be launched onto the Dedicated Host.
     * </p>
     */
    private AvailableCapacity availableCapacity;

    /**
     * <p>
     * The ID of the Dedicated Host.
     * </p>
     * 
     * @param hostId
     *        The ID of the Dedicated Host.
     */

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    /**
     * <p>
     * The ID of the Dedicated Host.
     * </p>
     * 
     * @return The ID of the Dedicated Host.
     */

    public String getHostId() {
        return this.hostId;
    }

    /**
     * <p>
     * The ID of the Dedicated Host.
     * </p>
     * 
     * @param hostId
     *        The ID of the Dedicated Host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Host withHostId(String hostId) {
        setHostId(hostId);
        return this;
    }

    /**
     * <p>
     * Whether auto-placement is on or off.
     * </p>
     * 
     * @param autoPlacement
     *        Whether auto-placement is on or off.
     * @see AutoPlacement
     */

    public void setAutoPlacement(String autoPlacement) {
        this.autoPlacement = autoPlacement;
    }

    /**
     * <p>
     * Whether auto-placement is on or off.
     * </p>
     * 
     * @return Whether auto-placement is on or off.
     * @see AutoPlacement
     */

    public String getAutoPlacement() {
        return this.autoPlacement;
    }

    /**
     * <p>
     * Whether auto-placement is on or off.
     * </p>
     * 
     * @param autoPlacement
     *        Whether auto-placement is on or off.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoPlacement
     */

    public Host withAutoPlacement(String autoPlacement) {
        setAutoPlacement(autoPlacement);
        return this;
    }

    /**
     * <p>
     * Whether auto-placement is on or off.
     * </p>
     * 
     * @param autoPlacement
     *        Whether auto-placement is on or off.
     * @see AutoPlacement
     */

    public void setAutoPlacement(AutoPlacement autoPlacement) {
        this.autoPlacement = autoPlacement.toString();
    }

    /**
     * <p>
     * Whether auto-placement is on or off.
     * </p>
     * 
     * @param autoPlacement
     *        Whether auto-placement is on or off.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoPlacement
     */

    public Host withAutoPlacement(AutoPlacement autoPlacement) {
        setAutoPlacement(autoPlacement);
        return this;
    }

    /**
     * <p>
     * The reservation ID of the Dedicated Host. This returns a <code>null</code> response if the Dedicated Host doesn't
     * have an associated reservation.
     * </p>
     * 
     * @param hostReservationId
     *        The reservation ID of the Dedicated Host. This returns a <code>null</code> response if the Dedicated Host
     *        doesn't have an associated reservation.
     */

    public void setHostReservationId(String hostReservationId) {
        this.hostReservationId = hostReservationId;
    }

    /**
     * <p>
     * The reservation ID of the Dedicated Host. This returns a <code>null</code> response if the Dedicated Host doesn't
     * have an associated reservation.
     * </p>
     * 
     * @return The reservation ID of the Dedicated Host. This returns a <code>null</code> response if the Dedicated Host
     *         doesn't have an associated reservation.
     */

    public String getHostReservationId() {
        return this.hostReservationId;
    }

    /**
     * <p>
     * The reservation ID of the Dedicated Host. This returns a <code>null</code> response if the Dedicated Host doesn't
     * have an associated reservation.
     * </p>
     * 
     * @param hostReservationId
     *        The reservation ID of the Dedicated Host. This returns a <code>null</code> response if the Dedicated Host
     *        doesn't have an associated reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Host withHostReservationId(String hostReservationId) {
        setHostReservationId(hostReservationId);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information,
     *        see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to
     *        Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information,
     *         see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to
     *         Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information,
     *        see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to
     *        Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Host withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The hardware specifications of the Dedicated Host.
     * </p>
     * 
     * @param hostProperties
     *        The hardware specifications of the Dedicated Host.
     */

    public void setHostProperties(HostProperties hostProperties) {
        this.hostProperties = hostProperties;
    }

    /**
     * <p>
     * The hardware specifications of the Dedicated Host.
     * </p>
     * 
     * @return The hardware specifications of the Dedicated Host.
     */

    public HostProperties getHostProperties() {
        return this.hostProperties;
    }

    /**
     * <p>
     * The hardware specifications of the Dedicated Host.
     * </p>
     * 
     * @param hostProperties
     *        The hardware specifications of the Dedicated Host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Host withHostProperties(HostProperties hostProperties) {
        setHostProperties(hostProperties);
        return this;
    }

    /**
     * <p>
     * The Dedicated Host's state.
     * </p>
     * 
     * @param state
     *        The Dedicated Host's state.
     * @see AllocationState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The Dedicated Host's state.
     * </p>
     * 
     * @return The Dedicated Host's state.
     * @see AllocationState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The Dedicated Host's state.
     * </p>
     * 
     * @param state
     *        The Dedicated Host's state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllocationState
     */

    public Host withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The Dedicated Host's state.
     * </p>
     * 
     * @param state
     *        The Dedicated Host's state.
     * @see AllocationState
     */

    public void setState(AllocationState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The Dedicated Host's state.
     * </p>
     * 
     * @param state
     *        The Dedicated Host's state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllocationState
     */

    public Host withState(AllocationState state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The Availability Zone of the Dedicated Host.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone of the Dedicated Host.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone of the Dedicated Host.
     * </p>
     * 
     * @return The Availability Zone of the Dedicated Host.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone of the Dedicated Host.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone of the Dedicated Host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Host withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The IDs and instance type that are currently running on the Dedicated Host.
     * </p>
     * 
     * @return The IDs and instance type that are currently running on the Dedicated Host.
     */

    public java.util.List<HostInstance> getInstances() {
        if (instances == null) {
            instances = new com.amazonaws.internal.SdkInternalList<HostInstance>();
        }
        return instances;
    }

    /**
     * <p>
     * The IDs and instance type that are currently running on the Dedicated Host.
     * </p>
     * 
     * @param instances
     *        The IDs and instance type that are currently running on the Dedicated Host.
     */

    public void setInstances(java.util.Collection<HostInstance> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }

        this.instances = new com.amazonaws.internal.SdkInternalList<HostInstance>(instances);
    }

    /**
     * <p>
     * The IDs and instance type that are currently running on the Dedicated Host.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstances(java.util.Collection)} or {@link #withInstances(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instances
     *        The IDs and instance type that are currently running on the Dedicated Host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Host withInstances(HostInstance... instances) {
        if (this.instances == null) {
            setInstances(new com.amazonaws.internal.SdkInternalList<HostInstance>(instances.length));
        }
        for (HostInstance ele : instances) {
            this.instances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs and instance type that are currently running on the Dedicated Host.
     * </p>
     * 
     * @param instances
     *        The IDs and instance type that are currently running on the Dedicated Host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Host withInstances(java.util.Collection<HostInstance> instances) {
        setInstances(instances);
        return this;
    }

    /**
     * <p>
     * The number of new instances that can be launched onto the Dedicated Host.
     * </p>
     * 
     * @param availableCapacity
     *        The number of new instances that can be launched onto the Dedicated Host.
     */

    public void setAvailableCapacity(AvailableCapacity availableCapacity) {
        this.availableCapacity = availableCapacity;
    }

    /**
     * <p>
     * The number of new instances that can be launched onto the Dedicated Host.
     * </p>
     * 
     * @return The number of new instances that can be launched onto the Dedicated Host.
     */

    public AvailableCapacity getAvailableCapacity() {
        return this.availableCapacity;
    }

    /**
     * <p>
     * The number of new instances that can be launched onto the Dedicated Host.
     * </p>
     * 
     * @param availableCapacity
     *        The number of new instances that can be launched onto the Dedicated Host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Host withAvailableCapacity(AvailableCapacity availableCapacity) {
        setAvailableCapacity(availableCapacity);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getHostId() != null)
            sb.append("HostId: " + getHostId() + ",");
        if (getAutoPlacement() != null)
            sb.append("AutoPlacement: " + getAutoPlacement() + ",");
        if (getHostReservationId() != null)
            sb.append("HostReservationId: " + getHostReservationId() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getHostProperties() != null)
            sb.append("HostProperties: " + getHostProperties() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getInstances() != null)
            sb.append("Instances: " + getInstances() + ",");
        if (getAvailableCapacity() != null)
            sb.append("AvailableCapacity: " + getAvailableCapacity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Host == false)
            return false;
        Host other = (Host) obj;
        if (other.getHostId() == null ^ this.getHostId() == null)
            return false;
        if (other.getHostId() != null && other.getHostId().equals(this.getHostId()) == false)
            return false;
        if (other.getAutoPlacement() == null ^ this.getAutoPlacement() == null)
            return false;
        if (other.getAutoPlacement() != null && other.getAutoPlacement().equals(this.getAutoPlacement()) == false)
            return false;
        if (other.getHostReservationId() == null ^ this.getHostReservationId() == null)
            return false;
        if (other.getHostReservationId() != null && other.getHostReservationId().equals(this.getHostReservationId()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getHostProperties() == null ^ this.getHostProperties() == null)
            return false;
        if (other.getHostProperties() != null && other.getHostProperties().equals(this.getHostProperties()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getInstances() == null ^ this.getInstances() == null)
            return false;
        if (other.getInstances() != null && other.getInstances().equals(this.getInstances()) == false)
            return false;
        if (other.getAvailableCapacity() == null ^ this.getAvailableCapacity() == null)
            return false;
        if (other.getAvailableCapacity() != null && other.getAvailableCapacity().equals(this.getAvailableCapacity()) == false)
            return false;
        return true;
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
    public Host clone() {
        try {
            return (Host) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
