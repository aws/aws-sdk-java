/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Use this structure to launch multiple instance types and On-Demand Instances and Spot Instances within a single Auto
 * Scaling group.
 * </p>
 * <p>
 * A mixed instances policy contains information that Amazon EC2 Auto Scaling can use to launch instances and help
 * optimize your costs. For more information, see <a
 * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups.html">Auto
 * Scaling groups with multiple instance types and purchase options</a> in the <i>Amazon EC2 Auto Scaling User
 * Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/MixedInstancesPolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MixedInstancesPolicy implements Serializable, Cloneable {

    /**
     * <p>
     * One or more launch templates and the instance types (overrides) that are used to launch EC2 instances to fulfill
     * On-Demand and Spot capacities.
     * </p>
     */
    private LaunchTemplate launchTemplate;
    /**
     * <p>
     * The instances distribution.
     * </p>
     */
    private InstancesDistribution instancesDistribution;

    /**
     * <p>
     * One or more launch templates and the instance types (overrides) that are used to launch EC2 instances to fulfill
     * On-Demand and Spot capacities.
     * </p>
     * 
     * @param launchTemplate
     *        One or more launch templates and the instance types (overrides) that are used to launch EC2 instances to
     *        fulfill On-Demand and Spot capacities.
     */

    public void setLaunchTemplate(LaunchTemplate launchTemplate) {
        this.launchTemplate = launchTemplate;
    }

    /**
     * <p>
     * One or more launch templates and the instance types (overrides) that are used to launch EC2 instances to fulfill
     * On-Demand and Spot capacities.
     * </p>
     * 
     * @return One or more launch templates and the instance types (overrides) that are used to launch EC2 instances to
     *         fulfill On-Demand and Spot capacities.
     */

    public LaunchTemplate getLaunchTemplate() {
        return this.launchTemplate;
    }

    /**
     * <p>
     * One or more launch templates and the instance types (overrides) that are used to launch EC2 instances to fulfill
     * On-Demand and Spot capacities.
     * </p>
     * 
     * @param launchTemplate
     *        One or more launch templates and the instance types (overrides) that are used to launch EC2 instances to
     *        fulfill On-Demand and Spot capacities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MixedInstancesPolicy withLaunchTemplate(LaunchTemplate launchTemplate) {
        setLaunchTemplate(launchTemplate);
        return this;
    }

    /**
     * <p>
     * The instances distribution.
     * </p>
     * 
     * @param instancesDistribution
     *        The instances distribution.
     */

    public void setInstancesDistribution(InstancesDistribution instancesDistribution) {
        this.instancesDistribution = instancesDistribution;
    }

    /**
     * <p>
     * The instances distribution.
     * </p>
     * 
     * @return The instances distribution.
     */

    public InstancesDistribution getInstancesDistribution() {
        return this.instancesDistribution;
    }

    /**
     * <p>
     * The instances distribution.
     * </p>
     * 
     * @param instancesDistribution
     *        The instances distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MixedInstancesPolicy withInstancesDistribution(InstancesDistribution instancesDistribution) {
        setInstancesDistribution(instancesDistribution);
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
        if (getLaunchTemplate() != null)
            sb.append("LaunchTemplate: ").append(getLaunchTemplate()).append(",");
        if (getInstancesDistribution() != null)
            sb.append("InstancesDistribution: ").append(getInstancesDistribution());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MixedInstancesPolicy == false)
            return false;
        MixedInstancesPolicy other = (MixedInstancesPolicy) obj;
        if (other.getLaunchTemplate() == null ^ this.getLaunchTemplate() == null)
            return false;
        if (other.getLaunchTemplate() != null && other.getLaunchTemplate().equals(this.getLaunchTemplate()) == false)
            return false;
        if (other.getInstancesDistribution() == null ^ this.getInstancesDistribution() == null)
            return false;
        if (other.getInstancesDistribution() != null && other.getInstancesDistribution().equals(this.getInstancesDistribution()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLaunchTemplate() == null) ? 0 : getLaunchTemplate().hashCode());
        hashCode = prime * hashCode + ((getInstancesDistribution() == null) ? 0 : getInstancesDistribution().hashCode());
        return hashCode;
    }

    @Override
    public MixedInstancesPolicy clone() {
        try {
            return (MixedInstancesPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
