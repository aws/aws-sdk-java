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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateCapacityReservationRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCapacityReservationRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateCapacityReservationRequest> {

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     * <p>
     * Constraint: Maximum 64 ASCII characters.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The instance type for which to reserve capacity. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The type of operating system for which to reserve capacity.
     * </p>
     */
    private String instancePlatform;
    /**
     * <p>
     * The Availability Zone in which to create the Capacity Reservation.
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
     * The number of instances for which to reserve capacity.
     * </p>
     */
    private Integer instanceCount;
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
     * The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the reserved
     * capacity is released and you can no longer launch instances into it. The Capacity Reservation's state changes to
     * <code>expired</code> when it reaches its end date and time.
     * </p>
     * <p>
     * You must provide an <code>EndDate</code> value if <code>EndDateType</code> is <code>limited</code>. Omit
     * <code>EndDate</code> if <code>EndDateType</code> is <code>unlimited</code>.
     * </p>
     * <p>
     * If the <code>EndDateType</code> is <code>limited</code>, the Capacity Reservation is cancelled within an hour
     * from the specified time. For example, if you specify 5/31/2019, 13:30:55, the Capacity Reservation is guaranteed
     * to end between 13:30:55 and 14:30:55 on 5/31/2019.
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
     * <code>unlimited</code> - The Capacity Reservation remains active until you explicitly cancel it. Do not provide
     * an <code>EndDate</code> if the <code>EndDateType</code> is <code>unlimited</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>limited</code> - The Capacity Reservation expires automatically at a specified date and time. You must
     * provide an <code>EndDate</code> value if the <code>EndDateType</code> value is <code>limited</code>.
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
     * <code>open</code> - The Capacity Reservation automatically matches all instances that have matching attributes
     * (instance type, platform, and Availability Zone). Instances that have matching attributes run in the Capacity
     * Reservation automatically without specifying any additional parameters.
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
     * <p>
     * Default: <code>open</code>
     * </p>
     */
    private String instanceMatchCriteria;
    /**
     * <p>
     * The tags to apply to the Capacity Reservation during launch.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     * <p>
     * Constraint: Maximum 64 ASCII characters.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     *        Idempotency</a>.</p>
     *        <p>
     *        Constraint: Maximum 64 ASCII characters.
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
     * <p>
     * Constraint: Maximum 64 ASCII characters.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     *         Idempotency</a>.</p>
     *         <p>
     *         Constraint: Maximum 64 ASCII characters.
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
     * <p>
     * Constraint: Maximum 64 ASCII characters.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     *        Idempotency</a>.</p>
     *        <p>
     *        Constraint: Maximum 64 ASCII characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCapacityReservationRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The instance type for which to reserve capacity. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param instanceType
     *        The instance type for which to reserve capacity. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type for which to reserve capacity. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return The instance type for which to reserve capacity. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     *         <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type for which to reserve capacity. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param instanceType
     *        The instance type for which to reserve capacity. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCapacityReservationRequest withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The type of operating system for which to reserve capacity.
     * </p>
     * 
     * @param instancePlatform
     *        The type of operating system for which to reserve capacity.
     * @see CapacityReservationInstancePlatform
     */

    public void setInstancePlatform(String instancePlatform) {
        this.instancePlatform = instancePlatform;
    }

    /**
     * <p>
     * The type of operating system for which to reserve capacity.
     * </p>
     * 
     * @return The type of operating system for which to reserve capacity.
     * @see CapacityReservationInstancePlatform
     */

    public String getInstancePlatform() {
        return this.instancePlatform;
    }

    /**
     * <p>
     * The type of operating system for which to reserve capacity.
     * </p>
     * 
     * @param instancePlatform
     *        The type of operating system for which to reserve capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityReservationInstancePlatform
     */

    public CreateCapacityReservationRequest withInstancePlatform(String instancePlatform) {
        setInstancePlatform(instancePlatform);
        return this;
    }

    /**
     * <p>
     * The type of operating system for which to reserve capacity.
     * </p>
     * 
     * @param instancePlatform
     *        The type of operating system for which to reserve capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityReservationInstancePlatform
     */

    public CreateCapacityReservationRequest withInstancePlatform(CapacityReservationInstancePlatform instancePlatform) {
        this.instancePlatform = instancePlatform.toString();
        return this;
    }

    /**
     * <p>
     * The Availability Zone in which to create the Capacity Reservation.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which to create the Capacity Reservation.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which to create the Capacity Reservation.
     * </p>
     * 
     * @return The Availability Zone in which to create the Capacity Reservation.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which to create the Capacity Reservation.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which to create the Capacity Reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCapacityReservationRequest withAvailabilityZone(String availabilityZone) {
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

    public CreateCapacityReservationRequest withTenancy(String tenancy) {
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

    public CreateCapacityReservationRequest withTenancy(CapacityReservationTenancy tenancy) {
        this.tenancy = tenancy.toString();
        return this;
    }

    /**
     * <p>
     * The number of instances for which to reserve capacity.
     * </p>
     * 
     * @param instanceCount
     *        The number of instances for which to reserve capacity.
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of instances for which to reserve capacity.
     * </p>
     * 
     * @return The number of instances for which to reserve capacity.
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * The number of instances for which to reserve capacity.
     * </p>
     * 
     * @param instanceCount
     *        The number of instances for which to reserve capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCapacityReservationRequest withInstanceCount(Integer instanceCount) {
        setInstanceCount(instanceCount);
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

    public CreateCapacityReservationRequest withEbsOptimized(Boolean ebsOptimized) {
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

    public CreateCapacityReservationRequest withEphemeralStorage(Boolean ephemeralStorage) {
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
     * The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the reserved
     * capacity is released and you can no longer launch instances into it. The Capacity Reservation's state changes to
     * <code>expired</code> when it reaches its end date and time.
     * </p>
     * <p>
     * You must provide an <code>EndDate</code> value if <code>EndDateType</code> is <code>limited</code>. Omit
     * <code>EndDate</code> if <code>EndDateType</code> is <code>unlimited</code>.
     * </p>
     * <p>
     * If the <code>EndDateType</code> is <code>limited</code>, the Capacity Reservation is cancelled within an hour
     * from the specified time. For example, if you specify 5/31/2019, 13:30:55, the Capacity Reservation is guaranteed
     * to end between 13:30:55 and 14:30:55 on 5/31/2019.
     * </p>
     * 
     * @param endDate
     *        The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the
     *        reserved capacity is released and you can no longer launch instances into it. The Capacity Reservation's
     *        state changes to <code>expired</code> when it reaches its end date and time.</p>
     *        <p>
     *        You must provide an <code>EndDate</code> value if <code>EndDateType</code> is <code>limited</code>. Omit
     *        <code>EndDate</code> if <code>EndDateType</code> is <code>unlimited</code>.
     *        </p>
     *        <p>
     *        If the <code>EndDateType</code> is <code>limited</code>, the Capacity Reservation is cancelled within an
     *        hour from the specified time. For example, if you specify 5/31/2019, 13:30:55, the Capacity Reservation is
     *        guaranteed to end between 13:30:55 and 14:30:55 on 5/31/2019.
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
     * <p>
     * You must provide an <code>EndDate</code> value if <code>EndDateType</code> is <code>limited</code>. Omit
     * <code>EndDate</code> if <code>EndDateType</code> is <code>unlimited</code>.
     * </p>
     * <p>
     * If the <code>EndDateType</code> is <code>limited</code>, the Capacity Reservation is cancelled within an hour
     * from the specified time. For example, if you specify 5/31/2019, 13:30:55, the Capacity Reservation is guaranteed
     * to end between 13:30:55 and 14:30:55 on 5/31/2019.
     * </p>
     * 
     * @return The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the
     *         reserved capacity is released and you can no longer launch instances into it. The Capacity Reservation's
     *         state changes to <code>expired</code> when it reaches its end date and time.</p>
     *         <p>
     *         You must provide an <code>EndDate</code> value if <code>EndDateType</code> is <code>limited</code>. Omit
     *         <code>EndDate</code> if <code>EndDateType</code> is <code>unlimited</code>.
     *         </p>
     *         <p>
     *         If the <code>EndDateType</code> is <code>limited</code>, the Capacity Reservation is cancelled within an
     *         hour from the specified time. For example, if you specify 5/31/2019, 13:30:55, the Capacity Reservation
     *         is guaranteed to end between 13:30:55 and 14:30:55 on 5/31/2019.
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
     * <p>
     * You must provide an <code>EndDate</code> value if <code>EndDateType</code> is <code>limited</code>. Omit
     * <code>EndDate</code> if <code>EndDateType</code> is <code>unlimited</code>.
     * </p>
     * <p>
     * If the <code>EndDateType</code> is <code>limited</code>, the Capacity Reservation is cancelled within an hour
     * from the specified time. For example, if you specify 5/31/2019, 13:30:55, the Capacity Reservation is guaranteed
     * to end between 13:30:55 and 14:30:55 on 5/31/2019.
     * </p>
     * 
     * @param endDate
     *        The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the
     *        reserved capacity is released and you can no longer launch instances into it. The Capacity Reservation's
     *        state changes to <code>expired</code> when it reaches its end date and time.</p>
     *        <p>
     *        You must provide an <code>EndDate</code> value if <code>EndDateType</code> is <code>limited</code>. Omit
     *        <code>EndDate</code> if <code>EndDateType</code> is <code>unlimited</code>.
     *        </p>
     *        <p>
     *        If the <code>EndDateType</code> is <code>limited</code>, the Capacity Reservation is cancelled within an
     *        hour from the specified time. For example, if you specify 5/31/2019, 13:30:55, the Capacity Reservation is
     *        guaranteed to end between 13:30:55 and 14:30:55 on 5/31/2019.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCapacityReservationRequest withEndDate(java.util.Date endDate) {
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
     * <code>unlimited</code> - The Capacity Reservation remains active until you explicitly cancel it. Do not provide
     * an <code>EndDate</code> if the <code>EndDateType</code> is <code>unlimited</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>limited</code> - The Capacity Reservation expires automatically at a specified date and time. You must
     * provide an <code>EndDate</code> value if the <code>EndDateType</code> value is <code>limited</code>.
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
     *        <code>unlimited</code> - The Capacity Reservation remains active until you explicitly cancel it. Do not
     *        provide an <code>EndDate</code> if the <code>EndDateType</code> is <code>unlimited</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>limited</code> - The Capacity Reservation expires automatically at a specified date and time. You
     *        must provide an <code>EndDate</code> value if the <code>EndDateType</code> value is <code>limited</code>.
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
     * <code>unlimited</code> - The Capacity Reservation remains active until you explicitly cancel it. Do not provide
     * an <code>EndDate</code> if the <code>EndDateType</code> is <code>unlimited</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>limited</code> - The Capacity Reservation expires automatically at a specified date and time. You must
     * provide an <code>EndDate</code> value if the <code>EndDateType</code> value is <code>limited</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates the way in which the Capacity Reservation ends. A Capacity Reservation can have one of the
     *         following end types:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>unlimited</code> - The Capacity Reservation remains active until you explicitly cancel it. Do not
     *         provide an <code>EndDate</code> if the <code>EndDateType</code> is <code>unlimited</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>limited</code> - The Capacity Reservation expires automatically at a specified date and time. You
     *         must provide an <code>EndDate</code> value if the <code>EndDateType</code> value is <code>limited</code>.
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
     * <code>unlimited</code> - The Capacity Reservation remains active until you explicitly cancel it. Do not provide
     * an <code>EndDate</code> if the <code>EndDateType</code> is <code>unlimited</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>limited</code> - The Capacity Reservation expires automatically at a specified date and time. You must
     * provide an <code>EndDate</code> value if the <code>EndDateType</code> value is <code>limited</code>.
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
     *        <code>unlimited</code> - The Capacity Reservation remains active until you explicitly cancel it. Do not
     *        provide an <code>EndDate</code> if the <code>EndDateType</code> is <code>unlimited</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>limited</code> - The Capacity Reservation expires automatically at a specified date and time. You
     *        must provide an <code>EndDate</code> value if the <code>EndDateType</code> value is <code>limited</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndDateType
     */

    public CreateCapacityReservationRequest withEndDateType(String endDateType) {
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
     * <code>unlimited</code> - The Capacity Reservation remains active until you explicitly cancel it. Do not provide
     * an <code>EndDate</code> if the <code>EndDateType</code> is <code>unlimited</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>limited</code> - The Capacity Reservation expires automatically at a specified date and time. You must
     * provide an <code>EndDate</code> value if the <code>EndDateType</code> value is <code>limited</code>.
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
     *        <code>unlimited</code> - The Capacity Reservation remains active until you explicitly cancel it. Do not
     *        provide an <code>EndDate</code> if the <code>EndDateType</code> is <code>unlimited</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>limited</code> - The Capacity Reservation expires automatically at a specified date and time. You
     *        must provide an <code>EndDate</code> value if the <code>EndDateType</code> value is <code>limited</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndDateType
     */

    public CreateCapacityReservationRequest withEndDateType(EndDateType endDateType) {
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
     * <code>open</code> - The Capacity Reservation automatically matches all instances that have matching attributes
     * (instance type, platform, and Availability Zone). Instances that have matching attributes run in the Capacity
     * Reservation automatically without specifying any additional parameters.
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
     * <p>
     * Default: <code>open</code>
     * </p>
     * 
     * @param instanceMatchCriteria
     *        Indicates the type of instance launches that the Capacity Reservation accepts. The options include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>open</code> - The Capacity Reservation automatically matches all instances that have matching
     *        attributes (instance type, platform, and Availability Zone). Instances that have matching attributes run
     *        in the Capacity Reservation automatically without specifying any additional parameters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>targeted</code> - The Capacity Reservation only accepts instances that have matching attributes
     *        (instance type, platform, and Availability Zone), and explicitly target the Capacity Reservation. This
     *        ensures that only permitted instances can use the reserved capacity.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>open</code>
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
     * <code>open</code> - The Capacity Reservation automatically matches all instances that have matching attributes
     * (instance type, platform, and Availability Zone). Instances that have matching attributes run in the Capacity
     * Reservation automatically without specifying any additional parameters.
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
     * <p>
     * Default: <code>open</code>
     * </p>
     * 
     * @return Indicates the type of instance launches that the Capacity Reservation accepts. The options include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>open</code> - The Capacity Reservation automatically matches all instances that have matching
     *         attributes (instance type, platform, and Availability Zone). Instances that have matching attributes run
     *         in the Capacity Reservation automatically without specifying any additional parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>targeted</code> - The Capacity Reservation only accepts instances that have matching attributes
     *         (instance type, platform, and Availability Zone), and explicitly target the Capacity Reservation. This
     *         ensures that only permitted instances can use the reserved capacity.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: <code>open</code>
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
     * <code>open</code> - The Capacity Reservation automatically matches all instances that have matching attributes
     * (instance type, platform, and Availability Zone). Instances that have matching attributes run in the Capacity
     * Reservation automatically without specifying any additional parameters.
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
     * <p>
     * Default: <code>open</code>
     * </p>
     * 
     * @param instanceMatchCriteria
     *        Indicates the type of instance launches that the Capacity Reservation accepts. The options include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>open</code> - The Capacity Reservation automatically matches all instances that have matching
     *        attributes (instance type, platform, and Availability Zone). Instances that have matching attributes run
     *        in the Capacity Reservation automatically without specifying any additional parameters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>targeted</code> - The Capacity Reservation only accepts instances that have matching attributes
     *        (instance type, platform, and Availability Zone), and explicitly target the Capacity Reservation. This
     *        ensures that only permitted instances can use the reserved capacity.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>open</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceMatchCriteria
     */

    public CreateCapacityReservationRequest withInstanceMatchCriteria(String instanceMatchCriteria) {
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
     * <code>open</code> - The Capacity Reservation automatically matches all instances that have matching attributes
     * (instance type, platform, and Availability Zone). Instances that have matching attributes run in the Capacity
     * Reservation automatically without specifying any additional parameters.
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
     * <p>
     * Default: <code>open</code>
     * </p>
     * 
     * @param instanceMatchCriteria
     *        Indicates the type of instance launches that the Capacity Reservation accepts. The options include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>open</code> - The Capacity Reservation automatically matches all instances that have matching
     *        attributes (instance type, platform, and Availability Zone). Instances that have matching attributes run
     *        in the Capacity Reservation automatically without specifying any additional parameters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>targeted</code> - The Capacity Reservation only accepts instances that have matching attributes
     *        (instance type, platform, and Availability Zone), and explicitly target the Capacity Reservation. This
     *        ensures that only permitted instances can use the reserved capacity.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>open</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceMatchCriteria
     */

    public CreateCapacityReservationRequest withInstanceMatchCriteria(InstanceMatchCriteria instanceMatchCriteria) {
        this.instanceMatchCriteria = instanceMatchCriteria.toString();
        return this;
    }

    /**
     * <p>
     * The tags to apply to the Capacity Reservation during launch.
     * </p>
     * 
     * @return The tags to apply to the Capacity Reservation during launch.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to apply to the Capacity Reservation during launch.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the Capacity Reservation during launch.
     */

    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The tags to apply to the Capacity Reservation during launch.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the Capacity Reservation during launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCapacityReservationRequest withTagSpecifications(TagSpecification... tagSpecifications) {
        if (this.tagSpecifications == null) {
            setTagSpecifications(new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications.length));
        }
        for (TagSpecification ele : tagSpecifications) {
            this.tagSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply to the Capacity Reservation during launch.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the Capacity Reservation during launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCapacityReservationRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateCapacityReservationRequest> getDryRunRequest() {
        Request<CreateCapacityReservationRequest> request = new CreateCapacityReservationRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getInstancePlatform() != null)
            sb.append("InstancePlatform: ").append(getInstancePlatform()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getTenancy() != null)
            sb.append("Tenancy: ").append(getTenancy()).append(",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: ").append(getInstanceCount()).append(",");
        if (getEbsOptimized() != null)
            sb.append("EbsOptimized: ").append(getEbsOptimized()).append(",");
        if (getEphemeralStorage() != null)
            sb.append("EphemeralStorage: ").append(getEphemeralStorage()).append(",");
        if (getEndDate() != null)
            sb.append("EndDate: ").append(getEndDate()).append(",");
        if (getEndDateType() != null)
            sb.append("EndDateType: ").append(getEndDateType()).append(",");
        if (getInstanceMatchCriteria() != null)
            sb.append("InstanceMatchCriteria: ").append(getInstanceMatchCriteria()).append(",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: ").append(getTagSpecifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCapacityReservationRequest == false)
            return false;
        CreateCapacityReservationRequest other = (CreateCapacityReservationRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
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
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getEbsOptimized() == null ^ this.getEbsOptimized() == null)
            return false;
        if (other.getEbsOptimized() != null && other.getEbsOptimized().equals(this.getEbsOptimized()) == false)
            return false;
        if (other.getEphemeralStorage() == null ^ this.getEphemeralStorage() == null)
            return false;
        if (other.getEphemeralStorage() != null && other.getEphemeralStorage().equals(this.getEphemeralStorage()) == false)
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
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getInstancePlatform() == null) ? 0 : getInstancePlatform().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getTenancy() == null) ? 0 : getTenancy().hashCode());
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getEbsOptimized() == null) ? 0 : getEbsOptimized().hashCode());
        hashCode = prime * hashCode + ((getEphemeralStorage() == null) ? 0 : getEphemeralStorage().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        hashCode = prime * hashCode + ((getEndDateType() == null) ? 0 : getEndDateType().hashCode());
        hashCode = prime * hashCode + ((getInstanceMatchCriteria() == null) ? 0 : getInstanceMatchCriteria().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public CreateCapacityReservationRequest clone() {
        return (CreateCapacityReservationRequest) super.clone();
    }
}
