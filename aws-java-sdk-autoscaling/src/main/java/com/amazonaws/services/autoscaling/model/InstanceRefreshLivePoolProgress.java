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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Reports the progress of an instance refresh on instances that are in the Auto Scaling group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/InstanceRefreshLivePoolProgress"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceRefreshLivePoolProgress implements Serializable, Cloneable {

    /**
     * <p>
     * The percentage of instances in the Auto Scaling group that have been replaced. For each instance replacement,
     * Amazon EC2 Auto Scaling tracks the instance's health status and warm-up time. When the instance's health status
     * changes to healthy and the specified warm-up time passes, the instance is considered updated and is added to the
     * percentage complete.
     * </p>
     */
    private Integer percentageComplete;
    /**
     * <p>
     * The number of instances remaining to update.
     * </p>
     */
    private Integer instancesToUpdate;

    /**
     * <p>
     * The percentage of instances in the Auto Scaling group that have been replaced. For each instance replacement,
     * Amazon EC2 Auto Scaling tracks the instance's health status and warm-up time. When the instance's health status
     * changes to healthy and the specified warm-up time passes, the instance is considered updated and is added to the
     * percentage complete.
     * </p>
     * 
     * @param percentageComplete
     *        The percentage of instances in the Auto Scaling group that have been replaced. For each instance
     *        replacement, Amazon EC2 Auto Scaling tracks the instance's health status and warm-up time. When the
     *        instance's health status changes to healthy and the specified warm-up time passes, the instance is
     *        considered updated and is added to the percentage complete.
     */

    public void setPercentageComplete(Integer percentageComplete) {
        this.percentageComplete = percentageComplete;
    }

    /**
     * <p>
     * The percentage of instances in the Auto Scaling group that have been replaced. For each instance replacement,
     * Amazon EC2 Auto Scaling tracks the instance's health status and warm-up time. When the instance's health status
     * changes to healthy and the specified warm-up time passes, the instance is considered updated and is added to the
     * percentage complete.
     * </p>
     * 
     * @return The percentage of instances in the Auto Scaling group that have been replaced. For each instance
     *         replacement, Amazon EC2 Auto Scaling tracks the instance's health status and warm-up time. When the
     *         instance's health status changes to healthy and the specified warm-up time passes, the instance is
     *         considered updated and is added to the percentage complete.
     */

    public Integer getPercentageComplete() {
        return this.percentageComplete;
    }

    /**
     * <p>
     * The percentage of instances in the Auto Scaling group that have been replaced. For each instance replacement,
     * Amazon EC2 Auto Scaling tracks the instance's health status and warm-up time. When the instance's health status
     * changes to healthy and the specified warm-up time passes, the instance is considered updated and is added to the
     * percentage complete.
     * </p>
     * 
     * @param percentageComplete
     *        The percentage of instances in the Auto Scaling group that have been replaced. For each instance
     *        replacement, Amazon EC2 Auto Scaling tracks the instance's health status and warm-up time. When the
     *        instance's health status changes to healthy and the specified warm-up time passes, the instance is
     *        considered updated and is added to the percentage complete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRefreshLivePoolProgress withPercentageComplete(Integer percentageComplete) {
        setPercentageComplete(percentageComplete);
        return this;
    }

    /**
     * <p>
     * The number of instances remaining to update.
     * </p>
     * 
     * @param instancesToUpdate
     *        The number of instances remaining to update.
     */

    public void setInstancesToUpdate(Integer instancesToUpdate) {
        this.instancesToUpdate = instancesToUpdate;
    }

    /**
     * <p>
     * The number of instances remaining to update.
     * </p>
     * 
     * @return The number of instances remaining to update.
     */

    public Integer getInstancesToUpdate() {
        return this.instancesToUpdate;
    }

    /**
     * <p>
     * The number of instances remaining to update.
     * </p>
     * 
     * @param instancesToUpdate
     *        The number of instances remaining to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRefreshLivePoolProgress withInstancesToUpdate(Integer instancesToUpdate) {
        setInstancesToUpdate(instancesToUpdate);
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
        if (getPercentageComplete() != null)
            sb.append("PercentageComplete: ").append(getPercentageComplete()).append(",");
        if (getInstancesToUpdate() != null)
            sb.append("InstancesToUpdate: ").append(getInstancesToUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceRefreshLivePoolProgress == false)
            return false;
        InstanceRefreshLivePoolProgress other = (InstanceRefreshLivePoolProgress) obj;
        if (other.getPercentageComplete() == null ^ this.getPercentageComplete() == null)
            return false;
        if (other.getPercentageComplete() != null && other.getPercentageComplete().equals(this.getPercentageComplete()) == false)
            return false;
        if (other.getInstancesToUpdate() == null ^ this.getInstancesToUpdate() == null)
            return false;
        if (other.getInstancesToUpdate() != null && other.getInstancesToUpdate().equals(this.getInstancesToUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPercentageComplete() == null) ? 0 : getPercentageComplete().hashCode());
        hashCode = prime * hashCode + ((getInstancesToUpdate() == null) ? 0 : getInstancesToUpdate().hashCode());
        return hashCode;
    }

    @Override
    public InstanceRefreshLivePoolProgress clone() {
        try {
            return (InstanceRefreshLivePoolProgress) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
