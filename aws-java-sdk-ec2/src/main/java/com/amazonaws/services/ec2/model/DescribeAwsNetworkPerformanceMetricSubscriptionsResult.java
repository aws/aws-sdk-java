/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAwsNetworkPerformanceMetricSubscriptionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Describes the current Infrastructure Performance subscriptions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Subscription> subscriptions;

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAwsNetworkPerformanceMetricSubscriptionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Describes the current Infrastructure Performance subscriptions.
     * </p>
     * 
     * @return Describes the current Infrastructure Performance subscriptions.
     */

    public java.util.List<Subscription> getSubscriptions() {
        if (subscriptions == null) {
            subscriptions = new com.amazonaws.internal.SdkInternalList<Subscription>();
        }
        return subscriptions;
    }

    /**
     * <p>
     * Describes the current Infrastructure Performance subscriptions.
     * </p>
     * 
     * @param subscriptions
     *        Describes the current Infrastructure Performance subscriptions.
     */

    public void setSubscriptions(java.util.Collection<Subscription> subscriptions) {
        if (subscriptions == null) {
            this.subscriptions = null;
            return;
        }

        this.subscriptions = new com.amazonaws.internal.SdkInternalList<Subscription>(subscriptions);
    }

    /**
     * <p>
     * Describes the current Infrastructure Performance subscriptions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubscriptions(java.util.Collection)} or {@link #withSubscriptions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param subscriptions
     *        Describes the current Infrastructure Performance subscriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAwsNetworkPerformanceMetricSubscriptionsResult withSubscriptions(Subscription... subscriptions) {
        if (this.subscriptions == null) {
            setSubscriptions(new com.amazonaws.internal.SdkInternalList<Subscription>(subscriptions.length));
        }
        for (Subscription ele : subscriptions) {
            this.subscriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes the current Infrastructure Performance subscriptions.
     * </p>
     * 
     * @param subscriptions
     *        Describes the current Infrastructure Performance subscriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAwsNetworkPerformanceMetricSubscriptionsResult withSubscriptions(java.util.Collection<Subscription> subscriptions) {
        setSubscriptions(subscriptions);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSubscriptions() != null)
            sb.append("Subscriptions: ").append(getSubscriptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAwsNetworkPerformanceMetricSubscriptionsResult == false)
            return false;
        DescribeAwsNetworkPerformanceMetricSubscriptionsResult other = (DescribeAwsNetworkPerformanceMetricSubscriptionsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSubscriptions() == null ^ this.getSubscriptions() == null)
            return false;
        if (other.getSubscriptions() != null && other.getSubscriptions().equals(this.getSubscriptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSubscriptions() == null) ? 0 : getSubscriptions().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAwsNetworkPerformanceMetricSubscriptionsResult clone() {
        try {
            return (DescribeAwsNetworkPerformanceMetricSubscriptionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
