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
 * Container for the parameters to the {@link com.amazonaws.services.sqs.AmazonSQS#changeMessageVisibilityBatch(ChangeMessageVisibilityBatchRequest) ChangeMessageVisibilityBatch operation}.
 * <p>
 * This is a batch version of ChangeMessageVisibility. It takes multiple
 * receipt handles and performs the operation on each of the them. The
 * result of the operation on each message is reported individually in
 * the response.
 * </p>
 *
 * @see com.amazonaws.services.sqs.AmazonSQS#changeMessageVisibilityBatch(ChangeMessageVisibilityBatchRequest)
 */
public class ChangeMessageVisibilityBatchRequest extends AmazonWebServiceRequest {

    /**
     * The URL of the SQS queue to take action on.
     */
    private String queueUrl;

    /**
     * A list of receipt handles of the messages for which the visibility
     * timeout must be changed.
     */
    private java.util.List<ChangeMessageVisibilityBatchRequestEntry> entries;

    /**
     * Default constructor for a new ChangeMessageVisibilityBatchRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ChangeMessageVisibilityBatchRequest() {}
    
    /**
     * Constructs a new ChangeMessageVisibilityBatchRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param queueUrl The URL of the SQS queue to take action on.
     * @param entries A list of receipt handles of the messages for which the
     * visibility timeout must be changed.
     */
    public ChangeMessageVisibilityBatchRequest(String queueUrl, java.util.List<ChangeMessageVisibilityBatchRequestEntry> entries) {
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
    public ChangeMessageVisibilityBatchRequest withQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }
    
    
    /**
     * A list of receipt handles of the messages for which the visibility
     * timeout must be changed.
     *
     * @return A list of receipt handles of the messages for which the visibility
     *         timeout must be changed.
     */
    public java.util.List<ChangeMessageVisibilityBatchRequestEntry> getEntries() {
        
        if (entries == null) {
            entries = new java.util.ArrayList<ChangeMessageVisibilityBatchRequestEntry>();
        }
        return entries;
    }
    
    /**
     * A list of receipt handles of the messages for which the visibility
     * timeout must be changed.
     *
     * @param entries A list of receipt handles of the messages for which the visibility
     *         timeout must be changed.
     */
    public void setEntries(java.util.Collection<ChangeMessageVisibilityBatchRequestEntry> entries) {
        java.util.List<ChangeMessageVisibilityBatchRequestEntry> entriesCopy = new java.util.ArrayList<ChangeMessageVisibilityBatchRequestEntry>();
        if (entries != null) {
            entriesCopy.addAll(entries);
        }
        this.entries = entriesCopy;
    }
    
    /**
     * A list of receipt handles of the messages for which the visibility
     * timeout must be changed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param entries A list of receipt handles of the messages for which the visibility
     *         timeout must be changed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ChangeMessageVisibilityBatchRequest withEntries(ChangeMessageVisibilityBatchRequestEntry... entries) {
        if (getEntries() == null) setEntries(new java.util.ArrayList<ChangeMessageVisibilityBatchRequestEntry>());
        for (ChangeMessageVisibilityBatchRequestEntry value : entries) {
            getEntries().add(value);
        }
        return this;
    }
    
    /**
     * A list of receipt handles of the messages for which the visibility
     * timeout must be changed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param entries A list of receipt handles of the messages for which the visibility
     *         timeout must be changed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ChangeMessageVisibilityBatchRequest withEntries(java.util.Collection<ChangeMessageVisibilityBatchRequestEntry> entries) {
        java.util.List<ChangeMessageVisibilityBatchRequestEntry> entriesCopy = new java.util.ArrayList<ChangeMessageVisibilityBatchRequestEntry>();
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
    