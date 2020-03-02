/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Specifies the configuration and other settings for a message to send to all the endpoints that are associated with a
 * list of users.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/SendUsersMessageRequest" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendUsersMessageRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A map of custom attribute-value pairs. For a push notification, Amazon Pinpoint adds these attributes to the
     * data.pinpoint object in the body of the notification payload. Amazon Pinpoint also provides these attributes in
     * the events that it generates for users-messages deliveries.
     * </p>
     */
    private java.util.Map<String, String> context;
    /**
     * <p>
     * The settings and content for the default message and any default messages that you defined for specific channels.
     * </p>
     */
    private DirectMessageConfiguration messageConfiguration;
    /**
     * <p>
     * The message template to use for the message.
     * </p>
     */
    private TemplateConfiguration templateConfiguration;
    /**
     * <p>
     * The unique identifier for tracing the message. This identifier is visible to message recipients.
     * </p>
     */
    private String traceId;
    /**
     * <p>
     * A map that associates user IDs with EndpointSendConfiguration objects. You can use an EndpointSendConfiguration
     * object to tailor the message for a user by specifying settings such as content overrides and message variables.
     * </p>
     */
    private java.util.Map<String, EndpointSendConfiguration> users;

    /**
     * <p>
     * A map of custom attribute-value pairs. For a push notification, Amazon Pinpoint adds these attributes to the
     * data.pinpoint object in the body of the notification payload. Amazon Pinpoint also provides these attributes in
     * the events that it generates for users-messages deliveries.
     * </p>
     * 
     * @return A map of custom attribute-value pairs. For a push notification, Amazon Pinpoint adds these attributes to
     *         the data.pinpoint object in the body of the notification payload. Amazon Pinpoint also provides these
     *         attributes in the events that it generates for users-messages deliveries.
     */

    public java.util.Map<String, String> getContext() {
        return context;
    }

    /**
     * <p>
     * A map of custom attribute-value pairs. For a push notification, Amazon Pinpoint adds these attributes to the
     * data.pinpoint object in the body of the notification payload. Amazon Pinpoint also provides these attributes in
     * the events that it generates for users-messages deliveries.
     * </p>
     * 
     * @param context
     *        A map of custom attribute-value pairs. For a push notification, Amazon Pinpoint adds these attributes to
     *        the data.pinpoint object in the body of the notification payload. Amazon Pinpoint also provides these
     *        attributes in the events that it generates for users-messages deliveries.
     */

    public void setContext(java.util.Map<String, String> context) {
        this.context = context;
    }

    /**
     * <p>
     * A map of custom attribute-value pairs. For a push notification, Amazon Pinpoint adds these attributes to the
     * data.pinpoint object in the body of the notification payload. Amazon Pinpoint also provides these attributes in
     * the events that it generates for users-messages deliveries.
     * </p>
     * 
     * @param context
     *        A map of custom attribute-value pairs. For a push notification, Amazon Pinpoint adds these attributes to
     *        the data.pinpoint object in the body of the notification payload. Amazon Pinpoint also provides these
     *        attributes in the events that it generates for users-messages deliveries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendUsersMessageRequest withContext(java.util.Map<String, String> context) {
        setContext(context);
        return this;
    }

    /**
     * Add a single Context entry
     *
     * @see SendUsersMessageRequest#withContext
     * @returns a reference to this object so that method calls can be chained together.
     */

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
     * <p>
     * The settings and content for the default message and any default messages that you defined for specific channels.
     * </p>
     * 
     * @param messageConfiguration
     *        The settings and content for the default message and any default messages that you defined for specific
     *        channels.
     */

    public void setMessageConfiguration(DirectMessageConfiguration messageConfiguration) {
        this.messageConfiguration = messageConfiguration;
    }

    /**
     * <p>
     * The settings and content for the default message and any default messages that you defined for specific channels.
     * </p>
     * 
     * @return The settings and content for the default message and any default messages that you defined for specific
     *         channels.
     */

    public DirectMessageConfiguration getMessageConfiguration() {
        return this.messageConfiguration;
    }

    /**
     * <p>
     * The settings and content for the default message and any default messages that you defined for specific channels.
     * </p>
     * 
     * @param messageConfiguration
     *        The settings and content for the default message and any default messages that you defined for specific
     *        channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendUsersMessageRequest withMessageConfiguration(DirectMessageConfiguration messageConfiguration) {
        setMessageConfiguration(messageConfiguration);
        return this;
    }

    /**
     * <p>
     * The message template to use for the message.
     * </p>
     * 
     * @param templateConfiguration
     *        The message template to use for the message.
     */

    public void setTemplateConfiguration(TemplateConfiguration templateConfiguration) {
        this.templateConfiguration = templateConfiguration;
    }

    /**
     * <p>
     * The message template to use for the message.
     * </p>
     * 
     * @return The message template to use for the message.
     */

    public TemplateConfiguration getTemplateConfiguration() {
        return this.templateConfiguration;
    }

    /**
     * <p>
     * The message template to use for the message.
     * </p>
     * 
     * @param templateConfiguration
     *        The message template to use for the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendUsersMessageRequest withTemplateConfiguration(TemplateConfiguration templateConfiguration) {
        setTemplateConfiguration(templateConfiguration);
        return this;
    }

    /**
     * <p>
     * The unique identifier for tracing the message. This identifier is visible to message recipients.
     * </p>
     * 
     * @param traceId
     *        The unique identifier for tracing the message. This identifier is visible to message recipients.
     */

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    /**
     * <p>
     * The unique identifier for tracing the message. This identifier is visible to message recipients.
     * </p>
     * 
     * @return The unique identifier for tracing the message. This identifier is visible to message recipients.
     */

    public String getTraceId() {
        return this.traceId;
    }

    /**
     * <p>
     * The unique identifier for tracing the message. This identifier is visible to message recipients.
     * </p>
     * 
     * @param traceId
     *        The unique identifier for tracing the message. This identifier is visible to message recipients.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendUsersMessageRequest withTraceId(String traceId) {
        setTraceId(traceId);
        return this;
    }

    /**
     * <p>
     * A map that associates user IDs with EndpointSendConfiguration objects. You can use an EndpointSendConfiguration
     * object to tailor the message for a user by specifying settings such as content overrides and message variables.
     * </p>
     * 
     * @return A map that associates user IDs with EndpointSendConfiguration objects. You can use an
     *         EndpointSendConfiguration object to tailor the message for a user by specifying settings such as content
     *         overrides and message variables.
     */

    public java.util.Map<String, EndpointSendConfiguration> getUsers() {
        return users;
    }

    /**
     * <p>
     * A map that associates user IDs with EndpointSendConfiguration objects. You can use an EndpointSendConfiguration
     * object to tailor the message for a user by specifying settings such as content overrides and message variables.
     * </p>
     * 
     * @param users
     *        A map that associates user IDs with EndpointSendConfiguration objects. You can use an
     *        EndpointSendConfiguration object to tailor the message for a user by specifying settings such as content
     *        overrides and message variables.
     */

    public void setUsers(java.util.Map<String, EndpointSendConfiguration> users) {
        this.users = users;
    }

    /**
     * <p>
     * A map that associates user IDs with EndpointSendConfiguration objects. You can use an EndpointSendConfiguration
     * object to tailor the message for a user by specifying settings such as content overrides and message variables.
     * </p>
     * 
     * @param users
     *        A map that associates user IDs with EndpointSendConfiguration objects. You can use an
     *        EndpointSendConfiguration object to tailor the message for a user by specifying settings such as content
     *        overrides and message variables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendUsersMessageRequest withUsers(java.util.Map<String, EndpointSendConfiguration> users) {
        setUsers(users);
        return this;
    }

    /**
     * Add a single Users entry
     *
     * @see SendUsersMessageRequest#withUsers
     * @returns a reference to this object so that method calls can be chained together.
     */

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
        if (getContext() != null)
            sb.append("Context: ").append(getContext()).append(",");
        if (getMessageConfiguration() != null)
            sb.append("MessageConfiguration: ").append(getMessageConfiguration()).append(",");
        if (getTemplateConfiguration() != null)
            sb.append("TemplateConfiguration: ").append(getTemplateConfiguration()).append(",");
        if (getTraceId() != null)
            sb.append("TraceId: ").append(getTraceId()).append(",");
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
        if (other.getTemplateConfiguration() == null ^ this.getTemplateConfiguration() == null)
            return false;
        if (other.getTemplateConfiguration() != null && other.getTemplateConfiguration().equals(this.getTemplateConfiguration()) == false)
            return false;
        if (other.getTraceId() == null ^ this.getTraceId() == null)
            return false;
        if (other.getTraceId() != null && other.getTraceId().equals(this.getTraceId()) == false)
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
        hashCode = prime * hashCode + ((getTemplateConfiguration() == null) ? 0 : getTemplateConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTraceId() == null) ? 0 : getTraceId().hashCode());
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
