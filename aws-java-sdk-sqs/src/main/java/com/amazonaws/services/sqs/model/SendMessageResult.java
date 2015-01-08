/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.sqs.model;

import java.io.Serializable;

/**
 * <p>
 * The MD5OfMessageBody and MessageId elements.
 * </p>
 */
public class SendMessageResult implements Serializable {

    /**
     * An MD5 digest of the non-URL-encoded message body string. This can be
     * used to verify that Amazon SQS received the message correctly. Amazon
     * SQS first URL decodes the message before creating the MD5 digest. For
     * information about MD5, go to <a
     * href="http://www.faqs.org/rfcs/rfc1321.html">http://www.faqs.org/rfcs/rfc1321.html</a>.
     */
    private String mD5OfMessageBody;

    /**
     * An MD5 digest of the non-URL-encoded message attribute string. This
     * can be used to verify that Amazon SQS received the message correctly.
     * Amazon SQS first URL decodes the message before creating the MD5
     * digest. For information about MD5, go to <a
     * href="http://www.faqs.org/rfcs/rfc1321.html">http://www.faqs.org/rfcs/rfc1321.html</a>.
     */
    private String mD5OfMessageAttributes;

    /**
     * An element containing the message ID of the message sent to the queue.
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ImportantIdentifiers.html">Queue
     * and Message Identifiers</a> in the <i>Amazon SQS Developer Guide</i>.
     */
    private String messageId;

    /**
     * An MD5 digest of the non-URL-encoded message body string. This can be
     * used to verify that Amazon SQS received the message correctly. Amazon
     * SQS first URL decodes the message before creating the MD5 digest. For
     * information about MD5, go to <a
     * href="http://www.faqs.org/rfcs/rfc1321.html">http://www.faqs.org/rfcs/rfc1321.html</a>.
     *
     * @return An MD5 digest of the non-URL-encoded message body string. This can be
     *         used to verify that Amazon SQS received the message correctly. Amazon
     *         SQS first URL decodes the message before creating the MD5 digest. For
     *         information about MD5, go to <a
     *         href="http://www.faqs.org/rfcs/rfc1321.html">http://www.faqs.org/rfcs/rfc1321.html</a>.
     */
    public String getMD5OfMessageBody() {
        return mD5OfMessageBody;
    }
    
    /**
     * An MD5 digest of the non-URL-encoded message body string. This can be
     * used to verify that Amazon SQS received the message correctly. Amazon
     * SQS first URL decodes the message before creating the MD5 digest. For
     * information about MD5, go to <a
     * href="http://www.faqs.org/rfcs/rfc1321.html">http://www.faqs.org/rfcs/rfc1321.html</a>.
     *
     * @param mD5OfMessageBody An MD5 digest of the non-URL-encoded message body string. This can be
     *         used to verify that Amazon SQS received the message correctly. Amazon
     *         SQS first URL decodes the message before creating the MD5 digest. For
     *         information about MD5, go to <a
     *         href="http://www.faqs.org/rfcs/rfc1321.html">http://www.faqs.org/rfcs/rfc1321.html</a>.
     */
    public void setMD5OfMessageBody(String mD5OfMessageBody) {
        this.mD5OfMessageBody = mD5OfMessageBody;
    }
    
    /**
     * An MD5 digest of the non-URL-encoded message body string. This can be
     * used to verify that Amazon SQS received the message correctly. Amazon
     * SQS first URL decodes the message before creating the MD5 digest. For
     * information about MD5, go to <a
     * href="http://www.faqs.org/rfcs/rfc1321.html">http://www.faqs.org/rfcs/rfc1321.html</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param mD5OfMessageBody An MD5 digest of the non-URL-encoded message body string. This can be
     *         used to verify that Amazon SQS received the message correctly. Amazon
     *         SQS first URL decodes the message before creating the MD5 digest. For
     *         information about MD5, go to <a
     *         href="http://www.faqs.org/rfcs/rfc1321.html">http://www.faqs.org/rfcs/rfc1321.html</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SendMessageResult withMD5OfMessageBody(String mD5OfMessageBody) {
        this.mD5OfMessageBody = mD5OfMessageBody;
        return this;
    }

    /**
     * An MD5 digest of the non-URL-encoded message attribute string. This
     * can be used to verify that Amazon SQS received the message correctly.
     * Amazon SQS first URL decodes the message before creating the MD5
     * digest. For information about MD5, go to <a
     * href="http://www.faqs.org/rfcs/rfc1321.html">http://www.faqs.org/rfcs/rfc1321.html</a>.
     *
     * @return An MD5 digest of the non-URL-encoded message attribute string. This
     *         can be used to verify that Amazon SQS received the message correctly.
     *         Amazon SQS first URL decodes the message before creating the MD5
     *         digest. For information about MD5, go to <a
     *         href="http://www.faqs.org/rfcs/rfc1321.html">http://www.faqs.org/rfcs/rfc1321.html</a>.
     */
    public String getMD5OfMessageAttributes() {
        return mD5OfMessageAttributes;
    }
    
    /**
     * An MD5 digest of the non-URL-encoded message attribute string. This
     * can be used to verify that Amazon SQS received the message correctly.
     * Amazon SQS first URL decodes the message before creating the MD5
     * digest. For information about MD5, go to <a
     * href="http://www.faqs.org/rfcs/rfc1321.html">http://www.faqs.org/rfcs/rfc1321.html</a>.
     *
     * @param mD5OfMessageAttributes An MD5 digest of the non-URL-encoded message attribute string. This
     *         can be used to verify that Amazon SQS received the message correctly.
     *         Amazon SQS first URL decodes the message before creating the MD5
     *         digest. For information about MD5, go to <a
     *         href="http://www.faqs.org/rfcs/rfc1321.html">http://www.faqs.org/rfcs/rfc1321.html</a>.
     */
    public void setMD5OfMessageAttributes(String mD5OfMessageAttributes) {
        this.mD5OfMessageAttributes = mD5OfMessageAttributes;
    }
    
    /**
     * An MD5 digest of the non-URL-encoded message attribute string. This
     * can be used to verify that Amazon SQS received the message correctly.
     * Amazon SQS first URL decodes the message before creating the MD5
     * digest. For information about MD5, go to <a
     * href="http://www.faqs.org/rfcs/rfc1321.html">http://www.faqs.org/rfcs/rfc1321.html</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param mD5OfMessageAttributes An MD5 digest of the non-URL-encoded message attribute string. This
     *         can be used to verify that Amazon SQS received the message correctly.
     *         Amazon SQS first URL decodes the message before creating the MD5
     *         digest. For information about MD5, go to <a
     *         href="http://www.faqs.org/rfcs/rfc1321.html">http://www.faqs.org/rfcs/rfc1321.html</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SendMessageResult withMD5OfMessageAttributes(String mD5OfMessageAttributes) {
        this.mD5OfMessageAttributes = mD5OfMessageAttributes;
        return this;
    }

    /**
     * An element containing the message ID of the message sent to the queue.
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ImportantIdentifiers.html">Queue
     * and Message Identifiers</a> in the <i>Amazon SQS Developer Guide</i>.
     *
     * @return An element containing the message ID of the message sent to the queue.
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ImportantIdentifiers.html">Queue
     *         and Message Identifiers</a> in the <i>Amazon SQS Developer Guide</i>.
     */
    public String getMessageId() {
        return messageId;
    }
    
    /**
     * An element containing the message ID of the message sent to the queue.
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ImportantIdentifiers.html">Queue
     * and Message Identifiers</a> in the <i>Amazon SQS Developer Guide</i>.
     *
     * @param messageId An element containing the message ID of the message sent to the queue.
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ImportantIdentifiers.html">Queue
     *         and Message Identifiers</a> in the <i>Amazon SQS Developer Guide</i>.
     */
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }
    
    /**
     * An element containing the message ID of the message sent to the queue.
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ImportantIdentifiers.html">Queue
     * and Message Identifiers</a> in the <i>Amazon SQS Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param messageId An element containing the message ID of the message sent to the queue.
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ImportantIdentifiers.html">Queue
     *         and Message Identifiers</a> in the <i>Amazon SQS Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SendMessageResult withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMD5OfMessageBody() != null) sb.append("MD5OfMessageBody: " + getMD5OfMessageBody() + ",");
        if (getMD5OfMessageAttributes() != null) sb.append("MD5OfMessageAttributes: " + getMD5OfMessageAttributes() + ",");
        if (getMessageId() != null) sb.append("MessageId: " + getMessageId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMD5OfMessageBody() == null) ? 0 : getMD5OfMessageBody().hashCode()); 
        hashCode = prime * hashCode + ((getMD5OfMessageAttributes() == null) ? 0 : getMD5OfMessageAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getMessageId() == null) ? 0 : getMessageId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SendMessageResult == false) return false;
        SendMessageResult other = (SendMessageResult)obj;
        
        if (other.getMD5OfMessageBody() == null ^ this.getMD5OfMessageBody() == null) return false;
        if (other.getMD5OfMessageBody() != null && other.getMD5OfMessageBody().equals(this.getMD5OfMessageBody()) == false) return false; 
        if (other.getMD5OfMessageAttributes() == null ^ this.getMD5OfMessageAttributes() == null) return false;
        if (other.getMD5OfMessageAttributes() != null && other.getMD5OfMessageAttributes().equals(this.getMD5OfMessageAttributes()) == false) return false; 
        if (other.getMessageId() == null ^ this.getMessageId() == null) return false;
        if (other.getMessageId() != null && other.getMessageId().equals(this.getMessageId()) == false) return false; 
        return true;
    }
    
}
    