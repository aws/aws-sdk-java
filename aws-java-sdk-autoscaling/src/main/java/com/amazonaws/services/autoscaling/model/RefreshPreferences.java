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
 * Describes information used to start an instance refresh.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/RefreshPreferences" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RefreshPreferences implements Serializable, Cloneable {

    /**
     * <p>
     * The amount of capacity in the Auto Scaling group that must remain healthy during an instance refresh to allow the
     * operation to continue, as a percentage of the desired capacity of the Auto Scaling group (rounded up to the
     * nearest integer). The default is <code>90</code>.
     * </p>
     */
    private Integer minHealthyPercentage;
    /**
     * <p>
     * The number of seconds until a newly launched instance is configured and ready to use. During this time, Amazon
     * EC2 Auto Scaling does not immediately move on to the next replacement. The default is to use the value specified
     * for the health check grace period for the group.
     * </p>
     * <p>
     * Note: While warming up, a newly launched instance is not counted toward the aggregated metrics of the Auto
     * Scaling group.
     * </p>
     */
    private Integer instanceWarmup;

    /**
     * <p>
     * The amount of capacity in the Auto Scaling group that must remain healthy during an instance refresh to allow the
     * operation to continue, as a percentage of the desired capacity of the Auto Scaling group (rounded up to the
     * nearest integer). The default is <code>90</code>.
     * </p>
     * 
     * @param minHealthyPercentage
     *        The amount of capacity in the Auto Scaling group that must remain healthy during an instance refresh to
     *        allow the operation to continue, as a percentage of the desired capacity of the Auto Scaling group
     *        (rounded up to the nearest integer). The default is <code>90</code>.
     */

    public void setMinHealthyPercentage(Integer minHealthyPercentage) {
        this.minHealthyPercentage = minHealthyPercentage;
    }

    /**
     * <p>
     * The amount of capacity in the Auto Scaling group that must remain healthy during an instance refresh to allow the
     * operation to continue, as a percentage of the desired capacity of the Auto Scaling group (rounded up to the
     * nearest integer). The default is <code>90</code>.
     * </p>
     * 
     * @return The amount of capacity in the Auto Scaling group that must remain healthy during an instance refresh to
     *         allow the operation to continue, as a percentage of the desired capacity of the Auto Scaling group
     *         (rounded up to the nearest integer). The default is <code>90</code>.
     */

    public Integer getMinHealthyPercentage() {
        return this.minHealthyPercentage;
    }

    /**
     * <p>
     * The amount of capacity in the Auto Scaling group that must remain healthy during an instance refresh to allow the
     * operation to continue, as a percentage of the desired capacity of the Auto Scaling group (rounded up to the
     * nearest integer). The default is <code>90</code>.
     * </p>
     * 
     * @param minHealthyPercentage
     *        The amount of capacity in the Auto Scaling group that must remain healthy during an instance refresh to
     *        allow the operation to continue, as a percentage of the desired capacity of the Auto Scaling group
     *        (rounded up to the nearest integer). The default is <code>90</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RefreshPreferences withMinHealthyPercentage(Integer minHealthyPercentage) {
        setMinHealthyPercentage(minHealthyPercentage);
        return this;
    }

    /**
     * <p>
     * The number of seconds until a newly launched instance is configured and ready to use. During this time, Amazon
     * EC2 Auto Scaling does not immediately move on to the next replacement. The default is to use the value specified
     * for the health check grace period for the group.
     * </p>
     * <p>
     * Note: While warming up, a newly launched instance is not counted toward the aggregated metrics of the Auto
     * Scaling group.
     * </p>
     * 
     * @param instanceWarmup
     *        The number of seconds until a newly launched instance is configured and ready to use. During this time,
     *        Amazon EC2 Auto Scaling does not immediately move on to the next replacement. The default is to use the
     *        value specified for the health check grace period for the group.</p>
     *        <p>
     *        Note: While warming up, a newly launched instance is not counted toward the aggregated metrics of the Auto
     *        Scaling group.
     */

    public void setInstanceWarmup(Integer instanceWarmup) {
        this.instanceWarmup = instanceWarmup;
    }

    /**
     * <p>
     * The number of seconds until a newly launched instance is configured and ready to use. During this time, Amazon
     * EC2 Auto Scaling does not immediately move on to the next replacement. The default is to use the value specified
     * for the health check grace period for the group.
     * </p>
     * <p>
     * Note: While warming up, a newly launched instance is not counted toward the aggregated metrics of the Auto
     * Scaling group.
     * </p>
     * 
     * @return The number of seconds until a newly launched instance is configured and ready to use. During this time,
     *         Amazon EC2 Auto Scaling does not immediately move on to the next replacement. The default is to use the
     *         value specified for the health check grace period for the group.</p>
     *         <p>
     *         Note: While warming up, a newly launched instance is not counted toward the aggregated metrics of the
     *         Auto Scaling group.
     */

    public Integer getInstanceWarmup() {
        return this.instanceWarmup;
    }

    /**
     * <p>
     * The number of seconds until a newly launched instance is configured and ready to use. During this time, Amazon
     * EC2 Auto Scaling does not immediately move on to the next replacement. The default is to use the value specified
     * for the health check grace period for the group.
     * </p>
     * <p>
     * Note: While warming up, a newly launched instance is not counted toward the aggregated metrics of the Auto
     * Scaling group.
     * </p>
     * 
     * @param instanceWarmup
     *        The number of seconds until a newly launched instance is configured and ready to use. During this time,
     *        Amazon EC2 Auto Scaling does not immediately move on to the next replacement. The default is to use the
     *        value specified for the health check grace period for the group.</p>
     *        <p>
     *        Note: While warming up, a newly launched instance is not counted toward the aggregated metrics of the Auto
     *        Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RefreshPreferences withInstanceWarmup(Integer instanceWarmup) {
        setInstanceWarmup(instanceWarmup);
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
        if (getInstanceWarmup() != null)
            sb.append("InstanceWarmup: ").append(getInstanceWarmup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RefreshPreferences == false)
            return false;
        RefreshPreferences other = (RefreshPreferences) obj;
        if (other.getMinHealthyPercentage() == null ^ this.getMinHealthyPercentage() == null)
            return false;
        if (other.getMinHealthyPercentage() != null && other.getMinHealthyPercentage().equals(this.getMinHealthyPercentage()) == false)
            return false;
        if (other.getInstanceWarmup() == null ^ this.getInstanceWarmup() == null)
            return false;
        if (other.getInstanceWarmup() != null && other.getInstanceWarmup().equals(this.getInstanceWarmup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinHealthyPercentage() == null) ? 0 : getMinHealthyPercentage().hashCode());
        hashCode = prime * hashCode + ((getInstanceWarmup() == null) ? 0 : getInstanceWarmup().hashCode());
        return hashCode;
    }

    @Override
    public RefreshPreferences clone() {
        try {
            return (RefreshPreferences) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
