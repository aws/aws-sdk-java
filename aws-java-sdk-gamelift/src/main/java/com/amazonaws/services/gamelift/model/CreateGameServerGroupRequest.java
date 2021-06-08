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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateGameServerGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGameServerGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An identifier for the new game server group. This value is used to generate unique ARN identifiers for the EC2
     * Auto Scaling group and the GameLift FleetIQ game server group. The name must be unique per Region per AWS
     * account.
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
     * The minimum number of instances allowed in the EC2 Auto Scaling group. During automatic scaling events, GameLift
     * FleetIQ and EC2 do not scale down the group below this minimum. In production, this value should be set to at
     * least 1. After the Auto Scaling group is created, update this value directly in the Auto Scaling group using the
     * AWS console or APIs.
     * </p>
     */
    private Integer minSize;
    /**
     * <p>
     * The maximum number of instances allowed in the EC2 Auto Scaling group. During automatic scaling events, GameLift
     * FleetIQ and EC2 do not scale up the group above this maximum. After the Auto Scaling group is created, update
     * this value directly in the Auto Scaling group using the AWS console or APIs.
     * </p>
     */
    private Integer maxSize;
    /**
     * <p>
     * The EC2 launch template that contains configuration settings and game server code to be deployed to all instances
     * in the game server group. You can specify the template using either the template name or ID. For help with
     * creating a launch template, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html">Creating a Launch
     * Template for an Auto Scaling Group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>. After the Auto Scaling
     * group is created, update this value directly in the Auto Scaling group using the AWS console or APIs.
     * </p>
     * <note>
     * <p>
     * If you specify network interfaces in your launch template, you must explicitly set the property
     * <code>AssociatePublicIpAddress</code> to "true". If no network interface is specified in the launch template,
     * GameLift FleetIQ uses your account's default VPC.
     * </p>
     * </note>
     */
    private LaunchTemplateSpecification launchTemplate;
    /**
     * <p>
     * The EC2 instance types and sizes to use in the Auto Scaling group. The instance definitions must specify at least
     * two different instance types that are supported by GameLift FleetIQ. For more information on instance types, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">EC2 Instance Types</a> in the
     * <i>Amazon EC2 User Guide</i>. You can optionally specify capacity weighting for each instance type. If no weight
     * value is specified for an instance type, it is set to the default value "1". For more information about capacity
     * weighting, see <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html">
     * Instance Weighting for Amazon EC2 Auto Scaling</a> in the Amazon EC2 Auto Scaling User Guide.
     * </p>
     */
    private java.util.List<InstanceDefinition> instanceDefinitions;
    /**
     * <p>
     * Configuration settings to define a scaling policy for the Auto Scaling group that is optimized for game hosting.
     * The scaling policy uses the metric <code>"PercentUtilizedGameServers"</code> to maintain a buffer of idle game
     * servers that can immediately accommodate new games and players. After the Auto Scaling group is created, update
     * this value directly in the Auto Scaling group using the AWS console or APIs.
     * </p>
     */
    private GameServerGroupAutoScalingPolicy autoScalingPolicy;
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
     * Spot Instances, which can be terminated by AWS regardless of protection status. This property is set to
     * <code>NO_PROTECTION</code> by default.
     * </p>
     */
    private String gameServerProtectionPolicy;
    /**
     * <p>
     * A list of virtual private cloud (VPC) subnets to use with instances in the game server group. By default, all
     * GameLift FleetIQ-supported Availability Zones are used. You can use this parameter to specify VPCs that you've
     * set up. This property cannot be updated after the game server group is created, and the corresponding Auto
     * Scaling group will always use the property value that is set with this request, even if the Auto Scaling group is
     * updated directly.
     * </p>
     */
    private java.util.List<String> vpcSubnets;
    /**
     * <p>
     * A list of labels to assign to the new game server group resource. Tags are developer-defined key-value pairs.
     * Tagging AWS resources is useful for resource management, access management, and cost allocation. For more
     * information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS
     * Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use <a>TagResource</a>,
     * <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags, respectively. The maximum tag
     * limit may be lower than stated. See the AWS General Reference for actual tagging limits.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * An identifier for the new game server group. This value is used to generate unique ARN identifiers for the EC2
     * Auto Scaling group and the GameLift FleetIQ game server group. The name must be unique per Region per AWS
     * account.
     * </p>
     * 
     * @param gameServerGroupName
     *        An identifier for the new game server group. This value is used to generate unique ARN identifiers for the
     *        EC2 Auto Scaling group and the GameLift FleetIQ game server group. The name must be unique per Region per
     *        AWS account.
     */

    public void setGameServerGroupName(String gameServerGroupName) {
        this.gameServerGroupName = gameServerGroupName;
    }

    /**
     * <p>
     * An identifier for the new game server group. This value is used to generate unique ARN identifiers for the EC2
     * Auto Scaling group and the GameLift FleetIQ game server group. The name must be unique per Region per AWS
     * account.
     * </p>
     * 
     * @return An identifier for the new game server group. This value is used to generate unique ARN identifiers for
     *         the EC2 Auto Scaling group and the GameLift FleetIQ game server group. The name must be unique per Region
     *         per AWS account.
     */

    public String getGameServerGroupName() {
        return this.gameServerGroupName;
    }

    /**
     * <p>
     * An identifier for the new game server group. This value is used to generate unique ARN identifiers for the EC2
     * Auto Scaling group and the GameLift FleetIQ game server group. The name must be unique per Region per AWS
     * account.
     * </p>
     * 
     * @param gameServerGroupName
     *        An identifier for the new game server group. This value is used to generate unique ARN identifiers for the
     *        EC2 Auto Scaling group and the GameLift FleetIQ game server group. The name must be unique per Region per
     *        AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameServerGroupRequest withGameServerGroupName(String gameServerGroupName) {
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

    public CreateGameServerGroupRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The minimum number of instances allowed in the EC2 Auto Scaling group. During automatic scaling events, GameLift
     * FleetIQ and EC2 do not scale down the group below this minimum. In production, this value should be set to at
     * least 1. After the Auto Scaling group is created, update this value directly in the Auto Scaling group using the
     * AWS console or APIs.
     * </p>
     * 
     * @param minSize
     *        The minimum number of instances allowed in the EC2 Auto Scaling group. During automatic scaling events,
     *        GameLift FleetIQ and EC2 do not scale down the group below this minimum. In production, this value should
     *        be set to at least 1. After the Auto Scaling group is created, update this value directly in the Auto
     *        Scaling group using the AWS console or APIs.
     */

    public void setMinSize(Integer minSize) {
        this.minSize = minSize;
    }

    /**
     * <p>
     * The minimum number of instances allowed in the EC2 Auto Scaling group. During automatic scaling events, GameLift
     * FleetIQ and EC2 do not scale down the group below this minimum. In production, this value should be set to at
     * least 1. After the Auto Scaling group is created, update this value directly in the Auto Scaling group using the
     * AWS console or APIs.
     * </p>
     * 
     * @return The minimum number of instances allowed in the EC2 Auto Scaling group. During automatic scaling events,
     *         GameLift FleetIQ and EC2 do not scale down the group below this minimum. In production, this value should
     *         be set to at least 1. After the Auto Scaling group is created, update this value directly in the Auto
     *         Scaling group using the AWS console or APIs.
     */

    public Integer getMinSize() {
        return this.minSize;
    }

    /**
     * <p>
     * The minimum number of instances allowed in the EC2 Auto Scaling group. During automatic scaling events, GameLift
     * FleetIQ and EC2 do not scale down the group below this minimum. In production, this value should be set to at
     * least 1. After the Auto Scaling group is created, update this value directly in the Auto Scaling group using the
     * AWS console or APIs.
     * </p>
     * 
     * @param minSize
     *        The minimum number of instances allowed in the EC2 Auto Scaling group. During automatic scaling events,
     *        GameLift FleetIQ and EC2 do not scale down the group below this minimum. In production, this value should
     *        be set to at least 1. After the Auto Scaling group is created, update this value directly in the Auto
     *        Scaling group using the AWS console or APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameServerGroupRequest withMinSize(Integer minSize) {
        setMinSize(minSize);
        return this;
    }

    /**
     * <p>
     * The maximum number of instances allowed in the EC2 Auto Scaling group. During automatic scaling events, GameLift
     * FleetIQ and EC2 do not scale up the group above this maximum. After the Auto Scaling group is created, update
     * this value directly in the Auto Scaling group using the AWS console or APIs.
     * </p>
     * 
     * @param maxSize
     *        The maximum number of instances allowed in the EC2 Auto Scaling group. During automatic scaling events,
     *        GameLift FleetIQ and EC2 do not scale up the group above this maximum. After the Auto Scaling group is
     *        created, update this value directly in the Auto Scaling group using the AWS console or APIs.
     */

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * <p>
     * The maximum number of instances allowed in the EC2 Auto Scaling group. During automatic scaling events, GameLift
     * FleetIQ and EC2 do not scale up the group above this maximum. After the Auto Scaling group is created, update
     * this value directly in the Auto Scaling group using the AWS console or APIs.
     * </p>
     * 
     * @return The maximum number of instances allowed in the EC2 Auto Scaling group. During automatic scaling events,
     *         GameLift FleetIQ and EC2 do not scale up the group above this maximum. After the Auto Scaling group is
     *         created, update this value directly in the Auto Scaling group using the AWS console or APIs.
     */

    public Integer getMaxSize() {
        return this.maxSize;
    }

    /**
     * <p>
     * The maximum number of instances allowed in the EC2 Auto Scaling group. During automatic scaling events, GameLift
     * FleetIQ and EC2 do not scale up the group above this maximum. After the Auto Scaling group is created, update
     * this value directly in the Auto Scaling group using the AWS console or APIs.
     * </p>
     * 
     * @param maxSize
     *        The maximum number of instances allowed in the EC2 Auto Scaling group. During automatic scaling events,
     *        GameLift FleetIQ and EC2 do not scale up the group above this maximum. After the Auto Scaling group is
     *        created, update this value directly in the Auto Scaling group using the AWS console or APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameServerGroupRequest withMaxSize(Integer maxSize) {
        setMaxSize(maxSize);
        return this;
    }

    /**
     * <p>
     * The EC2 launch template that contains configuration settings and game server code to be deployed to all instances
     * in the game server group. You can specify the template using either the template name or ID. For help with
     * creating a launch template, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html">Creating a Launch
     * Template for an Auto Scaling Group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>. After the Auto Scaling
     * group is created, update this value directly in the Auto Scaling group using the AWS console or APIs.
     * </p>
     * <note>
     * <p>
     * If you specify network interfaces in your launch template, you must explicitly set the property
     * <code>AssociatePublicIpAddress</code> to "true". If no network interface is specified in the launch template,
     * GameLift FleetIQ uses your account's default VPC.
     * </p>
     * </note>
     * 
     * @param launchTemplate
     *        The EC2 launch template that contains configuration settings and game server code to be deployed to all
     *        instances in the game server group. You can specify the template using either the template name or ID. For
     *        help with creating a launch template, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html">Creating a Launch
     *        Template for an Auto Scaling Group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>. After the Auto
     *        Scaling group is created, update this value directly in the Auto Scaling group using the AWS console or
     *        APIs.</p> <note>
     *        <p>
     *        If you specify network interfaces in your launch template, you must explicitly set the property
     *        <code>AssociatePublicIpAddress</code> to "true". If no network interface is specified in the launch
     *        template, GameLift FleetIQ uses your account's default VPC.
     *        </p>
     */

    public void setLaunchTemplate(LaunchTemplateSpecification launchTemplate) {
        this.launchTemplate = launchTemplate;
    }

    /**
     * <p>
     * The EC2 launch template that contains configuration settings and game server code to be deployed to all instances
     * in the game server group. You can specify the template using either the template name or ID. For help with
     * creating a launch template, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html">Creating a Launch
     * Template for an Auto Scaling Group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>. After the Auto Scaling
     * group is created, update this value directly in the Auto Scaling group using the AWS console or APIs.
     * </p>
     * <note>
     * <p>
     * If you specify network interfaces in your launch template, you must explicitly set the property
     * <code>AssociatePublicIpAddress</code> to "true". If no network interface is specified in the launch template,
     * GameLift FleetIQ uses your account's default VPC.
     * </p>
     * </note>
     * 
     * @return The EC2 launch template that contains configuration settings and game server code to be deployed to all
     *         instances in the game server group. You can specify the template using either the template name or ID.
     *         For help with creating a launch template, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html">Creating a
     *         Launch Template for an Auto Scaling Group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>. After the
     *         Auto Scaling group is created, update this value directly in the Auto Scaling group using the AWS console
     *         or APIs.</p> <note>
     *         <p>
     *         If you specify network interfaces in your launch template, you must explicitly set the property
     *         <code>AssociatePublicIpAddress</code> to "true". If no network interface is specified in the launch
     *         template, GameLift FleetIQ uses your account's default VPC.
     *         </p>
     */

    public LaunchTemplateSpecification getLaunchTemplate() {
        return this.launchTemplate;
    }

    /**
     * <p>
     * The EC2 launch template that contains configuration settings and game server code to be deployed to all instances
     * in the game server group. You can specify the template using either the template name or ID. For help with
     * creating a launch template, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html">Creating a Launch
     * Template for an Auto Scaling Group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>. After the Auto Scaling
     * group is created, update this value directly in the Auto Scaling group using the AWS console or APIs.
     * </p>
     * <note>
     * <p>
     * If you specify network interfaces in your launch template, you must explicitly set the property
     * <code>AssociatePublicIpAddress</code> to "true". If no network interface is specified in the launch template,
     * GameLift FleetIQ uses your account's default VPC.
     * </p>
     * </note>
     * 
     * @param launchTemplate
     *        The EC2 launch template that contains configuration settings and game server code to be deployed to all
     *        instances in the game server group. You can specify the template using either the template name or ID. For
     *        help with creating a launch template, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html">Creating a Launch
     *        Template for an Auto Scaling Group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>. After the Auto
     *        Scaling group is created, update this value directly in the Auto Scaling group using the AWS console or
     *        APIs.</p> <note>
     *        <p>
     *        If you specify network interfaces in your launch template, you must explicitly set the property
     *        <code>AssociatePublicIpAddress</code> to "true". If no network interface is specified in the launch
     *        template, GameLift FleetIQ uses your account's default VPC.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameServerGroupRequest withLaunchTemplate(LaunchTemplateSpecification launchTemplate) {
        setLaunchTemplate(launchTemplate);
        return this;
    }

    /**
     * <p>
     * The EC2 instance types and sizes to use in the Auto Scaling group. The instance definitions must specify at least
     * two different instance types that are supported by GameLift FleetIQ. For more information on instance types, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">EC2 Instance Types</a> in the
     * <i>Amazon EC2 User Guide</i>. You can optionally specify capacity weighting for each instance type. If no weight
     * value is specified for an instance type, it is set to the default value "1". For more information about capacity
     * weighting, see <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html">
     * Instance Weighting for Amazon EC2 Auto Scaling</a> in the Amazon EC2 Auto Scaling User Guide.
     * </p>
     * 
     * @return The EC2 instance types and sizes to use in the Auto Scaling group. The instance definitions must specify
     *         at least two different instance types that are supported by GameLift FleetIQ. For more information on
     *         instance types, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">EC2
     *         Instance Types</a> in the <i>Amazon EC2 User Guide</i>. You can optionally specify capacity weighting for
     *         each instance type. If no weight value is specified for an instance type, it is set to the default value
     *         "1". For more information about capacity weighting, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html"> Instance
     *         Weighting for Amazon EC2 Auto Scaling</a> in the Amazon EC2 Auto Scaling User Guide.
     */

    public java.util.List<InstanceDefinition> getInstanceDefinitions() {
        return instanceDefinitions;
    }

    /**
     * <p>
     * The EC2 instance types and sizes to use in the Auto Scaling group. The instance definitions must specify at least
     * two different instance types that are supported by GameLift FleetIQ. For more information on instance types, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">EC2 Instance Types</a> in the
     * <i>Amazon EC2 User Guide</i>. You can optionally specify capacity weighting for each instance type. If no weight
     * value is specified for an instance type, it is set to the default value "1". For more information about capacity
     * weighting, see <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html">
     * Instance Weighting for Amazon EC2 Auto Scaling</a> in the Amazon EC2 Auto Scaling User Guide.
     * </p>
     * 
     * @param instanceDefinitions
     *        The EC2 instance types and sizes to use in the Auto Scaling group. The instance definitions must specify
     *        at least two different instance types that are supported by GameLift FleetIQ. For more information on
     *        instance types, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">EC2
     *        Instance Types</a> in the <i>Amazon EC2 User Guide</i>. You can optionally specify capacity weighting for
     *        each instance type. If no weight value is specified for an instance type, it is set to the default value
     *        "1". For more information about capacity weighting, see <a
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
     * The EC2 instance types and sizes to use in the Auto Scaling group. The instance definitions must specify at least
     * two different instance types that are supported by GameLift FleetIQ. For more information on instance types, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">EC2 Instance Types</a> in the
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
     *        The EC2 instance types and sizes to use in the Auto Scaling group. The instance definitions must specify
     *        at least two different instance types that are supported by GameLift FleetIQ. For more information on
     *        instance types, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">EC2
     *        Instance Types</a> in the <i>Amazon EC2 User Guide</i>. You can optionally specify capacity weighting for
     *        each instance type. If no weight value is specified for an instance type, it is set to the default value
     *        "1". For more information about capacity weighting, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html"> Instance
     *        Weighting for Amazon EC2 Auto Scaling</a> in the Amazon EC2 Auto Scaling User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameServerGroupRequest withInstanceDefinitions(InstanceDefinition... instanceDefinitions) {
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
     * The EC2 instance types and sizes to use in the Auto Scaling group. The instance definitions must specify at least
     * two different instance types that are supported by GameLift FleetIQ. For more information on instance types, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">EC2 Instance Types</a> in the
     * <i>Amazon EC2 User Guide</i>. You can optionally specify capacity weighting for each instance type. If no weight
     * value is specified for an instance type, it is set to the default value "1". For more information about capacity
     * weighting, see <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html">
     * Instance Weighting for Amazon EC2 Auto Scaling</a> in the Amazon EC2 Auto Scaling User Guide.
     * </p>
     * 
     * @param instanceDefinitions
     *        The EC2 instance types and sizes to use in the Auto Scaling group. The instance definitions must specify
     *        at least two different instance types that are supported by GameLift FleetIQ. For more information on
     *        instance types, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">EC2
     *        Instance Types</a> in the <i>Amazon EC2 User Guide</i>. You can optionally specify capacity weighting for
     *        each instance type. If no weight value is specified for an instance type, it is set to the default value
     *        "1". For more information about capacity weighting, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html"> Instance
     *        Weighting for Amazon EC2 Auto Scaling</a> in the Amazon EC2 Auto Scaling User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameServerGroupRequest withInstanceDefinitions(java.util.Collection<InstanceDefinition> instanceDefinitions) {
        setInstanceDefinitions(instanceDefinitions);
        return this;
    }

    /**
     * <p>
     * Configuration settings to define a scaling policy for the Auto Scaling group that is optimized for game hosting.
     * The scaling policy uses the metric <code>"PercentUtilizedGameServers"</code> to maintain a buffer of idle game
     * servers that can immediately accommodate new games and players. After the Auto Scaling group is created, update
     * this value directly in the Auto Scaling group using the AWS console or APIs.
     * </p>
     * 
     * @param autoScalingPolicy
     *        Configuration settings to define a scaling policy for the Auto Scaling group that is optimized for game
     *        hosting. The scaling policy uses the metric <code>"PercentUtilizedGameServers"</code> to maintain a buffer
     *        of idle game servers that can immediately accommodate new games and players. After the Auto Scaling group
     *        is created, update this value directly in the Auto Scaling group using the AWS console or APIs.
     */

    public void setAutoScalingPolicy(GameServerGroupAutoScalingPolicy autoScalingPolicy) {
        this.autoScalingPolicy = autoScalingPolicy;
    }

    /**
     * <p>
     * Configuration settings to define a scaling policy for the Auto Scaling group that is optimized for game hosting.
     * The scaling policy uses the metric <code>"PercentUtilizedGameServers"</code> to maintain a buffer of idle game
     * servers that can immediately accommodate new games and players. After the Auto Scaling group is created, update
     * this value directly in the Auto Scaling group using the AWS console or APIs.
     * </p>
     * 
     * @return Configuration settings to define a scaling policy for the Auto Scaling group that is optimized for game
     *         hosting. The scaling policy uses the metric <code>"PercentUtilizedGameServers"</code> to maintain a
     *         buffer of idle game servers that can immediately accommodate new games and players. After the Auto
     *         Scaling group is created, update this value directly in the Auto Scaling group using the AWS console or
     *         APIs.
     */

    public GameServerGroupAutoScalingPolicy getAutoScalingPolicy() {
        return this.autoScalingPolicy;
    }

    /**
     * <p>
     * Configuration settings to define a scaling policy for the Auto Scaling group that is optimized for game hosting.
     * The scaling policy uses the metric <code>"PercentUtilizedGameServers"</code> to maintain a buffer of idle game
     * servers that can immediately accommodate new games and players. After the Auto Scaling group is created, update
     * this value directly in the Auto Scaling group using the AWS console or APIs.
     * </p>
     * 
     * @param autoScalingPolicy
     *        Configuration settings to define a scaling policy for the Auto Scaling group that is optimized for game
     *        hosting. The scaling policy uses the metric <code>"PercentUtilizedGameServers"</code> to maintain a buffer
     *        of idle game servers that can immediately accommodate new games and players. After the Auto Scaling group
     *        is created, update this value directly in the Auto Scaling group using the AWS console or APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameServerGroupRequest withAutoScalingPolicy(GameServerGroupAutoScalingPolicy autoScalingPolicy) {
        setAutoScalingPolicy(autoScalingPolicy);
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

    public CreateGameServerGroupRequest withBalancingStrategy(String balancingStrategy) {
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

    public CreateGameServerGroupRequest withBalancingStrategy(BalancingStrategy balancingStrategy) {
        this.balancingStrategy = balancingStrategy.toString();
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

    public CreateGameServerGroupRequest withGameServerProtectionPolicy(String gameServerProtectionPolicy) {
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

    public CreateGameServerGroupRequest withGameServerProtectionPolicy(GameServerProtectionPolicy gameServerProtectionPolicy) {
        this.gameServerProtectionPolicy = gameServerProtectionPolicy.toString();
        return this;
    }

    /**
     * <p>
     * A list of virtual private cloud (VPC) subnets to use with instances in the game server group. By default, all
     * GameLift FleetIQ-supported Availability Zones are used. You can use this parameter to specify VPCs that you've
     * set up. This property cannot be updated after the game server group is created, and the corresponding Auto
     * Scaling group will always use the property value that is set with this request, even if the Auto Scaling group is
     * updated directly.
     * </p>
     * 
     * @return A list of virtual private cloud (VPC) subnets to use with instances in the game server group. By default,
     *         all GameLift FleetIQ-supported Availability Zones are used. You can use this parameter to specify VPCs
     *         that you've set up. This property cannot be updated after the game server group is created, and the
     *         corresponding Auto Scaling group will always use the property value that is set with this request, even
     *         if the Auto Scaling group is updated directly.
     */

    public java.util.List<String> getVpcSubnets() {
        return vpcSubnets;
    }

    /**
     * <p>
     * A list of virtual private cloud (VPC) subnets to use with instances in the game server group. By default, all
     * GameLift FleetIQ-supported Availability Zones are used. You can use this parameter to specify VPCs that you've
     * set up. This property cannot be updated after the game server group is created, and the corresponding Auto
     * Scaling group will always use the property value that is set with this request, even if the Auto Scaling group is
     * updated directly.
     * </p>
     * 
     * @param vpcSubnets
     *        A list of virtual private cloud (VPC) subnets to use with instances in the game server group. By default,
     *        all GameLift FleetIQ-supported Availability Zones are used. You can use this parameter to specify VPCs
     *        that you've set up. This property cannot be updated after the game server group is created, and the
     *        corresponding Auto Scaling group will always use the property value that is set with this request, even if
     *        the Auto Scaling group is updated directly.
     */

    public void setVpcSubnets(java.util.Collection<String> vpcSubnets) {
        if (vpcSubnets == null) {
            this.vpcSubnets = null;
            return;
        }

        this.vpcSubnets = new java.util.ArrayList<String>(vpcSubnets);
    }

    /**
     * <p>
     * A list of virtual private cloud (VPC) subnets to use with instances in the game server group. By default, all
     * GameLift FleetIQ-supported Availability Zones are used. You can use this parameter to specify VPCs that you've
     * set up. This property cannot be updated after the game server group is created, and the corresponding Auto
     * Scaling group will always use the property value that is set with this request, even if the Auto Scaling group is
     * updated directly.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSubnets(java.util.Collection)} or {@link #withVpcSubnets(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param vpcSubnets
     *        A list of virtual private cloud (VPC) subnets to use with instances in the game server group. By default,
     *        all GameLift FleetIQ-supported Availability Zones are used. You can use this parameter to specify VPCs
     *        that you've set up. This property cannot be updated after the game server group is created, and the
     *        corresponding Auto Scaling group will always use the property value that is set with this request, even if
     *        the Auto Scaling group is updated directly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameServerGroupRequest withVpcSubnets(String... vpcSubnets) {
        if (this.vpcSubnets == null) {
            setVpcSubnets(new java.util.ArrayList<String>(vpcSubnets.length));
        }
        for (String ele : vpcSubnets) {
            this.vpcSubnets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of virtual private cloud (VPC) subnets to use with instances in the game server group. By default, all
     * GameLift FleetIQ-supported Availability Zones are used. You can use this parameter to specify VPCs that you've
     * set up. This property cannot be updated after the game server group is created, and the corresponding Auto
     * Scaling group will always use the property value that is set with this request, even if the Auto Scaling group is
     * updated directly.
     * </p>
     * 
     * @param vpcSubnets
     *        A list of virtual private cloud (VPC) subnets to use with instances in the game server group. By default,
     *        all GameLift FleetIQ-supported Availability Zones are used. You can use this parameter to specify VPCs
     *        that you've set up. This property cannot be updated after the game server group is created, and the
     *        corresponding Auto Scaling group will always use the property value that is set with this request, even if
     *        the Auto Scaling group is updated directly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameServerGroupRequest withVpcSubnets(java.util.Collection<String> vpcSubnets) {
        setVpcSubnets(vpcSubnets);
        return this;
    }

    /**
     * <p>
     * A list of labels to assign to the new game server group resource. Tags are developer-defined key-value pairs.
     * Tagging AWS resources is useful for resource management, access management, and cost allocation. For more
     * information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS
     * Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use <a>TagResource</a>,
     * <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags, respectively. The maximum tag
     * limit may be lower than stated. See the AWS General Reference for actual tagging limits.
     * </p>
     * 
     * @return A list of labels to assign to the new game server group resource. Tags are developer-defined key-value
     *         pairs. Tagging AWS resources is useful for resource management, access management, and cost allocation.
     *         For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">
     *         Tagging AWS Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use
     *         <a>TagResource</a>, <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags,
     *         respectively. The maximum tag limit may be lower than stated. See the AWS General Reference for actual
     *         tagging limits.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of labels to assign to the new game server group resource. Tags are developer-defined key-value pairs.
     * Tagging AWS resources is useful for resource management, access management, and cost allocation. For more
     * information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS
     * Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use <a>TagResource</a>,
     * <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags, respectively. The maximum tag
     * limit may be lower than stated. See the AWS General Reference for actual tagging limits.
     * </p>
     * 
     * @param tags
     *        A list of labels to assign to the new game server group resource. Tags are developer-defined key-value
     *        pairs. Tagging AWS resources is useful for resource management, access management, and cost allocation.
     *        For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">
     *        Tagging AWS Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use
     *        <a>TagResource</a>, <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags,
     *        respectively. The maximum tag limit may be lower than stated. See the AWS General Reference for actual
     *        tagging limits.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of labels to assign to the new game server group resource. Tags are developer-defined key-value pairs.
     * Tagging AWS resources is useful for resource management, access management, and cost allocation. For more
     * information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS
     * Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use <a>TagResource</a>,
     * <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags, respectively. The maximum tag
     * limit may be lower than stated. See the AWS General Reference for actual tagging limits.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of labels to assign to the new game server group resource. Tags are developer-defined key-value
     *        pairs. Tagging AWS resources is useful for resource management, access management, and cost allocation.
     *        For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">
     *        Tagging AWS Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use
     *        <a>TagResource</a>, <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags,
     *        respectively. The maximum tag limit may be lower than stated. See the AWS General Reference for actual
     *        tagging limits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameServerGroupRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of labels to assign to the new game server group resource. Tags are developer-defined key-value pairs.
     * Tagging AWS resources is useful for resource management, access management, and cost allocation. For more
     * information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS
     * Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use <a>TagResource</a>,
     * <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags, respectively. The maximum tag
     * limit may be lower than stated. See the AWS General Reference for actual tagging limits.
     * </p>
     * 
     * @param tags
     *        A list of labels to assign to the new game server group resource. Tags are developer-defined key-value
     *        pairs. Tagging AWS resources is useful for resource management, access management, and cost allocation.
     *        For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">
     *        Tagging AWS Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use
     *        <a>TagResource</a>, <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags,
     *        respectively. The maximum tag limit may be lower than stated. See the AWS General Reference for actual
     *        tagging limits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameServerGroupRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getGameServerGroupName() != null)
            sb.append("GameServerGroupName: ").append(getGameServerGroupName()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getMinSize() != null)
            sb.append("MinSize: ").append(getMinSize()).append(",");
        if (getMaxSize() != null)
            sb.append("MaxSize: ").append(getMaxSize()).append(",");
        if (getLaunchTemplate() != null)
            sb.append("LaunchTemplate: ").append(getLaunchTemplate()).append(",");
        if (getInstanceDefinitions() != null)
            sb.append("InstanceDefinitions: ").append(getInstanceDefinitions()).append(",");
        if (getAutoScalingPolicy() != null)
            sb.append("AutoScalingPolicy: ").append(getAutoScalingPolicy()).append(",");
        if (getBalancingStrategy() != null)
            sb.append("BalancingStrategy: ").append(getBalancingStrategy()).append(",");
        if (getGameServerProtectionPolicy() != null)
            sb.append("GameServerProtectionPolicy: ").append(getGameServerProtectionPolicy()).append(",");
        if (getVpcSubnets() != null)
            sb.append("VpcSubnets: ").append(getVpcSubnets()).append(",");
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

        if (obj instanceof CreateGameServerGroupRequest == false)
            return false;
        CreateGameServerGroupRequest other = (CreateGameServerGroupRequest) obj;
        if (other.getGameServerGroupName() == null ^ this.getGameServerGroupName() == null)
            return false;
        if (other.getGameServerGroupName() != null && other.getGameServerGroupName().equals(this.getGameServerGroupName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getMinSize() == null ^ this.getMinSize() == null)
            return false;
        if (other.getMinSize() != null && other.getMinSize().equals(this.getMinSize()) == false)
            return false;
        if (other.getMaxSize() == null ^ this.getMaxSize() == null)
            return false;
        if (other.getMaxSize() != null && other.getMaxSize().equals(this.getMaxSize()) == false)
            return false;
        if (other.getLaunchTemplate() == null ^ this.getLaunchTemplate() == null)
            return false;
        if (other.getLaunchTemplate() != null && other.getLaunchTemplate().equals(this.getLaunchTemplate()) == false)
            return false;
        if (other.getInstanceDefinitions() == null ^ this.getInstanceDefinitions() == null)
            return false;
        if (other.getInstanceDefinitions() != null && other.getInstanceDefinitions().equals(this.getInstanceDefinitions()) == false)
            return false;
        if (other.getAutoScalingPolicy() == null ^ this.getAutoScalingPolicy() == null)
            return false;
        if (other.getAutoScalingPolicy() != null && other.getAutoScalingPolicy().equals(this.getAutoScalingPolicy()) == false)
            return false;
        if (other.getBalancingStrategy() == null ^ this.getBalancingStrategy() == null)
            return false;
        if (other.getBalancingStrategy() != null && other.getBalancingStrategy().equals(this.getBalancingStrategy()) == false)
            return false;
        if (other.getGameServerProtectionPolicy() == null ^ this.getGameServerProtectionPolicy() == null)
            return false;
        if (other.getGameServerProtectionPolicy() != null && other.getGameServerProtectionPolicy().equals(this.getGameServerProtectionPolicy()) == false)
            return false;
        if (other.getVpcSubnets() == null ^ this.getVpcSubnets() == null)
            return false;
        if (other.getVpcSubnets() != null && other.getVpcSubnets().equals(this.getVpcSubnets()) == false)
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

        hashCode = prime * hashCode + ((getGameServerGroupName() == null) ? 0 : getGameServerGroupName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getMinSize() == null) ? 0 : getMinSize().hashCode());
        hashCode = prime * hashCode + ((getMaxSize() == null) ? 0 : getMaxSize().hashCode());
        hashCode = prime * hashCode + ((getLaunchTemplate() == null) ? 0 : getLaunchTemplate().hashCode());
        hashCode = prime * hashCode + ((getInstanceDefinitions() == null) ? 0 : getInstanceDefinitions().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingPolicy() == null) ? 0 : getAutoScalingPolicy().hashCode());
        hashCode = prime * hashCode + ((getBalancingStrategy() == null) ? 0 : getBalancingStrategy().hashCode());
        hashCode = prime * hashCode + ((getGameServerProtectionPolicy() == null) ? 0 : getGameServerProtectionPolicy().hashCode());
        hashCode = prime * hashCode + ((getVpcSubnets() == null) ? 0 : getVpcSubnets().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateGameServerGroupRequest clone() {
        return (CreateGameServerGroupRequest) super.clone();
    }

}
