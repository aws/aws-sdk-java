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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about the target group stickiness for a rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/TargetGroupStickinessConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetGroupStickinessConfig implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether target group stickiness is enabled.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The time period, in seconds, during which requests from a client should be routed to the same target group. The
     * range is 1-604800 seconds (7 days).
     * </p>
     */
    private Integer durationSeconds;

    /**
     * <p>
     * Indicates whether target group stickiness is enabled.
     * </p>
     * 
     * @param enabled
     *        Indicates whether target group stickiness is enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether target group stickiness is enabled.
     * </p>
     * 
     * @return Indicates whether target group stickiness is enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Indicates whether target group stickiness is enabled.
     * </p>
     * 
     * @param enabled
     *        Indicates whether target group stickiness is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetGroupStickinessConfig withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether target group stickiness is enabled.
     * </p>
     * 
     * @return Indicates whether target group stickiness is enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The time period, in seconds, during which requests from a client should be routed to the same target group. The
     * range is 1-604800 seconds (7 days).
     * </p>
     * 
     * @param durationSeconds
     *        The time period, in seconds, during which requests from a client should be routed to the same target
     *        group. The range is 1-604800 seconds (7 days).
     */

    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    /**
     * <p>
     * The time period, in seconds, during which requests from a client should be routed to the same target group. The
     * range is 1-604800 seconds (7 days).
     * </p>
     * 
     * @return The time period, in seconds, during which requests from a client should be routed to the same target
     *         group. The range is 1-604800 seconds (7 days).
     */

    public Integer getDurationSeconds() {
        return this.durationSeconds;
    }

    /**
     * <p>
     * The time period, in seconds, during which requests from a client should be routed to the same target group. The
     * range is 1-604800 seconds (7 days).
     * </p>
     * 
     * @param durationSeconds
     *        The time period, in seconds, during which requests from a client should be routed to the same target
     *        group. The range is 1-604800 seconds (7 days).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetGroupStickinessConfig withDurationSeconds(Integer durationSeconds) {
        setDurationSeconds(durationSeconds);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getDurationSeconds() != null)
            sb.append("DurationSeconds: ").append(getDurationSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetGroupStickinessConfig == false)
            return false;
        TargetGroupStickinessConfig other = (TargetGroupStickinessConfig) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getDurationSeconds() == null ^ this.getDurationSeconds() == null)
            return false;
        if (other.getDurationSeconds() != null && other.getDurationSeconds().equals(this.getDurationSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getDurationSeconds() == null) ? 0 : getDurationSeconds().hashCode());
        return hashCode;
    }

    @Override
    public TargetGroupStickinessConfig clone() {
        try {
            return (TargetGroupStickinessConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
