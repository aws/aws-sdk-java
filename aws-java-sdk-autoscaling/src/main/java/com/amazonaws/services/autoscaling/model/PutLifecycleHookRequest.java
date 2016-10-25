/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the parameters for PutLifecycleHook.
 * </p>
 */
public class PutLifecycleHookRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the lifecycle hook.
     * </p>
     */
    private String lifecycleHookName;
    /**
     * <p>
     * The name of the Auto Scaling group to which you want to assign the lifecycle hook.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * The instance state to which you want to attach the lifecycle hook. For a list of lifecycle hook types, see
     * <a>DescribeLifecycleHookTypes</a>.
     * </p>
     * <p>
     * This parameter is required for new lifecycle hooks, but optional when updating existing hooks.
     * </p>
     */
    private String lifecycleTransition;
    /**
     * <p>
     * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target.
     * </p>
     * <p>
     * This parameter is required for new lifecycle hooks, but optional when updating existing hooks.
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * The ARN of the notification target that Auto Scaling will use to notify you when an instance is in the transition
     * state for the lifecycle hook. This target can be either an SQS queue or an SNS topic. If you specify an empty
     * string, this overrides the current ARN.
     * </p>
     * <p>
     * This operation uses the JSON format when sending notifications to an Amazon SQS queue, and an email key/value
     * pair format when sending notifications to an Amazon SNS topic.
     * </p>
     * <p>
     * When you specify a notification target, Auto Scaling sends it a test message. Test messages contains the
     * following additional key/value pair: <code>"Event": "autoscaling:TEST_NOTIFICATION"</code>.
     * </p>
     */
    private String notificationTargetARN;
    /**
     * <p>
     * Contains additional information that you want to include any time Auto Scaling sends a message to the
     * notification target.
     * </p>
     */
    private String notificationMetadata;
    /**
     * <p>
     * The amount of time, in seconds, that can elapse before the lifecycle hook times out. When the lifecycle hook
     * times out, Auto Scaling performs the default action. You can prevent the lifecycle hook from timing out by
     * calling <a>RecordLifecycleActionHeartbeat</a>. The default is 3600 seconds (1 hour).
     * </p>
     */
    private Integer heartbeatTimeout;
    /**
     * <p>
     * Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an unexpected
     * failure occurs. This parameter can be either <code>CONTINUE</code> or <code>ABANDON</code>. The default value is
     * <code>ABANDON</code>.
     * </p>
     */
    private String defaultResult;

    /**
     * <p>
     * The name of the lifecycle hook.
     * </p>
     * 
     * @param lifecycleHookName
     *        The name of the lifecycle hook.
     */

    public void setLifecycleHookName(String lifecycleHookName) {
        this.lifecycleHookName = lifecycleHookName;
    }

    /**
     * <p>
     * The name of the lifecycle hook.
     * </p>
     * 
     * @return The name of the lifecycle hook.
     */

    public String getLifecycleHookName() {
        return this.lifecycleHookName;
    }

    /**
     * <p>
     * The name of the lifecycle hook.
     * </p>
     * 
     * @param lifecycleHookName
     *        The name of the lifecycle hook.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLifecycleHookRequest withLifecycleHookName(String lifecycleHookName) {
        setLifecycleHookName(lifecycleHookName);
        return this;
    }

    /**
     * <p>
     * The name of the Auto Scaling group to which you want to assign the lifecycle hook.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group to which you want to assign the lifecycle hook.
     */

    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group to which you want to assign the lifecycle hook.
     * </p>
     * 
     * @return The name of the Auto Scaling group to which you want to assign the lifecycle hook.
     */

    public String getAutoScalingGroupName() {
        return this.autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group to which you want to assign the lifecycle hook.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group to which you want to assign the lifecycle hook.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLifecycleHookRequest withAutoScalingGroupName(String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * The instance state to which you want to attach the lifecycle hook. For a list of lifecycle hook types, see
     * <a>DescribeLifecycleHookTypes</a>.
     * </p>
     * <p>
     * This parameter is required for new lifecycle hooks, but optional when updating existing hooks.
     * </p>
     * 
     * @param lifecycleTransition
     *        The instance state to which you want to attach the lifecycle hook. For a list of lifecycle hook types, see
     *        <a>DescribeLifecycleHookTypes</a>.</p>
     *        <p>
     *        This parameter is required for new lifecycle hooks, but optional when updating existing hooks.
     */

    public void setLifecycleTransition(String lifecycleTransition) {
        this.lifecycleTransition = lifecycleTransition;
    }

    /**
     * <p>
     * The instance state to which you want to attach the lifecycle hook. For a list of lifecycle hook types, see
     * <a>DescribeLifecycleHookTypes</a>.
     * </p>
     * <p>
     * This parameter is required for new lifecycle hooks, but optional when updating existing hooks.
     * </p>
     * 
     * @return The instance state to which you want to attach the lifecycle hook. For a list of lifecycle hook types,
     *         see <a>DescribeLifecycleHookTypes</a>.</p>
     *         <p>
     *         This parameter is required for new lifecycle hooks, but optional when updating existing hooks.
     */

    public String getLifecycleTransition() {
        return this.lifecycleTransition;
    }

    /**
     * <p>
     * The instance state to which you want to attach the lifecycle hook. For a list of lifecycle hook types, see
     * <a>DescribeLifecycleHookTypes</a>.
     * </p>
     * <p>
     * This parameter is required for new lifecycle hooks, but optional when updating existing hooks.
     * </p>
     * 
     * @param lifecycleTransition
     *        The instance state to which you want to attach the lifecycle hook. For a list of lifecycle hook types, see
     *        <a>DescribeLifecycleHookTypes</a>.</p>
     *        <p>
     *        This parameter is required for new lifecycle hooks, but optional when updating existing hooks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLifecycleHookRequest withLifecycleTransition(String lifecycleTransition) {
        setLifecycleTransition(lifecycleTransition);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target.
     * </p>
     * <p>
     * This parameter is required for new lifecycle hooks, but optional when updating existing hooks.
     * </p>
     * 
     * @param roleARN
     *        The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification
     *        target.</p>
     *        <p>
     *        This parameter is required for new lifecycle hooks, but optional when updating existing hooks.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target.
     * </p>
     * <p>
     * This parameter is required for new lifecycle hooks, but optional when updating existing hooks.
     * </p>
     * 
     * @return The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification
     *         target.</p>
     *         <p>
     *         This parameter is required for new lifecycle hooks, but optional when updating existing hooks.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target.
     * </p>
     * <p>
     * This parameter is required for new lifecycle hooks, but optional when updating existing hooks.
     * </p>
     * 
     * @param roleARN
     *        The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification
     *        target.</p>
     *        <p>
     *        This parameter is required for new lifecycle hooks, but optional when updating existing hooks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLifecycleHookRequest withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * The ARN of the notification target that Auto Scaling will use to notify you when an instance is in the transition
     * state for the lifecycle hook. This target can be either an SQS queue or an SNS topic. If you specify an empty
     * string, this overrides the current ARN.
     * </p>
     * <p>
     * This operation uses the JSON format when sending notifications to an Amazon SQS queue, and an email key/value
     * pair format when sending notifications to an Amazon SNS topic.
     * </p>
     * <p>
     * When you specify a notification target, Auto Scaling sends it a test message. Test messages contains the
     * following additional key/value pair: <code>"Event": "autoscaling:TEST_NOTIFICATION"</code>.
     * </p>
     * 
     * @param notificationTargetARN
     *        The ARN of the notification target that Auto Scaling will use to notify you when an instance is in the
     *        transition state for the lifecycle hook. This target can be either an SQS queue or an SNS topic. If you
     *        specify an empty string, this overrides the current ARN.</p>
     *        <p>
     *        This operation uses the JSON format when sending notifications to an Amazon SQS queue, and an email
     *        key/value pair format when sending notifications to an Amazon SNS topic.
     *        </p>
     *        <p>
     *        When you specify a notification target, Auto Scaling sends it a test message. Test messages contains the
     *        following additional key/value pair: <code>"Event": "autoscaling:TEST_NOTIFICATION"</code>.
     */

    public void setNotificationTargetARN(String notificationTargetARN) {
        this.notificationTargetARN = notificationTargetARN;
    }

    /**
     * <p>
     * The ARN of the notification target that Auto Scaling will use to notify you when an instance is in the transition
     * state for the lifecycle hook. This target can be either an SQS queue or an SNS topic. If you specify an empty
     * string, this overrides the current ARN.
     * </p>
     * <p>
     * This operation uses the JSON format when sending notifications to an Amazon SQS queue, and an email key/value
     * pair format when sending notifications to an Amazon SNS topic.
     * </p>
     * <p>
     * When you specify a notification target, Auto Scaling sends it a test message. Test messages contains the
     * following additional key/value pair: <code>"Event": "autoscaling:TEST_NOTIFICATION"</code>.
     * </p>
     * 
     * @return The ARN of the notification target that Auto Scaling will use to notify you when an instance is in the
     *         transition state for the lifecycle hook. This target can be either an SQS queue or an SNS topic. If you
     *         specify an empty string, this overrides the current ARN.</p>
     *         <p>
     *         This operation uses the JSON format when sending notifications to an Amazon SQS queue, and an email
     *         key/value pair format when sending notifications to an Amazon SNS topic.
     *         </p>
     *         <p>
     *         When you specify a notification target, Auto Scaling sends it a test message. Test messages contains the
     *         following additional key/value pair: <code>"Event": "autoscaling:TEST_NOTIFICATION"</code>.
     */

    public String getNotificationTargetARN() {
        return this.notificationTargetARN;
    }

    /**
     * <p>
     * The ARN of the notification target that Auto Scaling will use to notify you when an instance is in the transition
     * state for the lifecycle hook. This target can be either an SQS queue or an SNS topic. If you specify an empty
     * string, this overrides the current ARN.
     * </p>
     * <p>
     * This operation uses the JSON format when sending notifications to an Amazon SQS queue, and an email key/value
     * pair format when sending notifications to an Amazon SNS topic.
     * </p>
     * <p>
     * When you specify a notification target, Auto Scaling sends it a test message. Test messages contains the
     * following additional key/value pair: <code>"Event": "autoscaling:TEST_NOTIFICATION"</code>.
     * </p>
     * 
     * @param notificationTargetARN
     *        The ARN of the notification target that Auto Scaling will use to notify you when an instance is in the
     *        transition state for the lifecycle hook. This target can be either an SQS queue or an SNS topic. If you
     *        specify an empty string, this overrides the current ARN.</p>
     *        <p>
     *        This operation uses the JSON format when sending notifications to an Amazon SQS queue, and an email
     *        key/value pair format when sending notifications to an Amazon SNS topic.
     *        </p>
     *        <p>
     *        When you specify a notification target, Auto Scaling sends it a test message. Test messages contains the
     *        following additional key/value pair: <code>"Event": "autoscaling:TEST_NOTIFICATION"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLifecycleHookRequest withNotificationTargetARN(String notificationTargetARN) {
        setNotificationTargetARN(notificationTargetARN);
        return this;
    }

    /**
     * <p>
     * Contains additional information that you want to include any time Auto Scaling sends a message to the
     * notification target.
     * </p>
     * 
     * @param notificationMetadata
     *        Contains additional information that you want to include any time Auto Scaling sends a message to the
     *        notification target.
     */

    public void setNotificationMetadata(String notificationMetadata) {
        this.notificationMetadata = notificationMetadata;
    }

    /**
     * <p>
     * Contains additional information that you want to include any time Auto Scaling sends a message to the
     * notification target.
     * </p>
     * 
     * @return Contains additional information that you want to include any time Auto Scaling sends a message to the
     *         notification target.
     */

    public String getNotificationMetadata() {
        return this.notificationMetadata;
    }

    /**
     * <p>
     * Contains additional information that you want to include any time Auto Scaling sends a message to the
     * notification target.
     * </p>
     * 
     * @param notificationMetadata
     *        Contains additional information that you want to include any time Auto Scaling sends a message to the
     *        notification target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLifecycleHookRequest withNotificationMetadata(String notificationMetadata) {
        setNotificationMetadata(notificationMetadata);
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, that can elapse before the lifecycle hook times out. When the lifecycle hook
     * times out, Auto Scaling performs the default action. You can prevent the lifecycle hook from timing out by
     * calling <a>RecordLifecycleActionHeartbeat</a>. The default is 3600 seconds (1 hour).
     * </p>
     * 
     * @param heartbeatTimeout
     *        The amount of time, in seconds, that can elapse before the lifecycle hook times out. When the lifecycle
     *        hook times out, Auto Scaling performs the default action. You can prevent the lifecycle hook from timing
     *        out by calling <a>RecordLifecycleActionHeartbeat</a>. The default is 3600 seconds (1 hour).
     */

    public void setHeartbeatTimeout(Integer heartbeatTimeout) {
        this.heartbeatTimeout = heartbeatTimeout;
    }

    /**
     * <p>
     * The amount of time, in seconds, that can elapse before the lifecycle hook times out. When the lifecycle hook
     * times out, Auto Scaling performs the default action. You can prevent the lifecycle hook from timing out by
     * calling <a>RecordLifecycleActionHeartbeat</a>. The default is 3600 seconds (1 hour).
     * </p>
     * 
     * @return The amount of time, in seconds, that can elapse before the lifecycle hook times out. When the lifecycle
     *         hook times out, Auto Scaling performs the default action. You can prevent the lifecycle hook from timing
     *         out by calling <a>RecordLifecycleActionHeartbeat</a>. The default is 3600 seconds (1 hour).
     */

    public Integer getHeartbeatTimeout() {
        return this.heartbeatTimeout;
    }

    /**
     * <p>
     * The amount of time, in seconds, that can elapse before the lifecycle hook times out. When the lifecycle hook
     * times out, Auto Scaling performs the default action. You can prevent the lifecycle hook from timing out by
     * calling <a>RecordLifecycleActionHeartbeat</a>. The default is 3600 seconds (1 hour).
     * </p>
     * 
     * @param heartbeatTimeout
     *        The amount of time, in seconds, that can elapse before the lifecycle hook times out. When the lifecycle
     *        hook times out, Auto Scaling performs the default action. You can prevent the lifecycle hook from timing
     *        out by calling <a>RecordLifecycleActionHeartbeat</a>. The default is 3600 seconds (1 hour).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLifecycleHookRequest withHeartbeatTimeout(Integer heartbeatTimeout) {
        setHeartbeatTimeout(heartbeatTimeout);
        return this;
    }

    /**
     * <p>
     * Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an unexpected
     * failure occurs. This parameter can be either <code>CONTINUE</code> or <code>ABANDON</code>. The default value is
     * <code>ABANDON</code>.
     * </p>
     * 
     * @param defaultResult
     *        Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an
     *        unexpected failure occurs. This parameter can be either <code>CONTINUE</code> or <code>ABANDON</code>. The
     *        default value is <code>ABANDON</code>.
     */

    public void setDefaultResult(String defaultResult) {
        this.defaultResult = defaultResult;
    }

    /**
     * <p>
     * Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an unexpected
     * failure occurs. This parameter can be either <code>CONTINUE</code> or <code>ABANDON</code>. The default value is
     * <code>ABANDON</code>.
     * </p>
     * 
     * @return Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an
     *         unexpected failure occurs. This parameter can be either <code>CONTINUE</code> or <code>ABANDON</code>.
     *         The default value is <code>ABANDON</code>.
     */

    public String getDefaultResult() {
        return this.defaultResult;
    }

    /**
     * <p>
     * Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an unexpected
     * failure occurs. This parameter can be either <code>CONTINUE</code> or <code>ABANDON</code>. The default value is
     * <code>ABANDON</code>.
     * </p>
     * 
     * @param defaultResult
     *        Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an
     *        unexpected failure occurs. This parameter can be either <code>CONTINUE</code> or <code>ABANDON</code>. The
     *        default value is <code>ABANDON</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLifecycleHookRequest withDefaultResult(String defaultResult) {
        setDefaultResult(defaultResult);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLifecycleHookName() != null)
            sb.append("LifecycleHookName: " + getLifecycleHookName() + ",");
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() + ",");
        if (getLifecycleTransition() != null)
            sb.append("LifecycleTransition: " + getLifecycleTransition() + ",");
        if (getRoleARN() != null)
            sb.append("RoleARN: " + getRoleARN() + ",");
        if (getNotificationTargetARN() != null)
            sb.append("NotificationTargetARN: " + getNotificationTargetARN() + ",");
        if (getNotificationMetadata() != null)
            sb.append("NotificationMetadata: " + getNotificationMetadata() + ",");
        if (getHeartbeatTimeout() != null)
            sb.append("HeartbeatTimeout: " + getHeartbeatTimeout() + ",");
        if (getDefaultResult() != null)
            sb.append("DefaultResult: " + getDefaultResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutLifecycleHookRequest == false)
            return false;
        PutLifecycleHookRequest other = (PutLifecycleHookRequest) obj;
        if (other.getLifecycleHookName() == null ^ this.getLifecycleHookName() == null)
            return false;
        if (other.getLifecycleHookName() != null && other.getLifecycleHookName().equals(this.getLifecycleHookName()) == false)
            return false;
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getLifecycleTransition() == null ^ this.getLifecycleTransition() == null)
            return false;
        if (other.getLifecycleTransition() != null && other.getLifecycleTransition().equals(this.getLifecycleTransition()) == false)
            return false;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getNotificationTargetARN() == null ^ this.getNotificationTargetARN() == null)
            return false;
        if (other.getNotificationTargetARN() != null && other.getNotificationTargetARN().equals(this.getNotificationTargetARN()) == false)
            return false;
        if (other.getNotificationMetadata() == null ^ this.getNotificationMetadata() == null)
            return false;
        if (other.getNotificationMetadata() != null && other.getNotificationMetadata().equals(this.getNotificationMetadata()) == false)
            return false;
        if (other.getHeartbeatTimeout() == null ^ this.getHeartbeatTimeout() == null)
            return false;
        if (other.getHeartbeatTimeout() != null && other.getHeartbeatTimeout().equals(this.getHeartbeatTimeout()) == false)
            return false;
        if (other.getDefaultResult() == null ^ this.getDefaultResult() == null)
            return false;
        if (other.getDefaultResult() != null && other.getDefaultResult().equals(this.getDefaultResult()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLifecycleHookName() == null) ? 0 : getLifecycleHookName().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getLifecycleTransition() == null) ? 0 : getLifecycleTransition().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode + ((getNotificationTargetARN() == null) ? 0 : getNotificationTargetARN().hashCode());
        hashCode = prime * hashCode + ((getNotificationMetadata() == null) ? 0 : getNotificationMetadata().hashCode());
        hashCode = prime * hashCode + ((getHeartbeatTimeout() == null) ? 0 : getHeartbeatTimeout().hashCode());
        hashCode = prime * hashCode + ((getDefaultResult() == null) ? 0 : getDefaultResult().hashCode());
        return hashCode;
    }

    @Override
    public PutLifecycleHookRequest clone() {
        return (PutLifecycleHookRequest) super.clone();
    }
}
