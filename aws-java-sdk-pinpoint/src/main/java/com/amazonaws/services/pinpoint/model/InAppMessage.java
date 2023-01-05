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
 * Provides all fields required for building an in-app message.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/InAppMessage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InAppMessage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * In-app message content.
     * </p>
     */
    private java.util.List<InAppMessageContent> content;
    /**
     * <p>
     * Custom config to be sent to SDK.
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
     * In-app message content.
     * </p>
     * 
     * @return In-app message content.
     */

    public java.util.List<InAppMessageContent> getContent() {
        return content;
    }

    /**
     * <p>
     * In-app message content.
     * </p>
     * 
     * @param content
     *        In-app message content.
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
     * In-app message content.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContent(java.util.Collection)} or {@link #withContent(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param content
     *        In-app message content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InAppMessage withContent(InAppMessageContent... content) {
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
     * In-app message content.
     * </p>
     * 
     * @param content
     *        In-app message content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InAppMessage withContent(java.util.Collection<InAppMessageContent> content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * Custom config to be sent to SDK.
     * </p>
     * 
     * @return Custom config to be sent to SDK.
     */

    public java.util.Map<String, String> getCustomConfig() {
        return customConfig;
    }

    /**
     * <p>
     * Custom config to be sent to SDK.
     * </p>
     * 
     * @param customConfig
     *        Custom config to be sent to SDK.
     */

    public void setCustomConfig(java.util.Map<String, String> customConfig) {
        this.customConfig = customConfig;
    }

    /**
     * <p>
     * Custom config to be sent to SDK.
     * </p>
     * 
     * @param customConfig
     *        Custom config to be sent to SDK.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InAppMessage withCustomConfig(java.util.Map<String, String> customConfig) {
        setCustomConfig(customConfig);
        return this;
    }

    /**
     * Add a single CustomConfig entry
     *
     * @see InAppMessage#withCustomConfig
     * @returns a reference to this object so that method calls can be chained together.
     */

    public InAppMessage addCustomConfigEntry(String key, String value) {
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

    public InAppMessage clearCustomConfigEntries() {
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

    public InAppMessage withLayout(String layout) {
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

    public InAppMessage withLayout(Layout layout) {
        this.layout = layout.toString();
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
            sb.append("Layout: ").append(getLayout());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InAppMessage == false)
            return false;
        InAppMessage other = (InAppMessage) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getCustomConfig() == null) ? 0 : getCustomConfig().hashCode());
        hashCode = prime * hashCode + ((getLayout() == null) ? 0 : getLayout().hashCode());
        return hashCode;
    }

    @Override
    public InAppMessage clone() {
        try {
            return (InAppMessage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.InAppMessageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
