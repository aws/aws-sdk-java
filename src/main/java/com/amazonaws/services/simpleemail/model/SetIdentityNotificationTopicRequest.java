/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.simpleemail.AmazonSimpleEmailService#setIdentityNotificationTopic(SetIdentityNotificationTopicRequest) SetIdentityNotificationTopic operation}.
 * <p>
 * Given an identity (email address or domain), sets the Amazon SNS topic to which Amazon SES will publish bounce and complaint notifications for emails
 * sent with that identity as the <code>Source</code> .
 * Publishing to topics may only be disabled when feedback forwarding is enabled. For more information about feedback notification, see the <a
 * href="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide"> Amazon SES Developer Guide </a> .
 * </p>
 *
 * @see com.amazonaws.services.simpleemail.AmazonSimpleEmailService#setIdentityNotificationTopic(SetIdentityNotificationTopicRequest)
 */
public class SetIdentityNotificationTopicRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The identity for which the topic will be set. Examples:
     * <code>user@example.com</code>, <code>example.com</code>.
     */
    private String identity;

    /**
     * The type of feedback notifications that will be published to the
     * specified topic.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bounce, Complaint
     */
    private String notificationType;

    /**
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification
     * Service (Amazon SNS) topic. If the parameter is ommited from the
     * request or a null value is passed, the topic is cleared and publishing
     * is disabled.
     */
    private String snsTopic;

    /**
     * The identity for which the topic will be set. Examples:
     * <code>user@example.com</code>, <code>example.com</code>.
     *
     * @return The identity for which the topic will be set. Examples:
     *         <code>user@example.com</code>, <code>example.com</code>.
     */
    public String getIdentity() {
        return identity;
    }
    
    /**
     * The identity for which the topic will be set. Examples:
     * <code>user@example.com</code>, <code>example.com</code>.
     *
     * @param identity The identity for which the topic will be set. Examples:
     *         <code>user@example.com</code>, <code>example.com</code>.
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }
    
    /**
     * The identity for which the topic will be set. Examples:
     * <code>user@example.com</code>, <code>example.com</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param identity The identity for which the topic will be set. Examples:
     *         <code>user@example.com</code>, <code>example.com</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetIdentityNotificationTopicRequest withIdentity(String identity) {
        this.identity = identity;
        return this;
    }

    /**
     * The type of feedback notifications that will be published to the
     * specified topic.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bounce, Complaint
     *
     * @return The type of feedback notifications that will be published to the
     *         specified topic.
     *
     * @see NotificationType
     */
    public String getNotificationType() {
        return notificationType;
    }
    
    /**
     * The type of feedback notifications that will be published to the
     * specified topic.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bounce, Complaint
     *
     * @param notificationType The type of feedback notifications that will be published to the
     *         specified topic.
     *
     * @see NotificationType
     */
    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }
    
    /**
     * The type of feedback notifications that will be published to the
     * specified topic.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bounce, Complaint
     *
     * @param notificationType The type of feedback notifications that will be published to the
     *         specified topic.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see NotificationType
     */
    public SetIdentityNotificationTopicRequest withNotificationType(String notificationType) {
        this.notificationType = notificationType;
        return this;
    }

    /**
     * The type of feedback notifications that will be published to the
     * specified topic.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bounce, Complaint
     *
     * @param notificationType The type of feedback notifications that will be published to the
     *         specified topic.
     *
     * @see NotificationType
     */
    public void setNotificationType(NotificationType notificationType) {
        this.notificationType = notificationType.toString();
    }
    
    /**
     * The type of feedback notifications that will be published to the
     * specified topic.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bounce, Complaint
     *
     * @param notificationType The type of feedback notifications that will be published to the
     *         specified topic.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see NotificationType
     */
    public SetIdentityNotificationTopicRequest withNotificationType(NotificationType notificationType) {
        this.notificationType = notificationType.toString();
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification
     * Service (Amazon SNS) topic. If the parameter is ommited from the
     * request or a null value is passed, the topic is cleared and publishing
     * is disabled.
     *
     * @return The Amazon Resource Name (ARN) of the Amazon Simple Notification
     *         Service (Amazon SNS) topic. If the parameter is ommited from the
     *         request or a null value is passed, the topic is cleared and publishing
     *         is disabled.
     */
    public String getSnsTopic() {
        return snsTopic;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification
     * Service (Amazon SNS) topic. If the parameter is ommited from the
     * request or a null value is passed, the topic is cleared and publishing
     * is disabled.
     *
     * @param snsTopic The Amazon Resource Name (ARN) of the Amazon Simple Notification
     *         Service (Amazon SNS) topic. If the parameter is ommited from the
     *         request or a null value is passed, the topic is cleared and publishing
     *         is disabled.
     */
    public void setSnsTopic(String snsTopic) {
        this.snsTopic = snsTopic;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification
     * Service (Amazon SNS) topic. If the parameter is ommited from the
     * request or a null value is passed, the topic is cleared and publishing
     * is disabled.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snsTopic The Amazon Resource Name (ARN) of the Amazon Simple Notification
     *         Service (Amazon SNS) topic. If the parameter is ommited from the
     *         request or a null value is passed, the topic is cleared and publishing
     *         is disabled.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetIdentityNotificationTopicRequest withSnsTopic(String snsTopic) {
        this.snsTopic = snsTopic;
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
        if (getIdentity() != null) sb.append("Identity: " + getIdentity() + ",");
        if (getNotificationType() != null) sb.append("NotificationType: " + getNotificationType() + ",");
        if (getSnsTopic() != null) sb.append("SnsTopic: " + getSnsTopic() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIdentity() == null) ? 0 : getIdentity().hashCode()); 
        hashCode = prime * hashCode + ((getNotificationType() == null) ? 0 : getNotificationType().hashCode()); 
        hashCode = prime * hashCode + ((getSnsTopic() == null) ? 0 : getSnsTopic().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SetIdentityNotificationTopicRequest == false) return false;
        SetIdentityNotificationTopicRequest other = (SetIdentityNotificationTopicRequest)obj;
        
        if (other.getIdentity() == null ^ this.getIdentity() == null) return false;
        if (other.getIdentity() != null && other.getIdentity().equals(this.getIdentity()) == false) return false; 
        if (other.getNotificationType() == null ^ this.getNotificationType() == null) return false;
        if (other.getNotificationType() != null && other.getNotificationType().equals(this.getNotificationType()) == false) return false; 
        if (other.getSnsTopic() == null ^ this.getSnsTopic() == null) return false;
        if (other.getSnsTopic() != null && other.getSnsTopic().equals(this.getSnsTopic()) == false) return false; 
        return true;
    }
    
}
    