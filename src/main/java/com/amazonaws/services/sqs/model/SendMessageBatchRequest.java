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
 * Container for the parameters to the {@link com.amazonaws.services.sqs.AmazonSQS#sendMessageBatch(SendMessageBatchRequest) SendMessageBatch operation}.
 * <p>
 * This is a batch version of SendMessage. It takes multiple messages and adds each of them to the queue. The result of each add operation is reported
 * individually in the response.
 * </p>
 *
 * @see com.amazonaws.services.sqs.AmazonSQS#sendMessageBatch(SendMessageBatchRequest)
 */
public class SendMessageBatchRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The URL of the SQS queue to take action on.
     */
    private String queueUrl;

    /**
     * A list of <a>SendMessageBatchRequestEntry</a>s.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<SendMessageBatchRequestEntry> entries;

    /**
     * Default constructor for a new SendMessageBatchRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public SendMessageBatchRequest() {}
    
    /**
     * Constructs a new SendMessageBatchRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param queueUrl The URL of the SQS queue to take action on.
     */
    public SendMessageBatchRequest(String queueUrl) {
        setQueueUrl(queueUrl);
    }

    /**
     * Constructs a new SendMessageBatchRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param queueUrl The URL of the SQS queue to take action on.
     * @param entries A list of <a>SendMessageBatchRequestEntry</a>s.
     */
    public SendMessageBatchRequest(String queueUrl, java.util.List<SendMessageBatchRequestEntry> entries) {
        setQueueUrl(queueUrl);
        setEntries(entries);
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
    public SendMessageBatchRequest withQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }

    /**
     * A list of <a>SendMessageBatchRequestEntry</a>s.
     *
     * @return A list of <a>SendMessageBatchRequestEntry</a>s.
     */
    public java.util.List<SendMessageBatchRequestEntry> getEntries() {
        if (entries == null) {
              entries = new com.amazonaws.internal.ListWithAutoConstructFlag<SendMessageBatchRequestEntry>();
              entries.setAutoConstruct(true);
        }
        return entries;
    }
    
    /**
     * A list of <a>SendMessageBatchRequestEntry</a>s.
     *
     * @param entries A list of <a>SendMessageBatchRequestEntry</a>s.
     */
    public void setEntries(java.util.Collection<SendMessageBatchRequestEntry> entries) {
        if (entries == null) {
            this.entries = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<SendMessageBatchRequestEntry> entriesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SendMessageBatchRequestEntry>(entries.size());
        entriesCopy.addAll(entries);
        this.entries = entriesCopy;
    }
    
    /**
     * A list of <a>SendMessageBatchRequestEntry</a>s.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param entries A list of <a>SendMessageBatchRequestEntry</a>s.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SendMessageBatchRequest withEntries(SendMessageBatchRequestEntry... entries) {
        if (getEntries() == null) setEntries(new java.util.ArrayList<SendMessageBatchRequestEntry>(entries.length));
        for (SendMessageBatchRequestEntry value : entries) {
            getEntries().add(value);
        }
        return this;
    }
    
    /**
     * A list of <a>SendMessageBatchRequestEntry</a>s.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param entries A list of <a>SendMessageBatchRequestEntry</a>s.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SendMessageBatchRequest withEntries(java.util.Collection<SendMessageBatchRequestEntry> entries) {
        if (entries == null) {
            this.entries = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<SendMessageBatchRequestEntry> entriesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SendMessageBatchRequestEntry>(entries.size());
            entriesCopy.addAll(entries);
            this.entries = entriesCopy;
        }

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
        if (getEntries() != null) sb.append("Entries: " + getEntries() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getQueueUrl() == null) ? 0 : getQueueUrl().hashCode()); 
        hashCode = prime * hashCode + ((getEntries() == null) ? 0 : getEntries().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SendMessageBatchRequest == false) return false;
        SendMessageBatchRequest other = (SendMessageBatchRequest)obj;
        
        if (other.getQueueUrl() == null ^ this.getQueueUrl() == null) return false;
        if (other.getQueueUrl() != null && other.getQueueUrl().equals(this.getQueueUrl()) == false) return false; 
        if (other.getEntries() == null ^ this.getEntries() == null) return false;
        if (other.getEntries() != null && other.getEntries().equals(this.getEntries()) == false) return false; 
        return true;
    }
    
}
    