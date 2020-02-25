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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes an override for a launch template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/LaunchTemplateOverrides"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchTemplateOverrides implements Serializable, Cloneable {

    /**
     * <p>
     * The instance type.
     * </p>
     * <p>
     * For information about available instance types, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes">Available
     * Instance Types</a> in the <i>Amazon Elastic Compute Cloud User Guide.</i>
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The number of capacity units, which gives the instance type a proportional weight to other instance types. For
     * example, larger instance types are generally weighted more than smaller instance types. These are the same units
     * that you chose to set the desired capacity in terms of instances, or a performance attribute such as vCPUs,
     * memory, or I/O.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html">Instance Weighting for
     * Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * Valid Range: Minimum value of 1. Maximum value of 999.
     * </p>
     */
    private String weightedCapacity;

    /**
     * <p>
     * The instance type.
     * </p>
     * <p>
     * For information about available instance types, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes">Available
     * Instance Types</a> in the <i>Amazon Elastic Compute Cloud User Guide.</i>
     * </p>
     * 
     * @param instanceType
     *        The instance type.</p>
     *        <p>
     *        For information about available instance types, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes"
     *        >Available Instance Types</a> in the <i>Amazon Elastic Compute Cloud User Guide.</i>
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * <p>
     * For information about available instance types, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes">Available
     * Instance Types</a> in the <i>Amazon Elastic Compute Cloud User Guide.</i>
     * </p>
     * 
     * @return The instance type.</p>
     *         <p>
     *         For information about available instance types, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes"
     *         >Available Instance Types</a> in the <i>Amazon Elastic Compute Cloud User Guide.</i>
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * <p>
     * For information about available instance types, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes">Available
     * Instance Types</a> in the <i>Amazon Elastic Compute Cloud User Guide.</i>
     * </p>
     * 
     * @param instanceType
     *        The instance type.</p>
     *        <p>
     *        For information about available instance types, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes"
     *        >Available Instance Types</a> in the <i>Amazon Elastic Compute Cloud User Guide.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateOverrides withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The number of capacity units, which gives the instance type a proportional weight to other instance types. For
     * example, larger instance types are generally weighted more than smaller instance types. These are the same units
     * that you chose to set the desired capacity in terms of instances, or a performance attribute such as vCPUs,
     * memory, or I/O.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html">Instance Weighting for
     * Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * Valid Range: Minimum value of 1. Maximum value of 999.
     * </p>
     * 
     * @param weightedCapacity
     *        The number of capacity units, which gives the instance type a proportional weight to other instance types.
     *        For example, larger instance types are generally weighted more than smaller instance types. These are the
     *        same units that you chose to set the desired capacity in terms of instances, or a performance attribute
     *        such as vCPUs, memory, or I/O.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html">Instance
     *        Weighting for Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     *        </p>
     *        <p>
     *        Valid Range: Minimum value of 1. Maximum value of 999.
     */

    public void setWeightedCapacity(String weightedCapacity) {
        this.weightedCapacity = weightedCapacity;
    }

    /**
     * <p>
     * The number of capacity units, which gives the instance type a proportional weight to other instance types. For
     * example, larger instance types are generally weighted more than smaller instance types. These are the same units
     * that you chose to set the desired capacity in terms of instances, or a performance attribute such as vCPUs,
     * memory, or I/O.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html">Instance Weighting for
     * Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * Valid Range: Minimum value of 1. Maximum value of 999.
     * </p>
     * 
     * @return The number of capacity units, which gives the instance type a proportional weight to other instance
     *         types. For example, larger instance types are generally weighted more than smaller instance types. These
     *         are the same units that you chose to set the desired capacity in terms of instances, or a performance
     *         attribute such as vCPUs, memory, or I/O.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html">Instance
     *         Weighting for Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     *         </p>
     *         <p>
     *         Valid Range: Minimum value of 1. Maximum value of 999.
     */

    public String getWeightedCapacity() {
        return this.weightedCapacity;
    }

    /**
     * <p>
     * The number of capacity units, which gives the instance type a proportional weight to other instance types. For
     * example, larger instance types are generally weighted more than smaller instance types. These are the same units
     * that you chose to set the desired capacity in terms of instances, or a performance attribute such as vCPUs,
     * memory, or I/O.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html">Instance Weighting for
     * Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * Valid Range: Minimum value of 1. Maximum value of 999.
     * </p>
     * 
     * @param weightedCapacity
     *        The number of capacity units, which gives the instance type a proportional weight to other instance types.
     *        For example, larger instance types are generally weighted more than smaller instance types. These are the
     *        same units that you chose to set the desired capacity in terms of instances, or a performance attribute
     *        such as vCPUs, memory, or I/O.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html">Instance
     *        Weighting for Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     *        </p>
     *        <p>
     *        Valid Range: Minimum value of 1. Maximum value of 999.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateOverrides withWeightedCapacity(String weightedCapacity) {
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

        if (obj instanceof LaunchTemplateOverrides == false)
            return false;
        LaunchTemplateOverrides other = (LaunchTemplateOverrides) obj;
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
    public LaunchTemplateOverrides clone() {
        try {
            return (LaunchTemplateOverrides) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
