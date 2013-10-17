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


/**
 * <p>
 * Represents the notification attributes of an identity, including whether a bounce or complaint topic are set, and whether feedback forwarding is
 * enabled.
 * </p>
 */
public class IdentityNotificationAttributes implements Serializable {

    /**
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification
     * Service (SNS) topic where Amazon SES will publish bounce
     * notifications.
     */
    private String bounceTopic;

    /**
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification
     * Service (SNS) topic where Amazon SES will publish complaint
     * notifications.
     */
    private String complaintTopic;

    /**
     * Describes whether Amazon SES will forward feedback as email.
     * <code>true</code> indicates that Amazon SES will forward feedback as
     * email, while <code>false</code> indicates that feedback will be
     * published only to the specified Bounce and Complaint topics.
     */
    private Boolean forwardingEnabled;

    /**
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification
     * Service (SNS) topic where Amazon SES will publish bounce
     * notifications.
     *
     * @return The Amazon Resource Name (ARN) of the Amazon Simple Notification
     *         Service (SNS) topic where Amazon SES will publish bounce
     *         notifications.
     */
    public String getBounceTopic() {
        return bounceTopic;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification
     * Service (SNS) topic where Amazon SES will publish bounce
     * notifications.
     *
     * @param bounceTopic The Amazon Resource Name (ARN) of the Amazon Simple Notification
     *         Service (SNS) topic where Amazon SES will publish bounce
     *         notifications.
     */
    public void setBounceTopic(String bounceTopic) {
        this.bounceTopic = bounceTopic;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification
     * Service (SNS) topic where Amazon SES will publish bounce
     * notifications.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bounceTopic The Amazon Resource Name (ARN) of the Amazon Simple Notification
     *         Service (SNS) topic where Amazon SES will publish bounce
     *         notifications.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public IdentityNotificationAttributes withBounceTopic(String bounceTopic) {
        this.bounceTopic = bounceTopic;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification
     * Service (SNS) topic where Amazon SES will publish complaint
     * notifications.
     *
     * @return The Amazon Resource Name (ARN) of the Amazon Simple Notification
     *         Service (SNS) topic where Amazon SES will publish complaint
     *         notifications.
     */
    public String getComplaintTopic() {
        return complaintTopic;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification
     * Service (SNS) topic where Amazon SES will publish complaint
     * notifications.
     *
     * @param complaintTopic The Amazon Resource Name (ARN) of the Amazon Simple Notification
     *         Service (SNS) topic where Amazon SES will publish complaint
     *         notifications.
     */
    public void setComplaintTopic(String complaintTopic) {
        this.complaintTopic = complaintTopic;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification
     * Service (SNS) topic where Amazon SES will publish complaint
     * notifications.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param complaintTopic The Amazon Resource Name (ARN) of the Amazon Simple Notification
     *         Service (SNS) topic where Amazon SES will publish complaint
     *         notifications.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public IdentityNotificationAttributes withComplaintTopic(String complaintTopic) {
        this.complaintTopic = complaintTopic;
        return this;
    }

    /**
     * Describes whether Amazon SES will forward feedback as email.
     * <code>true</code> indicates that Amazon SES will forward feedback as
     * email, while <code>false</code> indicates that feedback will be
     * published only to the specified Bounce and Complaint topics.
     *
     * @return Describes whether Amazon SES will forward feedback as email.
     *         <code>true</code> indicates that Amazon SES will forward feedback as
     *         email, while <code>false</code> indicates that feedback will be
     *         published only to the specified Bounce and Complaint topics.
     */
    public Boolean isForwardingEnabled() {
        return forwardingEnabled;
    }
    
    /**
     * Describes whether Amazon SES will forward feedback as email.
     * <code>true</code> indicates that Amazon SES will forward feedback as
     * email, while <code>false</code> indicates that feedback will be
     * published only to the specified Bounce and Complaint topics.
     *
     * @param forwardingEnabled Describes whether Amazon SES will forward feedback as email.
     *         <code>true</code> indicates that Amazon SES will forward feedback as
     *         email, while <code>false</code> indicates that feedback will be
     *         published only to the specified Bounce and Complaint topics.
     */
    public void setForwardingEnabled(Boolean forwardingEnabled) {
        this.forwardingEnabled = forwardingEnabled;
    }
    
    /**
     * Describes whether Amazon SES will forward feedback as email.
     * <code>true</code> indicates that Amazon SES will forward feedback as
     * email, while <code>false</code> indicates that feedback will be
     * published only to the specified Bounce and Complaint topics.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param forwardingEnabled Describes whether Amazon SES will forward feedback as email.
     *         <code>true</code> indicates that Amazon SES will forward feedback as
     *         email, while <code>false</code> indicates that feedback will be
     *         published only to the specified Bounce and Complaint topics.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public IdentityNotificationAttributes withForwardingEnabled(Boolean forwardingEnabled) {
        this.forwardingEnabled = forwardingEnabled;
        return this;
    }

    /**
     * Describes whether Amazon SES will forward feedback as email.
     * <code>true</code> indicates that Amazon SES will forward feedback as
     * email, while <code>false</code> indicates that feedback will be
     * published only to the specified Bounce and Complaint topics.
     *
     * @return Describes whether Amazon SES will forward feedback as email.
     *         <code>true</code> indicates that Amazon SES will forward feedback as
     *         email, while <code>false</code> indicates that feedback will be
     *         published only to the specified Bounce and Complaint topics.
     */
    public Boolean getForwardingEnabled() {
        return forwardingEnabled;
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
        if (getBounceTopic() != null) sb.append("BounceTopic: " + getBounceTopic() + ",");
        if (getComplaintTopic() != null) sb.append("ComplaintTopic: " + getComplaintTopic() + ",");
        if (isForwardingEnabled() != null) sb.append("ForwardingEnabled: " + isForwardingEnabled() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getBounceTopic() == null) ? 0 : getBounceTopic().hashCode()); 
        hashCode = prime * hashCode + ((getComplaintTopic() == null) ? 0 : getComplaintTopic().hashCode()); 
        hashCode = prime * hashCode + ((isForwardingEnabled() == null) ? 0 : isForwardingEnabled().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof IdentityNotificationAttributes == false) return false;
        IdentityNotificationAttributes other = (IdentityNotificationAttributes)obj;
        
        if (other.getBounceTopic() == null ^ this.getBounceTopic() == null) return false;
        if (other.getBounceTopic() != null && other.getBounceTopic().equals(this.getBounceTopic()) == false) return false; 
        if (other.getComplaintTopic() == null ^ this.getComplaintTopic() == null) return false;
        if (other.getComplaintTopic() != null && other.getComplaintTopic().equals(this.getComplaintTopic()) == false) return false; 
        if (other.isForwardingEnabled() == null ^ this.isForwardingEnabled() == null) return false;
        if (other.isForwardingEnabled() != null && other.isForwardingEnabled().equals(this.isForwardingEnabled()) == false) return false; 
        return true;
    }
    
}
    