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

/**
 * <p>
 * Information about a Capacity Reservation Fleet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CapacityReservationFleet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CapacityReservationFleet implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Capacity Reservation Fleet.
     * </p>
     */
    private String capacityReservationFleetId;
    /**
     * <p>
     * The ARN of the Capacity Reservation Fleet.
     * </p>
     */
    private String capacityReservationFleetArn;
    /**
     * <p>
     * The state of the Capacity Reservation Fleet. Possible states include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>submitted</code> - The Capacity Reservation Fleet request has been submitted and Amazon Elastic Compute
     * Cloud is preparing to create the Capacity Reservations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modifying</code> - The Capacity Reservation Fleet is being modified. The Fleet remains in this state until
     * the modification is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>active</code> - The Capacity Reservation Fleet has fulfilled its total target capacity and it is attempting
     * to maintain this capacity. The Fleet remains in this state until it is modified or deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>partially_fulfilled</code> - The Capacity Reservation Fleet has partially fulfilled its total target
     * capacity. There is insufficient Amazon EC2 to fulfill the total target capacity. The Fleet is attempting to
     * asynchronously fulfill its total target capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expiring</code> - The Capacity Reservation Fleet has reach its end date and it is in the process of
     * expiring. One or more of its Capacity reservations might still be active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The Capacity Reservation Fleet has reach its end date. The Fleet and its Capacity
     * Reservations are expired. The Fleet can't create new Capacity Reservations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelling</code> - The Capacity Reservation Fleet is in the process of being cancelled. One or more of its
     * Capacity reservations might still be active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled</code> - The Capacity Reservation Fleet has been manually cancelled. The Fleet and its Capacity
     * Reservations are cancelled and the Fleet can't create new Capacity Reservations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - The Capacity Reservation Fleet failed to reserve capacity for the specified instance types.
     * </p>
     * </li>
     * </ul>
     */
    private String state;
    /**
     * <p>
     * The total number of capacity units for which the Capacity Reservation Fleet reserves capacity. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity">Total target
     * capacity</a> in the Amazon EC2 User Guide.
     * </p>
     */
    private Integer totalTargetCapacity;
    /**
     * <p>
     * The capacity units that have been fulfilled.
     * </p>
     */
    private Double totalFulfilledCapacity;
    /**
     * <p>
     * The tenancy of the Capacity Reservation Fleet. Tenancies include:
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
     * <code>dedicated</code> - The Capacity Reservation Fleet is created on single-tenant hardware that is dedicated to
     * a single Amazon Web Services account.
     * </p>
     * </li>
     * </ul>
     */
    private String tenancy;
    /**
     * <p>
     * The date and time at which the Capacity Reservation Fleet expires.
     * </p>
     */
    private java.util.Date endDate;
    /**
     * <p>
     * The date and time at which the Capacity Reservation Fleet was created.
     * </p>
     */
    private java.util.Date createTime;
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
     * The strategy used by the Capacity Reservation Fleet to determine which of the specified instance types to use.
     * For more information, see For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#allocation-strategy"> Allocation
     * strategy</a> in the Amazon EC2 User Guide.
     * </p>
     */
    private String allocationStrategy;
    /**
     * <p>
     * Information about the instance types for which to reserve the capacity.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<FleetCapacityReservation> instanceTypeSpecifications;
    /**
     * <p>
     * The tags assigned to the Capacity Reservation Fleet.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The ID of the Capacity Reservation Fleet.
     * </p>
     * 
     * @param capacityReservationFleetId
     *        The ID of the Capacity Reservation Fleet.
     */

    public void setCapacityReservationFleetId(String capacityReservationFleetId) {
        this.capacityReservationFleetId = capacityReservationFleetId;
    }

    /**
     * <p>
     * The ID of the Capacity Reservation Fleet.
     * </p>
     * 
     * @return The ID of the Capacity Reservation Fleet.
     */

    public String getCapacityReservationFleetId() {
        return this.capacityReservationFleetId;
    }

    /**
     * <p>
     * The ID of the Capacity Reservation Fleet.
     * </p>
     * 
     * @param capacityReservationFleetId
     *        The ID of the Capacity Reservation Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityReservationFleet withCapacityReservationFleetId(String capacityReservationFleetId) {
        setCapacityReservationFleetId(capacityReservationFleetId);
        return this;
    }

    /**
     * <p>
     * The ARN of the Capacity Reservation Fleet.
     * </p>
     * 
     * @param capacityReservationFleetArn
     *        The ARN of the Capacity Reservation Fleet.
     */

    public void setCapacityReservationFleetArn(String capacityReservationFleetArn) {
        this.capacityReservationFleetArn = capacityReservationFleetArn;
    }

    /**
     * <p>
     * The ARN of the Capacity Reservation Fleet.
     * </p>
     * 
     * @return The ARN of the Capacity Reservation Fleet.
     */

    public String getCapacityReservationFleetArn() {
        return this.capacityReservationFleetArn;
    }

    /**
     * <p>
     * The ARN of the Capacity Reservation Fleet.
     * </p>
     * 
     * @param capacityReservationFleetArn
     *        The ARN of the Capacity Reservation Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityReservationFleet withCapacityReservationFleetArn(String capacityReservationFleetArn) {
        setCapacityReservationFleetArn(capacityReservationFleetArn);
        return this;
    }

    /**
     * <p>
     * The state of the Capacity Reservation Fleet. Possible states include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>submitted</code> - The Capacity Reservation Fleet request has been submitted and Amazon Elastic Compute
     * Cloud is preparing to create the Capacity Reservations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modifying</code> - The Capacity Reservation Fleet is being modified. The Fleet remains in this state until
     * the modification is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>active</code> - The Capacity Reservation Fleet has fulfilled its total target capacity and it is attempting
     * to maintain this capacity. The Fleet remains in this state until it is modified or deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>partially_fulfilled</code> - The Capacity Reservation Fleet has partially fulfilled its total target
     * capacity. There is insufficient Amazon EC2 to fulfill the total target capacity. The Fleet is attempting to
     * asynchronously fulfill its total target capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expiring</code> - The Capacity Reservation Fleet has reach its end date and it is in the process of
     * expiring. One or more of its Capacity reservations might still be active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The Capacity Reservation Fleet has reach its end date. The Fleet and its Capacity
     * Reservations are expired. The Fleet can't create new Capacity Reservations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelling</code> - The Capacity Reservation Fleet is in the process of being cancelled. One or more of its
     * Capacity reservations might still be active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled</code> - The Capacity Reservation Fleet has been manually cancelled. The Fleet and its Capacity
     * Reservations are cancelled and the Fleet can't create new Capacity Reservations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - The Capacity Reservation Fleet failed to reserve capacity for the specified instance types.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The state of the Capacity Reservation Fleet. Possible states include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>submitted</code> - The Capacity Reservation Fleet request has been submitted and Amazon Elastic
     *        Compute Cloud is preparing to create the Capacity Reservations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modifying</code> - The Capacity Reservation Fleet is being modified. The Fleet remains in this state
     *        until the modification is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>active</code> - The Capacity Reservation Fleet has fulfilled its total target capacity and it is
     *        attempting to maintain this capacity. The Fleet remains in this state until it is modified or deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>partially_fulfilled</code> - The Capacity Reservation Fleet has partially fulfilled its total target
     *        capacity. There is insufficient Amazon EC2 to fulfill the total target capacity. The Fleet is attempting
     *        to asynchronously fulfill its total target capacity.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>expiring</code> - The Capacity Reservation Fleet has reach its end date and it is in the process of
     *        expiring. One or more of its Capacity reservations might still be active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>expired</code> - The Capacity Reservation Fleet has reach its end date. The Fleet and its Capacity
     *        Reservations are expired. The Fleet can't create new Capacity Reservations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cancelling</code> - The Capacity Reservation Fleet is in the process of being cancelled. One or more
     *        of its Capacity reservations might still be active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cancelled</code> - The Capacity Reservation Fleet has been manually cancelled. The Fleet and its
     *        Capacity Reservations are cancelled and the Fleet can't create new Capacity Reservations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failed</code> - The Capacity Reservation Fleet failed to reserve capacity for the specified instance
     *        types.
     *        </p>
     *        </li>
     * @see CapacityReservationFleetState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the Capacity Reservation Fleet. Possible states include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>submitted</code> - The Capacity Reservation Fleet request has been submitted and Amazon Elastic Compute
     * Cloud is preparing to create the Capacity Reservations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modifying</code> - The Capacity Reservation Fleet is being modified. The Fleet remains in this state until
     * the modification is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>active</code> - The Capacity Reservation Fleet has fulfilled its total target capacity and it is attempting
     * to maintain this capacity. The Fleet remains in this state until it is modified or deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>partially_fulfilled</code> - The Capacity Reservation Fleet has partially fulfilled its total target
     * capacity. There is insufficient Amazon EC2 to fulfill the total target capacity. The Fleet is attempting to
     * asynchronously fulfill its total target capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expiring</code> - The Capacity Reservation Fleet has reach its end date and it is in the process of
     * expiring. One or more of its Capacity reservations might still be active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The Capacity Reservation Fleet has reach its end date. The Fleet and its Capacity
     * Reservations are expired. The Fleet can't create new Capacity Reservations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelling</code> - The Capacity Reservation Fleet is in the process of being cancelled. One or more of its
     * Capacity reservations might still be active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled</code> - The Capacity Reservation Fleet has been manually cancelled. The Fleet and its Capacity
     * Reservations are cancelled and the Fleet can't create new Capacity Reservations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - The Capacity Reservation Fleet failed to reserve capacity for the specified instance types.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The state of the Capacity Reservation Fleet. Possible states include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>submitted</code> - The Capacity Reservation Fleet request has been submitted and Amazon Elastic
     *         Compute Cloud is preparing to create the Capacity Reservations.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>modifying</code> - The Capacity Reservation Fleet is being modified. The Fleet remains in this
     *         state until the modification is complete.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>active</code> - The Capacity Reservation Fleet has fulfilled its total target capacity and it is
     *         attempting to maintain this capacity. The Fleet remains in this state until it is modified or deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>partially_fulfilled</code> - The Capacity Reservation Fleet has partially fulfilled its total
     *         target capacity. There is insufficient Amazon EC2 to fulfill the total target capacity. The Fleet is
     *         attempting to asynchronously fulfill its total target capacity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>expiring</code> - The Capacity Reservation Fleet has reach its end date and it is in the process of
     *         expiring. One or more of its Capacity reservations might still be active.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>expired</code> - The Capacity Reservation Fleet has reach its end date. The Fleet and its Capacity
     *         Reservations are expired. The Fleet can't create new Capacity Reservations.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>cancelling</code> - The Capacity Reservation Fleet is in the process of being cancelled. One or
     *         more of its Capacity reservations might still be active.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>cancelled</code> - The Capacity Reservation Fleet has been manually cancelled. The Fleet and its
     *         Capacity Reservations are cancelled and the Fleet can't create new Capacity Reservations.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>failed</code> - The Capacity Reservation Fleet failed to reserve capacity for the specified
     *         instance types.
     *         </p>
     *         </li>
     * @see CapacityReservationFleetState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the Capacity Reservation Fleet. Possible states include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>submitted</code> - The Capacity Reservation Fleet request has been submitted and Amazon Elastic Compute
     * Cloud is preparing to create the Capacity Reservations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modifying</code> - The Capacity Reservation Fleet is being modified. The Fleet remains in this state until
     * the modification is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>active</code> - The Capacity Reservation Fleet has fulfilled its total target capacity and it is attempting
     * to maintain this capacity. The Fleet remains in this state until it is modified or deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>partially_fulfilled</code> - The Capacity Reservation Fleet has partially fulfilled its total target
     * capacity. There is insufficient Amazon EC2 to fulfill the total target capacity. The Fleet is attempting to
     * asynchronously fulfill its total target capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expiring</code> - The Capacity Reservation Fleet has reach its end date and it is in the process of
     * expiring. One or more of its Capacity reservations might still be active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The Capacity Reservation Fleet has reach its end date. The Fleet and its Capacity
     * Reservations are expired. The Fleet can't create new Capacity Reservations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelling</code> - The Capacity Reservation Fleet is in the process of being cancelled. One or more of its
     * Capacity reservations might still be active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled</code> - The Capacity Reservation Fleet has been manually cancelled. The Fleet and its Capacity
     * Reservations are cancelled and the Fleet can't create new Capacity Reservations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - The Capacity Reservation Fleet failed to reserve capacity for the specified instance types.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The state of the Capacity Reservation Fleet. Possible states include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>submitted</code> - The Capacity Reservation Fleet request has been submitted and Amazon Elastic
     *        Compute Cloud is preparing to create the Capacity Reservations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modifying</code> - The Capacity Reservation Fleet is being modified. The Fleet remains in this state
     *        until the modification is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>active</code> - The Capacity Reservation Fleet has fulfilled its total target capacity and it is
     *        attempting to maintain this capacity. The Fleet remains in this state until it is modified or deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>partially_fulfilled</code> - The Capacity Reservation Fleet has partially fulfilled its total target
     *        capacity. There is insufficient Amazon EC2 to fulfill the total target capacity. The Fleet is attempting
     *        to asynchronously fulfill its total target capacity.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>expiring</code> - The Capacity Reservation Fleet has reach its end date and it is in the process of
     *        expiring. One or more of its Capacity reservations might still be active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>expired</code> - The Capacity Reservation Fleet has reach its end date. The Fleet and its Capacity
     *        Reservations are expired. The Fleet can't create new Capacity Reservations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cancelling</code> - The Capacity Reservation Fleet is in the process of being cancelled. One or more
     *        of its Capacity reservations might still be active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cancelled</code> - The Capacity Reservation Fleet has been manually cancelled. The Fleet and its
     *        Capacity Reservations are cancelled and the Fleet can't create new Capacity Reservations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failed</code> - The Capacity Reservation Fleet failed to reserve capacity for the specified instance
     *        types.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityReservationFleetState
     */

    public CapacityReservationFleet withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the Capacity Reservation Fleet. Possible states include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>submitted</code> - The Capacity Reservation Fleet request has been submitted and Amazon Elastic Compute
     * Cloud is preparing to create the Capacity Reservations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modifying</code> - The Capacity Reservation Fleet is being modified. The Fleet remains in this state until
     * the modification is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>active</code> - The Capacity Reservation Fleet has fulfilled its total target capacity and it is attempting
     * to maintain this capacity. The Fleet remains in this state until it is modified or deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>partially_fulfilled</code> - The Capacity Reservation Fleet has partially fulfilled its total target
     * capacity. There is insufficient Amazon EC2 to fulfill the total target capacity. The Fleet is attempting to
     * asynchronously fulfill its total target capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expiring</code> - The Capacity Reservation Fleet has reach its end date and it is in the process of
     * expiring. One or more of its Capacity reservations might still be active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The Capacity Reservation Fleet has reach its end date. The Fleet and its Capacity
     * Reservations are expired. The Fleet can't create new Capacity Reservations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelling</code> - The Capacity Reservation Fleet is in the process of being cancelled. One or more of its
     * Capacity reservations might still be active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled</code> - The Capacity Reservation Fleet has been manually cancelled. The Fleet and its Capacity
     * Reservations are cancelled and the Fleet can't create new Capacity Reservations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - The Capacity Reservation Fleet failed to reserve capacity for the specified instance types.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The state of the Capacity Reservation Fleet. Possible states include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>submitted</code> - The Capacity Reservation Fleet request has been submitted and Amazon Elastic
     *        Compute Cloud is preparing to create the Capacity Reservations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modifying</code> - The Capacity Reservation Fleet is being modified. The Fleet remains in this state
     *        until the modification is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>active</code> - The Capacity Reservation Fleet has fulfilled its total target capacity and it is
     *        attempting to maintain this capacity. The Fleet remains in this state until it is modified or deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>partially_fulfilled</code> - The Capacity Reservation Fleet has partially fulfilled its total target
     *        capacity. There is insufficient Amazon EC2 to fulfill the total target capacity. The Fleet is attempting
     *        to asynchronously fulfill its total target capacity.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>expiring</code> - The Capacity Reservation Fleet has reach its end date and it is in the process of
     *        expiring. One or more of its Capacity reservations might still be active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>expired</code> - The Capacity Reservation Fleet has reach its end date. The Fleet and its Capacity
     *        Reservations are expired. The Fleet can't create new Capacity Reservations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cancelling</code> - The Capacity Reservation Fleet is in the process of being cancelled. One or more
     *        of its Capacity reservations might still be active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cancelled</code> - The Capacity Reservation Fleet has been manually cancelled. The Fleet and its
     *        Capacity Reservations are cancelled and the Fleet can't create new Capacity Reservations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failed</code> - The Capacity Reservation Fleet failed to reserve capacity for the specified instance
     *        types.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityReservationFleetState
     */

    public CapacityReservationFleet withState(CapacityReservationFleetState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The total number of capacity units for which the Capacity Reservation Fleet reserves capacity. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity">Total target
     * capacity</a> in the Amazon EC2 User Guide.
     * </p>
     * 
     * @param totalTargetCapacity
     *        The total number of capacity units for which the Capacity Reservation Fleet reserves capacity. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity">Total
     *        target capacity</a> in the Amazon EC2 User Guide.
     */

    public void setTotalTargetCapacity(Integer totalTargetCapacity) {
        this.totalTargetCapacity = totalTargetCapacity;
    }

    /**
     * <p>
     * The total number of capacity units for which the Capacity Reservation Fleet reserves capacity. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity">Total target
     * capacity</a> in the Amazon EC2 User Guide.
     * </p>
     * 
     * @return The total number of capacity units for which the Capacity Reservation Fleet reserves capacity. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity">Total
     *         target capacity</a> in the Amazon EC2 User Guide.
     */

    public Integer getTotalTargetCapacity() {
        return this.totalTargetCapacity;
    }

    /**
     * <p>
     * The total number of capacity units for which the Capacity Reservation Fleet reserves capacity. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity">Total target
     * capacity</a> in the Amazon EC2 User Guide.
     * </p>
     * 
     * @param totalTargetCapacity
     *        The total number of capacity units for which the Capacity Reservation Fleet reserves capacity. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity">Total
     *        target capacity</a> in the Amazon EC2 User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityReservationFleet withTotalTargetCapacity(Integer totalTargetCapacity) {
        setTotalTargetCapacity(totalTargetCapacity);
        return this;
    }

    /**
     * <p>
     * The capacity units that have been fulfilled.
     * </p>
     * 
     * @param totalFulfilledCapacity
     *        The capacity units that have been fulfilled.
     */

    public void setTotalFulfilledCapacity(Double totalFulfilledCapacity) {
        this.totalFulfilledCapacity = totalFulfilledCapacity;
    }

    /**
     * <p>
     * The capacity units that have been fulfilled.
     * </p>
     * 
     * @return The capacity units that have been fulfilled.
     */

    public Double getTotalFulfilledCapacity() {
        return this.totalFulfilledCapacity;
    }

    /**
     * <p>
     * The capacity units that have been fulfilled.
     * </p>
     * 
     * @param totalFulfilledCapacity
     *        The capacity units that have been fulfilled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityReservationFleet withTotalFulfilledCapacity(Double totalFulfilledCapacity) {
        setTotalFulfilledCapacity(totalFulfilledCapacity);
        return this;
    }

    /**
     * <p>
     * The tenancy of the Capacity Reservation Fleet. Tenancies include:
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
     * <code>dedicated</code> - The Capacity Reservation Fleet is created on single-tenant hardware that is dedicated to
     * a single Amazon Web Services account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tenancy
     *        The tenancy of the Capacity Reservation Fleet. Tenancies include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>default</code> - The Capacity Reservation Fleet is created on hardware that is shared with other
     *        Amazon Web Services accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dedicated</code> - The Capacity Reservation Fleet is created on single-tenant hardware that is
     *        dedicated to a single Amazon Web Services account.
     *        </p>
     *        </li>
     * @see FleetCapacityReservationTenancy
     */

    public void setTenancy(String tenancy) {
        this.tenancy = tenancy;
    }

    /**
     * <p>
     * The tenancy of the Capacity Reservation Fleet. Tenancies include:
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
     * <code>dedicated</code> - The Capacity Reservation Fleet is created on single-tenant hardware that is dedicated to
     * a single Amazon Web Services account.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The tenancy of the Capacity Reservation Fleet. Tenancies include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>default</code> - The Capacity Reservation Fleet is created on hardware that is shared with other
     *         Amazon Web Services accounts.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>dedicated</code> - The Capacity Reservation Fleet is created on single-tenant hardware that is
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
     * The tenancy of the Capacity Reservation Fleet. Tenancies include:
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
     * <code>dedicated</code> - The Capacity Reservation Fleet is created on single-tenant hardware that is dedicated to
     * a single Amazon Web Services account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tenancy
     *        The tenancy of the Capacity Reservation Fleet. Tenancies include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>default</code> - The Capacity Reservation Fleet is created on hardware that is shared with other
     *        Amazon Web Services accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dedicated</code> - The Capacity Reservation Fleet is created on single-tenant hardware that is
     *        dedicated to a single Amazon Web Services account.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetCapacityReservationTenancy
     */

    public CapacityReservationFleet withTenancy(String tenancy) {
        setTenancy(tenancy);
        return this;
    }

    /**
     * <p>
     * The tenancy of the Capacity Reservation Fleet. Tenancies include:
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
     * <code>dedicated</code> - The Capacity Reservation Fleet is created on single-tenant hardware that is dedicated to
     * a single Amazon Web Services account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tenancy
     *        The tenancy of the Capacity Reservation Fleet. Tenancies include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>default</code> - The Capacity Reservation Fleet is created on hardware that is shared with other
     *        Amazon Web Services accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dedicated</code> - The Capacity Reservation Fleet is created on single-tenant hardware that is
     *        dedicated to a single Amazon Web Services account.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetCapacityReservationTenancy
     */

    public CapacityReservationFleet withTenancy(FleetCapacityReservationTenancy tenancy) {
        this.tenancy = tenancy.toString();
        return this;
    }

    /**
     * <p>
     * The date and time at which the Capacity Reservation Fleet expires.
     * </p>
     * 
     * @param endDate
     *        The date and time at which the Capacity Reservation Fleet expires.
     */

    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * The date and time at which the Capacity Reservation Fleet expires.
     * </p>
     * 
     * @return The date and time at which the Capacity Reservation Fleet expires.
     */

    public java.util.Date getEndDate() {
        return this.endDate;
    }

    /**
     * <p>
     * The date and time at which the Capacity Reservation Fleet expires.
     * </p>
     * 
     * @param endDate
     *        The date and time at which the Capacity Reservation Fleet expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityReservationFleet withEndDate(java.util.Date endDate) {
        setEndDate(endDate);
        return this;
    }

    /**
     * <p>
     * The date and time at which the Capacity Reservation Fleet was created.
     * </p>
     * 
     * @param createTime
     *        The date and time at which the Capacity Reservation Fleet was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The date and time at which the Capacity Reservation Fleet was created.
     * </p>
     * 
     * @return The date and time at which the Capacity Reservation Fleet was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The date and time at which the Capacity Reservation Fleet was created.
     * </p>
     * 
     * @param createTime
     *        The date and time at which the Capacity Reservation Fleet was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityReservationFleet withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
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

    public CapacityReservationFleet withInstanceMatchCriteria(String instanceMatchCriteria) {
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

    public CapacityReservationFleet withInstanceMatchCriteria(FleetInstanceMatchCriteria instanceMatchCriteria) {
        this.instanceMatchCriteria = instanceMatchCriteria.toString();
        return this;
    }

    /**
     * <p>
     * The strategy used by the Capacity Reservation Fleet to determine which of the specified instance types to use.
     * For more information, see For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#allocation-strategy"> Allocation
     * strategy</a> in the Amazon EC2 User Guide.
     * </p>
     * 
     * @param allocationStrategy
     *        The strategy used by the Capacity Reservation Fleet to determine which of the specified instance types to
     *        use. For more information, see For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#allocation-strategy">
     *        Allocation strategy</a> in the Amazon EC2 User Guide.
     */

    public void setAllocationStrategy(String allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
    }

    /**
     * <p>
     * The strategy used by the Capacity Reservation Fleet to determine which of the specified instance types to use.
     * For more information, see For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#allocation-strategy"> Allocation
     * strategy</a> in the Amazon EC2 User Guide.
     * </p>
     * 
     * @return The strategy used by the Capacity Reservation Fleet to determine which of the specified instance types to
     *         use. For more information, see For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#allocation-strategy">
     *         Allocation strategy</a> in the Amazon EC2 User Guide.
     */

    public String getAllocationStrategy() {
        return this.allocationStrategy;
    }

    /**
     * <p>
     * The strategy used by the Capacity Reservation Fleet to determine which of the specified instance types to use.
     * For more information, see For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#allocation-strategy"> Allocation
     * strategy</a> in the Amazon EC2 User Guide.
     * </p>
     * 
     * @param allocationStrategy
     *        The strategy used by the Capacity Reservation Fleet to determine which of the specified instance types to
     *        use. For more information, see For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#allocation-strategy">
     *        Allocation strategy</a> in the Amazon EC2 User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityReservationFleet withAllocationStrategy(String allocationStrategy) {
        setAllocationStrategy(allocationStrategy);
        return this;
    }

    /**
     * <p>
     * Information about the instance types for which to reserve the capacity.
     * </p>
     * 
     * @return Information about the instance types for which to reserve the capacity.
     */

    public java.util.List<FleetCapacityReservation> getInstanceTypeSpecifications() {
        if (instanceTypeSpecifications == null) {
            instanceTypeSpecifications = new com.amazonaws.internal.SdkInternalList<FleetCapacityReservation>();
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

    public void setInstanceTypeSpecifications(java.util.Collection<FleetCapacityReservation> instanceTypeSpecifications) {
        if (instanceTypeSpecifications == null) {
            this.instanceTypeSpecifications = null;
            return;
        }

        this.instanceTypeSpecifications = new com.amazonaws.internal.SdkInternalList<FleetCapacityReservation>(instanceTypeSpecifications);
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

    public CapacityReservationFleet withInstanceTypeSpecifications(FleetCapacityReservation... instanceTypeSpecifications) {
        if (this.instanceTypeSpecifications == null) {
            setInstanceTypeSpecifications(new com.amazonaws.internal.SdkInternalList<FleetCapacityReservation>(instanceTypeSpecifications.length));
        }
        for (FleetCapacityReservation ele : instanceTypeSpecifications) {
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

    public CapacityReservationFleet withInstanceTypeSpecifications(java.util.Collection<FleetCapacityReservation> instanceTypeSpecifications) {
        setInstanceTypeSpecifications(instanceTypeSpecifications);
        return this;
    }

    /**
     * <p>
     * The tags assigned to the Capacity Reservation Fleet.
     * </p>
     * 
     * @return The tags assigned to the Capacity Reservation Fleet.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the Capacity Reservation Fleet.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the Capacity Reservation Fleet.
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
     * The tags assigned to the Capacity Reservation Fleet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the Capacity Reservation Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityReservationFleet withTags(Tag... tags) {
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
     * The tags assigned to the Capacity Reservation Fleet.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the Capacity Reservation Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityReservationFleet withTags(java.util.Collection<Tag> tags) {
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
        if (getCapacityReservationFleetId() != null)
            sb.append("CapacityReservationFleetId: ").append(getCapacityReservationFleetId()).append(",");
        if (getCapacityReservationFleetArn() != null)
            sb.append("CapacityReservationFleetArn: ").append(getCapacityReservationFleetArn()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getTotalTargetCapacity() != null)
            sb.append("TotalTargetCapacity: ").append(getTotalTargetCapacity()).append(",");
        if (getTotalFulfilledCapacity() != null)
            sb.append("TotalFulfilledCapacity: ").append(getTotalFulfilledCapacity()).append(",");
        if (getTenancy() != null)
            sb.append("Tenancy: ").append(getTenancy()).append(",");
        if (getEndDate() != null)
            sb.append("EndDate: ").append(getEndDate()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getInstanceMatchCriteria() != null)
            sb.append("InstanceMatchCriteria: ").append(getInstanceMatchCriteria()).append(",");
        if (getAllocationStrategy() != null)
            sb.append("AllocationStrategy: ").append(getAllocationStrategy()).append(",");
        if (getInstanceTypeSpecifications() != null)
            sb.append("InstanceTypeSpecifications: ").append(getInstanceTypeSpecifications()).append(",");
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

        if (obj instanceof CapacityReservationFleet == false)
            return false;
        CapacityReservationFleet other = (CapacityReservationFleet) obj;
        if (other.getCapacityReservationFleetId() == null ^ this.getCapacityReservationFleetId() == null)
            return false;
        if (other.getCapacityReservationFleetId() != null && other.getCapacityReservationFleetId().equals(this.getCapacityReservationFleetId()) == false)
            return false;
        if (other.getCapacityReservationFleetArn() == null ^ this.getCapacityReservationFleetArn() == null)
            return false;
        if (other.getCapacityReservationFleetArn() != null && other.getCapacityReservationFleetArn().equals(this.getCapacityReservationFleetArn()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTotalTargetCapacity() == null ^ this.getTotalTargetCapacity() == null)
            return false;
        if (other.getTotalTargetCapacity() != null && other.getTotalTargetCapacity().equals(this.getTotalTargetCapacity()) == false)
            return false;
        if (other.getTotalFulfilledCapacity() == null ^ this.getTotalFulfilledCapacity() == null)
            return false;
        if (other.getTotalFulfilledCapacity() != null && other.getTotalFulfilledCapacity().equals(this.getTotalFulfilledCapacity()) == false)
            return false;
        if (other.getTenancy() == null ^ this.getTenancy() == null)
            return false;
        if (other.getTenancy() != null && other.getTenancy().equals(this.getTenancy()) == false)
            return false;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getInstanceMatchCriteria() == null ^ this.getInstanceMatchCriteria() == null)
            return false;
        if (other.getInstanceMatchCriteria() != null && other.getInstanceMatchCriteria().equals(this.getInstanceMatchCriteria()) == false)
            return false;
        if (other.getAllocationStrategy() == null ^ this.getAllocationStrategy() == null)
            return false;
        if (other.getAllocationStrategy() != null && other.getAllocationStrategy().equals(this.getAllocationStrategy()) == false)
            return false;
        if (other.getInstanceTypeSpecifications() == null ^ this.getInstanceTypeSpecifications() == null)
            return false;
        if (other.getInstanceTypeSpecifications() != null && other.getInstanceTypeSpecifications().equals(this.getInstanceTypeSpecifications()) == false)
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

        hashCode = prime * hashCode + ((getCapacityReservationFleetId() == null) ? 0 : getCapacityReservationFleetId().hashCode());
        hashCode = prime * hashCode + ((getCapacityReservationFleetArn() == null) ? 0 : getCapacityReservationFleetArn().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTotalTargetCapacity() == null) ? 0 : getTotalTargetCapacity().hashCode());
        hashCode = prime * hashCode + ((getTotalFulfilledCapacity() == null) ? 0 : getTotalFulfilledCapacity().hashCode());
        hashCode = prime * hashCode + ((getTenancy() == null) ? 0 : getTenancy().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getInstanceMatchCriteria() == null) ? 0 : getInstanceMatchCriteria().hashCode());
        hashCode = prime * hashCode + ((getAllocationStrategy() == null) ? 0 : getAllocationStrategy().hashCode());
        hashCode = prime * hashCode + ((getInstanceTypeSpecifications() == null) ? 0 : getInstanceTypeSpecifications().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CapacityReservationFleet clone() {
        try {
            return (CapacityReservationFleet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
