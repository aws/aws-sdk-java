/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The <code>SendMessage</code> action delivers a message to the specified queue.
 * </p>
 *
 * @see com.amazonaws.services.sqs.AmazonSQS#sendMessage(SendMessageRequest)
 */
public class SendMessageRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The URL of the SQS queue to take action on.
     */
    private String queueUrl;

    /**
     * The message to send.
     */
    private String messageBody;

    /**
     * The number of seconds the message has to be delayed.
     */
    private Integer delaySeconds;

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
     * @param queueUrl The URL of the SQS queue to take action on.
     * @param messageBody The message to send.
     */
    public SendMessageRequest(String queueUrl, String messageBody) {
        setQueueUrl(queueUrl);
        setMessageBody(messageBody);
    }

    /**
     * The URL of the SQS queue to take action on.
     *
     * @return The URL of the SQS queue to take action on.
     */
    public String getQueueUrl() {
        return queueUrl;
    }
    
    /**
     * The URL of the SQS queue to take action on.
     *
     * @param queueUrl The URL of the SQS queue to take action on.
     */
    public void setQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
    }
    
    /**
     * The URL of the SQS queue to take action on.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param queueUrl The URL of the SQS queue to take action on.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SendMessageRequest withQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }

    /**
     * The message to send.
     *
     * @return The message to send.
     */
    public String getMessageBody() {
        return messageBody;
    }
    
    /**
     * The message to send.
     *
     * @param messageBody The message to send.
     */
    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }
    
    /**
     * The message to send.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param messageBody The message to send.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SendMessageRequest withMessageBody(String messageBody) {
        this.messageBody = messageBody;
        return this;
    }

    /**
     * The number of seconds the message has to be delayed.
     *
     * @return The number of seconds the message has to be delayed.
     */
    public Integer getDelaySeconds() {
        return delaySeconds;
    }
    
    /**
     * The number of seconds the message has to be delayed.
     *
     * @param delaySeconds The number of seconds the message has to be delayed.
     */
    public void setDelaySeconds(Integer delaySeconds) {
        this.delaySeconds = delaySeconds;
    }
    
    /**
     * The number of seconds the message has to be delayed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param delaySeconds The number of seconds the message has to be delayed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SendMessageRequest withDelaySeconds(Integer delaySeconds) {
        this.delaySeconds = delaySeconds;
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
        if (getDelaySeconds() != null) sb.append("DelaySeconds: " + getDelaySeconds() );
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
        return true;
    }
    
}
    