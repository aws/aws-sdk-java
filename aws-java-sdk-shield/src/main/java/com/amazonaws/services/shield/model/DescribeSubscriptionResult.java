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
package com.amazonaws.services.shield.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DescribeSubscription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSubscriptionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS Shield Advanced subscription details for an account.
     * </p>
     */
    private Subscription subscription;

    /**
     * <p>
     * The AWS Shield Advanced subscription details for an account.
     * </p>
     * 
     * @param subscription
     *        The AWS Shield Advanced subscription details for an account.
     */

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    /**
     * <p>
     * The AWS Shield Advanced subscription details for an account.
     * </p>
     * 
     * @return The AWS Shield Advanced subscription details for an account.
     */

    public Subscription getSubscription() {
        return this.subscription;
    }

    /**
     * <p>
     * The AWS Shield Advanced subscription details for an account.
     * </p>
     * 
     * @param subscription
     *        The AWS Shield Advanced subscription details for an account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSubscriptionResult withSubscription(Subscription subscription) {
        setSubscription(subscription);
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
        if (getSubscription() != null)
            sb.append("Subscription: ").append(getSubscription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSubscriptionResult == false)
            return false;
        DescribeSubscriptionResult other = (DescribeSubscriptionResult) obj;
        if (other.getSubscription() == null ^ this.getSubscription() == null)
            return false;
        if (other.getSubscription() != null && other.getSubscription().equals(this.getSubscription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubscription() == null) ? 0 : getSubscription().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSubscriptionResult clone() {
        try {
            return (DescribeSubscriptionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
