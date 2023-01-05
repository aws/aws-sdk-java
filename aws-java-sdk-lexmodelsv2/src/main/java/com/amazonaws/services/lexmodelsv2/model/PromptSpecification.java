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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a list of message groups that Amazon Lex sends to a user to elicit a response.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/PromptSpecification" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PromptSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A collection of messages that Amazon Lex can send to the user. Amazon Lex chooses the actual message to send at
     * runtime.
     * </p>
     */
    private java.util.List<MessageGroup> messageGroups;
    /**
     * <p>
     * The maximum number of times the bot tries to elicit a response from the user using this prompt.
     * </p>
     */
    private Integer maxRetries;
    /**
     * <p>
     * Indicates whether the user can interrupt a speech prompt from the bot.
     * </p>
     */
    private Boolean allowInterrupt;
    /**
     * <p>
     * Indicates how a message is selected from a message group among retries.
     * </p>
     */
    private String messageSelectionStrategy;
    /**
     * <p>
     * Specifies the advanced settings on each attempt of the prompt.
     * </p>
     */
    private java.util.Map<String, PromptAttemptSpecification> promptAttemptsSpecification;

    /**
     * <p>
     * A collection of messages that Amazon Lex can send to the user. Amazon Lex chooses the actual message to send at
     * runtime.
     * </p>
     * 
     * @return A collection of messages that Amazon Lex can send to the user. Amazon Lex chooses the actual message to
     *         send at runtime.
     */

    public java.util.List<MessageGroup> getMessageGroups() {
        return messageGroups;
    }

    /**
     * <p>
     * A collection of messages that Amazon Lex can send to the user. Amazon Lex chooses the actual message to send at
     * runtime.
     * </p>
     * 
     * @param messageGroups
     *        A collection of messages that Amazon Lex can send to the user. Amazon Lex chooses the actual message to
     *        send at runtime.
     */

    public void setMessageGroups(java.util.Collection<MessageGroup> messageGroups) {
        if (messageGroups == null) {
            this.messageGroups = null;
            return;
        }

        this.messageGroups = new java.util.ArrayList<MessageGroup>(messageGroups);
    }

    /**
     * <p>
     * A collection of messages that Amazon Lex can send to the user. Amazon Lex chooses the actual message to send at
     * runtime.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMessageGroups(java.util.Collection)} or {@link #withMessageGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param messageGroups
     *        A collection of messages that Amazon Lex can send to the user. Amazon Lex chooses the actual message to
     *        send at runtime.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PromptSpecification withMessageGroups(MessageGroup... messageGroups) {
        if (this.messageGroups == null) {
            setMessageGroups(new java.util.ArrayList<MessageGroup>(messageGroups.length));
        }
        for (MessageGroup ele : messageGroups) {
            this.messageGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A collection of messages that Amazon Lex can send to the user. Amazon Lex chooses the actual message to send at
     * runtime.
     * </p>
     * 
     * @param messageGroups
     *        A collection of messages that Amazon Lex can send to the user. Amazon Lex chooses the actual message to
     *        send at runtime.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PromptSpecification withMessageGroups(java.util.Collection<MessageGroup> messageGroups) {
        setMessageGroups(messageGroups);
        return this;
    }

    /**
     * <p>
     * The maximum number of times the bot tries to elicit a response from the user using this prompt.
     * </p>
     * 
     * @param maxRetries
     *        The maximum number of times the bot tries to elicit a response from the user using this prompt.
     */

    public void setMaxRetries(Integer maxRetries) {
        this.maxRetries = maxRetries;
    }

    /**
     * <p>
     * The maximum number of times the bot tries to elicit a response from the user using this prompt.
     * </p>
     * 
     * @return The maximum number of times the bot tries to elicit a response from the user using this prompt.
     */

    public Integer getMaxRetries() {
        return this.maxRetries;
    }

    /**
     * <p>
     * The maximum number of times the bot tries to elicit a response from the user using this prompt.
     * </p>
     * 
     * @param maxRetries
     *        The maximum number of times the bot tries to elicit a response from the user using this prompt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PromptSpecification withMaxRetries(Integer maxRetries) {
        setMaxRetries(maxRetries);
        return this;
    }

    /**
     * <p>
     * Indicates whether the user can interrupt a speech prompt from the bot.
     * </p>
     * 
     * @param allowInterrupt
     *        Indicates whether the user can interrupt a speech prompt from the bot.
     */

    public void setAllowInterrupt(Boolean allowInterrupt) {
        this.allowInterrupt = allowInterrupt;
    }

    /**
     * <p>
     * Indicates whether the user can interrupt a speech prompt from the bot.
     * </p>
     * 
     * @return Indicates whether the user can interrupt a speech prompt from the bot.
     */

    public Boolean getAllowInterrupt() {
        return this.allowInterrupt;
    }

    /**
     * <p>
     * Indicates whether the user can interrupt a speech prompt from the bot.
     * </p>
     * 
     * @param allowInterrupt
     *        Indicates whether the user can interrupt a speech prompt from the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PromptSpecification withAllowInterrupt(Boolean allowInterrupt) {
        setAllowInterrupt(allowInterrupt);
        return this;
    }

    /**
     * <p>
     * Indicates whether the user can interrupt a speech prompt from the bot.
     * </p>
     * 
     * @return Indicates whether the user can interrupt a speech prompt from the bot.
     */

    public Boolean isAllowInterrupt() {
        return this.allowInterrupt;
    }

    /**
     * <p>
     * Indicates how a message is selected from a message group among retries.
     * </p>
     * 
     * @param messageSelectionStrategy
     *        Indicates how a message is selected from a message group among retries.
     * @see MessageSelectionStrategy
     */

    public void setMessageSelectionStrategy(String messageSelectionStrategy) {
        this.messageSelectionStrategy = messageSelectionStrategy;
    }

    /**
     * <p>
     * Indicates how a message is selected from a message group among retries.
     * </p>
     * 
     * @return Indicates how a message is selected from a message group among retries.
     * @see MessageSelectionStrategy
     */

    public String getMessageSelectionStrategy() {
        return this.messageSelectionStrategy;
    }

    /**
     * <p>
     * Indicates how a message is selected from a message group among retries.
     * </p>
     * 
     * @param messageSelectionStrategy
     *        Indicates how a message is selected from a message group among retries.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageSelectionStrategy
     */

    public PromptSpecification withMessageSelectionStrategy(String messageSelectionStrategy) {
        setMessageSelectionStrategy(messageSelectionStrategy);
        return this;
    }

    /**
     * <p>
     * Indicates how a message is selected from a message group among retries.
     * </p>
     * 
     * @param messageSelectionStrategy
     *        Indicates how a message is selected from a message group among retries.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageSelectionStrategy
     */

    public PromptSpecification withMessageSelectionStrategy(MessageSelectionStrategy messageSelectionStrategy) {
        this.messageSelectionStrategy = messageSelectionStrategy.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the advanced settings on each attempt of the prompt.
     * </p>
     * 
     * @return Specifies the advanced settings on each attempt of the prompt.
     */

    public java.util.Map<String, PromptAttemptSpecification> getPromptAttemptsSpecification() {
        return promptAttemptsSpecification;
    }

    /**
     * <p>
     * Specifies the advanced settings on each attempt of the prompt.
     * </p>
     * 
     * @param promptAttemptsSpecification
     *        Specifies the advanced settings on each attempt of the prompt.
     */

    public void setPromptAttemptsSpecification(java.util.Map<String, PromptAttemptSpecification> promptAttemptsSpecification) {
        this.promptAttemptsSpecification = promptAttemptsSpecification;
    }

    /**
     * <p>
     * Specifies the advanced settings on each attempt of the prompt.
     * </p>
     * 
     * @param promptAttemptsSpecification
     *        Specifies the advanced settings on each attempt of the prompt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PromptSpecification withPromptAttemptsSpecification(java.util.Map<String, PromptAttemptSpecification> promptAttemptsSpecification) {
        setPromptAttemptsSpecification(promptAttemptsSpecification);
        return this;
    }

    /**
     * Add a single PromptAttemptsSpecification entry
     *
     * @see PromptSpecification#withPromptAttemptsSpecification
     * @returns a reference to this object so that method calls can be chained together.
     */

    public PromptSpecification addPromptAttemptsSpecificationEntry(String key, PromptAttemptSpecification value) {
        if (null == this.promptAttemptsSpecification) {
            this.promptAttemptsSpecification = new java.util.HashMap<String, PromptAttemptSpecification>();
        }
        if (this.promptAttemptsSpecification.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.promptAttemptsSpecification.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into PromptAttemptsSpecification.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PromptSpecification clearPromptAttemptsSpecificationEntries() {
        this.promptAttemptsSpecification = null;
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
        if (getMessageGroups() != null)
            sb.append("MessageGroups: ").append(getMessageGroups()).append(",");
        if (getMaxRetries() != null)
            sb.append("MaxRetries: ").append(getMaxRetries()).append(",");
        if (getAllowInterrupt() != null)
            sb.append("AllowInterrupt: ").append(getAllowInterrupt()).append(",");
        if (getMessageSelectionStrategy() != null)
            sb.append("MessageSelectionStrategy: ").append(getMessageSelectionStrategy()).append(",");
        if (getPromptAttemptsSpecification() != null)
            sb.append("PromptAttemptsSpecification: ").append(getPromptAttemptsSpecification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PromptSpecification == false)
            return false;
        PromptSpecification other = (PromptSpecification) obj;
        if (other.getMessageGroups() == null ^ this.getMessageGroups() == null)
            return false;
        if (other.getMessageGroups() != null && other.getMessageGroups().equals(this.getMessageGroups()) == false)
            return false;
        if (other.getMaxRetries() == null ^ this.getMaxRetries() == null)
            return false;
        if (other.getMaxRetries() != null && other.getMaxRetries().equals(this.getMaxRetries()) == false)
            return false;
        if (other.getAllowInterrupt() == null ^ this.getAllowInterrupt() == null)
            return false;
        if (other.getAllowInterrupt() != null && other.getAllowInterrupt().equals(this.getAllowInterrupt()) == false)
            return false;
        if (other.getMessageSelectionStrategy() == null ^ this.getMessageSelectionStrategy() == null)
            return false;
        if (other.getMessageSelectionStrategy() != null && other.getMessageSelectionStrategy().equals(this.getMessageSelectionStrategy()) == false)
            return false;
        if (other.getPromptAttemptsSpecification() == null ^ this.getPromptAttemptsSpecification() == null)
            return false;
        if (other.getPromptAttemptsSpecification() != null && other.getPromptAttemptsSpecification().equals(this.getPromptAttemptsSpecification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessageGroups() == null) ? 0 : getMessageGroups().hashCode());
        hashCode = prime * hashCode + ((getMaxRetries() == null) ? 0 : getMaxRetries().hashCode());
        hashCode = prime * hashCode + ((getAllowInterrupt() == null) ? 0 : getAllowInterrupt().hashCode());
        hashCode = prime * hashCode + ((getMessageSelectionStrategy() == null) ? 0 : getMessageSelectionStrategy().hashCode());
        hashCode = prime * hashCode + ((getPromptAttemptsSpecification() == null) ? 0 : getPromptAttemptsSpecification().hashCode());
        return hashCode;
    }

    @Override
    public PromptSpecification clone() {
        try {
            return (PromptSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.PromptSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
