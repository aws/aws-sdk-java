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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/UpdateSubscription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSubscriptionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * When you initally create a subscription, <code>AutoRenew</code> is set to <code>ENABLED</code>. If
     * <code>ENABLED</code>, the subscription will be automatically renewed at the end of the existing subscription
     * period. You can change this by submitting an <code>UpdateSubscription</code> request. If the
     * <code>UpdateSubscription</code> request does not included a value for <code>AutoRenew</code>, the existing value
     * for <code>AutoRenew</code> remains unchanged.
     * </p>
     */
    private String autoRenew;

    /**
     * <p>
     * When you initally create a subscription, <code>AutoRenew</code> is set to <code>ENABLED</code>. If
     * <code>ENABLED</code>, the subscription will be automatically renewed at the end of the existing subscription
     * period. You can change this by submitting an <code>UpdateSubscription</code> request. If the
     * <code>UpdateSubscription</code> request does not included a value for <code>AutoRenew</code>, the existing value
     * for <code>AutoRenew</code> remains unchanged.
     * </p>
     * 
     * @param autoRenew
     *        When you initally create a subscription, <code>AutoRenew</code> is set to <code>ENABLED</code>. If
     *        <code>ENABLED</code>, the subscription will be automatically renewed at the end of the existing
     *        subscription period. You can change this by submitting an <code>UpdateSubscription</code> request. If the
     *        <code>UpdateSubscription</code> request does not included a value for <code>AutoRenew</code>, the existing
     *        value for <code>AutoRenew</code> remains unchanged.
     * @see AutoRenew
     */

    public void setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
    }

    /**
     * <p>
     * When you initally create a subscription, <code>AutoRenew</code> is set to <code>ENABLED</code>. If
     * <code>ENABLED</code>, the subscription will be automatically renewed at the end of the existing subscription
     * period. You can change this by submitting an <code>UpdateSubscription</code> request. If the
     * <code>UpdateSubscription</code> request does not included a value for <code>AutoRenew</code>, the existing value
     * for <code>AutoRenew</code> remains unchanged.
     * </p>
     * 
     * @return When you initally create a subscription, <code>AutoRenew</code> is set to <code>ENABLED</code>. If
     *         <code>ENABLED</code>, the subscription will be automatically renewed at the end of the existing
     *         subscription period. You can change this by submitting an <code>UpdateSubscription</code> request. If the
     *         <code>UpdateSubscription</code> request does not included a value for <code>AutoRenew</code>, the
     *         existing value for <code>AutoRenew</code> remains unchanged.
     * @see AutoRenew
     */

    public String getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * <p>
     * When you initally create a subscription, <code>AutoRenew</code> is set to <code>ENABLED</code>. If
     * <code>ENABLED</code>, the subscription will be automatically renewed at the end of the existing subscription
     * period. You can change this by submitting an <code>UpdateSubscription</code> request. If the
     * <code>UpdateSubscription</code> request does not included a value for <code>AutoRenew</code>, the existing value
     * for <code>AutoRenew</code> remains unchanged.
     * </p>
     * 
     * @param autoRenew
     *        When you initally create a subscription, <code>AutoRenew</code> is set to <code>ENABLED</code>. If
     *        <code>ENABLED</code>, the subscription will be automatically renewed at the end of the existing
     *        subscription period. You can change this by submitting an <code>UpdateSubscription</code> request. If the
     *        <code>UpdateSubscription</code> request does not included a value for <code>AutoRenew</code>, the existing
     *        value for <code>AutoRenew</code> remains unchanged.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoRenew
     */

    public UpdateSubscriptionRequest withAutoRenew(String autoRenew) {
        setAutoRenew(autoRenew);
        return this;
    }

    /**
     * <p>
     * When you initally create a subscription, <code>AutoRenew</code> is set to <code>ENABLED</code>. If
     * <code>ENABLED</code>, the subscription will be automatically renewed at the end of the existing subscription
     * period. You can change this by submitting an <code>UpdateSubscription</code> request. If the
     * <code>UpdateSubscription</code> request does not included a value for <code>AutoRenew</code>, the existing value
     * for <code>AutoRenew</code> remains unchanged.
     * </p>
     * 
     * @param autoRenew
     *        When you initally create a subscription, <code>AutoRenew</code> is set to <code>ENABLED</code>. If
     *        <code>ENABLED</code>, the subscription will be automatically renewed at the end of the existing
     *        subscription period. You can change this by submitting an <code>UpdateSubscription</code> request. If the
     *        <code>UpdateSubscription</code> request does not included a value for <code>AutoRenew</code>, the existing
     *        value for <code>AutoRenew</code> remains unchanged.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoRenew
     */

    public UpdateSubscriptionRequest withAutoRenew(AutoRenew autoRenew) {
        this.autoRenew = autoRenew.toString();
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
        if (getAutoRenew() != null)
            sb.append("AutoRenew: ").append(getAutoRenew());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSubscriptionRequest == false)
            return false;
        UpdateSubscriptionRequest other = (UpdateSubscriptionRequest) obj;
        if (other.getAutoRenew() == null ^ this.getAutoRenew() == null)
            return false;
        if (other.getAutoRenew() != null && other.getAutoRenew().equals(this.getAutoRenew()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoRenew() == null) ? 0 : getAutoRenew().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSubscriptionRequest clone() {
        return (UpdateSubscriptionRequest) super.clone();
    }

}
