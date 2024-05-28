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
package com.amazonaws.services.chimesdkidentity.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the type of message that triggers a bot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/InvokedBy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvokedBy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Sets standard messages as the bot trigger. For standard messages:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code>: The bot processes all standard messages.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTO</code>: The bot responds to ALL messages when the channel has one other non-hidden member, and
     * responds to MENTIONS when the channel has more than one other non-hidden member.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MENTIONS</code>: The bot processes all standard messages that have a message attribute with
     * <code>CHIME.mentions</code> and a value of the bot ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: The bot processes no standard messages.
     * </p>
     * </li>
     * </ul>
     */
    private String standardMessages;
    /**
     * <p>
     * Sets targeted messages as the bot trigger. For targeted messages:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code>: The bot processes all <code>TargetedMessages</code> sent to it. The bot then responds with a
     * targeted message back to the sender.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: The bot processes no targeted messages.
     * </p>
     * </li>
     * </ul>
     */
    private String targetedMessages;

    /**
     * <p>
     * Sets standard messages as the bot trigger. For standard messages:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code>: The bot processes all standard messages.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTO</code>: The bot responds to ALL messages when the channel has one other non-hidden member, and
     * responds to MENTIONS when the channel has more than one other non-hidden member.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MENTIONS</code>: The bot processes all standard messages that have a message attribute with
     * <code>CHIME.mentions</code> and a value of the bot ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: The bot processes no standard messages.
     * </p>
     * </li>
     * </ul>
     * 
     * @param standardMessages
     *        Sets standard messages as the bot trigger. For standard messages:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL</code>: The bot processes all standard messages.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AUTO</code>: The bot responds to ALL messages when the channel has one other non-hidden member, and
     *        responds to MENTIONS when the channel has more than one other non-hidden member.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MENTIONS</code>: The bot processes all standard messages that have a message attribute with
     *        <code>CHIME.mentions</code> and a value of the bot ARN.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code>: The bot processes no standard messages.
     *        </p>
     *        </li>
     * @see StandardMessages
     */

    public void setStandardMessages(String standardMessages) {
        this.standardMessages = standardMessages;
    }

    /**
     * <p>
     * Sets standard messages as the bot trigger. For standard messages:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code>: The bot processes all standard messages.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTO</code>: The bot responds to ALL messages when the channel has one other non-hidden member, and
     * responds to MENTIONS when the channel has more than one other non-hidden member.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MENTIONS</code>: The bot processes all standard messages that have a message attribute with
     * <code>CHIME.mentions</code> and a value of the bot ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: The bot processes no standard messages.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Sets standard messages as the bot trigger. For standard messages:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALL</code>: The bot processes all standard messages.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AUTO</code>: The bot responds to ALL messages when the channel has one other non-hidden member, and
     *         responds to MENTIONS when the channel has more than one other non-hidden member.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MENTIONS</code>: The bot processes all standard messages that have a message attribute with
     *         <code>CHIME.mentions</code> and a value of the bot ARN.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NONE</code>: The bot processes no standard messages.
     *         </p>
     *         </li>
     * @see StandardMessages
     */

    public String getStandardMessages() {
        return this.standardMessages;
    }

    /**
     * <p>
     * Sets standard messages as the bot trigger. For standard messages:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code>: The bot processes all standard messages.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTO</code>: The bot responds to ALL messages when the channel has one other non-hidden member, and
     * responds to MENTIONS when the channel has more than one other non-hidden member.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MENTIONS</code>: The bot processes all standard messages that have a message attribute with
     * <code>CHIME.mentions</code> and a value of the bot ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: The bot processes no standard messages.
     * </p>
     * </li>
     * </ul>
     * 
     * @param standardMessages
     *        Sets standard messages as the bot trigger. For standard messages:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL</code>: The bot processes all standard messages.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AUTO</code>: The bot responds to ALL messages when the channel has one other non-hidden member, and
     *        responds to MENTIONS when the channel has more than one other non-hidden member.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MENTIONS</code>: The bot processes all standard messages that have a message attribute with
     *        <code>CHIME.mentions</code> and a value of the bot ARN.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code>: The bot processes no standard messages.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StandardMessages
     */

    public InvokedBy withStandardMessages(String standardMessages) {
        setStandardMessages(standardMessages);
        return this;
    }

    /**
     * <p>
     * Sets standard messages as the bot trigger. For standard messages:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code>: The bot processes all standard messages.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTO</code>: The bot responds to ALL messages when the channel has one other non-hidden member, and
     * responds to MENTIONS when the channel has more than one other non-hidden member.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MENTIONS</code>: The bot processes all standard messages that have a message attribute with
     * <code>CHIME.mentions</code> and a value of the bot ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: The bot processes no standard messages.
     * </p>
     * </li>
     * </ul>
     * 
     * @param standardMessages
     *        Sets standard messages as the bot trigger. For standard messages:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL</code>: The bot processes all standard messages.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AUTO</code>: The bot responds to ALL messages when the channel has one other non-hidden member, and
     *        responds to MENTIONS when the channel has more than one other non-hidden member.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MENTIONS</code>: The bot processes all standard messages that have a message attribute with
     *        <code>CHIME.mentions</code> and a value of the bot ARN.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code>: The bot processes no standard messages.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StandardMessages
     */

    public InvokedBy withStandardMessages(StandardMessages standardMessages) {
        this.standardMessages = standardMessages.toString();
        return this;
    }

    /**
     * <p>
     * Sets targeted messages as the bot trigger. For targeted messages:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code>: The bot processes all <code>TargetedMessages</code> sent to it. The bot then responds with a
     * targeted message back to the sender.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: The bot processes no targeted messages.
     * </p>
     * </li>
     * </ul>
     * 
     * @param targetedMessages
     *        Sets targeted messages as the bot trigger. For targeted messages:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL</code>: The bot processes all <code>TargetedMessages</code> sent to it. The bot then responds
     *        with a targeted message back to the sender.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code>: The bot processes no targeted messages.
     *        </p>
     *        </li>
     * @see TargetedMessages
     */

    public void setTargetedMessages(String targetedMessages) {
        this.targetedMessages = targetedMessages;
    }

    /**
     * <p>
     * Sets targeted messages as the bot trigger. For targeted messages:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code>: The bot processes all <code>TargetedMessages</code> sent to it. The bot then responds with a
     * targeted message back to the sender.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: The bot processes no targeted messages.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Sets targeted messages as the bot trigger. For targeted messages:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALL</code>: The bot processes all <code>TargetedMessages</code> sent to it. The bot then responds
     *         with a targeted message back to the sender.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NONE</code>: The bot processes no targeted messages.
     *         </p>
     *         </li>
     * @see TargetedMessages
     */

    public String getTargetedMessages() {
        return this.targetedMessages;
    }

    /**
     * <p>
     * Sets targeted messages as the bot trigger. For targeted messages:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code>: The bot processes all <code>TargetedMessages</code> sent to it. The bot then responds with a
     * targeted message back to the sender.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: The bot processes no targeted messages.
     * </p>
     * </li>
     * </ul>
     * 
     * @param targetedMessages
     *        Sets targeted messages as the bot trigger. For targeted messages:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL</code>: The bot processes all <code>TargetedMessages</code> sent to it. The bot then responds
     *        with a targeted message back to the sender.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code>: The bot processes no targeted messages.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetedMessages
     */

    public InvokedBy withTargetedMessages(String targetedMessages) {
        setTargetedMessages(targetedMessages);
        return this;
    }

    /**
     * <p>
     * Sets targeted messages as the bot trigger. For targeted messages:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code>: The bot processes all <code>TargetedMessages</code> sent to it. The bot then responds with a
     * targeted message back to the sender.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: The bot processes no targeted messages.
     * </p>
     * </li>
     * </ul>
     * 
     * @param targetedMessages
     *        Sets targeted messages as the bot trigger. For targeted messages:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL</code>: The bot processes all <code>TargetedMessages</code> sent to it. The bot then responds
     *        with a targeted message back to the sender.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code>: The bot processes no targeted messages.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetedMessages
     */

    public InvokedBy withTargetedMessages(TargetedMessages targetedMessages) {
        this.targetedMessages = targetedMessages.toString();
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
        if (getStandardMessages() != null)
            sb.append("StandardMessages: ").append(getStandardMessages()).append(",");
        if (getTargetedMessages() != null)
            sb.append("TargetedMessages: ").append(getTargetedMessages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InvokedBy == false)
            return false;
        InvokedBy other = (InvokedBy) obj;
        if (other.getStandardMessages() == null ^ this.getStandardMessages() == null)
            return false;
        if (other.getStandardMessages() != null && other.getStandardMessages().equals(this.getStandardMessages()) == false)
            return false;
        if (other.getTargetedMessages() == null ^ this.getTargetedMessages() == null)
            return false;
        if (other.getTargetedMessages() != null && other.getTargetedMessages().equals(this.getTargetedMessages()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStandardMessages() == null) ? 0 : getStandardMessages().hashCode());
        hashCode = prime * hashCode + ((getTargetedMessages() == null) ? 0 : getTargetedMessages().hashCode());
        return hashCode;
    }

    @Override
    public InvokedBy clone() {
        try {
            return (InvokedBy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkidentity.model.transform.InvokedByMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
