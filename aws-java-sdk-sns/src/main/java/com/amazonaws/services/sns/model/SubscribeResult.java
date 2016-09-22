/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Response for Subscribe action.
 * </p>
 */
public class SubscribeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the subscription, if the service was able to create a subscription immediately (without requiring
     * endpoint owner confirmation).
     * </p>
     */
    private String subscriptionArn;

    /**
     * <p>
     * The ARN of the subscription, if the service was able to create a subscription immediately (without requiring
     * endpoint owner confirmation).
     * </p>
     * 
     * @param subscriptionArn
     *        The ARN of the subscription, if the service was able to create a subscription immediately (without
     *        requiring endpoint owner confirmation).
     */

    public void setSubscriptionArn(String subscriptionArn) {
        this.subscriptionArn = subscriptionArn;
    }

    /**
     * <p>
     * The ARN of the subscription, if the service was able to create a subscription immediately (without requiring
     * endpoint owner confirmation).
     * </p>
     * 
     * @return The ARN of the subscription, if the service was able to create a subscription immediately (without
     *         requiring endpoint owner confirmation).
     */

    public String getSubscriptionArn() {
        return this.subscriptionArn;
    }

    /**
     * <p>
     * The ARN of the subscription, if the service was able to create a subscription immediately (without requiring
     * endpoint owner confirmation).
     * </p>
     * 
     * @param subscriptionArn
     *        The ARN of the subscription, if the service was able to create a subscription immediately (without
     *        requiring endpoint owner confirmation).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscribeResult withSubscriptionArn(String subscriptionArn) {
        setSubscriptionArn(subscriptionArn);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSubscriptionArn() != null)
            sb.append("SubscriptionArn: " + getSubscriptionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubscribeResult == false)
            return false;
        SubscribeResult other = (SubscribeResult) obj;
        if (other.getSubscriptionArn() == null ^ this.getSubscriptionArn() == null)
            return false;
        if (other.getSubscriptionArn() != null && other.getSubscriptionArn().equals(this.getSubscriptionArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubscriptionArn() == null) ? 0 : getSubscriptionArn().hashCode());
        return hashCode;
    }

    @Override
    public SubscribeResult clone() {
        try {
            return (SubscribeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
