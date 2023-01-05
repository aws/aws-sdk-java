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
 * The channel membership preferences for an <code>AppInstanceUser</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ChannelMembershipPreferences"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChannelMembershipPreferences implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The push notification configuration of a message.
     * </p>
     */
    private PushNotificationPreferences pushNotifications;

    /**
     * <p>
     * The push notification configuration of a message.
     * </p>
     * 
     * @param pushNotifications
     *        The push notification configuration of a message.
     */

    public void setPushNotifications(PushNotificationPreferences pushNotifications) {
        this.pushNotifications = pushNotifications;
    }

    /**
     * <p>
     * The push notification configuration of a message.
     * </p>
     * 
     * @return The push notification configuration of a message.
     */

    public PushNotificationPreferences getPushNotifications() {
        return this.pushNotifications;
    }

    /**
     * <p>
     * The push notification configuration of a message.
     * </p>
     * 
     * @param pushNotifications
     *        The push notification configuration of a message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelMembershipPreferences withPushNotifications(PushNotificationPreferences pushNotifications) {
        setPushNotifications(pushNotifications);
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
        if (getPushNotifications() != null)
            sb.append("PushNotifications: ").append(getPushNotifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChannelMembershipPreferences == false)
            return false;
        ChannelMembershipPreferences other = (ChannelMembershipPreferences) obj;
        if (other.getPushNotifications() == null ^ this.getPushNotifications() == null)
            return false;
        if (other.getPushNotifications() != null && other.getPushNotifications().equals(this.getPushNotifications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPushNotifications() == null) ? 0 : getPushNotifications().hashCode());
        return hashCode;
    }

    @Override
    public ChannelMembershipPreferences clone() {
        try {
            return (ChannelMembershipPreferences) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmessaging.model.transform.ChannelMembershipPreferencesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
