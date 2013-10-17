/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#setDesiredCapacity(SetDesiredCapacityRequest) SetDesiredCapacity operation}.
 * <p>
 * Sets the desired size of the specified AutoScalingGroup.
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#setDesiredCapacity(SetDesiredCapacityRequest)
 */
public class SetDesiredCapacityRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * The new capacity setting for the Auto Scaling group.
     */
    private Integer desiredCapacity;

    /**
     * By default, <code>SetDesiredCapacity</code> overrides any cooldown
     * period associated with the Auto Scaling group. Set to
     * <code>True</code> if you want Auto Scaling to wait for the cooldown
     * period associated with the Auto Scaling group to complete before
     * initiating a scaling activity to set your Auto Scaling group to the
     * new capacity setting.
     */
    private Boolean honorCooldown;

    /**
     * The name of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name of the Auto Scaling group.
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }
    
    /**
     * The name of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the Auto Scaling group.
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }
    
    /**
     * The name of the Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetDesiredCapacityRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * The new capacity setting for the Auto Scaling group.
     *
     * @return The new capacity setting for the Auto Scaling group.
     */
    public Integer getDesiredCapacity() {
        return desiredCapacity;
    }
    
    /**
     * The new capacity setting for the Auto Scaling group.
     *
     * @param desiredCapacity The new capacity setting for the Auto Scaling group.
     */
    public void setDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
    }
    
    /**
     * The new capacity setting for the Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param desiredCapacity The new capacity setting for the Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetDesiredCapacityRequest withDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
        return this;
    }

    /**
     * By default, <code>SetDesiredCapacity</code> overrides any cooldown
     * period associated with the Auto Scaling group. Set to
     * <code>True</code> if you want Auto Scaling to wait for the cooldown
     * period associated with the Auto Scaling group to complete before
     * initiating a scaling activity to set your Auto Scaling group to the
     * new capacity setting.
     *
     * @return By default, <code>SetDesiredCapacity</code> overrides any cooldown
     *         period associated with the Auto Scaling group. Set to
     *         <code>True</code> if you want Auto Scaling to wait for the cooldown
     *         period associated with the Auto Scaling group to complete before
     *         initiating a scaling activity to set your Auto Scaling group to the
     *         new capacity setting.
     */
    public Boolean isHonorCooldown() {
        return honorCooldown;
    }
    
    /**
     * By default, <code>SetDesiredCapacity</code> overrides any cooldown
     * period associated with the Auto Scaling group. Set to
     * <code>True</code> if you want Auto Scaling to wait for the cooldown
     * period associated with the Auto Scaling group to complete before
     * initiating a scaling activity to set your Auto Scaling group to the
     * new capacity setting.
     *
     * @param honorCooldown By default, <code>SetDesiredCapacity</code> overrides any cooldown
     *         period associated with the Auto Scaling group. Set to
     *         <code>True</code> if you want Auto Scaling to wait for the cooldown
     *         period associated with the Auto Scaling group to complete before
     *         initiating a scaling activity to set your Auto Scaling group to the
     *         new capacity setting.
     */
    public void setHonorCooldown(Boolean honorCooldown) {
        this.honorCooldown = honorCooldown;
    }
    
    /**
     * By default, <code>SetDesiredCapacity</code> overrides any cooldown
     * period associated with the Auto Scaling group. Set to
     * <code>True</code> if you want Auto Scaling to wait for the cooldown
     * period associated with the Auto Scaling group to complete before
     * initiating a scaling activity to set your Auto Scaling group to the
     * new capacity setting.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param honorCooldown By default, <code>SetDesiredCapacity</code> overrides any cooldown
     *         period associated with the Auto Scaling group. Set to
     *         <code>True</code> if you want Auto Scaling to wait for the cooldown
     *         period associated with the Auto Scaling group to complete before
     *         initiating a scaling activity to set your Auto Scaling group to the
     *         new capacity setting.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetDesiredCapacityRequest withHonorCooldown(Boolean honorCooldown) {
        this.honorCooldown = honorCooldown;
        return this;
    }

    /**
     * By default, <code>SetDesiredCapacity</code> overrides any cooldown
     * period associated with the Auto Scaling group. Set to
     * <code>True</code> if you want Auto Scaling to wait for the cooldown
     * period associated with the Auto Scaling group to complete before
     * initiating a scaling activity to set your Auto Scaling group to the
     * new capacity setting.
     *
     * @return By default, <code>SetDesiredCapacity</code> overrides any cooldown
     *         period associated with the Auto Scaling group. Set to
     *         <code>True</code> if you want Auto Scaling to wait for the cooldown
     *         period associated with the Auto Scaling group to complete before
     *         initiating a scaling activity to set your Auto Scaling group to the
     *         new capacity setting.
     */
    public Boolean getHonorCooldown() {
        return honorCooldown;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAutoScalingGroupName() != null) sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() + ",");
        if (getDesiredCapacity() != null) sb.append("DesiredCapacity: " + getDesiredCapacity() + ",");
        if (isHonorCooldown() != null) sb.append("HonorCooldown: " + isHonorCooldown() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getDesiredCapacity() == null) ? 0 : getDesiredCapacity().hashCode()); 
        hashCode = prime * hashCode + ((isHonorCooldown() == null) ? 0 : isHonorCooldown().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SetDesiredCapacityRequest == false) return false;
        SetDesiredCapacityRequest other = (SetDesiredCapacityRequest)obj;
        
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null) return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false) return false; 
        if (other.getDesiredCapacity() == null ^ this.getDesiredCapacity() == null) return false;
        if (other.getDesiredCapacity() != null && other.getDesiredCapacity().equals(this.getDesiredCapacity()) == false) return false; 
        if (other.isHonorCooldown() == null ^ this.isHonorCooldown() == null) return false;
        if (other.isHonorCooldown() != null && other.isHonorCooldown().equals(this.isHonorCooldown()) == false) return false; 
        return true;
    }
    
}
    