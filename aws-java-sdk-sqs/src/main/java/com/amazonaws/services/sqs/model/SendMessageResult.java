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
package com.amazonaws.services.sqs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The <code>MD5OfMessageBody</code> and <code>MessageId</code> elements.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/SendMessage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendMessageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An MD5 digest of the non-URL-encoded message attribute string. You can use this attribute to verify that Amazon
     * SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5 digest. For
     * information about MD5, see <a href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.
     * </p>
     */
    private String mD5OfMessageBody;
    /**
     * <p>
     * An MD5 digest of the non-URL-encoded message attribute string. You can use this attribute to verify that Amazon
     * SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5 digest. For
     * information about MD5, see <a href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.
     * </p>
     */
    private String mD5OfMessageAttributes;
    /**
     * <p>
     * An attribute containing the <code>MessageId</code> of the message sent to the queue. For more information, see <a
     * href
     * ="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-queue-message-identifiers.html"
     * >Queue and Message Identifiers</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     */
    private String messageId;
    /**
     * <p>
     * This parameter applies only to FIFO (first-in-first-out) queues.
     * </p>
     * <p>
     * The large, non-consecutive number that Amazon SQS assigns to each message.
     * </p>
     * <p>
     * The length of <code>SequenceNumber</code> is 128 bits. <code>SequenceNumber</code> continues to increase for a
     * particular <code>MessageGroupId</code>.
     * </p>
     */
    private String sequenceNumber;

    /**
     * <p>
     * An MD5 digest of the non-URL-encoded message attribute string. You can use this attribute to verify that Amazon
     * SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5 digest. For
     * information about MD5, see <a href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.
     * </p>
     * 
     * @param mD5OfMessageBody
     *        An MD5 digest of the non-URL-encoded message attribute string. You can use this attribute to verify that
     *        Amazon SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5
     *        digest. For information about MD5, see <a href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.
     */

    public void setMD5OfMessageBody(String mD5OfMessageBody) {
        this.mD5OfMessageBody = mD5OfMessageBody;
    }

    /**
     * <p>
     * An MD5 digest of the non-URL-encoded message attribute string. You can use this attribute to verify that Amazon
     * SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5 digest. For
     * information about MD5, see <a href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.
     * </p>
     * 
     * @return An MD5 digest of the non-URL-encoded message attribute string. You can use this attribute to verify that
     *         Amazon SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5
     *         digest. For information about MD5, see <a href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.
     */

    public String getMD5OfMessageBody() {
        return this.mD5OfMessageBody;
    }

    /**
     * <p>
     * An MD5 digest of the non-URL-encoded message attribute string. You can use this attribute to verify that Amazon
     * SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5 digest. For
     * information about MD5, see <a href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.
     * </p>
     * 
     * @param mD5OfMessageBody
     *        An MD5 digest of the non-URL-encoded message attribute string. You can use this attribute to verify that
     *        Amazon SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5
     *        digest. For information about MD5, see <a href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendMessageResult withMD5OfMessageBody(String mD5OfMessageBody) {
        setMD5OfMessageBody(mD5OfMessageBody);
        return this;
    }

    /**
     * <p>
     * An MD5 digest of the non-URL-encoded message attribute string. You can use this attribute to verify that Amazon
     * SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5 digest. For
     * information about MD5, see <a href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.
     * </p>
     * 
     * @param mD5OfMessageAttributes
     *        An MD5 digest of the non-URL-encoded message attribute string. You can use this attribute to verify that
     *        Amazon SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5
     *        digest. For information about MD5, see <a href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.
     */

    public void setMD5OfMessageAttributes(String mD5OfMessageAttributes) {
        this.mD5OfMessageAttributes = mD5OfMessageAttributes;
    }

    /**
     * <p>
     * An MD5 digest of the non-URL-encoded message attribute string. You can use this attribute to verify that Amazon
     * SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5 digest. For
     * information about MD5, see <a href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.
     * </p>
     * 
     * @return An MD5 digest of the non-URL-encoded message attribute string. You can use this attribute to verify that
     *         Amazon SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5
     *         digest. For information about MD5, see <a href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.
     */

    public String getMD5OfMessageAttributes() {
        return this.mD5OfMessageAttributes;
    }

    /**
     * <p>
     * An MD5 digest of the non-URL-encoded message attribute string. You can use this attribute to verify that Amazon
     * SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5 digest. For
     * information about MD5, see <a href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.
     * </p>
     * 
     * @param mD5OfMessageAttributes
     *        An MD5 digest of the non-URL-encoded message attribute string. You can use this attribute to verify that
     *        Amazon SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5
     *        digest. For information about MD5, see <a href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendMessageResult withMD5OfMessageAttributes(String mD5OfMessageAttributes) {
        setMD5OfMessageAttributes(mD5OfMessageAttributes);
        return this;
    }

    /**
     * <p>
     * An attribute containing the <code>MessageId</code> of the message sent to the queue. For more information, see <a
     * href
     * ="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-queue-message-identifiers.html"
     * >Queue and Message Identifiers</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * 
     * @param messageId
     *        An attribute containing the <code>MessageId</code> of the message sent to the queue. For more information,
     *        see <a href=
     *        "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-queue-message-identifiers.html"
     *        >Queue and Message Identifiers</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     */

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * <p>
     * An attribute containing the <code>MessageId</code> of the message sent to the queue. For more information, see <a
     * href
     * ="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-queue-message-identifiers.html"
     * >Queue and Message Identifiers</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * 
     * @return An attribute containing the <code>MessageId</code> of the message sent to the queue. For more
     *         information, see <a href=
     *         "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-queue-message-identifiers.html"
     *         >Queue and Message Identifiers</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     */

    public String getMessageId() {
        return this.messageId;
    }

    /**
     * <p>
     * An attribute containing the <code>MessageId</code> of the message sent to the queue. For more information, see <a
     * href
     * ="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-queue-message-identifiers.html"
     * >Queue and Message Identifiers</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * 
     * @param messageId
     *        An attribute containing the <code>MessageId</code> of the message sent to the queue. For more information,
     *        see <a href=
     *        "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-queue-message-identifiers.html"
     *        >Queue and Message Identifiers</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendMessageResult withMessageId(String messageId) {
        setMessageId(messageId);
        return this;
    }

    /**
     * <p>
     * This parameter applies only to FIFO (first-in-first-out) queues.
     * </p>
     * <p>
     * The large, non-consecutive number that Amazon SQS assigns to each message.
     * </p>
     * <p>
     * The length of <code>SequenceNumber</code> is 128 bits. <code>SequenceNumber</code> continues to increase for a
     * particular <code>MessageGroupId</code>.
     * </p>
     * 
     * @param sequenceNumber
     *        This parameter applies only to FIFO (first-in-first-out) queues.</p>
     *        <p>
     *        The large, non-consecutive number that Amazon SQS assigns to each message.
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
     * This parameter applies only to FIFO (first-in-first-out) queues.
     * </p>
     * <p>
     * The large, non-consecutive number that Amazon SQS assigns to each message.
     * </p>
     * <p>
     * The length of <code>SequenceNumber</code> is 128 bits. <code>SequenceNumber</code> continues to increase for a
     * particular <code>MessageGroupId</code>.
     * </p>
     * 
     * @return This parameter applies only to FIFO (first-in-first-out) queues.</p>
     *         <p>
     *         The large, non-consecutive number that Amazon SQS assigns to each message.
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
     * This parameter applies only to FIFO (first-in-first-out) queues.
     * </p>
     * <p>
     * The large, non-consecutive number that Amazon SQS assigns to each message.
     * </p>
     * <p>
     * The length of <code>SequenceNumber</code> is 128 bits. <code>SequenceNumber</code> continues to increase for a
     * particular <code>MessageGroupId</code>.
     * </p>
     * 
     * @param sequenceNumber
     *        This parameter applies only to FIFO (first-in-first-out) queues.</p>
     *        <p>
     *        The large, non-consecutive number that Amazon SQS assigns to each message.
     *        </p>
     *        <p>
     *        The length of <code>SequenceNumber</code> is 128 bits. <code>SequenceNumber</code> continues to increase
     *        for a particular <code>MessageGroupId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendMessageResult withSequenceNumber(String sequenceNumber) {
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
        if (getMD5OfMessageBody() != null)
            sb.append("MD5OfMessageBody: ").append(getMD5OfMessageBody()).append(",");
        if (getMD5OfMessageAttributes() != null)
            sb.append("MD5OfMessageAttributes: ").append(getMD5OfMessageAttributes()).append(",");
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

        if (obj instanceof SendMessageResult == false)
            return false;
        SendMessageResult other = (SendMessageResult) obj;
        if (other.getMD5OfMessageBody() == null ^ this.getMD5OfMessageBody() == null)
            return false;
        if (other.getMD5OfMessageBody() != null && other.getMD5OfMessageBody().equals(this.getMD5OfMessageBody()) == false)
            return false;
        if (other.getMD5OfMessageAttributes() == null ^ this.getMD5OfMessageAttributes() == null)
            return false;
        if (other.getMD5OfMessageAttributes() != null && other.getMD5OfMessageAttributes().equals(this.getMD5OfMessageAttributes()) == false)
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

        hashCode = prime * hashCode + ((getMD5OfMessageBody() == null) ? 0 : getMD5OfMessageBody().hashCode());
        hashCode = prime * hashCode + ((getMD5OfMessageAttributes() == null) ? 0 : getMD5OfMessageAttributes().hashCode());
        hashCode = prime * hashCode + ((getMessageId() == null) ? 0 : getMessageId().hashCode());
        hashCode = prime * hashCode + ((getSequenceNumber() == null) ? 0 : getSequenceNumber().hashCode());
        return hashCode;
    }

    @Override
    public SendMessageResult clone() {
        try {
            return (SendMessageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
