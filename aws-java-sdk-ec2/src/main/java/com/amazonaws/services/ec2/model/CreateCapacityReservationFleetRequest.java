/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.CreateCapacityReservationFleetRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCapacityReservationFleetRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateCapacityReservationFleetRequest> {

    /**
     * <p>
     * The strategy used by the Capacity Reservation Fleet to determine which of the specified instance types to use.
     * Currently, only the <code>prioritized</code> allocation strategy is supported. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#allocation-strategy"> Allocation
     * strategy</a> in the Amazon EC2 User Guide.
     * </p>
     * <p>
     * Valid values: <code>prioritized</code>
     * </p>
     */
    private String allocationStrategy;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensure
     * Idempotency</a>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Information about the instance types for which to reserve the capacity.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ReservationFleetInstanceSpecification> instanceTypeSpecifications;
    /**
     * <p>
     * Indicates the tenancy of the Capacity Reservation Fleet. All Capacity Reservations in the Fleet inherit this
     * tenancy. The Capacity Reservation Fleet can have one of the following tenancy settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>default</code> - The Capacity Reservation Fleet is created on hardware that is shared with other Amazon Web
     * Services accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dedicated</code> - The Capacity Reservations are created on single-tenant hardware that is dedicated to a
     * single Amazon Web Services account.
     * </p>
     * </li>
     * </ul>
     */
    private String tenancy;
    /**
     * <p>
     * The total number of capacity units to be reserved by the Capacity Reservation Fleet. This value, together with
     * the instance type weights that you assign to each instance type used by the Fleet determine the number of
     * instances for which the Fleet reserves capacity. Both values are based on units that make sense for your
     * workload. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity"> Total target
     * capacity</a> in the Amazon EC2 User Guide.
     * </p>
     */
    private Integer totalTargetCapacity;
    /**
     * <p>
     * The date and time at which the Capacity Reservation Fleet expires. When the Capacity Reservation Fleet expires,
     * its state changes to <code>expired</code> and all of the Capacity Reservations in the Fleet expire.
     * </p>
     * <p>
     * The Capacity Reservation Fleet expires within an hour after the specified time. For example, if you specify
     * <code>5/31/2019</code>, <code>13:30:55</code>, the Capacity Reservation Fleet is guaranteed to expire between
     * <code>13:30:55</code> and <code>14:30:55</code> on <code>5/31/2019</code>.
     * </p>
     */
    private java.util.Date endDate;
    /**
     * <p>
     * Indicates the type of instance launches that the Capacity Reservation Fleet accepts. All Capacity Reservations in
     * the Fleet inherit this instance matching criteria.
     * </p>
     * <p>
     * Currently, Capacity Reservation Fleets support <code>open</code> instance matching criteria only. This means that
     * instances that have matching attributes (instance type, platform, and Availability Zone) run in the Capacity
     * Reservations automatically. Instances do not need to explicitly target a Capacity Reservation Fleet to use its
     * reserved capacity.
     * </p>
     */
    private String instanceMatchCriteria;
    /**
     * <p>
     * The tags to assign to the Capacity Reservation Fleet. The tags are automatically assigned to the Capacity
     * Reservations in the Fleet.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;

    /**
     * <p>
     * The strategy used by the Capacity Reservation Fleet to determine which of the specified instance types to use.
     * Currently, only the <code>prioritized</code> allocation strategy is supported. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#allocation-strategy"> Allocation
     * strategy</a> in the Amazon EC2 User Guide.
     * </p>
     * <p>
     * Valid values: <code>prioritized</code>
     * </p>
     * 
     * @param allocationStrategy
     *        The strategy used by the Capacity Reservation Fleet to determine which of the specified instance types to
     *        use. Currently, only the <code>prioritized</code> allocation strategy is supported. For more information,
     *        see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#allocation-strategy">
     *        Allocation strategy</a> in the Amazon EC2 User Guide.</p>
     *        <p>
     *        Valid values: <code>prioritized</code>
     */

    public void setAllocationStrategy(String allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
    }

    /**
     * <p>
     * The strategy used by the Capacity Reservation Fleet to determine which of the specified instance types to use.
     * Currently, only the <code>prioritized</code> allocation strategy is supported. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#allocation-strategy"> Allocation
     * strategy</a> in the Amazon EC2 User Guide.
     * </p>
     * <p>
     * Valid values: <code>prioritized</code>
     * </p>
     * 
     * @return The strategy used by the Capacity Reservation Fleet to determine which of the specified instance types to
     *         use. Currently, only the <code>prioritized</code> allocation strategy is supported. For more information,
     *         see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#allocation-strategy">
     *         Allocation strategy</a> in the Amazon EC2 User Guide.</p>
     *         <p>
     *         Valid values: <code>prioritized</code>
     */

    public String getAllocationStrategy() {
        return this.allocationStrategy;
    }

    /**
     * <p>
     * The strategy used by the Capacity Reservation Fleet to determine which of the specified instance types to use.
     * Currently, only the <code>prioritized</code> allocation strategy is supported. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#allocation-strategy"> Allocation
     * strategy</a> in the Amazon EC2 User Guide.
     * </p>
     * <p>
     * Valid values: <code>prioritized</code>
     * </p>
     * 
     * @param allocationStrategy
     *        The strategy used by the Capacity Reservation Fleet to determine which of the specified instance types to
     *        use. Currently, only the <code>prioritized</code> allocation strategy is supported. For more information,
     *        see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#allocation-strategy">
     *        Allocation strategy</a> in the Amazon EC2 User Guide.</p>
     *        <p>
     *        Valid values: <code>prioritized</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCapacityReservationFleetRequest withAllocationStrategy(String allocationStrategy) {
        setAllocationStrategy(allocationStrategy);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensure
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensure
     *        Idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensure
     * Idempotency</a>.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensure
     *         Idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensure
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensure
     *        Idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCapacityReservationFleetRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Information about the instance types for which to reserve the capacity.
     * </p>
     * 
     * @return Information about the instance types for which to reserve the capacity.
     */

    public java.util.List<ReservationFleetInstanceSpecification> getInstanceTypeSpecifications() {
        if (instanceTypeSpecifications == null) {
            instanceTypeSpecifications = new com.amazonaws.internal.SdkInternalList<ReservationFleetInstanceSpecification>();
        }
        return instanceTypeSpecifications;
    }

    /**
     * <p>
     * Information about the instance types for which to reserve the capacity.
     * </p>
     * 
     * @param instanceTypeSpecifications
     *        Information about the instance types for which to reserve the capacity.
     */

    public void setInstanceTypeSpecifications(java.util.Collection<ReservationFleetInstanceSpecification> instanceTypeSpecifications) {
        if (instanceTypeSpecifications == null) {
            this.instanceTypeSpecifications = null;
            return;
        }

        this.instanceTypeSpecifications = new com.amazonaws.internal.SdkInternalList<ReservationFleetInstanceSpecification>(instanceTypeSpecifications);
    }

    /**
     * <p>
     * Information about the instance types for which to reserve the capacity.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceTypeSpecifications(java.util.Collection)} or
     * {@link #withInstanceTypeSpecifications(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param instanceTypeSpecifications
     *        Information about the instance types for which to reserve the capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCapacityReservationFleetRequest withInstanceTypeSpecifications(ReservationFleetInstanceSpecification... instanceTypeSpecifications) {
        if (this.instanceTypeSpecifications == null) {
            setInstanceTypeSpecifications(new com.amazonaws.internal.SdkInternalList<ReservationFleetInstanceSpecification>(instanceTypeSpecifications.length));
        }
        for (ReservationFleetInstanceSpecification ele : instanceTypeSpecifications) {
            this.instanceTypeSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the instance types for which to reserve the capacity.
     * </p>
     * 
     * @param instanceTypeSpecifications
     *        Information about the instance types for which to reserve the capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCapacityReservationFleetRequest withInstanceTypeSpecifications(
            java.util.Collection<ReservationFleetInstanceSpecification> instanceTypeSpecifications) {
        setInstanceTypeSpecifications(instanceTypeSpecifications);
        return this;
    }

    /**
     * <p>
     * Indicates the tenancy of the Capacity Reservation Fleet. All Capacity Reservations in the Fleet inherit this
     * tenancy. The Capacity Reservation Fleet can have one of the following tenancy settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>default</code> - The Capacity Reservation Fleet is created on hardware that is shared with other Amazon Web
     * Services accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dedicated</code> - The Capacity Reservations are created on single-tenant hardware that is dedicated to a
     * single Amazon Web Services account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tenancy
     *        Indicates the tenancy of the Capacity Reservation Fleet. All Capacity Reservations in the Fleet inherit
     *        this tenancy. The Capacity Reservation Fleet can have one of the following tenancy settings:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>default</code> - The Capacity Reservation Fleet is created on hardware that is shared with other
     *        Amazon Web Services accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dedicated</code> - The Capacity Reservations are created on single-tenant hardware that is dedicated
     *        to a single Amazon Web Services account.
     *        </p>
     *        </li>
     * @see FleetCapacityReservationTenancy
     */

    public void setTenancy(String tenancy) {
        this.tenancy = tenancy;
    }

    /**
     * <p>
     * Indicates the tenancy of the Capacity Reservation Fleet. All Capacity Reservations in the Fleet inherit this
     * tenancy. The Capacity Reservation Fleet can have one of the following tenancy settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>default</code> - The Capacity Reservation Fleet is created on hardware that is shared with other Amazon Web
     * Services accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dedicated</code> - The Capacity Reservations are created on single-tenant hardware that is dedicated to a
     * single Amazon Web Services account.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates the tenancy of the Capacity Reservation Fleet. All Capacity Reservations in the Fleet inherit
     *         this tenancy. The Capacity Reservation Fleet can have one of the following tenancy settings:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>default</code> - The Capacity Reservation Fleet is created on hardware that is shared with other
     *         Amazon Web Services accounts.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>dedicated</code> - The Capacity Reservations are created on single-tenant hardware that is
     *         dedicated to a single Amazon Web Services account.
     *         </p>
     *         </li>
     * @see FleetCapacityReservationTenancy
     */

    public String getTenancy() {
        return this.tenancy;
    }

    /**
     * <p>
     * Indicates the tenancy of the Capacity Reservation Fleet. All Capacity Reservations in the Fleet inherit this
     * tenancy. The Capacity Reservation Fleet can have one of the following tenancy settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>default</code> - The Capacity Reservation Fleet is created on hardware that is shared with other Amazon Web
     * Services accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dedicated</code> - The Capacity Reservations are created on single-tenant hardware that is dedicated to a
     * single Amazon Web Services account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tenancy
     *        Indicates the tenancy of the Capacity Reservation Fleet. All Capacity Reservations in the Fleet inherit
     *        this tenancy. The Capacity Reservation Fleet can have one of the following tenancy settings:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>default</code> - The Capacity Reservation Fleet is created on hardware that is shared with other
     *        Amazon Web Services accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dedicated</code> - The Capacity Reservations are created on single-tenant hardware that is dedicated
     *        to a single Amazon Web Services account.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetCapacityReservationTenancy
     */

    public CreateCapacityReservationFleetRequest withTenancy(String tenancy) {
        setTenancy(tenancy);
        return this;
    }

    /**
     * <p>
     * Indicates the tenancy of the Capacity Reservation Fleet. All Capacity Reservations in the Fleet inherit this
     * tenancy. The Capacity Reservation Fleet can have one of the following tenancy settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>default</code> - The Capacity Reservation Fleet is created on hardware that is shared with other Amazon Web
     * Services accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dedicated</code> - The Capacity Reservations are created on single-tenant hardware that is dedicated to a
     * single Amazon Web Services account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tenancy
     *        Indicates the tenancy of the Capacity Reservation Fleet. All Capacity Reservations in the Fleet inherit
     *        this tenancy. The Capacity Reservation Fleet can have one of the following tenancy settings:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>default</code> - The Capacity Reservation Fleet is created on hardware that is shared with other
     *        Amazon Web Services accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dedicated</code> - The Capacity Reservations are created on single-tenant hardware that is dedicated
     *        to a single Amazon Web Services account.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetCapacityReservationTenancy
     */

    public CreateCapacityReservationFleetRequest withTenancy(FleetCapacityReservationTenancy tenancy) {
        this.tenancy = tenancy.toString();
        return this;
    }

    /**
     * <p>
     * The total number of capacity units to be reserved by the Capacity Reservation Fleet. This value, together with
     * the instance type weights that you assign to each instance type used by the Fleet determine the number of
     * instances for which the Fleet reserves capacity. Both values are based on units that make sense for your
     * workload. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity"> Total target
     * capacity</a> in the Amazon EC2 User Guide.
     * </p>
     * 
     * @param totalTargetCapacity
     *        The total number of capacity units to be reserved by the Capacity Reservation Fleet. This value, together
     *        with the instance type weights that you assign to each instance type used by the Fleet determine the
     *        number of instances for which the Fleet reserves capacity. Both values are based on units that make sense
     *        for your workload. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity"> Total
     *        target capacity</a> in the Amazon EC2 User Guide.
     */

    public void setTotalTargetCapacity(Integer totalTargetCapacity) {
        this.totalTargetCapacity = totalTargetCapacity;
    }

    /**
     * <p>
     * The total number of capacity units to be reserved by the Capacity Reservation Fleet. This value, together with
     * the instance type weights that you assign to each instance type used by the Fleet determine the number of
     * instances for which the Fleet reserves capacity. Both values are based on units that make sense for your
     * workload. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity"> Total target
     * capacity</a> in the Amazon EC2 User Guide.
     * </p>
     * 
     * @return The total number of capacity units to be reserved by the Capacity Reservation Fleet. This value, together
     *         with the instance type weights that you assign to each instance type used by the Fleet determine the
     *         number of instances for which the Fleet reserves capacity. Both values are based on units that make sense
     *         for your workload. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity"> Total
     *         target capacity</a> in the Amazon EC2 User Guide.
     */

    public Integer getTotalTargetCapacity() {
        return this.totalTargetCapacity;
    }

    /**
     * <p>
     * The total number of capacity units to be reserved by the Capacity Reservation Fleet. This value, together with
     * the instance type weights that you assign to each instance type used by the Fleet determine the number of
     * instances for which the Fleet reserves capacity. Both values are based on units that make sense for your
     * workload. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity"> Total target
     * capacity</a> in the Amazon EC2 User Guide.
     * </p>
     * 
     * @param totalTargetCapacity
     *        The total number of capacity units to be reserved by the Capacity Reservation Fleet. This value, together
     *        with the instance type weights that you assign to each instance type used by the Fleet determine the
     *        number of instances for which the Fleet reserves capacity. Both values are based on units that make sense
     *        for your workload. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity"> Total
     *        target capacity</a> in the Amazon EC2 User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCapacityReservationFleetRequest withTotalTargetCapacity(Integer totalTargetCapacity) {
        setTotalTargetCapacity(totalTargetCapacity);
        return this;
    }

    /**
     * <p>
     * The date and time at which the Capacity Reservation Fleet expires. When the Capacity Reservation Fleet expires,
     * its state changes to <code>expired</code> and all of the Capacity Reservations in the Fleet expire.
     * </p>
     * <p>
     * The Capacity Reservation Fleet expires within an hour after the specified time. For example, if you specify
     * <code>5/31/2019</code>, <code>13:30:55</code>, the Capacity Reservation Fleet is guaranteed to expire between
     * <code>13:30:55</code> and <code>14:30:55</code> on <code>5/31/2019</code>.
     * </p>
     * 
     * @param endDate
     *        The date and time at which the Capacity Reservation Fleet expires. When the Capacity Reservation Fleet
     *        expires, its state changes to <code>expired</code> and all of the Capacity Reservations in the Fleet
     *        expire.</p>
     *        <p>
     *        The Capacity Reservation Fleet expires within an hour after the specified time. For example, if you
     *        specify <code>5/31/2019</code>, <code>13:30:55</code>, the Capacity Reservation Fleet is guaranteed to
     *        expire between <code>13:30:55</code> and <code>14:30:55</code> on <code>5/31/2019</code>.
     */

    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * The date and time at which the Capacity Reservation Fleet expires. When the Capacity Reservation Fleet expires,
     * its state changes to <code>expired</code> and all of the Capacity Reservations in the Fleet expire.
     * </p>
     * <p>
     * The Capacity Reservation Fleet expires within an hour after the specified time. For example, if you specify
     * <code>5/31/2019</code>, <code>13:30:55</code>, the Capacity Reservation Fleet is guaranteed to expire between
     * <code>13:30:55</code> and <code>14:30:55</code> on <code>5/31/2019</code>.
     * </p>
     * 
     * @return The date and time at which the Capacity Reservation Fleet expires. When the Capacity Reservation Fleet
     *         expires, its state changes to <code>expired</code> and all of the Capacity Reservations in the Fleet
     *         expire.</p>
     *         <p>
     *         The Capacity Reservation Fleet expires within an hour after the specified time. For example, if you
     *         specify <code>5/31/2019</code>, <code>13:30:55</code>, the Capacity Reservation Fleet is guaranteed to
     *         expire between <code>13:30:55</code> and <code>14:30:55</code> on <code>5/31/2019</code>.
     */

    public java.util.Date getEndDate() {
        return this.endDate;
    }

    /**
     * <p>
     * The date and time at which the Capacity Reservation Fleet expires. When the Capacity Reservation Fleet expires,
     * its state changes to <code>expired</code> and all of the Capacity Reservations in the Fleet expire.
     * </p>
     * <p>
     * The Capacity Reservation Fleet expires within an hour after the specified time. For example, if you specify
     * <code>5/31/2019</code>, <code>13:30:55</code>, the Capacity Reservation Fleet is guaranteed to expire between
     * <code>13:30:55</code> and <code>14:30:55</code> on <code>5/31/2019</code>.
     * </p>
     * 
     * @param endDate
     *        The date and time at which the Capacity Reservation Fleet expires. When the Capacity Reservation Fleet
     *        expires, its state changes to <code>expired</code> and all of the Capacity Reservations in the Fleet
     *        expire.</p>
     *        <p>
     *        The Capacity Reservation Fleet expires within an hour after the specified time. For example, if you
     *        specify <code>5/31/2019</code>, <code>13:30:55</code>, the Capacity Reservation Fleet is guaranteed to
     *        expire between <code>13:30:55</code> and <code>14:30:55</code> on <code>5/31/2019</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCapacityReservationFleetRequest withEndDate(java.util.Date endDate) {
        setEndDate(endDate);
        return this;
    }

    /**
     * <p>
     * Indicates the type of instance launches that the Capacity Reservation Fleet accepts. All Capacity Reservations in
     * the Fleet inherit this instance matching criteria.
     * </p>
     * <p>
     * Currently, Capacity Reservation Fleets support <code>open</code> instance matching criteria only. This means that
     * instances that have matching attributes (instance type, platform, and Availability Zone) run in the Capacity
     * Reservations automatically. Instances do not need to explicitly target a Capacity Reservation Fleet to use its
     * reserved capacity.
     * </p>
     * 
     * @param instanceMatchCriteria
     *        Indicates the type of instance launches that the Capacity Reservation Fleet accepts. All Capacity
     *        Reservations in the Fleet inherit this instance matching criteria.</p>
     *        <p>
     *        Currently, Capacity Reservation Fleets support <code>open</code> instance matching criteria only. This
     *        means that instances that have matching attributes (instance type, platform, and Availability Zone) run in
     *        the Capacity Reservations automatically. Instances do not need to explicitly target a Capacity Reservation
     *        Fleet to use its reserved capacity.
     * @see FleetInstanceMatchCriteria
     */

    public void setInstanceMatchCriteria(String instanceMatchCriteria) {
        this.instanceMatchCriteria = instanceMatchCriteria;
    }

    /**
     * <p>
     * Indicates the type of instance launches that the Capacity Reservation Fleet accepts. All Capacity Reservations in
     * the Fleet inherit this instance matching criteria.
     * </p>
     * <p>
     * Currently, Capacity Reservation Fleets support <code>open</code> instance matching criteria only. This means that
     * instances that have matching attributes (instance type, platform, and Availability Zone) run in the Capacity
     * Reservations automatically. Instances do not need to explicitly target a Capacity Reservation Fleet to use its
     * reserved capacity.
     * </p>
     * 
     * @return Indicates the type of instance launches that the Capacity Reservation Fleet accepts. All Capacity
     *         Reservations in the Fleet inherit this instance matching criteria.</p>
     *         <p>
     *         Currently, Capacity Reservation Fleets support <code>open</code> instance matching criteria only. This
     *         means that instances that have matching attributes (instance type, platform, and Availability Zone) run
     *         in the Capacity Reservations automatically. Instances do not need to explicitly target a Capacity
     *         Reservation Fleet to use its reserved capacity.
     * @see FleetInstanceMatchCriteria
     */

    public String getInstanceMatchCriteria() {
        return this.instanceMatchCriteria;
    }

    /**
     * <p>
     * Indicates the type of instance launches that the Capacity Reservation Fleet accepts. All Capacity Reservations in
     * the Fleet inherit this instance matching criteria.
     * </p>
     * <p>
     * Currently, Capacity Reservation Fleets support <code>open</code> instance matching criteria only. This means that
     * instances that have matching attributes (instance type, platform, and Availability Zone) run in the Capacity
     * Reservations automatically. Instances do not need to explicitly target a Capacity Reservation Fleet to use its
     * reserved capacity.
     * </p>
     * 
     * @param instanceMatchCriteria
     *        Indicates the type of instance launches that the Capacity Reservation Fleet accepts. All Capacity
     *        Reservations in the Fleet inherit this instance matching criteria.</p>
     *        <p>
     *        Currently, Capacity Reservation Fleets support <code>open</code> instance matching criteria only. This
     *        means that instances that have matching attributes (instance type, platform, and Availability Zone) run in
     *        the Capacity Reservations automatically. Instances do not need to explicitly target a Capacity Reservation
     *        Fleet to use its reserved capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetInstanceMatchCriteria
     */

    public CreateCapacityReservationFleetRequest withInstanceMatchCriteria(String instanceMatchCriteria) {
        setInstanceMatchCriteria(instanceMatchCriteria);
        return this;
    }

    /**
     * <p>
     * Indicates the type of instance launches that the Capacity Reservation Fleet accepts. All Capacity Reservations in
     * the Fleet inherit this instance matching criteria.
     * </p>
     * <p>
     * Currently, Capacity Reservation Fleets support <code>open</code> instance matching criteria only. This means that
     * instances that have matching attributes (instance type, platform, and Availability Zone) run in the Capacity
     * Reservations automatically. Instances do not need to explicitly target a Capacity Reservation Fleet to use its
     * reserved capacity.
     * </p>
     * 
     * @param instanceMatchCriteria
     *        Indicates the type of instance launches that the Capacity Reservation Fleet accepts. All Capacity
     *        Reservations in the Fleet inherit this instance matching criteria.</p>
     *        <p>
     *        Currently, Capacity Reservation Fleets support <code>open</code> instance matching criteria only. This
     *        means that instances that have matching attributes (instance type, platform, and Availability Zone) run in
     *        the Capacity Reservations automatically. Instances do not need to explicitly target a Capacity Reservation
     *        Fleet to use its reserved capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetInstanceMatchCriteria
     */

    public CreateCapacityReservationFleetRequest withInstanceMatchCriteria(FleetInstanceMatchCriteria instanceMatchCriteria) {
        this.instanceMatchCriteria = instanceMatchCriteria.toString();
        return this;
    }

    /**
     * <p>
     * The tags to assign to the Capacity Reservation Fleet. The tags are automatically assigned to the Capacity
     * Reservations in the Fleet.
     * </p>
     * 
     * @return The tags to assign to the Capacity Reservation Fleet. The tags are automatically assigned to the Capacity
     *         Reservations in the Fleet.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to assign to the Capacity Reservation Fleet. The tags are automatically assigned to the Capacity
     * Reservations in the Fleet.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to assign to the Capacity Reservation Fleet. The tags are automatically assigned to the Capacity
     *        Reservations in the Fleet.
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
     * The tags to assign to the Capacity Reservation Fleet. The tags are automatically assigned to the Capacity
     * Reservations in the Fleet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to assign to the Capacity Reservation Fleet. The tags are automatically assigned to the Capacity
     *        Reservations in the Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCapacityReservationFleetRequest withTagSpecifications(TagSpecification... tagSpecifications) {
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
     * The tags to assign to the Capacity Reservation Fleet. The tags are automatically assigned to the Capacity
     * Reservations in the Fleet.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to assign to the Capacity Reservation Fleet. The tags are automatically assigned to the Capacity
     *        Reservations in the Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCapacityReservationFleetRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateCapacityReservationFleetRequest> getDryRunRequest() {
        Request<CreateCapacityReservationFleetRequest> request = new CreateCapacityReservationFleetRequestMarshaller().marshall(this);
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
        if (getAllocationStrategy() != null)
            sb.append("AllocationStrategy: ").append(getAllocationStrategy()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getInstanceTypeSpecifications() != null)
            sb.append("InstanceTypeSpecifications: ").append(getInstanceTypeSpecifications()).append(",");
        if (getTenancy() != null)
            sb.append("Tenancy: ").append(getTenancy()).append(",");
        if (getTotalTargetCapacity() != null)
            sb.append("TotalTargetCapacity: ").append(getTotalTargetCapacity()).append(",");
        if (getEndDate() != null)
            sb.append("EndDate: ").append(getEndDate()).append(",");
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

        if (obj instanceof CreateCapacityReservationFleetRequest == false)
            return false;
        CreateCapacityReservationFleetRequest other = (CreateCapacityReservationFleetRequest) obj;
        if (other.getAllocationStrategy() == null ^ this.getAllocationStrategy() == null)
            return false;
        if (other.getAllocationStrategy() != null && other.getAllocationStrategy().equals(this.getAllocationStrategy()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getInstanceTypeSpecifications() == null ^ this.getInstanceTypeSpecifications() == null)
            return false;
        if (other.getInstanceTypeSpecifications() != null && other.getInstanceTypeSpecifications().equals(this.getInstanceTypeSpecifications()) == false)
            return false;
        if (other.getTenancy() == null ^ this.getTenancy() == null)
            return false;
        if (other.getTenancy() != null && other.getTenancy().equals(this.getTenancy()) == false)
            return false;
        if (other.getTotalTargetCapacity() == null ^ this.getTotalTargetCapacity() == null)
            return false;
        if (other.getTotalTargetCapacity() != null && other.getTotalTargetCapacity().equals(this.getTotalTargetCapacity()) == false)
            return false;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
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

        hashCode = prime * hashCode + ((getAllocationStrategy() == null) ? 0 : getAllocationStrategy().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getInstanceTypeSpecifications() == null) ? 0 : getInstanceTypeSpecifications().hashCode());
        hashCode = prime * hashCode + ((getTenancy() == null) ? 0 : getTenancy().hashCode());
        hashCode = prime * hashCode + ((getTotalTargetCapacity() == null) ? 0 : getTotalTargetCapacity().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        hashCode = prime * hashCode + ((getInstanceMatchCriteria() == null) ? 0 : getInstanceMatchCriteria().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public CreateCapacityReservationFleetRequest clone() {
        return (CreateCapacityReservationFleetRequest) super.clone();
    }
}
