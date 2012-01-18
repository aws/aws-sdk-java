/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
        if (topicArn != null) sb.append("TopicArn: " + topicArn + ", ");
        if (topicStatus != null) sb.append("TopicStatus: " + topicStatus + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode()); 
        hashCode = prime * hashCode + ((getTopicStatus() == null) ? 0 : getTopicStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof NotificationConfiguration == false) return false;
        NotificationConfiguration other = (NotificationConfiguration)obj;
        
        if (other.getTopicArn() == null ^ this.getTopicArn() == null) return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false) return false; 
        if (other.getTopicStatus() == null ^ this.getTopicStatus() == null) return false;
        if (other.getTopicStatus() != null && other.getTopicStatus().equals(this.getTopicStatus()) == false) return false; 
        return true;
    }
    
}
    