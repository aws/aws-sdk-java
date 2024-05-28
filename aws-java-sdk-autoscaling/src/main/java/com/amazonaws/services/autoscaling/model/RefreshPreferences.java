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
     * Specifies the minimum percentage of the group to keep in service, healthy, and ready to use to support your
     * workload to allow the operation to continue. The value is expressed as a percentage of the desired capacity of
     * the Auto Scaling group. Value range is 0 to 100.
     * </p>
     * <p>
     * If you do not specify this property, the default is 90 percent, or the percentage set in the instance maintenance
     * policy for the Auto Scaling group, if defined.
     * </p>
     */
    private Integer minHealthyPercentage;
    /**
     * <p>
     * A time period, in seconds, during which an instance refresh waits before moving on to replacing the next instance
     * after a new instance enters the <code>InService</code> state.
     * </p>
     * <p>
     * This property is not required for normal usage. Instead, use the <code>DefaultInstanceWarmup</code> property of
     * the Auto Scaling group. The <code>InstanceWarmup</code> and <code>DefaultInstanceWarmup</code> properties work
     * the same way. Only specify this property if you must override the <code>DefaultInstanceWarmup</code> property.
     * </p>
     * <p>
     * If you do not specify this property, the instance warmup by default is the value of the
     * <code>DefaultInstanceWarmup</code> property, if defined (which is recommended in all cases), or the
     * <code>HealthCheckGracePeriod</code> property otherwise.
     * </p>
     */
    private Integer instanceWarmup;
    /**
     * <p>
     * (Optional) Threshold values for each checkpoint in ascending order. Each number must be unique. To replace all
     * instances in the Auto Scaling group, the last number in the array must be <code>100</code>.
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
     * (Optional) The amount of time, in seconds, to wait after a checkpoint before continuing. This property is
     * optional, but if you specify a value for it, you must also specify a value for <code>CheckpointPercentages</code>
     * . If you specify a value for <code>CheckpointPercentages</code> and not for <code>CheckpointDelay</code>, the
     * <code>CheckpointDelay</code> defaults to <code>3600</code> (1 hour).
     * </p>
     */
    private Integer checkpointDelay;
    /**
     * <p>
     * (Optional) Indicates whether skip matching is enabled. If enabled (<code>true</code>), then Amazon EC2 Auto
     * Scaling skips replacing instances that match the desired configuration. If no desired configuration is specified,
     * then it skips replacing instances that have the same launch template and instance types that the Auto Scaling
     * group was using before the start of the instance refresh. The default is <code>false</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-refresh-skip-matching.html">Use an
     * instance refresh with skip matching</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private Boolean skipMatching;
    /**
     * <p>
     * (Optional) Indicates whether to roll back the Auto Scaling group to its previous configuration if the instance
     * refresh fails or a CloudWatch alarm threshold is met. The default is <code>false</code>.
     * </p>
     * <p>
     * A rollback is not supported in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * There is no desired configuration specified for the instance refresh.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Auto Scaling group has a launch template that uses an Amazon Web Services Systems Manager parameter instead
     * of an AMI ID for the <code>ImageId</code> property.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Auto Scaling group uses the launch template's <code>$Latest</code> or <code>$Default</code> version.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/instance-refresh-rollback.html">Undo changes with a
     * rollback</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private Boolean autoRollback;
    /**
     * <p>
     * Choose the behavior that you want Amazon EC2 Auto Scaling to use if instances protected from scale in are found.
     * </p>
     * <p>
     * The following lists the valid values:
     * </p>
     * <dl>
     * <dt>Refresh</dt>
     * <dd>
     * <p>
     * Amazon EC2 Auto Scaling replaces instances that are protected from scale in.
     * </p>
     * </dd>
     * <dt>Ignore</dt>
     * <dd>
     * <p>
     * Amazon EC2 Auto Scaling ignores instances that are protected from scale in and continues to replace instances
     * that are not protected.
     * </p>
     * </dd>
     * <dt>Wait (default)</dt>
     * <dd>
     * <p>
     * Amazon EC2 Auto Scaling waits one hour for you to remove scale-in protection. Otherwise, the instance refresh
     * will fail.
     * </p>
     * </dd>
     * </dl>
     */
    private String scaleInProtectedInstances;
    /**
     * <p>
     * Choose the behavior that you want Amazon EC2 Auto Scaling to use if instances in <code>Standby</code> state are
     * found.
     * </p>
     * <p>
     * The following lists the valid values:
     * </p>
     * <dl>
     * <dt>Terminate</dt>
     * <dd>
     * <p>
     * Amazon EC2 Auto Scaling terminates instances that are in <code>Standby</code>.
     * </p>
     * </dd>
     * <dt>Ignore</dt>
     * <dd>
     * <p>
     * Amazon EC2 Auto Scaling ignores instances that are in <code>Standby</code> and continues to replace instances
     * that are in the <code>InService</code> state.
     * </p>
     * </dd>
     * <dt>Wait (default)</dt>
     * <dd>
     * <p>
     * Amazon EC2 Auto Scaling waits one hour for you to return the instances to service. Otherwise, the instance
     * refresh will fail.
     * </p>
     * </dd>
     * </dl>
     */
    private String standbyInstances;
    /**
     * <p>
     * (Optional) The CloudWatch alarm specification. CloudWatch alarms can be used to identify any issues and fail the
     * operation if an alarm threshold is met.
     * </p>
     */
    private AlarmSpecification alarmSpecification;
    /**
     * <p>
     * Specifies the maximum percentage of the group that can be in service and healthy, or pending, to support your
     * workload when replacing instances. The value is expressed as a percentage of the desired capacity of the Auto
     * Scaling group. Value range is 100 to 200.
     * </p>
     * <p>
     * If you specify <code>MaxHealthyPercentage</code>, you must also specify <code>MinHealthyPercentage</code>, and
     * the difference between them cannot be greater than 100. A larger range increases the number of instances that can
     * be replaced at the same time.
     * </p>
     * <p>
     * If you do not specify this property, the default is 100 percent, or the percentage set in the instance
     * maintenance policy for the Auto Scaling group, if defined.
     * </p>
     */
    private Integer maxHealthyPercentage;

    /**
     * <p>
     * Specifies the minimum percentage of the group to keep in service, healthy, and ready to use to support your
     * workload to allow the operation to continue. The value is expressed as a percentage of the desired capacity of
     * the Auto Scaling group. Value range is 0 to 100.
     * </p>
     * <p>
     * If you do not specify this property, the default is 90 percent, or the percentage set in the instance maintenance
     * policy for the Auto Scaling group, if defined.
     * </p>
     * 
     * @param minHealthyPercentage
     *        Specifies the minimum percentage of the group to keep in service, healthy, and ready to use to support
     *        your workload to allow the operation to continue. The value is expressed as a percentage of the desired
     *        capacity of the Auto Scaling group. Value range is 0 to 100.</p>
     *        <p>
     *        If you do not specify this property, the default is 90 percent, or the percentage set in the instance
     *        maintenance policy for the Auto Scaling group, if defined.
     */

    public void setMinHealthyPercentage(Integer minHealthyPercentage) {
        this.minHealthyPercentage = minHealthyPercentage;
    }

    /**
     * <p>
     * Specifies the minimum percentage of the group to keep in service, healthy, and ready to use to support your
     * workload to allow the operation to continue. The value is expressed as a percentage of the desired capacity of
     * the Auto Scaling group. Value range is 0 to 100.
     * </p>
     * <p>
     * If you do not specify this property, the default is 90 percent, or the percentage set in the instance maintenance
     * policy for the Auto Scaling group, if defined.
     * </p>
     * 
     * @return Specifies the minimum percentage of the group to keep in service, healthy, and ready to use to support
     *         your workload to allow the operation to continue. The value is expressed as a percentage of the desired
     *         capacity of the Auto Scaling group. Value range is 0 to 100.</p>
     *         <p>
     *         If you do not specify this property, the default is 90 percent, or the percentage set in the instance
     *         maintenance policy for the Auto Scaling group, if defined.
     */

    public Integer getMinHealthyPercentage() {
        return this.minHealthyPercentage;
    }

    /**
     * <p>
     * Specifies the minimum percentage of the group to keep in service, healthy, and ready to use to support your
     * workload to allow the operation to continue. The value is expressed as a percentage of the desired capacity of
     * the Auto Scaling group. Value range is 0 to 100.
     * </p>
     * <p>
     * If you do not specify this property, the default is 90 percent, or the percentage set in the instance maintenance
     * policy for the Auto Scaling group, if defined.
     * </p>
     * 
     * @param minHealthyPercentage
     *        Specifies the minimum percentage of the group to keep in service, healthy, and ready to use to support
     *        your workload to allow the operation to continue. The value is expressed as a percentage of the desired
     *        capacity of the Auto Scaling group. Value range is 0 to 100.</p>
     *        <p>
     *        If you do not specify this property, the default is 90 percent, or the percentage set in the instance
     *        maintenance policy for the Auto Scaling group, if defined.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RefreshPreferences withMinHealthyPercentage(Integer minHealthyPercentage) {
        setMinHealthyPercentage(minHealthyPercentage);
        return this;
    }

    /**
     * <p>
     * A time period, in seconds, during which an instance refresh waits before moving on to replacing the next instance
     * after a new instance enters the <code>InService</code> state.
     * </p>
     * <p>
     * This property is not required for normal usage. Instead, use the <code>DefaultInstanceWarmup</code> property of
     * the Auto Scaling group. The <code>InstanceWarmup</code> and <code>DefaultInstanceWarmup</code> properties work
     * the same way. Only specify this property if you must override the <code>DefaultInstanceWarmup</code> property.
     * </p>
     * <p>
     * If you do not specify this property, the instance warmup by default is the value of the
     * <code>DefaultInstanceWarmup</code> property, if defined (which is recommended in all cases), or the
     * <code>HealthCheckGracePeriod</code> property otherwise.
     * </p>
     * 
     * @param instanceWarmup
     *        A time period, in seconds, during which an instance refresh waits before moving on to replacing the next
     *        instance after a new instance enters the <code>InService</code> state.</p>
     *        <p>
     *        This property is not required for normal usage. Instead, use the <code>DefaultInstanceWarmup</code>
     *        property of the Auto Scaling group. The <code>InstanceWarmup</code> and <code>DefaultInstanceWarmup</code>
     *        properties work the same way. Only specify this property if you must override the
     *        <code>DefaultInstanceWarmup</code> property.
     *        </p>
     *        <p>
     *        If you do not specify this property, the instance warmup by default is the value of the
     *        <code>DefaultInstanceWarmup</code> property, if defined (which is recommended in all cases), or the
     *        <code>HealthCheckGracePeriod</code> property otherwise.
     */

    public void setInstanceWarmup(Integer instanceWarmup) {
        this.instanceWarmup = instanceWarmup;
    }

    /**
     * <p>
     * A time period, in seconds, during which an instance refresh waits before moving on to replacing the next instance
     * after a new instance enters the <code>InService</code> state.
     * </p>
     * <p>
     * This property is not required for normal usage. Instead, use the <code>DefaultInstanceWarmup</code> property of
     * the Auto Scaling group. The <code>InstanceWarmup</code> and <code>DefaultInstanceWarmup</code> properties work
     * the same way. Only specify this property if you must override the <code>DefaultInstanceWarmup</code> property.
     * </p>
     * <p>
     * If you do not specify this property, the instance warmup by default is the value of the
     * <code>DefaultInstanceWarmup</code> property, if defined (which is recommended in all cases), or the
     * <code>HealthCheckGracePeriod</code> property otherwise.
     * </p>
     * 
     * @return A time period, in seconds, during which an instance refresh waits before moving on to replacing the next
     *         instance after a new instance enters the <code>InService</code> state.</p>
     *         <p>
     *         This property is not required for normal usage. Instead, use the <code>DefaultInstanceWarmup</code>
     *         property of the Auto Scaling group. The <code>InstanceWarmup</code> and
     *         <code>DefaultInstanceWarmup</code> properties work the same way. Only specify this property if you must
     *         override the <code>DefaultInstanceWarmup</code> property.
     *         </p>
     *         <p>
     *         If you do not specify this property, the instance warmup by default is the value of the
     *         <code>DefaultInstanceWarmup</code> property, if defined (which is recommended in all cases), or the
     *         <code>HealthCheckGracePeriod</code> property otherwise.
     */

    public Integer getInstanceWarmup() {
        return this.instanceWarmup;
    }

    /**
     * <p>
     * A time period, in seconds, during which an instance refresh waits before moving on to replacing the next instance
     * after a new instance enters the <code>InService</code> state.
     * </p>
     * <p>
     * This property is not required for normal usage. Instead, use the <code>DefaultInstanceWarmup</code> property of
     * the Auto Scaling group. The <code>InstanceWarmup</code> and <code>DefaultInstanceWarmup</code> properties work
     * the same way. Only specify this property if you must override the <code>DefaultInstanceWarmup</code> property.
     * </p>
     * <p>
     * If you do not specify this property, the instance warmup by default is the value of the
     * <code>DefaultInstanceWarmup</code> property, if defined (which is recommended in all cases), or the
     * <code>HealthCheckGracePeriod</code> property otherwise.
     * </p>
     * 
     * @param instanceWarmup
     *        A time period, in seconds, during which an instance refresh waits before moving on to replacing the next
     *        instance after a new instance enters the <code>InService</code> state.</p>
     *        <p>
     *        This property is not required for normal usage. Instead, use the <code>DefaultInstanceWarmup</code>
     *        property of the Auto Scaling group. The <code>InstanceWarmup</code> and <code>DefaultInstanceWarmup</code>
     *        properties work the same way. Only specify this property if you must override the
     *        <code>DefaultInstanceWarmup</code> property.
     *        </p>
     *        <p>
     *        If you do not specify this property, the instance warmup by default is the value of the
     *        <code>DefaultInstanceWarmup</code> property, if defined (which is recommended in all cases), or the
     *        <code>HealthCheckGracePeriod</code> property otherwise.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RefreshPreferences withInstanceWarmup(Integer instanceWarmup) {
        setInstanceWarmup(instanceWarmup);
        return this;
    }

    /**
     * <p>
     * (Optional) Threshold values for each checkpoint in ascending order. Each number must be unique. To replace all
     * instances in the Auto Scaling group, the last number in the array must be <code>100</code>.
     * </p>
     * <p>
     * For usage examples, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-adding-checkpoints-instance-refresh.html">Adding
     * checkpoints to an instance refresh</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return (Optional) Threshold values for each checkpoint in ascending order. Each number must be unique. To
     *         replace all instances in the Auto Scaling group, the last number in the array must be <code>100</code>
     *         .</p>
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
     * (Optional) Threshold values for each checkpoint in ascending order. Each number must be unique. To replace all
     * instances in the Auto Scaling group, the last number in the array must be <code>100</code>.
     * </p>
     * <p>
     * For usage examples, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-adding-checkpoints-instance-refresh.html">Adding
     * checkpoints to an instance refresh</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param checkpointPercentages
     *        (Optional) Threshold values for each checkpoint in ascending order. Each number must be unique. To replace
     *        all instances in the Auto Scaling group, the last number in the array must be <code>100</code>.</p>
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
     * (Optional) Threshold values for each checkpoint in ascending order. Each number must be unique. To replace all
     * instances in the Auto Scaling group, the last number in the array must be <code>100</code>.
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
     *        (Optional) Threshold values for each checkpoint in ascending order. Each number must be unique. To replace
     *        all instances in the Auto Scaling group, the last number in the array must be <code>100</code>.</p>
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
     * (Optional) Threshold values for each checkpoint in ascending order. Each number must be unique. To replace all
     * instances in the Auto Scaling group, the last number in the array must be <code>100</code>.
     * </p>
     * <p>
     * For usage examples, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-adding-checkpoints-instance-refresh.html">Adding
     * checkpoints to an instance refresh</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param checkpointPercentages
     *        (Optional) Threshold values for each checkpoint in ascending order. Each number must be unique. To replace
     *        all instances in the Auto Scaling group, the last number in the array must be <code>100</code>.</p>
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
     * (Optional) The amount of time, in seconds, to wait after a checkpoint before continuing. This property is
     * optional, but if you specify a value for it, you must also specify a value for <code>CheckpointPercentages</code>
     * . If you specify a value for <code>CheckpointPercentages</code> and not for <code>CheckpointDelay</code>, the
     * <code>CheckpointDelay</code> defaults to <code>3600</code> (1 hour).
     * </p>
     * 
     * @param checkpointDelay
     *        (Optional) The amount of time, in seconds, to wait after a checkpoint before continuing. This property is
     *        optional, but if you specify a value for it, you must also specify a value for
     *        <code>CheckpointPercentages</code>. If you specify a value for <code>CheckpointPercentages</code> and not
     *        for <code>CheckpointDelay</code>, the <code>CheckpointDelay</code> defaults to <code>3600</code> (1 hour).
     */

    public void setCheckpointDelay(Integer checkpointDelay) {
        this.checkpointDelay = checkpointDelay;
    }

    /**
     * <p>
     * (Optional) The amount of time, in seconds, to wait after a checkpoint before continuing. This property is
     * optional, but if you specify a value for it, you must also specify a value for <code>CheckpointPercentages</code>
     * . If you specify a value for <code>CheckpointPercentages</code> and not for <code>CheckpointDelay</code>, the
     * <code>CheckpointDelay</code> defaults to <code>3600</code> (1 hour).
     * </p>
     * 
     * @return (Optional) The amount of time, in seconds, to wait after a checkpoint before continuing. This property is
     *         optional, but if you specify a value for it, you must also specify a value for
     *         <code>CheckpointPercentages</code>. If you specify a value for <code>CheckpointPercentages</code> and not
     *         for <code>CheckpointDelay</code>, the <code>CheckpointDelay</code> defaults to <code>3600</code> (1
     *         hour).
     */

    public Integer getCheckpointDelay() {
        return this.checkpointDelay;
    }

    /**
     * <p>
     * (Optional) The amount of time, in seconds, to wait after a checkpoint before continuing. This property is
     * optional, but if you specify a value for it, you must also specify a value for <code>CheckpointPercentages</code>
     * . If you specify a value for <code>CheckpointPercentages</code> and not for <code>CheckpointDelay</code>, the
     * <code>CheckpointDelay</code> defaults to <code>3600</code> (1 hour).
     * </p>
     * 
     * @param checkpointDelay
     *        (Optional) The amount of time, in seconds, to wait after a checkpoint before continuing. This property is
     *        optional, but if you specify a value for it, you must also specify a value for
     *        <code>CheckpointPercentages</code>. If you specify a value for <code>CheckpointPercentages</code> and not
     *        for <code>CheckpointDelay</code>, the <code>CheckpointDelay</code> defaults to <code>3600</code> (1 hour).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RefreshPreferences withCheckpointDelay(Integer checkpointDelay) {
        setCheckpointDelay(checkpointDelay);
        return this;
    }

    /**
     * <p>
     * (Optional) Indicates whether skip matching is enabled. If enabled (<code>true</code>), then Amazon EC2 Auto
     * Scaling skips replacing instances that match the desired configuration. If no desired configuration is specified,
     * then it skips replacing instances that have the same launch template and instance types that the Auto Scaling
     * group was using before the start of the instance refresh. The default is <code>false</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-refresh-skip-matching.html">Use an
     * instance refresh with skip matching</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param skipMatching
     *        (Optional) Indicates whether skip matching is enabled. If enabled (<code>true</code>), then Amazon EC2
     *        Auto Scaling skips replacing instances that match the desired configuration. If no desired configuration
     *        is specified, then it skips replacing instances that have the same launch template and instance types that
     *        the Auto Scaling group was using before the start of the instance refresh. The default is
     *        <code>false</code>.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-refresh-skip-matching.html">Use
     *        an instance refresh with skip matching</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public void setSkipMatching(Boolean skipMatching) {
        this.skipMatching = skipMatching;
    }

    /**
     * <p>
     * (Optional) Indicates whether skip matching is enabled. If enabled (<code>true</code>), then Amazon EC2 Auto
     * Scaling skips replacing instances that match the desired configuration. If no desired configuration is specified,
     * then it skips replacing instances that have the same launch template and instance types that the Auto Scaling
     * group was using before the start of the instance refresh. The default is <code>false</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-refresh-skip-matching.html">Use an
     * instance refresh with skip matching</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return (Optional) Indicates whether skip matching is enabled. If enabled (<code>true</code>), then Amazon EC2
     *         Auto Scaling skips replacing instances that match the desired configuration. If no desired configuration
     *         is specified, then it skips replacing instances that have the same launch template and instance types
     *         that the Auto Scaling group was using before the start of the instance refresh. The default is
     *         <code>false</code>.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-refresh-skip-matching.html">Use
     *         an instance refresh with skip matching</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public Boolean getSkipMatching() {
        return this.skipMatching;
    }

    /**
     * <p>
     * (Optional) Indicates whether skip matching is enabled. If enabled (<code>true</code>), then Amazon EC2 Auto
     * Scaling skips replacing instances that match the desired configuration. If no desired configuration is specified,
     * then it skips replacing instances that have the same launch template and instance types that the Auto Scaling
     * group was using before the start of the instance refresh. The default is <code>false</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-refresh-skip-matching.html">Use an
     * instance refresh with skip matching</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param skipMatching
     *        (Optional) Indicates whether skip matching is enabled. If enabled (<code>true</code>), then Amazon EC2
     *        Auto Scaling skips replacing instances that match the desired configuration. If no desired configuration
     *        is specified, then it skips replacing instances that have the same launch template and instance types that
     *        the Auto Scaling group was using before the start of the instance refresh. The default is
     *        <code>false</code>.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-refresh-skip-matching.html">Use
     *        an instance refresh with skip matching</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RefreshPreferences withSkipMatching(Boolean skipMatching) {
        setSkipMatching(skipMatching);
        return this;
    }

    /**
     * <p>
     * (Optional) Indicates whether skip matching is enabled. If enabled (<code>true</code>), then Amazon EC2 Auto
     * Scaling skips replacing instances that match the desired configuration. If no desired configuration is specified,
     * then it skips replacing instances that have the same launch template and instance types that the Auto Scaling
     * group was using before the start of the instance refresh. The default is <code>false</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-refresh-skip-matching.html">Use an
     * instance refresh with skip matching</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return (Optional) Indicates whether skip matching is enabled. If enabled (<code>true</code>), then Amazon EC2
     *         Auto Scaling skips replacing instances that match the desired configuration. If no desired configuration
     *         is specified, then it skips replacing instances that have the same launch template and instance types
     *         that the Auto Scaling group was using before the start of the instance refresh. The default is
     *         <code>false</code>.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-refresh-skip-matching.html">Use
     *         an instance refresh with skip matching</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public Boolean isSkipMatching() {
        return this.skipMatching;
    }

    /**
     * <p>
     * (Optional) Indicates whether to roll back the Auto Scaling group to its previous configuration if the instance
     * refresh fails or a CloudWatch alarm threshold is met. The default is <code>false</code>.
     * </p>
     * <p>
     * A rollback is not supported in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * There is no desired configuration specified for the instance refresh.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Auto Scaling group has a launch template that uses an Amazon Web Services Systems Manager parameter instead
     * of an AMI ID for the <code>ImageId</code> property.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Auto Scaling group uses the launch template's <code>$Latest</code> or <code>$Default</code> version.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/instance-refresh-rollback.html">Undo changes with a
     * rollback</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param autoRollback
     *        (Optional) Indicates whether to roll back the Auto Scaling group to its previous configuration if the
     *        instance refresh fails or a CloudWatch alarm threshold is met. The default is <code>false</code>.</p>
     *        <p>
     *        A rollback is not supported in the following situations:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        There is no desired configuration specified for the instance refresh.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The Auto Scaling group has a launch template that uses an Amazon Web Services Systems Manager parameter
     *        instead of an AMI ID for the <code>ImageId</code> property.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The Auto Scaling group uses the launch template's <code>$Latest</code> or <code>$Default</code> version.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/instance-refresh-rollback.html">Undo changes
     *        with a rollback</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public void setAutoRollback(Boolean autoRollback) {
        this.autoRollback = autoRollback;
    }

    /**
     * <p>
     * (Optional) Indicates whether to roll back the Auto Scaling group to its previous configuration if the instance
     * refresh fails or a CloudWatch alarm threshold is met. The default is <code>false</code>.
     * </p>
     * <p>
     * A rollback is not supported in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * There is no desired configuration specified for the instance refresh.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Auto Scaling group has a launch template that uses an Amazon Web Services Systems Manager parameter instead
     * of an AMI ID for the <code>ImageId</code> property.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Auto Scaling group uses the launch template's <code>$Latest</code> or <code>$Default</code> version.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/instance-refresh-rollback.html">Undo changes with a
     * rollback</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return (Optional) Indicates whether to roll back the Auto Scaling group to its previous configuration if the
     *         instance refresh fails or a CloudWatch alarm threshold is met. The default is <code>false</code>.</p>
     *         <p>
     *         A rollback is not supported in the following situations:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         There is no desired configuration specified for the instance refresh.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The Auto Scaling group has a launch template that uses an Amazon Web Services Systems Manager parameter
     *         instead of an AMI ID for the <code>ImageId</code> property.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The Auto Scaling group uses the launch template's <code>$Latest</code> or <code>$Default</code> version.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/instance-refresh-rollback.html">Undo changes
     *         with a rollback</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public Boolean getAutoRollback() {
        return this.autoRollback;
    }

    /**
     * <p>
     * (Optional) Indicates whether to roll back the Auto Scaling group to its previous configuration if the instance
     * refresh fails or a CloudWatch alarm threshold is met. The default is <code>false</code>.
     * </p>
     * <p>
     * A rollback is not supported in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * There is no desired configuration specified for the instance refresh.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Auto Scaling group has a launch template that uses an Amazon Web Services Systems Manager parameter instead
     * of an AMI ID for the <code>ImageId</code> property.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Auto Scaling group uses the launch template's <code>$Latest</code> or <code>$Default</code> version.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/instance-refresh-rollback.html">Undo changes with a
     * rollback</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param autoRollback
     *        (Optional) Indicates whether to roll back the Auto Scaling group to its previous configuration if the
     *        instance refresh fails or a CloudWatch alarm threshold is met. The default is <code>false</code>.</p>
     *        <p>
     *        A rollback is not supported in the following situations:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        There is no desired configuration specified for the instance refresh.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The Auto Scaling group has a launch template that uses an Amazon Web Services Systems Manager parameter
     *        instead of an AMI ID for the <code>ImageId</code> property.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The Auto Scaling group uses the launch template's <code>$Latest</code> or <code>$Default</code> version.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/instance-refresh-rollback.html">Undo changes
     *        with a rollback</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RefreshPreferences withAutoRollback(Boolean autoRollback) {
        setAutoRollback(autoRollback);
        return this;
    }

    /**
     * <p>
     * (Optional) Indicates whether to roll back the Auto Scaling group to its previous configuration if the instance
     * refresh fails or a CloudWatch alarm threshold is met. The default is <code>false</code>.
     * </p>
     * <p>
     * A rollback is not supported in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * There is no desired configuration specified for the instance refresh.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Auto Scaling group has a launch template that uses an Amazon Web Services Systems Manager parameter instead
     * of an AMI ID for the <code>ImageId</code> property.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Auto Scaling group uses the launch template's <code>$Latest</code> or <code>$Default</code> version.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/instance-refresh-rollback.html">Undo changes with a
     * rollback</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return (Optional) Indicates whether to roll back the Auto Scaling group to its previous configuration if the
     *         instance refresh fails or a CloudWatch alarm threshold is met. The default is <code>false</code>.</p>
     *         <p>
     *         A rollback is not supported in the following situations:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         There is no desired configuration specified for the instance refresh.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The Auto Scaling group has a launch template that uses an Amazon Web Services Systems Manager parameter
     *         instead of an AMI ID for the <code>ImageId</code> property.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The Auto Scaling group uses the launch template's <code>$Latest</code> or <code>$Default</code> version.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/instance-refresh-rollback.html">Undo changes
     *         with a rollback</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public Boolean isAutoRollback() {
        return this.autoRollback;
    }

    /**
     * <p>
     * Choose the behavior that you want Amazon EC2 Auto Scaling to use if instances protected from scale in are found.
     * </p>
     * <p>
     * The following lists the valid values:
     * </p>
     * <dl>
     * <dt>Refresh</dt>
     * <dd>
     * <p>
     * Amazon EC2 Auto Scaling replaces instances that are protected from scale in.
     * </p>
     * </dd>
     * <dt>Ignore</dt>
     * <dd>
     * <p>
     * Amazon EC2 Auto Scaling ignores instances that are protected from scale in and continues to replace instances
     * that are not protected.
     * </p>
     * </dd>
     * <dt>Wait (default)</dt>
     * <dd>
     * <p>
     * Amazon EC2 Auto Scaling waits one hour for you to remove scale-in protection. Otherwise, the instance refresh
     * will fail.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param scaleInProtectedInstances
     *        Choose the behavior that you want Amazon EC2 Auto Scaling to use if instances protected from scale in are
     *        found. </p>
     *        <p>
     *        The following lists the valid values:
     *        </p>
     *        <dl>
     *        <dt>Refresh</dt>
     *        <dd>
     *        <p>
     *        Amazon EC2 Auto Scaling replaces instances that are protected from scale in.
     *        </p>
     *        </dd>
     *        <dt>Ignore</dt>
     *        <dd>
     *        <p>
     *        Amazon EC2 Auto Scaling ignores instances that are protected from scale in and continues to replace
     *        instances that are not protected.
     *        </p>
     *        </dd>
     *        <dt>Wait (default)</dt>
     *        <dd>
     *        <p>
     *        Amazon EC2 Auto Scaling waits one hour for you to remove scale-in protection. Otherwise, the instance
     *        refresh will fail.
     *        </p>
     *        </dd>
     * @see ScaleInProtectedInstances
     */

    public void setScaleInProtectedInstances(String scaleInProtectedInstances) {
        this.scaleInProtectedInstances = scaleInProtectedInstances;
    }

    /**
     * <p>
     * Choose the behavior that you want Amazon EC2 Auto Scaling to use if instances protected from scale in are found.
     * </p>
     * <p>
     * The following lists the valid values:
     * </p>
     * <dl>
     * <dt>Refresh</dt>
     * <dd>
     * <p>
     * Amazon EC2 Auto Scaling replaces instances that are protected from scale in.
     * </p>
     * </dd>
     * <dt>Ignore</dt>
     * <dd>
     * <p>
     * Amazon EC2 Auto Scaling ignores instances that are protected from scale in and continues to replace instances
     * that are not protected.
     * </p>
     * </dd>
     * <dt>Wait (default)</dt>
     * <dd>
     * <p>
     * Amazon EC2 Auto Scaling waits one hour for you to remove scale-in protection. Otherwise, the instance refresh
     * will fail.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return Choose the behavior that you want Amazon EC2 Auto Scaling to use if instances protected from scale in are
     *         found. </p>
     *         <p>
     *         The following lists the valid values:
     *         </p>
     *         <dl>
     *         <dt>Refresh</dt>
     *         <dd>
     *         <p>
     *         Amazon EC2 Auto Scaling replaces instances that are protected from scale in.
     *         </p>
     *         </dd>
     *         <dt>Ignore</dt>
     *         <dd>
     *         <p>
     *         Amazon EC2 Auto Scaling ignores instances that are protected from scale in and continues to replace
     *         instances that are not protected.
     *         </p>
     *         </dd>
     *         <dt>Wait (default)</dt>
     *         <dd>
     *         <p>
     *         Amazon EC2 Auto Scaling waits one hour for you to remove scale-in protection. Otherwise, the instance
     *         refresh will fail.
     *         </p>
     *         </dd>
     * @see ScaleInProtectedInstances
     */

    public String getScaleInProtectedInstances() {
        return this.scaleInProtectedInstances;
    }

    /**
     * <p>
     * Choose the behavior that you want Amazon EC2 Auto Scaling to use if instances protected from scale in are found.
     * </p>
     * <p>
     * The following lists the valid values:
     * </p>
     * <dl>
     * <dt>Refresh</dt>
     * <dd>
     * <p>
     * Amazon EC2 Auto Scaling replaces instances that are protected from scale in.
     * </p>
     * </dd>
     * <dt>Ignore</dt>
     * <dd>
     * <p>
     * Amazon EC2 Auto Scaling ignores instances that are protected from scale in and continues to replace instances
     * that are not protected.
     * </p>
     * </dd>
     * <dt>Wait (default)</dt>
     * <dd>
     * <p>
     * Amazon EC2 Auto Scaling waits one hour for you to remove scale-in protection. Otherwise, the instance refresh
     * will fail.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param scaleInProtectedInstances
     *        Choose the behavior that you want Amazon EC2 Auto Scaling to use if instances protected from scale in are
     *        found. </p>
     *        <p>
     *        The following lists the valid values:
     *        </p>
     *        <dl>
     *        <dt>Refresh</dt>
     *        <dd>
     *        <p>
     *        Amazon EC2 Auto Scaling replaces instances that are protected from scale in.
     *        </p>
     *        </dd>
     *        <dt>Ignore</dt>
     *        <dd>
     *        <p>
     *        Amazon EC2 Auto Scaling ignores instances that are protected from scale in and continues to replace
     *        instances that are not protected.
     *        </p>
     *        </dd>
     *        <dt>Wait (default)</dt>
     *        <dd>
     *        <p>
     *        Amazon EC2 Auto Scaling waits one hour for you to remove scale-in protection. Otherwise, the instance
     *        refresh will fail.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScaleInProtectedInstances
     */

    public RefreshPreferences withScaleInProtectedInstances(String scaleInProtectedInstances) {
        setScaleInProtectedInstances(scaleInProtectedInstances);
        return this;
    }

    /**
     * <p>
     * Choose the behavior that you want Amazon EC2 Auto Scaling to use if instances protected from scale in are found.
     * </p>
     * <p>
     * The following lists the valid values:
     * </p>
     * <dl>
     * <dt>Refresh</dt>
     * <dd>
     * <p>
     * Amazon EC2 Auto Scaling replaces instances that are protected from scale in.
     * </p>
     * </dd>
     * <dt>Ignore</dt>
     * <dd>
     * <p>
     * Amazon EC2 Auto Scaling ignores instances that are protected from scale in and continues to replace instances
     * that are not protected.
     * </p>
     * </dd>
     * <dt>Wait (default)</dt>
     * <dd>
     * <p>
     * Amazon EC2 Auto Scaling waits one hour for you to remove scale-in protection. Otherwise, the instance refresh
     * will fail.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param scaleInProtectedInstances
     *        Choose the behavior that you want Amazon EC2 Auto Scaling to use if instances protected from scale in are
     *        found. </p>
     *        <p>
     *        The following lists the valid values:
     *        </p>
     *        <dl>
     *        <dt>Refresh</dt>
     *        <dd>
     *        <p>
     *        Amazon EC2 Auto Scaling replaces instances that are protected from scale in.
     *        </p>
     *        </dd>
     *        <dt>Ignore</dt>
     *        <dd>
     *        <p>
     *        Amazon EC2 Auto Scaling ignores instances that are protected from scale in and continues to replace
     *        instances that are not protected.
     *        </p>
     *        </dd>
     *        <dt>Wait (default)</dt>
     *        <dd>
     *        <p>
     *        Amazon EC2 Auto Scaling waits one hour for you to remove scale-in protection. Otherwise, the instance
     *        refresh will fail.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScaleInProtectedInstances
     */

    public RefreshPreferences withScaleInProtectedInstances(ScaleInProtectedInstances scaleInProtectedInstances) {
        this.scaleInProtectedInstances = scaleInProtectedInstances.toString();
        return this;
    }

    /**
     * <p>
     * Choose the behavior that you want Amazon EC2 Auto Scaling to use if instances in <code>Standby</code> state are
     * found.
     * </p>
     * <p>
     * The following lists the valid values:
     * </p>
     * <dl>
     * <dt>Terminate</dt>
     * <dd>
     * <p>
     * Amazon EC2 Auto Scaling terminates instances that are in <code>Standby</code>.
     * </p>
     * </dd>
     * <dt>Ignore</dt>
     * <dd>
     * <p>
     * Amazon EC2 Auto Scaling ignores instances that are in <code>Standby</code> and continues to replace instances
     * that are in the <code>InService</code> state.
     * </p>
     * </dd>
     * <dt>Wait (default)</dt>
     * <dd>
     * <p>
     * Amazon EC2 Auto Scaling waits one hour for you to return the instances to service. Otherwise, the instance
     * refresh will fail.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param standbyInstances
     *        Choose the behavior that you want Amazon EC2 Auto Scaling to use if instances in <code>Standby</code>
     *        state are found.</p>
     *        <p>
     *        The following lists the valid values:
     *        </p>
     *        <dl>
     *        <dt>Terminate</dt>
     *        <dd>
     *        <p>
     *        Amazon EC2 Auto Scaling terminates instances that are in <code>Standby</code>.
     *        </p>
     *        </dd>
     *        <dt>Ignore</dt>
     *        <dd>
     *        <p>
     *        Amazon EC2 Auto Scaling ignores instances that are in <code>Standby</code> and continues to replace
     *        instances that are in the <code>InService</code> state.
     *        </p>
     *        </dd>
     *        <dt>Wait (default)</dt>
     *        <dd>
     *        <p>
     *        Amazon EC2 Auto Scaling waits one hour for you to return the instances to service. Otherwise, the instance
     *        refresh will fail.
     *        </p>
     *        </dd>
     * @see StandbyInstances
     */

    public void setStandbyInstances(String standbyInstances) {
        this.standbyInstances = standbyInstances;
    }

    /**
     * <p>
     * Choose the behavior that you want Amazon EC2 Auto Scaling to use if instances in <code>Standby</code> state are
     * found.
     * </p>
     * <p>
     * The following lists the valid values:
     * </p>
     * <dl>
     * <dt>Terminate</dt>
     * <dd>
     * <p>
     * Amazon EC2 Auto Scaling terminates instances that are in <code>Standby</code>.
     * </p>
     * </dd>
     * <dt>Ignore</dt>
     * <dd>
     * <p>
     * Amazon EC2 Auto Scaling ignores instances that are in <code>Standby</code> and continues to replace instances
     * that are in the <code>InService</code> state.
     * </p>
     * </dd>
     * <dt>Wait (default)</dt>
     * <dd>
     * <p>
     * Amazon EC2 Auto Scaling waits one hour for you to return the instances to service. Otherwise, the instance
     * refresh will fail.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return Choose the behavior that you want Amazon EC2 Auto Scaling to use if instances in <code>Standby</code>
     *         state are found.</p>
     *         <p>
     *         The following lists the valid values:
     *         </p>
     *         <dl>
     *         <dt>Terminate</dt>
     *         <dd>
     *         <p>
     *         Amazon EC2 Auto Scaling terminates instances that are in <code>Standby</code>.
     *         </p>
     *         </dd>
     *         <dt>Ignore</dt>
     *         <dd>
     *         <p>
     *         Amazon EC2 Auto Scaling ignores instances that are in <code>Standby</code> and continues to replace
     *         instances that are in the <code>InService</code> state.
     *         </p>
     *         </dd>
     *         <dt>Wait (default)</dt>
     *         <dd>
     *         <p>
     *         Amazon EC2 Auto Scaling waits one hour for you to return the instances to service. Otherwise, the
     *         instance refresh will fail.
     *         </p>
     *         </dd>
     * @see StandbyInstances
     */

    public String getStandbyInstances() {
        return this.standbyInstances;
    }

    /**
     * <p>
     * Choose the behavior that you want Amazon EC2 Auto Scaling to use if instances in <code>Standby</code> state are
     * found.
     * </p>
     * <p>
     * The following lists the valid values:
     * </p>
     * <dl>
     * <dt>Terminate</dt>
     * <dd>
     * <p>
     * Amazon EC2 Auto Scaling terminates instances that are in <code>Standby</code>.
     * </p>
     * </dd>
     * <dt>Ignore</dt>
     * <dd>
     * <p>
     * Amazon EC2 Auto Scaling ignores instances that are in <code>Standby</code> and continues to replace instances
     * that are in the <code>InService</code> state.
     * </p>
     * </dd>
     * <dt>Wait (default)</dt>
     * <dd>
     * <p>
     * Amazon EC2 Auto Scaling waits one hour for you to return the instances to service. Otherwise, the instance
     * refresh will fail.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param standbyInstances
     *        Choose the behavior that you want Amazon EC2 Auto Scaling to use if instances in <code>Standby</code>
     *        state are found.</p>
     *        <p>
     *        The following lists the valid values:
     *        </p>
     *        <dl>
     *        <dt>Terminate</dt>
     *        <dd>
     *        <p>
     *        Amazon EC2 Auto Scaling terminates instances that are in <code>Standby</code>.
     *        </p>
     *        </dd>
     *        <dt>Ignore</dt>
     *        <dd>
     *        <p>
     *        Amazon EC2 Auto Scaling ignores instances that are in <code>Standby</code> and continues to replace
     *        instances that are in the <code>InService</code> state.
     *        </p>
     *        </dd>
     *        <dt>Wait (default)</dt>
     *        <dd>
     *        <p>
     *        Amazon EC2 Auto Scaling waits one hour for you to return the instances to service. Otherwise, the instance
     *        refresh will fail.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StandbyInstances
     */

    public RefreshPreferences withStandbyInstances(String standbyInstances) {
        setStandbyInstances(standbyInstances);
        return this;
    }

    /**
     * <p>
     * Choose the behavior that you want Amazon EC2 Auto Scaling to use if instances in <code>Standby</code> state are
     * found.
     * </p>
     * <p>
     * The following lists the valid values:
     * </p>
     * <dl>
     * <dt>Terminate</dt>
     * <dd>
     * <p>
     * Amazon EC2 Auto Scaling terminates instances that are in <code>Standby</code>.
     * </p>
     * </dd>
     * <dt>Ignore</dt>
     * <dd>
     * <p>
     * Amazon EC2 Auto Scaling ignores instances that are in <code>Standby</code> and continues to replace instances
     * that are in the <code>InService</code> state.
     * </p>
     * </dd>
     * <dt>Wait (default)</dt>
     * <dd>
     * <p>
     * Amazon EC2 Auto Scaling waits one hour for you to return the instances to service. Otherwise, the instance
     * refresh will fail.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param standbyInstances
     *        Choose the behavior that you want Amazon EC2 Auto Scaling to use if instances in <code>Standby</code>
     *        state are found.</p>
     *        <p>
     *        The following lists the valid values:
     *        </p>
     *        <dl>
     *        <dt>Terminate</dt>
     *        <dd>
     *        <p>
     *        Amazon EC2 Auto Scaling terminates instances that are in <code>Standby</code>.
     *        </p>
     *        </dd>
     *        <dt>Ignore</dt>
     *        <dd>
     *        <p>
     *        Amazon EC2 Auto Scaling ignores instances that are in <code>Standby</code> and continues to replace
     *        instances that are in the <code>InService</code> state.
     *        </p>
     *        </dd>
     *        <dt>Wait (default)</dt>
     *        <dd>
     *        <p>
     *        Amazon EC2 Auto Scaling waits one hour for you to return the instances to service. Otherwise, the instance
     *        refresh will fail.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StandbyInstances
     */

    public RefreshPreferences withStandbyInstances(StandbyInstances standbyInstances) {
        this.standbyInstances = standbyInstances.toString();
        return this;
    }

    /**
     * <p>
     * (Optional) The CloudWatch alarm specification. CloudWatch alarms can be used to identify any issues and fail the
     * operation if an alarm threshold is met.
     * </p>
     * 
     * @param alarmSpecification
     *        (Optional) The CloudWatch alarm specification. CloudWatch alarms can be used to identify any issues and
     *        fail the operation if an alarm threshold is met.
     */

    public void setAlarmSpecification(AlarmSpecification alarmSpecification) {
        this.alarmSpecification = alarmSpecification;
    }

    /**
     * <p>
     * (Optional) The CloudWatch alarm specification. CloudWatch alarms can be used to identify any issues and fail the
     * operation if an alarm threshold is met.
     * </p>
     * 
     * @return (Optional) The CloudWatch alarm specification. CloudWatch alarms can be used to identify any issues and
     *         fail the operation if an alarm threshold is met.
     */

    public AlarmSpecification getAlarmSpecification() {
        return this.alarmSpecification;
    }

    /**
     * <p>
     * (Optional) The CloudWatch alarm specification. CloudWatch alarms can be used to identify any issues and fail the
     * operation if an alarm threshold is met.
     * </p>
     * 
     * @param alarmSpecification
     *        (Optional) The CloudWatch alarm specification. CloudWatch alarms can be used to identify any issues and
     *        fail the operation if an alarm threshold is met.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RefreshPreferences withAlarmSpecification(AlarmSpecification alarmSpecification) {
        setAlarmSpecification(alarmSpecification);
        return this;
    }

    /**
     * <p>
     * Specifies the maximum percentage of the group that can be in service and healthy, or pending, to support your
     * workload when replacing instances. The value is expressed as a percentage of the desired capacity of the Auto
     * Scaling group. Value range is 100 to 200.
     * </p>
     * <p>
     * If you specify <code>MaxHealthyPercentage</code>, you must also specify <code>MinHealthyPercentage</code>, and
     * the difference between them cannot be greater than 100. A larger range increases the number of instances that can
     * be replaced at the same time.
     * </p>
     * <p>
     * If you do not specify this property, the default is 100 percent, or the percentage set in the instance
     * maintenance policy for the Auto Scaling group, if defined.
     * </p>
     * 
     * @param maxHealthyPercentage
     *        Specifies the maximum percentage of the group that can be in service and healthy, or pending, to support
     *        your workload when replacing instances. The value is expressed as a percentage of the desired capacity of
     *        the Auto Scaling group. Value range is 100 to 200.</p>
     *        <p>
     *        If you specify <code>MaxHealthyPercentage</code>, you must also specify <code>MinHealthyPercentage</code>,
     *        and the difference between them cannot be greater than 100. A larger range increases the number of
     *        instances that can be replaced at the same time.
     *        </p>
     *        <p>
     *        If you do not specify this property, the default is 100 percent, or the percentage set in the instance
     *        maintenance policy for the Auto Scaling group, if defined.
     */

    public void setMaxHealthyPercentage(Integer maxHealthyPercentage) {
        this.maxHealthyPercentage = maxHealthyPercentage;
    }

    /**
     * <p>
     * Specifies the maximum percentage of the group that can be in service and healthy, or pending, to support your
     * workload when replacing instances. The value is expressed as a percentage of the desired capacity of the Auto
     * Scaling group. Value range is 100 to 200.
     * </p>
     * <p>
     * If you specify <code>MaxHealthyPercentage</code>, you must also specify <code>MinHealthyPercentage</code>, and
     * the difference between them cannot be greater than 100. A larger range increases the number of instances that can
     * be replaced at the same time.
     * </p>
     * <p>
     * If you do not specify this property, the default is 100 percent, or the percentage set in the instance
     * maintenance policy for the Auto Scaling group, if defined.
     * </p>
     * 
     * @return Specifies the maximum percentage of the group that can be in service and healthy, or pending, to support
     *         your workload when replacing instances. The value is expressed as a percentage of the desired capacity of
     *         the Auto Scaling group. Value range is 100 to 200.</p>
     *         <p>
     *         If you specify <code>MaxHealthyPercentage</code>, you must also specify <code>MinHealthyPercentage</code>
     *         , and the difference between them cannot be greater than 100. A larger range increases the number of
     *         instances that can be replaced at the same time.
     *         </p>
     *         <p>
     *         If you do not specify this property, the default is 100 percent, or the percentage set in the instance
     *         maintenance policy for the Auto Scaling group, if defined.
     */

    public Integer getMaxHealthyPercentage() {
        return this.maxHealthyPercentage;
    }

    /**
     * <p>
     * Specifies the maximum percentage of the group that can be in service and healthy, or pending, to support your
     * workload when replacing instances. The value is expressed as a percentage of the desired capacity of the Auto
     * Scaling group. Value range is 100 to 200.
     * </p>
     * <p>
     * If you specify <code>MaxHealthyPercentage</code>, you must also specify <code>MinHealthyPercentage</code>, and
     * the difference between them cannot be greater than 100. A larger range increases the number of instances that can
     * be replaced at the same time.
     * </p>
     * <p>
     * If you do not specify this property, the default is 100 percent, or the percentage set in the instance
     * maintenance policy for the Auto Scaling group, if defined.
     * </p>
     * 
     * @param maxHealthyPercentage
     *        Specifies the maximum percentage of the group that can be in service and healthy, or pending, to support
     *        your workload when replacing instances. The value is expressed as a percentage of the desired capacity of
     *        the Auto Scaling group. Value range is 100 to 200.</p>
     *        <p>
     *        If you specify <code>MaxHealthyPercentage</code>, you must also specify <code>MinHealthyPercentage</code>,
     *        and the difference between them cannot be greater than 100. A larger range increases the number of
     *        instances that can be replaced at the same time.
     *        </p>
     *        <p>
     *        If you do not specify this property, the default is 100 percent, or the percentage set in the instance
     *        maintenance policy for the Auto Scaling group, if defined.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RefreshPreferences withMaxHealthyPercentage(Integer maxHealthyPercentage) {
        setMaxHealthyPercentage(maxHealthyPercentage);
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
            sb.append("CheckpointDelay: ").append(getCheckpointDelay()).append(",");
        if (getSkipMatching() != null)
            sb.append("SkipMatching: ").append(getSkipMatching()).append(",");
        if (getAutoRollback() != null)
            sb.append("AutoRollback: ").append(getAutoRollback()).append(",");
        if (getScaleInProtectedInstances() != null)
            sb.append("ScaleInProtectedInstances: ").append(getScaleInProtectedInstances()).append(",");
        if (getStandbyInstances() != null)
            sb.append("StandbyInstances: ").append(getStandbyInstances()).append(",");
        if (getAlarmSpecification() != null)
            sb.append("AlarmSpecification: ").append(getAlarmSpecification()).append(",");
        if (getMaxHealthyPercentage() != null)
            sb.append("MaxHealthyPercentage: ").append(getMaxHealthyPercentage());
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
        if (other.getAutoRollback() == null ^ this.getAutoRollback() == null)
            return false;
        if (other.getAutoRollback() != null && other.getAutoRollback().equals(this.getAutoRollback()) == false)
            return false;
        if (other.getScaleInProtectedInstances() == null ^ this.getScaleInProtectedInstances() == null)
            return false;
        if (other.getScaleInProtectedInstances() != null && other.getScaleInProtectedInstances().equals(this.getScaleInProtectedInstances()) == false)
            return false;
        if (other.getStandbyInstances() == null ^ this.getStandbyInstances() == null)
            return false;
        if (other.getStandbyInstances() != null && other.getStandbyInstances().equals(this.getStandbyInstances()) == false)
            return false;
        if (other.getAlarmSpecification() == null ^ this.getAlarmSpecification() == null)
            return false;
        if (other.getAlarmSpecification() != null && other.getAlarmSpecification().equals(this.getAlarmSpecification()) == false)
            return false;
        if (other.getMaxHealthyPercentage() == null ^ this.getMaxHealthyPercentage() == null)
            return false;
        if (other.getMaxHealthyPercentage() != null && other.getMaxHealthyPercentage().equals(this.getMaxHealthyPercentage()) == false)
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
        hashCode = prime * hashCode + ((getAutoRollback() == null) ? 0 : getAutoRollback().hashCode());
        hashCode = prime * hashCode + ((getScaleInProtectedInstances() == null) ? 0 : getScaleInProtectedInstances().hashCode());
        hashCode = prime * hashCode + ((getStandbyInstances() == null) ? 0 : getStandbyInstances().hashCode());
        hashCode = prime * hashCode + ((getAlarmSpecification() == null) ? 0 : getAlarmSpecification().hashCode());
        hashCode = prime * hashCode + ((getMaxHealthyPercentage() == null) ? 0 : getMaxHealthyPercentage().hashCode());
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
