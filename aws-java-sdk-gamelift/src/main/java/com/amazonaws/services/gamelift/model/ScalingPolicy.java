/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Rule that controls how a fleet is scaled. Scaling policies are uniquely identified by the combination of name and
 * fleet ID.
 * </p>
 * <p>
 * <b>Related actions</b>
 * </p>
 * <p>
 * <a>DescribeFleetCapacity</a> | <a>UpdateFleetCapacity</a> | <a>DescribeEC2InstanceLimits</a> |
 * <a>PutScalingPolicy</a> | <a>DescribeScalingPolicies</a> | <a>DeleteScalingPolicy</a> | <a>StopFleetActions</a> |
 * <a>StartFleetActions</a> | <a href=
 * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
 * >All APIs by task</a>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ScalingPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScalingPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the fleet that is associated with this scaling policy.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to a GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions.
     * Format is <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     * </p>
     */
    private String fleetArn;
    /**
     * <p>
     * A descriptive label that is associated with a fleet's scaling policy. Policy names do not need to be unique.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Current status of the scaling policy. The scaling policy can be in force only when in an <code>ACTIVE</code>
     * status. Scaling policies can be suspended for individual fleets (see <a>StopFleetActions</a>; if suspended for a
     * fleet, the policy status does not change. View a fleet's stopped actions by calling <a>DescribeFleetCapacity</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ACTIVE</b> -- The scaling policy can be used for auto-scaling a fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATE_REQUESTED</b> -- A request to update the scaling policy has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATING</b> -- A change is being made to the scaling policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETE_REQUESTED</b> -- A request to delete the scaling policy has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETING</b> -- The scaling policy is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETED</b> -- The scaling policy has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ERROR</b> -- An error occurred in creating the policy. It should be removed and recreated.
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
     * The type of adjustment to make to a fleet's instance count (see <a>FleetCapacity</a>):
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
     * as a percentage. Positive values scale up while negative values scale down.
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
     * The type of scaling policy to create. For a target-based policy, set the parameter <i>MetricName</i> to
     * 'PercentAvailableGameSessions' and specify a <i>TargetConfiguration</i>. For a rule-based policy set the
     * following parameters: <i>MetricName</i>, <i>ComparisonOperator</i>, <i>Threshold</i>, <i>EvaluationPeriods</i>,
     * <i>ScalingAdjustmentType</i>, and <i>ScalingAdjustment</i>.
     * </p>
     */
    private String policyType;
    /**
     * <p>
     * An object that contains settings for a target-based scaling policy.
     * </p>
     */
    private TargetConfiguration targetConfiguration;
    /**
     * <p>
     * The current status of the fleet's scaling policies in a requested fleet location. The status
     * <code>PENDING_UPDATE</code> indicates that an update was requested for the fleet but has not yet been completed
     * for the location.
     * </p>
     */
    private String updateStatus;
    /**
     * <p>
     * </p>
     */
    private String location;

    /**
     * <p>
     * A unique identifier for the fleet that is associated with this scaling policy.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet that is associated with this scaling policy.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet that is associated with this scaling policy.
     * </p>
     * 
     * @return A unique identifier for the fleet that is associated with this scaling policy.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet that is associated with this scaling policy.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet that is associated with this scaling policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPolicy withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to a GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions.
     * Format is <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     * </p>
     * 
     * @param fleetArn
     *        The Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that is assigned to a
     *        GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions. Format is
     *        <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     */

    public void setFleetArn(String fleetArn) {
        this.fleetArn = fleetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to a GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions.
     * Format is <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (<a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that is assigned to a
     *         GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions. Format is
     *         <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     */

    public String getFleetArn() {
        return this.fleetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to a GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions.
     * Format is <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     * </p>
     * 
     * @param fleetArn
     *        The Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that is assigned to a
     *        GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions. Format is
     *        <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPolicy withFleetArn(String fleetArn) {
        setFleetArn(fleetArn);
        return this;
    }

    /**
     * <p>
     * A descriptive label that is associated with a fleet's scaling policy. Policy names do not need to be unique.
     * </p>
     * 
     * @param name
     *        A descriptive label that is associated with a fleet's scaling policy. Policy names do not need to be
     *        unique.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A descriptive label that is associated with a fleet's scaling policy. Policy names do not need to be unique.
     * </p>
     * 
     * @return A descriptive label that is associated with a fleet's scaling policy. Policy names do not need to be
     *         unique.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A descriptive label that is associated with a fleet's scaling policy. Policy names do not need to be unique.
     * </p>
     * 
     * @param name
     *        A descriptive label that is associated with a fleet's scaling policy. Policy names do not need to be
     *        unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPolicy withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Current status of the scaling policy. The scaling policy can be in force only when in an <code>ACTIVE</code>
     * status. Scaling policies can be suspended for individual fleets (see <a>StopFleetActions</a>; if suspended for a
     * fleet, the policy status does not change. View a fleet's stopped actions by calling <a>DescribeFleetCapacity</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ACTIVE</b> -- The scaling policy can be used for auto-scaling a fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATE_REQUESTED</b> -- A request to update the scaling policy has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATING</b> -- A change is being made to the scaling policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETE_REQUESTED</b> -- A request to delete the scaling policy has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETING</b> -- The scaling policy is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETED</b> -- The scaling policy has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ERROR</b> -- An error occurred in creating the policy. It should be removed and recreated.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Current status of the scaling policy. The scaling policy can be in force only when in an
     *        <code>ACTIVE</code> status. Scaling policies can be suspended for individual fleets (see
     *        <a>StopFleetActions</a>; if suspended for a fleet, the policy status does not change. View a fleet's
     *        stopped actions by calling <a>DescribeFleetCapacity</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ACTIVE</b> -- The scaling policy can be used for auto-scaling a fleet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>UPDATE_REQUESTED</b> -- A request to update the scaling policy has been received.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>UPDATING</b> -- A change is being made to the scaling policy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETE_REQUESTED</b> -- A request to delete the scaling policy has been received.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETING</b> -- The scaling policy is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETED</b> -- The scaling policy has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ERROR</b> -- An error occurred in creating the policy. It should be removed and recreated.
     *        </p>
     *        </li>
     * @see ScalingStatusType
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Current status of the scaling policy. The scaling policy can be in force only when in an <code>ACTIVE</code>
     * status. Scaling policies can be suspended for individual fleets (see <a>StopFleetActions</a>; if suspended for a
     * fleet, the policy status does not change. View a fleet's stopped actions by calling <a>DescribeFleetCapacity</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ACTIVE</b> -- The scaling policy can be used for auto-scaling a fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATE_REQUESTED</b> -- A request to update the scaling policy has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATING</b> -- A change is being made to the scaling policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETE_REQUESTED</b> -- A request to delete the scaling policy has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETING</b> -- The scaling policy is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETED</b> -- The scaling policy has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ERROR</b> -- An error occurred in creating the policy. It should be removed and recreated.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Current status of the scaling policy. The scaling policy can be in force only when in an
     *         <code>ACTIVE</code> status. Scaling policies can be suspended for individual fleets (see
     *         <a>StopFleetActions</a>; if suspended for a fleet, the policy status does not change. View a fleet's
     *         stopped actions by calling <a>DescribeFleetCapacity</a>.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>ACTIVE</b> -- The scaling policy can be used for auto-scaling a fleet.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UPDATE_REQUESTED</b> -- A request to update the scaling policy has been received.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UPDATING</b> -- A change is being made to the scaling policy.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>DELETE_REQUESTED</b> -- A request to delete the scaling policy has been received.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>DELETING</b> -- The scaling policy is being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>DELETED</b> -- The scaling policy has been deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ERROR</b> -- An error occurred in creating the policy. It should be removed and recreated.
     *         </p>
     *         </li>
     * @see ScalingStatusType
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Current status of the scaling policy. The scaling policy can be in force only when in an <code>ACTIVE</code>
     * status. Scaling policies can be suspended for individual fleets (see <a>StopFleetActions</a>; if suspended for a
     * fleet, the policy status does not change. View a fleet's stopped actions by calling <a>DescribeFleetCapacity</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ACTIVE</b> -- The scaling policy can be used for auto-scaling a fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATE_REQUESTED</b> -- A request to update the scaling policy has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATING</b> -- A change is being made to the scaling policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETE_REQUESTED</b> -- A request to delete the scaling policy has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETING</b> -- The scaling policy is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETED</b> -- The scaling policy has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ERROR</b> -- An error occurred in creating the policy. It should be removed and recreated.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Current status of the scaling policy. The scaling policy can be in force only when in an
     *        <code>ACTIVE</code> status. Scaling policies can be suspended for individual fleets (see
     *        <a>StopFleetActions</a>; if suspended for a fleet, the policy status does not change. View a fleet's
     *        stopped actions by calling <a>DescribeFleetCapacity</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ACTIVE</b> -- The scaling policy can be used for auto-scaling a fleet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>UPDATE_REQUESTED</b> -- A request to update the scaling policy has been received.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>UPDATING</b> -- A change is being made to the scaling policy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETE_REQUESTED</b> -- A request to delete the scaling policy has been received.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETING</b> -- The scaling policy is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETED</b> -- The scaling policy has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ERROR</b> -- An error occurred in creating the policy. It should be removed and recreated.
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
     * Current status of the scaling policy. The scaling policy can be in force only when in an <code>ACTIVE</code>
     * status. Scaling policies can be suspended for individual fleets (see <a>StopFleetActions</a>; if suspended for a
     * fleet, the policy status does not change. View a fleet's stopped actions by calling <a>DescribeFleetCapacity</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ACTIVE</b> -- The scaling policy can be used for auto-scaling a fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATE_REQUESTED</b> -- A request to update the scaling policy has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATING</b> -- A change is being made to the scaling policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETE_REQUESTED</b> -- A request to delete the scaling policy has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETING</b> -- The scaling policy is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETED</b> -- The scaling policy has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ERROR</b> -- An error occurred in creating the policy. It should be removed and recreated.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Current status of the scaling policy. The scaling policy can be in force only when in an
     *        <code>ACTIVE</code> status. Scaling policies can be suspended for individual fleets (see
     *        <a>StopFleetActions</a>; if suspended for a fleet, the policy status does not change. View a fleet's
     *        stopped actions by calling <a>DescribeFleetCapacity</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ACTIVE</b> -- The scaling policy can be used for auto-scaling a fleet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>UPDATE_REQUESTED</b> -- A request to update the scaling policy has been received.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>UPDATING</b> -- A change is being made to the scaling policy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETE_REQUESTED</b> -- A request to delete the scaling policy has been received.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETING</b> -- The scaling policy is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETED</b> -- The scaling policy has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ERROR</b> -- An error occurred in creating the policy. It should be removed and recreated.
     *        </p>
     *        </li>
     * @see ScalingStatusType
     */

    public void setStatus(ScalingStatusType status) {
        withStatus(status);
    }

    /**
     * <p>
     * Current status of the scaling policy. The scaling policy can be in force only when in an <code>ACTIVE</code>
     * status. Scaling policies can be suspended for individual fleets (see <a>StopFleetActions</a>; if suspended for a
     * fleet, the policy status does not change. View a fleet's stopped actions by calling <a>DescribeFleetCapacity</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ACTIVE</b> -- The scaling policy can be used for auto-scaling a fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATE_REQUESTED</b> -- A request to update the scaling policy has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATING</b> -- A change is being made to the scaling policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETE_REQUESTED</b> -- A request to delete the scaling policy has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETING</b> -- The scaling policy is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETED</b> -- The scaling policy has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ERROR</b> -- An error occurred in creating the policy. It should be removed and recreated.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Current status of the scaling policy. The scaling policy can be in force only when in an
     *        <code>ACTIVE</code> status. Scaling policies can be suspended for individual fleets (see
     *        <a>StopFleetActions</a>; if suspended for a fleet, the policy status does not change. View a fleet's
     *        stopped actions by calling <a>DescribeFleetCapacity</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ACTIVE</b> -- The scaling policy can be used for auto-scaling a fleet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>UPDATE_REQUESTED</b> -- A request to update the scaling policy has been received.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>UPDATING</b> -- A change is being made to the scaling policy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETE_REQUESTED</b> -- A request to delete the scaling policy has been received.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETING</b> -- The scaling policy is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETED</b> -- The scaling policy has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ERROR</b> -- An error occurred in creating the policy. It should be removed and recreated.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalingStatusType
     */

    public ScalingPolicy withStatus(ScalingStatusType status) {
        this.status = status.toString();
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
     * The type of adjustment to make to a fleet's instance count (see <a>FleetCapacity</a>):
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
     * as a percentage. Positive values scale up while negative values scale down.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scalingAdjustmentType
     *        The type of adjustment to make to a fleet's instance count (see <a>FleetCapacity</a>):</p>
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
     * The type of adjustment to make to a fleet's instance count (see <a>FleetCapacity</a>):
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
     * as a percentage. Positive values scale up while negative values scale down.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of adjustment to make to a fleet's instance count (see <a>FleetCapacity</a>):</p>
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
     *         adjustment, read as a percentage. Positive values scale up while negative values scale down.
     *         </p>
     *         </li>
     * @see ScalingAdjustmentType
     */

    public String getScalingAdjustmentType() {
        return this.scalingAdjustmentType;
    }

    /**
     * <p>
     * The type of adjustment to make to a fleet's instance count (see <a>FleetCapacity</a>):
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
     * as a percentage. Positive values scale up while negative values scale down.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scalingAdjustmentType
     *        The type of adjustment to make to a fleet's instance count (see <a>FleetCapacity</a>):</p>
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
     * The type of adjustment to make to a fleet's instance count (see <a>FleetCapacity</a>):
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
     * as a percentage. Positive values scale up while negative values scale down.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scalingAdjustmentType
     *        The type of adjustment to make to a fleet's instance count (see <a>FleetCapacity</a>):</p>
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
     *        read as a percentage. Positive values scale up while negative values scale down.
     *        </p>
     *        </li>
     * @see ScalingAdjustmentType
     */

    public void setScalingAdjustmentType(ScalingAdjustmentType scalingAdjustmentType) {
        withScalingAdjustmentType(scalingAdjustmentType);
    }

    /**
     * <p>
     * The type of adjustment to make to a fleet's instance count (see <a>FleetCapacity</a>):
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
     * as a percentage. Positive values scale up while negative values scale down.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scalingAdjustmentType
     *        The type of adjustment to make to a fleet's instance count (see <a>FleetCapacity</a>):</p>
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
     *        read as a percentage. Positive values scale up while negative values scale down.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalingAdjustmentType
     */

    public ScalingPolicy withScalingAdjustmentType(ScalingAdjustmentType scalingAdjustmentType) {
        this.scalingAdjustmentType = scalingAdjustmentType.toString();
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
        withComparisonOperator(comparisonOperator);
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
        this.comparisonOperator = comparisonOperator.toString();
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

    public ScalingPolicy withMetricName(String metricName) {
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

    public ScalingPolicy withMetricName(MetricName metricName) {
        this.metricName = metricName.toString();
        return this;
    }

    /**
     * <p>
     * The type of scaling policy to create. For a target-based policy, set the parameter <i>MetricName</i> to
     * 'PercentAvailableGameSessions' and specify a <i>TargetConfiguration</i>. For a rule-based policy set the
     * following parameters: <i>MetricName</i>, <i>ComparisonOperator</i>, <i>Threshold</i>, <i>EvaluationPeriods</i>,
     * <i>ScalingAdjustmentType</i>, and <i>ScalingAdjustment</i>.
     * </p>
     * 
     * @param policyType
     *        The type of scaling policy to create. For a target-based policy, set the parameter <i>MetricName</i> to
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
     * The type of scaling policy to create. For a target-based policy, set the parameter <i>MetricName</i> to
     * 'PercentAvailableGameSessions' and specify a <i>TargetConfiguration</i>. For a rule-based policy set the
     * following parameters: <i>MetricName</i>, <i>ComparisonOperator</i>, <i>Threshold</i>, <i>EvaluationPeriods</i>,
     * <i>ScalingAdjustmentType</i>, and <i>ScalingAdjustment</i>.
     * </p>
     * 
     * @return The type of scaling policy to create. For a target-based policy, set the parameter <i>MetricName</i> to
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
     * The type of scaling policy to create. For a target-based policy, set the parameter <i>MetricName</i> to
     * 'PercentAvailableGameSessions' and specify a <i>TargetConfiguration</i>. For a rule-based policy set the
     * following parameters: <i>MetricName</i>, <i>ComparisonOperator</i>, <i>Threshold</i>, <i>EvaluationPeriods</i>,
     * <i>ScalingAdjustmentType</i>, and <i>ScalingAdjustment</i>.
     * </p>
     * 
     * @param policyType
     *        The type of scaling policy to create. For a target-based policy, set the parameter <i>MetricName</i> to
     *        'PercentAvailableGameSessions' and specify a <i>TargetConfiguration</i>. For a rule-based policy set the
     *        following parameters: <i>MetricName</i>, <i>ComparisonOperator</i>, <i>Threshold</i>,
     *        <i>EvaluationPeriods</i>, <i>ScalingAdjustmentType</i>, and <i>ScalingAdjustment</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyType
     */

    public ScalingPolicy withPolicyType(String policyType) {
        setPolicyType(policyType);
        return this;
    }

    /**
     * <p>
     * The type of scaling policy to create. For a target-based policy, set the parameter <i>MetricName</i> to
     * 'PercentAvailableGameSessions' and specify a <i>TargetConfiguration</i>. For a rule-based policy set the
     * following parameters: <i>MetricName</i>, <i>ComparisonOperator</i>, <i>Threshold</i>, <i>EvaluationPeriods</i>,
     * <i>ScalingAdjustmentType</i>, and <i>ScalingAdjustment</i>.
     * </p>
     * 
     * @param policyType
     *        The type of scaling policy to create. For a target-based policy, set the parameter <i>MetricName</i> to
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
     * The type of scaling policy to create. For a target-based policy, set the parameter <i>MetricName</i> to
     * 'PercentAvailableGameSessions' and specify a <i>TargetConfiguration</i>. For a rule-based policy set the
     * following parameters: <i>MetricName</i>, <i>ComparisonOperator</i>, <i>Threshold</i>, <i>EvaluationPeriods</i>,
     * <i>ScalingAdjustmentType</i>, and <i>ScalingAdjustment</i>.
     * </p>
     * 
     * @param policyType
     *        The type of scaling policy to create. For a target-based policy, set the parameter <i>MetricName</i> to
     *        'PercentAvailableGameSessions' and specify a <i>TargetConfiguration</i>. For a rule-based policy set the
     *        following parameters: <i>MetricName</i>, <i>ComparisonOperator</i>, <i>Threshold</i>,
     *        <i>EvaluationPeriods</i>, <i>ScalingAdjustmentType</i>, and <i>ScalingAdjustment</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyType
     */

    public ScalingPolicy withPolicyType(PolicyType policyType) {
        this.policyType = policyType.toString();
        return this;
    }

    /**
     * <p>
     * An object that contains settings for a target-based scaling policy.
     * </p>
     * 
     * @param targetConfiguration
     *        An object that contains settings for a target-based scaling policy.
     */

    public void setTargetConfiguration(TargetConfiguration targetConfiguration) {
        this.targetConfiguration = targetConfiguration;
    }

    /**
     * <p>
     * An object that contains settings for a target-based scaling policy.
     * </p>
     * 
     * @return An object that contains settings for a target-based scaling policy.
     */

    public TargetConfiguration getTargetConfiguration() {
        return this.targetConfiguration;
    }

    /**
     * <p>
     * An object that contains settings for a target-based scaling policy.
     * </p>
     * 
     * @param targetConfiguration
     *        An object that contains settings for a target-based scaling policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPolicy withTargetConfiguration(TargetConfiguration targetConfiguration) {
        setTargetConfiguration(targetConfiguration);
        return this;
    }

    /**
     * <p>
     * The current status of the fleet's scaling policies in a requested fleet location. The status
     * <code>PENDING_UPDATE</code> indicates that an update was requested for the fleet but has not yet been completed
     * for the location.
     * </p>
     * 
     * @param updateStatus
     *        The current status of the fleet's scaling policies in a requested fleet location. The status
     *        <code>PENDING_UPDATE</code> indicates that an update was requested for the fleet but has not yet been
     *        completed for the location.
     * @see LocationUpdateStatus
     */

    public void setUpdateStatus(String updateStatus) {
        this.updateStatus = updateStatus;
    }

    /**
     * <p>
     * The current status of the fleet's scaling policies in a requested fleet location. The status
     * <code>PENDING_UPDATE</code> indicates that an update was requested for the fleet but has not yet been completed
     * for the location.
     * </p>
     * 
     * @return The current status of the fleet's scaling policies in a requested fleet location. The status
     *         <code>PENDING_UPDATE</code> indicates that an update was requested for the fleet but has not yet been
     *         completed for the location.
     * @see LocationUpdateStatus
     */

    public String getUpdateStatus() {
        return this.updateStatus;
    }

    /**
     * <p>
     * The current status of the fleet's scaling policies in a requested fleet location. The status
     * <code>PENDING_UPDATE</code> indicates that an update was requested for the fleet but has not yet been completed
     * for the location.
     * </p>
     * 
     * @param updateStatus
     *        The current status of the fleet's scaling policies in a requested fleet location. The status
     *        <code>PENDING_UPDATE</code> indicates that an update was requested for the fleet but has not yet been
     *        completed for the location.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocationUpdateStatus
     */

    public ScalingPolicy withUpdateStatus(String updateStatus) {
        setUpdateStatus(updateStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the fleet's scaling policies in a requested fleet location. The status
     * <code>PENDING_UPDATE</code> indicates that an update was requested for the fleet but has not yet been completed
     * for the location.
     * </p>
     * 
     * @param updateStatus
     *        The current status of the fleet's scaling policies in a requested fleet location. The status
     *        <code>PENDING_UPDATE</code> indicates that an update was requested for the fleet but has not yet been
     *        completed for the location.
     * @see LocationUpdateStatus
     */

    public void setUpdateStatus(LocationUpdateStatus updateStatus) {
        withUpdateStatus(updateStatus);
    }

    /**
     * <p>
     * The current status of the fleet's scaling policies in a requested fleet location. The status
     * <code>PENDING_UPDATE</code> indicates that an update was requested for the fleet but has not yet been completed
     * for the location.
     * </p>
     * 
     * @param updateStatus
     *        The current status of the fleet's scaling policies in a requested fleet location. The status
     *        <code>PENDING_UPDATE</code> indicates that an update was requested for the fleet but has not yet been
     *        completed for the location.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocationUpdateStatus
     */

    public ScalingPolicy withUpdateStatus(LocationUpdateStatus updateStatus) {
        this.updateStatus = updateStatus.toString();
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param location
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * </p>
     * 
     * @param location
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPolicy withLocation(String location) {
        setLocation(location);
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
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
        if (getFleetArn() != null)
            sb.append("FleetArn: ").append(getFleetArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getScalingAdjustment() != null)
            sb.append("ScalingAdjustment: ").append(getScalingAdjustment()).append(",");
        if (getScalingAdjustmentType() != null)
            sb.append("ScalingAdjustmentType: ").append(getScalingAdjustmentType()).append(",");
        if (getComparisonOperator() != null)
            sb.append("ComparisonOperator: ").append(getComparisonOperator()).append(",");
        if (getThreshold() != null)
            sb.append("Threshold: ").append(getThreshold()).append(",");
        if (getEvaluationPeriods() != null)
            sb.append("EvaluationPeriods: ").append(getEvaluationPeriods()).append(",");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getPolicyType() != null)
            sb.append("PolicyType: ").append(getPolicyType()).append(",");
        if (getTargetConfiguration() != null)
            sb.append("TargetConfiguration: ").append(getTargetConfiguration()).append(",");
        if (getUpdateStatus() != null)
            sb.append("UpdateStatus: ").append(getUpdateStatus()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation());
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
        if (other.getFleetArn() == null ^ this.getFleetArn() == null)
            return false;
        if (other.getFleetArn() != null && other.getFleetArn().equals(this.getFleetArn()) == false)
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
        if (other.getPolicyType() == null ^ this.getPolicyType() == null)
            return false;
        if (other.getPolicyType() != null && other.getPolicyType().equals(this.getPolicyType()) == false)
            return false;
        if (other.getTargetConfiguration() == null ^ this.getTargetConfiguration() == null)
            return false;
        if (other.getTargetConfiguration() != null && other.getTargetConfiguration().equals(this.getTargetConfiguration()) == false)
            return false;
        if (other.getUpdateStatus() == null ^ this.getUpdateStatus() == null)
            return false;
        if (other.getUpdateStatus() != null && other.getUpdateStatus().equals(this.getUpdateStatus()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getFleetArn() == null) ? 0 : getFleetArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getScalingAdjustment() == null) ? 0 : getScalingAdjustment().hashCode());
        hashCode = prime * hashCode + ((getScalingAdjustmentType() == null) ? 0 : getScalingAdjustmentType().hashCode());
        hashCode = prime * hashCode + ((getComparisonOperator() == null) ? 0 : getComparisonOperator().hashCode());
        hashCode = prime * hashCode + ((getThreshold() == null) ? 0 : getThreshold().hashCode());
        hashCode = prime * hashCode + ((getEvaluationPeriods() == null) ? 0 : getEvaluationPeriods().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getPolicyType() == null) ? 0 : getPolicyType().hashCode());
        hashCode = prime * hashCode + ((getTargetConfiguration() == null) ? 0 : getTargetConfiguration().hashCode());
        hashCode = prime * hashCode + ((getUpdateStatus() == null) ? 0 : getUpdateStatus().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.ScalingPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
