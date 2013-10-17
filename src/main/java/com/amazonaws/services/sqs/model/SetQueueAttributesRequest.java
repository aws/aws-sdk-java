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
 * Container for the parameters to the {@link com.amazonaws.services.sqs.AmazonSQS#setQueueAttributes(SetQueueAttributesRequest) SetQueueAttributes operation}.
 * <p>
 * Sets the value of one or more queue attributes. Valid attributes that can be set are [VisibilityTimeout, Policy, MaximumMessageSize,
 * MessageRetentionPeriod, ReceiveMessageWaitTimeSeconds].
 * </p>
 *
 * @see com.amazonaws.services.sqs.AmazonSQS#setQueueAttributes(SetQueueAttributesRequest)
 */
public class SetQueueAttributesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The URL of the SQS queue to take action on.
     */
    private String queueUrl;

    /**
     * A map of attributes to set.
     */
    private java.util.Map<String,String> attributes;

    /**
     * Default constructor for a new SetQueueAttributesRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public SetQueueAttributesRequest() {}
    
    /**
     * Constructs a new SetQueueAttributesRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param queueUrl The URL of the SQS queue to take action on.
     * @param attributes A map of attributes to set.
     */
    public SetQueueAttributesRequest(String queueUrl, java.util.Map<String,String> attributes) {
        setQueueUrl(queueUrl);
        setAttributes(attributes);
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
    public SetQueueAttributesRequest withQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }

    /**
     * A map of attributes to set.
     *
     * @return A map of attributes to set.
     */
    public java.util.Map<String,String> getAttributes() {
        
        if (attributes == null) {
            attributes = new java.util.HashMap<String,String>();
        }
        return attributes;
    }
    
    /**
     * A map of attributes to set.
     *
     * @param attributes A map of attributes to set.
     */
    public void setAttributes(java.util.Map<String,String> attributes) {
        this.attributes = attributes;
    }
    
    /**
     * A map of attributes to set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes A map of attributes to set.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetQueueAttributesRequest withAttributes(java.util.Map<String,String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * A map of attributes to set.
     * <p>
     * The method adds a new key-value pair into Attributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Attributes.
     * @param value The corresponding value of the entry to be added into Attributes.
     */
	public SetQueueAttributesRequest addAttributesEntry(String key, String value) {
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
	public SetQueueAttributesRequest clearAttributesEntries() {
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
        if (getQueueUrl() != null) sb.append("QueueUrl: " + getQueueUrl() + ",");
        if (getAttributes() != null) sb.append("Attributes: " + getAttributes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getQueueUrl() == null) ? 0 : getQueueUrl().hashCode()); 
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SetQueueAttributesRequest == false) return false;
        SetQueueAttributesRequest other = (SetQueueAttributesRequest)obj;
        
        if (other.getQueueUrl() == null ^ this.getQueueUrl() == null) return false;
        if (other.getQueueUrl() != null && other.getQueueUrl().equals(this.getQueueUrl()) == false) return false; 
        if (other.getAttributes() == null ^ this.getAttributes() == null) return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false) return false; 
        return true;
    }
    
}
    