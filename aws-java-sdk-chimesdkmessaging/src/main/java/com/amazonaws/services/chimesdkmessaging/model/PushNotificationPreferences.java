/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chimesdkmessaging.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The channel membership preferences for push notification.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/PushNotificationPreferences"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PushNotificationPreferences implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Enum value that indicates which push notifications to send to the requested member of a channel. <code>ALL</code>
     * sends all push notifications, <code>NONE</code> sends no push notifications, <code>FILTERED</code> sends only
     * filtered push notifications.
     * </p>
     */
    private String allowNotifications;
    /**
     * <p>
     * The simple JSON object used to send a subset of a push notification to the requested member.
     * </p>
     */
    private String filterRule;

    /**
     * <p>
     * Enum value that indicates which push notifications to send to the requested member of a channel. <code>ALL</code>
     * sends all push notifications, <code>NONE</code> sends no push notifications, <code>FILTERED</code> sends only
     * filtered push notifications.
     * </p>
     * 
     * @param allowNotifications
     *        Enum value that indicates which push notifications to send to the requested member of a channel.
     *        <code>ALL</code> sends all push notifications, <code>NONE</code> sends no push notifications,
     *        <code>FILTERED</code> sends only filtered push notifications.
     * @see AllowNotifications
     */

    public void setAllowNotifications(String allowNotifications) {
        this.allowNotifications = allowNotifications;
    }

    /**
     * <p>
     * Enum value that indicates which push notifications to send to the requested member of a channel. <code>ALL</code>
     * sends all push notifications, <code>NONE</code> sends no push notifications, <code>FILTERED</code> sends only
     * filtered push notifications.
     * </p>
     * 
     * @return Enum value that indicates which push notifications to send to the requested member of a channel.
     *         <code>ALL</code> sends all push notifications, <code>NONE</code> sends no push notifications,
     *         <code>FILTERED</code> sends only filtered push notifications.
     * @see AllowNotifications
     */

    public String getAllowNotifications() {
        return this.allowNotifications;
    }

    /**
     * <p>
     * Enum value that indicates which push notifications to send to the requested member of a channel. <code>ALL</code>
     * sends all push notifications, <code>NONE</code> sends no push notifications, <code>FILTERED</code> sends only
     * filtered push notifications.
     * </p>
     * 
     * @param allowNotifications
     *        Enum value that indicates which push notifications to send to the requested member of a channel.
     *        <code>ALL</code> sends all push notifications, <code>NONE</code> sends no push notifications,
     *        <code>FILTERED</code> sends only filtered push notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllowNotifications
     */

    public PushNotificationPreferences withAllowNotifications(String allowNotifications) {
        setAllowNotifications(allowNotifications);
        return this;
    }

    /**
     * <p>
     * Enum value that indicates which push notifications to send to the requested member of a channel. <code>ALL</code>
     * sends all push notifications, <code>NONE</code> sends no push notifications, <code>FILTERED</code> sends only
     * filtered push notifications.
     * </p>
     * 
     * @param allowNotifications
     *        Enum value that indicates which push notifications to send to the requested member of a channel.
     *        <code>ALL</code> sends all push notifications, <code>NONE</code> sends no push notifications,
     *        <code>FILTERED</code> sends only filtered push notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllowNotifications
     */

    public PushNotificationPreferences withAllowNotifications(AllowNotifications allowNotifications) {
        this.allowNotifications = allowNotifications.toString();
        return this;
    }

    /**
     * <p>
     * The simple JSON object used to send a subset of a push notification to the requested member.
     * </p>
     * 
     * @param filterRule
     *        The simple JSON object used to send a subset of a push notification to the requested member.
     */

    public void setFilterRule(String filterRule) {
        this.filterRule = filterRule;
    }

    /**
     * <p>
     * The simple JSON object used to send a subset of a push notification to the requested member.
     * </p>
     * 
     * @return The simple JSON object used to send a subset of a push notification to the requested member.
     */

    public String getFilterRule() {
        return this.filterRule;
    }

    /**
     * <p>
     * The simple JSON object used to send a subset of a push notification to the requested member.
     * </p>
     * 
     * @param filterRule
     *        The simple JSON object used to send a subset of a push notification to the requested member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PushNotificationPreferences withFilterRule(String filterRule) {
        setFilterRule(filterRule);
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
        if (getAllowNotifications() != null)
            sb.append("AllowNotifications: ").append(getAllowNotifications()).append(",");
        if (getFilterRule() != null)
            sb.append("FilterRule: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PushNotificationPreferences == false)
            return false;
        PushNotificationPreferences other = (PushNotificationPreferences) obj;
        if (other.getAllowNotifications() == null ^ this.getAllowNotifications() == null)
            return false;
        if (other.getAllowNotifications() != null && other.getAllowNotifications().equals(this.getAllowNotifications()) == false)
            return false;
        if (other.getFilterRule() == null ^ this.getFilterRule() == null)
            return false;
        if (other.getFilterRule() != null && other.getFilterRule().equals(this.getFilterRule()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowNotifications() == null) ? 0 : getAllowNotifications().hashCode());
        hashCode = prime * hashCode + ((getFilterRule() == null) ? 0 : getFilterRule().hashCode());
        return hashCode;
    }

    @Override
    public PushNotificationPreferences clone() {
        try {
            return (PushNotificationPreferences) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmessaging.model.transform.PushNotificationPreferencesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
