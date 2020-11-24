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
 * Describes an override for a launch template. The maximum number of instance types that can be associated with an Auto
 * Scaling group is 20. For more information, see <a
 * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-override-options.html">Configuring overrides</a> in
 * the <i>Amazon EC2 Auto Scaling User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/LaunchTemplateOverrides"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchTemplateOverrides implements Serializable, Cloneable {

    /**
     * <p>
     * The instance type, such as <code>m3.xlarge</code>. You must use an instance type that is supported in your
     * requested Region and Availability Zones. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The number of capacity units provided by the specified instance type in terms of virtual CPUs, memory, storage,
     * throughput, or other relative performance characteristic. When a Spot or On-Demand Instance is provisioned, the
     * capacity units count toward the desired capacity. Amazon EC2 Auto Scaling provisions instances until the desired
     * capacity is totally fulfilled, even if this results in an overage. For example, if there are 2 units remaining to
     * fulfill capacity, and Amazon EC2 Auto Scaling can only provision an instance with a <code>WeightedCapacity</code>
     * of 5 units, the instance is provisioned, and the desired capacity is exceeded by 3 units. For more information,
     * see <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html">Instance
     * weighting for Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>. Value must be in the
     * range of 1 to 999.
     * </p>
     */
    private String weightedCapacity;
    /**
     * <p>
     * Provides the launch template to be used when launching the instance type. For example, some instance types might
     * require a launch template with a different AMI. If not provided, Amazon EC2 Auto Scaling uses the launch template
     * that's defined for your mixed instances policy. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-launch-template-overrides.html">Specifying a
     * different launch template for an instance type</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private LaunchTemplateSpecification launchTemplateSpecification;

    /**
     * <p>
     * The instance type, such as <code>m3.xlarge</code>. You must use an instance type that is supported in your
     * requested Region and Availability Zones. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param instanceType
     *        The instance type, such as <code>m3.xlarge</code>. You must use an instance type that is supported in your
     *        requested Region and Availability Zones. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type, such as <code>m3.xlarge</code>. You must use an instance type that is supported in your
     * requested Region and Availability Zones. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return The instance type, such as <code>m3.xlarge</code>. You must use an instance type that is supported in
     *         your requested Region and Availability Zones. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     *         <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type, such as <code>m3.xlarge</code>. You must use an instance type that is supported in your
     * requested Region and Availability Zones. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param instanceType
     *        The instance type, such as <code>m3.xlarge</code>. You must use an instance type that is supported in your
     *        requested Region and Availability Zones. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateOverrides withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The number of capacity units provided by the specified instance type in terms of virtual CPUs, memory, storage,
     * throughput, or other relative performance characteristic. When a Spot or On-Demand Instance is provisioned, the
     * capacity units count toward the desired capacity. Amazon EC2 Auto Scaling provisions instances until the desired
     * capacity is totally fulfilled, even if this results in an overage. For example, if there are 2 units remaining to
     * fulfill capacity, and Amazon EC2 Auto Scaling can only provision an instance with a <code>WeightedCapacity</code>
     * of 5 units, the instance is provisioned, and the desired capacity is exceeded by 3 units. For more information,
     * see <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html">Instance
     * weighting for Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>. Value must be in the
     * range of 1 to 999.
     * </p>
     * 
     * @param weightedCapacity
     *        The number of capacity units provided by the specified instance type in terms of virtual CPUs, memory,
     *        storage, throughput, or other relative performance characteristic. When a Spot or On-Demand Instance is
     *        provisioned, the capacity units count toward the desired capacity. Amazon EC2 Auto Scaling provisions
     *        instances until the desired capacity is totally fulfilled, even if this results in an overage. For
     *        example, if there are 2 units remaining to fulfill capacity, and Amazon EC2 Auto Scaling can only
     *        provision an instance with a <code>WeightedCapacity</code> of 5 units, the instance is provisioned, and
     *        the desired capacity is exceeded by 3 units. For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html">Instance
     *        weighting for Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>. Value must be
     *        in the range of 1 to 999.
     */

    public void setWeightedCapacity(String weightedCapacity) {
        this.weightedCapacity = weightedCapacity;
    }

    /**
     * <p>
     * The number of capacity units provided by the specified instance type in terms of virtual CPUs, memory, storage,
     * throughput, or other relative performance characteristic. When a Spot or On-Demand Instance is provisioned, the
     * capacity units count toward the desired capacity. Amazon EC2 Auto Scaling provisions instances until the desired
     * capacity is totally fulfilled, even if this results in an overage. For example, if there are 2 units remaining to
     * fulfill capacity, and Amazon EC2 Auto Scaling can only provision an instance with a <code>WeightedCapacity</code>
     * of 5 units, the instance is provisioned, and the desired capacity is exceeded by 3 units. For more information,
     * see <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html">Instance
     * weighting for Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>. Value must be in the
     * range of 1 to 999.
     * </p>
     * 
     * @return The number of capacity units provided by the specified instance type in terms of virtual CPUs, memory,
     *         storage, throughput, or other relative performance characteristic. When a Spot or On-Demand Instance is
     *         provisioned, the capacity units count toward the desired capacity. Amazon EC2 Auto Scaling provisions
     *         instances until the desired capacity is totally fulfilled, even if this results in an overage. For
     *         example, if there are 2 units remaining to fulfill capacity, and Amazon EC2 Auto Scaling can only
     *         provision an instance with a <code>WeightedCapacity</code> of 5 units, the instance is provisioned, and
     *         the desired capacity is exceeded by 3 units. For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html">Instance
     *         weighting for Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>. Value must be
     *         in the range of 1 to 999.
     */

    public String getWeightedCapacity() {
        return this.weightedCapacity;
    }

    /**
     * <p>
     * The number of capacity units provided by the specified instance type in terms of virtual CPUs, memory, storage,
     * throughput, or other relative performance characteristic. When a Spot or On-Demand Instance is provisioned, the
     * capacity units count toward the desired capacity. Amazon EC2 Auto Scaling provisions instances until the desired
     * capacity is totally fulfilled, even if this results in an overage. For example, if there are 2 units remaining to
     * fulfill capacity, and Amazon EC2 Auto Scaling can only provision an instance with a <code>WeightedCapacity</code>
     * of 5 units, the instance is provisioned, and the desired capacity is exceeded by 3 units. For more information,
     * see <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html">Instance
     * weighting for Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>. Value must be in the
     * range of 1 to 999.
     * </p>
     * 
     * @param weightedCapacity
     *        The number of capacity units provided by the specified instance type in terms of virtual CPUs, memory,
     *        storage, throughput, or other relative performance characteristic. When a Spot or On-Demand Instance is
     *        provisioned, the capacity units count toward the desired capacity. Amazon EC2 Auto Scaling provisions
     *        instances until the desired capacity is totally fulfilled, even if this results in an overage. For
     *        example, if there are 2 units remaining to fulfill capacity, and Amazon EC2 Auto Scaling can only
     *        provision an instance with a <code>WeightedCapacity</code> of 5 units, the instance is provisioned, and
     *        the desired capacity is exceeded by 3 units. For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html">Instance
     *        weighting for Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>. Value must be
     *        in the range of 1 to 999.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateOverrides withWeightedCapacity(String weightedCapacity) {
        setWeightedCapacity(weightedCapacity);
        return this;
    }

    /**
     * <p>
     * Provides the launch template to be used when launching the instance type. For example, some instance types might
     * require a launch template with a different AMI. If not provided, Amazon EC2 Auto Scaling uses the launch template
     * that's defined for your mixed instances policy. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-launch-template-overrides.html">Specifying a
     * different launch template for an instance type</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param launchTemplateSpecification
     *        Provides the launch template to be used when launching the instance type. For example, some instance types
     *        might require a launch template with a different AMI. If not provided, Amazon EC2 Auto Scaling uses the
     *        launch template that's defined for your mixed instances policy. For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-launch-template-overrides.html">Specifying
     *        a different launch template for an instance type</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public void setLaunchTemplateSpecification(LaunchTemplateSpecification launchTemplateSpecification) {
        this.launchTemplateSpecification = launchTemplateSpecification;
    }

    /**
     * <p>
     * Provides the launch template to be used when launching the instance type. For example, some instance types might
     * require a launch template with a different AMI. If not provided, Amazon EC2 Auto Scaling uses the launch template
     * that's defined for your mixed instances policy. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-launch-template-overrides.html">Specifying a
     * different launch template for an instance type</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return Provides the launch template to be used when launching the instance type. For example, some instance
     *         types might require a launch template with a different AMI. If not provided, Amazon EC2 Auto Scaling uses
     *         the launch template that's defined for your mixed instances policy. For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-launch-template-overrides.html"
     *         >Specifying a different launch template for an instance type</a> in the <i>Amazon EC2 Auto Scaling User
     *         Guide</i>.
     */

    public LaunchTemplateSpecification getLaunchTemplateSpecification() {
        return this.launchTemplateSpecification;
    }

    /**
     * <p>
     * Provides the launch template to be used when launching the instance type. For example, some instance types might
     * require a launch template with a different AMI. If not provided, Amazon EC2 Auto Scaling uses the launch template
     * that's defined for your mixed instances policy. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-launch-template-overrides.html">Specifying a
     * different launch template for an instance type</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param launchTemplateSpecification
     *        Provides the launch template to be used when launching the instance type. For example, some instance types
     *        might require a launch template with a different AMI. If not provided, Amazon EC2 Auto Scaling uses the
     *        launch template that's defined for your mixed instances policy. For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-launch-template-overrides.html">Specifying
     *        a different launch template for an instance type</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateOverrides withLaunchTemplateSpecification(LaunchTemplateSpecification launchTemplateSpecification) {
        setLaunchTemplateSpecification(launchTemplateSpecification);
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
            sb.append("WeightedCapacity: ").append(getWeightedCapacity()).append(",");
        if (getLaunchTemplateSpecification() != null)
            sb.append("LaunchTemplateSpecification: ").append(getLaunchTemplateSpecification());
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
        if (other.getLaunchTemplateSpecification() == null ^ this.getLaunchTemplateSpecification() == null)
            return false;
        if (other.getLaunchTemplateSpecification() != null && other.getLaunchTemplateSpecification().equals(this.getLaunchTemplateSpecification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getWeightedCapacity() == null) ? 0 : getWeightedCapacity().hashCode());
        hashCode = prime * hashCode + ((getLaunchTemplateSpecification() == null) ? 0 : getLaunchTemplateSpecification().hashCode());
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
