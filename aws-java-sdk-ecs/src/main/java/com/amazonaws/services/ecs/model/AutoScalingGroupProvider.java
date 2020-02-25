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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the Auto Scaling group for the capacity provider.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/AutoScalingGroupProvider" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoScalingGroupProvider implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the Auto Scaling group.
     * </p>
     */
    private String autoScalingGroupArn;
    /**
     * <p>
     * The managed scaling settings for the Auto Scaling group capacity provider.
     * </p>
     */
    private ManagedScaling managedScaling;
    /**
     * <p>
     * The managed termination protection setting to use for the Auto Scaling group capacity provider. This determines
     * whether the Auto Scaling group has managed termination protection.
     * </p>
     * <important>
     * <p>
     * When using managed termination protection, managed scaling must also be used otherwise managed termination
     * protection will not work.
     * </p>
     * </important>
     * <p>
     * When managed termination protection is enabled, Amazon ECS prevents the Amazon EC2 instances in an Auto Scaling
     * group that contain tasks from being terminated during a scale-in action. The Auto Scaling group and each instance
     * in the Auto Scaling group must have instance protection from scale-in actions enabled as well. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     * >Instance Protection</a> in the <i>AWS Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * When managed termination protection is disabled, your Amazon EC2 instances are not protected from termination
     * when the Auto Scaling group scales in.
     * </p>
     */
    private String managedTerminationProtection;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupArn
     *        The Amazon Resource Name (ARN) that identifies the Auto Scaling group.
     */

    public void setAutoScalingGroupArn(String autoScalingGroupArn) {
        this.autoScalingGroupArn = autoScalingGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the Auto Scaling group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that identifies the Auto Scaling group.
     */

    public String getAutoScalingGroupArn() {
        return this.autoScalingGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupArn
     *        The Amazon Resource Name (ARN) that identifies the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroupProvider withAutoScalingGroupArn(String autoScalingGroupArn) {
        setAutoScalingGroupArn(autoScalingGroupArn);
        return this;
    }

    /**
     * <p>
     * The managed scaling settings for the Auto Scaling group capacity provider.
     * </p>
     * 
     * @param managedScaling
     *        The managed scaling settings for the Auto Scaling group capacity provider.
     */

    public void setManagedScaling(ManagedScaling managedScaling) {
        this.managedScaling = managedScaling;
    }

    /**
     * <p>
     * The managed scaling settings for the Auto Scaling group capacity provider.
     * </p>
     * 
     * @return The managed scaling settings for the Auto Scaling group capacity provider.
     */

    public ManagedScaling getManagedScaling() {
        return this.managedScaling;
    }

    /**
     * <p>
     * The managed scaling settings for the Auto Scaling group capacity provider.
     * </p>
     * 
     * @param managedScaling
     *        The managed scaling settings for the Auto Scaling group capacity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroupProvider withManagedScaling(ManagedScaling managedScaling) {
        setManagedScaling(managedScaling);
        return this;
    }

    /**
     * <p>
     * The managed termination protection setting to use for the Auto Scaling group capacity provider. This determines
     * whether the Auto Scaling group has managed termination protection.
     * </p>
     * <important>
     * <p>
     * When using managed termination protection, managed scaling must also be used otherwise managed termination
     * protection will not work.
     * </p>
     * </important>
     * <p>
     * When managed termination protection is enabled, Amazon ECS prevents the Amazon EC2 instances in an Auto Scaling
     * group that contain tasks from being terminated during a scale-in action. The Auto Scaling group and each instance
     * in the Auto Scaling group must have instance protection from scale-in actions enabled as well. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     * >Instance Protection</a> in the <i>AWS Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * When managed termination protection is disabled, your Amazon EC2 instances are not protected from termination
     * when the Auto Scaling group scales in.
     * </p>
     * 
     * @param managedTerminationProtection
     *        The managed termination protection setting to use for the Auto Scaling group capacity provider. This
     *        determines whether the Auto Scaling group has managed termination protection.</p> <important>
     *        <p>
     *        When using managed termination protection, managed scaling must also be used otherwise managed termination
     *        protection will not work.
     *        </p>
     *        </important>
     *        <p>
     *        When managed termination protection is enabled, Amazon ECS prevents the Amazon EC2 instances in an Auto
     *        Scaling group that contain tasks from being terminated during a scale-in action. The Auto Scaling group
     *        and each instance in the Auto Scaling group must have instance protection from scale-in actions enabled as
     *        well. For more information, see <a href=
     *        "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     *        >Instance Protection</a> in the <i>AWS Auto Scaling User Guide</i>.
     *        </p>
     *        <p>
     *        When managed termination protection is disabled, your Amazon EC2 instances are not protected from
     *        termination when the Auto Scaling group scales in.
     * @see ManagedTerminationProtection
     */

    public void setManagedTerminationProtection(String managedTerminationProtection) {
        this.managedTerminationProtection = managedTerminationProtection;
    }

    /**
     * <p>
     * The managed termination protection setting to use for the Auto Scaling group capacity provider. This determines
     * whether the Auto Scaling group has managed termination protection.
     * </p>
     * <important>
     * <p>
     * When using managed termination protection, managed scaling must also be used otherwise managed termination
     * protection will not work.
     * </p>
     * </important>
     * <p>
     * When managed termination protection is enabled, Amazon ECS prevents the Amazon EC2 instances in an Auto Scaling
     * group that contain tasks from being terminated during a scale-in action. The Auto Scaling group and each instance
     * in the Auto Scaling group must have instance protection from scale-in actions enabled as well. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     * >Instance Protection</a> in the <i>AWS Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * When managed termination protection is disabled, your Amazon EC2 instances are not protected from termination
     * when the Auto Scaling group scales in.
     * </p>
     * 
     * @return The managed termination protection setting to use for the Auto Scaling group capacity provider. This
     *         determines whether the Auto Scaling group has managed termination protection.</p> <important>
     *         <p>
     *         When using managed termination protection, managed scaling must also be used otherwise managed
     *         termination protection will not work.
     *         </p>
     *         </important>
     *         <p>
     *         When managed termination protection is enabled, Amazon ECS prevents the Amazon EC2 instances in an Auto
     *         Scaling group that contain tasks from being terminated during a scale-in action. The Auto Scaling group
     *         and each instance in the Auto Scaling group must have instance protection from scale-in actions enabled
     *         as well. For more information, see <a href=
     *         "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     *         >Instance Protection</a> in the <i>AWS Auto Scaling User Guide</i>.
     *         </p>
     *         <p>
     *         When managed termination protection is disabled, your Amazon EC2 instances are not protected from
     *         termination when the Auto Scaling group scales in.
     * @see ManagedTerminationProtection
     */

    public String getManagedTerminationProtection() {
        return this.managedTerminationProtection;
    }

    /**
     * <p>
     * The managed termination protection setting to use for the Auto Scaling group capacity provider. This determines
     * whether the Auto Scaling group has managed termination protection.
     * </p>
     * <important>
     * <p>
     * When using managed termination protection, managed scaling must also be used otherwise managed termination
     * protection will not work.
     * </p>
     * </important>
     * <p>
     * When managed termination protection is enabled, Amazon ECS prevents the Amazon EC2 instances in an Auto Scaling
     * group that contain tasks from being terminated during a scale-in action. The Auto Scaling group and each instance
     * in the Auto Scaling group must have instance protection from scale-in actions enabled as well. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     * >Instance Protection</a> in the <i>AWS Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * When managed termination protection is disabled, your Amazon EC2 instances are not protected from termination
     * when the Auto Scaling group scales in.
     * </p>
     * 
     * @param managedTerminationProtection
     *        The managed termination protection setting to use for the Auto Scaling group capacity provider. This
     *        determines whether the Auto Scaling group has managed termination protection.</p> <important>
     *        <p>
     *        When using managed termination protection, managed scaling must also be used otherwise managed termination
     *        protection will not work.
     *        </p>
     *        </important>
     *        <p>
     *        When managed termination protection is enabled, Amazon ECS prevents the Amazon EC2 instances in an Auto
     *        Scaling group that contain tasks from being terminated during a scale-in action. The Auto Scaling group
     *        and each instance in the Auto Scaling group must have instance protection from scale-in actions enabled as
     *        well. For more information, see <a href=
     *        "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     *        >Instance Protection</a> in the <i>AWS Auto Scaling User Guide</i>.
     *        </p>
     *        <p>
     *        When managed termination protection is disabled, your Amazon EC2 instances are not protected from
     *        termination when the Auto Scaling group scales in.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ManagedTerminationProtection
     */

    public AutoScalingGroupProvider withManagedTerminationProtection(String managedTerminationProtection) {
        setManagedTerminationProtection(managedTerminationProtection);
        return this;
    }

    /**
     * <p>
     * The managed termination protection setting to use for the Auto Scaling group capacity provider. This determines
     * whether the Auto Scaling group has managed termination protection.
     * </p>
     * <important>
     * <p>
     * When using managed termination protection, managed scaling must also be used otherwise managed termination
     * protection will not work.
     * </p>
     * </important>
     * <p>
     * When managed termination protection is enabled, Amazon ECS prevents the Amazon EC2 instances in an Auto Scaling
     * group that contain tasks from being terminated during a scale-in action. The Auto Scaling group and each instance
     * in the Auto Scaling group must have instance protection from scale-in actions enabled as well. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     * >Instance Protection</a> in the <i>AWS Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * When managed termination protection is disabled, your Amazon EC2 instances are not protected from termination
     * when the Auto Scaling group scales in.
     * </p>
     * 
     * @param managedTerminationProtection
     *        The managed termination protection setting to use for the Auto Scaling group capacity provider. This
     *        determines whether the Auto Scaling group has managed termination protection.</p> <important>
     *        <p>
     *        When using managed termination protection, managed scaling must also be used otherwise managed termination
     *        protection will not work.
     *        </p>
     *        </important>
     *        <p>
     *        When managed termination protection is enabled, Amazon ECS prevents the Amazon EC2 instances in an Auto
     *        Scaling group that contain tasks from being terminated during a scale-in action. The Auto Scaling group
     *        and each instance in the Auto Scaling group must have instance protection from scale-in actions enabled as
     *        well. For more information, see <a href=
     *        "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     *        >Instance Protection</a> in the <i>AWS Auto Scaling User Guide</i>.
     *        </p>
     *        <p>
     *        When managed termination protection is disabled, your Amazon EC2 instances are not protected from
     *        termination when the Auto Scaling group scales in.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ManagedTerminationProtection
     */

    public AutoScalingGroupProvider withManagedTerminationProtection(ManagedTerminationProtection managedTerminationProtection) {
        this.managedTerminationProtection = managedTerminationProtection.toString();
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
        if (getAutoScalingGroupArn() != null)
            sb.append("AutoScalingGroupArn: ").append(getAutoScalingGroupArn()).append(",");
        if (getManagedScaling() != null)
            sb.append("ManagedScaling: ").append(getManagedScaling()).append(",");
        if (getManagedTerminationProtection() != null)
            sb.append("ManagedTerminationProtection: ").append(getManagedTerminationProtection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoScalingGroupProvider == false)
            return false;
        AutoScalingGroupProvider other = (AutoScalingGroupProvider) obj;
        if (other.getAutoScalingGroupArn() == null ^ this.getAutoScalingGroupArn() == null)
            return false;
        if (other.getAutoScalingGroupArn() != null && other.getAutoScalingGroupArn().equals(this.getAutoScalingGroupArn()) == false)
            return false;
        if (other.getManagedScaling() == null ^ this.getManagedScaling() == null)
            return false;
        if (other.getManagedScaling() != null && other.getManagedScaling().equals(this.getManagedScaling()) == false)
            return false;
        if (other.getManagedTerminationProtection() == null ^ this.getManagedTerminationProtection() == null)
            return false;
        if (other.getManagedTerminationProtection() != null && other.getManagedTerminationProtection().equals(this.getManagedTerminationProtection()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoScalingGroupArn() == null) ? 0 : getAutoScalingGroupArn().hashCode());
        hashCode = prime * hashCode + ((getManagedScaling() == null) ? 0 : getManagedScaling().hashCode());
        hashCode = prime * hashCode + ((getManagedTerminationProtection() == null) ? 0 : getManagedTerminationProtection().hashCode());
        return hashCode;
    }

    @Override
    public AutoScalingGroupProvider clone() {
        try {
            return (AutoScalingGroupProvider) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.AutoScalingGroupProviderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
