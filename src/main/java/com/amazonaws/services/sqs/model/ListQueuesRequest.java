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
 * Container for the parameters to the {@link com.amazonaws.services.sqs.AmazonSQS#listQueues(ListQueuesRequest) ListQueues operation}.
 * 
 *
 * @see com.amazonaws.services.sqs.AmazonSQS#listQueues(ListQueuesRequest)
 */
public class ListQueuesRequest extends AmazonWebServiceRequest  implements Serializable  {

    private String queueNamePrefix;

    /**
     * Default constructor for a new ListQueuesRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ListQueuesRequest() {}
    


    /**
     * Constructs a new ListQueuesRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param queueNamePrefix
     */
    public ListQueuesRequest(String queueNamePrefix) {
        setQueueNamePrefix(queueNamePrefix);
    }

    
    
    /**
     * Returns the value of the QueueNamePrefix property for this object.
     *
     * @return The value of the QueueNamePrefix property for this object.
     */
    public String getQueueNamePrefix() {
        return queueNamePrefix;
    }
    
    /**
     * Sets the value of the QueueNamePrefix property for this object.
     *
     * @param queueNamePrefix The new value for the QueueNamePrefix property for this object.
     */
    public void setQueueNamePrefix(String queueNamePrefix) {
        this.queueNamePrefix = queueNamePrefix;
    }
    
    /**
     * Sets the value of the QueueNamePrefix property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param queueNamePrefix The new value for the QueueNamePrefix property for this object.
     */
    public ListQueuesRequest withQueueNamePrefix(String queueNamePrefix) {
        this.queueNamePrefix = queueNamePrefix;
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
        if (getQueueNamePrefix() != null) sb.append("QueueNamePrefix: " + getQueueNamePrefix() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getQueueNamePrefix() == null) ? 0 : getQueueNamePrefix().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListQueuesRequest == false) return false;
        ListQueuesRequest other = (ListQueuesRequest)obj;
        
        if (other.getQueueNamePrefix() == null ^ this.getQueueNamePrefix() == null) return false;
        if (other.getQueueNamePrefix() != null && other.getQueueNamePrefix().equals(this.getQueueNamePrefix()) == false) return false; 
        return true;
    }
    
}
    