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


/**
 * <p>
 * A wrapper type for the topic's Amazon Resource Name (ARN). To retrieve a topic's attributes, use <code>GetTopicAttributes</code> .
 * </p>
 */
public class Topic implements Serializable {

    /**
     * The topic's ARN.
     */
    private String topicArn;

    /**
     * Default constructor for a new Topic object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public Topic() {}
    
    /**
     * The topic's ARN.
     *
     * @return The topic's ARN.
     */
    public String getTopicArn() {
        return topicArn;
    }
    
    /**
     * The topic's ARN.
     *
     * @param topicArn The topic's ARN.
     */
    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }
    
    /**
     * The topic's ARN.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param topicArn The topic's ARN.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Topic withTopicArn(String topicArn) {
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

        if (obj instanceof Topic == false) return false;
        Topic other = (Topic)obj;
        
        if (other.getTopicArn() == null ^ this.getTopicArn() == null) return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false) return false; 
        return true;
    }
    
}
    