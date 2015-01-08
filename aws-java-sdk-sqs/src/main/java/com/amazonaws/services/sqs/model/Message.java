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
 * An Amazon SQS message.
 * </p>
 */
public class Message implements Serializable {

    /**
     * A unique identifier for the message. Message IDs are considered unique
     * across all AWS accounts for an extended period of time.
     */
    private String messageId;

    /**
     * An identifier associated with the act of receiving the message. A new
     * receipt handle is returned every time you receive a message. When
     * deleting a message, you provide the last received receipt handle to
     * delete the message.
     */
    private String receiptHandle;

    /**
     * An MD5 digest of the non-URL-encoded message body string.
     */
    private String mD5OfBody;

    /**
     * The message's contents (not URL-encoded).
     */
    private String body;

    /**
     * <code>SenderId</code>, <code>SentTimestamp</code>,
     * <code>ApproximateReceiveCount</code>, and/or
     * <code>ApproximateFirstReceiveTimestamp</code>.
     * <code>SentTimestamp</code> and
     * <code>ApproximateFirstReceiveTimestamp</code> are each returned as an
     * integer representing the <a
     * href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in
     * milliseconds.
     */
    private java.util.Map<String,String> attributes;

    /**
     * An MD5 digest of the non-URL-encoded message attribute string. This
     * can be used to verify that Amazon SQS received the message correctly.
     * Amazon SQS first URL decodes the message before creating the MD5
     * digest. For information about MD5, go to <a
     * href="http://www.faqs.org/rfcs/rfc1321.html">http://www.faqs.org/rfcs/rfc1321.html</a>.
     */
    private String mD5OfMessageAttributes;

    /**
     * Each message attribute consists of a Name, Type, and Value. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributesNTV">Message
     * Attribute Items</a>.
     */
    private java.util.Map<String,MessageAttributeValue> messageAttributes;

    /**
     * Default constructor for a new Message object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public Message() {}
    
    /**
     * A unique identifier for the message. Message IDs are considered unique
     * across all AWS accounts for an extended period of time.
     *
     * @return A unique identifier for the message. Message IDs are considered unique
     *         across all AWS accounts for an extended period of time.
     */
    public String getMessageId() {
        return messageId;
    }
    
    /**
     * A unique identifier for the message. Message IDs are considered unique
     * across all AWS accounts for an extended period of time.
     *
     * @param messageId A unique identifier for the message. Message IDs are considered unique
     *         across all AWS accounts for an extended period of time.
     */
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }
    
    /**
     * A unique identifier for the message. Message IDs are considered unique
     * across all AWS accounts for an extended period of time.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param messageId A unique identifier for the message. Message IDs are considered unique
     *         across all AWS accounts for an extended period of time.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Message withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * An identifier associated with the act of receiving the message. A new
     * receipt handle is returned every time you receive a message. When
     * deleting a message, you provide the last received receipt handle to
     * delete the message.
     *
     * @return An identifier associated with the act of receiving the message. A new
     *         receipt handle is returned every time you receive a message. When
     *         deleting a message, you provide the last received receipt handle to
     *         delete the message.
     */
    public String getReceiptHandle() {
        return receiptHandle;
    }
    
    /**
     * An identifier associated with the act of receiving the message. A new
     * receipt handle is returned every time you receive a message. When
     * deleting a message, you provide the last received receipt handle to
     * delete the message.
     *
     * @param receiptHandle An identifier associated with the act of receiving the message. A new
     *         receipt handle is returned every time you receive a message. When
     *         deleting a message, you provide the last received receipt handle to
     *         delete the message.
     */
    public void setReceiptHandle(String receiptHandle) {
        this.receiptHandle = receiptHandle;
    }
    
    /**
     * An identifier associated with the act of receiving the message. A new
     * receipt handle is returned every time you receive a message. When
     * deleting a message, you provide the last received receipt handle to
     * delete the message.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param receiptHandle An identifier associated with the act of receiving the message. A new
     *         receipt handle is returned every time you receive a message. When
     *         deleting a message, you provide the last received receipt handle to
     *         delete the message.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Message withReceiptHandle(String receiptHandle) {
        this.receiptHandle = receiptHandle;
        return this;
    }

    /**
     * An MD5 digest of the non-URL-encoded message body string.
     *
     * @return An MD5 digest of the non-URL-encoded message body string.
     */
    public String getMD5OfBody() {
        return mD5OfBody;
    }
    
    /**
     * An MD5 digest of the non-URL-encoded message body string.
     *
     * @param mD5OfBody An MD5 digest of the non-URL-encoded message body string.
     */
    public void setMD5OfBody(String mD5OfBody) {
        this.mD5OfBody = mD5OfBody;
    }
    
    /**
     * An MD5 digest of the non-URL-encoded message body string.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param mD5OfBody An MD5 digest of the non-URL-encoded message body string.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Message withMD5OfBody(String mD5OfBody) {
        this.mD5OfBody = mD5OfBody;
        return this;
    }

    /**
     * The message's contents (not URL-encoded).
     *
     * @return The message's contents (not URL-encoded).
     */
    public String getBody() {
        return body;
    }
    
    /**
     * The message's contents (not URL-encoded).
     *
     * @param body The message's contents (not URL-encoded).
     */
    public void setBody(String body) {
        this.body = body;
    }
    
    /**
     * The message's contents (not URL-encoded).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param body The message's contents (not URL-encoded).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Message withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * <code>SenderId</code>, <code>SentTimestamp</code>,
     * <code>ApproximateReceiveCount</code>, and/or
     * <code>ApproximateFirstReceiveTimestamp</code>.
     * <code>SentTimestamp</code> and
     * <code>ApproximateFirstReceiveTimestamp</code> are each returned as an
     * integer representing the <a
     * href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in
     * milliseconds.
     *
     * @return <code>SenderId</code>, <code>SentTimestamp</code>,
     *         <code>ApproximateReceiveCount</code>, and/or
     *         <code>ApproximateFirstReceiveTimestamp</code>.
     *         <code>SentTimestamp</code> and
     *         <code>ApproximateFirstReceiveTimestamp</code> are each returned as an
     *         integer representing the <a
     *         href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in
     *         milliseconds.
     */
    public java.util.Map<String,String> getAttributes() {
        
        if (attributes == null) {
            attributes = new java.util.HashMap<String,String>();
        }
        return attributes;
    }
    
    /**
     * <code>SenderId</code>, <code>SentTimestamp</code>,
     * <code>ApproximateReceiveCount</code>, and/or
     * <code>ApproximateFirstReceiveTimestamp</code>.
     * <code>SentTimestamp</code> and
     * <code>ApproximateFirstReceiveTimestamp</code> are each returned as an
     * integer representing the <a
     * href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in
     * milliseconds.
     *
     * @param attributes <code>SenderId</code>, <code>SentTimestamp</code>,
     *         <code>ApproximateReceiveCount</code>, and/or
     *         <code>ApproximateFirstReceiveTimestamp</code>.
     *         <code>SentTimestamp</code> and
     *         <code>ApproximateFirstReceiveTimestamp</code> are each returned as an
     *         integer representing the <a
     *         href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in
     *         milliseconds.
     */
    public void setAttributes(java.util.Map<String,String> attributes) {
        this.attributes = attributes;
    }
    
    /**
     * <code>SenderId</code>, <code>SentTimestamp</code>,
     * <code>ApproximateReceiveCount</code>, and/or
     * <code>ApproximateFirstReceiveTimestamp</code>.
     * <code>SentTimestamp</code> and
     * <code>ApproximateFirstReceiveTimestamp</code> are each returned as an
     * integer representing the <a
     * href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in
     * milliseconds.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes <code>SenderId</code>, <code>SentTimestamp</code>,
     *         <code>ApproximateReceiveCount</code>, and/or
     *         <code>ApproximateFirstReceiveTimestamp</code>.
     *         <code>SentTimestamp</code> and
     *         <code>ApproximateFirstReceiveTimestamp</code> are each returned as an
     *         integer representing the <a
     *         href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in
     *         milliseconds.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Message withAttributes(java.util.Map<String,String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * <code>SenderId</code>, <code>SentTimestamp</code>,
     * <code>ApproximateReceiveCount</code>, and/or
     * <code>ApproximateFirstReceiveTimestamp</code>.
     * <code>SentTimestamp</code> and
     * <code>ApproximateFirstReceiveTimestamp</code> are each returned as an
     * integer representing the <a
     * href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in
     * milliseconds.
     * <p>
     * The method adds a new key-value pair into Attributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Attributes.
     * @param value The corresponding value of the entry to be added into Attributes.
     */
    public Message addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String,String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public Message clearAttributesEntries() {
        this.attributes = null;
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
    public Message withMD5OfMessageAttributes(String mD5OfMessageAttributes) {
        this.mD5OfMessageAttributes = mD5OfMessageAttributes;
        return this;
    }

    /**
     * Each message attribute consists of a Name, Type, and Value. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributesNTV">Message
     * Attribute Items</a>.
     *
     * @return Each message attribute consists of a Name, Type, and Value. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributesNTV">Message
     *         Attribute Items</a>.
     */
    public java.util.Map<String,MessageAttributeValue> getMessageAttributes() {
        
        if (messageAttributes == null) {
            messageAttributes = new java.util.HashMap<String,MessageAttributeValue>();
        }
        return messageAttributes;
    }
    
    /**
     * Each message attribute consists of a Name, Type, and Value. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributesNTV">Message
     * Attribute Items</a>.
     *
     * @param messageAttributes Each message attribute consists of a Name, Type, and Value. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributesNTV">Message
     *         Attribute Items</a>.
     */
    public void setMessageAttributes(java.util.Map<String,MessageAttributeValue> messageAttributes) {
        this.messageAttributes = messageAttributes;
    }
    
    /**
     * Each message attribute consists of a Name, Type, and Value. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributesNTV">Message
     * Attribute Items</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param messageAttributes Each message attribute consists of a Name, Type, and Value. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributesNTV">Message
     *         Attribute Items</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Message withMessageAttributes(java.util.Map<String,MessageAttributeValue> messageAttributes) {
        setMessageAttributes(messageAttributes);
        return this;
    }

    /**
     * Each message attribute consists of a Name, Type, and Value. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributesNTV">Message
     * Attribute Items</a>.
     * <p>
     * The method adds a new key-value pair into MessageAttributes parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into MessageAttributes.
     * @param value The corresponding value of the entry to be added into MessageAttributes.
     */
    public Message addMessageAttributesEntry(String key, MessageAttributeValue value) {
        if (null == this.messageAttributes) {
            this.messageAttributes = new java.util.HashMap<String,MessageAttributeValue>();
        }
        if (this.messageAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.messageAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into MessageAttributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public Message clearMessageAttributesEntries() {
        this.messageAttributes = null;
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
        if (getMessageId() != null) sb.append("MessageId: " + getMessageId() + ",");
        if (getReceiptHandle() != null) sb.append("ReceiptHandle: " + getReceiptHandle() + ",");
        if (getMD5OfBody() != null) sb.append("MD5OfBody: " + getMD5OfBody() + ",");
        if (getBody() != null) sb.append("Body: " + getBody() + ",");
        if (getAttributes() != null) sb.append("Attributes: " + getAttributes() + ",");
        if (getMD5OfMessageAttributes() != null) sb.append("MD5OfMessageAttributes: " + getMD5OfMessageAttributes() + ",");
        if (getMessageAttributes() != null) sb.append("MessageAttributes: " + getMessageAttributes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMessageId() == null) ? 0 : getMessageId().hashCode()); 
        hashCode = prime * hashCode + ((getReceiptHandle() == null) ? 0 : getReceiptHandle().hashCode()); 
        hashCode = prime * hashCode + ((getMD5OfBody() == null) ? 0 : getMD5OfBody().hashCode()); 
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode()); 
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getMD5OfMessageAttributes() == null) ? 0 : getMD5OfMessageAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getMessageAttributes() == null) ? 0 : getMessageAttributes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Message == false) return false;
        Message other = (Message)obj;
        
        if (other.getMessageId() == null ^ this.getMessageId() == null) return false;
        if (other.getMessageId() != null && other.getMessageId().equals(this.getMessageId()) == false) return false; 
        if (other.getReceiptHandle() == null ^ this.getReceiptHandle() == null) return false;
        if (other.getReceiptHandle() != null && other.getReceiptHandle().equals(this.getReceiptHandle()) == false) return false; 
        if (other.getMD5OfBody() == null ^ this.getMD5OfBody() == null) return false;
        if (other.getMD5OfBody() != null && other.getMD5OfBody().equals(this.getMD5OfBody()) == false) return false; 
        if (other.getBody() == null ^ this.getBody() == null) return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false) return false; 
        if (other.getAttributes() == null ^ this.getAttributes() == null) return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false) return false; 
        if (other.getMD5OfMessageAttributes() == null ^ this.getMD5OfMessageAttributes() == null) return false;
        if (other.getMD5OfMessageAttributes() != null && other.getMD5OfMessageAttributes().equals(this.getMD5OfMessageAttributes()) == false) return false; 
        if (other.getMessageAttributes() == null ^ this.getMessageAttributes() == null) return false;
        if (other.getMessageAttributes() != null && other.getMessageAttributes().equals(this.getMessageAttributes()) == false) return false; 
        return true;
    }
    
}
    