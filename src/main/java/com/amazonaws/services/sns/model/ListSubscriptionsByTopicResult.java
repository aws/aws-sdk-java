/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * List Subscriptions By Topic Result
 */
public class ListSubscriptionsByTopicResult {

    /**
     * A list of subscriptions.
     */
    private java.util.List<Subscription> subscriptions;

    /**
     * Token to pass along to the next ListSubscriptionsByTopic request. This
     * element is returned if there are more subscriptions to retrieve.
     */
    private String nextToken;

    /**
     * A list of subscriptions.
     *
     * @return A list of subscriptions.
     */
    public java.util.List<Subscription> getSubscriptions() {
        if (subscriptions == null) {
            subscriptions = new java.util.ArrayList<Subscription>();
        }
        return subscriptions;
    }
    
    /**
     * A list of subscriptions.
     *
     * @param subscriptions A list of subscriptions.
     */
    public void setSubscriptions(java.util.Collection<Subscription> subscriptions) {
        java.util.List<Subscription> subscriptionsCopy = new java.util.ArrayList<Subscription>();
        if (subscriptions != null) {
            subscriptionsCopy.addAll(subscriptions);
        }
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
        java.util.List<Subscription> subscriptionsCopy = new java.util.ArrayList<Subscription>();
        if (subscriptions != null) {
            subscriptionsCopy.addAll(subscriptions);
        }
        this.subscriptions = subscriptionsCopy;

        return this;
    }
    
    /**
     * Token to pass along to the next ListSubscriptionsByTopic request. This
     * element is returned if there are more subscriptions to retrieve.
     *
     * @return Token to pass along to the next ListSubscriptionsByTopic request. This
     *         element is returned if there are more subscriptions to retrieve.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * Token to pass along to the next ListSubscriptionsByTopic request. This
     * element is returned if there are more subscriptions to retrieve.
     *
     * @param nextToken Token to pass along to the next ListSubscriptionsByTopic request. This
     *         element is returned if there are more subscriptions to retrieve.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * Token to pass along to the next ListSubscriptionsByTopic request. This
     * element is returned if there are more subscriptions to retrieve.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken Token to pass along to the next ListSubscriptionsByTopic request. This
     *         element is returned if there are more subscriptions to retrieve.
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
        
        sb.append("Subscriptions: " + subscriptions + ", ");
        sb.append("NextToken: " + nextToken + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    