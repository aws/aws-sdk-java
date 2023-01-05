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
 * Property values to use to override the values in the launch template.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateOverridesListDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateOverridesListDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The instance type. For example, <code>m3.xlarge</code>.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The number of capacity units provided by the specified instance type in terms of virtual CPUs, memory, storage,
     * throughput, or other relative performance characteristic.
     * </p>
     */
    private String weightedCapacity;

    /**
     * <p>
     * The instance type. For example, <code>m3.xlarge</code>.
     * </p>
     * 
     * @param instanceType
     *        The instance type. For example, <code>m3.xlarge</code>.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type. For example, <code>m3.xlarge</code>.
     * </p>
     * 
     * @return The instance type. For example, <code>m3.xlarge</code>.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type. For example, <code>m3.xlarge</code>.
     * </p>
     * 
     * @param instanceType
     *        The instance type. For example, <code>m3.xlarge</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateOverridesListDetails withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The number of capacity units provided by the specified instance type in terms of virtual CPUs, memory, storage,
     * throughput, or other relative performance characteristic.
     * </p>
     * 
     * @param weightedCapacity
     *        The number of capacity units provided by the specified instance type in terms of virtual CPUs, memory,
     *        storage, throughput, or other relative performance characteristic.
     */

    public void setWeightedCapacity(String weightedCapacity) {
        this.weightedCapacity = weightedCapacity;
    }

    /**
     * <p>
     * The number of capacity units provided by the specified instance type in terms of virtual CPUs, memory, storage,
     * throughput, or other relative performance characteristic.
     * </p>
     * 
     * @return The number of capacity units provided by the specified instance type in terms of virtual CPUs, memory,
     *         storage, throughput, or other relative performance characteristic.
     */

    public String getWeightedCapacity() {
        return this.weightedCapacity;
    }

    /**
     * <p>
     * The number of capacity units provided by the specified instance type in terms of virtual CPUs, memory, storage,
     * throughput, or other relative performance characteristic.
     * </p>
     * 
     * @param weightedCapacity
     *        The number of capacity units provided by the specified instance type in terms of virtual CPUs, memory,
     *        storage, throughput, or other relative performance characteristic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateOverridesListDetails withWeightedCapacity(String weightedCapacity) {
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

        if (obj instanceof AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateOverridesListDetails == false)
            return false;
        AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateOverridesListDetails other = (AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateOverridesListDetails) obj;
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
    public AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateOverridesListDetails clone() {
        try {
            return (AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateOverridesListDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateOverridesListDetailsMarshaller
                .getInstance().marshall(this, protocolMarshaller);
    }
}
