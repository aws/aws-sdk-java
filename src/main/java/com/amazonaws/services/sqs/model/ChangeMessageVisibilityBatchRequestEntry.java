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


/**
 * <p>
 * Encloses a receipt handle and an entry id for each message in ChangeMessageVisibilityBatch.
 * </p>
 */
public class ChangeMessageVisibilityBatchRequestEntry implements Serializable {

    /**
     * An identifier for this particular receipt handle. This is used to
     * communicate the result. Note that the <code>Id</code>s of a batch
     * request need to be unique within the request.
     */
    private String id;

    /**
     * A receipt handle.
     */
    private String receiptHandle;

    /**
     * The new value (in seconds) for the message's visibility timeout.
     */
    private Integer visibilityTimeout;

    /**
     * Default constructor for a new ChangeMessageVisibilityBatchRequestEntry object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ChangeMessageVisibilityBatchRequestEntry() {}
    
    /**
     * Constructs a new ChangeMessageVisibilityBatchRequestEntry object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param id An identifier for this particular receipt handle. This is
     * used to communicate the result. Note that the <code>Id</code>s of a
     * batch request need to be unique within the request.
     * @param receiptHandle A receipt handle.
     */
    public ChangeMessageVisibilityBatchRequestEntry(String id, String receiptHandle) {
        setId(id);
        setReceiptHandle(receiptHandle);
    }

    /**
     * An identifier for this particular receipt handle. This is used to
     * communicate the result. Note that the <code>Id</code>s of a batch
     * request need to be unique within the request.
     *
     * @return An identifier for this particular receipt handle. This is used to
     *         communicate the result. Note that the <code>Id</code>s of a batch
     *         request need to be unique within the request.
     */
    public String getId() {
        return id;
    }
    
    /**
     * An identifier for this particular receipt handle. This is used to
     * communicate the result. Note that the <code>Id</code>s of a batch
     * request need to be unique within the request.
     *
     * @param id An identifier for this particular receipt handle. This is used to
     *         communicate the result. Note that the <code>Id</code>s of a batch
     *         request need to be unique within the request.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * An identifier for this particular receipt handle. This is used to
     * communicate the result. Note that the <code>Id</code>s of a batch
     * request need to be unique within the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param id An identifier for this particular receipt handle. This is used to
     *         communicate the result. Note that the <code>Id</code>s of a batch
     *         request need to be unique within the request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ChangeMessageVisibilityBatchRequestEntry withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * A receipt handle.
     *
     * @return A receipt handle.
     */
    public String getReceiptHandle() {
        return receiptHandle;
    }
    
    /**
     * A receipt handle.
     *
     * @param receiptHandle A receipt handle.
     */
    public void setReceiptHandle(String receiptHandle) {
        this.receiptHandle = receiptHandle;
    }
    
    /**
     * A receipt handle.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param receiptHandle A receipt handle.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ChangeMessageVisibilityBatchRequestEntry withReceiptHandle(String receiptHandle) {
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
    public ChangeMessageVisibilityBatchRequestEntry withVisibilityTimeout(Integer visibilityTimeout) {
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
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getReceiptHandle() != null) sb.append("ReceiptHandle: " + getReceiptHandle() + ",");
        if (getVisibilityTimeout() != null) sb.append("VisibilityTimeout: " + getVisibilityTimeout() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getReceiptHandle() == null) ? 0 : getReceiptHandle().hashCode()); 
        hashCode = prime * hashCode + ((getVisibilityTimeout() == null) ? 0 : getVisibilityTimeout().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ChangeMessageVisibilityBatchRequestEntry == false) return false;
        ChangeMessageVisibilityBatchRequestEntry other = (ChangeMessageVisibilityBatchRequestEntry)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getReceiptHandle() == null ^ this.getReceiptHandle() == null) return false;
        if (other.getReceiptHandle() != null && other.getReceiptHandle().equals(this.getReceiptHandle()) == false) return false; 
        if (other.getVisibilityTimeout() == null ^ this.getVisibilityTimeout() == null) return false;
        if (other.getVisibilityTimeout() != null && other.getVisibilityTimeout().equals(this.getVisibilityTimeout()) == false) return false; 
        return true;
    }
    
}
    