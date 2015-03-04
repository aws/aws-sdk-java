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
 * Container for the parameters to the {@link com.amazonaws.services.sqs.AmazonSQS#purgeQueue(PurgeQueueRequest) PurgeQueue operation}.
 * <p>
 * Deletes the messages in a queue specified by the <b>queue URL</b> .
 * </p>
 * <p>
 * <b>IMPORTANT:</b>When you use the PurgeQueue API, the deleted messages
 * in the queue cannot be retrieved.
 * </p>
 * <p>
 * When you purge a queue, the message deletion process takes up to 60
 * seconds. All messages sent to the queue before calling
 * <code>PurgeQueue</code> will be deleted; messages sent to the queue
 * while it is being purged may be deleted. While the queue is being
 * purged, messages sent to the queue before <code>PurgeQueue</code> was
 * called may be received, but will be deleted within the next minute.
 * </p>
 *
 * @see com.amazonaws.services.sqs.AmazonSQS#purgeQueue(PurgeQueueRequest)
 */
public class PurgeQueueRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The queue URL of the queue to delete the messages from when using the
     * <code>PurgeQueue</code> API.
     */
    private String queueUrl;

    /**
     * Default constructor for a new PurgeQueueRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public PurgeQueueRequest() {}
    
    /**
     * Constructs a new PurgeQueueRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param queueUrl The queue URL of the queue to delete the messages from
     * when using the <code>PurgeQueue</code> API.
     */
    public PurgeQueueRequest(String queueUrl) {
        setQueueUrl(queueUrl);
    }

    /**
     * The queue URL of the queue to delete the messages from when using the
     * <code>PurgeQueue</code> API.
     *
     * @return The queue URL of the queue to delete the messages from when using the
     *         <code>PurgeQueue</code> API.
     */
    public String getQueueUrl() {
        return queueUrl;
    }
    
    /**
     * The queue URL of the queue to delete the messages from when using the
     * <code>PurgeQueue</code> API.
     *
     * @param queueUrl The queue URL of the queue to delete the messages from when using the
     *         <code>PurgeQueue</code> API.
     */
    public void setQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
    }
    
    /**
     * The queue URL of the queue to delete the messages from when using the
     * <code>PurgeQueue</code> API.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param queueUrl The queue URL of the queue to delete the messages from when using the
     *         <code>PurgeQueue</code> API.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PurgeQueueRequest withQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
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
        if (getQueueUrl() != null) sb.append("QueueUrl: " + getQueueUrl() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getQueueUrl() == null) ? 0 : getQueueUrl().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PurgeQueueRequest == false) return false;
        PurgeQueueRequest other = (PurgeQueueRequest)obj;
        
        if (other.getQueueUrl() == null ^ this.getQueueUrl() == null) return false;
        if (other.getQueueUrl() != null && other.getQueueUrl().equals(this.getQueueUrl()) == false) return false; 
        return true;
    }
    
    @Override
    public PurgeQueueRequest clone() {
        
            return (PurgeQueueRequest) super.clone();
    }

}
    