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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The mixed instances policy for the automatic scaling group.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The instances distribution. The instances distribution specifies the distribution of On-Demand Instances and Spot
     * Instances, the maximum price to pay for Spot Instances, and how the Auto Scaling group allocates instance types
     * to fulfill On-Demand and Spot capacity.
     * </p>
     */
    private AwsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetails instancesDistribution;
    /**
     * <p>
     * The launch template to use and the instance types (overrides) to use to provision EC2 instances to fulfill
     * On-Demand and Spot capacities.
     * </p>
     */
    private AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateDetails launchTemplate;

    /**
     * <p>
     * The instances distribution. The instances distribution specifies the distribution of On-Demand Instances and Spot
     * Instances, the maximum price to pay for Spot Instances, and how the Auto Scaling group allocates instance types
     * to fulfill On-Demand and Spot capacity.
     * </p>
     * 
     * @param instancesDistribution
     *        The instances distribution. The instances distribution specifies the distribution of On-Demand Instances
     *        and Spot Instances, the maximum price to pay for Spot Instances, and how the Auto Scaling group allocates
     *        instance types to fulfill On-Demand and Spot capacity.
     */

    public void setInstancesDistribution(AwsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetails instancesDistribution) {
        this.instancesDistribution = instancesDistribution;
    }

    /**
     * <p>
     * The instances distribution. The instances distribution specifies the distribution of On-Demand Instances and Spot
     * Instances, the maximum price to pay for Spot Instances, and how the Auto Scaling group allocates instance types
     * to fulfill On-Demand and Spot capacity.
     * </p>
     * 
     * @return The instances distribution. The instances distribution specifies the distribution of On-Demand Instances
     *         and Spot Instances, the maximum price to pay for Spot Instances, and how the Auto Scaling group allocates
     *         instance types to fulfill On-Demand and Spot capacity.
     */

    public AwsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetails getInstancesDistribution() {
        return this.instancesDistribution;
    }

    /**
     * <p>
     * The instances distribution. The instances distribution specifies the distribution of On-Demand Instances and Spot
     * Instances, the maximum price to pay for Spot Instances, and how the Auto Scaling group allocates instance types
     * to fulfill On-Demand and Spot capacity.
     * </p>
     * 
     * @param instancesDistribution
     *        The instances distribution. The instances distribution specifies the distribution of On-Demand Instances
     *        and Spot Instances, the maximum price to pay for Spot Instances, and how the Auto Scaling group allocates
     *        instance types to fulfill On-Demand and Spot capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetails withInstancesDistribution(
            AwsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetails instancesDistribution) {
        setInstancesDistribution(instancesDistribution);
        return this;
    }

    /**
     * <p>
     * The launch template to use and the instance types (overrides) to use to provision EC2 instances to fulfill
     * On-Demand and Spot capacities.
     * </p>
     * 
     * @param launchTemplate
     *        The launch template to use and the instance types (overrides) to use to provision EC2 instances to fulfill
     *        On-Demand and Spot capacities.
     */

    public void setLaunchTemplate(AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateDetails launchTemplate) {
        this.launchTemplate = launchTemplate;
    }

    /**
     * <p>
     * The launch template to use and the instance types (overrides) to use to provision EC2 instances to fulfill
     * On-Demand and Spot capacities.
     * </p>
     * 
     * @return The launch template to use and the instance types (overrides) to use to provision EC2 instances to
     *         fulfill On-Demand and Spot capacities.
     */

    public AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateDetails getLaunchTemplate() {
        return this.launchTemplate;
    }

    /**
     * <p>
     * The launch template to use and the instance types (overrides) to use to provision EC2 instances to fulfill
     * On-Demand and Spot capacities.
     * </p>
     * 
     * @param launchTemplate
     *        The launch template to use and the instance types (overrides) to use to provision EC2 instances to fulfill
     *        On-Demand and Spot capacities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetails withLaunchTemplate(
            AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateDetails launchTemplate) {
        setLaunchTemplate(launchTemplate);
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
        if (getInstancesDistribution() != null)
            sb.append("InstancesDistribution: ").append(getInstancesDistribution()).append(",");
        if (getLaunchTemplate() != null)
            sb.append("LaunchTemplate: ").append(getLaunchTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetails == false)
            return false;
        AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetails other = (AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetails) obj;
        if (other.getInstancesDistribution() == null ^ this.getInstancesDistribution() == null)
            return false;
        if (other.getInstancesDistribution() != null && other.getInstancesDistribution().equals(this.getInstancesDistribution()) == false)
            return false;
        if (other.getLaunchTemplate() == null ^ this.getLaunchTemplate() == null)
            return false;
        if (other.getLaunchTemplate() != null && other.getLaunchTemplate().equals(this.getLaunchTemplate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstancesDistribution() == null) ? 0 : getInstancesDistribution().hashCode());
        hashCode = prime * hashCode + ((getLaunchTemplate() == null) ? 0 : getLaunchTemplate().hashCode());
        return hashCode;
    }

    @Override
    public AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetails clone() {
        try {
            return (AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
