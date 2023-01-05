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
 * The push notification configuration of the message.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/PushNotificationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PushNotificationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The title of the push notification.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The body of the push notification.
     * </p>
     */
    private String body;
    /**
     * <p>
     * Enum value that indicates the type of the push notification for a message. <code>DEFAULT</code>: Normal mobile
     * push notification. <code>VOIP</code>: VOIP mobile push notification.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The title of the push notification.
     * </p>
     * 
     * @param title
     *        The title of the push notification.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the push notification.
     * </p>
     * 
     * @return The title of the push notification.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of the push notification.
     * </p>
     * 
     * @param title
     *        The title of the push notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PushNotificationConfiguration withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The body of the push notification.
     * </p>
     * 
     * @param body
     *        The body of the push notification.
     */

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * The body of the push notification.
     * </p>
     * 
     * @return The body of the push notification.
     */

    public String getBody() {
        return this.body;
    }

    /**
     * <p>
     * The body of the push notification.
     * </p>
     * 
     * @param body
     *        The body of the push notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PushNotificationConfiguration withBody(String body) {
        setBody(body);
        return this;
    }

    /**
     * <p>
     * Enum value that indicates the type of the push notification for a message. <code>DEFAULT</code>: Normal mobile
     * push notification. <code>VOIP</code>: VOIP mobile push notification.
     * </p>
     * 
     * @param type
     *        Enum value that indicates the type of the push notification for a message. <code>DEFAULT</code>: Normal
     *        mobile push notification. <code>VOIP</code>: VOIP mobile push notification.
     * @see PushNotificationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Enum value that indicates the type of the push notification for a message. <code>DEFAULT</code>: Normal mobile
     * push notification. <code>VOIP</code>: VOIP mobile push notification.
     * </p>
     * 
     * @return Enum value that indicates the type of the push notification for a message. <code>DEFAULT</code>: Normal
     *         mobile push notification. <code>VOIP</code>: VOIP mobile push notification.
     * @see PushNotificationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Enum value that indicates the type of the push notification for a message. <code>DEFAULT</code>: Normal mobile
     * push notification. <code>VOIP</code>: VOIP mobile push notification.
     * </p>
     * 
     * @param type
     *        Enum value that indicates the type of the push notification for a message. <code>DEFAULT</code>: Normal
     *        mobile push notification. <code>VOIP</code>: VOIP mobile push notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PushNotificationType
     */

    public PushNotificationConfiguration withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Enum value that indicates the type of the push notification for a message. <code>DEFAULT</code>: Normal mobile
     * push notification. <code>VOIP</code>: VOIP mobile push notification.
     * </p>
     * 
     * @param type
     *        Enum value that indicates the type of the push notification for a message. <code>DEFAULT</code>: Normal
     *        mobile push notification. <code>VOIP</code>: VOIP mobile push notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PushNotificationType
     */

    public PushNotificationConfiguration withType(PushNotificationType type) {
        this.type = type.toString();
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
        if (getTitle() != null)
            sb.append("Title: ").append("***Sensitive Data Redacted***").append(",");
        if (getBody() != null)
            sb.append("Body: ").append("***Sensitive Data Redacted***").append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PushNotificationConfiguration == false)
            return false;
        PushNotificationConfiguration other = (PushNotificationConfiguration) obj;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public PushNotificationConfiguration clone() {
        try {
            return (PushNotificationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmessaging.model.transform.PushNotificationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
