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
 * Container for the parameters to the {@link com.amazonaws.services.sqs.AmazonSQS#sendMessageBatch(SendMessageBatchRequest) SendMessageBatch operation}.
 * <p>
 * Delivers up to ten messages to the specified queue. This is a batch
 * version of SendMessage. The result of the send action on each message
 * is reported individually in the response. The maximum allowed
 * individual message size is 256 KB (262,144 bytes).
 * </p>
 * <p>
 * The maximum total payload size (i.e., the sum of all a batch's
 * individual message lengths) is also 256 KB (262,144 bytes).
 * </p>
 * <p>
 * If the <code>DelaySeconds</code> parameter is not specified for an
 * entry, the default for the queue is used.
 * </p>
 * <p>
 * <b>IMPORTANT:</b>The following list shows the characters (in Unicode)
 * that are allowed in your message, according to the W3C XML
 * specification. For more information, go to
 * http://www.faqs.org/rfcs/rfc1321.html. If you send any characters that
 * are not included in the list, your request will be rejected. #x9 | #xA
 * | #xD | [#x20 to #xD7FF] | [#xE000 to #xFFFD] | [#x10000 to #x10FFFF]
 * </p>
 * <p>
 * <b>IMPORTANT:</b> Because the batch request can result in a
 * combination of successful and unsuccessful actions, you should check
 * for batch errors even when the call returns an HTTP status code of
 * 200.
 * </p>
 * <p>
 * <b>NOTE:</b>Some API actions take lists of parameters. These lists are
 * specified using the param.n notation. Values of n are integers
 * starting from 1. For example, a parameter list with two elements looks
 * like this:
 * </p>
 * <p>
 * <code>&Attribute.1=this</code>
 * </p>
 * <p>
 * <code>&Attribute.2=that</code>
 * </p>
 *
 * @see com.amazonaws.services.sqs.AmazonSQS#sendMessageBatch(SendMessageBatchRequest)
 */
public class SendMessageBatchRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The URL of the Amazon SQS queue to take action on.
     */
    private String queueUrl;

    /**
     * A list of <a>SendMessageBatchRequestEntry</a> items.
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
     * @param queueUrl The URL of the Amazon SQS queue to take action on.
     */
    public SendMessageBatchRequest(String queueUrl) {
        setQueueUrl(queueUrl);
    }

    /**
     * Constructs a new SendMessageBatchRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param queueUrl The URL of the Amazon SQS queue to take action on.
     * @param entries A list of <a>SendMessageBatchRequestEntry</a> items.
     */
    public SendMessageBatchRequest(String queueUrl, java.util.List<SendMessageBatchRequestEntry> entries) {
        setQueueUrl(queueUrl);
        setEntries(entries);
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
    public SendMessageBatchRequest withQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }

    /**
     * A list of <a>SendMessageBatchRequestEntry</a> items.
     *
     * @return A list of <a>SendMessageBatchRequestEntry</a> items.
     */
    public java.util.List<SendMessageBatchRequestEntry> getEntries() {
        if (entries == null) {
              entries = new com.amazonaws.internal.ListWithAutoConstructFlag<SendMessageBatchRequestEntry>();
              entries.setAutoConstruct(true);
        }
        return entries;
    }
    
    /**
     * A list of <a>SendMessageBatchRequestEntry</a> items.
     *
     * @param entries A list of <a>SendMessageBatchRequestEntry</a> items.
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
     * A list of <a>SendMessageBatchRequestEntry</a> items.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param entries A list of <a>SendMessageBatchRequestEntry</a> items.
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
     * A list of <a>SendMessageBatchRequestEntry</a> items.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param entries A list of <a>SendMessageBatchRequestEntry</a> items.
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
    