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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/PutScalingPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutScalingPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Descriptive label that is associated with a scaling policy. Policy names do not need to be unique. A fleet can
     * have only one scaling policy with the same name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Unique identifier for a fleet to apply this policy to. The fleet cannot be in any of the following statuses:
     * ERROR or DELETING.
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
     * <b>ChangeInCapacity</b> -- add (or subtract) the scaling adjustment value from the current instance count.
     * Positive values scale up while negative values scale down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ExactCapacity</b> -- set the instance count to the scaling adjustment value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PercentChangeInCapacity</b> -- increase or reduce the current instance count by the scaling adjustment, read
     * as a percentage. Positive values scale up while negative values scale down; for example, a value of "-10" scales
     * the fleet down by 10%.
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
     * Name of the Amazon GameLift-defined metric that is used to trigger a scaling adjustment. For detailed
     * descriptions of fleet metrics, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/monitoring-cloudwatch.html">Monitor Amazon
     * GameLift with Amazon CloudWatch</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ActivatingGameSessions</b> -- Game sessions in the process of being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ActiveGameSessions</b> -- Game sessions that are currently running.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ActiveInstances</b> -- Fleet instances that are currently running at least one game session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AvailableGameSessions</b> -- Additional game sessions that fleet could host simultaneously, given current
     * capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AvailablePlayerSessions</b> -- Empty player slots in currently active game sessions. This includes game
     * sessions that are not currently accepting players. Reserved player slots are not included.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CurrentPlayerSessions</b> -- Player slots in active game sessions that are being used by a player or are
     * reserved for a player.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IdleInstances</b> -- Active instances that are currently hosting zero game sessions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PercentAvailableGameSessions</b> -- Unused percentage of the total number of game sessions that a fleet could
     * host simultaneously, given current capacity. Use this metric for a target-based scaling policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PercentIdleInstances</b> -- Percentage of the total number of active instances that are hosting zero game
     * sessions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>QueueDepth</b> -- Pending game session placement requests, in any queue, where the current fleet is the
     * top-priority destination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>WaitTime</b> -- Current wait time for pending game session placement requests, in any queue, where the current
     * fleet is the top-priority destination.
     * </p>
     * </li>
     * </ul>
     */
    private String metricName;
    /**
     * <p>
     * Type of scaling policy to create. For a target-based policy, set the parameter <i>MetricName</i> to
     * 'PercentAvailableGameSessions' and specify a <i>TargetConfiguration</i>. For a rule-based policy set the
     * following parameters: <i>MetricName</i>, <i>ComparisonOperator</i>, <i>Threshold</i>, <i>EvaluationPeriods</i>,
     * <i>ScalingAdjustmentType</i>, and <i>ScalingAdjustment</i>.
     * </p>
     */
    private String policyType;
    /**
     * <p>
     * Object that contains settings for a target-based scaling policy.
     * </p>
     */
    private TargetConfiguration targetConfiguration;

    /**
     * <p>
     * Descriptive label that is associated with a scaling policy. Policy names do not need to be unique. A fleet can
     * have only one scaling policy with the same name.
     * </p>
     * 
     * @param name
     *        Descriptive label that is associated with a scaling policy. Policy names do not need to be unique. A fleet
     *        can have only one scaling policy with the same name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Descriptive label that is associated with a scaling policy. Policy names do not need to be unique. A fleet can
     * have only one scaling policy with the same name.
     * </p>
     * 
     * @return Descriptive label that is associated with a scaling policy. Policy names do not need to be unique. A
     *         fleet can have only one scaling policy with the same name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Descriptive label that is associated with a scaling policy. Policy names do not need to be unique. A fleet can
     * have only one scaling policy with the same name.
     * </p>
     * 
     * @param name
     *        Descriptive label that is associated with a scaling policy. Policy names do not need to be unique. A fleet
     *        can have only one scaling policy with the same name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutScalingPolicyRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Unique identifier for a fleet to apply this policy to. The fleet cannot be in any of the following statuses:
     * ERROR or DELETING.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet to apply this policy to. The fleet cannot be in any of the following
     *        statuses: ERROR or DELETING.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet to apply this policy to. The fleet cannot be in any of the following statuses:
     * ERROR or DELETING.
     * </p>
     * 
     * @return Unique identifier for a fleet to apply this policy to. The fleet cannot be in any of the following
     *         statuses: ERROR or DELETING.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet to apply this policy to. The fleet cannot be in any of the following statuses:
     * ERROR or DELETING.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet to apply this policy to. The fleet cannot be in any of the following
     *        statuses: ERROR or DELETING.
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
     * <b>ChangeInCapacity</b> -- add (or subtract) the scaling adjustment value from the current instance count.
     * Positive values scale up while negative values scale down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ExactCapacity</b> -- set the instance count to the scaling adjustment value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PercentChangeInCapacity</b> -- increase or reduce the current instance count by the scaling adjustment, read
     * as a percentage. Positive values scale up while negative values scale down; for example, a value of "-10" scales
     * the fleet down by 10%.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scalingAdjustmentType
     *        Type of adjustment to make to a fleet's instance count (see <a>FleetCapacity</a>):</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ChangeInCapacity</b> -- add (or subtract) the scaling adjustment value from the current instance count.
     *        Positive values scale up while negative values scale down.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ExactCapacity</b> -- set the instance count to the scaling adjustment value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PercentChangeInCapacity</b> -- increase or reduce the current instance count by the scaling adjustment,
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
     * <b>ChangeInCapacity</b> -- add (or subtract) the scaling adjustment value from the current instance count.
     * Positive values scale up while negative values scale down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ExactCapacity</b> -- set the instance count to the scaling adjustment value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PercentChangeInCapacity</b> -- increase or reduce the current instance count by the scaling adjustment, read
     * as a percentage. Positive values scale up while negative values scale down; for example, a value of "-10" scales
     * the fleet down by 10%.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Type of adjustment to make to a fleet's instance count (see <a>FleetCapacity</a>):</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>ChangeInCapacity</b> -- add (or subtract) the scaling adjustment value from the current instance
     *         count. Positive values scale up while negative values scale down.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ExactCapacity</b> -- set the instance count to the scaling adjustment value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>PercentChangeInCapacity</b> -- increase or reduce the current instance count by the scaling
     *         adjustment, read as a percentage. Positive values scale up while negative values scale down; for example,
     *         a value of "-10" scales the fleet down by 10%.
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
     * <b>ChangeInCapacity</b> -- add (or subtract) the scaling adjustment value from the current instance count.
     * Positive values scale up while negative values scale down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ExactCapacity</b> -- set the instance count to the scaling adjustment value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PercentChangeInCapacity</b> -- increase or reduce the current instance count by the scaling adjustment, read
     * as a percentage. Positive values scale up while negative values scale down; for example, a value of "-10" scales
     * the fleet down by 10%.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scalingAdjustmentType
     *        Type of adjustment to make to a fleet's instance count (see <a>FleetCapacity</a>):</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ChangeInCapacity</b> -- add (or subtract) the scaling adjustment value from the current instance count.
     *        Positive values scale up while negative values scale down.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ExactCapacity</b> -- set the instance count to the scaling adjustment value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PercentChangeInCapacity</b> -- increase or reduce the current instance count by the scaling adjustment,
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
     * <b>ChangeInCapacity</b> -- add (or subtract) the scaling adjustment value from the current instance count.
     * Positive values scale up while negative values scale down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ExactCapacity</b> -- set the instance count to the scaling adjustment value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PercentChangeInCapacity</b> -- increase or reduce the current instance count by the scaling adjustment, read
     * as a percentage. Positive values scale up while negative values scale down; for example, a value of "-10" scales
     * the fleet down by 10%.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scalingAdjustmentType
     *        Type of adjustment to make to a fleet's instance count (see <a>FleetCapacity</a>):</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ChangeInCapacity</b> -- add (or subtract) the scaling adjustment value from the current instance count.
     *        Positive values scale up while negative values scale down.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ExactCapacity</b> -- set the instance count to the scaling adjustment value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PercentChangeInCapacity</b> -- increase or reduce the current instance count by the scaling adjustment,
     *        read as a percentage. Positive values scale up while negative values scale down; for example, a value of
     *        "-10" scales the fleet down by 10%.
     *        </p>
     *        </li>
     * @see ScalingAdjustmentType
     */

    public void setScalingAdjustmentType(ScalingAdjustmentType scalingAdjustmentType) {
        withScalingAdjustmentType(scalingAdjustmentType);
    }

    /**
     * <p>
     * Type of adjustment to make to a fleet's instance count (see <a>FleetCapacity</a>):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ChangeInCapacity</b> -- add (or subtract) the scaling adjustment value from the current instance count.
     * Positive values scale up while negative values scale down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ExactCapacity</b> -- set the instance count to the scaling adjustment value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PercentChangeInCapacity</b> -- increase or reduce the current instance count by the scaling adjustment, read
     * as a percentage. Positive values scale up while negative values scale down; for example, a value of "-10" scales
     * the fleet down by 10%.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scalingAdjustmentType
     *        Type of adjustment to make to a fleet's instance count (see <a>FleetCapacity</a>):</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ChangeInCapacity</b> -- add (or subtract) the scaling adjustment value from the current instance count.
     *        Positive values scale up while negative values scale down.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ExactCapacity</b> -- set the instance count to the scaling adjustment value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PercentChangeInCapacity</b> -- increase or reduce the current instance count by the scaling adjustment,
     *        read as a percentage. Positive values scale up while negative values scale down; for example, a value of
     *        "-10" scales the fleet down by 10%.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalingAdjustmentType
     */

    public PutScalingPolicyRequest withScalingAdjustmentType(ScalingAdjustmentType scalingAdjustmentType) {
        this.scalingAdjustmentType = scalingAdjustmentType.toString();
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
        withComparisonOperator(comparisonOperator);
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
        this.comparisonOperator = comparisonOperator.toString();
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
     * Name of the Amazon GameLift-defined metric that is used to trigger a scaling adjustment. For detailed
     * descriptions of fleet metrics, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/monitoring-cloudwatch.html">Monitor Amazon
     * GameLift with Amazon CloudWatch</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ActivatingGameSessions</b> -- Game sessions in the process of being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ActiveGameSessions</b> -- Game sessions that are currently running.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ActiveInstances</b> -- Fleet instances that are currently running at least one game session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AvailableGameSessions</b> -- Additional game sessions that fleet could host simultaneously, given current
     * capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AvailablePlayerSessions</b> -- Empty player slots in currently active game sessions. This includes game
     * sessions that are not currently accepting players. Reserved player slots are not included.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CurrentPlayerSessions</b> -- Player slots in active game sessions that are being used by a player or are
     * reserved for a player.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IdleInstances</b> -- Active instances that are currently hosting zero game sessions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PercentAvailableGameSessions</b> -- Unused percentage of the total number of game sessions that a fleet could
     * host simultaneously, given current capacity. Use this metric for a target-based scaling policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PercentIdleInstances</b> -- Percentage of the total number of active instances that are hosting zero game
     * sessions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>QueueDepth</b> -- Pending game session placement requests, in any queue, where the current fleet is the
     * top-priority destination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>WaitTime</b> -- Current wait time for pending game session placement requests, in any queue, where the current
     * fleet is the top-priority destination.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metricName
     *        Name of the Amazon GameLift-defined metric that is used to trigger a scaling adjustment. For detailed
     *        descriptions of fleet metrics, see <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/monitoring-cloudwatch.html">Monitor
     *        Amazon GameLift with Amazon CloudWatch</a>. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ActivatingGameSessions</b> -- Game sessions in the process of being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ActiveGameSessions</b> -- Game sessions that are currently running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ActiveInstances</b> -- Fleet instances that are currently running at least one game session.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AvailableGameSessions</b> -- Additional game sessions that fleet could host simultaneously, given
     *        current capacity.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AvailablePlayerSessions</b> -- Empty player slots in currently active game sessions. This includes game
     *        sessions that are not currently accepting players. Reserved player slots are not included.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CurrentPlayerSessions</b> -- Player slots in active game sessions that are being used by a player or
     *        are reserved for a player.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>IdleInstances</b> -- Active instances that are currently hosting zero game sessions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PercentAvailableGameSessions</b> -- Unused percentage of the total number of game sessions that a fleet
     *        could host simultaneously, given current capacity. Use this metric for a target-based scaling policy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PercentIdleInstances</b> -- Percentage of the total number of active instances that are hosting zero
     *        game sessions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>QueueDepth</b> -- Pending game session placement requests, in any queue, where the current fleet is the
     *        top-priority destination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>WaitTime</b> -- Current wait time for pending game session placement requests, in any queue, where the
     *        current fleet is the top-priority destination.
     *        </p>
     *        </li>
     * @see MetricName
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * Name of the Amazon GameLift-defined metric that is used to trigger a scaling adjustment. For detailed
     * descriptions of fleet metrics, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/monitoring-cloudwatch.html">Monitor Amazon
     * GameLift with Amazon CloudWatch</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ActivatingGameSessions</b> -- Game sessions in the process of being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ActiveGameSessions</b> -- Game sessions that are currently running.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ActiveInstances</b> -- Fleet instances that are currently running at least one game session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AvailableGameSessions</b> -- Additional game sessions that fleet could host simultaneously, given current
     * capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AvailablePlayerSessions</b> -- Empty player slots in currently active game sessions. This includes game
     * sessions that are not currently accepting players. Reserved player slots are not included.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CurrentPlayerSessions</b> -- Player slots in active game sessions that are being used by a player or are
     * reserved for a player.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IdleInstances</b> -- Active instances that are currently hosting zero game sessions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PercentAvailableGameSessions</b> -- Unused percentage of the total number of game sessions that a fleet could
     * host simultaneously, given current capacity. Use this metric for a target-based scaling policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PercentIdleInstances</b> -- Percentage of the total number of active instances that are hosting zero game
     * sessions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>QueueDepth</b> -- Pending game session placement requests, in any queue, where the current fleet is the
     * top-priority destination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>WaitTime</b> -- Current wait time for pending game session placement requests, in any queue, where the current
     * fleet is the top-priority destination.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Name of the Amazon GameLift-defined metric that is used to trigger a scaling adjustment. For detailed
     *         descriptions of fleet metrics, see <a
     *         href="https://docs.aws.amazon.com/gamelift/latest/developerguide/monitoring-cloudwatch.html">Monitor
     *         Amazon GameLift with Amazon CloudWatch</a>. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>ActivatingGameSessions</b> -- Game sessions in the process of being created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ActiveGameSessions</b> -- Game sessions that are currently running.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ActiveInstances</b> -- Fleet instances that are currently running at least one game session.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>AvailableGameSessions</b> -- Additional game sessions that fleet could host simultaneously, given
     *         current capacity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>AvailablePlayerSessions</b> -- Empty player slots in currently active game sessions. This includes
     *         game sessions that are not currently accepting players. Reserved player slots are not included.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>CurrentPlayerSessions</b> -- Player slots in active game sessions that are being used by a player or
     *         are reserved for a player.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>IdleInstances</b> -- Active instances that are currently hosting zero game sessions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>PercentAvailableGameSessions</b> -- Unused percentage of the total number of game sessions that a
     *         fleet could host simultaneously, given current capacity. Use this metric for a target-based scaling
     *         policy.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>PercentIdleInstances</b> -- Percentage of the total number of active instances that are hosting zero
     *         game sessions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>QueueDepth</b> -- Pending game session placement requests, in any queue, where the current fleet is
     *         the top-priority destination.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>WaitTime</b> -- Current wait time for pending game session placement requests, in any queue, where the
     *         current fleet is the top-priority destination.
     *         </p>
     *         </li>
     * @see MetricName
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * Name of the Amazon GameLift-defined metric that is used to trigger a scaling adjustment. For detailed
     * descriptions of fleet metrics, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/monitoring-cloudwatch.html">Monitor Amazon
     * GameLift with Amazon CloudWatch</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ActivatingGameSessions</b> -- Game sessions in the process of being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ActiveGameSessions</b> -- Game sessions that are currently running.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ActiveInstances</b> -- Fleet instances that are currently running at least one game session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AvailableGameSessions</b> -- Additional game sessions that fleet could host simultaneously, given current
     * capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AvailablePlayerSessions</b> -- Empty player slots in currently active game sessions. This includes game
     * sessions that are not currently accepting players. Reserved player slots are not included.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CurrentPlayerSessions</b> -- Player slots in active game sessions that are being used by a player or are
     * reserved for a player.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IdleInstances</b> -- Active instances that are currently hosting zero game sessions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PercentAvailableGameSessions</b> -- Unused percentage of the total number of game sessions that a fleet could
     * host simultaneously, given current capacity. Use this metric for a target-based scaling policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PercentIdleInstances</b> -- Percentage of the total number of active instances that are hosting zero game
     * sessions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>QueueDepth</b> -- Pending game session placement requests, in any queue, where the current fleet is the
     * top-priority destination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>WaitTime</b> -- Current wait time for pending game session placement requests, in any queue, where the current
     * fleet is the top-priority destination.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metricName
     *        Name of the Amazon GameLift-defined metric that is used to trigger a scaling adjustment. For detailed
     *        descriptions of fleet metrics, see <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/monitoring-cloudwatch.html">Monitor
     *        Amazon GameLift with Amazon CloudWatch</a>. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ActivatingGameSessions</b> -- Game sessions in the process of being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ActiveGameSessions</b> -- Game sessions that are currently running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ActiveInstances</b> -- Fleet instances that are currently running at least one game session.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AvailableGameSessions</b> -- Additional game sessions that fleet could host simultaneously, given
     *        current capacity.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AvailablePlayerSessions</b> -- Empty player slots in currently active game sessions. This includes game
     *        sessions that are not currently accepting players. Reserved player slots are not included.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CurrentPlayerSessions</b> -- Player slots in active game sessions that are being used by a player or
     *        are reserved for a player.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>IdleInstances</b> -- Active instances that are currently hosting zero game sessions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PercentAvailableGameSessions</b> -- Unused percentage of the total number of game sessions that a fleet
     *        could host simultaneously, given current capacity. Use this metric for a target-based scaling policy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PercentIdleInstances</b> -- Percentage of the total number of active instances that are hosting zero
     *        game sessions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>QueueDepth</b> -- Pending game session placement requests, in any queue, where the current fleet is the
     *        top-priority destination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>WaitTime</b> -- Current wait time for pending game session placement requests, in any queue, where the
     *        current fleet is the top-priority destination.
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
     * Name of the Amazon GameLift-defined metric that is used to trigger a scaling adjustment. For detailed
     * descriptions of fleet metrics, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/monitoring-cloudwatch.html">Monitor Amazon
     * GameLift with Amazon CloudWatch</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ActivatingGameSessions</b> -- Game sessions in the process of being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ActiveGameSessions</b> -- Game sessions that are currently running.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ActiveInstances</b> -- Fleet instances that are currently running at least one game session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AvailableGameSessions</b> -- Additional game sessions that fleet could host simultaneously, given current
     * capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AvailablePlayerSessions</b> -- Empty player slots in currently active game sessions. This includes game
     * sessions that are not currently accepting players. Reserved player slots are not included.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CurrentPlayerSessions</b> -- Player slots in active game sessions that are being used by a player or are
     * reserved for a player.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IdleInstances</b> -- Active instances that are currently hosting zero game sessions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PercentAvailableGameSessions</b> -- Unused percentage of the total number of game sessions that a fleet could
     * host simultaneously, given current capacity. Use this metric for a target-based scaling policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PercentIdleInstances</b> -- Percentage of the total number of active instances that are hosting zero game
     * sessions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>QueueDepth</b> -- Pending game session placement requests, in any queue, where the current fleet is the
     * top-priority destination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>WaitTime</b> -- Current wait time for pending game session placement requests, in any queue, where the current
     * fleet is the top-priority destination.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metricName
     *        Name of the Amazon GameLift-defined metric that is used to trigger a scaling adjustment. For detailed
     *        descriptions of fleet metrics, see <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/monitoring-cloudwatch.html">Monitor
     *        Amazon GameLift with Amazon CloudWatch</a>. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ActivatingGameSessions</b> -- Game sessions in the process of being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ActiveGameSessions</b> -- Game sessions that are currently running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ActiveInstances</b> -- Fleet instances that are currently running at least one game session.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AvailableGameSessions</b> -- Additional game sessions that fleet could host simultaneously, given
     *        current capacity.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AvailablePlayerSessions</b> -- Empty player slots in currently active game sessions. This includes game
     *        sessions that are not currently accepting players. Reserved player slots are not included.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CurrentPlayerSessions</b> -- Player slots in active game sessions that are being used by a player or
     *        are reserved for a player.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>IdleInstances</b> -- Active instances that are currently hosting zero game sessions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PercentAvailableGameSessions</b> -- Unused percentage of the total number of game sessions that a fleet
     *        could host simultaneously, given current capacity. Use this metric for a target-based scaling policy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PercentIdleInstances</b> -- Percentage of the total number of active instances that are hosting zero
     *        game sessions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>QueueDepth</b> -- Pending game session placement requests, in any queue, where the current fleet is the
     *        top-priority destination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>WaitTime</b> -- Current wait time for pending game session placement requests, in any queue, where the
     *        current fleet is the top-priority destination.
     *        </p>
     *        </li>
     * @see MetricName
     */

    public void setMetricName(MetricName metricName) {
        withMetricName(metricName);
    }

    /**
     * <p>
     * Name of the Amazon GameLift-defined metric that is used to trigger a scaling adjustment. For detailed
     * descriptions of fleet metrics, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/monitoring-cloudwatch.html">Monitor Amazon
     * GameLift with Amazon CloudWatch</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ActivatingGameSessions</b> -- Game sessions in the process of being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ActiveGameSessions</b> -- Game sessions that are currently running.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ActiveInstances</b> -- Fleet instances that are currently running at least one game session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AvailableGameSessions</b> -- Additional game sessions that fleet could host simultaneously, given current
     * capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AvailablePlayerSessions</b> -- Empty player slots in currently active game sessions. This includes game
     * sessions that are not currently accepting players. Reserved player slots are not included.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CurrentPlayerSessions</b> -- Player slots in active game sessions that are being used by a player or are
     * reserved for a player.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IdleInstances</b> -- Active instances that are currently hosting zero game sessions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PercentAvailableGameSessions</b> -- Unused percentage of the total number of game sessions that a fleet could
     * host simultaneously, given current capacity. Use this metric for a target-based scaling policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PercentIdleInstances</b> -- Percentage of the total number of active instances that are hosting zero game
     * sessions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>QueueDepth</b> -- Pending game session placement requests, in any queue, where the current fleet is the
     * top-priority destination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>WaitTime</b> -- Current wait time for pending game session placement requests, in any queue, where the current
     * fleet is the top-priority destination.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metricName
     *        Name of the Amazon GameLift-defined metric that is used to trigger a scaling adjustment. For detailed
     *        descriptions of fleet metrics, see <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/monitoring-cloudwatch.html">Monitor
     *        Amazon GameLift with Amazon CloudWatch</a>. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ActivatingGameSessions</b> -- Game sessions in the process of being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ActiveGameSessions</b> -- Game sessions that are currently running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ActiveInstances</b> -- Fleet instances that are currently running at least one game session.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AvailableGameSessions</b> -- Additional game sessions that fleet could host simultaneously, given
     *        current capacity.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AvailablePlayerSessions</b> -- Empty player slots in currently active game sessions. This includes game
     *        sessions that are not currently accepting players. Reserved player slots are not included.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CurrentPlayerSessions</b> -- Player slots in active game sessions that are being used by a player or
     *        are reserved for a player.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>IdleInstances</b> -- Active instances that are currently hosting zero game sessions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PercentAvailableGameSessions</b> -- Unused percentage of the total number of game sessions that a fleet
     *        could host simultaneously, given current capacity. Use this metric for a target-based scaling policy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PercentIdleInstances</b> -- Percentage of the total number of active instances that are hosting zero
     *        game sessions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>QueueDepth</b> -- Pending game session placement requests, in any queue, where the current fleet is the
     *        top-priority destination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>WaitTime</b> -- Current wait time for pending game session placement requests, in any queue, where the
     *        current fleet is the top-priority destination.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricName
     */

    public PutScalingPolicyRequest withMetricName(MetricName metricName) {
        this.metricName = metricName.toString();
        return this;
    }

    /**
     * <p>
     * Type of scaling policy to create. For a target-based policy, set the parameter <i>MetricName</i> to
     * 'PercentAvailableGameSessions' and specify a <i>TargetConfiguration</i>. For a rule-based policy set the
     * following parameters: <i>MetricName</i>, <i>ComparisonOperator</i>, <i>Threshold</i>, <i>EvaluationPeriods</i>,
     * <i>ScalingAdjustmentType</i>, and <i>ScalingAdjustment</i>.
     * </p>
     * 
     * @param policyType
     *        Type of scaling policy to create. For a target-based policy, set the parameter <i>MetricName</i> to
     *        'PercentAvailableGameSessions' and specify a <i>TargetConfiguration</i>. For a rule-based policy set the
     *        following parameters: <i>MetricName</i>, <i>ComparisonOperator</i>, <i>Threshold</i>,
     *        <i>EvaluationPeriods</i>, <i>ScalingAdjustmentType</i>, and <i>ScalingAdjustment</i>.
     * @see PolicyType
     */

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    /**
     * <p>
     * Type of scaling policy to create. For a target-based policy, set the parameter <i>MetricName</i> to
     * 'PercentAvailableGameSessions' and specify a <i>TargetConfiguration</i>. For a rule-based policy set the
     * following parameters: <i>MetricName</i>, <i>ComparisonOperator</i>, <i>Threshold</i>, <i>EvaluationPeriods</i>,
     * <i>ScalingAdjustmentType</i>, and <i>ScalingAdjustment</i>.
     * </p>
     * 
     * @return Type of scaling policy to create. For a target-based policy, set the parameter <i>MetricName</i> to
     *         'PercentAvailableGameSessions' and specify a <i>TargetConfiguration</i>. For a rule-based policy set the
     *         following parameters: <i>MetricName</i>, <i>ComparisonOperator</i>, <i>Threshold</i>,
     *         <i>EvaluationPeriods</i>, <i>ScalingAdjustmentType</i>, and <i>ScalingAdjustment</i>.
     * @see PolicyType
     */

    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * <p>
     * Type of scaling policy to create. For a target-based policy, set the parameter <i>MetricName</i> to
     * 'PercentAvailableGameSessions' and specify a <i>TargetConfiguration</i>. For a rule-based policy set the
     * following parameters: <i>MetricName</i>, <i>ComparisonOperator</i>, <i>Threshold</i>, <i>EvaluationPeriods</i>,
     * <i>ScalingAdjustmentType</i>, and <i>ScalingAdjustment</i>.
     * </p>
     * 
     * @param policyType
     *        Type of scaling policy to create. For a target-based policy, set the parameter <i>MetricName</i> to
     *        'PercentAvailableGameSessions' and specify a <i>TargetConfiguration</i>. For a rule-based policy set the
     *        following parameters: <i>MetricName</i>, <i>ComparisonOperator</i>, <i>Threshold</i>,
     *        <i>EvaluationPeriods</i>, <i>ScalingAdjustmentType</i>, and <i>ScalingAdjustment</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyType
     */

    public PutScalingPolicyRequest withPolicyType(String policyType) {
        setPolicyType(policyType);
        return this;
    }

    /**
     * <p>
     * Type of scaling policy to create. For a target-based policy, set the parameter <i>MetricName</i> to
     * 'PercentAvailableGameSessions' and specify a <i>TargetConfiguration</i>. For a rule-based policy set the
     * following parameters: <i>MetricName</i>, <i>ComparisonOperator</i>, <i>Threshold</i>, <i>EvaluationPeriods</i>,
     * <i>ScalingAdjustmentType</i>, and <i>ScalingAdjustment</i>.
     * </p>
     * 
     * @param policyType
     *        Type of scaling policy to create. For a target-based policy, set the parameter <i>MetricName</i> to
     *        'PercentAvailableGameSessions' and specify a <i>TargetConfiguration</i>. For a rule-based policy set the
     *        following parameters: <i>MetricName</i>, <i>ComparisonOperator</i>, <i>Threshold</i>,
     *        <i>EvaluationPeriods</i>, <i>ScalingAdjustmentType</i>, and <i>ScalingAdjustment</i>.
     * @see PolicyType
     */

    public void setPolicyType(PolicyType policyType) {
        withPolicyType(policyType);
    }

    /**
     * <p>
     * Type of scaling policy to create. For a target-based policy, set the parameter <i>MetricName</i> to
     * 'PercentAvailableGameSessions' and specify a <i>TargetConfiguration</i>. For a rule-based policy set the
     * following parameters: <i>MetricName</i>, <i>ComparisonOperator</i>, <i>Threshold</i>, <i>EvaluationPeriods</i>,
     * <i>ScalingAdjustmentType</i>, and <i>ScalingAdjustment</i>.
     * </p>
     * 
     * @param policyType
     *        Type of scaling policy to create. For a target-based policy, set the parameter <i>MetricName</i> to
     *        'PercentAvailableGameSessions' and specify a <i>TargetConfiguration</i>. For a rule-based policy set the
     *        following parameters: <i>MetricName</i>, <i>ComparisonOperator</i>, <i>Threshold</i>,
     *        <i>EvaluationPeriods</i>, <i>ScalingAdjustmentType</i>, and <i>ScalingAdjustment</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyType
     */

    public PutScalingPolicyRequest withPolicyType(PolicyType policyType) {
        this.policyType = policyType.toString();
        return this;
    }

    /**
     * <p>
     * Object that contains settings for a target-based scaling policy.
     * </p>
     * 
     * @param targetConfiguration
     *        Object that contains settings for a target-based scaling policy.
     */

    public void setTargetConfiguration(TargetConfiguration targetConfiguration) {
        this.targetConfiguration = targetConfiguration;
    }

    /**
     * <p>
     * Object that contains settings for a target-based scaling policy.
     * </p>
     * 
     * @return Object that contains settings for a target-based scaling policy.
     */

    public TargetConfiguration getTargetConfiguration() {
        return this.targetConfiguration;
    }

    /**
     * <p>
     * Object that contains settings for a target-based scaling policy.
     * </p>
     * 
     * @param targetConfiguration
     *        Object that contains settings for a target-based scaling policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutScalingPolicyRequest withTargetConfiguration(TargetConfiguration targetConfiguration) {
        setTargetConfiguration(targetConfiguration);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
        if (getScalingAdjustment() != null)
            sb.append("ScalingAdjustment: ").append(getScalingAdjustment()).append(",");
        if (getScalingAdjustmentType() != null)
            sb.append("ScalingAdjustmentType: ").append(getScalingAdjustmentType()).append(",");
        if (getThreshold() != null)
            sb.append("Threshold: ").append(getThreshold()).append(",");
        if (getComparisonOperator() != null)
            sb.append("ComparisonOperator: ").append(getComparisonOperator()).append(",");
        if (getEvaluationPeriods() != null)
            sb.append("EvaluationPeriods: ").append(getEvaluationPeriods()).append(",");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getPolicyType() != null)
            sb.append("PolicyType: ").append(getPolicyType()).append(",");
        if (getTargetConfiguration() != null)
            sb.append("TargetConfiguration: ").append(getTargetConfiguration());
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
        if (other.getPolicyType() == null ^ this.getPolicyType() == null)
            return false;
        if (other.getPolicyType() != null && other.getPolicyType().equals(this.getPolicyType()) == false)
            return false;
        if (other.getTargetConfiguration() == null ^ this.getTargetConfiguration() == null)
            return false;
        if (other.getTargetConfiguration() != null && other.getTargetConfiguration().equals(this.getTargetConfiguration()) == false)
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
        hashCode = prime * hashCode + ((getPolicyType() == null) ? 0 : getPolicyType().hashCode());
        hashCode = prime * hashCode + ((getTargetConfiguration() == null) ? 0 : getTargetConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public PutScalingPolicyRequest clone() {
        return (PutScalingPolicyRequest) super.clone();
    }

}
