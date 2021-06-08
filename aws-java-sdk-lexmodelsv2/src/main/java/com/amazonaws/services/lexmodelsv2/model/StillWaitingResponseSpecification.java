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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the messages that Amazon Lex sends to a user to remind them that the bot is waiting for a response.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/StillWaitingResponseSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StillWaitingResponseSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * One or more message groups, each containing one or more messages, that define the prompts that Amazon Lex sends
     * to the user.
     * </p>
     */
    private java.util.List<MessageGroup> messageGroups;
    /**
     * <p>
     * How often a message should be sent to the user. Minimum of 1 second, maximum of 5 minutes.
     * </p>
     */
    private Integer frequencyInSeconds;
    /**
     * <p>
     * If Amazon Lex waits longer than this length of time for a response, it will stop sending messages.
     * </p>
     */
    private Integer timeoutInSeconds;
    /**
     * <p>
     * Indicates that the user can interrupt the response by speaking while the message is being played.
     * </p>
     */
    private Boolean allowInterrupt;

    /**
     * <p>
     * One or more message groups, each containing one or more messages, that define the prompts that Amazon Lex sends
     * to the user.
     * </p>
     * 
     * @return One or more message groups, each containing one or more messages, that define the prompts that Amazon Lex
     *         sends to the user.
     */

    public java.util.List<MessageGroup> getMessageGroups() {
        return messageGroups;
    }

    /**
     * <p>
     * One or more message groups, each containing one or more messages, that define the prompts that Amazon Lex sends
     * to the user.
     * </p>
     * 
     * @param messageGroups
     *        One or more message groups, each containing one or more messages, that define the prompts that Amazon Lex
     *        sends to the user.
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
     * One or more message groups, each containing one or more messages, that define the prompts that Amazon Lex sends
     * to the user.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMessageGroups(java.util.Collection)} or {@link #withMessageGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param messageGroups
     *        One or more message groups, each containing one or more messages, that define the prompts that Amazon Lex
     *        sends to the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StillWaitingResponseSpecification withMessageGroups(MessageGroup... messageGroups) {
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
     * One or more message groups, each containing one or more messages, that define the prompts that Amazon Lex sends
     * to the user.
     * </p>
     * 
     * @param messageGroups
     *        One or more message groups, each containing one or more messages, that define the prompts that Amazon Lex
     *        sends to the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StillWaitingResponseSpecification withMessageGroups(java.util.Collection<MessageGroup> messageGroups) {
        setMessageGroups(messageGroups);
        return this;
    }

    /**
     * <p>
     * How often a message should be sent to the user. Minimum of 1 second, maximum of 5 minutes.
     * </p>
     * 
     * @param frequencyInSeconds
     *        How often a message should be sent to the user. Minimum of 1 second, maximum of 5 minutes.
     */

    public void setFrequencyInSeconds(Integer frequencyInSeconds) {
        this.frequencyInSeconds = frequencyInSeconds;
    }

    /**
     * <p>
     * How often a message should be sent to the user. Minimum of 1 second, maximum of 5 minutes.
     * </p>
     * 
     * @return How often a message should be sent to the user. Minimum of 1 second, maximum of 5 minutes.
     */

    public Integer getFrequencyInSeconds() {
        return this.frequencyInSeconds;
    }

    /**
     * <p>
     * How often a message should be sent to the user. Minimum of 1 second, maximum of 5 minutes.
     * </p>
     * 
     * @param frequencyInSeconds
     *        How often a message should be sent to the user. Minimum of 1 second, maximum of 5 minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StillWaitingResponseSpecification withFrequencyInSeconds(Integer frequencyInSeconds) {
        setFrequencyInSeconds(frequencyInSeconds);
        return this;
    }

    /**
     * <p>
     * If Amazon Lex waits longer than this length of time for a response, it will stop sending messages.
     * </p>
     * 
     * @param timeoutInSeconds
     *        If Amazon Lex waits longer than this length of time for a response, it will stop sending messages.
     */

    public void setTimeoutInSeconds(Integer timeoutInSeconds) {
        this.timeoutInSeconds = timeoutInSeconds;
    }

    /**
     * <p>
     * If Amazon Lex waits longer than this length of time for a response, it will stop sending messages.
     * </p>
     * 
     * @return If Amazon Lex waits longer than this length of time for a response, it will stop sending messages.
     */

    public Integer getTimeoutInSeconds() {
        return this.timeoutInSeconds;
    }

    /**
     * <p>
     * If Amazon Lex waits longer than this length of time for a response, it will stop sending messages.
     * </p>
     * 
     * @param timeoutInSeconds
     *        If Amazon Lex waits longer than this length of time for a response, it will stop sending messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StillWaitingResponseSpecification withTimeoutInSeconds(Integer timeoutInSeconds) {
        setTimeoutInSeconds(timeoutInSeconds);
        return this;
    }

    /**
     * <p>
     * Indicates that the user can interrupt the response by speaking while the message is being played.
     * </p>
     * 
     * @param allowInterrupt
     *        Indicates that the user can interrupt the response by speaking while the message is being played.
     */

    public void setAllowInterrupt(Boolean allowInterrupt) {
        this.allowInterrupt = allowInterrupt;
    }

    /**
     * <p>
     * Indicates that the user can interrupt the response by speaking while the message is being played.
     * </p>
     * 
     * @return Indicates that the user can interrupt the response by speaking while the message is being played.
     */

    public Boolean getAllowInterrupt() {
        return this.allowInterrupt;
    }

    /**
     * <p>
     * Indicates that the user can interrupt the response by speaking while the message is being played.
     * </p>
     * 
     * @param allowInterrupt
     *        Indicates that the user can interrupt the response by speaking while the message is being played.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StillWaitingResponseSpecification withAllowInterrupt(Boolean allowInterrupt) {
        setAllowInterrupt(allowInterrupt);
        return this;
    }

    /**
     * <p>
     * Indicates that the user can interrupt the response by speaking while the message is being played.
     * </p>
     * 
     * @return Indicates that the user can interrupt the response by speaking while the message is being played.
     */

    public Boolean isAllowInterrupt() {
        return this.allowInterrupt;
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
        if (getFrequencyInSeconds() != null)
            sb.append("FrequencyInSeconds: ").append(getFrequencyInSeconds()).append(",");
        if (getTimeoutInSeconds() != null)
            sb.append("TimeoutInSeconds: ").append(getTimeoutInSeconds()).append(",");
        if (getAllowInterrupt() != null)
            sb.append("AllowInterrupt: ").append(getAllowInterrupt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StillWaitingResponseSpecification == false)
            return false;
        StillWaitingResponseSpecification other = (StillWaitingResponseSpecification) obj;
        if (other.getMessageGroups() == null ^ this.getMessageGroups() == null)
            return false;
        if (other.getMessageGroups() != null && other.getMessageGroups().equals(this.getMessageGroups()) == false)
            return false;
        if (other.getFrequencyInSeconds() == null ^ this.getFrequencyInSeconds() == null)
            return false;
        if (other.getFrequencyInSeconds() != null && other.getFrequencyInSeconds().equals(this.getFrequencyInSeconds()) == false)
            return false;
        if (other.getTimeoutInSeconds() == null ^ this.getTimeoutInSeconds() == null)
            return false;
        if (other.getTimeoutInSeconds() != null && other.getTimeoutInSeconds().equals(this.getTimeoutInSeconds()) == false)
            return false;
        if (other.getAllowInterrupt() == null ^ this.getAllowInterrupt() == null)
            return false;
        if (other.getAllowInterrupt() != null && other.getAllowInterrupt().equals(this.getAllowInterrupt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessageGroups() == null) ? 0 : getMessageGroups().hashCode());
        hashCode = prime * hashCode + ((getFrequencyInSeconds() == null) ? 0 : getFrequencyInSeconds().hashCode());
        hashCode = prime * hashCode + ((getTimeoutInSeconds() == null) ? 0 : getTimeoutInSeconds().hashCode());
        hashCode = prime * hashCode + ((getAllowInterrupt() == null) ? 0 : getAllowInterrupt().hashCode());
        return hashCode;
    }

    @Override
    public StillWaitingResponseSpecification clone() {
        try {
            return (StillWaitingResponseSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.StillWaitingResponseSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
