/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Encloses a message ID for successfully enqueued message of a
 * SendMessageBatchRequest.
 * </p>
 */
public class SendMessageBatchResultEntry {

    /**
     * An identifier for the message in this batch.
     */
    private String id;

    /**
     * An identifier for the message.
     */
    private String messageId;

    /**
     * An MD5 digest of the non-URL-encoded message body string. This can be
     * used to verify that SQS received the message correctly. SQS first URL
     * decodes the message before creating the MD5 digest. For information
     * about MD5, go to <a
     * p://faqs.org/rfcs/rfc1321.html">http://faqs.org/rfcs/rfc1321.html</a>.
     */
    private String mD5OfMessageBody;

    /**
     * An identifier for the message in this batch.
     *
     * @return An identifier for the message in this batch.
     */
    public String getId() {
        return id;
    }
    
    /**
     * An identifier for the message in this batch.
     *
     * @param id An identifier for the message in this batch.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * An identifier for the message in this batch.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param id An identifier for the message in this batch.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SendMessageBatchResultEntry withId(String id) {
        this.id = id;
        return this;
    }
    
    
    /**
     * An identifier for the message.
     *
     * @return An identifier for the message.
     */
    public String getMessageId() {
        return messageId;
    }
    
    /**
     * An identifier for the message.
     *
     * @param messageId An identifier for the message.
     */
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }
    
    /**
     * An identifier for the message.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param messageId An identifier for the message.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SendMessageBatchResultEntry withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    
    
    /**
     * An MD5 digest of the non-URL-encoded message body string. This can be
     * used to verify that SQS received the message correctly. SQS first URL
     * decodes the message before creating the MD5 digest. For information
     * about MD5, go to <a
     * p://faqs.org/rfcs/rfc1321.html">http://faqs.org/rfcs/rfc1321.html</a>.
     *
     * @return An MD5 digest of the non-URL-encoded message body string. This can be
     *         used to verify that SQS received the message correctly. SQS first URL
     *         decodes the message before creating the MD5 digest. For information
     *         about MD5, go to <a
     *         p://faqs.org/rfcs/rfc1321.html">http://faqs.org/rfcs/rfc1321.html</a>.
     */
    public String getMD5OfMessageBody() {
        return mD5OfMessageBody;
    }
    
    /**
     * An MD5 digest of the non-URL-encoded message body string. This can be
     * used to verify that SQS received the message correctly. SQS first URL
     * decodes the message before creating the MD5 digest. For information
     * about MD5, go to <a
     * p://faqs.org/rfcs/rfc1321.html">http://faqs.org/rfcs/rfc1321.html</a>.
     *
     * @param mD5OfMessageBody An MD5 digest of the non-URL-encoded message body string. This can be
     *         used to verify that SQS received the message correctly. SQS first URL
     *         decodes the message before creating the MD5 digest. For information
     *         about MD5, go to <a
     *         p://faqs.org/rfcs/rfc1321.html">http://faqs.org/rfcs/rfc1321.html</a>.
     */
    public void setMD5OfMessageBody(String mD5OfMessageBody) {
        this.mD5OfMessageBody = mD5OfMessageBody;
    }
    
    /**
     * An MD5 digest of the non-URL-encoded message body string. This can be
     * used to verify that SQS received the message correctly. SQS first URL
     * decodes the message before creating the MD5 digest. For information
     * about MD5, go to <a
     * p://faqs.org/rfcs/rfc1321.html">http://faqs.org/rfcs/rfc1321.html</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param mD5OfMessageBody An MD5 digest of the non-URL-encoded message body string. This can be
     *         used to verify that SQS received the message correctly. SQS first URL
     *         decodes the message before creating the MD5 digest. For information
     *         about MD5, go to <a
     *         p://faqs.org/rfcs/rfc1321.html">http://faqs.org/rfcs/rfc1321.html</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SendMessageBatchResultEntry withMD5OfMessageBody(String mD5OfMessageBody) {
        this.mD5OfMessageBody = mD5OfMessageBody;
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
        sb.append("Id: " + id + ", ");
        sb.append("MessageId: " + messageId + ", ");
        sb.append("MD5OfMessageBody: " + mD5OfMessageBody + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    