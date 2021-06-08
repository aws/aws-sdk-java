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
 * Describes information used to start an instance refresh.
 * </p>
 * <p>
 * All properties are optional. However, if you specify a value for <code>CheckpointDelay</code>, you must also provide
 * a value for <code>CheckpointPercentages</code>.
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
     * EC2 Auto Scaling does not immediately move on to the next replacement. The default is to use the value for the
     * health check grace period defined for the group.
     * </p>
     */
    private Integer instanceWarmup;
    /**
     * <p>
     * Threshold values for each checkpoint in ascending order. Each number must be unique. To replace all instances in
     * the Auto Scaling group, the last number in the array must be <code>100</code>.
     * </p>
     * <p>
     * For usage examples, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-adding-checkpoints-instance-refresh.html">Adding
     * checkpoints to an instance refresh</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Integer> checkpointPercentages;
    /**
     * <p>
     * The amount of time, in seconds, to wait after a checkpoint before continuing. This property is optional, but if
     * you specify a value for it, you must also specify a value for <code>CheckpointPercentages</code>. If you specify
     * a value for <code>CheckpointPercentages</code> and not for <code>CheckpointDelay</code>, the
     * <code>CheckpointDelay</code> defaults to <code>3600</code> (1 hour).
     * </p>
     */
    private Integer checkpointDelay;

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
     * EC2 Auto Scaling does not immediately move on to the next replacement. The default is to use the value for the
     * health check grace period defined for the group.
     * </p>
     * 
     * @param instanceWarmup
     *        The number of seconds until a newly launched instance is configured and ready to use. During this time,
     *        Amazon EC2 Auto Scaling does not immediately move on to the next replacement. The default is to use the
     *        value for the health check grace period defined for the group.
     */

    public void setInstanceWarmup(Integer instanceWarmup) {
        this.instanceWarmup = instanceWarmup;
    }

    /**
     * <p>
     * The number of seconds until a newly launched instance is configured and ready to use. During this time, Amazon
     * EC2 Auto Scaling does not immediately move on to the next replacement. The default is to use the value for the
     * health check grace period defined for the group.
     * </p>
     * 
     * @return The number of seconds until a newly launched instance is configured and ready to use. During this time,
     *         Amazon EC2 Auto Scaling does not immediately move on to the next replacement. The default is to use the
     *         value for the health check grace period defined for the group.
     */

    public Integer getInstanceWarmup() {
        return this.instanceWarmup;
    }

    /**
     * <p>
     * The number of seconds until a newly launched instance is configured and ready to use. During this time, Amazon
     * EC2 Auto Scaling does not immediately move on to the next replacement. The default is to use the value for the
     * health check grace period defined for the group.
     * </p>
     * 
     * @param instanceWarmup
     *        The number of seconds until a newly launched instance is configured and ready to use. During this time,
     *        Amazon EC2 Auto Scaling does not immediately move on to the next replacement. The default is to use the
     *        value for the health check grace period defined for the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RefreshPreferences withInstanceWarmup(Integer instanceWarmup) {
        setInstanceWarmup(instanceWarmup);
        return this;
    }

    /**
     * <p>
     * Threshold values for each checkpoint in ascending order. Each number must be unique. To replace all instances in
     * the Auto Scaling group, the last number in the array must be <code>100</code>.
     * </p>
     * <p>
     * For usage examples, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-adding-checkpoints-instance-refresh.html">Adding
     * checkpoints to an instance refresh</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return Threshold values for each checkpoint in ascending order. Each number must be unique. To replace all
     *         instances in the Auto Scaling group, the last number in the array must be <code>100</code>.</p>
     *         <p>
     *         For usage examples, see <a href=
     *         "https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-adding-checkpoints-instance-refresh.html"
     *         >Adding checkpoints to an instance refresh</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public java.util.List<Integer> getCheckpointPercentages() {
        if (checkpointPercentages == null) {
            checkpointPercentages = new com.amazonaws.internal.SdkInternalList<Integer>();
        }
        return checkpointPercentages;
    }

    /**
     * <p>
     * Threshold values for each checkpoint in ascending order. Each number must be unique. To replace all instances in
     * the Auto Scaling group, the last number in the array must be <code>100</code>.
     * </p>
     * <p>
     * For usage examples, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-adding-checkpoints-instance-refresh.html">Adding
     * checkpoints to an instance refresh</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param checkpointPercentages
     *        Threshold values for each checkpoint in ascending order. Each number must be unique. To replace all
     *        instances in the Auto Scaling group, the last number in the array must be <code>100</code>.</p>
     *        <p>
     *        For usage examples, see <a href=
     *        "https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-adding-checkpoints-instance-refresh.html"
     *        >Adding checkpoints to an instance refresh</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public void setCheckpointPercentages(java.util.Collection<Integer> checkpointPercentages) {
        if (checkpointPercentages == null) {
            this.checkpointPercentages = null;
            return;
        }

        this.checkpointPercentages = new com.amazonaws.internal.SdkInternalList<Integer>(checkpointPercentages);
    }

    /**
     * <p>
     * Threshold values for each checkpoint in ascending order. Each number must be unique. To replace all instances in
     * the Auto Scaling group, the last number in the array must be <code>100</code>.
     * </p>
     * <p>
     * For usage examples, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-adding-checkpoints-instance-refresh.html">Adding
     * checkpoints to an instance refresh</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCheckpointPercentages(java.util.Collection)} or
     * {@link #withCheckpointPercentages(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param checkpointPercentages
     *        Threshold values for each checkpoint in ascending order. Each number must be unique. To replace all
     *        instances in the Auto Scaling group, the last number in the array must be <code>100</code>.</p>
     *        <p>
     *        For usage examples, see <a href=
     *        "https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-adding-checkpoints-instance-refresh.html"
     *        >Adding checkpoints to an instance refresh</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RefreshPreferences withCheckpointPercentages(Integer... checkpointPercentages) {
        if (this.checkpointPercentages == null) {
            setCheckpointPercentages(new com.amazonaws.internal.SdkInternalList<Integer>(checkpointPercentages.length));
        }
        for (Integer ele : checkpointPercentages) {
            this.checkpointPercentages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Threshold values for each checkpoint in ascending order. Each number must be unique. To replace all instances in
     * the Auto Scaling group, the last number in the array must be <code>100</code>.
     * </p>
     * <p>
     * For usage examples, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-adding-checkpoints-instance-refresh.html">Adding
     * checkpoints to an instance refresh</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param checkpointPercentages
     *        Threshold values for each checkpoint in ascending order. Each number must be unique. To replace all
     *        instances in the Auto Scaling group, the last number in the array must be <code>100</code>.</p>
     *        <p>
     *        For usage examples, see <a href=
     *        "https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-adding-checkpoints-instance-refresh.html"
     *        >Adding checkpoints to an instance refresh</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RefreshPreferences withCheckpointPercentages(java.util.Collection<Integer> checkpointPercentages) {
        setCheckpointPercentages(checkpointPercentages);
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, to wait after a checkpoint before continuing. This property is optional, but if
     * you specify a value for it, you must also specify a value for <code>CheckpointPercentages</code>. If you specify
     * a value for <code>CheckpointPercentages</code> and not for <code>CheckpointDelay</code>, the
     * <code>CheckpointDelay</code> defaults to <code>3600</code> (1 hour).
     * </p>
     * 
     * @param checkpointDelay
     *        The amount of time, in seconds, to wait after a checkpoint before continuing. This property is optional,
     *        but if you specify a value for it, you must also specify a value for <code>CheckpointPercentages</code>.
     *        If you specify a value for <code>CheckpointPercentages</code> and not for <code>CheckpointDelay</code>,
     *        the <code>CheckpointDelay</code> defaults to <code>3600</code> (1 hour).
     */

    public void setCheckpointDelay(Integer checkpointDelay) {
        this.checkpointDelay = checkpointDelay;
    }

    /**
     * <p>
     * The amount of time, in seconds, to wait after a checkpoint before continuing. This property is optional, but if
     * you specify a value for it, you must also specify a value for <code>CheckpointPercentages</code>. If you specify
     * a value for <code>CheckpointPercentages</code> and not for <code>CheckpointDelay</code>, the
     * <code>CheckpointDelay</code> defaults to <code>3600</code> (1 hour).
     * </p>
     * 
     * @return The amount of time, in seconds, to wait after a checkpoint before continuing. This property is optional,
     *         but if you specify a value for it, you must also specify a value for <code>CheckpointPercentages</code>.
     *         If you specify a value for <code>CheckpointPercentages</code> and not for <code>CheckpointDelay</code>,
     *         the <code>CheckpointDelay</code> defaults to <code>3600</code> (1 hour).
     */

    public Integer getCheckpointDelay() {
        return this.checkpointDelay;
    }

    /**
     * <p>
     * The amount of time, in seconds, to wait after a checkpoint before continuing. This property is optional, but if
     * you specify a value for it, you must also specify a value for <code>CheckpointPercentages</code>. If you specify
     * a value for <code>CheckpointPercentages</code> and not for <code>CheckpointDelay</code>, the
     * <code>CheckpointDelay</code> defaults to <code>3600</code> (1 hour).
     * </p>
     * 
     * @param checkpointDelay
     *        The amount of time, in seconds, to wait after a checkpoint before continuing. This property is optional,
     *        but if you specify a value for it, you must also specify a value for <code>CheckpointPercentages</code>.
     *        If you specify a value for <code>CheckpointPercentages</code> and not for <code>CheckpointDelay</code>,
     *        the <code>CheckpointDelay</code> defaults to <code>3600</code> (1 hour).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RefreshPreferences withCheckpointDelay(Integer checkpointDelay) {
        setCheckpointDelay(checkpointDelay);
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
            sb.append("InstanceWarmup: ").append(getInstanceWarmup()).append(",");
        if (getCheckpointPercentages() != null)
            sb.append("CheckpointPercentages: ").append(getCheckpointPercentages()).append(",");
        if (getCheckpointDelay() != null)
            sb.append("CheckpointDelay: ").append(getCheckpointDelay());
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
        if (other.getCheckpointPercentages() == null ^ this.getCheckpointPercentages() == null)
            return false;
        if (other.getCheckpointPercentages() != null && other.getCheckpointPercentages().equals(this.getCheckpointPercentages()) == false)
            return false;
        if (other.getCheckpointDelay() == null ^ this.getCheckpointDelay() == null)
            return false;
        if (other.getCheckpointDelay() != null && other.getCheckpointDelay().equals(this.getCheckpointDelay()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinHealthyPercentage() == null) ? 0 : getMinHealthyPercentage().hashCode());
        hashCode = prime * hashCode + ((getInstanceWarmup() == null) ? 0 : getInstanceWarmup().hashCode());
        hashCode = prime * hashCode + ((getCheckpointPercentages() == null) ? 0 : getCheckpointPercentages().hashCode());
        hashCode = prime * hashCode + ((getCheckpointDelay() == null) ? 0 : getCheckpointDelay().hashCode());
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
