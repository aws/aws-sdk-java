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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The subscriber to a budget notification. The subscriber consists of a subscription type and either an Amazon SNS
 * topic or an email address.
 * </p>
 * <p>
 * For example, an email subscriber would have the following parameters:
 * </p>
 * <ul>
 * <li>
 * <p>
 * A <code>subscriptionType</code> of <code>EMAIL</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * An <code>address</code> of <code>example@example.com</code>
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Subscriber implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of notification that AWS sends to a subscriber.
     * </p>
     */
    private String subscriptionType;
    /**
     * <p>
     * The address that AWS sends budget notifications to, either an SNS topic or an email.
     * </p>
     */
    private String address;

    /**
     * <p>
     * The type of notification that AWS sends to a subscriber.
     * </p>
     * 
     * @param subscriptionType
     *        The type of notification that AWS sends to a subscriber.
     * @see SubscriptionType
     */

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    /**
     * <p>
     * The type of notification that AWS sends to a subscriber.
     * </p>
     * 
     * @return The type of notification that AWS sends to a subscriber.
     * @see SubscriptionType
     */

    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    /**
     * <p>
     * The type of notification that AWS sends to a subscriber.
     * </p>
     * 
     * @param subscriptionType
     *        The type of notification that AWS sends to a subscriber.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriptionType
     */

    public Subscriber withSubscriptionType(String subscriptionType) {
        setSubscriptionType(subscriptionType);
        return this;
    }

    /**
     * <p>
     * The type of notification that AWS sends to a subscriber.
     * </p>
     * 
     * @param subscriptionType
     *        The type of notification that AWS sends to a subscriber.
     * @see SubscriptionType
     */

    public void setSubscriptionType(SubscriptionType subscriptionType) {
        withSubscriptionType(subscriptionType);
    }

    /**
     * <p>
     * The type of notification that AWS sends to a subscriber.
     * </p>
     * 
     * @param subscriptionType
     *        The type of notification that AWS sends to a subscriber.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriptionType
     */

    public Subscriber withSubscriptionType(SubscriptionType subscriptionType) {
        this.subscriptionType = subscriptionType.toString();
        return this;
    }

    /**
     * <p>
     * The address that AWS sends budget notifications to, either an SNS topic or an email.
     * </p>
     * 
     * @param address
     *        The address that AWS sends budget notifications to, either an SNS topic or an email.
     */

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * <p>
     * The address that AWS sends budget notifications to, either an SNS topic or an email.
     * </p>
     * 
     * @return The address that AWS sends budget notifications to, either an SNS topic or an email.
     */

    public String getAddress() {
        return this.address;
    }

    /**
     * <p>
     * The address that AWS sends budget notifications to, either an SNS topic or an email.
     * </p>
     * 
     * @param address
     *        The address that AWS sends budget notifications to, either an SNS topic or an email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subscriber withAddress(String address) {
        setAddress(address);
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
        if (getSubscriptionType() != null)
            sb.append("SubscriptionType: ").append(getSubscriptionType()).append(",");
        if (getAddress() != null)
            sb.append("Address: ").append("***Sensitive Data Redacted***");
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.budgets.model.transform.SubscriberMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
