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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Payload of chat properties to apply when starting a new contact.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/NewSessionDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NewSessionDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The supported chat message content types. Supported types are <code>text/plain</code>, <code>text/markdown</code>, <code>application/json</code>, <code>application/vnd.amazonaws.connect.message.interactive</code>, and
     * <code>application/vnd.amazonaws.connect.message.interactive.response</code>.
     * </p>
     * <p>
     * Content types must always contain <code> text/plain</code>. You can then put any other supported type in the
     * list. For example, all the following lists are valid because they contain <code>text/plain</code>:
     * <code>[text/plain, text/markdown, application/json]</code>, <code> [text/markdown, text/plain]</code>,
     * <code>[text/plain, application/json, application/vnd.amazonaws.connect.message.interactive.response]</code>.
     * </p>
     */
    private java.util.List<String> supportedMessagingContentTypes;

    private ParticipantDetails participantDetails;
    /**
     * <p>
     * A custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes. They can
     * be accessed in flows just like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include only
     * alphanumeric, dash, and underscore characters.
     * </p>
     */
    private java.util.Map<String, String> attributes;

    private ChatStreamingConfiguration streamingConfiguration;

    /**
     * <p>
     * The supported chat message content types. Supported types are <code>text/plain</code>, <code>text/markdown</code>, <code>application/json</code>, <code>application/vnd.amazonaws.connect.message.interactive</code>, and
     * <code>application/vnd.amazonaws.connect.message.interactive.response</code>.
     * </p>
     * <p>
     * Content types must always contain <code> text/plain</code>. You can then put any other supported type in the
     * list. For example, all the following lists are valid because they contain <code>text/plain</code>:
     * <code>[text/plain, text/markdown, application/json]</code>, <code> [text/markdown, text/plain]</code>,
     * <code>[text/plain, application/json, application/vnd.amazonaws.connect.message.interactive.response]</code>.
     * </p>
     * 
     * @return The supported chat message content types. Supported types are <code>text/plain</code>,
     *         <code>text/markdown</code>, <code>application/json</code>,
     *         <code>application/vnd.amazonaws.connect.message.interactive</code>, and
     *         <code>application/vnd.amazonaws.connect.message.interactive.response</code>. </p>
     *         <p>
     *         Content types must always contain <code> text/plain</code>. You can then put any other supported type in
     *         the list. For example, all the following lists are valid because they contain <code>text/plain</code>:
     *         <code>[text/plain, text/markdown, application/json]</code>, <code> [text/markdown, text/plain]</code>,
     *         <code>[text/plain, application/json, application/vnd.amazonaws.connect.message.interactive.response]</code>.
     */

    public java.util.List<String> getSupportedMessagingContentTypes() {
        return supportedMessagingContentTypes;
    }

    /**
     * <p>
     * The supported chat message content types. Supported types are <code>text/plain</code>, <code>text/markdown</code>, <code>application/json</code>, <code>application/vnd.amazonaws.connect.message.interactive</code>, and
     * <code>application/vnd.amazonaws.connect.message.interactive.response</code>.
     * </p>
     * <p>
     * Content types must always contain <code> text/plain</code>. You can then put any other supported type in the
     * list. For example, all the following lists are valid because they contain <code>text/plain</code>:
     * <code>[text/plain, text/markdown, application/json]</code>, <code> [text/markdown, text/plain]</code>,
     * <code>[text/plain, application/json, application/vnd.amazonaws.connect.message.interactive.response]</code>.
     * </p>
     * 
     * @param supportedMessagingContentTypes
     *        The supported chat message content types. Supported types are <code>text/plain</code>,
     *        <code>text/markdown</code>, <code>application/json</code>,
     *        <code>application/vnd.amazonaws.connect.message.interactive</code>, and
     *        <code>application/vnd.amazonaws.connect.message.interactive.response</code>. </p>
     *        <p>
     *        Content types must always contain <code> text/plain</code>. You can then put any other supported type in
     *        the list. For example, all the following lists are valid because they contain <code>text/plain</code>:
     *        <code>[text/plain, text/markdown, application/json]</code>, <code> [text/markdown, text/plain]</code>,
     *        <code>[text/plain, application/json, application/vnd.amazonaws.connect.message.interactive.response]</code>.
     */

    public void setSupportedMessagingContentTypes(java.util.Collection<String> supportedMessagingContentTypes) {
        if (supportedMessagingContentTypes == null) {
            this.supportedMessagingContentTypes = null;
            return;
        }

        this.supportedMessagingContentTypes = new java.util.ArrayList<String>(supportedMessagingContentTypes);
    }

    /**
     * <p>
     * The supported chat message content types. Supported types are <code>text/plain</code>, <code>text/markdown</code>, <code>application/json</code>, <code>application/vnd.amazonaws.connect.message.interactive</code>, and
     * <code>application/vnd.amazonaws.connect.message.interactive.response</code>.
     * </p>
     * <p>
     * Content types must always contain <code> text/plain</code>. You can then put any other supported type in the
     * list. For example, all the following lists are valid because they contain <code>text/plain</code>:
     * <code>[text/plain, text/markdown, application/json]</code>, <code> [text/markdown, text/plain]</code>,
     * <code>[text/plain, application/json, application/vnd.amazonaws.connect.message.interactive.response]</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedMessagingContentTypes(java.util.Collection)} or
     * {@link #withSupportedMessagingContentTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedMessagingContentTypes
     *        The supported chat message content types. Supported types are <code>text/plain</code>,
     *        <code>text/markdown</code>, <code>application/json</code>,
     *        <code>application/vnd.amazonaws.connect.message.interactive</code>, and
     *        <code>application/vnd.amazonaws.connect.message.interactive.response</code>. </p>
     *        <p>
     *        Content types must always contain <code> text/plain</code>. You can then put any other supported type in
     *        the list. For example, all the following lists are valid because they contain <code>text/plain</code>:
     *        <code>[text/plain, text/markdown, application/json]</code>, <code> [text/markdown, text/plain]</code>,
     *        <code>[text/plain, application/json, application/vnd.amazonaws.connect.message.interactive.response]</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewSessionDetails withSupportedMessagingContentTypes(String... supportedMessagingContentTypes) {
        if (this.supportedMessagingContentTypes == null) {
            setSupportedMessagingContentTypes(new java.util.ArrayList<String>(supportedMessagingContentTypes.length));
        }
        for (String ele : supportedMessagingContentTypes) {
            this.supportedMessagingContentTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The supported chat message content types. Supported types are <code>text/plain</code>, <code>text/markdown</code>, <code>application/json</code>, <code>application/vnd.amazonaws.connect.message.interactive</code>, and
     * <code>application/vnd.amazonaws.connect.message.interactive.response</code>.
     * </p>
     * <p>
     * Content types must always contain <code> text/plain</code>. You can then put any other supported type in the
     * list. For example, all the following lists are valid because they contain <code>text/plain</code>:
     * <code>[text/plain, text/markdown, application/json]</code>, <code> [text/markdown, text/plain]</code>,
     * <code>[text/plain, application/json, application/vnd.amazonaws.connect.message.interactive.response]</code>.
     * </p>
     * 
     * @param supportedMessagingContentTypes
     *        The supported chat message content types. Supported types are <code>text/plain</code>,
     *        <code>text/markdown</code>, <code>application/json</code>,
     *        <code>application/vnd.amazonaws.connect.message.interactive</code>, and
     *        <code>application/vnd.amazonaws.connect.message.interactive.response</code>. </p>
     *        <p>
     *        Content types must always contain <code> text/plain</code>. You can then put any other supported type in
     *        the list. For example, all the following lists are valid because they contain <code>text/plain</code>:
     *        <code>[text/plain, text/markdown, application/json]</code>, <code> [text/markdown, text/plain]</code>,
     *        <code>[text/plain, application/json, application/vnd.amazonaws.connect.message.interactive.response]</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewSessionDetails withSupportedMessagingContentTypes(java.util.Collection<String> supportedMessagingContentTypes) {
        setSupportedMessagingContentTypes(supportedMessagingContentTypes);
        return this;
    }

    /**
     * @param participantDetails
     */

    public void setParticipantDetails(ParticipantDetails participantDetails) {
        this.participantDetails = participantDetails;
    }

    /**
     * @return
     */

    public ParticipantDetails getParticipantDetails() {
        return this.participantDetails;
    }

    /**
     * @param participantDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewSessionDetails withParticipantDetails(ParticipantDetails participantDetails) {
        setParticipantDetails(participantDetails);
        return this;
    }

    /**
     * <p>
     * A custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes. They can
     * be accessed in flows just like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include only
     * alphanumeric, dash, and underscore characters.
     * </p>
     * 
     * @return A custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes.
     *         They can be accessed in flows just like any other contact attributes. </p>
     *         <p>
     *         There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include
     *         only alphanumeric, dash, and underscore characters.
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * A custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes. They can
     * be accessed in flows just like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include only
     * alphanumeric, dash, and underscore characters.
     * </p>
     * 
     * @param attributes
     *        A custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes.
     *        They can be accessed in flows just like any other contact attributes. </p>
     *        <p>
     *        There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include
     *        only alphanumeric, dash, and underscore characters.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * A custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes. They can
     * be accessed in flows just like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include only
     * alphanumeric, dash, and underscore characters.
     * </p>
     * 
     * @param attributes
     *        A custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes.
     *        They can be accessed in flows just like any other contact attributes. </p>
     *        <p>
     *        There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include
     *        only alphanumeric, dash, and underscore characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewSessionDetails withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * Add a single Attributes entry
     *
     * @see NewSessionDetails#withAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public NewSessionDetails addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewSessionDetails clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * @param streamingConfiguration
     */

    public void setStreamingConfiguration(ChatStreamingConfiguration streamingConfiguration) {
        this.streamingConfiguration = streamingConfiguration;
    }

    /**
     * @return
     */

    public ChatStreamingConfiguration getStreamingConfiguration() {
        return this.streamingConfiguration;
    }

    /**
     * @param streamingConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewSessionDetails withStreamingConfiguration(ChatStreamingConfiguration streamingConfiguration) {
        setStreamingConfiguration(streamingConfiguration);
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
        if (getSupportedMessagingContentTypes() != null)
            sb.append("SupportedMessagingContentTypes: ").append(getSupportedMessagingContentTypes()).append(",");
        if (getParticipantDetails() != null)
            sb.append("ParticipantDetails: ").append(getParticipantDetails()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getStreamingConfiguration() != null)
            sb.append("StreamingConfiguration: ").append(getStreamingConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NewSessionDetails == false)
            return false;
        NewSessionDetails other = (NewSessionDetails) obj;
        if (other.getSupportedMessagingContentTypes() == null ^ this.getSupportedMessagingContentTypes() == null)
            return false;
        if (other.getSupportedMessagingContentTypes() != null
                && other.getSupportedMessagingContentTypes().equals(this.getSupportedMessagingContentTypes()) == false)
            return false;
        if (other.getParticipantDetails() == null ^ this.getParticipantDetails() == null)
            return false;
        if (other.getParticipantDetails() != null && other.getParticipantDetails().equals(this.getParticipantDetails()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getStreamingConfiguration() == null ^ this.getStreamingConfiguration() == null)
            return false;
        if (other.getStreamingConfiguration() != null && other.getStreamingConfiguration().equals(this.getStreamingConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSupportedMessagingContentTypes() == null) ? 0 : getSupportedMessagingContentTypes().hashCode());
        hashCode = prime * hashCode + ((getParticipantDetails() == null) ? 0 : getParticipantDetails().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getStreamingConfiguration() == null) ? 0 : getStreamingConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public NewSessionDetails clone() {
        try {
            return (NewSessionDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.NewSessionDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
