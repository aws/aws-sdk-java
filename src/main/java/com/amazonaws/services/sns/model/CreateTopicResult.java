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
 * Create Topic Result
 */
public class CreateTopicResult {

    /**
     * The Amazon Resource Name (ARN) assigned to the created topic.
     */
    private String topicArn;

    /**
     * The Amazon Resource Name (ARN) assigned to the created topic.
     *
     * @return The Amazon Resource Name (ARN) assigned to the created topic.
     */
    public String getTopicArn() {
        return topicArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) assigned to the created topic.
     *
     * @param topicArn The Amazon Resource Name (ARN) assigned to the created topic.
     */
    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) assigned to the created topic.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param topicArn The Amazon Resource Name (ARN) assigned to the created topic.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateTopicResult withTopicArn(String topicArn) {
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
    