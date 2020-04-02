/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The unique identifier of the game server group to update. Use either the <a>GameServerGroup</a> name or ARN
     * value.
     * </p>
     */
    private String gameServerGroupName;
    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * for an IAM role that allows Amazon GameLift to access your EC2 Auto Scaling groups. The submitted role is
     * validated to ensure that it contains the necessary permissions for game server groups.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * An updated list of EC2 instance types to use when creating instances in the group. The instance definition must
     * specify instance types that are supported by GameLift FleetIQ, and must include at least two instance types. This
     * updated list replaces the entire current list of instance definitions for the game server group. For more
     * information on instance types, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">EC2 Instance Types</a> in the
     * <i>Amazon EC2 User Guide</i>..
     * </p>
     */
    private java.util.List<InstanceDefinition> instanceDefinitions;
    /**
     * <p>
     * A flag that indicates whether instances in the game server group are protected from early termination.
     * Unprotected instances that have active game servers running may by terminated during a scale-down event, causing
     * players to be dropped from the game. Protected instances cannot be terminated while there are active game servers
     * running. An exception to this is Spot Instances, which may be terminated by AWS regardless of protection status.
     * This property is set to NO_PROTECTION by default.
     * </p>
     */
    private String gameServerProtectionPolicy;
    /**
     * <p>
     * The fallback balancing method to use for the game server group when Spot instances in a Region become unavailable
     * or are not viable for game hosting. Once triggered, this method remains active until Spot instances can once
     * again be used. Method options include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SPOT_ONLY -- If Spot instances are unavailable, the game server group provides no hosting capacity. No new
     * instances are started, and the existing nonviable Spot instances are terminated (once current gameplay ends) and
     * not replaced.
     * </p>
     * </li>
     * <li>
     * <p>
     * SPOT_PREFERRED -- If Spot instances are unavailable, the game server group continues to provide hosting capacity
     * by using On-Demand instances. Existing nonviable Spot instances are terminated (once current gameplay ends) and
     * replaced with new On-Demand instances.
     * </p>
     * </li>
     * </ul>
     */
    private String balancingStrategy;

    /**
     * <p>
     * The unique identifier of the game server group to update. Use either the <a>GameServerGroup</a> name or ARN
     * value.
     * </p>
     * 
     * @param gameServerGroupName
     *        The unique identifier of the game server group to update. Use either the <a>GameServerGroup</a> name or
     *        ARN value.
     */

    public void setGameServerGroupName(String gameServerGroupName) {
        this.gameServerGroupName = gameServerGroupName;
    }

    /**
     * <p>
     * The unique identifier of the game server group to update. Use either the <a>GameServerGroup</a> name or ARN
     * value.
     * </p>
     * 
     * @return The unique identifier of the game server group to update. Use either the <a>GameServerGroup</a> name or
     *         ARN value.
     */

    public String getGameServerGroupName() {
        return this.gameServerGroupName;
    }

    /**
     * <p>
     * The unique identifier of the game server group to update. Use either the <a>GameServerGroup</a> name or ARN
     * value.
     * </p>
     * 
     * @param gameServerGroupName
     *        The unique identifier of the game server group to update. Use either the <a>GameServerGroup</a> name or
     *        ARN value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGameServerGroupRequest withGameServerGroupName(String gameServerGroupName) {
        setGameServerGroupName(gameServerGroupName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * for an IAM role that allows Amazon GameLift to access your EC2 Auto Scaling groups. The submitted role is
     * validated to ensure that it contains the necessary permissions for game server groups.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) for an IAM role that
     *        allows Amazon GameLift to access your EC2 Auto Scaling groups. The submitted role is validated to ensure
     *        that it contains the necessary permissions for game server groups.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * for an IAM role that allows Amazon GameLift to access your EC2 Auto Scaling groups. The submitted role is
     * validated to ensure that it contains the necessary permissions for game server groups.
     * </p>
     * 
     * @return The Amazon Resource Name (<a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) for an IAM role that
     *         allows Amazon GameLift to access your EC2 Auto Scaling groups. The submitted role is validated to ensure
     *         that it contains the necessary permissions for game server groups.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * for an IAM role that allows Amazon GameLift to access your EC2 Auto Scaling groups. The submitted role is
     * validated to ensure that it contains the necessary permissions for game server groups.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) for an IAM role that
     *        allows Amazon GameLift to access your EC2 Auto Scaling groups. The submitted role is validated to ensure
     *        that it contains the necessary permissions for game server groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGameServerGroupRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * An updated list of EC2 instance types to use when creating instances in the group. The instance definition must
     * specify instance types that are supported by GameLift FleetIQ, and must include at least two instance types. This
     * updated list replaces the entire current list of instance definitions for the game server group. For more
     * information on instance types, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">EC2 Instance Types</a> in the
     * <i>Amazon EC2 User Guide</i>..
     * </p>
     * 
     * @return An updated list of EC2 instance types to use when creating instances in the group. The instance
     *         definition must specify instance types that are supported by GameLift FleetIQ, and must include at least
     *         two instance types. This updated list replaces the entire current list of instance definitions for the
     *         game server group. For more information on instance types, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">EC2 Instance Types</a> in
     *         the <i>Amazon EC2 User Guide</i>..
     */

    public java.util.List<InstanceDefinition> getInstanceDefinitions() {
        return instanceDefinitions;
    }

    /**
     * <p>
     * An updated list of EC2 instance types to use when creating instances in the group. The instance definition must
     * specify instance types that are supported by GameLift FleetIQ, and must include at least two instance types. This
     * updated list replaces the entire current list of instance definitions for the game server group. For more
     * information on instance types, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">EC2 Instance Types</a> in the
     * <i>Amazon EC2 User Guide</i>..
     * </p>
     * 
     * @param instanceDefinitions
     *        An updated list of EC2 instance types to use when creating instances in the group. The instance definition
     *        must specify instance types that are supported by GameLift FleetIQ, and must include at least two instance
     *        types. This updated list replaces the entire current list of instance definitions for the game server
     *        group. For more information on instance types, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">EC2 Instance Types</a> in
     *        the <i>Amazon EC2 User Guide</i>..
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
     * An updated list of EC2 instance types to use when creating instances in the group. The instance definition must
     * specify instance types that are supported by GameLift FleetIQ, and must include at least two instance types. This
     * updated list replaces the entire current list of instance definitions for the game server group. For more
     * information on instance types, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">EC2 Instance Types</a> in the
     * <i>Amazon EC2 User Guide</i>..
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceDefinitions(java.util.Collection)} or {@link #withInstanceDefinitions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param instanceDefinitions
     *        An updated list of EC2 instance types to use when creating instances in the group. The instance definition
     *        must specify instance types that are supported by GameLift FleetIQ, and must include at least two instance
     *        types. This updated list replaces the entire current list of instance definitions for the game server
     *        group. For more information on instance types, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">EC2 Instance Types</a> in
     *        the <i>Amazon EC2 User Guide</i>..
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
     * An updated list of EC2 instance types to use when creating instances in the group. The instance definition must
     * specify instance types that are supported by GameLift FleetIQ, and must include at least two instance types. This
     * updated list replaces the entire current list of instance definitions for the game server group. For more
     * information on instance types, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">EC2 Instance Types</a> in the
     * <i>Amazon EC2 User Guide</i>..
     * </p>
     * 
     * @param instanceDefinitions
     *        An updated list of EC2 instance types to use when creating instances in the group. The instance definition
     *        must specify instance types that are supported by GameLift FleetIQ, and must include at least two instance
     *        types. This updated list replaces the entire current list of instance definitions for the game server
     *        group. For more information on instance types, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">EC2 Instance Types</a> in
     *        the <i>Amazon EC2 User Guide</i>..
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGameServerGroupRequest withInstanceDefinitions(java.util.Collection<InstanceDefinition> instanceDefinitions) {
        setInstanceDefinitions(instanceDefinitions);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether instances in the game server group are protected from early termination.
     * Unprotected instances that have active game servers running may by terminated during a scale-down event, causing
     * players to be dropped from the game. Protected instances cannot be terminated while there are active game servers
     * running. An exception to this is Spot Instances, which may be terminated by AWS regardless of protection status.
     * This property is set to NO_PROTECTION by default.
     * </p>
     * 
     * @param gameServerProtectionPolicy
     *        A flag that indicates whether instances in the game server group are protected from early termination.
     *        Unprotected instances that have active game servers running may by terminated during a scale-down event,
     *        causing players to be dropped from the game. Protected instances cannot be terminated while there are
     *        active game servers running. An exception to this is Spot Instances, which may be terminated by AWS
     *        regardless of protection status. This property is set to NO_PROTECTION by default.
     * @see GameServerProtectionPolicy
     */

    public void setGameServerProtectionPolicy(String gameServerProtectionPolicy) {
        this.gameServerProtectionPolicy = gameServerProtectionPolicy;
    }

    /**
     * <p>
     * A flag that indicates whether instances in the game server group are protected from early termination.
     * Unprotected instances that have active game servers running may by terminated during a scale-down event, causing
     * players to be dropped from the game. Protected instances cannot be terminated while there are active game servers
     * running. An exception to this is Spot Instances, which may be terminated by AWS regardless of protection status.
     * This property is set to NO_PROTECTION by default.
     * </p>
     * 
     * @return A flag that indicates whether instances in the game server group are protected from early termination.
     *         Unprotected instances that have active game servers running may by terminated during a scale-down event,
     *         causing players to be dropped from the game. Protected instances cannot be terminated while there are
     *         active game servers running. An exception to this is Spot Instances, which may be terminated by AWS
     *         regardless of protection status. This property is set to NO_PROTECTION by default.
     * @see GameServerProtectionPolicy
     */

    public String getGameServerProtectionPolicy() {
        return this.gameServerProtectionPolicy;
    }

    /**
     * <p>
     * A flag that indicates whether instances in the game server group are protected from early termination.
     * Unprotected instances that have active game servers running may by terminated during a scale-down event, causing
     * players to be dropped from the game. Protected instances cannot be terminated while there are active game servers
     * running. An exception to this is Spot Instances, which may be terminated by AWS regardless of protection status.
     * This property is set to NO_PROTECTION by default.
     * </p>
     * 
     * @param gameServerProtectionPolicy
     *        A flag that indicates whether instances in the game server group are protected from early termination.
     *        Unprotected instances that have active game servers running may by terminated during a scale-down event,
     *        causing players to be dropped from the game. Protected instances cannot be terminated while there are
     *        active game servers running. An exception to this is Spot Instances, which may be terminated by AWS
     *        regardless of protection status. This property is set to NO_PROTECTION by default.
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
     * Unprotected instances that have active game servers running may by terminated during a scale-down event, causing
     * players to be dropped from the game. Protected instances cannot be terminated while there are active game servers
     * running. An exception to this is Spot Instances, which may be terminated by AWS regardless of protection status.
     * This property is set to NO_PROTECTION by default.
     * </p>
     * 
     * @param gameServerProtectionPolicy
     *        A flag that indicates whether instances in the game server group are protected from early termination.
     *        Unprotected instances that have active game servers running may by terminated during a scale-down event,
     *        causing players to be dropped from the game. Protected instances cannot be terminated while there are
     *        active game servers running. An exception to this is Spot Instances, which may be terminated by AWS
     *        regardless of protection status. This property is set to NO_PROTECTION by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GameServerProtectionPolicy
     */

    public UpdateGameServerGroupRequest withGameServerProtectionPolicy(GameServerProtectionPolicy gameServerProtectionPolicy) {
        this.gameServerProtectionPolicy = gameServerProtectionPolicy.toString();
        return this;
    }

    /**
     * <p>
     * The fallback balancing method to use for the game server group when Spot instances in a Region become unavailable
     * or are not viable for game hosting. Once triggered, this method remains active until Spot instances can once
     * again be used. Method options include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SPOT_ONLY -- If Spot instances are unavailable, the game server group provides no hosting capacity. No new
     * instances are started, and the existing nonviable Spot instances are terminated (once current gameplay ends) and
     * not replaced.
     * </p>
     * </li>
     * <li>
     * <p>
     * SPOT_PREFERRED -- If Spot instances are unavailable, the game server group continues to provide hosting capacity
     * by using On-Demand instances. Existing nonviable Spot instances are terminated (once current gameplay ends) and
     * replaced with new On-Demand instances.
     * </p>
     * </li>
     * </ul>
     * 
     * @param balancingStrategy
     *        The fallback balancing method to use for the game server group when Spot instances in a Region become
     *        unavailable or are not viable for game hosting. Once triggered, this method remains active until Spot
     *        instances can once again be used. Method options include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        SPOT_ONLY -- If Spot instances are unavailable, the game server group provides no hosting capacity. No new
     *        instances are started, and the existing nonviable Spot instances are terminated (once current gameplay
     *        ends) and not replaced.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SPOT_PREFERRED -- If Spot instances are unavailable, the game server group continues to provide hosting
     *        capacity by using On-Demand instances. Existing nonviable Spot instances are terminated (once current
     *        gameplay ends) and replaced with new On-Demand instances.
     *        </p>
     *        </li>
     * @see BalancingStrategy
     */

    public void setBalancingStrategy(String balancingStrategy) {
        this.balancingStrategy = balancingStrategy;
    }

    /**
     * <p>
     * The fallback balancing method to use for the game server group when Spot instances in a Region become unavailable
     * or are not viable for game hosting. Once triggered, this method remains active until Spot instances can once
     * again be used. Method options include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SPOT_ONLY -- If Spot instances are unavailable, the game server group provides no hosting capacity. No new
     * instances are started, and the existing nonviable Spot instances are terminated (once current gameplay ends) and
     * not replaced.
     * </p>
     * </li>
     * <li>
     * <p>
     * SPOT_PREFERRED -- If Spot instances are unavailable, the game server group continues to provide hosting capacity
     * by using On-Demand instances. Existing nonviable Spot instances are terminated (once current gameplay ends) and
     * replaced with new On-Demand instances.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The fallback balancing method to use for the game server group when Spot instances in a Region become
     *         unavailable or are not viable for game hosting. Once triggered, this method remains active until Spot
     *         instances can once again be used. Method options include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         SPOT_ONLY -- If Spot instances are unavailable, the game server group provides no hosting capacity. No
     *         new instances are started, and the existing nonviable Spot instances are terminated (once current
     *         gameplay ends) and not replaced.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SPOT_PREFERRED -- If Spot instances are unavailable, the game server group continues to provide hosting
     *         capacity by using On-Demand instances. Existing nonviable Spot instances are terminated (once current
     *         gameplay ends) and replaced with new On-Demand instances.
     *         </p>
     *         </li>
     * @see BalancingStrategy
     */

    public String getBalancingStrategy() {
        return this.balancingStrategy;
    }

    /**
     * <p>
     * The fallback balancing method to use for the game server group when Spot instances in a Region become unavailable
     * or are not viable for game hosting. Once triggered, this method remains active until Spot instances can once
     * again be used. Method options include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SPOT_ONLY -- If Spot instances are unavailable, the game server group provides no hosting capacity. No new
     * instances are started, and the existing nonviable Spot instances are terminated (once current gameplay ends) and
     * not replaced.
     * </p>
     * </li>
     * <li>
     * <p>
     * SPOT_PREFERRED -- If Spot instances are unavailable, the game server group continues to provide hosting capacity
     * by using On-Demand instances. Existing nonviable Spot instances are terminated (once current gameplay ends) and
     * replaced with new On-Demand instances.
     * </p>
     * </li>
     * </ul>
     * 
     * @param balancingStrategy
     *        The fallback balancing method to use for the game server group when Spot instances in a Region become
     *        unavailable or are not viable for game hosting. Once triggered, this method remains active until Spot
     *        instances can once again be used. Method options include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        SPOT_ONLY -- If Spot instances are unavailable, the game server group provides no hosting capacity. No new
     *        instances are started, and the existing nonviable Spot instances are terminated (once current gameplay
     *        ends) and not replaced.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SPOT_PREFERRED -- If Spot instances are unavailable, the game server group continues to provide hosting
     *        capacity by using On-Demand instances. Existing nonviable Spot instances are terminated (once current
     *        gameplay ends) and replaced with new On-Demand instances.
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
     * The fallback balancing method to use for the game server group when Spot instances in a Region become unavailable
     * or are not viable for game hosting. Once triggered, this method remains active until Spot instances can once
     * again be used. Method options include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SPOT_ONLY -- If Spot instances are unavailable, the game server group provides no hosting capacity. No new
     * instances are started, and the existing nonviable Spot instances are terminated (once current gameplay ends) and
     * not replaced.
     * </p>
     * </li>
     * <li>
     * <p>
     * SPOT_PREFERRED -- If Spot instances are unavailable, the game server group continues to provide hosting capacity
     * by using On-Demand instances. Existing nonviable Spot instances are terminated (once current gameplay ends) and
     * replaced with new On-Demand instances.
     * </p>
     * </li>
     * </ul>
     * 
     * @param balancingStrategy
     *        The fallback balancing method to use for the game server group when Spot instances in a Region become
     *        unavailable or are not viable for game hosting. Once triggered, this method remains active until Spot
     *        instances can once again be used. Method options include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        SPOT_ONLY -- If Spot instances are unavailable, the game server group provides no hosting capacity. No new
     *        instances are started, and the existing nonviable Spot instances are terminated (once current gameplay
     *        ends) and not replaced.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SPOT_PREFERRED -- If Spot instances are unavailable, the game server group continues to provide hosting
     *        capacity by using On-Demand instances. Existing nonviable Spot instances are terminated (once current
     *        gameplay ends) and replaced with new On-Demand instances.
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
