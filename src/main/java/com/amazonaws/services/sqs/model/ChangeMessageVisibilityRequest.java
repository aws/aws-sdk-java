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
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/**
 * Container for the parameters to the {@link com.amazonaws.services.sqs.AmazonSQS#changeMessageVisibility(ChangeMessageVisibilityRequest) ChangeMessageVisibility operation}.
 * 
 *
 * @see com.amazonaws.services.sqs.AmazonSQS#changeMessageVisibility(ChangeMessageVisibilityRequest)
 */
public class ChangeMessageVisibilityRequest extends AmazonWebServiceRequest  implements Serializable  {

    private String queueUrl;

    private String receiptHandle;

    private Integer visibilityTimeout;

    /**
     * Default constructor for a new ChangeMessageVisibilityRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ChangeMessageVisibilityRequest() {}
    


    /**
     * Constructs a new ChangeMessageVisibilityRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param queueUrl
     * @param receiptHandle
     * @param visibilityTimeout
     */
    public ChangeMessageVisibilityRequest(String queueUrl, String receiptHandle, Integer visibilityTimeout) {
        setQueueUrl(queueUrl);
        setReceiptHandle(receiptHandle);
        setVisibilityTimeout(visibilityTimeout);
    }

    
    
    /**
     * Returns the value of the QueueUrl property for this object.
     *
     * @return The value of the QueueUrl property for this object.
     */
    public String getQueueUrl() {
        return queueUrl;
    }
    
    /**
     * Sets the value of the QueueUrl property for this object.
     *
     * @param queueUrl The new value for the QueueUrl property for this object.
     */
    public void setQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
    }
    
    /**
     * Sets the value of the QueueUrl property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param queueUrl The new value for the QueueUrl property for this object.
     */
    public ChangeMessageVisibilityRequest withQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }
    
    
    /**
     * Returns the value of the ReceiptHandle property for this object.
     *
     * @return The value of the ReceiptHandle property for this object.
     */
    public String getReceiptHandle() {
        return receiptHandle;
    }
    
    /**
     * Sets the value of the ReceiptHandle property for this object.
     *
     * @param receiptHandle The new value for the ReceiptHandle property for this object.
     */
    public void setReceiptHandle(String receiptHandle) {
        this.receiptHandle = receiptHandle;
    }
    
    /**
     * Sets the value of the ReceiptHandle property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param receiptHandle The new value for the ReceiptHandle property for this object.
     */
    public ChangeMessageVisibilityRequest withReceiptHandle(String receiptHandle) {
        this.receiptHandle = receiptHandle;
        return this;
    }
    
    
    /**
     * Returns the value of the VisibilityTimeout property for this object.
     *
     * @return The value of the VisibilityTimeout property for this object.
     */
    public Integer getVisibilityTimeout() {
        return visibilityTimeout;
    }
    
    /**
     * Sets the value of the VisibilityTimeout property for this object.
     *
     * @param visibilityTimeout The new value for the VisibilityTimeout property for this object.
     */
    public void setVisibilityTimeout(Integer visibilityTimeout) {
        this.visibilityTimeout = visibilityTimeout;
    }
    
    /**
     * Sets the value of the VisibilityTimeout property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param visibilityTimeout The new value for the VisibilityTimeout property for this object.
     */
    public ChangeMessageVisibilityRequest withVisibilityTimeout(Integer visibilityTimeout) {
        this.visibilityTimeout = visibilityTimeout;
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
        if (getReceiptHandle() != null) sb.append("ReceiptHandle: " + getReceiptHandle() + ",");
        if (getVisibilityTimeout() != null) sb.append("VisibilityTimeout: " + getVisibilityTimeout() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getQueueUrl() == null) ? 0 : getQueueUrl().hashCode()); 
        hashCode = prime * hashCode + ((getReceiptHandle() == null) ? 0 : getReceiptHandle().hashCode()); 
        hashCode = prime * hashCode + ((getVisibilityTimeout() == null) ? 0 : getVisibilityTimeout().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ChangeMessageVisibilityRequest == false) return false;
        ChangeMessageVisibilityRequest other = (ChangeMessageVisibilityRequest)obj;
        
        if (other.getQueueUrl() == null ^ this.getQueueUrl() == null) return false;
        if (other.getQueueUrl() != null && other.getQueueUrl().equals(this.getQueueUrl()) == false) return false; 
        if (other.getReceiptHandle() == null ^ this.getReceiptHandle() == null) return false;
        if (other.getReceiptHandle() != null && other.getReceiptHandle().equals(this.getReceiptHandle()) == false) return false; 
        if (other.getVisibilityTimeout() == null ^ this.getVisibilityTimeout() == null) return false;
        if (other.getVisibilityTimeout() != null && other.getVisibilityTimeout().equals(this.getVisibilityTimeout()) == false) return false; 
        return true;
    }
    
}
    