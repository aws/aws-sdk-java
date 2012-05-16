/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#putNotificationConfiguration(PutNotificationConfigurationRequest) PutNotificationConfiguration operation}.
 * <p>
 * Configures an Auto Scaling group to send notifications when specified events take place. Subscribers to this topic can have messages for events
 * delivered to an endpoint such as a web server or email address.
 * </p>
 * <p>
 * A new <code>PutNotificationConfiguration</code> overwrites an existing configuration.
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#putNotificationConfiguration(PutNotificationConfigurationRequest)
 */
public class PutNotificationConfigurationRequest extends AmazonWebServiceRequest {

    /**
     * The name of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification
     * Service (SNS) topic.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String topicARN;

    /**
     * The type of events that will trigger the notification. For more
     * information, go to <a>DescribeAutoScalingNotificationTypes</a>.
     */
    private java.util.List<String> notificationTypes;

    /**
     * The name of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name of the Auto Scaling group.
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }
    
    /**
     * The name of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the Auto Scaling group.
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }
    
    /**
     * The name of the Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutNotificationConfigurationRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }
    
    
    /**
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification
     * Service (SNS) topic.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The Amazon Resource Name (ARN) of the Amazon Simple Notification
     *         Service (SNS) topic.
     */
    public String getTopicARN() {
        return topicARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification
     * Service (SNS) topic.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param topicARN The Amazon Resource Name (ARN) of the Amazon Simple Notification
     *         Service (SNS) topic.
     */
    public void setTopicARN(String topicARN) {
        this.topicARN = topicARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification
     * Service (SNS) topic.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param topicARN The Amazon Resource Name (ARN) of the Amazon Simple Notification
     *         Service (SNS) topic.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutNotificationConfigurationRequest withTopicARN(String topicARN) {
        this.topicARN = topicARN;
        return this;
    }
    
    
    /**
     * The type of events that will trigger the notification. For more
     * information, go to <a>DescribeAutoScalingNotificationTypes</a>.
     *
     * @return The type of events that will trigger the notification. For more
     *         information, go to <a>DescribeAutoScalingNotificationTypes</a>.
     */
    public java.util.List<String> getNotificationTypes() {
        
        if (notificationTypes == null) {
            notificationTypes = new java.util.ArrayList<String>();
        }
        return notificationTypes;
    }
    
    /**
     * The type of events that will trigger the notification. For more
     * information, go to <a>DescribeAutoScalingNotificationTypes</a>.
     *
     * @param notificationTypes The type of events that will trigger the notification. For more
     *         information, go to <a>DescribeAutoScalingNotificationTypes</a>.
     */
    public void setNotificationTypes(java.util.Collection<String> notificationTypes) {
        if (notificationTypes == null) {
            this.notificationTypes = null;
            return;
        }

        java.util.List<String> notificationTypesCopy = new java.util.ArrayList<String>(notificationTypes.size());
        notificationTypesCopy.addAll(notificationTypes);
        this.notificationTypes = notificationTypesCopy;
    }
    
    /**
     * The type of events that will trigger the notification. For more
     * information, go to <a>DescribeAutoScalingNotificationTypes</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param notificationTypes The type of events that will trigger the notification. For more
     *         information, go to <a>DescribeAutoScalingNotificationTypes</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutNotificationConfigurationRequest withNotificationTypes(String... notificationTypes) {
        if (getNotificationTypes() == null) setNotificationTypes(new java.util.ArrayList<String>(notificationTypes.length));
        for (String value : notificationTypes) {
            getNotificationTypes().add(value);
        }
        return this;
    }
    
    /**
     * The type of events that will trigger the notification. For more
     * information, go to <a>DescribeAutoScalingNotificationTypes</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param notificationTypes The type of events that will trigger the notification. For more
     *         information, go to <a>DescribeAutoScalingNotificationTypes</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutNotificationConfigurationRequest withNotificationTypes(java.util.Collection<String> notificationTypes) {
        if (notificationTypes == null) {
            this.notificationTypes = null;
        } else {
            java.util.List<String> notificationTypesCopy = new java.util.ArrayList<String>(notificationTypes.size());
            notificationTypesCopy.addAll(notificationTypes);
            this.notificationTypes = notificationTypesCopy;
        }

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
        if (autoScalingGroupName != null) sb.append("AutoScalingGroupName: " + autoScalingGroupName + ", ");
        if (topicARN != null) sb.append("TopicARN: " + topicARN + ", ");
        if (notificationTypes != null) sb.append("NotificationTypes: " + notificationTypes + ", ");
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof PutNotificationConfigurationRequest == false) return false;
        PutNotificationConfigurationRequest other = (PutNotificationConfigurationRequest)obj;
        
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null) return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false) return false; 
        if (other.getTopicARN() == null ^ this.getTopicARN() == null) return false;
        if (other.getTopicARN() != null && other.getTopicARN().equals(this.getTopicARN()) == false) return false; 
        if (other.getNotificationTypes() == null ^ this.getNotificationTypes() == null) return false;
        if (other.getNotificationTypes() != null && other.getNotificationTypes().equals(this.getNotificationTypes()) == false) return false; 
        return true;
    }
    
}
    