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
 * Container for the parameters to the {@link com.amazonaws.services.sqs.AmazonSQS#setQueueAttributes(SetQueueAttributesRequest) SetQueueAttributes operation}.
 * <p>
 * Sets an attribute of a queue. Currently, you can set only the
 * VisibilityTimeout attribute for a queue.
 * </p>
 *
 * @see com.amazonaws.services.sqs.AmazonSQS#setQueueAttributes(SetQueueAttributesRequest)
 */
public class SetQueueAttributesRequest extends AmazonWebServiceRequest {

    /**
     * 
     */
    private String queueUrl;

    /**
     * A list of attributes to set.
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
     * @param queueUrl
     * @param attributes A list of attributes to set.
     */
    public SetQueueAttributesRequest(String queueUrl, java.util.Map<String,String> attributes) {
        this.queueUrl = queueUrl;
        this.attributes = attributes;
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
    public SetQueueAttributesRequest withQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }
    
    
    /**
     * A list of attributes to set.
     *
     * @return A list of attributes to set.
     */
    public java.util.Map<String,String> getAttributes() {
        if (attributes == null) {
            attributes = new java.util.HashMap<String,String>();
        }
        return attributes;
    }
    
    /**
     * A list of attributes to set.
     *
     * @param attributes A list of attributes to set.
     */
    public void setAttributes(java.util.Map<String,String> attributes) {
        this.attributes = attributes;
    }
    
    /**
     * A list of attributes to set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes A list of attributes to set.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SetQueueAttributesRequest withAttributes(java.util.Map<String,String> attributes) {
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
        sb.append("QueueUrl: " + queueUrl + ", ");
        sb.append("Attributes: " + attributes + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    