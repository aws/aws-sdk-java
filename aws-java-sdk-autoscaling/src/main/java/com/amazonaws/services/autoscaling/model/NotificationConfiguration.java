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
 * Describes a notification.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/NotificationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotificationConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (Amazon SNS) topic.
     * </p>
     */
    private String topicARN;
    /**
     * <p>
     * One of the following event notification types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>autoscaling:EC2_INSTANCE_LAUNCH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling:EC2_INSTANCE_LAUNCH_ERROR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling:EC2_INSTANCE_TERMINATE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling:EC2_INSTANCE_TERMINATE_ERROR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling:TEST_NOTIFICATION</code>
     * </p>
     * </li>
     * </ul>
     */
    private String notificationType;

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group.
     */

    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @return The name of the Auto Scaling group.
     */

    public String getAutoScalingGroupName() {
        return this.autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationConfiguration withAutoScalingGroupName(String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (Amazon SNS) topic.
     * </p>
     * 
     * @param topicARN
     *        The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (Amazon SNS) topic.
     */

    public void setTopicARN(String topicARN) {
        this.topicARN = topicARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (Amazon SNS) topic.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (Amazon SNS) topic.
     */

    public String getTopicARN() {
        return this.topicARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (Amazon SNS) topic.
     * </p>
     * 
     * @param topicARN
     *        The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (Amazon SNS) topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationConfiguration withTopicARN(String topicARN) {
        setTopicARN(topicARN);
        return this;
    }

    /**
     * <p>
     * One of the following event notification types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>autoscaling:EC2_INSTANCE_LAUNCH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling:EC2_INSTANCE_LAUNCH_ERROR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling:EC2_INSTANCE_TERMINATE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling:EC2_INSTANCE_TERMINATE_ERROR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling:TEST_NOTIFICATION</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param notificationType
     *        One of the following event notification types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>autoscaling:EC2_INSTANCE_LAUNCH</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>autoscaling:EC2_INSTANCE_LAUNCH_ERROR</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>autoscaling:EC2_INSTANCE_TERMINATE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>autoscaling:EC2_INSTANCE_TERMINATE_ERROR</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>autoscaling:TEST_NOTIFICATION</code>
     *        </p>
     *        </li>
     */

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    /**
     * <p>
     * One of the following event notification types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>autoscaling:EC2_INSTANCE_LAUNCH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling:EC2_INSTANCE_LAUNCH_ERROR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling:EC2_INSTANCE_TERMINATE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling:EC2_INSTANCE_TERMINATE_ERROR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling:TEST_NOTIFICATION</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return One of the following event notification types:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>autoscaling:EC2_INSTANCE_LAUNCH</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>autoscaling:EC2_INSTANCE_LAUNCH_ERROR</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>autoscaling:EC2_INSTANCE_TERMINATE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>autoscaling:EC2_INSTANCE_TERMINATE_ERROR</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>autoscaling:TEST_NOTIFICATION</code>
     *         </p>
     *         </li>
     */

    public String getNotificationType() {
        return this.notificationType;
    }

    /**
     * <p>
     * One of the following event notification types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>autoscaling:EC2_INSTANCE_LAUNCH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling:EC2_INSTANCE_LAUNCH_ERROR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling:EC2_INSTANCE_TERMINATE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling:EC2_INSTANCE_TERMINATE_ERROR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling:TEST_NOTIFICATION</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param notificationType
     *        One of the following event notification types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>autoscaling:EC2_INSTANCE_LAUNCH</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>autoscaling:EC2_INSTANCE_LAUNCH_ERROR</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>autoscaling:EC2_INSTANCE_TERMINATE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>autoscaling:EC2_INSTANCE_TERMINATE_ERROR</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>autoscaling:TEST_NOTIFICATION</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationConfiguration withNotificationType(String notificationType) {
        setNotificationType(notificationType);
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
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: ").append(getAutoScalingGroupName()).append(",");
        if (getTopicARN() != null)
            sb.append("TopicARN: ").append(getTopicARN()).append(",");
        if (getNotificationType() != null)
            sb.append("NotificationType: ").append(getNotificationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotificationConfiguration == false)
            return false;
        NotificationConfiguration other = (NotificationConfiguration) obj;
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getTopicARN() == null ^ this.getTopicARN() == null)
            return false;
        if (other.getTopicARN() != null && other.getTopicARN().equals(this.getTopicARN()) == false)
            return false;
        if (other.getNotificationType() == null ^ this.getNotificationType() == null)
            return false;
        if (other.getNotificationType() != null && other.getNotificationType().equals(this.getNotificationType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getTopicARN() == null) ? 0 : getTopicARN().hashCode());
        hashCode = prime * hashCode + ((getNotificationType() == null) ? 0 : getNotificationType().hashCode());
        return hashCode;
    }

    @Override
    public NotificationConfiguration clone() {
        try {
            return (NotificationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
