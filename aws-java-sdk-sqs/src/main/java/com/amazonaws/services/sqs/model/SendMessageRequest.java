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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.sqs.AmazonSQS#sendMessage(SendMessageRequest) SendMessage operation}.
 * <p>
 * Delivers a message to the specified queue. With Amazon SQS, you now
 * have the ability to send large payload messages that are up to 256KB
 * (262,144 bytes) in size. To send large payloads, you must use an AWS
 * SDK that supports SigV4 signing. To verify whether SigV4 is supported
 * for an AWS SDK, check the SDK release notes.
 * </p>
 * <p>
 * <b>IMPORTANT:</b> The following list shows the characters (in Unicode)
 * allowed in your message, according to the W3C XML specification. For
 * more information, go to http://www.w3.org/TR/REC-xml/#charsets If you
 * send any characters not included in the list, your request will be
 * rejected. #x9 | #xA | #xD | [#x20 to #xD7FF] | [#xE000 to #xFFFD] |
 * [#x10000 to #x10FFFF]
 * </p>
 *
 * @see com.amazonaws.services.sqs.AmazonSQS#sendMessage(SendMessageRequest)
 */
public class SendMessageRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The URL of the Amazon SQS queue to take action on.
     */
    private String queueUrl;

    /**
     * The message to send. String maximum 256 KB in size. For a list of
     * allowed characters, see the preceding important note.
     */
    private String messageBody;

    /**
     * The number of seconds (0 to 900 - 15 minutes) to delay a specific
     * message. Messages with a positive <code>DelaySeconds</code> value
     * become available for processing after the delay time is finished. If
     * you don't specify a value, the default value for the queue applies.
     */
    private Integer delaySeconds;

    /**
     * Each message attribute consists of a Name, Type, and Value. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributesNTV">Message
     * Attribute Items</a>.
     */
    private java.util.Map<String,MessageAttributeValue> messageAttributes;

    /**
     * Default constructor for a new SendMessageRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public SendMessageRequest() {}
    
    /**
     * Constructs a new SendMessageRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param queueUrl The URL of the Amazon SQS queue to take action on.
     * @param messageBody The message to send. String maximum 256 KB in size.
     * For a list of allowed characters, see the preceding important note.
     */
    public SendMessageRequest(String queueUrl, String messageBody) {
        setQueueUrl(queueUrl);
        setMessageBody(messageBody);
    }

    /**
     * The URL of the Amazon SQS queue to take action on.
     *
     * @return The URL of the Amazon SQS queue to take action on.
     */
    public String getQueueUrl() {
        return queueUrl;
    }
    
    /**
     * The URL of the Amazon SQS queue to take action on.
     *
     * @param queueUrl The URL of the Amazon SQS queue to take action on.
     */
    public void setQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
    }
    
    /**
     * The URL of the Amazon SQS queue to take action on.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param queueUrl The URL of the Amazon SQS queue to take action on.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SendMessageRequest withQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }

    /**
     * The message to send. String maximum 256 KB in size. For a list of
     * allowed characters, see the preceding important note.
     *
     * @return The message to send. String maximum 256 KB in size. For a list of
     *         allowed characters, see the preceding important note.
     */
    public String getMessageBody() {
        return messageBody;
    }
    
    /**
     * The message to send. String maximum 256 KB in size. For a list of
     * allowed characters, see the preceding important note.
     *
     * @param messageBody The message to send. String maximum 256 KB in size. For a list of
     *         allowed characters, see the preceding important note.
     */
    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }
    
    /**
     * The message to send. String maximum 256 KB in size. For a list of
     * allowed characters, see the preceding important note.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param messageBody The message to send. String maximum 256 KB in size. For a list of
     *         allowed characters, see the preceding important note.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SendMessageRequest withMessageBody(String messageBody) {
        this.messageBody = messageBody;
        return this;
    }

    /**
     * The number of seconds (0 to 900 - 15 minutes) to delay a specific
     * message. Messages with a positive <code>DelaySeconds</code> value
     * become available for processing after the delay time is finished. If
     * you don't specify a value, the default value for the queue applies.
     *
     * @return The number of seconds (0 to 900 - 15 minutes) to delay a specific
     *         message. Messages with a positive <code>DelaySeconds</code> value
     *         become available for processing after the delay time is finished. If
     *         you don't specify a value, the default value for the queue applies.
     */
    public Integer getDelaySeconds() {
        return delaySeconds;
    }
    
    /**
     * The number of seconds (0 to 900 - 15 minutes) to delay a specific
     * message. Messages with a positive <code>DelaySeconds</code> value
     * become available for processing after the delay time is finished. If
     * you don't specify a value, the default value for the queue applies.
     *
     * @param delaySeconds The number of seconds (0 to 900 - 15 minutes) to delay a specific
     *         message. Messages with a positive <code>DelaySeconds</code> value
     *         become available for processing after the delay time is finished. If
     *         you don't specify a value, the default value for the queue applies.
     */
    public void setDelaySeconds(Integer delaySeconds) {
        this.delaySeconds = delaySeconds;
    }
    
    /**
     * The number of seconds (0 to 900 - 15 minutes) to delay a specific
     * message. Messages with a positive <code>DelaySeconds</code> value
     * become available for processing after the delay time is finished. If
     * you don't specify a value, the default value for the queue applies.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param delaySeconds The number of seconds (0 to 900 - 15 minutes) to delay a specific
     *         message. Messages with a positive <code>DelaySeconds</code> value
     *         become available for processing after the delay time is finished. If
     *         you don't specify a value, the default value for the queue applies.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SendMessageRequest withDelaySeconds(Integer delaySeconds) {
        this.delaySeconds = delaySeconds;
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
    public SendMessageRequest withMessageAttributes(java.util.Map<String,MessageAttributeValue> messageAttributes) {
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
    public SendMessageRequest addMessageAttributesEntry(String key, MessageAttributeValue value) {
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
    public SendMessageRequest clearMessageAttributesEntries() {
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
        if (getQueueUrl() != null) sb.append("QueueUrl: " + getQueueUrl() + ",");
        if (getMessageBody() != null) sb.append("MessageBody: " + getMessageBody() + ",");
        if (getDelaySeconds() != null) sb.append("DelaySeconds: " + getDelaySeconds() + ",");
        if (getMessageAttributes() != null) sb.append("MessageAttributes: " + getMessageAttributes() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SendMessageRequest == false) return false;
        SendMessageRequest other = (SendMessageRequest)obj;
        
        if (other.getQueueUrl() == null ^ this.getQueueUrl() == null) return false;
        if (other.getQueueUrl() != null && other.getQueueUrl().equals(this.getQueueUrl()) == false) return false; 
        if (other.getMessageBody() == null ^ this.getMessageBody() == null) return false;
        if (other.getMessageBody() != null && other.getMessageBody().equals(this.getMessageBody()) == false) return false; 
        if (other.getDelaySeconds() == null ^ this.getDelaySeconds() == null) return false;
        if (other.getDelaySeconds() != null && other.getDelaySeconds().equals(this.getDelaySeconds()) == false) return false; 
        if (other.getMessageAttributes() == null ^ this.getMessageAttributes() == null) return false;
        if (other.getMessageAttributes() != null && other.getMessageAttributes().equals(this.getMessageAttributes()) == false) return false; 
        return true;
    }
    
}
    