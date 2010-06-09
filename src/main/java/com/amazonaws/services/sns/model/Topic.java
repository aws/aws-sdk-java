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
package com.amazonaws.services.sns.model;

/**
 * <p>
 * A wrapper type for the topic's Amazon Resource Name (ARN). To retrieve
 * a topic's attributes, use GetTopicAttributes.
 * </p>
 */
public class Topic {

    /**
     * The topic's ARN.
     */
    private String topicArn;

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
        
        sb.append("TopicArn: " + topicArn + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    