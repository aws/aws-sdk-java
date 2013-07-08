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
 * Container for the parameters to the {@link com.amazonaws.services.sqs.AmazonSQS#createQueue(CreateQueueRequest) CreateQueue operation}.
 * 
 *
 * @see com.amazonaws.services.sqs.AmazonSQS#createQueue(CreateQueueRequest)
 */
public class CreateQueueRequest extends AmazonWebServiceRequest  implements Serializable  {

    private String queueName;

    private java.util.Map<String,String> attributes;

    /**
     * Default constructor for a new CreateQueueRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateQueueRequest() {}
    


    /**
     * Constructs a new CreateQueueRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param queueName
     */
    public CreateQueueRequest(String queueName) {
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
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateQueueRequest withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    
    
    /**
     * Returns the value of the Attributes property for this object.
     *
     * @return The value of the Attributes property for this object.
     */
    public java.util.Map<String,String> getAttributes() {
        
        if (attributes == null) {
            attributes = new java.util.HashMap<String,String>();
        }
        return attributes;

    }
    
    /**
     * Sets the value of the Attributes property for this object.
     *
     * @param attributes The new value for the Attributes property for this object.
     */
    public void setAttributes(java.util.Map<String,String> attributes) {
        this.attributes = attributes;
    }
    
    /**
     * Sets the value of the Attributes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes The new value for the Attributes property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateQueueRequest withAttributes(java.util.Map<String,String> attributes) {
        setAttributes(attributes);
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
        if (getAttributes() != null) sb.append("Attributes: " + getAttributes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getQueueName() == null) ? 0 : getQueueName().hashCode()); 
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateQueueRequest == false) return false;
        CreateQueueRequest other = (CreateQueueRequest)obj;
        
        if (other.getQueueName() == null ^ this.getQueueName() == null) return false;
        if (other.getQueueName() != null && other.getQueueName().equals(this.getQueueName()) == false) return false; 
        if (other.getAttributes() == null ^ this.getAttributes() == null) return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false) return false; 
        return true;
    }
    
}
    