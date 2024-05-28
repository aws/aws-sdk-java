/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeleteDeliveryDestinationPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDeliveryDestinationPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the delivery destination that you want to delete the policy for.
     * </p>
     */
    private String deliveryDestinationName;

    /**
     * <p>
     * The name of the delivery destination that you want to delete the policy for.
     * </p>
     * 
     * @param deliveryDestinationName
     *        The name of the delivery destination that you want to delete the policy for.
     */

    public void setDeliveryDestinationName(String deliveryDestinationName) {
        this.deliveryDestinationName = deliveryDestinationName;
    }

    /**
     * <p>
     * The name of the delivery destination that you want to delete the policy for.
     * </p>
     * 
     * @return The name of the delivery destination that you want to delete the policy for.
     */

    public String getDeliveryDestinationName() {
        return this.deliveryDestinationName;
    }

    /**
     * <p>
     * The name of the delivery destination that you want to delete the policy for.
     * </p>
     * 
     * @param deliveryDestinationName
     *        The name of the delivery destination that you want to delete the policy for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDeliveryDestinationPolicyRequest withDeliveryDestinationName(String deliveryDestinationName) {
        setDeliveryDestinationName(deliveryDestinationName);
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
        if (getDeliveryDestinationName() != null)
            sb.append("DeliveryDestinationName: ").append(getDeliveryDestinationName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDeliveryDestinationPolicyRequest == false)
            return false;
        DeleteDeliveryDestinationPolicyRequest other = (DeleteDeliveryDestinationPolicyRequest) obj;
        if (other.getDeliveryDestinationName() == null ^ this.getDeliveryDestinationName() == null)
            return false;
        if (other.getDeliveryDestinationName() != null && other.getDeliveryDestinationName().equals(this.getDeliveryDestinationName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeliveryDestinationName() == null) ? 0 : getDeliveryDestinationName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDeliveryDestinationPolicyRequest clone() {
        return (DeleteDeliveryDestinationPolicyRequest) super.clone();
    }

}
