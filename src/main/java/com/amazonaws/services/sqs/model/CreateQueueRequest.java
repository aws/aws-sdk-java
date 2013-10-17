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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.sqs.AmazonSQS#createQueue(CreateQueueRequest) CreateQueue operation}.
 * <p>
 * The <code>CreateQueue</code> action creates a new queue, or returns the URL of an existing one. When you request <code>CreateQueue</code> , you
 * provide a name for the queue. To successfully create a new queue, you must provide a name that is unique within the scope of your own queues.
 * </p>
 * <p>
 * You may pass one or more attributes in the request. If you do not provide a value for any attribute, the queue will have the default value for that
 * attribute. Permitted attributes are the same that can be set using SetQueueAttributes.
 * </p>
 * <p>
 * If you provide the name of an existing queue, a new queue isn't created. If the values of attributes provided with the request match up with those on
 * the existing queue, the queue URL is returned. Otherwise, a <code>QueueNameExists</code> error is returned.
 * </p>
 *
 * @see com.amazonaws.services.sqs.AmazonSQS#createQueue(CreateQueueRequest)
 */
public class CreateQueueRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name for the queue to be created.
     */
    private String queueName;

    /**
     * A map of attributes with their corresponding values.
     */
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
     * @param queueName The name for the queue to be created.
     */
    public CreateQueueRequest(String queueName) {
        setQueueName(queueName);
    }

    /**
     * The name for the queue to be created.
     *
     * @return The name for the queue to be created.
     */
    public String getQueueName() {
        return queueName;
    }
    
    /**
     * The name for the queue to be created.
     *
     * @param queueName The name for the queue to be created.
     */
    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }
    
    /**
     * The name for the queue to be created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param queueName The name for the queue to be created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateQueueRequest withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * A map of attributes with their corresponding values.
     *
     * @return A map of attributes with their corresponding values.
     */
    public java.util.Map<String,String> getAttributes() {
        
        if (attributes == null) {
            attributes = new java.util.HashMap<String,String>();
        }
        return attributes;
    }
    
    /**
     * A map of attributes with their corresponding values.
     *
     * @param attributes A map of attributes with their corresponding values.
     */
    public void setAttributes(java.util.Map<String,String> attributes) {
        this.attributes = attributes;
    }
    
    /**
     * A map of attributes with their corresponding values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes A map of attributes with their corresponding values.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateQueueRequest withAttributes(java.util.Map<String,String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * A map of attributes with their corresponding values.
     * <p>
     * The method adds a new key-value pair into Attributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Attributes.
     * @param value The corresponding value of the entry to be added into Attributes.
     */
	public CreateQueueRequest addAttributesEntry(String key, String value) {
		if (null == this.attributes) {
			this.attributes = new java.util.HashMap<String,String>();
		}
		if (this.attributes.containsKey(key))
			throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
		this.attributes.put(key, value);
		return this;
	}

	/**
	 * Removes all the entries added into Attributes.
	 * <p>
	 * Returns a reference to this object so that method calls can be chained together.
	 */
	public CreateQueueRequest clearAttributesEntries() {
		this.attributes = null;
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
    