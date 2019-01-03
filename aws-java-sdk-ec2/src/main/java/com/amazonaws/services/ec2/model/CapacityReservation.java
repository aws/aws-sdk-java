/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes a Capacity Reservation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CapacityReservation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CapacityReservation implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     */
    private String capacityReservationId;
    /**
     * <p>
     * The type of instance for which the Capacity Reservation reserves capacity.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The type of operating system for which the Capacity Reservation reserves capacity.
     * </p>
     */
    private String instancePlatform;
    /**
     * <p>
     * The Availability Zone in which the capacity is reserved.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * Indicates the tenancy of the Capacity Reservation. A Capacity Reservation can have one of the following tenancy
     * settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>default</code> - The Capacity Reservation is created on hardware that is shared with other AWS accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dedicated</code> - The Capacity Reservation is created on single-tenant hardware that is dedicated to a
     * single AWS account.
     * </p>
     * </li>
     * </ul>
     */
    private String tenancy;
    /**
     * <p>
     * The number of instances for which the Capacity Reservation reserves capacity.
     * </p>
     */
    private Integer totalInstanceCount;
    /**
     * <p>
     * The remaining capacity. Indicates the number of instances that can be launched in the Capacity Reservation.
     * </p>
     */
    private Integer availableInstanceCount;
    /**
     * <p>
     * Indicates whether the Capacity Reservation supports EBS-optimized instances. This optimization provides dedicated
     * throughput to Amazon EBS and an optimized configuration stack to provide optimal I/O performance. This
     * optimization isn't available with all instance types. Additional usage charges apply when using an EBS- optimized
     * instance.
     * </p>
     */
    private Boolean ebsOptimized;
    /**
     * <p>
     * Indicates whether the Capacity Reservation supports instances with temporary, block-level storage.
     * </p>
     */
    private Boolean ephemeralStorage;
    /**
     * <p>
     * The current state of the Capacity Reservation. A Capacity Reservation can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - The Capacity Reservation is active and the capacity is available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled</code> - The Capacity Reservation expired automatically at the date and time specified in your
     * request. The reserved capacity is no longer available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The Capacity Reservation was manually cancelled. The reserved capacity is no longer
     * available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code> - The Capacity Reservation request was successful but the capacity provisioning is still
     * pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - The Capacity Reservation request has failed. A request might fail due to invalid request
     * parameters, capacity constraints, or instance limit constraints. Failed requests are retained for 60 minutes.
     * </p>
     * </li>
     * </ul>
     */
    private String state;
    /**
     * <p>
     * The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the reserved
     * capacity is released and you can no longer launch instances into it. The Capacity Reservation's state changes to
     * <code>expired</code> when it reaches its end date and time.
     * </p>
     */
    private java.util.Date endDate;
    /**
     * <p>
     * Indicates the way in which the Capacity Reservation ends. A Capacity Reservation can have one of the following
     * end types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>unlimited</code> - The Capacity Reservation remains active until you explicitly cancel it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>limited</code> - The Capacity Reservation expires automatically at a specified date and time.
     * </p>
     * </li>
     * </ul>
     */
    private String endDateType;
    /**
     * <p>
     * Indicates the type of instance launches that the Capacity Reservation accepts. The options include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>open</code> - The Capacity Reservation accepts all instances that have matching attributes (instance type,
     * platform, and Availability Zone). Instances that have matching attributes launch into the Capacity Reservation
     * automatically without specifying any additional parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>targeted</code> - The Capacity Reservation only accepts instances that have matching attributes (instance
     * type, platform, and Availability Zone), and explicitly target the Capacity Reservation. This ensures that only
     * permitted instances can use the reserved capacity.
     * </p>
     * </li>
     * </ul>
     */
    private String instanceMatchCriteria;
    /**
     * <p>
     * The date and time at which the Capacity Reservation was created.
     * </p>
     */
    private java.util.Date createDate;
    /**
     * <p>
     * Any tags assigned to the Capacity Reservation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     * 
     * @param capacityReservationId
     *        The ID of the Capacity Reservation.
     */

    public void setCapacityReservationId(String capacityReservationId) {
        this.capacityReservationId = capacityReservationId;
    }

    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     * 
     * @return The ID of the Capacity Reservation.
     */

    public String getCapacityReservationId() {
        return this.capacityReservationId;
    }

    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     * 
     * @param capacityReservationId
     *        The ID of the Capacity Reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityReservation withCapacityReservationId(String capacityReservationId) {
        setCapacityReservationId(capacityReservationId);
        return this;
    }

    /**
     * <p>
     * The type of instance for which the Capacity Reservation reserves capacity.
     * </p>
     * 
     * @param instanceType
     *        The type of instance for which the Capacity Reservation reserves capacity.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The type of instance for which the Capacity Reservation reserves capacity.
     * </p>
     * 
     * @return The type of instance for which the Capacity Reservation reserves capacity.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The type of instance for which the Capacity Reservation reserves capacity.
     * </p>
     * 
     * @param instanceType
     *        The type of instance for which the Capacity Reservation reserves capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityReservation withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The type of operating system for which the Capacity Reservation reserves capacity.
     * </p>
     * 
     * @param instancePlatform
     *        The type of operating system for which the Capacity Reservation reserves capacity.
     * @see CapacityReservationInstancePlatform
     */

    public void setInstancePlatform(String instancePlatform) {
        this.instancePlatform = instancePlatform;
    }

    /**
     * <p>
     * The type of operating system for which the Capacity Reservation reserves capacity.
     * </p>
     * 
     * @return The type of operating system for which the Capacity Reservation reserves capacity.
     * @see CapacityReservationInstancePlatform
     */

    public String getInstancePlatform() {
        return this.instancePlatform;
    }

    /**
     * <p>
     * The type of operating system for which the Capacity Reservation reserves capacity.
     * </p>
     * 
     * @param instancePlatform
     *        The type of operating system for which the Capacity Reservation reserves capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityReservationInstancePlatform
     */

    public CapacityReservation withInstancePlatform(String instancePlatform) {
        setInstancePlatform(instancePlatform);
        return this;
    }

    /**
     * <p>
     * The type of operating system for which the Capacity Reservation reserves capacity.
     * </p>
     * 
     * @param instancePlatform
     *        The type of operating system for which the Capacity Reservation reserves capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityReservationInstancePlatform
     */

    public CapacityReservation withInstancePlatform(CapacityReservationInstancePlatform instancePlatform) {
        this.instancePlatform = instancePlatform.toString();
        return this;
    }

    /**
     * <p>
     * The Availability Zone in which the capacity is reserved.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which the capacity is reserved.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the capacity is reserved.
     * </p>
     * 
     * @return The Availability Zone in which the capacity is reserved.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the capacity is reserved.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which the capacity is reserved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityReservation withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * Indicates the tenancy of the Capacity Reservation. A Capacity Reservation can have one of the following tenancy
     * settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>default</code> - The Capacity Reservation is created on hardware that is shared with other AWS accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dedicated</code> - The Capacity Reservation is created on single-tenant hardware that is dedicated to a
     * single AWS account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tenancy
     *        Indicates the tenancy of the Capacity Reservation. A Capacity Reservation can have one of the following
     *        tenancy settings:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>default</code> - The Capacity Reservation is created on hardware that is shared with other AWS
     *        accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dedicated</code> - The Capacity Reservation is created on single-tenant hardware that is dedicated
     *        to a single AWS account.
     *        </p>
     *        </li>
     * @see CapacityReservationTenancy
     */

    public void setTenancy(String tenancy) {
        this.tenancy = tenancy;
    }

    /**
     * <p>
     * Indicates the tenancy of the Capacity Reservation. A Capacity Reservation can have one of the following tenancy
     * settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>default</code> - The Capacity Reservation is created on hardware that is shared with other AWS accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dedicated</code> - The Capacity Reservation is created on single-tenant hardware that is dedicated to a
     * single AWS account.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates the tenancy of the Capacity Reservation. A Capacity Reservation can have one of the following
     *         tenancy settings:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>default</code> - The Capacity Reservation is created on hardware that is shared with other AWS
     *         accounts.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>dedicated</code> - The Capacity Reservation is created on single-tenant hardware that is dedicated
     *         to a single AWS account.
     *         </p>
     *         </li>
     * @see CapacityReservationTenancy
     */

    public String getTenancy() {
        return this.tenancy;
    }

    /**
     * <p>
     * Indicates the tenancy of the Capacity Reservation. A Capacity Reservation can have one of the following tenancy
     * settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>default</code> - The Capacity Reservation is created on hardware that is shared with other AWS accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dedicated</code> - The Capacity Reservation is created on single-tenant hardware that is dedicated to a
     * single AWS account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tenancy
     *        Indicates the tenancy of the Capacity Reservation. A Capacity Reservation can have one of the following
     *        tenancy settings:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>default</code> - The Capacity Reservation is created on hardware that is shared with other AWS
     *        accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dedicated</code> - The Capacity Reservation is created on single-tenant hardware that is dedicated
     *        to a single AWS account.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityReservationTenancy
     */

    public CapacityReservation withTenancy(String tenancy) {
        setTenancy(tenancy);
        return this;
    }

    /**
     * <p>
     * Indicates the tenancy of the Capacity Reservation. A Capacity Reservation can have one of the following tenancy
     * settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>default</code> - The Capacity Reservation is created on hardware that is shared with other AWS accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dedicated</code> - The Capacity Reservation is created on single-tenant hardware that is dedicated to a
     * single AWS account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tenancy
     *        Indicates the tenancy of the Capacity Reservation. A Capacity Reservation can have one of the following
     *        tenancy settings:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>default</code> - The Capacity Reservation is created on hardware that is shared with other AWS
     *        accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dedicated</code> - The Capacity Reservation is created on single-tenant hardware that is dedicated
     *        to a single AWS account.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityReservationTenancy
     */

    public CapacityReservation withTenancy(CapacityReservationTenancy tenancy) {
        this.tenancy = tenancy.toString();
        return this;
    }

    /**
     * <p>
     * The number of instances for which the Capacity Reservation reserves capacity.
     * </p>
     * 
     * @param totalInstanceCount
     *        The number of instances for which the Capacity Reservation reserves capacity.
     */

    public void setTotalInstanceCount(Integer totalInstanceCount) {
        this.totalInstanceCount = totalInstanceCount;
    }

    /**
     * <p>
     * The number of instances for which the Capacity Reservation reserves capacity.
     * </p>
     * 
     * @return The number of instances for which the Capacity Reservation reserves capacity.
     */

    public Integer getTotalInstanceCount() {
        return this.totalInstanceCount;
    }

    /**
     * <p>
     * The number of instances for which the Capacity Reservation reserves capacity.
     * </p>
     * 
     * @param totalInstanceCount
     *        The number of instances for which the Capacity Reservation reserves capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityReservation withTotalInstanceCount(Integer totalInstanceCount) {
        setTotalInstanceCount(totalInstanceCount);
        return this;
    }

    /**
     * <p>
     * The remaining capacity. Indicates the number of instances that can be launched in the Capacity Reservation.
     * </p>
     * 
     * @param availableInstanceCount
     *        The remaining capacity. Indicates the number of instances that can be launched in the Capacity
     *        Reservation.
     */

    public void setAvailableInstanceCount(Integer availableInstanceCount) {
        this.availableInstanceCount = availableInstanceCount;
    }

    /**
     * <p>
     * The remaining capacity. Indicates the number of instances that can be launched in the Capacity Reservation.
     * </p>
     * 
     * @return The remaining capacity. Indicates the number of instances that can be launched in the Capacity
     *         Reservation.
     */

    public Integer getAvailableInstanceCount() {
        return this.availableInstanceCount;
    }

    /**
     * <p>
     * The remaining capacity. Indicates the number of instances that can be launched in the Capacity Reservation.
     * </p>
     * 
     * @param availableInstanceCount
     *        The remaining capacity. Indicates the number of instances that can be launched in the Capacity
     *        Reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityReservation withAvailableInstanceCount(Integer availableInstanceCount) {
        setAvailableInstanceCount(availableInstanceCount);
        return this;
    }

    /**
     * <p>
     * Indicates whether the Capacity Reservation supports EBS-optimized instances. This optimization provides dedicated
     * throughput to Amazon EBS and an optimized configuration stack to provide optimal I/O performance. This
     * optimization isn't available with all instance types. Additional usage charges apply when using an EBS- optimized
     * instance.
     * </p>
     * 
     * @param ebsOptimized
     *        Indicates whether the Capacity Reservation supports EBS-optimized instances. This optimization provides
     *        dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal I/O
     *        performance. This optimization isn't available with all instance types. Additional usage charges apply
     *        when using an EBS- optimized instance.
     */

    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    /**
     * <p>
     * Indicates whether the Capacity Reservation supports EBS-optimized instances. This optimization provides dedicated
     * throughput to Amazon EBS and an optimized configuration stack to provide optimal I/O performance. This
     * optimization isn't available with all instance types. Additional usage charges apply when using an EBS- optimized
     * instance.
     * </p>
     * 
     * @return Indicates whether the Capacity Reservation supports EBS-optimized instances. This optimization provides
     *         dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal I/O
     *         performance. This optimization isn't available with all instance types. Additional usage charges apply
     *         when using an EBS- optimized instance.
     */

    public Boolean getEbsOptimized() {
        return this.ebsOptimized;
    }

    /**
     * <p>
     * Indicates whether the Capacity Reservation supports EBS-optimized instances. This optimization provides dedicated
     * throughput to Amazon EBS and an optimized configuration stack to provide optimal I/O performance. This
     * optimization isn't available with all instance types. Additional usage charges apply when using an EBS- optimized
     * instance.
     * </p>
     * 
     * @param ebsOptimized
     *        Indicates whether the Capacity Reservation supports EBS-optimized instances. This optimization provides
     *        dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal I/O
     *        performance. This optimization isn't available with all instance types. Additional usage charges apply
     *        when using an EBS- optimized instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityReservation withEbsOptimized(Boolean ebsOptimized) {
        setEbsOptimized(ebsOptimized);
        return this;
    }

    /**
     * <p>
     * Indicates whether the Capacity Reservation supports EBS-optimized instances. This optimization provides dedicated
     * throughput to Amazon EBS and an optimized configuration stack to provide optimal I/O performance. This
     * optimization isn't available with all instance types. Additional usage charges apply when using an EBS- optimized
     * instance.
     * </p>
     * 
     * @return Indicates whether the Capacity Reservation supports EBS-optimized instances. This optimization provides
     *         dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal I/O
     *         performance. This optimization isn't available with all instance types. Additional usage charges apply
     *         when using an EBS- optimized instance.
     */

    public Boolean isEbsOptimized() {
        return this.ebsOptimized;
    }

    /**
     * <p>
     * Indicates whether the Capacity Reservation supports instances with temporary, block-level storage.
     * </p>
     * 
     * @param ephemeralStorage
     *        Indicates whether the Capacity Reservation supports instances with temporary, block-level storage.
     */

    public void setEphemeralStorage(Boolean ephemeralStorage) {
        this.ephemeralStorage = ephemeralStorage;
    }

    /**
     * <p>
     * Indicates whether the Capacity Reservation supports instances with temporary, block-level storage.
     * </p>
     * 
     * @return Indicates whether the Capacity Reservation supports instances with temporary, block-level storage.
     */

    public Boolean getEphemeralStorage() {
        return this.ephemeralStorage;
    }

    /**
     * <p>
     * Indicates whether the Capacity Reservation supports instances with temporary, block-level storage.
     * </p>
     * 
     * @param ephemeralStorage
     *        Indicates whether the Capacity Reservation supports instances with temporary, block-level storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityReservation withEphemeralStorage(Boolean ephemeralStorage) {
        setEphemeralStorage(ephemeralStorage);
        return this;
    }

    /**
     * <p>
     * Indicates whether the Capacity Reservation supports instances with temporary, block-level storage.
     * </p>
     * 
     * @return Indicates whether the Capacity Reservation supports instances with temporary, block-level storage.
     */

    public Boolean isEphemeralStorage() {
        return this.ephemeralStorage;
    }

    /**
     * <p>
     * The current state of the Capacity Reservation. A Capacity Reservation can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - The Capacity Reservation is active and the capacity is available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled</code> - The Capacity Reservation expired automatically at the date and time specified in your
     * request. The reserved capacity is no longer available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The Capacity Reservation was manually cancelled. The reserved capacity is no longer
     * available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code> - The Capacity Reservation request was successful but the capacity provisioning is still
     * pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - The Capacity Reservation request has failed. A request might fail due to invalid request
     * parameters, capacity constraints, or instance limit constraints. Failed requests are retained for 60 minutes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The current state of the Capacity Reservation. A Capacity Reservation can be in one of the following
     *        states:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>active</code> - The Capacity Reservation is active and the capacity is available for your use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cancelled</code> - The Capacity Reservation expired automatically at the date and time specified in
     *        your request. The reserved capacity is no longer available for your use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>expired</code> - The Capacity Reservation was manually cancelled. The reserved capacity is no longer
     *        available for your use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code> - The Capacity Reservation request was successful but the capacity provisioning is
     *        still pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failed</code> - The Capacity Reservation request has failed. A request might fail due to invalid
     *        request parameters, capacity constraints, or instance limit constraints. Failed requests are retained for
     *        60 minutes.
     *        </p>
     *        </li>
     * @see CapacityReservationState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the Capacity Reservation. A Capacity Reservation can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - The Capacity Reservation is active and the capacity is available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled</code> - The Capacity Reservation expired automatically at the date and time specified in your
     * request. The reserved capacity is no longer available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The Capacity Reservation was manually cancelled. The reserved capacity is no longer
     * available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code> - The Capacity Reservation request was successful but the capacity provisioning is still
     * pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - The Capacity Reservation request has failed. A request might fail due to invalid request
     * parameters, capacity constraints, or instance limit constraints. Failed requests are retained for 60 minutes.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current state of the Capacity Reservation. A Capacity Reservation can be in one of the following
     *         states:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>active</code> - The Capacity Reservation is active and the capacity is available for your use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>cancelled</code> - The Capacity Reservation expired automatically at the date and time specified in
     *         your request. The reserved capacity is no longer available for your use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>expired</code> - The Capacity Reservation was manually cancelled. The reserved capacity is no
     *         longer available for your use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pending</code> - The Capacity Reservation request was successful but the capacity provisioning is
     *         still pending.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>failed</code> - The Capacity Reservation request has failed. A request might fail due to invalid
     *         request parameters, capacity constraints, or instance limit constraints. Failed requests are retained for
     *         60 minutes.
     *         </p>
     *         </li>
     * @see CapacityReservationState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the Capacity Reservation. A Capacity Reservation can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - The Capacity Reservation is active and the capacity is available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled</code> - The Capacity Reservation expired automatically at the date and time specified in your
     * request. The reserved capacity is no longer available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The Capacity Reservation was manually cancelled. The reserved capacity is no longer
     * available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code> - The Capacity Reservation request was successful but the capacity provisioning is still
     * pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - The Capacity Reservation request has failed. A request might fail due to invalid request
     * parameters, capacity constraints, or instance limit constraints. Failed requests are retained for 60 minutes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The current state of the Capacity Reservation. A Capacity Reservation can be in one of the following
     *        states:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>active</code> - The Capacity Reservation is active and the capacity is available for your use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cancelled</code> - The Capacity Reservation expired automatically at the date and time specified in
     *        your request. The reserved capacity is no longer available for your use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>expired</code> - The Capacity Reservation was manually cancelled. The reserved capacity is no longer
     *        available for your use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code> - The Capacity Reservation request was successful but the capacity provisioning is
     *        still pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failed</code> - The Capacity Reservation request has failed. A request might fail due to invalid
     *        request parameters, capacity constraints, or instance limit constraints. Failed requests are retained for
     *        60 minutes.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityReservationState
     */

    public CapacityReservation withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the Capacity Reservation. A Capacity Reservation can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - The Capacity Reservation is active and the capacity is available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled</code> - The Capacity Reservation expired automatically at the date and time specified in your
     * request. The reserved capacity is no longer available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The Capacity Reservation was manually cancelled. The reserved capacity is no longer
     * available for your use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code> - The Capacity Reservation request was successful but the capacity provisioning is still
     * pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - The Capacity Reservation request has failed. A request might fail due to invalid request
     * parameters, capacity constraints, or instance limit constraints. Failed requests are retained for 60 minutes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The current state of the Capacity Reservation. A Capacity Reservation can be in one of the following
     *        states:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>active</code> - The Capacity Reservation is active and the capacity is available for your use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cancelled</code> - The Capacity Reservation expired automatically at the date and time specified in
     *        your request. The reserved capacity is no longer available for your use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>expired</code> - The Capacity Reservation was manually cancelled. The reserved capacity is no longer
     *        available for your use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code> - The Capacity Reservation request was successful but the capacity provisioning is
     *        still pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failed</code> - The Capacity Reservation request has failed. A request might fail due to invalid
     *        request parameters, capacity constraints, or instance limit constraints. Failed requests are retained for
     *        60 minutes.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityReservationState
     */

    public CapacityReservation withState(CapacityReservationState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the reserved
     * capacity is released and you can no longer launch instances into it. The Capacity Reservation's state changes to
     * <code>expired</code> when it reaches its end date and time.
     * </p>
     * 
     * @param endDate
     *        The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the
     *        reserved capacity is released and you can no longer launch instances into it. The Capacity Reservation's
     *        state changes to <code>expired</code> when it reaches its end date and time.
     */

    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the reserved
     * capacity is released and you can no longer launch instances into it. The Capacity Reservation's state changes to
     * <code>expired</code> when it reaches its end date and time.
     * </p>
     * 
     * @return The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the
     *         reserved capacity is released and you can no longer launch instances into it. The Capacity Reservation's
     *         state changes to <code>expired</code> when it reaches its end date and time.
     */

    public java.util.Date getEndDate() {
        return this.endDate;
    }

    /**
     * <p>
     * The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the reserved
     * capacity is released and you can no longer launch instances into it. The Capacity Reservation's state changes to
     * <code>expired</code> when it reaches its end date and time.
     * </p>
     * 
     * @param endDate
     *        The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the
     *        reserved capacity is released and you can no longer launch instances into it. The Capacity Reservation's
     *        state changes to <code>expired</code> when it reaches its end date and time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityReservation withEndDate(java.util.Date endDate) {
        setEndDate(endDate);
        return this;
    }

    /**
     * <p>
     * Indicates the way in which the Capacity Reservation ends. A Capacity Reservation can have one of the following
     * end types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>unlimited</code> - The Capacity Reservation remains active until you explicitly cancel it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>limited</code> - The Capacity Reservation expires automatically at a specified date and time.
     * </p>
     * </li>
     * </ul>
     * 
     * @param endDateType
     *        Indicates the way in which the Capacity Reservation ends. A Capacity Reservation can have one of the
     *        following end types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>unlimited</code> - The Capacity Reservation remains active until you explicitly cancel it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>limited</code> - The Capacity Reservation expires automatically at a specified date and time.
     *        </p>
     *        </li>
     * @see EndDateType
     */

    public void setEndDateType(String endDateType) {
        this.endDateType = endDateType;
    }

    /**
     * <p>
     * Indicates the way in which the Capacity Reservation ends. A Capacity Reservation can have one of the following
     * end types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>unlimited</code> - The Capacity Reservation remains active until you explicitly cancel it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>limited</code> - The Capacity Reservation expires automatically at a specified date and time.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates the way in which the Capacity Reservation ends. A Capacity Reservation can have one of the
     *         following end types:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>unlimited</code> - The Capacity Reservation remains active until you explicitly cancel it.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>limited</code> - The Capacity Reservation expires automatically at a specified date and time.
     *         </p>
     *         </li>
     * @see EndDateType
     */

    public String getEndDateType() {
        return this.endDateType;
    }

    /**
     * <p>
     * Indicates the way in which the Capacity Reservation ends. A Capacity Reservation can have one of the following
     * end types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>unlimited</code> - The Capacity Reservation remains active until you explicitly cancel it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>limited</code> - The Capacity Reservation expires automatically at a specified date and time.
     * </p>
     * </li>
     * </ul>
     * 
     * @param endDateType
     *        Indicates the way in which the Capacity Reservation ends. A Capacity Reservation can have one of the
     *        following end types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>unlimited</code> - The Capacity Reservation remains active until you explicitly cancel it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>limited</code> - The Capacity Reservation expires automatically at a specified date and time.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndDateType
     */

    public CapacityReservation withEndDateType(String endDateType) {
        setEndDateType(endDateType);
        return this;
    }

    /**
     * <p>
     * Indicates the way in which the Capacity Reservation ends. A Capacity Reservation can have one of the following
     * end types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>unlimited</code> - The Capacity Reservation remains active until you explicitly cancel it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>limited</code> - The Capacity Reservation expires automatically at a specified date and time.
     * </p>
     * </li>
     * </ul>
     * 
     * @param endDateType
     *        Indicates the way in which the Capacity Reservation ends. A Capacity Reservation can have one of the
     *        following end types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>unlimited</code> - The Capacity Reservation remains active until you explicitly cancel it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>limited</code> - The Capacity Reservation expires automatically at a specified date and time.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndDateType
     */

    public CapacityReservation withEndDateType(EndDateType endDateType) {
        this.endDateType = endDateType.toString();
        return this;
    }

    /**
     * <p>
     * Indicates the type of instance launches that the Capacity Reservation accepts. The options include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>open</code> - The Capacity Reservation accepts all instances that have matching attributes (instance type,
     * platform, and Availability Zone). Instances that have matching attributes launch into the Capacity Reservation
     * automatically without specifying any additional parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>targeted</code> - The Capacity Reservation only accepts instances that have matching attributes (instance
     * type, platform, and Availability Zone), and explicitly target the Capacity Reservation. This ensures that only
     * permitted instances can use the reserved capacity.
     * </p>
     * </li>
     * </ul>
     * 
     * @param instanceMatchCriteria
     *        Indicates the type of instance launches that the Capacity Reservation accepts. The options include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>open</code> - The Capacity Reservation accepts all instances that have matching attributes (instance
     *        type, platform, and Availability Zone). Instances that have matching attributes launch into the Capacity
     *        Reservation automatically without specifying any additional parameters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>targeted</code> - The Capacity Reservation only accepts instances that have matching attributes
     *        (instance type, platform, and Availability Zone), and explicitly target the Capacity Reservation. This
     *        ensures that only permitted instances can use the reserved capacity.
     *        </p>
     *        </li>
     * @see InstanceMatchCriteria
     */

    public void setInstanceMatchCriteria(String instanceMatchCriteria) {
        this.instanceMatchCriteria = instanceMatchCriteria;
    }

    /**
     * <p>
     * Indicates the type of instance launches that the Capacity Reservation accepts. The options include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>open</code> - The Capacity Reservation accepts all instances that have matching attributes (instance type,
     * platform, and Availability Zone). Instances that have matching attributes launch into the Capacity Reservation
     * automatically without specifying any additional parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>targeted</code> - The Capacity Reservation only accepts instances that have matching attributes (instance
     * type, platform, and Availability Zone), and explicitly target the Capacity Reservation. This ensures that only
     * permitted instances can use the reserved capacity.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates the type of instance launches that the Capacity Reservation accepts. The options include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>open</code> - The Capacity Reservation accepts all instances that have matching attributes
     *         (instance type, platform, and Availability Zone). Instances that have matching attributes launch into the
     *         Capacity Reservation automatically without specifying any additional parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>targeted</code> - The Capacity Reservation only accepts instances that have matching attributes
     *         (instance type, platform, and Availability Zone), and explicitly target the Capacity Reservation. This
     *         ensures that only permitted instances can use the reserved capacity.
     *         </p>
     *         </li>
     * @see InstanceMatchCriteria
     */

    public String getInstanceMatchCriteria() {
        return this.instanceMatchCriteria;
    }

    /**
     * <p>
     * Indicates the type of instance launches that the Capacity Reservation accepts. The options include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>open</code> - The Capacity Reservation accepts all instances that have matching attributes (instance type,
     * platform, and Availability Zone). Instances that have matching attributes launch into the Capacity Reservation
     * automatically without specifying any additional parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>targeted</code> - The Capacity Reservation only accepts instances that have matching attributes (instance
     * type, platform, and Availability Zone), and explicitly target the Capacity Reservation. This ensures that only
     * permitted instances can use the reserved capacity.
     * </p>
     * </li>
     * </ul>
     * 
     * @param instanceMatchCriteria
     *        Indicates the type of instance launches that the Capacity Reservation accepts. The options include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>open</code> - The Capacity Reservation accepts all instances that have matching attributes (instance
     *        type, platform, and Availability Zone). Instances that have matching attributes launch into the Capacity
     *        Reservation automatically without specifying any additional parameters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>targeted</code> - The Capacity Reservation only accepts instances that have matching attributes
     *        (instance type, platform, and Availability Zone), and explicitly target the Capacity Reservation. This
     *        ensures that only permitted instances can use the reserved capacity.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceMatchCriteria
     */

    public CapacityReservation withInstanceMatchCriteria(String instanceMatchCriteria) {
        setInstanceMatchCriteria(instanceMatchCriteria);
        return this;
    }

    /**
     * <p>
     * Indicates the type of instance launches that the Capacity Reservation accepts. The options include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>open</code> - The Capacity Reservation accepts all instances that have matching attributes (instance type,
     * platform, and Availability Zone). Instances that have matching attributes launch into the Capacity Reservation
     * automatically without specifying any additional parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>targeted</code> - The Capacity Reservation only accepts instances that have matching attributes (instance
     * type, platform, and Availability Zone), and explicitly target the Capacity Reservation. This ensures that only
     * permitted instances can use the reserved capacity.
     * </p>
     * </li>
     * </ul>
     * 
     * @param instanceMatchCriteria
     *        Indicates the type of instance launches that the Capacity Reservation accepts. The options include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>open</code> - The Capacity Reservation accepts all instances that have matching attributes (instance
     *        type, platform, and Availability Zone). Instances that have matching attributes launch into the Capacity
     *        Reservation automatically without specifying any additional parameters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>targeted</code> - The Capacity Reservation only accepts instances that have matching attributes
     *        (instance type, platform, and Availability Zone), and explicitly target the Capacity Reservation. This
     *        ensures that only permitted instances can use the reserved capacity.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceMatchCriteria
     */

    public CapacityReservation withInstanceMatchCriteria(InstanceMatchCriteria instanceMatchCriteria) {
        this.instanceMatchCriteria = instanceMatchCriteria.toString();
        return this;
    }

    /**
     * <p>
     * The date and time at which the Capacity Reservation was created.
     * </p>
     * 
     * @param createDate
     *        The date and time at which the Capacity Reservation was created.
     */

    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date and time at which the Capacity Reservation was created.
     * </p>
     * 
     * @return The date and time at which the Capacity Reservation was created.
     */

    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * <p>
     * The date and time at which the Capacity Reservation was created.
     * </p>
     * 
     * @param createDate
     *        The date and time at which the Capacity Reservation was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityReservation withCreateDate(java.util.Date createDate) {
        setCreateDate(createDate);
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the Capacity Reservation.
     * </p>
     * 
     * @return Any tags assigned to the Capacity Reservation.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the Capacity Reservation.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the Capacity Reservation.
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
     * Any tags assigned to the Capacity Reservation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the Capacity Reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityReservation withTags(Tag... tags) {
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
     * Any tags assigned to the Capacity Reservation.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the Capacity Reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityReservation withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
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
        if (getCapacityReservationId() != null)
            sb.append("CapacityReservationId: ").append(getCapacityReservationId()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getInstancePlatform() != null)
            sb.append("InstancePlatform: ").append(getInstancePlatform()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getTenancy() != null)
            sb.append("Tenancy: ").append(getTenancy()).append(",");
        if (getTotalInstanceCount() != null)
            sb.append("TotalInstanceCount: ").append(getTotalInstanceCount()).append(",");
        if (getAvailableInstanceCount() != null)
            sb.append("AvailableInstanceCount: ").append(getAvailableInstanceCount()).append(",");
        if (getEbsOptimized() != null)
            sb.append("EbsOptimized: ").append(getEbsOptimized()).append(",");
        if (getEphemeralStorage() != null)
            sb.append("EphemeralStorage: ").append(getEphemeralStorage()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getEndDate() != null)
            sb.append("EndDate: ").append(getEndDate()).append(",");
        if (getEndDateType() != null)
            sb.append("EndDateType: ").append(getEndDateType()).append(",");
        if (getInstanceMatchCriteria() != null)
            sb.append("InstanceMatchCriteria: ").append(getInstanceMatchCriteria()).append(",");
        if (getCreateDate() != null)
            sb.append("CreateDate: ").append(getCreateDate()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CapacityReservation == false)
            return false;
        CapacityReservation other = (CapacityReservation) obj;
        if (other.getCapacityReservationId() == null ^ this.getCapacityReservationId() == null)
            return false;
        if (other.getCapacityReservationId() != null && other.getCapacityReservationId().equals(this.getCapacityReservationId()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getInstancePlatform() == null ^ this.getInstancePlatform() == null)
            return false;
        if (other.getInstancePlatform() != null && other.getInstancePlatform().equals(this.getInstancePlatform()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getTenancy() == null ^ this.getTenancy() == null)
            return false;
        if (other.getTenancy() != null && other.getTenancy().equals(this.getTenancy()) == false)
            return false;
        if (other.getTotalInstanceCount() == null ^ this.getTotalInstanceCount() == null)
            return false;
        if (other.getTotalInstanceCount() != null && other.getTotalInstanceCount().equals(this.getTotalInstanceCount()) == false)
            return false;
        if (other.getAvailableInstanceCount() == null ^ this.getAvailableInstanceCount() == null)
            return false;
        if (other.getAvailableInstanceCount() != null && other.getAvailableInstanceCount().equals(this.getAvailableInstanceCount()) == false)
            return false;
        if (other.getEbsOptimized() == null ^ this.getEbsOptimized() == null)
            return false;
        if (other.getEbsOptimized() != null && other.getEbsOptimized().equals(this.getEbsOptimized()) == false)
            return false;
        if (other.getEphemeralStorage() == null ^ this.getEphemeralStorage() == null)
            return false;
        if (other.getEphemeralStorage() != null && other.getEphemeralStorage().equals(this.getEphemeralStorage()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
            return false;
        if (other.getEndDateType() == null ^ this.getEndDateType() == null)
            return false;
        if (other.getEndDateType() != null && other.getEndDateType().equals(this.getEndDateType()) == false)
            return false;
        if (other.getInstanceMatchCriteria() == null ^ this.getInstanceMatchCriteria() == null)
            return false;
        if (other.getInstanceMatchCriteria() != null && other.getInstanceMatchCriteria().equals(this.getInstanceMatchCriteria()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapacityReservationId() == null) ? 0 : getCapacityReservationId().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getInstancePlatform() == null) ? 0 : getInstancePlatform().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getTenancy() == null) ? 0 : getTenancy().hashCode());
        hashCode = prime * hashCode + ((getTotalInstanceCount() == null) ? 0 : getTotalInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getAvailableInstanceCount() == null) ? 0 : getAvailableInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getEbsOptimized() == null) ? 0 : getEbsOptimized().hashCode());
        hashCode = prime * hashCode + ((getEphemeralStorage() == null) ? 0 : getEphemeralStorage().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        hashCode = prime * hashCode + ((getEndDateType() == null) ? 0 : getEndDateType().hashCode());
        hashCode = prime * hashCode + ((getInstanceMatchCriteria() == null) ? 0 : getInstanceMatchCriteria().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CapacityReservation clone() {
        try {
            return (CapacityReservation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
