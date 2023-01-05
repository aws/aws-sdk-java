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
package com.amazonaws.services.sns.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Encloses data related to a successful message in a batch request for topic.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/PublishBatchResultEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PublishBatchResultEntry implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>Id</code> of an entry in a batch request.
     * </p>
     */
    private String id;
    /**
     * <p>
     * An identifier for the message.
     * </p>
     */
    private String messageId;
    /**
     * <p>
     * This parameter applies only to FIFO (first-in-first-out) topics.
     * </p>
     * <p>
     * The large, non-consecutive number that Amazon SNS assigns to each message.
     * </p>
     * <p>
     * The length of <code>SequenceNumber</code> is 128 bits. <code>SequenceNumber</code> continues to increase for a
     * particular <code>MessageGroupId</code>.
     * </p>
     */
    private String sequenceNumber;

    /**
     * <p>
     * The <code>Id</code> of an entry in a batch request.
     * </p>
     * 
     * @param id
     *        The <code>Id</code> of an entry in a batch request.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The <code>Id</code> of an entry in a batch request.
     * </p>
     * 
     * @return The <code>Id</code> of an entry in a batch request.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The <code>Id</code> of an entry in a batch request.
     * </p>
     * 
     * @param id
     *        The <code>Id</code> of an entry in a batch request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishBatchResultEntry withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * An identifier for the message.
     * </p>
     * 
     * @param messageId
     *        An identifier for the message.
     */

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * <p>
     * An identifier for the message.
     * </p>
     * 
     * @return An identifier for the message.
     */

    public String getMessageId() {
        return this.messageId;
    }

    /**
     * <p>
     * An identifier for the message.
     * </p>
     * 
     * @param messageId
     *        An identifier for the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishBatchResultEntry withMessageId(String messageId) {
        setMessageId(messageId);
        return this;
    }

    /**
     * <p>
     * This parameter applies only to FIFO (first-in-first-out) topics.
     * </p>
     * <p>
     * The large, non-consecutive number that Amazon SNS assigns to each message.
     * </p>
     * <p>
     * The length of <code>SequenceNumber</code> is 128 bits. <code>SequenceNumber</code> continues to increase for a
     * particular <code>MessageGroupId</code>.
     * </p>
     * 
     * @param sequenceNumber
     *        This parameter applies only to FIFO (first-in-first-out) topics.</p>
     *        <p>
     *        The large, non-consecutive number that Amazon SNS assigns to each message.
     *        </p>
     *        <p>
     *        The length of <code>SequenceNumber</code> is 128 bits. <code>SequenceNumber</code> continues to increase
     *        for a particular <code>MessageGroupId</code>.
     */

    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    /**
     * <p>
     * This parameter applies only to FIFO (first-in-first-out) topics.
     * </p>
     * <p>
     * The large, non-consecutive number that Amazon SNS assigns to each message.
     * </p>
     * <p>
     * The length of <code>SequenceNumber</code> is 128 bits. <code>SequenceNumber</code> continues to increase for a
     * particular <code>MessageGroupId</code>.
     * </p>
     * 
     * @return This parameter applies only to FIFO (first-in-first-out) topics.</p>
     *         <p>
     *         The large, non-consecutive number that Amazon SNS assigns to each message.
     *         </p>
     *         <p>
     *         The length of <code>SequenceNumber</code> is 128 bits. <code>SequenceNumber</code> continues to increase
     *         for a particular <code>MessageGroupId</code>.
     */

    public String getSequenceNumber() {
        return this.sequenceNumber;
    }

    /**
     * <p>
     * This parameter applies only to FIFO (first-in-first-out) topics.
     * </p>
     * <p>
     * The large, non-consecutive number that Amazon SNS assigns to each message.
     * </p>
     * <p>
     * The length of <code>SequenceNumber</code> is 128 bits. <code>SequenceNumber</code> continues to increase for a
     * particular <code>MessageGroupId</code>.
     * </p>
     * 
     * @param sequenceNumber
     *        This parameter applies only to FIFO (first-in-first-out) topics.</p>
     *        <p>
     *        The large, non-consecutive number that Amazon SNS assigns to each message.
     *        </p>
     *        <p>
     *        The length of <code>SequenceNumber</code> is 128 bits. <code>SequenceNumber</code> continues to increase
     *        for a particular <code>MessageGroupId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishBatchResultEntry withSequenceNumber(String sequenceNumber) {
        setSequenceNumber(sequenceNumber);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getMessageId() != null)
            sb.append("MessageId: ").append(getMessageId()).append(",");
        if (getSequenceNumber() != null)
            sb.append("SequenceNumber: ").append(getSequenceNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PublishBatchResultEntry == false)
            return false;
        PublishBatchResultEntry other = (PublishBatchResultEntry) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getMessageId() == null ^ this.getMessageId() == null)
            return false;
        if (other.getMessageId() != null && other.getMessageId().equals(this.getMessageId()) == false)
            return false;
        if (other.getSequenceNumber() == null ^ this.getSequenceNumber() == null)
            return false;
        if (other.getSequenceNumber() != null && other.getSequenceNumber().equals(this.getSequenceNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getMessageId() == null) ? 0 : getMessageId().hashCode());
        hashCode = prime * hashCode + ((getSequenceNumber() == null) ? 0 : getSequenceNumber().hashCode());
        return hashCode;
    }

    @Override
    public PublishBatchResultEntry clone() {
        try {
            return (PublishBatchResultEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
