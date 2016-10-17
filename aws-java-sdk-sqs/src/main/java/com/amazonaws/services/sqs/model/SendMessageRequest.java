/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 */
public class SendMessageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The URL of the Amazon SQS queue to take action on.
     * </p>
     * <p>
     * Queue URLs are case-sensitive.
     * </p>
     */
    private String queueUrl;
    /**
     * <p>
     * The message to send. String maximum 256 KB in size. For a list of allowed characters, see the preceding important
     * note.
     * </p>
     */
    private String messageBody;
    /**
     * <p>
     * The number of seconds (0 to 900 - 15 minutes) to delay a specific message. Messages with a positive
     * <code>DelaySeconds</code> value become available for processing after the delay time is finished. If you don't
     * specify a value, the default value for the queue applies.
     * </p>
     */
    private Integer delaySeconds;
    /**
     * <p>
     * Each message attribute consists of a Name, Type, and Value. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributesNTV"
     * >Message Attribute Items</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, MessageAttributeValue> messageAttributes;

    /**
     * Default constructor for SendMessageRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public SendMessageRequest() {
    }

    /**
     * Constructs a new SendMessageRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param queueUrl
     *        The URL of the Amazon SQS queue to take action on.</p>
     *        <p>
     *        Queue URLs are case-sensitive.
     * @param messageBody
     *        The message to send. String maximum 256 KB in size. For a list of allowed characters, see the preceding
     *        important note.
     */
    public SendMessageRequest(String queueUrl, String messageBody) {
        setQueueUrl(queueUrl);
        setMessageBody(messageBody);
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue to take action on.
     * </p>
     * <p>
     * Queue URLs are case-sensitive.
     * </p>
     * 
     * @param queueUrl
     *        The URL of the Amazon SQS queue to take action on.</p>
     *        <p>
     *        Queue URLs are case-sensitive.
     */

    public void setQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue to take action on.
     * </p>
     * <p>
     * Queue URLs are case-sensitive.
     * </p>
     * 
     * @return The URL of the Amazon SQS queue to take action on.</p>
     *         <p>
     *         Queue URLs are case-sensitive.
     */

    public String getQueueUrl() {
        return this.queueUrl;
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue to take action on.
     * </p>
     * <p>
     * Queue URLs are case-sensitive.
     * </p>
     * 
     * @param queueUrl
     *        The URL of the Amazon SQS queue to take action on.</p>
     *        <p>
     *        Queue URLs are case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendMessageRequest withQueueUrl(String queueUrl) {
        setQueueUrl(queueUrl);
        return this;
    }

    /**
     * <p>
     * The message to send. String maximum 256 KB in size. For a list of allowed characters, see the preceding important
     * note.
     * </p>
     * 
     * @param messageBody
     *        The message to send. String maximum 256 KB in size. For a list of allowed characters, see the preceding
     *        important note.
     */

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    /**
     * <p>
     * The message to send. String maximum 256 KB in size. For a list of allowed characters, see the preceding important
     * note.
     * </p>
     * 
     * @return The message to send. String maximum 256 KB in size. For a list of allowed characters, see the preceding
     *         important note.
     */

    public String getMessageBody() {
        return this.messageBody;
    }

    /**
     * <p>
     * The message to send. String maximum 256 KB in size. For a list of allowed characters, see the preceding important
     * note.
     * </p>
     * 
     * @param messageBody
     *        The message to send. String maximum 256 KB in size. For a list of allowed characters, see the preceding
     *        important note.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendMessageRequest withMessageBody(String messageBody) {
        setMessageBody(messageBody);
        return this;
    }

    /**
     * <p>
     * The number of seconds (0 to 900 - 15 minutes) to delay a specific message. Messages with a positive
     * <code>DelaySeconds</code> value become available for processing after the delay time is finished. If you don't
     * specify a value, the default value for the queue applies.
     * </p>
     * 
     * @param delaySeconds
     *        The number of seconds (0 to 900 - 15 minutes) to delay a specific message. Messages with a positive
     *        <code>DelaySeconds</code> value become available for processing after the delay time is finished. If you
     *        don't specify a value, the default value for the queue applies.
     */

    public void setDelaySeconds(Integer delaySeconds) {
        this.delaySeconds = delaySeconds;
    }

    /**
     * <p>
     * The number of seconds (0 to 900 - 15 minutes) to delay a specific message. Messages with a positive
     * <code>DelaySeconds</code> value become available for processing after the delay time is finished. If you don't
     * specify a value, the default value for the queue applies.
     * </p>
     * 
     * @return The number of seconds (0 to 900 - 15 minutes) to delay a specific message. Messages with a positive
     *         <code>DelaySeconds</code> value become available for processing after the delay time is finished. If you
     *         don't specify a value, the default value for the queue applies.
     */

    public Integer getDelaySeconds() {
        return this.delaySeconds;
    }

    /**
     * <p>
     * The number of seconds (0 to 900 - 15 minutes) to delay a specific message. Messages with a positive
     * <code>DelaySeconds</code> value become available for processing after the delay time is finished. If you don't
     * specify a value, the default value for the queue applies.
     * </p>
     * 
     * @param delaySeconds
     *        The number of seconds (0 to 900 - 15 minutes) to delay a specific message. Messages with a positive
     *        <code>DelaySeconds</code> value become available for processing after the delay time is finished. If you
     *        don't specify a value, the default value for the queue applies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendMessageRequest withDelaySeconds(Integer delaySeconds) {
        setDelaySeconds(delaySeconds);
        return this;
    }

    /**
     * <p>
     * Each message attribute consists of a Name, Type, and Value. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributesNTV"
     * >Message Attribute Items</a>.
     * </p>
     * 
     * @return Each message attribute consists of a Name, Type, and Value. For more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributesNTV"
     *         >Message Attribute Items</a>.
     */

    public java.util.Map<String, MessageAttributeValue> getMessageAttributes() {
        if (messageAttributes == null) {
            messageAttributes = new com.amazonaws.internal.SdkInternalMap<String, MessageAttributeValue>();
        }
        return messageAttributes;
    }

    /**
     * <p>
     * Each message attribute consists of a Name, Type, and Value. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributesNTV"
     * >Message Attribute Items</a>.
     * </p>
     * 
     * @param messageAttributes
     *        Each message attribute consists of a Name, Type, and Value. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributesNTV"
     *        >Message Attribute Items</a>.
     */

    public void setMessageAttributes(java.util.Map<String, MessageAttributeValue> messageAttributes) {
        this.messageAttributes = messageAttributes == null ? null : new com.amazonaws.internal.SdkInternalMap<String, MessageAttributeValue>(messageAttributes);
    }

    /**
     * <p>
     * Each message attribute consists of a Name, Type, and Value. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributesNTV"
     * >Message Attribute Items</a>.
     * </p>
     * 
     * @param messageAttributes
     *        Each message attribute consists of a Name, Type, and Value. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributesNTV"
     *        >Message Attribute Items</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendMessageRequest withMessageAttributes(java.util.Map<String, MessageAttributeValue> messageAttributes) {
        setMessageAttributes(messageAttributes);
        return this;
    }

    public SendMessageRequest addMessageAttributesEntry(String key, MessageAttributeValue value) {
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

    public SendMessageRequest clearMessageAttributesEntries() {
        this.messageAttributes = null;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getQueueUrl() != null)
            sb.append("QueueUrl: " + getQueueUrl() + ",");
        if (getMessageBody() != null)
            sb.append("MessageBody: " + getMessageBody() + ",");
        if (getDelaySeconds() != null)
            sb.append("DelaySeconds: " + getDelaySeconds() + ",");
        if (getMessageAttributes() != null)
            sb.append("MessageAttributes: " + getMessageAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendMessageRequest == false)
            return false;
        SendMessageRequest other = (SendMessageRequest) obj;
        if (other.getQueueUrl() == null ^ this.getQueueUrl() == null)
            return false;
        if (other.getQueueUrl() != null && other.getQueueUrl().equals(this.getQueueUrl()) == false)
            return false;
        if (other.getMessageBody() == null ^ this.getMessageBody() == null)
            return false;
        if (other.getMessageBody() != null && other.getMessageBody().equals(this.getMessageBody()) == false)
            return false;
        if (other.getDelaySeconds() == null ^ this.getDelaySeconds() == null)
            return false;
        if (other.getDelaySeconds() != null && other.getDelaySeconds().equals(this.getDelaySeconds()) == false)
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

        hashCode = prime * hashCode + ((getQueueUrl() == null) ? 0 : getQueueUrl().hashCode());
        hashCode = prime * hashCode + ((getMessageBody() == null) ? 0 : getMessageBody().hashCode());
        hashCode = prime * hashCode + ((getDelaySeconds() == null) ? 0 : getDelaySeconds().hashCode());
        hashCode = prime * hashCode + ((getMessageAttributes() == null) ? 0 : getMessageAttributes().hashCode());
        return hashCode;
    }

    @Override
    public SendMessageRequest clone() {
        return (SendMessageRequest) super.clone();
    }
}
