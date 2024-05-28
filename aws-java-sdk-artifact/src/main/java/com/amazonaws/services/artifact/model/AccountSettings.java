/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.artifact.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Account settings for the customer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/artifact-2018-05-10/AccountSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Notification subscription status of the customer.
     * </p>
     */
    private String notificationSubscriptionStatus;

    /**
     * <p>
     * Notification subscription status of the customer.
     * </p>
     * 
     * @param notificationSubscriptionStatus
     *        Notification subscription status of the customer.
     * @see NotificationSubscriptionStatus
     */

    public void setNotificationSubscriptionStatus(String notificationSubscriptionStatus) {
        this.notificationSubscriptionStatus = notificationSubscriptionStatus;
    }

    /**
     * <p>
     * Notification subscription status of the customer.
     * </p>
     * 
     * @return Notification subscription status of the customer.
     * @see NotificationSubscriptionStatus
     */

    public String getNotificationSubscriptionStatus() {
        return this.notificationSubscriptionStatus;
    }

    /**
     * <p>
     * Notification subscription status of the customer.
     * </p>
     * 
     * @param notificationSubscriptionStatus
     *        Notification subscription status of the customer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationSubscriptionStatus
     */

    public AccountSettings withNotificationSubscriptionStatus(String notificationSubscriptionStatus) {
        setNotificationSubscriptionStatus(notificationSubscriptionStatus);
        return this;
    }

    /**
     * <p>
     * Notification subscription status of the customer.
     * </p>
     * 
     * @param notificationSubscriptionStatus
     *        Notification subscription status of the customer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationSubscriptionStatus
     */

    public AccountSettings withNotificationSubscriptionStatus(NotificationSubscriptionStatus notificationSubscriptionStatus) {
        this.notificationSubscriptionStatus = notificationSubscriptionStatus.toString();
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
        if (getNotificationSubscriptionStatus() != null)
            sb.append("NotificationSubscriptionStatus: ").append(getNotificationSubscriptionStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountSettings == false)
            return false;
        AccountSettings other = (AccountSettings) obj;
        if (other.getNotificationSubscriptionStatus() == null ^ this.getNotificationSubscriptionStatus() == null)
            return false;
        if (other.getNotificationSubscriptionStatus() != null
                && other.getNotificationSubscriptionStatus().equals(this.getNotificationSubscriptionStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNotificationSubscriptionStatus() == null) ? 0 : getNotificationSubscriptionStatus().hashCode());
        return hashCode;
    }

    @Override
    public AccountSettings clone() {
        try {
            return (AccountSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.artifact.model.transform.AccountSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
