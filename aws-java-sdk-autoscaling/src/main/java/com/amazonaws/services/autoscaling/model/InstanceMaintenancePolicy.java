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
 * Describes an instance maintenance policy.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-instance-maintenance-policy.html">Set
 * instance maintenance policy</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/InstanceMaintenancePolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceMaintenancePolicy implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the lower threshold as a percentage of the desired capacity of the Auto Scaling group. It represents
     * the minimum percentage of the group to keep in service, healthy, and ready to use to support your workload when
     * replacing instances. Value range is 0 to 100. To clear a previously set value, specify a value of <code>-1</code>
     * .
     * </p>
     */
    private Integer minHealthyPercentage;
    /**
     * <p>
     * Specifies the upper threshold as a percentage of the desired capacity of the Auto Scaling group. It represents
     * the maximum percentage of the group that can be in service and healthy, or pending, to support your workload when
     * replacing instances. Value range is 100 to 200. To clear a previously set value, specify a value of
     * <code>-1</code>.
     * </p>
     * <p>
     * Both <code>MinHealthyPercentage</code> and <code>MaxHealthyPercentage</code> must be specified, and the
     * difference between them cannot be greater than 100. A large range increases the number of instances that can be
     * replaced at the same time.
     * </p>
     */
    private Integer maxHealthyPercentage;

    /**
     * <p>
     * Specifies the lower threshold as a percentage of the desired capacity of the Auto Scaling group. It represents
     * the minimum percentage of the group to keep in service, healthy, and ready to use to support your workload when
     * replacing instances. Value range is 0 to 100. To clear a previously set value, specify a value of <code>-1</code>
     * .
     * </p>
     * 
     * @param minHealthyPercentage
     *        Specifies the lower threshold as a percentage of the desired capacity of the Auto Scaling group. It
     *        represents the minimum percentage of the group to keep in service, healthy, and ready to use to support
     *        your workload when replacing instances. Value range is 0 to 100. To clear a previously set value, specify
     *        a value of <code>-1</code>.
     */

    public void setMinHealthyPercentage(Integer minHealthyPercentage) {
        this.minHealthyPercentage = minHealthyPercentage;
    }

    /**
     * <p>
     * Specifies the lower threshold as a percentage of the desired capacity of the Auto Scaling group. It represents
     * the minimum percentage of the group to keep in service, healthy, and ready to use to support your workload when
     * replacing instances. Value range is 0 to 100. To clear a previously set value, specify a value of <code>-1</code>
     * .
     * </p>
     * 
     * @return Specifies the lower threshold as a percentage of the desired capacity of the Auto Scaling group. It
     *         represents the minimum percentage of the group to keep in service, healthy, and ready to use to support
     *         your workload when replacing instances. Value range is 0 to 100. To clear a previously set value, specify
     *         a value of <code>-1</code>.
     */

    public Integer getMinHealthyPercentage() {
        return this.minHealthyPercentage;
    }

    /**
     * <p>
     * Specifies the lower threshold as a percentage of the desired capacity of the Auto Scaling group. It represents
     * the minimum percentage of the group to keep in service, healthy, and ready to use to support your workload when
     * replacing instances. Value range is 0 to 100. To clear a previously set value, specify a value of <code>-1</code>
     * .
     * </p>
     * 
     * @param minHealthyPercentage
     *        Specifies the lower threshold as a percentage of the desired capacity of the Auto Scaling group. It
     *        represents the minimum percentage of the group to keep in service, healthy, and ready to use to support
     *        your workload when replacing instances. Value range is 0 to 100. To clear a previously set value, specify
     *        a value of <code>-1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceMaintenancePolicy withMinHealthyPercentage(Integer minHealthyPercentage) {
        setMinHealthyPercentage(minHealthyPercentage);
        return this;
    }

    /**
     * <p>
     * Specifies the upper threshold as a percentage of the desired capacity of the Auto Scaling group. It represents
     * the maximum percentage of the group that can be in service and healthy, or pending, to support your workload when
     * replacing instances. Value range is 100 to 200. To clear a previously set value, specify a value of
     * <code>-1</code>.
     * </p>
     * <p>
     * Both <code>MinHealthyPercentage</code> and <code>MaxHealthyPercentage</code> must be specified, and the
     * difference between them cannot be greater than 100. A large range increases the number of instances that can be
     * replaced at the same time.
     * </p>
     * 
     * @param maxHealthyPercentage
     *        Specifies the upper threshold as a percentage of the desired capacity of the Auto Scaling group. It
     *        represents the maximum percentage of the group that can be in service and healthy, or pending, to support
     *        your workload when replacing instances. Value range is 100 to 200. To clear a previously set value,
     *        specify a value of <code>-1</code>.</p>
     *        <p>
     *        Both <code>MinHealthyPercentage</code> and <code>MaxHealthyPercentage</code> must be specified, and the
     *        difference between them cannot be greater than 100. A large range increases the number of instances that
     *        can be replaced at the same time.
     */

    public void setMaxHealthyPercentage(Integer maxHealthyPercentage) {
        this.maxHealthyPercentage = maxHealthyPercentage;
    }

    /**
     * <p>
     * Specifies the upper threshold as a percentage of the desired capacity of the Auto Scaling group. It represents
     * the maximum percentage of the group that can be in service and healthy, or pending, to support your workload when
     * replacing instances. Value range is 100 to 200. To clear a previously set value, specify a value of
     * <code>-1</code>.
     * </p>
     * <p>
     * Both <code>MinHealthyPercentage</code> and <code>MaxHealthyPercentage</code> must be specified, and the
     * difference between them cannot be greater than 100. A large range increases the number of instances that can be
     * replaced at the same time.
     * </p>
     * 
     * @return Specifies the upper threshold as a percentage of the desired capacity of the Auto Scaling group. It
     *         represents the maximum percentage of the group that can be in service and healthy, or pending, to support
     *         your workload when replacing instances. Value range is 100 to 200. To clear a previously set value,
     *         specify a value of <code>-1</code>.</p>
     *         <p>
     *         Both <code>MinHealthyPercentage</code> and <code>MaxHealthyPercentage</code> must be specified, and the
     *         difference between them cannot be greater than 100. A large range increases the number of instances that
     *         can be replaced at the same time.
     */

    public Integer getMaxHealthyPercentage() {
        return this.maxHealthyPercentage;
    }

    /**
     * <p>
     * Specifies the upper threshold as a percentage of the desired capacity of the Auto Scaling group. It represents
     * the maximum percentage of the group that can be in service and healthy, or pending, to support your workload when
     * replacing instances. Value range is 100 to 200. To clear a previously set value, specify a value of
     * <code>-1</code>.
     * </p>
     * <p>
     * Both <code>MinHealthyPercentage</code> and <code>MaxHealthyPercentage</code> must be specified, and the
     * difference between them cannot be greater than 100. A large range increases the number of instances that can be
     * replaced at the same time.
     * </p>
     * 
     * @param maxHealthyPercentage
     *        Specifies the upper threshold as a percentage of the desired capacity of the Auto Scaling group. It
     *        represents the maximum percentage of the group that can be in service and healthy, or pending, to support
     *        your workload when replacing instances. Value range is 100 to 200. To clear a previously set value,
     *        specify a value of <code>-1</code>.</p>
     *        <p>
     *        Both <code>MinHealthyPercentage</code> and <code>MaxHealthyPercentage</code> must be specified, and the
     *        difference between them cannot be greater than 100. A large range increases the number of instances that
     *        can be replaced at the same time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceMaintenancePolicy withMaxHealthyPercentage(Integer maxHealthyPercentage) {
        setMaxHealthyPercentage(maxHealthyPercentage);
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
        if (getMinHealthyPercentage() != null)
            sb.append("MinHealthyPercentage: ").append(getMinHealthyPercentage()).append(",");
        if (getMaxHealthyPercentage() != null)
            sb.append("MaxHealthyPercentage: ").append(getMaxHealthyPercentage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceMaintenancePolicy == false)
            return false;
        InstanceMaintenancePolicy other = (InstanceMaintenancePolicy) obj;
        if (other.getMinHealthyPercentage() == null ^ this.getMinHealthyPercentage() == null)
            return false;
        if (other.getMinHealthyPercentage() != null && other.getMinHealthyPercentage().equals(this.getMinHealthyPercentage()) == false)
            return false;
        if (other.getMaxHealthyPercentage() == null ^ this.getMaxHealthyPercentage() == null)
            return false;
        if (other.getMaxHealthyPercentage() != null && other.getMaxHealthyPercentage().equals(this.getMaxHealthyPercentage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinHealthyPercentage() == null) ? 0 : getMinHealthyPercentage().hashCode());
        hashCode = prime * hashCode + ((getMaxHealthyPercentage() == null) ? 0 : getMaxHealthyPercentage().hashCode());
        return hashCode;
    }

    @Override
    public InstanceMaintenancePolicy clone() {
        try {
            return (InstanceMaintenancePolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
