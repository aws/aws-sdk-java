/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.sqs.AmazonSQS#deleteMessage(DeleteMessageRequest) DeleteMessage operation}.
 * <p>
 * The DeleteMessage action unconditionally removes the specified
 * message from the specified queue. Even if the message is locked by
 * another reader due to the visibility timeout setting, it is still
 * deleted from the queue.
 * </p>
 *
 * @see com.amazonaws.services.sqs.AmazonSQS#deleteMessage(DeleteMessageRequest)
 */
public class DeleteMessageRequest extends AmazonWebServiceRequest {

    /**
     * 
     */
    private String queueUrl;

    /**
     * The receipt handle associated with the message to delete.
     */
    private String receiptHandle;

    /**
     * Default constructor for a new DeleteMessageRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeleteMessageRequest() {}
    
    /**
     * Constructs a new DeleteMessageRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param queueUrl
     * @param receiptHandle The receipt handle associated with the message to
     * delete.
     */
    public DeleteMessageRequest(String queueUrl, String receiptHandle) {
        this.queueUrl = queueUrl;
        this.receiptHandle = receiptHandle;
    }
    
    /**
     * 
     *
     * @return 
     */
    public String getQueueUrl() {
        return queueUrl;
    }
    
    /**
     * 
     *
     * @param queueUrl 
     */
    public void setQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param queueUrl 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteMessageRequest withQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }
    
    
    /**
     * The receipt handle associated with the message to delete.
     *
     * @return The receipt handle associated with the message to delete.
     */
    public String getReceiptHandle() {
        return receiptHandle;
    }
    
    /**
     * The receipt handle associated with the message to delete.
     *
     * @param receiptHandle The receipt handle associated with the message to delete.
     */
    public void setReceiptHandle(String receiptHandle) {
        this.receiptHandle = receiptHandle;
    }
    
    /**
     * The receipt handle associated with the message to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param receiptHandle The receipt handle associated with the message to delete.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteMessageRequest withReceiptHandle(String receiptHandle) {
        this.receiptHandle = receiptHandle;
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
        sb.append("ReceiptHandle: " + receiptHandle + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    