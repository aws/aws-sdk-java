/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import javax.annotation.Generated;

/**
 * <p>
 * Describes the properties of the Dedicated Host.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/Host" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Host implements Serializable, Cloneable {

    /**
     * <p>
     * Whether auto-placement is on or off.
     * </p>
     */
    private String autoPlacement;
    /**
     * <p>
     * The Availability Zone of the Dedicated Host.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * Information about the instances running on the Dedicated Host.
     * </p>
     */
    private AvailableCapacity availableCapacity;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The ID of the Dedicated Host.
     * </p>
     */
    private String hostId;
    /**
     * <p>
     * The hardware specifications of the Dedicated Host.
     * </p>
     */
    private HostProperties hostProperties;
    /**
     * <p>
     * The reservation ID of the Dedicated Host. This returns a <code>null</code> response if the Dedicated Host doesn't
     * have an associated reservation.
     * </p>
     */
    private String hostReservationId;
    /**
     * <p>
     * The IDs and instance type that are currently running on the Dedicated Host.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<HostInstance> instances;
    /**
     * <p>
     * The Dedicated Host's state.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The time that the Dedicated Host was allocated.
     * </p>
     */
    private java.util.Date allocationTime;
    /**
     * <p>
     * The time that the Dedicated Host was released.
     * </p>
     */
    private java.util.Date releaseTime;
    /**
     * <p>
     * Any tags assigned to the Dedicated Host.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * Indicates whether host recovery is enabled or disabled for the Dedicated Host.
     * </p>
     */
    private String hostRecovery;
    /**
     * <p>
     * Indicates whether the Dedicated Host supports multiple instance types of the same instance family, or a specific
     * instance type only. <code>one</code> indicates that the Dedicated Host supports multiple instance types in the
     * instance family. <code>off</code> indicates that the Dedicated Host supports a single instance type only.
     * </p>
     */
    private String allowsMultipleInstanceTypes;
    /**
     * <p>
     * The ID of the AWS account that owns the Dedicated Host.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The ID of the Availability Zone in which the Dedicated Host is allocated.
     * </p>
     */
    private String availabilityZoneId;
    /**
     * <p>
     * Indicates whether the Dedicated Host is in a host resource group. If <b>memberOfServiceLinkedResourceGroup</b> is
     * <code>true</code>, the host is in a host resource group; otherwise, it is not.
     * </p>
     */
    private Boolean memberOfServiceLinkedResourceGroup;

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
        withAutoPlacement(autoPlacement);
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
        this.autoPlacement = autoPlacement.toString();
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
     * Information about the instances running on the Dedicated Host.
     * </p>
     * 
     * @param availableCapacity
     *        Information about the instances running on the Dedicated Host.
     */

    public void setAvailableCapacity(AvailableCapacity availableCapacity) {
        this.availableCapacity = availableCapacity;
    }

    /**
     * <p>
     * Information about the instances running on the Dedicated Host.
     * </p>
     * 
     * @return Information about the instances running on the Dedicated Host.
     */

    public AvailableCapacity getAvailableCapacity() {
        return this.availableCapacity;
    }

    /**
     * <p>
     * Information about the instances running on the Dedicated Host.
     * </p>
     * 
     * @param availableCapacity
     *        Information about the instances running on the Dedicated Host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Host withAvailableCapacity(AvailableCapacity availableCapacity) {
        setAvailableCapacity(availableCapacity);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     *        Idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     *         Idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     *        Idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Host withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

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
        withState(state);
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
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The time that the Dedicated Host was allocated.
     * </p>
     * 
     * @param allocationTime
     *        The time that the Dedicated Host was allocated.
     */

    public void setAllocationTime(java.util.Date allocationTime) {
        this.allocationTime = allocationTime;
    }

    /**
     * <p>
     * The time that the Dedicated Host was allocated.
     * </p>
     * 
     * @return The time that the Dedicated Host was allocated.
     */

    public java.util.Date getAllocationTime() {
        return this.allocationTime;
    }

    /**
     * <p>
     * The time that the Dedicated Host was allocated.
     * </p>
     * 
     * @param allocationTime
     *        The time that the Dedicated Host was allocated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Host withAllocationTime(java.util.Date allocationTime) {
        setAllocationTime(allocationTime);
        return this;
    }

    /**
     * <p>
     * The time that the Dedicated Host was released.
     * </p>
     * 
     * @param releaseTime
     *        The time that the Dedicated Host was released.
     */

    public void setReleaseTime(java.util.Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    /**
     * <p>
     * The time that the Dedicated Host was released.
     * </p>
     * 
     * @return The time that the Dedicated Host was released.
     */

    public java.util.Date getReleaseTime() {
        return this.releaseTime;
    }

    /**
     * <p>
     * The time that the Dedicated Host was released.
     * </p>
     * 
     * @param releaseTime
     *        The time that the Dedicated Host was released.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Host withReleaseTime(java.util.Date releaseTime) {
        setReleaseTime(releaseTime);
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the Dedicated Host.
     * </p>
     * 
     * @return Any tags assigned to the Dedicated Host.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the Dedicated Host.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the Dedicated Host.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * Any tags assigned to the Dedicated Host.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the Dedicated Host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Host withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the Dedicated Host.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the Dedicated Host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Host withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Indicates whether host recovery is enabled or disabled for the Dedicated Host.
     * </p>
     * 
     * @param hostRecovery
     *        Indicates whether host recovery is enabled or disabled for the Dedicated Host.
     * @see HostRecovery
     */

    public void setHostRecovery(String hostRecovery) {
        this.hostRecovery = hostRecovery;
    }

    /**
     * <p>
     * Indicates whether host recovery is enabled or disabled for the Dedicated Host.
     * </p>
     * 
     * @return Indicates whether host recovery is enabled or disabled for the Dedicated Host.
     * @see HostRecovery
     */

    public String getHostRecovery() {
        return this.hostRecovery;
    }

    /**
     * <p>
     * Indicates whether host recovery is enabled or disabled for the Dedicated Host.
     * </p>
     * 
     * @param hostRecovery
     *        Indicates whether host recovery is enabled or disabled for the Dedicated Host.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HostRecovery
     */

    public Host withHostRecovery(String hostRecovery) {
        setHostRecovery(hostRecovery);
        return this;
    }

    /**
     * <p>
     * Indicates whether host recovery is enabled or disabled for the Dedicated Host.
     * </p>
     * 
     * @param hostRecovery
     *        Indicates whether host recovery is enabled or disabled for the Dedicated Host.
     * @see HostRecovery
     */

    public void setHostRecovery(HostRecovery hostRecovery) {
        withHostRecovery(hostRecovery);
    }

    /**
     * <p>
     * Indicates whether host recovery is enabled or disabled for the Dedicated Host.
     * </p>
     * 
     * @param hostRecovery
     *        Indicates whether host recovery is enabled or disabled for the Dedicated Host.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HostRecovery
     */

    public Host withHostRecovery(HostRecovery hostRecovery) {
        this.hostRecovery = hostRecovery.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether the Dedicated Host supports multiple instance types of the same instance family, or a specific
     * instance type only. <code>one</code> indicates that the Dedicated Host supports multiple instance types in the
     * instance family. <code>off</code> indicates that the Dedicated Host supports a single instance type only.
     * </p>
     * 
     * @param allowsMultipleInstanceTypes
     *        Indicates whether the Dedicated Host supports multiple instance types of the same instance family, or a
     *        specific instance type only. <code>one</code> indicates that the Dedicated Host supports multiple instance
     *        types in the instance family. <code>off</code> indicates that the Dedicated Host supports a single
     *        instance type only.
     * @see AllowsMultipleInstanceTypes
     */

    public void setAllowsMultipleInstanceTypes(String allowsMultipleInstanceTypes) {
        this.allowsMultipleInstanceTypes = allowsMultipleInstanceTypes;
    }

    /**
     * <p>
     * Indicates whether the Dedicated Host supports multiple instance types of the same instance family, or a specific
     * instance type only. <code>one</code> indicates that the Dedicated Host supports multiple instance types in the
     * instance family. <code>off</code> indicates that the Dedicated Host supports a single instance type only.
     * </p>
     * 
     * @return Indicates whether the Dedicated Host supports multiple instance types of the same instance family, or a
     *         specific instance type only. <code>one</code> indicates that the Dedicated Host supports multiple
     *         instance types in the instance family. <code>off</code> indicates that the Dedicated Host supports a
     *         single instance type only.
     * @see AllowsMultipleInstanceTypes
     */

    public String getAllowsMultipleInstanceTypes() {
        return this.allowsMultipleInstanceTypes;
    }

    /**
     * <p>
     * Indicates whether the Dedicated Host supports multiple instance types of the same instance family, or a specific
     * instance type only. <code>one</code> indicates that the Dedicated Host supports multiple instance types in the
     * instance family. <code>off</code> indicates that the Dedicated Host supports a single instance type only.
     * </p>
     * 
     * @param allowsMultipleInstanceTypes
     *        Indicates whether the Dedicated Host supports multiple instance types of the same instance family, or a
     *        specific instance type only. <code>one</code> indicates that the Dedicated Host supports multiple instance
     *        types in the instance family. <code>off</code> indicates that the Dedicated Host supports a single
     *        instance type only.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllowsMultipleInstanceTypes
     */

    public Host withAllowsMultipleInstanceTypes(String allowsMultipleInstanceTypes) {
        setAllowsMultipleInstanceTypes(allowsMultipleInstanceTypes);
        return this;
    }

    /**
     * <p>
     * Indicates whether the Dedicated Host supports multiple instance types of the same instance family, or a specific
     * instance type only. <code>one</code> indicates that the Dedicated Host supports multiple instance types in the
     * instance family. <code>off</code> indicates that the Dedicated Host supports a single instance type only.
     * </p>
     * 
     * @param allowsMultipleInstanceTypes
     *        Indicates whether the Dedicated Host supports multiple instance types of the same instance family, or a
     *        specific instance type only. <code>one</code> indicates that the Dedicated Host supports multiple instance
     *        types in the instance family. <code>off</code> indicates that the Dedicated Host supports a single
     *        instance type only.
     * @see AllowsMultipleInstanceTypes
     */

    public void setAllowsMultipleInstanceTypes(AllowsMultipleInstanceTypes allowsMultipleInstanceTypes) {
        withAllowsMultipleInstanceTypes(allowsMultipleInstanceTypes);
    }

    /**
     * <p>
     * Indicates whether the Dedicated Host supports multiple instance types of the same instance family, or a specific
     * instance type only. <code>one</code> indicates that the Dedicated Host supports multiple instance types in the
     * instance family. <code>off</code> indicates that the Dedicated Host supports a single instance type only.
     * </p>
     * 
     * @param allowsMultipleInstanceTypes
     *        Indicates whether the Dedicated Host supports multiple instance types of the same instance family, or a
     *        specific instance type only. <code>one</code> indicates that the Dedicated Host supports multiple instance
     *        types in the instance family. <code>off</code> indicates that the Dedicated Host supports a single
     *        instance type only.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllowsMultipleInstanceTypes
     */

    public Host withAllowsMultipleInstanceTypes(AllowsMultipleInstanceTypes allowsMultipleInstanceTypes) {
        this.allowsMultipleInstanceTypes = allowsMultipleInstanceTypes.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the Dedicated Host.
     * </p>
     * 
     * @param ownerId
     *        The ID of the AWS account that owns the Dedicated Host.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the Dedicated Host.
     * </p>
     * 
     * @return The ID of the AWS account that owns the Dedicated Host.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the Dedicated Host.
     * </p>
     * 
     * @param ownerId
     *        The ID of the AWS account that owns the Dedicated Host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Host withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The ID of the Availability Zone in which the Dedicated Host is allocated.
     * </p>
     * 
     * @param availabilityZoneId
     *        The ID of the Availability Zone in which the Dedicated Host is allocated.
     */

    public void setAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
    }

    /**
     * <p>
     * The ID of the Availability Zone in which the Dedicated Host is allocated.
     * </p>
     * 
     * @return The ID of the Availability Zone in which the Dedicated Host is allocated.
     */

    public String getAvailabilityZoneId() {
        return this.availabilityZoneId;
    }

    /**
     * <p>
     * The ID of the Availability Zone in which the Dedicated Host is allocated.
     * </p>
     * 
     * @param availabilityZoneId
     *        The ID of the Availability Zone in which the Dedicated Host is allocated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Host withAvailabilityZoneId(String availabilityZoneId) {
        setAvailabilityZoneId(availabilityZoneId);
        return this;
    }

    /**
     * <p>
     * Indicates whether the Dedicated Host is in a host resource group. If <b>memberOfServiceLinkedResourceGroup</b> is
     * <code>true</code>, the host is in a host resource group; otherwise, it is not.
     * </p>
     * 
     * @param memberOfServiceLinkedResourceGroup
     *        Indicates whether the Dedicated Host is in a host resource group. If
     *        <b>memberOfServiceLinkedResourceGroup</b> is <code>true</code>, the host is in a host resource group;
     *        otherwise, it is not.
     */

    public void setMemberOfServiceLinkedResourceGroup(Boolean memberOfServiceLinkedResourceGroup) {
        this.memberOfServiceLinkedResourceGroup = memberOfServiceLinkedResourceGroup;
    }

    /**
     * <p>
     * Indicates whether the Dedicated Host is in a host resource group. If <b>memberOfServiceLinkedResourceGroup</b> is
     * <code>true</code>, the host is in a host resource group; otherwise, it is not.
     * </p>
     * 
     * @return Indicates whether the Dedicated Host is in a host resource group. If
     *         <b>memberOfServiceLinkedResourceGroup</b> is <code>true</code>, the host is in a host resource group;
     *         otherwise, it is not.
     */

    public Boolean getMemberOfServiceLinkedResourceGroup() {
        return this.memberOfServiceLinkedResourceGroup;
    }

    /**
     * <p>
     * Indicates whether the Dedicated Host is in a host resource group. If <b>memberOfServiceLinkedResourceGroup</b> is
     * <code>true</code>, the host is in a host resource group; otherwise, it is not.
     * </p>
     * 
     * @param memberOfServiceLinkedResourceGroup
     *        Indicates whether the Dedicated Host is in a host resource group. If
     *        <b>memberOfServiceLinkedResourceGroup</b> is <code>true</code>, the host is in a host resource group;
     *        otherwise, it is not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Host withMemberOfServiceLinkedResourceGroup(Boolean memberOfServiceLinkedResourceGroup) {
        setMemberOfServiceLinkedResourceGroup(memberOfServiceLinkedResourceGroup);
        return this;
    }

    /**
     * <p>
     * Indicates whether the Dedicated Host is in a host resource group. If <b>memberOfServiceLinkedResourceGroup</b> is
     * <code>true</code>, the host is in a host resource group; otherwise, it is not.
     * </p>
     * 
     * @return Indicates whether the Dedicated Host is in a host resource group. If
     *         <b>memberOfServiceLinkedResourceGroup</b> is <code>true</code>, the host is in a host resource group;
     *         otherwise, it is not.
     */

    public Boolean isMemberOfServiceLinkedResourceGroup() {
        return this.memberOfServiceLinkedResourceGroup;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAutoPlacement() != null)
            sb.append("AutoPlacement: ").append(getAutoPlacement()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getAvailableCapacity() != null)
            sb.append("AvailableCapacity: ").append(getAvailableCapacity()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getHostId() != null)
            sb.append("HostId: ").append(getHostId()).append(",");
        if (getHostProperties() != null)
            sb.append("HostProperties: ").append(getHostProperties()).append(",");
        if (getHostReservationId() != null)
            sb.append("HostReservationId: ").append(getHostReservationId()).append(",");
        if (getInstances() != null)
            sb.append("Instances: ").append(getInstances()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getAllocationTime() != null)
            sb.append("AllocationTime: ").append(getAllocationTime()).append(",");
        if (getReleaseTime() != null)
            sb.append("ReleaseTime: ").append(getReleaseTime()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getHostRecovery() != null)
            sb.append("HostRecovery: ").append(getHostRecovery()).append(",");
        if (getAllowsMultipleInstanceTypes() != null)
            sb.append("AllowsMultipleInstanceTypes: ").append(getAllowsMultipleInstanceTypes()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getAvailabilityZoneId() != null)
            sb.append("AvailabilityZoneId: ").append(getAvailabilityZoneId()).append(",");
        if (getMemberOfServiceLinkedResourceGroup() != null)
            sb.append("MemberOfServiceLinkedResourceGroup: ").append(getMemberOfServiceLinkedResourceGroup());
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
        if (other.getAutoPlacement() == null ^ this.getAutoPlacement() == null)
            return false;
        if (other.getAutoPlacement() != null && other.getAutoPlacement().equals(this.getAutoPlacement()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getAvailableCapacity() == null ^ this.getAvailableCapacity() == null)
            return false;
        if (other.getAvailableCapacity() != null && other.getAvailableCapacity().equals(this.getAvailableCapacity()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getHostId() == null ^ this.getHostId() == null)
            return false;
        if (other.getHostId() != null && other.getHostId().equals(this.getHostId()) == false)
            return false;
        if (other.getHostProperties() == null ^ this.getHostProperties() == null)
            return false;
        if (other.getHostProperties() != null && other.getHostProperties().equals(this.getHostProperties()) == false)
            return false;
        if (other.getHostReservationId() == null ^ this.getHostReservationId() == null)
            return false;
        if (other.getHostReservationId() != null && other.getHostReservationId().equals(this.getHostReservationId()) == false)
            return false;
        if (other.getInstances() == null ^ this.getInstances() == null)
            return false;
        if (other.getInstances() != null && other.getInstances().equals(this.getInstances()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getAllocationTime() == null ^ this.getAllocationTime() == null)
            return false;
        if (other.getAllocationTime() != null && other.getAllocationTime().equals(this.getAllocationTime()) == false)
            return false;
        if (other.getReleaseTime() == null ^ this.getReleaseTime() == null)
            return false;
        if (other.getReleaseTime() != null && other.getReleaseTime().equals(this.getReleaseTime()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getHostRecovery() == null ^ this.getHostRecovery() == null)
            return false;
        if (other.getHostRecovery() != null && other.getHostRecovery().equals(this.getHostRecovery()) == false)
            return false;
        if (other.getAllowsMultipleInstanceTypes() == null ^ this.getAllowsMultipleInstanceTypes() == null)
            return false;
        if (other.getAllowsMultipleInstanceTypes() != null && other.getAllowsMultipleInstanceTypes().equals(this.getAllowsMultipleInstanceTypes()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getAvailabilityZoneId() == null ^ this.getAvailabilityZoneId() == null)
            return false;
        if (other.getAvailabilityZoneId() != null && other.getAvailabilityZoneId().equals(this.getAvailabilityZoneId()) == false)
            return false;
        if (other.getMemberOfServiceLinkedResourceGroup() == null ^ this.getMemberOfServiceLinkedResourceGroup() == null)
            return false;
        if (other.getMemberOfServiceLinkedResourceGroup() != null
                && other.getMemberOfServiceLinkedResourceGroup().equals(this.getMemberOfServiceLinkedResourceGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoPlacement() == null) ? 0 : getAutoPlacement().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getAvailableCapacity() == null) ? 0 : getAvailableCapacity().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getHostId() == null) ? 0 : getHostId().hashCode());
        hashCode = prime * hashCode + ((getHostProperties() == null) ? 0 : getHostProperties().hashCode());
        hashCode = prime * hashCode + ((getHostReservationId() == null) ? 0 : getHostReservationId().hashCode());
        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getAllocationTime() == null) ? 0 : getAllocationTime().hashCode());
        hashCode = prime * hashCode + ((getReleaseTime() == null) ? 0 : getReleaseTime().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getHostRecovery() == null) ? 0 : getHostRecovery().hashCode());
        hashCode = prime * hashCode + ((getAllowsMultipleInstanceTypes() == null) ? 0 : getAllowsMultipleInstanceTypes().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZoneId() == null) ? 0 : getAvailabilityZoneId().hashCode());
        hashCode = prime * hashCode + ((getMemberOfServiceLinkedResourceGroup() == null) ? 0 : getMemberOfServiceLinkedResourceGroup().hashCode());
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
