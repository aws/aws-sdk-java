/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;


/**
 * <p>
 * Response for ListSubscriptionsByTopic action.
 * </p>
 */
public class ListSubscriptionsByTopicResult implements Serializable {

    /**
     * A list of subscriptions.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Subscription> subscriptions;

    /**
     * Token to pass along to the next <code>ListSubscriptionsByTopic</code>
     * request. This element is returned if there are more subscriptions to
     * retrieve.
     */
    private String nextToken;

    /**
     * A list of subscriptions.
     *
     * @return A list of subscriptions.
     */
    public java.util.List<Subscription> getSubscriptions() {
        if (subscriptions == null) {
              subscriptions = new com.amazonaws.internal.ListWithAutoConstructFlag<Subscription>();
              subscriptions.setAutoConstruct(true);
        }
        return subscriptions;
    }
    
    /**
     * A list of subscriptions.
     *
     * @param subscriptions A list of subscriptions.
     */
    public void setSubscriptions(java.util.Collection<Subscription> subscriptions) {
        if (subscriptions == null) {
            this.subscriptions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Subscription> subscriptionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Subscription>(subscriptions.size());
        subscriptionsCopy.addAll(subscriptions);
        this.subscriptions = subscriptionsCopy;
    }
    
    /**
     * A list of subscriptions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subscriptions A list of subscriptions.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListSubscriptionsByTopicResult withSubscriptions(Subscription... subscriptions) {
        if (getSubscriptions() == null) setSubscriptions(new java.util.ArrayList<Subscription>(subscriptions.length));
        for (Subscription value : subscriptions) {
            getSubscriptions().add(value);
        }
        return this;
    }
    
    /**
     * A list of subscriptions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subscriptions A list of subscriptions.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListSubscriptionsByTopicResult withSubscriptions(java.util.Collection<Subscription> subscriptions) {
        if (subscriptions == null) {
            this.subscriptions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Subscription> subscriptionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Subscription>(subscriptions.size());
            subscriptionsCopy.addAll(subscriptions);
            this.subscriptions = subscriptionsCopy;
        }

        return this;
    }

    /**
     * Token to pass along to the next <code>ListSubscriptionsByTopic</code>
     * request. This element is returned if there are more subscriptions to
     * retrieve.
     *
     * @return Token to pass along to the next <code>ListSubscriptionsByTopic</code>
     *         request. This element is returned if there are more subscriptions to
     *         retrieve.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * Token to pass along to the next <code>ListSubscriptionsByTopic</code>
     * request. This element is returned if there are more subscriptions to
     * retrieve.
     *
     * @param nextToken Token to pass along to the next <code>ListSubscriptionsByTopic</code>
     *         request. This element is returned if there are more subscriptions to
     *         retrieve.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * Token to pass along to the next <code>ListSubscriptionsByTopic</code>
     * request. This element is returned if there are more subscriptions to
     * retrieve.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken Token to pass along to the next <code>ListSubscriptionsByTopic</code>
     *         request. This element is returned if there are more subscriptions to
     *         retrieve.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListSubscriptionsByTopicResult withNextToken(String nextToken) {
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
        if (getSubscriptions() != null) sb.append("Subscriptions: " + getSubscriptions() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSubscriptions() == null) ? 0 : getSubscriptions().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListSubscriptionsByTopicResult == false) return false;
        ListSubscriptionsByTopicResult other = (ListSubscriptionsByTopicResult)obj;
        
        if (other.getSubscriptions() == null ^ this.getSubscriptions() == null) return false;
        if (other.getSubscriptions() != null && other.getSubscriptions().equals(this.getSubscriptions()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    