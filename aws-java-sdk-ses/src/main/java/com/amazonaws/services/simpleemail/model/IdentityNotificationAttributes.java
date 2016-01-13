/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
 * Represents the notification attributes of an identity, including whether an
 * identity has Amazon Simple Notification Service (Amazon SNS) topics set for
 * bounce, complaint, and/or delivery notifications, and whether feedback
 * forwarding is enabled for bounce and complaint notifications.
 * </p>
 */
public class IdentityNotificationAttributes implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic where Amazon SES
     * will publish bounce notifications.
     * </p>
     */
    private String bounceTopic;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic where Amazon SES
     * will publish complaint notifications.
     * </p>
     */
    private String complaintTopic;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic where Amazon SES
     * will publish delivery notifications.
     * </p>
     */
    private String deliveryTopic;
    /**
     * <p>
     * Describes whether Amazon SES will forward bounce and complaint
     * notifications as email. <code>true</code> indicates that Amazon SES will
     * forward bounce and complaint notifications as email, while
     * <code>false</code> indicates that bounce and complaint notifications will
     * be published only to the specified bounce and complaint Amazon SNS
     * topics.
     * </p>
     */
    private Boolean forwardingEnabled;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic where Amazon SES
     * will publish bounce notifications.
     * </p>
     * 
     * @param bounceTopic
     *        The Amazon Resource Name (ARN) of the Amazon SNS topic where
     *        Amazon SES will publish bounce notifications.
     */
    public void setBounceTopic(String bounceTopic) {
        this.bounceTopic = bounceTopic;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic where Amazon SES
     * will publish bounce notifications.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon SNS topic where
     *         Amazon SES will publish bounce notifications.
     */
    public String getBounceTopic() {
        return this.bounceTopic;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic where Amazon SES
     * will publish bounce notifications.
     * </p>
     * 
     * @param bounceTopic
     *        The Amazon Resource Name (ARN) of the Amazon SNS topic where
     *        Amazon SES will publish bounce notifications.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public IdentityNotificationAttributes withBounceTopic(String bounceTopic) {
        setBounceTopic(bounceTopic);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic where Amazon SES
     * will publish complaint notifications.
     * </p>
     * 
     * @param complaintTopic
     *        The Amazon Resource Name (ARN) of the Amazon SNS topic where
     *        Amazon SES will publish complaint notifications.
     */
    public void setComplaintTopic(String complaintTopic) {
        this.complaintTopic = complaintTopic;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic where Amazon SES
     * will publish complaint notifications.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon SNS topic where
     *         Amazon SES will publish complaint notifications.
     */
    public String getComplaintTopic() {
        return this.complaintTopic;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic where Amazon SES
     * will publish complaint notifications.
     * </p>
     * 
     * @param complaintTopic
     *        The Amazon Resource Name (ARN) of the Amazon SNS topic where
     *        Amazon SES will publish complaint notifications.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public IdentityNotificationAttributes withComplaintTopic(
            String complaintTopic) {
        setComplaintTopic(complaintTopic);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic where Amazon SES
     * will publish delivery notifications.
     * </p>
     * 
     * @param deliveryTopic
     *        The Amazon Resource Name (ARN) of the Amazon SNS topic where
     *        Amazon SES will publish delivery notifications.
     */
    public void setDeliveryTopic(String deliveryTopic) {
        this.deliveryTopic = deliveryTopic;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic where Amazon SES
     * will publish delivery notifications.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon SNS topic where
     *         Amazon SES will publish delivery notifications.
     */
    public String getDeliveryTopic() {
        return this.deliveryTopic;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic where Amazon SES
     * will publish delivery notifications.
     * </p>
     * 
     * @param deliveryTopic
     *        The Amazon Resource Name (ARN) of the Amazon SNS topic where
     *        Amazon SES will publish delivery notifications.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public IdentityNotificationAttributes withDeliveryTopic(String deliveryTopic) {
        setDeliveryTopic(deliveryTopic);
        return this;
    }

    /**
     * <p>
     * Describes whether Amazon SES will forward bounce and complaint
     * notifications as email. <code>true</code> indicates that Amazon SES will
     * forward bounce and complaint notifications as email, while
     * <code>false</code> indicates that bounce and complaint notifications will
     * be published only to the specified bounce and complaint Amazon SNS
     * topics.
     * </p>
     * 
     * @param forwardingEnabled
     *        Describes whether Amazon SES will forward bounce and complaint
     *        notifications as email. <code>true</code> indicates that Amazon
     *        SES will forward bounce and complaint notifications as email,
     *        while <code>false</code> indicates that bounce and complaint
     *        notifications will be published only to the specified bounce and
     *        complaint Amazon SNS topics.
     */
    public void setForwardingEnabled(Boolean forwardingEnabled) {
        this.forwardingEnabled = forwardingEnabled;
    }

    /**
     * <p>
     * Describes whether Amazon SES will forward bounce and complaint
     * notifications as email. <code>true</code> indicates that Amazon SES will
     * forward bounce and complaint notifications as email, while
     * <code>false</code> indicates that bounce and complaint notifications will
     * be published only to the specified bounce and complaint Amazon SNS
     * topics.
     * </p>
     * 
     * @return Describes whether Amazon SES will forward bounce and complaint
     *         notifications as email. <code>true</code> indicates that Amazon
     *         SES will forward bounce and complaint notifications as email,
     *         while <code>false</code> indicates that bounce and complaint
     *         notifications will be published only to the specified bounce and
     *         complaint Amazon SNS topics.
     */
    public Boolean getForwardingEnabled() {
        return this.forwardingEnabled;
    }

    /**
     * <p>
     * Describes whether Amazon SES will forward bounce and complaint
     * notifications as email. <code>true</code> indicates that Amazon SES will
     * forward bounce and complaint notifications as email, while
     * <code>false</code> indicates that bounce and complaint notifications will
     * be published only to the specified bounce and complaint Amazon SNS
     * topics.
     * </p>
     * 
     * @param forwardingEnabled
     *        Describes whether Amazon SES will forward bounce and complaint
     *        notifications as email. <code>true</code> indicates that Amazon
     *        SES will forward bounce and complaint notifications as email,
     *        while <code>false</code> indicates that bounce and complaint
     *        notifications will be published only to the specified bounce and
     *        complaint Amazon SNS topics.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public IdentityNotificationAttributes withForwardingEnabled(
            Boolean forwardingEnabled) {
        setForwardingEnabled(forwardingEnabled);
        return this;
    }

    /**
     * <p>
     * Describes whether Amazon SES will forward bounce and complaint
     * notifications as email. <code>true</code> indicates that Amazon SES will
     * forward bounce and complaint notifications as email, while
     * <code>false</code> indicates that bounce and complaint notifications will
     * be published only to the specified bounce and complaint Amazon SNS
     * topics.
     * </p>
     * 
     * @return Describes whether Amazon SES will forward bounce and complaint
     *         notifications as email. <code>true</code> indicates that Amazon
     *         SES will forward bounce and complaint notifications as email,
     *         while <code>false</code> indicates that bounce and complaint
     *         notifications will be published only to the specified bounce and
     *         complaint Amazon SNS topics.
     */
    public Boolean isForwardingEnabled() {
        return this.forwardingEnabled;
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
        if (getBounceTopic() != null)
            sb.append("BounceTopic: " + getBounceTopic() + ",");
        if (getComplaintTopic() != null)
            sb.append("ComplaintTopic: " + getComplaintTopic() + ",");
        if (getDeliveryTopic() != null)
            sb.append("DeliveryTopic: " + getDeliveryTopic() + ",");
        if (getForwardingEnabled() != null)
            sb.append("ForwardingEnabled: " + getForwardingEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IdentityNotificationAttributes == false)
            return false;
        IdentityNotificationAttributes other = (IdentityNotificationAttributes) obj;
        if (other.getBounceTopic() == null ^ this.getBounceTopic() == null)
            return false;
        if (other.getBounceTopic() != null
                && other.getBounceTopic().equals(this.getBounceTopic()) == false)
            return false;
        if (other.getComplaintTopic() == null
                ^ this.getComplaintTopic() == null)
            return false;
        if (other.getComplaintTopic() != null
                && other.getComplaintTopic().equals(this.getComplaintTopic()) == false)
            return false;
        if (other.getDeliveryTopic() == null ^ this.getDeliveryTopic() == null)
            return false;
        if (other.getDeliveryTopic() != null
                && other.getDeliveryTopic().equals(this.getDeliveryTopic()) == false)
            return false;
        if (other.getForwardingEnabled() == null
                ^ this.getForwardingEnabled() == null)
            return false;
        if (other.getForwardingEnabled() != null
                && other.getForwardingEnabled().equals(
                        this.getForwardingEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getBounceTopic() == null) ? 0 : getBounceTopic().hashCode());
        hashCode = prime
                * hashCode
                + ((getComplaintTopic() == null) ? 0 : getComplaintTopic()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDeliveryTopic() == null) ? 0 : getDeliveryTopic()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getForwardingEnabled() == null) ? 0
                        : getForwardingEnabled().hashCode());
        return hashCode;
    }

    @Override
    public IdentityNotificationAttributes clone() {
        try {
            return (IdentityNotificationAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}