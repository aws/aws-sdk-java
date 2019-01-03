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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/SetDesiredCapacity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetDesiredCapacityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * The number of EC2 instances that should be running in the Auto Scaling group.
     * </p>
     */
    private Integer desiredCapacity;
    /**
     * <p>
     * Indicates whether Amazon EC2 Auto Scaling waits for the cooldown period to complete before initiating a scaling
     * activity to set your Auto Scaling group to its new capacity. By default, Amazon EC2 Auto Scaling does not honor
     * the cooldown period during manual scaling activities.
     * </p>
     */
    private Boolean honorCooldown;

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group.
     */

    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @return The name of the Auto Scaling group.
     */

    public String getAutoScalingGroupName() {
        return this.autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetDesiredCapacityRequest withAutoScalingGroupName(String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * The number of EC2 instances that should be running in the Auto Scaling group.
     * </p>
     * 
     * @param desiredCapacity
     *        The number of EC2 instances that should be running in the Auto Scaling group.
     */

    public void setDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
    }

    /**
     * <p>
     * The number of EC2 instances that should be running in the Auto Scaling group.
     * </p>
     * 
     * @return The number of EC2 instances that should be running in the Auto Scaling group.
     */

    public Integer getDesiredCapacity() {
        return this.desiredCapacity;
    }

    /**
     * <p>
     * The number of EC2 instances that should be running in the Auto Scaling group.
     * </p>
     * 
     * @param desiredCapacity
     *        The number of EC2 instances that should be running in the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetDesiredCapacityRequest withDesiredCapacity(Integer desiredCapacity) {
        setDesiredCapacity(desiredCapacity);
        return this;
    }

    /**
     * <p>
     * Indicates whether Amazon EC2 Auto Scaling waits for the cooldown period to complete before initiating a scaling
     * activity to set your Auto Scaling group to its new capacity. By default, Amazon EC2 Auto Scaling does not honor
     * the cooldown period during manual scaling activities.
     * </p>
     * 
     * @param honorCooldown
     *        Indicates whether Amazon EC2 Auto Scaling waits for the cooldown period to complete before initiating a
     *        scaling activity to set your Auto Scaling group to its new capacity. By default, Amazon EC2 Auto Scaling
     *        does not honor the cooldown period during manual scaling activities.
     */

    public void setHonorCooldown(Boolean honorCooldown) {
        this.honorCooldown = honorCooldown;
    }

    /**
     * <p>
     * Indicates whether Amazon EC2 Auto Scaling waits for the cooldown period to complete before initiating a scaling
     * activity to set your Auto Scaling group to its new capacity. By default, Amazon EC2 Auto Scaling does not honor
     * the cooldown period during manual scaling activities.
     * </p>
     * 
     * @return Indicates whether Amazon EC2 Auto Scaling waits for the cooldown period to complete before initiating a
     *         scaling activity to set your Auto Scaling group to its new capacity. By default, Amazon EC2 Auto Scaling
     *         does not honor the cooldown period during manual scaling activities.
     */

    public Boolean getHonorCooldown() {
        return this.honorCooldown;
    }

    /**
     * <p>
     * Indicates whether Amazon EC2 Auto Scaling waits for the cooldown period to complete before initiating a scaling
     * activity to set your Auto Scaling group to its new capacity. By default, Amazon EC2 Auto Scaling does not honor
     * the cooldown period during manual scaling activities.
     * </p>
     * 
     * @param honorCooldown
     *        Indicates whether Amazon EC2 Auto Scaling waits for the cooldown period to complete before initiating a
     *        scaling activity to set your Auto Scaling group to its new capacity. By default, Amazon EC2 Auto Scaling
     *        does not honor the cooldown period during manual scaling activities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetDesiredCapacityRequest withHonorCooldown(Boolean honorCooldown) {
        setHonorCooldown(honorCooldown);
        return this;
    }

    /**
     * <p>
     * Indicates whether Amazon EC2 Auto Scaling waits for the cooldown period to complete before initiating a scaling
     * activity to set your Auto Scaling group to its new capacity. By default, Amazon EC2 Auto Scaling does not honor
     * the cooldown period during manual scaling activities.
     * </p>
     * 
     * @return Indicates whether Amazon EC2 Auto Scaling waits for the cooldown period to complete before initiating a
     *         scaling activity to set your Auto Scaling group to its new capacity. By default, Amazon EC2 Auto Scaling
     *         does not honor the cooldown period during manual scaling activities.
     */

    public Boolean isHonorCooldown() {
        return this.honorCooldown;
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
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: ").append(getAutoScalingGroupName()).append(",");
        if (getDesiredCapacity() != null)
            sb.append("DesiredCapacity: ").append(getDesiredCapacity()).append(",");
        if (getHonorCooldown() != null)
            sb.append("HonorCooldown: ").append(getHonorCooldown());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetDesiredCapacityRequest == false)
            return false;
        SetDesiredCapacityRequest other = (SetDesiredCapacityRequest) obj;
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getDesiredCapacity() == null ^ this.getDesiredCapacity() == null)
            return false;
        if (other.getDesiredCapacity() != null && other.getDesiredCapacity().equals(this.getDesiredCapacity()) == false)
            return false;
        if (other.getHonorCooldown() == null ^ this.getHonorCooldown() == null)
            return false;
        if (other.getHonorCooldown() != null && other.getHonorCooldown().equals(this.getHonorCooldown()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getDesiredCapacity() == null) ? 0 : getDesiredCapacity().hashCode());
        hashCode = prime * hashCode + ((getHonorCooldown() == null) ? 0 : getHonorCooldown().hashCode());
        return hashCode;
    }

    @Override
    public SetDesiredCapacityRequest clone() {
        return (SetDesiredCapacityRequest) super.clone();
    }

}
