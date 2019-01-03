/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.sns.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Input for ListSubscriptionsByTopic action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/ListSubscriptionsByTopic" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSubscriptionsByTopicRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the topic for which you wish to find subscriptions.
     * </p>
     */
    private String topicArn;
    /**
     * <p>
     * Token returned by the previous <code>ListSubscriptionsByTopic</code> request.
     * </p>
     */
    private String nextToken;

    /**
     * Default constructor for ListSubscriptionsByTopicRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public ListSubscriptionsByTopicRequest() {
    }

    /**
     * Constructs a new ListSubscriptionsByTopicRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param topicArn
     *        The ARN of the topic for which you wish to find subscriptions.
     */
    public ListSubscriptionsByTopicRequest(String topicArn) {
        setTopicArn(topicArn);
    }

    /**
     * Constructs a new ListSubscriptionsByTopicRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param topicArn
     *        The ARN of the topic for which you wish to find subscriptions.
     * @param nextToken
     *        Token returned by the previous <code>ListSubscriptionsByTopic</code> request.
     */
    public ListSubscriptionsByTopicRequest(String topicArn, String nextToken) {
        setTopicArn(topicArn);
        setNextToken(nextToken);
    }

    /**
     * <p>
     * The ARN of the topic for which you wish to find subscriptions.
     * </p>
     * 
     * @param topicArn
     *        The ARN of the topic for which you wish to find subscriptions.
     */

    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    /**
     * <p>
     * The ARN of the topic for which you wish to find subscriptions.
     * </p>
     * 
     * @return The ARN of the topic for which you wish to find subscriptions.
     */

    public String getTopicArn() {
        return this.topicArn;
    }

    /**
     * <p>
     * The ARN of the topic for which you wish to find subscriptions.
     * </p>
     * 
     * @param topicArn
     *        The ARN of the topic for which you wish to find subscriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSubscriptionsByTopicRequest withTopicArn(String topicArn) {
        setTopicArn(topicArn);
        return this;
    }

    /**
     * <p>
     * Token returned by the previous <code>ListSubscriptionsByTopic</code> request.
     * </p>
     * 
     * @param nextToken
     *        Token returned by the previous <code>ListSubscriptionsByTopic</code> request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token returned by the previous <code>ListSubscriptionsByTopic</code> request.
     * </p>
     * 
     * @return Token returned by the previous <code>ListSubscriptionsByTopic</code> request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token returned by the previous <code>ListSubscriptionsByTopic</code> request.
     * </p>
     * 
     * @param nextToken
     *        Token returned by the previous <code>ListSubscriptionsByTopic</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSubscriptionsByTopicRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTopicArn() != null)
            sb.append("TopicArn: ").append(getTopicArn()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSubscriptionsByTopicRequest == false)
            return false;
        ListSubscriptionsByTopicRequest other = (ListSubscriptionsByTopicRequest) obj;
        if (other.getTopicArn() == null ^ this.getTopicArn() == null)
            return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
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
    public ListSubscriptionsByTopicRequest clone() {
        return (ListSubscriptionsByTopicRequest) super.clone();
    }

}
