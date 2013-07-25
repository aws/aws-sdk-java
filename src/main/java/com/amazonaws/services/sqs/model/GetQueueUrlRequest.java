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
 * Container for the parameters to the {@link com.amazonaws.services.sqs.AmazonSQS#getQueueUrl(GetQueueUrlRequest) GetQueueUrl operation}.
 * 
 *
 * @see com.amazonaws.services.sqs.AmazonSQS#getQueueUrl(GetQueueUrlRequest)
 */
public class GetQueueUrlRequest extends AmazonWebServiceRequest  implements Serializable  {

    private String queueName;

    private String queueOwnerAWSAccountId;

    /**
     * Default constructor for a new GetQueueUrlRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public GetQueueUrlRequest() {}
    


    /**
     * Constructs a new GetQueueUrlRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param queueName
     */
    public GetQueueUrlRequest(String queueName) {
        setQueueName(queueName);
    }

    
    
    /**
     * Returns the value of the QueueName property for this object.
     *
     * @return The value of the QueueName property for this object.
     */
    public String getQueueName() {
        return queueName;
    }
    
    /**
     * Sets the value of the QueueName property for this object.
     *
     * @param queueName The new value for the QueueName property for this object.
     */
    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }
    
    /**
     * Sets the value of the QueueName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param queueName The new value for the QueueName property for this object.
     */
    public GetQueueUrlRequest withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    
    
    /**
     * Returns the value of the QueueOwnerAWSAccountId property for this
     * object.
     *
     * @return The value of the QueueOwnerAWSAccountId property for this object.
     */
    public String getQueueOwnerAWSAccountId() {
        return queueOwnerAWSAccountId;
    }
    
    /**
     * Sets the value of the QueueOwnerAWSAccountId property for this object.
     *
     * @param queueOwnerAWSAccountId The new value for the QueueOwnerAWSAccountId property for this object.
     */
    public void setQueueOwnerAWSAccountId(String queueOwnerAWSAccountId) {
        this.queueOwnerAWSAccountId = queueOwnerAWSAccountId;
    }
    
    /**
     * Sets the value of the QueueOwnerAWSAccountId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param queueOwnerAWSAccountId The new value for the QueueOwnerAWSAccountId property for this object.
     */
    public GetQueueUrlRequest withQueueOwnerAWSAccountId(String queueOwnerAWSAccountId) {
        this.queueOwnerAWSAccountId = queueOwnerAWSAccountId;
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
        if (getQueueName() != null) sb.append("QueueName: " + getQueueName() + ",");
        if (getQueueOwnerAWSAccountId() != null) sb.append("QueueOwnerAWSAccountId: " + getQueueOwnerAWSAccountId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getQueueName() == null) ? 0 : getQueueName().hashCode()); 
        hashCode = prime * hashCode + ((getQueueOwnerAWSAccountId() == null) ? 0 : getQueueOwnerAWSAccountId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetQueueUrlRequest == false) return false;
        GetQueueUrlRequest other = (GetQueueUrlRequest)obj;
        
        if (other.getQueueName() == null ^ this.getQueueName() == null) return false;
        if (other.getQueueName() != null && other.getQueueName().equals(this.getQueueName()) == false) return false; 
        if (other.getQueueOwnerAWSAccountId() == null ^ this.getQueueOwnerAWSAccountId() == null) return false;
        if (other.getQueueOwnerAWSAccountId() != null && other.getQueueOwnerAWSAccountId().equals(this.getQueueOwnerAWSAccountId()) == false) return false; 
        return true;
    }
    
}
    