/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * A lifecycle hook tells Auto Scaling that you want to perform an
 * action when an instance launches or terminates. When you have a
 * lifecycle hook in place, the Auto Scaling group will either:
 * </p>
 * 
 * <ul>
 * <li> Pause the instance after it launches, but before it is put into
 * service </li>
 * <li> Pause the instance as it terminates, but before it is fully
 * terminated </li>
 * 
 * </ul>
 * <p>
 * To learn more, see
 * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingPendingState.html"> Auto Scaling Pending State </a> and <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingTerminatingState.html"> Auto Scaling Terminating State </a>
 * .
 * </p>
 */
public class LifecycleHook implements Serializable {

    /**
     * The name of the lifecycle action hook.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[A-Za-z0-9\-_\/]+<br/>
     */
    private String lifecycleHookName;

    /**
     * The name of the Auto Scaling group to which the lifecycle action
     * belongs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * The Amazon EC2 instance state to which you want to attach the
     * lifecycle hook. See <a>DescribeLifecycleHooks</a> for a list of
     * available lifecycle hook types.
     */
    private String lifecycleTransition;

    /**
     * The ARN of the notification target that Auto Scaling will use to
     * notify you when an instance is in the transition state for the
     * lifecycle hook. This ARN target can be either an SQS queue or an SNS
     * topic. The notification message sent to the target will include: <ul>
     * <li>Lifecycle action token</li> <li>User account ID</li> <li>Name of
     * the Auto Scaling group</li> <li>Lifecycle hook name</li> <li>EC2
     * instance ID</li> <li>Lifecycle transition</li> <li>Notification
     * metadata</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String notificationTargetARN;

    /**
     * The ARN of the Amazon IAM role that allows the Auto Scaling group to
     * publish to the specified notification target.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String roleARN;

    /**
     * Contains additional information that you want to include any time Auto
     * Scaling sends a message to the notification target.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1023<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String notificationMetadata;

    /**
     * Defines the amount of time that can elapse before the lifecycle hook
     * times out. When the lifecycle hook times out, Auto Scaling performs
     * the action defined in the <code>DefaultResult</code> parameter. You
     * can prevent the lifecycle hook from timing out by calling
     * <a>RecordLifecycleActionHeartbeat</a>.
     */
    private Integer heartbeatTimeout;

    /**
     * The maximum length of time an instance can remain in a
     * <code>Pending:Wait</code> or <code>Terminating:Wait</code> state.
     * Currently, this value is set at 48 hours.
     */
    private Integer globalTimeout;

    /**
     * Defines the action the Auto Scaling group should take when the
     * lifecycle hook timeout elapses or if an unexpected failure occurs. The
     * value for this parameter can be either <code>CONTINUE</code> or
     * <code>ABANDON</code>. The default value for this parameter is
     * <code>CONTINUE</code>.
     */
    private String defaultResult;

    /**
     * The name of the lifecycle action hook.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[A-Za-z0-9\-_\/]+<br/>
     *
     * @return The name of the lifecycle action hook.
     */
    public String getLifecycleHookName() {
        return lifecycleHookName;
    }
    
    /**
     * The name of the lifecycle action hook.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[A-Za-z0-9\-_\/]+<br/>
     *
     * @param lifecycleHookName The name of the lifecycle action hook.
     */
    public void setLifecycleHookName(String lifecycleHookName) {
        this.lifecycleHookName = lifecycleHookName;
    }
    
    /**
     * The name of the lifecycle action hook.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[A-Za-z0-9\-_\/]+<br/>
     *
     * @param lifecycleHookName The name of the lifecycle action hook.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LifecycleHook withLifecycleHookName(String lifecycleHookName) {
        this.lifecycleHookName = lifecycleHookName;
        return this;
    }

    /**
     * The name of the Auto Scaling group to which the lifecycle action
     * belongs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The name of the Auto Scaling group to which the lifecycle action
     *         belongs.
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }
    
    /**
     * The name of the Auto Scaling group to which the lifecycle action
     * belongs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the Auto Scaling group to which the lifecycle action
     *         belongs.
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }
    
    /**
     * The name of the Auto Scaling group to which the lifecycle action
     * belongs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the Auto Scaling group to which the lifecycle action
     *         belongs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LifecycleHook withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * The Amazon EC2 instance state to which you want to attach the
     * lifecycle hook. See <a>DescribeLifecycleHooks</a> for a list of
     * available lifecycle hook types.
     *
     * @return The Amazon EC2 instance state to which you want to attach the
     *         lifecycle hook. See <a>DescribeLifecycleHooks</a> for a list of
     *         available lifecycle hook types.
     */
    public String getLifecycleTransition() {
        return lifecycleTransition;
    }
    
    /**
     * The Amazon EC2 instance state to which you want to attach the
     * lifecycle hook. See <a>DescribeLifecycleHooks</a> for a list of
     * available lifecycle hook types.
     *
     * @param lifecycleTransition The Amazon EC2 instance state to which you want to attach the
     *         lifecycle hook. See <a>DescribeLifecycleHooks</a> for a list of
     *         available lifecycle hook types.
     */
    public void setLifecycleTransition(String lifecycleTransition) {
        this.lifecycleTransition = lifecycleTransition;
    }
    
    /**
     * The Amazon EC2 instance state to which you want to attach the
     * lifecycle hook. See <a>DescribeLifecycleHooks</a> for a list of
     * available lifecycle hook types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lifecycleTransition The Amazon EC2 instance state to which you want to attach the
     *         lifecycle hook. See <a>DescribeLifecycleHooks</a> for a list of
     *         available lifecycle hook types.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LifecycleHook withLifecycleTransition(String lifecycleTransition) {
        this.lifecycleTransition = lifecycleTransition;
        return this;
    }

    /**
     * The ARN of the notification target that Auto Scaling will use to
     * notify you when an instance is in the transition state for the
     * lifecycle hook. This ARN target can be either an SQS queue or an SNS
     * topic. The notification message sent to the target will include: <ul>
     * <li>Lifecycle action token</li> <li>User account ID</li> <li>Name of
     * the Auto Scaling group</li> <li>Lifecycle hook name</li> <li>EC2
     * instance ID</li> <li>Lifecycle transition</li> <li>Notification
     * metadata</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The ARN of the notification target that Auto Scaling will use to
     *         notify you when an instance is in the transition state for the
     *         lifecycle hook. This ARN target can be either an SQS queue or an SNS
     *         topic. The notification message sent to the target will include: <ul>
     *         <li>Lifecycle action token</li> <li>User account ID</li> <li>Name of
     *         the Auto Scaling group</li> <li>Lifecycle hook name</li> <li>EC2
     *         instance ID</li> <li>Lifecycle transition</li> <li>Notification
     *         metadata</li> </ul>
     */
    public String getNotificationTargetARN() {
        return notificationTargetARN;
    }
    
    /**
     * The ARN of the notification target that Auto Scaling will use to
     * notify you when an instance is in the transition state for the
     * lifecycle hook. This ARN target can be either an SQS queue or an SNS
     * topic. The notification message sent to the target will include: <ul>
     * <li>Lifecycle action token</li> <li>User account ID</li> <li>Name of
     * the Auto Scaling group</li> <li>Lifecycle hook name</li> <li>EC2
     * instance ID</li> <li>Lifecycle transition</li> <li>Notification
     * metadata</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param notificationTargetARN The ARN of the notification target that Auto Scaling will use to
     *         notify you when an instance is in the transition state for the
     *         lifecycle hook. This ARN target can be either an SQS queue or an SNS
     *         topic. The notification message sent to the target will include: <ul>
     *         <li>Lifecycle action token</li> <li>User account ID</li> <li>Name of
     *         the Auto Scaling group</li> <li>Lifecycle hook name</li> <li>EC2
     *         instance ID</li> <li>Lifecycle transition</li> <li>Notification
     *         metadata</li> </ul>
     */
    public void setNotificationTargetARN(String notificationTargetARN) {
        this.notificationTargetARN = notificationTargetARN;
    }
    
    /**
     * The ARN of the notification target that Auto Scaling will use to
     * notify you when an instance is in the transition state for the
     * lifecycle hook. This ARN target can be either an SQS queue or an SNS
     * topic. The notification message sent to the target will include: <ul>
     * <li>Lifecycle action token</li> <li>User account ID</li> <li>Name of
     * the Auto Scaling group</li> <li>Lifecycle hook name</li> <li>EC2
     * instance ID</li> <li>Lifecycle transition</li> <li>Notification
     * metadata</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param notificationTargetARN The ARN of the notification target that Auto Scaling will use to
     *         notify you when an instance is in the transition state for the
     *         lifecycle hook. This ARN target can be either an SQS queue or an SNS
     *         topic. The notification message sent to the target will include: <ul>
     *         <li>Lifecycle action token</li> <li>User account ID</li> <li>Name of
     *         the Auto Scaling group</li> <li>Lifecycle hook name</li> <li>EC2
     *         instance ID</li> <li>Lifecycle transition</li> <li>Notification
     *         metadata</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LifecycleHook withNotificationTargetARN(String notificationTargetARN) {
        this.notificationTargetARN = notificationTargetARN;
        return this;
    }

    /**
     * The ARN of the Amazon IAM role that allows the Auto Scaling group to
     * publish to the specified notification target.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The ARN of the Amazon IAM role that allows the Auto Scaling group to
     *         publish to the specified notification target.
     */
    public String getRoleARN() {
        return roleARN;
    }
    
    /**
     * The ARN of the Amazon IAM role that allows the Auto Scaling group to
     * publish to the specified notification target.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param roleARN The ARN of the Amazon IAM role that allows the Auto Scaling group to
     *         publish to the specified notification target.
     */
    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }
    
    /**
     * The ARN of the Amazon IAM role that allows the Auto Scaling group to
     * publish to the specified notification target.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param roleARN The ARN of the Amazon IAM role that allows the Auto Scaling group to
     *         publish to the specified notification target.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LifecycleHook withRoleARN(String roleARN) {
        this.roleARN = roleARN;
        return this;
    }

    /**
     * Contains additional information that you want to include any time Auto
     * Scaling sends a message to the notification target.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1023<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return Contains additional information that you want to include any time Auto
     *         Scaling sends a message to the notification target.
     */
    public String getNotificationMetadata() {
        return notificationMetadata;
    }
    
    /**
     * Contains additional information that you want to include any time Auto
     * Scaling sends a message to the notification target.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1023<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param notificationMetadata Contains additional information that you want to include any time Auto
     *         Scaling sends a message to the notification target.
     */
    public void setNotificationMetadata(String notificationMetadata) {
        this.notificationMetadata = notificationMetadata;
    }
    
    /**
     * Contains additional information that you want to include any time Auto
     * Scaling sends a message to the notification target.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1023<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param notificationMetadata Contains additional information that you want to include any time Auto
     *         Scaling sends a message to the notification target.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LifecycleHook withNotificationMetadata(String notificationMetadata) {
        this.notificationMetadata = notificationMetadata;
        return this;
    }

    /**
     * Defines the amount of time that can elapse before the lifecycle hook
     * times out. When the lifecycle hook times out, Auto Scaling performs
     * the action defined in the <code>DefaultResult</code> parameter. You
     * can prevent the lifecycle hook from timing out by calling
     * <a>RecordLifecycleActionHeartbeat</a>.
     *
     * @return Defines the amount of time that can elapse before the lifecycle hook
     *         times out. When the lifecycle hook times out, Auto Scaling performs
     *         the action defined in the <code>DefaultResult</code> parameter. You
     *         can prevent the lifecycle hook from timing out by calling
     *         <a>RecordLifecycleActionHeartbeat</a>.
     */
    public Integer getHeartbeatTimeout() {
        return heartbeatTimeout;
    }
    
    /**
     * Defines the amount of time that can elapse before the lifecycle hook
     * times out. When the lifecycle hook times out, Auto Scaling performs
     * the action defined in the <code>DefaultResult</code> parameter. You
     * can prevent the lifecycle hook from timing out by calling
     * <a>RecordLifecycleActionHeartbeat</a>.
     *
     * @param heartbeatTimeout Defines the amount of time that can elapse before the lifecycle hook
     *         times out. When the lifecycle hook times out, Auto Scaling performs
     *         the action defined in the <code>DefaultResult</code> parameter. You
     *         can prevent the lifecycle hook from timing out by calling
     *         <a>RecordLifecycleActionHeartbeat</a>.
     */
    public void setHeartbeatTimeout(Integer heartbeatTimeout) {
        this.heartbeatTimeout = heartbeatTimeout;
    }
    
    /**
     * Defines the amount of time that can elapse before the lifecycle hook
     * times out. When the lifecycle hook times out, Auto Scaling performs
     * the action defined in the <code>DefaultResult</code> parameter. You
     * can prevent the lifecycle hook from timing out by calling
     * <a>RecordLifecycleActionHeartbeat</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param heartbeatTimeout Defines the amount of time that can elapse before the lifecycle hook
     *         times out. When the lifecycle hook times out, Auto Scaling performs
     *         the action defined in the <code>DefaultResult</code> parameter. You
     *         can prevent the lifecycle hook from timing out by calling
     *         <a>RecordLifecycleActionHeartbeat</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LifecycleHook withHeartbeatTimeout(Integer heartbeatTimeout) {
        this.heartbeatTimeout = heartbeatTimeout;
        return this;
    }

    /**
     * The maximum length of time an instance can remain in a
     * <code>Pending:Wait</code> or <code>Terminating:Wait</code> state.
     * Currently, this value is set at 48 hours.
     *
     * @return The maximum length of time an instance can remain in a
     *         <code>Pending:Wait</code> or <code>Terminating:Wait</code> state.
     *         Currently, this value is set at 48 hours.
     */
    public Integer getGlobalTimeout() {
        return globalTimeout;
    }
    
    /**
     * The maximum length of time an instance can remain in a
     * <code>Pending:Wait</code> or <code>Terminating:Wait</code> state.
     * Currently, this value is set at 48 hours.
     *
     * @param globalTimeout The maximum length of time an instance can remain in a
     *         <code>Pending:Wait</code> or <code>Terminating:Wait</code> state.
     *         Currently, this value is set at 48 hours.
     */
    public void setGlobalTimeout(Integer globalTimeout) {
        this.globalTimeout = globalTimeout;
    }
    
    /**
     * The maximum length of time an instance can remain in a
     * <code>Pending:Wait</code> or <code>Terminating:Wait</code> state.
     * Currently, this value is set at 48 hours.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param globalTimeout The maximum length of time an instance can remain in a
     *         <code>Pending:Wait</code> or <code>Terminating:Wait</code> state.
     *         Currently, this value is set at 48 hours.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LifecycleHook withGlobalTimeout(Integer globalTimeout) {
        this.globalTimeout = globalTimeout;
        return this;
    }

    /**
     * Defines the action the Auto Scaling group should take when the
     * lifecycle hook timeout elapses or if an unexpected failure occurs. The
     * value for this parameter can be either <code>CONTINUE</code> or
     * <code>ABANDON</code>. The default value for this parameter is
     * <code>CONTINUE</code>.
     *
     * @return Defines the action the Auto Scaling group should take when the
     *         lifecycle hook timeout elapses or if an unexpected failure occurs. The
     *         value for this parameter can be either <code>CONTINUE</code> or
     *         <code>ABANDON</code>. The default value for this parameter is
     *         <code>CONTINUE</code>.
     */
    public String getDefaultResult() {
        return defaultResult;
    }
    
    /**
     * Defines the action the Auto Scaling group should take when the
     * lifecycle hook timeout elapses or if an unexpected failure occurs. The
     * value for this parameter can be either <code>CONTINUE</code> or
     * <code>ABANDON</code>. The default value for this parameter is
     * <code>CONTINUE</code>.
     *
     * @param defaultResult Defines the action the Auto Scaling group should take when the
     *         lifecycle hook timeout elapses or if an unexpected failure occurs. The
     *         value for this parameter can be either <code>CONTINUE</code> or
     *         <code>ABANDON</code>. The default value for this parameter is
     *         <code>CONTINUE</code>.
     */
    public void setDefaultResult(String defaultResult) {
        this.defaultResult = defaultResult;
    }
    
    /**
     * Defines the action the Auto Scaling group should take when the
     * lifecycle hook timeout elapses or if an unexpected failure occurs. The
     * value for this parameter can be either <code>CONTINUE</code> or
     * <code>ABANDON</code>. The default value for this parameter is
     * <code>CONTINUE</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultResult Defines the action the Auto Scaling group should take when the
     *         lifecycle hook timeout elapses or if an unexpected failure occurs. The
     *         value for this parameter can be either <code>CONTINUE</code> or
     *         <code>ABANDON</code>. The default value for this parameter is
     *         <code>CONTINUE</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LifecycleHook withDefaultResult(String defaultResult) {
        this.defaultResult = defaultResult;
        return this;
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
        if (getLifecycleHookName() != null) sb.append("LifecycleHookName: " + getLifecycleHookName() + ",");
        if (getAutoScalingGroupName() != null) sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() + ",");
        if (getLifecycleTransition() != null) sb.append("LifecycleTransition: " + getLifecycleTransition() + ",");
        if (getNotificationTargetARN() != null) sb.append("NotificationTargetARN: " + getNotificationTargetARN() + ",");
        if (getRoleARN() != null) sb.append("RoleARN: " + getRoleARN() + ",");
        if (getNotificationMetadata() != null) sb.append("NotificationMetadata: " + getNotificationMetadata() + ",");
        if (getHeartbeatTimeout() != null) sb.append("HeartbeatTimeout: " + getHeartbeatTimeout() + ",");
        if (getGlobalTimeout() != null) sb.append("GlobalTimeout: " + getGlobalTimeout() + ",");
        if (getDefaultResult() != null) sb.append("DefaultResult: " + getDefaultResult() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof LifecycleHook == false) return false;
        LifecycleHook other = (LifecycleHook)obj;
        
        if (other.getLifecycleHookName() == null ^ this.getLifecycleHookName() == null) return false;
        if (other.getLifecycleHookName() != null && other.getLifecycleHookName().equals(this.getLifecycleHookName()) == false) return false; 
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null) return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false) return false; 
        if (other.getLifecycleTransition() == null ^ this.getLifecycleTransition() == null) return false;
        if (other.getLifecycleTransition() != null && other.getLifecycleTransition().equals(this.getLifecycleTransition()) == false) return false; 
        if (other.getNotificationTargetARN() == null ^ this.getNotificationTargetARN() == null) return false;
        if (other.getNotificationTargetARN() != null && other.getNotificationTargetARN().equals(this.getNotificationTargetARN()) == false) return false; 
        if (other.getRoleARN() == null ^ this.getRoleARN() == null) return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false) return false; 
        if (other.getNotificationMetadata() == null ^ this.getNotificationMetadata() == null) return false;
        if (other.getNotificationMetadata() != null && other.getNotificationMetadata().equals(this.getNotificationMetadata()) == false) return false; 
        if (other.getHeartbeatTimeout() == null ^ this.getHeartbeatTimeout() == null) return false;
        if (other.getHeartbeatTimeout() != null && other.getHeartbeatTimeout().equals(this.getHeartbeatTimeout()) == false) return false; 
        if (other.getGlobalTimeout() == null ^ this.getGlobalTimeout() == null) return false;
        if (other.getGlobalTimeout() != null && other.getGlobalTimeout().equals(this.getGlobalTimeout()) == false) return false; 
        if (other.getDefaultResult() == null ^ this.getDefaultResult() == null) return false;
        if (other.getDefaultResult() != null && other.getDefaultResult().equals(this.getDefaultResult()) == false) return false; 
        return true;
    }
    
}
    