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
package com.amazonaws.services.mq.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/ListBrokers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBrokersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** A list of information about all brokers. */
    private java.util.List<BrokerSummary> brokerSummaries;
    /**
     * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave
     * nextToken empty.
     */
    private String nextToken;

    /**
     * A list of information about all brokers.
     * 
     * @return A list of information about all brokers.
     */

    public java.util.List<BrokerSummary> getBrokerSummaries() {
        return brokerSummaries;
    }

    /**
     * A list of information about all brokers.
     * 
     * @param brokerSummaries
     *        A list of information about all brokers.
     */

    public void setBrokerSummaries(java.util.Collection<BrokerSummary> brokerSummaries) {
        if (brokerSummaries == null) {
            this.brokerSummaries = null;
            return;
        }

        this.brokerSummaries = new java.util.ArrayList<BrokerSummary>(brokerSummaries);
    }

    /**
     * A list of information about all brokers.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBrokerSummaries(java.util.Collection)} or {@link #withBrokerSummaries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param brokerSummaries
     *        A list of information about all brokers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBrokersResult withBrokerSummaries(BrokerSummary... brokerSummaries) {
        if (this.brokerSummaries == null) {
            setBrokerSummaries(new java.util.ArrayList<BrokerSummary>(brokerSummaries.length));
        }
        for (BrokerSummary ele : brokerSummaries) {
            this.brokerSummaries.add(ele);
        }
        return this;
    }

    /**
     * A list of information about all brokers.
     * 
     * @param brokerSummaries
     *        A list of information about all brokers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBrokersResult withBrokerSummaries(java.util.Collection<BrokerSummary> brokerSummaries) {
        setBrokerSummaries(brokerSummaries);
        return this;
    }

    /**
     * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave
     * nextToken empty.
     * 
     * @param nextToken
     *        The token that specifies the next page of results Amazon MQ should return. To request the first page,
     *        leave nextToken empty.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave
     * nextToken empty.
     * 
     * @return The token that specifies the next page of results Amazon MQ should return. To request the first page,
     *         leave nextToken empty.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave
     * nextToken empty.
     * 
     * @param nextToken
     *        The token that specifies the next page of results Amazon MQ should return. To request the first page,
     *        leave nextToken empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBrokersResult withNextToken(String nextToken) {
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
        if (getBrokerSummaries() != null)
            sb.append("BrokerSummaries: ").append(getBrokerSummaries()).append(",");
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

        if (obj instanceof ListBrokersResult == false)
            return false;
        ListBrokersResult other = (ListBrokersResult) obj;
        if (other.getBrokerSummaries() == null ^ this.getBrokerSummaries() == null)
            return false;
        if (other.getBrokerSummaries() != null && other.getBrokerSummaries().equals(this.getBrokerSummaries()) == false)
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

        hashCode = prime * hashCode + ((getBrokerSummaries() == null) ? 0 : getBrokerSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListBrokersResult clone() {
        try {
            return (ListBrokersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
