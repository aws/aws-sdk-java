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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request action.
 * </p>
 */
public class PutScalingPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Descriptive label associated with a scaling policy. Policy names do not need to be unique. A fleet can have only
     * one scaling policy with the same name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Unique identity for the fleet to scale with this policy.
     * </p>
     */
    private String fleetId;
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
     * a percentage. Positive values scale up while negative values scale down; for example, a value of "-10" scales the
     * fleet down by 10%.
     * </p>
     * </li>
     * </ul>
     */
    private String scalingAdjustmentType;
    /**
     * <p>
     * Metric value used to trigger a scaling event.
     * </p>
     */
    private Double threshold;
    /**
     * <p>
     * Comparison operator to use when measuring the metric against the threshold value.
     * </p>
     */
    private String comparisonOperator;
    /**
     * <p>
     * Length of time (in minutes) the metric must be at or beyond the threshold before a scaling event is triggered.
     * </p>
     */
    private Integer evaluationPeriods;
    /**
     * <p>
     * Name of the Amazon GameLift-defined metric that is used to trigger an adjustment.
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
     * session count. This number includes game sessions that are not currently accepting players (game session
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
     * Descriptive label associated with a scaling policy. Policy names do not need to be unique. A fleet can have only
     * one scaling policy with the same name.
     * </p>
     * 
     * @param name
     *        Descriptive label associated with a scaling policy. Policy names do not need to be unique. A fleet can
     *        have only one scaling policy with the same name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Descriptive label associated with a scaling policy. Policy names do not need to be unique. A fleet can have only
     * one scaling policy with the same name.
     * </p>
     * 
     * @return Descriptive label associated with a scaling policy. Policy names do not need to be unique. A fleet can
     *         have only one scaling policy with the same name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Descriptive label associated with a scaling policy. Policy names do not need to be unique. A fleet can have only
     * one scaling policy with the same name.
     * </p>
     * 
     * @param name
     *        Descriptive label associated with a scaling policy. Policy names do not need to be unique. A fleet can
     *        have only one scaling policy with the same name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutScalingPolicyRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Unique identity for the fleet to scale with this policy.
     * </p>
     * 
     * @param fleetId
     *        Unique identity for the fleet to scale with this policy.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * Unique identity for the fleet to scale with this policy.
     * </p>
     * 
     * @return Unique identity for the fleet to scale with this policy.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * Unique identity for the fleet to scale with this policy.
     * </p>
     * 
     * @param fleetId
     *        Unique identity for the fleet to scale with this policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutScalingPolicyRequest withFleetId(String fleetId) {
        setFleetId(fleetId);
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

    public PutScalingPolicyRequest withScalingAdjustment(Integer scalingAdjustment) {
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
     * a percentage. Positive values scale up while negative values scale down; for example, a value of "-10" scales the
     * fleet down by 10%.
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
     *        read as a percentage. Positive values scale up while negative values scale down; for example, a value of
     *        "-10" scales the fleet down by 10%.
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
     * a percentage. Positive values scale up while negative values scale down; for example, a value of "-10" scales the
     * fleet down by 10%.
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
     *         read as a percentage. Positive values scale up while negative values scale down; for example, a value of
     *         "-10" scales the fleet down by 10%.
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
     * a percentage. Positive values scale up while negative values scale down; for example, a value of "-10" scales the
     * fleet down by 10%.
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
     *        read as a percentage. Positive values scale up while negative values scale down; for example, a value of
     *        "-10" scales the fleet down by 10%.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalingAdjustmentType
     */

    public PutScalingPolicyRequest withScalingAdjustmentType(String scalingAdjustmentType) {
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
     * a percentage. Positive values scale up while negative values scale down; for example, a value of "-10" scales the
     * fleet down by 10%.
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
     *        read as a percentage. Positive values scale up while negative values scale down; for example, a value of
     *        "-10" scales the fleet down by 10%.
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
     * a percentage. Positive values scale up while negative values scale down; for example, a value of "-10" scales the
     * fleet down by 10%.
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
     *        read as a percentage. Positive values scale up while negative values scale down; for example, a value of
     *        "-10" scales the fleet down by 10%.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalingAdjustmentType
     */

    public PutScalingPolicyRequest withScalingAdjustmentType(ScalingAdjustmentType scalingAdjustmentType) {
        setScalingAdjustmentType(scalingAdjustmentType);
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

    public PutScalingPolicyRequest withThreshold(Double threshold) {
        setThreshold(threshold);
        return this;
    }

    /**
     * <p>
     * Comparison operator to use when measuring the metric against the threshold value.
     * </p>
     * 
     * @param comparisonOperator
     *        Comparison operator to use when measuring the metric against the threshold value.
     * @see ComparisonOperatorType
     */

    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    /**
     * <p>
     * Comparison operator to use when measuring the metric against the threshold value.
     * </p>
     * 
     * @return Comparison operator to use when measuring the metric against the threshold value.
     * @see ComparisonOperatorType
     */

    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    /**
     * <p>
     * Comparison operator to use when measuring the metric against the threshold value.
     * </p>
     * 
     * @param comparisonOperator
     *        Comparison operator to use when measuring the metric against the threshold value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComparisonOperatorType
     */

    public PutScalingPolicyRequest withComparisonOperator(String comparisonOperator) {
        setComparisonOperator(comparisonOperator);
        return this;
    }

    /**
     * <p>
     * Comparison operator to use when measuring the metric against the threshold value.
     * </p>
     * 
     * @param comparisonOperator
     *        Comparison operator to use when measuring the metric against the threshold value.
     * @see ComparisonOperatorType
     */

    public void setComparisonOperator(ComparisonOperatorType comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
    }

    /**
     * <p>
     * Comparison operator to use when measuring the metric against the threshold value.
     * </p>
     * 
     * @param comparisonOperator
     *        Comparison operator to use when measuring the metric against the threshold value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComparisonOperatorType
     */

    public PutScalingPolicyRequest withComparisonOperator(ComparisonOperatorType comparisonOperator) {
        setComparisonOperator(comparisonOperator);
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

    public PutScalingPolicyRequest withEvaluationPeriods(Integer evaluationPeriods) {
        setEvaluationPeriods(evaluationPeriods);
        return this;
    }

    /**
     * <p>
     * Name of the Amazon GameLift-defined metric that is used to trigger an adjustment.
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
     * session count. This number includes game sessions that are not currently accepting players (game session
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
     *        Name of the Amazon GameLift-defined metric that is used to trigger an adjustment.</p>
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
     *        its maximum player session count. This number includes game sessions that are not currently accepting
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
     * Name of the Amazon GameLift-defined metric that is used to trigger an adjustment.
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
     * session count. This number includes game sessions that are not currently accepting players (game session
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
     * @return Name of the Amazon GameLift-defined metric that is used to trigger an adjustment.</p>
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
     *         its maximum player session count. This number includes game sessions that are not currently accepting
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
     * Name of the Amazon GameLift-defined metric that is used to trigger an adjustment.
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
     * session count. This number includes game sessions that are not currently accepting players (game session
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
     *        Name of the Amazon GameLift-defined metric that is used to trigger an adjustment.</p>
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
     *        its maximum player session count. This number includes game sessions that are not currently accepting
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

    public PutScalingPolicyRequest withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * Name of the Amazon GameLift-defined metric that is used to trigger an adjustment.
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
     * session count. This number includes game sessions that are not currently accepting players (game session
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
     *        Name of the Amazon GameLift-defined metric that is used to trigger an adjustment.</p>
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
     *        its maximum player session count. This number includes game sessions that are not currently accepting
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
     * Name of the Amazon GameLift-defined metric that is used to trigger an adjustment.
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
     * session count. This number includes game sessions that are not currently accepting players (game session
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
     *        Name of the Amazon GameLift-defined metric that is used to trigger an adjustment.</p>
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
     *        its maximum player session count. This number includes game sessions that are not currently accepting
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

    public PutScalingPolicyRequest withMetricName(MetricName metricName) {
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getFleetId() != null)
            sb.append("FleetId: " + getFleetId() + ",");
        if (getScalingAdjustment() != null)
            sb.append("ScalingAdjustment: " + getScalingAdjustment() + ",");
        if (getScalingAdjustmentType() != null)
            sb.append("ScalingAdjustmentType: " + getScalingAdjustmentType() + ",");
        if (getThreshold() != null)
            sb.append("Threshold: " + getThreshold() + ",");
        if (getComparisonOperator() != null)
            sb.append("ComparisonOperator: " + getComparisonOperator() + ",");
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

        if (obj instanceof PutScalingPolicyRequest == false)
            return false;
        PutScalingPolicyRequest other = (PutScalingPolicyRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getScalingAdjustment() == null ^ this.getScalingAdjustment() == null)
            return false;
        if (other.getScalingAdjustment() != null && other.getScalingAdjustment().equals(this.getScalingAdjustment()) == false)
            return false;
        if (other.getScalingAdjustmentType() == null ^ this.getScalingAdjustmentType() == null)
            return false;
        if (other.getScalingAdjustmentType() != null && other.getScalingAdjustmentType().equals(this.getScalingAdjustmentType()) == false)
            return false;
        if (other.getThreshold() == null ^ this.getThreshold() == null)
            return false;
        if (other.getThreshold() != null && other.getThreshold().equals(this.getThreshold()) == false)
            return false;
        if (other.getComparisonOperator() == null ^ this.getComparisonOperator() == null)
            return false;
        if (other.getComparisonOperator() != null && other.getComparisonOperator().equals(this.getComparisonOperator()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getScalingAdjustment() == null) ? 0 : getScalingAdjustment().hashCode());
        hashCode = prime * hashCode + ((getScalingAdjustmentType() == null) ? 0 : getScalingAdjustmentType().hashCode());
        hashCode = prime * hashCode + ((getThreshold() == null) ? 0 : getThreshold().hashCode());
        hashCode = prime * hashCode + ((getComparisonOperator() == null) ? 0 : getComparisonOperator().hashCode());
        hashCode = prime * hashCode + ((getEvaluationPeriods() == null) ? 0 : getEvaluationPeriods().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        return hashCode;
    }

    @Override
    public PutScalingPolicyRequest clone() {
        return (PutScalingPolicyRequest) super.clone();
    }
}
