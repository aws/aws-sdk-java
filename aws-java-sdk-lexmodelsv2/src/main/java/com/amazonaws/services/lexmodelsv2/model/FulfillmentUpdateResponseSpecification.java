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
 * Provides settings for a message that is sent periodically to the user while a fulfillment Lambda function is running.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/FulfillmentUpdateResponseSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FulfillmentUpdateResponseSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The frequency that a message is sent to the user. When the period ends, Amazon Lex chooses a message from the
     * message groups and plays it to the user. If the fulfillment Lambda returns before the first period ends, an
     * update message is not played to the user.
     * </p>
     */
    private Integer frequencyInSeconds;
    /**
     * <p>
     * One to 5 message groups that contain update messages. Amazon Lex chooses one of the messages to play to the user.
     * </p>
     */
    private java.util.List<MessageGroup> messageGroups;
    /**
     * <p>
     * Determines whether the user can interrupt an update message while it is playing.
     * </p>
     */
    private Boolean allowInterrupt;

    /**
     * <p>
     * The frequency that a message is sent to the user. When the period ends, Amazon Lex chooses a message from the
     * message groups and plays it to the user. If the fulfillment Lambda returns before the first period ends, an
     * update message is not played to the user.
     * </p>
     * 
     * @param frequencyInSeconds
     *        The frequency that a message is sent to the user. When the period ends, Amazon Lex chooses a message from
     *        the message groups and plays it to the user. If the fulfillment Lambda returns before the first period
     *        ends, an update message is not played to the user.
     */

    public void setFrequencyInSeconds(Integer frequencyInSeconds) {
        this.frequencyInSeconds = frequencyInSeconds;
    }

    /**
     * <p>
     * The frequency that a message is sent to the user. When the period ends, Amazon Lex chooses a message from the
     * message groups and plays it to the user. If the fulfillment Lambda returns before the first period ends, an
     * update message is not played to the user.
     * </p>
     * 
     * @return The frequency that a message is sent to the user. When the period ends, Amazon Lex chooses a message from
     *         the message groups and plays it to the user. If the fulfillment Lambda returns before the first period
     *         ends, an update message is not played to the user.
     */

    public Integer getFrequencyInSeconds() {
        return this.frequencyInSeconds;
    }

    /**
     * <p>
     * The frequency that a message is sent to the user. When the period ends, Amazon Lex chooses a message from the
     * message groups and plays it to the user. If the fulfillment Lambda returns before the first period ends, an
     * update message is not played to the user.
     * </p>
     * 
     * @param frequencyInSeconds
     *        The frequency that a message is sent to the user. When the period ends, Amazon Lex chooses a message from
     *        the message groups and plays it to the user. If the fulfillment Lambda returns before the first period
     *        ends, an update message is not played to the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FulfillmentUpdateResponseSpecification withFrequencyInSeconds(Integer frequencyInSeconds) {
        setFrequencyInSeconds(frequencyInSeconds);
        return this;
    }

    /**
     * <p>
     * One to 5 message groups that contain update messages. Amazon Lex chooses one of the messages to play to the user.
     * </p>
     * 
     * @return One to 5 message groups that contain update messages. Amazon Lex chooses one of the messages to play to
     *         the user.
     */

    public java.util.List<MessageGroup> getMessageGroups() {
        return messageGroups;
    }

    /**
     * <p>
     * One to 5 message groups that contain update messages. Amazon Lex chooses one of the messages to play to the user.
     * </p>
     * 
     * @param messageGroups
     *        One to 5 message groups that contain update messages. Amazon Lex chooses one of the messages to play to
     *        the user.
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
     * One to 5 message groups that contain update messages. Amazon Lex chooses one of the messages to play to the user.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMessageGroups(java.util.Collection)} or {@link #withMessageGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param messageGroups
     *        One to 5 message groups that contain update messages. Amazon Lex chooses one of the messages to play to
     *        the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FulfillmentUpdateResponseSpecification withMessageGroups(MessageGroup... messageGroups) {
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
     * One to 5 message groups that contain update messages. Amazon Lex chooses one of the messages to play to the user.
     * </p>
     * 
     * @param messageGroups
     *        One to 5 message groups that contain update messages. Amazon Lex chooses one of the messages to play to
     *        the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FulfillmentUpdateResponseSpecification withMessageGroups(java.util.Collection<MessageGroup> messageGroups) {
        setMessageGroups(messageGroups);
        return this;
    }

    /**
     * <p>
     * Determines whether the user can interrupt an update message while it is playing.
     * </p>
     * 
     * @param allowInterrupt
     *        Determines whether the user can interrupt an update message while it is playing.
     */

    public void setAllowInterrupt(Boolean allowInterrupt) {
        this.allowInterrupt = allowInterrupt;
    }

    /**
     * <p>
     * Determines whether the user can interrupt an update message while it is playing.
     * </p>
     * 
     * @return Determines whether the user can interrupt an update message while it is playing.
     */

    public Boolean getAllowInterrupt() {
        return this.allowInterrupt;
    }

    /**
     * <p>
     * Determines whether the user can interrupt an update message while it is playing.
     * </p>
     * 
     * @param allowInterrupt
     *        Determines whether the user can interrupt an update message while it is playing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FulfillmentUpdateResponseSpecification withAllowInterrupt(Boolean allowInterrupt) {
        setAllowInterrupt(allowInterrupt);
        return this;
    }

    /**
     * <p>
     * Determines whether the user can interrupt an update message while it is playing.
     * </p>
     * 
     * @return Determines whether the user can interrupt an update message while it is playing.
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
        if (getFrequencyInSeconds() != null)
            sb.append("FrequencyInSeconds: ").append(getFrequencyInSeconds()).append(",");
        if (getMessageGroups() != null)
            sb.append("MessageGroups: ").append(getMessageGroups()).append(",");
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

        if (obj instanceof FulfillmentUpdateResponseSpecification == false)
            return false;
        FulfillmentUpdateResponseSpecification other = (FulfillmentUpdateResponseSpecification) obj;
        if (other.getFrequencyInSeconds() == null ^ this.getFrequencyInSeconds() == null)
            return false;
        if (other.getFrequencyInSeconds() != null && other.getFrequencyInSeconds().equals(this.getFrequencyInSeconds()) == false)
            return false;
        if (other.getMessageGroups() == null ^ this.getMessageGroups() == null)
            return false;
        if (other.getMessageGroups() != null && other.getMessageGroups().equals(this.getMessageGroups()) == false)
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

        hashCode = prime * hashCode + ((getFrequencyInSeconds() == null) ? 0 : getFrequencyInSeconds().hashCode());
        hashCode = prime * hashCode + ((getMessageGroups() == null) ? 0 : getMessageGroups().hashCode());
        hashCode = prime * hashCode + ((getAllowInterrupt() == null) ? 0 : getAllowInterrupt().hashCode());
        return hashCode;
    }

    @Override
    public FulfillmentUpdateResponseSpecification clone() {
        try {
            return (FulfillmentUpdateResponseSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.FulfillmentUpdateResponseSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
