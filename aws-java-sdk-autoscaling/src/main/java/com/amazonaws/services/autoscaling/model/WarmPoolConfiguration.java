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
 * Describes a warm pool configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/WarmPoolConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WarmPoolConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of instances that are allowed to be in the warm pool or in any state except
     * <code>Terminated</code> for the Auto Scaling group.
     * </p>
     */
    private Integer maxGroupPreparedCapacity;
    /**
     * <p>
     * The minimum number of instances to maintain in the warm pool.
     * </p>
     */
    private Integer minSize;
    /**
     * <p>
     * The instance state to transition to after the lifecycle actions are complete.
     * </p>
     */
    private String poolState;
    /**
     * <p>
     * The status of a warm pool that is marked for deletion.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The maximum number of instances that are allowed to be in the warm pool or in any state except
     * <code>Terminated</code> for the Auto Scaling group.
     * </p>
     * 
     * @param maxGroupPreparedCapacity
     *        The maximum number of instances that are allowed to be in the warm pool or in any state except
     *        <code>Terminated</code> for the Auto Scaling group.
     */

    public void setMaxGroupPreparedCapacity(Integer maxGroupPreparedCapacity) {
        this.maxGroupPreparedCapacity = maxGroupPreparedCapacity;
    }

    /**
     * <p>
     * The maximum number of instances that are allowed to be in the warm pool or in any state except
     * <code>Terminated</code> for the Auto Scaling group.
     * </p>
     * 
     * @return The maximum number of instances that are allowed to be in the warm pool or in any state except
     *         <code>Terminated</code> for the Auto Scaling group.
     */

    public Integer getMaxGroupPreparedCapacity() {
        return this.maxGroupPreparedCapacity;
    }

    /**
     * <p>
     * The maximum number of instances that are allowed to be in the warm pool or in any state except
     * <code>Terminated</code> for the Auto Scaling group.
     * </p>
     * 
     * @param maxGroupPreparedCapacity
     *        The maximum number of instances that are allowed to be in the warm pool or in any state except
     *        <code>Terminated</code> for the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WarmPoolConfiguration withMaxGroupPreparedCapacity(Integer maxGroupPreparedCapacity) {
        setMaxGroupPreparedCapacity(maxGroupPreparedCapacity);
        return this;
    }

    /**
     * <p>
     * The minimum number of instances to maintain in the warm pool.
     * </p>
     * 
     * @param minSize
     *        The minimum number of instances to maintain in the warm pool.
     */

    public void setMinSize(Integer minSize) {
        this.minSize = minSize;
    }

    /**
     * <p>
     * The minimum number of instances to maintain in the warm pool.
     * </p>
     * 
     * @return The minimum number of instances to maintain in the warm pool.
     */

    public Integer getMinSize() {
        return this.minSize;
    }

    /**
     * <p>
     * The minimum number of instances to maintain in the warm pool.
     * </p>
     * 
     * @param minSize
     *        The minimum number of instances to maintain in the warm pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WarmPoolConfiguration withMinSize(Integer minSize) {
        setMinSize(minSize);
        return this;
    }

    /**
     * <p>
     * The instance state to transition to after the lifecycle actions are complete.
     * </p>
     * 
     * @param poolState
     *        The instance state to transition to after the lifecycle actions are complete.
     * @see WarmPoolState
     */

    public void setPoolState(String poolState) {
        this.poolState = poolState;
    }

    /**
     * <p>
     * The instance state to transition to after the lifecycle actions are complete.
     * </p>
     * 
     * @return The instance state to transition to after the lifecycle actions are complete.
     * @see WarmPoolState
     */

    public String getPoolState() {
        return this.poolState;
    }

    /**
     * <p>
     * The instance state to transition to after the lifecycle actions are complete.
     * </p>
     * 
     * @param poolState
     *        The instance state to transition to after the lifecycle actions are complete.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WarmPoolState
     */

    public WarmPoolConfiguration withPoolState(String poolState) {
        setPoolState(poolState);
        return this;
    }

    /**
     * <p>
     * The instance state to transition to after the lifecycle actions are complete.
     * </p>
     * 
     * @param poolState
     *        The instance state to transition to after the lifecycle actions are complete.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WarmPoolState
     */

    public WarmPoolConfiguration withPoolState(WarmPoolState poolState) {
        this.poolState = poolState.toString();
        return this;
    }

    /**
     * <p>
     * The status of a warm pool that is marked for deletion.
     * </p>
     * 
     * @param status
     *        The status of a warm pool that is marked for deletion.
     * @see WarmPoolStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a warm pool that is marked for deletion.
     * </p>
     * 
     * @return The status of a warm pool that is marked for deletion.
     * @see WarmPoolStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of a warm pool that is marked for deletion.
     * </p>
     * 
     * @param status
     *        The status of a warm pool that is marked for deletion.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WarmPoolStatus
     */

    public WarmPoolConfiguration withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of a warm pool that is marked for deletion.
     * </p>
     * 
     * @param status
     *        The status of a warm pool that is marked for deletion.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WarmPoolStatus
     */

    public WarmPoolConfiguration withStatus(WarmPoolStatus status) {
        this.status = status.toString();
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
        if (getMaxGroupPreparedCapacity() != null)
            sb.append("MaxGroupPreparedCapacity: ").append(getMaxGroupPreparedCapacity()).append(",");
        if (getMinSize() != null)
            sb.append("MinSize: ").append(getMinSize()).append(",");
        if (getPoolState() != null)
            sb.append("PoolState: ").append(getPoolState()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WarmPoolConfiguration == false)
            return false;
        WarmPoolConfiguration other = (WarmPoolConfiguration) obj;
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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxGroupPreparedCapacity() == null) ? 0 : getMaxGroupPreparedCapacity().hashCode());
        hashCode = prime * hashCode + ((getMinSize() == null) ? 0 : getMinSize().hashCode());
        hashCode = prime * hashCode + ((getPoolState() == null) ? 0 : getPoolState().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public WarmPoolConfiguration clone() {
        try {
            return (WarmPoolConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
