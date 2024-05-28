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
 * Amazon Keyspaces supports the <code>target tracking</code> auto scaling policy. With this policy, Amazon Keyspaces
 * auto scaling ensures that the table's ratio of consumed to provisioned capacity stays at or near the target value
 * that you specify. You define the target value as a percentage between 20 and 90.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/AutoScalingPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoScalingPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Auto scaling scales up capacity automatically when traffic exceeds this target utilization rate, and then back
     * down when it falls below the target. A <code>double</code> between 20 and 90.
     * </p>
     */
    private TargetTrackingScalingPolicyConfiguration targetTrackingScalingPolicyConfiguration;

    /**
     * <p>
     * Auto scaling scales up capacity automatically when traffic exceeds this target utilization rate, and then back
     * down when it falls below the target. A <code>double</code> between 20 and 90.
     * </p>
     * 
     * @param targetTrackingScalingPolicyConfiguration
     *        Auto scaling scales up capacity automatically when traffic exceeds this target utilization rate, and then
     *        back down when it falls below the target. A <code>double</code> between 20 and 90.
     */

    public void setTargetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfiguration targetTrackingScalingPolicyConfiguration) {
        this.targetTrackingScalingPolicyConfiguration = targetTrackingScalingPolicyConfiguration;
    }

    /**
     * <p>
     * Auto scaling scales up capacity automatically when traffic exceeds this target utilization rate, and then back
     * down when it falls below the target. A <code>double</code> between 20 and 90.
     * </p>
     * 
     * @return Auto scaling scales up capacity automatically when traffic exceeds this target utilization rate, and then
     *         back down when it falls below the target. A <code>double</code> between 20 and 90.
     */

    public TargetTrackingScalingPolicyConfiguration getTargetTrackingScalingPolicyConfiguration() {
        return this.targetTrackingScalingPolicyConfiguration;
    }

    /**
     * <p>
     * Auto scaling scales up capacity automatically when traffic exceeds this target utilization rate, and then back
     * down when it falls below the target. A <code>double</code> between 20 and 90.
     * </p>
     * 
     * @param targetTrackingScalingPolicyConfiguration
     *        Auto scaling scales up capacity automatically when traffic exceeds this target utilization rate, and then
     *        back down when it falls below the target. A <code>double</code> between 20 and 90.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingPolicy withTargetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfiguration targetTrackingScalingPolicyConfiguration) {
        setTargetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration);
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
        if (getTargetTrackingScalingPolicyConfiguration() != null)
            sb.append("TargetTrackingScalingPolicyConfiguration: ").append(getTargetTrackingScalingPolicyConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoScalingPolicy == false)
            return false;
        AutoScalingPolicy other = (AutoScalingPolicy) obj;
        if (other.getTargetTrackingScalingPolicyConfiguration() == null ^ this.getTargetTrackingScalingPolicyConfiguration() == null)
            return false;
        if (other.getTargetTrackingScalingPolicyConfiguration() != null
                && other.getTargetTrackingScalingPolicyConfiguration().equals(this.getTargetTrackingScalingPolicyConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetTrackingScalingPolicyConfiguration() == null) ? 0 : getTargetTrackingScalingPolicyConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public AutoScalingPolicy clone() {
        try {
            return (AutoScalingPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.keyspaces.model.transform.AutoScalingPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
