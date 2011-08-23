/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticache.model;

/**
 * <p>
 * Contains pair of Topic and Topic Status.
 * </p>
 */
public class NotificationConfiguration {

    /**
     * Specifies the topic Amazon Resource Name (ARN), identifying this
     * resource.
     */
    private String topicArn;

    /**
     * Specifies the current state of this topic.
     */
    private String topicStatus;

    /**
     * Default constructor for a new NotificationConfiguration object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public NotificationConfiguration() {}
    
    /**
     * Specifies the topic Amazon Resource Name (ARN), identifying this
     * resource.
     *
     * @return Specifies the topic Amazon Resource Name (ARN), identifying this
     *         resource.
     */
    public String getTopicArn() {
        return topicArn;
    }
    
    /**
     * Specifies the topic Amazon Resource Name (ARN), identifying this
     * resource.
     *
     * @param topicArn Specifies the topic Amazon Resource Name (ARN), identifying this
     *         resource.
     */
    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }
    
    /**
     * Specifies the topic Amazon Resource Name (ARN), identifying this
     * resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param topicArn Specifies the topic Amazon Resource Name (ARN), identifying this
     *         resource.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public NotificationConfiguration withTopicArn(String topicArn) {
        this.topicArn = topicArn;
        return this;
    }
    
    
    /**
     * Specifies the current state of this topic.
     *
     * @return Specifies the current state of this topic.
     */
    public String getTopicStatus() {
        return topicStatus;
    }
    
    /**
     * Specifies the current state of this topic.
     *
     * @param topicStatus Specifies the current state of this topic.
     */
    public void setTopicStatus(String topicStatus) {
        this.topicStatus = topicStatus;
    }
    
    /**
     * Specifies the current state of this topic.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param topicStatus Specifies the current state of this topic.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public NotificationConfiguration withTopicStatus(String topicStatus) {
        this.topicStatus = topicStatus;
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
        sb.append("TopicStatus: " + topicStatus + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    