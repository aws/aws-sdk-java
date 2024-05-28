/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes the desired configuration for an instance refresh.
 * </p>
 * <p>
 * If you specify a desired configuration, you must specify either a <code>LaunchTemplate</code> or a
 * <code>MixedInstancesPolicy</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DesiredConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DesiredConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * Describes the launch template and the version of the launch template that Amazon EC2 Auto Scaling uses to launch
     * Amazon EC2 instances. For more information about launch templates, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/LaunchTemplates.html">Launch templates</a> in the
     * <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private LaunchTemplateSpecification launchTemplate;
    /**
     * <p>
     * Use this structure to launch multiple instance types and On-Demand Instances and Spot Instances within a single
     * Auto Scaling group.
     * </p>
     * <p>
     * A mixed instances policy contains information that Amazon EC2 Auto Scaling can use to launch instances and help
     * optimize your costs. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups.html">Auto
     * Scaling groups with multiple instance types and purchase options</a> in the <i>Amazon EC2 Auto Scaling User
     * Guide</i>.
     * </p>
     */
    private MixedInstancesPolicy mixedInstancesPolicy;

    /**
     * <p>
     * Describes the launch template and the version of the launch template that Amazon EC2 Auto Scaling uses to launch
     * Amazon EC2 instances. For more information about launch templates, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/LaunchTemplates.html">Launch templates</a> in the
     * <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param launchTemplate
     *        Describes the launch template and the version of the launch template that Amazon EC2 Auto Scaling uses to
     *        launch Amazon EC2 instances. For more information about launch templates, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/LaunchTemplates.html">Launch templates</a> in
     *        the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public void setLaunchTemplate(LaunchTemplateSpecification launchTemplate) {
        this.launchTemplate = launchTemplate;
    }

    /**
     * <p>
     * Describes the launch template and the version of the launch template that Amazon EC2 Auto Scaling uses to launch
     * Amazon EC2 instances. For more information about launch templates, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/LaunchTemplates.html">Launch templates</a> in the
     * <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return Describes the launch template and the version of the launch template that Amazon EC2 Auto Scaling uses to
     *         launch Amazon EC2 instances. For more information about launch templates, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/LaunchTemplates.html">Launch templates</a> in
     *         the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public LaunchTemplateSpecification getLaunchTemplate() {
        return this.launchTemplate;
    }

    /**
     * <p>
     * Describes the launch template and the version of the launch template that Amazon EC2 Auto Scaling uses to launch
     * Amazon EC2 instances. For more information about launch templates, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/LaunchTemplates.html">Launch templates</a> in the
     * <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param launchTemplate
     *        Describes the launch template and the version of the launch template that Amazon EC2 Auto Scaling uses to
     *        launch Amazon EC2 instances. For more information about launch templates, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/LaunchTemplates.html">Launch templates</a> in
     *        the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DesiredConfiguration withLaunchTemplate(LaunchTemplateSpecification launchTemplate) {
        setLaunchTemplate(launchTemplate);
        return this;
    }

    /**
     * <p>
     * Use this structure to launch multiple instance types and On-Demand Instances and Spot Instances within a single
     * Auto Scaling group.
     * </p>
     * <p>
     * A mixed instances policy contains information that Amazon EC2 Auto Scaling can use to launch instances and help
     * optimize your costs. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups.html">Auto
     * Scaling groups with multiple instance types and purchase options</a> in the <i>Amazon EC2 Auto Scaling User
     * Guide</i>.
     * </p>
     * 
     * @param mixedInstancesPolicy
     *        Use this structure to launch multiple instance types and On-Demand Instances and Spot Instances within a
     *        single Auto Scaling group.</p>
     *        <p>
     *        A mixed instances policy contains information that Amazon EC2 Auto Scaling can use to launch instances and
     *        help optimize your costs. For more information, see <a href=
     *        "https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups.html">Auto
     *        Scaling groups with multiple instance types and purchase options</a> in the <i>Amazon EC2 Auto Scaling
     *        User Guide</i>.
     */

    public void setMixedInstancesPolicy(MixedInstancesPolicy mixedInstancesPolicy) {
        this.mixedInstancesPolicy = mixedInstancesPolicy;
    }

    /**
     * <p>
     * Use this structure to launch multiple instance types and On-Demand Instances and Spot Instances within a single
     * Auto Scaling group.
     * </p>
     * <p>
     * A mixed instances policy contains information that Amazon EC2 Auto Scaling can use to launch instances and help
     * optimize your costs. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups.html">Auto
     * Scaling groups with multiple instance types and purchase options</a> in the <i>Amazon EC2 Auto Scaling User
     * Guide</i>.
     * </p>
     * 
     * @return Use this structure to launch multiple instance types and On-Demand Instances and Spot Instances within a
     *         single Auto Scaling group.</p>
     *         <p>
     *         A mixed instances policy contains information that Amazon EC2 Auto Scaling can use to launch instances
     *         and help optimize your costs. For more information, see <a href=
     *         "https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups.html">Auto
     *         Scaling groups with multiple instance types and purchase options</a> in the <i>Amazon EC2 Auto Scaling
     *         User Guide</i>.
     */

    public MixedInstancesPolicy getMixedInstancesPolicy() {
        return this.mixedInstancesPolicy;
    }

    /**
     * <p>
     * Use this structure to launch multiple instance types and On-Demand Instances and Spot Instances within a single
     * Auto Scaling group.
     * </p>
     * <p>
     * A mixed instances policy contains information that Amazon EC2 Auto Scaling can use to launch instances and help
     * optimize your costs. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups.html">Auto
     * Scaling groups with multiple instance types and purchase options</a> in the <i>Amazon EC2 Auto Scaling User
     * Guide</i>.
     * </p>
     * 
     * @param mixedInstancesPolicy
     *        Use this structure to launch multiple instance types and On-Demand Instances and Spot Instances within a
     *        single Auto Scaling group.</p>
     *        <p>
     *        A mixed instances policy contains information that Amazon EC2 Auto Scaling can use to launch instances and
     *        help optimize your costs. For more information, see <a href=
     *        "https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups.html">Auto
     *        Scaling groups with multiple instance types and purchase options</a> in the <i>Amazon EC2 Auto Scaling
     *        User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DesiredConfiguration withMixedInstancesPolicy(MixedInstancesPolicy mixedInstancesPolicy) {
        setMixedInstancesPolicy(mixedInstancesPolicy);
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
        if (getMixedInstancesPolicy() != null)
            sb.append("MixedInstancesPolicy: ").append(getMixedInstancesPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DesiredConfiguration == false)
            return false;
        DesiredConfiguration other = (DesiredConfiguration) obj;
        if (other.getLaunchTemplate() == null ^ this.getLaunchTemplate() == null)
            return false;
        if (other.getLaunchTemplate() != null && other.getLaunchTemplate().equals(this.getLaunchTemplate()) == false)
            return false;
        if (other.getMixedInstancesPolicy() == null ^ this.getMixedInstancesPolicy() == null)
            return false;
        if (other.getMixedInstancesPolicy() != null && other.getMixedInstancesPolicy().equals(this.getMixedInstancesPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLaunchTemplate() == null) ? 0 : getLaunchTemplate().hashCode());
        hashCode = prime * hashCode + ((getMixedInstancesPolicy() == null) ? 0 : getMixedInstancesPolicy().hashCode());
        return hashCode;
    }

    @Override
    public DesiredConfiguration clone() {
        try {
            return (DesiredConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
