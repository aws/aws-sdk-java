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
package com.amazonaws.services.budgets.model;

import java.io.Serializable;

/**
 * Subscriber model. Each notification may contain multiple subscribers with different addresses.
 */
public class Subscriber implements Serializable, Cloneable {

    private String subscriptionType;

    private String address;

    /**
     * @param subscriptionType
     * @see SubscriptionType
     */

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    /**
     * @return
     * @see SubscriptionType
     */

    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    /**
     * @param subscriptionType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriptionType
     */

    public Subscriber withSubscriptionType(String subscriptionType) {
        setSubscriptionType(subscriptionType);
        return this;
    }

    /**
     * @param subscriptionType
     * @see SubscriptionType
     */

    public void setSubscriptionType(SubscriptionType subscriptionType) {
        this.subscriptionType = subscriptionType.toString();
    }

    /**
     * @param subscriptionType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriptionType
     */

    public Subscriber withSubscriptionType(SubscriptionType subscriptionType) {
        setSubscriptionType(subscriptionType);
        return this;
    }

    /**
     * @param address
     */

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return
     */

    public String getAddress() {
        return this.address;
    }

    /**
     * @param address
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subscriber withAddress(String address) {
        setAddress(address);
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
        if (getSubscriptionType() != null)
            sb.append("SubscriptionType: " + getSubscriptionType() + ",");
        if (getAddress() != null)
            sb.append("Address: " + getAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Subscriber == false)
            return false;
        Subscriber other = (Subscriber) obj;
        if (other.getSubscriptionType() == null ^ this.getSubscriptionType() == null)
            return false;
        if (other.getSubscriptionType() != null && other.getSubscriptionType().equals(this.getSubscriptionType()) == false)
            return false;
        if (other.getAddress() == null ^ this.getAddress() == null)
            return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubscriptionType() == null) ? 0 : getSubscriptionType().hashCode());
        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        return hashCode;
    }

    @Override
    public Subscriber clone() {
        try {
            return (Subscriber) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
