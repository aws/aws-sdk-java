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
 * An allowed instance type for a <a>GameServerGroup</a>. All game server groups must have at least two instance types
 * defined for it. GameLift FleetIQ periodically evaluates each defined instance type for viability. It then updates the
 * Auto Scaling group with the list of viable instance types.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/InstanceDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An EC2 instance type designation.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * Instance weighting that indicates how much this instance type contributes to the total capacity of a game server
     * group. Instance weights are used by GameLift FleetIQ to calculate the instance type's cost per unit hour and
     * better identify the most cost-effective options. For detailed information on weighting instance capacity, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html">Instance Weighting</a>
     * in the <i>Amazon EC2 Auto Scaling User Guide</i>. Default value is "1".
     * </p>
     */
    private String weightedCapacity;

    /**
     * <p>
     * An EC2 instance type designation.
     * </p>
     * 
     * @param instanceType
     *        An EC2 instance type designation.
     * @see GameServerGroupInstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * An EC2 instance type designation.
     * </p>
     * 
     * @return An EC2 instance type designation.
     * @see GameServerGroupInstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * An EC2 instance type designation.
     * </p>
     * 
     * @param instanceType
     *        An EC2 instance type designation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GameServerGroupInstanceType
     */

    public InstanceDefinition withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * An EC2 instance type designation.
     * </p>
     * 
     * @param instanceType
     *        An EC2 instance type designation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GameServerGroupInstanceType
     */

    public InstanceDefinition withInstanceType(GameServerGroupInstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * Instance weighting that indicates how much this instance type contributes to the total capacity of a game server
     * group. Instance weights are used by GameLift FleetIQ to calculate the instance type's cost per unit hour and
     * better identify the most cost-effective options. For detailed information on weighting instance capacity, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html">Instance Weighting</a>
     * in the <i>Amazon EC2 Auto Scaling User Guide</i>. Default value is "1".
     * </p>
     * 
     * @param weightedCapacity
     *        Instance weighting that indicates how much this instance type contributes to the total capacity of a game
     *        server group. Instance weights are used by GameLift FleetIQ to calculate the instance type's cost per unit
     *        hour and better identify the most cost-effective options. For detailed information on weighting instance
     *        capacity, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html">Instance
     *        Weighting</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>. Default value is "1".
     */

    public void setWeightedCapacity(String weightedCapacity) {
        this.weightedCapacity = weightedCapacity;
    }

    /**
     * <p>
     * Instance weighting that indicates how much this instance type contributes to the total capacity of a game server
     * group. Instance weights are used by GameLift FleetIQ to calculate the instance type's cost per unit hour and
     * better identify the most cost-effective options. For detailed information on weighting instance capacity, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html">Instance Weighting</a>
     * in the <i>Amazon EC2 Auto Scaling User Guide</i>. Default value is "1".
     * </p>
     * 
     * @return Instance weighting that indicates how much this instance type contributes to the total capacity of a game
     *         server group. Instance weights are used by GameLift FleetIQ to calculate the instance type's cost per
     *         unit hour and better identify the most cost-effective options. For detailed information on weighting
     *         instance capacity, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html">Instance
     *         Weighting</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>. Default value is "1".
     */

    public String getWeightedCapacity() {
        return this.weightedCapacity;
    }

    /**
     * <p>
     * Instance weighting that indicates how much this instance type contributes to the total capacity of a game server
     * group. Instance weights are used by GameLift FleetIQ to calculate the instance type's cost per unit hour and
     * better identify the most cost-effective options. For detailed information on weighting instance capacity, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html">Instance Weighting</a>
     * in the <i>Amazon EC2 Auto Scaling User Guide</i>. Default value is "1".
     * </p>
     * 
     * @param weightedCapacity
     *        Instance weighting that indicates how much this instance type contributes to the total capacity of a game
     *        server group. Instance weights are used by GameLift FleetIQ to calculate the instance type's cost per unit
     *        hour and better identify the most cost-effective options. For detailed information on weighting instance
     *        capacity, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html">Instance
     *        Weighting</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>. Default value is "1".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceDefinition withWeightedCapacity(String weightedCapacity) {
        setWeightedCapacity(weightedCapacity);
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
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getWeightedCapacity() != null)
            sb.append("WeightedCapacity: ").append(getWeightedCapacity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceDefinition == false)
            return false;
        InstanceDefinition other = (InstanceDefinition) obj;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getWeightedCapacity() == null ^ this.getWeightedCapacity() == null)
            return false;
        if (other.getWeightedCapacity() != null && other.getWeightedCapacity().equals(this.getWeightedCapacity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getWeightedCapacity() == null) ? 0 : getWeightedCapacity().hashCode());
        return hashCode;
    }

    @Override
    public InstanceDefinition clone() {
        try {
            return (InstanceDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.InstanceDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
