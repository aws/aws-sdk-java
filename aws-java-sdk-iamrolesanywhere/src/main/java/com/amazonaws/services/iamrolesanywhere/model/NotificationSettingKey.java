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
package com.amazonaws.services.iamrolesanywhere.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A notification setting key to reset. A notification setting key includes the event and the channel.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/NotificationSettingKey"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotificationSettingKey implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The specified channel of notification.
     * </p>
     */
    private String channel;
    /**
     * <p>
     * The notification setting event to reset.
     * </p>
     */
    private String event;

    /**
     * <p>
     * The specified channel of notification.
     * </p>
     * 
     * @param channel
     *        The specified channel of notification.
     * @see NotificationChannel
     */

    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * <p>
     * The specified channel of notification.
     * </p>
     * 
     * @return The specified channel of notification.
     * @see NotificationChannel
     */

    public String getChannel() {
        return this.channel;
    }

    /**
     * <p>
     * The specified channel of notification.
     * </p>
     * 
     * @param channel
     *        The specified channel of notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationChannel
     */

    public NotificationSettingKey withChannel(String channel) {
        setChannel(channel);
        return this;
    }

    /**
     * <p>
     * The specified channel of notification.
     * </p>
     * 
     * @param channel
     *        The specified channel of notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationChannel
     */

    public NotificationSettingKey withChannel(NotificationChannel channel) {
        this.channel = channel.toString();
        return this;
    }

    /**
     * <p>
     * The notification setting event to reset.
     * </p>
     * 
     * @param event
     *        The notification setting event to reset.
     * @see NotificationEvent
     */

    public void setEvent(String event) {
        this.event = event;
    }

    /**
     * <p>
     * The notification setting event to reset.
     * </p>
     * 
     * @return The notification setting event to reset.
     * @see NotificationEvent
     */

    public String getEvent() {
        return this.event;
    }

    /**
     * <p>
     * The notification setting event to reset.
     * </p>
     * 
     * @param event
     *        The notification setting event to reset.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationEvent
     */

    public NotificationSettingKey withEvent(String event) {
        setEvent(event);
        return this;
    }

    /**
     * <p>
     * The notification setting event to reset.
     * </p>
     * 
     * @param event
     *        The notification setting event to reset.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationEvent
     */

    public NotificationSettingKey withEvent(NotificationEvent event) {
        this.event = event.toString();
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
        if (getChannel() != null)
            sb.append("Channel: ").append(getChannel()).append(",");
        if (getEvent() != null)
            sb.append("Event: ").append(getEvent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotificationSettingKey == false)
            return false;
        NotificationSettingKey other = (NotificationSettingKey) obj;
        if (other.getChannel() == null ^ this.getChannel() == null)
            return false;
        if (other.getChannel() != null && other.getChannel().equals(this.getChannel()) == false)
            return false;
        if (other.getEvent() == null ^ this.getEvent() == null)
            return false;
        if (other.getEvent() != null && other.getEvent().equals(this.getEvent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannel() == null) ? 0 : getChannel().hashCode());
        hashCode = prime * hashCode + ((getEvent() == null) ? 0 : getEvent().hashCode());
        return hashCode;
    }

    @Override
    public NotificationSettingKey clone() {
        try {
            return (NotificationSettingKey) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iamrolesanywhere.model.transform.NotificationSettingKeyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
