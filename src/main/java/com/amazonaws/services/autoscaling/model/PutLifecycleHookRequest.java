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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#putLifecycleHook(PutLifecycleHookRequest) PutLifecycleHook operation}.
 * <p>
 * Creates or updates a lifecycle hook for an Auto Scaling Group.
 * </p>
 * <p>
 * A lifecycle hook tells Auto Scaling that you want to perform an action
 * on an instance that is not actively in service; for example, either
 * when the instance launches or before the instance terminates.
 * </p>
 * <p>
 * This operation is a part of the basic sequence for adding a lifecycle
 * hook to an Auto Scaling group:
 * </p>
 * <ol> <li> Create a notification target. A target can be either an
 * Amazon SQS queue or an Amazon SNS topic. </li>
 * <li> Create an IAM role. This role allows Auto Scaling to publish
 * lifecycle notifications to the designated SQS queue or SNS topic.
 * </li>
 * <li> <b>Create the lifecycle hook. You can create a hook that acts
 * when instances launch or when instances terminate.</b> </li>
 * <li> If necessary, record the lifecycle action heartbeat to keep the
 * instance in a pending state. </li>
 * <li> Complete the lifecycle action. </li>
 * </ol> <p>
 * To learn more, see
 * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingPendingState.html"> Auto Scaling Pending State </a> and <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingTerminatingState.html"> Auto Scaling Terminating State </a>
 * .
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#putLifecycleHook(PutLifecycleHookRequest)
 */
public class PutLifecycleHookRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the lifecycle hook.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[A-Za-z0-9\-_\/]+<br/>
     */
    private String lifecycleHookName;

    /**
     * The name of the Auto Scaling group to which you want to assign the
     * lifecycle hook.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * The Amazon EC2 instance state to which you want to attach the
     * lifecycle hook. See <a>DescribeLifecycleHookTypes</a> for a list of
     * available lifecycle hook types. <note> <p>This parameter is required
     * for new lifecycle hooks, but optional when updating existing hooks.
     * </note>
     */
    private String lifecycleTransition;

    /**
     * The ARN of the Amazon IAM role that allows the Auto Scaling group to
     * publish to the specified notification target. <note> <p>This parameter
     * is required for new lifecycle hooks, but optional when updating
     * existing hooks. </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String roleARN;

    /**
     * The ARN of the notification target that Auto Scaling will use to
     * notify you when an instance is in the transition state for the
     * lifecycle hook. This ARN target can be either an SQS queue or an SNS
     * topic. <note> <p>This parameter is required for new lifecycle hooks,
     * but optional when updating existing hooks. </note> <p>The notification
     * message sent to the target will include: <ul>
     * <li><b>LifecycleActionToken</b>. The Lifecycle action token.</li>
     * <li><b>AccountId</b>. The user account ID.</li>
     * <li><b>AutoScalingGroupName</b>. The name of the Auto Scaling
     * group.</li> <li><b>LifecycleHookName</b>. The lifecycle hook
     * name.</li> <li><b>EC2InstanceId</b>. The EC2 instance ID.</li>
     * <li><b>LifecycleTransition</b>. The lifecycle transition.</li>
     * <li><b>NotificationMetadata</b>. The notification metadata.</li> </ul>
     * <p>This operation uses the JSON format when sending notifications to
     * an Amazon SQS queue, and an email key/value pair format when sending
     * notifications to an Amazon SNS topic. <p>When you call this operation,
     * a test message is sent to the notification target. This test message
     * contains an additional key/value pair:
     * <code>Event:autoscaling:TEST_NOTIFICATION</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String notificationTargetARN;

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
     * Defines the amount of time, in seconds, that can elapse before the
     * lifecycle hook times out. When the lifecycle hook times out, Auto
     * Scaling performs the action defined in the <code>DefaultResult</code>
     * parameter. You can prevent the lifecycle hook from timing out by
     * calling <a>RecordLifecycleActionHeartbeat</a>. The default value for
     * this parameter is 3600 seconds (1 hour).
     */
    private Integer heartbeatTimeout;

    /**
     * Defines the action the Auto Scaling group should take when the
     * lifecycle hook timeout elapses or if an unexpected failure occurs. The
     * value for this parameter can be either <code>CONTINUE</code> or
     * <code>ABANDON</code>. The default value for this parameter is
     * <code>ABANDON</code>.
     */
    private String defaultResult;

    /**
     * The name of the lifecycle hook.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[A-Za-z0-9\-_\/]+<br/>
     *
     * @return The name of the lifecycle hook.
     */
    public String getLifecycleHookName() {
        return lifecycleHookName;
    }
    
    /**
     * The name of the lifecycle hook.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[A-Za-z0-9\-_\/]+<br/>
     *
     * @param lifecycleHookName The name of the lifecycle hook.
     */
    public void setLifecycleHookName(String lifecycleHookName) {
        this.lifecycleHookName = lifecycleHookName;
    }
    
    /**
     * The name of the lifecycle hook.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[A-Za-z0-9\-_\/]+<br/>
     *
     * @param lifecycleHookName The name of the lifecycle hook.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutLifecycleHookRequest withLifecycleHookName(String lifecycleHookName) {
        this.lifecycleHookName = lifecycleHookName;
        return this;
    }

    /**
     * The name of the Auto Scaling group to which you want to assign the
     * lifecycle hook.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The name of the Auto Scaling group to which you want to assign the
     *         lifecycle hook.
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }
    
    /**
     * The name of the Auto Scaling group to which you want to assign the
     * lifecycle hook.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the Auto Scaling group to which you want to assign the
     *         lifecycle hook.
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }
    
    /**
     * The name of the Auto Scaling group to which you want to assign the
     * lifecycle hook.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the Auto Scaling group to which you want to assign the
     *         lifecycle hook.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutLifecycleHookRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * The Amazon EC2 instance state to which you want to attach the
     * lifecycle hook. See <a>DescribeLifecycleHookTypes</a> for a list of
     * available lifecycle hook types. <note> <p>This parameter is required
     * for new lifecycle hooks, but optional when updating existing hooks.
     * </note>
     *
     * @return The Amazon EC2 instance state to which you want to attach the
     *         lifecycle hook. See <a>DescribeLifecycleHookTypes</a> for a list of
     *         available lifecycle hook types. <note> <p>This parameter is required
     *         for new lifecycle hooks, but optional when updating existing hooks.
     *         </note>
     */
    public String getLifecycleTransition() {
        return lifecycleTransition;
    }
    
    /**
     * The Amazon EC2 instance state to which you want to attach the
     * lifecycle hook. See <a>DescribeLifecycleHookTypes</a> for a list of
     * available lifecycle hook types. <note> <p>This parameter is required
     * for new lifecycle hooks, but optional when updating existing hooks.
     * </note>
     *
     * @param lifecycleTransition The Amazon EC2 instance state to which you want to attach the
     *         lifecycle hook. See <a>DescribeLifecycleHookTypes</a> for a list of
     *         available lifecycle hook types. <note> <p>This parameter is required
     *         for new lifecycle hooks, but optional when updating existing hooks.
     *         </note>
     */
    public void setLifecycleTransition(String lifecycleTransition) {
        this.lifecycleTransition = lifecycleTransition;
    }
    
    /**
     * The Amazon EC2 instance state to which you want to attach the
     * lifecycle hook. See <a>DescribeLifecycleHookTypes</a> for a list of
     * available lifecycle hook types. <note> <p>This parameter is required
     * for new lifecycle hooks, but optional when updating existing hooks.
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lifecycleTransition The Amazon EC2 instance state to which you want to attach the
     *         lifecycle hook. See <a>DescribeLifecycleHookTypes</a> for a list of
     *         available lifecycle hook types. <note> <p>This parameter is required
     *         for new lifecycle hooks, but optional when updating existing hooks.
     *         </note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutLifecycleHookRequest withLifecycleTransition(String lifecycleTransition) {
        this.lifecycleTransition = lifecycleTransition;
        return this;
    }

    /**
     * The ARN of the Amazon IAM role that allows the Auto Scaling group to
     * publish to the specified notification target. <note> <p>This parameter
     * is required for new lifecycle hooks, but optional when updating
     * existing hooks. </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The ARN of the Amazon IAM role that allows the Auto Scaling group to
     *         publish to the specified notification target. <note> <p>This parameter
     *         is required for new lifecycle hooks, but optional when updating
     *         existing hooks. </note>
     */
    public String getRoleARN() {
        return roleARN;
    }
    
    /**
     * The ARN of the Amazon IAM role that allows the Auto Scaling group to
     * publish to the specified notification target. <note> <p>This parameter
     * is required for new lifecycle hooks, but optional when updating
     * existing hooks. </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param roleARN The ARN of the Amazon IAM role that allows the Auto Scaling group to
     *         publish to the specified notification target. <note> <p>This parameter
     *         is required for new lifecycle hooks, but optional when updating
     *         existing hooks. </note>
     */
    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }
    
    /**
     * The ARN of the Amazon IAM role that allows the Auto Scaling group to
     * publish to the specified notification target. <note> <p>This parameter
     * is required for new lifecycle hooks, but optional when updating
     * existing hooks. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param roleARN The ARN of the Amazon IAM role that allows the Auto Scaling group to
     *         publish to the specified notification target. <note> <p>This parameter
     *         is required for new lifecycle hooks, but optional when updating
     *         existing hooks. </note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutLifecycleHookRequest withRoleARN(String roleARN) {
        this.roleARN = roleARN;
        return this;
    }

    /**
     * The ARN of the notification target that Auto Scaling will use to
     * notify you when an instance is in the transition state for the
     * lifecycle hook. This ARN target can be either an SQS queue or an SNS
     * topic. <note> <p>This parameter is required for new lifecycle hooks,
     * but optional when updating existing hooks. </note> <p>The notification
     * message sent to the target will include: <ul>
     * <li><b>LifecycleActionToken</b>. The Lifecycle action token.</li>
     * <li><b>AccountId</b>. The user account ID.</li>
     * <li><b>AutoScalingGroupName</b>. The name of the Auto Scaling
     * group.</li> <li><b>LifecycleHookName</b>. The lifecycle hook
     * name.</li> <li><b>EC2InstanceId</b>. The EC2 instance ID.</li>
     * <li><b>LifecycleTransition</b>. The lifecycle transition.</li>
     * <li><b>NotificationMetadata</b>. The notification metadata.</li> </ul>
     * <p>This operation uses the JSON format when sending notifications to
     * an Amazon SQS queue, and an email key/value pair format when sending
     * notifications to an Amazon SNS topic. <p>When you call this operation,
     * a test message is sent to the notification target. This test message
     * contains an additional key/value pair:
     * <code>Event:autoscaling:TEST_NOTIFICATION</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The ARN of the notification target that Auto Scaling will use to
     *         notify you when an instance is in the transition state for the
     *         lifecycle hook. This ARN target can be either an SQS queue or an SNS
     *         topic. <note> <p>This parameter is required for new lifecycle hooks,
     *         but optional when updating existing hooks. </note> <p>The notification
     *         message sent to the target will include: <ul>
     *         <li><b>LifecycleActionToken</b>. The Lifecycle action token.</li>
     *         <li><b>AccountId</b>. The user account ID.</li>
     *         <li><b>AutoScalingGroupName</b>. The name of the Auto Scaling
     *         group.</li> <li><b>LifecycleHookName</b>. The lifecycle hook
     *         name.</li> <li><b>EC2InstanceId</b>. The EC2 instance ID.</li>
     *         <li><b>LifecycleTransition</b>. The lifecycle transition.</li>
     *         <li><b>NotificationMetadata</b>. The notification metadata.</li> </ul>
     *         <p>This operation uses the JSON format when sending notifications to
     *         an Amazon SQS queue, and an email key/value pair format when sending
     *         notifications to an Amazon SNS topic. <p>When you call this operation,
     *         a test message is sent to the notification target. This test message
     *         contains an additional key/value pair:
     *         <code>Event:autoscaling:TEST_NOTIFICATION</code>.
     */
    public String getNotificationTargetARN() {
        return notificationTargetARN;
    }
    
    /**
     * The ARN of the notification target that Auto Scaling will use to
     * notify you when an instance is in the transition state for the
     * lifecycle hook. This ARN target can be either an SQS queue or an SNS
     * topic. <note> <p>This parameter is required for new lifecycle hooks,
     * but optional when updating existing hooks. </note> <p>The notification
     * message sent to the target will include: <ul>
     * <li><b>LifecycleActionToken</b>. The Lifecycle action token.</li>
     * <li><b>AccountId</b>. The user account ID.</li>
     * <li><b>AutoScalingGroupName</b>. The name of the Auto Scaling
     * group.</li> <li><b>LifecycleHookName</b>. The lifecycle hook
     * name.</li> <li><b>EC2InstanceId</b>. The EC2 instance ID.</li>
     * <li><b>LifecycleTransition</b>. The lifecycle transition.</li>
     * <li><b>NotificationMetadata</b>. The notification metadata.</li> </ul>
     * <p>This operation uses the JSON format when sending notifications to
     * an Amazon SQS queue, and an email key/value pair format when sending
     * notifications to an Amazon SNS topic. <p>When you call this operation,
     * a test message is sent to the notification target. This test message
     * contains an additional key/value pair:
     * <code>Event:autoscaling:TEST_NOTIFICATION</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param notificationTargetARN The ARN of the notification target that Auto Scaling will use to
     *         notify you when an instance is in the transition state for the
     *         lifecycle hook. This ARN target can be either an SQS queue or an SNS
     *         topic. <note> <p>This parameter is required for new lifecycle hooks,
     *         but optional when updating existing hooks. </note> <p>The notification
     *         message sent to the target will include: <ul>
     *         <li><b>LifecycleActionToken</b>. The Lifecycle action token.</li>
     *         <li><b>AccountId</b>. The user account ID.</li>
     *         <li><b>AutoScalingGroupName</b>. The name of the Auto Scaling
     *         group.</li> <li><b>LifecycleHookName</b>. The lifecycle hook
     *         name.</li> <li><b>EC2InstanceId</b>. The EC2 instance ID.</li>
     *         <li><b>LifecycleTransition</b>. The lifecycle transition.</li>
     *         <li><b>NotificationMetadata</b>. The notification metadata.</li> </ul>
     *         <p>This operation uses the JSON format when sending notifications to
     *         an Amazon SQS queue, and an email key/value pair format when sending
     *         notifications to an Amazon SNS topic. <p>When you call this operation,
     *         a test message is sent to the notification target. This test message
     *         contains an additional key/value pair:
     *         <code>Event:autoscaling:TEST_NOTIFICATION</code>.
     */
    public void setNotificationTargetARN(String notificationTargetARN) {
        this.notificationTargetARN = notificationTargetARN;
    }
    
    /**
     * The ARN of the notification target that Auto Scaling will use to
     * notify you when an instance is in the transition state for the
     * lifecycle hook. This ARN target can be either an SQS queue or an SNS
     * topic. <note> <p>This parameter is required for new lifecycle hooks,
     * but optional when updating existing hooks. </note> <p>The notification
     * message sent to the target will include: <ul>
     * <li><b>LifecycleActionToken</b>. The Lifecycle action token.</li>
     * <li><b>AccountId</b>. The user account ID.</li>
     * <li><b>AutoScalingGroupName</b>. The name of the Auto Scaling
     * group.</li> <li><b>LifecycleHookName</b>. The lifecycle hook
     * name.</li> <li><b>EC2InstanceId</b>. The EC2 instance ID.</li>
     * <li><b>LifecycleTransition</b>. The lifecycle transition.</li>
     * <li><b>NotificationMetadata</b>. The notification metadata.</li> </ul>
     * <p>This operation uses the JSON format when sending notifications to
     * an Amazon SQS queue, and an email key/value pair format when sending
     * notifications to an Amazon SNS topic. <p>When you call this operation,
     * a test message is sent to the notification target. This test message
     * contains an additional key/value pair:
     * <code>Event:autoscaling:TEST_NOTIFICATION</code>.
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
     *         topic. <note> <p>This parameter is required for new lifecycle hooks,
     *         but optional when updating existing hooks. </note> <p>The notification
     *         message sent to the target will include: <ul>
     *         <li><b>LifecycleActionToken</b>. The Lifecycle action token.</li>
     *         <li><b>AccountId</b>. The user account ID.</li>
     *         <li><b>AutoScalingGroupName</b>. The name of the Auto Scaling
     *         group.</li> <li><b>LifecycleHookName</b>. The lifecycle hook
     *         name.</li> <li><b>EC2InstanceId</b>. The EC2 instance ID.</li>
     *         <li><b>LifecycleTransition</b>. The lifecycle transition.</li>
     *         <li><b>NotificationMetadata</b>. The notification metadata.</li> </ul>
     *         <p>This operation uses the JSON format when sending notifications to
     *         an Amazon SQS queue, and an email key/value pair format when sending
     *         notifications to an Amazon SNS topic. <p>When you call this operation,
     *         a test message is sent to the notification target. This test message
     *         contains an additional key/value pair:
     *         <code>Event:autoscaling:TEST_NOTIFICATION</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutLifecycleHookRequest withNotificationTargetARN(String notificationTargetARN) {
        this.notificationTargetARN = notificationTargetARN;
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
    public PutLifecycleHookRequest withNotificationMetadata(String notificationMetadata) {
        this.notificationMetadata = notificationMetadata;
        return this;
    }

    /**
     * Defines the amount of time, in seconds, that can elapse before the
     * lifecycle hook times out. When the lifecycle hook times out, Auto
     * Scaling performs the action defined in the <code>DefaultResult</code>
     * parameter. You can prevent the lifecycle hook from timing out by
     * calling <a>RecordLifecycleActionHeartbeat</a>. The default value for
     * this parameter is 3600 seconds (1 hour).
     *
     * @return Defines the amount of time, in seconds, that can elapse before the
     *         lifecycle hook times out. When the lifecycle hook times out, Auto
     *         Scaling performs the action defined in the <code>DefaultResult</code>
     *         parameter. You can prevent the lifecycle hook from timing out by
     *         calling <a>RecordLifecycleActionHeartbeat</a>. The default value for
     *         this parameter is 3600 seconds (1 hour).
     */
    public Integer getHeartbeatTimeout() {
        return heartbeatTimeout;
    }
    
    /**
     * Defines the amount of time, in seconds, that can elapse before the
     * lifecycle hook times out. When the lifecycle hook times out, Auto
     * Scaling performs the action defined in the <code>DefaultResult</code>
     * parameter. You can prevent the lifecycle hook from timing out by
     * calling <a>RecordLifecycleActionHeartbeat</a>. The default value for
     * this parameter is 3600 seconds (1 hour).
     *
     * @param heartbeatTimeout Defines the amount of time, in seconds, that can elapse before the
     *         lifecycle hook times out. When the lifecycle hook times out, Auto
     *         Scaling performs the action defined in the <code>DefaultResult</code>
     *         parameter. You can prevent the lifecycle hook from timing out by
     *         calling <a>RecordLifecycleActionHeartbeat</a>. The default value for
     *         this parameter is 3600 seconds (1 hour).
     */
    public void setHeartbeatTimeout(Integer heartbeatTimeout) {
        this.heartbeatTimeout = heartbeatTimeout;
    }
    
    /**
     * Defines the amount of time, in seconds, that can elapse before the
     * lifecycle hook times out. When the lifecycle hook times out, Auto
     * Scaling performs the action defined in the <code>DefaultResult</code>
     * parameter. You can prevent the lifecycle hook from timing out by
     * calling <a>RecordLifecycleActionHeartbeat</a>. The default value for
     * this parameter is 3600 seconds (1 hour).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param heartbeatTimeout Defines the amount of time, in seconds, that can elapse before the
     *         lifecycle hook times out. When the lifecycle hook times out, Auto
     *         Scaling performs the action defined in the <code>DefaultResult</code>
     *         parameter. You can prevent the lifecycle hook from timing out by
     *         calling <a>RecordLifecycleActionHeartbeat</a>. The default value for
     *         this parameter is 3600 seconds (1 hour).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutLifecycleHookRequest withHeartbeatTimeout(Integer heartbeatTimeout) {
        this.heartbeatTimeout = heartbeatTimeout;
        return this;
    }

    /**
     * Defines the action the Auto Scaling group should take when the
     * lifecycle hook timeout elapses or if an unexpected failure occurs. The
     * value for this parameter can be either <code>CONTINUE</code> or
     * <code>ABANDON</code>. The default value for this parameter is
     * <code>ABANDON</code>.
     *
     * @return Defines the action the Auto Scaling group should take when the
     *         lifecycle hook timeout elapses or if an unexpected failure occurs. The
     *         value for this parameter can be either <code>CONTINUE</code> or
     *         <code>ABANDON</code>. The default value for this parameter is
     *         <code>ABANDON</code>.
     */
    public String getDefaultResult() {
        return defaultResult;
    }
    
    /**
     * Defines the action the Auto Scaling group should take when the
     * lifecycle hook timeout elapses or if an unexpected failure occurs. The
     * value for this parameter can be either <code>CONTINUE</code> or
     * <code>ABANDON</code>. The default value for this parameter is
     * <code>ABANDON</code>.
     *
     * @param defaultResult Defines the action the Auto Scaling group should take when the
     *         lifecycle hook timeout elapses or if an unexpected failure occurs. The
     *         value for this parameter can be either <code>CONTINUE</code> or
     *         <code>ABANDON</code>. The default value for this parameter is
     *         <code>ABANDON</code>.
     */
    public void setDefaultResult(String defaultResult) {
        this.defaultResult = defaultResult;
    }
    
    /**
     * Defines the action the Auto Scaling group should take when the
     * lifecycle hook timeout elapses or if an unexpected failure occurs. The
     * value for this parameter can be either <code>CONTINUE</code> or
     * <code>ABANDON</code>. The default value for this parameter is
     * <code>ABANDON</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultResult Defines the action the Auto Scaling group should take when the
     *         lifecycle hook timeout elapses or if an unexpected failure occurs. The
     *         value for this parameter can be either <code>CONTINUE</code> or
     *         <code>ABANDON</code>. The default value for this parameter is
     *         <code>ABANDON</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutLifecycleHookRequest withDefaultResult(String defaultResult) {
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
        if (getRoleARN() != null) sb.append("RoleARN: " + getRoleARN() + ",");
        if (getNotificationTargetARN() != null) sb.append("NotificationTargetARN: " + getNotificationTargetARN() + ",");
        if (getNotificationMetadata() != null) sb.append("NotificationMetadata: " + getNotificationMetadata() + ",");
        if (getHeartbeatTimeout() != null) sb.append("HeartbeatTimeout: " + getHeartbeatTimeout() + ",");
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
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode()); 
        hashCode = prime * hashCode + ((getNotificationTargetARN() == null) ? 0 : getNotificationTargetARN().hashCode()); 
        hashCode = prime * hashCode + ((getNotificationMetadata() == null) ? 0 : getNotificationMetadata().hashCode()); 
        hashCode = prime * hashCode + ((getHeartbeatTimeout() == null) ? 0 : getHeartbeatTimeout().hashCode()); 
        hashCode = prime * hashCode + ((getDefaultResult() == null) ? 0 : getDefaultResult().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PutLifecycleHookRequest == false) return false;
        PutLifecycleHookRequest other = (PutLifecycleHookRequest)obj;
        
        if (other.getLifecycleHookName() == null ^ this.getLifecycleHookName() == null) return false;
        if (other.getLifecycleHookName() != null && other.getLifecycleHookName().equals(this.getLifecycleHookName()) == false) return false; 
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null) return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false) return false; 
        if (other.getLifecycleTransition() == null ^ this.getLifecycleTransition() == null) return false;
        if (other.getLifecycleTransition() != null && other.getLifecycleTransition().equals(this.getLifecycleTransition()) == false) return false; 
        if (other.getRoleARN() == null ^ this.getRoleARN() == null) return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false) return false; 
        if (other.getNotificationTargetARN() == null ^ this.getNotificationTargetARN() == null) return false;
        if (other.getNotificationTargetARN() != null && other.getNotificationTargetARN().equals(this.getNotificationTargetARN()) == false) return false; 
        if (other.getNotificationMetadata() == null ^ this.getNotificationMetadata() == null) return false;
        if (other.getNotificationMetadata() != null && other.getNotificationMetadata().equals(this.getNotificationMetadata()) == false) return false; 
        if (other.getHeartbeatTimeout() == null ^ this.getHeartbeatTimeout() == null) return false;
        if (other.getHeartbeatTimeout() != null && other.getHeartbeatTimeout().equals(this.getHeartbeatTimeout()) == false) return false; 
        if (other.getDefaultResult() == null ^ this.getDefaultResult() == null) return false;
        if (other.getDefaultResult() != null && other.getDefaultResult().equals(this.getDefaultResult()) == false) return false; 
        return true;
    }
    
}
    