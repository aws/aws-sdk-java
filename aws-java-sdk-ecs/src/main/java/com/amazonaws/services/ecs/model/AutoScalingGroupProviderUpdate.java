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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the Auto Scaling group capacity provider to update.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/AutoScalingGroupProviderUpdate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoScalingGroupProviderUpdate implements Serializable, Cloneable, StructuredPojo {

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
     * @param managedScaling
     */

    public void setManagedScaling(ManagedScaling managedScaling) {
        this.managedScaling = managedScaling;
    }

    /**
     * @return
     */

    public ManagedScaling getManagedScaling() {
        return this.managedScaling;
    }

    /**
     * @param managedScaling
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroupProviderUpdate withManagedScaling(ManagedScaling managedScaling) {
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

    public AutoScalingGroupProviderUpdate withManagedTerminationProtection(String managedTerminationProtection) {
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

    public AutoScalingGroupProviderUpdate withManagedTerminationProtection(ManagedTerminationProtection managedTerminationProtection) {
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

        if (obj instanceof AutoScalingGroupProviderUpdate == false)
            return false;
        AutoScalingGroupProviderUpdate other = (AutoScalingGroupProviderUpdate) obj;
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

        hashCode = prime * hashCode + ((getManagedScaling() == null) ? 0 : getManagedScaling().hashCode());
        hashCode = prime * hashCode + ((getManagedTerminationProtection() == null) ? 0 : getManagedTerminationProtection().hashCode());
        return hashCode;
    }

    @Override
    public AutoScalingGroupProviderUpdate clone() {
        try {
            return (AutoScalingGroupProviderUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.AutoScalingGroupProviderUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
