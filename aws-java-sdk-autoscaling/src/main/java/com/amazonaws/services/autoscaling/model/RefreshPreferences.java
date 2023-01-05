/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes the preferences for an instance refresh.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/RefreshPreferences" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RefreshPreferences implements Serializable, Cloneable {

    /**
     * <p>
     * The amount of capacity in the Auto Scaling group that must pass your group's health checks to allow the operation
     * to continue. The value is expressed as a percentage of the desired capacity of the Auto Scaling group (rounded up
     * to the nearest integer). The default is <code>90</code>.
     * </p>
     * <p>
     * Setting the minimum healthy percentage to 100 percent limits the rate of replacement to one instance at a time.
     * In contrast, setting it to 0 percent has the effect of replacing all instances at the same time.
     * </p>
     */
    private Integer minHealthyPercentage;
    /**
     * <p>
     * <i>Not needed if the default instance warmup is defined for the group.</i>
     * </p>
     * <p>
     * The duration of the instance warmup, in seconds.
     * </p>
     * <note>
     * <p>
     * The default is to use the value for the default instance warmup defined for the group. If default instance warmup
     * is null, then <code>InstanceWarmup</code> falls back to the value of the health check grace period.
     * </p>
     * </note>
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
     * A boolean value that indicates whether skip matching is enabled. If true, then Amazon EC2 Auto Scaling skips
     * replacing instances that match the desired configuration. If no desired configuration is specified, then it skips
     * replacing instances that have the same configuration that is already set on the group. The default is
     * <code>false</code>.
     * </p>
     */
    private Boolean skipMatching;

    /**
     * <p>
     * The amount of capacity in the Auto Scaling group that must pass your group's health checks to allow the operation
     * to continue. The value is expressed as a percentage of the desired capacity of the Auto Scaling group (rounded up
     * to the nearest integer). The default is <code>90</code>.
     * </p>
     * <p>
     * Setting the minimum healthy percentage to 100 percent limits the rate of replacement to one instance at a time.
     * In contrast, setting it to 0 percent has the effect of replacing all instances at the same time.
     * </p>
     * 
     * @param minHealthyPercentage
     *        The amount of capacity in the Auto Scaling group that must pass your group's health checks to allow the
     *        operation to continue. The value is expressed as a percentage of the desired capacity of the Auto Scaling
     *        group (rounded up to the nearest integer). The default is <code>90</code>.</p>
     *        <p>
     *        Setting the minimum healthy percentage to 100 percent limits the rate of replacement to one instance at a
     *        time. In contrast, setting it to 0 percent has the effect of replacing all instances at the same time.
     */

    public void setMinHealthyPercentage(Integer minHealthyPercentage) {
        this.minHealthyPercentage = minHealthyPercentage;
    }

    /**
     * <p>
     * The amount of capacity in the Auto Scaling group that must pass your group's health checks to allow the operation
     * to continue. The value is expressed as a percentage of the desired capacity of the Auto Scaling group (rounded up
     * to the nearest integer). The default is <code>90</code>.
     * </p>
     * <p>
     * Setting the minimum healthy percentage to 100 percent limits the rate of replacement to one instance at a time.
     * In contrast, setting it to 0 percent has the effect of replacing all instances at the same time.
     * </p>
     * 
     * @return The amount of capacity in the Auto Scaling group that must pass your group's health checks to allow the
     *         operation to continue. The value is expressed as a percentage of the desired capacity of the Auto Scaling
     *         group (rounded up to the nearest integer). The default is <code>90</code>.</p>
     *         <p>
     *         Setting the minimum healthy percentage to 100 percent limits the rate of replacement to one instance at a
     *         time. In contrast, setting it to 0 percent has the effect of replacing all instances at the same time.
     */

    public Integer getMinHealthyPercentage() {
        return this.minHealthyPercentage;
    }

    /**
     * <p>
     * The amount of capacity in the Auto Scaling group that must pass your group's health checks to allow the operation
     * to continue. The value is expressed as a percentage of the desired capacity of the Auto Scaling group (rounded up
     * to the nearest integer). The default is <code>90</code>.
     * </p>
     * <p>
     * Setting the minimum healthy percentage to 100 percent limits the rate of replacement to one instance at a time.
     * In contrast, setting it to 0 percent has the effect of replacing all instances at the same time.
     * </p>
     * 
     * @param minHealthyPercentage
     *        The amount of capacity in the Auto Scaling group that must pass your group's health checks to allow the
     *        operation to continue. The value is expressed as a percentage of the desired capacity of the Auto Scaling
     *        group (rounded up to the nearest integer). The default is <code>90</code>.</p>
     *        <p>
     *        Setting the minimum healthy percentage to 100 percent limits the rate of replacement to one instance at a
     *        time. In contrast, setting it to 0 percent has the effect of replacing all instances at the same time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RefreshPreferences withMinHealthyPercentage(Integer minHealthyPercentage) {
        setMinHealthyPercentage(minHealthyPercentage);
        return this;
    }

    /**
     * <p>
     * <i>Not needed if the default instance warmup is defined for the group.</i>
     * </p>
     * <p>
     * The duration of the instance warmup, in seconds.
     * </p>
     * <note>
     * <p>
     * The default is to use the value for the default instance warmup defined for the group. If default instance warmup
     * is null, then <code>InstanceWarmup</code> falls back to the value of the health check grace period.
     * </p>
     * </note>
     * 
     * @param instanceWarmup
     *        <i>Not needed if the default instance warmup is defined for the group.</i> </p>
     *        <p>
     *        The duration of the instance warmup, in seconds.
     *        </p>
     *        <note>
     *        <p>
     *        The default is to use the value for the default instance warmup defined for the group. If default instance
     *        warmup is null, then <code>InstanceWarmup</code> falls back to the value of the health check grace period.
     *        </p>
     */

    public void setInstanceWarmup(Integer instanceWarmup) {
        this.instanceWarmup = instanceWarmup;
    }

    /**
     * <p>
     * <i>Not needed if the default instance warmup is defined for the group.</i>
     * </p>
     * <p>
     * The duration of the instance warmup, in seconds.
     * </p>
     * <note>
     * <p>
     * The default is to use the value for the default instance warmup defined for the group. If default instance warmup
     * is null, then <code>InstanceWarmup</code> falls back to the value of the health check grace period.
     * </p>
     * </note>
     * 
     * @return <i>Not needed if the default instance warmup is defined for the group.</i> </p>
     *         <p>
     *         The duration of the instance warmup, in seconds.
     *         </p>
     *         <note>
     *         <p>
     *         The default is to use the value for the default instance warmup defined for the group. If default
     *         instance warmup is null, then <code>InstanceWarmup</code> falls back to the value of the health check
     *         grace period.
     *         </p>
     */

    public Integer getInstanceWarmup() {
        return this.instanceWarmup;
    }

    /**
     * <p>
     * <i>Not needed if the default instance warmup is defined for the group.</i>
     * </p>
     * <p>
     * The duration of the instance warmup, in seconds.
     * </p>
     * <note>
     * <p>
     * The default is to use the value for the default instance warmup defined for the group. If default instance warmup
     * is null, then <code>InstanceWarmup</code> falls back to the value of the health check grace period.
     * </p>
     * </note>
     * 
     * @param instanceWarmup
     *        <i>Not needed if the default instance warmup is defined for the group.</i> </p>
     *        <p>
     *        The duration of the instance warmup, in seconds.
     *        </p>
     *        <note>
     *        <p>
     *        The default is to use the value for the default instance warmup defined for the group. If default instance
     *        warmup is null, then <code>InstanceWarmup</code> falls back to the value of the health check grace period.
     *        </p>
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
     * <p>
     * A boolean value that indicates whether skip matching is enabled. If true, then Amazon EC2 Auto Scaling skips
     * replacing instances that match the desired configuration. If no desired configuration is specified, then it skips
     * replacing instances that have the same configuration that is already set on the group. The default is
     * <code>false</code>.
     * </p>
     * 
     * @param skipMatching
     *        A boolean value that indicates whether skip matching is enabled. If true, then Amazon EC2 Auto Scaling
     *        skips replacing instances that match the desired configuration. If no desired configuration is specified,
     *        then it skips replacing instances that have the same configuration that is already set on the group. The
     *        default is <code>false</code>.
     */

    public void setSkipMatching(Boolean skipMatching) {
        this.skipMatching = skipMatching;
    }

    /**
     * <p>
     * A boolean value that indicates whether skip matching is enabled. If true, then Amazon EC2 Auto Scaling skips
     * replacing instances that match the desired configuration. If no desired configuration is specified, then it skips
     * replacing instances that have the same configuration that is already set on the group. The default is
     * <code>false</code>.
     * </p>
     * 
     * @return A boolean value that indicates whether skip matching is enabled. If true, then Amazon EC2 Auto Scaling
     *         skips replacing instances that match the desired configuration. If no desired configuration is specified,
     *         then it skips replacing instances that have the same configuration that is already set on the group. The
     *         default is <code>false</code>.
     */

    public Boolean getSkipMatching() {
        return this.skipMatching;
    }

    /**
     * <p>
     * A boolean value that indicates whether skip matching is enabled. If true, then Amazon EC2 Auto Scaling skips
     * replacing instances that match the desired configuration. If no desired configuration is specified, then it skips
     * replacing instances that have the same configuration that is already set on the group. The default is
     * <code>false</code>.
     * </p>
     * 
     * @param skipMatching
     *        A boolean value that indicates whether skip matching is enabled. If true, then Amazon EC2 Auto Scaling
     *        skips replacing instances that match the desired configuration. If no desired configuration is specified,
     *        then it skips replacing instances that have the same configuration that is already set on the group. The
     *        default is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RefreshPreferences withSkipMatching(Boolean skipMatching) {
        setSkipMatching(skipMatching);
        return this;
    }

    /**
     * <p>
     * A boolean value that indicates whether skip matching is enabled. If true, then Amazon EC2 Auto Scaling skips
     * replacing instances that match the desired configuration. If no desired configuration is specified, then it skips
     * replacing instances that have the same configuration that is already set on the group. The default is
     * <code>false</code>.
     * </p>
     * 
     * @return A boolean value that indicates whether skip matching is enabled. If true, then Amazon EC2 Auto Scaling
     *         skips replacing instances that match the desired configuration. If no desired configuration is specified,
     *         then it skips replacing instances that have the same configuration that is already set on the group. The
     *         default is <code>false</code>.
     */

    public Boolean isSkipMatching() {
        return this.skipMatching;
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
            sb.append("CheckpointDelay: ").append(getCheckpointDelay()).append(",");
        if (getSkipMatching() != null)
            sb.append("SkipMatching: ").append(getSkipMatching());
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
        if (other.getSkipMatching() == null ^ this.getSkipMatching() == null)
            return false;
        if (other.getSkipMatching() != null && other.getSkipMatching().equals(this.getSkipMatching()) == false)
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
        hashCode = prime * hashCode + ((getSkipMatching() == null) ? 0 : getSkipMatching().hashCode());
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
