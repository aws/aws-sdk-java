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
 * Provides settings for a message that is sent to the user when a fulfillment Lambda function starts running.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/FulfillmentStartResponseSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FulfillmentStartResponseSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The delay between when the Lambda fulfillment function starts running and the start message is played. If the
     * Lambda function returns before the delay is over, the start message isn't played.
     * </p>
     */
    private Integer delayInSeconds;
    /**
     * <p>
     * One to 5 message groups that contain start messages. Amazon Lex chooses one of the messages to play to the user.
     * </p>
     */
    private java.util.List<MessageGroup> messageGroups;
    /**
     * <p>
     * Determines whether the user can interrupt the start message while it is playing.
     * </p>
     */
    private Boolean allowInterrupt;

    /**
     * <p>
     * The delay between when the Lambda fulfillment function starts running and the start message is played. If the
     * Lambda function returns before the delay is over, the start message isn't played.
     * </p>
     * 
     * @param delayInSeconds
     *        The delay between when the Lambda fulfillment function starts running and the start message is played. If
     *        the Lambda function returns before the delay is over, the start message isn't played.
     */

    public void setDelayInSeconds(Integer delayInSeconds) {
        this.delayInSeconds = delayInSeconds;
    }

    /**
     * <p>
     * The delay between when the Lambda fulfillment function starts running and the start message is played. If the
     * Lambda function returns before the delay is over, the start message isn't played.
     * </p>
     * 
     * @return The delay between when the Lambda fulfillment function starts running and the start message is played. If
     *         the Lambda function returns before the delay is over, the start message isn't played.
     */

    public Integer getDelayInSeconds() {
        return this.delayInSeconds;
    }

    /**
     * <p>
     * The delay between when the Lambda fulfillment function starts running and the start message is played. If the
     * Lambda function returns before the delay is over, the start message isn't played.
     * </p>
     * 
     * @param delayInSeconds
     *        The delay between when the Lambda fulfillment function starts running and the start message is played. If
     *        the Lambda function returns before the delay is over, the start message isn't played.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FulfillmentStartResponseSpecification withDelayInSeconds(Integer delayInSeconds) {
        setDelayInSeconds(delayInSeconds);
        return this;
    }

    /**
     * <p>
     * One to 5 message groups that contain start messages. Amazon Lex chooses one of the messages to play to the user.
     * </p>
     * 
     * @return One to 5 message groups that contain start messages. Amazon Lex chooses one of the messages to play to
     *         the user.
     */

    public java.util.List<MessageGroup> getMessageGroups() {
        return messageGroups;
    }

    /**
     * <p>
     * One to 5 message groups that contain start messages. Amazon Lex chooses one of the messages to play to the user.
     * </p>
     * 
     * @param messageGroups
     *        One to 5 message groups that contain start messages. Amazon Lex chooses one of the messages to play to the
     *        user.
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
     * One to 5 message groups that contain start messages. Amazon Lex chooses one of the messages to play to the user.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMessageGroups(java.util.Collection)} or {@link #withMessageGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param messageGroups
     *        One to 5 message groups that contain start messages. Amazon Lex chooses one of the messages to play to the
     *        user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FulfillmentStartResponseSpecification withMessageGroups(MessageGroup... messageGroups) {
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
     * One to 5 message groups that contain start messages. Amazon Lex chooses one of the messages to play to the user.
     * </p>
     * 
     * @param messageGroups
     *        One to 5 message groups that contain start messages. Amazon Lex chooses one of the messages to play to the
     *        user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FulfillmentStartResponseSpecification withMessageGroups(java.util.Collection<MessageGroup> messageGroups) {
        setMessageGroups(messageGroups);
        return this;
    }

    /**
     * <p>
     * Determines whether the user can interrupt the start message while it is playing.
     * </p>
     * 
     * @param allowInterrupt
     *        Determines whether the user can interrupt the start message while it is playing.
     */

    public void setAllowInterrupt(Boolean allowInterrupt) {
        this.allowInterrupt = allowInterrupt;
    }

    /**
     * <p>
     * Determines whether the user can interrupt the start message while it is playing.
     * </p>
     * 
     * @return Determines whether the user can interrupt the start message while it is playing.
     */

    public Boolean getAllowInterrupt() {
        return this.allowInterrupt;
    }

    /**
     * <p>
     * Determines whether the user can interrupt the start message while it is playing.
     * </p>
     * 
     * @param allowInterrupt
     *        Determines whether the user can interrupt the start message while it is playing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FulfillmentStartResponseSpecification withAllowInterrupt(Boolean allowInterrupt) {
        setAllowInterrupt(allowInterrupt);
        return this;
    }

    /**
     * <p>
     * Determines whether the user can interrupt the start message while it is playing.
     * </p>
     * 
     * @return Determines whether the user can interrupt the start message while it is playing.
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
        if (getDelayInSeconds() != null)
            sb.append("DelayInSeconds: ").append(getDelayInSeconds()).append(",");
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

        if (obj instanceof FulfillmentStartResponseSpecification == false)
            return false;
        FulfillmentStartResponseSpecification other = (FulfillmentStartResponseSpecification) obj;
        if (other.getDelayInSeconds() == null ^ this.getDelayInSeconds() == null)
            return false;
        if (other.getDelayInSeconds() != null && other.getDelayInSeconds().equals(this.getDelayInSeconds()) == false)
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

        hashCode = prime * hashCode + ((getDelayInSeconds() == null) ? 0 : getDelayInSeconds().hashCode());
        hashCode = prime * hashCode + ((getMessageGroups() == null) ? 0 : getMessageGroups().hashCode());
        hashCode = prime * hashCode + ((getAllowInterrupt() == null) ? 0 : getAllowInterrupt().hashCode());
        return hashCode;
    }

    @Override
    public FulfillmentStartResponseSpecification clone() {
        try {
            return (FulfillmentStartResponseSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.FulfillmentStartResponseSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
