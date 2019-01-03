/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexmodelbuilding.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Obtains information from the user. To define a prompt, provide one or more messages and specify the number of
 * attempts to get information from the user. If you provide more than one message, Amazon Lex chooses one of the
 * messages to use to prompt the user. For more information, see <a>how-it-works</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/Prompt" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Prompt implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of objects, each of which provides a message string and its type. You can specify the message string in
     * plain text or in Speech Synthesis Markup Language (SSML).
     * </p>
     */
    private java.util.List<Message> messages;
    /**
     * <p>
     * The number of times to prompt the user for information.
     * </p>
     */
    private Integer maxAttempts;
    /**
     * <p>
     * A response card. Amazon Lex uses this prompt at runtime, in the <code>PostText</code> API response. It
     * substitutes session attributes and slot values for placeholders in the response card. For more information, see
     * <a>ex-resp-card</a>.
     * </p>
     */
    private String responseCard;

    /**
     * <p>
     * An array of objects, each of which provides a message string and its type. You can specify the message string in
     * plain text or in Speech Synthesis Markup Language (SSML).
     * </p>
     * 
     * @return An array of objects, each of which provides a message string and its type. You can specify the message
     *         string in plain text or in Speech Synthesis Markup Language (SSML).
     */

    public java.util.List<Message> getMessages() {
        return messages;
    }

    /**
     * <p>
     * An array of objects, each of which provides a message string and its type. You can specify the message string in
     * plain text or in Speech Synthesis Markup Language (SSML).
     * </p>
     * 
     * @param messages
     *        An array of objects, each of which provides a message string and its type. You can specify the message
     *        string in plain text or in Speech Synthesis Markup Language (SSML).
     */

    public void setMessages(java.util.Collection<Message> messages) {
        if (messages == null) {
            this.messages = null;
            return;
        }

        this.messages = new java.util.ArrayList<Message>(messages);
    }

    /**
     * <p>
     * An array of objects, each of which provides a message string and its type. You can specify the message string in
     * plain text or in Speech Synthesis Markup Language (SSML).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMessages(java.util.Collection)} or {@link #withMessages(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param messages
     *        An array of objects, each of which provides a message string and its type. You can specify the message
     *        string in plain text or in Speech Synthesis Markup Language (SSML).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Prompt withMessages(Message... messages) {
        if (this.messages == null) {
            setMessages(new java.util.ArrayList<Message>(messages.length));
        }
        for (Message ele : messages) {
            this.messages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects, each of which provides a message string and its type. You can specify the message string in
     * plain text or in Speech Synthesis Markup Language (SSML).
     * </p>
     * 
     * @param messages
     *        An array of objects, each of which provides a message string and its type. You can specify the message
     *        string in plain text or in Speech Synthesis Markup Language (SSML).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Prompt withMessages(java.util.Collection<Message> messages) {
        setMessages(messages);
        return this;
    }

    /**
     * <p>
     * The number of times to prompt the user for information.
     * </p>
     * 
     * @param maxAttempts
     *        The number of times to prompt the user for information.
     */

    public void setMaxAttempts(Integer maxAttempts) {
        this.maxAttempts = maxAttempts;
    }

    /**
     * <p>
     * The number of times to prompt the user for information.
     * </p>
     * 
     * @return The number of times to prompt the user for information.
     */

    public Integer getMaxAttempts() {
        return this.maxAttempts;
    }

    /**
     * <p>
     * The number of times to prompt the user for information.
     * </p>
     * 
     * @param maxAttempts
     *        The number of times to prompt the user for information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Prompt withMaxAttempts(Integer maxAttempts) {
        setMaxAttempts(maxAttempts);
        return this;
    }

    /**
     * <p>
     * A response card. Amazon Lex uses this prompt at runtime, in the <code>PostText</code> API response. It
     * substitutes session attributes and slot values for placeholders in the response card. For more information, see
     * <a>ex-resp-card</a>.
     * </p>
     * 
     * @param responseCard
     *        A response card. Amazon Lex uses this prompt at runtime, in the <code>PostText</code> API response. It
     *        substitutes session attributes and slot values for placeholders in the response card. For more
     *        information, see <a>ex-resp-card</a>.
     */

    public void setResponseCard(String responseCard) {
        this.responseCard = responseCard;
    }

    /**
     * <p>
     * A response card. Amazon Lex uses this prompt at runtime, in the <code>PostText</code> API response. It
     * substitutes session attributes and slot values for placeholders in the response card. For more information, see
     * <a>ex-resp-card</a>.
     * </p>
     * 
     * @return A response card. Amazon Lex uses this prompt at runtime, in the <code>PostText</code> API response. It
     *         substitutes session attributes and slot values for placeholders in the response card. For more
     *         information, see <a>ex-resp-card</a>.
     */

    public String getResponseCard() {
        return this.responseCard;
    }

    /**
     * <p>
     * A response card. Amazon Lex uses this prompt at runtime, in the <code>PostText</code> API response. It
     * substitutes session attributes and slot values for placeholders in the response card. For more information, see
     * <a>ex-resp-card</a>.
     * </p>
     * 
     * @param responseCard
     *        A response card. Amazon Lex uses this prompt at runtime, in the <code>PostText</code> API response. It
     *        substitutes session attributes and slot values for placeholders in the response card. For more
     *        information, see <a>ex-resp-card</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Prompt withResponseCard(String responseCard) {
        setResponseCard(responseCard);
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
        if (getMessages() != null)
            sb.append("Messages: ").append(getMessages()).append(",");
        if (getMaxAttempts() != null)
            sb.append("MaxAttempts: ").append(getMaxAttempts()).append(",");
        if (getResponseCard() != null)
            sb.append("ResponseCard: ").append(getResponseCard());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Prompt == false)
            return false;
        Prompt other = (Prompt) obj;
        if (other.getMessages() == null ^ this.getMessages() == null)
            return false;
        if (other.getMessages() != null && other.getMessages().equals(this.getMessages()) == false)
            return false;
        if (other.getMaxAttempts() == null ^ this.getMaxAttempts() == null)
            return false;
        if (other.getMaxAttempts() != null && other.getMaxAttempts().equals(this.getMaxAttempts()) == false)
            return false;
        if (other.getResponseCard() == null ^ this.getResponseCard() == null)
            return false;
        if (other.getResponseCard() != null && other.getResponseCard().equals(this.getResponseCard()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessages() == null) ? 0 : getMessages().hashCode());
        hashCode = prime * hashCode + ((getMaxAttempts() == null) ? 0 : getMaxAttempts().hashCode());
        hashCode = prime * hashCode + ((getResponseCard() == null) ? 0 : getResponseCard().hashCode());
        return hashCode;
    }

    @Override
    public Prompt clone() {
        try {
            return (Prompt) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelbuilding.model.transform.PromptMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
