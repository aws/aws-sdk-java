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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a mixed instances policy for an Auto Scaling group. With mixed instances, your Auto Scaling group can
 * provision a combination of On-Demand Instances and Spot Instances across multiple instance types. Used in combination
 * with <a>CreateAutoScalingGroup</a>. For more information, see <a
 * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-purchase-options.html">Auto Scaling Groups with
 * Multiple Instance Types and Purchase Options</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
 * </p>
 * <p>
 * When you create your Auto Scaling group, you can specify a launch configuration or template as a parameter for the
 * top-level object, or you can specify a mixed instances policy, but not both at the same time.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/MixedInstancesPolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MixedInstancesPolicy implements Serializable, Cloneable {

    /**
     * <p>
     * The launch template and overrides.
     * </p>
     * <p>
     * This parameter is required when creating an Auto Scaling group with a mixed instances policy, but is not required
     * when updating the group.
     * </p>
     */
    private LaunchTemplate launchTemplate;
    /**
     * <p>
     * The instances distribution to use.
     * </p>
     * <p>
     * If you leave this parameter unspecified when creating the group, the default values are used.
     * </p>
     */
    private InstancesDistribution instancesDistribution;

    /**
     * <p>
     * The launch template and overrides.
     * </p>
     * <p>
     * This parameter is required when creating an Auto Scaling group with a mixed instances policy, but is not required
     * when updating the group.
     * </p>
     * 
     * @param launchTemplate
     *        The launch template and overrides.</p>
     *        <p>
     *        This parameter is required when creating an Auto Scaling group with a mixed instances policy, but is not
     *        required when updating the group.
     */

    public void setLaunchTemplate(LaunchTemplate launchTemplate) {
        this.launchTemplate = launchTemplate;
    }

    /**
     * <p>
     * The launch template and overrides.
     * </p>
     * <p>
     * This parameter is required when creating an Auto Scaling group with a mixed instances policy, but is not required
     * when updating the group.
     * </p>
     * 
     * @return The launch template and overrides.</p>
     *         <p>
     *         This parameter is required when creating an Auto Scaling group with a mixed instances policy, but is not
     *         required when updating the group.
     */

    public LaunchTemplate getLaunchTemplate() {
        return this.launchTemplate;
    }

    /**
     * <p>
     * The launch template and overrides.
     * </p>
     * <p>
     * This parameter is required when creating an Auto Scaling group with a mixed instances policy, but is not required
     * when updating the group.
     * </p>
     * 
     * @param launchTemplate
     *        The launch template and overrides.</p>
     *        <p>
     *        This parameter is required when creating an Auto Scaling group with a mixed instances policy, but is not
     *        required when updating the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MixedInstancesPolicy withLaunchTemplate(LaunchTemplate launchTemplate) {
        setLaunchTemplate(launchTemplate);
        return this;
    }

    /**
     * <p>
     * The instances distribution to use.
     * </p>
     * <p>
     * If you leave this parameter unspecified when creating the group, the default values are used.
     * </p>
     * 
     * @param instancesDistribution
     *        The instances distribution to use. </p>
     *        <p>
     *        If you leave this parameter unspecified when creating the group, the default values are used.
     */

    public void setInstancesDistribution(InstancesDistribution instancesDistribution) {
        this.instancesDistribution = instancesDistribution;
    }

    /**
     * <p>
     * The instances distribution to use.
     * </p>
     * <p>
     * If you leave this parameter unspecified when creating the group, the default values are used.
     * </p>
     * 
     * @return The instances distribution to use. </p>
     *         <p>
     *         If you leave this parameter unspecified when creating the group, the default values are used.
     */

    public InstancesDistribution getInstancesDistribution() {
        return this.instancesDistribution;
    }

    /**
     * <p>
     * The instances distribution to use.
     * </p>
     * <p>
     * If you leave this parameter unspecified when creating the group, the default values are used.
     * </p>
     * 
     * @param instancesDistribution
     *        The instances distribution to use. </p>
     *        <p>
     *        If you leave this parameter unspecified when creating the group, the default values are used.
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
