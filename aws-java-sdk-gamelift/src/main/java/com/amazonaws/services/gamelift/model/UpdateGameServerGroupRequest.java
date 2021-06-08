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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateGameServerGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGameServerGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the game server group. Use either the <a>GameServerGroup</a> name or ARN value.
     * </p>
     */
    private String gameServerGroupName;
    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * for an IAM role that allows Amazon GameLift to access your EC2 Auto Scaling groups.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * An updated list of EC2 instance types to use in the Auto Scaling group. The instance definitions must specify at
     * least two different instance types that are supported by GameLift FleetIQ. This updated list replaces the entire
     * current list of instance definitions for the game server group. For more information on instance types, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">EC2 Instance Types</a> in the
     * <i>Amazon EC2 User Guide</i>. You can optionally specify capacity weighting for each instance type. If no weight
     * value is specified for an instance type, it is set to the default value "1". For more information about capacity
     * weighting, see <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html">
     * Instance Weighting for Amazon EC2 Auto Scaling</a> in the Amazon EC2 Auto Scaling User Guide.
     * </p>
     */
    private java.util.List<InstanceDefinition> instanceDefinitions;
    /**
     * <p>
     * A flag that indicates whether instances in the game server group are protected from early termination.
     * Unprotected instances that have active game servers running might be terminated during a scale-down event,
     * causing players to be dropped from the game. Protected instances cannot be terminated while there are active game
     * servers running except in the event of a forced game server group deletion (see ). An exception to this is with
     * Spot Instances, which can be terminated by AWS regardless of protection status. This property is set to
     * <code>NO_PROTECTION</code> by default.
     * </p>
     */
    private String gameServerProtectionPolicy;
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
     * A unique identifier for the game server group. Use either the <a>GameServerGroup</a> name or ARN value.
     * </p>
     * 
     * @param gameServerGroupName
     *        A unique identifier for the game server group. Use either the <a>GameServerGroup</a> name or ARN value.
     */

    public void setGameServerGroupName(String gameServerGroupName) {
        this.gameServerGroupName = gameServerGroupName;
    }

    /**
     * <p>
     * A unique identifier for the game server group. Use either the <a>GameServerGroup</a> name or ARN value.
     * </p>
     * 
     * @return A unique identifier for the game server group. Use either the <a>GameServerGroup</a> name or ARN value.
     */

    public String getGameServerGroupName() {
        return this.gameServerGroupName;
    }

    /**
     * <p>
     * A unique identifier for the game server group. Use either the <a>GameServerGroup</a> name or ARN value.
     * </p>
     * 
     * @param gameServerGroupName
     *        A unique identifier for the game server group. Use either the <a>GameServerGroup</a> name or ARN value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGameServerGroupRequest withGameServerGroupName(String gameServerGroupName) {
        setGameServerGroupName(gameServerGroupName);
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

    public UpdateGameServerGroupRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * An updated list of EC2 instance types to use in the Auto Scaling group. The instance definitions must specify at
     * least two different instance types that are supported by GameLift FleetIQ. This updated list replaces the entire
     * current list of instance definitions for the game server group. For more information on instance types, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">EC2 Instance Types</a> in the
     * <i>Amazon EC2 User Guide</i>. You can optionally specify capacity weighting for each instance type. If no weight
     * value is specified for an instance type, it is set to the default value "1". For more information about capacity
     * weighting, see <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html">
     * Instance Weighting for Amazon EC2 Auto Scaling</a> in the Amazon EC2 Auto Scaling User Guide.
     * </p>
     * 
     * @return An updated list of EC2 instance types to use in the Auto Scaling group. The instance definitions must
     *         specify at least two different instance types that are supported by GameLift FleetIQ. This updated list
     *         replaces the entire current list of instance definitions for the game server group. For more information
     *         on instance types, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">EC2 Instance Types</a> in
     *         the <i>Amazon EC2 User Guide</i>. You can optionally specify capacity weighting for each instance type.
     *         If no weight value is specified for an instance type, it is set to the default value "1". For more
     *         information about capacity weighting, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html"> Instance
     *         Weighting for Amazon EC2 Auto Scaling</a> in the Amazon EC2 Auto Scaling User Guide.
     */

    public java.util.List<InstanceDefinition> getInstanceDefinitions() {
        return instanceDefinitions;
    }

    /**
     * <p>
     * An updated list of EC2 instance types to use in the Auto Scaling group. The instance definitions must specify at
     * least two different instance types that are supported by GameLift FleetIQ. This updated list replaces the entire
     * current list of instance definitions for the game server group. For more information on instance types, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">EC2 Instance Types</a> in the
     * <i>Amazon EC2 User Guide</i>. You can optionally specify capacity weighting for each instance type. If no weight
     * value is specified for an instance type, it is set to the default value "1". For more information about capacity
     * weighting, see <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html">
     * Instance Weighting for Amazon EC2 Auto Scaling</a> in the Amazon EC2 Auto Scaling User Guide.
     * </p>
     * 
     * @param instanceDefinitions
     *        An updated list of EC2 instance types to use in the Auto Scaling group. The instance definitions must
     *        specify at least two different instance types that are supported by GameLift FleetIQ. This updated list
     *        replaces the entire current list of instance definitions for the game server group. For more information
     *        on instance types, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">EC2 Instance Types</a> in
     *        the <i>Amazon EC2 User Guide</i>. You can optionally specify capacity weighting for each instance type. If
     *        no weight value is specified for an instance type, it is set to the default value "1". For more
     *        information about capacity weighting, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html"> Instance
     *        Weighting for Amazon EC2 Auto Scaling</a> in the Amazon EC2 Auto Scaling User Guide.
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
     * An updated list of EC2 instance types to use in the Auto Scaling group. The instance definitions must specify at
     * least two different instance types that are supported by GameLift FleetIQ. This updated list replaces the entire
     * current list of instance definitions for the game server group. For more information on instance types, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">EC2 Instance Types</a> in the
     * <i>Amazon EC2 User Guide</i>. You can optionally specify capacity weighting for each instance type. If no weight
     * value is specified for an instance type, it is set to the default value "1". For more information about capacity
     * weighting, see <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html">
     * Instance Weighting for Amazon EC2 Auto Scaling</a> in the Amazon EC2 Auto Scaling User Guide.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceDefinitions(java.util.Collection)} or {@link #withInstanceDefinitions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param instanceDefinitions
     *        An updated list of EC2 instance types to use in the Auto Scaling group. The instance definitions must
     *        specify at least two different instance types that are supported by GameLift FleetIQ. This updated list
     *        replaces the entire current list of instance definitions for the game server group. For more information
     *        on instance types, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">EC2 Instance Types</a> in
     *        the <i>Amazon EC2 User Guide</i>. You can optionally specify capacity weighting for each instance type. If
     *        no weight value is specified for an instance type, it is set to the default value "1". For more
     *        information about capacity weighting, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html"> Instance
     *        Weighting for Amazon EC2 Auto Scaling</a> in the Amazon EC2 Auto Scaling User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGameServerGroupRequest withInstanceDefinitions(InstanceDefinition... instanceDefinitions) {
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
     * An updated list of EC2 instance types to use in the Auto Scaling group. The instance definitions must specify at
     * least two different instance types that are supported by GameLift FleetIQ. This updated list replaces the entire
     * current list of instance definitions for the game server group. For more information on instance types, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">EC2 Instance Types</a> in the
     * <i>Amazon EC2 User Guide</i>. You can optionally specify capacity weighting for each instance type. If no weight
     * value is specified for an instance type, it is set to the default value "1". For more information about capacity
     * weighting, see <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html">
     * Instance Weighting for Amazon EC2 Auto Scaling</a> in the Amazon EC2 Auto Scaling User Guide.
     * </p>
     * 
     * @param instanceDefinitions
     *        An updated list of EC2 instance types to use in the Auto Scaling group. The instance definitions must
     *        specify at least two different instance types that are supported by GameLift FleetIQ. This updated list
     *        replaces the entire current list of instance definitions for the game server group. For more information
     *        on instance types, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">EC2 Instance Types</a> in
     *        the <i>Amazon EC2 User Guide</i>. You can optionally specify capacity weighting for each instance type. If
     *        no weight value is specified for an instance type, it is set to the default value "1". For more
     *        information about capacity weighting, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html"> Instance
     *        Weighting for Amazon EC2 Auto Scaling</a> in the Amazon EC2 Auto Scaling User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGameServerGroupRequest withInstanceDefinitions(java.util.Collection<InstanceDefinition> instanceDefinitions) {
        setInstanceDefinitions(instanceDefinitions);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether instances in the game server group are protected from early termination.
     * Unprotected instances that have active game servers running might be terminated during a scale-down event,
     * causing players to be dropped from the game. Protected instances cannot be terminated while there are active game
     * servers running except in the event of a forced game server group deletion (see ). An exception to this is with
     * Spot Instances, which can be terminated by AWS regardless of protection status. This property is set to
     * <code>NO_PROTECTION</code> by default.
     * </p>
     * 
     * @param gameServerProtectionPolicy
     *        A flag that indicates whether instances in the game server group are protected from early termination.
     *        Unprotected instances that have active game servers running might be terminated during a scale-down event,
     *        causing players to be dropped from the game. Protected instances cannot be terminated while there are
     *        active game servers running except in the event of a forced game server group deletion (see ). An
     *        exception to this is with Spot Instances, which can be terminated by AWS regardless of protection status.
     *        This property is set to <code>NO_PROTECTION</code> by default.
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
     * Spot Instances, which can be terminated by AWS regardless of protection status. This property is set to
     * <code>NO_PROTECTION</code> by default.
     * </p>
     * 
     * @return A flag that indicates whether instances in the game server group are protected from early termination.
     *         Unprotected instances that have active game servers running might be terminated during a scale-down
     *         event, causing players to be dropped from the game. Protected instances cannot be terminated while there
     *         are active game servers running except in the event of a forced game server group deletion (see ). An
     *         exception to this is with Spot Instances, which can be terminated by AWS regardless of protection status.
     *         This property is set to <code>NO_PROTECTION</code> by default.
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
     * Spot Instances, which can be terminated by AWS regardless of protection status. This property is set to
     * <code>NO_PROTECTION</code> by default.
     * </p>
     * 
     * @param gameServerProtectionPolicy
     *        A flag that indicates whether instances in the game server group are protected from early termination.
     *        Unprotected instances that have active game servers running might be terminated during a scale-down event,
     *        causing players to be dropped from the game. Protected instances cannot be terminated while there are
     *        active game servers running except in the event of a forced game server group deletion (see ). An
     *        exception to this is with Spot Instances, which can be terminated by AWS regardless of protection status.
     *        This property is set to <code>NO_PROTECTION</code> by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GameServerProtectionPolicy
     */

    public UpdateGameServerGroupRequest withGameServerProtectionPolicy(String gameServerProtectionPolicy) {
        setGameServerProtectionPolicy(gameServerProtectionPolicy);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether instances in the game server group are protected from early termination.
     * Unprotected instances that have active game servers running might be terminated during a scale-down event,
     * causing players to be dropped from the game. Protected instances cannot be terminated while there are active game
     * servers running except in the event of a forced game server group deletion (see ). An exception to this is with
     * Spot Instances, which can be terminated by AWS regardless of protection status. This property is set to
     * <code>NO_PROTECTION</code> by default.
     * </p>
     * 
     * @param gameServerProtectionPolicy
     *        A flag that indicates whether instances in the game server group are protected from early termination.
     *        Unprotected instances that have active game servers running might be terminated during a scale-down event,
     *        causing players to be dropped from the game. Protected instances cannot be terminated while there are
     *        active game servers running except in the event of a forced game server group deletion (see ). An
     *        exception to this is with Spot Instances, which can be terminated by AWS regardless of protection status.
     *        This property is set to <code>NO_PROTECTION</code> by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GameServerProtectionPolicy
     */

    public UpdateGameServerGroupRequest withGameServerProtectionPolicy(GameServerProtectionPolicy gameServerProtectionPolicy) {
        this.gameServerProtectionPolicy = gameServerProtectionPolicy.toString();
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

    public UpdateGameServerGroupRequest withBalancingStrategy(String balancingStrategy) {
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

    public UpdateGameServerGroupRequest withBalancingStrategy(BalancingStrategy balancingStrategy) {
        this.balancingStrategy = balancingStrategy.toString();
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getInstanceDefinitions() != null)
            sb.append("InstanceDefinitions: ").append(getInstanceDefinitions()).append(",");
        if (getGameServerProtectionPolicy() != null)
            sb.append("GameServerProtectionPolicy: ").append(getGameServerProtectionPolicy()).append(",");
        if (getBalancingStrategy() != null)
            sb.append("BalancingStrategy: ").append(getBalancingStrategy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGameServerGroupRequest == false)
            return false;
        UpdateGameServerGroupRequest other = (UpdateGameServerGroupRequest) obj;
        if (other.getGameServerGroupName() == null ^ this.getGameServerGroupName() == null)
            return false;
        if (other.getGameServerGroupName() != null && other.getGameServerGroupName().equals(this.getGameServerGroupName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getInstanceDefinitions() == null ^ this.getInstanceDefinitions() == null)
            return false;
        if (other.getInstanceDefinitions() != null && other.getInstanceDefinitions().equals(this.getInstanceDefinitions()) == false)
            return false;
        if (other.getGameServerProtectionPolicy() == null ^ this.getGameServerProtectionPolicy() == null)
            return false;
        if (other.getGameServerProtectionPolicy() != null && other.getGameServerProtectionPolicy().equals(this.getGameServerProtectionPolicy()) == false)
            return false;
        if (other.getBalancingStrategy() == null ^ this.getBalancingStrategy() == null)
            return false;
        if (other.getBalancingStrategy() != null && other.getBalancingStrategy().equals(this.getBalancingStrategy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGameServerGroupName() == null) ? 0 : getGameServerGroupName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getInstanceDefinitions() == null) ? 0 : getInstanceDefinitions().hashCode());
        hashCode = prime * hashCode + ((getGameServerProtectionPolicy() == null) ? 0 : getGameServerProtectionPolicy().hashCode());
        hashCode = prime * hashCode + ((getBalancingStrategy() == null) ? 0 : getBalancingStrategy().hashCode());
        return hashCode;
    }

    @Override
    public UpdateGameServerGroupRequest clone() {
        return (UpdateGameServerGroupRequest) super.clone();
    }

}
