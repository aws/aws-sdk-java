/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.logs.model;

import java.io.Serializable;

/**
 * Describe Subscription Filters Result
 */
public class DescribeSubscriptionFiltersResult implements Serializable, Cloneable {

    private com.amazonaws.internal.ListWithAutoConstructFlag<SubscriptionFilter> subscriptionFilters;

    /**
     * A string token used for pagination that points to the next page of
     * results. It must be a value obtained from the response of the previous
     * request. The token expires after 24 hours.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String nextToken;

    /**
     * Returns the value of the SubscriptionFilters property for this object.
     *
     * @return The value of the SubscriptionFilters property for this object.
     */
    public java.util.List<SubscriptionFilter> getSubscriptionFilters() {
        if (subscriptionFilters == null) {
              subscriptionFilters = new com.amazonaws.internal.ListWithAutoConstructFlag<SubscriptionFilter>();
              subscriptionFilters.setAutoConstruct(true);
        }
        return subscriptionFilters;
    }
    
    /**
     * Sets the value of the SubscriptionFilters property for this object.
     *
     * @param subscriptionFilters The new value for the SubscriptionFilters property for this object.
     */
    public void setSubscriptionFilters(java.util.Collection<SubscriptionFilter> subscriptionFilters) {
        if (subscriptionFilters == null) {
            this.subscriptionFilters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<SubscriptionFilter> subscriptionFiltersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SubscriptionFilter>(subscriptionFilters.size());
        subscriptionFiltersCopy.addAll(subscriptionFilters);
        this.subscriptionFilters = subscriptionFiltersCopy;
    }
    
    /**
     * Sets the value of the SubscriptionFilters property for this object.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSubscriptionFilters(java.util.Collection)} or
     * {@link #withSubscriptionFilters(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subscriptionFilters The new value for the SubscriptionFilters property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSubscriptionFiltersResult withSubscriptionFilters(SubscriptionFilter... subscriptionFilters) {
        if (getSubscriptionFilters() == null) setSubscriptionFilters(new java.util.ArrayList<SubscriptionFilter>(subscriptionFilters.length));
        for (SubscriptionFilter value : subscriptionFilters) {
            getSubscriptionFilters().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the SubscriptionFilters property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subscriptionFilters The new value for the SubscriptionFilters property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSubscriptionFiltersResult withSubscriptionFilters(java.util.Collection<SubscriptionFilter> subscriptionFilters) {
        if (subscriptionFilters == null) {
            this.subscriptionFilters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<SubscriptionFilter> subscriptionFiltersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SubscriptionFilter>(subscriptionFilters.size());
            subscriptionFiltersCopy.addAll(subscriptionFilters);
            this.subscriptionFilters = subscriptionFiltersCopy;
        }

        return this;
    }

    /**
     * A string token used for pagination that points to the next page of
     * results. It must be a value obtained from the response of the previous
     * request. The token expires after 24 hours.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return A string token used for pagination that points to the next page of
     *         results. It must be a value obtained from the response of the previous
     *         request. The token expires after 24 hours.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * A string token used for pagination that points to the next page of
     * results. It must be a value obtained from the response of the previous
     * request. The token expires after 24 hours.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken A string token used for pagination that points to the next page of
     *         results. It must be a value obtained from the response of the previous
     *         request. The token expires after 24 hours.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * A string token used for pagination that points to the next page of
     * results. It must be a value obtained from the response of the previous
     * request. The token expires after 24 hours.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken A string token used for pagination that points to the next page of
     *         results. It must be a value obtained from the response of the previous
     *         request. The token expires after 24 hours.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSubscriptionFiltersResult withNextToken(String nextToken) {
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
        if (getSubscriptionFilters() != null) sb.append("SubscriptionFilters: " + getSubscriptionFilters() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeSubscriptionFiltersResult == false) return false;
        DescribeSubscriptionFiltersResult other = (DescribeSubscriptionFiltersResult)obj;
        
        if (other.getSubscriptionFilters() == null ^ this.getSubscriptionFilters() == null) return false;
        if (other.getSubscriptionFilters() != null && other.getSubscriptionFilters().equals(this.getSubscriptionFilters()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeSubscriptionFiltersResult clone() {
        try {
            return (DescribeSubscriptionFiltersResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    