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
 * Describes a lifecycle hook, which tells Amazon EC2 Auto Scaling that you want to perform an action whenever it
 * launches instances or whenever it terminates instances. Used in response to <a>DescribeLifecycleHooks</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/LifecycleHook" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LifecycleHook implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the lifecycle hook.
     * </p>
     */
    private String lifecycleHookName;
    /**
     * <p>
     * The name of the Auto Scaling group for the lifecycle hook.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * The state of the EC2 instance to which to attach the lifecycle hook. The following are possible values:
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
     * The ARN of the target that Amazon EC2 Auto Scaling sends notifications to when an instance is in the transition
     * state for the lifecycle hook. The notification target can be either an SQS queue or an SNS topic.
     * </p>
     */
    private String notificationTargetARN;
    /**
     * <p>
     * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target.
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * Additional information that is included any time Amazon EC2 Auto Scaling sends a message to the notification
     * target.
     * </p>
     */
    private String notificationMetadata;
    /**
     * <p>
     * The maximum time, in seconds, that can elapse before the lifecycle hook times out. If the lifecycle hook times
     * out, Amazon EC2 Auto Scaling performs the action that you specified in the <code>DefaultResult</code> parameter.
     * </p>
     */
    private Integer heartbeatTimeout;
    /**
     * <p>
     * The maximum time, in seconds, that an instance can remain in a <code>Pending:Wait</code> or
     * <code>Terminating:Wait</code> state. The maximum is 172800 seconds (48 hours) or 100 times
     * <code>HeartbeatTimeout</code>, whichever is smaller.
     * </p>
     */
    private Integer globalTimeout;
    /**
     * <p>
     * Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an unexpected
     * failure occurs. The possible values are <code>CONTINUE</code> and <code>ABANDON</code>.
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

    public LifecycleHook withLifecycleHookName(String lifecycleHookName) {
        setLifecycleHookName(lifecycleHookName);
        return this;
    }

    /**
     * <p>
     * The name of the Auto Scaling group for the lifecycle hook.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group for the lifecycle hook.
     */

    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group for the lifecycle hook.
     * </p>
     * 
     * @return The name of the Auto Scaling group for the lifecycle hook.
     */

    public String getAutoScalingGroupName() {
        return this.autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group for the lifecycle hook.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group for the lifecycle hook.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleHook withAutoScalingGroupName(String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * The state of the EC2 instance to which to attach the lifecycle hook. The following are possible values:
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
     *        The state of the EC2 instance to which to attach the lifecycle hook. The following are possible
     *        values:</p>
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
     * The state of the EC2 instance to which to attach the lifecycle hook. The following are possible values:
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
     * @return The state of the EC2 instance to which to attach the lifecycle hook. The following are possible
     *         values:</p>
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
     * The state of the EC2 instance to which to attach the lifecycle hook. The following are possible values:
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
     *        The state of the EC2 instance to which to attach the lifecycle hook. The following are possible
     *        values:</p>
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

    public LifecycleHook withLifecycleTransition(String lifecycleTransition) {
        setLifecycleTransition(lifecycleTransition);
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

    public LifecycleHook withNotificationTargetARN(String notificationTargetARN) {
        setNotificationTargetARN(notificationTargetARN);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target.
     * </p>
     * 
     * @param roleARN
     *        The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification
     *        target.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target.
     * </p>
     * 
     * @return The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification
     *         target.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target.
     * </p>
     * 
     * @param roleARN
     *        The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification
     *        target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleHook withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * Additional information that is included any time Amazon EC2 Auto Scaling sends a message to the notification
     * target.
     * </p>
     * 
     * @param notificationMetadata
     *        Additional information that is included any time Amazon EC2 Auto Scaling sends a message to the
     *        notification target.
     */

    public void setNotificationMetadata(String notificationMetadata) {
        this.notificationMetadata = notificationMetadata;
    }

    /**
     * <p>
     * Additional information that is included any time Amazon EC2 Auto Scaling sends a message to the notification
     * target.
     * </p>
     * 
     * @return Additional information that is included any time Amazon EC2 Auto Scaling sends a message to the
     *         notification target.
     */

    public String getNotificationMetadata() {
        return this.notificationMetadata;
    }

    /**
     * <p>
     * Additional information that is included any time Amazon EC2 Auto Scaling sends a message to the notification
     * target.
     * </p>
     * 
     * @param notificationMetadata
     *        Additional information that is included any time Amazon EC2 Auto Scaling sends a message to the
     *        notification target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleHook withNotificationMetadata(String notificationMetadata) {
        setNotificationMetadata(notificationMetadata);
        return this;
    }

    /**
     * <p>
     * The maximum time, in seconds, that can elapse before the lifecycle hook times out. If the lifecycle hook times
     * out, Amazon EC2 Auto Scaling performs the action that you specified in the <code>DefaultResult</code> parameter.
     * </p>
     * 
     * @param heartbeatTimeout
     *        The maximum time, in seconds, that can elapse before the lifecycle hook times out. If the lifecycle hook
     *        times out, Amazon EC2 Auto Scaling performs the action that you specified in the
     *        <code>DefaultResult</code> parameter.
     */

    public void setHeartbeatTimeout(Integer heartbeatTimeout) {
        this.heartbeatTimeout = heartbeatTimeout;
    }

    /**
     * <p>
     * The maximum time, in seconds, that can elapse before the lifecycle hook times out. If the lifecycle hook times
     * out, Amazon EC2 Auto Scaling performs the action that you specified in the <code>DefaultResult</code> parameter.
     * </p>
     * 
     * @return The maximum time, in seconds, that can elapse before the lifecycle hook times out. If the lifecycle hook
     *         times out, Amazon EC2 Auto Scaling performs the action that you specified in the
     *         <code>DefaultResult</code> parameter.
     */

    public Integer getHeartbeatTimeout() {
        return this.heartbeatTimeout;
    }

    /**
     * <p>
     * The maximum time, in seconds, that can elapse before the lifecycle hook times out. If the lifecycle hook times
     * out, Amazon EC2 Auto Scaling performs the action that you specified in the <code>DefaultResult</code> parameter.
     * </p>
     * 
     * @param heartbeatTimeout
     *        The maximum time, in seconds, that can elapse before the lifecycle hook times out. If the lifecycle hook
     *        times out, Amazon EC2 Auto Scaling performs the action that you specified in the
     *        <code>DefaultResult</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleHook withHeartbeatTimeout(Integer heartbeatTimeout) {
        setHeartbeatTimeout(heartbeatTimeout);
        return this;
    }

    /**
     * <p>
     * The maximum time, in seconds, that an instance can remain in a <code>Pending:Wait</code> or
     * <code>Terminating:Wait</code> state. The maximum is 172800 seconds (48 hours) or 100 times
     * <code>HeartbeatTimeout</code>, whichever is smaller.
     * </p>
     * 
     * @param globalTimeout
     *        The maximum time, in seconds, that an instance can remain in a <code>Pending:Wait</code> or
     *        <code>Terminating:Wait</code> state. The maximum is 172800 seconds (48 hours) or 100 times
     *        <code>HeartbeatTimeout</code>, whichever is smaller.
     */

    public void setGlobalTimeout(Integer globalTimeout) {
        this.globalTimeout = globalTimeout;
    }

    /**
     * <p>
     * The maximum time, in seconds, that an instance can remain in a <code>Pending:Wait</code> or
     * <code>Terminating:Wait</code> state. The maximum is 172800 seconds (48 hours) or 100 times
     * <code>HeartbeatTimeout</code>, whichever is smaller.
     * </p>
     * 
     * @return The maximum time, in seconds, that an instance can remain in a <code>Pending:Wait</code> or
     *         <code>Terminating:Wait</code> state. The maximum is 172800 seconds (48 hours) or 100 times
     *         <code>HeartbeatTimeout</code>, whichever is smaller.
     */

    public Integer getGlobalTimeout() {
        return this.globalTimeout;
    }

    /**
     * <p>
     * The maximum time, in seconds, that an instance can remain in a <code>Pending:Wait</code> or
     * <code>Terminating:Wait</code> state. The maximum is 172800 seconds (48 hours) or 100 times
     * <code>HeartbeatTimeout</code>, whichever is smaller.
     * </p>
     * 
     * @param globalTimeout
     *        The maximum time, in seconds, that an instance can remain in a <code>Pending:Wait</code> or
     *        <code>Terminating:Wait</code> state. The maximum is 172800 seconds (48 hours) or 100 times
     *        <code>HeartbeatTimeout</code>, whichever is smaller.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleHook withGlobalTimeout(Integer globalTimeout) {
        setGlobalTimeout(globalTimeout);
        return this;
    }

    /**
     * <p>
     * Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an unexpected
     * failure occurs. The possible values are <code>CONTINUE</code> and <code>ABANDON</code>.
     * </p>
     * 
     * @param defaultResult
     *        Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an
     *        unexpected failure occurs. The possible values are <code>CONTINUE</code> and <code>ABANDON</code>.
     */

    public void setDefaultResult(String defaultResult) {
        this.defaultResult = defaultResult;
    }

    /**
     * <p>
     * Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an unexpected
     * failure occurs. The possible values are <code>CONTINUE</code> and <code>ABANDON</code>.
     * </p>
     * 
     * @return Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an
     *         unexpected failure occurs. The possible values are <code>CONTINUE</code> and <code>ABANDON</code>.
     */

    public String getDefaultResult() {
        return this.defaultResult;
    }

    /**
     * <p>
     * Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an unexpected
     * failure occurs. The possible values are <code>CONTINUE</code> and <code>ABANDON</code>.
     * </p>
     * 
     * @param defaultResult
     *        Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an
     *        unexpected failure occurs. The possible values are <code>CONTINUE</code> and <code>ABANDON</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleHook withDefaultResult(String defaultResult) {
        setDefaultResult(defaultResult);
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
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: ").append(getAutoScalingGroupName()).append(",");
        if (getLifecycleTransition() != null)
            sb.append("LifecycleTransition: ").append(getLifecycleTransition()).append(",");
        if (getNotificationTargetARN() != null)
            sb.append("NotificationTargetARN: ").append(getNotificationTargetARN()).append(",");
        if (getRoleARN() != null)
            sb.append("RoleARN: ").append(getRoleARN()).append(",");
        if (getNotificationMetadata() != null)
            sb.append("NotificationMetadata: ").append(getNotificationMetadata()).append(",");
        if (getHeartbeatTimeout() != null)
            sb.append("HeartbeatTimeout: ").append(getHeartbeatTimeout()).append(",");
        if (getGlobalTimeout() != null)
            sb.append("GlobalTimeout: ").append(getGlobalTimeout()).append(",");
        if (getDefaultResult() != null)
            sb.append("DefaultResult: ").append(getDefaultResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifecycleHook == false)
            return false;
        LifecycleHook other = (LifecycleHook) obj;
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
        if (other.getNotificationTargetARN() == null ^ this.getNotificationTargetARN() == null)
            return false;
        if (other.getNotificationTargetARN() != null && other.getNotificationTargetARN().equals(this.getNotificationTargetARN()) == false)
            return false;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getNotificationMetadata() == null ^ this.getNotificationMetadata() == null)
            return false;
        if (other.getNotificationMetadata() != null && other.getNotificationMetadata().equals(this.getNotificationMetadata()) == false)
            return false;
        if (other.getHeartbeatTimeout() == null ^ this.getHeartbeatTimeout() == null)
            return false;
        if (other.getHeartbeatTimeout() != null && other.getHeartbeatTimeout().equals(this.getHeartbeatTimeout()) == false)
            return false;
        if (other.getGlobalTimeout() == null ^ this.getGlobalTimeout() == null)
            return false;
        if (other.getGlobalTimeout() != null && other.getGlobalTimeout().equals(this.getGlobalTimeout()) == false)
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
        hashCode = prime * hashCode + ((getNotificationTargetARN() == null) ? 0 : getNotificationTargetARN().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode + ((getNotificationMetadata() == null) ? 0 : getNotificationMetadata().hashCode());
        hashCode = prime * hashCode + ((getHeartbeatTimeout() == null) ? 0 : getHeartbeatTimeout().hashCode());
        hashCode = prime * hashCode + ((getGlobalTimeout() == null) ? 0 : getGlobalTimeout().hashCode());
        hashCode = prime * hashCode + ((getDefaultResult() == null) ? 0 : getDefaultResult().hashCode());
        return hashCode;
    }

    @Override
    public LifecycleHook clone() {
        try {
            return (LifecycleHook) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
