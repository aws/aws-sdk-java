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
package com.amazonaws.services.sns.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.sns.AmazonSNS#getTopicAttributes(GetTopicAttributesRequest) GetTopicAttributes operation}.
 * <p>
 * The <code>GetTopicAttributes</code> action returns all of the properties of a topic. Topic properties returned might differ based on the authorization
 * of the user.
 * </p>
 *
 * @see com.amazonaws.services.sns.AmazonSNS#getTopicAttributes(GetTopicAttributesRequest)
 */
public class GetTopicAttributesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The ARN of the topic whose properties you want to get.
     */
    private String topicArn;

    /**
     * Default constructor for a new GetTopicAttributesRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public GetTopicAttributesRequest() {}
    
    /**
     * Constructs a new GetTopicAttributesRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param topicArn The ARN of the topic whose properties you want to get.
     */
    public GetTopicAttributesRequest(String topicArn) {
        setTopicArn(topicArn);
    }

    /**
     * The ARN of the topic whose properties you want to get.
     *
     * @return The ARN of the topic whose properties you want to get.
     */
    public String getTopicArn() {
        return topicArn;
    }
    
    /**
     * The ARN of the topic whose properties you want to get.
     *
     * @param topicArn The ARN of the topic whose properties you want to get.
     */
    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }
    
    /**
     * The ARN of the topic whose properties you want to get.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param topicArn The ARN of the topic whose properties you want to get.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetTopicAttributesRequest withTopicArn(String topicArn) {
        this.topicArn = topicArn;
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
        if (getTopicArn() != null) sb.append("TopicArn: " + getTopicArn() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetTopicAttributesRequest == false) return false;
        GetTopicAttributesRequest other = (GetTopicAttributesRequest)obj;
        
        if (other.getTopicArn() == null ^ this.getTopicArn() == null) return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false) return false; 
        return true;
    }
    
}
    