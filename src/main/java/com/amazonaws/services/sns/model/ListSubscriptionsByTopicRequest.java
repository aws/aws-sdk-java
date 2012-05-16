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
package com.amazonaws.services.sns.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.sns.AmazonSNS#listSubscriptionsByTopic(ListSubscriptionsByTopicRequest) ListSubscriptionsByTopic operation}.
 * <p>
 * The ListSubscriptionsByTopic action returns a list of the subscriptions to a specific topic. Each call returns a limited list of subscriptions, up to
 * 100. If there are more subscriptions, a NextToken is also returned. Use the NextToken parameter in a new ListSubscriptionsByTopic call to get further
 * results.
 * </p>
 *
 * @see com.amazonaws.services.sns.AmazonSNS#listSubscriptionsByTopic(ListSubscriptionsByTopicRequest)
 */
public class ListSubscriptionsByTopicRequest extends AmazonWebServiceRequest {

    /**
     * The ARN of the topic for which you wish to find subscriptions.
     */
    private String topicArn;

    /**
     * Token returned by the previous ListSubscriptionsByTopic request.
     */
    private String nextToken;

    /**
     * Default constructor for a new ListSubscriptionsByTopicRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ListSubscriptionsByTopicRequest() {}
    
    /**
     * Constructs a new ListSubscriptionsByTopicRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param topicArn The ARN of the topic for which you wish to find
     * subscriptions.
     */
    public ListSubscriptionsByTopicRequest(String topicArn) {
        this.topicArn = topicArn;
    }

    
    
    /**
     * Constructs a new ListSubscriptionsByTopicRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param topicArn The ARN of the topic for which you wish to find
     * subscriptions.
     * @param nextToken Token returned by the previous
     * ListSubscriptionsByTopic request.
     */
    public ListSubscriptionsByTopicRequest(String topicArn, String nextToken) {
        this.topicArn = topicArn;
        this.nextToken = nextToken;
    }

    
    
    /**
     * The ARN of the topic for which you wish to find subscriptions.
     *
     * @return The ARN of the topic for which you wish to find subscriptions.
     */
    public String getTopicArn() {
        return topicArn;
    }
    
    /**
     * The ARN of the topic for which you wish to find subscriptions.
     *
     * @param topicArn The ARN of the topic for which you wish to find subscriptions.
     */
    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }
    
    /**
     * The ARN of the topic for which you wish to find subscriptions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param topicArn The ARN of the topic for which you wish to find subscriptions.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListSubscriptionsByTopicRequest withTopicArn(String topicArn) {
        this.topicArn = topicArn;
        return this;
    }
    
    
    /**
     * Token returned by the previous ListSubscriptionsByTopic request.
     *
     * @return Token returned by the previous ListSubscriptionsByTopic request.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * Token returned by the previous ListSubscriptionsByTopic request.
     *
     * @param nextToken Token returned by the previous ListSubscriptionsByTopic request.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * Token returned by the previous ListSubscriptionsByTopic request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken Token returned by the previous ListSubscriptionsByTopic request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListSubscriptionsByTopicRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (nextToken != null) sb.append("NextToken: " + nextToken + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof ListSubscriptionsByTopicRequest == false) return false;
        ListSubscriptionsByTopicRequest other = (ListSubscriptionsByTopicRequest)obj;
        
        if (other.getTopicArn() == null ^ this.getTopicArn() == null) return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    