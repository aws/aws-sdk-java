/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateSubscriptionDefinitionVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSubscriptionDefinitionVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The client token used to request idempotent operations. */
    private String amznClientToken;
    /** subscription definition Id */
    private String subscriptionDefinitionId;
    /** Subscriptions in the version. */
    private java.util.List<Subscription> subscriptions;

    /**
     * The client token used to request idempotent operations.
     * 
     * @param amznClientToken
     *        The client token used to request idempotent operations.
     */

    public void setAmznClientToken(String amznClientToken) {
        this.amznClientToken = amznClientToken;
    }

    /**
     * The client token used to request idempotent operations.
     * 
     * @return The client token used to request idempotent operations.
     */

    public String getAmznClientToken() {
        return this.amznClientToken;
    }

    /**
     * The client token used to request idempotent operations.
     * 
     * @param amznClientToken
     *        The client token used to request idempotent operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionDefinitionVersionRequest withAmznClientToken(String amznClientToken) {
        setAmznClientToken(amznClientToken);
        return this;
    }

    /**
     * subscription definition Id
     * 
     * @param subscriptionDefinitionId
     *        subscription definition Id
     */

    public void setSubscriptionDefinitionId(String subscriptionDefinitionId) {
        this.subscriptionDefinitionId = subscriptionDefinitionId;
    }

    /**
     * subscription definition Id
     * 
     * @return subscription definition Id
     */

    public String getSubscriptionDefinitionId() {
        return this.subscriptionDefinitionId;
    }

    /**
     * subscription definition Id
     * 
     * @param subscriptionDefinitionId
     *        subscription definition Id
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionDefinitionVersionRequest withSubscriptionDefinitionId(String subscriptionDefinitionId) {
        setSubscriptionDefinitionId(subscriptionDefinitionId);
        return this;
    }

    /**
     * Subscriptions in the version.
     * 
     * @return Subscriptions in the version.
     */

    public java.util.List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    /**
     * Subscriptions in the version.
     * 
     * @param subscriptions
     *        Subscriptions in the version.
     */

    public void setSubscriptions(java.util.Collection<Subscription> subscriptions) {
        if (subscriptions == null) {
            this.subscriptions = null;
            return;
        }

        this.subscriptions = new java.util.ArrayList<Subscription>(subscriptions);
    }

    /**
     * Subscriptions in the version.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubscriptions(java.util.Collection)} or {@link #withSubscriptions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param subscriptions
     *        Subscriptions in the version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionDefinitionVersionRequest withSubscriptions(Subscription... subscriptions) {
        if (this.subscriptions == null) {
            setSubscriptions(new java.util.ArrayList<Subscription>(subscriptions.length));
        }
        for (Subscription ele : subscriptions) {
            this.subscriptions.add(ele);
        }
        return this;
    }

    /**
     * Subscriptions in the version.
     * 
     * @param subscriptions
     *        Subscriptions in the version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionDefinitionVersionRequest withSubscriptions(java.util.Collection<Subscription> subscriptions) {
        setSubscriptions(subscriptions);
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
        if (getAmznClientToken() != null)
            sb.append("AmznClientToken: ").append(getAmznClientToken()).append(",");
        if (getSubscriptionDefinitionId() != null)
            sb.append("SubscriptionDefinitionId: ").append(getSubscriptionDefinitionId()).append(",");
        if (getSubscriptions() != null)
            sb.append("Subscriptions: ").append(getSubscriptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSubscriptionDefinitionVersionRequest == false)
            return false;
        CreateSubscriptionDefinitionVersionRequest other = (CreateSubscriptionDefinitionVersionRequest) obj;
        if (other.getAmznClientToken() == null ^ this.getAmznClientToken() == null)
            return false;
        if (other.getAmznClientToken() != null && other.getAmznClientToken().equals(this.getAmznClientToken()) == false)
            return false;
        if (other.getSubscriptionDefinitionId() == null ^ this.getSubscriptionDefinitionId() == null)
            return false;
        if (other.getSubscriptionDefinitionId() != null && other.getSubscriptionDefinitionId().equals(this.getSubscriptionDefinitionId()) == false)
            return false;
        if (other.getSubscriptions() == null ^ this.getSubscriptions() == null)
            return false;
        if (other.getSubscriptions() != null && other.getSubscriptions().equals(this.getSubscriptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmznClientToken() == null) ? 0 : getAmznClientToken().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionDefinitionId() == null) ? 0 : getSubscriptionDefinitionId().hashCode());
        hashCode = prime * hashCode + ((getSubscriptions() == null) ? 0 : getSubscriptions().hashCode());
        return hashCode;
    }

    @Override
    public CreateSubscriptionDefinitionVersionRequest clone() {
        return (CreateSubscriptionDefinitionVersionRequest) super.clone();
    }

}
