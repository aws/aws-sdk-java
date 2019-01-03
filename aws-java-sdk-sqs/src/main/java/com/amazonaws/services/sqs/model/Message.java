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
 * An Amazon SQS message.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/Message" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Message implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the message. A <code>MessageId</code>is considered unique across all AWS accounts for an
     * extended period of time.
     * </p>
     */
    private String messageId;
    /**
     * <p>
     * An identifier associated with the act of receiving the message. A new receipt handle is returned every time you
     * receive a message. When deleting a message, you provide the last received receipt handle to delete the message.
     * </p>
     */
    private String receiptHandle;
    /**
     * <p>
     * An MD5 digest of the non-URL-encoded message body string.
     * </p>
     */
    private String mD5OfBody;
    /**
     * <p>
     * The message's contents (not URL-encoded).
     * </p>
     */
    private String body;
    /**
     * <p>
     * A map of the attributes requested in <code> <a>ReceiveMessage</a> </code> to their respective values. Supported
     * attributes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ApproximateReceiveCount</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateFirstReceiveTimestamp</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageDeduplicationId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageGroupId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SenderId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SentTimestamp</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SequenceNumber</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>ApproximateFirstReceiveTimestamp</code> and <code>SentTimestamp</code> are each returned as an integer
     * representing the <a href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in milliseconds.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> attributes;
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
     * Each message attribute consists of a <code>Name</code>, <code>Type</code>, and <code>Value</code>. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-message-attributes.html"
     * >Amazon SQS Message Attributes</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, MessageAttributeValue> messageAttributes;

    /**
     * <p>
     * A unique identifier for the message. A <code>MessageId</code>is considered unique across all AWS accounts for an
     * extended period of time.
     * </p>
     * 
     * @param messageId
     *        A unique identifier for the message. A <code>MessageId</code>is considered unique across all AWS accounts
     *        for an extended period of time.
     */

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * <p>
     * A unique identifier for the message. A <code>MessageId</code>is considered unique across all AWS accounts for an
     * extended period of time.
     * </p>
     * 
     * @return A unique identifier for the message. A <code>MessageId</code>is considered unique across all AWS accounts
     *         for an extended period of time.
     */

    public String getMessageId() {
        return this.messageId;
    }

    /**
     * <p>
     * A unique identifier for the message. A <code>MessageId</code>is considered unique across all AWS accounts for an
     * extended period of time.
     * </p>
     * 
     * @param messageId
     *        A unique identifier for the message. A <code>MessageId</code>is considered unique across all AWS accounts
     *        for an extended period of time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Message withMessageId(String messageId) {
        setMessageId(messageId);
        return this;
    }

    /**
     * <p>
     * An identifier associated with the act of receiving the message. A new receipt handle is returned every time you
     * receive a message. When deleting a message, you provide the last received receipt handle to delete the message.
     * </p>
     * 
     * @param receiptHandle
     *        An identifier associated with the act of receiving the message. A new receipt handle is returned every
     *        time you receive a message. When deleting a message, you provide the last received receipt handle to
     *        delete the message.
     */

    public void setReceiptHandle(String receiptHandle) {
        this.receiptHandle = receiptHandle;
    }

    /**
     * <p>
     * An identifier associated with the act of receiving the message. A new receipt handle is returned every time you
     * receive a message. When deleting a message, you provide the last received receipt handle to delete the message.
     * </p>
     * 
     * @return An identifier associated with the act of receiving the message. A new receipt handle is returned every
     *         time you receive a message. When deleting a message, you provide the last received receipt handle to
     *         delete the message.
     */

    public String getReceiptHandle() {
        return this.receiptHandle;
    }

    /**
     * <p>
     * An identifier associated with the act of receiving the message. A new receipt handle is returned every time you
     * receive a message. When deleting a message, you provide the last received receipt handle to delete the message.
     * </p>
     * 
     * @param receiptHandle
     *        An identifier associated with the act of receiving the message. A new receipt handle is returned every
     *        time you receive a message. When deleting a message, you provide the last received receipt handle to
     *        delete the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Message withReceiptHandle(String receiptHandle) {
        setReceiptHandle(receiptHandle);
        return this;
    }

    /**
     * <p>
     * An MD5 digest of the non-URL-encoded message body string.
     * </p>
     * 
     * @param mD5OfBody
     *        An MD5 digest of the non-URL-encoded message body string.
     */

    public void setMD5OfBody(String mD5OfBody) {
        this.mD5OfBody = mD5OfBody;
    }

    /**
     * <p>
     * An MD5 digest of the non-URL-encoded message body string.
     * </p>
     * 
     * @return An MD5 digest of the non-URL-encoded message body string.
     */

    public String getMD5OfBody() {
        return this.mD5OfBody;
    }

    /**
     * <p>
     * An MD5 digest of the non-URL-encoded message body string.
     * </p>
     * 
     * @param mD5OfBody
     *        An MD5 digest of the non-URL-encoded message body string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Message withMD5OfBody(String mD5OfBody) {
        setMD5OfBody(mD5OfBody);
        return this;
    }

    /**
     * <p>
     * The message's contents (not URL-encoded).
     * </p>
     * 
     * @param body
     *        The message's contents (not URL-encoded).
     */

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * The message's contents (not URL-encoded).
     * </p>
     * 
     * @return The message's contents (not URL-encoded).
     */

    public String getBody() {
        return this.body;
    }

    /**
     * <p>
     * The message's contents (not URL-encoded).
     * </p>
     * 
     * @param body
     *        The message's contents (not URL-encoded).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Message withBody(String body) {
        setBody(body);
        return this;
    }

    /**
     * <p>
     * A map of the attributes requested in <code> <a>ReceiveMessage</a> </code> to their respective values. Supported
     * attributes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ApproximateReceiveCount</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateFirstReceiveTimestamp</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageDeduplicationId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageGroupId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SenderId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SentTimestamp</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SequenceNumber</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>ApproximateFirstReceiveTimestamp</code> and <code>SentTimestamp</code> are each returned as an integer
     * representing the <a href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in milliseconds.
     * </p>
     * 
     * @return A map of the attributes requested in <code> <a>ReceiveMessage</a> </code> to their respective values.
     *         Supported attributes:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ApproximateReceiveCount</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ApproximateFirstReceiveTimestamp</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MessageDeduplicationId</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MessageGroupId</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SenderId</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SentTimestamp</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SequenceNumber</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <code>ApproximateFirstReceiveTimestamp</code> and <code>SentTimestamp</code> are each returned as an
     *         integer representing the <a href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in milliseconds.
     */

    public java.util.Map<String, String> getAttributes() {
        if (attributes == null) {
            attributes = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return attributes;
    }

    /**
     * <p>
     * A map of the attributes requested in <code> <a>ReceiveMessage</a> </code> to their respective values. Supported
     * attributes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ApproximateReceiveCount</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateFirstReceiveTimestamp</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageDeduplicationId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageGroupId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SenderId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SentTimestamp</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SequenceNumber</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>ApproximateFirstReceiveTimestamp</code> and <code>SentTimestamp</code> are each returned as an integer
     * representing the <a href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in milliseconds.
     * </p>
     * 
     * @param attributes
     *        A map of the attributes requested in <code> <a>ReceiveMessage</a> </code> to their respective values.
     *        Supported attributes:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ApproximateReceiveCount</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApproximateFirstReceiveTimestamp</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MessageDeduplicationId</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MessageGroupId</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SenderId</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SentTimestamp</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SequenceNumber</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>ApproximateFirstReceiveTimestamp</code> and <code>SentTimestamp</code> are each returned as an
     *        integer representing the <a href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in milliseconds.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(attributes);
    }

    /**
     * <p>
     * A map of the attributes requested in <code> <a>ReceiveMessage</a> </code> to their respective values. Supported
     * attributes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ApproximateReceiveCount</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ApproximateFirstReceiveTimestamp</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageDeduplicationId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageGroupId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SenderId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SentTimestamp</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SequenceNumber</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>ApproximateFirstReceiveTimestamp</code> and <code>SentTimestamp</code> are each returned as an integer
     * representing the <a href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in milliseconds.
     * </p>
     * 
     * @param attributes
     *        A map of the attributes requested in <code> <a>ReceiveMessage</a> </code> to their respective values.
     *        Supported attributes:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ApproximateReceiveCount</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ApproximateFirstReceiveTimestamp</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MessageDeduplicationId</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MessageGroupId</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SenderId</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SentTimestamp</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SequenceNumber</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>ApproximateFirstReceiveTimestamp</code> and <code>SentTimestamp</code> are each returned as an
     *        integer representing the <a href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Message withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    public Message addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Message clearAttributesEntries() {
        this.attributes = null;
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

    public Message withMD5OfMessageAttributes(String mD5OfMessageAttributes) {
        setMD5OfMessageAttributes(mD5OfMessageAttributes);
        return this;
    }

    /**
     * <p>
     * Each message attribute consists of a <code>Name</code>, <code>Type</code>, and <code>Value</code>. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-message-attributes.html"
     * >Amazon SQS Message Attributes</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * 
     * @return Each message attribute consists of a <code>Name</code>, <code>Type</code>, and <code>Value</code>. For
     *         more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-message-attributes.html"
     *         >Amazon SQS Message Attributes</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     */

    public java.util.Map<String, MessageAttributeValue> getMessageAttributes() {
        if (messageAttributes == null) {
            messageAttributes = new com.amazonaws.internal.SdkInternalMap<String, MessageAttributeValue>();
        }
        return messageAttributes;
    }

    /**
     * <p>
     * Each message attribute consists of a <code>Name</code>, <code>Type</code>, and <code>Value</code>. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-message-attributes.html"
     * >Amazon SQS Message Attributes</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * 
     * @param messageAttributes
     *        Each message attribute consists of a <code>Name</code>, <code>Type</code>, and <code>Value</code>. For
     *        more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-message-attributes.html"
     *        >Amazon SQS Message Attributes</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     */

    public void setMessageAttributes(java.util.Map<String, MessageAttributeValue> messageAttributes) {
        this.messageAttributes = messageAttributes == null ? null : new com.amazonaws.internal.SdkInternalMap<String, MessageAttributeValue>(messageAttributes);
    }

    /**
     * <p>
     * Each message attribute consists of a <code>Name</code>, <code>Type</code>, and <code>Value</code>. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-message-attributes.html"
     * >Amazon SQS Message Attributes</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * 
     * @param messageAttributes
     *        Each message attribute consists of a <code>Name</code>, <code>Type</code>, and <code>Value</code>. For
     *        more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-message-attributes.html"
     *        >Amazon SQS Message Attributes</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Message withMessageAttributes(java.util.Map<String, MessageAttributeValue> messageAttributes) {
        setMessageAttributes(messageAttributes);
        return this;
    }

    public Message addMessageAttributesEntry(String key, MessageAttributeValue value) {
        if (null == this.messageAttributes) {
            this.messageAttributes = new com.amazonaws.internal.SdkInternalMap<String, MessageAttributeValue>();
        }
        if (this.messageAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.messageAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into MessageAttributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Message clearMessageAttributesEntries() {
        this.messageAttributes = null;
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
        if (getMessageId() != null)
            sb.append("MessageId: ").append(getMessageId()).append(",");
        if (getReceiptHandle() != null)
            sb.append("ReceiptHandle: ").append(getReceiptHandle()).append(",");
        if (getMD5OfBody() != null)
            sb.append("MD5OfBody: ").append(getMD5OfBody()).append(",");
        if (getBody() != null)
            sb.append("Body: ").append(getBody()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getMD5OfMessageAttributes() != null)
            sb.append("MD5OfMessageAttributes: ").append(getMD5OfMessageAttributes()).append(",");
        if (getMessageAttributes() != null)
            sb.append("MessageAttributes: ").append(getMessageAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Message == false)
            return false;
        Message other = (Message) obj;
        if (other.getMessageId() == null ^ this.getMessageId() == null)
            return false;
        if (other.getMessageId() != null && other.getMessageId().equals(this.getMessageId()) == false)
            return false;
        if (other.getReceiptHandle() == null ^ this.getReceiptHandle() == null)
            return false;
        if (other.getReceiptHandle() != null && other.getReceiptHandle().equals(this.getReceiptHandle()) == false)
            return false;
        if (other.getMD5OfBody() == null ^ this.getMD5OfBody() == null)
            return false;
        if (other.getMD5OfBody() != null && other.getMD5OfBody().equals(this.getMD5OfBody()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getMD5OfMessageAttributes() == null ^ this.getMD5OfMessageAttributes() == null)
            return false;
        if (other.getMD5OfMessageAttributes() != null && other.getMD5OfMessageAttributes().equals(this.getMD5OfMessageAttributes()) == false)
            return false;
        if (other.getMessageAttributes() == null ^ this.getMessageAttributes() == null)
            return false;
        if (other.getMessageAttributes() != null && other.getMessageAttributes().equals(this.getMessageAttributes()) == false)
            return false;
        return true;
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
    public Message clone() {
        try {
            return (Message) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
