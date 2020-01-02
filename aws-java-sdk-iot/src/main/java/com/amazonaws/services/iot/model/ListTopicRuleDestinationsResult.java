/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTopicRuleDestinationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about a topic rule destination.
     * </p>
     */
    private java.util.List<TopicRuleDestinationSummary> destinationSummaries;
    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about a topic rule destination.
     * </p>
     * 
     * @return Information about a topic rule destination.
     */

    public java.util.List<TopicRuleDestinationSummary> getDestinationSummaries() {
        return destinationSummaries;
    }

    /**
     * <p>
     * Information about a topic rule destination.
     * </p>
     * 
     * @param destinationSummaries
     *        Information about a topic rule destination.
     */

    public void setDestinationSummaries(java.util.Collection<TopicRuleDestinationSummary> destinationSummaries) {
        if (destinationSummaries == null) {
            this.destinationSummaries = null;
            return;
        }

        this.destinationSummaries = new java.util.ArrayList<TopicRuleDestinationSummary>(destinationSummaries);
    }

    /**
     * <p>
     * Information about a topic rule destination.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinationSummaries(java.util.Collection)} or {@link #withDestinationSummaries(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param destinationSummaries
     *        Information about a topic rule destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTopicRuleDestinationsResult withDestinationSummaries(TopicRuleDestinationSummary... destinationSummaries) {
        if (this.destinationSummaries == null) {
            setDestinationSummaries(new java.util.ArrayList<TopicRuleDestinationSummary>(destinationSummaries.length));
        }
        for (TopicRuleDestinationSummary ele : destinationSummaries) {
            this.destinationSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about a topic rule destination.
     * </p>
     * 
     * @param destinationSummaries
     *        Information about a topic rule destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTopicRuleDestinationsResult withDestinationSummaries(java.util.Collection<TopicRuleDestinationSummary> destinationSummaries) {
        setDestinationSummaries(destinationSummaries);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @return The token to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTopicRuleDestinationsResult withNextToken(String nextToken) {
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
        if (getDestinationSummaries() != null)
            sb.append("DestinationSummaries: ").append(getDestinationSummaries()).append(",");
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

        if (obj instanceof ListTopicRuleDestinationsResult == false)
            return false;
        ListTopicRuleDestinationsResult other = (ListTopicRuleDestinationsResult) obj;
        if (other.getDestinationSummaries() == null ^ this.getDestinationSummaries() == null)
            return false;
        if (other.getDestinationSummaries() != null && other.getDestinationSummaries().equals(this.getDestinationSummaries()) == false)
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

        hashCode = prime * hashCode + ((getDestinationSummaries() == null) ? 0 : getDestinationSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTopicRuleDestinationsResult clone() {
        try {
            return (ListTopicRuleDestinationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
