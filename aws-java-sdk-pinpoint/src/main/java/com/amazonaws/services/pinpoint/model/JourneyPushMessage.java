/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the message configuration for a push notification that's sent to participants in a journey.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/JourneyPushMessage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JourneyPushMessage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of seconds that the push notification service should keep the message, if the service is unable to
     * deliver the notification the first time. This value is converted to an expiration value when it's sent to a
     * push-notification service. If this value is 0, the service treats the notification as if it expires immediately
     * and the service doesn't store or try to deliver the notification again.
     * </p>
     * <p>
     * This value doesn't apply to messages that are sent through the Amazon Device Messaging (ADM) service.
     * </p>
     */
    private String timeToLive;

    /**
     * <p>
     * The number of seconds that the push notification service should keep the message, if the service is unable to
     * deliver the notification the first time. This value is converted to an expiration value when it's sent to a
     * push-notification service. If this value is 0, the service treats the notification as if it expires immediately
     * and the service doesn't store or try to deliver the notification again.
     * </p>
     * <p>
     * This value doesn't apply to messages that are sent through the Amazon Device Messaging (ADM) service.
     * </p>
     * 
     * @param timeToLive
     *        The number of seconds that the push notification service should keep the message, if the service is unable
     *        to deliver the notification the first time. This value is converted to an expiration value when it's sent
     *        to a push-notification service. If this value is 0, the service treats the notification as if it expires
     *        immediately and the service doesn't store or try to deliver the notification again.</p>
     *        <p>
     *        This value doesn't apply to messages that are sent through the Amazon Device Messaging (ADM) service.
     */

    public void setTimeToLive(String timeToLive) {
        this.timeToLive = timeToLive;
    }

    /**
     * <p>
     * The number of seconds that the push notification service should keep the message, if the service is unable to
     * deliver the notification the first time. This value is converted to an expiration value when it's sent to a
     * push-notification service. If this value is 0, the service treats the notification as if it expires immediately
     * and the service doesn't store or try to deliver the notification again.
     * </p>
     * <p>
     * This value doesn't apply to messages that are sent through the Amazon Device Messaging (ADM) service.
     * </p>
     * 
     * @return The number of seconds that the push notification service should keep the message, if the service is
     *         unable to deliver the notification the first time. This value is converted to an expiration value when
     *         it's sent to a push-notification service. If this value is 0, the service treats the notification as if
     *         it expires immediately and the service doesn't store or try to deliver the notification again.</p>
     *         <p>
     *         This value doesn't apply to messages that are sent through the Amazon Device Messaging (ADM) service.
     */

    public String getTimeToLive() {
        return this.timeToLive;
    }

    /**
     * <p>
     * The number of seconds that the push notification service should keep the message, if the service is unable to
     * deliver the notification the first time. This value is converted to an expiration value when it's sent to a
     * push-notification service. If this value is 0, the service treats the notification as if it expires immediately
     * and the service doesn't store or try to deliver the notification again.
     * </p>
     * <p>
     * This value doesn't apply to messages that are sent through the Amazon Device Messaging (ADM) service.
     * </p>
     * 
     * @param timeToLive
     *        The number of seconds that the push notification service should keep the message, if the service is unable
     *        to deliver the notification the first time. This value is converted to an expiration value when it's sent
     *        to a push-notification service. If this value is 0, the service treats the notification as if it expires
     *        immediately and the service doesn't store or try to deliver the notification again.</p>
     *        <p>
     *        This value doesn't apply to messages that are sent through the Amazon Device Messaging (ADM) service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JourneyPushMessage withTimeToLive(String timeToLive) {
        setTimeToLive(timeToLive);
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
        if (getTimeToLive() != null)
            sb.append("TimeToLive: ").append(getTimeToLive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JourneyPushMessage == false)
            return false;
        JourneyPushMessage other = (JourneyPushMessage) obj;
        if (other.getTimeToLive() == null ^ this.getTimeToLive() == null)
            return false;
        if (other.getTimeToLive() != null && other.getTimeToLive().equals(this.getTimeToLive()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimeToLive() == null) ? 0 : getTimeToLive().hashCode());
        return hashCode;
    }

    @Override
    public JourneyPushMessage clone() {
        try {
            return (JourneyPushMessage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.JourneyPushMessageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
