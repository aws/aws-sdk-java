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

/**
 * <p>
 * Describes a lifecycle hook. Used in combination with <a>CreateAutoScalingGroup</a>.
 * </p>
 * <p>
 * A lifecycle hook tells Amazon EC2 Auto Scaling to perform an action on an instance when the instance launches (before
 * it is put into service) or as the instance terminates (before it is fully terminated).
 * </p>
 * <p>
 * This step is a part of the procedure for creating a lifecycle hook for an Auto Scaling group:
 * </p>
 * <ol>
 * <li>
 * <p>
 * (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when
 * Amazon EC2 Auto Scaling launches or terminates instances.
 * </p>
 * </li>
 * <li>
 * <p>
 * (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an Amazon
 * SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.</b>
 * </p>
 * </li>
 * <li>
 * <p>
 * If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state using using
 * <a>RecordLifecycleActionHeartbeat</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you finish before the timeout period ends, complete the lifecycle action using <a>CompleteLifecycleAction</a>.
 * </p>
 * </li>
 * </ol>
 * <p>
 * For more information, see <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/lifecycle-hooks.html">Amazon
 * EC2 Auto Scaling Lifecycle Hooks</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
 * </p>
 * <p>
 * You can view the lifecycle hooks for an Auto Scaling group using <a>DescribeLifecycleHooks</a>. You can modify an
 * existing lifecycle hook or create new lifecycle hooks using <a>PutLifecycleHook</a>. If you are no longer using a
 * lifecycle hook, you can delete it using <a>DeleteLifecycleHook</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/LifecycleHookSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LifecycleHookSpecification implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the lifecycle hook.
     * </p>
     */
    private String lifecycleHookName;
    /**
     * <p>
     * The state of the EC2 instance to which you want to attach the lifecycle hook. The valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * autoscaling:EC2_INSTANCE_LAUNCHING
     * </p>
     * </li>
     * <li>
     * <p>
     * autoscaling:EC2_INSTANCE_TERMINATING
     * </p>
     * </li>
     * </ul>
     */
    private String lifecycleTransition;
    /**
     * <p>
     * Additional information that you want to include any time Amazon EC2 Auto Scaling sends a message to the
     * notification target.
     * </p>
     */
    private String notificationMetadata;
    /**
     * <p>
     * The maximum time, in seconds, that can elapse before the lifecycle hook times out.
     * </p>
     * <p>
     * If the lifecycle hook times out, Amazon EC2 Auto Scaling performs the action that you specified in the
     * <code>DefaultResult</code> parameter. You can prevent the lifecycle hook from timing out by calling
     * <a>RecordLifecycleActionHeartbeat</a>.
     * </p>
     */
    private Integer heartbeatTimeout;
    /**
     * <p>
     * Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an unexpected
     * failure occurs. The valid values are <code>CONTINUE</code> and <code>ABANDON</code>. The default value is
     * <code>ABANDON</code>.
     * </p>
     */
    private String defaultResult;
    /**
     * <p>
     * The ARN of the target that Amazon EC2 Auto Scaling sends notifications to when an instance is in the transition
     * state for the lifecycle hook. The notification target can be either an SQS queue or an SNS topic.
     * </p>
     */
    private String notificationTargetARN;
    /**
     * <p>
     * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target, for
     * example, an Amazon SNS topic or an Amazon SQS queue.
     * </p>
     */
    private String roleARN;

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

    public LifecycleHookSpecification withLifecycleHookName(String lifecycleHookName) {
        setLifecycleHookName(lifecycleHookName);
        return this;
    }

    /**
     * <p>
     * The state of the EC2 instance to which you want to attach the lifecycle hook. The valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * autoscaling:EC2_INSTANCE_LAUNCHING
     * </p>
     * </li>
     * <li>
     * <p>
     * autoscaling:EC2_INSTANCE_TERMINATING
     * </p>
     * </li>
     * </ul>
     * 
     * @param lifecycleTransition
     *        The state of the EC2 instance to which you want to attach the lifecycle hook. The valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        autoscaling:EC2_INSTANCE_LAUNCHING
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        autoscaling:EC2_INSTANCE_TERMINATING
     *        </p>
     *        </li>
     */

    public void setLifecycleTransition(String lifecycleTransition) {
        this.lifecycleTransition = lifecycleTransition;
    }

    /**
     * <p>
     * The state of the EC2 instance to which you want to attach the lifecycle hook. The valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * autoscaling:EC2_INSTANCE_LAUNCHING
     * </p>
     * </li>
     * <li>
     * <p>
     * autoscaling:EC2_INSTANCE_TERMINATING
     * </p>
     * </li>
     * </ul>
     * 
     * @return The state of the EC2 instance to which you want to attach the lifecycle hook. The valid values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         autoscaling:EC2_INSTANCE_LAUNCHING
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         autoscaling:EC2_INSTANCE_TERMINATING
     *         </p>
     *         </li>
     */

    public String getLifecycleTransition() {
        return this.lifecycleTransition;
    }

    /**
     * <p>
     * The state of the EC2 instance to which you want to attach the lifecycle hook. The valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * autoscaling:EC2_INSTANCE_LAUNCHING
     * </p>
     * </li>
     * <li>
     * <p>
     * autoscaling:EC2_INSTANCE_TERMINATING
     * </p>
     * </li>
     * </ul>
     * 
     * @param lifecycleTransition
     *        The state of the EC2 instance to which you want to attach the lifecycle hook. The valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        autoscaling:EC2_INSTANCE_LAUNCHING
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        autoscaling:EC2_INSTANCE_TERMINATING
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleHookSpecification withLifecycleTransition(String lifecycleTransition) {
        setLifecycleTransition(lifecycleTransition);
        return this;
    }

    /**
     * <p>
     * Additional information that you want to include any time Amazon EC2 Auto Scaling sends a message to the
     * notification target.
     * </p>
     * 
     * @param notificationMetadata
     *        Additional information that you want to include any time Amazon EC2 Auto Scaling sends a message to the
     *        notification target.
     */

    public void setNotificationMetadata(String notificationMetadata) {
        this.notificationMetadata = notificationMetadata;
    }

    /**
     * <p>
     * Additional information that you want to include any time Amazon EC2 Auto Scaling sends a message to the
     * notification target.
     * </p>
     * 
     * @return Additional information that you want to include any time Amazon EC2 Auto Scaling sends a message to the
     *         notification target.
     */

    public String getNotificationMetadata() {
        return this.notificationMetadata;
    }

    /**
     * <p>
     * Additional information that you want to include any time Amazon EC2 Auto Scaling sends a message to the
     * notification target.
     * </p>
     * 
     * @param notificationMetadata
     *        Additional information that you want to include any time Amazon EC2 Auto Scaling sends a message to the
     *        notification target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleHookSpecification withNotificationMetadata(String notificationMetadata) {
        setNotificationMetadata(notificationMetadata);
        return this;
    }

    /**
     * <p>
     * The maximum time, in seconds, that can elapse before the lifecycle hook times out.
     * </p>
     * <p>
     * If the lifecycle hook times out, Amazon EC2 Auto Scaling performs the action that you specified in the
     * <code>DefaultResult</code> parameter. You can prevent the lifecycle hook from timing out by calling
     * <a>RecordLifecycleActionHeartbeat</a>.
     * </p>
     * 
     * @param heartbeatTimeout
     *        The maximum time, in seconds, that can elapse before the lifecycle hook times out.</p>
     *        <p>
     *        If the lifecycle hook times out, Amazon EC2 Auto Scaling performs the action that you specified in the
     *        <code>DefaultResult</code> parameter. You can prevent the lifecycle hook from timing out by calling
     *        <a>RecordLifecycleActionHeartbeat</a>.
     */

    public void setHeartbeatTimeout(Integer heartbeatTimeout) {
        this.heartbeatTimeout = heartbeatTimeout;
    }

    /**
     * <p>
     * The maximum time, in seconds, that can elapse before the lifecycle hook times out.
     * </p>
     * <p>
     * If the lifecycle hook times out, Amazon EC2 Auto Scaling performs the action that you specified in the
     * <code>DefaultResult</code> parameter. You can prevent the lifecycle hook from timing out by calling
     * <a>RecordLifecycleActionHeartbeat</a>.
     * </p>
     * 
     * @return The maximum time, in seconds, that can elapse before the lifecycle hook times out.</p>
     *         <p>
     *         If the lifecycle hook times out, Amazon EC2 Auto Scaling performs the action that you specified in the
     *         <code>DefaultResult</code> parameter. You can prevent the lifecycle hook from timing out by calling
     *         <a>RecordLifecycleActionHeartbeat</a>.
     */

    public Integer getHeartbeatTimeout() {
        return this.heartbeatTimeout;
    }

    /**
     * <p>
     * The maximum time, in seconds, that can elapse before the lifecycle hook times out.
     * </p>
     * <p>
     * If the lifecycle hook times out, Amazon EC2 Auto Scaling performs the action that you specified in the
     * <code>DefaultResult</code> parameter. You can prevent the lifecycle hook from timing out by calling
     * <a>RecordLifecycleActionHeartbeat</a>.
     * </p>
     * 
     * @param heartbeatTimeout
     *        The maximum time, in seconds, that can elapse before the lifecycle hook times out.</p>
     *        <p>
     *        If the lifecycle hook times out, Amazon EC2 Auto Scaling performs the action that you specified in the
     *        <code>DefaultResult</code> parameter. You can prevent the lifecycle hook from timing out by calling
     *        <a>RecordLifecycleActionHeartbeat</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleHookSpecification withHeartbeatTimeout(Integer heartbeatTimeout) {
        setHeartbeatTimeout(heartbeatTimeout);
        return this;
    }

    /**
     * <p>
     * Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an unexpected
     * failure occurs. The valid values are <code>CONTINUE</code> and <code>ABANDON</code>. The default value is
     * <code>ABANDON</code>.
     * </p>
     * 
     * @param defaultResult
     *        Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an
     *        unexpected failure occurs. The valid values are <code>CONTINUE</code> and <code>ABANDON</code>. The
     *        default value is <code>ABANDON</code>.
     */

    public void setDefaultResult(String defaultResult) {
        this.defaultResult = defaultResult;
    }

    /**
     * <p>
     * Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an unexpected
     * failure occurs. The valid values are <code>CONTINUE</code> and <code>ABANDON</code>. The default value is
     * <code>ABANDON</code>.
     * </p>
     * 
     * @return Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an
     *         unexpected failure occurs. The valid values are <code>CONTINUE</code> and <code>ABANDON</code>. The
     *         default value is <code>ABANDON</code>.
     */

    public String getDefaultResult() {
        return this.defaultResult;
    }

    /**
     * <p>
     * Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an unexpected
     * failure occurs. The valid values are <code>CONTINUE</code> and <code>ABANDON</code>. The default value is
     * <code>ABANDON</code>.
     * </p>
     * 
     * @param defaultResult
     *        Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an
     *        unexpected failure occurs. The valid values are <code>CONTINUE</code> and <code>ABANDON</code>. The
     *        default value is <code>ABANDON</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleHookSpecification withDefaultResult(String defaultResult) {
        setDefaultResult(defaultResult);
        return this;
    }

    /**
     * <p>
     * The ARN of the target that Amazon EC2 Auto Scaling sends notifications to when an instance is in the transition
     * state for the lifecycle hook. The notification target can be either an SQS queue or an SNS topic.
     * </p>
     * 
     * @param notificationTargetARN
     *        The ARN of the target that Amazon EC2 Auto Scaling sends notifications to when an instance is in the
     *        transition state for the lifecycle hook. The notification target can be either an SQS queue or an SNS
     *        topic.
     */

    public void setNotificationTargetARN(String notificationTargetARN) {
        this.notificationTargetARN = notificationTargetARN;
    }

    /**
     * <p>
     * The ARN of the target that Amazon EC2 Auto Scaling sends notifications to when an instance is in the transition
     * state for the lifecycle hook. The notification target can be either an SQS queue or an SNS topic.
     * </p>
     * 
     * @return The ARN of the target that Amazon EC2 Auto Scaling sends notifications to when an instance is in the
     *         transition state for the lifecycle hook. The notification target can be either an SQS queue or an SNS
     *         topic.
     */

    public String getNotificationTargetARN() {
        return this.notificationTargetARN;
    }

    /**
     * <p>
     * The ARN of the target that Amazon EC2 Auto Scaling sends notifications to when an instance is in the transition
     * state for the lifecycle hook. The notification target can be either an SQS queue or an SNS topic.
     * </p>
     * 
     * @param notificationTargetARN
     *        The ARN of the target that Amazon EC2 Auto Scaling sends notifications to when an instance is in the
     *        transition state for the lifecycle hook. The notification target can be either an SQS queue or an SNS
     *        topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleHookSpecification withNotificationTargetARN(String notificationTargetARN) {
        setNotificationTargetARN(notificationTargetARN);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target, for
     * example, an Amazon SNS topic or an Amazon SQS queue.
     * </p>
     * 
     * @param roleARN
     *        The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification
     *        target, for example, an Amazon SNS topic or an Amazon SQS queue.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target, for
     * example, an Amazon SNS topic or an Amazon SQS queue.
     * </p>
     * 
     * @return The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification
     *         target, for example, an Amazon SNS topic or an Amazon SQS queue.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target, for
     * example, an Amazon SNS topic or an Amazon SQS queue.
     * </p>
     * 
     * @param roleARN
     *        The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification
     *        target, for example, an Amazon SNS topic or an Amazon SQS queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleHookSpecification withRoleARN(String roleARN) {
        setRoleARN(roleARN);
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
        if (getLifecycleHookName() != null)
            sb.append("LifecycleHookName: ").append(getLifecycleHookName()).append(",");
        if (getLifecycleTransition() != null)
            sb.append("LifecycleTransition: ").append(getLifecycleTransition()).append(",");
        if (getNotificationMetadata() != null)
            sb.append("NotificationMetadata: ").append(getNotificationMetadata()).append(",");
        if (getHeartbeatTimeout() != null)
            sb.append("HeartbeatTimeout: ").append(getHeartbeatTimeout()).append(",");
        if (getDefaultResult() != null)
            sb.append("DefaultResult: ").append(getDefaultResult()).append(",");
        if (getNotificationTargetARN() != null)
            sb.append("NotificationTargetARN: ").append(getNotificationTargetARN()).append(",");
        if (getRoleARN() != null)
            sb.append("RoleARN: ").append(getRoleARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifecycleHookSpecification == false)
            return false;
        LifecycleHookSpecification other = (LifecycleHookSpecification) obj;
        if (other.getLifecycleHookName() == null ^ this.getLifecycleHookName() == null)
            return false;
        if (other.getLifecycleHookName() != null && other.getLifecycleHookName().equals(this.getLifecycleHookName()) == false)
            return false;
        if (other.getLifecycleTransition() == null ^ this.getLifecycleTransition() == null)
            return false;
        if (other.getLifecycleTransition() != null && other.getLifecycleTransition().equals(this.getLifecycleTransition()) == false)
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
        if (other.getNotificationTargetARN() == null ^ this.getNotificationTargetARN() == null)
            return false;
        if (other.getNotificationTargetARN() != null && other.getNotificationTargetARN().equals(this.getNotificationTargetARN()) == false)
            return false;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLifecycleHookName() == null) ? 0 : getLifecycleHookName().hashCode());
        hashCode = prime * hashCode + ((getLifecycleTransition() == null) ? 0 : getLifecycleTransition().hashCode());
        hashCode = prime * hashCode + ((getNotificationMetadata() == null) ? 0 : getNotificationMetadata().hashCode());
        hashCode = prime * hashCode + ((getHeartbeatTimeout() == null) ? 0 : getHeartbeatTimeout().hashCode());
        hashCode = prime * hashCode + ((getDefaultResult() == null) ? 0 : getDefaultResult().hashCode());
        hashCode = prime * hashCode + ((getNotificationTargetARN() == null) ? 0 : getNotificationTargetARN().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        return hashCode;
    }

    @Override
    public LifecycleHookSpecification clone() {
        try {
            return (LifecycleHookSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
