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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A conversation in an Amazon Q Business application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/Conversation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Conversation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the Amazon Q Business conversation.
     * </p>
     */
    private String conversationId;
    /**
     * <p>
     * The title of the conversation.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The start time of the conversation.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The identifier of the Amazon Q Business conversation.
     * </p>
     * 
     * @param conversationId
     *        The identifier of the Amazon Q Business conversation.
     */

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business conversation.
     * </p>
     * 
     * @return The identifier of the Amazon Q Business conversation.
     */

    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business conversation.
     * </p>
     * 
     * @param conversationId
     *        The identifier of the Amazon Q Business conversation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Conversation withConversationId(String conversationId) {
        setConversationId(conversationId);
        return this;
    }

    /**
     * <p>
     * The title of the conversation.
     * </p>
     * 
     * @param title
     *        The title of the conversation.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the conversation.
     * </p>
     * 
     * @return The title of the conversation.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of the conversation.
     * </p>
     * 
     * @param title
     *        The title of the conversation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Conversation withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The start time of the conversation.
     * </p>
     * 
     * @param startTime
     *        The start time of the conversation.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time of the conversation.
     * </p>
     * 
     * @return The start time of the conversation.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time of the conversation.
     * </p>
     * 
     * @param startTime
     *        The start time of the conversation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Conversation withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
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
        if (getConversationId() != null)
            sb.append("ConversationId: ").append(getConversationId()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Conversation == false)
            return false;
        Conversation other = (Conversation) obj;
        if (other.getConversationId() == null ^ this.getConversationId() == null)
            return false;
        if (other.getConversationId() != null && other.getConversationId().equals(this.getConversationId()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConversationId() == null) ? 0 : getConversationId().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return hashCode;
    }

    @Override
    public Conversation clone() {
        try {
            return (Conversation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.ConversationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
