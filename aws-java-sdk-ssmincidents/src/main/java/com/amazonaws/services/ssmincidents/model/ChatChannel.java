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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The AWS Chatbot chat channel used for collaboration during an incident.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/ChatChannel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChatChannel implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The SNS targets that AWS Chatbot uses to notify the chat channel of updates to an incident. You can also make
     * updates to the incident through the chat channel by using the SNS topics.
     * </p>
     */
    private java.util.List<String> chatbotSns;
    /**
     * <p>
     * Used to remove the chat channel from an incident record or response plan.
     * </p>
     */
    private EmptyChatChannel empty;

    /**
     * <p>
     * The SNS targets that AWS Chatbot uses to notify the chat channel of updates to an incident. You can also make
     * updates to the incident through the chat channel by using the SNS topics.
     * </p>
     * 
     * @return The SNS targets that AWS Chatbot uses to notify the chat channel of updates to an incident. You can also
     *         make updates to the incident through the chat channel by using the SNS topics.
     */

    public java.util.List<String> getChatbotSns() {
        return chatbotSns;
    }

    /**
     * <p>
     * The SNS targets that AWS Chatbot uses to notify the chat channel of updates to an incident. You can also make
     * updates to the incident through the chat channel by using the SNS topics.
     * </p>
     * 
     * @param chatbotSns
     *        The SNS targets that AWS Chatbot uses to notify the chat channel of updates to an incident. You can also
     *        make updates to the incident through the chat channel by using the SNS topics.
     */

    public void setChatbotSns(java.util.Collection<String> chatbotSns) {
        if (chatbotSns == null) {
            this.chatbotSns = null;
            return;
        }

        this.chatbotSns = new java.util.ArrayList<String>(chatbotSns);
    }

    /**
     * <p>
     * The SNS targets that AWS Chatbot uses to notify the chat channel of updates to an incident. You can also make
     * updates to the incident through the chat channel by using the SNS topics.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChatbotSns(java.util.Collection)} or {@link #withChatbotSns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param chatbotSns
     *        The SNS targets that AWS Chatbot uses to notify the chat channel of updates to an incident. You can also
     *        make updates to the incident through the chat channel by using the SNS topics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChatChannel withChatbotSns(String... chatbotSns) {
        if (this.chatbotSns == null) {
            setChatbotSns(new java.util.ArrayList<String>(chatbotSns.length));
        }
        for (String ele : chatbotSns) {
            this.chatbotSns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The SNS targets that AWS Chatbot uses to notify the chat channel of updates to an incident. You can also make
     * updates to the incident through the chat channel by using the SNS topics.
     * </p>
     * 
     * @param chatbotSns
     *        The SNS targets that AWS Chatbot uses to notify the chat channel of updates to an incident. You can also
     *        make updates to the incident through the chat channel by using the SNS topics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChatChannel withChatbotSns(java.util.Collection<String> chatbotSns) {
        setChatbotSns(chatbotSns);
        return this;
    }

    /**
     * <p>
     * Used to remove the chat channel from an incident record or response plan.
     * </p>
     * 
     * @param empty
     *        Used to remove the chat channel from an incident record or response plan.
     */

    public void setEmpty(EmptyChatChannel empty) {
        this.empty = empty;
    }

    /**
     * <p>
     * Used to remove the chat channel from an incident record or response plan.
     * </p>
     * 
     * @return Used to remove the chat channel from an incident record or response plan.
     */

    public EmptyChatChannel getEmpty() {
        return this.empty;
    }

    /**
     * <p>
     * Used to remove the chat channel from an incident record or response plan.
     * </p>
     * 
     * @param empty
     *        Used to remove the chat channel from an incident record or response plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChatChannel withEmpty(EmptyChatChannel empty) {
        setEmpty(empty);
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
        if (getChatbotSns() != null)
            sb.append("ChatbotSns: ").append(getChatbotSns()).append(",");
        if (getEmpty() != null)
            sb.append("Empty: ").append(getEmpty());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChatChannel == false)
            return false;
        ChatChannel other = (ChatChannel) obj;
        if (other.getChatbotSns() == null ^ this.getChatbotSns() == null)
            return false;
        if (other.getChatbotSns() != null && other.getChatbotSns().equals(this.getChatbotSns()) == false)
            return false;
        if (other.getEmpty() == null ^ this.getEmpty() == null)
            return false;
        if (other.getEmpty() != null && other.getEmpty().equals(this.getEmpty()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChatbotSns() == null) ? 0 : getChatbotSns().hashCode());
        hashCode = prime * hashCode + ((getEmpty() == null) ? 0 : getEmpty().hashCode());
        return hashCode;
    }

    @Override
    public ChatChannel clone() {
        try {
            return (ChatChannel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmincidents.model.transform.ChatChannelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
