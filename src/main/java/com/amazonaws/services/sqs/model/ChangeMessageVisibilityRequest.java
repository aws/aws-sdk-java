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
 * <p>
 * 
 * </p>
 */
public class ChangeMessageVisibilityRequest extends AmazonWebServiceRequest {

    /**
     * 
     */
    private String queueUrl;

    /**
     * The receipt handle associated with the message whose visibility
     * timeout the client wants to change.
     */
    private String receiptHandle;

    /**
     * The new value (in seconds) for the message's visibility timeout.
     */
    private Integer visibilityTimeout;

    /**
     * Default constructor for a new ChangeMessageVisibilityRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ChangeMessageVisibilityRequest() {}
    
    /**
     * Constructs a new ChangeMessageVisibilityRequest object and initializes the specified
     * object members.  Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param queueUrl
     * @param receiptHandle The receipt handle associated with the message
     * whose visibility timeout the client wants to change.
     * @param visibilityTimeout The new value (in seconds) for the message's
     * visibility timeout.
     */
    public ChangeMessageVisibilityRequest(String queueUrl, String receiptHandle, Integer visibilityTimeout) {
        this.queueUrl = queueUrl;
        this.receiptHandle = receiptHandle;
        this.visibilityTimeout = visibilityTimeout;
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
    public ChangeMessageVisibilityRequest withQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }
    
    
    /**
     * The receipt handle associated with the message whose visibility
     * timeout the client wants to change.
     *
     * @return The receipt handle associated with the message whose visibility
     *         timeout the client wants to change.
     */
    public String getReceiptHandle() {
        return receiptHandle;
    }
    
    /**
     * The receipt handle associated with the message whose visibility
     * timeout the client wants to change.
     *
     * @param receiptHandle The receipt handle associated with the message whose visibility
     *         timeout the client wants to change.
     */
    public void setReceiptHandle(String receiptHandle) {
        this.receiptHandle = receiptHandle;
    }
    
    /**
     * The receipt handle associated with the message whose visibility
     * timeout the client wants to change.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param receiptHandle The receipt handle associated with the message whose visibility
     *         timeout the client wants to change.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ChangeMessageVisibilityRequest withReceiptHandle(String receiptHandle) {
        this.receiptHandle = receiptHandle;
        return this;
    }
    
    
    /**
     * The new value (in seconds) for the message's visibility timeout.
     *
     * @return The new value (in seconds) for the message's visibility timeout.
     */
    public Integer getVisibilityTimeout() {
        return visibilityTimeout;
    }
    
    /**
     * The new value (in seconds) for the message's visibility timeout.
     *
     * @param visibilityTimeout The new value (in seconds) for the message's visibility timeout.
     */
    public void setVisibilityTimeout(Integer visibilityTimeout) {
        this.visibilityTimeout = visibilityTimeout;
    }
    
    /**
     * The new value (in seconds) for the message's visibility timeout.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param visibilityTimeout The new value (in seconds) for the message's visibility timeout.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ChangeMessageVisibilityRequest withVisibilityTimeout(Integer visibilityTimeout) {
        this.visibilityTimeout = visibilityTimeout;
        return this;
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        
        sb.append("QueueUrl: " + queueUrl + ", ");
        sb.append("ReceiptHandle: " + receiptHandle + ", ");
        sb.append("VisibilityTimeout: " + visibilityTimeout + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    