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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/DeleteSubscriptionDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteSubscriptionDefinitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The ID of the subscription definition. */
    private String subscriptionDefinitionId;

    /**
     * The ID of the subscription definition.
     * 
     * @param subscriptionDefinitionId
     *        The ID of the subscription definition.
     */

    public void setSubscriptionDefinitionId(String subscriptionDefinitionId) {
        this.subscriptionDefinitionId = subscriptionDefinitionId;
    }

    /**
     * The ID of the subscription definition.
     * 
     * @return The ID of the subscription definition.
     */

    public String getSubscriptionDefinitionId() {
        return this.subscriptionDefinitionId;
    }

    /**
     * The ID of the subscription definition.
     * 
     * @param subscriptionDefinitionId
     *        The ID of the subscription definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSubscriptionDefinitionRequest withSubscriptionDefinitionId(String subscriptionDefinitionId) {
        setSubscriptionDefinitionId(subscriptionDefinitionId);
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
        if (getSubscriptionDefinitionId() != null)
            sb.append("SubscriptionDefinitionId: ").append(getSubscriptionDefinitionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSubscriptionDefinitionRequest == false)
            return false;
        DeleteSubscriptionDefinitionRequest other = (DeleteSubscriptionDefinitionRequest) obj;
        if (other.getSubscriptionDefinitionId() == null ^ this.getSubscriptionDefinitionId() == null)
            return false;
        if (other.getSubscriptionDefinitionId() != null && other.getSubscriptionDefinitionId().equals(this.getSubscriptionDefinitionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubscriptionDefinitionId() == null) ? 0 : getSubscriptionDefinitionId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteSubscriptionDefinitionRequest clone() {
        return (DeleteSubscriptionDefinitionRequest) super.clone();
    }

}
