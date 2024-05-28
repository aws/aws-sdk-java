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
package com.amazonaws.services.keyspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The optional auto scaling settings for a table with provisioned throughput capacity.
 * </p>
 * <p>
 * To turn on auto scaling for a table in <code>throughputMode:PROVISIONED</code>, you must specify the following
 * parameters.
 * </p>
 * <p>
 * Configure the minimum and maximum capacity units. The auto scaling policy ensures that capacity never goes below the
 * minimum or above the maximum range.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>minimumUnits</code>: The minimum level of throughput the table should always be ready to support. The value
 * must be between 1 and the max throughput per second quota for your account (40,000 by default).
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>maximumUnits</code>: The maximum level of throughput the table should always be ready to support. The value
 * must be between 1 and the max throughput per second quota for your account (40,000 by default).
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>scalingPolicy</code>: Amazon Keyspaces supports the <code>target tracking</code> scaling policy. The auto
 * scaling target is the provisioned capacity of the table.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>targetTrackingScalingPolicyConfiguration</code>: To define the target tracking policy, you must define the
 * target value.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>targetValue</code>: The target utilization rate of the table. Amazon Keyspaces auto scaling ensures that the
 * ratio of consumed capacity to provisioned capacity stays at or near this value. You define <code>targetValue</code>
 * as a percentage. A <code>double</code> between 20 and 90. (Required)
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>disableScaleIn</code>: A <code>boolean</code> that specifies if <code>scale-in</code> is disabled or enabled
 * for the table. This parameter is disabled by default. To turn on <code>scale-in</code>, set the <code>boolean</code>
 * value to <code>FALSE</code>. This means that capacity for a table can be automatically scaled down on your behalf.
 * (Optional)
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>scaleInCooldown</code>: A cooldown period in seconds between scaling activities that lets the table stabilize
 * before another scale in activity starts. If no value is provided, the default is 0. (Optional)
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>scaleOutCooldown</code>: A cooldown period in seconds between scaling activities that lets the table stabilize
 * before another scale out activity starts. If no value is provided, the default is 0. (Optional)
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 * </li>
 * </ul>
 * <p>
 * For more information, see <a href="https://docs.aws.amazon.com/keyspaces/latest/devguide/autoscaling.html">Managing
 * throughput capacity automatically with Amazon Keyspaces auto scaling</a> in the <i>Amazon Keyspaces Developer
 * Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/AutoScalingSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoScalingSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * This optional parameter enables auto scaling for the table if set to <code>false</code>.
     * </p>
     */
    private Boolean autoScalingDisabled;
    /**
     * <p>
     * The minimum level of throughput the table should always be ready to support. The value must be between 1 and the
     * max throughput per second quota for your account (40,000 by default).
     * </p>
     */
    private Long minimumUnits;
    /**
     * <p>
     * Manage costs by specifying the maximum amount of throughput to provision. The value must be between 1 and the max
     * throughput per second quota for your account (40,000 by default).
     * </p>
     */
    private Long maximumUnits;
    /**
     * <p>
     * Amazon Keyspaces supports the <code>target tracking</code> auto scaling policy. With this policy, Amazon
     * Keyspaces auto scaling ensures that the table's ratio of consumed to provisioned capacity stays at or near the
     * target value that you specify. You define the target value as a percentage between 20 and 90.
     * </p>
     */
    private AutoScalingPolicy scalingPolicy;

    /**
     * <p>
     * This optional parameter enables auto scaling for the table if set to <code>false</code>.
     * </p>
     * 
     * @param autoScalingDisabled
     *        This optional parameter enables auto scaling for the table if set to <code>false</code>.
     */

    public void setAutoScalingDisabled(Boolean autoScalingDisabled) {
        this.autoScalingDisabled = autoScalingDisabled;
    }

    /**
     * <p>
     * This optional parameter enables auto scaling for the table if set to <code>false</code>.
     * </p>
     * 
     * @return This optional parameter enables auto scaling for the table if set to <code>false</code>.
     */

    public Boolean getAutoScalingDisabled() {
        return this.autoScalingDisabled;
    }

    /**
     * <p>
     * This optional parameter enables auto scaling for the table if set to <code>false</code>.
     * </p>
     * 
     * @param autoScalingDisabled
     *        This optional parameter enables auto scaling for the table if set to <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingSettings withAutoScalingDisabled(Boolean autoScalingDisabled) {
        setAutoScalingDisabled(autoScalingDisabled);
        return this;
    }

    /**
     * <p>
     * This optional parameter enables auto scaling for the table if set to <code>false</code>.
     * </p>
     * 
     * @return This optional parameter enables auto scaling for the table if set to <code>false</code>.
     */

    public Boolean isAutoScalingDisabled() {
        return this.autoScalingDisabled;
    }

    /**
     * <p>
     * The minimum level of throughput the table should always be ready to support. The value must be between 1 and the
     * max throughput per second quota for your account (40,000 by default).
     * </p>
     * 
     * @param minimumUnits
     *        The minimum level of throughput the table should always be ready to support. The value must be between 1
     *        and the max throughput per second quota for your account (40,000 by default).
     */

    public void setMinimumUnits(Long minimumUnits) {
        this.minimumUnits = minimumUnits;
    }

    /**
     * <p>
     * The minimum level of throughput the table should always be ready to support. The value must be between 1 and the
     * max throughput per second quota for your account (40,000 by default).
     * </p>
     * 
     * @return The minimum level of throughput the table should always be ready to support. The value must be between 1
     *         and the max throughput per second quota for your account (40,000 by default).
     */

    public Long getMinimumUnits() {
        return this.minimumUnits;
    }

    /**
     * <p>
     * The minimum level of throughput the table should always be ready to support. The value must be between 1 and the
     * max throughput per second quota for your account (40,000 by default).
     * </p>
     * 
     * @param minimumUnits
     *        The minimum level of throughput the table should always be ready to support. The value must be between 1
     *        and the max throughput per second quota for your account (40,000 by default).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingSettings withMinimumUnits(Long minimumUnits) {
        setMinimumUnits(minimumUnits);
        return this;
    }

    /**
     * <p>
     * Manage costs by specifying the maximum amount of throughput to provision. The value must be between 1 and the max
     * throughput per second quota for your account (40,000 by default).
     * </p>
     * 
     * @param maximumUnits
     *        Manage costs by specifying the maximum amount of throughput to provision. The value must be between 1 and
     *        the max throughput per second quota for your account (40,000 by default).
     */

    public void setMaximumUnits(Long maximumUnits) {
        this.maximumUnits = maximumUnits;
    }

    /**
     * <p>
     * Manage costs by specifying the maximum amount of throughput to provision. The value must be between 1 and the max
     * throughput per second quota for your account (40,000 by default).
     * </p>
     * 
     * @return Manage costs by specifying the maximum amount of throughput to provision. The value must be between 1 and
     *         the max throughput per second quota for your account (40,000 by default).
     */

    public Long getMaximumUnits() {
        return this.maximumUnits;
    }

    /**
     * <p>
     * Manage costs by specifying the maximum amount of throughput to provision. The value must be between 1 and the max
     * throughput per second quota for your account (40,000 by default).
     * </p>
     * 
     * @param maximumUnits
     *        Manage costs by specifying the maximum amount of throughput to provision. The value must be between 1 and
     *        the max throughput per second quota for your account (40,000 by default).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingSettings withMaximumUnits(Long maximumUnits) {
        setMaximumUnits(maximumUnits);
        return this;
    }

    /**
     * <p>
     * Amazon Keyspaces supports the <code>target tracking</code> auto scaling policy. With this policy, Amazon
     * Keyspaces auto scaling ensures that the table's ratio of consumed to provisioned capacity stays at or near the
     * target value that you specify. You define the target value as a percentage between 20 and 90.
     * </p>
     * 
     * @param scalingPolicy
     *        Amazon Keyspaces supports the <code>target tracking</code> auto scaling policy. With this policy, Amazon
     *        Keyspaces auto scaling ensures that the table's ratio of consumed to provisioned capacity stays at or near
     *        the target value that you specify. You define the target value as a percentage between 20 and 90.
     */

    public void setScalingPolicy(AutoScalingPolicy scalingPolicy) {
        this.scalingPolicy = scalingPolicy;
    }

    /**
     * <p>
     * Amazon Keyspaces supports the <code>target tracking</code> auto scaling policy. With this policy, Amazon
     * Keyspaces auto scaling ensures that the table's ratio of consumed to provisioned capacity stays at or near the
     * target value that you specify. You define the target value as a percentage between 20 and 90.
     * </p>
     * 
     * @return Amazon Keyspaces supports the <code>target tracking</code> auto scaling policy. With this policy, Amazon
     *         Keyspaces auto scaling ensures that the table's ratio of consumed to provisioned capacity stays at or
     *         near the target value that you specify. You define the target value as a percentage between 20 and 90.
     */

    public AutoScalingPolicy getScalingPolicy() {
        return this.scalingPolicy;
    }

    /**
     * <p>
     * Amazon Keyspaces supports the <code>target tracking</code> auto scaling policy. With this policy, Amazon
     * Keyspaces auto scaling ensures that the table's ratio of consumed to provisioned capacity stays at or near the
     * target value that you specify. You define the target value as a percentage between 20 and 90.
     * </p>
     * 
     * @param scalingPolicy
     *        Amazon Keyspaces supports the <code>target tracking</code> auto scaling policy. With this policy, Amazon
     *        Keyspaces auto scaling ensures that the table's ratio of consumed to provisioned capacity stays at or near
     *        the target value that you specify. You define the target value as a percentage between 20 and 90.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingSettings withScalingPolicy(AutoScalingPolicy scalingPolicy) {
        setScalingPolicy(scalingPolicy);
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
        if (getAutoScalingDisabled() != null)
            sb.append("AutoScalingDisabled: ").append(getAutoScalingDisabled()).append(",");
        if (getMinimumUnits() != null)
            sb.append("MinimumUnits: ").append(getMinimumUnits()).append(",");
        if (getMaximumUnits() != null)
            sb.append("MaximumUnits: ").append(getMaximumUnits()).append(",");
        if (getScalingPolicy() != null)
            sb.append("ScalingPolicy: ").append(getScalingPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoScalingSettings == false)
            return false;
        AutoScalingSettings other = (AutoScalingSettings) obj;
        if (other.getAutoScalingDisabled() == null ^ this.getAutoScalingDisabled() == null)
            return false;
        if (other.getAutoScalingDisabled() != null && other.getAutoScalingDisabled().equals(this.getAutoScalingDisabled()) == false)
            return false;
        if (other.getMinimumUnits() == null ^ this.getMinimumUnits() == null)
            return false;
        if (other.getMinimumUnits() != null && other.getMinimumUnits().equals(this.getMinimumUnits()) == false)
            return false;
        if (other.getMaximumUnits() == null ^ this.getMaximumUnits() == null)
            return false;
        if (other.getMaximumUnits() != null && other.getMaximumUnits().equals(this.getMaximumUnits()) == false)
            return false;
        if (other.getScalingPolicy() == null ^ this.getScalingPolicy() == null)
            return false;
        if (other.getScalingPolicy() != null && other.getScalingPolicy().equals(this.getScalingPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoScalingDisabled() == null) ? 0 : getAutoScalingDisabled().hashCode());
        hashCode = prime * hashCode + ((getMinimumUnits() == null) ? 0 : getMinimumUnits().hashCode());
        hashCode = prime * hashCode + ((getMaximumUnits() == null) ? 0 : getMaximumUnits().hashCode());
        hashCode = prime * hashCode + ((getScalingPolicy() == null) ? 0 : getScalingPolicy().hashCode());
        return hashCode;
    }

    @Override
    public AutoScalingSettings clone() {
        try {
            return (AutoScalingSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.keyspaces.model.transform.AutoScalingSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
