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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to set whether Amazon SES includes the original email headers in the Amazon SNS notifications of
 * a specified type. For information about notifications, see the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications-via-sns.html">Amazon SES Developer
 * Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SetIdentityHeadersInNotificationsEnabled"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetIdentityHeadersInNotificationsEnabledRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identity for which to enable or disable headers in notifications. Examples: <code>user@example.com</code>,
     * <code>example.com</code>.
     * </p>
     */
    private String identity;
    /**
     * <p>
     * The notification type for which to enable or disable headers in notifications.
     * </p>
     */
    private String notificationType;
    /**
     * <p>
     * Sets whether Amazon SES includes the original email headers in Amazon SNS notifications of the specified
     * notification type. A value of <code>true</code> specifies that Amazon SES will include headers in notifications,
     * and a value of <code>false</code> specifies that Amazon SES will not include headers in notifications.
     * </p>
     * <p>
     * This value can only be set when <code>NotificationType</code> is already set to use a particular Amazon SNS
     * topic.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The identity for which to enable or disable headers in notifications. Examples: <code>user@example.com</code>,
     * <code>example.com</code>.
     * </p>
     * 
     * @param identity
     *        The identity for which to enable or disable headers in notifications. Examples:
     *        <code>user@example.com</code>, <code>example.com</code>.
     */

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    /**
     * <p>
     * The identity for which to enable or disable headers in notifications. Examples: <code>user@example.com</code>,
     * <code>example.com</code>.
     * </p>
     * 
     * @return The identity for which to enable or disable headers in notifications. Examples:
     *         <code>user@example.com</code>, <code>example.com</code>.
     */

    public String getIdentity() {
        return this.identity;
    }

    /**
     * <p>
     * The identity for which to enable or disable headers in notifications. Examples: <code>user@example.com</code>,
     * <code>example.com</code>.
     * </p>
     * 
     * @param identity
     *        The identity for which to enable or disable headers in notifications. Examples:
     *        <code>user@example.com</code>, <code>example.com</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetIdentityHeadersInNotificationsEnabledRequest withIdentity(String identity) {
        setIdentity(identity);
        return this;
    }

    /**
     * <p>
     * The notification type for which to enable or disable headers in notifications.
     * </p>
     * 
     * @param notificationType
     *        The notification type for which to enable or disable headers in notifications.
     * @see NotificationType
     */

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    /**
     * <p>
     * The notification type for which to enable or disable headers in notifications.
     * </p>
     * 
     * @return The notification type for which to enable or disable headers in notifications.
     * @see NotificationType
     */

    public String getNotificationType() {
        return this.notificationType;
    }

    /**
     * <p>
     * The notification type for which to enable or disable headers in notifications.
     * </p>
     * 
     * @param notificationType
     *        The notification type for which to enable or disable headers in notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationType
     */

    public SetIdentityHeadersInNotificationsEnabledRequest withNotificationType(String notificationType) {
        setNotificationType(notificationType);
        return this;
    }

    /**
     * <p>
     * The notification type for which to enable or disable headers in notifications.
     * </p>
     * 
     * @param notificationType
     *        The notification type for which to enable or disable headers in notifications.
     * @see NotificationType
     */

    public void setNotificationType(NotificationType notificationType) {
        withNotificationType(notificationType);
    }

    /**
     * <p>
     * The notification type for which to enable or disable headers in notifications.
     * </p>
     * 
     * @param notificationType
     *        The notification type for which to enable or disable headers in notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationType
     */

    public SetIdentityHeadersInNotificationsEnabledRequest withNotificationType(NotificationType notificationType) {
        this.notificationType = notificationType.toString();
        return this;
    }

    /**
     * <p>
     * Sets whether Amazon SES includes the original email headers in Amazon SNS notifications of the specified
     * notification type. A value of <code>true</code> specifies that Amazon SES will include headers in notifications,
     * and a value of <code>false</code> specifies that Amazon SES will not include headers in notifications.
     * </p>
     * <p>
     * This value can only be set when <code>NotificationType</code> is already set to use a particular Amazon SNS
     * topic.
     * </p>
     * 
     * @param enabled
     *        Sets whether Amazon SES includes the original email headers in Amazon SNS notifications of the specified
     *        notification type. A value of <code>true</code> specifies that Amazon SES will include headers in
     *        notifications, and a value of <code>false</code> specifies that Amazon SES will not include headers in
     *        notifications.</p>
     *        <p>
     *        This value can only be set when <code>NotificationType</code> is already set to use a particular Amazon
     *        SNS topic.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Sets whether Amazon SES includes the original email headers in Amazon SNS notifications of the specified
     * notification type. A value of <code>true</code> specifies that Amazon SES will include headers in notifications,
     * and a value of <code>false</code> specifies that Amazon SES will not include headers in notifications.
     * </p>
     * <p>
     * This value can only be set when <code>NotificationType</code> is already set to use a particular Amazon SNS
     * topic.
     * </p>
     * 
     * @return Sets whether Amazon SES includes the original email headers in Amazon SNS notifications of the specified
     *         notification type. A value of <code>true</code> specifies that Amazon SES will include headers in
     *         notifications, and a value of <code>false</code> specifies that Amazon SES will not include headers in
     *         notifications.</p>
     *         <p>
     *         This value can only be set when <code>NotificationType</code> is already set to use a particular Amazon
     *         SNS topic.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Sets whether Amazon SES includes the original email headers in Amazon SNS notifications of the specified
     * notification type. A value of <code>true</code> specifies that Amazon SES will include headers in notifications,
     * and a value of <code>false</code> specifies that Amazon SES will not include headers in notifications.
     * </p>
     * <p>
     * This value can only be set when <code>NotificationType</code> is already set to use a particular Amazon SNS
     * topic.
     * </p>
     * 
     * @param enabled
     *        Sets whether Amazon SES includes the original email headers in Amazon SNS notifications of the specified
     *        notification type. A value of <code>true</code> specifies that Amazon SES will include headers in
     *        notifications, and a value of <code>false</code> specifies that Amazon SES will not include headers in
     *        notifications.</p>
     *        <p>
     *        This value can only be set when <code>NotificationType</code> is already set to use a particular Amazon
     *        SNS topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetIdentityHeadersInNotificationsEnabledRequest withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Sets whether Amazon SES includes the original email headers in Amazon SNS notifications of the specified
     * notification type. A value of <code>true</code> specifies that Amazon SES will include headers in notifications,
     * and a value of <code>false</code> specifies that Amazon SES will not include headers in notifications.
     * </p>
     * <p>
     * This value can only be set when <code>NotificationType</code> is already set to use a particular Amazon SNS
     * topic.
     * </p>
     * 
     * @return Sets whether Amazon SES includes the original email headers in Amazon SNS notifications of the specified
     *         notification type. A value of <code>true</code> specifies that Amazon SES will include headers in
     *         notifications, and a value of <code>false</code> specifies that Amazon SES will not include headers in
     *         notifications.</p>
     *         <p>
     *         This value can only be set when <code>NotificationType</code> is already set to use a particular Amazon
     *         SNS topic.
     */

    public Boolean isEnabled() {
        return this.enabled;
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
        if (getIdentity() != null)
            sb.append("Identity: ").append(getIdentity()).append(",");
        if (getNotificationType() != null)
            sb.append("NotificationType: ").append(getNotificationType()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetIdentityHeadersInNotificationsEnabledRequest == false)
            return false;
        SetIdentityHeadersInNotificationsEnabledRequest other = (SetIdentityHeadersInNotificationsEnabledRequest) obj;
        if (other.getIdentity() == null ^ this.getIdentity() == null)
            return false;
        if (other.getIdentity() != null && other.getIdentity().equals(this.getIdentity()) == false)
            return false;
        if (other.getNotificationType() == null ^ this.getNotificationType() == null)
            return false;
        if (other.getNotificationType() != null && other.getNotificationType().equals(this.getNotificationType()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentity() == null) ? 0 : getIdentity().hashCode());
        hashCode = prime * hashCode + ((getNotificationType() == null) ? 0 : getNotificationType().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public SetIdentityHeadersInNotificationsEnabledRequest clone() {
        return (SetIdentityHeadersInNotificationsEnabledRequest) super.clone();
    }

}
