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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/PutNotificationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutNotificationConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The type of event that causes the notification to be sent. For more information about notification types
     * supported by Amazon EC2 Auto Scaling, see <a>DescribeAutoScalingNotificationTypes</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> notificationTypes;

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

    public PutNotificationConfigurationRequest withAutoScalingGroupName(String autoScalingGroupName) {
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

    public PutNotificationConfigurationRequest withTopicARN(String topicARN) {
        setTopicARN(topicARN);
        return this;
    }

    /**
     * <p>
     * The type of event that causes the notification to be sent. For more information about notification types
     * supported by Amazon EC2 Auto Scaling, see <a>DescribeAutoScalingNotificationTypes</a>.
     * </p>
     * 
     * @return The type of event that causes the notification to be sent. For more information about notification types
     *         supported by Amazon EC2 Auto Scaling, see <a>DescribeAutoScalingNotificationTypes</a>.
     */

    public java.util.List<String> getNotificationTypes() {
        if (notificationTypes == null) {
            notificationTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return notificationTypes;
    }

    /**
     * <p>
     * The type of event that causes the notification to be sent. For more information about notification types
     * supported by Amazon EC2 Auto Scaling, see <a>DescribeAutoScalingNotificationTypes</a>.
     * </p>
     * 
     * @param notificationTypes
     *        The type of event that causes the notification to be sent. For more information about notification types
     *        supported by Amazon EC2 Auto Scaling, see <a>DescribeAutoScalingNotificationTypes</a>.
     */

    public void setNotificationTypes(java.util.Collection<String> notificationTypes) {
        if (notificationTypes == null) {
            this.notificationTypes = null;
            return;
        }

        this.notificationTypes = new com.amazonaws.internal.SdkInternalList<String>(notificationTypes);
    }

    /**
     * <p>
     * The type of event that causes the notification to be sent. For more information about notification types
     * supported by Amazon EC2 Auto Scaling, see <a>DescribeAutoScalingNotificationTypes</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotificationTypes(java.util.Collection)} or {@link #withNotificationTypes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param notificationTypes
     *        The type of event that causes the notification to be sent. For more information about notification types
     *        supported by Amazon EC2 Auto Scaling, see <a>DescribeAutoScalingNotificationTypes</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutNotificationConfigurationRequest withNotificationTypes(String... notificationTypes) {
        if (this.notificationTypes == null) {
            setNotificationTypes(new com.amazonaws.internal.SdkInternalList<String>(notificationTypes.length));
        }
        for (String ele : notificationTypes) {
            this.notificationTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The type of event that causes the notification to be sent. For more information about notification types
     * supported by Amazon EC2 Auto Scaling, see <a>DescribeAutoScalingNotificationTypes</a>.
     * </p>
     * 
     * @param notificationTypes
     *        The type of event that causes the notification to be sent. For more information about notification types
     *        supported by Amazon EC2 Auto Scaling, see <a>DescribeAutoScalingNotificationTypes</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutNotificationConfigurationRequest withNotificationTypes(java.util.Collection<String> notificationTypes) {
        setNotificationTypes(notificationTypes);
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
        if (getNotificationTypes() != null)
            sb.append("NotificationTypes: ").append(getNotificationTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutNotificationConfigurationRequest == false)
            return false;
        PutNotificationConfigurationRequest other = (PutNotificationConfigurationRequest) obj;
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getTopicARN() == null ^ this.getTopicARN() == null)
            return false;
        if (other.getTopicARN() != null && other.getTopicARN().equals(this.getTopicARN()) == false)
            return false;
        if (other.getNotificationTypes() == null ^ this.getNotificationTypes() == null)
            return false;
        if (other.getNotificationTypes() != null && other.getNotificationTypes().equals(this.getNotificationTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getTopicARN() == null) ? 0 : getTopicARN().hashCode());
        hashCode = prime * hashCode + ((getNotificationTypes() == null) ? 0 : getNotificationTypes().hashCode());
        return hashCode;
    }

    @Override
    public PutNotificationConfigurationRequest clone() {
        return (PutNotificationConfigurationRequest) super.clone();
    }

}
