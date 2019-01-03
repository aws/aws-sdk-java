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
package com.amazonaws.services.budgets.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Response of DescribeSubscribersForNotification
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSubscribersForNotificationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list of subscribers that are associated with a notification.
     * </p>
     */
    private java.util.List<Subscriber> subscribers;
    /**
     * <p>
     * The pagination token in the service response that indicates the next set of results that you can retrieve.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of subscribers that are associated with a notification.
     * </p>
     * 
     * @return A list of subscribers that are associated with a notification.
     */

    public java.util.List<Subscriber> getSubscribers() {
        return subscribers;
    }

    /**
     * <p>
     * A list of subscribers that are associated with a notification.
     * </p>
     * 
     * @param subscribers
     *        A list of subscribers that are associated with a notification.
     */

    public void setSubscribers(java.util.Collection<Subscriber> subscribers) {
        if (subscribers == null) {
            this.subscribers = null;
            return;
        }

        this.subscribers = new java.util.ArrayList<Subscriber>(subscribers);
    }

    /**
     * <p>
     * A list of subscribers that are associated with a notification.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubscribers(java.util.Collection)} or {@link #withSubscribers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subscribers
     *        A list of subscribers that are associated with a notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSubscribersForNotificationResult withSubscribers(Subscriber... subscribers) {
        if (this.subscribers == null) {
            setSubscribers(new java.util.ArrayList<Subscriber>(subscribers.length));
        }
        for (Subscriber ele : subscribers) {
            this.subscribers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of subscribers that are associated with a notification.
     * </p>
     * 
     * @param subscribers
     *        A list of subscribers that are associated with a notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSubscribersForNotificationResult withSubscribers(java.util.Collection<Subscriber> subscribers) {
        setSubscribers(subscribers);
        return this;
    }

    /**
     * <p>
     * The pagination token in the service response that indicates the next set of results that you can retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token in the service response that indicates the next set of results that you can retrieve.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token in the service response that indicates the next set of results that you can retrieve.
     * </p>
     * 
     * @return The pagination token in the service response that indicates the next set of results that you can
     *         retrieve.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token in the service response that indicates the next set of results that you can retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token in the service response that indicates the next set of results that you can retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSubscribersForNotificationResult withNextToken(String nextToken) {
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
        if (getSubscribers() != null)
            sb.append("Subscribers: ").append(getSubscribers()).append(",");
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

        if (obj instanceof DescribeSubscribersForNotificationResult == false)
            return false;
        DescribeSubscribersForNotificationResult other = (DescribeSubscribersForNotificationResult) obj;
        if (other.getSubscribers() == null ^ this.getSubscribers() == null)
            return false;
        if (other.getSubscribers() != null && other.getSubscribers().equals(this.getSubscribers()) == false)
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

        hashCode = prime * hashCode + ((getSubscribers() == null) ? 0 : getSubscribers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSubscribersForNotificationResult clone() {
        try {
            return (DescribeSubscribersForNotificationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
