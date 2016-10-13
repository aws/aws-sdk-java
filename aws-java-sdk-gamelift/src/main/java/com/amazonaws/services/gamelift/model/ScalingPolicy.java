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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;

/**
 * <p>
 * Rule that controls how a fleet is scaled. Scaling policies are uniquely identified by the combination of name and
 * fleet ID.
 * </p>
 */
public class ScalingPolicy implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identity for the fleet associated with this scaling policy.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * Descriptive label associated with a scaling policy. Policy names do not need to be unique.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Current status of the scaling policy. The scaling policy is only in force when in an <code>ACTIVE</code> status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ACTIVE</b> – The scaling policy is currently in force.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATE_REQUESTED</b> – A request to update the scaling policy has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATING</b> – A change is being made to the scaling policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETE_REQUESTED</b> – A request to delete the scaling policy has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETING</b> – The scaling policy is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETED</b> – The scaling policy has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ERROR</b> – An error occurred in creating the policy. It should be removed and recreated.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * Amount of adjustment to make, based on the scaling adjustment type.
     * </p>
     */
    private Integer scalingAdjustment;
    /**
     * <p>
     * Type of adjustment to make to a fleet's instance count (see <a>FleetCapacity</a>):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ChangeInCapacity</b> – add (or subtract) the scaling adjustment value from the current instance count.
     * Positive values scale up while negative values scale down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ExactCapacity</b> – set the instance count to the scaling adjustment value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PercentChangeInCapacity</b> – increase or reduce the current instance count by the scaling adjustment, read as
     * a percentage. Positive values scale up while negative values scale down.
     * </p>
     * </li>
     * </ul>
     */
    private String scalingAdjustmentType;
    /**
     * <p>
     * Comparison operator to use when measuring a metric against the threshold value.
     * </p>
     */
    private String comparisonOperator;
    /**
     * <p>
     * Metric value used to trigger a scaling event.
     * </p>
     */
    private Double threshold;
    /**
     * <p>
     * Length of time (in minutes) the metric must be at or beyond the threshold before a scaling event is triggered.
     * </p>
     */
    private Integer evaluationPeriods;
    /**
     * <p>
     * Name of the GameLift-defined metric that is used to trigger an adjustment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ActivatingGameSessions</b> – number of game sessions in the process of being created (game session status =
     * <code>ACTIVATING</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ActiveGameSessions</b> – number of game sessions currently running (game session status = <code>ACTIVE</code>
     * ).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CurrentPlayerSessions</b> – number of active or reserved player sessions (player session status =
     * <code>ACTIVE</code> or <code>RESERVED</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AvailablePlayerSessions</b> – number of player session slots currently available in active game sessions
     * across the fleet, calculated by subtracting a game session's current player session count from its maximum player
     * session count. This number does include game sessions that are not currently accepting players (game session
     * <code>PlayerSessionCreationPolicy</code> = <code>DENY_ALL</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ActiveInstances</b> – number of instances currently running a game session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IdleInstances</b> – number of instances not currently running a game session.
     * </p>
     * </li>
     * </ul>
     */
    private String metricName;

    /**
     * <p>
     * Unique identity for the fleet associated with this scaling policy.
     * </p>
     * 
     * @param fleetId
     *        Unique identity for the fleet associated with this scaling policy.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * Unique identity for the fleet associated with this scaling policy.
     * </p>
     * 
     * @return Unique identity for the fleet associated with this scaling policy.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * Unique identity for the fleet associated with this scaling policy.
     * </p>
     * 
     * @param fleetId
     *        Unique identity for the fleet associated with this scaling policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPolicy withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * Descriptive label associated with a scaling policy. Policy names do not need to be unique.
     * </p>
     * 
     * @param name
     *        Descriptive label associated with a scaling policy. Policy names do not need to be unique.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Descriptive label associated with a scaling policy. Policy names do not need to be unique.
     * </p>
     * 
     * @return Descriptive label associated with a scaling policy. Policy names do not need to be unique.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Descriptive label associated with a scaling policy. Policy names do not need to be unique.
     * </p>
     * 
     * @param name
     *        Descriptive label associated with a scaling policy. Policy names do not need to be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPolicy withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Current status of the scaling policy. The scaling policy is only in force when in an <code>ACTIVE</code> status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ACTIVE</b> – The scaling policy is currently in force.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATE_REQUESTED</b> – A request to update the scaling policy has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATING</b> – A change is being made to the scaling policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETE_REQUESTED</b> – A request to delete the scaling policy has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETING</b> – The scaling policy is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETED</b> – The scaling policy has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ERROR</b> – An error occurred in creating the policy. It should be removed and recreated.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Current status of the scaling policy. The scaling policy is only in force when in an <code>ACTIVE</code>
     *        status.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ACTIVE</b> – The scaling policy is currently in force.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>UPDATE_REQUESTED</b> – A request to update the scaling policy has been received.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>UPDATING</b> – A change is being made to the scaling policy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETE_REQUESTED</b> – A request to delete the scaling policy has been received.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETING</b> – The scaling policy is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETED</b> – The scaling policy has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ERROR</b> – An error occurred in creating the policy. It should be removed and recreated.
     *        </p>
     *        </li>
     * @see ScalingStatusType
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Current status of the scaling policy. The scaling policy is only in force when in an <code>ACTIVE</code> status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ACTIVE</b> – The scaling policy is currently in force.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATE_REQUESTED</b> – A request to update the scaling policy has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATING</b> – A change is being made to the scaling policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETE_REQUESTED</b> – A request to delete the scaling policy has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETING</b> – The scaling policy is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETED</b> – The scaling policy has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ERROR</b> – An error occurred in creating the policy. It should be removed and recreated.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Current status of the scaling policy. The scaling policy is only in force when in an <code>ACTIVE</code>
     *         status.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>ACTIVE</b> – The scaling policy is currently in force.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UPDATE_REQUESTED</b> – A request to update the scaling policy has been received.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UPDATING</b> – A change is being made to the scaling policy.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>DELETE_REQUESTED</b> – A request to delete the scaling policy has been received.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>DELETING</b> – The scaling policy is being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>DELETED</b> – The scaling policy has been deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ERROR</b> – An error occurred in creating the policy. It should be removed and recreated.
     *         </p>
     *         </li>
     * @see ScalingStatusType
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Current status of the scaling policy. The scaling policy is only in force when in an <code>ACTIVE</code> status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ACTIVE</b> – The scaling policy is currently in force.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATE_REQUESTED</b> – A request to update the scaling policy has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATING</b> – A change is being made to the scaling policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETE_REQUESTED</b> – A request to delete the scaling policy has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETING</b> – The scaling policy is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETED</b> – The scaling policy has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ERROR</b> – An error occurred in creating the policy. It should be removed and recreated.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Current status of the scaling policy. The scaling policy is only in force when in an <code>ACTIVE</code>
     *        status.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ACTIVE</b> – The scaling policy is currently in force.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>UPDATE_REQUESTED</b> – A request to update the scaling policy has been received.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>UPDATING</b> – A change is being made to the scaling policy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETE_REQUESTED</b> – A request to delete the scaling policy has been received.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETING</b> – The scaling policy is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETED</b> – The scaling policy has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ERROR</b> – An error occurred in creating the policy. It should be removed and recreated.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalingStatusType
     */

    public ScalingPolicy withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Current status of the scaling policy. The scaling policy is only in force when in an <code>ACTIVE</code> status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ACTIVE</b> – The scaling policy is currently in force.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATE_REQUESTED</b> – A request to update the scaling policy has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATING</b> – A change is being made to the scaling policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETE_REQUESTED</b> – A request to delete the scaling policy has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETING</b> – The scaling policy is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETED</b> – The scaling policy has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ERROR</b> – An error occurred in creating the policy. It should be removed and recreated.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Current status of the scaling policy. The scaling policy is only in force when in an <code>ACTIVE</code>
     *        status.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ACTIVE</b> – The scaling policy is currently in force.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>UPDATE_REQUESTED</b> – A request to update the scaling policy has been received.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>UPDATING</b> – A change is being made to the scaling policy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETE_REQUESTED</b> – A request to delete the scaling policy has been received.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETING</b> – The scaling policy is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETED</b> – The scaling policy has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ERROR</b> – An error occurred in creating the policy. It should be removed and recreated.
     *        </p>
     *        </li>
     * @see ScalingStatusType
     */

    public void setStatus(ScalingStatusType status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Current status of the scaling policy. The scaling policy is only in force when in an <code>ACTIVE</code> status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ACTIVE</b> – The scaling policy is currently in force.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATE_REQUESTED</b> – A request to update the scaling policy has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATING</b> – A change is being made to the scaling policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETE_REQUESTED</b> – A request to delete the scaling policy has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETING</b> – The scaling policy is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETED</b> – The scaling policy has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ERROR</b> – An error occurred in creating the policy. It should be removed and recreated.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Current status of the scaling policy. The scaling policy is only in force when in an <code>ACTIVE</code>
     *        status.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ACTIVE</b> – The scaling policy is currently in force.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>UPDATE_REQUESTED</b> – A request to update the scaling policy has been received.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>UPDATING</b> – A change is being made to the scaling policy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETE_REQUESTED</b> – A request to delete the scaling policy has been received.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETING</b> – The scaling policy is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETED</b> – The scaling policy has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ERROR</b> – An error occurred in creating the policy. It should be removed and recreated.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalingStatusType
     */

    public ScalingPolicy withStatus(ScalingStatusType status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Amount of adjustment to make, based on the scaling adjustment type.
     * </p>
     * 
     * @param scalingAdjustment
     *        Amount of adjustment to make, based on the scaling adjustment type.
     */

    public void setScalingAdjustment(Integer scalingAdjustment) {
        this.scalingAdjustment = scalingAdjustment;
    }

    /**
     * <p>
     * Amount of adjustment to make, based on the scaling adjustment type.
     * </p>
     * 
     * @return Amount of adjustment to make, based on the scaling adjustment type.
     */

    public Integer getScalingAdjustment() {
        return this.scalingAdjustment;
    }

    /**
     * <p>
     * Amount of adjustment to make, based on the scaling adjustment type.
     * </p>
     * 
     * @param scalingAdjustment
     *        Amount of adjustment to make, based on the scaling adjustment type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPolicy withScalingAdjustment(Integer scalingAdjustment) {
        setScalingAdjustment(scalingAdjustment);
        return this;
    }

    /**
     * <p>
     * Type of adjustment to make to a fleet's instance count (see <a>FleetCapacity</a>):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ChangeInCapacity</b> – add (or subtract) the scaling adjustment value from the current instance count.
     * Positive values scale up while negative values scale down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ExactCapacity</b> – set the instance count to the scaling adjustment value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PercentChangeInCapacity</b> – increase or reduce the current instance count by the scaling adjustment, read as
     * a percentage. Positive values scale up while negative values scale down.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scalingAdjustmentType
     *        Type of adjustment to make to a fleet's instance count (see <a>FleetCapacity</a>):</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ChangeInCapacity</b> – add (or subtract) the scaling adjustment value from the current instance count.
     *        Positive values scale up while negative values scale down.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ExactCapacity</b> – set the instance count to the scaling adjustment value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PercentChangeInCapacity</b> – increase or reduce the current instance count by the scaling adjustment,
     *        read as a percentage. Positive values scale up while negative values scale down.
     *        </p>
     *        </li>
     * @see ScalingAdjustmentType
     */

    public void setScalingAdjustmentType(String scalingAdjustmentType) {
        this.scalingAdjustmentType = scalingAdjustmentType;
    }

    /**
     * <p>
     * Type of adjustment to make to a fleet's instance count (see <a>FleetCapacity</a>):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ChangeInCapacity</b> – add (or subtract) the scaling adjustment value from the current instance count.
     * Positive values scale up while negative values scale down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ExactCapacity</b> – set the instance count to the scaling adjustment value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PercentChangeInCapacity</b> – increase or reduce the current instance count by the scaling adjustment, read as
     * a percentage. Positive values scale up while negative values scale down.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Type of adjustment to make to a fleet's instance count (see <a>FleetCapacity</a>):</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>ChangeInCapacity</b> – add (or subtract) the scaling adjustment value from the current instance count.
     *         Positive values scale up while negative values scale down.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ExactCapacity</b> – set the instance count to the scaling adjustment value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>PercentChangeInCapacity</b> – increase or reduce the current instance count by the scaling adjustment,
     *         read as a percentage. Positive values scale up while negative values scale down.
     *         </p>
     *         </li>
     * @see ScalingAdjustmentType
     */

    public String getScalingAdjustmentType() {
        return this.scalingAdjustmentType;
    }

    /**
     * <p>
     * Type of adjustment to make to a fleet's instance count (see <a>FleetCapacity</a>):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ChangeInCapacity</b> – add (or subtract) the scaling adjustment value from the current instance count.
     * Positive values scale up while negative values scale down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ExactCapacity</b> – set the instance count to the scaling adjustment value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PercentChangeInCapacity</b> – increase or reduce the current instance count by the scaling adjustment, read as
     * a percentage. Positive values scale up while negative values scale down.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scalingAdjustmentType
     *        Type of adjustment to make to a fleet's instance count (see <a>FleetCapacity</a>):</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ChangeInCapacity</b> – add (or subtract) the scaling adjustment value from the current instance count.
     *        Positive values scale up while negative values scale down.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ExactCapacity</b> – set the instance count to the scaling adjustment value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PercentChangeInCapacity</b> – increase or reduce the current instance count by the scaling adjustment,
     *        read as a percentage. Positive values scale up while negative values scale down.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalingAdjustmentType
     */

    public ScalingPolicy withScalingAdjustmentType(String scalingAdjustmentType) {
        setScalingAdjustmentType(scalingAdjustmentType);
        return this;
    }

    /**
     * <p>
     * Type of adjustment to make to a fleet's instance count (see <a>FleetCapacity</a>):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ChangeInCapacity</b> – add (or subtract) the scaling adjustment value from the current instance count.
     * Positive values scale up while negative values scale down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ExactCapacity</b> – set the instance count to the scaling adjustment value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PercentChangeInCapacity</b> – increase or reduce the current instance count by the scaling adjustment, read as
     * a percentage. Positive values scale up while negative values scale down.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scalingAdjustmentType
     *        Type of adjustment to make to a fleet's instance count (see <a>FleetCapacity</a>):</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ChangeInCapacity</b> – add (or subtract) the scaling adjustment value from the current instance count.
     *        Positive values scale up while negative values scale down.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ExactCapacity</b> – set the instance count to the scaling adjustment value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PercentChangeInCapacity</b> – increase or reduce the current instance count by the scaling adjustment,
     *        read as a percentage. Positive values scale up while negative values scale down.
     *        </p>
     *        </li>
     * @see ScalingAdjustmentType
     */

    public void setScalingAdjustmentType(ScalingAdjustmentType scalingAdjustmentType) {
        this.scalingAdjustmentType = scalingAdjustmentType.toString();
    }

    /**
     * <p>
     * Type of adjustment to make to a fleet's instance count (see <a>FleetCapacity</a>):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ChangeInCapacity</b> – add (or subtract) the scaling adjustment value from the current instance count.
     * Positive values scale up while negative values scale down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ExactCapacity</b> – set the instance count to the scaling adjustment value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PercentChangeInCapacity</b> – increase or reduce the current instance count by the scaling adjustment, read as
     * a percentage. Positive values scale up while negative values scale down.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scalingAdjustmentType
     *        Type of adjustment to make to a fleet's instance count (see <a>FleetCapacity</a>):</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ChangeInCapacity</b> – add (or subtract) the scaling adjustment value from the current instance count.
     *        Positive values scale up while negative values scale down.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ExactCapacity</b> – set the instance count to the scaling adjustment value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PercentChangeInCapacity</b> – increase or reduce the current instance count by the scaling adjustment,
     *        read as a percentage. Positive values scale up while negative values scale down.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalingAdjustmentType
     */

    public ScalingPolicy withScalingAdjustmentType(ScalingAdjustmentType scalingAdjustmentType) {
        setScalingAdjustmentType(scalingAdjustmentType);
        return this;
    }

    /**
     * <p>
     * Comparison operator to use when measuring a metric against the threshold value.
     * </p>
     * 
     * @param comparisonOperator
     *        Comparison operator to use when measuring a metric against the threshold value.
     * @see ComparisonOperatorType
     */

    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    /**
     * <p>
     * Comparison operator to use when measuring a metric against the threshold value.
     * </p>
     * 
     * @return Comparison operator to use when measuring a metric against the threshold value.
     * @see ComparisonOperatorType
     */

    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    /**
     * <p>
     * Comparison operator to use when measuring a metric against the threshold value.
     * </p>
     * 
     * @param comparisonOperator
     *        Comparison operator to use when measuring a metric against the threshold value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComparisonOperatorType
     */

    public ScalingPolicy withComparisonOperator(String comparisonOperator) {
        setComparisonOperator(comparisonOperator);
        return this;
    }

    /**
     * <p>
     * Comparison operator to use when measuring a metric against the threshold value.
     * </p>
     * 
     * @param comparisonOperator
     *        Comparison operator to use when measuring a metric against the threshold value.
     * @see ComparisonOperatorType
     */

    public void setComparisonOperator(ComparisonOperatorType comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
    }

    /**
     * <p>
     * Comparison operator to use when measuring a metric against the threshold value.
     * </p>
     * 
     * @param comparisonOperator
     *        Comparison operator to use when measuring a metric against the threshold value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComparisonOperatorType
     */

    public ScalingPolicy withComparisonOperator(ComparisonOperatorType comparisonOperator) {
        setComparisonOperator(comparisonOperator);
        return this;
    }

    /**
     * <p>
     * Metric value used to trigger a scaling event.
     * </p>
     * 
     * @param threshold
     *        Metric value used to trigger a scaling event.
     */

    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    /**
     * <p>
     * Metric value used to trigger a scaling event.
     * </p>
     * 
     * @return Metric value used to trigger a scaling event.
     */

    public Double getThreshold() {
        return this.threshold;
    }

    /**
     * <p>
     * Metric value used to trigger a scaling event.
     * </p>
     * 
     * @param threshold
     *        Metric value used to trigger a scaling event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPolicy withThreshold(Double threshold) {
        setThreshold(threshold);
        return this;
    }

    /**
     * <p>
     * Length of time (in minutes) the metric must be at or beyond the threshold before a scaling event is triggered.
     * </p>
     * 
     * @param evaluationPeriods
     *        Length of time (in minutes) the metric must be at or beyond the threshold before a scaling event is
     *        triggered.
     */

    public void setEvaluationPeriods(Integer evaluationPeriods) {
        this.evaluationPeriods = evaluationPeriods;
    }

    /**
     * <p>
     * Length of time (in minutes) the metric must be at or beyond the threshold before a scaling event is triggered.
     * </p>
     * 
     * @return Length of time (in minutes) the metric must be at or beyond the threshold before a scaling event is
     *         triggered.
     */

    public Integer getEvaluationPeriods() {
        return this.evaluationPeriods;
    }

    /**
     * <p>
     * Length of time (in minutes) the metric must be at or beyond the threshold before a scaling event is triggered.
     * </p>
     * 
     * @param evaluationPeriods
     *        Length of time (in minutes) the metric must be at or beyond the threshold before a scaling event is
     *        triggered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPolicy withEvaluationPeriods(Integer evaluationPeriods) {
        setEvaluationPeriods(evaluationPeriods);
        return this;
    }

    /**
     * <p>
     * Name of the GameLift-defined metric that is used to trigger an adjustment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ActivatingGameSessions</b> – number of game sessions in the process of being created (game session status =
     * <code>ACTIVATING</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ActiveGameSessions</b> – number of game sessions currently running (game session status = <code>ACTIVE</code>
     * ).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CurrentPlayerSessions</b> – number of active or reserved player sessions (player session status =
     * <code>ACTIVE</code> or <code>RESERVED</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AvailablePlayerSessions</b> – number of player session slots currently available in active game sessions
     * across the fleet, calculated by subtracting a game session's current player session count from its maximum player
     * session count. This number does include game sessions that are not currently accepting players (game session
     * <code>PlayerSessionCreationPolicy</code> = <code>DENY_ALL</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ActiveInstances</b> – number of instances currently running a game session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IdleInstances</b> – number of instances not currently running a game session.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metricName
     *        Name of the GameLift-defined metric that is used to trigger an adjustment.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ActivatingGameSessions</b> – number of game sessions in the process of being created (game session
     *        status = <code>ACTIVATING</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ActiveGameSessions</b> – number of game sessions currently running (game session status =
     *        <code>ACTIVE</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CurrentPlayerSessions</b> – number of active or reserved player sessions (player session status =
     *        <code>ACTIVE</code> or <code>RESERVED</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AvailablePlayerSessions</b> – number of player session slots currently available in active game
     *        sessions across the fleet, calculated by subtracting a game session's current player session count from
     *        its maximum player session count. This number does include game sessions that are not currently accepting
     *        players (game session <code>PlayerSessionCreationPolicy</code> = <code>DENY_ALL</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ActiveInstances</b> – number of instances currently running a game session.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>IdleInstances</b> – number of instances not currently running a game session.
     *        </p>
     *        </li>
     * @see MetricName
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * Name of the GameLift-defined metric that is used to trigger an adjustment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ActivatingGameSessions</b> – number of game sessions in the process of being created (game session status =
     * <code>ACTIVATING</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ActiveGameSessions</b> – number of game sessions currently running (game session status = <code>ACTIVE</code>
     * ).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CurrentPlayerSessions</b> – number of active or reserved player sessions (player session status =
     * <code>ACTIVE</code> or <code>RESERVED</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AvailablePlayerSessions</b> – number of player session slots currently available in active game sessions
     * across the fleet, calculated by subtracting a game session's current player session count from its maximum player
     * session count. This number does include game sessions that are not currently accepting players (game session
     * <code>PlayerSessionCreationPolicy</code> = <code>DENY_ALL</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ActiveInstances</b> – number of instances currently running a game session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IdleInstances</b> – number of instances not currently running a game session.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Name of the GameLift-defined metric that is used to trigger an adjustment.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>ActivatingGameSessions</b> – number of game sessions in the process of being created (game session
     *         status = <code>ACTIVATING</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ActiveGameSessions</b> – number of game sessions currently running (game session status =
     *         <code>ACTIVE</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>CurrentPlayerSessions</b> – number of active or reserved player sessions (player session status =
     *         <code>ACTIVE</code> or <code>RESERVED</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>AvailablePlayerSessions</b> – number of player session slots currently available in active game
     *         sessions across the fleet, calculated by subtracting a game session's current player session count from
     *         its maximum player session count. This number does include game sessions that are not currently accepting
     *         players (game session <code>PlayerSessionCreationPolicy</code> = <code>DENY_ALL</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ActiveInstances</b> – number of instances currently running a game session.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>IdleInstances</b> – number of instances not currently running a game session.
     *         </p>
     *         </li>
     * @see MetricName
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * Name of the GameLift-defined metric that is used to trigger an adjustment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ActivatingGameSessions</b> – number of game sessions in the process of being created (game session status =
     * <code>ACTIVATING</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ActiveGameSessions</b> – number of game sessions currently running (game session status = <code>ACTIVE</code>
     * ).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CurrentPlayerSessions</b> – number of active or reserved player sessions (player session status =
     * <code>ACTIVE</code> or <code>RESERVED</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AvailablePlayerSessions</b> – number of player session slots currently available in active game sessions
     * across the fleet, calculated by subtracting a game session's current player session count from its maximum player
     * session count. This number does include game sessions that are not currently accepting players (game session
     * <code>PlayerSessionCreationPolicy</code> = <code>DENY_ALL</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ActiveInstances</b> – number of instances currently running a game session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IdleInstances</b> – number of instances not currently running a game session.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metricName
     *        Name of the GameLift-defined metric that is used to trigger an adjustment.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ActivatingGameSessions</b> – number of game sessions in the process of being created (game session
     *        status = <code>ACTIVATING</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ActiveGameSessions</b> – number of game sessions currently running (game session status =
     *        <code>ACTIVE</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CurrentPlayerSessions</b> – number of active or reserved player sessions (player session status =
     *        <code>ACTIVE</code> or <code>RESERVED</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AvailablePlayerSessions</b> – number of player session slots currently available in active game
     *        sessions across the fleet, calculated by subtracting a game session's current player session count from
     *        its maximum player session count. This number does include game sessions that are not currently accepting
     *        players (game session <code>PlayerSessionCreationPolicy</code> = <code>DENY_ALL</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ActiveInstances</b> – number of instances currently running a game session.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>IdleInstances</b> – number of instances not currently running a game session.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricName
     */

    public ScalingPolicy withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * Name of the GameLift-defined metric that is used to trigger an adjustment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ActivatingGameSessions</b> – number of game sessions in the process of being created (game session status =
     * <code>ACTIVATING</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ActiveGameSessions</b> – number of game sessions currently running (game session status = <code>ACTIVE</code>
     * ).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CurrentPlayerSessions</b> – number of active or reserved player sessions (player session status =
     * <code>ACTIVE</code> or <code>RESERVED</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AvailablePlayerSessions</b> – number of player session slots currently available in active game sessions
     * across the fleet, calculated by subtracting a game session's current player session count from its maximum player
     * session count. This number does include game sessions that are not currently accepting players (game session
     * <code>PlayerSessionCreationPolicy</code> = <code>DENY_ALL</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ActiveInstances</b> – number of instances currently running a game session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IdleInstances</b> – number of instances not currently running a game session.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metricName
     *        Name of the GameLift-defined metric that is used to trigger an adjustment.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ActivatingGameSessions</b> – number of game sessions in the process of being created (game session
     *        status = <code>ACTIVATING</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ActiveGameSessions</b> – number of game sessions currently running (game session status =
     *        <code>ACTIVE</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CurrentPlayerSessions</b> – number of active or reserved player sessions (player session status =
     *        <code>ACTIVE</code> or <code>RESERVED</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AvailablePlayerSessions</b> – number of player session slots currently available in active game
     *        sessions across the fleet, calculated by subtracting a game session's current player session count from
     *        its maximum player session count. This number does include game sessions that are not currently accepting
     *        players (game session <code>PlayerSessionCreationPolicy</code> = <code>DENY_ALL</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ActiveInstances</b> – number of instances currently running a game session.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>IdleInstances</b> – number of instances not currently running a game session.
     *        </p>
     *        </li>
     * @see MetricName
     */

    public void setMetricName(MetricName metricName) {
        this.metricName = metricName.toString();
    }

    /**
     * <p>
     * Name of the GameLift-defined metric that is used to trigger an adjustment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ActivatingGameSessions</b> – number of game sessions in the process of being created (game session status =
     * <code>ACTIVATING</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ActiveGameSessions</b> – number of game sessions currently running (game session status = <code>ACTIVE</code>
     * ).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CurrentPlayerSessions</b> – number of active or reserved player sessions (player session status =
     * <code>ACTIVE</code> or <code>RESERVED</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AvailablePlayerSessions</b> – number of player session slots currently available in active game sessions
     * across the fleet, calculated by subtracting a game session's current player session count from its maximum player
     * session count. This number does include game sessions that are not currently accepting players (game session
     * <code>PlayerSessionCreationPolicy</code> = <code>DENY_ALL</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ActiveInstances</b> – number of instances currently running a game session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IdleInstances</b> – number of instances not currently running a game session.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metricName
     *        Name of the GameLift-defined metric that is used to trigger an adjustment.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ActivatingGameSessions</b> – number of game sessions in the process of being created (game session
     *        status = <code>ACTIVATING</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ActiveGameSessions</b> – number of game sessions currently running (game session status =
     *        <code>ACTIVE</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CurrentPlayerSessions</b> – number of active or reserved player sessions (player session status =
     *        <code>ACTIVE</code> or <code>RESERVED</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AvailablePlayerSessions</b> – number of player session slots currently available in active game
     *        sessions across the fleet, calculated by subtracting a game session's current player session count from
     *        its maximum player session count. This number does include game sessions that are not currently accepting
     *        players (game session <code>PlayerSessionCreationPolicy</code> = <code>DENY_ALL</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ActiveInstances</b> – number of instances currently running a game session.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>IdleInstances</b> – number of instances not currently running a game session.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricName
     */

    public ScalingPolicy withMetricName(MetricName metricName) {
        setMetricName(metricName);
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
        if (getFleetId() != null)
            sb.append("FleetId: " + getFleetId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getScalingAdjustment() != null)
            sb.append("ScalingAdjustment: " + getScalingAdjustment() + ",");
        if (getScalingAdjustmentType() != null)
            sb.append("ScalingAdjustmentType: " + getScalingAdjustmentType() + ",");
        if (getComparisonOperator() != null)
            sb.append("ComparisonOperator: " + getComparisonOperator() + ",");
        if (getThreshold() != null)
            sb.append("Threshold: " + getThreshold() + ",");
        if (getEvaluationPeriods() != null)
            sb.append("EvaluationPeriods: " + getEvaluationPeriods() + ",");
        if (getMetricName() != null)
            sb.append("MetricName: " + getMetricName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScalingPolicy == false)
            return false;
        ScalingPolicy other = (ScalingPolicy) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getScalingAdjustment() == null ^ this.getScalingAdjustment() == null)
            return false;
        if (other.getScalingAdjustment() != null && other.getScalingAdjustment().equals(this.getScalingAdjustment()) == false)
            return false;
        if (other.getScalingAdjustmentType() == null ^ this.getScalingAdjustmentType() == null)
            return false;
        if (other.getScalingAdjustmentType() != null && other.getScalingAdjustmentType().equals(this.getScalingAdjustmentType()) == false)
            return false;
        if (other.getComparisonOperator() == null ^ this.getComparisonOperator() == null)
            return false;
        if (other.getComparisonOperator() != null && other.getComparisonOperator().equals(this.getComparisonOperator()) == false)
            return false;
        if (other.getThreshold() == null ^ this.getThreshold() == null)
            return false;
        if (other.getThreshold() != null && other.getThreshold().equals(this.getThreshold()) == false)
            return false;
        if (other.getEvaluationPeriods() == null ^ this.getEvaluationPeriods() == null)
            return false;
        if (other.getEvaluationPeriods() != null && other.getEvaluationPeriods().equals(this.getEvaluationPeriods()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getScalingAdjustment() == null) ? 0 : getScalingAdjustment().hashCode());
        hashCode = prime * hashCode + ((getScalingAdjustmentType() == null) ? 0 : getScalingAdjustmentType().hashCode());
        hashCode = prime * hashCode + ((getComparisonOperator() == null) ? 0 : getComparisonOperator().hashCode());
        hashCode = prime * hashCode + ((getThreshold() == null) ? 0 : getThreshold().hashCode());
        hashCode = prime * hashCode + ((getEvaluationPeriods() == null) ? 0 : getEvaluationPeriods().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        return hashCode;
    }

    @Override
    public ScalingPolicy clone() {
        try {
            return (ScalingPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
