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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.sqs.AmazonSQS#deleteMessageBatch(DeleteMessageBatchRequest) DeleteMessageBatch operation}.
 * <p>
 * This is a batch version of DeleteMessage. It takes multiple receipt
 * handles and deletes each one of the messages. The result of the delete
 * operation on each message is reported individually in the response.
 * </p>
 *
 * @see com.amazonaws.services.sqs.AmazonSQS#deleteMessageBatch(DeleteMessageBatchRequest)
 */
public class DeleteMessageBatchRequest extends AmazonWebServiceRequest {

    /**
     * The URL of the SQS queue to take action on.
     */
    private String queueUrl;

    /**
     * A list of receipt handles for the messages to be deleted.
     */
    private java.util.List<DeleteMessageBatchRequestEntry> entries;

    /**
     * Default constructor for a new DeleteMessageBatchRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeleteMessageBatchRequest() {}
    
    /**
     * Constructs a new DeleteMessageBatchRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param queueUrl The URL of the SQS queue to take action on.
     */
    public DeleteMessageBatchRequest(String queueUrl) {
        this.queueUrl = queueUrl;
    }
    
    /**
     * Constructs a new DeleteMessageBatchRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param queueUrl The URL of the SQS queue to take action on.
     * @param entries A list of receipt handles for the messages to be
     * deleted.
     */
    public DeleteMessageBatchRequest(String queueUrl, java.util.List<DeleteMessageBatchRequestEntry> entries) {
        this.queueUrl = queueUrl;
        this.entries = entries;
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
    public DeleteMessageBatchRequest withQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }
    
    
    /**
     * A list of receipt handles for the messages to be deleted.
     *
     * @return A list of receipt handles for the messages to be deleted.
     */
    public java.util.List<DeleteMessageBatchRequestEntry> getEntries() {
        
        if (entries == null) {
            entries = new java.util.ArrayList<DeleteMessageBatchRequestEntry>();
        }
        return entries;
    }
    
    /**
     * A list of receipt handles for the messages to be deleted.
     *
     * @param entries A list of receipt handles for the messages to be deleted.
     */
    public void setEntries(java.util.Collection<DeleteMessageBatchRequestEntry> entries) {
        java.util.List<DeleteMessageBatchRequestEntry> entriesCopy = new java.util.ArrayList<DeleteMessageBatchRequestEntry>();
        if (entries != null) {
            entriesCopy.addAll(entries);
        }
        this.entries = entriesCopy;
    }
    
    /**
     * A list of receipt handles for the messages to be deleted.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param entries A list of receipt handles for the messages to be deleted.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteMessageBatchRequest withEntries(DeleteMessageBatchRequestEntry... entries) {
        if (getEntries() == null) setEntries(new java.util.ArrayList<DeleteMessageBatchRequestEntry>());
        for (DeleteMessageBatchRequestEntry value : entries) {
            getEntries().add(value);
        }
        return this;
    }
    
    /**
     * A list of receipt handles for the messages to be deleted.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param entries A list of receipt handles for the messages to be deleted.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteMessageBatchRequest withEntries(java.util.Collection<DeleteMessageBatchRequestEntry> entries) {
        java.util.List<DeleteMessageBatchRequestEntry> entriesCopy = new java.util.ArrayList<DeleteMessageBatchRequestEntry>();
        if (entries != null) {
            entriesCopy.addAll(entries);
        }
        this.entries = entriesCopy;

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
        sb.append("QueueUrl: " + queueUrl + ", ");
        sb.append("Entries: " + entries + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    