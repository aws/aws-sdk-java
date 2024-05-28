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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Details about an instance refresh rollback.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/RollbackDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RollbackDetails implements Serializable, Cloneable {

    /**
     * <p>
     * The reason for this instance refresh rollback (for example, whether a manual or automatic rollback was
     * initiated).
     * </p>
     */
    private String rollbackReason;
    /**
     * <p>
     * The date and time at which the rollback began.
     * </p>
     */
    private java.util.Date rollbackStartTime;
    /**
     * <p>
     * Indicates the value of <code>PercentageComplete</code> at the time the rollback started.
     * </p>
     */
    private Integer percentageCompleteOnRollback;
    /**
     * <p>
     * Indicates the value of <code>InstancesToUpdate</code> at the time the rollback started.
     * </p>
     */
    private Integer instancesToUpdateOnRollback;
    /**
     * <p>
     * Reports progress on replacing instances in an Auto Scaling group that has a warm pool. This includes separate
     * details for instances in the warm pool and instances in the Auto Scaling group (the live pool).
     * </p>
     */
    private InstanceRefreshProgressDetails progressDetailsOnRollback;

    /**
     * <p>
     * The reason for this instance refresh rollback (for example, whether a manual or automatic rollback was
     * initiated).
     * </p>
     * 
     * @param rollbackReason
     *        The reason for this instance refresh rollback (for example, whether a manual or automatic rollback was
     *        initiated).
     */

    public void setRollbackReason(String rollbackReason) {
        this.rollbackReason = rollbackReason;
    }

    /**
     * <p>
     * The reason for this instance refresh rollback (for example, whether a manual or automatic rollback was
     * initiated).
     * </p>
     * 
     * @return The reason for this instance refresh rollback (for example, whether a manual or automatic rollback was
     *         initiated).
     */

    public String getRollbackReason() {
        return this.rollbackReason;
    }

    /**
     * <p>
     * The reason for this instance refresh rollback (for example, whether a manual or automatic rollback was
     * initiated).
     * </p>
     * 
     * @param rollbackReason
     *        The reason for this instance refresh rollback (for example, whether a manual or automatic rollback was
     *        initiated).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RollbackDetails withRollbackReason(String rollbackReason) {
        setRollbackReason(rollbackReason);
        return this;
    }

    /**
     * <p>
     * The date and time at which the rollback began.
     * </p>
     * 
     * @param rollbackStartTime
     *        The date and time at which the rollback began.
     */

    public void setRollbackStartTime(java.util.Date rollbackStartTime) {
        this.rollbackStartTime = rollbackStartTime;
    }

    /**
     * <p>
     * The date and time at which the rollback began.
     * </p>
     * 
     * @return The date and time at which the rollback began.
     */

    public java.util.Date getRollbackStartTime() {
        return this.rollbackStartTime;
    }

    /**
     * <p>
     * The date and time at which the rollback began.
     * </p>
     * 
     * @param rollbackStartTime
     *        The date and time at which the rollback began.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RollbackDetails withRollbackStartTime(java.util.Date rollbackStartTime) {
        setRollbackStartTime(rollbackStartTime);
        return this;
    }

    /**
     * <p>
     * Indicates the value of <code>PercentageComplete</code> at the time the rollback started.
     * </p>
     * 
     * @param percentageCompleteOnRollback
     *        Indicates the value of <code>PercentageComplete</code> at the time the rollback started.
     */

    public void setPercentageCompleteOnRollback(Integer percentageCompleteOnRollback) {
        this.percentageCompleteOnRollback = percentageCompleteOnRollback;
    }

    /**
     * <p>
     * Indicates the value of <code>PercentageComplete</code> at the time the rollback started.
     * </p>
     * 
     * @return Indicates the value of <code>PercentageComplete</code> at the time the rollback started.
     */

    public Integer getPercentageCompleteOnRollback() {
        return this.percentageCompleteOnRollback;
    }

    /**
     * <p>
     * Indicates the value of <code>PercentageComplete</code> at the time the rollback started.
     * </p>
     * 
     * @param percentageCompleteOnRollback
     *        Indicates the value of <code>PercentageComplete</code> at the time the rollback started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RollbackDetails withPercentageCompleteOnRollback(Integer percentageCompleteOnRollback) {
        setPercentageCompleteOnRollback(percentageCompleteOnRollback);
        return this;
    }

    /**
     * <p>
     * Indicates the value of <code>InstancesToUpdate</code> at the time the rollback started.
     * </p>
     * 
     * @param instancesToUpdateOnRollback
     *        Indicates the value of <code>InstancesToUpdate</code> at the time the rollback started.
     */

    public void setInstancesToUpdateOnRollback(Integer instancesToUpdateOnRollback) {
        this.instancesToUpdateOnRollback = instancesToUpdateOnRollback;
    }

    /**
     * <p>
     * Indicates the value of <code>InstancesToUpdate</code> at the time the rollback started.
     * </p>
     * 
     * @return Indicates the value of <code>InstancesToUpdate</code> at the time the rollback started.
     */

    public Integer getInstancesToUpdateOnRollback() {
        return this.instancesToUpdateOnRollback;
    }

    /**
     * <p>
     * Indicates the value of <code>InstancesToUpdate</code> at the time the rollback started.
     * </p>
     * 
     * @param instancesToUpdateOnRollback
     *        Indicates the value of <code>InstancesToUpdate</code> at the time the rollback started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RollbackDetails withInstancesToUpdateOnRollback(Integer instancesToUpdateOnRollback) {
        setInstancesToUpdateOnRollback(instancesToUpdateOnRollback);
        return this;
    }

    /**
     * <p>
     * Reports progress on replacing instances in an Auto Scaling group that has a warm pool. This includes separate
     * details for instances in the warm pool and instances in the Auto Scaling group (the live pool).
     * </p>
     * 
     * @param progressDetailsOnRollback
     *        Reports progress on replacing instances in an Auto Scaling group that has a warm pool. This includes
     *        separate details for instances in the warm pool and instances in the Auto Scaling group (the live pool).
     */

    public void setProgressDetailsOnRollback(InstanceRefreshProgressDetails progressDetailsOnRollback) {
        this.progressDetailsOnRollback = progressDetailsOnRollback;
    }

    /**
     * <p>
     * Reports progress on replacing instances in an Auto Scaling group that has a warm pool. This includes separate
     * details for instances in the warm pool and instances in the Auto Scaling group (the live pool).
     * </p>
     * 
     * @return Reports progress on replacing instances in an Auto Scaling group that has a warm pool. This includes
     *         separate details for instances in the warm pool and instances in the Auto Scaling group (the live pool).
     */

    public InstanceRefreshProgressDetails getProgressDetailsOnRollback() {
        return this.progressDetailsOnRollback;
    }

    /**
     * <p>
     * Reports progress on replacing instances in an Auto Scaling group that has a warm pool. This includes separate
     * details for instances in the warm pool and instances in the Auto Scaling group (the live pool).
     * </p>
     * 
     * @param progressDetailsOnRollback
     *        Reports progress on replacing instances in an Auto Scaling group that has a warm pool. This includes
     *        separate details for instances in the warm pool and instances in the Auto Scaling group (the live pool).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RollbackDetails withProgressDetailsOnRollback(InstanceRefreshProgressDetails progressDetailsOnRollback) {
        setProgressDetailsOnRollback(progressDetailsOnRollback);
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
        if (getRollbackReason() != null)
            sb.append("RollbackReason: ").append(getRollbackReason()).append(",");
        if (getRollbackStartTime() != null)
            sb.append("RollbackStartTime: ").append(getRollbackStartTime()).append(",");
        if (getPercentageCompleteOnRollback() != null)
            sb.append("PercentageCompleteOnRollback: ").append(getPercentageCompleteOnRollback()).append(",");
        if (getInstancesToUpdateOnRollback() != null)
            sb.append("InstancesToUpdateOnRollback: ").append(getInstancesToUpdateOnRollback()).append(",");
        if (getProgressDetailsOnRollback() != null)
            sb.append("ProgressDetailsOnRollback: ").append(getProgressDetailsOnRollback());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RollbackDetails == false)
            return false;
        RollbackDetails other = (RollbackDetails) obj;
        if (other.getRollbackReason() == null ^ this.getRollbackReason() == null)
            return false;
        if (other.getRollbackReason() != null && other.getRollbackReason().equals(this.getRollbackReason()) == false)
            return false;
        if (other.getRollbackStartTime() == null ^ this.getRollbackStartTime() == null)
            return false;
        if (other.getRollbackStartTime() != null && other.getRollbackStartTime().equals(this.getRollbackStartTime()) == false)
            return false;
        if (other.getPercentageCompleteOnRollback() == null ^ this.getPercentageCompleteOnRollback() == null)
            return false;
        if (other.getPercentageCompleteOnRollback() != null && other.getPercentageCompleteOnRollback().equals(this.getPercentageCompleteOnRollback()) == false)
            return false;
        if (other.getInstancesToUpdateOnRollback() == null ^ this.getInstancesToUpdateOnRollback() == null)
            return false;
        if (other.getInstancesToUpdateOnRollback() != null && other.getInstancesToUpdateOnRollback().equals(this.getInstancesToUpdateOnRollback()) == false)
            return false;
        if (other.getProgressDetailsOnRollback() == null ^ this.getProgressDetailsOnRollback() == null)
            return false;
        if (other.getProgressDetailsOnRollback() != null && other.getProgressDetailsOnRollback().equals(this.getProgressDetailsOnRollback()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRollbackReason() == null) ? 0 : getRollbackReason().hashCode());
        hashCode = prime * hashCode + ((getRollbackStartTime() == null) ? 0 : getRollbackStartTime().hashCode());
        hashCode = prime * hashCode + ((getPercentageCompleteOnRollback() == null) ? 0 : getPercentageCompleteOnRollback().hashCode());
        hashCode = prime * hashCode + ((getInstancesToUpdateOnRollback() == null) ? 0 : getInstancesToUpdateOnRollback().hashCode());
        hashCode = prime * hashCode + ((getProgressDetailsOnRollback() == null) ? 0 : getProgressDetailsOnRollback().hashCode());
        return hashCode;
    }

    @Override
    public RollbackDetails clone() {
        try {
            return (RollbackDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
