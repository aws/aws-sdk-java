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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * InApp Template Request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/InAppTemplateRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InAppTemplateRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The content of the message, can include up to 5 modals. Each modal must contain a message, a header, and
     * background color. ImageUrl and buttons are optional.
     * </p>
     */
    private java.util.List<InAppMessageContent> content;
    /**
     * <p>
     * Custom config to be sent to client.
     * </p>
     */
    private java.util.Map<String, String> customConfig;
    /**
     * <p>
     * The layout of the message.
     * </p>
     */
    private String layout;
    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to associate with the message template. Each tag
     * consists of a required tag key and an associated tag value.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The description of the template.
     * </p>
     */
    private String templateDescription;

    /**
     * <p>
     * The content of the message, can include up to 5 modals. Each modal must contain a message, a header, and
     * background color. ImageUrl and buttons are optional.
     * </p>
     * 
     * @return The content of the message, can include up to 5 modals. Each modal must contain a message, a header, and
     *         background color. ImageUrl and buttons are optional.
     */

    public java.util.List<InAppMessageContent> getContent() {
        return content;
    }

    /**
     * <p>
     * The content of the message, can include up to 5 modals. Each modal must contain a message, a header, and
     * background color. ImageUrl and buttons are optional.
     * </p>
     * 
     * @param content
     *        The content of the message, can include up to 5 modals. Each modal must contain a message, a header, and
     *        background color. ImageUrl and buttons are optional.
     */

    public void setContent(java.util.Collection<InAppMessageContent> content) {
        if (content == null) {
            this.content = null;
            return;
        }

        this.content = new java.util.ArrayList<InAppMessageContent>(content);
    }

    /**
     * <p>
     * The content of the message, can include up to 5 modals. Each modal must contain a message, a header, and
     * background color. ImageUrl and buttons are optional.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContent(java.util.Collection)} or {@link #withContent(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param content
     *        The content of the message, can include up to 5 modals. Each modal must contain a message, a header, and
     *        background color. ImageUrl and buttons are optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InAppTemplateRequest withContent(InAppMessageContent... content) {
        if (this.content == null) {
            setContent(new java.util.ArrayList<InAppMessageContent>(content.length));
        }
        for (InAppMessageContent ele : content) {
            this.content.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The content of the message, can include up to 5 modals. Each modal must contain a message, a header, and
     * background color. ImageUrl and buttons are optional.
     * </p>
     * 
     * @param content
     *        The content of the message, can include up to 5 modals. Each modal must contain a message, a header, and
     *        background color. ImageUrl and buttons are optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InAppTemplateRequest withContent(java.util.Collection<InAppMessageContent> content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * Custom config to be sent to client.
     * </p>
     * 
     * @return Custom config to be sent to client.
     */

    public java.util.Map<String, String> getCustomConfig() {
        return customConfig;
    }

    /**
     * <p>
     * Custom config to be sent to client.
     * </p>
     * 
     * @param customConfig
     *        Custom config to be sent to client.
     */

    public void setCustomConfig(java.util.Map<String, String> customConfig) {
        this.customConfig = customConfig;
    }

    /**
     * <p>
     * Custom config to be sent to client.
     * </p>
     * 
     * @param customConfig
     *        Custom config to be sent to client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InAppTemplateRequest withCustomConfig(java.util.Map<String, String> customConfig) {
        setCustomConfig(customConfig);
        return this;
    }

    /**
     * Add a single CustomConfig entry
     *
     * @see InAppTemplateRequest#withCustomConfig
     * @returns a reference to this object so that method calls can be chained together.
     */

    public InAppTemplateRequest addCustomConfigEntry(String key, String value) {
        if (null == this.customConfig) {
            this.customConfig = new java.util.HashMap<String, String>();
        }
        if (this.customConfig.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.customConfig.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into CustomConfig.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InAppTemplateRequest clearCustomConfigEntries() {
        this.customConfig = null;
        return this;
    }

    /**
     * <p>
     * The layout of the message.
     * </p>
     * 
     * @param layout
     *        The layout of the message.
     * @see Layout
     */

    public void setLayout(String layout) {
        this.layout = layout;
    }

    /**
     * <p>
     * The layout of the message.
     * </p>
     * 
     * @return The layout of the message.
     * @see Layout
     */

    public String getLayout() {
        return this.layout;
    }

    /**
     * <p>
     * The layout of the message.
     * </p>
     * 
     * @param layout
     *        The layout of the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Layout
     */

    public InAppTemplateRequest withLayout(String layout) {
        setLayout(layout);
        return this;
    }

    /**
     * <p>
     * The layout of the message.
     * </p>
     * 
     * @param layout
     *        The layout of the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Layout
     */

    public InAppTemplateRequest withLayout(Layout layout) {
        this.layout = layout.toString();
        return this;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to associate with the message template. Each tag
     * consists of a required tag key and an associated tag value.
     * </p>
     * 
     * @return A string-to-string map of key-value pairs that defines the tags to associate with the message template.
     *         Each tag consists of a required tag key and an associated tag value.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to associate with the message template. Each tag
     * consists of a required tag key and an associated tag value.
     * </p>
     * 
     * @param tags
     *        A string-to-string map of key-value pairs that defines the tags to associate with the message template.
     *        Each tag consists of a required tag key and an associated tag value.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to associate with the message template. Each tag
     * consists of a required tag key and an associated tag value.
     * </p>
     * 
     * @param tags
     *        A string-to-string map of key-value pairs that defines the tags to associate with the message template.
     *        Each tag consists of a required tag key and an associated tag value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InAppTemplateRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see InAppTemplateRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public InAppTemplateRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InAppTemplateRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The description of the template.
     * </p>
     * 
     * @param templateDescription
     *        The description of the template.
     */

    public void setTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
    }

    /**
     * <p>
     * The description of the template.
     * </p>
     * 
     * @return The description of the template.
     */

    public String getTemplateDescription() {
        return this.templateDescription;
    }

    /**
     * <p>
     * The description of the template.
     * </p>
     * 
     * @param templateDescription
     *        The description of the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InAppTemplateRequest withTemplateDescription(String templateDescription) {
        setTemplateDescription(templateDescription);
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
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getCustomConfig() != null)
            sb.append("CustomConfig: ").append(getCustomConfig()).append(",");
        if (getLayout() != null)
            sb.append("Layout: ").append(getLayout()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTemplateDescription() != null)
            sb.append("TemplateDescription: ").append(getTemplateDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InAppTemplateRequest == false)
            return false;
        InAppTemplateRequest other = (InAppTemplateRequest) obj;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getCustomConfig() == null ^ this.getCustomConfig() == null)
            return false;
        if (other.getCustomConfig() != null && other.getCustomConfig().equals(this.getCustomConfig()) == false)
            return false;
        if (other.getLayout() == null ^ this.getLayout() == null)
            return false;
        if (other.getLayout() != null && other.getLayout().equals(this.getLayout()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTemplateDescription() == null ^ this.getTemplateDescription() == null)
            return false;
        if (other.getTemplateDescription() != null && other.getTemplateDescription().equals(this.getTemplateDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getCustomConfig() == null) ? 0 : getCustomConfig().hashCode());
        hashCode = prime * hashCode + ((getLayout() == null) ? 0 : getLayout().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTemplateDescription() == null) ? 0 : getTemplateDescription().hashCode());
        return hashCode;
    }

    @Override
    public InAppTemplateRequest clone() {
        try {
            return (InAppTemplateRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.InAppTemplateRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
