/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Send message request.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/SendUsersMessageRequest" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendUsersMessageRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * A map of custom attributes to attributes to be attached to the message. This payload is added to the push
     * notification's 'data.pinpoint' object or added to the email/sms delivery receipt event attributes.
     */
    private java.util.Map<String, String> context;
    /** Message configuration. */
    private DirectMessageConfiguration messageConfiguration;
    /** A map of destination endpoints, with the EndpointId as the key Endpoint Message Configuration as the value. */
    private java.util.Map<String, EndpointSendConfiguration> users;

    /**
     * A map of custom attributes to attributes to be attached to the message. This payload is added to the push
     * notification's 'data.pinpoint' object or added to the email/sms delivery receipt event attributes.
     * 
     * @return A map of custom attributes to attributes to be attached to the message. This payload is added to the push
     *         notification's 'data.pinpoint' object or added to the email/sms delivery receipt event attributes.
     */

    public java.util.Map<String, String> getContext() {
        return context;
    }

    /**
     * A map of custom attributes to attributes to be attached to the message. This payload is added to the push
     * notification's 'data.pinpoint' object or added to the email/sms delivery receipt event attributes.
     * 
     * @param context
     *        A map of custom attributes to attributes to be attached to the message. This payload is added to the push
     *        notification's 'data.pinpoint' object or added to the email/sms delivery receipt event attributes.
     */

    public void setContext(java.util.Map<String, String> context) {
        this.context = context;
    }

    /**
     * A map of custom attributes to attributes to be attached to the message. This payload is added to the push
     * notification's 'data.pinpoint' object or added to the email/sms delivery receipt event attributes.
     * 
     * @param context
     *        A map of custom attributes to attributes to be attached to the message. This payload is added to the push
     *        notification's 'data.pinpoint' object or added to the email/sms delivery receipt event attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendUsersMessageRequest withContext(java.util.Map<String, String> context) {
        setContext(context);
        return this;
    }

    public SendUsersMessageRequest addContextEntry(String key, String value) {
        if (null == this.context) {
            this.context = new java.util.HashMap<String, String>();
        }
        if (this.context.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.context.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Context.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendUsersMessageRequest clearContextEntries() {
        this.context = null;
        return this;
    }

    /**
     * Message configuration.
     * 
     * @param messageConfiguration
     *        Message configuration.
     */

    public void setMessageConfiguration(DirectMessageConfiguration messageConfiguration) {
        this.messageConfiguration = messageConfiguration;
    }

    /**
     * Message configuration.
     * 
     * @return Message configuration.
     */

    public DirectMessageConfiguration getMessageConfiguration() {
        return this.messageConfiguration;
    }

    /**
     * Message configuration.
     * 
     * @param messageConfiguration
     *        Message configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendUsersMessageRequest withMessageConfiguration(DirectMessageConfiguration messageConfiguration) {
        setMessageConfiguration(messageConfiguration);
        return this;
    }

    /**
     * A map of destination endpoints, with the EndpointId as the key Endpoint Message Configuration as the value.
     * 
     * @return A map of destination endpoints, with the EndpointId as the key Endpoint Message Configuration as the
     *         value.
     */

    public java.util.Map<String, EndpointSendConfiguration> getUsers() {
        return users;
    }

    /**
     * A map of destination endpoints, with the EndpointId as the key Endpoint Message Configuration as the value.
     * 
     * @param users
     *        A map of destination endpoints, with the EndpointId as the key Endpoint Message Configuration as the
     *        value.
     */

    public void setUsers(java.util.Map<String, EndpointSendConfiguration> users) {
        this.users = users;
    }

    /**
     * A map of destination endpoints, with the EndpointId as the key Endpoint Message Configuration as the value.
     * 
     * @param users
     *        A map of destination endpoints, with the EndpointId as the key Endpoint Message Configuration as the
     *        value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendUsersMessageRequest withUsers(java.util.Map<String, EndpointSendConfiguration> users) {
        setUsers(users);
        return this;
    }

    public SendUsersMessageRequest addUsersEntry(String key, EndpointSendConfiguration value) {
        if (null == this.users) {
            this.users = new java.util.HashMap<String, EndpointSendConfiguration>();
        }
        if (this.users.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.users.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Users.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendUsersMessageRequest clearUsersEntries() {
        this.users = null;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getContext() != null)
            sb.append("Context: ").append(getContext()).append(",");
        if (getMessageConfiguration() != null)
            sb.append("MessageConfiguration: ").append(getMessageConfiguration()).append(",");
        if (getUsers() != null)
            sb.append("Users: ").append(getUsers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendUsersMessageRequest == false)
            return false;
        SendUsersMessageRequest other = (SendUsersMessageRequest) obj;
        if (other.getContext() == null ^ this.getContext() == null)
            return false;
        if (other.getContext() != null && other.getContext().equals(this.getContext()) == false)
            return false;
        if (other.getMessageConfiguration() == null ^ this.getMessageConfiguration() == null)
            return false;
        if (other.getMessageConfiguration() != null && other.getMessageConfiguration().equals(this.getMessageConfiguration()) == false)
            return false;
        if (other.getUsers() == null ^ this.getUsers() == null)
            return false;
        if (other.getUsers() != null && other.getUsers().equals(this.getUsers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContext() == null) ? 0 : getContext().hashCode());
        hashCode = prime * hashCode + ((getMessageConfiguration() == null) ? 0 : getMessageConfiguration().hashCode());
        hashCode = prime * hashCode + ((getUsers() == null) ? 0 : getUsers().hashCode());
        return hashCode;
    }

    @Override
    public SendUsersMessageRequest clone() {
        try {
            return (SendUsersMessageRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.SendUsersMessageRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
