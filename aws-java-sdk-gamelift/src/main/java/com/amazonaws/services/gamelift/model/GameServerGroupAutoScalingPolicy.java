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
 * Configuration settings for intelligent automatic scaling that uses target tracking. These settings are used to add an
 * Auto Scaling policy when creating the corresponding Auto Scaling group with <a>CreateGameServerGroup</a>. After the
 * Auto Scaling group is created, all updates to Auto Scaling policies, including changing this policy and adding or
 * removing other policies, is done directly on the Auto Scaling group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/GameServerGroupAutoScalingPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GameServerGroupAutoScalingPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Length of time, in seconds, it takes for a new instance to start new game server processes and register with
     * GameLift FleetIQ. Specifying a warm-up time can be useful, particularly with game servers that take a long time
     * to start up, because it avoids prematurely starting new instances.
     * </p>
     */
    private Integer estimatedInstanceWarmup;
    /**
     * <p>
     * Settings for a target-based scaling policy applied to Auto Scaling group. These settings are used to create a
     * target-based policy that tracks the GameLift FleetIQ metric <code>"PercentUtilizedGameServers"</code> and
     * specifies a target value for the metric. As player usage changes, the policy triggers to adjust the game server
     * group capacity so that the metric returns to the target value.
     * </p>
     */
    private TargetTrackingConfiguration targetTrackingConfiguration;

    /**
     * <p>
     * Length of time, in seconds, it takes for a new instance to start new game server processes and register with
     * GameLift FleetIQ. Specifying a warm-up time can be useful, particularly with game servers that take a long time
     * to start up, because it avoids prematurely starting new instances.
     * </p>
     * 
     * @param estimatedInstanceWarmup
     *        Length of time, in seconds, it takes for a new instance to start new game server processes and register
     *        with GameLift FleetIQ. Specifying a warm-up time can be useful, particularly with game servers that take a
     *        long time to start up, because it avoids prematurely starting new instances.
     */

    public void setEstimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
        this.estimatedInstanceWarmup = estimatedInstanceWarmup;
    }

    /**
     * <p>
     * Length of time, in seconds, it takes for a new instance to start new game server processes and register with
     * GameLift FleetIQ. Specifying a warm-up time can be useful, particularly with game servers that take a long time
     * to start up, because it avoids prematurely starting new instances.
     * </p>
     * 
     * @return Length of time, in seconds, it takes for a new instance to start new game server processes and register
     *         with GameLift FleetIQ. Specifying a warm-up time can be useful, particularly with game servers that take
     *         a long time to start up, because it avoids prematurely starting new instances.
     */

    public Integer getEstimatedInstanceWarmup() {
        return this.estimatedInstanceWarmup;
    }

    /**
     * <p>
     * Length of time, in seconds, it takes for a new instance to start new game server processes and register with
     * GameLift FleetIQ. Specifying a warm-up time can be useful, particularly with game servers that take a long time
     * to start up, because it avoids prematurely starting new instances.
     * </p>
     * 
     * @param estimatedInstanceWarmup
     *        Length of time, in seconds, it takes for a new instance to start new game server processes and register
     *        with GameLift FleetIQ. Specifying a warm-up time can be useful, particularly with game servers that take a
     *        long time to start up, because it avoids prematurely starting new instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameServerGroupAutoScalingPolicy withEstimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
        setEstimatedInstanceWarmup(estimatedInstanceWarmup);
        return this;
    }

    /**
     * <p>
     * Settings for a target-based scaling policy applied to Auto Scaling group. These settings are used to create a
     * target-based policy that tracks the GameLift FleetIQ metric <code>"PercentUtilizedGameServers"</code> and
     * specifies a target value for the metric. As player usage changes, the policy triggers to adjust the game server
     * group capacity so that the metric returns to the target value.
     * </p>
     * 
     * @param targetTrackingConfiguration
     *        Settings for a target-based scaling policy applied to Auto Scaling group. These settings are used to
     *        create a target-based policy that tracks the GameLift FleetIQ metric
     *        <code>"PercentUtilizedGameServers"</code> and specifies a target value for the metric. As player usage
     *        changes, the policy triggers to adjust the game server group capacity so that the metric returns to the
     *        target value.
     */

    public void setTargetTrackingConfiguration(TargetTrackingConfiguration targetTrackingConfiguration) {
        this.targetTrackingConfiguration = targetTrackingConfiguration;
    }

    /**
     * <p>
     * Settings for a target-based scaling policy applied to Auto Scaling group. These settings are used to create a
     * target-based policy that tracks the GameLift FleetIQ metric <code>"PercentUtilizedGameServers"</code> and
     * specifies a target value for the metric. As player usage changes, the policy triggers to adjust the game server
     * group capacity so that the metric returns to the target value.
     * </p>
     * 
     * @return Settings for a target-based scaling policy applied to Auto Scaling group. These settings are used to
     *         create a target-based policy that tracks the GameLift FleetIQ metric
     *         <code>"PercentUtilizedGameServers"</code> and specifies a target value for the metric. As player usage
     *         changes, the policy triggers to adjust the game server group capacity so that the metric returns to the
     *         target value.
     */

    public TargetTrackingConfiguration getTargetTrackingConfiguration() {
        return this.targetTrackingConfiguration;
    }

    /**
     * <p>
     * Settings for a target-based scaling policy applied to Auto Scaling group. These settings are used to create a
     * target-based policy that tracks the GameLift FleetIQ metric <code>"PercentUtilizedGameServers"</code> and
     * specifies a target value for the metric. As player usage changes, the policy triggers to adjust the game server
     * group capacity so that the metric returns to the target value.
     * </p>
     * 
     * @param targetTrackingConfiguration
     *        Settings for a target-based scaling policy applied to Auto Scaling group. These settings are used to
     *        create a target-based policy that tracks the GameLift FleetIQ metric
     *        <code>"PercentUtilizedGameServers"</code> and specifies a target value for the metric. As player usage
     *        changes, the policy triggers to adjust the game server group capacity so that the metric returns to the
     *        target value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameServerGroupAutoScalingPolicy withTargetTrackingConfiguration(TargetTrackingConfiguration targetTrackingConfiguration) {
        setTargetTrackingConfiguration(targetTrackingConfiguration);
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
        if (getEstimatedInstanceWarmup() != null)
            sb.append("EstimatedInstanceWarmup: ").append(getEstimatedInstanceWarmup()).append(",");
        if (getTargetTrackingConfiguration() != null)
            sb.append("TargetTrackingConfiguration: ").append(getTargetTrackingConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GameServerGroupAutoScalingPolicy == false)
            return false;
        GameServerGroupAutoScalingPolicy other = (GameServerGroupAutoScalingPolicy) obj;
        if (other.getEstimatedInstanceWarmup() == null ^ this.getEstimatedInstanceWarmup() == null)
            return false;
        if (other.getEstimatedInstanceWarmup() != null && other.getEstimatedInstanceWarmup().equals(this.getEstimatedInstanceWarmup()) == false)
            return false;
        if (other.getTargetTrackingConfiguration() == null ^ this.getTargetTrackingConfiguration() == null)
            return false;
        if (other.getTargetTrackingConfiguration() != null && other.getTargetTrackingConfiguration().equals(this.getTargetTrackingConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEstimatedInstanceWarmup() == null) ? 0 : getEstimatedInstanceWarmup().hashCode());
        hashCode = prime * hashCode + ((getTargetTrackingConfiguration() == null) ? 0 : getTargetTrackingConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public GameServerGroupAutoScalingPolicy clone() {
        try {
            return (GameServerGroupAutoScalingPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.GameServerGroupAutoScalingPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
