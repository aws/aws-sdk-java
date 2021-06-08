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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/PutWarmPool" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutWarmPoolRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * Specifies the maximum number of instances that are allowed to be in the warm pool or in any state except
     * <code>Terminated</code> for the Auto Scaling group. This is an optional property. Specify it only if you do not
     * want the warm pool size to be determined by the difference between the group's maximum capacity and its desired
     * capacity.
     * </p>
     * <important>
     * <p>
     * If a value for <code>MaxGroupPreparedCapacity</code> is not specified, Amazon EC2 Auto Scaling launches and
     * maintains the difference between the group's maximum capacity and its desired capacity. If you specify a value
     * for <code>MaxGroupPreparedCapacity</code>, Amazon EC2 Auto Scaling uses the difference between the
     * <code>MaxGroupPreparedCapacity</code> and the desired capacity instead.
     * </p>
     * <p>
     * The size of the warm pool is dynamic. Only when <code>MaxGroupPreparedCapacity</code> and <code>MinSize</code>
     * are set to the same value does the warm pool have an absolute size.
     * </p>
     * </important>
     * <p>
     * If the desired capacity of the Auto Scaling group is higher than the <code>MaxGroupPreparedCapacity</code>, the
     * capacity of the warm pool is 0, unless you specify a value for <code>MinSize</code>. To remove a value that you
     * previously set, include the property but specify -1 for the value.
     * </p>
     */
    private Integer maxGroupPreparedCapacity;
    /**
     * <p>
     * Specifies the minimum number of instances to maintain in the warm pool. This helps you to ensure that there is
     * always a certain number of warmed instances available to handle traffic spikes. Defaults to 0 if not specified.
     * </p>
     */
    private Integer minSize;
    /**
     * <p>
     * Sets the instance state to transition to after the lifecycle actions are complete. Default is
     * <code>Stopped</code>.
     * </p>
     */
    private String poolState;

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

    public PutWarmPoolRequest withAutoScalingGroupName(String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * Specifies the maximum number of instances that are allowed to be in the warm pool or in any state except
     * <code>Terminated</code> for the Auto Scaling group. This is an optional property. Specify it only if you do not
     * want the warm pool size to be determined by the difference between the group's maximum capacity and its desired
     * capacity.
     * </p>
     * <important>
     * <p>
     * If a value for <code>MaxGroupPreparedCapacity</code> is not specified, Amazon EC2 Auto Scaling launches and
     * maintains the difference between the group's maximum capacity and its desired capacity. If you specify a value
     * for <code>MaxGroupPreparedCapacity</code>, Amazon EC2 Auto Scaling uses the difference between the
     * <code>MaxGroupPreparedCapacity</code> and the desired capacity instead.
     * </p>
     * <p>
     * The size of the warm pool is dynamic. Only when <code>MaxGroupPreparedCapacity</code> and <code>MinSize</code>
     * are set to the same value does the warm pool have an absolute size.
     * </p>
     * </important>
     * <p>
     * If the desired capacity of the Auto Scaling group is higher than the <code>MaxGroupPreparedCapacity</code>, the
     * capacity of the warm pool is 0, unless you specify a value for <code>MinSize</code>. To remove a value that you
     * previously set, include the property but specify -1 for the value.
     * </p>
     * 
     * @param maxGroupPreparedCapacity
     *        Specifies the maximum number of instances that are allowed to be in the warm pool or in any state except
     *        <code>Terminated</code> for the Auto Scaling group. This is an optional property. Specify it only if you
     *        do not want the warm pool size to be determined by the difference between the group's maximum capacity and
     *        its desired capacity. </p> <important>
     *        <p>
     *        If a value for <code>MaxGroupPreparedCapacity</code> is not specified, Amazon EC2 Auto Scaling launches
     *        and maintains the difference between the group's maximum capacity and its desired capacity. If you specify
     *        a value for <code>MaxGroupPreparedCapacity</code>, Amazon EC2 Auto Scaling uses the difference between the
     *        <code>MaxGroupPreparedCapacity</code> and the desired capacity instead.
     *        </p>
     *        <p>
     *        The size of the warm pool is dynamic. Only when <code>MaxGroupPreparedCapacity</code> and
     *        <code>MinSize</code> are set to the same value does the warm pool have an absolute size.
     *        </p>
     *        </important>
     *        <p>
     *        If the desired capacity of the Auto Scaling group is higher than the <code>MaxGroupPreparedCapacity</code>
     *        , the capacity of the warm pool is 0, unless you specify a value for <code>MinSize</code>. To remove a
     *        value that you previously set, include the property but specify -1 for the value.
     */

    public void setMaxGroupPreparedCapacity(Integer maxGroupPreparedCapacity) {
        this.maxGroupPreparedCapacity = maxGroupPreparedCapacity;
    }

    /**
     * <p>
     * Specifies the maximum number of instances that are allowed to be in the warm pool or in any state except
     * <code>Terminated</code> for the Auto Scaling group. This is an optional property. Specify it only if you do not
     * want the warm pool size to be determined by the difference between the group's maximum capacity and its desired
     * capacity.
     * </p>
     * <important>
     * <p>
     * If a value for <code>MaxGroupPreparedCapacity</code> is not specified, Amazon EC2 Auto Scaling launches and
     * maintains the difference between the group's maximum capacity and its desired capacity. If you specify a value
     * for <code>MaxGroupPreparedCapacity</code>, Amazon EC2 Auto Scaling uses the difference between the
     * <code>MaxGroupPreparedCapacity</code> and the desired capacity instead.
     * </p>
     * <p>
     * The size of the warm pool is dynamic. Only when <code>MaxGroupPreparedCapacity</code> and <code>MinSize</code>
     * are set to the same value does the warm pool have an absolute size.
     * </p>
     * </important>
     * <p>
     * If the desired capacity of the Auto Scaling group is higher than the <code>MaxGroupPreparedCapacity</code>, the
     * capacity of the warm pool is 0, unless you specify a value for <code>MinSize</code>. To remove a value that you
     * previously set, include the property but specify -1 for the value.
     * </p>
     * 
     * @return Specifies the maximum number of instances that are allowed to be in the warm pool or in any state except
     *         <code>Terminated</code> for the Auto Scaling group. This is an optional property. Specify it only if you
     *         do not want the warm pool size to be determined by the difference between the group's maximum capacity
     *         and its desired capacity. </p> <important>
     *         <p>
     *         If a value for <code>MaxGroupPreparedCapacity</code> is not specified, Amazon EC2 Auto Scaling launches
     *         and maintains the difference between the group's maximum capacity and its desired capacity. If you
     *         specify a value for <code>MaxGroupPreparedCapacity</code>, Amazon EC2 Auto Scaling uses the difference
     *         between the <code>MaxGroupPreparedCapacity</code> and the desired capacity instead.
     *         </p>
     *         <p>
     *         The size of the warm pool is dynamic. Only when <code>MaxGroupPreparedCapacity</code> and
     *         <code>MinSize</code> are set to the same value does the warm pool have an absolute size.
     *         </p>
     *         </important>
     *         <p>
     *         If the desired capacity of the Auto Scaling group is higher than the
     *         <code>MaxGroupPreparedCapacity</code>, the capacity of the warm pool is 0, unless you specify a value for
     *         <code>MinSize</code>. To remove a value that you previously set, include the property but specify -1 for
     *         the value.
     */

    public Integer getMaxGroupPreparedCapacity() {
        return this.maxGroupPreparedCapacity;
    }

    /**
     * <p>
     * Specifies the maximum number of instances that are allowed to be in the warm pool or in any state except
     * <code>Terminated</code> for the Auto Scaling group. This is an optional property. Specify it only if you do not
     * want the warm pool size to be determined by the difference between the group's maximum capacity and its desired
     * capacity.
     * </p>
     * <important>
     * <p>
     * If a value for <code>MaxGroupPreparedCapacity</code> is not specified, Amazon EC2 Auto Scaling launches and
     * maintains the difference between the group's maximum capacity and its desired capacity. If you specify a value
     * for <code>MaxGroupPreparedCapacity</code>, Amazon EC2 Auto Scaling uses the difference between the
     * <code>MaxGroupPreparedCapacity</code> and the desired capacity instead.
     * </p>
     * <p>
     * The size of the warm pool is dynamic. Only when <code>MaxGroupPreparedCapacity</code> and <code>MinSize</code>
     * are set to the same value does the warm pool have an absolute size.
     * </p>
     * </important>
     * <p>
     * If the desired capacity of the Auto Scaling group is higher than the <code>MaxGroupPreparedCapacity</code>, the
     * capacity of the warm pool is 0, unless you specify a value for <code>MinSize</code>. To remove a value that you
     * previously set, include the property but specify -1 for the value.
     * </p>
     * 
     * @param maxGroupPreparedCapacity
     *        Specifies the maximum number of instances that are allowed to be in the warm pool or in any state except
     *        <code>Terminated</code> for the Auto Scaling group. This is an optional property. Specify it only if you
     *        do not want the warm pool size to be determined by the difference between the group's maximum capacity and
     *        its desired capacity. </p> <important>
     *        <p>
     *        If a value for <code>MaxGroupPreparedCapacity</code> is not specified, Amazon EC2 Auto Scaling launches
     *        and maintains the difference between the group's maximum capacity and its desired capacity. If you specify
     *        a value for <code>MaxGroupPreparedCapacity</code>, Amazon EC2 Auto Scaling uses the difference between the
     *        <code>MaxGroupPreparedCapacity</code> and the desired capacity instead.
     *        </p>
     *        <p>
     *        The size of the warm pool is dynamic. Only when <code>MaxGroupPreparedCapacity</code> and
     *        <code>MinSize</code> are set to the same value does the warm pool have an absolute size.
     *        </p>
     *        </important>
     *        <p>
     *        If the desired capacity of the Auto Scaling group is higher than the <code>MaxGroupPreparedCapacity</code>
     *        , the capacity of the warm pool is 0, unless you specify a value for <code>MinSize</code>. To remove a
     *        value that you previously set, include the property but specify -1 for the value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutWarmPoolRequest withMaxGroupPreparedCapacity(Integer maxGroupPreparedCapacity) {
        setMaxGroupPreparedCapacity(maxGroupPreparedCapacity);
        return this;
    }

    /**
     * <p>
     * Specifies the minimum number of instances to maintain in the warm pool. This helps you to ensure that there is
     * always a certain number of warmed instances available to handle traffic spikes. Defaults to 0 if not specified.
     * </p>
     * 
     * @param minSize
     *        Specifies the minimum number of instances to maintain in the warm pool. This helps you to ensure that
     *        there is always a certain number of warmed instances available to handle traffic spikes. Defaults to 0 if
     *        not specified.
     */

    public void setMinSize(Integer minSize) {
        this.minSize = minSize;
    }

    /**
     * <p>
     * Specifies the minimum number of instances to maintain in the warm pool. This helps you to ensure that there is
     * always a certain number of warmed instances available to handle traffic spikes. Defaults to 0 if not specified.
     * </p>
     * 
     * @return Specifies the minimum number of instances to maintain in the warm pool. This helps you to ensure that
     *         there is always a certain number of warmed instances available to handle traffic spikes. Defaults to 0 if
     *         not specified.
     */

    public Integer getMinSize() {
        return this.minSize;
    }

    /**
     * <p>
     * Specifies the minimum number of instances to maintain in the warm pool. This helps you to ensure that there is
     * always a certain number of warmed instances available to handle traffic spikes. Defaults to 0 if not specified.
     * </p>
     * 
     * @param minSize
     *        Specifies the minimum number of instances to maintain in the warm pool. This helps you to ensure that
     *        there is always a certain number of warmed instances available to handle traffic spikes. Defaults to 0 if
     *        not specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutWarmPoolRequest withMinSize(Integer minSize) {
        setMinSize(minSize);
        return this;
    }

    /**
     * <p>
     * Sets the instance state to transition to after the lifecycle actions are complete. Default is
     * <code>Stopped</code>.
     * </p>
     * 
     * @param poolState
     *        Sets the instance state to transition to after the lifecycle actions are complete. Default is
     *        <code>Stopped</code>.
     * @see WarmPoolState
     */

    public void setPoolState(String poolState) {
        this.poolState = poolState;
    }

    /**
     * <p>
     * Sets the instance state to transition to after the lifecycle actions are complete. Default is
     * <code>Stopped</code>.
     * </p>
     * 
     * @return Sets the instance state to transition to after the lifecycle actions are complete. Default is
     *         <code>Stopped</code>.
     * @see WarmPoolState
     */

    public String getPoolState() {
        return this.poolState;
    }

    /**
     * <p>
     * Sets the instance state to transition to after the lifecycle actions are complete. Default is
     * <code>Stopped</code>.
     * </p>
     * 
     * @param poolState
     *        Sets the instance state to transition to after the lifecycle actions are complete. Default is
     *        <code>Stopped</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WarmPoolState
     */

    public PutWarmPoolRequest withPoolState(String poolState) {
        setPoolState(poolState);
        return this;
    }

    /**
     * <p>
     * Sets the instance state to transition to after the lifecycle actions are complete. Default is
     * <code>Stopped</code>.
     * </p>
     * 
     * @param poolState
     *        Sets the instance state to transition to after the lifecycle actions are complete. Default is
     *        <code>Stopped</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WarmPoolState
     */

    public PutWarmPoolRequest withPoolState(WarmPoolState poolState) {
        this.poolState = poolState.toString();
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
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: ").append(getAutoScalingGroupName()).append(",");
        if (getMaxGroupPreparedCapacity() != null)
            sb.append("MaxGroupPreparedCapacity: ").append(getMaxGroupPreparedCapacity()).append(",");
        if (getMinSize() != null)
            sb.append("MinSize: ").append(getMinSize()).append(",");
        if (getPoolState() != null)
            sb.append("PoolState: ").append(getPoolState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutWarmPoolRequest == false)
            return false;
        PutWarmPoolRequest other = (PutWarmPoolRequest) obj;
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getMaxGroupPreparedCapacity() == null ^ this.getMaxGroupPreparedCapacity() == null)
            return false;
        if (other.getMaxGroupPreparedCapacity() != null && other.getMaxGroupPreparedCapacity().equals(this.getMaxGroupPreparedCapacity()) == false)
            return false;
        if (other.getMinSize() == null ^ this.getMinSize() == null)
            return false;
        if (other.getMinSize() != null && other.getMinSize().equals(this.getMinSize()) == false)
            return false;
        if (other.getPoolState() == null ^ this.getPoolState() == null)
            return false;
        if (other.getPoolState() != null && other.getPoolState().equals(this.getPoolState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getMaxGroupPreparedCapacity() == null) ? 0 : getMaxGroupPreparedCapacity().hashCode());
        hashCode = prime * hashCode + ((getMinSize() == null) ? 0 : getMinSize().hashCode());
        hashCode = prime * hashCode + ((getPoolState() == null) ? 0 : getPoolState().hashCode());
        return hashCode;
    }

    @Override
    public PutWarmPoolRequest clone() {
        return (PutWarmPoolRequest) super.clone();
    }

}
