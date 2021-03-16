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
 * <b>This data type is used with the GameLift FleetIQ and game server groups.</b>
 * </p>
 * <p>
 * Properties that describe a game server group resource. A game server group manages certain properties related to a
 * corresponding EC2 Auto Scaling group.
 * </p>
 * <p>
 * A game server group is created by a successful call to <code>CreateGameServerGroup</code> and deleted by calling
 * <code>DeleteGameServerGroup</code>. Game server group activity can be temporarily suspended and resumed by calling
 * <code>SuspendGameServerGroup</code> and <code>ResumeGameServerGroup</code>, respectively.
 * </p>
 * <p>
 * <b>Related actions</b>
 * </p>
 * <p>
 * <a>CreateGameServerGroup</a> | <a>ListGameServerGroups</a> | <a>DescribeGameServerGroup</a> |
 * <a>UpdateGameServerGroup</a> | <a>DeleteGameServerGroup</a> | <a>ResumeGameServerGroup</a> |
 * <a>SuspendGameServerGroup</a> | <a>DescribeGameServerInstances</a> | <a
 * href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/reference-awssdk-fleetiq.html">All APIs by task</a>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/GameServerGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GameServerGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A developer-defined identifier for the game server group. The name is unique for each Region in each AWS account.
     * </p>
     */
    private String gameServerGroupName;
    /**
     * <p>
     * A generated unique ID for the game server group.
     * </p>
     */
    private String gameServerGroupArn;
    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * for an IAM role that allows Amazon GameLift to access your EC2 Auto Scaling groups.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The set of EC2 instance types that GameLift FleetIQ can use when balancing and automatically scaling instances in
     * the corresponding Auto Scaling group.
     * </p>
     */
    private java.util.List<InstanceDefinition> instanceDefinitions;
    /**
     * <p>
     * Indicates how GameLift FleetIQ balances the use of Spot Instances and On-Demand Instances in the game server
     * group. Method options include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SPOT_ONLY</code> - Only Spot Instances are used in the game server group. If Spot Instances are unavailable
     * or not viable for game hosting, the game server group provides no hosting capacity until Spot Instances can again
     * be used. Until then, no new instances are started, and the existing nonviable Spot Instances are terminated
     * (after current gameplay ends) and are not replaced.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPOT_PREFERRED</code> - (default value) Spot Instances are used whenever available in the game server
     * group. If Spot Instances are unavailable, the game server group continues to provide hosting capacity by falling
     * back to On-Demand Instances. Existing nonviable Spot Instances are terminated (after current gameplay ends) and
     * are replaced with new On-Demand Instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON_DEMAND_ONLY</code> - Only On-Demand Instances are used in the game server group. No Spot Instances are
     * used, even when available, while this balancing strategy is in force.
     * </p>
     * </li>
     * </ul>
     */
    private String balancingStrategy;
    /**
     * <p>
     * A flag that indicates whether instances in the game server group are protected from early termination.
     * Unprotected instances that have active game servers running might be terminated during a scale-down event,
     * causing players to be dropped from the game. Protected instances cannot be terminated while there are active game
     * servers running except in the event of a forced game server group deletion (see ). An exception to this is with
     * Spot Instances, which can be terminated by AWS regardless of protection status.
     * </p>
     */
    private String gameServerProtectionPolicy;
    /**
     * <p>
     * A generated unique ID for the EC2 Auto Scaling group that is associated with this game server group.
     * </p>
     */
    private String autoScalingGroupArn;
    /**
     * <p>
     * The current status of the game server group. Possible statuses include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code> - GameLift FleetIQ has validated the <code>CreateGameServerGroup()</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVATING</code> - GameLift FleetIQ is setting up a game server group, which includes creating an Auto
     * Scaling group in your AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The game server group has been successfully created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_SCHEDULED</code> - A request to delete the game server group has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - GameLift FleetIQ has received a valid <code>DeleteGameServerGroup()</code> request and is
     * processing it. GameLift FleetIQ must first complete and release hosts before it deletes the Auto Scaling group
     * and the game server group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> - The game server group has been successfully deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR</code> - The asynchronous processes of activating or deleting a game server group has failed,
     * resulting in an error state.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * Additional information about the current game server group status. This information might provide additional
     * insight on groups that are in <code>ERROR</code> status.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * A list of activities that are currently suspended for this game server group. If this property is empty, all
     * activities are occurring.
     * </p>
     */
    private java.util.List<String> suspendedActions;
    /**
     * <p>
     * A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * A timestamp that indicates when this game server group was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

    /**
     * <p>
     * A developer-defined identifier for the game server group. The name is unique for each Region in each AWS account.
     * </p>
     * 
     * @param gameServerGroupName
     *        A developer-defined identifier for the game server group. The name is unique for each Region in each AWS
     *        account.
     */

    public void setGameServerGroupName(String gameServerGroupName) {
        this.gameServerGroupName = gameServerGroupName;
    }

    /**
     * <p>
     * A developer-defined identifier for the game server group. The name is unique for each Region in each AWS account.
     * </p>
     * 
     * @return A developer-defined identifier for the game server group. The name is unique for each Region in each AWS
     *         account.
     */

    public String getGameServerGroupName() {
        return this.gameServerGroupName;
    }

    /**
     * <p>
     * A developer-defined identifier for the game server group. The name is unique for each Region in each AWS account.
     * </p>
     * 
     * @param gameServerGroupName
     *        A developer-defined identifier for the game server group. The name is unique for each Region in each AWS
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameServerGroup withGameServerGroupName(String gameServerGroupName) {
        setGameServerGroupName(gameServerGroupName);
        return this;
    }

    /**
     * <p>
     * A generated unique ID for the game server group.
     * </p>
     * 
     * @param gameServerGroupArn
     *        A generated unique ID for the game server group.
     */

    public void setGameServerGroupArn(String gameServerGroupArn) {
        this.gameServerGroupArn = gameServerGroupArn;
    }

    /**
     * <p>
     * A generated unique ID for the game server group.
     * </p>
     * 
     * @return A generated unique ID for the game server group.
     */

    public String getGameServerGroupArn() {
        return this.gameServerGroupArn;
    }

    /**
     * <p>
     * A generated unique ID for the game server group.
     * </p>
     * 
     * @param gameServerGroupArn
     *        A generated unique ID for the game server group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameServerGroup withGameServerGroupArn(String gameServerGroupArn) {
        setGameServerGroupArn(gameServerGroupArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * for an IAM role that allows Amazon GameLift to access your EC2 Auto Scaling groups.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) for an IAM role that
     *        allows Amazon GameLift to access your EC2 Auto Scaling groups.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * for an IAM role that allows Amazon GameLift to access your EC2 Auto Scaling groups.
     * </p>
     * 
     * @return The Amazon Resource Name (<a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) for an IAM role that
     *         allows Amazon GameLift to access your EC2 Auto Scaling groups.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * for an IAM role that allows Amazon GameLift to access your EC2 Auto Scaling groups.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) for an IAM role that
     *        allows Amazon GameLift to access your EC2 Auto Scaling groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameServerGroup withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The set of EC2 instance types that GameLift FleetIQ can use when balancing and automatically scaling instances in
     * the corresponding Auto Scaling group.
     * </p>
     * 
     * @return The set of EC2 instance types that GameLift FleetIQ can use when balancing and automatically scaling
     *         instances in the corresponding Auto Scaling group.
     */

    public java.util.List<InstanceDefinition> getInstanceDefinitions() {
        return instanceDefinitions;
    }

    /**
     * <p>
     * The set of EC2 instance types that GameLift FleetIQ can use when balancing and automatically scaling instances in
     * the corresponding Auto Scaling group.
     * </p>
     * 
     * @param instanceDefinitions
     *        The set of EC2 instance types that GameLift FleetIQ can use when balancing and automatically scaling
     *        instances in the corresponding Auto Scaling group.
     */

    public void setInstanceDefinitions(java.util.Collection<InstanceDefinition> instanceDefinitions) {
        if (instanceDefinitions == null) {
            this.instanceDefinitions = null;
            return;
        }

        this.instanceDefinitions = new java.util.ArrayList<InstanceDefinition>(instanceDefinitions);
    }

    /**
     * <p>
     * The set of EC2 instance types that GameLift FleetIQ can use when balancing and automatically scaling instances in
     * the corresponding Auto Scaling group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceDefinitions(java.util.Collection)} or {@link #withInstanceDefinitions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param instanceDefinitions
     *        The set of EC2 instance types that GameLift FleetIQ can use when balancing and automatically scaling
     *        instances in the corresponding Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameServerGroup withInstanceDefinitions(InstanceDefinition... instanceDefinitions) {
        if (this.instanceDefinitions == null) {
            setInstanceDefinitions(new java.util.ArrayList<InstanceDefinition>(instanceDefinitions.length));
        }
        for (InstanceDefinition ele : instanceDefinitions) {
            this.instanceDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The set of EC2 instance types that GameLift FleetIQ can use when balancing and automatically scaling instances in
     * the corresponding Auto Scaling group.
     * </p>
     * 
     * @param instanceDefinitions
     *        The set of EC2 instance types that GameLift FleetIQ can use when balancing and automatically scaling
     *        instances in the corresponding Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameServerGroup withInstanceDefinitions(java.util.Collection<InstanceDefinition> instanceDefinitions) {
        setInstanceDefinitions(instanceDefinitions);
        return this;
    }

    /**
     * <p>
     * Indicates how GameLift FleetIQ balances the use of Spot Instances and On-Demand Instances in the game server
     * group. Method options include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SPOT_ONLY</code> - Only Spot Instances are used in the game server group. If Spot Instances are unavailable
     * or not viable for game hosting, the game server group provides no hosting capacity until Spot Instances can again
     * be used. Until then, no new instances are started, and the existing nonviable Spot Instances are terminated
     * (after current gameplay ends) and are not replaced.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPOT_PREFERRED</code> - (default value) Spot Instances are used whenever available in the game server
     * group. If Spot Instances are unavailable, the game server group continues to provide hosting capacity by falling
     * back to On-Demand Instances. Existing nonviable Spot Instances are terminated (after current gameplay ends) and
     * are replaced with new On-Demand Instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON_DEMAND_ONLY</code> - Only On-Demand Instances are used in the game server group. No Spot Instances are
     * used, even when available, while this balancing strategy is in force.
     * </p>
     * </li>
     * </ul>
     * 
     * @param balancingStrategy
     *        Indicates how GameLift FleetIQ balances the use of Spot Instances and On-Demand Instances in the game
     *        server group. Method options include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SPOT_ONLY</code> - Only Spot Instances are used in the game server group. If Spot Instances are
     *        unavailable or not viable for game hosting, the game server group provides no hosting capacity until Spot
     *        Instances can again be used. Until then, no new instances are started, and the existing nonviable Spot
     *        Instances are terminated (after current gameplay ends) and are not replaced.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SPOT_PREFERRED</code> - (default value) Spot Instances are used whenever available in the game
     *        server group. If Spot Instances are unavailable, the game server group continues to provide hosting
     *        capacity by falling back to On-Demand Instances. Existing nonviable Spot Instances are terminated (after
     *        current gameplay ends) and are replaced with new On-Demand Instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ON_DEMAND_ONLY</code> - Only On-Demand Instances are used in the game server group. No Spot
     *        Instances are used, even when available, while this balancing strategy is in force.
     *        </p>
     *        </li>
     * @see BalancingStrategy
     */

    public void setBalancingStrategy(String balancingStrategy) {
        this.balancingStrategy = balancingStrategy;
    }

    /**
     * <p>
     * Indicates how GameLift FleetIQ balances the use of Spot Instances and On-Demand Instances in the game server
     * group. Method options include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SPOT_ONLY</code> - Only Spot Instances are used in the game server group. If Spot Instances are unavailable
     * or not viable for game hosting, the game server group provides no hosting capacity until Spot Instances can again
     * be used. Until then, no new instances are started, and the existing nonviable Spot Instances are terminated
     * (after current gameplay ends) and are not replaced.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPOT_PREFERRED</code> - (default value) Spot Instances are used whenever available in the game server
     * group. If Spot Instances are unavailable, the game server group continues to provide hosting capacity by falling
     * back to On-Demand Instances. Existing nonviable Spot Instances are terminated (after current gameplay ends) and
     * are replaced with new On-Demand Instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON_DEMAND_ONLY</code> - Only On-Demand Instances are used in the game server group. No Spot Instances are
     * used, even when available, while this balancing strategy is in force.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates how GameLift FleetIQ balances the use of Spot Instances and On-Demand Instances in the game
     *         server group. Method options include the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SPOT_ONLY</code> - Only Spot Instances are used in the game server group. If Spot Instances are
     *         unavailable or not viable for game hosting, the game server group provides no hosting capacity until Spot
     *         Instances can again be used. Until then, no new instances are started, and the existing nonviable Spot
     *         Instances are terminated (after current gameplay ends) and are not replaced.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SPOT_PREFERRED</code> - (default value) Spot Instances are used whenever available in the game
     *         server group. If Spot Instances are unavailable, the game server group continues to provide hosting
     *         capacity by falling back to On-Demand Instances. Existing nonviable Spot Instances are terminated (after
     *         current gameplay ends) and are replaced with new On-Demand Instances.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ON_DEMAND_ONLY</code> - Only On-Demand Instances are used in the game server group. No Spot
     *         Instances are used, even when available, while this balancing strategy is in force.
     *         </p>
     *         </li>
     * @see BalancingStrategy
     */

    public String getBalancingStrategy() {
        return this.balancingStrategy;
    }

    /**
     * <p>
     * Indicates how GameLift FleetIQ balances the use of Spot Instances and On-Demand Instances in the game server
     * group. Method options include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SPOT_ONLY</code> - Only Spot Instances are used in the game server group. If Spot Instances are unavailable
     * or not viable for game hosting, the game server group provides no hosting capacity until Spot Instances can again
     * be used. Until then, no new instances are started, and the existing nonviable Spot Instances are terminated
     * (after current gameplay ends) and are not replaced.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPOT_PREFERRED</code> - (default value) Spot Instances are used whenever available in the game server
     * group. If Spot Instances are unavailable, the game server group continues to provide hosting capacity by falling
     * back to On-Demand Instances. Existing nonviable Spot Instances are terminated (after current gameplay ends) and
     * are replaced with new On-Demand Instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON_DEMAND_ONLY</code> - Only On-Demand Instances are used in the game server group. No Spot Instances are
     * used, even when available, while this balancing strategy is in force.
     * </p>
     * </li>
     * </ul>
     * 
     * @param balancingStrategy
     *        Indicates how GameLift FleetIQ balances the use of Spot Instances and On-Demand Instances in the game
     *        server group. Method options include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SPOT_ONLY</code> - Only Spot Instances are used in the game server group. If Spot Instances are
     *        unavailable or not viable for game hosting, the game server group provides no hosting capacity until Spot
     *        Instances can again be used. Until then, no new instances are started, and the existing nonviable Spot
     *        Instances are terminated (after current gameplay ends) and are not replaced.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SPOT_PREFERRED</code> - (default value) Spot Instances are used whenever available in the game
     *        server group. If Spot Instances are unavailable, the game server group continues to provide hosting
     *        capacity by falling back to On-Demand Instances. Existing nonviable Spot Instances are terminated (after
     *        current gameplay ends) and are replaced with new On-Demand Instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ON_DEMAND_ONLY</code> - Only On-Demand Instances are used in the game server group. No Spot
     *        Instances are used, even when available, while this balancing strategy is in force.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BalancingStrategy
     */

    public GameServerGroup withBalancingStrategy(String balancingStrategy) {
        setBalancingStrategy(balancingStrategy);
        return this;
    }

    /**
     * <p>
     * Indicates how GameLift FleetIQ balances the use of Spot Instances and On-Demand Instances in the game server
     * group. Method options include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SPOT_ONLY</code> - Only Spot Instances are used in the game server group. If Spot Instances are unavailable
     * or not viable for game hosting, the game server group provides no hosting capacity until Spot Instances can again
     * be used. Until then, no new instances are started, and the existing nonviable Spot Instances are terminated
     * (after current gameplay ends) and are not replaced.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPOT_PREFERRED</code> - (default value) Spot Instances are used whenever available in the game server
     * group. If Spot Instances are unavailable, the game server group continues to provide hosting capacity by falling
     * back to On-Demand Instances. Existing nonviable Spot Instances are terminated (after current gameplay ends) and
     * are replaced with new On-Demand Instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON_DEMAND_ONLY</code> - Only On-Demand Instances are used in the game server group. No Spot Instances are
     * used, even when available, while this balancing strategy is in force.
     * </p>
     * </li>
     * </ul>
     * 
     * @param balancingStrategy
     *        Indicates how GameLift FleetIQ balances the use of Spot Instances and On-Demand Instances in the game
     *        server group. Method options include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SPOT_ONLY</code> - Only Spot Instances are used in the game server group. If Spot Instances are
     *        unavailable or not viable for game hosting, the game server group provides no hosting capacity until Spot
     *        Instances can again be used. Until then, no new instances are started, and the existing nonviable Spot
     *        Instances are terminated (after current gameplay ends) and are not replaced.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SPOT_PREFERRED</code> - (default value) Spot Instances are used whenever available in the game
     *        server group. If Spot Instances are unavailable, the game server group continues to provide hosting
     *        capacity by falling back to On-Demand Instances. Existing nonviable Spot Instances are terminated (after
     *        current gameplay ends) and are replaced with new On-Demand Instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ON_DEMAND_ONLY</code> - Only On-Demand Instances are used in the game server group. No Spot
     *        Instances are used, even when available, while this balancing strategy is in force.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BalancingStrategy
     */

    public GameServerGroup withBalancingStrategy(BalancingStrategy balancingStrategy) {
        this.balancingStrategy = balancingStrategy.toString();
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether instances in the game server group are protected from early termination.
     * Unprotected instances that have active game servers running might be terminated during a scale-down event,
     * causing players to be dropped from the game. Protected instances cannot be terminated while there are active game
     * servers running except in the event of a forced game server group deletion (see ). An exception to this is with
     * Spot Instances, which can be terminated by AWS regardless of protection status.
     * </p>
     * 
     * @param gameServerProtectionPolicy
     *        A flag that indicates whether instances in the game server group are protected from early termination.
     *        Unprotected instances that have active game servers running might be terminated during a scale-down event,
     *        causing players to be dropped from the game. Protected instances cannot be terminated while there are
     *        active game servers running except in the event of a forced game server group deletion (see ). An
     *        exception to this is with Spot Instances, which can be terminated by AWS regardless of protection status.
     * @see GameServerProtectionPolicy
     */

    public void setGameServerProtectionPolicy(String gameServerProtectionPolicy) {
        this.gameServerProtectionPolicy = gameServerProtectionPolicy;
    }

    /**
     * <p>
     * A flag that indicates whether instances in the game server group are protected from early termination.
     * Unprotected instances that have active game servers running might be terminated during a scale-down event,
     * causing players to be dropped from the game. Protected instances cannot be terminated while there are active game
     * servers running except in the event of a forced game server group deletion (see ). An exception to this is with
     * Spot Instances, which can be terminated by AWS regardless of protection status.
     * </p>
     * 
     * @return A flag that indicates whether instances in the game server group are protected from early termination.
     *         Unprotected instances that have active game servers running might be terminated during a scale-down
     *         event, causing players to be dropped from the game. Protected instances cannot be terminated while there
     *         are active game servers running except in the event of a forced game server group deletion (see ). An
     *         exception to this is with Spot Instances, which can be terminated by AWS regardless of protection status.
     * @see GameServerProtectionPolicy
     */

    public String getGameServerProtectionPolicy() {
        return this.gameServerProtectionPolicy;
    }

    /**
     * <p>
     * A flag that indicates whether instances in the game server group are protected from early termination.
     * Unprotected instances that have active game servers running might be terminated during a scale-down event,
     * causing players to be dropped from the game. Protected instances cannot be terminated while there are active game
     * servers running except in the event of a forced game server group deletion (see ). An exception to this is with
     * Spot Instances, which can be terminated by AWS regardless of protection status.
     * </p>
     * 
     * @param gameServerProtectionPolicy
     *        A flag that indicates whether instances in the game server group are protected from early termination.
     *        Unprotected instances that have active game servers running might be terminated during a scale-down event,
     *        causing players to be dropped from the game. Protected instances cannot be terminated while there are
     *        active game servers running except in the event of a forced game server group deletion (see ). An
     *        exception to this is with Spot Instances, which can be terminated by AWS regardless of protection status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GameServerProtectionPolicy
     */

    public GameServerGroup withGameServerProtectionPolicy(String gameServerProtectionPolicy) {
        setGameServerProtectionPolicy(gameServerProtectionPolicy);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether instances in the game server group are protected from early termination.
     * Unprotected instances that have active game servers running might be terminated during a scale-down event,
     * causing players to be dropped from the game. Protected instances cannot be terminated while there are active game
     * servers running except in the event of a forced game server group deletion (see ). An exception to this is with
     * Spot Instances, which can be terminated by AWS regardless of protection status.
     * </p>
     * 
     * @param gameServerProtectionPolicy
     *        A flag that indicates whether instances in the game server group are protected from early termination.
     *        Unprotected instances that have active game servers running might be terminated during a scale-down event,
     *        causing players to be dropped from the game. Protected instances cannot be terminated while there are
     *        active game servers running except in the event of a forced game server group deletion (see ). An
     *        exception to this is with Spot Instances, which can be terminated by AWS regardless of protection status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GameServerProtectionPolicy
     */

    public GameServerGroup withGameServerProtectionPolicy(GameServerProtectionPolicy gameServerProtectionPolicy) {
        this.gameServerProtectionPolicy = gameServerProtectionPolicy.toString();
        return this;
    }

    /**
     * <p>
     * A generated unique ID for the EC2 Auto Scaling group that is associated with this game server group.
     * </p>
     * 
     * @param autoScalingGroupArn
     *        A generated unique ID for the EC2 Auto Scaling group that is associated with this game server group.
     */

    public void setAutoScalingGroupArn(String autoScalingGroupArn) {
        this.autoScalingGroupArn = autoScalingGroupArn;
    }

    /**
     * <p>
     * A generated unique ID for the EC2 Auto Scaling group that is associated with this game server group.
     * </p>
     * 
     * @return A generated unique ID for the EC2 Auto Scaling group that is associated with this game server group.
     */

    public String getAutoScalingGroupArn() {
        return this.autoScalingGroupArn;
    }

    /**
     * <p>
     * A generated unique ID for the EC2 Auto Scaling group that is associated with this game server group.
     * </p>
     * 
     * @param autoScalingGroupArn
     *        A generated unique ID for the EC2 Auto Scaling group that is associated with this game server group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameServerGroup withAutoScalingGroupArn(String autoScalingGroupArn) {
        setAutoScalingGroupArn(autoScalingGroupArn);
        return this;
    }

    /**
     * <p>
     * The current status of the game server group. Possible statuses include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code> - GameLift FleetIQ has validated the <code>CreateGameServerGroup()</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVATING</code> - GameLift FleetIQ is setting up a game server group, which includes creating an Auto
     * Scaling group in your AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The game server group has been successfully created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_SCHEDULED</code> - A request to delete the game server group has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - GameLift FleetIQ has received a valid <code>DeleteGameServerGroup()</code> request and is
     * processing it. GameLift FleetIQ must first complete and release hosts before it deletes the Auto Scaling group
     * and the game server group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> - The game server group has been successfully deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR</code> - The asynchronous processes of activating or deleting a game server group has failed,
     * resulting in an error state.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current status of the game server group. Possible statuses include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NEW</code> - GameLift FleetIQ has validated the <code>CreateGameServerGroup()</code> request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVATING</code> - GameLift FleetIQ is setting up a game server group, which includes creating an
     *        Auto Scaling group in your AWS account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The game server group has been successfully created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_SCHEDULED</code> - A request to delete the game server group has been received.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - GameLift FleetIQ has received a valid <code>DeleteGameServerGroup()</code> request
     *        and is processing it. GameLift FleetIQ must first complete and release hosts before it deletes the Auto
     *        Scaling group and the game server group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code> - The game server group has been successfully deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ERROR</code> - The asynchronous processes of activating or deleting a game server group has failed,
     *        resulting in an error state.
     *        </p>
     *        </li>
     * @see GameServerGroupStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the game server group. Possible statuses include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code> - GameLift FleetIQ has validated the <code>CreateGameServerGroup()</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVATING</code> - GameLift FleetIQ is setting up a game server group, which includes creating an Auto
     * Scaling group in your AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The game server group has been successfully created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_SCHEDULED</code> - A request to delete the game server group has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - GameLift FleetIQ has received a valid <code>DeleteGameServerGroup()</code> request and is
     * processing it. GameLift FleetIQ must first complete and release hosts before it deletes the Auto Scaling group
     * and the game server group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> - The game server group has been successfully deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR</code> - The asynchronous processes of activating or deleting a game server group has failed,
     * resulting in an error state.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current status of the game server group. Possible statuses include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NEW</code> - GameLift FleetIQ has validated the <code>CreateGameServerGroup()</code> request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACTIVATING</code> - GameLift FleetIQ is setting up a game server group, which includes creating an
     *         Auto Scaling group in your AWS account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code> - The game server group has been successfully created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETE_SCHEDULED</code> - A request to delete the game server group has been received.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code> - GameLift FleetIQ has received a valid <code>DeleteGameServerGroup()</code>
     *         request and is processing it. GameLift FleetIQ must first complete and release hosts before it deletes
     *         the Auto Scaling group and the game server group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETED</code> - The game server group has been successfully deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ERROR</code> - The asynchronous processes of activating or deleting a game server group has failed,
     *         resulting in an error state.
     *         </p>
     *         </li>
     * @see GameServerGroupStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the game server group. Possible statuses include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code> - GameLift FleetIQ has validated the <code>CreateGameServerGroup()</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVATING</code> - GameLift FleetIQ is setting up a game server group, which includes creating an Auto
     * Scaling group in your AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The game server group has been successfully created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_SCHEDULED</code> - A request to delete the game server group has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - GameLift FleetIQ has received a valid <code>DeleteGameServerGroup()</code> request and is
     * processing it. GameLift FleetIQ must first complete and release hosts before it deletes the Auto Scaling group
     * and the game server group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> - The game server group has been successfully deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR</code> - The asynchronous processes of activating or deleting a game server group has failed,
     * resulting in an error state.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current status of the game server group. Possible statuses include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NEW</code> - GameLift FleetIQ has validated the <code>CreateGameServerGroup()</code> request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVATING</code> - GameLift FleetIQ is setting up a game server group, which includes creating an
     *        Auto Scaling group in your AWS account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The game server group has been successfully created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_SCHEDULED</code> - A request to delete the game server group has been received.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - GameLift FleetIQ has received a valid <code>DeleteGameServerGroup()</code> request
     *        and is processing it. GameLift FleetIQ must first complete and release hosts before it deletes the Auto
     *        Scaling group and the game server group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code> - The game server group has been successfully deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ERROR</code> - The asynchronous processes of activating or deleting a game server group has failed,
     *        resulting in an error state.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GameServerGroupStatus
     */

    public GameServerGroup withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the game server group. Possible statuses include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code> - GameLift FleetIQ has validated the <code>CreateGameServerGroup()</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVATING</code> - GameLift FleetIQ is setting up a game server group, which includes creating an Auto
     * Scaling group in your AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The game server group has been successfully created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_SCHEDULED</code> - A request to delete the game server group has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - GameLift FleetIQ has received a valid <code>DeleteGameServerGroup()</code> request and is
     * processing it. GameLift FleetIQ must first complete and release hosts before it deletes the Auto Scaling group
     * and the game server group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> - The game server group has been successfully deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR</code> - The asynchronous processes of activating or deleting a game server group has failed,
     * resulting in an error state.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current status of the game server group. Possible statuses include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NEW</code> - GameLift FleetIQ has validated the <code>CreateGameServerGroup()</code> request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVATING</code> - GameLift FleetIQ is setting up a game server group, which includes creating an
     *        Auto Scaling group in your AWS account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The game server group has been successfully created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_SCHEDULED</code> - A request to delete the game server group has been received.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - GameLift FleetIQ has received a valid <code>DeleteGameServerGroup()</code> request
     *        and is processing it. GameLift FleetIQ must first complete and release hosts before it deletes the Auto
     *        Scaling group and the game server group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code> - The game server group has been successfully deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ERROR</code> - The asynchronous processes of activating or deleting a game server group has failed,
     *        resulting in an error state.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GameServerGroupStatus
     */

    public GameServerGroup withStatus(GameServerGroupStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Additional information about the current game server group status. This information might provide additional
     * insight on groups that are in <code>ERROR</code> status.
     * </p>
     * 
     * @param statusReason
     *        Additional information about the current game server group status. This information might provide
     *        additional insight on groups that are in <code>ERROR</code> status.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * Additional information about the current game server group status. This information might provide additional
     * insight on groups that are in <code>ERROR</code> status.
     * </p>
     * 
     * @return Additional information about the current game server group status. This information might provide
     *         additional insight on groups that are in <code>ERROR</code> status.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * Additional information about the current game server group status. This information might provide additional
     * insight on groups that are in <code>ERROR</code> status.
     * </p>
     * 
     * @param statusReason
     *        Additional information about the current game server group status. This information might provide
     *        additional insight on groups that are in <code>ERROR</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameServerGroup withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * A list of activities that are currently suspended for this game server group. If this property is empty, all
     * activities are occurring.
     * </p>
     * 
     * @return A list of activities that are currently suspended for this game server group. If this property is empty,
     *         all activities are occurring.
     * @see GameServerGroupAction
     */

    public java.util.List<String> getSuspendedActions() {
        return suspendedActions;
    }

    /**
     * <p>
     * A list of activities that are currently suspended for this game server group. If this property is empty, all
     * activities are occurring.
     * </p>
     * 
     * @param suspendedActions
     *        A list of activities that are currently suspended for this game server group. If this property is empty,
     *        all activities are occurring.
     * @see GameServerGroupAction
     */

    public void setSuspendedActions(java.util.Collection<String> suspendedActions) {
        if (suspendedActions == null) {
            this.suspendedActions = null;
            return;
        }

        this.suspendedActions = new java.util.ArrayList<String>(suspendedActions);
    }

    /**
     * <p>
     * A list of activities that are currently suspended for this game server group. If this property is empty, all
     * activities are occurring.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuspendedActions(java.util.Collection)} or {@link #withSuspendedActions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param suspendedActions
     *        A list of activities that are currently suspended for this game server group. If this property is empty,
     *        all activities are occurring.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GameServerGroupAction
     */

    public GameServerGroup withSuspendedActions(String... suspendedActions) {
        if (this.suspendedActions == null) {
            setSuspendedActions(new java.util.ArrayList<String>(suspendedActions.length));
        }
        for (String ele : suspendedActions) {
            this.suspendedActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of activities that are currently suspended for this game server group. If this property is empty, all
     * activities are occurring.
     * </p>
     * 
     * @param suspendedActions
     *        A list of activities that are currently suspended for this game server group. If this property is empty,
     *        all activities are occurring.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GameServerGroupAction
     */

    public GameServerGroup withSuspendedActions(java.util.Collection<String> suspendedActions) {
        setSuspendedActions(suspendedActions);
        return this;
    }

    /**
     * <p>
     * A list of activities that are currently suspended for this game server group. If this property is empty, all
     * activities are occurring.
     * </p>
     * 
     * @param suspendedActions
     *        A list of activities that are currently suspended for this game server group. If this property is empty,
     *        all activities are occurring.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GameServerGroupAction
     */

    public GameServerGroup withSuspendedActions(GameServerGroupAction... suspendedActions) {
        java.util.ArrayList<String> suspendedActionsCopy = new java.util.ArrayList<String>(suspendedActions.length);
        for (GameServerGroupAction value : suspendedActions) {
            suspendedActionsCopy.add(value.toString());
        }
        if (getSuspendedActions() == null) {
            setSuspendedActions(suspendedActionsCopy);
        } else {
            getSuspendedActions().addAll(suspendedActionsCopy);
        }
        return this;
    }

    /**
     * <p>
     * A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     * 
     * @param creationTime
     *        A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     *        milliseconds (for example <code>"1469498468.057"</code>).
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     * 
     * @return A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     *         milliseconds (for example <code>"1469498468.057"</code>).
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     * 
     * @param creationTime
     *        A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     *        milliseconds (for example <code>"1469498468.057"</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameServerGroup withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when this game server group was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        A timestamp that indicates when this game server group was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * A timestamp that indicates when this game server group was last updated.
     * </p>
     * 
     * @return A timestamp that indicates when this game server group was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * A timestamp that indicates when this game server group was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        A timestamp that indicates when this game server group was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameServerGroup withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
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
        if (getGameServerGroupName() != null)
            sb.append("GameServerGroupName: ").append(getGameServerGroupName()).append(",");
        if (getGameServerGroupArn() != null)
            sb.append("GameServerGroupArn: ").append(getGameServerGroupArn()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getInstanceDefinitions() != null)
            sb.append("InstanceDefinitions: ").append(getInstanceDefinitions()).append(",");
        if (getBalancingStrategy() != null)
            sb.append("BalancingStrategy: ").append(getBalancingStrategy()).append(",");
        if (getGameServerProtectionPolicy() != null)
            sb.append("GameServerProtectionPolicy: ").append(getGameServerProtectionPolicy()).append(",");
        if (getAutoScalingGroupArn() != null)
            sb.append("AutoScalingGroupArn: ").append(getAutoScalingGroupArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getSuspendedActions() != null)
            sb.append("SuspendedActions: ").append(getSuspendedActions()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GameServerGroup == false)
            return false;
        GameServerGroup other = (GameServerGroup) obj;
        if (other.getGameServerGroupName() == null ^ this.getGameServerGroupName() == null)
            return false;
        if (other.getGameServerGroupName() != null && other.getGameServerGroupName().equals(this.getGameServerGroupName()) == false)
            return false;
        if (other.getGameServerGroupArn() == null ^ this.getGameServerGroupArn() == null)
            return false;
        if (other.getGameServerGroupArn() != null && other.getGameServerGroupArn().equals(this.getGameServerGroupArn()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getInstanceDefinitions() == null ^ this.getInstanceDefinitions() == null)
            return false;
        if (other.getInstanceDefinitions() != null && other.getInstanceDefinitions().equals(this.getInstanceDefinitions()) == false)
            return false;
        if (other.getBalancingStrategy() == null ^ this.getBalancingStrategy() == null)
            return false;
        if (other.getBalancingStrategy() != null && other.getBalancingStrategy().equals(this.getBalancingStrategy()) == false)
            return false;
        if (other.getGameServerProtectionPolicy() == null ^ this.getGameServerProtectionPolicy() == null)
            return false;
        if (other.getGameServerProtectionPolicy() != null && other.getGameServerProtectionPolicy().equals(this.getGameServerProtectionPolicy()) == false)
            return false;
        if (other.getAutoScalingGroupArn() == null ^ this.getAutoScalingGroupArn() == null)
            return false;
        if (other.getAutoScalingGroupArn() != null && other.getAutoScalingGroupArn().equals(this.getAutoScalingGroupArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getSuspendedActions() == null ^ this.getSuspendedActions() == null)
            return false;
        if (other.getSuspendedActions() != null && other.getSuspendedActions().equals(this.getSuspendedActions()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGameServerGroupName() == null) ? 0 : getGameServerGroupName().hashCode());
        hashCode = prime * hashCode + ((getGameServerGroupArn() == null) ? 0 : getGameServerGroupArn().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getInstanceDefinitions() == null) ? 0 : getInstanceDefinitions().hashCode());
        hashCode = prime * hashCode + ((getBalancingStrategy() == null) ? 0 : getBalancingStrategy().hashCode());
        hashCode = prime * hashCode + ((getGameServerProtectionPolicy() == null) ? 0 : getGameServerProtectionPolicy().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingGroupArn() == null) ? 0 : getAutoScalingGroupArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getSuspendedActions() == null) ? 0 : getSuspendedActions().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        return hashCode;
    }

    @Override
    public GameServerGroup clone() {
        try {
            return (GameServerGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.GameServerGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
