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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Settings for a target-based scaling policy (see <a>ScalingPolicy</a>. A target-based policy tracks a particular fleet
 * metric specifies a target value for the metric. As player usage changes, the policy triggers Amazon GameLift to
 * adjust capacity so that the metric returns to the target value. The target configuration specifies settings as needed
 * for the target based policy, including the target value.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DescribeFleetCapacity</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateFleetCapacity</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeEC2InstanceLimits</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * Manage scaling policies:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>PutScalingPolicy</a> (auto-scaling)
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeScalingPolicies</a> (auto-scaling)
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteScalingPolicy</a> (auto-scaling)
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * Manage fleet actions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>StartFleetActions</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>StopFleetActions</a>
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/TargetConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Desired value to use with a target-based scaling policy. The value must be relevant for whatever metric the
     * scaling policy is using. For example, in a policy using the metric PercentAvailableGameSessions, the target value
     * should be the preferred size of the fleet's buffer (the percent of capacity that should be idle and ready for new
     * game sessions).
     * </p>
     */
    private Double targetValue;

    /**
     * <p>
     * Desired value to use with a target-based scaling policy. The value must be relevant for whatever metric the
     * scaling policy is using. For example, in a policy using the metric PercentAvailableGameSessions, the target value
     * should be the preferred size of the fleet's buffer (the percent of capacity that should be idle and ready for new
     * game sessions).
     * </p>
     * 
     * @param targetValue
     *        Desired value to use with a target-based scaling policy. The value must be relevant for whatever metric
     *        the scaling policy is using. For example, in a policy using the metric PercentAvailableGameSessions, the
     *        target value should be the preferred size of the fleet's buffer (the percent of capacity that should be
     *        idle and ready for new game sessions).
     */

    public void setTargetValue(Double targetValue) {
        this.targetValue = targetValue;
    }

    /**
     * <p>
     * Desired value to use with a target-based scaling policy. The value must be relevant for whatever metric the
     * scaling policy is using. For example, in a policy using the metric PercentAvailableGameSessions, the target value
     * should be the preferred size of the fleet's buffer (the percent of capacity that should be idle and ready for new
     * game sessions).
     * </p>
     * 
     * @return Desired value to use with a target-based scaling policy. The value must be relevant for whatever metric
     *         the scaling policy is using. For example, in a policy using the metric PercentAvailableGameSessions, the
     *         target value should be the preferred size of the fleet's buffer (the percent of capacity that should be
     *         idle and ready for new game sessions).
     */

    public Double getTargetValue() {
        return this.targetValue;
    }

    /**
     * <p>
     * Desired value to use with a target-based scaling policy. The value must be relevant for whatever metric the
     * scaling policy is using. For example, in a policy using the metric PercentAvailableGameSessions, the target value
     * should be the preferred size of the fleet's buffer (the percent of capacity that should be idle and ready for new
     * game sessions).
     * </p>
     * 
     * @param targetValue
     *        Desired value to use with a target-based scaling policy. The value must be relevant for whatever metric
     *        the scaling policy is using. For example, in a policy using the metric PercentAvailableGameSessions, the
     *        target value should be the preferred size of the fleet's buffer (the percent of capacity that should be
     *        idle and ready for new game sessions).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetConfiguration withTargetValue(Double targetValue) {
        setTargetValue(targetValue);
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
        if (getTargetValue() != null)
            sb.append("TargetValue: ").append(getTargetValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetConfiguration == false)
            return false;
        TargetConfiguration other = (TargetConfiguration) obj;
        if (other.getTargetValue() == null ^ this.getTargetValue() == null)
            return false;
        if (other.getTargetValue() != null && other.getTargetValue().equals(this.getTargetValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetValue() == null) ? 0 : getTargetValue().hashCode());
        return hashCode;
    }

    @Override
    public TargetConfiguration clone() {
        try {
            return (TargetConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.TargetConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
