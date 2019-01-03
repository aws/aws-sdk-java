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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeSubscriptionFilters" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSubscriptionFiltersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The subscription filters.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SubscriptionFilter> subscriptionFilters;

    private String nextToken;

    /**
     * <p>
     * The subscription filters.
     * </p>
     * 
     * @return The subscription filters.
     */

    public java.util.List<SubscriptionFilter> getSubscriptionFilters() {
        if (subscriptionFilters == null) {
            subscriptionFilters = new com.amazonaws.internal.SdkInternalList<SubscriptionFilter>();
        }
        return subscriptionFilters;
    }

    /**
     * <p>
     * The subscription filters.
     * </p>
     * 
     * @param subscriptionFilters
     *        The subscription filters.
     */

    public void setSubscriptionFilters(java.util.Collection<SubscriptionFilter> subscriptionFilters) {
        if (subscriptionFilters == null) {
            this.subscriptionFilters = null;
            return;
        }

        this.subscriptionFilters = new com.amazonaws.internal.SdkInternalList<SubscriptionFilter>(subscriptionFilters);
    }

    /**
     * <p>
     * The subscription filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubscriptionFilters(java.util.Collection)} or {@link #withSubscriptionFilters(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param subscriptionFilters
     *        The subscription filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSubscriptionFiltersResult withSubscriptionFilters(SubscriptionFilter... subscriptionFilters) {
        if (this.subscriptionFilters == null) {
            setSubscriptionFilters(new com.amazonaws.internal.SdkInternalList<SubscriptionFilter>(subscriptionFilters.length));
        }
        for (SubscriptionFilter ele : subscriptionFilters) {
            this.subscriptionFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The subscription filters.
     * </p>
     * 
     * @param subscriptionFilters
     *        The subscription filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSubscriptionFiltersResult withSubscriptionFilters(java.util.Collection<SubscriptionFilter> subscriptionFilters) {
        setSubscriptionFilters(subscriptionFilters);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSubscriptionFiltersResult withNextToken(String nextToken) {
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
        if (getSubscriptionFilters() != null)
            sb.append("SubscriptionFilters: ").append(getSubscriptionFilters()).append(",");
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

        if (obj instanceof DescribeSubscriptionFiltersResult == false)
            return false;
        DescribeSubscriptionFiltersResult other = (DescribeSubscriptionFiltersResult) obj;
        if (other.getSubscriptionFilters() == null ^ this.getSubscriptionFilters() == null)
            return false;
        if (other.getSubscriptionFilters() != null && other.getSubscriptionFilters().equals(this.getSubscriptionFilters()) == false)
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

        hashCode = prime * hashCode + ((getSubscriptionFilters() == null) ? 0 : getSubscriptionFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSubscriptionFiltersResult clone() {
        try {
            return (DescribeSubscriptionFiltersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
